package defpackage;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class ag1 extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        Object obj = c4cVar.H;
        int i5 = 0;
        if (obj instanceof TL_payments.connectedBotStarRef) {
            bg1 bg1Var = (bg1) view;
            TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
            boolean z2 = c4cVar.s;
            wjb wjbVar = bg1Var.b;
            View view2 = bg1Var.e;
            ImageView imageView = bg1Var.f;
            TLRPC.User V1 = na7.q1(bg1Var.a).V1(Long.valueOf(connectedbotstarref.bot_id));
            pb0 pb0Var = new pb0((wjb) null);
            pb0Var.q(V1);
            bg1Var.c.f(V1, pb0Var);
            TextView textView = bg1Var.h;
            textView.setText(vu3.m(l7c.r(V1), textView.getPaint().getFontMetricsInt(), false, null, 0));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (connectedbotstarref.commission_permille > 0) {
                spannableStringBuilder.append((CharSequence) " d");
                nd4 nd4Var = new nd4();
                int i6 = bkb.kk;
                nd4Var.f = bkb.v0(i6, null);
                nd4Var.r = i6;
                nd4Var.s = null;
                nd4Var.n = true;
                nd4Var.w = bc.I0(connectedbotstarref.commission_permille);
                if (nd4Var.c != null) {
                    nd4Var.c = null;
                    nd4Var.a();
                }
                spannableStringBuilder.setSpan(nd4Var, 1, 2, 33);
            }
            int i7 = connectedbotstarref.duration_months;
            if (i7 == 0) {
                spannableStringBuilder.append((CharSequence) k96.M0(2131748794, null));
            } else if (i7 >= 12 && i7 % 12 == 0) {
                spannableStringBuilder.append((CharSequence) k96.G(i7 / 12, "Years", new Object[0]));
            } else {
                spannableStringBuilder.append((CharSequence) k96.G(i7, "Months", new Object[0]));
            }
            bg1Var.n.setText(spannableStringBuilder);
            ImageView imageView2 = bg1Var.r;
            if (z2) {
                i = 0;
            } else {
                i = 8;
            }
            imageView2.setVisibility(i);
            bg1Var.d.setVisibility(0);
            imageView.setVisibility(0);
            view2.setVisibility(0);
            int L = gl.L(9.665f);
            if (connectedbotstarref.revoked) {
                i2 = bkb.mk;
            } else {
                i2 = bkb.kk;
            }
            ShapeDrawable K = bkb.K(L, bkb.v0(i2, wjbVar));
            if (connectedbotstarref.revoked) {
                i3 = bkb.mk;
            } else {
                i3 = bkb.kk;
            }
            vkb M = zkb.M(i3);
            view2.setBackground(K);
            zkb.j(view2, K, M, null, wjbVar);
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
            bg1Var.s = z;
            bg1Var.setWillNotDraw(!z);
        } else if (obj instanceof TL_payments.starRefProgram) {
            bg1 bg1Var2 = (bg1) view;
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
            boolean z3 = c4cVar.s;
            TLRPC.User V12 = na7.q1(bg1Var2.a).V1(Long.valueOf(starrefprogram.bot_id));
            pb0 pb0Var2 = new pb0((wjb) null);
            pb0Var2.q(V12);
            bg1Var2.c.f(V12, pb0Var2);
            bg1Var2.h.setText(l7c.r(V12));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (starrefprogram.commission_permille > 0) {
                spannableStringBuilder2.append((CharSequence) " d");
                nd4 nd4Var2 = new nd4();
                int i8 = bkb.kk;
                nd4Var2.f = bkb.v0(i8, null);
                nd4Var2.r = i8;
                nd4Var2.s = null;
                nd4Var2.n = true;
                nd4Var2.w = bc.I0(starrefprogram.commission_permille);
                if (nd4Var2.c != null) {
                    nd4Var2.c = null;
                    nd4Var2.a();
                }
                spannableStringBuilder2.setSpan(nd4Var2, 1, 2, 33);
            }
            int i9 = starrefprogram.duration_months;
            if (i9 == 0) {
                spannableStringBuilder2.append((CharSequence) k96.M0(2131748794, null));
            } else if (i9 >= 12 && i9 % 12 == 0) {
                spannableStringBuilder2.append((CharSequence) k96.G(i9 / 12, "Years", new Object[0]));
            } else {
                spannableStringBuilder2.append((CharSequence) k96.G(i9, "Months", new Object[0]));
            }
            bg1Var2.n.setText(spannableStringBuilder2);
            ImageView imageView3 = bg1Var2.r;
            if (!z3) {
                i5 = 8;
            }
            imageView3.setVisibility(i5);
            bg1Var2.d.setVisibility(8);
            bg1Var2.f.setVisibility(8);
            bg1Var2.e.setVisibility(8);
            bg1Var2.s = z;
            bg1Var2.setWillNotDraw(!z);
        }
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new bg1(i, wjbVar, context);
    }
}
