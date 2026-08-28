package gh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.gr;
public final class v0 extends View implements NotificationCenter.NotificationCenterDelegate {
    public float A;
    public n7 B;
    public final ArrayList C;
    public final ArrayList D;
    public final HashSet E;
    public int F;
    public final DecelerateInterpolator G;
    public final LinearInterpolator H;
    public u0 I;
    public final int f8996a;
    public final long f8997b;
    public final View f8998c;
    public boolean d;
    public float f8999e;
    public float f9000f;
    public boolean h;
    public float f9001n;
    public float f9002r;
    public float f9003s;
    public float v;
    public float f9004w;
    public float f9005x;
    public final org.telegram.ui.Components.y5 f9006y;

    public v0(Context context, int i9, long j10, org.telegram.ui.m0 m0Var) {
        super(context);
        this.d = true;
        this.f9006y = new org.telegram.ui.Components.y5(this, 0L, 350L, gr.h);
        this.A = 1.0f;
        this.C = new ArrayList();
        this.D = new ArrayList();
        this.E = new HashSet();
        this.G = new DecelerateInterpolator();
        this.H = new LinearInterpolator();
        this.f8996a = i9;
        this.f8997b = j10;
        this.f8998c = m0Var;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: gh.v0.a():void");
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.starUserGiftsLoaded && ((Long) objArr[0]).longValue() == this.f8997b) {
            a();
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: gh.v0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f8996a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        ArrayList arrayList = this.D;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((u0) obj).f8941j.a(this);
        }
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f8996a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        ArrayList arrayList = this.D;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((u0) obj).f8941j.o(this);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        u0 u0Var;
        u0 u0Var2;
        u0 u0Var3;
        if (!this.d) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.D;
            if (i9 < arrayList.size()) {
                if (((u0) arrayList.get(i9)).f8943l.contains(x10, y10)) {
                    u0Var = (u0) arrayList.get(i9);
                    break;
                }
                i9++;
            } else {
                u0Var = null;
                break;
            }
        }
        if (motionEvent.getAction() == 0) {
            this.I = u0Var;
            if (u0Var != null) {
                u0Var.f8944m.c(true);
            }
        } else if (motionEvent.getAction() == 2) {
            u0 u0Var4 = this.I;
            if (u0Var4 != u0Var && u0Var4 != null) {
                u0Var4.f8944m.c(false);
                this.I = null;
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.I != null) {
                ve.e.s(getContext(), "https://t.me/nft/" + u0Var3.f8937e);
                this.I.f8944m.c(false);
                this.I = null;
            }
        } else if (motionEvent.getAction() == 3 && (u0Var2 = this.I) != null) {
            u0Var2.f8944m.c(false);
            this.I = null;
        }
        if (this.I == null) {
            return false;
        }
        return true;
    }

    public void setActionBarActionMode(float f10) {
        this.f9001n = f10;
        invalidate();
    }

    public void setActive(boolean z10) {
        this.d = z10;
    }

    public void setExpandCoords(float f10) {
        this.f9004w = f10;
        invalidate();
    }

    public void setExpandProgress(float f10) {
        if (this.f8999e != f10) {
            this.f8999e = f10;
            invalidate();
        }
    }

    public void setProgressToStoriesInsets(float f10) {
        if (this.A == f10) {
            return;
        }
        this.A = f10;
        invalidate();
    }
}
