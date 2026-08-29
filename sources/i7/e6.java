package i7;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.h40;
public abstract class e6 {
    public static void a() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        for (h40 h40Var : h40.values()) {
            edit.remove(h40Var.f29059a);
        }
        edit.apply();
    }
}
