package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.Components.ChatActivityEnterView;
public class b04 extends er9 {
    public float A0;
    public boolean B0;
    public boolean C0;
    public VelocityTracker D0;
    public final t14 E0;
    public final int v0;
    public boolean w0;
    public float x0;
    public boolean y0;
    public float z0;

    public b04(t14 t14Var, Context context, wjb wjbVar) {
        super(wjbVar, context, t14Var.j2);
        this.E0 = t14Var;
        this.y0 = true;
        this.v0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.s != null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0) {
            this.C0 = false;
            this.B0 = false;
            this.z0 = motionEvent.getRawX();
            this.A0 = motionEvent.getRawY();
        } else if (!this.B0 && !this.C0) {
            t14 t14Var = this.E0;
            if (t14Var.P0 != null && Math.abs(motionEvent.getRawY() - this.A0) >= this.v0) {
                this.B0 = true;
                this.A0 = motionEvent.getRawY();
                ((c9c) t14Var.P0).c();
                if (this.w0) {
                    t14Var.h.i();
                    this.w0 = false;
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        t14 t14Var = this.E0;
        ez3 ez3Var = t14Var.g2;
        iz3 iz3Var = t14Var.h;
        if (this.s != null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.y0) {
            this.y0 = false;
            this.x0 = motionEvent.getX();
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            t14Var.X1 = motionEvent.getRawX();
        }
        if (motionEvent.getAction() == 0) {
            this.C0 = false;
            this.B0 = false;
            this.z0 = motionEvent.getRawX();
            this.A0 = motionEvent.getRawY();
        } else if (!this.B0 && !this.C0 && t14Var.P0 != null) {
            float abs = Math.abs(motionEvent.getRawX() - this.z0);
            float f = this.v0;
            if (abs >= f && canScrollHorizontally((int) (this.z0 - motionEvent.getRawX()))) {
                this.C0 = true;
                gl.r(ez3Var);
                t14Var.Y1 = true;
                t14Var.Z();
            } else if (Math.abs(motionEvent.getRawY() - this.A0) >= f) {
                this.B0 = true;
                this.A0 = motionEvent.getRawY();
                ((c9c) t14Var.P0).c();
                if (this.w0) {
                    iz3Var.i();
                    this.w0 = false;
                }
            }
        }
        if (t14Var.Y1 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            gl.e3(ez3Var, 1500L);
        }
        if (this.B0) {
            VelocityTracker velocityTracker = this.D0;
            if (velocityTracker == null) {
                velocityTracker = VelocityTracker.obtain();
                this.D0 = velocityTracker;
            }
            velocityTracker.addMovement(motionEvent);
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                a04 a04Var = t14Var.P0;
                int round = Math.round(motionEvent.getRawY() - this.A0);
                c9c c9cVar = (c9c) a04Var;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) c9cVar.c;
                if (c9cVar.a()) {
                    Point point = gl.q;
                    if (point.x > point.y) {
                        i = chatActivityEnterView.o3;
                    } else {
                        i = chatActivityEnterView.n3;
                    }
                    int max = Math.max(Math.min(round + c9cVar.b, 0), -(chatActivityEnterView.t4 - i));
                    if (chatActivityEnterView.d7 == null) {
                        float f2 = max;
                        chatActivityEnterView.V0.setTranslationY(f2);
                        chatActivityEnterView.setTranslationY(f2);
                    }
                    chatActivityEnterView.s4 = max / (-(chatActivityEnterView.t4 - i));
                    chatActivityEnterView.c2.invalidate();
                }
            } else {
                this.D0.computeCurrentVelocity(1000);
                float yVelocity = this.D0.getYVelocity();
                this.D0.recycle();
                this.D0 = null;
                int action = motionEvent.getAction();
                a04 a04Var2 = t14Var.P0;
                if (action == 1) {
                    c9c c9cVar2 = (c9c) a04Var2;
                    ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) c9cVar2.c;
                    if (c9cVar2.a()) {
                        chatActivityEnterView2.u4 = false;
                        if ((!c9cVar2.a || yVelocity < gl.L(200.0f)) && (c9cVar2.a || yVelocity > gl.L(-200.0f))) {
                            boolean z = c9cVar2.a;
                            float f3 = chatActivityEnterView2.s4;
                            if (!z ? f3 < 0.4f : f3 > 0.6f) {
                                chatActivityEnterView2.P1(z, true, true, true);
                            }
                        }
                        chatActivityEnterView2.P1(!c9cVar2.a, true, true, true);
                    }
                } else {
                    c9c c9cVar3 = (c9c) a04Var2;
                    ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) c9cVar3.c;
                    if (chatActivityEnterView3.n4) {
                        chatActivityEnterView3.u4 = false;
                        chatActivityEnterView3.P1(c9cVar3.a, true, false, true);
                    }
                }
                this.y0 = true;
                this.C0 = false;
                this.B0 = false;
            }
            cancelLongPress();
            return true;
        }
        float translationX = getTranslationX();
        if (getScrollX() == 0 && translationX == 0.0f) {
            if (!this.w0 && this.x0 - motionEvent.getX() < 0.0f) {
                if (!iz3Var.N) {
                    iz3Var.f0 = true;
                    iz3Var.setScrollState(1);
                    iz3Var.S = 0.0f;
                    iz3Var.U = 0.0f;
                    VelocityTracker velocityTracker2 = iz3Var.a0;
                    if (velocityTracker2 == null) {
                        iz3Var.a0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
                    iz3Var.a0.addMovement(obtain);
                    obtain.recycle();
                    this.w0 = true;
                    getTranslationX();
                }
            } else if (this.w0 && this.x0 - motionEvent.getX() > 0.0f && iz3Var.f0) {
                iz3Var.i();
                this.w0 = false;
            }
        }
        if (this.w0) {
            motionEvent.getX();
        }
        this.x0 = motionEvent.getX();
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.y0 = true;
            this.C0 = false;
            this.B0 = false;
            if (this.w0) {
                iz3Var.i();
                this.w0 = false;
            }
        }
        if (!this.w0 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
