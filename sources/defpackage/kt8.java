package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.e;
public final class kt8 implements View.OnClickListener {
    public final byte a;
    public final boolean b;
    public final int c;
    public final FrameLayout d;

    public kt8(FrameLayout frameLayout, boolean z, int i, byte b) {
        this.a = b;
        this.d = frameLayout;
        this.b = z;
        this.c = i;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        boolean z = this.b;
        FrameLayout frameLayout = this.d;
        switch (b) {
            case 0:
                cga cgaVar = (cga) frameLayout;
                if (cgaVar.e.h() && cgaVar.h.getCurrentPosition() != 0) {
                    cgaVar.a();
                    return;
                }
                int i = this.c;
                if (z) {
                    yx4 yx4Var = new yx4(cgaVar.getContext(), i, cgaVar.c, null, null);
                    yx4Var.b1(pj0.a(i).c(cgaVar.c));
                    yx4Var.show();
                    return;
                }
                bx4.g1(false, pj0.a(i).b());
                return;
            default:
                eja ejaVar = (eja) frameLayout;
                e eVar = ejaVar.y1;
                if (z) {
                    ejaVar.U0(this.c, ejaVar.m1, eVar);
                    return;
                }
                eVar.getMessagesController().Y3.edit().putBoolean("story_keep", true).apply();
                sbb.C(eVar.getParentActivity(), eVar.getCurrentAccount()).Q(null);
                return;
        }
    }
}
