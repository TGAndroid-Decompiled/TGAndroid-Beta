package ji;

import ai.m0;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.x31;
import v4.o0;
public final class g extends w31 {
    public static final int f17086b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        int i7;
        String o02;
        h hVar = (h) view;
        f fVar = (f) x31Var.G;
        TLRPC.User user = fVar.f17084b;
        long j3 = fVar.f17083a;
        boolean z10 = fVar.f17085c;
        boolean z11 = !x31Var.f40178j;
        l9 l9Var = hVar.f17089c;
        TextView textView = hVar.f17092n;
        TextView textView2 = hVar.d;
        hVar.E = (e) x31Var.H;
        hVar.F = j3;
        hVar.G = user.f27105id;
        int i10 = hVar.f17088b;
        TLRPC.Chat M0 = qp.s1(i10).M0(Long.valueOf(-j3));
        TLRPC.User a22 = qp.s1(i10).a2(Long.valueOf(j3));
        hVar.f17091f.setText(m5.l(p10.f24470s0, j3));
        TextView textView3 = hVar.h;
        if (a22 != null) {
            i7 = 2131751898;
        } else if (t3.V(M0)) {
            i7 = 2131751897;
        } else {
            i7 = 2131751896;
        }
        textView3.setText(g0.Q2(id.a0(null, null, i7, m5.u(user)), k6.Wl, null, new m0(16), false));
        if (a22 != null) {
            textView2.setVisibility(8);
        } else if (M0 != null && M0.participants_count > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("* ");
            spannableStringBuilder.setSpan(hVar.f17094s, 0, 1, 33);
            long j10 = M0.participants_count;
            if (j10 < 1000000) {
                o02 = id.E(j10, ',');
            } else {
                o02 = g0.o0((int) j10, 1000000);
            }
            spannableStringBuilder.append((CharSequence) o02);
            textView2.setText(spannableStringBuilder);
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
        if (z10) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        hVar.f17097y = z11;
        if (a22 != null) {
            l9Var.e(a22, new w8(0, a22));
        } else {
            l9Var.e(M0, new w8(M0));
        }
        hVar.f17090e.e(user, new w8(0, user));
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        h hVar = new h(i7, context, f6Var);
        hVar.setLayoutParams(new o0(-1, -2));
        hVar.setClickable(false);
        return hVar;
    }

    @Override
    public final boolean e(x31 x31Var, x31 x31Var2) {
        f fVar = (f) x31Var.G;
        f fVar2 = (f) x31Var2.G;
        if (fVar.f17083a == fVar2.f17083a && m5.d(fVar.f17084b) == m5.d(fVar2.f17084b)) {
            return true;
        }
        return false;
    }
}
