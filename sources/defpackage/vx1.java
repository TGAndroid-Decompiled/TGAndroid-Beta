package defpackage;

import android.view.View;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class vx1 implements gk, h59 {
    public final byte a;
    public final ChatActivityEnterView b;

    public vx1(ChatActivityEnterView chatActivityEnterView, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
    }

    @Override
    public final boolean g(int i, View view) {
        if (view instanceof cq0) {
            ChatActivityEnterView chatActivityEnterView = this.b;
            chatActivityEnterView.setFieldText(((cq0) view).getCommand() + " ");
            chatActivityEnterView.n0.c();
            return true;
        }
        return false;
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        switch (this.a) {
            case 0:
                this.b.x1(z, i, i2, 0L, true);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = this.b;
                boolean x1 = chatActivityEnterView.x1(z, i, i2, 0L, true);
                j67 j67Var = chatActivityEnterView.M0;
                if (j67Var != null) {
                    j67Var.f(!x1);
                    chatActivityEnterView.M0 = null;
                    return;
                }
                return;
        }
    }
}
