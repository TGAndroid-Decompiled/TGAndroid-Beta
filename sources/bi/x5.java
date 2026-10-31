package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Objects;
import java.util.LinkedHashSet;
import org.telegram.messenger.cd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;
public final class x5 extends z41 {
    public static final int f3452b = 0;

    static {
        z41.h(new z41());
    }

    @Override
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        boolean z11;
        z5 z5Var = (z5) view;
        a aVar = (a) a51Var.G;
        k3 k3Var = (k3) a51Var.H;
        b6 b6Var = z5Var.f3483w;
        boolean z12 = true;
        if (z5Var.f2881a != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        z5Var.f2881a = aVar;
        z5Var.E = k3Var;
        z5Var.D = cd.X;
        z5Var.c(aVar);
        TL_iv.PageBlock pageBlock = aVar.f2818b;
        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
            return;
        }
        w6 w6Var = new w6((TL_iv.pageBlockTable) pageBlock);
        z5Var.F = w6Var;
        b6Var.setModel(w6Var);
        LinkedHashSet linkedHashSet = z5Var.H;
        Objects.requireNonNull(linkedHashSet);
        b6Var.setSelectionProvider(new a1.c(linkedHashSet, 15));
        z5Var.A();
        n1 n1Var = z5Var.f3481r;
        a aVar2 = z5Var.f2881a;
        if (aVar2 != null) {
            TL_iv.PageBlock pageBlock2 = aVar2.f2818b;
            if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                if (pageblocktable.title == null) {
                    pageblocktable.title = new TL_iv.textEmpty();
                }
                String l4 = s6.l(pageblocktable.title);
                SpannableStringBuilder r10 = s6.r(pageblocktable.title, null, true);
                a aVar3 = z5Var.f2881a;
                if (!aVar3.f2832s) {
                    aVar3.f2832s = true;
                    if (r10.length() != 0 && (s6.q(0, r10.length(), r10) & 1) == 0) {
                        z12 = false;
                    }
                    aVar3.f2831r = z12;
                }
                n1Var.setAutoBold(z5Var.f2881a.f2831r);
                if (z11 || !String.valueOf(n1Var.getText()).equals(l4)) {
                    n1Var.setTextSilently(org.telegram.messenger.k6.m(r10, n1Var.getPaint().getFontMetricsInt(), false, null, 0));
                    n1Var.f();
                }
            }
        }
        z5Var.updateColors();
        z5Var.f3484x.requestLayout();
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        z5 z5Var = new z5(context, p6Var);
        z5Var.setBackground(new h2(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20929d6, p6Var)));
        return z5Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
