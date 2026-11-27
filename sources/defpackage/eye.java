package defpackage;

import android.content.SharedPreferences;
import android.util.LongSparseArray;
import org.telegram.messenger.a;
public abstract class eye {
    public static kt9 a;
    public static kt9 b;
    public static kt9 c;

    public static kt9 a(int i) {
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
        if (sharedPreferences.getBoolean("save_gallery", false) && f11.b) {
            i = 7;
        } else {
            i = sharedPreferences.getInt("save_gallery_flags", -1);
        }
        if (i != -1) {
            sharedPreferences.edit().remove("save_gallery").remove("save_gallery_flags").apply();
            ?? jt9Var = new jt9();
            a = jt9Var;
            if ((i & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            jt9Var.b = z;
            jt9Var.a = z;
            jt9Var.c = 104857600L;
            jt9Var.e("user", sharedPreferences);
            ?? jt9Var2 = new jt9();
            b = jt9Var2;
            kt9 kt9Var = a;
            if ((i & 2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            kt9Var.b = z2;
            jt9Var2.a = z2;
            jt9Var2.c = 104857600L;
            jt9Var2.e("groups", sharedPreferences);
            ?? jt9Var3 = new jt9();
            c = jt9Var3;
            if ((i & 4) != 0) {
                z3 = true;
            }
            jt9Var3.b = z3;
            jt9Var3.a = z3;
            jt9Var3.c = 104857600L;
            jt9Var3.e("channels", sharedPreferences);
        } else {
            a = kt9.d("user", sharedPreferences);
            b = kt9.d("groups", sharedPreferences);
            c = kt9.d("channels", sharedPreferences);
        }
        a.d = (byte) 1;
        b.d = (byte) 2;
        c.d = (byte) 4;
    }

    public static LongSparseArray c(SharedPreferences sharedPreferences) {
        LongSparseArray longSparseArray = new LongSparseArray();
        int i = sharedPreferences.getInt("count", 0);
        for (int i2 = 0; i2 < i; i2++) {
            ?? jt9Var = new jt9();
            jt9Var.d = sharedPreferences.getLong(i2 + "_dialog_id", 0L);
            jt9Var.a = sharedPreferences.getBoolean(i2 + "_photo", false);
            jt9Var.b = sharedPreferences.getBoolean(i2 + "_video", false);
            jt9Var.c = sharedPreferences.getLong(i2 + "_limitVideo", 104857600L);
            long j = jt9Var.d;
            if (j != 0) {
                longSparseArray.put(j, jt9Var);
            }
        }
        return longSparseArray;
    }

    public static boolean d(int r7, defpackage.hc4 r8, defpackage.r47 r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eye.d(int, hc4, r47, int):boolean");
    }

    public static void e(SharedPreferences sharedPreferences, LongSparseArray longSparseArray) {
        sharedPreferences.edit().clear().apply();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt("count", longSparseArray.size());
        for (int i = 0; i < longSparseArray.size(); i++) {
            it9 it9Var = (it9) longSparseArray.valueAt(i);
            edit.putLong(bp1.n(i, "_dialog_id"), it9Var.d);
            edit.putBoolean(i + "_photo", it9Var.a);
            edit.putBoolean(i + "_video", it9Var.b);
            edit.putLong(i + "_limitVideo", it9Var.c);
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
