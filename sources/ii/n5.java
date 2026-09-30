package ii;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Objects;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.zl0;
public final class n5 extends x51 {
    public static final int f11530a = 0;

    static {
        x51.setup(new x51());
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        boolean z11;
        p5 p5Var = (p5) view;
        a aVar = (a) y51Var.G;
        d3 d3Var = (d3) y51Var.H;
        r5 r5Var = p5Var.v;
        boolean z12 = true;
        if (p5Var.f11221a != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        p5Var.f11221a = aVar;
        p5Var.E = d3Var;
        p5Var.f11574y = LocaleController.isRTL;
        p5Var.c(aVar);
        TL_iv.PageBlock pageBlock = aVar.f11205b;
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
        i1 i1Var = p5Var.f11570r;
        a aVar2 = p5Var.f11221a;
        if (aVar2 != null) {
            TL_iv.PageBlock pageBlock2 = aVar2.f11205b;
            if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                if (pageblocktable.title == null) {
                    pageblocktable.title = new TL_iv.textEmpty();
                }
                String l4 = g6.l(pageblocktable.title);
                SpannableStringBuilder r10 = g6.r(pageblocktable.title, null, true);
                a aVar3 = p5Var.f11221a;
                if (!aVar3.f11219s) {
                    aVar3.f11219s = true;
                    if (r10.length() != 0 && (g6.q(0, r10.length(), r10) & 1) == 0) {
                        z12 = false;
                    }
                    aVar3.f11218r = z12;
                }
                i1Var.setAutoBold(p5Var.f11221a.f11218r);
                if (z11 || !String.valueOf(i1Var.getText()).equals(l4)) {
                    i1Var.setTextSilently(Emoji.replaceEmoji(r10, i1Var.getPaint().getFontMetricsInt(), false));
                    i1Var.invalidateEffects();
                }
            }
        }
        p5Var.e();
        p5Var.f11572w.requestLayout();
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        p5 p5Var = new p5(context, d6Var);
        p5Var.setBackground(new b2(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19076d6, d6Var)));
        return p5Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
