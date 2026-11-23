package oi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Objects;
import java.util.LinkedHashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.j6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
public final class k5 extends m41 {
    public static final int f22284b = 0;

    static {
        m41.h(new m41());
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        boolean z11;
        m5 m5Var = (m5) view;
        a aVar = (a) n41Var.H;
        b3 b3Var = (b3) n41Var.I;
        o5 o5Var = m5Var.f22316w;
        boolean z12 = true;
        if (m5Var.f22598a != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        m5Var.f22598a = aVar;
        m5Var.F = b3Var;
        m5Var.E = gd.f24314a0;
        m5Var.c(aVar);
        TL_iv.PageBlock pageBlock = aVar.f22001b;
        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
            return;
        }
        e6 e6Var = new e6((TL_iv.pageBlockTable) pageBlock);
        m5Var.G = e6Var;
        o5Var.setModel(e6Var);
        LinkedHashSet linkedHashSet = m5Var.I;
        Objects.requireNonNull(linkedHashSet);
        o5Var.setSelectionProvider(new kg.f1(linkedHashSet, 29));
        m5Var.A();
        f1 f1Var = m5Var.f22314r;
        a aVar2 = m5Var.f22598a;
        if (aVar2 != null) {
            TL_iv.PageBlock pageBlock2 = aVar2.f22001b;
            if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                if (pageblocktable.title == null) {
                    pageblocktable.title = new TL_iv.textEmpty();
                }
                String l10 = c6.l(pageblocktable.title);
                SpannableStringBuilder r10 = c6.r(pageblocktable.title, null, true);
                a aVar3 = m5Var.f22598a;
                if (!aVar3.f22016s) {
                    aVar3.f22016s = true;
                    if (r10.length() != 0 && (c6.q(0, r10.length(), r10) & 1) == 0) {
                        z12 = false;
                    }
                    aVar3.f22015r = z12;
                }
                f1Var.setAutoBold(m5Var.f22598a.f22015r);
                if (z11 || !String.valueOf(f1Var.getText()).equals(l10)) {
                    f1Var.setTextSilently(j6.m(r10, f1Var.getPaint().getFontMetricsInt(), false, null, 0));
                    f1Var.f();
                }
            }
        }
        m5Var.updateColors();
        m5Var.f22317x.requestLayout();
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, i6 i6Var) {
        m5 m5Var = new m5(context, i6Var);
        m5Var.setBackground(new y1(n6.w0(n6.f29451d6, i6Var)));
        return m5Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
