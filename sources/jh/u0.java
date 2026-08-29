package jh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.jr;
public final class u0 extends View implements NotificationCenter.NotificationCenterDelegate {
    public float A;
    public k7 B;
    public final ArrayList C;
    public final ArrayList D;
    public final HashSet E;
    public int F;
    public final DecelerateInterpolator G;
    public final LinearInterpolator H;
    public t0 I;
    public final int f12874a;
    public final long f12875b;
    public final View f12876c;
    public boolean d;
    public float f12877e;
    public float f12878f;
    public boolean h;
    public float f12879n;
    public float f12880r;
    public float f12881s;
    public float v;
    public float f12882w;
    public float f12883x;
    public final org.telegram.ui.Components.d6 f12884y;

    public u0(Context context, int i10, long j10, org.telegram.ui.n0 n0Var) {
        super(context);
        this.d = true;
        this.f12884y = new org.telegram.ui.Components.d6(this, 0L, 350L, jr.h);
        this.A = 1.0f;
        this.C = new ArrayList();
        this.D = new ArrayList();
        this.E = new HashSet();
        this.G = new DecelerateInterpolator();
        this.H = new LinearInterpolator();
        this.f12874a = i10;
        this.f12875b = j10;
        this.f12876c = n0Var;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: jh.u0.a():void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starUserGiftsLoaded && ((Long) objArr[0]).longValue() == this.f12875b) {
            a();
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: jh.u0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f12874a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        ArrayList arrayList = this.D;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((t0) obj).f12825j.a(this);
        }
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f12874a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        ArrayList arrayList = this.D;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((t0) obj).f12825j.o(this);
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
        float x4 = motionEvent.getX();
        float y8 = motionEvent.getY();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.D;
            if (i10 < arrayList.size()) {
                if (((t0) arrayList.get(i10)).f12827l.contains(x4, y8)) {
                    t0Var = (t0) arrayList.get(i10);
                    break;
                }
                i10++;
            } else {
                t0Var = null;
                break;
            }
        }
        if (motionEvent.getAction() == 0) {
            this.I = t0Var;
            if (t0Var != null) {
                t0Var.f12828m.c(true);
            }
        } else if (motionEvent.getAction() == 2) {
            t0 t0Var4 = this.I;
            if (t0Var4 != t0Var && t0Var4 != null) {
                t0Var4.f12828m.c(false);
                this.I = null;
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.I != null) {
                ye.d.s(getContext(), "https://t.me/nft/" + t0Var3.f12821e);
                this.I.f12828m.c(false);
                this.I = null;
            }
        } else if (motionEvent.getAction() == 3 && (t0Var2 = this.I) != null) {
            t0Var2.f12828m.c(false);
            this.I = null;
        }
        if (this.I == null) {
            return false;
        }
        return true;
    }

    public void setActionBarActionMode(float f9) {
        this.f12879n = f9;
        invalidate();
    }

    public void setActive(boolean z10) {
        this.d = z10;
    }

    public void setExpandCoords(float f9) {
        this.f12882w = f9;
        invalidate();
    }

    public void setExpandProgress(float f9) {
        if (this.f12877e != f9) {
            this.f12877e = f9;
            invalidate();
        }
    }

    public void setProgressToStoriesInsets(float f9) {
        if (this.A == f9) {
            return;
        }
        this.A = f9;
        invalidate();
    }
}
