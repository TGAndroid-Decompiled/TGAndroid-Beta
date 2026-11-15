package mi;

import ai.o;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
import v4.p0;
public final class g extends a41 {
    public static final int f20660b = 0;

    static {
        a41.h(new a41());
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        int i7;
        String o02;
        h hVar = (h) view;
        f fVar = (f) b41Var.G;
        TLRPC.User user = fVar.f20658b;
        long j3 = fVar.f20657a;
        boolean z11 = fVar.f20659c;
        boolean z12 = !b41Var.f33182j;
        i9 i9Var = hVar.f20663c;
        TextView textView = hVar.f20666n;
        TextView textView2 = hVar.d;
        hVar.F = (e) b41Var.H;
        hVar.G = j3;
        hVar.H = user.f28200id;
        int i10 = hVar.f20662b;
        TLRPC.Chat M0 = np.s1(i10).M0(Long.valueOf(-j3));
        TLRPC.User a22 = np.s1(i10).a2(Long.valueOf(j3));
        hVar.f20665f.setText(m5.l(m10.f24940t0, j3));
        TextView textView3 = hVar.h;
        if (a22 != null) {
            i7 = 2131751898;
        } else if (t3.V(M0)) {
            i7 = 2131751897;
        } else {
            i7 = 2131751896;
        }
        textView3.setText(g0.Q2(hd.a0(null, null, i7, m5.u(user)), j6.Zl, null, new o(21), false));
        if (a22 != null) {
            textView2.setVisibility(8);
        } else if (M0 != null && M0.participants_count > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("* ");
            spannableStringBuilder.setSpan(hVar.f20668s, 0, 1, 33);
            long j10 = M0.participants_count;
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
        hVar.f20671y = z12;
        if (a22 != null) {
            i9Var.f(a22, new t8(0, a22));
        } else {
            i9Var.f(M0, new t8(M0));
        }
        hVar.f20664e.f(user, new t8(0, user));
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, e6 e6Var) {
        h hVar = new h(i7, context, e6Var);
        hVar.setLayoutParams(new p0(-1, -2));
        hVar.setClickable(false);
        return hVar;
    }

    @Override
    public final boolean e(b41 b41Var, b41 b41Var2) {
        f fVar = (f) b41Var.G;
        f fVar2 = (f) b41Var2.G;
        if (fVar.f20657a == fVar2.f20657a && m5.d(fVar.f20658b) == m5.d(fVar2.f20658b)) {
            return true;
        }
        return false;
    }
}
