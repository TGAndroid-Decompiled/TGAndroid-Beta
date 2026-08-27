package m;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

public abstract class v1 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    public final float f17488a;

    public final int f17489b;

    public final int f17490c;
    public final View d;

    public u1 f17491e;

    public u1 f17492f;
    public boolean h;

    public int f17493n;

    public final int[] f17494r = new int[2];

    public v1(View view) {
        this.d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f17488a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f17489b = tapTimeout;
        this.f17490c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        u1 u1Var = this.f17492f;
        View view = this.d;
        if (u1Var != null) {
            view.removeCallbacks(u1Var);
        }
        u1 u1Var2 = this.f17491e;
        if (u1Var2 != null) {
            view.removeCallbacks(u1Var2);
        }
    }

    public abstract l.c0 b();

    public abstract boolean c();

    public boolean d() {
        l.c0 c0VarB = b();
        if (c0VarB == null || !c0VarB.a()) {
            return true;
        }
        c0VarB.dismiss();
        return true;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        s1 s1VarF;
        boolean z11 = this.h;
        View view2 = this.d;
        if (z11) {
            l.c0 c0VarB = b();
            if (c0VarB != null && c0VarB.a() && (s1VarF = c0VarB.f()) != null && s1VarF.isShown()) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f17494r;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                s1VarF.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zB = s1VarF.b(this.f17493n, motionEventObtainNoHistory);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z12 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zB && z12) {
                    z10 = true;
                } else if (d()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } else if (d()) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.f17493n = motionEvent.getPointerId(0);
                    if (this.f17491e == null) {
                        this.f17491e = new u1(this, 0);
                    }
                    view2.postDelayed(this.f17491e, this.f17489b);
                    if (this.f17492f == null) {
                        this.f17492f = new u1(this, 1);
                    }
                    view2.postDelayed(this.f17492f, this.f17490c);
                } else if (actionMasked2 == 1) {
                    a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f17493n);
                    if (iFindPointerIndex >= 0) {
                        float x8 = motionEvent.getX(iFindPointerIndex);
                        float y10 = motionEvent.getY(iFindPointerIndex);
                        float f10 = this.f17488a;
                        float f11 = -f10;
                        if (x8 < f11 || y10 < f11 || x8 >= (view2.getRight() - view2.getLeft()) + f10 || y10 >= (view2.getBottom() - view2.getTop()) + f10) {
                            a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            z10 = c();
                        }
                    }
                } else if (actionMasked2 == 3) {
                    a();
                }
            }
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.h = z10;
        return z10 || z11;
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.h = false;
        this.f17493n = -1;
        u1 u1Var = this.f17491e;
        if (u1Var != null) {
            this.d.removeCallbacks(u1Var);
        }
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
    }
}
