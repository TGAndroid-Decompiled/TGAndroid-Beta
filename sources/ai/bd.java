package ai;

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
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.vq;
public final class bd extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public long f1052a;
    public final int f1053b;
    public final ad f1054c;
    public boolean d;
    public SpannableString e;
    public long f1055f;
    public final vq[] h;
    public final vq[] f1056n;
    public ValueAnimator f1057r;

    public bd(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f1055f = -1L;
        this.h = new vq[1];
        this.f1056n = new vq[1];
        this.f1053b = i10;
        this.f1052a = UserConfig.getInstance(i10).getClientUserId();
        setOrientation(1);
        setGravity(21);
        TextView textView = new TextView(context);
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.W(textView, i11, g6Var);
        textView.setTextSize(1, 13.0f);
        textView.setText(LocaleController.getString(R.string.StarsBalance));
        textView.setGravity(5);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, w7.z5.q(-2, -2, 5));
        ad adVar = new ad(this, context, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        this.f1054c = adVar;
        adVar.f29157n = true;
        adVar.getDrawable().r(false, true);
        adVar.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.r6.a0(adVar, i11, g6Var);
        adVar.setTextSize(AndroidUtilities.dp(13.0f));
        adVar.setGravity(5);
        adVar.setPadding(AndroidUtilities.dp(19.0f), 0, 0, 0);
        addView(adVar, w7.z5.t(-2, 20, 5, 0, -2, 0, 0));
        a(false);
        setPadding(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f));
    }

    public final void a(boolean z10) {
        ha haVar;
        boolean z11;
        boolean z12;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i10 = this.f1053b;
        ha y3 = ha.y(i10, false);
        if (this.d) {
            haVar = ha.y(i10, true);
        } else {
            haVar = null;
        }
        long j10 = 0;
        ag.a i11 = ag.a.i(0L, ag.b.f634b);
        ad adVar = this.f1054c;
        adVar.a();
        if (this.f1052a == UserConfig.getInstance(i10).getClientUserId()) {
            z12 = !y3.e;
            j10 = y3.p().amount;
            if (haVar != null) {
                z12 |= !haVar.e;
                i11 = haVar.s();
            }
        } else {
            TLRPC.TL_payments_starsRevenueStats h = k0.g(i10).h(this.f1052a, false);
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
        long j11 = this.f1055f;
        if (j10 > j11 && j11 != -1) {
            ValueAnimator valueAnimator = this.f1057r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
            this.f1057r = ofFloat;
            ofFloat.addUpdateListener(new ah.c0(this, 6));
            this.f1057r.addListener(new ah.b(this, 4));
            this.f1057r.setDuration(320L);
            this.f1057r.setInterpolator(new OvershootInterpolator());
            this.f1057r.start();
        }
        if (z12) {
            if (this.e == null) {
                SpannableString spannableString = new SpannableString("x");
                this.e = spannableString;
                spannableString.setSpan(new ba0(AndroidUtilities.dp(48.0f), adVar), 0, this.e.length(), 33);
            }
            adVar.c(this.e, z10, true);
            this.f1055f = -1L;
            return;
        }
        if (this.d) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!i11.k()) {
                String str = "⭐️" + i11.d();
                vq[] vqVarArr = this.f1056n;
                spannableStringBuilder.append((CharSequence) nd.Y0(true, str, 0.62f, vqVarArr));
                vq vqVar = vqVarArr[0];
                if (vqVar != null) {
                    vqVar.setColorKey(org.telegram.ui.ActionBar.k6.il);
                }
                spannableStringBuilder.append((CharSequence) "  ");
            }
            spannableStringBuilder.append((CharSequence) nd.Y0(false, i2.o1.m(j10, ' ', new StringBuilder("⭐️")), 0.62f, this.h));
            adVar.setText(spannableStringBuilder);
        } else {
            adVar.setText(LocaleController.formatNumber(j10, ' '));
        }
        this.f1055f = j10;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starBalanceUpdated) {
            a(true);
        } else if (i10 == NotificationCenter.botStarsUpdated && ((Long) objArr[0]).longValue() == this.f1052a) {
            a(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        int i10 = this.f1053b;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f1053b;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 1073741824));
    }

    public void setDialogId(long j10) {
        if (this.f1052a != j10) {
            this.f1052a = j10;
            a(true);
        }
    }
}
