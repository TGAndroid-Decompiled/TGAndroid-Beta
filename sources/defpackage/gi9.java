package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Objects;
import java.util.LinkedHashSet;
import org.telegram.tgnet.tl.TL_iv;
public final class gi9 extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        boolean z2;
        ii9 ii9Var = (ii9) view;
        lk0 lk0Var = (lk0) c4cVar.H;
        ge9 ge9Var = (ge9) c4cVar.I;
        ki9 ki9Var = ii9Var.w;
        boolean z3 = true;
        if (ii9Var.a != lk0Var) {
            z2 = true;
        } else {
            z2 = false;
        }
        ii9Var.a = lk0Var;
        ii9Var.F = ge9Var;
        ii9Var.E = k96.a0;
        ii9Var.c(lk0Var);
        TL_iv.PageBlock pageBlock = lk0Var.b;
        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
            return;
        }
        ffb ffbVar = new ffb((TL_iv.pageBlockTable) pageBlock);
        ii9Var.G = ffbVar;
        ki9Var.setModel(ffbVar);
        LinkedHashSet linkedHashSet = ii9Var.I;
        Objects.requireNonNull(linkedHashSet);
        ki9Var.setSelectionProvider(new wh9(linkedHashSet, (byte) 2));
        ii9Var.A();
        mc9 mc9Var = ii9Var.r;
        lk0 lk0Var2 = ii9Var.a;
        if (lk0Var2 != null) {
            TL_iv.PageBlock pageBlock2 = lk0Var2.b;
            if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                TL_iv.RichText richText = pageblocktable.title;
                if (richText == null) {
                    richText = new TL_iv.textEmpty();
                    pageblocktable.title = richText;
                }
                String l = yi9.l(richText);
                SpannableStringBuilder r = yi9.r(pageblocktable.title, null, true);
                lk0 lk0Var3 = ii9Var.a;
                if (!lk0Var3.s) {
                    lk0Var3.s = true;
                    if (r.length() != 0 && (yi9.q(0, r.length(), r) & 1) == 0) {
                        z3 = false;
                    }
                    lk0Var3.r = z3;
                }
                mc9Var.setAutoBold(ii9Var.a.r);
                if (z2 || !String.valueOf(mc9Var.getText()).equals(l)) {
                    mc9Var.setTextSilently(vu3.m(r, mc9Var.getPaint().getFontMetricsInt(), false, null, 0));
                    mc9Var.f();
                }
            }
        }
        ii9Var.updateColors();
        ii9Var.x.requestLayout();
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        ii9 ii9Var = new ii9(context, wjbVar);
        ii9Var.setBackground(new ed9(bkb.v0(bkb.c6, wjbVar)));
        return ii9Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
