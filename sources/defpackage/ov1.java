package defpackage;

import org.telegram.ui.Components.ChatActivityEnterView;
public final class ov1 implements Runnable {
    public final byte a;
    public final ChatActivityEnterView b;
    public final boolean c;

    public ov1(ChatActivityEnterView chatActivityEnterView, boolean z, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
        this.c = z;
    }

    @Override
    public final void run() {
        j47 j47Var;
        byte b = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        boolean z = this.c;
        switch (b) {
            case 0:
                int i = ChatActivityEnterView.r7;
                if (!z) {
                    chatActivityEnterView.j2.setVisibility(8);
                    return;
                }
                return;
            case 1:
                int i2 = ChatActivityEnterView.r7;
                if (!z) {
                    chatActivityEnterView.k2.setVisibility(8);
                    return;
                }
                return;
            default:
                int i3 = ChatActivityEnterView.r7;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                uv1 uv1Var = chatActivityEnterView2.e6;
                chatActivityEnterView2.N0 = System.currentTimeMillis();
                boolean v1 = chatActivityEnterView2.v1(false, 0, 0, 0L, true);
                if (!z && (j47Var = chatActivityEnterView2.M0) != null) {
                    j47Var.f(!v1);
                    chatActivityEnterView2.M0 = null;
                    return;
                }
                chatActivityEnterView2.d6 = !v1;
                gl.r(uv1Var);
                gl.d3(uv1Var, 500L);
                return;
        }
    }
}
