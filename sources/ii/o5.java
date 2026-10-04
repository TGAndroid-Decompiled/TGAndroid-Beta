package ii;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Objects;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.zl0;
public final class o5 extends f61 {
    public static final int f12560a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, u61 u61Var, c71 c71Var) {
        boolean z11;
        q5 q5Var = (q5) view;
        a aVar = (a) g61Var.G;
        d3 d3Var = (d3) g61Var.H;
        s5 s5Var = q5Var.v;
        boolean z12 = true;
        if (q5Var.f12203a != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        q5Var.f12203a = aVar;
        q5Var.E = d3Var;
        q5Var.f12600y = LocaleController.isRTL;
        q5Var.c(aVar);
        TL_iv.PageBlock pageBlock = aVar.f12186b;
        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
            return;
        }
        j6 j6Var = new j6((TL_iv.pageBlockTable) pageBlock);
        q5Var.F = j6Var;
        s5Var.setModel(j6Var);
        LinkedHashSet linkedHashSet = q5Var.H;
        Objects.requireNonNull(linkedHashSet);
        s5Var.setSelectionProvider(new ei.f(linkedHashSet, 22));
        q5Var.y();
        i1 i1Var = q5Var.f12596r;
        a aVar2 = q5Var.f12203a;
        if (aVar2 != null) {
            TL_iv.PageBlock pageBlock2 = aVar2.f12186b;
            if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                if (pageblocktable.title == null) {
                    pageblocktable.title = new TL_iv.textEmpty();
                }
                String l4 = h6.l(pageblocktable.title);
                SpannableStringBuilder r10 = h6.r(pageblocktable.title, null, true);
                a aVar3 = q5Var.f12203a;
                if (!aVar3.f12201s) {
                    aVar3.f12201s = true;
                    if (r10.length() != 0 && (h6.q(0, r10.length(), r10) & 1) == 0) {
                        z12 = false;
                    }
                    aVar3.f12200r = z12;
                }
                i1Var.setAutoBold(q5Var.f12203a.f12200r);
                if (z11 || !String.valueOf(i1Var.getText()).equals(l4)) {
                    i1Var.setTextSilently(Emoji.replaceEmoji(r10, i1Var.getPaint().getFontMetricsInt(), false));
                    i1Var.invalidateEffects();
                }
            }
        }
        q5Var.e();
        q5Var.f12598w.requestLayout();
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        q5 q5Var = new q5(context, d6Var);
        q5Var.setBackground(new b2(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20818d6, d6Var)));
        return q5Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
