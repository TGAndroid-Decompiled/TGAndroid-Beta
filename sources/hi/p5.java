package hi;

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
import org.telegram.ui.Components.vl0;
public final class p5 extends u51 {
    public static final int f9791a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        boolean z11;
        r5 r5Var = (r5) view;
        a aVar = (a) v51Var.G;
        f3 f3Var = (f3) v51Var.H;
        t5 t5Var = r5Var.v;
        boolean z12 = true;
        if (r5Var.f9464a != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        r5Var.f9464a = aVar;
        r5Var.E = f3Var;
        r5Var.f9833y = LocaleController.isRTL;
        r5Var.c(aVar);
        TL_iv.PageBlock pageBlock = aVar.f9421b;
        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
            return;
        }
        l6 l6Var = new l6((TL_iv.pageBlockTable) pageBlock);
        r5Var.F = l6Var;
        t5Var.setModel(l6Var);
        LinkedHashSet linkedHashSet = r5Var.H;
        Objects.requireNonNull(linkedHashSet);
        t5Var.setSelectionProvider(new y1(linkedHashSet, 6));
        r5Var.y();
        k1 k1Var = r5Var.f9829r;
        a aVar2 = r5Var.f9464a;
        if (aVar2 != null) {
            TL_iv.PageBlock pageBlock2 = aVar2.f9421b;
            if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                if (pageblocktable.title == null) {
                    pageblocktable.title = new TL_iv.textEmpty();
                }
                String l4 = i6.l(pageblocktable.title);
                SpannableStringBuilder r10 = i6.r(pageblocktable.title, null, true);
                a aVar3 = r5Var.f9464a;
                if (!aVar3.f9435s) {
                    aVar3.f9435s = true;
                    if (r10.length() != 0 && (i6.q(0, r10.length(), r10) & 1) == 0) {
                        z12 = false;
                    }
                    aVar3.f9434r = z12;
                }
                k1Var.setAutoBold(r5Var.f9464a.f9434r);
                if (z11 || !String.valueOf(k1Var.getText()).equals(l4)) {
                    k1Var.setTextSilently(Emoji.replaceEmoji(r10, k1Var.getPaint().getFontMetricsInt(), false));
                    k1Var.invalidateEffects();
                }
            }
        }
        r5Var.e();
        r5Var.f9831w.requestLayout();
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        r5 r5Var = new r5(context, f6Var);
        r5Var.setBackground(new d2(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, f6Var)));
        return r5Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
