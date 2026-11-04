package ai;

import android.view.View;
import android.widget.FrameLayout;
import gi.va;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.ws0;
public final class n3 implements View.OnClickListener {
    public final int f837a;
    public final boolean f838b;
    public final int f839c;
    public final FrameLayout d;

    public n3(FrameLayout frameLayout, boolean z10, int i3, int i10) {
        this.f837a = i10;
        this.d = frameLayout;
        this.f838b = z10;
        this.f839c = i3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f837a) {
            case 0:
                vp0 vp0Var = (vp0) this.d;
                if (vp0Var.f1013e.h() && vp0Var.h.getCurrentPosition() != 0) {
                    vp0Var.a();
                    return;
                }
                boolean z10 = this.f838b;
                int i3 = this.f839c;
                if (z10) {
                    b3 b3Var = new b3(vp0Var.getContext(), i3, vp0Var.f1012c, null, null);
                    b3Var.e1(org.telegram.messenger.v1.a(i3).c(vp0Var.f1012c));
                    b3Var.show();
                    return;
                }
                xg.e1.l1(2, org.telegram.messenger.v1.a(i3).b());
                return;
            default:
                ws0 ws0Var = (ws0) this.d;
                org.telegram.ui.ActionBar.d2 d2Var = ws0Var.f40142y1;
                if (this.f838b) {
                    ws0Var.Y0(d2Var, ws0Var.m1, this.f839c);
                    return;
                }
                d2Var.getMessagesController().f22999e7.edit().putBoolean("story_keep", true).apply();
                va.D(d2Var.getParentActivity(), d2Var.getCurrentAccount()).Q(null);
                return;
        }
    }
}
