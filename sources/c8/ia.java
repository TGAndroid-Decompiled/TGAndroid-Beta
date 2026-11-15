package c8;

import android.content.SharedPreferences;
import org.telegram.messenger.np;
import org.telegram.ui.Components.c30;
public abstract class ia {
    public static void a() {
        SharedPreferences.Editor edit = np.e1().edit();
        for (c30 c30Var : c30.values()) {
            edit.remove(c30Var.f33494a);
        }
        edit.apply();
    }
}
