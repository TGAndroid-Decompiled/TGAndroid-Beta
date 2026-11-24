package defpackage;

import android.content.SharedPreferences;
import android.util.LongSparseArray;
import org.telegram.messenger.a;
public abstract class pve {
    public static tr9 a;
    public static tr9 b;
    public static tr9 c;

    public static tr9 a(int i) {
        if (i == 1) {
            return a;
        }
        if (i == 2) {
            return b;
        }
        if (i == 4) {
            return c;
        }
        return null;
    }

    public static void b(SharedPreferences sharedPreferences) {
        int i;
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (sharedPreferences.getBoolean("save_gallery", false) && e21.b) {
            i = 7;
        } else {
            i = sharedPreferences.getInt("save_gallery_flags", -1);
        }
        if (i != -1) {
            sharedPreferences.edit().remove("save_gallery").remove("save_gallery_flags").apply();
            ?? sr9Var = new sr9();
            a = sr9Var;
            if ((i & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            sr9Var.b = z;
            sr9Var.a = z;
            sr9Var.c = 104857600L;
            sr9Var.e("user", sharedPreferences);
            ?? sr9Var2 = new sr9();
            b = sr9Var2;
            tr9 tr9Var = a;
            if ((i & 2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            tr9Var.b = z2;
            sr9Var2.a = z2;
            sr9Var2.c = 104857600L;
            sr9Var2.e("groups", sharedPreferences);
            ?? sr9Var3 = new sr9();
            c = sr9Var3;
            if ((i & 4) != 0) {
                z3 = true;
            }
            sr9Var3.b = z3;
            sr9Var3.a = z3;
            sr9Var3.c = 104857600L;
            sr9Var3.e("channels", sharedPreferences);
        } else {
            a = tr9.d("user", sharedPreferences);
            b = tr9.d("groups", sharedPreferences);
            c = tr9.d("channels", sharedPreferences);
        }
        a.d = (byte) 1;
        b.d = (byte) 2;
        c.d = (byte) 4;
    }

    public static LongSparseArray c(SharedPreferences sharedPreferences) {
        LongSparseArray longSparseArray = new LongSparseArray();
        int i = sharedPreferences.getInt("count", 0);
        for (int i2 = 0; i2 < i; i2++) {
            ?? sr9Var = new sr9();
            sr9Var.d = sharedPreferences.getLong(i2 + "_dialog_id", 0L);
            sr9Var.a = sharedPreferences.getBoolean(i2 + "_photo", false);
            sr9Var.b = sharedPreferences.getBoolean(i2 + "_video", false);
            sr9Var.c = sharedPreferences.getLong(i2 + "_limitVideo", 104857600L);
            long j = sr9Var.d;
            if (j != 0) {
                longSparseArray.put(j, sr9Var);
            }
        }
        return longSparseArray;
    }

    public static boolean d(int r7, defpackage.kc4 r8, defpackage.k47 r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pve.d(int, kc4, k47, int):boolean");
    }

    public static void e(SharedPreferences sharedPreferences, LongSparseArray longSparseArray) {
        sharedPreferences.edit().clear().apply();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt("count", longSparseArray.size());
        for (int i = 0; i < longSparseArray.size(); i++) {
            rr9 rr9Var = (rr9) longSparseArray.valueAt(i);
            edit.putLong(aq1.n(i, "_dialog_id"), rr9Var.d);
            edit.putBoolean(i + "_photo", rr9Var.a);
            edit.putBoolean(i + "_video", rr9Var.b);
            edit.putLong(i + "_limitVideo", rr9Var.c);
        }
        edit.apply();
    }

    public static void f(int i) {
        SharedPreferences sharedPreferences = a.b.getSharedPreferences("mainconfig", 0);
        if (i == 1) {
            a.e("user", sharedPreferences);
        } else if (i == 2) {
            b.e("groups", sharedPreferences);
        } else if (i == 4) {
            c.e("channels", sharedPreferences);
        }
    }
}
