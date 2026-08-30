package lh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.nr;
public final class u0 extends View implements NotificationCenter.NotificationCenterDelegate {
    public float B;
    public l7 C;
    public final ArrayList D;
    public final ArrayList E;
    public final HashSet F;
    public int G;
    public final DecelerateInterpolator H;
    public final LinearInterpolator I;
    public t0 J;
    public final int f13178a;
    public final long f13179b;
    public final View f13180c;
    public boolean d;
    public float e;
    public float f13181f;
    public boolean h;
    public float f13182n;
    public float f13183r;
    public float f13184s;
    public float v;
    public float f13185w;
    public float f13186x;
    public final org.telegram.ui.Components.z5 f13187y;

    public u0(Context context, int i10, long j10, org.telegram.ui.l0 l0Var) {
        super(context);
        this.d = true;
        this.f13187y = new org.telegram.ui.Components.z5(this, 0L, 350L, nr.h);
        this.B = 1.0f;
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.F = new HashSet();
        this.H = new DecelerateInterpolator();
        this.I = new LinearInterpolator();
        this.f13178a = i10;
        this.f13179b = j10;
        this.f13180c = l0Var;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: lh.u0.a():void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starUserGiftsLoaded && ((Long) objArr[0]).longValue() == this.f13179b) {
            a();
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: lh.u0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f13178a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((t0) obj).f13109j.a(this);
        }
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f13178a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((t0) obj).f13109j.o(this);
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
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.E;
            if (i10 < arrayList.size()) {
                if (((t0) arrayList.get(i10)).f13111l.contains(x10, y10)) {
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
            this.J = t0Var;
            if (t0Var != null) {
                t0Var.f13112m.c(true);
            }
        } else if (motionEvent.getAction() == 2) {
            t0 t0Var4 = this.J;
            if (t0Var4 != t0Var && t0Var4 != null) {
                t0Var4.f13112m.c(false);
                this.J = null;
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.J != null) {
                af.g.s(getContext(), "https://t.me/nft/" + t0Var3.e);
                this.J.f13112m.c(false);
                this.J = null;
            }
        } else if (motionEvent.getAction() == 3 && (t0Var2 = this.J) != null) {
            t0Var2.f13112m.c(false);
            this.J = null;
        }
        if (this.J == null) {
            return false;
        }
        return true;
    }

    public void setActionBarActionMode(float f10) {
        this.f13182n = f10;
        invalidate();
    }

    public void setActive(boolean z4) {
        this.d = z4;
    }

    public void setExpandCoords(float f10) {
        this.f13185w = f10;
        invalidate();
    }

    public void setExpandProgress(float f10) {
        if (this.e != f10) {
            this.e = f10;
            invalidate();
        }
    }

    public void setProgressToStoriesInsets(float f10) {
        if (this.B == f10) {
            return;
        }
        this.B = f10;
        invalidate();
    }
}
