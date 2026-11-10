package bi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b80;
public final class sc extends LinearLayout implements ls {
    public long f4720a;
    public final int f4721b;
    public final rc f4722c;
    public SpannableString d;
    public long f4723e;
    public ValueAnimator f4724f;

    public sc(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f4723e = -1L;
        this.f4721b = i7;
        this.f4720a = p10.i(i7).e();
        setOrientation(1);
        setGravity(21);
        TextView textView = new TextView(context);
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(textView, i10, h6Var);
        jg.g.v(textView, 1, 13.0f, null, 2131745155);
        textView.setGravity(5);
        textView.setTypeface(org.telegram.messenger.g0.o());
        addView(textView, c8.ha.r(-2, -2, 5));
        rc rcVar = new rc(this, context, context.getResources().getDrawable(2131232752).mutate());
        this.f4722c = rcVar;
        rcVar.f34546n = true;
        rcVar.getDrawable().r(false, true);
        rcVar.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.t6.Y(rcVar, i10, h6Var);
        rcVar.setTextSize(org.telegram.messenger.g0.L(13.0f));
        rcVar.setGravity(5);
        rcVar.setPadding(org.telegram.messenger.g0.L(19.0f), 0, 0, 0);
        addView(rcVar, c8.ha.t(-2, 20, 5, 0, -2, 0, 0));
        a(false);
        setPadding(org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(4.0f));
    }

    public final void a(boolean z9) {
        boolean z10;
        long j3;
        boolean z11;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i7 = this.f4721b;
        ea y10 = ea.y(i7, false);
        rc rcVar = this.f4722c;
        rcVar.a();
        if (this.f4720a == p10.i(i7).e()) {
            z11 = !y10.f3807e;
            j3 = y10.p().amount;
        } else {
            TLRPC.TL_payments_starsRevenueStats h = n0.g(i7).h(this.f4720a, false);
            if (h != null && h.status != null) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (h != null && (tL_starsRevenueStatus = h.status) != null) {
                j3 = tL_starsRevenueStatus.current_balance.amount;
            } else {
                j3 = 0;
            }
            z11 = z10;
        }
        long j10 = this.f4723e;
        if (j3 > j10 && j10 != -1) {
            ValueAnimator valueAnimator = this.f4724f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
            this.f4724f = ofFloat;
            ofFloat.addUpdateListener(new ah.h(this, 8));
            this.f4724f.addListener(new t5(this, 1));
            this.f4724f.setDuration(320L);
            this.f4724f.setInterpolator(new OvershootInterpolator());
            this.f4724f.start();
        }
        if (z11) {
            if (this.d == null) {
                SpannableString spannableString = new SpannableString("x");
                this.d = spannableString;
                spannableString.setSpan(new b80(org.telegram.messenger.g0.L(48.0f), rcVar), 0, this.d.length(), 33);
            }
            rcVar.c(this.d, z9, true);
            this.f4723e = -1L;
            return;
        }
        rcVar.setText(org.telegram.messenger.id.E(j3, ' '));
        this.f4723e = j3;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.f25118y3) {
            a(true);
        } else if (i7 == qs.C3 && ((Long) objArr[0]).longValue() == this.f4720a) {
            a(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        int i7 = this.f4721b;
        qs.f(i7).c(this, qs.f25118y3);
        qs.f(i7).c(this, qs.C3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.f4721b;
        qs.f(i7).n(this, qs.f25118y3);
        qs.f(i7).n(this, qs.C3);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 1073741824));
    }

    public void setDialogId(long j3) {
        if (this.f4720a != j3) {
            this.f4720a = j3;
            a(true);
        }
    }
}
