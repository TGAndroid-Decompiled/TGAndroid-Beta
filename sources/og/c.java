package og;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.g0;
public final class c {
    public final ScaleGestureDetector f21854a;
    public o f21855b;
    public float f21856c;
    public float d;
    public final float f21858f;
    public VelocityTracker f21859g;
    public boolean h;
    public long f21862k;
    public boolean f21863l;
    public final float f21857e = g0.L(1.0f);
    public int f21860i = -1;
    public int f21861j = 0;

    public c(Context context) {
        this.f21858f = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.f21854a = new ScaleGestureDetector(context, new b(this, 0));
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
        this.f21854a.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        boolean z10 = true;
        if (action != 0) {
            if (action != 1 && action != 3) {
                if (action == 6) {
                    int action2 = (65280 & motionEvent.getAction()) >> 8;
                    if (motionEvent.getPointerId(action2) == this.f21860i) {
                        if (action2 == 0) {
                            i7 = 1;
                        } else {
                            i7 = 0;
                        }
                        this.f21860i = motionEvent.getPointerId(i7);
                        this.f21856c = motionEvent.getX(i7);
                        this.d = motionEvent.getY(i7);
                    }
                }
            } else {
                if (!this.h && SystemClock.elapsedRealtime() - this.f21862k < 800 && (nVar = this.f21855b.N) != null) {
                    nVar.G();
                }
                this.f21860i = -1;
            }
        } else {
            this.f21860i = motionEvent.getPointerId(0);
            this.f21862k = SystemClock.elapsedRealtime();
        }
        int i10 = this.f21860i;
        if (i10 == -1) {
            i10 = 0;
        }
        this.f21861j = motionEvent.findPointerIndex(i10);
        int action3 = motionEvent.getAction();
        if (action3 != 0) {
            if (action3 != 1) {
                if (action3 != 2) {
                    if (action3 == 3) {
                        VelocityTracker velocityTracker = this.f21859g;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.f21859g = null;
                        }
                        this.f21863l = false;
                        this.h = false;
                        return;
                    }
                    return;
                }
            } else {
                if (this.h) {
                    if (this.f21859g != null) {
                        try {
                            x12 = motionEvent.getX(this.f21861j);
                        } catch (Exception unused) {
                            x12 = motionEvent.getX();
                        }
                        this.f21856c = x12;
                        try {
                            y12 = motionEvent.getY(this.f21861j);
                        } catch (Exception unused2) {
                            y12 = motionEvent.getY();
                        }
                        this.d = y12;
                        this.f21859g.addMovement(motionEvent);
                        this.f21859g.computeCurrentVelocity(1000);
                        if (Math.max(Math.abs(this.f21859g.getXVelocity()), Math.abs(this.f21859g.getYVelocity())) >= this.f21858f) {
                            this.f21855b.getClass();
                        }
                    }
                    this.h = false;
                }
                VelocityTracker velocityTracker2 = this.f21859g;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f21859g = null;
                }
                this.f21863l = false;
                return;
            }
        }
        if (!this.f21863l) {
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f21859g = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            try {
                x11 = motionEvent.getX(this.f21861j);
            } catch (Exception unused3) {
                x11 = motionEvent.getX();
            }
            this.f21856c = x11;
            try {
                y11 = motionEvent.getY(this.f21861j);
            } catch (Exception unused4) {
                y11 = motionEvent.getY();
            }
            this.d = y11;
            this.h = false;
            this.f21863l = true;
            return;
        }
        try {
            x10 = motionEvent.getX(this.f21861j);
        } catch (Exception unused5) {
            x10 = motionEvent.getX();
        }
        try {
            y10 = motionEvent.getY(this.f21861j);
        } catch (Exception unused6) {
            y10 = motionEvent.getY();
        }
        float f10 = x10 - this.f21856c;
        float f11 = y10 - this.d;
        if (!this.h) {
            if (((float) Math.sqrt((f11 * f11) + (f10 * f10))) < this.f21857e) {
                z10 = false;
            }
            this.h = z10;
        }
        if (this.h) {
            o oVar = this.f21855b;
            if (!oVar.G) {
                m.f(oVar.M, f10, f11);
                oVar.r(false);
            }
            this.f21856c = x10;
            this.d = y10;
            VelocityTracker velocityTracker3 = this.f21859g;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
        }
    }
}
