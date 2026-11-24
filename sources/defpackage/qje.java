package defpackage;

import android.content.SharedPreferences;
public abstract class qje {
    public static void a() {
        SharedPreferences.Editor edit = na7.c1().edit();
        for (le5 le5Var : le5.values()) {
            edit.remove(le5Var.a);
        }
        edit.apply();
    }
}
