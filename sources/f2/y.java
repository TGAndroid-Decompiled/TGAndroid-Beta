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
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.m20;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.sl0;
public final class y implements z0 {
    public final int f5955a = 0;
    public final Object f5956b;

    public y(f0 f0Var) {
        this.f5956b = f0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.f5955a) {
            case 0:
                f0 f0Var = (f0) this.f5956b;
                androidx.activity.i iVar = f0Var.F;
                ((GestureDetector) f0Var.K.f22790b).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = f0Var.G;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (f0Var.f5765w != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(f0Var.f5765w);
                    if (findPointerIndex >= 0) {
                        f0Var.h(actionMasked, findPointerIndex, motionEvent);
                    }
                    m1 m1Var = f0Var.f5759c;
                    if (m1Var != null) {
                        int i10 = 0;
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                if (actionMasked != 3) {
                                    if (actionMasked == 6) {
                                        int actionIndex = motionEvent.getActionIndex();
                                        if (motionEvent.getPointerId(actionIndex) == f0Var.f5765w) {
                                            if (actionIndex == 0) {
                                                i10 = 1;
                                            }
                                            f0Var.f5765w = motionEvent.getPointerId(i10);
                                            f0Var.s(f0Var.B, actionIndex, motionEvent);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                VelocityTracker velocityTracker2 = f0Var.G;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (findPointerIndex >= 0) {
                                f0Var.s(f0Var.B, findPointerIndex, motionEvent);
                                f0Var.n(m1Var);
                                f0Var.E.removeCallbacks(iVar);
                                iVar.run();
                                f0Var.E.invalidate();
                                return;
                            } else {
                                return;
                            }
                        }
                        f0Var.p(null, 0);
                        f0Var.f5765w = -1;
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
        ll0 ll0Var;
        switch (this.f5955a) {
            case 0:
                f0 f0Var = (f0) this.f5956b;
                ((GestureDetector) f0Var.K.f22790b).onTouchEvent(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                z zVar = null;
                if (actionMasked == 0) {
                    f0Var.f5765w = motionEvent.getPointerId(0);
                    f0Var.d = motionEvent.getX();
                    f0Var.f5760e = motionEvent.getY();
                    VelocityTracker velocityTracker = f0Var.G;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    f0Var.G = VelocityTracker.obtain();
                    if (f0Var.f5759c == null) {
                        ArrayList arrayList = f0Var.C;
                        if (!arrayList.isEmpty()) {
                            View k10 = f0Var.k(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    z zVar2 = (z) arrayList.get(size);
                                    if (zVar2.f5960e.f5875a == k10) {
                                        zVar = zVar2;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (zVar != null) {
                            m1 m1Var = zVar.f5960e;
                            f0Var.d -= zVar.f5963r;
                            f0Var.f5760e -= zVar.f5964s;
                            f0Var.j(m1Var, true);
                            if (f0Var.f5757a.remove(m1Var.f5875a)) {
                                f0Var.f5766x.a(f0Var.E, m1Var);
                            }
                            f0Var.p(m1Var, zVar.f5961f);
                            f0Var.s(f0Var.B, 0, motionEvent);
                        }
                    }
                } else if (actionMasked != 3 && actionMasked != 1) {
                    int i10 = f0Var.f5765w;
                    if (i10 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                        f0Var.h(actionMasked, findPointerIndex, motionEvent);
                    }
                } else {
                    f0Var.f5765w = -1;
                    f0Var.p(null, 0);
                }
                VelocityTracker velocityTracker2 = f0Var.G;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (f0Var.f5759c != null) {
                    return true;
                }
                return false;
            default:
                int actionMasked2 = motionEvent.getActionMasked();
                sl0 sl0Var = (sl0) this.f5956b;
                Rect rect = sl0Var.D1;
                if (sl0Var.getScrollState() == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if ((actionMasked2 == 0 || actionMasked2 == 5) && sl0Var.K1 == null && z4) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    sl0Var.W0 = false;
                    u0 itemAnimator = sl0Var.getItemAnimator();
                    if ((sl0Var.f31096h1 || itemAnimator == null || !itemAnimator.k()) && sl0Var.E0(y10) && (E = sl0Var.E(x10, y10)) != null && sl0Var.F0(E)) {
                        sl0Var.K1 = E;
                    }
                    if (sl0Var.K1 instanceof ViewGroup) {
                        float x11 = motionEvent.getX() - sl0Var.K1.getLeft();
                        float y11 = motionEvent.getY() - sl0Var.K1.getTop();
                        ViewGroup viewGroup = (ViewGroup) sl0Var.K1;
                        int childCount = viewGroup.getChildCount() - 1;
                        while (true) {
                            if (childCount >= 0) {
                                View childAt = viewGroup.getChildAt(childCount);
                                if (x11 >= childAt.getLeft() && x11 <= childAt.getRight() && y11 >= childAt.getTop() && y11 <= childAt.getBottom() && childAt.isClickable()) {
                                    sl0Var.K1 = null;
                                } else {
                                    childCount--;
                                }
                            }
                        }
                    }
                    sl0Var.L1 = -1;
                    View view = sl0Var.K1;
                    if (view != null) {
                        if (sl0Var.f31090e1) {
                            sl0Var.L1 = RecyclerView.S(view);
                        } else {
                            sl0Var.L1 = RecyclerView.R(view);
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), motionEvent.getX() - sl0Var.K1.getLeft(), motionEvent.getY() - sl0Var.K1.getTop(), 0);
                        if (sl0Var.K1.onTouchEvent(obtain)) {
                            sl0Var.M1 = true;
                        }
                        obtain.recycle();
                    }
                }
                if (sl0Var.K1 != null && !sl0Var.M1) {
                    try {
                        sl0Var.J1.J(motionEvent);
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                }
                if (actionMasked2 != 0 && actionMasked2 != 5) {
                    if ((actionMasked2 == 1 || actionMasked2 == 6 || actionMasked2 == 3 || !z4) && sl0Var.K1 != null) {
                        gg.d dVar = sl0Var.f31084b1;
                        if (dVar != null) {
                            AndroidUtilities.cancelRunOnUIThread(dVar);
                            sl0Var.f31084b1 = null;
                        }
                        View view2 = sl0Var.K1;
                        sl0Var.g1(view2, 0.0f, 0.0f, false);
                        sl0Var.K1 = null;
                        sl0Var.M1 = false;
                        sl0Var.j1(motionEvent, view2);
                        if ((actionMasked2 == 1 || actionMasked2 == 6 || actionMasked2 == 3) && (ll0Var = sl0Var.V0) != null && sl0Var.W0) {
                            ll0Var.h();
                            sl0Var.W0 = false;
                        }
                    }
                } else if (!sl0Var.M1 && sl0Var.K1 != null) {
                    float x12 = motionEvent.getX();
                    float y12 = motionEvent.getY();
                    gg.d dVar2 = new gg.d(this, x12, y12, 1);
                    sl0Var.f31084b1 = dVar2;
                    AndroidUtilities.runOnUIThread(dVar2, ViewConfiguration.getTapTimeout());
                    if (sl0Var.K1.isEnabled()) {
                        View view3 = sl0Var.K1;
                        if (sl0Var.H0(view3, x12 - view3.getX(), y12 - sl0Var.K1.getY())) {
                            sl0Var.h1(sl0Var.L1, sl0Var.K1);
                            org.telegram.ui.Cells.z zVar3 = sl0Var.A1;
                            if (zVar3 != null) {
                                Drawable current = zVar3.getCurrent();
                                if (current instanceof TransitionDrawable) {
                                    if (sl0Var.U0 == null && sl0Var.T0 == null) {
                                        ((TransitionDrawable) current).resetTransition();
                                    } else {
                                        ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                                    }
                                }
                                sl0Var.A1.setHotspot(motionEvent.getX(), motionEvent.getY());
                            }
                            sl0Var.u1();
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
        switch (this.f5955a) {
            case 0:
                if (z4) {
                    ((f0) this.f5956b).p(null, 0);
                    return;
                }
                return;
            default:
                ((sl0) this.f5956b).I0(true);
                return;
        }
    }

    public y(sl0 sl0Var, Context context) {
        this.f5956b = sl0Var;
        ai aiVar = new ai(context, new nl0(this));
        sl0Var.J1 = aiVar;
        ((m20) aiVar.f25257b).f28958t = false;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
