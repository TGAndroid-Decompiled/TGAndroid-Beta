package ih;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import jh.ia;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.t9;
public final class r extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final t9 f9345a;
    public final o6 f9346b;
    public final o6 f9347c;
    public final o6 d;
    public final iq[] f9348e;
    public boolean f9349f;

    public r(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f9348e = new iq[1];
        setOrientation(0);
        o6 o6Var = new o6(context, false, false, false);
        this.f9347c = o6Var;
        int i10 = g6.G6;
        o6Var.setTextColor(g6.v0(i10, c6Var));
        o6Var.setTextSize(AndroidUtilities.dp(15.0f));
        o6Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        o6Var.setEllipsizeByGradient(true);
        o6 o6Var2 = new o6(context, false, false, false);
        this.d = o6Var2;
        o6Var2.setTextColor(g6.v0(g6.f23433y6, c6Var));
        o6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        t9 t9Var = new t9(context);
        this.f9345a = t9Var;
        o6 o6Var3 = new o6(context, false, false, false);
        this.f9346b = o6Var3;
        o6Var3.setTextSize(AndroidUtilities.dp(15.0f));
        o6Var3.setPadding(AndroidUtilities.dp(20.0f), 0, 0, 0);
        o6Var3.setTextColor(g6.v0(i10, c6Var));
        o6Var3.setTypeface(AndroidUtilities.bold());
        o6Var3.setGravity(17);
        addView(o6Var3, i7.f6.o(66, -2, 0.0f, 16));
        addView(t9Var, i7.f6.o(32, 32, 0.0f, 16));
        addView(o6Var, i7.f6.o(0, -2, 1.0f, 16));
        addView(o6Var2, i7.f6.p(-2, -2, 0.0f, 16, 0, 0, 20, 0));
    }

    public final void a(long j10, boolean z10) {
        this.d.c(ia.X0(false, j7.l1.m((int) j10, ',', new StringBuilder("⭐️")), 0.78f, this.f9348e), z10, true);
    }

    public final void b(int i10, boolean z10, boolean z11) {
        o6 o6Var = this.f9346b;
        if (z10 && i10 <= 3) {
            if (i10 == 1) {
                o6Var.c(Emoji.replaceWithRestrictedEmoji("🥇", o6Var.getPaint().getFontMetricsInt(), (Runnable) null), z11, true);
                return;
            } else if (i10 == 2) {
                o6Var.c(Emoji.replaceWithRestrictedEmoji("🥈", o6Var.getPaint().getFontMetricsInt(), (Runnable) null), z11, true);
                return;
            } else if (i10 == 3) {
                o6Var.c(Emoji.replaceWithRestrictedEmoji("🥉", o6Var.getPaint().getFontMetricsInt(), (Runnable) null), z11, true);
                return;
            } else {
                return;
            }
        }
        if (i10 >= 10000) {
            o6Var.setTextSize(AndroidUtilities.dp(12.0f));
        } else if (i10 >= 1000) {
            o6Var.setTextSize(AndroidUtilities.dp(14.0f));
        } else {
            o6Var.setTextSize(AndroidUtilities.dp(15.0f));
        }
        o6Var.c(Integer.toString(i10), z11, true);
    }

    public final void c(TLRPC.User user) {
        e9 e9Var = new e9((org.telegram.ui.ActionBar.c6) null);
        e9Var.r(user);
        t9 t9Var = this.f9345a;
        t9Var.e(user, e9Var);
        t9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        this.f9347c.setText(UserObject.getUserName(user));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        this.f9346b.invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f9349f) {
            canvas.drawLine(AndroidUtilities.dp(112.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(16.0f), getMeasuredHeight(), g6.f23183k0);
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
