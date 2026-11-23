package ki;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.messenger.j6;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.hz;
public final class e3 extends m41 {
    public static final int f18735b = 0;

    static {
        m41.h(new m41());
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        int i7;
        int i10;
        int i11;
        int i12;
        float f10;
        Object obj = n41Var.H;
        int i13 = 0;
        if (obj instanceof TL_payments.connectedBotStarRef) {
            f3 f3Var = (f3) view;
            TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
            boolean z11 = n41Var.f37661s;
            i6 i6Var = f3Var.f18760b;
            View view2 = f3Var.f18762e;
            ImageView imageView = f3Var.f18763f;
            TLRPC.User c22 = mp.u1(f3Var.f18759a).c2(Long.valueOf(connectedbotstarref.bot_id));
            a9 a9Var = new a9((i6) null);
            a9Var.r(c22);
            f3Var.f18761c.f(c22, a9Var);
            TextView textView = f3Var.h;
            textView.setText(j6.m(n10.q(c22), textView.getPaint().getFontMetricsInt(), false, null, 0));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (connectedbotstarref.commission_permille > 0) {
                spannableStringBuilder.append((CharSequence) " d");
                hz hzVar = new hz();
                int i14 = n6.lk;
                hzVar.f48668f = n6.w0(i14, null);
                hzVar.f48670r = i14;
                hzVar.f48671s = null;
                hzVar.f48669n = true;
                hzVar.f48672w = j.J0(connectedbotstarref.commission_permille);
                if (hzVar.f48666c != null) {
                    hzVar.f48666c = null;
                    hzVar.a();
                }
                spannableStringBuilder.setSpan(hzVar, 1, 2, 33);
            }
            int i15 = connectedbotstarref.duration_months;
            if (i15 == 0) {
                spannableStringBuilder.append((CharSequence) gd.N0(2131748793, null));
            } else if (i15 >= 12 && i15 % 12 == 0) {
                spannableStringBuilder.append((CharSequence) gd.G(i15 / 12, "Years", new Object[0]));
            } else {
                spannableStringBuilder.append((CharSequence) gd.G(i15, "Months", new Object[0]));
            }
            f3Var.f18764n.setText(spannableStringBuilder);
            ImageView imageView2 = f3Var.f18765r;
            if (z11) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            imageView2.setVisibility(i7);
            f3Var.d.setVisibility(0);
            imageView.setVisibility(0);
            view2.setVisibility(0);
            int L = org.telegram.messenger.g0.L(9.665f);
            if (connectedbotstarref.revoked) {
                i10 = n6.nk;
            } else {
                i10 = n6.lk;
            }
            ShapeDrawable L2 = n6.L(L, n6.w0(i10, i6Var));
            if (connectedbotstarref.revoked) {
                i11 = n6.nk;
            } else {
                i11 = n6.lk;
            }
            q6 M = u6.M(i11);
            view2.setBackground(L2);
            u6.j(view2, L2, M, null, i6Var);
            if (connectedbotstarref.revoked) {
                i12 = 2131232211;
            } else {
                i12 = 2131232205;
            }
            imageView.setImageResource(i12);
            float f11 = 0.6f;
            if (connectedbotstarref.revoked) {
                f10 = 0.8f;
            } else {
                f10 = 0.6f;
            }
            imageView.setScaleX(f10);
            if (connectedbotstarref.revoked) {
                f11 = 0.8f;
            }
            imageView.setScaleY(f11);
            f3Var.f18766s = z10;
            f3Var.setWillNotDraw(!z10);
        } else if (obj instanceof TL_payments.starRefProgram) {
            f3 f3Var2 = (f3) view;
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
            boolean z12 = n41Var.f37661s;
            TLRPC.User c23 = mp.u1(f3Var2.f18759a).c2(Long.valueOf(starrefprogram.bot_id));
            a9 a9Var2 = new a9((i6) null);
            a9Var2.r(c23);
            f3Var2.f18761c.f(c23, a9Var2);
            f3Var2.h.setText(n10.q(c23));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (starrefprogram.commission_permille > 0) {
                spannableStringBuilder2.append((CharSequence) " d");
                hz hzVar2 = new hz();
                int i16 = n6.lk;
                hzVar2.f48668f = n6.w0(i16, null);
                hzVar2.f48670r = i16;
                hzVar2.f48671s = null;
                hzVar2.f48669n = true;
                hzVar2.f48672w = j.J0(starrefprogram.commission_permille);
                if (hzVar2.f48666c != null) {
                    hzVar2.f48666c = null;
                    hzVar2.a();
                }
                spannableStringBuilder2.setSpan(hzVar2, 1, 2, 33);
            }
            int i17 = starrefprogram.duration_months;
            if (i17 == 0) {
                spannableStringBuilder2.append((CharSequence) gd.N0(2131748793, null));
            } else if (i17 >= 12 && i17 % 12 == 0) {
                spannableStringBuilder2.append((CharSequence) gd.G(i17 / 12, "Years", new Object[0]));
            } else {
                spannableStringBuilder2.append((CharSequence) gd.G(i17, "Months", new Object[0]));
            }
            f3Var2.f18764n.setText(spannableStringBuilder2);
            ImageView imageView3 = f3Var2.f18765r;
            if (!z12) {
                i13 = 8;
            }
            imageView3.setVisibility(i13);
            f3Var2.d.setVisibility(8);
            f3Var2.f18763f.setVisibility(8);
            f3Var2.f18762e.setVisibility(8);
            f3Var2.f18766s = z10;
            f3Var2.setWillNotDraw(!z10);
        }
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, i6 i6Var) {
        return new f3(i7, context, i6Var);
    }
}
