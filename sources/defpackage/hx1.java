package defpackage;

import android.view.View;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class hx1 implements View.OnLongClickListener {
    public final byte a;
    public final ChatActivityEnterView b;

    public hx1(ChatActivityEnterView chatActivityEnterView, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        byte b = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (b) {
            case 0:
                int i = ChatActivityEnterView.z7;
                return chatActivityEnterView.h1(view);
            default:
                int i2 = ChatActivityEnterView.z7;
                sy1 sy1Var = chatActivityEnterView.F0;
                if (sy1Var != null && sy1Var.length() > 0) {
                    return chatActivityEnterView.h1(view);
                }
                return false;
        }
    }
}
