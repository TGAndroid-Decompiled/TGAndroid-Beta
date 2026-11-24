package defpackage;

import android.app.Activity;
import android.content.Context;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ow1 extends ky1 {
    public final byte y0 = 0;
    public final ChatActivityEnterView z0;

    public ow1(ChatActivityEnterView chatActivityEnterView, Context context, wjb wjbVar) {
        super(2131231505, wjbVar, context, true);
        this.z0 = chatActivityEnterView;
    }

    @Override
    public final boolean b() {
        switch (this.y0) {
            case 0:
                return this.z0.c();
            default:
                return super.b();
        }
    }

    @Override
    public final boolean c() {
        byte b = this.y0;
        ChatActivityEnterView chatActivityEnterView = this.z0;
        switch (b) {
            case 0:
                if (!chatActivityEnterView.c() && chatActivityEnterView.H0 == Integer.MAX_VALUE) {
                    return true;
                }
                return false;
            default:
                return !chatActivityEnterView.g4;
        }
    }

    @Override
    public final boolean d() {
        switch (this.y0) {
            case 0:
                j47 j47Var = this.z0.M0;
                if ((j47Var != null && !j47Var.u0) || this.w > 0) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public final boolean j() {
        switch (this.y0) {
            case 0:
                return this.z0.X5;
            default:
                return super.j();
        }
    }

    @Override
    public final void setAlpha(float f) {
        switch (this.y0) {
            case 0:
                super.setAlpha(f);
                int i = ChatActivityEnterView.r7;
                this.z0.f2();
                return;
            default:
                super.setAlpha(f);
                return;
        }
    }

    public ow1(ChatActivityEnterView chatActivityEnterView, Activity activity, int i, wjb wjbVar) {
        super(i, wjbVar, activity, true);
        this.z0 = chatActivityEnterView;
    }
}
