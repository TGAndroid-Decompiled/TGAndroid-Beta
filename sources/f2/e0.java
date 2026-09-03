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
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.zz;
public class e0 extends u0 {
    public int B;
    public int D;
    public RecyclerView E;
    public VelocityTracker G;
    public ArrayList H;
    public ArrayList I;
    public zz K;
    public c0 L;
    public Rect N;
    public long O;
    public float d;
    public float e;
    public float f5673f;
    public float h;
    public float f5674n;
    public float f5675r;
    public float f5676s;
    public float v;
    public final b0 f5678x;
    public final ArrayList f5670a = new ArrayList();
    public final float[] f5671b = new float[2];
    public l1 f5672c = null;
    public int f5677w = -1;
    public int f5679y = 0;
    public final ArrayList C = new ArrayList();
    public final androidx.activity.i F = new androidx.activity.i(this, 19);
    public View J = null;
    public final y M = new y(this);

    public e0(b0 b0Var) {
        this.f5678x = b0Var;
    }

    public static boolean m(View view, float f10, float f11, float f12, float f13) {
        if (f10 >= f12 && f10 <= f12 + view.getWidth() && f11 >= f13 && f11 <= f13 + view.getHeight()) {
            return true;
        }
        return false;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, i1 i1Var) {
        rect.setEmpty();
    }

    @Override
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        float f10;
        float f11;
        if (this.f5672c != null) {
            float[] fArr = this.f5671b;
            l(fArr);
            float f12 = fArr[0];
            f10 = fArr[1];
            f11 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        l1 l1Var = this.f5672c;
        int i10 = this.f5679y;
        b0 b0Var = this.f5678x;
        b0Var.getClass();
        ArrayList arrayList = this.C;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            z zVar = (z) arrayList.get(i11);
            l1 l1Var2 = zVar.e;
            float f13 = zVar.f5852a;
            float f14 = zVar.f5854c;
            if (f13 == f14) {
                zVar.f5857r = l1Var2.f5774a.getTranslationX();
            } else {
                zVar.f5857r = e2.c.w(f14, f13, zVar.f5860x, f13);
            }
            float f15 = zVar.f5853b;
            float f16 = zVar.d;
            if (f15 == f16) {
                zVar.f5858s = l1Var2.f5774a.getTranslationY();
            } else {
                zVar.f5858s = e2.c.w(f16, f15, zVar.f5860x, f15);
            }
            int save = canvas.save();
            b0Var.m(canvas, recyclerView, zVar.e, zVar.f5857r, zVar.f5858s, zVar.f5855f, false);
            canvas.restoreToCount(save);
        }
        if (l1Var != null) {
            int save2 = canvas.save();
            b0Var.m(canvas, recyclerView, l1Var, f11, f10, i10, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        boolean z4 = false;
        if (this.f5672c != null) {
            float[] fArr = this.f5671b;
            l(fArr);
            float f10 = fArr[0];
            float f11 = fArr[1];
        }
        l1 l1Var = this.f5672c;
        this.f5678x.getClass();
        ArrayList arrayList = this.C;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            int save = canvas.save();
            View view = ((z) arrayList.get(i10)).e.f5774a;
            canvas.restoreToCount(save);
        }
        if (l1Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i11 = size - 1; i11 >= 0; i11--) {
            z zVar = (z) arrayList.get(i11);
            boolean z10 = zVar.f5859w;
            if (z10 && !zVar.f5856n) {
                arrayList.remove(i11);
            } else if (!z10) {
                z4 = true;
            }
        }
        if (z4) {
            recyclerView.invalidate();
        }
    }

    public final void d(rl0 rl0Var) {
        RecyclerView recyclerView = this.E;
        if (recyclerView != rl0Var) {
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
                    this.f5678x.a(this.E, ((z) arrayList2.get(0)).e);
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
                    c0Var.f5661a = false;
                    this.L = null;
                }
                if (this.K != null) {
                    this.K = null;
                }
            }
            this.E = rl0Var;
            if (rl0Var != null) {
                rl0Var.getResources();
                this.f5673f = AndroidUtilities.dp(120.0f);
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
                this.K = new zz(this.E.getContext(), this.L);
            }
        }
    }

    public final int f(l1 l1Var, int i10) {
        int i11;
        if ((i10 & 12) != 0) {
            int i12 = 4;
            if (this.f5674n > 0.0f) {
                i11 = 8;
            } else {
                i11 = 4;
            }
            VelocityTracker velocityTracker = this.G;
            b0 b0Var = this.f5678x;
            if (velocityTracker != null && this.f5677w > -1) {
                velocityTracker.computeCurrentVelocity(1000, b0Var.h(this.h));
                float xVelocity = this.G.getXVelocity(this.f5677w);
                float yVelocity = this.G.getYVelocity(this.f5677w);
                if (xVelocity > 0.0f) {
                    i12 = 8;
                }
                float abs = Math.abs(xVelocity);
                if ((i12 & i10) != 0 && i11 == i12 && abs >= b0Var.f(this.f5673f) && abs > Math.abs(yVelocity)) {
                    return i12;
                }
            }
            float g10 = b0Var.g() * this.E.getWidth();
            if ((i10 & i11) != 0 && Math.abs(this.f5674n) > g10) {
                return i11;
            }
            return 0;
        }
        return 0;
    }

    public final void h(int i10, int i11, MotionEvent motionEvent) {
        View k10;
        if (this.f5672c == null && i10 == 2 && this.f5679y != 2) {
            b0 b0Var = this.f5678x;
            if (b0Var.j() && this.E.getScrollState() != 1) {
                v0 layoutManager = this.E.getLayoutManager();
                int i12 = this.f5677w;
                l1 l1Var = null;
                if (i12 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i12);
                    float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.d);
                    float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.e);
                    float f10 = this.D;
                    if ((abs >= f10 || abs2 >= f10) && ((abs <= abs2 || !layoutManager.d()) && ((abs2 <= abs || !layoutManager.e()) && (k10 = k(motionEvent)) != null))) {
                        l1Var = this.E.T(k10);
                    }
                }
                if (l1Var != null) {
                    RecyclerView recyclerView = this.E;
                    int e = b0Var.e(recyclerView, l1Var);
                    WeakHashMap weakHashMap = r0.j0.f43142a;
                    int b10 = (b0Var.b(e, recyclerView.getLayoutDirection()) & 65280) >> 8;
                    if (b10 != 0) {
                        float x10 = motionEvent.getX(i11);
                        float y10 = motionEvent.getY(i11);
                        float f11 = x10 - this.d;
                        float f12 = y10 - this.e;
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
                            this.f5675r = 0.0f;
                            this.f5674n = 0.0f;
                            this.f5677w = motionEvent.getPointerId(0);
                            p(l1Var, 1);
                        }
                    }
                }
            }
        }
    }

    public final int i(l1 l1Var, int i10) {
        int i11;
        if ((i10 & 3) != 0) {
            int i12 = 1;
            if (this.f5675r > 0.0f) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            VelocityTracker velocityTracker = this.G;
            b0 b0Var = this.f5678x;
            if (velocityTracker != null && this.f5677w > -1) {
                velocityTracker.computeCurrentVelocity(1000, b0Var.h(this.h));
                float xVelocity = this.G.getXVelocity(this.f5677w);
                float yVelocity = this.G.getYVelocity(this.f5677w);
                if (yVelocity > 0.0f) {
                    i12 = 2;
                }
                float abs = Math.abs(yVelocity);
                if ((i12 & i10) != 0 && i12 == i11 && abs >= b0Var.f(this.f5673f) && abs > Math.abs(xVelocity)) {
                    return i12;
                }
            }
            float g10 = b0Var.g() * this.E.getHeight();
            if ((i10 & i11) != 0 && Math.abs(this.f5675r) > g10) {
                return i11;
            }
            return 0;
        }
        return 0;
    }

    public final void j(l1 l1Var, boolean z4) {
        ArrayList arrayList = this.C;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            z zVar = (z) arrayList.get(size);
            if (zVar.e == l1Var) {
                zVar.v |= z4;
                if (!zVar.f5859w) {
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
        l1 l1Var = this.f5672c;
        if (l1Var != null) {
            View view = l1Var.f5774a;
            if (m(view, x10, y10, this.f5676s + this.f5674n, this.v + this.f5675r)) {
                return view;
            }
        }
        ArrayList arrayList = this.C;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            z zVar = (z) arrayList.get(size);
            View view2 = zVar.e.f5774a;
            if (m(view2, x10, y10, zVar.f5857r, zVar.f5858s)) {
                return view2;
            }
        }
        return this.E.E(x10, y10);
    }

    public final void l(float[] fArr) {
        if ((this.B & 12) != 0) {
            fArr[0] = (this.f5676s + this.f5674n) - this.f5672c.f5774a.getLeft();
        } else {
            fArr[0] = this.f5672c.f5774a.getTranslationX();
        }
        if ((this.B & 3) != 0) {
            fArr[1] = (this.v + this.f5675r) - this.f5672c.f5774a.getTop();
        } else {
            fArr[1] = this.f5672c.f5774a.getTranslationY();
        }
    }

    public final void n(l1 l1Var) {
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
        if (!this.E.isLayoutRequested() && this.f5679y == 2) {
            b0 b0Var = this.f5678x;
            b0Var.getClass();
            int i13 = (int) (this.f5676s + this.f5674n);
            int i14 = (int) (this.v + this.f5675r);
            View view2 = l1Var.f5774a;
            if (Math.abs(i14 - view2.getTop()) >= view2.getHeight() * 0.5f || Math.abs(i13 - view2.getLeft()) >= view2.getWidth() * 0.5f) {
                ArrayList arrayList2 = this.H;
                if (arrayList2 == null) {
                    this.H = new ArrayList();
                    this.I = new ArrayList();
                } else {
                    arrayList2.clear();
                    this.I.clear();
                }
                int round = Math.round(this.f5676s + this.f5674n);
                int round2 = Math.round(this.v + this.f5675r);
                int width = view2.getWidth() + round;
                int height = view2.getHeight() + round2;
                int i15 = (round + width) / 2;
                int i16 = (round2 + height) / 2;
                v0 layoutManager = this.E.getLayoutManager();
                int r10 = layoutManager.r();
                int i17 = 0;
                while (i17 < r10) {
                    View q10 = layoutManager.q(i17);
                    if (q10 == view2) {
                        i10 = i17;
                    } else {
                        i10 = i17;
                        if (q10.getBottom() >= round2 && q10.getTop() <= height && q10.getRight() >= round && q10.getLeft() <= width) {
                            l1 T = this.E.T(q10);
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
                    l1 l1Var2 = null;
                    int i23 = -1;
                    int i24 = 0;
                    while (i24 < size2) {
                        l1 l1Var3 = (l1) arrayList3.get(i24);
                        if (left2 > 0 && (right = l1Var3.f5774a.getRight() - width2) < 0) {
                            arrayList = arrayList3;
                            if (l1Var3.f5774a.getRight() > view3.getRight() && (abs4 = Math.abs(right)) > i23) {
                                i23 = abs4;
                                l1Var2 = l1Var3;
                            }
                        } else {
                            arrayList = arrayList3;
                        }
                        if (left2 < 0 && (left = l1Var3.f5774a.getLeft() - i22) > 0 && l1Var3.f5774a.getLeft() < view3.getLeft() && (abs3 = Math.abs(left)) > i23) {
                            i23 = abs3;
                            l1Var2 = l1Var3;
                        }
                        if (top2 < 0 && (top = l1Var3.f5774a.getTop() - i14) > 0 && l1Var3.f5774a.getTop() < view3.getTop() && (abs2 = Math.abs(top)) > i23) {
                            i23 = abs2;
                            l1Var2 = l1Var3;
                        }
                        if (top2 > 0 && (bottom = l1Var3.f5774a.getBottom() - height2) < 0 && l1Var3.f5774a.getBottom() > view3.getBottom() && (abs = Math.abs(bottom)) > i23) {
                            i23 = abs;
                            l1Var2 = l1Var3;
                        }
                        i24++;
                        arrayList3 = arrayList;
                    }
                    if (l1Var2 == null) {
                        this.H.clear();
                        this.I.clear();
                        return;
                    }
                    int b10 = l1Var2.b();
                    l1Var.b();
                    if (b0Var.n(this.E, l1Var, l1Var2)) {
                        this.f5678x.o(this.E, l1Var, l1Var2, b10, i22, i14);
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

    public final void p(f2.l1 r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: f2.e0.p(f2.l1, int):void");
    }

    public boolean q() {
        return false;
    }

    public final void r(l1 l1Var) {
        RecyclerView recyclerView = this.E;
        b0 b0Var = this.f5678x;
        int e = b0Var.e(recyclerView, l1Var);
        WeakHashMap weakHashMap = r0.j0.f43142a;
        if ((b0Var.b(e, recyclerView.getLayoutDirection()) & 16711680) != 0) {
            if (l1Var.f5774a.getParent() != this.E) {
                Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
                return;
            }
            VelocityTracker velocityTracker = this.G;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            this.G = VelocityTracker.obtain();
            this.f5675r = 0.0f;
            this.f5674n = 0.0f;
            p(l1Var, 2);
            return;
        }
        Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
    }

    public final void s(int i10, int i11, MotionEvent motionEvent) {
        float x10 = motionEvent.getX(i11);
        float y10 = motionEvent.getY(i11);
        float f10 = x10 - this.d;
        this.f5674n = f10;
        this.f5675r = y10 - this.e;
        if ((i10 & 4) == 0) {
            this.f5674n = Math.max(0.0f, f10);
        }
        if ((i10 & 8) == 0) {
            this.f5674n = Math.min(0.0f, this.f5674n);
        }
        if ((i10 & 1) == 0) {
            this.f5675r = Math.max(0.0f, this.f5675r);
        }
        if ((i10 & 2) == 0) {
            this.f5675r = Math.min(0.0f, this.f5675r);
        }
    }
}
