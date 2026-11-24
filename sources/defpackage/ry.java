package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class ry extends LinearLayout implements gk7 {
    public final be0 a;
    public final hn b;
    public final hn c;
    public final hn d;
    public final cm2[] e;
    public boolean f;

    public ry(Context context, wjb wjbVar) {
        super(context);
        this.e = new cm2[1];
        setOrientation(0);
        hn hnVar = new hn(context, false, false, false);
        this.c = hnVar;
        int i = bkb.F6;
        zkb.U(hnVar, i, wjbVar);
        hnVar.setTextSize(gl.L(15.0f));
        hnVar.setPadding(gl.L(12.0f), 0, gl.L(12.0f), 0);
        hnVar.setEllipsizeByGradient(true);
        hn hnVar2 = new hn(context, false, false, false);
        this.d = hnVar2;
        zkb.U(hnVar2, bkb.x6, wjbVar);
        hnVar2.setTextSize(gl.L(15.0f));
        be0 be0Var = new be0(context);
        this.a = be0Var;
        hn hnVar3 = new hn(context, false, false, false);
        this.b = hnVar3;
        hnVar3.setTextSize(gl.L(15.0f));
        hnVar3.setPadding(gl.L(20.0f), 0, 0, 0);
        zkb.U(hnVar3, i, wjbVar);
        hnVar3.setTypeface(gl.o());
        hnVar3.setGravity(17);
        addView(hnVar3, nme.p(66, -2, 0.0f, 16));
        addView(be0Var, nme.p(32, 32, 0.0f, 16));
        addView(hnVar, nme.p(0, -2, 1.0f, 16));
        addView(hnVar2, nme.q(-2, -2, 0.0f, 16, 0, 0, 20, 0));
    }

    public final void a(int i, boolean z, boolean z2) {
        hn hnVar = this.b;
        if (z && i <= 3) {
            if (i == 1) {
                hnVar.c(vu3.o("🥇", hnVar.getPaint().getFontMetricsInt(), 20, null), z2, true);
                return;
            } else if (i == 2) {
                hnVar.c(vu3.o("🥈", hnVar.getPaint().getFontMetricsInt(), 20, null), z2, true);
                return;
            } else if (i == 3) {
                hnVar.c(vu3.o("🥉", hnVar.getPaint().getFontMetricsInt(), 20, null), z2, true);
                return;
            } else {
                return;
            }
        }
        if (i >= 10000) {
            hnVar.setTextSize(gl.L(12.0f));
        } else if (i >= 1000) {
            hnVar.setTextSize(gl.L(14.0f));
        } else {
            hnVar.setTextSize(gl.L(15.0f));
        }
        hnVar.c(Integer.toString(i), z2, true);
    }

    public final void b(TLRPC.User user) {
        pb0 pb0Var = new pb0((wjb) null);
        pb0Var.q(user);
        be0 be0Var = this.a;
        be0Var.f(user, pb0Var);
        be0Var.setRoundRadius(gl.L(16.0f));
        this.c.setText(l7c.r(user));
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        this.b.invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f) {
            canvas.drawLine(gl.L(112.0f), getMeasuredHeight() - 1, getMeasuredWidth() - gl.L(16.0f), getMeasuredHeight(), bkb.j0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.e().b(this, kk7.k4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.e().n(this, kk7.k4);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(52.0f), 1073741824));
    }
}
