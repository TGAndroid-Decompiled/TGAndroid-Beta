package defpackage;

import org.telegram.ui.Components.ChatActivityEnterView;
public final class vv1 implements Runnable {
    public final byte a;
    public final ChatActivityEnterView b;
    public final boolean c;

    public vv1(ChatActivityEnterView chatActivityEnterView, boolean z, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
        this.c = z;
    }

    @Override
    public final void run() {
        q67 q67Var;
        byte b = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        boolean z = this.c;
        switch (b) {
            case 0:
                int i = ChatActivityEnterView.X7;
                chatActivityEnterView.e2(z);
                return;
            case 1:
                int i2 = ChatActivityEnterView.X7;
                if (!z) {
                    chatActivityEnterView.i2.setVisibility(8);
                    return;
                }
                return;
            case 2:
                int i3 = ChatActivityEnterView.X7;
                if (!z) {
                    chatActivityEnterView.j2.setVisibility(8);
                    return;
                }
                return;
            default:
                int i4 = ChatActivityEnterView.X7;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                mv1 mv1Var = chatActivityEnterView2.p6;
                chatActivityEnterView2.N0 = System.currentTimeMillis();
                boolean F1 = chatActivityEnterView2.F1(false, 0, 0, 0L, true);
                if (!z && (q67Var = chatActivityEnterView2.M0) != null) {
                    q67Var.f(!F1);
                    chatActivityEnterView2.M0 = null;
                    return;
                }
                chatActivityEnterView2.o6 = !F1;
                hl.r(mv1Var);
                hl.d3(mv1Var, 500L);
                return;
        }
    }
}
