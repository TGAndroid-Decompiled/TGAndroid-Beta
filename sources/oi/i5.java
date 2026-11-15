package oi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Objects;
import java.util.LinkedHashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.j6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
public final class i5 extends a41 {
    public static final int f21741b = 0;

    static {
        a41.h(new a41());
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        boolean z11;
        k5 k5Var = (k5) view;
        a aVar = (a) b41Var.G;
        y2 y2Var = (y2) b41Var.H;
        m5 m5Var = k5Var.f21778w;
        boolean z12 = true;
        if (k5Var.f22106a != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        k5Var.f22106a = aVar;
        k5Var.F = y2Var;
        k5Var.E = hd.f24101a0;
        k5Var.c(aVar);
        TL_iv.PageBlock pageBlock = aVar.f21544b;
        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
            return;
        }
        c6 c6Var = new c6((TL_iv.pageBlockTable) pageBlock);
        k5Var.G = c6Var;
        m5Var.setModel(c6Var);
        LinkedHashSet linkedHashSet = k5Var.I;
        Objects.requireNonNull(linkedHashSet);
        m5Var.setSelectionProvider(new ki.e(linkedHashSet, 25));
        k5Var.A();
        e1 e1Var = k5Var.f21776r;
        a aVar2 = k5Var.f22106a;
        if (aVar2 != null) {
            TL_iv.PageBlock pageBlock2 = aVar2.f21544b;
            if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                if (pageblocktable.title == null) {
                    pageblocktable.title = new TL_iv.textEmpty();
                }
                String l10 = a6.l(pageblocktable.title);
                SpannableStringBuilder r10 = a6.r(pageblocktable.title, null, true);
                a aVar3 = k5Var.f22106a;
                if (!aVar3.f21559s) {
                    aVar3.f21559s = true;
                    if (r10.length() != 0 && (a6.q(0, r10.length(), r10) & 1) == 0) {
                        z12 = false;
                    }
                    aVar3.f21558r = z12;
                }
                e1Var.setAutoBold(k5Var.f22106a.f21558r);
                if (z11 || !String.valueOf(e1Var.getText()).equals(l10)) {
                    e1Var.setTextSilently(j6.m(r10, e1Var.getPaint().getFontMetricsInt(), false, null, 0));
                    e1Var.f();
                }
            }
        }
        k5Var.updateColors();
        k5Var.f21779x.requestLayout();
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, e6 e6Var) {
        k5 k5Var = new k5(context, e6Var);
        k5Var.setBackground(new w1(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, e6Var)));
        return k5Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
