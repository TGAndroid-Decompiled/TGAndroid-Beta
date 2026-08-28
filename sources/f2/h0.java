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
import org.telegram.ui.Components.wk0;
public class h0 extends y0 {
    public int A;
    public int C;
    public RecyclerView D;
    public VelocityTracker F;
    public ArrayList G;
    public ArrayList H;
    public m5.c0 J;
    public e0 K;
    public Rect M;
    public long N;
    public float d;
    public float f5371e;
    public float f5372f;
    public float h;
    public float f5373n;
    public float f5374r;
    public float f5375s;
    public float v;
    public final d0 f5377x;
    public final ArrayList f5368a = new ArrayList();
    public final float[] f5369b = new float[2];
    public q1 f5370c = null;
    public int f5376w = -1;
    public int f5378y = 0;
    public final ArrayList B = new ArrayList();
    public final androidx.activity.i E = new androidx.activity.i(this, 19);
    public View I = null;
    public final a0 L = new a0(this);

    public h0(d0 d0Var) {
        this.f5377x = d0Var;
    }

    public static boolean m(View view, float f10, float f11, float f12, float f13) {
        if (f10 >= f12 && f10 <= f12 + view.getWidth() && f11 >= f13 && f11 <= f13 + view.getHeight()) {
            return true;
        }
        return false;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, n1 n1Var) {
        rect.setEmpty();
    }

    @Override
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        float f10;
        float f11;
        if (this.f5370c != null) {
            float[] fArr = this.f5369b;
            l(fArr);
            float f12 = fArr[0];
            f10 = fArr[1];
            f11 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        q1 q1Var = this.f5370c;
        int i9 = this.f5378y;
        d0 d0Var = this.f5377x;
        d0Var.getClass();
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            b0 b0Var = (b0) arrayList.get(i10);
            q1 q1Var2 = b0Var.f5324e;
            float f13 = b0Var.f5321a;
            float f14 = b0Var.f5323c;
            if (f13 == f14) {
                b0Var.f5327r = q1Var2.f5501a.getTranslationX();
            } else {
                b0Var.f5327r = e2.c.z(f14, f13, b0Var.f5330x, f13);
            }
            float f15 = b0Var.f5322b;
            float f16 = b0Var.d;
            if (f15 == f16) {
                b0Var.f5328s = q1Var2.f5501a.getTranslationY();
            } else {
                b0Var.f5328s = e2.c.z(f16, f15, b0Var.f5330x, f15);
            }
            int save = canvas.save();
            d0Var.m(canvas, recyclerView, b0Var.f5324e, b0Var.f5327r, b0Var.f5328s, b0Var.f5325f, false);
            canvas.restoreToCount(save);
        }
        if (q1Var != null) {
            int save2 = canvas.save();
            d0Var.m(canvas, recyclerView, q1Var, f11, f10, i9, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        boolean z10 = false;
        if (this.f5370c != null) {
            float[] fArr = this.f5369b;
            l(fArr);
            float f10 = fArr[0];
            float f11 = fArr[1];
        }
        q1 q1Var = this.f5370c;
        this.f5377x.getClass();
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            int save = canvas.save();
            View view = ((b0) arrayList.get(i9)).f5324e.f5501a;
            canvas.restoreToCount(save);
        }
        if (q1Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i10 = size - 1; i10 >= 0; i10--) {
            b0 b0Var = (b0) arrayList.get(i10);
            boolean z11 = b0Var.f5329w;
            if (z11 && !b0Var.f5326n) {
                arrayList.remove(i10);
            } else if (!z11) {
                z10 = true;
            }
        }
        if (z10) {
            recyclerView.invalidate();
        }
    }

    public final void d(wk0 wk0Var) {
        RecyclerView recyclerView = this.D;
        if (recyclerView != wk0Var) {
            a0 a0Var = this.L;
            if (recyclerView != null) {
                recyclerView.p0(this);
                RecyclerView recyclerView2 = this.D;
                recyclerView2.A.remove(a0Var);
                if (recyclerView2.B == a0Var) {
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
                    this.f5377x.a(this.D, ((b0) arrayList2.get(0)).f5324e);
                }
                arrayList2.clear();
                this.I = null;
                VelocityTracker velocityTracker = this.F;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.F = null;
                }
                e0 e0Var = this.K;
                if (e0Var != null) {
                    e0Var.f5344a = false;
                    this.K = null;
                }
                if (this.J != null) {
                    this.J = null;
                }
            }
            this.D = wk0Var;
            if (wk0Var != null) {
                wk0Var.getResources();
                this.f5372f = AndroidUtilities.dp(120.0f);
                this.h = AndroidUtilities.dp(800.0f);
                this.C = ViewConfiguration.get(this.D.getContext()).getScaledTouchSlop();
                this.D.i(this);
                this.D.A.add(a0Var);
                RecyclerView recyclerView3 = this.D;
                if (recyclerView3.L == null) {
                    recyclerView3.L = new ArrayList();
                }
                recyclerView3.L.add(this);
                this.K = new e0(this);
                this.J = new m5.c0(this.D.getContext(), this.K);
            }
        }
    }

    public final int f(q1 q1Var, int i9) {
        int i10;
        if ((i9 & 12) != 0) {
            int i11 = 4;
            if (this.f5373n > 0.0f) {
                i10 = 8;
            } else {
                i10 = 4;
            }
            VelocityTracker velocityTracker = this.F;
            d0 d0Var = this.f5377x;
            if (velocityTracker != null && this.f5376w > -1) {
                velocityTracker.computeCurrentVelocity(1000, d0Var.h(this.h));
                float xVelocity = this.F.getXVelocity(this.f5376w);
                float yVelocity = this.F.getYVelocity(this.f5376w);
                if (xVelocity > 0.0f) {
                    i11 = 8;
                }
                float abs = Math.abs(xVelocity);
                if ((i11 & i9) != 0 && i10 == i11 && abs >= d0Var.f(this.f5372f) && abs > Math.abs(yVelocity)) {
                    return i11;
                }
            }
            float g10 = d0Var.g() * this.D.getWidth();
            if ((i9 & i10) != 0 && Math.abs(this.f5373n) > g10) {
                return i10;
            }
            return 0;
        }
        return 0;
    }

    public final void h(int i9, int i10, MotionEvent motionEvent) {
        View k10;
        if (this.f5370c == null && i9 == 2 && this.f5378y != 2) {
            d0 d0Var = this.f5377x;
            if (d0Var.j() && this.D.getScrollState() != 1) {
                z0 layoutManager = this.D.getLayoutManager();
                int i11 = this.f5376w;
                q1 q1Var = null;
                if (i11 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i11);
                    float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.d);
                    float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.f5371e);
                    float f10 = this.C;
                    if ((abs >= f10 || abs2 >= f10) && ((abs <= abs2 || !layoutManager.d()) && ((abs2 <= abs || !layoutManager.e()) && (k10 = k(motionEvent)) != null))) {
                        q1Var = this.D.T(k10);
                    }
                }
                if (q1Var != null) {
                    RecyclerView recyclerView = this.D;
                    int e10 = d0Var.e(recyclerView, q1Var);
                    WeakHashMap weakHashMap = r0.j0.f46915a;
                    int b10 = (d0Var.b(e10, recyclerView.getLayoutDirection()) & 65280) >> 8;
                    if (b10 != 0) {
                        float x10 = motionEvent.getX(i10);
                        float y10 = motionEvent.getY(i10);
                        float f11 = x10 - this.d;
                        float f12 = y10 - this.f5371e;
                        float abs3 = Math.abs(f11);
                        float abs4 = Math.abs(f12);
                        float f13 = this.C;
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
                            this.f5374r = 0.0f;
                            this.f5373n = 0.0f;
                            this.f5376w = motionEvent.getPointerId(0);
                            p(q1Var, 1);
                        }
                    }
                }
            }
        }
    }

    public final int i(q1 q1Var, int i9) {
        int i10;
        if ((i9 & 3) != 0) {
            int i11 = 1;
            if (this.f5374r > 0.0f) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            VelocityTracker velocityTracker = this.F;
            d0 d0Var = this.f5377x;
            if (velocityTracker != null && this.f5376w > -1) {
                velocityTracker.computeCurrentVelocity(1000, d0Var.h(this.h));
                float xVelocity = this.F.getXVelocity(this.f5376w);
                float yVelocity = this.F.getYVelocity(this.f5376w);
                if (yVelocity > 0.0f) {
                    i11 = 2;
                }
                float abs = Math.abs(yVelocity);
                if ((i11 & i9) != 0 && i11 == i10 && abs >= d0Var.f(this.f5372f) && abs > Math.abs(xVelocity)) {
                    return i11;
                }
            }
            float g10 = d0Var.g() * this.D.getHeight();
            if ((i9 & i10) != 0 && Math.abs(this.f5374r) > g10) {
                return i10;
            }
            return 0;
        }
        return 0;
    }

    public final void j(q1 q1Var, boolean z10) {
        ArrayList arrayList = this.B;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b0 b0Var = (b0) arrayList.get(size);
            if (b0Var.f5324e == q1Var) {
                b0Var.v |= z10;
                if (!b0Var.f5329w) {
                    b0Var.h.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View k(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        q1 q1Var = this.f5370c;
        if (q1Var != null) {
            View view = q1Var.f5501a;
            if (m(view, x10, y10, this.f5375s + this.f5373n, this.v + this.f5374r)) {
                return view;
            }
        }
        ArrayList arrayList = this.B;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b0 b0Var = (b0) arrayList.get(size);
            View view2 = b0Var.f5324e.f5501a;
            if (m(view2, x10, y10, b0Var.f5327r, b0Var.f5328s)) {
                return view2;
            }
        }
        return this.D.E(x10, y10);
    }

    public final void l(float[] fArr) {
        if ((this.A & 12) != 0) {
            fArr[0] = (this.f5375s + this.f5373n) - this.f5370c.f5501a.getLeft();
        } else {
            fArr[0] = this.f5370c.f5501a.getTranslationX();
        }
        if ((this.A & 3) != 0) {
            fArr[1] = (this.v + this.f5374r) - this.f5370c.f5501a.getTop();
        } else {
            fArr[1] = this.f5370c.f5501a.getTranslationY();
        }
    }

    public final void n(q1 q1Var) {
        ArrayList arrayList;
        int bottom;
        int abs;
        int top;
        int abs2;
        int left;
        int abs3;
        int right;
        int abs4;
        int i9;
        View view;
        int i10;
        int i11;
        if (!this.D.isLayoutRequested() && this.f5378y == 2) {
            d0 d0Var = this.f5377x;
            d0Var.getClass();
            int i12 = (int) (this.f5375s + this.f5373n);
            int i13 = (int) (this.v + this.f5374r);
            View view2 = q1Var.f5501a;
            if (Math.abs(i13 - view2.getTop()) >= view2.getHeight() * 0.5f || Math.abs(i12 - view2.getLeft()) >= view2.getWidth() * 0.5f) {
                ArrayList arrayList2 = this.G;
                if (arrayList2 == null) {
                    this.G = new ArrayList();
                    this.H = new ArrayList();
                } else {
                    arrayList2.clear();
                    this.H.clear();
                }
                int round = Math.round(this.f5375s + this.f5373n);
                int round2 = Math.round(this.v + this.f5374r);
                int width = view2.getWidth() + round;
                int height = view2.getHeight() + round2;
                int i14 = (round + width) / 2;
                int i15 = (round2 + height) / 2;
                z0 layoutManager = this.D.getLayoutManager();
                int r10 = layoutManager.r();
                int i16 = 0;
                while (i16 < r10) {
                    View q10 = layoutManager.q(i16);
                    if (q10 == view2) {
                        i9 = i16;
                    } else {
                        i9 = i16;
                        if (q10.getBottom() >= round2 && q10.getTop() <= height && q10.getRight() >= round && q10.getLeft() <= width) {
                            q1 T = this.D.T(q10);
                            int abs5 = Math.abs(i14 - ((q10.getRight() + q10.getLeft()) / 2));
                            int abs6 = Math.abs(i15 - ((q10.getBottom() + q10.getTop()) / 2));
                            int i17 = (abs6 * abs6) + (abs5 * abs5);
                            view = view2;
                            int size = this.G.size();
                            i10 = round;
                            i11 = i12;
                            int i18 = 0;
                            int i19 = 0;
                            while (i18 < size) {
                                int i20 = size;
                                if (i17 <= ((Integer) this.H.get(i18)).intValue()) {
                                    break;
                                }
                                i19++;
                                i18++;
                                size = i20;
                            }
                            this.G.add(i19, T);
                            this.H.add(i19, Integer.valueOf(i17));
                            i16 = i9 + 1;
                            view2 = view;
                            round = i10;
                            i12 = i11;
                        }
                    }
                    view = view2;
                    i10 = round;
                    i11 = i12;
                    i16 = i9 + 1;
                    view2 = view;
                    round = i10;
                    i12 = i11;
                }
                View view3 = view2;
                int i21 = i12;
                ArrayList arrayList3 = this.G;
                if (arrayList3.size() != 0) {
                    int width2 = view3.getWidth() + i21;
                    int height2 = view3.getHeight() + i13;
                    int left2 = i21 - view3.getLeft();
                    int top2 = i13 - view3.getTop();
                    int size2 = arrayList3.size();
                    q1 q1Var2 = null;
                    int i22 = -1;
                    int i23 = 0;
                    while (i23 < size2) {
                        q1 q1Var3 = (q1) arrayList3.get(i23);
                        if (left2 > 0 && (right = q1Var3.f5501a.getRight() - width2) < 0) {
                            arrayList = arrayList3;
                            if (q1Var3.f5501a.getRight() > view3.getRight() && (abs4 = Math.abs(right)) > i22) {
                                i22 = abs4;
                                q1Var2 = q1Var3;
                            }
                        } else {
                            arrayList = arrayList3;
                        }
                        if (left2 < 0 && (left = q1Var3.f5501a.getLeft() - i21) > 0 && q1Var3.f5501a.getLeft() < view3.getLeft() && (abs3 = Math.abs(left)) > i22) {
                            i22 = abs3;
                            q1Var2 = q1Var3;
                        }
                        if (top2 < 0 && (top = q1Var3.f5501a.getTop() - i13) > 0 && q1Var3.f5501a.getTop() < view3.getTop() && (abs2 = Math.abs(top)) > i22) {
                            i22 = abs2;
                            q1Var2 = q1Var3;
                        }
                        if (top2 > 0 && (bottom = q1Var3.f5501a.getBottom() - height2) < 0 && q1Var3.f5501a.getBottom() > view3.getBottom() && (abs = Math.abs(bottom)) > i22) {
                            i22 = abs;
                            q1Var2 = q1Var3;
                        }
                        i23++;
                        arrayList3 = arrayList;
                    }
                    if (q1Var2 == null) {
                        this.G.clear();
                        this.H.clear();
                        return;
                    }
                    int b10 = q1Var2.b();
                    q1Var.b();
                    if (d0Var.n(this.D, q1Var, q1Var2)) {
                        this.f5377x.o(this.D, q1Var, q1Var2, b10, i21, i13);
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

    public final void p(f2.q1 r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: f2.h0.p(f2.q1, int):void");
    }

    public boolean q() {
        return false;
    }

    public final void r(q1 q1Var) {
        RecyclerView recyclerView = this.D;
        d0 d0Var = this.f5377x;
        int e10 = d0Var.e(recyclerView, q1Var);
        WeakHashMap weakHashMap = r0.j0.f46915a;
        if ((d0Var.b(e10, recyclerView.getLayoutDirection()) & 16711680) != 0) {
            if (q1Var.f5501a.getParent() != this.D) {
                Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
                return;
            }
            VelocityTracker velocityTracker = this.F;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            this.F = VelocityTracker.obtain();
            this.f5374r = 0.0f;
            this.f5373n = 0.0f;
            p(q1Var, 2);
            return;
        }
        Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
    }

    public final void s(int i9, int i10, MotionEvent motionEvent) {
        float x10 = motionEvent.getX(i10);
        float y10 = motionEvent.getY(i10);
        float f10 = x10 - this.d;
        this.f5373n = f10;
        this.f5374r = y10 - this.f5371e;
        if ((i9 & 4) == 0) {
            this.f5373n = Math.max(0.0f, f10);
        }
        if ((i9 & 8) == 0) {
            this.f5373n = Math.min(0.0f, this.f5373n);
        }
        if ((i9 & 1) == 0) {
            this.f5374r = Math.max(0.0f, this.f5374r);
        }
        if ((i9 & 2) == 0) {
            this.f5374r = Math.min(0.0f, this.f5374r);
        }
    }
}
