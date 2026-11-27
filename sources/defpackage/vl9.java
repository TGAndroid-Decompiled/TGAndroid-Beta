package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Objects;
import java.util.LinkedHashSet;
import org.telegram.tgnet.tl.TL_iv;
public final class vl9 extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        boolean z2;
        xl9 xl9Var = (xl9) view;
        mk0 mk0Var = (mk0) b8cVar.H;
        xh9 xh9Var = (xh9) b8cVar.I;
        zl9 zl9Var = xl9Var.w;
        boolean z3 = true;
        if (xl9Var.a != mk0Var) {
            z2 = true;
        } else {
            z2 = false;
        }
        xl9Var.a = mk0Var;
        xl9Var.F = xh9Var;
        xl9Var.E = ob6.a0;
        xl9Var.c(mk0Var);
        TL_iv.PageBlock pageBlock = mk0Var.b;
        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
            return;
        }
        ajb ajbVar = new ajb((TL_iv.pageBlockTable) pageBlock);
        xl9Var.G = ajbVar;
        zl9Var.setModel(ajbVar);
        LinkedHashSet linkedHashSet = xl9Var.I;
        Objects.requireNonNull(linkedHashSet);
        zl9Var.setSelectionProvider(new ye9(linkedHashSet, (byte) 9));
        xl9Var.A();
        dg9 dg9Var = xl9Var.r;
        mk0 mk0Var2 = xl9Var.a;
        if (mk0Var2 != null) {
            TL_iv.PageBlock pageBlock2 = mk0Var2.b;
            if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                TL_iv.RichText richText = pageblocktable.title;
                if (richText == null) {
                    richText = new TL_iv.textEmpty();
                    pageblocktable.title = richText;
                }
                String l = mm9.l(richText);
                SpannableStringBuilder r = mm9.r(pageblocktable.title, null, true);
                mk0 mk0Var3 = xl9Var.a;
                if (!mk0Var3.s) {
                    mk0Var3.s = true;
                    if (r.length() != 0 && (mm9.q(0, r.length(), r) & 1) == 0) {
                        z3 = false;
                    }
                    mk0Var3.r = z3;
                }
                dg9Var.setAutoBold(xl9Var.a.r);
                if (z2 || !String.valueOf(dg9Var.getText()).equals(l)) {
                    dg9Var.setTextSilently(pv3.m(r, dg9Var.getPaint().getFontMetricsInt(), false, null, 0));
                    dg9Var.f();
                }
            }
        }
        xl9Var.updateColors();
        xl9Var.x.requestLayout();
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        xl9 xl9Var = new xl9(context, vnbVar);
        xl9Var.setBackground(new vg9(aob.v0(aob.d6, vnbVar)));
        return xl9Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
