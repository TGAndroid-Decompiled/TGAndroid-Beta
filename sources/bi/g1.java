package bi;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.wq;
public final class g1 extends View implements ls {
    public final org.telegram.ui.Components.v5 D;
    public float E;
    public v9 F;
    public final ArrayList G;
    public final ArrayList H;
    public final HashSet I;
    public int J;
    public final DecelerateInterpolator K;
    public final LinearInterpolator L;
    public f1 M;
    public final int f3910a;
    public final long f3911b;
    public final View f3912c;
    public boolean d;
    public float f3913e;
    public float f3914f;
    public boolean h;
    public float f3915n;
    public float f3916r;
    public float f3917s;
    public float f3918w;
    public float f3919x;
    public float f3920y;

    public g1(Context context, int i7, long j3, org.telegram.ui.k0 k0Var) {
        super(context);
        this.d = true;
        this.D = new org.telegram.ui.Components.v5(this, 0L, 350L, wq.h);
        this.E = 1.0f;
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new HashSet();
        this.K = new DecelerateInterpolator();
        this.L = new LinearInterpolator();
        this.f3910a = i7;
        this.f3911b = j3;
        this.f3912c = k0Var;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: bi.g1.a():void");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.G3 && ((Long) objArr[0]).longValue() == this.f3911b) {
            a();
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: bi.g1.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.f(this.f3910a).c(this, qs.G3);
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((f1) obj).f3849j.a(this);
        }
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.f(this.f3910a).n(this, qs.G3);
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((f1) obj).f3849j.n(this);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f1 f1Var;
        f1 f1Var2;
        f1 f1Var3;
        if (!this.d) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i7 < arrayList.size()) {
                if (((f1) arrayList.get(i7)).f3851l.contains(x10, y10)) {
                    f1Var = (f1) arrayList.get(i7);
                    break;
                }
                i7++;
            } else {
                f1Var = null;
                break;
            }
        }
        if (motionEvent.getAction() == 0) {
            this.M = f1Var;
            if (f1Var != null) {
                f1Var.f3852m.c(true);
            }
        } else if (motionEvent.getAction() == 2) {
            f1 f1Var4 = this.M;
            if (f1Var4 != f1Var && f1Var4 != null) {
                f1Var4.f3852m.c(false);
                this.M = null;
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.M != null) {
                vf.c.t(getContext(), "https://t.me/nft/" + f1Var3.f3845e);
                this.M.f3852m.c(false);
                this.M = null;
            }
        } else if (motionEvent.getAction() == 3 && (f1Var2 = this.M) != null) {
            f1Var2.f3852m.c(false);
            this.M = null;
        }
        if (this.M == null) {
            return false;
        }
        return true;
    }

    public void setActionBarActionMode(float f10) {
        this.f3915n = f10;
        invalidate();
    }

    public void setActive(boolean z9) {
        this.d = z9;
    }

    public void setExpandCoords(float f10) {
        this.f3919x = f10;
        invalidate();
    }

    public void setExpandProgress(float f10) {
        if (this.f3913e != f10) {
            this.f3913e = f10;
            invalidate();
        }
    }

    public void setProgressToStoriesInsets(float f10) {
        if (this.E == f10) {
            return;
        }
        this.E = f10;
        invalidate();
    }
}
