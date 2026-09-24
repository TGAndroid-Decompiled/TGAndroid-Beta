package ii;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Objects;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wl0;
public final class n5 extends u51 {
    public static final int f11516a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        boolean z11;
        p5 p5Var = (p5) view;
        a aVar = (a) v51Var.G;
        d3 d3Var = (d3) v51Var.H;
        r5 r5Var = p5Var.v;
        boolean z12 = true;
        if (p5Var.f11207a != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        p5Var.f11207a = aVar;
        p5Var.E = d3Var;
        p5Var.f11560y = LocaleController.isRTL;
        p5Var.c(aVar);
        TL_iv.PageBlock pageBlock = aVar.f11191b;
        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
            return;
        }
        i6 i6Var = new i6((TL_iv.pageBlockTable) pageBlock);
        p5Var.F = i6Var;
        r5Var.setModel(i6Var);
        LinkedHashSet linkedHashSet = p5Var.H;
        Objects.requireNonNull(linkedHashSet);
        r5Var.setSelectionProvider(new ei.d5(linkedHashSet, 21));
        p5Var.y();
        i1 i1Var = p5Var.f11556r;
        a aVar2 = p5Var.f11207a;
        if (aVar2 != null) {
            TL_iv.PageBlock pageBlock2 = aVar2.f11191b;
            if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                if (pageblocktable.title == null) {
                    pageblocktable.title = new TL_iv.textEmpty();
                }
                String l4 = g6.l(pageblocktable.title);
                SpannableStringBuilder r10 = g6.r(pageblocktable.title, null, true);
                a aVar3 = p5Var.f11207a;
                if (!aVar3.f11205s) {
                    aVar3.f11205s = true;
                    if (r10.length() != 0 && (g6.q(0, r10.length(), r10) & 1) == 0) {
                        z12 = false;
                    }
                    aVar3.f11204r = z12;
                }
                i1Var.setAutoBold(p5Var.f11207a.f11204r);
                if (z11 || !String.valueOf(i1Var.getText()).equals(l4)) {
                    i1Var.setTextSilently(Emoji.replaceEmoji(r10, i1Var.getPaint().getFontMetricsInt(), false));
                    i1Var.invalidateEffects();
                }
            }
        }
        p5Var.e();
        p5Var.f11558w.requestLayout();
    }

    @Override
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        p5 p5Var = new p5(context, d6Var);
        p5Var.setBackground(new b2(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19045d6, d6Var)));
        return p5Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
