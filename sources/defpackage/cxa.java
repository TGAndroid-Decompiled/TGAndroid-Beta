package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
public final class cxa extends LinearLayout implements jm7 {
    public long a;
    public final int b;
    public final mh2 c;
    public SpannableString d;
    public long e;
    public ValueAnimator f;

    public cxa(int i, ylb ylbVar, Context context) {
        super(context);
        this.e = -1L;
        this.b = i;
        this.a = z8c.h(i).e();
        setOrientation(1);
        setGravity(21);
        TextView textView = new TextView(context);
        int i2 = cmb.F6;
        anb.X(textView, i2, ylbVar);
        ts2.q(13.0f, 1, 2131744844, textView, null);
        textView.setGravity(5);
        textView.setTypeface(gm.o());
        addView(textView, qoe.r(-2, -2, 5));
        mh2 mh2Var = new mh2(this, context, context.getResources().getDrawable(2131232769).mutate());
        this.c = mh2Var;
        mh2Var.n = true;
        mh2Var.getDrawable().r(false, true);
        mh2Var.setTypeface(gm.o());
        anb.U(mh2Var, i2, ylbVar);
        mh2Var.setTextSize(gm.L(13.0f));
        mh2Var.setGravity(5);
        mh2Var.setPadding(gm.L(19.0f), 0, 0, 0);
        addView(mh2Var, qoe.t(-2, 20, 5, 0, -2, 0, 0));
        a(false);
        setPadding(gm.L(15.0f), gm.L(4.0f), gm.L(15.0f), gm.L(4.0f));
    }

    public final void a(boolean z) {
        boolean z2;
        long j;
        boolean z3;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i = this.b;
        jva v = jva.v(i, false);
        mh2 mh2Var = this.c;
        mh2Var.a();
        if (this.a == z8c.h(i).e()) {
            z3 = !v.e;
            j = v.m().amount;
        } else {
            TLRPC.TL_payments_starsRevenueStats h = ku0.g(i).h(this.a, false);
            if (h != null && h.status != null) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (h != null && (tL_starsRevenueStatus = h.status) != null) {
                j = tL_starsRevenueStatus.current_balance.amount;
            } else {
                j = 0;
            }
            z3 = z2;
        }
        long j2 = this.e;
        if (j > j2 && j2 != -1) {
            ValueAnimator valueAnimator = this.f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
            this.f = ofFloat;
            ofFloat.addUpdateListener(new rha(this, (byte) 8));
            this.f.addListener(new c39(this, (byte) 22));
            this.f.setDuration(320L);
            this.f.setInterpolator(new OvershootInterpolator());
            this.f.start();
        }
        if (z3) {
            if (this.d == null) {
                SpannableString spannableString = new SpannableString("x");
                this.d = spannableString;
                spannableString.setSpan(new ta6(gm.L(48.0f), mh2Var), 0, this.d.length(), 33);
            }
            mh2Var.c(this.d, z, true);
            this.e = -1L;
            return;
        }
        mh2Var.setText(jb6.E(j, ' '));
        this.e = j;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.A3) {
            a(true);
        } else if (i == nm7.E3 && ((Long) objArr[0]).longValue() == this.a) {
            a(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        int i = this.b;
        nm7.f(i).b(this, nm7.A3);
        nm7.f(i).b(this, nm7.E3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.b;
        nm7.f(i).n(this, nm7.A3);
        nm7.f(i).n(this, nm7.E3);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(a.getCurrentActionBarHeight(), 1073741824));
    }

    public void setDialogId(long j) {
        if (this.a != j) {
            this.a = j;
            a(true);
        }
    }
}
