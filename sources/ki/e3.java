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
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
import org.telegram.ui.iz;
public final class e3 extends k41 {
    public static final int f18642b = 0;

    static {
        k41.h(new k41());
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        int i7;
        int i10;
        int i11;
        int i12;
        float f10;
        Object obj = l41Var.H;
        int i13 = 0;
        if (obj instanceof TL_payments.connectedBotStarRef) {
            f3 f3Var = (f3) view;
            TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
            boolean z11 = l41Var.f37024s;
            i6 i6Var = f3Var.f18656b;
            View view2 = f3Var.f18658e;
            ImageView imageView = f3Var.f18659f;
            TLRPC.User c22 = mp.u1(f3Var.f18655a).c2(Long.valueOf(connectedbotstarref.bot_id));
            b9 b9Var = new b9((i6) null);
            b9Var.r(c22);
            f3Var.f18657c.f(c22, b9Var);
            TextView textView = f3Var.h;
            textView.setText(j6.m(o10.q(c22), textView.getPaint().getFontMetricsInt(), false, null, 0));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (connectedbotstarref.commission_permille > 0) {
                spannableStringBuilder.append((CharSequence) " d");
                iz izVar = new iz();
                int i14 = n6.lk;
                izVar.f48821f = n6.w0(i14, null);
                izVar.f48823r = i14;
                izVar.f48824s = null;
                izVar.f48822n = true;
                izVar.f48825w = k.J0(connectedbotstarref.commission_permille);
                if (izVar.f48819c != null) {
                    izVar.f48819c = null;
                    izVar.a();
                }
                spannableStringBuilder.setSpan(izVar, 1, 2, 33);
            }
            int i15 = connectedbotstarref.duration_months;
            if (i15 == 0) {
                spannableStringBuilder.append((CharSequence) gd.M0(2131748794, null));
            } else if (i15 >= 12 && i15 % 12 == 0) {
                spannableStringBuilder.append((CharSequence) gd.G(i15 / 12, "Years", new Object[0]));
            } else {
                spannableStringBuilder.append((CharSequence) gd.G(i15, "Months", new Object[0]));
            }
            f3Var.f18660n.setText(spannableStringBuilder);
            ImageView imageView2 = f3Var.f18661r;
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
                i12 = 2131232208;
            } else {
                i12 = 2131232202;
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
            f3Var.f18662s = z10;
            f3Var.setWillNotDraw(!z10);
        } else if (obj instanceof TL_payments.starRefProgram) {
            f3 f3Var2 = (f3) view;
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
            boolean z12 = l41Var.f37024s;
            TLRPC.User c23 = mp.u1(f3Var2.f18655a).c2(Long.valueOf(starrefprogram.bot_id));
            b9 b9Var2 = new b9((i6) null);
            b9Var2.r(c23);
            f3Var2.f18657c.f(c23, b9Var2);
            f3Var2.h.setText(o10.q(c23));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (starrefprogram.commission_permille > 0) {
                spannableStringBuilder2.append((CharSequence) " d");
                iz izVar2 = new iz();
                int i16 = n6.lk;
                izVar2.f48821f = n6.w0(i16, null);
                izVar2.f48823r = i16;
                izVar2.f48824s = null;
                izVar2.f48822n = true;
                izVar2.f48825w = k.J0(starrefprogram.commission_permille);
                if (izVar2.f48819c != null) {
                    izVar2.f48819c = null;
                    izVar2.a();
                }
                spannableStringBuilder2.setSpan(izVar2, 1, 2, 33);
            }
            int i17 = starrefprogram.duration_months;
            if (i17 == 0) {
                spannableStringBuilder2.append((CharSequence) gd.M0(2131748794, null));
            } else if (i17 >= 12 && i17 % 12 == 0) {
                spannableStringBuilder2.append((CharSequence) gd.G(i17 / 12, "Years", new Object[0]));
            } else {
                spannableStringBuilder2.append((CharSequence) gd.G(i17, "Months", new Object[0]));
            }
            f3Var2.f18660n.setText(spannableStringBuilder2);
            ImageView imageView3 = f3Var2.f18661r;
            if (!z12) {
                i13 = 8;
            }
            imageView3.setVisibility(i13);
            f3Var2.d.setVisibility(8);
            f3Var2.f18659f.setVisibility(8);
            f3Var2.f18658e.setVisibility(8);
            f3Var2.f18662s = z10;
            f3Var2.setWillNotDraw(!z10);
        }
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, i6 i6Var) {
        return new f3(i7, context, i6Var);
    }
}
