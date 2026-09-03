package mh;

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
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.oq;
public final class b extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f13718a;
    public final org.telegram.ui.ActionBar.g6 f13719b;
    public final TextView f13720c;
    public final g90 d;
    public mf.b f13721e;
    public final oq[] f13722f;

    public b(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        this(context, i10, mf.b.f13653a, g6Var);
    }

    public final void a() {
        mf.b bVar = this.f13721e;
        int i10 = this.f13718a;
        mf.a s6 = t7.x(i10, bVar).s();
        mf.b bVar2 = this.f13721e;
        mf.b bVar3 = mf.b.f13653a;
        TextView textView = this.f13720c;
        org.telegram.ui.ActionBar.g6 g6Var = this.f13719b;
        g90 g90Var = this.d;
        if (bVar2 == bVar3) {
            textView.setText(ja.X0(false, LocaleController.formatString(R.string.Gift2MessageStarsInfo, LocaleController.formatNumber(s6.a(), ',')), 0.6f, null));
            int i11 = org.telegram.ui.ActionBar.k6.Gi;
            g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
            g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
            g90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new lh.c3(this, 1)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        } else if (bVar2 == mf.b.f13654b) {
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2MessageStarsInfoTON, s6.b()));
            oq[] oqVarArr = this.f13722f;
            textView.setText(ja.X0(true, replaceTags, 0.6f, oqVarArr));
            oqVarArr[0].setColorKey(org.telegram.ui.ActionBar.k6.Gi);
            StringBuilder sb = new StringBuilder(10);
            sb.append('~');
            sb.append(BillingController.getInstance().formatCurrency((long) (MessagesController.getInstance(i10).config.tonUsdRate.get() * s6.c() * 100.0d), "USD", 2));
            int i12 = org.telegram.ui.ActionBar.k6.Hi;
            int v02 = org.telegram.ui.ActionBar.k6.v0(i12, g6Var);
            int i13 = org.telegram.ui.ActionBar.k6.Fi;
            g90Var.setTextColor(i0.a.d(0.33f, v02, org.telegram.ui.ActionBar.k6.v0(i13, g6Var)));
            g90Var.setLinkTextColor(i0.a.d(0.33f, org.telegram.ui.ActionBar.k6.v0(i12, g6Var), org.telegram.ui.ActionBar.k6.v0(i13, g6Var)));
            g90Var.setText(sb);
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
        int i10 = this.f13718a;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f13718a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    public b(Context context, int i10, mf.b bVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f13722f = new oq[1];
        this.f13718a = i10;
        this.f13719b = g6Var;
        this.f13721e = bVar;
        setOrientation(1);
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
        setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Fi, g6Var)));
        TextView textView = new TextView(context);
        this.f13720c = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Hi, g6Var));
        textView.setGravity(17);
        addView(textView, k7.c6.p(-2, -2, 0.0f, 17, 0, 0, 0, 0));
        g90 g90Var = new g90(context, g6Var);
        this.d = g90Var;
        g90Var.setTextSize(1, 12.0f);
        g90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new a(context, g6Var)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        g90Var.setGravity(17);
        addView(g90Var, k7.c6.p(-2, -2, 0.0f, 17, 0, 1, 0, 0));
        a();
    }
}
