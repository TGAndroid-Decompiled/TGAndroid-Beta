package di;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.lr;
public final class t0 extends View implements fs {
    public final org.telegram.ui.Components.c6 E;
    public float F;
    public o8 G;
    public final ArrayList H;
    public final ArrayList I;
    public final HashSet J;
    public int K;
    public final DecelerateInterpolator L;
    public final LinearInterpolator M;
    public s0 N;
    public final int f9781a;
    public final long f9782b;
    public final View f9783c;
    public boolean d;
    public float f9784e;
    public float f9785f;
    public boolean h;
    public float f9786n;
    public float f9787r;
    public float f9788s;
    public float f9789w;
    public float f9790x;
    public float f9791y;

    public t0(Context context, int i7, long j3, org.telegram.ui.k0 k0Var) {
        super(context);
        this.d = true;
        this.E = new org.telegram.ui.Components.c6(this, 0L, 350L, lr.h);
        this.F = 1.0f;
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.J = new HashSet();
        this.L = new DecelerateInterpolator();
        this.M = new LinearInterpolator();
        this.f9781a = i7;
        this.f9782b = j3;
        this.f9783c = k0Var;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: di.t0.a():void");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.I3 && ((Long) objArr[0]).longValue() == this.f9782b) {
            a();
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: di.t0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.f(this.f9781a).c(this, ks.I3);
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((s0) obj).f9696j.a(this);
        }
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.f(this.f9781a).n(this, ks.I3);
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((s0) obj).f9696j.n(this);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s0 s0Var;
        s0 s0Var2;
        s0 s0Var3;
        if (!this.d) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.I;
            if (i7 < arrayList.size()) {
                if (((s0) arrayList.get(i7)).f9698l.contains(x10, y10)) {
                    s0Var = (s0) arrayList.get(i7);
                    break;
                }
                i7++;
            } else {
                s0Var = null;
                break;
            }
        }
        if (motionEvent.getAction() == 0) {
            this.N = s0Var;
            if (s0Var != null) {
                s0Var.f9699m.c(true);
            }
        } else if (motionEvent.getAction() == 2) {
            s0 s0Var4 = this.N;
            if (s0Var4 != s0Var && s0Var4 != null) {
                s0Var4.f9699m.c(false);
                this.N = null;
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.N != null) {
                vf.c.t(getContext(), "https://t.me/nft/" + s0Var3.f9692e);
                this.N.f9699m.c(false);
                this.N = null;
            }
        } else if (motionEvent.getAction() == 3 && (s0Var2 = this.N) != null) {
            s0Var2.f9699m.c(false);
            this.N = null;
        }
        if (this.N == null) {
            return false;
        }
        return true;
    }

    public void setActionBarActionMode(float f10) {
        this.f9786n = f10;
        invalidate();
    }

    public void setActive(boolean z10) {
        this.d = z10;
    }

    public void setExpandCoords(float f10) {
        this.f9790x = f10;
        invalidate();
    }

    public void setExpandProgress(float f10) {
        if (this.f9784e != f10) {
            this.f9784e = f10;
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
