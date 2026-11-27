package defpackage;

import org.telegram.ui.Components.ChatActivityEnterView;
public final class xv1 implements Runnable {
    public final byte a;
    public final ChatActivityEnterView b;
    public final kg5 c;

    public xv1(ChatActivityEnterView chatActivityEnterView, kg5 kg5Var, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
        this.c = kg5Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        kg5 kg5Var = this.c;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (b) {
            case 0:
                int i = ChatActivityEnterView.X7;
                hl.B2(kg5Var);
                if (chatActivityEnterView.G6 == kg5Var) {
                    chatActivityEnterView.G6 = null;
                    return;
                }
                return;
            default:
                int i2 = ChatActivityEnterView.X7;
                chatActivityEnterView.removeView(kg5Var);
                return;
        }
    }
}
