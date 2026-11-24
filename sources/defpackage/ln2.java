package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class ln2 extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        int i;
        String o0;
        mn2 mn2Var = (mn2) view;
        kn2 kn2Var = (kn2) c4cVar.H;
        TLRPC.User user = kn2Var.b;
        long j = kn2Var.a;
        boolean z2 = kn2Var.c;
        boolean z3 = !c4cVar.j;
        int i2 = mn2.I;
        TextView textView = mn2Var.d;
        mn2Var.F = (jn2) c4cVar.I;
        mn2Var.G = j;
        mn2Var.H = user.id;
        int i3 = mn2Var.b;
        TLRPC.Chat K0 = na7.q1(i3).K0(Long.valueOf(-j));
        TLRPC.User V1 = na7.q1(i3).V1(Long.valueOf(j));
        mn2Var.f.setText(cf3.k(y6c.t0, j));
        TextView textView2 = mn2Var.h;
        if (V1 != null) {
            i = 2131751886;
        } else if (hc2.V(K0)) {
            i = 2131751885;
        } else {
            i = 2131751884;
        }
        textView2.setText(gl.M2(k96.a0(null, null, i, cf3.t(user)), bkb.Yl, null, new jc((byte) 10), false));
        if (V1 != null) {
            textView.setVisibility(8);
        } else if (K0 != null && K0.participants_count > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("* ");
            spannableStringBuilder.setSpan(mn2Var.s, 0, 1, 33);
            long j2 = K0.participants_count;
            if (j2 < 1000000) {
                o0 = k96.E(j2, ',');
            } else {
                o0 = gl.o0((int) j2, 1000000);
            }
            spannableStringBuilder.append((CharSequence) o0);
            textView.setText(spannableStringBuilder);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        TextView textView3 = mn2Var.n;
        if (z2) {
            textView3.setVisibility(0);
        } else {
            textView3.setVisibility(8);
        }
        mn2Var.y = z3;
        be0 be0Var = mn2Var.c;
        if (V1 != null) {
            be0Var.f(V1, new pb0(0, V1));
        } else {
            be0Var.f(K0, new pb0(K0));
        }
        mn2Var.e.f(user, new pb0(0, user));
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        mn2 mn2Var = new mn2(i, wjbVar, context);
        mn2Var.setLayoutParams(new e49(-1, -2));
        mn2Var.setClickable(false);
        return mn2Var;
    }

    @Override
    public final boolean e(c4c c4cVar, c4c c4cVar2) {
        kn2 kn2Var = (kn2) c4cVar.H;
        kn2 kn2Var2 = (kn2) c4cVar2.H;
        if (kn2Var.a == kn2Var2.a && cf3.d(kn2Var.b) == cf3.d(kn2Var2.b)) {
            return true;
        }
        return false;
    }
}
