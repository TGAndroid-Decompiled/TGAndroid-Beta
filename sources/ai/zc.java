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
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.yq;
public final class zc extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public long f2551a;
    public final int f2552b;
    public final yc f2553c;
    public boolean d;
    public SpannableString e;
    public long f2554f;
    public final yq[] h;
    public final yq[] f2555n;
    public ValueAnimator f2556r;

    public zc(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f2554f = -1L;
        this.h = new yq[1];
        this.f2555n = new yq[1];
        this.f2552b = i10;
        this.f2551a = UserConfig.getInstance(i10).getClientUserId();
        setOrientation(1);
        setGravity(21);
        TextView textView = new TextView(context);
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        wh.o(i11, d6Var, textView, 1, 13.0f);
        textView.setText(LocaleController.getString(R.string.StarsBalance));
        textView.setGravity(5);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, w7.z5.q(-2, -2, 5));
        yc ycVar = new yc(this, context, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        this.f2553c = ycVar;
        ycVar.f29580n = true;
        ycVar.getDrawable().r(false, true);
        ycVar.setTypeface(AndroidUtilities.bold());
        ycVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        ycVar.setTextSize(AndroidUtilities.dp(13.0f));
        ycVar.setGravity(5);
        ycVar.setPadding(AndroidUtilities.dp(19.0f), 0, 0, 0);
        addView(ycVar, w7.z5.t(-2, 20, 5, 0, -2, 0, 0));
        a(false);
        setPadding(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f));
    }

    public final void a(boolean z10) {
        fa faVar;
        boolean z11;
        boolean z12;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i10 = this.f2552b;
        fa y3 = fa.y(i10, false);
        if (this.d) {
            faVar = fa.y(i10, true);
        } else {
            faVar = null;
        }
        long j10 = 0;
        ag.a i11 = ag.a.i(0L, ag.c.f636b);
        yc ycVar = this.f2553c;
        ycVar.a();
        if (this.f2551a == UserConfig.getInstance(i10).getClientUserId()) {
            z12 = !y3.e;
            j10 = y3.p().amount;
            if (faVar != null) {
                z12 |= !faVar.e;
                i11 = faVar.s();
            }
        } else {
            TLRPC.TL_payments_starsRevenueStats h = k0.g(i10).h(this.f2551a, false);
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
        long j11 = this.f2554f;
        if (j10 > j11 && j11 != -1) {
            ValueAnimator valueAnimator = this.f2556r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
            this.f2556r = ofFloat;
            ofFloat.addUpdateListener(new ah.c0(this, 6));
            this.f2556r.addListener(new ah.b(this, 4));
            this.f2556r.setDuration(320L);
            this.f2556r.setInterpolator(new OvershootInterpolator());
            this.f2556r.start();
        }
        if (z12) {
            if (this.e == null) {
                SpannableString spannableString = new SpannableString("x");
                this.e = spannableString;
                spannableString.setSpan(new ca0(AndroidUtilities.dp(48.0f), ycVar), 0, this.e.length(), 33);
            }
            ycVar.c(this.e, z10, true);
            this.f2554f = -1L;
            return;
        }
        if (this.d) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!i11.k()) {
                String str = "⭐️" + i11.d();
                yq[] yqVarArr = this.f2555n;
                spannableStringBuilder.append((CharSequence) ld.Y0(true, str, 0.62f, yqVarArr));
                yq yqVar = yqVarArr[0];
                if (yqVar != null) {
                    yqVar.setColorKey(org.telegram.ui.ActionBar.h6.il);
                }
                spannableStringBuilder.append((CharSequence) "  ");
            }
            spannableStringBuilder.append((CharSequence) ld.Y0(false, org.telegram.messenger.q.h(j10, ' ', new StringBuilder("⭐️")), 0.62f, this.h));
            ycVar.setText(spannableStringBuilder);
        } else {
            ycVar.setText(LocaleController.formatNumber(j10, ' '));
        }
        this.f2554f = j10;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starBalanceUpdated) {
            a(true);
        } else if (i10 == NotificationCenter.botStarsUpdated && ((Long) objArr[0]).longValue() == this.f2551a) {
            a(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        int i10 = this.f2552b;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f2552b;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 1073741824));
    }

    public void setDialogId(long j10) {
        if (this.f2551a != j10) {
            this.f2551a = j10;
            a(true);
        }
    }
}
