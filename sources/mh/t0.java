package mh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.pr;
public final class t0 extends View implements NotificationCenter.NotificationCenterDelegate {
    public float B;
    public l7 C;
    public final ArrayList D;
    public final ArrayList E;
    public final HashSet F;
    public int G;
    public final DecelerateInterpolator H;
    public final LinearInterpolator I;
    public s0 J;
    public final int f14777a;
    public final long f14778b;
    public final View f14779c;
    public boolean d;
    public float f14780e;
    public float f14781f;
    public boolean h;
    public float f14782n;
    public float f14783r;
    public float f14784s;
    public float v;
    public float f14785w;
    public float f14786x;
    public final org.telegram.ui.Components.z5 f14787y;

    public t0(Context context, int i10, long j10, org.telegram.ui.l0 l0Var) {
        super(context);
        this.d = true;
        this.f14787y = new org.telegram.ui.Components.z5(this, 0L, 350L, pr.h);
        this.B = 1.0f;
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.F = new HashSet();
        this.H = new DecelerateInterpolator();
        this.I = new LinearInterpolator();
        this.f14777a = i10;
        this.f14778b = j10;
        this.f14779c = l0Var;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: mh.t0.a():void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starUserGiftsLoaded && ((Long) objArr[0]).longValue() == this.f14778b) {
            a();
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: mh.t0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f14777a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((s0) obj).f14724j.a(this);
        }
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f14777a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((s0) obj).f14724j.o(this);
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
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.E;
            if (i10 < arrayList.size()) {
                if (((s0) arrayList.get(i10)).f14726l.contains(x10, y10)) {
                    s0Var = (s0) arrayList.get(i10);
                    break;
                }
                i10++;
            } else {
                s0Var = null;
                break;
            }
        }
        if (motionEvent.getAction() == 0) {
            this.J = s0Var;
            if (s0Var != null) {
                s0Var.f14727m.c(true);
            }
        } else if (motionEvent.getAction() == 2) {
            s0 s0Var4 = this.J;
            if (s0Var4 != s0Var && s0Var4 != null) {
                s0Var4.f14727m.c(false);
                this.J = null;
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.J != null) {
                af.g.s(getContext(), "https://t.me/nft/" + s0Var3.f14720e);
                this.J.f14727m.c(false);
                this.J = null;
            }
        } else if (motionEvent.getAction() == 3 && (s0Var2 = this.J) != null) {
            s0Var2.f14727m.c(false);
            this.J = null;
        }
        if (this.J == null) {
            return false;
        }
        return true;
    }

    public void setActionBarActionMode(float f10) {
        this.f14782n = f10;
        invalidate();
    }

    public void setActive(boolean z4) {
        this.d = z4;
    }

    public void setExpandCoords(float f10) {
        this.f14785w = f10;
        invalidate();
    }

    public void setExpandProgress(float f10) {
        if (this.f14780e != f10) {
            this.f14780e = f10;
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
