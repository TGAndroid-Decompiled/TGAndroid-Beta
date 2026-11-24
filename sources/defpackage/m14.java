package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.Components.ChatActivityEnterView;
public class m14 extends gt9 {
    public float A0;
    public boolean B0;
    public boolean C0;
    public VelocityTracker D0;
    public final e34 E0;
    public final int v0;
    public boolean w0;
    public float x0;
    public boolean y0;
    public float z0;

    public m14(e34 e34Var, Context context, ylb ylbVar) {
        super(ylbVar, context, e34Var.j2);
        this.E0 = e34Var;
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
            e34 e34Var = this.E0;
            if (e34Var.P0 != null && Math.abs(motionEvent.getRawY() - this.A0) >= this.v0) {
                this.B0 = true;
                this.A0 = motionEvent.getRawY();
                ((dbc) e34Var.P0).c();
                if (this.w0) {
                    e34Var.h.i();
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
        e34 e34Var = this.E0;
        o04 o04Var = e34Var.g2;
        s04 s04Var = e34Var.h;
        if (this.s != null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.y0) {
            this.y0 = false;
            this.x0 = motionEvent.getX();
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            e34Var.X1 = motionEvent.getRawX();
        }
        if (motionEvent.getAction() == 0) {
            this.C0 = false;
            this.B0 = false;
            this.z0 = motionEvent.getRawX();
            this.A0 = motionEvent.getRawY();
        } else if (!this.B0 && !this.C0 && e34Var.P0 != null) {
            float abs = Math.abs(motionEvent.getRawX() - this.z0);
            float f = this.v0;
            if (abs >= f && canScrollHorizontally((int) (this.z0 - motionEvent.getRawX()))) {
                this.C0 = true;
                gm.r(o04Var);
                e34Var.Y1 = true;
                e34Var.Z();
            } else if (Math.abs(motionEvent.getRawY() - this.A0) >= f) {
                this.B0 = true;
                this.A0 = motionEvent.getRawY();
                ((dbc) e34Var.P0).c();
                if (this.w0) {
                    s04Var.i();
                    this.w0 = false;
                }
            }
        }
        if (e34Var.Y1 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            gm.d3(o04Var, 1500L);
        }
        if (this.B0) {
            VelocityTracker velocityTracker = this.D0;
            if (velocityTracker == null) {
                velocityTracker = VelocityTracker.obtain();
                this.D0 = velocityTracker;
            }
            velocityTracker.addMovement(motionEvent);
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                l14 l14Var = e34Var.P0;
                int round = Math.round(motionEvent.getRawY() - this.A0);
                dbc dbcVar = (dbc) l14Var;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) dbcVar.c;
                if (dbcVar.a()) {
                    Point point = gm.q;
                    if (point.x > point.y) {
                        i = chatActivityEnterView.o3;
                    } else {
                        i = chatActivityEnterView.n3;
                    }
                    int max = Math.max(Math.min(round + dbcVar.b, 0), -(chatActivityEnterView.t4 - i));
                    if (chatActivityEnterView.l7 == null) {
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
                l14 l14Var2 = e34Var.P0;
                if (action == 1) {
                    dbc dbcVar2 = (dbc) l14Var2;
                    ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) dbcVar2.c;
                    if (dbcVar2.a()) {
                        chatActivityEnterView2.u4 = false;
                        if ((!dbcVar2.a || yVelocity < gm.L(200.0f)) && (dbcVar2.a || yVelocity > gm.L(-200.0f))) {
                            boolean z = dbcVar2.a;
                            float f3 = chatActivityEnterView2.s4;
                            if (!z ? f3 < 0.4f : f3 > 0.6f) {
                                chatActivityEnterView2.S1(z, true, true, true);
                            }
                        }
                        chatActivityEnterView2.S1(!dbcVar2.a, true, true, true);
                    }
                } else {
                    dbc dbcVar3 = (dbc) l14Var2;
                    ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) dbcVar3.c;
                    if (chatActivityEnterView3.n4) {
                        chatActivityEnterView3.u4 = false;
                        chatActivityEnterView3.S1(dbcVar3.a, true, false, true);
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
                if (!s04Var.N) {
                    s04Var.f0 = true;
                    s04Var.setScrollState(1);
                    s04Var.S = 0.0f;
                    s04Var.U = 0.0f;
                    VelocityTracker velocityTracker2 = s04Var.a0;
                    if (velocityTracker2 == null) {
                        s04Var.a0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
                    s04Var.a0.addMovement(obtain);
                    obtain.recycle();
                    this.w0 = true;
                    getTranslationX();
                }
            } else if (this.w0 && this.x0 - motionEvent.getX() > 0.0f && s04Var.f0) {
                s04Var.i();
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
                s04Var.i();
                this.w0 = false;
            }
        }
        if (!this.w0 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
