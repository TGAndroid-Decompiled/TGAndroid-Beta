package defpackage;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class jg1 extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        Object obj = b8cVar.H;
        int i5 = 0;
        if (obj instanceof TL_payments.connectedBotStarRef) {
            kg1 kg1Var = (kg1) view;
            TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
            boolean z2 = b8cVar.s;
            vnb vnbVar = kg1Var.b;
            View view2 = kg1Var.e;
            ImageView imageView = kg1Var.f;
            TLRPC.User X1 = uc7.s1(kg1Var.a).X1(Long.valueOf(connectedbotstarref.bot_id));
            rb0 rb0Var = new rb0((vnb) null);
            rb0Var.q(X1);
            kg1Var.c.f(X1, rb0Var);
            TextView textView = kg1Var.h;
            textView.setText(pv3.m(lbc.r(X1), textView.getPaint().getFontMetricsInt(), false, null, 0));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (connectedbotstarref.commission_permille > 0) {
                spannableStringBuilder.append((CharSequence) " d");
                lf4 lf4Var = new lf4();
                int i6 = aob.lk;
                lf4Var.f = aob.v0(i6, null);
                lf4Var.r = i6;
                lf4Var.s = null;
                lf4Var.n = true;
                lf4Var.w = cc.J0(connectedbotstarref.commission_permille);
                if (lf4Var.c != null) {
                    lf4Var.c = null;
                    lf4Var.a();
                }
                spannableStringBuilder.setSpan(lf4Var, 1, 2, 33);
            }
            int i7 = connectedbotstarref.duration_months;
            if (i7 == 0) {
                spannableStringBuilder.append((CharSequence) ob6.M0(2131748740, null));
            } else if (i7 >= 12 && i7 % 12 == 0) {
                spannableStringBuilder.append((CharSequence) ob6.G(i7 / 12, "Years", new Object[0]));
            } else {
                spannableStringBuilder.append((CharSequence) ob6.G(i7, "Months", new Object[0]));
            }
            kg1Var.n.setText(spannableStringBuilder);
            ImageView imageView2 = kg1Var.r;
            if (z2) {
                i = 0;
            } else {
                i = 8;
            }
            imageView2.setVisibility(i);
            kg1Var.d.setVisibility(0);
            imageView.setVisibility(0);
            view2.setVisibility(0);
            int L = hl.L(9.665f);
            if (connectedbotstarref.revoked) {
                i2 = aob.nk;
            } else {
                i2 = aob.lk;
            }
            ShapeDrawable K = aob.K(L, aob.v0(i2, vnbVar));
            if (connectedbotstarref.revoked) {
                i3 = aob.nk;
            } else {
                i3 = aob.lk;
            }
            uob M = yob.M(i3);
            view2.setBackground(K);
            yob.j(view2, K, M, null, vnbVar);
            if (connectedbotstarref.revoked) {
                i4 = 2131232211;
            } else {
                i4 = 2131232205;
            }
            imageView.setImageResource(i4);
            float f2 = 0.6f;
            if (connectedbotstarref.revoked) {
                f = 0.8f;
            } else {
                f = 0.6f;
            }
            imageView.setScaleX(f);
            if (connectedbotstarref.revoked) {
                f2 = 0.8f;
            }
            imageView.setScaleY(f2);
            kg1Var.s = z;
            kg1Var.setWillNotDraw(!z);
        } else if (obj instanceof TL_payments.starRefProgram) {
            kg1 kg1Var2 = (kg1) view;
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
            boolean z3 = b8cVar.s;
            TLRPC.User X12 = uc7.s1(kg1Var2.a).X1(Long.valueOf(starrefprogram.bot_id));
            rb0 rb0Var2 = new rb0((vnb) null);
            rb0Var2.q(X12);
            kg1Var2.c.f(X12, rb0Var2);
            kg1Var2.h.setText(lbc.r(X12));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (starrefprogram.commission_permille > 0) {
                spannableStringBuilder2.append((CharSequence) " d");
                lf4 lf4Var2 = new lf4();
                int i8 = aob.lk;
                lf4Var2.f = aob.v0(i8, null);
                lf4Var2.r = i8;
                lf4Var2.s = null;
                lf4Var2.n = true;
                lf4Var2.w = cc.J0(starrefprogram.commission_permille);
                if (lf4Var2.c != null) {
                    lf4Var2.c = null;
                    lf4Var2.a();
                }
                spannableStringBuilder2.setSpan(lf4Var2, 1, 2, 33);
            }
            int i9 = starrefprogram.duration_months;
            if (i9 == 0) {
                spannableStringBuilder2.append((CharSequence) ob6.M0(2131748740, null));
            } else if (i9 >= 12 && i9 % 12 == 0) {
                spannableStringBuilder2.append((CharSequence) ob6.G(i9 / 12, "Years", new Object[0]));
            } else {
                spannableStringBuilder2.append((CharSequence) ob6.G(i9, "Months", new Object[0]));
            }
            kg1Var2.n.setText(spannableStringBuilder2);
            ImageView imageView3 = kg1Var2.r;
            if (!z3) {
                i5 = 8;
            }
            imageView3.setVisibility(i5);
            kg1Var2.d.setVisibility(8);
            kg1Var2.f.setVisibility(8);
            kg1Var2.e.setVisibility(8);
            kg1Var2.s = z;
            kg1Var2.setWillNotDraw(!z);
        }
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new kg1(i, vnbVar, context);
    }
}
