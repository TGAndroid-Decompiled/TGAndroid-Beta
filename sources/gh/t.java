package gh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import hh.oa;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.y8;

public final class t extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {

    public final n9 f7526a;

    public final org.telegram.ui.Components.j6 f7527b;

    public final org.telegram.ui.Components.j6 f7528c;
    public final org.telegram.ui.Components.j6 d;

    public final cq[] f7529e;

    public boolean f7530f;

    public t(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f7529e = new cq[1];
        setOrientation(0);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
        this.f7528c = j6Var;
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        j6Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        j6Var.setTextSize(AndroidUtilities.dp(15.0f));
        j6Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        j6Var.setEllipsizeByGradient(true);
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(context, false, false, false);
        this.d = j6Var2;
        j6Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23423y6, c6Var));
        j6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        n9 n9Var = new n9(context);
        this.f7526a = n9Var;
        org.telegram.ui.Components.j6 j6Var3 = new org.telegram.ui.Components.j6(context, false, false, false);
        this.f7527b = j6Var3;
        j6Var3.setTextSize(AndroidUtilities.dp(15.0f));
        j6Var3.setPadding(AndroidUtilities.dp(20.0f), 0, 0, 0);
        j6Var3.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        j6Var3.setTypeface(AndroidUtilities.bold());
        j6Var3.setGravity(17);
        addView(j6Var3, h7.z5.o(66, -2, 0.0f, 16));
        addView(n9Var, h7.z5.o(32, 32, 0.0f, 16));
        addView(j6Var, h7.z5.o(0, -2, 1.0f, 16));
        addView(j6Var2, h7.z5.p(-2, -2, 0.0f, 16, 0, 0, 20, 0));
    }

    public final void a(long j10, boolean z10) {
        this.d.c(oa.X0(false, i0.a.m((int) j10, ',', new StringBuilder("⭐️")), 0.78f, this.f7529e), z10, true);
    }

    public final void b(int i10, boolean z10, boolean z11) {
        org.telegram.ui.Components.j6 j6Var = this.f7527b;
        if (!z10 || i10 > 3) {
            if (i10 >= 10000) {
                j6Var.setTextSize(AndroidUtilities.dp(12.0f));
            } else if (i10 >= 1000) {
                j6Var.setTextSize(AndroidUtilities.dp(14.0f));
            } else {
                j6Var.setTextSize(AndroidUtilities.dp(15.0f));
            }
            j6Var.c(Integer.toString(i10), z11, true);
            return;
        }
        if (i10 == 1) {
            j6Var.c(Emoji.replaceWithRestrictedEmoji("🥇", j6Var.getPaint().getFontMetricsInt(), (Runnable) null), z11, true);
        } else if (i10 == 2) {
            j6Var.c(Emoji.replaceWithRestrictedEmoji("🥈", j6Var.getPaint().getFontMetricsInt(), (Runnable) null), z11, true);
        } else if (i10 == 3) {
            j6Var.c(Emoji.replaceWithRestrictedEmoji("🥉", j6Var.getPaint().getFontMetricsInt(), (Runnable) null), z11, true);
        }
    }

    public final void c(TLRPC.User user) {
        y8 y8Var = new y8((org.telegram.ui.ActionBar.c6) null);
        y8Var.r(user);
        n9 n9Var = this.f7526a;
        n9Var.e(user, y8Var);
        n9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        this.f7528c.setText(UserObject.getUserName(user));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        this.f7527b.invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f7530f) {
            canvas.drawLine(AndroidUtilities.dp(112.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(16.0f), getMeasuredHeight(), org.telegram.ui.ActionBar.g6.f23175k0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }
}
