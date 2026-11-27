package defpackage;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
public final class mb2 implements Runnable {
    public final byte a;
    public final wb2 b;

    public mb2(wb2 wb2Var, byte b) {
        this.a = b;
        this.b = wb2Var;
    }

    @Override
    public final void run() {
        boolean z2;
        switch (this.a) {
            case 0:
                rb2 rb2Var = this.b.eb;
                if (rb2Var != null) {
                    rb2Var.r();
                    return;
                }
                return;
            default:
                wb2 wb2Var = this.b;
                mb2 mb2Var = wb2Var.Ib;
                r47 r47Var = wb2Var.Q5;
                if (r47Var != null && (z2 = wb2Var.z2(r47Var)) != wb2Var.h3) {
                    wb2Var.h3 = z2;
                    if (!z2) {
                        hl.d3(mb2Var, 1000L);
                        wb2Var.rb = true;
                        int L = wb2Var.b7 - hl.L(91.0f);
                        wb2Var.e3 = new StaticLayout(TextUtils.ellipsize(ob6.M0(2131753959, null), aob.H2, L, TextUtils.TruncateAt.END), aob.H2, L, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    } else {
                        r47 r47Var2 = wb2Var.Q5;
                        wb2Var.Q5 = null;
                        wb2Var.z3(r47Var2, wb2Var.L, wb2Var.G, wb2Var.F, wb2Var.H, false);
                    }
                }
                if (wb2Var.h3) {
                    wb2Var.invalidate();
                    wb2Var.rb = false;
                    return;
                }
                RectF rectF = wb2Var.c4;
                wb2Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                if (wb2Var.rb) {
                    hl.d3(mb2Var, 1000L);
                    return;
                }
                return;
        }
    }
}
