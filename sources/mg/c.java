package mg;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
public final class c {
    public final ScaleGestureDetector f16853a;
    public p f16854b;
    public float f16855c;
    public float d;
    public final float f16856f;
    public VelocityTracker f16857g;
    public boolean h;
    public long f16860k;
    public boolean f16861l;
    public final float e = AndroidUtilities.dp(1.0f);
    public int f16858i = -1;
    public int f16859j = 0;

    public c(Context context) {
        this.f16856f = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.f16853a = new ScaleGestureDetector(context, new b(this, 0));
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
        this.f16853a.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        boolean z10 = true;
        if (action != 0) {
            if (action != 1 && action != 3) {
                if (action == 6) {
                    int action2 = (65280 & motionEvent.getAction()) >> 8;
                    if (motionEvent.getPointerId(action2) == this.f16858i) {
                        if (action2 == 0) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        this.f16858i = motionEvent.getPointerId(i10);
                        this.f16855c = motionEvent.getX(i10);
                        this.d = motionEvent.getY(i10);
                    }
                }
            } else {
                if (!this.h && SystemClock.elapsedRealtime() - this.f16860k < 800 && (oVar = this.f16854b.M) != null) {
                    oVar.V();
                }
                this.f16858i = -1;
            }
        } else {
            this.f16858i = motionEvent.getPointerId(0);
            this.f16860k = SystemClock.elapsedRealtime();
        }
        int i11 = this.f16858i;
        if (i11 == -1) {
            i11 = 0;
        }
        this.f16859j = motionEvent.findPointerIndex(i11);
        int action3 = motionEvent.getAction();
        if (action3 != 0) {
            if (action3 != 1) {
                if (action3 != 2) {
                    if (action3 == 3) {
                        VelocityTracker velocityTracker = this.f16857g;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.f16857g = null;
                        }
                        this.f16861l = false;
                        this.h = false;
                        return;
                    }
                    return;
                }
            } else {
                if (this.h) {
                    if (this.f16857g != null) {
                        try {
                            x12 = motionEvent.getX(this.f16859j);
                        } catch (Exception unused) {
                            x12 = motionEvent.getX();
                        }
                        this.f16855c = x12;
                        try {
                            y11 = motionEvent.getY(this.f16859j);
                        } catch (Exception unused2) {
                            y11 = motionEvent.getY();
                        }
                        this.d = y11;
                        this.f16857g.addMovement(motionEvent);
                        this.f16857g.computeCurrentVelocity(1000);
                        if (Math.max(Math.abs(this.f16857g.getXVelocity()), Math.abs(this.f16857g.getYVelocity())) >= this.f16856f) {
                            this.f16854b.getClass();
                        }
                    }
                    this.h = false;
                }
                VelocityTracker velocityTracker2 = this.f16857g;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f16857g = null;
                }
                this.f16861l = false;
                return;
            }
        }
        if (!this.f16861l) {
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f16857g = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            try {
                x11 = motionEvent.getX(this.f16859j);
            } catch (Exception unused3) {
                x11 = motionEvent.getX();
            }
            this.f16855c = x11;
            try {
                y10 = motionEvent.getY(this.f16859j);
            } catch (Exception unused4) {
                y10 = motionEvent.getY();
            }
            this.d = y10;
            this.h = false;
            this.f16861l = true;
            return;
        }
        try {
            x10 = motionEvent.getX(this.f16859j);
        } catch (Exception unused5) {
            x10 = motionEvent.getX();
        }
        try {
            y3 = motionEvent.getY(this.f16859j);
        } catch (Exception unused6) {
            y3 = motionEvent.getY();
        }
        float f7 = x10 - this.f16855c;
        float f10 = y3 - this.d;
        if (!this.h) {
            if (((float) Math.sqrt((f10 * f10) + (f7 * f7))) < this.e) {
                z10 = false;
            }
            this.h = z10;
        }
        if (this.h) {
            p pVar = this.f16854b;
            if (!pVar.F) {
                n.f(pVar.L, f7, f10);
                pVar.r(false);
            }
            this.f16855c = x10;
            this.d = y3;
            VelocityTracker velocityTracker3 = this.f16857g;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
        }
    }
}
