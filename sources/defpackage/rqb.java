package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;
public final class rqb extends wb2 {
    public final GestureDetector Ld;
    public final ll Md;
    public final ll Nd;
    public final int Od;
    public final sqb Pd;

    public rqb(sqb sqbVar, Context context, int i, vnb vnbVar, Context context2, int i2) {
        super(context, i, false, null, vnbVar);
        this.Pd = sqbVar;
        this.Od = i2;
        this.Ld = new GestureDetector(context2, new yl3(this, (byte) 2));
        k43 k43Var = k43.g;
        this.Md = new ll(this, 180L, k43Var, 0);
        this.Nd = new ll(this, 180L, k43Var, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i;
        int v0;
        int v02;
        kc7 kc7Var;
        r47 messageObject = getMessageObject();
        ll llVar = this.Nd;
        ll llVar2 = this.Md;
        rb0 rb0Var = this.B7;
        if (messageObject != null && getMessageObject().e1 >= 0) {
            int i2 = getMessageObject().e1;
            if (i2 >= 14) {
                lc7 lc7Var = uc7.s1(yac.t0).E3;
                if (lc7Var != null) {
                    kc7Var = lc7Var.d(i2);
                } else {
                    kc7Var = null;
                }
                if (kc7Var != null) {
                    int f = kc7Var.f();
                    v0 = aob.v0(aob.p8[rb0.e(f)], this.cc);
                    v02 = aob.v0(aob.q8[rb0.e(f)], this.cc);
                } else {
                    long j = i2;
                    v0 = aob.v0(aob.p8[rb0.d(j)], this.cc);
                    v02 = aob.v0(aob.q8[rb0.d(j)], this.cc);
                }
            } else {
                long j2 = i2;
                v0 = aob.v0(aob.p8[rb0.d(j2)], this.cc);
                v02 = aob.v0(aob.q8[rb0.d(j2)], this.cc);
            }
            rb0Var.h(llVar2.a(v0, false), llVar.a(v02, false));
        } else {
            llVar2.a(rb0Var.b(), false);
            boolean z = rb0Var.g;
            int i3 = rb0Var.e;
            if (z) {
                ynb i4 = aob.I.i(false);
                znb znbVar = aob.I;
                if (i4 != null) {
                    i = i4.c;
                } else {
                    i = 0;
                }
                i3 = aob.B(znbVar, i, i3);
            }
            llVar.a(i3, false);
        }
        if (getAvatarImage() != null && getAvatarImage().O0 != 0.0f) {
            getAvatarImage().i0(getAvatarImage().L0, (getMeasuredHeight() - getAvatarImage().O0) - hl.L(4.0f), getAvatarImage().N0, getAvatarImage().O0);
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
