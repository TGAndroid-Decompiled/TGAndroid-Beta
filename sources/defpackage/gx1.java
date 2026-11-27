package defpackage;

import android.view.View;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class gx1 implements t69 {
    public final ChatActivityEnterView a;

    public gx1(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override
    public final boolean e(int i, View view) {
        if (view instanceof cp0) {
            ChatActivityEnterView chatActivityEnterView = this.a;
            chatActivityEnterView.setFieldText(((cp0) view).getCommand() + " ");
            chatActivityEnterView.n0.c();
            return true;
        }
        return false;
    }
}
