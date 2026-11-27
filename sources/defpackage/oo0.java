package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public abstract class oo0 extends View {
    public final vnb a;
    public final po0 b;
    public final byb c;
    public int d;
    public float e;

    public oo0(int i, vnb vnbVar, Context context) {
        super(context);
        this.a = vnbVar;
        this.b = new po0(i, vnbVar, context);
        byb bybVar = new byb(i, this, vnbVar, true);
        this.c = bybVar;
        bybVar.e = new pkb("", 14.0f, hl.o());
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
        int L = hl.L(34.0f);
        int measuredWidth2 = getMeasuredWidth();
        float f = sideMenuWidth;
        float f2 = f / 2.0f;
        int i2 = this.d;
        float f3 = this.e;
        vnb vnbVar = this.a;
        if (vnbVar != null) {
            vnbVar.b(f2, f3, measuredWidth2, i2);
        } else {
            aob.q(f2, f3, measuredWidth2, i2);
        }
        this.c.c(canvas, getWidth(), f, 0.0f, 1.0f, 1.0f, false);
        po0Var.setBounds(i, L, po0Var.h + i, po0Var.i + L);
        po0Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), ik8.E(40.0f, this.b.i, 1073741824));
    }

    public void setDialogId(long j) {
        po0 po0Var = this.b;
        pkb pkbVar = po0Var.d;
        TLRPC.User X1 = uc7.s1(po0Var.b).X1(Long.valueOf(j));
        pkb pkbVar2 = po0Var.e;
        pkbVar2.l(1);
        pkbVar2.o(9999.0f);
        pkbVar2.p(ob6.a0(null, null, 2131753063, lbc.r(X1)));
        float b = (pkbVar2.b() / 2.0f) * 1.2f;
        pkbVar2.l(4);
        float f = (int) (hl.q.x * 0.95f);
        pkbVar2.o(Math.min(f, b));
        if (pkbVar2.b.getLineCount() > 2) {
            pkbVar2.o(Math.min(f, b * 1.2f));
        }
        float min = Math.min(Math.max(Math.max(0.0f, pkbVar2.b()), pkbVar.b()) + hl.L(32.0f), f);
        float h = pkbVar.h();
        float h2 = pkbVar2.h();
        po0Var.h = (int) min;
        po0Var.i = (int) (h2 + h + hl.L(17.0f) + 0.0f + hl.L(70.0f) + hl.L(14.0f) + hl.L(4.0f) + hl.L(2.0f) + hl.L(20.0f) + hl.L(5.0f));
    }
}
