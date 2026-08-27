package hh;

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
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.u80;

public final class da extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {

    public long f9142a;

    public final int f9143b;

    public final ca f9144c;
    public boolean d;

    public SpannableString f9145e;

    public long f9146f;
    public final cq[] h;

    public final cq[] f9147n;

    public ValueAnimator f9148r;

    public da(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f9146f = -1L;
        this.h = new cq[1];
        this.f9147n = new cq[1];
        this.f9143b = i10;
        this.f9142a = UserConfig.getInstance(i10).getClientUserId();
        setOrientation(1);
        setGravity(21);
        TextView textView = new TextView(context);
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        rl.l(i11, c6Var, textView, 1, 13.0f);
        textView.setText(LocaleController.getString(R.string.StarsBalance));
        textView.setGravity(5);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, h7.z5.q(-2, -2, 5));
        ca caVar = new ca(this, context, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        this.f9144c = caVar;
        caVar.f29635n = true;
        caVar.getDrawable().o(false, true, false);
        caVar.setTypeface(AndroidUtilities.bold());
        caVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        caVar.setTextSize(AndroidUtilities.dp(13.0f));
        caVar.setGravity(5);
        caVar.setPadding(AndroidUtilities.dp(19.0f), 0, 0, 0);
        addView(caVar, h7.z5.t(-2, 20, 5, 0, -2, 0, 0));
        a(false);
        setPadding(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f));
    }

    public final void a(boolean z10) {
        boolean z11;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i10 = this.f9143b;
        u7 u7VarY = u7.y(i10, false);
        u7 u7VarY2 = this.d ? u7.y(i10, true) : null;
        long j10 = 0;
        hf.a aVarI = hf.a.i(0L, hf.b.f8922b);
        ca caVar = this.f9144c;
        caVar.a();
        if (this.f9142a == UserConfig.getInstance(i10).getClientUserId()) {
            z11 = !u7VarY.f10154e;
            j10 = u7VarY.p().amount;
            if (u7VarY2 != null) {
                z11 |= !u7VarY2.f10154e;
                aVarI = u7VarY2.s();
            }
        } else {
            TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStatsH = c0.g(i10).h(this.f9142a, false);
            boolean z12 = tL_payments_starsRevenueStatsH == null || tL_payments_starsRevenueStatsH.status == null;
            if (tL_payments_starsRevenueStatsH != null && (tL_starsRevenueStatus = tL_payments_starsRevenueStatsH.status) != null) {
                j10 = tL_starsRevenueStatus.current_balance.amount;
            }
            z11 = z12;
        }
        long j11 = this.f9146f;
        if (j10 > j11 && j11 != -1) {
            ValueAnimator valueAnimator = this.f9148r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
            this.f9148r = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ag.u(this, 10));
            this.f9148r.addListener(new ag.r1(this, 7));
            this.f9148r.setDuration(320L);
            this.f9148r.setInterpolator(new OvershootInterpolator());
            this.f9148r.start();
        }
        if (z11) {
            if (this.f9145e == null) {
                SpannableString spannableString = new SpannableString("x");
                this.f9145e = spannableString;
                spannableString.setSpan(new u80(AndroidUtilities.dp(48.0f), caVar), 0, this.f9145e.length(), 33);
            }
            caVar.c(this.f9145e, z10, true);
            this.f9146f = -1L;
            return;
        }
        if (this.d) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!aVarI.k()) {
                String str = "⭐️" + aVarI.d();
                cq[] cqVarArr = this.f9147n;
                spannableStringBuilder.append((CharSequence) oa.X0(true, str, 0.62f, cqVarArr));
                cq cqVar = cqVarArr[0];
                if (cqVar != null) {
                    cqVar.setColorKey(org.telegram.ui.ActionBar.g6.il);
                }
                spannableStringBuilder.append((CharSequence) "  ");
            }
            spannableStringBuilder.append((CharSequence) oa.X0(false, i0.a.m(j10, ' ', new StringBuilder("⭐️")), 0.62f, this.h));
            caVar.setText(spannableStringBuilder);
        } else {
            caVar.setText(LocaleController.formatNumber(j10, ' '));
        }
        this.f9146f = j10;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starBalanceUpdated) {
            a(true);
        } else if (i10 == NotificationCenter.botStarsUpdated && ((Long) objArr[0]).longValue() == this.f9142a) {
            a(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        int i10 = this.f9143b;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f9143b;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 1073741824));
    }

    public void setDialogId(long j10) {
        if (this.f9142a != j10) {
            this.f9142a = j10;
            a(true);
        }
    }
}
