package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.r80;
public final class eb extends LinearLayout implements fs {
    public long f8748a;
    public final int f8749b;
    public final db f8750c;
    public SpannableString d;
    public long f8751e;
    public ValueAnimator f8752f;

    public eb(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f8751e = -1L;
        this.f8749b = i7;
        this.f8748a = j10.i(i7).e();
        setOrientation(1);
        setGravity(21);
        TextView textView = new TextView(context);
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(textView, i10, h6Var);
        i5.c.r(13.0f, 1, 2131744914, textView, null);
        textView.setGravity(5);
        textView.setTypeface(org.telegram.messenger.g0.o());
        addView(textView, c8.ma.r(-2, -2, 5));
        db dbVar = new db(this, context, context.getResources().getDrawable(2131232754).mutate());
        this.f8750c = dbVar;
        dbVar.f38125n = true;
        dbVar.getDrawable().r(false, true);
        dbVar.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.t6.Y(dbVar, i10, h6Var);
        dbVar.setTextSize(org.telegram.messenger.g0.L(13.0f));
        dbVar.setGravity(5);
        dbVar.setPadding(org.telegram.messenger.g0.L(19.0f), 0, 0, 0);
        addView(dbVar, c8.ma.t(-2, 20, 5, 0, -2, 0, 0));
        a(false);
        setPadding(org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(4.0f));
    }

    public final void a(boolean z10) {
        boolean z11;
        long j3;
        boolean z12;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i7 = this.f8749b;
        y8 y10 = y8.y(i7, false);
        db dbVar = this.f8750c;
        dbVar.a();
        if (this.f8748a == j10.i(i7).e()) {
            z12 = !y10.f10085e;
            j3 = y10.p().amount;
        } else {
            TLRPC.TL_payments_starsRevenueStats h = e0.g(i7).h(this.f8748a, false);
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
        long j10 = this.f8751e;
        if (j3 > j10 && j10 != -1) {
            ValueAnimator valueAnimator = this.f8752f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
            this.f8752f = ofFloat;
            ofFloat.addUpdateListener(new ah.g(this, 10));
            this.f8752f.addListener(new ai.k0(this, 7));
            this.f8752f.setDuration(320L);
            this.f8752f.setInterpolator(new OvershootInterpolator());
            this.f8752f.start();
        }
        if (z12) {
            if (this.d == null) {
                SpannableString spannableString = new SpannableString("x");
                this.d = spannableString;
                spannableString.setSpan(new r80(org.telegram.messenger.g0.L(48.0f), dbVar), 0, this.d.length(), 33);
            }
            dbVar.c(this.d, z10, true);
            this.f8751e = -1L;
            return;
        }
        dbVar.setText(gd.E(j3, ' '));
        this.f8751e = j3;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.A3) {
            a(true);
        } else if (i7 == ks.E3 && ((Long) objArr[0]).longValue() == this.f8748a) {
            a(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        int i7 = this.f8749b;
        ks.f(i7).c(this, ks.A3);
        ks.f(i7).c(this, ks.E3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.f8749b;
        ks.f(i7).n(this, ks.A3);
        ks.f(i7).n(this, ks.E3);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 1073741824));
    }

    public void setDialogId(long j3) {
        if (this.f8748a != j3) {
            this.f8748a = j3;
            a(true);
        }
    }
}
