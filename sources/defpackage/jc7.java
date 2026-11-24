package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
public final class jc7 implements Runnable {
    public final byte a;
    public final ad7 b;
    public final long c;
    public final ArrayList d;

    public jc7(ad7 ad7Var, long j, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = ad7Var;
        this.c = j;
        this.d = arrayList;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jc7.a():void");
    }

    private final void b() {
        ad7 ad7Var = this.b;
        ArrayList arrayList = this.d;
        long j = this.c;
        try {
            String join = TextUtils.join(", ", arrayList);
            SQLiteDatabase sQLiteDatabase = ad7Var.b;
            Locale locale = Locale.US;
            sQLiteDatabase.executeFast("DELETE FROM topics WHERE did = " + j + " AND topic_id IN (" + join + ")").stepThis().dispose();
            try {
                SQLiteDatabase sQLiteDatabase2 = ad7Var.b;
                sQLiteDatabase2.executeFast("DELETE FROM messages_v2 WHERE uid = " + j + " AND mid IN (SELECT mid FROM messages_topics WHERE uid = " + j + " AND topic_id IN (" + join + "))").stepThis().dispose();
            } catch (SQLiteException e) {
                e.printStackTrace();
            }
            SQLiteDatabase sQLiteDatabase3 = ad7Var.b;
            Locale locale2 = Locale.US;
            sQLiteDatabase3.executeFast("DELETE FROM messages_topics WHERE uid = " + j + " AND topic_id IN (" + join + ")").stepThis().dispose();
        } catch (SQLiteException e2) {
            e2.printStackTrace();
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jc7.run():void");
    }

    public jc7(ad7 ad7Var, ArrayList arrayList, long j, byte b) {
        this.a = b;
        this.b = ad7Var;
        this.d = arrayList;
        this.c = j;
    }
}
