package c8;

import android.content.SharedPreferences;
import org.telegram.messenger.np;
import org.telegram.ui.Components.n30;
public abstract class ka {
    public static void a() {
        SharedPreferences.Editor edit = np.g1().edit();
        for (n30 n30Var : n30.values()) {
            edit.remove(n30Var.f37764a);
        }
        edit.apply();
    }
}
