package h7;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.y30;

public abstract class y5 {
    public static void a() {
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        for (y30 y30Var : y30.values()) {
            editorEdit.remove(y30Var.f34799a);
        }
        editorEdit.apply();
    }
}
