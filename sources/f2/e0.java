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
import org.telegram.ui.Components.jl0;
public class e0 extends v0 {
    public int A;
    public int C;
    public RecyclerView D;
    public VelocityTracker F;
    public ArrayList G;
    public ArrayList H;
    public o4.g J;
    public c0 K;
    public Rect M;
    public long N;
    public float d;
    public float f6302e;
    public float f6303f;
    public float h;
    public float f6304n;
    public float f6305r;
    public float f6306s;
    public float v;
    public final b0 f6308x;
    public final ArrayList f6299a = new ArrayList();
    public final float[] f6300b = new float[2];
    public n1 f6301c = null;
    public int f6307w = -1;
    public int f6309y = 0;
    public final ArrayList B = new ArrayList();
    public final ag.q1 E = new ag.q1(this, 22);
    public View I = null;
    public final y L = new y(this);

    public e0(b0 b0Var) {
        this.f6308x = b0Var;
    }

    public static boolean m(View view, float f9, float f10, float f11, float f12) {
        if (f9 >= f11 && f9 <= f11 + view.getWidth() && f10 >= f12 && f10 <= f12 + view.getHeight()) {
            return true;
        }
        return false;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, k1 k1Var) {
        rect.setEmpty();
    }

    @Override
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        float f9;
        float f10;
        if (this.f6301c != null) {
            float[] fArr = this.f6300b;
            l(fArr);
            float f11 = fArr[0];
            f9 = fArr[1];
            f10 = f11;
        } else {
            f9 = 0.0f;
            f10 = 0.0f;
        }
        n1 n1Var = this.f6301c;
        int i10 = this.f6309y;
        b0 b0Var = this.f6308x;
        b0Var.getClass();
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            z zVar = (z) arrayList.get(i11);
            n1 n1Var2 = zVar.f6516e;
            float f12 = zVar.f6513a;
            float f13 = zVar.f6515c;
            if (f12 == f13) {
                zVar.f6519r = n1Var2.f6432a.getTranslationX();
            } else {
                zVar.f6519r = com.google.android.recaptcha.internal.a.z(f13, f12, zVar.f6522x, f12);
            }
            float f14 = zVar.f6514b;
            float f15 = zVar.d;
            if (f14 == f15) {
                zVar.f6520s = n1Var2.f6432a.getTranslationY();
            } else {
                zVar.f6520s = com.google.android.recaptcha.internal.a.z(f15, f14, zVar.f6522x, f14);
            }
            int save = canvas.save();
            b0Var.m(canvas, recyclerView, zVar.f6516e, zVar.f6519r, zVar.f6520s, zVar.f6517f, false);
            canvas.restoreToCount(save);
        }
        if (n1Var != null) {
            int save2 = canvas.save();
            b0Var.m(canvas, recyclerView, n1Var, f10, f9, i10, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        boolean z10 = false;
        if (this.f6301c != null) {
            float[] fArr = this.f6300b;
            l(fArr);
            float f9 = fArr[0];
            float f10 = fArr[1];
        }
        n1 n1Var = this.f6301c;
        this.f6308x.getClass();
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            int save = canvas.save();
            View view = ((z) arrayList.get(i10)).f6516e.f6432a;
            canvas.restoreToCount(save);
        }
        if (n1Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i11 = size - 1; i11 >= 0; i11--) {
            z zVar = (z) arrayList.get(i11);
            boolean z11 = zVar.f6521w;
            if (z11 && !zVar.f6518n) {
                arrayList.remove(i11);
            } else if (!z11) {
                z10 = true;
            }
        }
        if (z10) {
            recyclerView.invalidate();
        }
    }

    public final void d(jl0 jl0Var) {
        RecyclerView recyclerView = this.D;
        if (recyclerView != jl0Var) {
            y yVar = this.L;
            if (recyclerView != null) {
                recyclerView.p0(this);
                RecyclerView recyclerView2 = this.D;
                recyclerView2.A.remove(yVar);
                if (recyclerView2.B == yVar) {
                    recyclerView2.B = null;
                }
                ArrayList arrayList = this.D.L;
                if (arrayList != null) {
                    arrayList.remove(this);
                }
                ArrayList arrayList2 = this.B;
                int size = arrayList2.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.f6308x.a(this.D, ((z) arrayList2.get(0)).f6516e);
                }
                arrayList2.clear();
                this.I = null;
                VelocityTracker velocityTracker = this.F;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.F = null;
                }
                c0 c0Var = this.K;
                if (c0Var != null) {
                    c0Var.f6284a = false;
                    this.K = null;
                }
                if (this.J != null) {
                    this.J = null;
                }
            }
            this.D = jl0Var;
            if (jl0Var != null) {
                jl0Var.getResources();
                this.f6303f = AndroidUtilities.dp(120.0f);
                this.h = AndroidUtilities.dp(800.0f);
                this.C = ViewConfiguration.get(this.D.getContext()).getScaledTouchSlop();
                this.D.i(this);
                this.D.A.add(yVar);
                RecyclerView recyclerView3 = this.D;
                if (recyclerView3.L == null) {
                    recyclerView3.L = new ArrayList();
                }
                recyclerView3.L.add(this);
                this.K = new c0(this);
                this.J = new o4.g(this.D.getContext(), this.K);
            }
        }
    }

    public final int f(n1 n1Var, int i10) {
        int i11;
        if ((i10 & 12) != 0) {
            int i12 = 4;
            if (this.f6304n > 0.0f) {
                i11 = 8;
            } else {
                i11 = 4;
            }
            VelocityTracker velocityTracker = this.F;
            b0 b0Var = this.f6308x;
            if (velocityTracker != null && this.f6307w > -1) {
                velocityTracker.computeCurrentVelocity(1000, b0Var.h(this.h));
                float xVelocity = this.F.getXVelocity(this.f6307w);
                float yVelocity = this.F.getYVelocity(this.f6307w);
                if (xVelocity > 0.0f) {
                    i12 = 8;
                }
                float abs = Math.abs(xVelocity);
                if ((i12 & i10) != 0 && i11 == i12 && abs >= b0Var.f(this.f6303f) && abs > Math.abs(yVelocity)) {
                    return i12;
                }
            }
            float g10 = b0Var.g() * this.D.getWidth();
            if ((i10 & i11) != 0 && Math.abs(this.f6304n) > g10) {
                return i11;
            }
            return 0;
        }
        return 0;
    }

    public final void h(int i10, int i11, MotionEvent motionEvent) {
        View k9;
        if (this.f6301c == null && i10 == 2 && this.f6309y != 2) {
            b0 b0Var = this.f6308x;
            if (b0Var.j() && this.D.getScrollState() != 1) {
                w0 layoutManager = this.D.getLayoutManager();
                int i12 = this.f6307w;
                n1 n1Var = null;
                if (i12 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i12);
                    float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.d);
                    float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.f6302e);
                    float f9 = this.C;
                    if ((abs >= f9 || abs2 >= f9) && ((abs <= abs2 || !layoutManager.d()) && ((abs2 <= abs || !layoutManager.e()) && (k9 = k(motionEvent)) != null))) {
                        n1Var = this.D.T(k9);
                    }
                }
                if (n1Var != null) {
                    RecyclerView recyclerView = this.D;
                    int e10 = b0Var.e(recyclerView, n1Var);
                    WeakHashMap weakHashMap = r0.j0.f46829a;
                    int b10 = (b0Var.b(e10, recyclerView.getLayoutDirection()) & 65280) >> 8;
                    if (b10 != 0) {
                        float x4 = motionEvent.getX(i11);
                        float y8 = motionEvent.getY(i11);
                        float f10 = x4 - this.d;
                        float f11 = y8 - this.f6302e;
                        float abs3 = Math.abs(f10);
                        float abs4 = Math.abs(f11);
                        float f12 = this.C;
                        if (abs3 >= f12 || abs4 >= f12) {
                            if (abs3 > abs4) {
                                if (f10 >= 0.0f || (b10 & 4) != 0) {
                                    if (f10 > 0.0f && (b10 & 8) == 0) {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else if (f11 >= 0.0f || (b10 & 1) != 0) {
                                if (f11 > 0.0f && (b10 & 2) == 0) {
                                    return;
                                }
                            } else {
                                return;
                            }
                            this.f6305r = 0.0f;
                            this.f6304n = 0.0f;
                            this.f6307w = motionEvent.getPointerId(0);
                            p(n1Var, 1);
                        }
                    }
                }
            }
        }
    }

    public final int i(n1 n1Var, int i10) {
        int i11;
        if ((i10 & 3) != 0) {
            int i12 = 1;
            if (this.f6305r > 0.0f) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            VelocityTracker velocityTracker = this.F;
            b0 b0Var = this.f6308x;
            if (velocityTracker != null && this.f6307w > -1) {
                velocityTracker.computeCurrentVelocity(1000, b0Var.h(this.h));
                float xVelocity = this.F.getXVelocity(this.f6307w);
                float yVelocity = this.F.getYVelocity(this.f6307w);
                if (yVelocity > 0.0f) {
                    i12 = 2;
                }
                float abs = Math.abs(yVelocity);
                if ((i12 & i10) != 0 && i12 == i11 && abs >= b0Var.f(this.f6303f) && abs > Math.abs(xVelocity)) {
                    return i12;
                }
            }
            float g10 = b0Var.g() * this.D.getHeight();
            if ((i10 & i11) != 0 && Math.abs(this.f6305r) > g10) {
                return i11;
            }
            return 0;
        }
        return 0;
    }

    public final void j(n1 n1Var, boolean z10) {
        ArrayList arrayList = this.B;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            z zVar = (z) arrayList.get(size);
            if (zVar.f6516e == n1Var) {
                zVar.v |= z10;
                if (!zVar.f6521w) {
                    zVar.h.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View k(MotionEvent motionEvent) {
        float x4 = motionEvent.getX();
        float y8 = motionEvent.getY();
        n1 n1Var = this.f6301c;
        if (n1Var != null) {
            View view = n1Var.f6432a;
            if (m(view, x4, y8, this.f6306s + this.f6304n, this.v + this.f6305r)) {
                return view;
            }
        }
        ArrayList arrayList = this.B;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            z zVar = (z) arrayList.get(size);
            View view2 = zVar.f6516e.f6432a;
            if (m(view2, x4, y8, zVar.f6519r, zVar.f6520s)) {
                return view2;
            }
        }
        return this.D.E(x4, y8);
    }

    public final void l(float[] fArr) {
        if ((this.A & 12) != 0) {
            fArr[0] = (this.f6306s + this.f6304n) - this.f6301c.f6432a.getLeft();
        } else {
            fArr[0] = this.f6301c.f6432a.getTranslationX();
        }
        if ((this.A & 3) != 0) {
            fArr[1] = (this.v + this.f6305r) - this.f6301c.f6432a.getTop();
        } else {
            fArr[1] = this.f6301c.f6432a.getTranslationY();
        }
    }

    public final void n(n1 n1Var) {
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
        if (!this.D.isLayoutRequested() && this.f6309y == 2) {
            b0 b0Var = this.f6308x;
            b0Var.getClass();
            int i13 = (int) (this.f6306s + this.f6304n);
            int i14 = (int) (this.v + this.f6305r);
            View view2 = n1Var.f6432a;
            if (Math.abs(i14 - view2.getTop()) >= view2.getHeight() * 0.5f || Math.abs(i13 - view2.getLeft()) >= view2.getWidth() * 0.5f) {
                ArrayList arrayList2 = this.G;
                if (arrayList2 == null) {
                    this.G = new ArrayList();
                    this.H = new ArrayList();
                } else {
                    arrayList2.clear();
                    this.H.clear();
                }
                int round = Math.round(this.f6306s + this.f6304n);
                int round2 = Math.round(this.v + this.f6305r);
                int width = view2.getWidth() + round;
                int height = view2.getHeight() + round2;
                int i15 = (round + width) / 2;
                int i16 = (round2 + height) / 2;
                w0 layoutManager = this.D.getLayoutManager();
                int r6 = layoutManager.r();
                int i17 = 0;
                while (i17 < r6) {
                    View q6 = layoutManager.q(i17);
                    if (q6 == view2) {
                        i10 = i17;
                    } else {
                        i10 = i17;
                        if (q6.getBottom() >= round2 && q6.getTop() <= height && q6.getRight() >= round && q6.getLeft() <= width) {
                            n1 T = this.D.T(q6);
                            int abs5 = Math.abs(i15 - ((q6.getRight() + q6.getLeft()) / 2));
                            int abs6 = Math.abs(i16 - ((q6.getBottom() + q6.getTop()) / 2));
                            int i18 = (abs6 * abs6) + (abs5 * abs5);
                            view = view2;
                            int size = this.G.size();
                            i11 = round;
                            i12 = i13;
                            int i19 = 0;
                            int i20 = 0;
                            while (i19 < size) {
                                int i21 = size;
                                if (i18 <= ((Integer) this.H.get(i19)).intValue()) {
                                    break;
                                }
                                i20++;
                                i19++;
                                size = i21;
                            }
                            this.G.add(i20, T);
                            this.H.add(i20, Integer.valueOf(i18));
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
                ArrayList arrayList3 = this.G;
                if (arrayList3.size() != 0) {
                    int width2 = view3.getWidth() + i22;
                    int height2 = view3.getHeight() + i14;
                    int left2 = i22 - view3.getLeft();
                    int top2 = i14 - view3.getTop();
                    int size2 = arrayList3.size();
                    n1 n1Var2 = null;
                    int i23 = -1;
                    int i24 = 0;
                    while (i24 < size2) {
                        n1 n1Var3 = (n1) arrayList3.get(i24);
                        if (left2 > 0 && (right = n1Var3.f6432a.getRight() - width2) < 0) {
                            arrayList = arrayList3;
                            if (n1Var3.f6432a.getRight() > view3.getRight() && (abs4 = Math.abs(right)) > i23) {
                                i23 = abs4;
                                n1Var2 = n1Var3;
                            }
                        } else {
                            arrayList = arrayList3;
                        }
                        if (left2 < 0 && (left = n1Var3.f6432a.getLeft() - i22) > 0 && n1Var3.f6432a.getLeft() < view3.getLeft() && (abs3 = Math.abs(left)) > i23) {
                            i23 = abs3;
                            n1Var2 = n1Var3;
                        }
                        if (top2 < 0 && (top = n1Var3.f6432a.getTop() - i14) > 0 && n1Var3.f6432a.getTop() < view3.getTop() && (abs2 = Math.abs(top)) > i23) {
                            i23 = abs2;
                            n1Var2 = n1Var3;
                        }
                        if (top2 > 0 && (bottom = n1Var3.f6432a.getBottom() - height2) < 0 && n1Var3.f6432a.getBottom() > view3.getBottom() && (abs = Math.abs(bottom)) > i23) {
                            i23 = abs;
                            n1Var2 = n1Var3;
                        }
                        i24++;
                        arrayList3 = arrayList;
                    }
                    if (n1Var2 == null) {
                        this.G.clear();
                        this.H.clear();
                        return;
                    }
                    int b10 = n1Var2.b();
                    n1Var.b();
                    if (b0Var.n(this.D, n1Var, n1Var2)) {
                        this.f6308x.o(this.D, n1Var, n1Var2, b10, i22, i14);
                    }
                }
            }
        }
    }

    public final void o(View view) {
        if (view == this.I) {
            this.I = null;
        }
    }

    public final void p(f2.n1 r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: f2.e0.p(f2.n1, int):void");
    }

    public boolean q() {
        return false;
    }

    public final void r(n1 n1Var) {
        RecyclerView recyclerView = this.D;
        b0 b0Var = this.f6308x;
        int e10 = b0Var.e(recyclerView, n1Var);
        WeakHashMap weakHashMap = r0.j0.f46829a;
        if ((b0Var.b(e10, recyclerView.getLayoutDirection()) & 16711680) != 0) {
            if (n1Var.f6432a.getParent() != this.D) {
                Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
                return;
            }
            VelocityTracker velocityTracker = this.F;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            this.F = VelocityTracker.obtain();
            this.f6305r = 0.0f;
            this.f6304n = 0.0f;
            p(n1Var, 2);
            return;
        }
        Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
    }

    public final void s(int i10, int i11, MotionEvent motionEvent) {
        float x4 = motionEvent.getX(i11);
        float y8 = motionEvent.getY(i11);
        float f9 = x4 - this.d;
        this.f6304n = f9;
        this.f6305r = y8 - this.f6302e;
        if ((i10 & 4) == 0) {
            this.f6304n = Math.max(0.0f, f9);
        }
        if ((i10 & 8) == 0) {
            this.f6304n = Math.min(0.0f, this.f6304n);
        }
        if ((i10 & 1) == 0) {
            this.f6305r = Math.max(0.0f, this.f6305r);
        }
        if ((i10 & 2) == 0) {
            this.f6305r = Math.min(0.0f, this.f6305r);
        }
    }
}
