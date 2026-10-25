package bi;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ds;
public final class i1 extends View implements NotificationCenter.NotificationCenterDelegate {
    public float E;
    public t9 F;
    public final ArrayList G;
    public final ArrayList H;
    public final HashSet I;
    public int J;
    public final DecelerateInterpolator K;
    public final LinearInterpolator L;
    public h1 M;
    public final int f4809a;
    public final long f4810b;
    public final View f4811c;
    public boolean d;
    public float e;
    public float f4812f;
    public boolean h;
    public float f4813n;
    public float f4814r;
    public float f4815s;
    public float v;
    public float f4816w;
    public float f4817x;
    public final org.telegram.ui.Components.h6 f4818y;

    public i1(Context context, int i10, long j10, org.telegram.ui.k0 k0Var) {
        super(context);
        this.d = true;
        this.f4818y = new org.telegram.ui.Components.h6(this, 0L, 350L, ds.h);
        this.E = 1.0f;
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new HashSet();
        this.K = new DecelerateInterpolator();
        this.L = new LinearInterpolator();
        this.f4809a = i10;
        this.f4810b = j10;
        this.f4811c = k0Var;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: bi.i1.a():void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starUserGiftsLoaded && ((Long) objArr[0]).longValue() == this.f4810b) {
            a();
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: bi.i1.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f4809a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((h1) obj).f4710j.a(this);
        }
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f4809a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((h1) obj).f4710j.o(this);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        h1 h1Var;
        h1 h1Var2;
        h1 h1Var3;
        if (!this.d) {
            return false;
        }
        float x9 = motionEvent.getX();
        float y3 = motionEvent.getY();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i10 < arrayList.size()) {
                if (((h1) arrayList.get(i10)).f4712l.contains(x9, y3)) {
                    h1Var = (h1) arrayList.get(i10);
                    break;
                }
                i10++;
            } else {
                h1Var = null;
                break;
            }
        }
        if (motionEvent.getAction() == 0) {
            this.M = h1Var;
            if (h1Var != null) {
                h1Var.f4713m.c(true);
            }
        } else if (motionEvent.getAction() == 2) {
            h1 h1Var4 = this.M;
            if (h1Var4 != h1Var && h1Var4 != null) {
                h1Var4.f4713m.c(false);
                this.M = null;
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.M != null) {
                qf.d.r(getContext(), "https://t.me/nft/" + h1Var3.e);
                this.M.f4713m.c(false);
                this.M = null;
            }
        } else if (motionEvent.getAction() == 3 && (h1Var2 = this.M) != null) {
            h1Var2.f4713m.c(false);
            this.M = null;
        }
        if (this.M == null) {
            return false;
        }
        return true;
    }

    public void setActionBarActionMode(float f7) {
        this.f4813n = f7;
        invalidate();
    }

    public void setActive(boolean z10) {
        this.d = z10;
    }

    public void setExpandCoords(float f7) {
        this.f4816w = f7;
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
