package defpackage;

import android.content.SharedPreferences;
public abstract class sle {
    public static void a() {
        SharedPreferences.Editor edit = oc7.d1().edit();
        for (jg5 jg5Var : jg5.values()) {
            edit.remove(jg5Var.a);
        }
        edit.apply();
    }
}
