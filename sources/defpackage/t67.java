package defpackage;

import android.util.Pair;
import java.util.Map;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
public final class t67 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public t67(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        ad7 ad7Var = (ad7) this.b;
        hm7 hm7Var = (hm7) this.c;
        long j = hm7Var.a;
        try {
            SQLiteDatabase sQLiteDatabase = ad7Var.b;
            sQLiteDatabase.executeFast("DELETE FROM story_pushes WHERE uid = " + j).stepThis().dispose();
            SQLitePreparedStatement executeFast = ad7Var.b.executeFast("REPLACE INTO story_pushes VALUES(?, ?, ?, ?, ?, ?)");
            for (Map.Entry entry : hm7Var.c.entrySet()) {
                int intValue = ((Integer) entry.getKey()).intValue();
                long longValue = ((Long) ((Pair) entry.getValue()).first).longValue();
                long longValue2 = ((Long) ((Pair) entry.getValue()).second).longValue();
                executeFast.requery();
                executeFast.bindLong(1, j);
                executeFast.bindInteger(2, intValue);
                executeFast.bindLong(3, longValue);
                String str = hm7Var.b;
                if (str == null) {
                    str = "";
                    hm7Var.b = "";
                }
                executeFast.bindString(4, str);
                executeFast.bindInteger(5, hm7Var.d ? 1 : 0);
                executeFast.bindLong(6, longValue2);
                executeFast.step();
            }
            executeFast.dispose();
        } catch (Exception e) {
            ad7Var.n(e, true);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t67.run():void");
    }
}
