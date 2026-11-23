package mi;

import ai.n;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.n5;
import org.telegram.messenger.np;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.q9;
import v4.q0;
public final class g extends n41 {
    public static final int f21052b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        int i7;
        String o02;
        h hVar = (h) view;
        f fVar = (f) o41Var.H;
        TLRPC.User user = fVar.f21050b;
        long j3 = fVar.f21049a;
        boolean z11 = fVar.f21051c;
        boolean z12 = !o41Var.f38088j;
        q9 q9Var = hVar.f21055c;
        TextView textView = hVar.f21058n;
        TextView textView2 = hVar.d;
        hVar.F = (e) o41Var.I;
        hVar.G = j3;
        hVar.H = user.f28583id;
        int i10 = hVar.f21054b;
        TLRPC.Chat O0 = np.u1(i10).O0(Long.valueOf(-j3));
        TLRPC.User c22 = np.u1(i10).c2(Long.valueOf(j3));
        hVar.f21057f.setText(n5.l(k10.f24968t0, j3));
        TextView textView3 = hVar.h;
        if (c22 != null) {
            i7 = 2131751886;
        } else if (v3.V(O0)) {
            i7 = 2131751885;
        } else {
            i7 = 2131751884;
        }
        textView3.setText(g0.Q2(hd.a0(null, null, i7, n5.u(user)), m6.Zl, null, new n(23), false));
        if (c22 != null) {
            textView2.setVisibility(8);
        } else if (O0 != null && O0.participants_count > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("* ");
            spannableStringBuilder.setSpan(hVar.f21060s, 0, 1, 33);
            long j10 = O0.participants_count;
            if (j10 < 1000000) {
                o02 = hd.E(j10, ',');
            } else {
                o02 = g0.o0((int) j10, 1000000);
            }
            spannableStringBuilder.append((CharSequence) o02);
            textView2.setText(spannableStringBuilder);
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
        if (z11) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        hVar.f21063y = z12;
        if (c22 != null) {
            q9Var.f(c22, new b9(0, c22));
        } else {
            q9Var.f(O0, new b9(O0));
        }
        hVar.f21056e.f(user, new b9(0, user));
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, h6 h6Var) {
        h hVar = new h(i7, context, h6Var);
        hVar.setLayoutParams(new q0(-1, -2));
        hVar.setClickable(false);
        return hVar;
    }

    @Override
    public final boolean e(o41 o41Var, o41 o41Var2) {
        f fVar = (f) o41Var.H;
        f fVar2 = (f) o41Var2.H;
        if (fVar.f21049a == fVar2.f21049a && n5.d(fVar.f21050b) == n5.d(fVar2.f21050b)) {
            return true;
        }
        return false;
    }
}
