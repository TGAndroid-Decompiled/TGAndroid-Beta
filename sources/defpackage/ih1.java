package defpackage;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class ih1 extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        Object obj = c6cVar.H;
        int i5 = 0;
        if (obj instanceof TL_payments.connectedBotStarRef) {
            jh1 jh1Var = (jh1) view;
            TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
            boolean z2 = c6cVar.s;
            ylb ylbVar = jh1Var.b;
            View view2 = jh1Var.e;
            ImageView imageView = jh1Var.f;
            TLRPC.User W1 = oc7.r1(jh1Var.a).W1(Long.valueOf(connectedbotstarref.bot_id));
            pc0 pc0Var = new pc0((ylb) null);
            pc0Var.q(W1);
            jh1Var.c.f(W1, pc0Var);
            TextView textView = jh1Var.h;
            textView.setText(gw3.m(m9c.r(W1), textView.getPaint().getFontMetricsInt(), false, null, 0));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (connectedbotstarref.commission_permille > 0) {
                spannableStringBuilder.append((CharSequence) " d");
                of4 of4Var = new of4();
                int i6 = cmb.kk;
                of4Var.f = cmb.v0(i6, null);
                of4Var.r = i6;
                of4Var.s = null;
                of4Var.n = true;
                of4Var.w = bc.J0(connectedbotstarref.commission_permille);
                if (of4Var.c != null) {
                    of4Var.c = null;
                    of4Var.a();
                }
                spannableStringBuilder.setSpan(of4Var, 1, 2, 33);
            }
            int i7 = connectedbotstarref.duration_months;
            if (i7 == 0) {
                spannableStringBuilder.append((CharSequence) jb6.M0(2131748743, null));
            } else if (i7 >= 12 && i7 % 12 == 0) {
                spannableStringBuilder.append((CharSequence) jb6.G(i7 / 12, "Years", new Object[0]));
            } else {
                spannableStringBuilder.append((CharSequence) jb6.G(i7, "Months", new Object[0]));
            }
            jh1Var.n.setText(spannableStringBuilder);
            ImageView imageView2 = jh1Var.r;
            if (z2) {
                i = 0;
            } else {
                i = 8;
            }
            imageView2.setVisibility(i);
            jh1Var.d.setVisibility(0);
            imageView.setVisibility(0);
            view2.setVisibility(0);
            int L = gm.L(9.665f);
            if (connectedbotstarref.revoked) {
                i2 = cmb.mk;
            } else {
                i2 = cmb.kk;
            }
            ShapeDrawable K = cmb.K(L, cmb.v0(i2, ylbVar));
            if (connectedbotstarref.revoked) {
                i3 = cmb.mk;
            } else {
                i3 = cmb.kk;
            }
            wmb M = anb.M(i3);
            view2.setBackground(K);
            anb.j(view2, K, M, null, ylbVar);
            if (connectedbotstarref.revoked) {
                i4 = 2131232212;
            } else {
                i4 = 2131232206;
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
            jh1Var.s = z;
            jh1Var.setWillNotDraw(!z);
        } else if (obj instanceof TL_payments.starRefProgram) {
            jh1 jh1Var2 = (jh1) view;
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
            boolean z3 = c6cVar.s;
            TLRPC.User W12 = oc7.r1(jh1Var2.a).W1(Long.valueOf(starrefprogram.bot_id));
            pc0 pc0Var2 = new pc0((ylb) null);
            pc0Var2.q(W12);
            jh1Var2.c.f(W12, pc0Var2);
            jh1Var2.h.setText(m9c.r(W12));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (starrefprogram.commission_permille > 0) {
                spannableStringBuilder2.append((CharSequence) " d");
                of4 of4Var2 = new of4();
                int i8 = cmb.kk;
                of4Var2.f = cmb.v0(i8, null);
                of4Var2.r = i8;
                of4Var2.s = null;
                of4Var2.n = true;
                of4Var2.w = bc.J0(starrefprogram.commission_permille);
                if (of4Var2.c != null) {
                    of4Var2.c = null;
                    of4Var2.a();
                }
                spannableStringBuilder2.setSpan(of4Var2, 1, 2, 33);
            }
            int i9 = starrefprogram.duration_months;
            if (i9 == 0) {
                spannableStringBuilder2.append((CharSequence) jb6.M0(2131748743, null));
            } else if (i9 >= 12 && i9 % 12 == 0) {
                spannableStringBuilder2.append((CharSequence) jb6.G(i9 / 12, "Years", new Object[0]));
            } else {
                spannableStringBuilder2.append((CharSequence) jb6.G(i9, "Months", new Object[0]));
            }
            jh1Var2.n.setText(spannableStringBuilder2);
            ImageView imageView3 = jh1Var2.r;
            if (!z3) {
                i5 = 8;
            }
            imageView3.setVisibility(i5);
            jh1Var2.d.setVisibility(8);
            jh1Var2.f.setVisibility(8);
            jh1Var2.e.setVisibility(8);
            jh1Var2.s = z;
            jh1Var2.setWillNotDraw(!z);
        }
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new jh1(i, ylbVar, context);
    }
}
