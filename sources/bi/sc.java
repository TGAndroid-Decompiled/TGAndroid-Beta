package bi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.wp;
public final class sc extends LinearLayout implements ls {
    public long f4720a;
    public final int f4721b;
    public final rc f4722c;
    public boolean d;
    public SpannableString f4723e;
    public long f4724f;
    public final wp[] h;
    public final wp[] f4725n;
    public ValueAnimator f4726r;

    public sc(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f4724f = -1L;
        this.h = new wp[1];
        this.f4725n = new wp[1];
        this.f4721b = i7;
        this.f4720a = p10.i(i7).e();
        setOrientation(1);
        setGravity(21);
        TextView textView = new TextView(context);
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i10, f6Var);
        jg.g.v(textView, 1, 13.0f, null, 2131745156);
        textView.setGravity(5);
        textView.setTypeface(org.telegram.messenger.g0.o());
        addView(textView, c8.ha.r(-2, -2, 5));
        rc rcVar = new rc(this, context, context.getResources().getDrawable(2131232752).mutate());
        this.f4722c = rcVar;
        rcVar.f34893n = true;
        rcVar.getDrawable().r(false, true);
        rcVar.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.Z(rcVar, i10, f6Var);
        rcVar.setTextSize(org.telegram.messenger.g0.L(13.0f));
        rcVar.setGravity(5);
        rcVar.setPadding(org.telegram.messenger.g0.L(19.0f), 0, 0, 0);
        addView(rcVar, c8.ha.t(-2, 20, 5, 0, -2, 0, 0));
        a(false);
        setPadding(org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(4.0f));
    }

    public final void a(boolean z9) {
        ea eaVar;
        boolean z10;
        boolean z11;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i7 = this.f4721b;
        ea y10 = ea.y(i7, false);
        if (this.d) {
            eaVar = ea.y(i7, true);
        } else {
            eaVar = null;
        }
        long j3 = 0;
        cg.a i10 = cg.a.i(0L, cg.b.f6163b);
        rc rcVar = this.f4722c;
        rcVar.a();
        if (this.f4720a == p10.i(i7).e()) {
            z11 = !y10.f3810e;
            j3 = y10.p().amount;
            if (eaVar != null) {
                z11 |= !eaVar.f3810e;
                i10 = eaVar.s();
            }
        } else {
            TLRPC.TL_payments_starsRevenueStats h = n0.g(i7).h(this.f4720a, false);
            if (h != null && h.status != null) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (h != null && (tL_starsRevenueStatus = h.status) != null) {
                j3 = tL_starsRevenueStatus.current_balance.amount;
            }
            z11 = z10;
        }
        long j10 = this.f4724f;
        if (j3 > j10 && j10 != -1) {
            ValueAnimator valueAnimator = this.f4726r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
            this.f4726r = ofFloat;
            ofFloat.addUpdateListener(new ah.h(this, 8));
            this.f4726r.addListener(new t5(this, 1));
            this.f4726r.setDuration(320L);
            this.f4726r.setInterpolator(new OvershootInterpolator());
            this.f4726r.start();
        }
        if (z11) {
            if (this.f4723e == null) {
                SpannableString spannableString = new SpannableString("x");
                this.f4723e = spannableString;
                spannableString.setSpan(new b80(org.telegram.messenger.g0.L(48.0f), rcVar), 0, this.f4723e.length(), 33);
            }
            rcVar.c(this.f4723e, z9, true);
            this.f4724f = -1L;
            return;
        }
        if (this.d) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!i10.k()) {
                String str = "⭐️" + i10.d();
                wp[] wpVarArr = this.f4725n;
                spannableStringBuilder.append((CharSequence) dd.a1(true, str, 0.62f, wpVarArr));
                wp wpVar = wpVarArr[0];
                if (wpVar != null) {
                    wpVar.a(org.telegram.ui.ActionBar.k6.Wl);
                }
                spannableStringBuilder.append((CharSequence) "  ");
            }
            spannableStringBuilder.append((CharSequence) dd.a1(false, jg.g.m(j3, ' ', new StringBuilder("⭐️")), 0.62f, this.h));
            rcVar.setText(spannableStringBuilder);
        } else {
            rcVar.setText(org.telegram.messenger.hd.E(j3, ' '));
        }
        this.f4724f = j3;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.f25097y3) {
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
        qs.f(i7).c(this, qs.f25097y3);
        qs.f(i7).c(this, qs.C3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.f4721b;
        qs.f(i7).n(this, qs.f25097y3);
        qs.f(i7).n(this, qs.C3);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 1073741824));
    }

    public void setDialogId(long j3) {
        if (this.f4720a != j3) {
            this.f4720a = j3;
            a(true);
        }
    }
}
