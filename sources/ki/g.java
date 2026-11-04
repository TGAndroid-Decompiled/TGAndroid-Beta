package ki;

import ai.y1;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.m5;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.u8;
import u4.p0;
public final class g extends q31 {
    public static final int f17328b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        int i3;
        String o02;
        h hVar = (h) view;
        f fVar = (f) r31Var.G;
        TLRPC.User user = fVar.f17326b;
        long j10 = fVar.f17325a;
        boolean z11 = fVar.f17327c;
        boolean z12 = !r31Var.f37625j;
        k9 k9Var = hVar.f17331c;
        TextView textView = hVar.f17334n;
        TextView textView2 = hVar.d;
        hVar.F = (e) r31Var.H;
        hVar.G = j10;
        hVar.H = user.f27150id;
        int i10 = hVar.f17330b;
        TLRPC.Chat M0 = hp.s1(i10).M0(Long.valueOf(-j10));
        TLRPC.User a22 = hp.s1(i10).a2(Long.valueOf(j10));
        hVar.f17333f.setText(m5.l(h10.f22829t0, j10));
        TextView textView3 = hVar.h;
        if (a22 != null) {
            i3 = 2131751898;
        } else if (t3.V(M0)) {
            i3 = 2131751897;
        } else {
            i3 = 2131751896;
        }
        textView3.setText(g0.Q2(bd.a0(null, null, i3, m5.u(user)), k6.Wl, null, new y1(20), false));
        if (a22 != null) {
            textView2.setVisibility(8);
        } else if (M0 != null && M0.participants_count > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("* ");
            spannableStringBuilder.setSpan(hVar.f17336s, 0, 1, 33);
            long j11 = M0.participants_count;
            if (j11 < 1000000) {
                o02 = bd.E(j11, ',');
            } else {
                o02 = g0.o0((int) j11, 1000000);
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
        hVar.f17339y = z12;
        if (a22 != null) {
            k9Var.e(a22, new u8(0, a22));
        } else {
            k9Var.e(M0, new u8(M0));
        }
        hVar.f17332e.e(user, new u8(0, user));
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, e6 e6Var) {
        h hVar = new h(i3, context, e6Var);
        hVar.setLayoutParams(new p0(-1, -2));
        hVar.setClickable(false);
        return hVar;
    }

    @Override
    public final boolean e(r31 r31Var, r31 r31Var2) {
        f fVar = (f) r31Var.G;
        f fVar2 = (f) r31Var2.G;
        if (fVar.f17325a == fVar2.f17325a && m5.d(fVar.f17326b) == m5.d(fVar2.f17326b)) {
            return true;
        }
        return false;
    }
}
