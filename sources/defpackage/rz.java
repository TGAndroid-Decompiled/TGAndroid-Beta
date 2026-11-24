package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class rz extends LinearLayout implements jm7 {
    public final bf0 a;
    public final io b;
    public final io c;
    public final io d;
    public final pn2[] e;
    public boolean f;

    public rz(Context context, ylb ylbVar) {
        super(context);
        this.e = new pn2[1];
        setOrientation(0);
        io ioVar = new io(context, false, false, false);
        this.c = ioVar;
        int i = cmb.F6;
        anb.U(ioVar, i, ylbVar);
        ioVar.setTextSize(gm.L(15.0f));
        ioVar.setPadding(gm.L(12.0f), 0, gm.L(12.0f), 0);
        ioVar.setEllipsizeByGradient(true);
        io ioVar2 = new io(context, false, false, false);
        this.d = ioVar2;
        anb.U(ioVar2, cmb.x6, ylbVar);
        ioVar2.setTextSize(gm.L(15.0f));
        bf0 bf0Var = new bf0(context);
        this.a = bf0Var;
        io ioVar3 = new io(context, false, false, false);
        this.b = ioVar3;
        ioVar3.setTextSize(gm.L(15.0f));
        ioVar3.setPadding(gm.L(20.0f), 0, 0, 0);
        anb.U(ioVar3, i, ylbVar);
        ioVar3.setTypeface(gm.o());
        ioVar3.setGravity(17);
        addView(ioVar3, qoe.p(66, -2, 0.0f, 16));
        addView(bf0Var, qoe.p(32, 32, 0.0f, 16));
        addView(ioVar, qoe.p(0, -2, 1.0f, 16));
        addView(ioVar2, qoe.q(-2, -2, 0.0f, 16, 0, 0, 20, 0));
    }

    public final void a(int i, boolean z, boolean z2) {
        io ioVar = this.b;
        if (z && i <= 3) {
            if (i == 1) {
                ioVar.c(gw3.o("🥇", ioVar.getPaint().getFontMetricsInt(), 20, null), z2, true);
                return;
            } else if (i == 2) {
                ioVar.c(gw3.o("🥈", ioVar.getPaint().getFontMetricsInt(), 20, null), z2, true);
                return;
            } else if (i == 3) {
                ioVar.c(gw3.o("🥉", ioVar.getPaint().getFontMetricsInt(), 20, null), z2, true);
                return;
            } else {
                return;
            }
        }
        if (i >= 10000) {
            ioVar.setTextSize(gm.L(12.0f));
        } else if (i >= 1000) {
            ioVar.setTextSize(gm.L(14.0f));
        } else {
            ioVar.setTextSize(gm.L(15.0f));
        }
        ioVar.c(Integer.toString(i), z2, true);
    }

    public final void b(TLRPC.User user) {
        pc0 pc0Var = new pc0((ylb) null);
        pc0Var.q(user);
        bf0 bf0Var = this.a;
        bf0Var.f(user, pc0Var);
        bf0Var.setRoundRadius(gm.L(16.0f));
        this.c.setText(m9c.r(user));
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        this.b.invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f) {
            canvas.drawLine(gm.L(112.0f), getMeasuredHeight() - 1, getMeasuredWidth() - gm.L(16.0f), getMeasuredHeight(), cmb.j0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.e().b(this, nm7.m4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.e().n(this, nm7.m4);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(52.0f), 1073741824));
    }
}
