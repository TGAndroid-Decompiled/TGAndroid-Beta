package hi;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.i6;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.w8;
import org.telegram.ui.ez;
public final class m3 extends v31 {
    public static final int f14795b = 0;

    static {
        v31.h(new v31());
    }

    @Override
    public final void b(View view, w31 w31Var, boolean z9, k41 k41Var, p41 p41Var) {
        int i7;
        int i10;
        int i11;
        int i12;
        float f10;
        Object obj = w31Var.G;
        int i13 = 0;
        if (obj instanceof TL_payments.connectedBotStarRef) {
            n3 n3Var = (n3) view;
            TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
            boolean z10 = w31Var.f39836r;
            f6 f6Var = n3Var.f14813b;
            View view2 = n3Var.f14815e;
            ImageView imageView = n3Var.f14816f;
            TLRPC.User a22 = qp.s1(n3Var.f14812a).a2(Long.valueOf(connectedbotstarref.bot_id));
            w8 w8Var = new w8((f6) null);
            w8Var.r(a22);
            n3Var.f14814c.e(a22, w8Var);
            TextView textView = n3Var.h;
            textView.setText(i6.m(t10.p(a22), textView.getPaint().getFontMetricsInt(), false, null, 0));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (connectedbotstarref.commission_permille > 0) {
                spannableStringBuilder.append((CharSequence) " d");
                ez ezVar = new ez();
                int i14 = k6.ik;
                ezVar.f45443f = k6.w0(i14, null);
                ezVar.f45445r = i14;
                ezVar.f45446s = null;
                ezVar.f45444n = true;
                ezVar.f45447w = j.J0(connectedbotstarref.commission_permille);
                if (ezVar.f45441c != null) {
                    ezVar.f45441c = null;
                    ezVar.a();
                }
                spannableStringBuilder.setSpan(ezVar, 1, 2, 33);
            }
            int i15 = connectedbotstarref.duration_months;
            if (i15 == 0) {
                spannableStringBuilder.append((CharSequence) hd.M0(2131748985, null));
            } else if (i15 >= 12 && i15 % 12 == 0) {
                spannableStringBuilder.append((CharSequence) hd.G(i15 / 12, "Years", new Object[0]));
            } else {
                spannableStringBuilder.append((CharSequence) hd.G(i15, "Months", new Object[0]));
            }
            n3Var.f14817n.setText(spannableStringBuilder);
            ImageView imageView2 = n3Var.f14818r;
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
                i10 = k6.kk;
            } else {
                i10 = k6.ik;
            }
            ShapeDrawable L2 = k6.L(L, k6.w0(i10, f6Var));
            if (connectedbotstarref.revoked) {
                i11 = k6.kk;
            } else {
                i11 = k6.ik;
            }
            n6 N = r6.N(i11);
            view2.setBackground(L2);
            r6.k(view2, L2, N, null, f6Var);
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
            n3Var.f14819s = z9;
            n3Var.setWillNotDraw(!z9);
        } else if (obj instanceof TL_payments.starRefProgram) {
            n3 n3Var2 = (n3) view;
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
            boolean z11 = w31Var.f39836r;
            TLRPC.User a23 = qp.s1(n3Var2.f14812a).a2(Long.valueOf(starrefprogram.bot_id));
            w8 w8Var2 = new w8((f6) null);
            w8Var2.r(a23);
            n3Var2.f14814c.e(a23, w8Var2);
            n3Var2.h.setText(t10.p(a23));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (starrefprogram.commission_permille > 0) {
                spannableStringBuilder2.append((CharSequence) " d");
                ez ezVar2 = new ez();
                int i16 = k6.ik;
                ezVar2.f45443f = k6.w0(i16, null);
                ezVar2.f45445r = i16;
                ezVar2.f45446s = null;
                ezVar2.f45444n = true;
                ezVar2.f45447w = j.J0(starrefprogram.commission_permille);
                if (ezVar2.f45441c != null) {
                    ezVar2.f45441c = null;
                    ezVar2.a();
                }
                spannableStringBuilder2.setSpan(ezVar2, 1, 2, 33);
            }
            int i17 = starrefprogram.duration_months;
            if (i17 == 0) {
                spannableStringBuilder2.append((CharSequence) hd.M0(2131748985, null));
            } else if (i17 >= 12 && i17 % 12 == 0) {
                spannableStringBuilder2.append((CharSequence) hd.G(i17 / 12, "Years", new Object[0]));
            } else {
                spannableStringBuilder2.append((CharSequence) hd.G(i17, "Months", new Object[0]));
            }
            n3Var2.f14817n.setText(spannableStringBuilder2);
            ImageView imageView3 = n3Var2.f14818r;
            if (!z11) {
                i13 = 8;
            }
            imageView3.setVisibility(i13);
            n3Var2.d.setVisibility(8);
            n3Var2.f14816f.setVisibility(8);
            n3Var2.f14815e.setVisibility(8);
            n3Var2.f14819s = z9;
            n3Var2.setWillNotDraw(!z9);
        }
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new n3(i7, context, f6Var);
    }
}
