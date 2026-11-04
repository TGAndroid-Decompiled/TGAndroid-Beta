package ci;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.x70;
public final class lb extends LinearLayout implements cs {
    public long f5506a;
    public final int f5507b;
    public final kb f5508c;
    public boolean d;
    public SpannableString f5509e;
    public long f5510f;
    public final wp[] h;
    public final wp[] f5511n;
    public ValueAnimator f5512r;

    public lb(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f5510f = -1L;
        this.h = new wp[1];
        this.f5511n = new wp[1];
        this.f5507b = i3;
        this.f5506a = h10.i(i3).e();
        setOrientation(1);
        setGravity(21);
        TextView textView = new TextView(context);
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i10, e6Var);
        k2.p1.u(textView, 1, 13.0f, null, 2131745165);
        textView.setGravity(5);
        textView.setTypeface(org.telegram.messenger.g0.o());
        addView(textView, mf.r(-2, -2, 5));
        kb kbVar = new kb(this, context, context.getResources().getDrawable(2131232750).mutate());
        this.f5508c = kbVar;
        kbVar.f34310n = true;
        kbVar.getDrawable().r(false, true);
        kbVar.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.Z(kbVar, i10, e6Var);
        kbVar.setTextSize(org.telegram.messenger.g0.L(13.0f));
        kbVar.setGravity(5);
        kbVar.setPadding(org.telegram.messenger.g0.L(19.0f), 0, 0, 0);
        addView(kbVar, mf.t(-2, 20, 5, 0, -2, 0, 0));
        a(false);
        setPadding(org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(4.0f));
    }

    public final void a(boolean z10) {
        e9 e9Var;
        boolean z11;
        boolean z12;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i3 = this.f5507b;
        e9 y9 = e9.y(i3, false);
        if (this.d) {
            e9Var = e9.y(i3, true);
        } else {
            e9Var = null;
        }
        long j10 = 0;
        dg.a i10 = dg.a.i(0L, dg.b.f8926b);
        kb kbVar = this.f5508c;
        kbVar.a();
        if (this.f5506a == h10.i(i3).e()) {
            z12 = !y9.f5032e;
            j10 = y9.p().amount;
            if (e9Var != null) {
                z12 |= !e9Var.f5032e;
                i10 = e9Var.s();
            }
        } else {
            TLRPC.TL_payments_starsRevenueStats h = i0.g(i3).h(this.f5506a, false);
            if (h != null && h.status != null) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (h != null && (tL_starsRevenueStatus = h.status) != null) {
                j10 = tL_starsRevenueStatus.current_balance.amount;
            }
            z12 = z11;
        }
        long j11 = this.f5510f;
        if (j10 > j11 && j11 != -1) {
            ValueAnimator valueAnimator = this.f5512r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
            this.f5512r = ofFloat;
            ofFloat.addUpdateListener(new bh.f(this, 8));
            this.f5512r.addListener(new ai.e1(this, 2));
            this.f5512r.setDuration(320L);
            this.f5512r.setInterpolator(new OvershootInterpolator());
            this.f5512r.start();
        }
        if (z12) {
            if (this.f5509e == null) {
                SpannableString spannableString = new SpannableString("x");
                this.f5509e = spannableString;
                spannableString.setSpan(new x70(org.telegram.messenger.g0.L(48.0f), kbVar), 0, this.f5509e.length(), 33);
            }
            kbVar.c(this.f5509e, z10, true);
            this.f5510f = -1L;
            return;
        }
        if (this.d) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!i10.k()) {
                String str = "⭐️" + i10.d();
                wp[] wpVarArr = this.f5511n;
                spannableStringBuilder.append((CharSequence) wb.a1(true, str, 0.62f, wpVarArr));
                wp wpVar = wpVarArr[0];
                if (wpVar != null) {
                    wpVar.a(org.telegram.ui.ActionBar.k6.Wl);
                }
                spannableStringBuilder.append((CharSequence) "  ");
            }
            spannableStringBuilder.append((CharSequence) wb.a1(false, k2.p1.l(j10, ' ', new StringBuilder("⭐️")), 0.62f, this.h));
            kbVar.setText(spannableStringBuilder);
        } else {
            kbVar.setText(bd.E(j10, ' '));
        }
        this.f5510f = j10;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.f23343y3) {
            a(true);
        } else if (i3 == hs.C3 && ((Long) objArr[0]).longValue() == this.f5506a) {
            a(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        int i3 = this.f5507b;
        hs.f(i3).c(this, hs.f23343y3);
        hs.f(i3).c(this, hs.C3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = this.f5507b;
        hs.f(i3).n(this, hs.f23343y3);
        hs.f(i3).n(this, hs.C3);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 1073741824));
    }

    public void setDialogId(long j10) {
        if (this.f5506a != j10) {
            this.f5506a = j10;
            a(true);
        }
    }
}
