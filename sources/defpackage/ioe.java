package defpackage;

import android.content.SharedPreferences;
public abstract class ioe {
    public static void a() {
        SharedPreferences.Editor edit = uc7.e1().edit();
        for (mg5 mg5Var : mg5.values()) {
            edit.remove(mg5Var.a);
        }
        edit.apply();
    }
}
