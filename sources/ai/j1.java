package ai;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.bs;
public final class j1 extends View implements NotificationCenter.NotificationCenterDelegate {
    public float E;
    public x9 F;
    public final ArrayList G;
    public final ArrayList H;
    public final HashSet I;
    public int J;
    public final DecelerateInterpolator K;
    public final LinearInterpolator L;
    public i1 M;
    public final int f1561a;
    public final long f1562b;
    public final View f1563c;
    public boolean d;
    public float e;
    public float f1564f;
    public boolean h;
    public float f1565n;
    public float f1566r;
    public float f1567s;
    public float v;
    public float f1568w;
    public float f1569x;
    public final org.telegram.ui.Components.f6 f1570y;

    public j1(Context context, int i10, long j10, org.telegram.ui.m0 m0Var) {
        super(context);
        this.d = true;
        this.f1570y = new org.telegram.ui.Components.f6(this, 0L, 350L, bs.h);
        this.E = 1.0f;
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new HashSet();
        this.K = new DecelerateInterpolator();
        this.L = new LinearInterpolator();
        this.f1561a = i10;
        this.f1562b = j10;
        this.f1563c = m0Var;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: ai.j1.a():void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starUserGiftsLoaded && ((Long) objArr[0]).longValue() == this.f1562b) {
            a();
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: ai.j1.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f1561a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((i1) obj).f1491j.a(this);
        }
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f1561a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((i1) obj).f1491j.o(this);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        i1 i1Var;
        i1 i1Var2;
        i1 i1Var3;
        if (!this.d) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i10 < arrayList.size()) {
                if (((i1) arrayList.get(i10)).f1493l.contains(x10, y3)) {
                    i1Var = (i1) arrayList.get(i10);
                    break;
                }
                i10++;
            } else {
                i1Var = null;
                break;
            }
        }
        if (motionEvent.getAction() == 0) {
            this.M = i1Var;
            if (i1Var != null) {
                i1Var.f1494m.c(true);
            }
        } else if (motionEvent.getAction() == 2) {
            i1 i1Var4 = this.M;
            if (i1Var4 != i1Var && i1Var4 != null) {
                i1Var4.f1494m.c(false);
                this.M = null;
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.M != null) {
                pf.d.r(getContext(), "https://t.me/nft/" + i1Var3.e);
                this.M.f1494m.c(false);
                this.M = null;
            }
        } else if (motionEvent.getAction() == 3 && (i1Var2 = this.M) != null) {
            i1Var2.f1494m.c(false);
            this.M = null;
        }
        if (this.M == null) {
            return false;
        }
        return true;
    }

    public void setActionBarActionMode(float f7) {
        this.f1565n = f7;
        invalidate();
    }

    public void setActive(boolean z10) {
        this.d = z10;
    }

    public void setExpandCoords(float f7) {
        this.f1568w = f7;
        invalidate();
    }

    public void setExpandProgress(float f7) {
        if (this.e != f7) {
            this.e = f7;
            invalidate();
        }
    }

    public void setProgressToStoriesInsets(float f7) {
        if (this.E == f7) {
            return;
        }
        this.E = f7;
        invalidate();
    }
}
