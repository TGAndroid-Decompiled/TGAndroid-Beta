package ki;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Objects;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lm0;
public final class m5 extends k61 {
    public static final int f15451a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, a71 a71Var, i71 i71Var) {
        boolean z11;
        o5 o5Var = (o5) view;
        a aVar = (a) l61Var.G;
        c3 c3Var = (c3) l61Var.H;
        q5 q5Var = o5Var.v;
        boolean z12 = true;
        if (o5Var.f15157a != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        o5Var.f15157a = aVar;
        o5Var.E = c3Var;
        o5Var.f15495y = LocaleController.isRTL;
        o5Var.c(aVar);
        TL_iv.PageBlock pageBlock = aVar.f15141b;
        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
            return;
        }
        g6 g6Var = new g6((TL_iv.pageBlockTable) pageBlock);
        o5Var.F = g6Var;
        q5Var.setModel(g6Var);
        LinkedHashSet linkedHashSet = o5Var.H;
        Objects.requireNonNull(linkedHashSet);
        q5Var.setSelectionProvider(new j5.b(linkedHashSet, 10));
        o5Var.x();
        h1 h1Var = o5Var.f15491r;
        a aVar2 = o5Var.f15157a;
        if (aVar2 != null) {
            TL_iv.PageBlock pageBlock2 = aVar2.f15141b;
            if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                if (pageblocktable.title == null) {
                    pageblocktable.title = new TL_iv.textEmpty();
                }
                String l4 = e6.l(pageblocktable.title);
                SpannableStringBuilder r10 = e6.r(pageblocktable.title, null, true);
                a aVar3 = o5Var.f15157a;
                if (!aVar3.f15155s) {
                    aVar3.f15155s = true;
                    if (r10.length() != 0 && (e6.q(0, r10.length(), r10) & 1) == 0) {
                        z12 = false;
                    }
                    aVar3.f15154r = z12;
                }
                h1Var.setAutoBold(o5Var.f15157a.f15154r);
                if (z11 || !String.valueOf(h1Var.getText()).equals(l4)) {
                    h1Var.setTextSilently(Emoji.replaceEmoji(r10, h1Var.getPaint().getFontMetricsInt(), false));
                    h1Var.invalidateEffects();
                }
            }
        }
        o5Var.updateColors();
        o5Var.f15493w.requestLayout();
    }

    @Override
    public final View createView(Context context, lm0 lm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        o5 o5Var = new o5(context, g6Var);
        o5Var.setBackground(new a2(k6.w0(k6.f21184d6, g6Var)));
        return o5Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
