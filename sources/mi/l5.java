package mi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Objects;
import java.util.LinkedHashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.i6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
public final class l5 extends q31 {
    public static final int f19736b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        boolean z11;
        n5 n5Var = (n5) view;
        a aVar = (a) r31Var.G;
        b3 b3Var = (b3) r31Var.H;
        p5 p5Var = n5Var.f19771w;
        boolean z12 = true;
        if (n5Var.f20029a != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        n5Var.f20029a = aVar;
        n5Var.F = b3Var;
        n5Var.E = bd.f21784a0;
        n5Var.c(aVar);
        TL_iv.PageBlock pageBlock = aVar.f19431b;
        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
            return;
        }
        f6 f6Var = new f6((TL_iv.pageBlockTable) pageBlock);
        n5Var.G = f6Var;
        p5Var.setModel(f6Var);
        LinkedHashSet linkedHashSet = n5Var.I;
        Objects.requireNonNull(linkedHashSet);
        p5Var.setSelectionProvider(new l5.b(linkedHashSet, 14));
        n5Var.A();
        h1 h1Var = n5Var.f19769r;
        a aVar2 = n5Var.f20029a;
        if (aVar2 != null) {
            TL_iv.PageBlock pageBlock2 = aVar2.f19431b;
            if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                if (pageblocktable.title == null) {
                    pageblocktable.title = new TL_iv.textEmpty();
                }
                String l10 = d6.l(pageblocktable.title);
                SpannableStringBuilder r5 = d6.r(pageblocktable.title, null, true);
                a aVar3 = n5Var.f20029a;
                if (!aVar3.f19446s) {
                    aVar3.f19446s = true;
                    if (r5.length() != 0 && (d6.q(0, r5.length(), r5) & 1) == 0) {
                        z12 = false;
                    }
                    aVar3.f19445r = z12;
                }
                h1Var.setAutoBold(n5Var.f20029a.f19445r);
                if (z11 || !String.valueOf(h1Var.getText()).equals(l10)) {
                    h1Var.setTextSilently(i6.m(r5, h1Var.getPaint().getFontMetricsInt(), false, null, 0));
                    h1Var.f();
                }
            }
        }
        n5Var.updateColors();
        n5Var.f19772x.requestLayout();
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        n5 n5Var = new n5(context, e6Var);
        n5Var.setBackground(new z1(k6.w0(k6.f27878d6, e6Var)));
        return n5Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
