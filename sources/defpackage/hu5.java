package defpackage;

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
public class hu5 extends e69 implements h69 {
    public int F;
    public int H;
    public RecyclerView I;
    public VelocityTracker K;
    public ArrayList L;
    public ArrayList M;
    public lj4 O;
    public fu5 P;
    public Rect R;
    public long S;
    public float d;
    public float e;
    public float f;
    public float h;
    public float n;
    public float r;
    public float s;
    public float w;
    public final eu5 y;
    public final ArrayList a = new ArrayList();
    public final float[] b = new float[2];
    public u69 c = null;
    public int x = -1;
    public byte E = 0;
    public final ArrayList G = new ArrayList();
    public final o04 J = new o04(this, (byte) 17);
    public View N = null;
    public final cu5 Q = new cu5(this);

    public hu5(eu5 eu5Var) {
        this.y = eu5Var;
    }

    public static boolean o(View view, float f, float f2, float f3, float f4) {
        if (f >= f3 && f <= f3 + view.getWidth() && f2 >= f4 && f2 <= f4 + view.getHeight()) {
            return true;
        }
        return false;
    }

    @Override
    public final void b(View view) {
        if (view == this.N) {
            this.N = null;
        }
        u69 T = this.I.T(view);
        if (T != null) {
            u69 u69Var = this.c;
            if (u69Var != null && T == u69Var) {
                q(null, 0);
                return;
            }
            l(T, false);
            if (this.a.remove(T.a)) {
                this.y.a(this.I, T);
            }
        }
    }

    @Override
    public final void d(Rect rect, View view, RecyclerView recyclerView, r69 r69Var) {
        rect.setEmpty();
    }

    @Override
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        float f;
        float f2;
        if (this.c != null) {
            float[] fArr = this.b;
            n(fArr);
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        u69 u69Var = this.c;
        byte b = this.E;
        eu5 eu5Var = this.y;
        eu5Var.getClass();
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            du5 du5Var = (du5) arrayList.get(i);
            u69 u69Var2 = du5Var.e;
            float f4 = du5Var.a;
            float f5 = du5Var.c;
            if (f4 == f5) {
                du5Var.r = u69Var2.a.getTranslationX();
            } else {
                du5Var.r = td4.A(f5, f4, du5Var.y, f4);
            }
            float f6 = du5Var.b;
            float f7 = du5Var.d;
            if (f6 == f7) {
                du5Var.s = u69Var2.a.getTranslationY();
            } else {
                du5Var.s = td4.A(f7, f6, du5Var.y, f6);
            }
            int save = canvas.save();
            u69 u69Var3 = du5Var.e;
            float f8 = du5Var.r;
            float f9 = du5Var.s;
            byte b2 = du5Var.f;
            eu5 eu5Var2 = eu5Var;
            eu5Var2.n(canvas, recyclerView, u69Var3, f8, f9, b2, false);
            canvas.restoreToCount(save);
            i++;
            eu5Var = eu5Var2;
        }
        eu5 eu5Var3 = eu5Var;
        if (u69Var != null) {
            int save2 = canvas.save();
            eu5Var3.n(canvas, recyclerView, u69Var, f2, f, b, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        boolean z = false;
        if (this.c != null) {
            float[] fArr = this.b;
            n(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
        }
        u69 u69Var = this.c;
        this.y.getClass();
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            int save = canvas.save();
            View view = ((du5) arrayList.get(i)).e.a;
            canvas.restoreToCount(save);
        }
        if (u69Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            du5 du5Var = (du5) arrayList.get(i2);
            if (du5Var.x) {
                if (!du5Var.n) {
                    arrayList.remove(i2);
                }
            } else {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    public final void h(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.I;
        if (recyclerView2 != recyclerView) {
            cu5 cu5Var = this.Q;
            if (recyclerView2 != null) {
                recyclerView2.r0(this);
                RecyclerView recyclerView3 = this.I;
                recyclerView3.F.remove(cu5Var);
                if (recyclerView3.G == cu5Var) {
                    recyclerView3.G = null;
                }
                ArrayList arrayList = this.I.Q;
                if (arrayList != null) {
                    arrayList.remove(this);
                }
                ArrayList arrayList2 = this.G;
                int size = arrayList2.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.y.a(this.I, ((du5) arrayList2.get(0)).e);
                }
                arrayList2.clear();
                this.N = null;
                VelocityTracker velocityTracker = this.K;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.K = null;
                }
                fu5 fu5Var = this.P;
                if (fu5Var != null) {
                    fu5Var.a = false;
                    this.P = null;
                }
                if (this.O != null) {
                    this.O = null;
                }
            }
            this.I = recyclerView;
            if (recyclerView != null) {
                recyclerView.getResources();
                this.f = gm.L(120.0f);
                this.h = gm.L(800.0f);
                this.H = ViewConfiguration.get(this.I.getContext()).getScaledTouchSlop();
                this.I.i(this);
                this.I.F.add(cu5Var);
                RecyclerView recyclerView4 = this.I;
                ArrayList arrayList3 = recyclerView4.Q;
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    recyclerView4.Q = arrayList3;
                }
                arrayList3.add(this);
                this.P = new fu5(this);
                this.O = new lj4(this.I.getContext(), this.P);
            }
        }
    }

    public final int i(u69 u69Var, int i) {
        int i2;
        if ((i & 12) != 0) {
            int i3 = 4;
            if (this.n > 0.0f) {
                i2 = 8;
            } else {
                i2 = 4;
            }
            VelocityTracker velocityTracker = this.K;
            eu5 eu5Var = this.y;
            if (velocityTracker != null && this.x > -1) {
                velocityTracker.computeCurrentVelocity(1000, eu5Var.i(this.h));
                float xVelocity = this.K.getXVelocity(this.x);
                float yVelocity = this.K.getYVelocity(this.x);
                if (xVelocity > 0.0f) {
                    i3 = 8;
                }
                float abs = Math.abs(xVelocity);
                if ((i3 & i) != 0 && i2 == i3 && abs >= eu5Var.g(this.f) && abs > Math.abs(yVelocity)) {
                    return i3;
                }
            }
            float h = eu5Var.h() * this.I.getWidth();
            if ((i & i2) != 0 && Math.abs(this.n) > h) {
                return i2;
            }
            return 0;
        }
        return 0;
    }

    public final void j(int i, int i2, MotionEvent motionEvent) {
        View m;
        if (this.c == null && i == 2 && this.E != 2) {
            eu5 eu5Var = this.y;
            if (eu5Var.k() && this.I.getScrollState() != 1) {
                f69 layoutManager = this.I.getLayoutManager();
                int i3 = this.x;
                u69 u69Var = null;
                if (i3 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i3);
                    float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.d);
                    float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.e);
                    float f = this.H;
                    if ((abs >= f || abs2 >= f) && ((abs <= abs2 || !layoutManager.d()) && ((abs2 <= abs || !layoutManager.e()) && (m = m(motionEvent)) != null))) {
                        u69Var = this.I.T(m);
                    }
                }
                if (u69Var != null) {
                    RecyclerView recyclerView = this.I;
                    int f2 = eu5Var.f(recyclerView, u69Var);
                    WeakHashMap weakHashMap = kfc.a;
                    int b = (eu5Var.b(f2, recyclerView.getLayoutDirection()) & 65280) >> 8;
                    if (b != 0) {
                        float x = motionEvent.getX(i2);
                        float y = motionEvent.getY(i2);
                        float f3 = x - this.d;
                        float f4 = y - this.e;
                        float abs3 = Math.abs(f3);
                        float abs4 = Math.abs(f4);
                        float f5 = this.H;
                        if (abs3 >= f5 || abs4 >= f5) {
                            if (abs3 > abs4) {
                                if (f3 >= 0.0f || (b & 4) != 0) {
                                    if (f3 > 0.0f && (b & 8) == 0) {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else if (f4 >= 0.0f || (b & 1) != 0) {
                                if (f4 > 0.0f && (b & 2) == 0) {
                                    return;
                                }
                            } else {
                                return;
                            }
                            this.r = 0.0f;
                            this.n = 0.0f;
                            this.x = motionEvent.getPointerId(0);
                            q(u69Var, 1);
                        }
                    }
                }
            }
        }
    }

    public final int k(u69 u69Var, int i) {
        int i2;
        if ((i & 3) != 0) {
            int i3 = 1;
            if (this.r > 0.0f) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            VelocityTracker velocityTracker = this.K;
            eu5 eu5Var = this.y;
            if (velocityTracker != null && this.x > -1) {
                velocityTracker.computeCurrentVelocity(1000, eu5Var.i(this.h));
                float xVelocity = this.K.getXVelocity(this.x);
                float yVelocity = this.K.getYVelocity(this.x);
                if (yVelocity > 0.0f) {
                    i3 = 2;
                }
                float abs = Math.abs(yVelocity);
                if ((i3 & i) != 0 && i3 == i2 && abs >= eu5Var.g(this.f) && abs > Math.abs(xVelocity)) {
                    return i3;
                }
            }
            float h = eu5Var.h() * this.I.getHeight();
            if ((i & i2) != 0 && Math.abs(this.r) > h) {
                return i2;
            }
            return 0;
        }
        return 0;
    }

    public final void l(u69 u69Var, boolean z) {
        ArrayList arrayList = this.G;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            du5 du5Var = (du5) arrayList.get(size);
            if (du5Var.e == u69Var) {
                du5Var.w |= z;
                if (!du5Var.x) {
                    du5Var.h.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View m(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        u69 u69Var = this.c;
        if (u69Var != null) {
            View view = u69Var.a;
            if (o(view, x, y, this.s + this.n, this.w + this.r)) {
                return view;
            }
        }
        ArrayList arrayList = this.G;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            du5 du5Var = (du5) arrayList.get(size);
            View view2 = du5Var.e.a;
            if (o(view2, x, y, du5Var.r, du5Var.s)) {
                return view2;
            }
        }
        return this.I.E(x, y);
    }

    public final void n(float[] fArr) {
        if ((this.F & 12) != 0) {
            fArr[0] = (this.s + this.n) - this.c.a.getLeft();
        } else {
            fArr[0] = this.c.a.getTranslationX();
        }
        if ((this.F & 3) != 0) {
            fArr[1] = (this.w + this.r) - this.c.a.getTop();
        } else {
            fArr[1] = this.c.a.getTranslationY();
        }
    }

    public final void p(u69 u69Var) {
        int bottom;
        int abs;
        int top;
        int abs2;
        int left;
        int abs3;
        int right;
        int abs4;
        View view;
        int i;
        int i2;
        if (!this.I.isLayoutRequested() && this.E == 2) {
            eu5 eu5Var = this.y;
            eu5Var.getClass();
            int i3 = (int) (this.s + this.n);
            int i4 = (int) (this.w + this.r);
            View view2 = u69Var.a;
            if (Math.abs(i4 - view2.getTop()) >= view2.getHeight() * 0.5f || Math.abs(i3 - view2.getLeft()) >= view2.getWidth() * 0.5f) {
                ArrayList arrayList = this.L;
                if (arrayList == null) {
                    this.L = new ArrayList();
                    this.M = new ArrayList();
                } else {
                    arrayList.clear();
                    this.M.clear();
                }
                int round = Math.round(this.s + this.n);
                int round2 = Math.round(this.w + this.r);
                int width = view2.getWidth() + round;
                int height = view2.getHeight() + round2;
                int i5 = (round + width) / 2;
                int i6 = (round2 + height) / 2;
                f69 layoutManager = this.I.getLayoutManager();
                int r = layoutManager.r();
                int i7 = 0;
                while (i7 < r) {
                    View q = layoutManager.q(i7);
                    int i8 = i7;
                    if (q == view2 || q.getBottom() < round2 || q.getTop() > height || q.getRight() < round || q.getLeft() > width) {
                        view = view2;
                        i = i3;
                        i2 = i4;
                    } else {
                        u69 T = this.I.T(q);
                        int abs5 = Math.abs(i5 - ((q.getRight() + q.getLeft()) / 2));
                        int abs6 = Math.abs(i6 - ((q.getBottom() + q.getTop()) / 2));
                        int i9 = (abs6 * abs6) + (abs5 * abs5);
                        view = view2;
                        int size = this.L.size();
                        i = i3;
                        i2 = i4;
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < size) {
                            int i12 = size;
                            if (i9 <= ((Integer) this.M.get(i10)).intValue()) {
                                break;
                            }
                            i11++;
                            i10++;
                            size = i12;
                        }
                        this.L.add(i11, T);
                        this.M.add(i11, Integer.valueOf(i9));
                    }
                    i7 = i8 + 1;
                    view2 = view;
                    i3 = i;
                    i4 = i2;
                }
                View view3 = view2;
                int i13 = i3;
                int i14 = i4;
                ArrayList arrayList2 = this.L;
                if (arrayList2.size() != 0) {
                    int width2 = view3.getWidth() + i13;
                    int height2 = view3.getHeight() + i14;
                    int left2 = i13 - view3.getLeft();
                    int top2 = i14 - view3.getTop();
                    int size2 = arrayList2.size();
                    u69 u69Var2 = null;
                    int i15 = -1;
                    for (int i16 = 0; i16 < size2; i16++) {
                        u69 u69Var3 = (u69) arrayList2.get(i16);
                        if (left2 > 0 && (right = u69Var3.a.getRight() - width2) < 0 && u69Var3.a.getRight() > view3.getRight() && (abs4 = Math.abs(right)) > i15) {
                            u69Var2 = u69Var3;
                            i15 = abs4;
                        }
                        if (left2 < 0 && (left = u69Var3.a.getLeft() - i13) > 0 && u69Var3.a.getLeft() < view3.getLeft() && (abs3 = Math.abs(left)) > i15) {
                            u69Var2 = u69Var3;
                            i15 = abs3;
                        }
                        if (top2 < 0 && (top = u69Var3.a.getTop() - i14) > 0 && u69Var3.a.getTop() < view3.getTop() && (abs2 = Math.abs(top)) > i15) {
                            u69Var2 = u69Var3;
                            i15 = abs2;
                        }
                        if (top2 > 0 && (bottom = u69Var3.a.getBottom() - height2) < 0 && u69Var3.a.getBottom() > view3.getBottom() && (abs = Math.abs(bottom)) > i15) {
                            u69Var2 = u69Var3;
                            i15 = abs;
                        }
                    }
                    if (u69Var2 == null) {
                        this.L.clear();
                        this.M.clear();
                        return;
                    }
                    int b = u69Var2.b();
                    u69Var.b();
                    if (eu5Var.o(this.I, u69Var, u69Var2)) {
                        this.y.p(this.I, u69Var, u69Var2, b, i13, i14);
                    }
                }
            }
        }
    }

    public final void q(defpackage.u69 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hu5.q(u69, int):void");
    }

    public boolean r() {
        return false;
    }

    public final void s(u69 u69Var) {
        RecyclerView recyclerView = this.I;
        eu5 eu5Var = this.y;
        int f = eu5Var.f(recyclerView, u69Var);
        WeakHashMap weakHashMap = kfc.a;
        if ((eu5Var.b(f, recyclerView.getLayoutDirection()) & 16711680) != 0) {
            if (u69Var.a.getParent() != this.I) {
                Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
                return;
            }
            VelocityTracker velocityTracker = this.K;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            this.K = VelocityTracker.obtain();
            this.r = 0.0f;
            this.n = 0.0f;
            q(u69Var, 2);
            return;
        }
        Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
    }

    public final void t(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.d;
        this.n = f;
        this.r = y - this.e;
        if ((i & 4) == 0) {
            f = Math.max(0.0f, f);
            this.n = f;
        }
        if ((i & 8) == 0) {
            this.n = Math.min(0.0f, f);
        }
        if ((i & 1) == 0) {
            this.r = Math.max(0.0f, this.r);
        }
        if ((i & 2) == 0) {
            this.r = Math.min(0.0f, this.r);
        }
    }

    @Override
    public final void c() {
    }
}
