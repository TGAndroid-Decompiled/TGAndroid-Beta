package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;
public final class smb extends gb2 {
    public final GestureDetector Ld;
    public final kl Md;
    public final kl Nd;
    public final int Od;
    public final tmb Pd;

    public smb(tmb tmbVar, Context context, int i, wjb wjbVar, Context context2, int i2) {
        super(context, i, false, null, wjbVar);
        this.Pd = tmbVar;
        this.Od = i2;
        this.Ld = new GestureDetector(context2, new gl3(this, (byte) 2));
        s33 s33Var = s33.g;
        this.Md = new kl(this, 180L, s33Var, 0);
        this.Nd = new kl(this, 180L, s33Var, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i;
        int v0;
        int v02;
        da7 da7Var;
        k27 messageObject = getMessageObject();
        kl klVar = this.Nd;
        kl klVar2 = this.Md;
        pb0 pb0Var = this.B7;
        if (messageObject != null && getMessageObject().e1 >= 0) {
            int i2 = getMessageObject().e1;
            if (i2 >= 14) {
                ea7 ea7Var = na7.q1(y6c.t0).E3;
                if (ea7Var != null) {
                    da7Var = ea7Var.d(i2);
                } else {
                    da7Var = null;
                }
                if (da7Var != null) {
                    int f = da7Var.f();
                    v0 = bkb.v0(bkb.o8[pb0.e(f)], this.cc);
                    v02 = bkb.v0(bkb.p8[pb0.e(f)], this.cc);
                } else {
                    long j = i2;
                    v0 = bkb.v0(bkb.o8[pb0.d(j)], this.cc);
                    v02 = bkb.v0(bkb.p8[pb0.d(j)], this.cc);
                }
            } else {
                long j2 = i2;
                v0 = bkb.v0(bkb.o8[pb0.d(j2)], this.cc);
                v02 = bkb.v0(bkb.p8[pb0.d(j2)], this.cc);
            }
            pb0Var.h(klVar2.a(v0, false), klVar.a(v02, false));
        } else {
            klVar2.a(pb0Var.b(), false);
            boolean z = pb0Var.g;
            int i3 = pb0Var.e;
            if (z) {
                zjb i4 = bkb.I.i(false);
                akb akbVar = bkb.I;
                if (i4 != null) {
                    i = i4.c;
                } else {
                    i = 0;
                }
                i3 = bkb.B(akbVar, i, i3);
            }
            klVar.a(i3, false);
        }
        if (getAvatarImage() != null && getAvatarImage().O0 != 0.0f) {
            getAvatarImage().i0(getAvatarImage().L0, (getMeasuredHeight() - getAvatarImage().O0) - gl.L(4.0f), getAvatarImage().N0, getAvatarImage().O0);
            getAvatarImage().q0((int) (getAvatarImage().O0 / 2.0f));
            getAvatarImage().h(canvas, null);
        } else if (this.Od == 2) {
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.Pd.a()) {
            return super.onTouchEvent(motionEvent);
        }
        this.Ld.onTouchEvent(motionEvent);
        return true;
    }
}
