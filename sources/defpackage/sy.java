package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class sy extends LinearLayout implements fn7 {
    public final de0 a;
    public final in b;
    public final in c;
    public final in d;
    public final wm2[] e;
    public boolean f;

    public sy(Context context, vnb vnbVar) {
        super(context);
        this.e = new wm2[1];
        setOrientation(0);
        in inVar = new in(context, false, false, false);
        this.c = inVar;
        int i = aob.G6;
        yob.U(inVar, i, vnbVar);
        inVar.setTextSize(hl.L(15.0f));
        inVar.setPadding(hl.L(12.0f), 0, hl.L(12.0f), 0);
        inVar.setEllipsizeByGradient(true);
        in inVar2 = new in(context, false, false, false);
        this.d = inVar2;
        yob.U(inVar2, aob.y6, vnbVar);
        inVar2.setTextSize(hl.L(15.0f));
        de0 de0Var = new de0(context);
        this.a = de0Var;
        in inVar3 = new in(context, false, false, false);
        this.b = inVar3;
        inVar3.setTextSize(hl.L(15.0f));
        inVar3.setPadding(hl.L(20.0f), 0, 0, 0);
        yob.U(inVar3, i, vnbVar);
        inVar3.setTypeface(hl.o());
        inVar3.setGravity(17);
        addView(inVar3, tre.p(66, -2, 0.0f, 16));
        addView(de0Var, tre.p(32, 32, 0.0f, 16));
        addView(inVar, tre.p(0, -2, 1.0f, 16));
        addView(inVar2, tre.q(-2, -2, 0.0f, 16, 0, 0, 20, 0));
    }

    public final void a(int i, boolean z, boolean z2) {
        in inVar = this.b;
        if (z && i <= 3) {
            if (i == 1) {
                inVar.c(pv3.o("🥇", inVar.getPaint().getFontMetricsInt(), 20, null), z2, true);
                return;
            } else if (i == 2) {
                inVar.c(pv3.o("🥈", inVar.getPaint().getFontMetricsInt(), 20, null), z2, true);
                return;
            } else if (i == 3) {
                inVar.c(pv3.o("🥉", inVar.getPaint().getFontMetricsInt(), 20, null), z2, true);
                return;
            } else {
                return;
            }
        }
        if (i >= 10000) {
            inVar.setTextSize(hl.L(12.0f));
        } else if (i >= 1000) {
            inVar.setTextSize(hl.L(14.0f));
        } else {
            inVar.setTextSize(hl.L(15.0f));
        }
        inVar.c(Integer.toString(i), z2, true);
    }

    public final void b(TLRPC.User user) {
        rb0 rb0Var = new rb0((vnb) null);
        rb0Var.q(user);
        de0 de0Var = this.a;
        de0Var.f(user, rb0Var);
        de0Var.setRoundRadius(hl.L(16.0f));
        this.c.setText(lbc.r(user));
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        this.b.invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f) {
            canvas.drawLine(hl.L(112.0f), getMeasuredHeight() - 1, getMeasuredWidth() - hl.L(16.0f), getMeasuredHeight(), aob.j0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.e().b(this, jn7.l4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.e().n(this, jn7.l4);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(52.0f), 1073741824));
    }
}
