package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public abstract class oo0 extends View {
    public final wjb a;
    public final po0 b;
    public final aub c;
    public int d;
    public float e;

    public oo0(int i, wjb wjbVar, Context context) {
        super(context);
        this.a = wjbVar;
        this.b = new po0(i, wjbVar, context);
        aub aubVar = new aub(i, this, wjbVar, true);
        this.c = aubVar;
        aubVar.e = new tgb("", 14.0f, gl.o());
    }

    public final void a(float f, int i) {
        this.d = i;
        this.e = f;
    }

    public int getSideMenuWidth() {
        return 0;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int sideMenuWidth = getSideMenuWidth();
        int measuredWidth = getMeasuredWidth();
        po0 po0Var = this.b;
        int i = ((measuredWidth - po0Var.h) + sideMenuWidth) / 2;
        int L = gl.L(34.0f);
        int measuredWidth2 = getMeasuredWidth();
        float f = sideMenuWidth;
        float f2 = f / 2.0f;
        int i2 = this.d;
        float f3 = this.e;
        wjb wjbVar = this.a;
        if (wjbVar != null) {
            wjbVar.b(f2, f3, measuredWidth2, i2);
        } else {
            bkb.q(f2, f3, measuredWidth2, i2);
        }
        this.c.c(canvas, getWidth(), f, 0.0f, 1.0f, 1.0f, false);
        po0Var.setBounds(i, L, po0Var.h + i, po0Var.i + L);
        po0Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), ug8.E(40.0f, this.b.i, 1073741824));
    }

    public void setDialogId(long j) {
        po0 po0Var = this.b;
        tgb tgbVar = po0Var.d;
        TLRPC.User V1 = na7.q1(po0Var.b).V1(Long.valueOf(j));
        tgb tgbVar2 = po0Var.e;
        tgbVar2.l(1);
        tgbVar2.o(9999.0f);
        tgbVar2.p(k96.a0(null, null, 2131753067, l7c.q(V1)));
        float b = (tgbVar2.b() / 2.0f) * 1.2f;
        tgbVar2.l(4);
        float f = (int) (gl.q.x * 0.95f);
        tgbVar2.o(Math.min(f, b));
        if (tgbVar2.b.getLineCount() > 2) {
            tgbVar2.o(Math.min(f, b * 1.2f));
        }
        float min = Math.min(Math.max(Math.max(0.0f, tgbVar2.b()), tgbVar.b()) + gl.L(32.0f), f);
        float h = tgbVar.h();
        float h2 = tgbVar2.h();
        po0Var.h = (int) min;
        po0Var.i = (int) (h2 + h + gl.L(17.0f) + 0.0f + gl.L(70.0f) + gl.L(14.0f) + gl.L(4.0f) + gl.L(2.0f) + gl.L(20.0f) + gl.L(5.0f));
    }
}
