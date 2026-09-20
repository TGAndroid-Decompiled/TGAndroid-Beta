package ii;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Objects;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;
public final class m5 extends v51 {
    public static final int f11507a = 0;

    static {
        v51.setup(new v51());
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        boolean z11;
        o5 o5Var = (o5) view;
        a aVar = (a) w51Var.G;
        c3 c3Var = (c3) w51Var.H;
        q5 q5Var = o5Var.v;
        boolean z12 = true;
        if (o5Var.f11221a != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        o5Var.f11221a = aVar;
        o5Var.E = c3Var;
        o5Var.f11548y = LocaleController.isRTL;
        o5Var.c(aVar);
        TL_iv.PageBlock pageBlock = aVar.f11205b;
        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
            return;
        }
        h6 h6Var = new h6((TL_iv.pageBlockTable) pageBlock);
        o5Var.F = h6Var;
        q5Var.setModel(h6Var);
        LinkedHashSet linkedHashSet = o5Var.H;
        Objects.requireNonNull(linkedHashSet);
        q5Var.setSelectionProvider(new ei.d5(linkedHashSet, 22));
        o5Var.y();
        i1 i1Var = o5Var.f11544r;
        a aVar2 = o5Var.f11221a;
        if (aVar2 != null) {
            TL_iv.PageBlock pageBlock2 = aVar2.f11205b;
            if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                if (pageblocktable.title == null) {
                    pageblocktable.title = new TL_iv.textEmpty();
                }
                String l4 = f6.l(pageblocktable.title);
                SpannableStringBuilder r10 = f6.r(pageblocktable.title, null, true);
                a aVar3 = o5Var.f11221a;
                if (!aVar3.f11219s) {
                    aVar3.f11219s = true;
                    if (r10.length() != 0 && (f6.q(0, r10.length(), r10) & 1) == 0) {
                        z12 = false;
                    }
                    aVar3.f11218r = z12;
                }
                i1Var.setAutoBold(o5Var.f11221a.f11218r);
                if (z11 || !String.valueOf(i1Var.getText()).equals(l4)) {
                    i1Var.setTextSilently(Emoji.replaceEmoji(r10, i1Var.getPaint().getFontMetricsInt(), false));
                    i1Var.invalidateEffects();
                }
            }
        }
        o5Var.e();
        o5Var.f11546w.requestLayout();
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        o5 o5Var = new o5(context, f6Var);
        o5Var.setBackground(new a2(j6.v0(j6.f19094d6, f6Var)));
        return o5Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
