package lg;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
public final class c {
    public final ScaleGestureDetector f15546a;
    public p f15547b;
    public float f15548c;
    public float d;
    public final float f15550f;
    public VelocityTracker f15551g;
    public boolean h;
    public long f15554k;
    public boolean f15555l;
    public final float f15549e = AndroidUtilities.dp(1.0f);
    public int f15552i = -1;
    public int f15553j = 0;

    public c(Context context) {
        this.f15550f = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.f15546a = new ScaleGestureDetector(context, new b(this, 0));
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
        this.f15546a.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        boolean z10 = true;
        if (action != 0) {
            if (action != 1 && action != 3) {
                if (action == 6) {
                    int action2 = (65280 & motionEvent.getAction()) >> 8;
                    if (motionEvent.getPointerId(action2) == this.f15552i) {
                        if (action2 == 0) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        this.f15552i = motionEvent.getPointerId(i10);
                        this.f15548c = motionEvent.getX(i10);
                        this.d = motionEvent.getY(i10);
                    }
                }
            } else {
                if (!this.h && SystemClock.elapsedRealtime() - this.f15554k < 800 && (oVar = this.f15547b.M) != null) {
                    oVar.U();
                }
                this.f15552i = -1;
            }
        } else {
            this.f15552i = motionEvent.getPointerId(0);
            this.f15554k = SystemClock.elapsedRealtime();
        }
        int i11 = this.f15552i;
        if (i11 == -1) {
            i11 = 0;
        }
        this.f15553j = motionEvent.findPointerIndex(i11);
        int action3 = motionEvent.getAction();
        if (action3 != 0) {
            if (action3 != 1) {
                if (action3 != 2) {
                    if (action3 == 3) {
                        VelocityTracker velocityTracker = this.f15551g;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.f15551g = null;
                        }
                        this.f15555l = false;
                        this.h = false;
                        return;
                    }
                    return;
                }
            } else {
                if (this.h) {
                    if (this.f15551g != null) {
                        try {
                            x12 = motionEvent.getX(this.f15553j);
                        } catch (Exception unused) {
                            x12 = motionEvent.getX();
                        }
                        this.f15548c = x12;
                        try {
                            y11 = motionEvent.getY(this.f15553j);
                        } catch (Exception unused2) {
                            y11 = motionEvent.getY();
                        }
                        this.d = y11;
                        this.f15551g.addMovement(motionEvent);
                        this.f15551g.computeCurrentVelocity(1000);
                        if (Math.max(Math.abs(this.f15551g.getXVelocity()), Math.abs(this.f15551g.getYVelocity())) >= this.f15550f) {
                            this.f15547b.getClass();
                        }
                    }
                    this.h = false;
                }
                VelocityTracker velocityTracker2 = this.f15551g;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f15551g = null;
                }
                this.f15555l = false;
                return;
            }
        }
        if (!this.f15555l) {
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f15551g = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            try {
                x11 = motionEvent.getX(this.f15553j);
            } catch (Exception unused3) {
                x11 = motionEvent.getX();
            }
            this.f15548c = x11;
            try {
                y10 = motionEvent.getY(this.f15553j);
            } catch (Exception unused4) {
                y10 = motionEvent.getY();
            }
            this.d = y10;
            this.h = false;
            this.f15555l = true;
            return;
        }
        try {
            x10 = motionEvent.getX(this.f15553j);
        } catch (Exception unused5) {
            x10 = motionEvent.getX();
        }
        try {
            y3 = motionEvent.getY(this.f15553j);
        } catch (Exception unused6) {
            y3 = motionEvent.getY();
        }
        float f7 = x10 - this.f15548c;
        float f10 = y3 - this.d;
        if (!this.h) {
            if (((float) Math.sqrt((f10 * f10) + (f7 * f7))) < this.f15549e) {
                z10 = false;
            }
            this.h = z10;
        }
        if (this.h) {
            p pVar = this.f15547b;
            if (!pVar.F) {
                n.f(pVar.L, f7, f10);
                pVar.r(false);
            }
            this.f15548c = x10;
            this.d = y3;
            VelocityTracker velocityTracker3 = this.f15551g;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
        }
    }
}
