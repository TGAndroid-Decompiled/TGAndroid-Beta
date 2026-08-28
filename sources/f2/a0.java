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
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.v10;
import org.telegram.ui.Components.wk0;
public final class a0 implements c1 {
    public final int f5309a = 0;
    public final Object f5310b;

    public a0(h0 h0Var) {
        this.f5310b = h0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.f5309a) {
            case 0:
                h0 h0Var = (h0) this.f5310b;
                androidx.activity.i iVar = h0Var.E;
                ((GestureDetector) h0Var.J.f17378b).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = h0Var.F;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (h0Var.f5376w != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(h0Var.f5376w);
                    if (findPointerIndex >= 0) {
                        h0Var.h(actionMasked, findPointerIndex, motionEvent);
                    }
                    q1 q1Var = h0Var.f5370c;
                    if (q1Var != null) {
                        int i9 = 0;
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                if (actionMasked != 3) {
                                    if (actionMasked == 6) {
                                        int actionIndex = motionEvent.getActionIndex();
                                        if (motionEvent.getPointerId(actionIndex) == h0Var.f5376w) {
                                            if (actionIndex == 0) {
                                                i9 = 1;
                                            }
                                            h0Var.f5376w = motionEvent.getPointerId(i9);
                                            h0Var.s(h0Var.A, actionIndex, motionEvent);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                VelocityTracker velocityTracker2 = h0Var.F;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (findPointerIndex >= 0) {
                                h0Var.s(h0Var.A, findPointerIndex, motionEvent);
                                h0Var.n(q1Var);
                                h0Var.D.removeCallbacks(iVar);
                                iVar.run();
                                h0Var.D.invalidate();
                                return;
                            } else {
                                return;
                            }
                        }
                        h0Var.p(null, 0);
                        h0Var.f5376w = -1;
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
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int findPointerIndex;
        boolean z10;
        View E;
        pk0 pk0Var;
        switch (this.f5309a) {
            case 0:
                h0 h0Var = (h0) this.f5310b;
                ((GestureDetector) h0Var.J.f17378b).onTouchEvent(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                b0 b0Var = null;
                if (actionMasked == 0) {
                    h0Var.f5376w = motionEvent.getPointerId(0);
                    h0Var.d = motionEvent.getX();
                    h0Var.f5371e = motionEvent.getY();
                    VelocityTracker velocityTracker = h0Var.F;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    h0Var.F = VelocityTracker.obtain();
                    if (h0Var.f5370c == null) {
                        ArrayList arrayList = h0Var.B;
                        if (!arrayList.isEmpty()) {
                            View k10 = h0Var.k(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    b0 b0Var2 = (b0) arrayList.get(size);
                                    if (b0Var2.f5324e.f5501a == k10) {
                                        b0Var = b0Var2;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (b0Var != null) {
                            q1 q1Var = b0Var.f5324e;
                            h0Var.d -= b0Var.f5327r;
                            h0Var.f5371e -= b0Var.f5328s;
                            h0Var.j(q1Var, true);
                            if (h0Var.f5368a.remove(q1Var.f5501a)) {
                                h0Var.f5377x.a(h0Var.D, q1Var);
                            }
                            h0Var.p(q1Var, b0Var.f5325f);
                            h0Var.s(h0Var.A, 0, motionEvent);
                        }
                    }
                } else if (actionMasked != 3 && actionMasked != 1) {
                    int i9 = h0Var.f5376w;
                    if (i9 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i9)) >= 0) {
                        h0Var.h(actionMasked, findPointerIndex, motionEvent);
                    }
                } else {
                    h0Var.f5376w = -1;
                    h0Var.p(null, 0);
                }
                VelocityTracker velocityTracker2 = h0Var.F;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (h0Var.f5370c != null) {
                    return true;
                }
                return false;
            default:
                int actionMasked2 = motionEvent.getActionMasked();
                wk0 wk0Var = (wk0) this.f5310b;
                Rect rect = wk0Var.C1;
                if (wk0Var.getScrollState() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((actionMasked2 == 0 || actionMasked2 == 5) && wk0Var.J1 == null && z10) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    wk0Var.V0 = false;
                    w0 itemAnimator = wk0Var.getItemAnimator();
                    if ((wk0Var.f34250g1 || itemAnimator == null || !itemAnimator.k()) && wk0Var.E0(y10) && (E = wk0Var.E(x10, y10)) != null && wk0Var.F0(E)) {
                        wk0Var.J1 = E;
                    }
                    if (wk0Var.J1 instanceof ViewGroup) {
                        float x11 = motionEvent.getX() - wk0Var.J1.getLeft();
                        float y11 = motionEvent.getY() - wk0Var.J1.getTop();
                        ViewGroup viewGroup = (ViewGroup) wk0Var.J1;
                        int childCount = viewGroup.getChildCount() - 1;
                        while (true) {
                            if (childCount >= 0) {
                                View childAt = viewGroup.getChildAt(childCount);
                                if (x11 >= childAt.getLeft() && x11 <= childAt.getRight() && y11 >= childAt.getTop() && y11 <= childAt.getBottom() && childAt.isClickable()) {
                                    wk0Var.J1 = null;
                                } else {
                                    childCount--;
                                }
                            }
                        }
                    }
                    wk0Var.K1 = -1;
                    View view = wk0Var.J1;
                    if (view != null) {
                        if (wk0Var.f34244d1) {
                            wk0Var.K1 = RecyclerView.S(view);
                        } else {
                            wk0Var.K1 = RecyclerView.R(view);
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), motionEvent.getX() - wk0Var.J1.getLeft(), motionEvent.getY() - wk0Var.J1.getTop(), 0);
                        if (wk0Var.J1.onTouchEvent(obtain)) {
                            wk0Var.L1 = true;
                        }
                        obtain.recycle();
                    }
                }
                if (wk0Var.J1 != null && !wk0Var.L1) {
                    try {
                        wk0Var.I1.a1(motionEvent);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                if (actionMasked2 != 0 && actionMasked2 != 5) {
                    if ((actionMasked2 == 1 || actionMasked2 == 6 || actionMasked2 == 3 || !z10) && wk0Var.J1 != null) {
                        ag.d dVar = wk0Var.f34239a1;
                        if (dVar != null) {
                            AndroidUtilities.cancelRunOnUIThread(dVar);
                            wk0Var.f34239a1 = null;
                        }
                        View view2 = wk0Var.J1;
                        wk0Var.h1(view2, 0.0f, 0.0f, false);
                        wk0Var.J1 = null;
                        wk0Var.L1 = false;
                        wk0Var.k1(motionEvent, view2);
                        if ((actionMasked2 == 1 || actionMasked2 == 6 || actionMasked2 == 3) && (pk0Var = wk0Var.U0) != null && wk0Var.V0) {
                            pk0Var.j();
                            wk0Var.V0 = false;
                        }
                    }
                } else if (!wk0Var.L1 && wk0Var.J1 != null) {
                    float x12 = motionEvent.getX();
                    float y12 = motionEvent.getY();
                    ag.d dVar2 = new ag.d(this, x12, y12, 1);
                    wk0Var.f34239a1 = dVar2;
                    AndroidUtilities.runOnUIThread(dVar2, ViewConfiguration.getTapTimeout());
                    if (wk0Var.J1.isEnabled()) {
                        View view3 = wk0Var.J1;
                        if (wk0Var.H0(view3, x12 - view3.getX(), y12 - wk0Var.J1.getY())) {
                            wk0Var.i1(wk0Var.K1, wk0Var.J1);
                            org.telegram.ui.Cells.z zVar = wk0Var.f34287z1;
                            if (zVar != null) {
                                Drawable current = zVar.getCurrent();
                                if (current instanceof TransitionDrawable) {
                                    if (wk0Var.T0 == null && wk0Var.S0 == null) {
                                        ((TransitionDrawable) current).resetTransition();
                                    } else {
                                        ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                                    }
                                }
                                wk0Var.f34287z1.setHotspot(motionEvent.getX(), motionEvent.getY());
                            }
                            wk0Var.v1();
                        }
                    }
                    rect.setEmpty();
                } else {
                    rect.setEmpty();
                }
                return false;
        }
    }

    @Override
    public final void c(boolean z10) {
        switch (this.f5309a) {
            case 0:
                if (z10) {
                    ((h0) this.f5310b).p(null, 0);
                    return;
                }
                return;
            default:
                ((wk0) this.f5310b).I0(true);
                return;
        }
    }

    public a0(wk0 wk0Var, Context context) {
        this.f5310b = wk0Var;
        n5.e0 e0Var = new n5.e0(context, new rk0(this));
        wk0Var.I1 = e0Var;
        ((v10) e0Var.f18488b).f33224t = false;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
