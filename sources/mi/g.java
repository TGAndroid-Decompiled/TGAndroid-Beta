package mi;

import ai.o;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.z41;
import v4.q0;
public final class g extends k41 {
    public static final int f21024b = 0;

    static {
        k41.h(new k41());
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        int i7;
        String o02;
        h hVar = (h) view;
        f fVar = (f) l41Var.H;
        TLRPC.User user = fVar.f21022b;
        long j3 = fVar.f21021a;
        boolean z11 = fVar.f21023c;
        boolean z12 = !l41Var.f37015j;
        q9 q9Var = hVar.f21027c;
        TextView textView = hVar.f21030n;
        TextView textView2 = hVar.d;
        hVar.F = (e) l41Var.I;
        hVar.G = j3;
        hVar.H = user.f28554id;
        int i10 = hVar.f21026b;
        TLRPC.Chat O0 = mp.u1(i10).O0(Long.valueOf(-j3));
        TLRPC.User c22 = mp.u1(i10).c2(Long.valueOf(j3));
        hVar.f21029f.setText(n5.l(j10.f24773t0, j3));
        TextView textView3 = hVar.h;
        if (c22 != null) {
            i7 = 2131751887;
        } else if (v3.V(O0)) {
            i7 = 2131751886;
        } else {
            i7 = 2131751885;
        }
        textView3.setText(g0.Q2(gd.a0(null, null, i7, n5.u(user)), n6.Zl, null, new o(23), false));
        if (c22 != null) {
            textView2.setVisibility(8);
        } else if (O0 != null && O0.participants_count > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("* ");
            spannableStringBuilder.setSpan(hVar.f21032s, 0, 1, 33);
            long j10 = O0.participants_count;
            if (j10 < 1000000) {
                o02 = gd.E(j10, ',');
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
        hVar.f21035y = z12;
        if (c22 != null) {
            q9Var.f(c22, new b9(0, c22));
        } else {
            q9Var.f(O0, new b9(O0));
        }
        hVar.f21028e.f(user, new b9(0, user));
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, i6 i6Var) {
        h hVar = new h(i7, context, i6Var);
        hVar.setLayoutParams(new q0(-1, -2));
        hVar.setClickable(false);
        return hVar;
    }

    @Override
    public final boolean e(l41 l41Var, l41 l41Var2) {
        f fVar = (f) l41Var.H;
        f fVar2 = (f) l41Var2.H;
        if (fVar.f21021a == fVar2.f21021a && n5.d(fVar.f21022b) == n5.d(fVar2.f21022b)) {
            return true;
        }
        return false;
    }
}
