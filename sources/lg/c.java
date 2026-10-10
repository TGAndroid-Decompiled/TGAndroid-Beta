package lg;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
public final class c {
    public final ScaleGestureDetector f15511a;
    public p f15512b;
    public float f15513c;
    public float d;
    public final float f15515f;
    public VelocityTracker f15516g;
    public boolean h;
    public long f15519k;
    public boolean f15520l;
    public final float f15514e = AndroidUtilities.dp(1.0f);
    public int f15517i = -1;
    public int f15518j = 0;

    public c(Context context) {
        this.f15515f = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.f15511a = new ScaleGestureDetector(context, new b(this, 0));
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
        this.f15511a.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        boolean z10 = true;
        if (action != 0) {
            if (action != 1 && action != 3) {
                if (action == 6) {
                    int action2 = (65280 & motionEvent.getAction()) >> 8;
                    if (motionEvent.getPointerId(action2) == this.f15517i) {
                        if (action2 == 0) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        this.f15517i = motionEvent.getPointerId(i10);
                        this.f15513c = motionEvent.getX(i10);
                        this.d = motionEvent.getY(i10);
                    }
                }
            } else {
                if (!this.h && SystemClock.elapsedRealtime() - this.f15519k < 800 && (oVar = this.f15512b.M) != null) {
                    oVar.W();
                }
                this.f15517i = -1;
            }
        } else {
            this.f15517i = motionEvent.getPointerId(0);
            this.f15519k = SystemClock.elapsedRealtime();
        }
        int i11 = this.f15517i;
        if (i11 == -1) {
            i11 = 0;
        }
        this.f15518j = motionEvent.findPointerIndex(i11);
        int action3 = motionEvent.getAction();
        if (action3 != 0) {
            if (action3 != 1) {
                if (action3 != 2) {
                    if (action3 == 3) {
                        VelocityTracker velocityTracker = this.f15516g;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.f15516g = null;
                        }
                        this.f15520l = false;
                        this.h = false;
                        return;
                    }
                    return;
                }
            } else {
                if (this.h) {
                    if (this.f15516g != null) {
                        try {
                            x12 = motionEvent.getX(this.f15518j);
                        } catch (Exception unused) {
                            x12 = motionEvent.getX();
                        }
                        this.f15513c = x12;
                        try {
                            y11 = motionEvent.getY(this.f15518j);
                        } catch (Exception unused2) {
                            y11 = motionEvent.getY();
                        }
                        this.d = y11;
                        this.f15516g.addMovement(motionEvent);
                        this.f15516g.computeCurrentVelocity(1000);
                        if (Math.max(Math.abs(this.f15516g.getXVelocity()), Math.abs(this.f15516g.getYVelocity())) >= this.f15515f) {
                            this.f15512b.getClass();
                        }
                    }
                    this.h = false;
                }
                VelocityTracker velocityTracker2 = this.f15516g;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f15516g = null;
                }
                this.f15520l = false;
                return;
            }
        }
        if (!this.f15520l) {
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f15516g = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            try {
                x11 = motionEvent.getX(this.f15518j);
            } catch (Exception unused3) {
                x11 = motionEvent.getX();
            }
            this.f15513c = x11;
            try {
                y10 = motionEvent.getY(this.f15518j);
            } catch (Exception unused4) {
                y10 = motionEvent.getY();
            }
            this.d = y10;
            this.h = false;
            this.f15520l = true;
            return;
        }
        try {
            x10 = motionEvent.getX(this.f15518j);
        } catch (Exception unused5) {
            x10 = motionEvent.getX();
        }
        try {
            y3 = motionEvent.getY(this.f15518j);
        } catch (Exception unused6) {
            y3 = motionEvent.getY();
        }
        float f7 = x10 - this.f15513c;
        float f10 = y3 - this.d;
        if (!this.h) {
            if (((float) Math.sqrt((f10 * f10) + (f7 * f7))) < this.f15514e) {
                z10 = false;
            }
            this.h = z10;
        }
        if (this.h) {
            p pVar = this.f15512b;
            if (!pVar.F) {
                n.f(pVar.L, f7, f10);
                pVar.r(false);
            }
            this.f15513c = x10;
            this.d = y3;
            VelocityTracker velocityTracker3 = this.f15516g;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
        }
    }
}
