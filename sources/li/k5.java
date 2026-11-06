package li;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Objects;
import java.util.LinkedHashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.i6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w31;
public final class k5 extends v31 {
    public static final int f18674b = 0;

    static {
        v31.h(new v31());
    }

    @Override
    public final void b(View view, w31 w31Var, boolean z9, k41 k41Var, p41 p41Var) {
        boolean z10;
        m5 m5Var = (m5) view;
        a aVar = (a) w31Var.G;
        a3 a3Var = (a3) w31Var.H;
        o5 o5Var = m5Var.f18708w;
        boolean z11 = true;
        if (m5Var.f18986a != aVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        m5Var.f18986a = aVar;
        m5Var.E = a3Var;
        m5Var.D = hd.f22871a0;
        m5Var.c(aVar);
        TL_iv.PageBlock pageBlock = aVar.f18389b;
        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
            return;
        }
        e6 e6Var = new e6((TL_iv.pageBlockTable) pageBlock);
        m5Var.F = e6Var;
        o5Var.setModel(e6Var);
        LinkedHashSet linkedHashSet = m5Var.H;
        Objects.requireNonNull(linkedHashSet);
        o5Var.setSelectionProvider(new l2.y(linkedHashSet, 12));
        m5Var.A();
        g1 g1Var = m5Var.f18706r;
        a aVar2 = m5Var.f18986a;
        if (aVar2 != null) {
            TL_iv.PageBlock pageBlock2 = aVar2.f18389b;
            if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                if (pageblocktable.title == null) {
                    pageblocktable.title = new TL_iv.textEmpty();
                }
                String l10 = c6.l(pageblocktable.title);
                SpannableStringBuilder r10 = c6.r(pageblocktable.title, null, true);
                a aVar3 = m5Var.f18986a;
                if (!aVar3.f18404s) {
                    aVar3.f18404s = true;
                    if (r10.length() != 0 && (c6.q(0, r10.length(), r10) & 1) == 0) {
                        z11 = false;
                    }
                    aVar3.f18403r = z11;
                }
                g1Var.setAutoBold(m5Var.f18986a.f18403r);
                if (z10 || !String.valueOf(g1Var.getText()).equals(l10)) {
                    g1Var.setTextSilently(i6.m(r10, g1Var.getPaint().getFontMetricsInt(), false, null, 0));
                    g1Var.f();
                }
            }
        }
        m5Var.updateColors();
        m5Var.f18709x.requestLayout();
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        m5 m5Var = new m5(context, f6Var);
        m5Var.setBackground(new y1(k6.w0(k6.f27848d6, f6Var)));
        return m5Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
