package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import androidx.recyclerview.widget.RecyclerView;
public final class gu5 implements u79 {
    public final byte a = 1;
    public final Object b;

    public gu5(d79 d79Var, Context context) {
        this.b = d79Var;
        xh4 xh4Var = new xh4(context, new w69(this));
        d79Var.L1 = xh4Var;
        ((su4) xh4Var.b).t = false;
    }

    @Override
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                lu5 lu5Var = (lu5) this.b;
                zz3 zz3Var = lu5Var.J;
                ((GestureDetector) lu5Var.O.b).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = lu5Var.K;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (lu5Var.x != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(lu5Var.x);
                    if (findPointerIndex >= 0) {
                        lu5Var.j(actionMasked, findPointerIndex, motionEvent);
                    }
                    f89 f89Var = lu5Var.c;
                    if (f89Var != null) {
                        int i = 0;
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                if (actionMasked != 3) {
                                    if (actionMasked == 6) {
                                        int actionIndex = motionEvent.getActionIndex();
                                        if (motionEvent.getPointerId(actionIndex) == lu5Var.x) {
                                            if (actionIndex == 0) {
                                                i = 1;
                                            }
                                            lu5Var.x = motionEvent.getPointerId(i);
                                            lu5Var.t(lu5Var.F, actionIndex, motionEvent);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                VelocityTracker velocityTracker2 = lu5Var.K;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (findPointerIndex >= 0) {
                                lu5Var.t(lu5Var.F, findPointerIndex, motionEvent);
                                lu5Var.p(f89Var);
                                lu5Var.I.removeCallbacks(zz3Var);
                                zz3Var.run();
                                lu5Var.I.invalidate();
                                return;
                            } else {
                                return;
                            }
                        }
                        lu5Var.q(null, 0);
                        lu5Var.x = -1;
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final boolean b(androidx.recyclerview.widget.RecyclerView r22, android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gu5.b(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):boolean");
    }

    @Override
    public final void c(boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (z) {
                    ((lu5) obj).q(null, 0);
                    return;
                }
                return;
            default:
                ((d79) obj).K0(true);
                return;
        }
    }

    public gu5(lu5 lu5Var) {
        this.b = lu5Var;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
