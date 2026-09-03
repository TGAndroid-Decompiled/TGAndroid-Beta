package k7;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.n40;
public abstract class b6 {
    public static void a() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        for (n40 n40Var : n40.values()) {
            edit.remove(n40Var.f29381a);
        }
        edit.apply();
    }
}
