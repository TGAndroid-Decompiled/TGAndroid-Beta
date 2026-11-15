package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import c8.ja;
import di.lb;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.t8;
public final class w extends LinearLayout implements is {
    public final i9 f3949a;
    public final org.telegram.ui.Components.h6 f3950b;
    public final org.telegram.ui.Components.h6 f3951c;
    public final org.telegram.ui.Components.h6 d;
    public final eq[] f3952e;
    public boolean f3953f;

    public w(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f3952e = new eq[1];
        setOrientation(0);
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, false, false);
        this.f3951c = h6Var;
        int i7 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.Y(h6Var, i7, e6Var);
        h6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        h6Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        h6Var.setEllipsizeByGradient(true);
        org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(context, false, false, false);
        this.d = h6Var2;
        org.telegram.ui.ActionBar.q6.Y(h6Var2, org.telegram.ui.ActionBar.j6.f29241y6, e6Var);
        h6Var2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        i9 i9Var = new i9(context);
        this.f3949a = i9Var;
        org.telegram.ui.Components.h6 h6Var3 = new org.telegram.ui.Components.h6(context, false, false, false);
        this.f3950b = h6Var3;
        h6Var3.setTextSize(org.telegram.messenger.g0.L(15.0f));
        h6Var3.setPadding(org.telegram.messenger.g0.L(20.0f), 0, 0, 0);
        org.telegram.ui.ActionBar.q6.Y(h6Var3, i7, e6Var);
        h6Var3.setTypeface(org.telegram.messenger.g0.o());
        h6Var3.setGravity(17);
        addView(h6Var3, ja.p(66, -2, 0.0f, 16));
        addView(i9Var, ja.p(32, 32, 0.0f, 16));
        addView(h6Var, ja.p(0, -2, 1.0f, 16));
        addView(h6Var2, ja.q(-2, -2, 0.0f, 16, 0, 0, 20, 0));
    }

    public final void a(long j3, boolean z10) {
        this.d.c(lb.a1(false, i5.c.l((int) j3, ',', new StringBuilder("⭐️")), 0.78f, this.f3952e), z10, true);
    }

    public final void b(int i7, boolean z10, boolean z11) {
        org.telegram.ui.Components.h6 h6Var = this.f3950b;
        if (z10 && i7 <= 3) {
            if (i7 == 1) {
                h6Var.c(org.telegram.messenger.j6.o("🥇", h6Var.getPaint().getFontMetricsInt(), 20, null), z11, true);
                return;
            } else if (i7 == 2) {
                h6Var.c(org.telegram.messenger.j6.o("🥈", h6Var.getPaint().getFontMetricsInt(), 20, null), z11, true);
                return;
            } else if (i7 == 3) {
                h6Var.c(org.telegram.messenger.j6.o("🥉", h6Var.getPaint().getFontMetricsInt(), 20, null), z11, true);
                return;
            } else {
                return;
            }
        }
        if (i7 >= 10000) {
            h6Var.setTextSize(org.telegram.messenger.g0.L(12.0f));
        } else if (i7 >= 1000) {
            h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        } else {
            h6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        }
        h6Var.c(Integer.toString(i7), z11, true);
    }

    public final void c(TLRPC.User user) {
        t8 t8Var = new t8((org.telegram.ui.ActionBar.e6) null);
        t8Var.r(user);
        i9 i9Var = this.f3949a;
        i9Var.f(user, t8Var);
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
        this.f3951c.setText(q10.p(user));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        this.f3950b.invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f3953f) {
            canvas.drawLine(org.telegram.messenger.g0.L(112.0f), getMeasuredHeight() - 1, getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f), getMeasuredHeight(), org.telegram.ui.ActionBar.j6.f28972k0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ns.e().c(this, ns.f25515i4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ns.e().n(this, ns.f25515i4);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(52.0f), 1073741824));
    }
}
