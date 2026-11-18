package og;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.g0;
public final class c {
    public final ScaleGestureDetector f21832a;
    public o f21833b;
    public float f21834c;
    public float d;
    public final float f21836f;
    public VelocityTracker f21837g;
    public boolean h;
    public long f21840k;
    public boolean f21841l;
    public final float f21835e = g0.L(1.0f);
    public int f21838i = -1;
    public int f21839j = 0;

    public c(Context context) {
        this.f21836f = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.f21832a = new ScaleGestureDetector(context, new b(this, 0));
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
        this.f21832a.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        boolean z10 = true;
        if (action != 0) {
            if (action != 1 && action != 3) {
                if (action == 6) {
                    int action2 = (65280 & motionEvent.getAction()) >> 8;
                    if (motionEvent.getPointerId(action2) == this.f21838i) {
                        if (action2 == 0) {
                            i7 = 1;
                        } else {
                            i7 = 0;
                        }
                        this.f21838i = motionEvent.getPointerId(i7);
                        this.f21834c = motionEvent.getX(i7);
                        this.d = motionEvent.getY(i7);
                    }
                }
            } else {
                if (!this.h && SystemClock.elapsedRealtime() - this.f21840k < 800 && (nVar = this.f21833b.N) != null) {
                    nVar.G();
                }
                this.f21838i = -1;
            }
        } else {
            this.f21838i = motionEvent.getPointerId(0);
            this.f21840k = SystemClock.elapsedRealtime();
        }
        int i10 = this.f21838i;
        if (i10 == -1) {
            i10 = 0;
        }
        this.f21839j = motionEvent.findPointerIndex(i10);
        int action3 = motionEvent.getAction();
        if (action3 != 0) {
            if (action3 != 1) {
                if (action3 != 2) {
                    if (action3 == 3) {
                        VelocityTracker velocityTracker = this.f21837g;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.f21837g = null;
                        }
                        this.f21841l = false;
                        this.h = false;
                        return;
                    }
                    return;
                }
            } else {
                if (this.h) {
                    if (this.f21837g != null) {
                        try {
                            x12 = motionEvent.getX(this.f21839j);
                        } catch (Exception unused) {
                            x12 = motionEvent.getX();
                        }
                        this.f21834c = x12;
                        try {
                            y12 = motionEvent.getY(this.f21839j);
                        } catch (Exception unused2) {
                            y12 = motionEvent.getY();
                        }
                        this.d = y12;
                        this.f21837g.addMovement(motionEvent);
                        this.f21837g.computeCurrentVelocity(1000);
                        if (Math.max(Math.abs(this.f21837g.getXVelocity()), Math.abs(this.f21837g.getYVelocity())) >= this.f21836f) {
                            this.f21833b.getClass();
                        }
                    }
                    this.h = false;
                }
                VelocityTracker velocityTracker2 = this.f21837g;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f21837g = null;
                }
                this.f21841l = false;
                return;
            }
        }
        if (!this.f21841l) {
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f21837g = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            try {
                x11 = motionEvent.getX(this.f21839j);
            } catch (Exception unused3) {
                x11 = motionEvent.getX();
            }
            this.f21834c = x11;
            try {
                y11 = motionEvent.getY(this.f21839j);
            } catch (Exception unused4) {
                y11 = motionEvent.getY();
            }
            this.d = y11;
            this.h = false;
            this.f21841l = true;
            return;
        }
        try {
            x10 = motionEvent.getX(this.f21839j);
        } catch (Exception unused5) {
            x10 = motionEvent.getX();
        }
        try {
            y10 = motionEvent.getY(this.f21839j);
        } catch (Exception unused6) {
            y10 = motionEvent.getY();
        }
        float f10 = x10 - this.f21834c;
        float f11 = y10 - this.d;
        if (!this.h) {
            if (((float) Math.sqrt((f11 * f11) + (f10 * f10))) < this.f21835e) {
                z10 = false;
            }
            this.h = z10;
        }
        if (this.h) {
            o oVar = this.f21833b;
            if (!oVar.G) {
                m.f(oVar.M, f10, f11);
                oVar.r(false);
            }
            this.f21834c = x10;
            this.d = y10;
            VelocityTracker velocityTracker3 = this.f21837g;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
        }
    }
}
