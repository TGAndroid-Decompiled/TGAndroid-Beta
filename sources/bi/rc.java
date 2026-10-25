package bi;

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
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.zq;
public final class rc extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public long f5371a;
    public final int f5372b;
    public final qc f5373c;
    public boolean d;
    public SpannableString e;
    public long f5374f;
    public final zq[] h;
    public final zq[] f5375n;
    public ValueAnimator f5376r;

    public rc(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f5374f = -1L;
        this.h = new zq[1];
        this.f5375n = new zq[1];
        this.f5372b = i10;
        this.f5371a = UserConfig.getInstance(i10).getClientUserId();
        setOrientation(1);
        setGravity(21);
        TextView textView = new TextView(context);
        int i11 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.V(textView, i11, u6Var);
        textView.setTextSize(1, 13.0f);
        textView.setText(LocaleController.getString(R.string.StarsBalance));
        textView.setGravity(5);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, gb1.u(-2, -2, 5));
        qc qcVar = new qc(this, context, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        this.f5373c = qcVar;
        qcVar.f32442n = true;
        qcVar.getDrawable().r(false, true);
        qcVar.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.f7.Z(qcVar, i11, u6Var);
        qcVar.setTextSize(AndroidUtilities.dp(13.0f));
        qcVar.setGravity(5);
        qcVar.setPadding(AndroidUtilities.dp(19.0f), 0, 0, 0);
        addView(qcVar, gb1.x(-2, 20, 5, 0, -2, 0, 0));
        a(false);
        setPadding(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f));
    }

    public final void a(boolean z10) {
        ca caVar;
        boolean z11;
        boolean z12;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i10 = this.f5372b;
        ca y3 = ca.y(i10, false);
        if (this.d) {
            caVar = ca.y(i10, true);
        } else {
            caVar = null;
        }
        long j10 = 0;
        bg.a i11 = bg.a.i(0L, bg.b.f3981b);
        qc qcVar = this.f5373c;
        qcVar.a();
        if (this.f5371a == UserConfig.getInstance(i10).getClientUserId()) {
            z12 = !y3.e;
            j10 = y3.p().amount;
            if (caVar != null) {
                z12 |= !caVar.e;
                i11 = caVar.s();
            }
        } else {
            TLRPC.TL_payments_starsRevenueStats h = m0.g(i10).h(this.f5371a, false);
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
        long j11 = this.f5374f;
        if (j10 > j11 && j11 != -1) {
            ValueAnimator valueAnimator = this.f5376r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
            this.f5376r = ofFloat;
            ofFloat.addUpdateListener(new ai.g0(this, 8));
            this.f5376r.addListener(new bh.b(this, 5));
            this.f5376r.setDuration(320L);
            this.f5376r.setInterpolator(new OvershootInterpolator());
            this.f5376r.start();
        }
        if (z12) {
            if (this.e == null) {
                SpannableString spannableString = new SpannableString("x");
                this.e = spannableString;
                spannableString.setSpan(new ea0(AndroidUtilities.dp(48.0f), qcVar), 0, this.e.length(), 33);
            }
            qcVar.c(this.e, z10, true);
            this.f5374f = -1L;
            return;
        }
        if (this.d) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!i11.k()) {
                String str = "⭐️" + i11.d();
                zq[] zqVarArr = this.f5375n;
                spannableStringBuilder.append((CharSequence) dd.W0(true, str, 0.62f, zqVarArr));
                zq zqVar = zqVarArr[0];
                if (zqVar != null) {
                    zqVar.setColorKey(org.telegram.ui.ActionBar.y6.il);
                }
                spannableStringBuilder.append((CharSequence) "  ");
            }
            spannableStringBuilder.append((CharSequence) dd.W0(false, org.telegram.messenger.t.i(j10, ' ', new StringBuilder("⭐️")), 0.62f, this.h));
            qcVar.setText(spannableStringBuilder);
        } else {
            qcVar.setText(LocaleController.formatNumber(j10, ' '));
        }
        this.f5374f = j10;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starBalanceUpdated) {
            a(true);
        } else if (i10 == NotificationCenter.botStarsUpdated && ((Long) objArr[0]).longValue() == this.f5371a) {
            a(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        int i10 = this.f5372b;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f5372b;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 1073741824));
    }

    public void setDialogId(long j10) {
        if (this.f5371a != j10) {
            this.f5371a = j10;
            a(true);
        }
    }
}
