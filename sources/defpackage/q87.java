package defpackage;

import android.util.Pair;
import java.util.Map;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
public final class q87 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public q87(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        cf7 cf7Var = (cf7) this.b;
        ko7 ko7Var = (ko7) this.c;
        long j = ko7Var.a;
        try {
            SQLiteDatabase sQLiteDatabase = cf7Var.b;
            sQLiteDatabase.executeFast("DELETE FROM story_pushes WHERE uid = " + j).stepThis().dispose();
            SQLitePreparedStatement executeFast = cf7Var.b.executeFast("REPLACE INTO story_pushes VALUES(?, ?, ?, ?, ?, ?)");
            for (Map.Entry entry : ko7Var.c.entrySet()) {
                int intValue = ((Integer) entry.getKey()).intValue();
                long longValue = ((Long) ((Pair) entry.getValue()).first).longValue();
                long longValue2 = ((Long) ((Pair) entry.getValue()).second).longValue();
                executeFast.requery();
                executeFast.bindLong(1, j);
                executeFast.bindInteger(2, intValue);
                executeFast.bindLong(3, longValue);
                String str = ko7Var.b;
                if (str == null) {
                    str = "";
                    ko7Var.b = "";
                }
                executeFast.bindString(4, str);
                executeFast.bindInteger(5, ko7Var.d ? 1 : 0);
                executeFast.bindLong(6, longValue2);
                executeFast.step();
            }
            executeFast.dispose();
        } catch (Exception e) {
            cf7Var.n(e, true);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q87.run():void");
    }
}
