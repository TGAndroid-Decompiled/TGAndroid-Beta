package ng;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
public final class c {
    public final ScaleGestureDetector f18784a;
    public p f18785b;
    public float f18786c;
    public float d;
    public final float f18787f;
    public VelocityTracker f18788g;
    public boolean h;
    public long f18791k;
    public boolean f18792l;
    public final float e = AndroidUtilities.dp(1.0f);
    public int f18789i = -1;
    public int f18790j = 0;

    public c(Context context) {
        this.f18787f = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.f18784a = new ScaleGestureDetector(context, new b(this, 0));
    }

    public final void a(MotionEvent motionEvent) {
        float x9;
        float y3;
        float x10;
        float y10;
        float x11;
        float y11;
        o oVar;
        int i10;
        this.f18784a.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        boolean z10 = true;
        if (action != 0) {
            if (action != 1 && action != 3) {
                if (action == 6) {
                    int action2 = (65280 & motionEvent.getAction()) >> 8;
                    if (motionEvent.getPointerId(action2) == this.f18789i) {
                        if (action2 == 0) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        this.f18789i = motionEvent.getPointerId(i10);
                        this.f18786c = motionEvent.getX(i10);
                        this.d = motionEvent.getY(i10);
                    }
                }
            } else {
                if (!this.h && SystemClock.elapsedRealtime() - this.f18791k < 800 && (oVar = this.f18785b.M) != null) {
                    oVar.P();
                }
                this.f18789i = -1;
            }
        } else {
            this.f18789i = motionEvent.getPointerId(0);
            this.f18791k = SystemClock.elapsedRealtime();
        }
        int i11 = this.f18789i;
        if (i11 == -1) {
            i11 = 0;
        }
        this.f18790j = motionEvent.findPointerIndex(i11);
        int action3 = motionEvent.getAction();
        if (action3 != 0) {
            if (action3 != 1) {
                if (action3 != 2) {
                    if (action3 == 3) {
                        VelocityTracker velocityTracker = this.f18788g;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.f18788g = null;
                        }
                        this.f18792l = false;
                        this.h = false;
                        return;
                    }
                    return;
                }
            } else {
                if (this.h) {
                    if (this.f18788g != null) {
                        try {
                            x11 = motionEvent.getX(this.f18790j);
                        } catch (Exception unused) {
                            x11 = motionEvent.getX();
                        }
                        this.f18786c = x11;
                        try {
                            y11 = motionEvent.getY(this.f18790j);
                        } catch (Exception unused2) {
                            y11 = motionEvent.getY();
                        }
                        this.d = y11;
                        this.f18788g.addMovement(motionEvent);
                        this.f18788g.computeCurrentVelocity(1000);
                        if (Math.max(Math.abs(this.f18788g.getXVelocity()), Math.abs(this.f18788g.getYVelocity())) >= this.f18787f) {
                            this.f18785b.getClass();
                        }
                    }
                    this.h = false;
                }
                VelocityTracker velocityTracker2 = this.f18788g;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f18788g = null;
                }
                this.f18792l = false;
                return;
            }
        }
        if (!this.f18792l) {
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f18788g = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            try {
                x10 = motionEvent.getX(this.f18790j);
            } catch (Exception unused3) {
                x10 = motionEvent.getX();
            }
            this.f18786c = x10;
            try {
                y10 = motionEvent.getY(this.f18790j);
            } catch (Exception unused4) {
                y10 = motionEvent.getY();
            }
            this.d = y10;
            this.h = false;
            this.f18792l = true;
            return;
        }
        try {
            x9 = motionEvent.getX(this.f18790j);
        } catch (Exception unused5) {
            x9 = motionEvent.getX();
        }
        try {
            y3 = motionEvent.getY(this.f18790j);
        } catch (Exception unused6) {
            y3 = motionEvent.getY();
        }
        float f7 = x9 - this.f18786c;
        float f10 = y3 - this.d;
        if (!this.h) {
            if (((float) Math.sqrt((f10 * f10) + (f7 * f7))) < this.e) {
                z10 = false;
            }
            this.h = z10;
        }
        if (this.h) {
            p pVar = this.f18785b;
            if (!pVar.F) {
                n.f(pVar.L, f7, f10);
                pVar.r(false);
            }
            this.f18786c = x9;
            this.d = y3;
            VelocityTracker velocityTracker3 = this.f18788g;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
        }
    }
}
