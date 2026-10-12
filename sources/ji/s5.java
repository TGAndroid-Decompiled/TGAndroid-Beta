package ji;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Objects;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
public final class s5 extends k61 {
    public static final int f13513a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        boolean z11;
        u5 u5Var = (u5) view;
        a aVar = (a) l61Var.G;
        d3 d3Var = (d3) l61Var.H;
        w5 w5Var = u5Var.v;
        boolean z12 = true;
        if (u5Var.f13119a != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        u5Var.f13119a = aVar;
        u5Var.E = d3Var;
        u5Var.f13565y = LocaleController.isRTL;
        u5Var.c(aVar);
        TL_iv.PageBlock pageBlock = aVar.f13103b;
        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
            return;
        }
        m6 m6Var = new m6((TL_iv.pageBlockTable) pageBlock);
        u5Var.F = m6Var;
        w5Var.setModel(m6Var);
        LinkedHashSet linkedHashSet = u5Var.H;
        Objects.requireNonNull(linkedHashSet);
        w5Var.setSelectionProvider(new m5(linkedHashSet, 0));
        u5Var.y();
        h1 h1Var = u5Var.f13561r;
        a aVar2 = u5Var.f13119a;
        if (aVar2 != null) {
            TL_iv.PageBlock pageBlock2 = aVar2.f13103b;
            if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                if (pageblocktable.title == null) {
                    pageblocktable.title = new TL_iv.textEmpty();
                }
                String l4 = k6.l(pageblocktable.title);
                SpannableStringBuilder r10 = k6.r(pageblocktable.title, null, true);
                a aVar3 = u5Var.f13119a;
                if (!aVar3.f13117s) {
                    aVar3.f13117s = true;
                    if (r10.length() != 0 && (k6.q(0, r10.length(), r10) & 1) == 0) {
                        z12 = false;
                    }
                    aVar3.f13116r = z12;
                }
                h1Var.setAutoBold(u5Var.f13119a.f13116r);
                if (z11 || !String.valueOf(h1Var.getText()).equals(l4)) {
                    h1Var.setTextSilently(Emoji.replaceEmoji(r10, h1Var.getPaint().getFontMetricsInt(), false));
                    h1Var.invalidateEffects();
                }
            }
        }
        u5Var.d();
        u5Var.f13563w.requestLayout();
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        u5 u5Var = new u5(context, c6Var);
        u5Var.setBackground(new a2(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19901d6, c6Var)));
        return u5Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
