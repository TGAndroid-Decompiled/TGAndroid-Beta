package k7;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.l40;
public abstract class a6 {
    public static void a() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        for (l40 l40Var : l40.values()) {
            edit.remove(l40Var.f26550a);
        }
        edit.apply();
    }
}
