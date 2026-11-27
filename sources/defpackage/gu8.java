package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.HashSet;
public final class gu8 extends View implements fn7 {
    public final mm E;
    public float F;
    public axa G;
    public final ArrayList H;
    public final ArrayList I;
    public final HashSet J;
    public int K;
    public final DecelerateInterpolator L;
    public final LinearInterpolator M;
    public fu8 N;
    public final int a;
    public final long b;
    public final d26 c;
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

    public gu8(Context context, int i, long j, d26 d26Var) {
        super(context);
        this.d = true;
        this.E = new mm(this, 0L, 350L, k43.h);
        this.F = 1.0f;
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.J = new HashSet();
        this.L = new DecelerateInterpolator();
        this.M = new LinearInterpolator();
        this.a = i;
        this.b = j;
        this.c = d26Var;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gu8.a():void");
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.I3 && ((Long) objArr[0]).longValue() == this.b) {
            a();
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gu8.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.f(this.a).b(this, jn7.I3);
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((fu8) obj).j.b(this);
        }
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(this.a).n(this, jn7.I3);
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((fu8) obj).j.o(this);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        fu8 fu8Var;
        fu8 fu8Var2;
        fu8 fu8Var3;
        if (this.d) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.I;
                if (i < arrayList.size()) {
                    if (((fu8) arrayList.get(i)).l.contains(x, y)) {
                        fu8Var = (fu8) arrayList.get(i);
                        break;
                    }
                    i++;
                } else {
                    fu8Var = null;
                    break;
                }
            }
            if (motionEvent.getAction() == 0) {
                this.N = fu8Var;
                if (fu8Var != null) {
                    fu8Var.m.c(true);
                }
            } else if (motionEvent.getAction() == 2) {
                fu8 fu8Var4 = this.N;
                if (fu8Var4 != fu8Var && fu8Var4 != null) {
                    fu8Var4.m.c(false);
                    this.N = null;
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.N != null) {
                    m01.u(getContext(), "https://t.me/nft/" + fu8Var3.e);
                    this.N.m.c(false);
                    this.N = null;
                }
            } else if (motionEvent.getAction() == 3 && (fu8Var2 = this.N) != null) {
                fu8Var2.m.c(false);
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
