package lg;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
public final class c {
    public final ScaleGestureDetector f14039a;
    public p f14040b;
    public float f14041c;
    public float d;
    public final float f14042f;
    public VelocityTracker f14043g;
    public boolean h;
    public long f14046k;
    public boolean f14047l;
    public final float e = AndroidUtilities.dp(1.0f);
    public int f14044i = -1;
    public int f14045j = 0;

    public c(Context context) {
        this.f14042f = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.f14039a = new ScaleGestureDetector(context, new b(this, 0));
    }

    public final void a(MotionEvent motionEvent) {
        float x10;
        float y3;
        float x11;
        float y10;
        float x12;
        float y11;
        o oVar;
        int i10;
        this.f14039a.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        boolean z10 = true;
        if (action != 0) {
            if (action != 1 && action != 3) {
                if (action == 6) {
                    int action2 = (65280 & motionEvent.getAction()) >> 8;
                    if (motionEvent.getPointerId(action2) == this.f14044i) {
                        if (action2 == 0) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        this.f14044i = motionEvent.getPointerId(i10);
                        this.f14041c = motionEvent.getX(i10);
                        this.d = motionEvent.getY(i10);
                    }
                }
            } else {
                if (!this.h && SystemClock.elapsedRealtime() - this.f14046k < 800 && (oVar = this.f14040b.M) != null) {
                    oVar.k0();
                }
                this.f14044i = -1;
            }
        } else {
            this.f14044i = motionEvent.getPointerId(0);
            this.f14046k = SystemClock.elapsedRealtime();
        }
        int i11 = this.f14044i;
        if (i11 == -1) {
            i11 = 0;
        }
        this.f14045j = motionEvent.findPointerIndex(i11);
        int action3 = motionEvent.getAction();
        if (action3 != 0) {
            if (action3 != 1) {
                if (action3 != 2) {
                    if (action3 == 3) {
                        VelocityTracker velocityTracker = this.f14043g;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.f14043g = null;
                        }
                        this.f14047l = false;
                        this.h = false;
                        return;
                    }
                    return;
                }
            } else {
                if (this.h) {
                    if (this.f14043g != null) {
                        try {
                            x12 = motionEvent.getX(this.f14045j);
                        } catch (Exception unused) {
                            x12 = motionEvent.getX();
                        }
                        this.f14041c = x12;
                        try {
                            y11 = motionEvent.getY(this.f14045j);
                        } catch (Exception unused2) {
                            y11 = motionEvent.getY();
                        }
                        this.d = y11;
                        this.f14043g.addMovement(motionEvent);
                        this.f14043g.computeCurrentVelocity(1000);
                        if (Math.max(Math.abs(this.f14043g.getXVelocity()), Math.abs(this.f14043g.getYVelocity())) >= this.f14042f) {
                            this.f14040b.getClass();
                        }
                    }
                    this.h = false;
                }
                VelocityTracker velocityTracker2 = this.f14043g;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f14043g = null;
                }
                this.f14047l = false;
                return;
            }
        }
        if (!this.f14047l) {
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f14043g = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            try {
                x11 = motionEvent.getX(this.f14045j);
            } catch (Exception unused3) {
                x11 = motionEvent.getX();
            }
            this.f14041c = x11;
            try {
                y10 = motionEvent.getY(this.f14045j);
            } catch (Exception unused4) {
                y10 = motionEvent.getY();
            }
            this.d = y10;
            this.h = false;
            this.f14047l = true;
            return;
        }
        try {
            x10 = motionEvent.getX(this.f14045j);
        } catch (Exception unused5) {
            x10 = motionEvent.getX();
        }
        try {
            y3 = motionEvent.getY(this.f14045j);
        } catch (Exception unused6) {
            y3 = motionEvent.getY();
        }
        float f7 = x10 - this.f14041c;
        float f10 = y3 - this.d;
        if (!this.h) {
            if (((float) Math.sqrt((f10 * f10) + (f7 * f7))) < this.e) {
                z10 = false;
            }
            this.h = z10;
        }
        if (this.h) {
            p pVar = this.f14040b;
            if (!pVar.F) {
                n.f(pVar.L, f7, f10);
                pVar.r(false);
            }
            this.f14041c = x10;
            this.d = y3;
            VelocityTracker velocityTracker3 = this.f14043g;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
        }
    }
}
