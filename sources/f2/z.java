package f2;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.y10;
import org.telegram.ui.Components.zk0;

public final class z implements a1 {

    public final int f5867a = 0;

    public final Object f5868b;

    public z(f0 f0Var) {
        this.f5868b = f0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.f5867a) {
            case 0:
                f0 f0Var = (f0) this.f5868b;
                a8.b bVar = f0Var.E;
                ((GestureDetector) f0Var.J.f17823b).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = f0Var.F;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (f0Var.f5664w != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int iFindPointerIndex = motionEvent.findPointerIndex(f0Var.f5664w);
                    if (iFindPointerIndex >= 0) {
                        f0Var.h(actionMasked, iFindPointerIndex, motionEvent);
                    }
                    o1 o1Var = f0Var.f5658c;
                    if (o1Var != null) {
                        if (actionMasked != 1) {
                            if (actionMasked == 2) {
                                if (iFindPointerIndex >= 0) {
                                    f0Var.s(f0Var.A, iFindPointerIndex, motionEvent);
                                    f0Var.n(o1Var);
                                    f0Var.D.removeCallbacks(bVar);
                                    bVar.run();
                                    f0Var.D.invalidate();
                                }
                                break;
                            } else if (actionMasked == 3) {
                                VelocityTracker velocityTracker2 = f0Var.F;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == f0Var.f5664w) {
                                    f0Var.f5664w = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                                    f0Var.s(f0Var.A, actionIndex, motionEvent);
                                }
                                break;
                            }
                        }
                        f0Var.p(null, 0);
                        f0Var.f5664w = -1;
                        break;
                    }
                }
                break;
        }
    }

    @Override
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int iFindPointerIndex;
        View viewE;
        sk0 sk0Var;
        switch (this.f5867a) {
            case 0:
                f0 f0Var = (f0) this.f5868b;
                ((GestureDetector) f0Var.J.f17823b).onTouchEvent(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                a0 a0Var = null;
                if (actionMasked == 0) {
                    f0Var.f5664w = motionEvent.getPointerId(0);
                    f0Var.d = motionEvent.getX();
                    f0Var.f5659e = motionEvent.getY();
                    VelocityTracker velocityTracker = f0Var.F;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    f0Var.F = VelocityTracker.obtain();
                    if (f0Var.f5658c == null) {
                        ArrayList arrayList = f0Var.B;
                        if (!arrayList.isEmpty()) {
                            View viewK = f0Var.k(motionEvent);
                            for (int size = arrayList.size() - 1; size >= 0; size--) {
                                a0 a0Var2 = (a0) arrayList.get(size);
                                if (a0Var2.f5617e.f5789a == viewK) {
                                    a0Var = a0Var2;
                                }
                            }
                        }
                        if (a0Var != null) {
                            o1 o1Var = a0Var.f5617e;
                            f0Var.d -= a0Var.f5620r;
                            f0Var.f5659e -= a0Var.f5621s;
                            f0Var.j(o1Var, true);
                            if (f0Var.f5656a.remove(o1Var.f5789a)) {
                                f0Var.f5665x.a(f0Var.D, o1Var);
                            }
                            f0Var.p(o1Var, a0Var.f5618f);
                            f0Var.s(f0Var.A, 0, motionEvent);
                        }
                    }
                } else if (actionMasked == 3 || actionMasked == 1) {
                    f0Var.f5664w = -1;
                    f0Var.p(null, 0);
                } else {
                    int i10 = f0Var.f5664w;
                    if (i10 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                        f0Var.h(actionMasked, iFindPointerIndex, motionEvent);
                    }
                }
                VelocityTracker velocityTracker2 = f0Var.F;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                return f0Var.f5658c != null;
            default:
                int actionMasked2 = motionEvent.getActionMasked();
                zk0 zk0Var = (zk0) this.f5868b;
                Rect rect = zk0Var.C1;
                boolean z10 = zk0Var.getScrollState() == 0;
                if ((actionMasked2 == 0 || actionMasked2 == 5) && zk0Var.J1 == null && z10) {
                    float x8 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    zk0Var.V0 = false;
                    v0 itemAnimator = zk0Var.getItemAnimator();
                    if ((zk0Var.f35267g1 || itemAnimator == null || !itemAnimator.k()) && zk0Var.E0(y10) && (viewE = zk0Var.E(x8, y10)) != null && zk0Var.F0(viewE)) {
                        zk0Var.J1 = viewE;
                    }
                    if (zk0Var.J1 instanceof ViewGroup) {
                        float x10 = motionEvent.getX() - zk0Var.J1.getLeft();
                        float y11 = motionEvent.getY() - zk0Var.J1.getTop();
                        ViewGroup viewGroup = (ViewGroup) zk0Var.J1;
                        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                            View childAt = viewGroup.getChildAt(childCount);
                            if (x10 >= childAt.getLeft() && x10 <= childAt.getRight() && y11 >= childAt.getTop() && y11 <= childAt.getBottom() && childAt.isClickable()) {
                                zk0Var.J1 = null;
                            }
                        }
                    }
                    zk0Var.K1 = -1;
                    View view = zk0Var.J1;
                    if (view != null) {
                        if (zk0Var.f35261d1) {
                            zk0Var.K1 = RecyclerView.S(view);
                        } else {
                            zk0Var.K1 = RecyclerView.R(view);
                        }
                        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), motionEvent.getX() - zk0Var.J1.getLeft(), motionEvent.getY() - zk0Var.J1.getTop(), 0);
                        if (zk0Var.J1.onTouchEvent(motionEventObtain)) {
                            zk0Var.L1 = true;
                        }
                        motionEventObtain.recycle();
                    }
                }
                if (zk0Var.J1 != null && !zk0Var.L1) {
                    try {
                        zk0Var.I1.P(motionEvent);
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                    break;
                }
                if (actionMasked2 == 0 || actionMasked2 == 5) {
                    if (zk0Var.L1 || zk0Var.J1 == null) {
                        rect.setEmpty();
                    } else {
                        float x11 = motionEvent.getX();
                        float y12 = motionEvent.getY();
                        bg.d dVar = new bg.d(this, x11, y12, 1);
                        zk0Var.f35256a1 = dVar;
                        AndroidUtilities.runOnUIThread(dVar, ViewConfiguration.getTapTimeout());
                        if (zk0Var.J1.isEnabled()) {
                            View view2 = zk0Var.J1;
                            if (zk0Var.H0(view2, x11 - view2.getX(), y12 - zk0Var.J1.getY())) {
                                zk0Var.i1(zk0Var.K1, zk0Var.J1);
                                org.telegram.ui.Cells.z zVar = zk0Var.f35304z1;
                                if (zVar != null) {
                                    Drawable current = zVar.getCurrent();
                                    if (current instanceof TransitionDrawable) {
                                        if (zk0Var.T0 == null && zk0Var.S0 == null) {
                                            ((TransitionDrawable) current).resetTransition();
                                        } else {
                                            ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                                        }
                                    }
                                    zk0Var.f35304z1.setHotspot(motionEvent.getX(), motionEvent.getY());
                                }
                                zk0Var.v1();
                            } else {
                                rect.setEmpty();
                            }
                        } else {
                            rect.setEmpty();
                        }
                    }
                } else if ((actionMasked2 == 1 || actionMasked2 == 6 || actionMasked2 == 3 || !z10) && zk0Var.J1 != null) {
                    bg.d dVar2 = zk0Var.f35256a1;
                    if (dVar2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(dVar2);
                        zk0Var.f35256a1 = null;
                    }
                    View view3 = zk0Var.J1;
                    zk0Var.h1(view3, 0.0f, 0.0f, false);
                    zk0Var.J1 = null;
                    zk0Var.L1 = false;
                    zk0Var.k1(motionEvent, view3);
                    if ((actionMasked2 == 1 || actionMasked2 == 6 || actionMasked2 == 3) && (sk0Var = zk0Var.U0) != null && zk0Var.V0) {
                        sk0Var.i();
                        zk0Var.V0 = false;
                    }
                }
                return false;
        }
    }

    @Override
    public final void c(boolean z10) {
        switch (this.f5867a) {
            case 0:
                if (z10) {
                    ((f0) this.f5868b).p(null, 0);
                    break;
                }
                break;
            default:
                ((zk0) this.f5868b).I0(true);
                break;
        }
    }

    public z(zk0 zk0Var, Context context) {
        this.f5868b = zk0Var;
        n1.d dVar = new n1.d(context, new uk0(this));
        zk0Var.I1 = dVar;
        ((y10) dVar.f18088b).f34776t = false;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
