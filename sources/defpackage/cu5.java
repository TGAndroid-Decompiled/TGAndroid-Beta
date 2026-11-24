package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import androidx.recyclerview.widget.RecyclerView;
public final class cu5 implements j69 {
    public final byte a = 0;
    public final Object b;

    public cu5(r59 r59Var, Context context) {
        this.b = r59Var;
        ai4 ai4Var = new ai4(context, new k59(this));
        r59Var.L1 = ai4Var;
        ((pu4) ai4Var.b).t = false;
    }

    @Override
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                hu5 hu5Var = (hu5) this.b;
                o04 o04Var = hu5Var.J;
                ((GestureDetector) hu5Var.O.a).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = hu5Var.K;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (hu5Var.x != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(hu5Var.x);
                    if (findPointerIndex >= 0) {
                        hu5Var.j(actionMasked, findPointerIndex, motionEvent);
                    }
                    u69 u69Var = hu5Var.c;
                    if (u69Var != null) {
                        int i = 0;
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                if (actionMasked != 3) {
                                    if (actionMasked == 6) {
                                        int actionIndex = motionEvent.getActionIndex();
                                        if (motionEvent.getPointerId(actionIndex) == hu5Var.x) {
                                            if (actionIndex == 0) {
                                                i = 1;
                                            }
                                            hu5Var.x = motionEvent.getPointerId(i);
                                            hu5Var.t(hu5Var.F, actionIndex, motionEvent);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                VelocityTracker velocityTracker2 = hu5Var.K;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (findPointerIndex >= 0) {
                                hu5Var.t(hu5Var.F, findPointerIndex, motionEvent);
                                hu5Var.p(u69Var);
                                hu5Var.I.removeCallbacks(o04Var);
                                o04Var.run();
                                hu5Var.I.invalidate();
                                return;
                            } else {
                                return;
                            }
                        }
                        hu5Var.q(null, 0);
                        hu5Var.x = -1;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cu5.b(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):boolean");
    }

    @Override
    public final void c(boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (z) {
                    ((hu5) obj).q(null, 0);
                    return;
                }
                return;
            default:
                ((r59) obj).J0(true);
                return;
        }
    }

    public cu5(hu5 hu5Var) {
        this.b = hu5Var;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
