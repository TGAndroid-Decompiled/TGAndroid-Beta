package oi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Objects;
import java.util.LinkedHashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.j6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
public final class j5 extends k41 {
    public static final int f22128b = 0;

    static {
        k41.h(new k41());
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        boolean z11;
        l5 l5Var = (l5) view;
        a aVar = (a) l41Var.H;
        a3 a3Var = (a3) l41Var.I;
        n5 n5Var = l5Var.f22168w;
        boolean z12 = true;
        if (l5Var.f22442a != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        l5Var.f22442a = aVar;
        l5Var.F = a3Var;
        l5Var.E = gd.f24216a0;
        l5Var.c(aVar);
        TL_iv.PageBlock pageBlock = aVar.f21910b;
        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
            return;
        }
        d6 d6Var = new d6((TL_iv.pageBlockTable) pageBlock);
        l5Var.G = d6Var;
        n5Var.setModel(d6Var);
        LinkedHashSet linkedHashSet = l5Var.I;
        Objects.requireNonNull(linkedHashSet);
        n5Var.setSelectionProvider(new ki.e(linkedHashSet, 26));
        l5Var.A();
        e1 e1Var = l5Var.f22166r;
        a aVar2 = l5Var.f22442a;
        if (aVar2 != null) {
            TL_iv.PageBlock pageBlock2 = aVar2.f21910b;
            if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                if (pageblocktable.title == null) {
                    pageblocktable.title = new TL_iv.textEmpty();
                }
                String l10 = b6.l(pageblocktable.title);
                SpannableStringBuilder r10 = b6.r(pageblocktable.title, null, true);
                a aVar3 = l5Var.f22442a;
                if (!aVar3.f21925s) {
                    aVar3.f21925s = true;
                    if (r10.length() != 0 && (b6.q(0, r10.length(), r10) & 1) == 0) {
                        z12 = false;
                    }
                    aVar3.f21924r = z12;
                }
                e1Var.setAutoBold(l5Var.f22442a.f21924r);
                if (z11 || !String.valueOf(e1Var.getText()).equals(l10)) {
                    e1Var.setTextSilently(j6.m(r10, e1Var.getPaint().getFontMetricsInt(), false, null, 0));
                    e1Var.f();
                }
            }
        }
        l5Var.updateColors();
        l5Var.f22169x.requestLayout();
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, i6 i6Var) {
        l5 l5Var = new l5(context, i6Var);
        l5Var.setBackground(new w1(n6.w0(n6.f29396d6, i6Var)));
        return l5Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
