package defpackage;

import android.app.Activity;
import android.content.Context;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class bx1 extends bz1 {
    public final ChatActivityEnterView A0;
    public final byte z0 = 0;

    public bx1(ChatActivityEnterView chatActivityEnterView, Context context, vnb vnbVar) {
        super(2131231505, vnbVar, context, true);
        this.A0 = chatActivityEnterView;
    }

    @Override
    public final boolean b() {
        switch (this.z0) {
            case 0:
                return this.A0.c();
            default:
                return super.b();
        }
    }

    @Override
    public final boolean c() {
        byte b = this.z0;
        ChatActivityEnterView chatActivityEnterView = this.A0;
        switch (b) {
            case 0:
                if (!chatActivityEnterView.c() && chatActivityEnterView.H0 == Integer.MAX_VALUE) {
                    return true;
                }
                return false;
            default:
                return !chatActivityEnterView.f4;
        }
    }

    @Override
    public final boolean d() {
        switch (this.z0) {
            case 0:
                q67 q67Var = this.A0.M0;
                if ((q67Var != null && !q67Var.u0) || this.w > 0) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public final boolean j() {
        switch (this.z0) {
            case 0:
                return this.A0.i6;
            default:
                return super.j();
        }
    }

    @Override
    public final void setAlpha(float f) {
        switch (this.z0) {
            case 0:
                super.setAlpha(f);
                int i = ChatActivityEnterView.X7;
                this.A0.r2();
                return;
            default:
                super.setAlpha(f);
                return;
        }
    }

    public bx1(ChatActivityEnterView chatActivityEnterView, Activity activity, int i, vnb vnbVar) {
        super(i, vnbVar, activity, true);
        this.A0 = chatActivityEnterView;
    }
}
