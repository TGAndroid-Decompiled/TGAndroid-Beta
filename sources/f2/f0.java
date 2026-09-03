package f2;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sl0;
public class f0 extends v0 {
    public int B;
    public int D;
    public RecyclerView E;
    public VelocityTracker G;
    public ArrayList H;
    public ArrayList I;
    public org.telegram.ui.Cells.f1 K;
    public c0 L;
    public Rect N;
    public long O;
    public float d;
    public float f5760e;
    public float f5761f;
    public float h;
    public float f5762n;
    public float f5763r;
    public float f5764s;
    public float v;
    public final b0 f5766x;
    public final ArrayList f5757a = new ArrayList();
    public final float[] f5758b = new float[2];
    public m1 f5759c = null;
    public int f5765w = -1;
    public int f5767y = 0;
    public final ArrayList C = new ArrayList();
    public final androidx.activity.i F = new androidx.activity.i(this, 18);
    public View J = null;
    public final y M = new y(this);

    public f0(b0 b0Var) {
        this.f5766x = b0Var;
    }

    public static boolean m(View view, float f10, float f11, float f12, float f13) {
        if (f10 >= f12 && f10 <= f12 + view.getWidth() && f11 >= f13 && f11 <= f13 + view.getHeight()) {
            return true;
        }
        return false;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, j1 j1Var) {
        rect.setEmpty();
    }

    @Override
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        float f10;
        float f11;
        if (this.f5759c != null) {
            float[] fArr = this.f5758b;
            l(fArr);
            float f12 = fArr[0];
            f10 = fArr[1];
            f11 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        m1 m1Var = this.f5759c;
        int i10 = this.f5767y;
        b0 b0Var = this.f5766x;
        b0Var.getClass();
        ArrayList arrayList = this.C;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            z zVar = (z) arrayList.get(i11);
            m1 m1Var2 = zVar.f5960e;
            float f13 = zVar.f5957a;
            float f14 = zVar.f5959c;
            if (f13 == f14) {
                zVar.f5963r = m1Var2.f5875a.getTranslationX();
            } else {
                zVar.f5963r = e2.c.w(f14, f13, zVar.f5966x, f13);
            }
            float f15 = zVar.f5958b;
            float f16 = zVar.d;
            if (f15 == f16) {
                zVar.f5964s = m1Var2.f5875a.getTranslationY();
            } else {
                zVar.f5964s = e2.c.w(f16, f15, zVar.f5966x, f15);
            }
            int save = canvas.save();
            b0Var.m(canvas, recyclerView, zVar.f5960e, zVar.f5963r, zVar.f5964s, zVar.f5961f, false);
            canvas.restoreToCount(save);
        }
        if (m1Var != null) {
            int save2 = canvas.save();
            b0Var.m(canvas, recyclerView, m1Var, f11, f10, i10, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        boolean z4 = false;
        if (this.f5759c != null) {
            float[] fArr = this.f5758b;
            l(fArr);
            float f10 = fArr[0];
            float f11 = fArr[1];
        }
        m1 m1Var = this.f5759c;
        this.f5766x.getClass();
        ArrayList arrayList = this.C;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            int save = canvas.save();
            View view = ((z) arrayList.get(i10)).f5960e.f5875a;
            canvas.restoreToCount(save);
        }
        if (m1Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i11 = size - 1; i11 >= 0; i11--) {
            z zVar = (z) arrayList.get(i11);
            boolean z10 = zVar.f5965w;
            if (z10 && !zVar.f5962n) {
                arrayList.remove(i11);
            } else if (!z10) {
                z4 = true;
            }
        }
        if (z4) {
            recyclerView.invalidate();
        }
    }

    public final void d(sl0 sl0Var) {
        RecyclerView recyclerView = this.E;
        if (recyclerView != sl0Var) {
            y yVar = this.M;
            if (recyclerView != null) {
                recyclerView.p0(this);
                RecyclerView recyclerView2 = this.E;
                recyclerView2.B.remove(yVar);
                if (recyclerView2.C == yVar) {
                    recyclerView2.C = null;
                }
                ArrayList arrayList = this.E.M;
                if (arrayList != null) {
                    arrayList.remove(this);
                }
                ArrayList arrayList2 = this.C;
                int size = arrayList2.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.f5766x.a(this.E, ((z) arrayList2.get(0)).f5960e);
                }
                arrayList2.clear();
                this.J = null;
                VelocityTracker velocityTracker = this.G;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.G = null;
                }
                c0 c0Var = this.L;
                if (c0Var != null) {
                    c0Var.f5741a = false;
                    this.L = null;
                }
                if (this.K != null) {
                    this.K = null;
                }
            }
            this.E = sl0Var;
            if (sl0Var != null) {
                sl0Var.getResources();
                this.f5761f = AndroidUtilities.dp(120.0f);
                this.h = AndroidUtilities.dp(800.0f);
                this.D = ViewConfiguration.get(this.E.getContext()).getScaledTouchSlop();
                this.E.i(this);
                this.E.B.add(yVar);
                RecyclerView recyclerView3 = this.E;
                if (recyclerView3.M == null) {
                    recyclerView3.M = new ArrayList();
                }
                recyclerView3.M.add(this);
                this.L = new c0(this);
                this.K = new org.telegram.ui.Cells.f1(this.E.getContext(), this.L);
            }
        }
    }

    public final int f(m1 m1Var, int i10) {
        int i11;
        if ((i10 & 12) != 0) {
            int i12 = 4;
            if (this.f5762n > 0.0f) {
                i11 = 8;
            } else {
                i11 = 4;
            }
            VelocityTracker velocityTracker = this.G;
            b0 b0Var = this.f5766x;
            if (velocityTracker != null && this.f5765w > -1) {
                velocityTracker.computeCurrentVelocity(1000, b0Var.h(this.h));
                float xVelocity = this.G.getXVelocity(this.f5765w);
                float yVelocity = this.G.getYVelocity(this.f5765w);
                if (xVelocity > 0.0f) {
                    i12 = 8;
                }
                float abs = Math.abs(xVelocity);
                if ((i12 & i10) != 0 && i11 == i12 && abs >= b0Var.f(this.f5761f) && abs > Math.abs(yVelocity)) {
                    return i12;
                }
            }
            float g10 = b0Var.g() * this.E.getWidth();
            if ((i10 & i11) != 0 && Math.abs(this.f5762n) > g10) {
                return i11;
            }
            return 0;
        }
        return 0;
    }

    public final void h(int i10, int i11, MotionEvent motionEvent) {
        View k10;
        if (this.f5759c == null && i10 == 2 && this.f5767y != 2) {
            b0 b0Var = this.f5766x;
            if (b0Var.j() && this.E.getScrollState() != 1) {
                w0 layoutManager = this.E.getLayoutManager();
                int i12 = this.f5765w;
                m1 m1Var = null;
                if (i12 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i12);
                    float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.d);
                    float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.f5760e);
                    float f10 = this.D;
                    if ((abs >= f10 || abs2 >= f10) && ((abs <= abs2 || !layoutManager.d()) && ((abs2 <= abs || !layoutManager.e()) && (k10 = k(motionEvent)) != null))) {
                        m1Var = this.E.T(k10);
                    }
                }
                if (m1Var != null) {
                    RecyclerView recyclerView = this.E;
                    int e6 = b0Var.e(recyclerView, m1Var);
                    WeakHashMap weakHashMap = r0.j0.f46469a;
                    int b10 = (b0Var.b(e6, recyclerView.getLayoutDirection()) & 65280) >> 8;
                    if (b10 != 0) {
                        float x10 = motionEvent.getX(i11);
                        float y10 = motionEvent.getY(i11);
                        float f11 = x10 - this.d;
                        float f12 = y10 - this.f5760e;
                        float abs3 = Math.abs(f11);
                        float abs4 = Math.abs(f12);
                        float f13 = this.D;
                        if (abs3 >= f13 || abs4 >= f13) {
                            if (abs3 > abs4) {
                                if (f11 >= 0.0f || (b10 & 4) != 0) {
                                    if (f11 > 0.0f && (b10 & 8) == 0) {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else if (f12 >= 0.0f || (b10 & 1) != 0) {
                                if (f12 > 0.0f && (b10 & 2) == 0) {
                                    return;
                                }
                            } else {
                                return;
                            }
                            this.f5763r = 0.0f;
                            this.f5762n = 0.0f;
                            this.f5765w = motionEvent.getPointerId(0);
                            p(m1Var, 1);
                        }
                    }
                }
            }
        }
    }

    public final int i(m1 m1Var, int i10) {
        int i11;
        if ((i10 & 3) != 0) {
            int i12 = 1;
            if (this.f5763r > 0.0f) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            VelocityTracker velocityTracker = this.G;
            b0 b0Var = this.f5766x;
            if (velocityTracker != null && this.f5765w > -1) {
                velocityTracker.computeCurrentVelocity(1000, b0Var.h(this.h));
                float xVelocity = this.G.getXVelocity(this.f5765w);
                float yVelocity = this.G.getYVelocity(this.f5765w);
                if (yVelocity > 0.0f) {
                    i12 = 2;
                }
                float abs = Math.abs(yVelocity);
                if ((i12 & i10) != 0 && i12 == i11 && abs >= b0Var.f(this.f5761f) && abs > Math.abs(xVelocity)) {
                    return i12;
                }
            }
            float g10 = b0Var.g() * this.E.getHeight();
            if ((i10 & i11) != 0 && Math.abs(this.f5763r) > g10) {
                return i11;
            }
            return 0;
        }
        return 0;
    }

    public final void j(m1 m1Var, boolean z4) {
        ArrayList arrayList = this.C;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            z zVar = (z) arrayList.get(size);
            if (zVar.f5960e == m1Var) {
                zVar.v |= z4;
                if (!zVar.f5965w) {
                    zVar.h.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View k(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        m1 m1Var = this.f5759c;
        if (m1Var != null) {
            View view = m1Var.f5875a;
            if (m(view, x10, y10, this.f5764s + this.f5762n, this.v + this.f5763r)) {
                return view;
            }
        }
        ArrayList arrayList = this.C;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            z zVar = (z) arrayList.get(size);
            View view2 = zVar.f5960e.f5875a;
            if (m(view2, x10, y10, zVar.f5963r, zVar.f5964s)) {
                return view2;
            }
        }
        return this.E.E(x10, y10);
    }

    public final void l(float[] fArr) {
        if ((this.B & 12) != 0) {
            fArr[0] = (this.f5764s + this.f5762n) - this.f5759c.f5875a.getLeft();
        } else {
            fArr[0] = this.f5759c.f5875a.getTranslationX();
        }
        if ((this.B & 3) != 0) {
            fArr[1] = (this.v + this.f5763r) - this.f5759c.f5875a.getTop();
        } else {
            fArr[1] = this.f5759c.f5875a.getTranslationY();
        }
    }

    public final void n(m1 m1Var) {
        ArrayList arrayList;
        int bottom;
        int abs;
        int top;
        int abs2;
        int left;
        int abs3;
        int right;
        int abs4;
        int i10;
        View view;
        int i11;
        int i12;
        if (!this.E.isLayoutRequested() && this.f5767y == 2) {
            b0 b0Var = this.f5766x;
            b0Var.getClass();
            int i13 = (int) (this.f5764s + this.f5762n);
            int i14 = (int) (this.v + this.f5763r);
            View view2 = m1Var.f5875a;
            if (Math.abs(i14 - view2.getTop()) >= view2.getHeight() * 0.5f || Math.abs(i13 - view2.getLeft()) >= view2.getWidth() * 0.5f) {
                ArrayList arrayList2 = this.H;
                if (arrayList2 == null) {
                    this.H = new ArrayList();
                    this.I = new ArrayList();
                } else {
                    arrayList2.clear();
                    this.I.clear();
                }
                int round = Math.round(this.f5764s + this.f5762n);
                int round2 = Math.round(this.v + this.f5763r);
                int width = view2.getWidth() + round;
                int height = view2.getHeight() + round2;
                int i15 = (round + width) / 2;
                int i16 = (round2 + height) / 2;
                w0 layoutManager = this.E.getLayoutManager();
                int r10 = layoutManager.r();
                int i17 = 0;
                while (i17 < r10) {
                    View q10 = layoutManager.q(i17);
                    if (q10 == view2) {
                        i10 = i17;
                    } else {
                        i10 = i17;
                        if (q10.getBottom() >= round2 && q10.getTop() <= height && q10.getRight() >= round && q10.getLeft() <= width) {
                            m1 T = this.E.T(q10);
                            int abs5 = Math.abs(i15 - ((q10.getRight() + q10.getLeft()) / 2));
                            int abs6 = Math.abs(i16 - ((q10.getBottom() + q10.getTop()) / 2));
                            int i18 = (abs6 * abs6) + (abs5 * abs5);
                            view = view2;
                            int size = this.H.size();
                            i11 = round;
                            i12 = i13;
                            int i19 = 0;
                            int i20 = 0;
                            while (i19 < size) {
                                int i21 = size;
                                if (i18 <= ((Integer) this.I.get(i19)).intValue()) {
                                    break;
                                }
                                i20++;
                                i19++;
                                size = i21;
                            }
                            this.H.add(i20, T);
                            this.I.add(i20, Integer.valueOf(i18));
                            i17 = i10 + 1;
                            view2 = view;
                            round = i11;
                            i13 = i12;
                        }
                    }
                    view = view2;
                    i11 = round;
                    i12 = i13;
                    i17 = i10 + 1;
                    view2 = view;
                    round = i11;
                    i13 = i12;
                }
                View view3 = view2;
                int i22 = i13;
                ArrayList arrayList3 = this.H;
                if (arrayList3.size() != 0) {
                    int width2 = view3.getWidth() + i22;
                    int height2 = view3.getHeight() + i14;
                    int left2 = i22 - view3.getLeft();
                    int top2 = i14 - view3.getTop();
                    int size2 = arrayList3.size();
                    m1 m1Var2 = null;
                    int i23 = -1;
                    int i24 = 0;
                    while (i24 < size2) {
                        m1 m1Var3 = (m1) arrayList3.get(i24);
                        if (left2 > 0 && (right = m1Var3.f5875a.getRight() - width2) < 0) {
                            arrayList = arrayList3;
                            if (m1Var3.f5875a.getRight() > view3.getRight() && (abs4 = Math.abs(right)) > i23) {
                                i23 = abs4;
                                m1Var2 = m1Var3;
                            }
                        } else {
                            arrayList = arrayList3;
                        }
                        if (left2 < 0 && (left = m1Var3.f5875a.getLeft() - i22) > 0 && m1Var3.f5875a.getLeft() < view3.getLeft() && (abs3 = Math.abs(left)) > i23) {
                            i23 = abs3;
                            m1Var2 = m1Var3;
                        }
                        if (top2 < 0 && (top = m1Var3.f5875a.getTop() - i14) > 0 && m1Var3.f5875a.getTop() < view3.getTop() && (abs2 = Math.abs(top)) > i23) {
                            i23 = abs2;
                            m1Var2 = m1Var3;
                        }
                        if (top2 > 0 && (bottom = m1Var3.f5875a.getBottom() - height2) < 0 && m1Var3.f5875a.getBottom() > view3.getBottom() && (abs = Math.abs(bottom)) > i23) {
                            i23 = abs;
                            m1Var2 = m1Var3;
                        }
                        i24++;
                        arrayList3 = arrayList;
                    }
                    if (m1Var2 == null) {
                        this.H.clear();
                        this.I.clear();
                        return;
                    }
                    int b10 = m1Var2.b();
                    m1Var.b();
                    if (b0Var.n(this.E, m1Var, m1Var2)) {
                        this.f5766x.o(this.E, m1Var, m1Var2, b10, i22, i14);
                    }
                }
            }
        }
    }

    public final void o(View view) {
        if (view == this.J) {
            this.J = null;
        }
    }

    public final void p(f2.m1 r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: f2.f0.p(f2.m1, int):void");
    }

    public boolean q() {
        return false;
    }

    public final void r(m1 m1Var) {
        RecyclerView recyclerView = this.E;
        b0 b0Var = this.f5766x;
        int e6 = b0Var.e(recyclerView, m1Var);
        WeakHashMap weakHashMap = r0.j0.f46469a;
        if ((b0Var.b(e6, recyclerView.getLayoutDirection()) & 16711680) != 0) {
            if (m1Var.f5875a.getParent() != this.E) {
                Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
                return;
            }
            VelocityTracker velocityTracker = this.G;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            this.G = VelocityTracker.obtain();
            this.f5763r = 0.0f;
            this.f5762n = 0.0f;
            p(m1Var, 2);
            return;
        }
        Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
    }

    public final void s(int i10, int i11, MotionEvent motionEvent) {
        float x10 = motionEvent.getX(i11);
        float y10 = motionEvent.getY(i11);
        float f10 = x10 - this.d;
        this.f5762n = f10;
        this.f5763r = y10 - this.f5760e;
        if ((i10 & 4) == 0) {
            this.f5762n = Math.max(0.0f, f10);
        }
        if ((i10 & 8) == 0) {
            this.f5762n = Math.min(0.0f, this.f5762n);
        }
        if ((i10 & 1) == 0) {
            this.f5763r = Math.max(0.0f, this.f5763r);
        }
        if ((i10 & 2) == 0) {
            this.f5763r = Math.min(0.0f, this.f5763r);
        }
    }
}
