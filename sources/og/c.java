package og;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.g0;
public final class c {
    public final ScaleGestureDetector f20940a;
    public o f20941b;
    public float f20942c;
    public float d;
    public final float f20944f;
    public VelocityTracker f20945g;
    public boolean h;
    public long f20948k;
    public boolean f20949l;
    public final float f20943e = g0.L(1.0f);
    public int f20946i = -1;
    public int f20947j = 0;

    public c(Context context) {
        this.f20944f = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.f20940a = new ScaleGestureDetector(context, new b(this, 0));
    }

    public final void a(MotionEvent motionEvent) {
        float x10;
        float y10;
        float x11;
        float y11;
        float x12;
        float y12;
        n nVar;
        int i7;
        this.f20940a.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        boolean z9 = true;
        if (action != 0) {
            if (action != 1 && action != 3) {
                if (action == 6) {
                    int action2 = (65280 & motionEvent.getAction()) >> 8;
                    if (motionEvent.getPointerId(action2) == this.f20946i) {
                        if (action2 == 0) {
                            i7 = 1;
                        } else {
                            i7 = 0;
                        }
                        this.f20946i = motionEvent.getPointerId(i7);
                        this.f20942c = motionEvent.getX(i7);
                        this.d = motionEvent.getY(i7);
                    }
                }
            } else {
                if (!this.h && SystemClock.elapsedRealtime() - this.f20948k < 800 && (nVar = this.f20941b.M) != null) {
                    nVar.c0();
                }
                this.f20946i = -1;
            }
        } else {
            this.f20946i = motionEvent.getPointerId(0);
            this.f20948k = SystemClock.elapsedRealtime();
        }
        int i10 = this.f20946i;
        if (i10 == -1) {
            i10 = 0;
        }
        this.f20947j = motionEvent.findPointerIndex(i10);
        int action3 = motionEvent.getAction();
        if (action3 != 0) {
            if (action3 != 1) {
                if (action3 != 2) {
                    if (action3 == 3) {
                        VelocityTracker velocityTracker = this.f20945g;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.f20945g = null;
                        }
                        this.f20949l = false;
                        this.h = false;
                        return;
                    }
                    return;
                }
            } else {
                if (this.h) {
                    if (this.f20945g != null) {
                        try {
                            x12 = motionEvent.getX(this.f20947j);
                        } catch (Exception unused) {
                            x12 = motionEvent.getX();
                        }
                        this.f20942c = x12;
                        try {
                            y12 = motionEvent.getY(this.f20947j);
                        } catch (Exception unused2) {
                            y12 = motionEvent.getY();
                        }
                        this.d = y12;
                        this.f20945g.addMovement(motionEvent);
                        this.f20945g.computeCurrentVelocity(1000);
                        if (Math.max(Math.abs(this.f20945g.getXVelocity()), Math.abs(this.f20945g.getYVelocity())) >= this.f20944f) {
                            this.f20941b.getClass();
                        }
                    }
                    this.h = false;
                }
                VelocityTracker velocityTracker2 = this.f20945g;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f20945g = null;
                }
                this.f20949l = false;
                return;
            }
        }
        if (!this.f20949l) {
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f20945g = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            try {
                x11 = motionEvent.getX(this.f20947j);
            } catch (Exception unused3) {
                x11 = motionEvent.getX();
            }
            this.f20942c = x11;
            try {
                y11 = motionEvent.getY(this.f20947j);
            } catch (Exception unused4) {
                y11 = motionEvent.getY();
            }
            this.d = y11;
            this.h = false;
            this.f20949l = true;
            return;
        }
        try {
            x10 = motionEvent.getX(this.f20947j);
        } catch (Exception unused5) {
            x10 = motionEvent.getX();
        }
        try {
            y10 = motionEvent.getY(this.f20947j);
        } catch (Exception unused6) {
            y10 = motionEvent.getY();
        }
        float f10 = x10 - this.f20942c;
        float f11 = y10 - this.d;
        if (!this.h) {
            if (((float) Math.sqrt((f11 * f11) + (f10 * f10))) < this.f20943e) {
                z9 = false;
            }
            this.h = z9;
        }
        if (this.h) {
            o oVar = this.f20941b;
            if (!oVar.F) {
                m.f(oVar.L, f10, f11);
                oVar.r(false);
            }
            this.f20942c = x10;
            this.d = y10;
            VelocityTracker velocityTracker3 = this.f20945g;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
        }
    }
}
