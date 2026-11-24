package defpackage;

import android.view.View;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class rv1 implements View.OnLongClickListener {
    public final byte a;
    public final ChatActivityEnterView b;

    public rv1(ChatActivityEnterView chatActivityEnterView, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        byte b = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (b) {
            case 0:
                int i = ChatActivityEnterView.r7;
                return chatActivityEnterView.f1(view);
            default:
                int i2 = ChatActivityEnterView.r7;
                ex1 ex1Var = chatActivityEnterView.F0;
                if (ex1Var != null && ex1Var.length() > 0) {
                    return chatActivityEnterView.f1(view);
                }
                return false;
        }
    }
}
