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
    public final int f14775a;
    public final long f14776b;
    public final View f14777c;
    public boolean d;
    public float f14778e;
    public float f14779f;
    public boolean h;
    public float f14780n;
    public float f14781r;
    public float f14782s;
    public float v;
    public float f14783w;
    public float f14784x;
    public final org.telegram.ui.Components.z5 f14785y;

    public t0(Context context, int i10, long j10, org.telegram.ui.l0 l0Var) {
        super(context);
        this.d = true;
        this.f14785y = new org.telegram.ui.Components.z5(this, 0L, 350L, pr.h);
        this.B = 1.0f;
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.F = new HashSet();
        this.H = new DecelerateInterpolator();
        this.I = new LinearInterpolator();
        this.f14775a = i10;
        this.f14776b = j10;
        this.f14777c = l0Var;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: mh.t0.a():void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starUserGiftsLoaded && ((Long) objArr[0]).longValue() == this.f14776b) {
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
        NotificationCenter.getInstance(this.f14775a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((s0) obj).f14722j.a(this);
        }
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f14775a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((s0) obj).f14722j.o(this);
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
                if (((s0) arrayList.get(i10)).f14724l.contains(x10, y10)) {
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
                s0Var.f14725m.c(true);
            }
        } else if (motionEvent.getAction() == 2) {
            s0 s0Var4 = this.J;
            if (s0Var4 != s0Var && s0Var4 != null) {
                s0Var4.f14725m.c(false);
                this.J = null;
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.J != null) {
                af.g.s(getContext(), "https://t.me/nft/" + s0Var3.f14718e);
                this.J.f14725m.c(false);
                this.J = null;
            }
        } else if (motionEvent.getAction() == 3 && (s0Var2 = this.J) != null) {
            s0Var2.f14725m.c(false);
            this.J = null;
        }
        if (this.J == null) {
            return false;
        }
        return true;
    }

    public void setActionBarActionMode(float f10) {
        this.f14780n = f10;
        invalidate();
    }

    public void setActive(boolean z4) {
        this.d = z4;
    }

    public void setExpandCoords(float f10) {
        this.f14783w = f10;
        invalidate();
    }

    public void setExpandProgress(float f10) {
        if (this.f14778e != f10) {
            this.f14778e = f10;
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
