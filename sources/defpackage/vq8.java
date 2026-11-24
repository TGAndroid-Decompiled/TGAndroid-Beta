package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.HashSet;
public final class vq8 extends View implements gk7 {
    public final lm E;
    public float F;
    public xsa G;
    public final ArrayList H;
    public final ArrayList I;
    public final HashSet J;
    public int K;
    public final DecelerateInterpolator L;
    public final LinearInterpolator M;
    public uq8 N;
    public final int a;
    public final long b;
    public final oc6 c;
    public boolean d;
    public float e;
    public float f;
    public boolean h;
    public float n;
    public float r;
    public float s;
    public float w;
    public float x;
    public float y;

    public vq8(Context context, int i, long j, oc6 oc6Var) {
        super(context);
        this.d = true;
        this.E = new lm(this, 0L, 350L, s33.h);
        this.F = 1.0f;
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.J = new HashSet();
        this.L = new DecelerateInterpolator();
        this.M = new LinearInterpolator();
        this.a = i;
        this.b = j;
        this.c = oc6Var;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vq8.a():void");
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.H3 && ((Long) objArr[0]).longValue() == this.b) {
            a();
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vq8.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.f(this.a).b(this, kk7.H3);
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((uq8) obj).j.b(this);
        }
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.f(this.a).n(this, kk7.H3);
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((uq8) obj).j.o(this);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        uq8 uq8Var;
        uq8 uq8Var2;
        uq8 uq8Var3;
        if (this.d) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.I;
                if (i < arrayList.size()) {
                    if (((uq8) arrayList.get(i)).l.contains(x, y)) {
                        uq8Var = (uq8) arrayList.get(i);
                        break;
                    }
                    i++;
                } else {
                    uq8Var = null;
                    break;
                }
            }
            if (motionEvent.getAction() == 0) {
                this.N = uq8Var;
                if (uq8Var != null) {
                    uq8Var.m.c(true);
                }
            } else if (motionEvent.getAction() == 2) {
                uq8 uq8Var4 = this.N;
                if (uq8Var4 != uq8Var && uq8Var4 != null) {
                    uq8Var4.m.c(false);
                    this.N = null;
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.N != null) {
                    d01.t(getContext(), "https://t.me/nft/" + uq8Var3.e);
                    this.N.m.c(false);
                    this.N = null;
                }
            } else if (motionEvent.getAction() == 3 && (uq8Var2 = this.N) != null) {
                uq8Var2.m.c(false);
                this.N = null;
            }
            if (this.N != null) {
                return true;
            }
        }
        return false;
    }

    public void setActionBarActionMode(float f) {
        this.n = f;
        invalidate();
    }

    public void setActive(boolean z) {
        this.d = z;
    }

    public void setExpandCoords(float f) {
        this.x = f;
        invalidate();
    }

    public void setExpandProgress(float f) {
        if (this.e != f) {
            this.e = f;
            invalidate();
        }
    }

    public void setProgressToStoriesInsets(float f) {
        if (this.F == f) {
            return;
        }
        this.F = f;
        invalidate();
    }
}
