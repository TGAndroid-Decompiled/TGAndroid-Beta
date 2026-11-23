package oi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Objects;
import java.util.LinkedHashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.j6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
public final class j5 extends n41 {
    public static final int f22154b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        boolean z11;
        l5 l5Var = (l5) view;
        a aVar = (a) o41Var.H;
        a3 a3Var = (a3) o41Var.I;
        n5 n5Var = l5Var.f22186w;
        boolean z12 = true;
        if (l5Var.f22468a != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        l5Var.f22468a = aVar;
        l5Var.F = a3Var;
        l5Var.E = hd.f24408a0;
        l5Var.c(aVar);
        TL_iv.PageBlock pageBlock = aVar.f21901b;
        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
            return;
        }
        d6 d6Var = new d6((TL_iv.pageBlockTable) pageBlock);
        l5Var.G = d6Var;
        n5Var.setModel(d6Var);
        LinkedHashSet linkedHashSet = l5Var.I;
        Objects.requireNonNull(linkedHashSet);
        n5Var.setSelectionProvider(new kg.y1(linkedHashSet, 27));
        l5Var.A();
        e1 e1Var = l5Var.f22184r;
        a aVar2 = l5Var.f22468a;
        if (aVar2 != null) {
            TL_iv.PageBlock pageBlock2 = aVar2.f21901b;
            if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                if (pageblocktable.title == null) {
                    pageblocktable.title = new TL_iv.textEmpty();
                }
                String l10 = b6.l(pageblocktable.title);
                SpannableStringBuilder r10 = b6.r(pageblocktable.title, null, true);
                a aVar3 = l5Var.f22468a;
                if (!aVar3.f21916s) {
                    aVar3.f21916s = true;
                    if (r10.length() != 0 && (b6.q(0, r10.length(), r10) & 1) == 0) {
                        z12 = false;
                    }
                    aVar3.f21915r = z12;
                }
                e1Var.setAutoBold(l5Var.f22468a.f21915r);
                if (z11 || !String.valueOf(e1Var.getText()).equals(l10)) {
                    e1Var.setTextSilently(j6.m(r10, e1Var.getPaint().getFontMetricsInt(), false, null, 0));
                    e1Var.f();
                }
            }
        }
        l5Var.updateColors();
        l5Var.f22187x.requestLayout();
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, h6 h6Var) {
        l5 l5Var = new l5(context, h6Var);
        l5Var.setBackground(new x1(m6.w0(m6.f29347d6, h6Var)));
        return l5Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
