package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Pair;
import java.util.Map;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
public final class t87 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public t87(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        kf7 kf7Var = (kf7) this.b;
        hp7 hp7Var = (hp7) this.c;
        long j = hp7Var.a;
        try {
            SQLiteDatabase sQLiteDatabase = kf7Var.b;
            sQLiteDatabase.executeFast("DELETE FROM story_pushes WHERE uid = " + j).stepThis().dispose();
            SQLitePreparedStatement executeFast = kf7Var.b.executeFast("REPLACE INTO story_pushes VALUES(?, ?, ?, ?, ?, ?)");
            for (Map.Entry entry : hp7Var.c.entrySet()) {
                int intValue = ((Integer) entry.getKey()).intValue();
                long longValue = ((Long) ((Pair) entry.getValue()).first).longValue();
                long longValue2 = ((Long) ((Pair) entry.getValue()).second).longValue();
                executeFast.requery();
                executeFast.bindLong(1, j);
                executeFast.bindInteger(2, intValue);
                executeFast.bindLong(3, longValue);
                String str = hp7Var.b;
                if (str == null) {
                    str = "";
                    hp7Var.b = "";
                }
                executeFast.bindString(4, str);
                executeFast.bindInteger(5, hp7Var.d ? 1 : 0);
                executeFast.bindLong(6, longValue2);
                executeFast.step();
            }
            executeFast.dispose();
        } catch (Exception e) {
            kf7Var.p(e, true);
        }
    }

    private final void b() {
        Context context = (Context) this.c;
        yv2 yv2Var = (yv2) ((ak) this.b).b;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i = 0;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    int type = activeNetworkInfo.getType();
                    if (type != 0) {
                        if (type != 1) {
                            if (type != 4 && type != 5) {
                                if (type != 6) {
                                    i = type != 9 ? 8 : 7;
                                }
                                i = 5;
                            }
                        }
                        i = 2;
                    }
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                            i = 3;
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 14:
                        case 15:
                        case 17:
                            i = 4;
                            break;
                        case 13:
                            i = 5;
                            break;
                        case 16:
                        case 19:
                        default:
                            i = 6;
                            break;
                        case 18:
                            i = 2;
                            break;
                        case 20:
                            if (Build.VERSION.SDK_INT >= 29) {
                                i = 9;
                                break;
                            }
                            break;
                    }
                } else {
                    i = 1;
                }
            } catch (SecurityException unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && i == 5) {
            zz.g(context, yv2Var);
        } else {
            yv2Var.i(i);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t87.run():void");
    }
}
