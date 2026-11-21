package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import c8.ma;
import di.pb;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.q9;
public final class w extends LinearLayout implements fs {
    public final q9 f4193a;
    public final org.telegram.ui.Components.o6 f4194b;
    public final org.telegram.ui.Components.o6 f4195c;
    public final org.telegram.ui.Components.o6 d;
    public final nq[] f4196e;
    public boolean f4197f;

    public w(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f4196e = new nq[1];
        setOrientation(0);
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
        this.f4195c = o6Var;
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.Y(o6Var, i7, h6Var);
        o6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        o6Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        o6Var.setEllipsizeByGradient(true);
        org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(context, false, false, false);
        this.d = o6Var2;
        org.telegram.ui.ActionBar.t6.Y(o6Var2, org.telegram.ui.ActionBar.m6.f29770y6, h6Var);
        o6Var2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        q9 q9Var = new q9(context);
        this.f4193a = q9Var;
        org.telegram.ui.Components.o6 o6Var3 = new org.telegram.ui.Components.o6(context, false, false, false);
        this.f4194b = o6Var3;
        o6Var3.setTextSize(org.telegram.messenger.g0.L(15.0f));
        o6Var3.setPadding(org.telegram.messenger.g0.L(20.0f), 0, 0, 0);
        org.telegram.ui.ActionBar.t6.Y(o6Var3, i7, h6Var);
        o6Var3.setTypeface(org.telegram.messenger.g0.o());
        o6Var3.setGravity(17);
        addView(o6Var3, ma.p(66, -2, 0.0f, 16));
        addView(q9Var, ma.p(32, 32, 0.0f, 16));
        addView(o6Var, ma.p(0, -2, 1.0f, 16));
        addView(o6Var2, ma.q(-2, -2, 0.0f, 16, 0, 0, 20, 0));
    }

    public final void a(long j3, boolean z10) {
        this.d.c(pb.b1(false, i5.c.l((int) j3, ',', new StringBuilder("⭐️")), 0.78f, this.f4196e), z10, true);
    }

    public final void b(int i7, boolean z10, boolean z11) {
        org.telegram.ui.Components.o6 o6Var = this.f4194b;
        if (z10 && i7 <= 3) {
            if (i7 == 1) {
                o6Var.c(org.telegram.messenger.j6.o("🥇", o6Var.getPaint().getFontMetricsInt(), 20, null), z11, true);
                return;
            } else if (i7 == 2) {
                o6Var.c(org.telegram.messenger.j6.o("🥈", o6Var.getPaint().getFontMetricsInt(), 20, null), z11, true);
                return;
            } else if (i7 == 3) {
                o6Var.c(org.telegram.messenger.j6.o("🥉", o6Var.getPaint().getFontMetricsInt(), 20, null), z11, true);
                return;
            } else {
                return;
            }
        }
        if (i7 >= 10000) {
            o6Var.setTextSize(org.telegram.messenger.g0.L(12.0f));
        } else if (i7 >= 1000) {
            o6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        } else {
            o6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        }
        o6Var.c(Integer.toString(i7), z11, true);
    }

    public final void c(TLRPC.User user) {
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        b9Var.r(user);
        q9 q9Var = this.f4193a;
        q9Var.f(user, b9Var);
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
        this.f4195c.setText(o10.q(user));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        this.f4194b.invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f4197f) {
            canvas.drawLine(org.telegram.messenger.g0.L(112.0f), getMeasuredHeight() - 1, getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f), getMeasuredHeight(), org.telegram.ui.ActionBar.m6.f29501k0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.e().c(this, ks.f25176l4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.e().n(this, ks.f25176l4);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(52.0f), 1073741824));
    }
}
