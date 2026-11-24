package defpackage;

import org.telegram.ui.Components.ChatActivityEnterView;
public final class cx1 implements Runnable {
    public final byte a;
    public final ChatActivityEnterView b;
    public final boolean c;

    public cx1(ChatActivityEnterView chatActivityEnterView, boolean z, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
        this.c = z;
    }

    @Override
    public final void run() {
        j67 j67Var;
        byte b = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        boolean z = this.c;
        switch (b) {
            case 0:
                int i = ChatActivityEnterView.z7;
                if (!z) {
                    chatActivityEnterView.j2.setVisibility(8);
                    return;
                }
                return;
            case 1:
                int i2 = ChatActivityEnterView.z7;
                if (!z) {
                    chatActivityEnterView.k2.setVisibility(8);
                    return;
                }
                return;
            default:
                int i3 = ChatActivityEnterView.z7;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                mw1 mw1Var = chatActivityEnterView2.e6;
                chatActivityEnterView2.N0 = System.currentTimeMillis();
                boolean x1 = chatActivityEnterView2.x1(false, 0, 0, 0L, true);
                if (!z && (j67Var = chatActivityEnterView2.M0) != null) {
                    j67Var.f(!x1);
                    chatActivityEnterView2.M0 = null;
                    return;
                }
                chatActivityEnterView2.d6 = !x1;
                gm.r(mw1Var);
                gm.d3(mw1Var, 500L);
                return;
        }
    }
}
