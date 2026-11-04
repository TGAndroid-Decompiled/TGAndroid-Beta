package ci;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.xq;
public final class z0 extends View implements cs {
    public final org.telegram.ui.Components.u5 E;
    public float F;
    public v8 G;
    public final ArrayList H;
    public final ArrayList I;
    public final HashSet J;
    public int K;
    public final DecelerateInterpolator L;
    public final LinearInterpolator M;
    public y0 N;
    public final int f6427a;
    public final long f6428b;
    public final View f6429c;
    public boolean d;
    public float f6430e;
    public float f6431f;
    public boolean h;
    public float f6432n;
    public float f6433r;
    public float f6434s;
    public float f6435w;
    public float f6436x;
    public float f6437y;

    public z0(Context context, int i3, long j10, org.telegram.ui.l0 l0Var) {
        super(context);
        this.d = true;
        this.E = new org.telegram.ui.Components.u5(this, 0L, 350L, xq.h);
        this.F = 1.0f;
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.J = new HashSet();
        this.L = new DecelerateInterpolator();
        this.M = new LinearInterpolator();
        this.f6427a = i3;
        this.f6428b = j10;
        this.f6429c = l0Var;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: ci.z0.a():void");
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.G3 && ((Long) objArr[0]).longValue() == this.f6428b) {
            a();
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: ci.z0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hs.f(this.f6427a).c(this, hs.G3);
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((y0) obj).f6381j.a(this);
        }
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hs.f(this.f6427a).n(this, hs.G3);
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((y0) obj).f6381j.n(this);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        y0 y0Var;
        y0 y0Var2;
        y0 y0Var3;
        if (!this.d) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y9 = motionEvent.getY();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.I;
            if (i3 < arrayList.size()) {
                if (((y0) arrayList.get(i3)).f6383l.contains(x10, y9)) {
                    y0Var = (y0) arrayList.get(i3);
                    break;
                }
                i3++;
            } else {
                y0Var = null;
                break;
            }
        }
        if (motionEvent.getAction() == 0) {
            this.N = y0Var;
            if (y0Var != null) {
                y0Var.f6384m.c(true);
            }
        } else if (motionEvent.getAction() == 2) {
            y0 y0Var4 = this.N;
            if (y0Var4 != y0Var && y0Var4 != null) {
                y0Var4.f6384m.c(false);
                this.N = null;
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.N != null) {
                sf.c.t(getContext(), "https://t.me/nft/" + y0Var3.f6377e);
                this.N.f6384m.c(false);
                this.N = null;
            }
        } else if (motionEvent.getAction() == 3 && (y0Var2 = this.N) != null) {
            y0Var2.f6384m.c(false);
            this.N = null;
        }
        if (this.N == null) {
            return false;
        }
        return true;
    }

    public void setActionBarActionMode(float f10) {
        this.f6432n = f10;
        invalidate();
    }

    public void setActive(boolean z10) {
        this.d = z10;
    }

    public void setExpandCoords(float f10) {
        this.f6436x = f10;
        invalidate();
    }

    public void setExpandProgress(float f10) {
        if (this.f6430e != f10) {
            this.f6430e = f10;
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
