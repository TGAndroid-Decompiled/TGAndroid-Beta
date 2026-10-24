package ai;

import android.content.Context;
import android.graphics.drawable.Drawable;
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
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.w90;
public final class c extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f1062a;
    public final org.telegram.ui.ActionBar.g6 f1063b;
    public final TextView f1064c;
    public final w90 d;
    public ag.b e;
    public final vq[] f1065f;

    public c(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        this(context, i10, ag.b.f633a, g6Var);
    }

    public final void a() {
        ag.b bVar = this.e;
        int i10 = this.f1062a;
        ag.a s10 = ha.x(i10, bVar).s();
        ag.b bVar2 = this.e;
        ag.b bVar3 = ag.b.f633a;
        TextView textView = this.f1064c;
        org.telegram.ui.ActionBar.g6 g6Var = this.f1063b;
        w90 w90Var = this.d;
        if (bVar2 == bVar3) {
            textView.setText(nd.Y0(false, LocaleController.formatString(R.string.Gift2MessageStarsInfo, LocaleController.formatNumber(s10.a(), ',')), 0.6f, null));
            int i11 = org.telegram.ui.ActionBar.k6.Gi;
            org.telegram.ui.ActionBar.r6.W(w90Var, i11, g6Var);
            org.telegram.ui.ActionBar.r6.I(w90Var, i11, g6Var);
            w90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new a3.d(this, 6)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        } else if (bVar2 == ag.b.f634b) {
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2MessageStarsInfoTON, s10.b()));
            vq[] vqVarArr = this.f1065f;
            textView.setText(nd.Y0(true, replaceTags, 0.6f, vqVarArr));
            vqVarArr[0].setColorKey(org.telegram.ui.ActionBar.k6.Gi);
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            sb2.append(BillingController.getInstance().formatCurrency((long) (MessagesController.getInstance(i10).config.tonUsdRate.get() * s10.c() * 100.0d), "USD", 2));
            int i12 = org.telegram.ui.ActionBar.k6.Hi;
            int i13 = org.telegram.ui.ActionBar.k6.Fi;
            org.telegram.ui.ActionBar.r6.n(w90Var, i12, i13, 3, 0.33f, g6Var);
            org.telegram.ui.ActionBar.r6.o(w90Var, 2, i12, i13, 3, 0.33f, g6Var);
            w90Var.setText(sb2);
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
        int i10 = this.f1062a;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f1062a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    public c(Context context, int i10, ag.b bVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f1065f = new vq[1];
        this.f1062a = i10;
        this.f1063b = g6Var;
        this.e = bVar;
        setOrientation(1);
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
        int dp = AndroidUtilities.dp(24.0f);
        int i11 = org.telegram.ui.ActionBar.k6.Fi;
        Drawable c02 = org.telegram.ui.ActionBar.k6.c0(dp, org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i11);
        setBackground(c02);
        org.telegram.ui.ActionBar.r6.k(this, c02, O, null, g6Var);
        TextView textView = new TextView(context);
        this.f1064c = textView;
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.Hi, g6Var);
        textView.setGravity(17);
        addView(textView, w7.z5.p(-2, -2, 0.0f, 17, 0, 0, 0, 0));
        w90 w90Var = new w90(context, g6Var);
        this.d = w90Var;
        w90Var.setTextSize(1, 12.0f);
        w90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new b(context, 0, g6Var)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        w90Var.setGravity(17);
        addView(w90Var, w7.z5.p(-2, -2, 0.0f, 17, 0, 1, 0, 0));
        a();
    }
}
