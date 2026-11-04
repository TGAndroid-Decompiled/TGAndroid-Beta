package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import b8.mf;
import ci.wb;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.wp;
public final class b0 extends LinearLayout implements cs {
    public final k9 f500a;
    public final org.telegram.ui.Components.h6 f501b;
    public final org.telegram.ui.Components.h6 f502c;
    public final org.telegram.ui.Components.h6 d;
    public final wp[] f503e;
    public boolean f504f;

    public b0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f503e = new wp[1];
        setOrientation(0);
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, false, false);
        this.f502c = h6Var;
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.Z(h6Var, i3, e6Var);
        h6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        h6Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        h6Var.setEllipsizeByGradient(true);
        org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(context, false, false, false);
        this.d = h6Var2;
        org.telegram.ui.ActionBar.r6.Z(h6Var2, org.telegram.ui.ActionBar.k6.f28273y6, e6Var);
        h6Var2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        k9 k9Var = new k9(context);
        this.f500a = k9Var;
        org.telegram.ui.Components.h6 h6Var3 = new org.telegram.ui.Components.h6(context, false, false, false);
        this.f501b = h6Var3;
        h6Var3.setTextSize(org.telegram.messenger.g0.L(15.0f));
        h6Var3.setPadding(org.telegram.messenger.g0.L(20.0f), 0, 0, 0);
        org.telegram.ui.ActionBar.r6.Z(h6Var3, i3, e6Var);
        h6Var3.setTypeface(org.telegram.messenger.g0.o());
        h6Var3.setGravity(17);
        addView(h6Var3, mf.p(66, -2, 0.0f, 16));
        addView(k9Var, mf.p(32, 32, 0.0f, 16));
        addView(h6Var, mf.p(0, -2, 1.0f, 16));
        addView(h6Var2, mf.q(-2, -2, 0.0f, 16, 0, 0, 20, 0));
    }

    public final void a(long j10, boolean z10) {
        this.d.c(wb.a1(false, k2.p1.l((int) j10, ',', new StringBuilder("⭐️")), 0.78f, this.f503e), z10, true);
    }

    public final void b(int i3, boolean z10, boolean z11) {
        org.telegram.ui.Components.h6 h6Var = this.f501b;
        if (z10 && i3 <= 3) {
            if (i3 == 1) {
                h6Var.c(org.telegram.messenger.i6.o("🥇", h6Var.getPaint().getFontMetricsInt(), 20, null), z11, true);
                return;
            } else if (i3 == 2) {
                h6Var.c(org.telegram.messenger.i6.o("🥈", h6Var.getPaint().getFontMetricsInt(), 20, null), z11, true);
                return;
            } else if (i3 == 3) {
                h6Var.c(org.telegram.messenger.i6.o("🥉", h6Var.getPaint().getFontMetricsInt(), 20, null), z11, true);
                return;
            } else {
                return;
            }
        }
        if (i3 >= 10000) {
            h6Var.setTextSize(org.telegram.messenger.g0.L(12.0f));
        } else if (i3 >= 1000) {
            h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        } else {
            h6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        }
        h6Var.c(Integer.toString(i3), z11, true);
    }

    public final void c(TLRPC.User user) {
        u8 u8Var = new u8((org.telegram.ui.ActionBar.e6) null);
        u8Var.r(user);
        k9 k9Var = this.f500a;
        k9Var.e(user, u8Var);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
        this.f502c.setText(l10.p(user));
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        this.f501b.invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f504f) {
            canvas.drawLine(org.telegram.messenger.g0.L(112.0f), getMeasuredHeight() - 1, getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f), getMeasuredHeight(), org.telegram.ui.ActionBar.k6.f28002k0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hs.e().c(this, hs.f23246i4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hs.e().n(this, hs.f23246i4);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(52.0f), 1073741824));
    }
}
