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
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.m20;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.rl0;
public final class y implements y0 {
    public final int f5850a = 0;
    public final Object f5851b;

    public y(e0 e0Var) {
        this.f5851b = e0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.f5850a) {
            case 0:
                e0 e0Var = (e0) this.f5851b;
                androidx.activity.i iVar = e0Var.F;
                ((GestureDetector) e0Var.K.f31508b).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = e0Var.G;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (e0Var.f5677w != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(e0Var.f5677w);
                    if (findPointerIndex >= 0) {
                        e0Var.h(actionMasked, findPointerIndex, motionEvent);
                    }
                    l1 l1Var = e0Var.f5672c;
                    if (l1Var != null) {
                        int i10 = 0;
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                if (actionMasked != 3) {
                                    if (actionMasked == 6) {
                                        int actionIndex = motionEvent.getActionIndex();
                                        if (motionEvent.getPointerId(actionIndex) == e0Var.f5677w) {
                                            if (actionIndex == 0) {
                                                i10 = 1;
                                            }
                                            e0Var.f5677w = motionEvent.getPointerId(i10);
                                            e0Var.s(e0Var.B, actionIndex, motionEvent);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                VelocityTracker velocityTracker2 = e0Var.G;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (findPointerIndex >= 0) {
                                e0Var.s(e0Var.B, findPointerIndex, motionEvent);
                                e0Var.n(l1Var);
                                e0Var.E.removeCallbacks(iVar);
                                iVar.run();
                                e0Var.E.invalidate();
                                return;
                            } else {
                                return;
                            }
                        }
                        e0Var.p(null, 0);
                        e0Var.f5677w = -1;
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
        boolean z4;
        View E;
        kl0 kl0Var;
        switch (this.f5850a) {
            case 0:
                e0 e0Var = (e0) this.f5851b;
                ((GestureDetector) e0Var.K.f31508b).onTouchEvent(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                z zVar = null;
                if (actionMasked == 0) {
                    e0Var.f5677w = motionEvent.getPointerId(0);
                    e0Var.d = motionEvent.getX();
                    e0Var.e = motionEvent.getY();
                    VelocityTracker velocityTracker = e0Var.G;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    e0Var.G = VelocityTracker.obtain();
                    if (e0Var.f5672c == null) {
                        ArrayList arrayList = e0Var.C;
                        if (!arrayList.isEmpty()) {
                            View k10 = e0Var.k(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    z zVar2 = (z) arrayList.get(size);
                                    if (zVar2.e.f5774a == k10) {
                                        zVar = zVar2;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (zVar != null) {
                            l1 l1Var = zVar.e;
                            e0Var.d -= zVar.f5857r;
                            e0Var.e -= zVar.f5858s;
                            e0Var.j(l1Var, true);
                            if (e0Var.f5670a.remove(l1Var.f5774a)) {
                                e0Var.f5678x.a(e0Var.E, l1Var);
                            }
                            e0Var.p(l1Var, zVar.f5855f);
                            e0Var.s(e0Var.B, 0, motionEvent);
                        }
                    }
                } else if (actionMasked != 3 && actionMasked != 1) {
                    int i10 = e0Var.f5677w;
                    if (i10 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                        e0Var.h(actionMasked, findPointerIndex, motionEvent);
                    }
                } else {
                    e0Var.f5677w = -1;
                    e0Var.p(null, 0);
                }
                VelocityTracker velocityTracker2 = e0Var.G;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (e0Var.f5672c != null) {
                    return true;
                }
                return false;
            default:
                int actionMasked2 = motionEvent.getActionMasked();
                rl0 rl0Var = (rl0) this.f5851b;
                Rect rect = rl0Var.D1;
                if (rl0Var.getScrollState() == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if ((actionMasked2 == 0 || actionMasked2 == 5) && rl0Var.K1 == null && z4) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    rl0Var.W0 = false;
                    t0 itemAnimator = rl0Var.getItemAnimator();
                    if ((rl0Var.f28501h1 || itemAnimator == null || !itemAnimator.k()) && rl0Var.E0(y10) && (E = rl0Var.E(x10, y10)) != null && rl0Var.F0(E)) {
                        rl0Var.K1 = E;
                    }
                    if (rl0Var.K1 instanceof ViewGroup) {
                        float x11 = motionEvent.getX() - rl0Var.K1.getLeft();
                        float y11 = motionEvent.getY() - rl0Var.K1.getTop();
                        ViewGroup viewGroup = (ViewGroup) rl0Var.K1;
                        int childCount = viewGroup.getChildCount() - 1;
                        while (true) {
                            if (childCount >= 0) {
                                View childAt = viewGroup.getChildAt(childCount);
                                if (x11 >= childAt.getLeft() && x11 <= childAt.getRight() && y11 >= childAt.getTop() && y11 <= childAt.getBottom() && childAt.isClickable()) {
                                    rl0Var.K1 = null;
                                } else {
                                    childCount--;
                                }
                            }
                        }
                    }
                    rl0Var.L1 = -1;
                    View view = rl0Var.K1;
                    if (view != null) {
                        if (rl0Var.f28495e1) {
                            rl0Var.L1 = RecyclerView.S(view);
                        } else {
                            rl0Var.L1 = RecyclerView.R(view);
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), motionEvent.getX() - rl0Var.K1.getLeft(), motionEvent.getY() - rl0Var.K1.getTop(), 0);
                        if (rl0Var.K1.onTouchEvent(obtain)) {
                            rl0Var.M1 = true;
                        }
                        obtain.recycle();
                    }
                }
                if (rl0Var.K1 != null && !rl0Var.M1) {
                    try {
                        rl0Var.J1.w2(motionEvent);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                if (actionMasked2 != 0 && actionMasked2 != 5) {
                    if ((actionMasked2 == 1 || actionMasked2 == 6 || actionMasked2 == 3 || !z4) && rl0Var.K1 != null) {
                        fg.d dVar = rl0Var.f28489b1;
                        if (dVar != null) {
                            AndroidUtilities.cancelRunOnUIThread(dVar);
                            rl0Var.f28489b1 = null;
                        }
                        View view2 = rl0Var.K1;
                        rl0Var.g1(view2, 0.0f, 0.0f, false);
                        rl0Var.K1 = null;
                        rl0Var.M1 = false;
                        rl0Var.j1(motionEvent, view2);
                        if ((actionMasked2 == 1 || actionMasked2 == 6 || actionMasked2 == 3) && (kl0Var = rl0Var.V0) != null && rl0Var.W0) {
                            kl0Var.h();
                            rl0Var.W0 = false;
                        }
                    }
                } else if (!rl0Var.M1 && rl0Var.K1 != null) {
                    float x12 = motionEvent.getX();
                    float y12 = motionEvent.getY();
                    fg.d dVar2 = new fg.d(this, x12, y12, 1);
                    rl0Var.f28489b1 = dVar2;
                    AndroidUtilities.runOnUIThread(dVar2, ViewConfiguration.getTapTimeout());
                    if (rl0Var.K1.isEnabled()) {
                        View view3 = rl0Var.K1;
                        if (rl0Var.H0(view3, x12 - view3.getX(), y12 - rl0Var.K1.getY())) {
                            rl0Var.h1(rl0Var.L1, rl0Var.K1);
                            org.telegram.ui.Cells.z zVar3 = rl0Var.A1;
                            if (zVar3 != null) {
                                Drawable current = zVar3.getCurrent();
                                if (current instanceof TransitionDrawable) {
                                    if (rl0Var.U0 == null && rl0Var.T0 == null) {
                                        ((TransitionDrawable) current).resetTransition();
                                    } else {
                                        ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                                    }
                                }
                                rl0Var.A1.setHotspot(motionEvent.getX(), motionEvent.getY());
                            }
                            rl0Var.u1();
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
    public final void c(boolean z4) {
        switch (this.f5850a) {
            case 0:
                if (z4) {
                    ((e0) this.f5851b).p(null, 0);
                    return;
                }
                return;
            default:
                ((rl0) this.f5851b).I0(true);
                return;
        }
    }

    public y(rl0 rl0Var, Context context) {
        this.f5851b = rl0Var;
        o2.i iVar = new o2.i(context, new ml0(this));
        rl0Var.J1 = iVar;
        ((m20) iVar.f16195b).f26943t = false;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
