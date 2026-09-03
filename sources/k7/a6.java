package k7;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.m40;
public abstract class a6 {
    public static void a() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        for (m40 m40Var : m40.values()) {
            edit.remove(m40Var.f26955a);
        }
        edit.apply();
    }
}
