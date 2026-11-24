package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import androidx.recyclerview.widget.RecyclerView;
public final class ds5 implements h49 {
    public final byte a = 0;
    public final Object b;

    public ds5(o39 o39Var, Context context) {
        this.b = o39Var;
        z24 z24Var = new z24(context, new h39(this));
        o39Var.L1 = z24Var;
        ((os4) z24Var.b).t = false;
    }

    @Override
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                is5 is5Var = (is5) this.b;
                ez3 ez3Var = is5Var.J;
                ((GestureDetector) is5Var.O.a).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = is5Var.K;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (is5Var.x != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(is5Var.x);
                    if (findPointerIndex >= 0) {
                        is5Var.j(actionMasked, findPointerIndex, motionEvent);
                    }
                    s49 s49Var = is5Var.c;
                    if (s49Var != null) {
                        int i = 0;
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                if (actionMasked != 3) {
                                    if (actionMasked == 6) {
                                        int actionIndex = motionEvent.getActionIndex();
                                        if (motionEvent.getPointerId(actionIndex) == is5Var.x) {
                                            if (actionIndex == 0) {
                                                i = 1;
                                            }
                                            is5Var.x = motionEvent.getPointerId(i);
                                            is5Var.t(is5Var.F, actionIndex, motionEvent);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                VelocityTracker velocityTracker2 = is5Var.K;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (findPointerIndex >= 0) {
                                is5Var.t(is5Var.F, findPointerIndex, motionEvent);
                                is5Var.p(s49Var);
                                is5Var.I.removeCallbacks(ez3Var);
                                ez3Var.run();
                                is5Var.I.invalidate();
                                return;
                            } else {
                                return;
                            }
                        }
                        is5Var.q(null, 0);
                        is5Var.x = -1;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ds5.b(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):boolean");
    }

    @Override
    public final void c(boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (z) {
                    ((is5) obj).q(null, 0);
                    return;
                }
                return;
            default:
                ((o39) obj).J0(true);
                return;
        }
    }

    public ds5(is5 is5Var) {
        this.b = is5Var;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
