package defpackage;

import android.view.View;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class iw1 implements View.OnLongClickListener {
    public final byte a;
    public final ChatActivityEnterView b;

    public iw1(ChatActivityEnterView chatActivityEnterView, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        byte b = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (b) {
            case 0:
                int i = ChatActivityEnterView.X7;
                return chatActivityEnterView.k1(view);
            default:
                int i2 = ChatActivityEnterView.X7;
                tx1 tx1Var = chatActivityEnterView.F0;
                if (tx1Var != null && tx1Var.length() > 0) {
                    return chatActivityEnterView.k1(view);
                }
                return false;
        }
    }
}
