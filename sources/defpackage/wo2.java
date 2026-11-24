package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class wo2 extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        int i;
        String o0;
        xo2 xo2Var = (xo2) view;
        vo2 vo2Var = (vo2) c6cVar.H;
        TLRPC.User user = vo2Var.b;
        long j = vo2Var.a;
        boolean z2 = vo2Var.c;
        boolean z3 = !c6cVar.j;
        int i2 = xo2.I;
        TextView textView = xo2Var.d;
        xo2Var.F = (uo2) c6cVar.I;
        xo2Var.G = j;
        xo2Var.H = user.id;
        int i3 = xo2Var.b;
        TLRPC.Chat L0 = oc7.r1(i3).L0(Long.valueOf(-j));
        TLRPC.User W1 = oc7.r1(i3).W1(Long.valueOf(j));
        xo2Var.f.setText(pg3.k(z8c.t0, j));
        TextView textView2 = xo2Var.h;
        if (W1 != null) {
            i = 2131751835;
        } else if (sd2.V(L0)) {
            i = 2131751834;
        } else {
            i = 2131751833;
        }
        textView2.setText(gm.M2(jb6.a0(null, null, i, pg3.t(user)), cmb.Yl, null, new jd((byte) 10), false));
        if (W1 != null) {
            textView.setVisibility(8);
        } else if (L0 != null && L0.participants_count > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("* ");
            spannableStringBuilder.setSpan(xo2Var.s, 0, 1, 33);
            long j2 = L0.participants_count;
            if (j2 < 1000000) {
                o0 = jb6.E(j2, ',');
            } else {
                o0 = gm.o0((int) j2, 1000000);
            }
            spannableStringBuilder.append((CharSequence) o0);
            textView.setText(spannableStringBuilder);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        TextView textView3 = xo2Var.n;
        if (z2) {
            textView3.setVisibility(0);
        } else {
            textView3.setVisibility(8);
        }
        xo2Var.y = z3;
        bf0 bf0Var = xo2Var.c;
        if (W1 != null) {
            bf0Var.f(W1, new pc0(0, W1));
        } else {
            bf0Var.f(L0, new pc0(L0));
        }
        xo2Var.e.f(user, new pc0(0, user));
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        xo2 xo2Var = new xo2(i, ylbVar, context);
        xo2Var.setLayoutParams(new g69(-1, -2));
        xo2Var.setClickable(false);
        return xo2Var;
    }

    @Override
    public final boolean e(c6c c6cVar, c6c c6cVar2) {
        vo2 vo2Var = (vo2) c6cVar.H;
        vo2 vo2Var2 = (vo2) c6cVar2.H;
        if (vo2Var.a == vo2Var2.a && pg3.d(vo2Var.b) == pg3.d(vo2Var2.b)) {
            return true;
        }
        return false;
    }
}
