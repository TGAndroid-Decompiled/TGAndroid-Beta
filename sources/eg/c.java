package eg;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.i0;
public final class c {
    public final ScaleGestureDetector f6522a;
    public q f6523b;
    public float f6524c;
    public float d;
    public final float f6525f;
    public VelocityTracker f6526g;
    public boolean h;
    public long f6529k;
    public boolean f6530l;
    public final float e = i0.L(1.0f);
    public int f6527i = -1;
    public int f6528j = 0;

    public c(Context context) {
        this.f6525f = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.f6522a = new ScaleGestureDetector(context, new b(this, 0));
    }

    public final void a(MotionEvent motionEvent) {
        float x10;
        float y3;
        float x11;
        float y10;
        float x12;
        float y11;
        p pVar;
        int i10;
        this.f6522a.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        boolean z10 = true;
        if (action != 0) {
            if (action != 1 && action != 3) {
                if (action == 6) {
                    int action2 = (65280 & motionEvent.getAction()) >> 8;
                    if (motionEvent.getPointerId(action2) == this.f6527i) {
                        if (action2 == 0) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        this.f6527i = motionEvent.getPointerId(i10);
                        this.f6524c = motionEvent.getX(i10);
                        this.d = motionEvent.getY(i10);
                    }
                }
            } else {
                if (!this.h && SystemClock.elapsedRealtime() - this.f6529k < 800 && (pVar = this.f6523b.M) != null) {
                    pVar.n();
                }
                this.f6527i = -1;
            }
        } else {
            this.f6527i = motionEvent.getPointerId(0);
            this.f6529k = SystemClock.elapsedRealtime();
        }
        int i11 = this.f6527i;
        if (i11 == -1) {
            i11 = 0;
        }
        this.f6528j = motionEvent.findPointerIndex(i11);
        int action3 = motionEvent.getAction();
        if (action3 != 0) {
            if (action3 != 1) {
                if (action3 != 2) {
                    if (action3 == 3) {
                        VelocityTracker velocityTracker = this.f6526g;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.f6526g = null;
                        }
                        this.f6530l = false;
                        this.h = false;
                        return;
                    }
                    return;
                }
            } else {
                if (this.h) {
                    if (this.f6526g != null) {
                        try {
                            x12 = motionEvent.getX(this.f6528j);
                        } catch (Exception unused) {
                            x12 = motionEvent.getX();
                        }
                        this.f6524c = x12;
                        try {
                            y11 = motionEvent.getY(this.f6528j);
                        } catch (Exception unused2) {
                            y11 = motionEvent.getY();
                        }
                        this.d = y11;
                        this.f6526g.addMovement(motionEvent);
                        this.f6526g.computeCurrentVelocity(1000);
                        if (Math.max(Math.abs(this.f6526g.getXVelocity()), Math.abs(this.f6526g.getYVelocity())) >= this.f6525f) {
                            this.f6523b.getClass();
                        }
                    }
                    this.h = false;
                }
                VelocityTracker velocityTracker2 = this.f6526g;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f6526g = null;
                }
                this.f6530l = false;
                return;
            }
        }
        if (!this.f6530l) {
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f6526g = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            try {
                x11 = motionEvent.getX(this.f6528j);
            } catch (Exception unused3) {
                x11 = motionEvent.getX();
            }
            this.f6524c = x11;
            try {
                y10 = motionEvent.getY(this.f6528j);
            } catch (Exception unused4) {
                y10 = motionEvent.getY();
            }
            this.d = y10;
            this.h = false;
            this.f6530l = true;
            return;
        }
        try {
            x10 = motionEvent.getX(this.f6528j);
        } catch (Exception unused5) {
            x10 = motionEvent.getX();
        }
        try {
            y3 = motionEvent.getY(this.f6528j);
        } catch (Exception unused6) {
            y3 = motionEvent.getY();
        }
        float f7 = x10 - this.f6524c;
        float f10 = y3 - this.d;
        if (!this.h) {
            if (((float) Math.sqrt((f10 * f10) + (f7 * f7))) < this.e) {
                z10 = false;
            }
            this.h = z10;
        }
        if (this.h) {
            q qVar = this.f6523b;
            if (!qVar.F) {
                o.f(qVar.L, f7, f10);
                qVar.r(false);
            }
            this.f6524c = x10;
            this.d = y3;
            VelocityTracker velocityTracker3 = this.f6526g;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
        }
    }
}
