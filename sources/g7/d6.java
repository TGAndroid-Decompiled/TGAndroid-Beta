package g7;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.t30;
public abstract class d6 {
    public static void a() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        for (t30 t30Var : t30.values()) {
            edit.remove(t30Var.f32614a);
        }
        edit.apply();
    }
}
