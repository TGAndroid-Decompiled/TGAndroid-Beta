package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import c8.na;
import di.pb;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.p9;
public final class w extends LinearLayout implements fs {
    public final p9 f4163a;
    public final org.telegram.ui.Components.n6 f4164b;
    public final org.telegram.ui.Components.n6 f4165c;
    public final org.telegram.ui.Components.n6 d;
    public final kq[] f4166e;
    public boolean f4167f;

    public w(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f4166e = new kq[1];
        setOrientation(0);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, false, false, false);
        this.f4165c = n6Var;
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.Y(n6Var, i7, i6Var);
        n6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        n6Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        n6Var.setEllipsizeByGradient(true);
        org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(context, false, false, false);
        this.d = n6Var2;
        org.telegram.ui.ActionBar.u6.Y(n6Var2, org.telegram.ui.ActionBar.n6.f29843y6, i6Var);
        n6Var2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        p9 p9Var = new p9(context);
        this.f4163a = p9Var;
        org.telegram.ui.Components.n6 n6Var3 = new org.telegram.ui.Components.n6(context, false, false, false);
        this.f4164b = n6Var3;
        n6Var3.setTextSize(org.telegram.messenger.g0.L(15.0f));
        n6Var3.setPadding(org.telegram.messenger.g0.L(20.0f), 0, 0, 0);
        org.telegram.ui.ActionBar.u6.Y(n6Var3, i7, i6Var);
        n6Var3.setTypeface(org.telegram.messenger.g0.o());
        n6Var3.setGravity(17);
        addView(n6Var3, na.p(66, -2, 0.0f, 16));
        addView(p9Var, na.p(32, 32, 0.0f, 16));
        addView(n6Var, na.p(0, -2, 1.0f, 16));
        addView(n6Var2, na.q(-2, -2, 0.0f, 16, 0, 0, 20, 0));
    }

    public final void a(long j3, boolean z10) {
        this.d.c(pb.b1(false, i5.c.l((int) j3, ',', new StringBuilder("⭐️")), 0.78f, this.f4166e), z10, true);
    }

    public final void b(int i7, boolean z10, boolean z11) {
        org.telegram.ui.Components.n6 n6Var = this.f4164b;
        if (z10 && i7 <= 3) {
            if (i7 == 1) {
                n6Var.c(org.telegram.messenger.j6.o("🥇", n6Var.getPaint().getFontMetricsInt(), 20, null), z11, true);
                return;
            } else if (i7 == 2) {
                n6Var.c(org.telegram.messenger.j6.o("🥈", n6Var.getPaint().getFontMetricsInt(), 20, null), z11, true);
                return;
            } else if (i7 == 3) {
                n6Var.c(org.telegram.messenger.j6.o("🥉", n6Var.getPaint().getFontMetricsInt(), 20, null), z11, true);
                return;
            } else {
                return;
            }
        }
        if (i7 >= 10000) {
            n6Var.setTextSize(org.telegram.messenger.g0.L(12.0f));
        } else if (i7 >= 1000) {
            n6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        } else {
            n6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        }
        n6Var.c(Integer.toString(i7), z11, true);
    }

    public final void c(TLRPC.User user) {
        org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        a9Var.r(user);
        p9 p9Var = this.f4163a;
        p9Var.f(user, a9Var);
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
        this.f4165c.setText(n10.q(user));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        this.f4164b.invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f4167f) {
            canvas.drawLine(org.telegram.messenger.g0.L(112.0f), getMeasuredHeight() - 1, getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f), getMeasuredHeight(), org.telegram.ui.ActionBar.n6.f29574k0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.e().c(this, ks.f25247l4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.e().n(this, ks.f25247l4);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(52.0f), 1073741824));
    }
}
