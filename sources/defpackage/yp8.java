package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.d;
public final class yp8 implements View.OnClickListener {
    public final byte a;
    public final boolean b;
    public final int c;
    public final FrameLayout d;

    public yp8(FrameLayout frameLayout, boolean z, int i, byte b) {
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
                lca lcaVar = (lca) frameLayout;
                if (lcaVar.e.h() && lcaVar.h.getCurrentPosition() != 0) {
                    lcaVar.a();
                    return;
                }
                int i = this.c;
                if (z) {
                    tv4 tv4Var = new tv4(lcaVar.getContext(), i, lcaVar.c, null, null);
                    tv4Var.a1(oj0.a(i).c(lcaVar.c));
                    tv4Var.show();
                    return;
                }
                xu4.f1(false, oj0.a(i).b());
                return;
            default:
                nfa nfaVar = (nfa) frameLayout;
                d dVar = nfaVar.y1;
                if (z) {
                    nfaVar.U0(this.c, nfaVar.m1, dVar);
                    return;
                }
                dVar.getMessagesController().X3.edit().putBoolean("story_keep", true).apply();
                t7b.C(dVar.getParentActivity(), dVar.getCurrentAccount()).Q(null);
                return;
        }
    }
}
