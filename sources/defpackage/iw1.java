package defpackage;

import android.view.View;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class iw1 implements gj, e39 {
    public final byte a;
    public final ChatActivityEnterView b;

    public iw1(ChatActivityEnterView chatActivityEnterView, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
    }

    @Override
    public final boolean d(int i, View view) {
        if (view instanceof cp0) {
            ChatActivityEnterView chatActivityEnterView = this.b;
            chatActivityEnterView.setFieldText(((cp0) view).getCommand() + " ");
            chatActivityEnterView.n0.c();
            return true;
        }
        return false;
    }

    @Override
    public final void s(int i, int i2, boolean z) {
        switch (this.a) {
            case 0:
                this.b.v1(z, i, i2, 0L, true);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = this.b;
                boolean v1 = chatActivityEnterView.v1(z, i, i2, 0L, true);
                j47 j47Var = chatActivityEnterView.M0;
                if (j47Var != null) {
                    j47Var.f(!v1);
                    chatActivityEnterView.M0 = null;
                    return;
                }
                return;
        }
    }
}
