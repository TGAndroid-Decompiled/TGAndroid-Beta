package bi;

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
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.z90;
import org.telegram.ui.Components.zq;
public final class c extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f4408a;
    public final org.telegram.ui.ActionBar.u6 f4409b;
    public final TextView f4410c;
    public final z90 d;
    public bg.b e;
    public final zq[] f4411f;

    public c(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        this(context, i10, bg.b.f3980a, u6Var);
    }

    public final void a() {
        bg.b bVar = this.e;
        int i10 = this.f4408a;
        bg.a s10 = ca.x(i10, bVar).s();
        bg.b bVar2 = this.e;
        bg.b bVar3 = bg.b.f3980a;
        TextView textView = this.f4410c;
        org.telegram.ui.ActionBar.u6 u6Var = this.f4409b;
        z90 z90Var = this.d;
        if (bVar2 == bVar3) {
            textView.setText(dd.W0(false, LocaleController.formatString(R.string.Gift2MessageStarsInfo, LocaleController.formatNumber(s10.a(), ',')), 0.6f, null));
            int i11 = org.telegram.ui.ActionBar.y6.Gi;
            org.telegram.ui.ActionBar.f7.V(z90Var, i11, u6Var);
            org.telegram.ui.ActionBar.f7.H(z90Var, i11, u6Var);
            z90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new a3.d(this, 16)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        } else if (bVar2 == bg.b.f3981b) {
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2MessageStarsInfoTON, s10.b()));
            zq[] zqVarArr = this.f4411f;
            textView.setText(dd.W0(true, replaceTags, 0.6f, zqVarArr));
            zqVarArr[0].setColorKey(org.telegram.ui.ActionBar.y6.Gi);
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            sb2.append(BillingController.getInstance().formatCurrency((long) (MessagesController.getInstance(i10).config.tonUsdRate.get() * s10.c() * 100.0d), "USD", 2));
            int i12 = org.telegram.ui.ActionBar.y6.Hi;
            int i13 = org.telegram.ui.ActionBar.y6.Fi;
            org.telegram.ui.ActionBar.f7.n(z90Var, i12, i13, 3, 0.33f, u6Var);
            org.telegram.ui.ActionBar.f7.o(z90Var, 2, i12, i13, 3, 0.33f, u6Var);
            z90Var.setText(sb2);
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
        int i10 = this.f4408a;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f4408a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    public c(Context context, int i10, bg.b bVar, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f4411f = new zq[1];
        this.f4408a = i10;
        this.f4409b = u6Var;
        this.e = bVar;
        setOrientation(1);
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
        int dp = AndroidUtilities.dp(24.0f);
        int i11 = org.telegram.ui.ActionBar.y6.Fi;
        Drawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
        setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(this, c02, N, null, u6Var);
        TextView textView = new TextView(context);
        this.f4410c = textView;
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.Hi, u6Var);
        textView.setGravity(17);
        addView(textView, gb1.t(-2, -2, 0.0f, 17, 0, 0, 0, 0));
        z90 z90Var = new z90(context, u6Var);
        this.d = z90Var;
        z90Var.setTextSize(1, 12.0f);
        z90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new b(context, 0, u6Var)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        z90Var.setGravity(17);
        addView(z90Var, gb1.t(-2, -2, 0.0f, 17, 0, 1, 0, 0));
        a();
    }
}
