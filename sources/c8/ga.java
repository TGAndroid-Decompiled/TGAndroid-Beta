package c8;

import android.content.SharedPreferences;
import org.telegram.messenger.qp;
import org.telegram.ui.Components.a30;
public abstract class ga {
    public static void a() {
        SharedPreferences.Editor edit = qp.e1().edit();
        for (a30 a30Var : a30.values()) {
            edit.remove(a30Var.f31698a);
        }
        edit.apply();
    }
}
