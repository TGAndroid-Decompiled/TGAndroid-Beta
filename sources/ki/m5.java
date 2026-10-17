package ki;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Objects;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;
public final class m5 extends e61 {
    public static final int f15385a = 0;

    static {
        e61.setup(new e61());
    }

    @Override
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        boolean z11;
        o5 o5Var = (o5) view;
        a aVar = (a) f61Var.G;
        c3 c3Var = (c3) f61Var.H;
        q5 q5Var = o5Var.v;
        boolean z12 = true;
        if (o5Var.f15105a != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        o5Var.f15105a = aVar;
        o5Var.E = c3Var;
        o5Var.f15429y = LocaleController.isRTL;
        o5Var.c(aVar);
        TL_iv.PageBlock pageBlock = aVar.f15089b;
        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
            return;
        }
        g6 g6Var = new g6((TL_iv.pageBlockTable) pageBlock);
        o5Var.F = g6Var;
        q5Var.setModel(g6Var);
        LinkedHashSet linkedHashSet = o5Var.H;
        Objects.requireNonNull(linkedHashSet);
        q5Var.setSelectionProvider(new j5.b(linkedHashSet, 10));
        o5Var.y();
        h1 h1Var = o5Var.f15425r;
        a aVar2 = o5Var.f15105a;
        if (aVar2 != null) {
            TL_iv.PageBlock pageBlock2 = aVar2.f15089b;
            if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                if (pageblocktable.title == null) {
                    pageblocktable.title = new TL_iv.textEmpty();
                }
                String l4 = e6.l(pageblocktable.title);
                SpannableStringBuilder r10 = e6.r(pageblocktable.title, null, true);
                a aVar3 = o5Var.f15105a;
                if (!aVar3.f15103s) {
                    aVar3.f15103s = true;
                    if (r10.length() != 0 && (e6.q(0, r10.length(), r10) & 1) == 0) {
                        z12 = false;
                    }
                    aVar3.f15102r = z12;
                }
                h1Var.setAutoBold(o5Var.f15105a.f15102r);
                if (z11 || !String.valueOf(h1Var.getText()).equals(l4)) {
                    h1Var.setTextSilently(Emoji.replaceEmoji(r10, h1Var.getPaint().getFontMetricsInt(), false));
                    h1Var.invalidateEffects();
                }
            }
        }
        o5Var.d();
        o5Var.f15427w.requestLayout();
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        o5 o5Var = new o5(context, d6Var);
        o5Var.setBackground(new a2(h6.w0(h6.f20986d6, d6Var)));
        return o5Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
