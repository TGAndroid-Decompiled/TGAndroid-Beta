package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class v23 {
    public final ScaleGestureDetector a;
    public j33 b;
    public float c;
    public float d;
    public final float f;
    public VelocityTracker g;
    public boolean h;
    public long k;
    public boolean l;
    public final float e = gl.L(1.0f);
    public int i = -1;
    public int j = 0;

    public v23(Context context) {
        this.f = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.a = new ScaleGestureDetector(context, new u23(this, (byte) 0));
    }

    public final void a(MotionEvent motionEvent) {
        float x;
        float y;
        float x2;
        float y2;
        float x3;
        float y3;
        i33 i33Var;
        int i;
        this.a.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        boolean z = true;
        if (action != 0) {
            if (action != 1 && action != 3) {
                if (action == 6) {
                    int action2 = (motionEvent.getAction() & 65280) >> 8;
                    if (motionEvent.getPointerId(action2) == this.i) {
                        if (action2 == 0) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        this.i = motionEvent.getPointerId(i);
                        this.c = motionEvent.getX(i);
                        this.d = motionEvent.getY(i);
                    }
                }
            } else {
                if (!this.h && SystemClock.elapsedRealtime() - this.k < 800 && (i33Var = this.b.N) != null) {
                    i33Var.t2();
                }
                this.i = -1;
            }
        } else {
            this.i = motionEvent.getPointerId(0);
            this.k = SystemClock.elapsedRealtime();
        }
        int i2 = this.i;
        if (i2 == -1) {
            i2 = 0;
        }
        this.j = motionEvent.findPointerIndex(i2);
        int action3 = motionEvent.getAction();
        if (action3 != 0) {
            if (action3 != 1) {
                if (action3 != 2) {
                    if (action3 == 3) {
                        VelocityTracker velocityTracker = this.g;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.g = null;
                        }
                        this.l = false;
                        this.h = false;
                        return;
                    }
                    return;
                }
            } else {
                if (this.h) {
                    if (this.g != null) {
                        try {
                            x3 = motionEvent.getX(this.j);
                        } catch (Exception unused) {
                            x3 = motionEvent.getX();
                        }
                        this.c = x3;
                        try {
                            y3 = motionEvent.getY(this.j);
                        } catch (Exception unused2) {
                            y3 = motionEvent.getY();
                        }
                        this.d = y3;
                        this.g.addMovement(motionEvent);
                        this.g.computeCurrentVelocity(1000);
                        if (Math.max(Math.abs(this.g.getXVelocity()), Math.abs(this.g.getYVelocity())) >= this.f) {
                            this.b.getClass();
                        }
                    }
                    this.h = false;
                }
                VelocityTracker velocityTracker2 = this.g;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.g = null;
                }
                this.l = false;
                return;
            }
        }
        if (!this.l) {
            VelocityTracker obtain = VelocityTracker.obtain();
            this.g = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            try {
                x2 = motionEvent.getX(this.j);
            } catch (Exception unused3) {
                x2 = motionEvent.getX();
            }
            this.c = x2;
            try {
                y2 = motionEvent.getY(this.j);
            } catch (Exception unused4) {
                y2 = motionEvent.getY();
            }
            this.d = y2;
            this.h = false;
            this.l = true;
            return;
        }
        try {
            x = motionEvent.getX(this.j);
        } catch (Exception unused5) {
            x = motionEvent.getX();
        }
        try {
            y = motionEvent.getY(this.j);
        } catch (Exception unused6) {
            y = motionEvent.getY();
        }
        float f = x - this.c;
        float f2 = y - this.d;
        boolean z2 = this.h;
        if (!z2) {
            if (((float) Math.sqrt((f2 * f2) + (f * f))) < this.e) {
                z = false;
            }
            this.h = z;
            z2 = z;
        }
        if (z2) {
            j33 j33Var = this.b;
            if (!j33Var.G) {
                j33Var.M.g(f, f2);
                j33Var.r(false);
            }
            this.c = x;
            this.d = y;
            VelocityTracker velocityTracker3 = this.g;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
        }
    }
}
