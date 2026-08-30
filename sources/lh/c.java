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
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.mq;
public final class c extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f12197a;
    public final org.telegram.ui.ActionBar.f6 f12198b;
    public final TextView f12199c;
    public final e90 d;
    public mf.b e;
    public final mq[] f12200f;

    public c(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, i10, mf.b.f13930a, f6Var);
    }

    public final void a() {
        mf.b bVar = this.e;
        int i10 = this.f12197a;
        mf.a s6 = t7.x(i10, bVar).s();
        mf.b bVar2 = this.e;
        mf.b bVar3 = mf.b.f13930a;
        TextView textView = this.f12199c;
        org.telegram.ui.ActionBar.f6 f6Var = this.f12198b;
        e90 e90Var = this.d;
        if (bVar2 == bVar3) {
            textView.setText(ja.X0(false, LocaleController.formatString(R.string.Gift2MessageStarsInfo, LocaleController.formatNumber(s6.a(), ',')), 0.6f, null));
            int i11 = org.telegram.ui.ActionBar.j6.Gi;
            e90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
            e90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
            e90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new b(this, 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        } else if (bVar2 == mf.b.f13931b) {
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2MessageStarsInfoTON, s6.b()));
            mq[] mqVarArr = this.f12200f;
            textView.setText(ja.X0(true, replaceTags, 0.6f, mqVarArr));
            mqVarArr[0].setColorKey(org.telegram.ui.ActionBar.j6.Gi);
            StringBuilder sb = new StringBuilder(10);
            sb.append('~');
            sb.append(BillingController.getInstance().formatCurrency((long) (MessagesController.getInstance(i10).config.tonUsdRate.get() * s6.c() * 100.0d), "USD", 2));
            int i12 = org.telegram.ui.ActionBar.j6.Hi;
            int v02 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
            int i13 = org.telegram.ui.ActionBar.j6.Fi;
            e90Var.setTextColor(i0.a.d(0.33f, v02, org.telegram.ui.ActionBar.j6.v0(i13, f6Var)));
            e90Var.setLinkTextColor(i0.a.d(0.33f, org.telegram.ui.ActionBar.j6.v0(i12, f6Var), org.telegram.ui.ActionBar.j6.v0(i13, f6Var)));
            e90Var.setText(sb);
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
        int i10 = this.f12197a;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f12197a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    public c(Context context, int i10, mf.b bVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f12200f = new mq[1];
        this.f12197a = i10;
        this.f12198b = f6Var;
        this.e = bVar;
        setOrientation(1);
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
        setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Fi, f6Var)));
        TextView textView = new TextView(context);
        this.f12199c = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Hi, f6Var));
        textView.setGravity(17);
        addView(textView, k7.b6.p(-2, -2, 0.0f, 17, 0, 0, 0, 0));
        e90 e90Var = new e90(context, f6Var);
        this.d = e90Var;
        e90Var.setTextSize(1, 12.0f);
        e90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new a(context, f6Var)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        e90Var.setGravity(17);
        addView(e90Var, k7.b6.p(-2, -2, 0.0f, 17, 0, 1, 0, 0));
        a();
    }
}
