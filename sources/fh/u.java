package fh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import gh.oa;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.z8;
public final class u extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final o9 f6771a;
    public final org.telegram.ui.Components.j6 f6772b;
    public final org.telegram.ui.Components.j6 f6773c;
    public final org.telegram.ui.Components.j6 d;
    public final eq[] f6774e;
    public boolean f6775f;

    public u(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f6774e = new eq[1];
        setOrientation(0);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
        this.f6773c = j6Var;
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        j6Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        j6Var.setTextSize(AndroidUtilities.dp(15.0f));
        j6Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        j6Var.setEllipsizeByGradient(true);
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(context, false, false, false);
        this.d = j6Var2;
        j6Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23369y6, b6Var));
        j6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        o9 o9Var = new o9(context);
        this.f6771a = o9Var;
        org.telegram.ui.Components.j6 j6Var3 = new org.telegram.ui.Components.j6(context, false, false, false);
        this.f6772b = j6Var3;
        j6Var3.setTextSize(AndroidUtilities.dp(15.0f));
        j6Var3.setPadding(AndroidUtilities.dp(20.0f), 0, 0, 0);
        j6Var3.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        j6Var3.setTypeface(AndroidUtilities.bold());
        j6Var3.setGravity(17);
        addView(j6Var3, g7.e6.o(66, -2, 0.0f, 16));
        addView(o9Var, g7.e6.o(32, 32, 0.0f, 16));
        addView(j6Var, g7.e6.o(0, -2, 1.0f, 16));
        addView(j6Var2, g7.e6.p(-2, -2, 0.0f, 16, 0, 0, 20, 0));
    }

    public final void a(long j10, boolean z10) {
        this.d.c(oa.X0(false, j3.r0.n((int) j10, ',', new StringBuilder("⭐️")), 0.78f, this.f6774e), z10, true);
    }

    public final void b(int i9, boolean z10, boolean z11) {
        org.telegram.ui.Components.j6 j6Var = this.f6772b;
        if (z10 && i9 <= 3) {
            if (i9 == 1) {
                j6Var.c(Emoji.replaceWithRestrictedEmoji("🥇", j6Var.getPaint().getFontMetricsInt(), (Runnable) null), z11, true);
                return;
            } else if (i9 == 2) {
                j6Var.c(Emoji.replaceWithRestrictedEmoji("🥈", j6Var.getPaint().getFontMetricsInt(), (Runnable) null), z11, true);
                return;
            } else if (i9 == 3) {
                j6Var.c(Emoji.replaceWithRestrictedEmoji("🥉", j6Var.getPaint().getFontMetricsInt(), (Runnable) null), z11, true);
                return;
            } else {
                return;
            }
        }
        if (i9 >= 10000) {
            j6Var.setTextSize(AndroidUtilities.dp(12.0f));
        } else if (i9 >= 1000) {
            j6Var.setTextSize(AndroidUtilities.dp(14.0f));
        } else {
            j6Var.setTextSize(AndroidUtilities.dp(15.0f));
        }
        j6Var.c(Integer.toString(i9), z11, true);
    }

    public final void c(TLRPC.User user) {
        z8 z8Var = new z8((org.telegram.ui.ActionBar.b6) null);
        z8Var.r(user);
        o9 o9Var = this.f6771a;
        o9Var.e(user, z8Var);
        o9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        this.f6773c.setText(UserObject.getUserName(user));
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        this.f6772b.invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f6775f) {
            canvas.drawLine(AndroidUtilities.dp(112.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(16.0f), getMeasuredHeight(), org.telegram.ui.ActionBar.f6.f23121k0);
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
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }
}
