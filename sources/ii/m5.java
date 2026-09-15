package ii;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Objects;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.w51;
public final class m5 extends h51 {
    public static final int f11503a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        boolean z11;
        o5 o5Var = (o5) view;
        a aVar = (a) i51Var.G;
        c3 c3Var = (c3) i51Var.H;
        q5 q5Var = o5Var.v;
        boolean z12 = true;
        if (o5Var.f11217a != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        o5Var.f11217a = aVar;
        o5Var.E = c3Var;
        o5Var.f11544y = LocaleController.isRTL;
        o5Var.c(aVar);
        TL_iv.PageBlock pageBlock = aVar.f11201b;
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
        i1 i1Var = o5Var.f11540r;
        a aVar2 = o5Var.f11217a;
        if (aVar2 != null) {
            TL_iv.PageBlock pageBlock2 = aVar2.f11201b;
            if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                if (pageblocktable.title == null) {
                    pageblocktable.title = new TL_iv.textEmpty();
                }
                String l4 = f6.l(pageblocktable.title);
                SpannableStringBuilder r10 = f6.r(pageblocktable.title, null, true);
                a aVar3 = o5Var.f11217a;
                if (!aVar3.f11215s) {
                    aVar3.f11215s = true;
                    if (r10.length() != 0 && (f6.q(0, r10.length(), r10) & 1) == 0) {
                        z12 = false;
                    }
                    aVar3.f11214r = z12;
                }
                i1Var.setAutoBold(o5Var.f11217a.f11214r);
                if (z11 || !String.valueOf(i1Var.getText()).equals(l4)) {
                    i1Var.setTextSilently(Emoji.replaceEmoji(r10, i1Var.getPaint().getFontMetricsInt(), false));
                    i1Var.invalidateEffects();
                }
            }
        }
        o5Var.e();
        o5Var.f11542w.requestLayout();
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        o5 o5Var = new o5(context, e6Var);
        o5Var.setBackground(new a2(i6.v0(i6.f18836d6, e6Var)));
        return o5Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
