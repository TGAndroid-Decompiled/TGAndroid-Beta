package mg;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
public final class c {
    public final ScaleGestureDetector f16236a;
    public q f16237b;
    public float f16238c;
    public float d;
    public final float f16240f;
    public VelocityTracker f16241g;
    public boolean h;
    public long f16244k;
    public boolean f16245l;
    public final float f16239e = AndroidUtilities.dp(1.0f);
    public int f16242i = -1;
    public int f16243j = 0;

    public c(Context context) {
        this.f16240f = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.f16236a = new ScaleGestureDetector(context, new b(this, 0));
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
        this.f16236a.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        boolean z10 = true;
        if (action != 0) {
            if (action != 1 && action != 3) {
                if (action == 6) {
                    int action2 = (65280 & motionEvent.getAction()) >> 8;
                    if (motionEvent.getPointerId(action2) == this.f16242i) {
                        if (action2 == 0) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        this.f16242i = motionEvent.getPointerId(i10);
                        this.f16238c = motionEvent.getX(i10);
                        this.d = motionEvent.getY(i10);
                    }
                }
            } else {
                if (!this.h && SystemClock.elapsedRealtime() - this.f16244k < 800 && (pVar = this.f16237b.M) != null) {
                    pVar.b0();
                }
                this.f16242i = -1;
            }
        } else {
            this.f16242i = motionEvent.getPointerId(0);
            this.f16244k = SystemClock.elapsedRealtime();
        }
        int i11 = this.f16242i;
        if (i11 == -1) {
            i11 = 0;
        }
        this.f16243j = motionEvent.findPointerIndex(i11);
        int action3 = motionEvent.getAction();
        if (action3 != 0) {
            if (action3 != 1) {
                if (action3 != 2) {
                    if (action3 == 3) {
                        VelocityTracker velocityTracker = this.f16241g;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.f16241g = null;
                        }
                        this.f16245l = false;
                        this.h = false;
                        return;
                    }
                    return;
                }
            } else {
                if (this.h) {
                    if (this.f16241g != null) {
                        try {
                            x12 = motionEvent.getX(this.f16243j);
                        } catch (Exception unused) {
                            x12 = motionEvent.getX();
                        }
                        this.f16238c = x12;
                        try {
                            y11 = motionEvent.getY(this.f16243j);
                        } catch (Exception unused2) {
                            y11 = motionEvent.getY();
                        }
                        this.d = y11;
                        this.f16241g.addMovement(motionEvent);
                        this.f16241g.computeCurrentVelocity(1000);
                        if (Math.max(Math.abs(this.f16241g.getXVelocity()), Math.abs(this.f16241g.getYVelocity())) >= this.f16240f) {
                            this.f16237b.getClass();
                        }
                    }
                    this.h = false;
                }
                VelocityTracker velocityTracker2 = this.f16241g;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f16241g = null;
                }
                this.f16245l = false;
                return;
            }
        }
        if (!this.f16245l) {
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f16241g = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            try {
                x11 = motionEvent.getX(this.f16243j);
            } catch (Exception unused3) {
                x11 = motionEvent.getX();
            }
            this.f16238c = x11;
            try {
                y10 = motionEvent.getY(this.f16243j);
            } catch (Exception unused4) {
                y10 = motionEvent.getY();
            }
            this.d = y10;
            this.h = false;
            this.f16245l = true;
            return;
        }
        try {
            x10 = motionEvent.getX(this.f16243j);
        } catch (Exception unused5) {
            x10 = motionEvent.getX();
        }
        try {
            y3 = motionEvent.getY(this.f16243j);
        } catch (Exception unused6) {
            y3 = motionEvent.getY();
        }
        float f7 = x10 - this.f16238c;
        float f10 = y3 - this.d;
        if (!this.h) {
            if (((float) Math.sqrt((f10 * f10) + (f7 * f7))) < this.f16239e) {
                z10 = false;
            }
            this.h = z10;
        }
        if (this.h) {
            q qVar = this.f16237b;
            if (!qVar.F) {
                o.f(qVar.L, f7, f10);
                qVar.r(false);
            }
            this.f16238c = x10;
            this.d = y3;
            VelocityTracker velocityTracker3 = this.f16241g;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
        }
    }
}
