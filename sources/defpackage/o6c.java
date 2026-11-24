package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;
public final class o6c implements xcb {
    public final byte a;
    public final lo9 b;

    public o6c(lo9 lo9Var, byte b) {
        this.a = b;
        this.b = lo9Var;
    }

    @Override
    public final Object m() {
        SQLiteDatabase a;
        byte b = this.a;
        lo9 lo9Var = this.b;
        switch (b) {
            case 0:
                lo9Var.getClass();
                int i = mi2.e;
                ?? obj = new Object();
                obj.a = null;
                obj.b = new ArrayList();
                obj.c = null;
                obj.d = "";
                HashMap hashMap = new HashMap();
                a = lo9Var.a();
                a.beginTransaction();
                try {
                    mi2 mi2Var = (mi2) lo9.h(a.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new io9(lo9Var, hashMap, obj, (byte) 1));
                    a.setTransactionSuccessful();
                    return mi2Var;
                } finally {
                }
            default:
                long e = lo9Var.b.e() - lo9Var.d.d;
                a = lo9Var.a();
                a.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(e)};
                    Cursor rawQuery = a.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        int i2 = rawQuery.getInt(0);
                        lo9Var.e(i2, xb6.MESSAGE_TOO_OLD, rawQuery.getString(1));
                    }
                    rawQuery.close();
                    int delete = a.delete("events", "timestamp_ms < ?", strArr);
                    a.setTransactionSuccessful();
                    a.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
        }
    }
}
