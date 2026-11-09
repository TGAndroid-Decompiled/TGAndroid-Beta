package hi;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.i6;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;
import org.telegram.ui.gz;
public final class m3 extends x31 {
    public static final int f14798b = 0;

    static {
        x31.h(new x31());
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        int i7;
        int i10;
        int i11;
        int i12;
        float f10;
        Object obj = y31Var.G;
        int i13 = 0;
        if (obj instanceof TL_payments.connectedBotStarRef) {
            n3 n3Var = (n3) view;
            TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
            boolean z10 = y31Var.f40574r;
            g6 g6Var = n3Var.f14816b;
            View view2 = n3Var.f14818e;
            ImageView imageView = n3Var.f14819f;
            TLRPC.User a22 = qp.s1(n3Var.f14815a).a2(Long.valueOf(connectedbotstarref.bot_id));
            w8 w8Var = new w8((g6) null);
            w8Var.r(a22);
            n3Var.f14817c.e(a22, w8Var);
            TextView textView = n3Var.h;
            textView.setText(i6.m(t10.p(a22), textView.getPaint().getFontMetricsInt(), false, null, 0));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (connectedbotstarref.commission_permille > 0) {
                spannableStringBuilder.append((CharSequence) " d");
                gz gzVar = new gz();
                int i14 = l6.ik;
                gzVar.f46100f = l6.w0(i14, null);
                gzVar.f46102r = i14;
                gzVar.f46103s = null;
                gzVar.f46101n = true;
                gzVar.f46104w = j.J0(connectedbotstarref.commission_permille);
                if (gzVar.f46098c != null) {
                    gzVar.f46098c = null;
                    gzVar.a();
                }
                spannableStringBuilder.setSpan(gzVar, 1, 2, 33);
            }
            int i15 = connectedbotstarref.duration_months;
            if (i15 == 0) {
                spannableStringBuilder.append((CharSequence) id.M0(2131748986, null));
            } else if (i15 >= 12 && i15 % 12 == 0) {
                spannableStringBuilder.append((CharSequence) id.G(i15 / 12, "Years", new Object[0]));
            } else {
                spannableStringBuilder.append((CharSequence) id.G(i15, "Months", new Object[0]));
            }
            n3Var.f14820n.setText(spannableStringBuilder);
            ImageView imageView2 = n3Var.f14821r;
            if (z10) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            imageView2.setVisibility(i7);
            n3Var.d.setVisibility(0);
            imageView.setVisibility(0);
            view2.setVisibility(0);
            int L = org.telegram.messenger.g0.L(9.665f);
            if (connectedbotstarref.revoked) {
                i10 = l6.kk;
            } else {
                i10 = l6.ik;
            }
            ShapeDrawable L2 = l6.L(L, l6.w0(i10, g6Var));
            if (connectedbotstarref.revoked) {
                i11 = l6.kk;
            } else {
                i11 = l6.ik;
            }
            o6 M = s6.M(i11);
            view2.setBackground(L2);
            s6.j(view2, L2, M, null, g6Var);
            if (connectedbotstarref.revoked) {
                i12 = 2131232206;
            } else {
                i12 = 2131232200;
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
            n3Var.f14822s = z9;
            n3Var.setWillNotDraw(!z9);
        } else if (obj instanceof TL_payments.starRefProgram) {
            n3 n3Var2 = (n3) view;
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
            boolean z11 = y31Var.f40574r;
            TLRPC.User a23 = qp.s1(n3Var2.f14815a).a2(Long.valueOf(starrefprogram.bot_id));
            w8 w8Var2 = new w8((g6) null);
            w8Var2.r(a23);
            n3Var2.f14817c.e(a23, w8Var2);
            n3Var2.h.setText(t10.p(a23));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (starrefprogram.commission_permille > 0) {
                spannableStringBuilder2.append((CharSequence) " d");
                gz gzVar2 = new gz();
                int i16 = l6.ik;
                gzVar2.f46100f = l6.w0(i16, null);
                gzVar2.f46102r = i16;
                gzVar2.f46103s = null;
                gzVar2.f46101n = true;
                gzVar2.f46104w = j.J0(starrefprogram.commission_permille);
                if (gzVar2.f46098c != null) {
                    gzVar2.f46098c = null;
                    gzVar2.a();
                }
                spannableStringBuilder2.setSpan(gzVar2, 1, 2, 33);
            }
            int i17 = starrefprogram.duration_months;
            if (i17 == 0) {
                spannableStringBuilder2.append((CharSequence) id.M0(2131748986, null));
            } else if (i17 >= 12 && i17 % 12 == 0) {
                spannableStringBuilder2.append((CharSequence) id.G(i17 / 12, "Years", new Object[0]));
            } else {
                spannableStringBuilder2.append((CharSequence) id.G(i17, "Months", new Object[0]));
            }
            n3Var2.f14820n.setText(spannableStringBuilder2);
            ImageView imageView3 = n3Var2.f14821r;
            if (!z11) {
                i13 = 8;
            }
            imageView3.setVisibility(i13);
            n3Var2.d.setVisibility(8);
            n3Var2.f14819f.setVisibility(8);
            n3Var2.f14818e.setVisibility(8);
            n3Var2.f14822s = z9;
            n3Var2.setWillNotDraw(!z9);
        }
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, g6 g6Var) {
        return new n3(i7, context, g6Var);
    }
}
