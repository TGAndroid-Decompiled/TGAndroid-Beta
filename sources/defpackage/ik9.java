package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Objects;
import java.util.LinkedHashSet;
import org.telegram.tgnet.tl.TL_iv;
public final class ik9 extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        boolean z2;
        kk9 kk9Var = (kk9) view;
        ll0 ll0Var = (ll0) c6cVar.H;
        kg9 kg9Var = (kg9) c6cVar.I;
        mk9 mk9Var = kk9Var.w;
        boolean z3 = true;
        if (kk9Var.a != ll0Var) {
            z2 = true;
        } else {
            z2 = false;
        }
        kk9Var.a = ll0Var;
        kk9Var.F = kg9Var;
        kk9Var.E = jb6.a0;
        kk9Var.c(ll0Var);
        TL_iv.PageBlock pageBlock = ll0Var.b;
        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
            return;
        }
        fhb fhbVar = new fhb((TL_iv.pageBlockTable) pageBlock);
        kk9Var.G = fhbVar;
        mk9Var.setModel(fhbVar);
        LinkedHashSet linkedHashSet = kk9Var.I;
        Objects.requireNonNull(linkedHashSet);
        mk9Var.setSelectionProvider(new yf9(linkedHashSet, (byte) 6));
        kk9Var.B();
        ne9 ne9Var = kk9Var.r;
        ll0 ll0Var2 = kk9Var.a;
        if (ll0Var2 != null) {
            TL_iv.PageBlock pageBlock2 = ll0Var2.b;
            if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                TL_iv.RichText richText = pageblocktable.title;
                if (richText == null) {
                    richText = new TL_iv.textEmpty();
                    pageblocktable.title = richText;
                }
                String l = zk9.l(richText);
                SpannableStringBuilder r = zk9.r(pageblocktable.title, null, true);
                ll0 ll0Var3 = kk9Var.a;
                if (!ll0Var3.s) {
                    ll0Var3.s = true;
                    if (r.length() != 0 && (zk9.q(0, r.length(), r) & 1) == 0) {
                        z3 = false;
                    }
                    ll0Var3.r = z3;
                }
                ne9Var.setAutoBold(kk9Var.a.r);
                if (z2 || !String.valueOf(ne9Var.getText()).equals(l)) {
                    ne9Var.setTextSilently(gw3.m(r, ne9Var.getPaint().getFontMetricsInt(), false, null, 0));
                    ne9Var.f();
                }
            }
        }
        kk9Var.updateColors();
        kk9Var.x.requestLayout();
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        kk9 kk9Var = new kk9(context, ylbVar);
        kk9Var.setBackground(new gf9(cmb.v0(cmb.c6, ylbVar)));
        return kk9Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
