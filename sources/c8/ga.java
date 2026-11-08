package c8;

import android.content.SharedPreferences;
import org.telegram.messenger.qp;
import org.telegram.ui.Components.z20;
public abstract class ga {
    public static void a() {
        SharedPreferences.Editor edit = qp.e1().edit();
        for (z20 z20Var : z20.values()) {
            edit.remove(z20Var.f40871a);
        }
        edit.apply();
    }
}
