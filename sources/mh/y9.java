package mh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.oq;
public final class y9 extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public long f15112a;
    public final int f15113b;
    public final x9 f15114c;
    public boolean d;
    public SpannableString f15115e;
    public long f15116f;
    public final oq[] h;
    public final oq[] f15117n;
    public ValueAnimator f15118r;

    public y9(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f15116f = -1L;
        this.h = new oq[1];
        this.f15117n = new oq[1];
        this.f15113b = i10;
        this.f15112a = UserConfig.getInstance(i10).getClientUserId();
        setOrientation(1);
        setGravity(21);
        TextView textView = new TextView(context);
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.b.l(i11, g6Var, textView, 1, 13.0f);
        textView.setText(LocaleController.getString(R.string.StarsBalance));
        textView.setGravity(5);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, k7.c6.q(-2, -2, 5));
        x9 x9Var = new x9(this, context, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        this.f15114c = x9Var;
        x9Var.f28285n = true;
        x9Var.getDrawable().o(false, true, false);
        x9Var.setTypeface(AndroidUtilities.bold());
        x9Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        x9Var.setTextSize(AndroidUtilities.dp(13.0f));
        x9Var.setGravity(5);
        x9Var.setPadding(AndroidUtilities.dp(19.0f), 0, 0, 0);
        addView(x9Var, k7.c6.t(-2, 20, 5, 0, -2, 0, 0));
        a(false);
        setPadding(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f));
    }

    public final void a(boolean z4) {
        t7 t7Var;
        boolean z10;
        boolean z11;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i10 = this.f15113b;
        t7 y10 = t7.y(i10, false);
        if (this.d) {
            t7Var = t7.y(i10, true);
        } else {
            t7Var = null;
        }
        long j10 = 0;
        mf.a i11 = mf.a.i(0L, mf.b.f13654b);
        x9 x9Var = this.f15114c;
        x9Var.a();
        if (this.f15112a == UserConfig.getInstance(i10).getClientUserId()) {
            z11 = !y10.f14833e;
            j10 = y10.p().amount;
            if (t7Var != null) {
                z11 |= !t7Var.f14833e;
                i11 = t7Var.s();
            }
        } else {
            TLRPC.TL_payments_starsRevenueStats h = a0.g(i10).h(this.f15112a, false);
            if (h != null && h.status != null) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (h != null && (tL_starsRevenueStatus = h.status) != null) {
                j10 = tL_starsRevenueStatus.current_balance.amount;
            }
            z11 = z10;
        }
        long j11 = this.f15116f;
        if (j10 > j11 && j11 != -1) {
            ValueAnimator valueAnimator = this.f15118r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
            this.f15118r = ofFloat;
            ofFloat.addUpdateListener(new eg.m1(this, 16));
            this.f15118r.addListener(new dg.l0(this, 11));
            this.f15118r.setDuration(320L);
            this.f15118r.setInterpolator(new OvershootInterpolator());
            this.f15118r.start();
        }
        if (z11) {
            if (this.f15115e == null) {
                SpannableString spannableString = new SpannableString("x");
                this.f15115e = spannableString;
                spannableString.setSpan(new l90(AndroidUtilities.dp(48.0f), x9Var), 0, this.f15115e.length(), 33);
            }
            x9Var.c(this.f15115e, z4, true);
            this.f15116f = -1L;
            return;
        }
        if (this.d) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!i11.k()) {
                String str = "⭐️" + i11.d();
                oq[] oqVarArr = this.f15117n;
                spannableStringBuilder.append((CharSequence) ja.X0(true, str, 0.62f, oqVarArr));
                oq oqVar = oqVarArr[0];
                if (oqVar != null) {
                    oqVar.setColorKey(org.telegram.ui.ActionBar.k6.il);
                }
                spannableStringBuilder.append((CharSequence) "  ");
            }
            spannableStringBuilder.append((CharSequence) ja.X0(false, l.d.l(j10, ' ', new StringBuilder("⭐️")), 0.62f, this.h));
            x9Var.setText(spannableStringBuilder);
        } else {
            x9Var.setText(LocaleController.formatNumber(j10, ' '));
        }
        this.f15116f = j10;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starBalanceUpdated) {
            a(true);
        } else if (i10 == NotificationCenter.botStarsUpdated && ((Long) objArr[0]).longValue() == this.f15112a) {
            a(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        int i10 = this.f15113b;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f15113b;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 1073741824));
    }

    public void setDialogId(long j10) {
        if (this.f15112a != j10) {
            this.f15112a = j10;
            a(true);
        }
    }
}
