package ai;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.yq;
public final class c extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f1050a;
    public final org.telegram.ui.ActionBar.d6 f1051b;
    public final TextView f1052c;
    public final x90 d;
    public ag.c e;
    public final yq[] f1053f;

    public c(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this(context, i10, ag.c.f635a, d6Var);
    }

    public final void a() {
        ag.c cVar = this.e;
        int i10 = this.f1050a;
        ag.a s10 = ga.x(i10, cVar).s();
        ag.c cVar2 = this.e;
        ag.c cVar3 = ag.c.f635a;
        TextView textView = this.f1052c;
        org.telegram.ui.ActionBar.d6 d6Var = this.f1051b;
        x90 x90Var = this.d;
        if (cVar2 == cVar3) {
            textView.setText(md.Y0(false, LocaleController.formatString(R.string.Gift2MessageStarsInfo, LocaleController.formatNumber(s10.a(), ',')), 0.6f, null));
            int i11 = org.telegram.ui.ActionBar.h6.Gi;
            x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
            x90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
            x90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new a3.d(this, 6)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        } else if (cVar2 == ag.c.f636b) {
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2MessageStarsInfoTON, s10.b()));
            yq[] yqVarArr = this.f1053f;
            textView.setText(md.Y0(true, replaceTags, 0.6f, yqVarArr));
            yqVarArr[0].setColorKey(org.telegram.ui.ActionBar.h6.Gi);
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            sb2.append(BillingController.getInstance().formatCurrency((long) (MessagesController.getInstance(i10).config.tonUsdRate.get() * s10.c() * 100.0d), "USD", 2));
            int i12 = org.telegram.ui.ActionBar.h6.Hi;
            int w02 = org.telegram.ui.ActionBar.h6.w0(i12, d6Var);
            int i13 = org.telegram.ui.ActionBar.h6.Fi;
            x90Var.setTextColor(i0.a.f(0.33f, w02, org.telegram.ui.ActionBar.h6.w0(i13, d6Var)));
            x90Var.setLinkTextColor(i0.a.f(0.33f, org.telegram.ui.ActionBar.h6.w0(i12, d6Var), org.telegram.ui.ActionBar.h6.w0(i13, d6Var)));
            x90Var.setText(sb2);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starBalanceUpdated) {
            a();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        int i10 = this.f1050a;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f1050a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    public c(Context context, int i10, ag.c cVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f1053f = new yq[1];
        this.f1050a = i10;
        this.f1051b = d6Var;
        this.e = cVar;
        setOrientation(1);
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
        setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Fi, d6Var)));
        TextView textView = new TextView(context);
        this.f1052c = textView;
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.Cells.c1.q(org.telegram.ui.ActionBar.h6.Hi, d6Var, textView, 17);
        addView(textView, w7.z5.p(-2, -2, 0.0f, 17, 0, 0, 0, 0));
        x90 x90Var = new x90(context, d6Var);
        this.d = x90Var;
        x90Var.setTextSize(1, 12.0f);
        x90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new b(context, 0, d6Var)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        x90Var.setGravity(17);
        addView(x90Var, w7.z5.p(-2, -2, 0.0f, 17, 0, 1, 0, 0));
        a();
    }
}
