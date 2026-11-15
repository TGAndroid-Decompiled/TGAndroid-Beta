package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e80;
public final class bb extends LinearLayout implements is {
    public long f8261a;
    public final int f8262b;
    public final ab f8263c;
    public SpannableString d;
    public long f8264e;
    public ValueAnimator f8265f;

    public bb(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f8264e = -1L;
        this.f8262b = i7;
        this.f8261a = m10.i(i7).e();
        setOrientation(1);
        setGravity(21);
        TextView textView = new TextView(context);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.U(textView, i10, e6Var);
        i5.c.w(textView, 1, 13.0f, null, 2131745155);
        textView.setGravity(5);
        textView.setTypeface(org.telegram.messenger.g0.o());
        addView(textView, c8.ja.r(-2, -2, 5));
        ab abVar = new ab(this, context, context.getResources().getDrawable(2131232753).mutate());
        this.f8263c = abVar;
        abVar.f35178n = true;
        abVar.getDrawable().r(false, true);
        abVar.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.q6.Y(abVar, i10, e6Var);
        abVar.setTextSize(org.telegram.messenger.g0.L(13.0f));
        abVar.setGravity(5);
        abVar.setPadding(org.telegram.messenger.g0.L(19.0f), 0, 0, 0);
        addView(abVar, c8.ja.t(-2, 20, 5, 0, -2, 0, 0));
        a(false);
        setPadding(org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(4.0f));
    }

    public final void a(boolean z10) {
        boolean z11;
        long j3;
        boolean z12;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i7 = this.f8262b;
        v8 y10 = v8.y(i7, false);
        ab abVar = this.f8263c;
        abVar.a();
        if (this.f8261a == m10.i(i7).e()) {
            z12 = !y10.f9601e;
            j3 = y10.p().amount;
        } else {
            TLRPC.TL_payments_starsRevenueStats h = e0.g(i7).h(this.f8261a, false);
            if (h != null && h.status != null) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (h != null && (tL_starsRevenueStatus = h.status) != null) {
                j3 = tL_starsRevenueStatus.current_balance.amount;
            } else {
                j3 = 0;
            }
            z12 = z11;
        }
        long j10 = this.f8264e;
        if (j3 > j10 && j10 != -1) {
            ValueAnimator valueAnimator = this.f8265f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
            this.f8265f = ofFloat;
            ofFloat.addUpdateListener(new ah.h(this, 10));
            this.f8265f.addListener(new ai.i0(this, 7));
            this.f8265f.setDuration(320L);
            this.f8265f.setInterpolator(new OvershootInterpolator());
            this.f8265f.start();
        }
        if (z12) {
            if (this.d == null) {
                SpannableString spannableString = new SpannableString("x");
                this.d = spannableString;
                spannableString.setSpan(new e80(org.telegram.messenger.g0.L(48.0f), abVar), 0, this.d.length(), 33);
            }
            abVar.c(this.d, z10, true);
            this.f8264e = -1L;
            return;
        }
        abVar.setText(hd.E(j3, ' '));
        this.f8264e = j3;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.f25610y3) {
            a(true);
        } else if (i7 == ns.C3 && ((Long) objArr[0]).longValue() == this.f8261a) {
            a(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        int i7 = this.f8262b;
        ns.f(i7).c(this, ns.f25610y3);
        ns.f(i7).c(this, ns.C3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.f8262b;
        ns.f(i7).n(this, ns.f25610y3);
        ns.f(i7).n(this, ns.C3);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 1073741824));
    }

    public void setDialogId(long j3) {
        if (this.f8261a != j3) {
            this.f8261a = j3;
            a(true);
        }
    }
}
