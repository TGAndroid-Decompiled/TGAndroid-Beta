package di;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.er;
public final class u0 extends View implements is {
    public final org.telegram.ui.Components.u5 E;
    public float F;
    public m8 G;
    public final ArrayList H;
    public final ArrayList I;
    public final HashSet J;
    public int K;
    public final DecelerateInterpolator L;
    public final LinearInterpolator M;
    public t0 N;
    public final int f9500a;
    public final long f9501b;
    public final View f9502c;
    public boolean d;
    public float f9503e;
    public float f9504f;
    public boolean h;
    public float f9505n;
    public float f9506r;
    public float f9507s;
    public float f9508w;
    public float f9509x;
    public float f9510y;

    public u0(Context context, int i7, long j3, org.telegram.ui.k0 k0Var) {
        super(context);
        this.d = true;
        this.E = new org.telegram.ui.Components.u5(this, 0L, 350L, er.h);
        this.F = 1.0f;
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.J = new HashSet();
        this.L = new DecelerateInterpolator();
        this.M = new LinearInterpolator();
        this.f9500a = i7;
        this.f9501b = j3;
        this.f9502c = k0Var;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: di.u0.a():void");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.G3 && ((Long) objArr[0]).longValue() == this.f9501b) {
            a();
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: di.u0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ns.f(this.f9500a).c(this, ns.G3);
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((t0) obj).f9449j.a(this);
        }
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ns.f(this.f9500a).n(this, ns.G3);
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((t0) obj).f9449j.n(this);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        t0 t0Var;
        t0 t0Var2;
        t0 t0Var3;
        if (!this.d) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.I;
            if (i7 < arrayList.size()) {
                if (((t0) arrayList.get(i7)).f9451l.contains(x10, y10)) {
                    t0Var = (t0) arrayList.get(i7);
                    break;
                }
                i7++;
            } else {
                t0Var = null;
                break;
            }
        }
        if (motionEvent.getAction() == 0) {
            this.N = t0Var;
            if (t0Var != null) {
                t0Var.f9452m.c(true);
            }
        } else if (motionEvent.getAction() == 2) {
            t0 t0Var4 = this.N;
            if (t0Var4 != t0Var && t0Var4 != null) {
                t0Var4.f9452m.c(false);
                this.N = null;
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.N != null) {
                vf.c.t(getContext(), "https://t.me/nft/" + t0Var3.f9445e);
                this.N.f9452m.c(false);
                this.N = null;
            }
        } else if (motionEvent.getAction() == 3 && (t0Var2 = this.N) != null) {
            t0Var2.f9452m.c(false);
            this.N = null;
        }
        if (this.N == null) {
            return false;
        }
        return true;
    }

    public void setActionBarActionMode(float f10) {
        this.f9505n = f10;
        invalidate();
    }

    public void setActive(boolean z10) {
        this.d = z10;
    }

    public void setExpandCoords(float f10) {
        this.f9509x = f10;
        invalidate();
    }

    public void setExpandProgress(float f10) {
        if (this.f9503e != f10) {
            this.f9503e = f10;
            invalidate();
        }
    }

    public void setProgressToStoriesInsets(float f10) {
        if (this.F == f10) {
            return;
        }
        this.F = f10;
        invalidate();
    }
}
