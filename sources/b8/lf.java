package b8;

import android.content.SharedPreferences;
import org.telegram.messenger.hp;
import org.telegram.ui.Components.v20;
public abstract class lf {
    public static void a() {
        SharedPreferences.Editor edit = hp.e1().edit();
        for (v20 v20Var : v20.values()) {
            edit.remove(v20Var.f38969a);
        }
        edit.apply();
    }
}
