package lh;

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
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.lq;
public final class c extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f12181a;
    public final org.telegram.ui.ActionBar.f6 f12182b;
    public final TextView f12183c;
    public final f90 d;
    public lf.b e;
    public final lq[] f12184f;

    public c(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, i10, lf.b.f12056a, f6Var);
    }

    public final void a() {
        lf.b bVar = this.e;
        int i10 = this.f12181a;
        lf.a s6 = t7.x(i10, bVar).s();
        lf.b bVar2 = this.e;
        lf.b bVar3 = lf.b.f12056a;
        TextView textView = this.f12183c;
        org.telegram.ui.ActionBar.f6 f6Var = this.f12182b;
        f90 f90Var = this.d;
        if (bVar2 == bVar3) {
            textView.setText(ja.X0(false, LocaleController.formatString(R.string.Gift2MessageStarsInfo, LocaleController.formatNumber(s6.a(), ',')), 0.6f, null));
            int i11 = org.telegram.ui.ActionBar.j6.Gi;
            f90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
            f90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
            f90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new b(this, 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        } else if (bVar2 == lf.b.f12057b) {
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2MessageStarsInfoTON, s6.b()));
            lq[] lqVarArr = this.f12184f;
            textView.setText(ja.X0(true, replaceTags, 0.6f, lqVarArr));
            lqVarArr[0].setColorKey(org.telegram.ui.ActionBar.j6.Gi);
            StringBuilder sb = new StringBuilder(10);
            sb.append('~');
            sb.append(BillingController.getInstance().formatCurrency((long) (MessagesController.getInstance(i10).config.tonUsdRate.get() * s6.c() * 100.0d), "USD", 2));
            int i12 = org.telegram.ui.ActionBar.j6.Hi;
            int v02 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
            int i13 = org.telegram.ui.ActionBar.j6.Fi;
            f90Var.setTextColor(i0.a.d(0.33f, v02, org.telegram.ui.ActionBar.j6.v0(i13, f6Var)));
            f90Var.setLinkTextColor(i0.a.d(0.33f, org.telegram.ui.ActionBar.j6.v0(i12, f6Var), org.telegram.ui.ActionBar.j6.v0(i13, f6Var)));
            f90Var.setText(sb);
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
        int i10 = this.f12181a;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f12181a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    public c(Context context, int i10, lf.b bVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f12184f = new lq[1];
        this.f12181a = i10;
        this.f12182b = f6Var;
        this.e = bVar;
        setOrientation(1);
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
        setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Fi, f6Var)));
        TextView textView = new TextView(context);
        this.f12183c = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Hi, f6Var));
        textView.setGravity(17);
        addView(textView, k7.b6.p(-2, -2, 0.0f, 17, 0, 0, 0, 0));
        f90 f90Var = new f90(context, f6Var);
        this.d = f90Var;
        f90Var.setTextSize(1, 12.0f);
        f90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new a(context, f6Var)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        f90Var.setGravity(17);
        addView(f90Var, k7.b6.p(-2, -2, 0.0f, 17, 0, 1, 0, 0));
        a();
    }
}
