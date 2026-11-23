package c8;

import android.content.SharedPreferences;
import org.telegram.messenger.mp;
import org.telegram.ui.Components.k30;
public abstract class ma {
    public static void a() {
        SharedPreferences.Editor edit = mp.g1().edit();
        for (k30 k30Var : k30.values()) {
            edit.remove(k30Var.f36630a);
        }
        edit.apply();
    }
}
