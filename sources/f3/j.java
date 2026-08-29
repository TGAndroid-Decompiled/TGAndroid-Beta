package f3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;
public final class j extends SQLiteOpenHelper {
    public static final String f6543c = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";
    public static final int d = 5;
    public static final List f6544e = Arrays.asList(new i(0), new i(1), new i(2), new i(3), new i(4));
    public final int f6545a;
    public boolean f6546b;

    public j(Context context, String str, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f6546b = false;
        this.f6545a = i10;
    }

    public static void a(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        List list = f6544e;
        if (i11 <= list.size()) {
            while (i10 < i11) {
                switch (((i) list.get(i10)).f6542a) {
                    case 0:
                        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
                        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
                        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
                        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
                        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
                        break;
                    case 1:
                        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
                        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
                        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
                        break;
                    case 2:
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
                        break;
                    case 3:
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
                        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
                        break;
                    default:
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
                        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
                        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
                        sQLiteDatabase.execSQL(f6543c);
                        break;
                }
                i10++;
            }
            return;
        }
        StringBuilder o10 = com.google.android.recaptcha.internal.a.o("Migration from ", i10, " to ", i11, " was requested, but cannot be performed. Only ");
        o10.append(list.size());
        o10.append(" migrations are provided");
        throw new IllegalArgumentException(o10.toString());
    }

    @Override
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f6546b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!this.f6546b) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, this.f6545a);
    }

    @Override
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.f6546b) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, i11);
    }

    @Override
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.f6546b) {
            onConfigure(sQLiteDatabase);
        }
    }

    @Override
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (!this.f6546b) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, i10, i11);
    }
}
