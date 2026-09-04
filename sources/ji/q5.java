package ji;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Objects;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;
public final class q5 extends g51 {
    public static final int f14131a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        boolean z11;
        s5 s5Var = (s5) view;
        a aVar = (a) h51Var.G;
        b3 b3Var = (b3) h51Var.H;
        u5 u5Var = s5Var.v;
        boolean z12 = true;
        if (s5Var.f13749a != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        s5Var.f13749a = aVar;
        s5Var.E = b3Var;
        s5Var.f14171y = LocaleController.isRTL;
        s5Var.c(aVar);
        TL_iv.PageBlock pageBlock = aVar.f13732b;
        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
            return;
        }
        k6 k6Var = new k6((TL_iv.pageBlockTable) pageBlock);
        s5Var.F = k6Var;
        u5Var.setModel(k6Var);
        LinkedHashSet linkedHashSet = s5Var.H;
        Objects.requireNonNull(linkedHashSet);
        u5Var.setSelectionProvider(new k5(linkedHashSet, 0));
        s5Var.y();
        h1 h1Var = s5Var.f14167r;
        a aVar2 = s5Var.f13749a;
        if (aVar2 != null) {
            TL_iv.PageBlock pageBlock2 = aVar2.f13732b;
            if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                if (pageblocktable.title == null) {
                    pageblocktable.title = new TL_iv.textEmpty();
                }
                String l4 = i6.l(pageblocktable.title);
                SpannableStringBuilder r10 = i6.r(pageblocktable.title, null, true);
                a aVar3 = s5Var.f13749a;
                if (!aVar3.f13747s) {
                    aVar3.f13747s = true;
                    if (r10.length() != 0 && (i6.q(0, r10.length(), r10) & 1) == 0) {
                        z12 = false;
                    }
                    aVar3.f13746r = z12;
                }
                h1Var.setAutoBold(s5Var.f13749a.f13746r);
                if (z11 || !String.valueOf(h1Var.getText()).equals(l4)) {
                    h1Var.setTextSilently(Emoji.replaceEmoji(r10, h1Var.getPaint().getFontMetricsInt(), false));
                    h1Var.invalidateEffects();
                }
            }
        }
        s5Var.d();
        s5Var.f14169w.requestLayout();
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        s5 s5Var = new s5(context, f6Var);
        s5Var.setBackground(new z1(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20663d6, f6Var)));
        return s5Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
