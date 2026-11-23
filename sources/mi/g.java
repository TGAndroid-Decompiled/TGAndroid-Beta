package mi;

import ai.k;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.p9;
import v4.q0;
public final class g extends m41 {
    public static final int f21114b = 0;

    static {
        m41.h(new m41());
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        int i7;
        String o02;
        h hVar = (h) view;
        f fVar = (f) n41Var.H;
        TLRPC.User user = fVar.f21112b;
        long j3 = fVar.f21111a;
        boolean z11 = fVar.f21113c;
        boolean z12 = !n41Var.f37652j;
        p9 p9Var = hVar.f21117c;
        TextView textView = hVar.f21120n;
        TextView textView2 = hVar.d;
        hVar.F = (e) n41Var.I;
        hVar.G = j3;
        hVar.H = user.f28641id;
        int i10 = hVar.f21116b;
        TLRPC.Chat O0 = mp.u1(i10).O0(Long.valueOf(-j3));
        TLRPC.User c22 = mp.u1(i10).c2(Long.valueOf(j3));
        hVar.f21119f.setText(n5.l(i10.f24637t0, j3));
        TextView textView3 = hVar.h;
        if (c22 != null) {
            i7 = 2131751886;
        } else if (v3.V(O0)) {
            i7 = 2131751885;
        } else {
            i7 = 2131751884;
        }
        textView3.setText(g0.Q2(gd.a0(null, null, i7, n5.u(user)), n6.Zl, null, new k(23), false));
        if (c22 != null) {
            textView2.setVisibility(8);
        } else if (O0 != null && O0.participants_count > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("* ");
            spannableStringBuilder.setSpan(hVar.f21122s, 0, 1, 33);
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
        hVar.f21125y = z12;
        if (c22 != null) {
            p9Var.f(c22, new a9(0, c22));
        } else {
            p9Var.f(O0, new a9(O0));
        }
        hVar.f21118e.f(user, new a9(0, user));
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, i6 i6Var) {
        h hVar = new h(i7, context, i6Var);
        hVar.setLayoutParams(new q0(-1, -2));
        hVar.setClickable(false);
        return hVar;
    }

    @Override
    public final boolean e(n41 n41Var, n41 n41Var2) {
        f fVar = (f) n41Var.H;
        f fVar2 = (f) n41Var2.H;
        if (fVar.f21111a == fVar2.f21111a && n5.d(fVar.f21112b) == n5.d(fVar2.f21112b)) {
            return true;
        }
        return false;
    }
}
