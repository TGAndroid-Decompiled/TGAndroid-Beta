package f2;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.zk0;

public class f0 extends w0 {
    public int A;
    public int C;
    public RecyclerView D;
    public VelocityTracker F;
    public ArrayList G;
    public ArrayList H;
    public m5.o J;
    public d0 K;
    public Rect M;
    public long N;
    public float d;

    public float f5659e;

    public float f5660f;
    public float h;

    public float f5661n;

    public float f5662r;

    public float f5663s;
    public float v;

    public final c0 f5665x;

    public final ArrayList f5656a = new ArrayList();

    public final float[] f5657b = new float[2];

    public o1 f5658c = null;

    public int f5664w = -1;

    public int f5666y = 0;
    public final ArrayList B = new ArrayList();
    public final a8.b E = new a8.b(this, 18);
    public View I = null;
    public final z L = new z(this);

    public f0(c0 c0Var) {
        this.f5665x = c0Var;
    }

    public static boolean m(View view, float f10, float f11, float f12, float f13) {
        return f10 >= f12 && f10 <= f12 + ((float) view.getWidth()) && f11 >= f13 && f11 <= f13 + ((float) view.getHeight());
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, l1 l1Var) {
        rect.setEmpty();
    }

    @Override
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        float f10;
        float f11;
        if (this.f5658c != null) {
            float[] fArr = this.f5657b;
            l(fArr);
            float f12 = fArr[0];
            f10 = fArr[1];
            f11 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        o1 o1Var = this.f5658c;
        int i10 = this.f5666y;
        c0 c0Var = this.f5665x;
        c0Var.getClass();
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            a0 a0Var = (a0) arrayList.get(i11);
            o1 o1Var2 = a0Var.f5617e;
            float f13 = a0Var.f5614a;
            float f14 = a0Var.f5616c;
            if (f13 == f14) {
                a0Var.f5620r = o1Var2.f5789a.getTranslationX();
            } else {
                a0Var.f5620r = com.google.android.recaptcha.internal.a.z(f14, f13, a0Var.f5623x, f13);
            }
            float f15 = a0Var.f5615b;
            float f16 = a0Var.d;
            if (f15 == f16) {
                a0Var.f5621s = o1Var2.f5789a.getTranslationY();
            } else {
                a0Var.f5621s = com.google.android.recaptcha.internal.a.z(f16, f15, a0Var.f5623x, f15);
            }
            int iSave = canvas.save();
            c0Var.m(canvas, recyclerView, a0Var.f5617e, a0Var.f5620r, a0Var.f5621s, a0Var.f5618f, false);
            canvas.restoreToCount(iSave);
        }
        if (o1Var != null) {
            int iSave2 = canvas.save();
            c0Var.m(canvas, recyclerView, o1Var, f11, f10, i10, true);
            canvas.restoreToCount(iSave2);
        }
    }

    @Override
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        boolean z10 = false;
        if (this.f5658c != null) {
            float[] fArr = this.f5657b;
            l(fArr);
            float f10 = fArr[0];
            float f11 = fArr[1];
        }
        o1 o1Var = this.f5658c;
        this.f5665x.getClass();
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a0 a0Var = (a0) arrayList.get(i10);
            int iSave = canvas.save();
            View view = a0Var.f5617e.f5789a;
            canvas.restoreToCount(iSave);
        }
        if (o1Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i11 = size - 1; i11 >= 0; i11--) {
            a0 a0Var2 = (a0) arrayList.get(i11);
            boolean z11 = a0Var2.f5622w;
            if (z11 && !a0Var2.f5619n) {
                arrayList.remove(i11);
            } else if (!z11) {
                z10 = true;
            }
        }
        if (z10) {
            recyclerView.invalidate();
        }
    }

    public final void d(zk0 zk0Var) {
        RecyclerView recyclerView = this.D;
        if (recyclerView == zk0Var) {
            return;
        }
        z zVar = this.L;
        if (recyclerView != null) {
            recyclerView.p0(this);
            RecyclerView recyclerView2 = this.D;
            recyclerView2.A.remove(zVar);
            if (recyclerView2.B == zVar) {
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
                this.f5665x.a(this.D, ((a0) arrayList2.get(0)).f5617e);
            }
            arrayList2.clear();
            this.I = null;
            VelocityTracker velocityTracker = this.F;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.F = null;
            }
            d0 d0Var = this.K;
            if (d0Var != null) {
                d0Var.f5640a = false;
                this.K = null;
            }
            if (this.J != null) {
                this.J = null;
            }
        }
        this.D = zk0Var;
        if (zk0Var != null) {
            zk0Var.getResources();
            this.f5660f = AndroidUtilities.dp(120.0f);
            this.h = AndroidUtilities.dp(800.0f);
            this.C = ViewConfiguration.get(this.D.getContext()).getScaledTouchSlop();
            this.D.i(this);
            this.D.A.add(zVar);
            RecyclerView recyclerView3 = this.D;
            if (recyclerView3.L == null) {
                recyclerView3.L = new ArrayList();
            }
            recyclerView3.L.add(this);
            this.K = new d0(this);
            this.J = new m5.o(this.D.getContext(), this.K);
        }
    }

    public final int f(o1 o1Var, int i10) {
        if ((i10 & 12) == 0) {
            return 0;
        }
        int i11 = this.f5661n > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.F;
        c0 c0Var = this.f5665x;
        if (velocityTracker != null && this.f5664w > -1) {
            velocityTracker.computeCurrentVelocity(1000, c0Var.h(this.h));
            float xVelocity = this.F.getXVelocity(this.f5664w);
            float yVelocity = this.F.getYVelocity(this.f5664w);
            int i12 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i12 & i10) != 0 && i11 == i12 && fAbs >= c0Var.f(this.f5660f) && fAbs > Math.abs(yVelocity)) {
                return i12;
            }
        }
        float fG = c0Var.g() * this.D.getWidth();
        if ((i10 & i11) == 0 || Math.abs(this.f5661n) <= fG) {
            return 0;
        }
        return i11;
    }

    public final void h(int i10, int i11, MotionEvent motionEvent) {
        View viewK;
        if (this.f5658c == null && i10 == 2 && this.f5666y != 2) {
            c0 c0Var = this.f5665x;
            if (c0Var.j() && this.D.getScrollState() != 1) {
                x0 layoutManager = this.D.getLayoutManager();
                int i12 = this.f5664w;
                o1 o1VarT = null;
                if (i12 != -1) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i12);
                    float x8 = motionEvent.getX(iFindPointerIndex) - this.d;
                    float y10 = motionEvent.getY(iFindPointerIndex) - this.f5659e;
                    float fAbs = Math.abs(x8);
                    float fAbs2 = Math.abs(y10);
                    float f10 = this.C;
                    if ((fAbs >= f10 || fAbs2 >= f10) && ((fAbs <= fAbs2 || !layoutManager.d()) && ((fAbs2 <= fAbs || !layoutManager.e()) && (viewK = k(motionEvent)) != null))) {
                        o1VarT = this.D.T(viewK);
                    }
                }
                if (o1VarT == null) {
                    return;
                }
                RecyclerView recyclerView = this.D;
                int iE = c0Var.e(recyclerView, o1VarT);
                WeakHashMap weakHashMap = r0.j0.f46605a;
                int iB = (c0Var.b(iE, recyclerView.getLayoutDirection()) & 65280) >> 8;
                if (iB == 0) {
                    return;
                }
                float x10 = motionEvent.getX(i11);
                float y11 = motionEvent.getY(i11);
                float f11 = x10 - this.d;
                float f12 = y11 - this.f5659e;
                float fAbs3 = Math.abs(f11);
                float fAbs4 = Math.abs(f12);
                float f13 = this.C;
                if (fAbs3 >= f13 || fAbs4 >= f13) {
                    if (fAbs3 > fAbs4) {
                        if (f11 < 0.0f && (iB & 4) == 0) {
                            return;
                        }
                        if (f11 > 0.0f && (iB & 8) == 0) {
                            return;
                        }
                    } else {
                        if (f12 < 0.0f && (iB & 1) == 0) {
                            return;
                        }
                        if (f12 > 0.0f && (iB & 2) == 0) {
                            return;
                        }
                    }
                    this.f5662r = 0.0f;
                    this.f5661n = 0.0f;
                    this.f5664w = motionEvent.getPointerId(0);
                    p(o1VarT, 1);
                }
            }
        }
    }

    public final int i(o1 o1Var, int i10) {
        if ((i10 & 3) == 0) {
            return 0;
        }
        int i11 = this.f5662r > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.F;
        c0 c0Var = this.f5665x;
        if (velocityTracker != null && this.f5664w > -1) {
            velocityTracker.computeCurrentVelocity(1000, c0Var.h(this.h));
            float xVelocity = this.F.getXVelocity(this.f5664w);
            float yVelocity = this.F.getYVelocity(this.f5664w);
            int i12 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i12 & i10) != 0 && i12 == i11 && fAbs >= c0Var.f(this.f5660f) && fAbs > Math.abs(xVelocity)) {
                return i12;
            }
        }
        float fG = c0Var.g() * this.D.getHeight();
        if ((i10 & i11) == 0 || Math.abs(this.f5662r) <= fG) {
            return 0;
        }
        return i11;
    }

    public final void j(o1 o1Var, boolean z10) {
        ArrayList arrayList = this.B;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a0 a0Var = (a0) arrayList.get(size);
            if (a0Var.f5617e == o1Var) {
                a0Var.v |= z10;
                if (!a0Var.f5622w) {
                    a0Var.h.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View k(MotionEvent motionEvent) {
        float x8 = motionEvent.getX();
        float y10 = motionEvent.getY();
        o1 o1Var = this.f5658c;
        if (o1Var != null) {
            View view = o1Var.f5789a;
            if (m(view, x8, y10, this.f5663s + this.f5661n, this.v + this.f5662r)) {
                return view;
            }
        }
        ArrayList arrayList = this.B;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a0 a0Var = (a0) arrayList.get(size);
            View view2 = a0Var.f5617e.f5789a;
            if (m(view2, x8, y10, a0Var.f5620r, a0Var.f5621s)) {
                return view2;
            }
        }
        return this.D.E(x8, y10);
    }

    public final void l(float[] fArr) {
        if ((this.A & 12) != 0) {
            fArr[0] = (this.f5663s + this.f5661n) - this.f5658c.f5789a.getLeft();
        } else {
            fArr[0] = this.f5658c.f5789a.getTranslationX();
        }
        if ((this.A & 3) != 0) {
            fArr[1] = (this.v + this.f5662r) - this.f5658c.f5789a.getTop();
        } else {
            fArr[1] = this.f5658c.f5789a.getTranslationY();
        }
    }

    public final void n(o1 o1Var) {
        ArrayList arrayList;
        int bottom;
        int iAbs;
        int top;
        int iAbs2;
        int left;
        int iAbs3;
        int right;
        int iAbs4;
        int i10;
        if (!this.D.isLayoutRequested() && this.f5666y == 2) {
            c0 c0Var = this.f5665x;
            c0Var.getClass();
            int i11 = (int) (this.f5663s + this.f5661n);
            int i12 = (int) (this.v + this.f5662r);
            View view = o1Var.f5789a;
            if (Math.abs(i12 - view.getTop()) >= view.getHeight() * 0.5f || Math.abs(i11 - view.getLeft()) >= view.getWidth() * 0.5f) {
                ArrayList arrayList2 = this.G;
                if (arrayList2 == null) {
                    this.G = new ArrayList();
                    this.H = new ArrayList();
                } else {
                    arrayList2.clear();
                    this.H.clear();
                }
                int iRound = Math.round(this.f5663s + this.f5661n);
                int iRound2 = Math.round(this.v + this.f5662r);
                int width = view.getWidth() + iRound;
                int height = view.getHeight() + iRound2;
                int i13 = (iRound + width) / 2;
                int i14 = (iRound2 + height) / 2;
                x0 layoutManager = this.D.getLayoutManager();
                int iR = layoutManager.r();
                int i15 = 0;
                while (i15 < iR) {
                    View viewQ = layoutManager.q(i15);
                    if (viewQ == view) {
                        i10 = i15;
                    } else {
                        i10 = i15;
                        if (viewQ.getBottom() >= iRound2 && viewQ.getTop() <= height && viewQ.getRight() >= iRound && viewQ.getLeft() <= width) {
                            o1 o1VarT = this.D.T(viewQ);
                            int iAbs5 = Math.abs(i13 - ((viewQ.getRight() + viewQ.getLeft()) / 2));
                            int iAbs6 = Math.abs(i14 - ((viewQ.getBottom() + viewQ.getTop()) / 2));
                            int i16 = (iAbs6 * iAbs6) + (iAbs5 * iAbs5);
                            int size = this.G.size();
                            int i17 = 0;
                            int i18 = 0;
                            while (i17 < size) {
                                int i19 = size;
                                if (i16 <= ((Integer) this.H.get(i17)).intValue()) {
                                    break;
                                }
                                i18++;
                                i17++;
                                size = i19;
                            }
                            this.G.add(i18, o1VarT);
                            this.H.add(i18, Integer.valueOf(i16));
                        }
                        i15 = i10 + 1;
                        view = view;
                        iRound = iRound;
                        i11 = i11;
                    }
                    i15 = i10 + 1;
                    view = view;
                    iRound = iRound;
                    i11 = i11;
                }
                View view2 = view;
                int i20 = i11;
                ArrayList arrayList3 = this.G;
                if (arrayList3.size() == 0) {
                    return;
                }
                int width2 = view2.getWidth() + i20;
                int height2 = view2.getHeight() + i12;
                int left2 = i20 - view2.getLeft();
                int top2 = i12 - view2.getTop();
                int size2 = arrayList3.size();
                o1 o1Var2 = null;
                int i21 = -1;
                int i22 = 0;
                while (i22 < size2) {
                    o1 o1Var3 = (o1) arrayList3.get(i22);
                    if (left2 <= 0 || (right = o1Var3.f5789a.getRight() - width2) >= 0) {
                        arrayList = arrayList3;
                    } else {
                        arrayList = arrayList3;
                        if (o1Var3.f5789a.getRight() > view2.getRight() && (iAbs4 = Math.abs(right)) > i21) {
                            i21 = iAbs4;
                            o1Var2 = o1Var3;
                        }
                    }
                    if (left2 < 0 && (left = o1Var3.f5789a.getLeft() - i20) > 0 && o1Var3.f5789a.getLeft() < view2.getLeft() && (iAbs3 = Math.abs(left)) > i21) {
                        i21 = iAbs3;
                        o1Var2 = o1Var3;
                    }
                    if (top2 < 0 && (top = o1Var3.f5789a.getTop() - i12) > 0 && o1Var3.f5789a.getTop() < view2.getTop() && (iAbs2 = Math.abs(top)) > i21) {
                        i21 = iAbs2;
                        o1Var2 = o1Var3;
                    }
                    if (top2 > 0 && (bottom = o1Var3.f5789a.getBottom() - height2) < 0 && o1Var3.f5789a.getBottom() > view2.getBottom() && (iAbs = Math.abs(bottom)) > i21) {
                        i21 = iAbs;
                        o1Var2 = o1Var3;
                    }
                    i22++;
                    arrayList3 = arrayList;
                }
                if (o1Var2 == null) {
                    this.G.clear();
                    this.H.clear();
                    return;
                }
                int iB = o1Var2.b();
                o1Var.b();
                if (c0Var.n(this.D, o1Var, o1Var2)) {
                    this.f5665x.o(this.D, o1Var, o1Var2, iB, i20, i12);
                }
            }
        }
    }

    public final void o(View view) {
        if (view == this.I) {
            this.I = null;
        }
    }

    public final void p(o1 o1Var, int i10) {
        c0 c0Var;
        boolean z10;
        boolean z11;
        char c10;
        int i11;
        int i12;
        float fSignum;
        Object[] objArr;
        if (o1Var == this.f5658c && i10 == this.f5666y) {
            return;
        }
        this.N = Long.MIN_VALUE;
        int i13 = this.f5666y;
        j(o1Var, true);
        this.f5666y = i10;
        if (i10 == 2) {
            if (o1Var == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.I = o1Var.f5789a;
        }
        int i14 = (1 << ((i10 * 8) + 8)) - 1;
        o1 o1Var2 = this.f5658c;
        c0 c0Var2 = this.f5665x;
        if (o1Var2 != null) {
            View view = o1Var2.f5789a;
            if (view.getParent() != null) {
                boolean zQ = q();
                if (i13 == 2) {
                    i12 = 0;
                    c10 = 0;
                } else {
                    if (this.f5666y == 2) {
                        i11 = 0;
                        c10 = 0;
                    } else {
                        int iE = c0Var2.e(this.D, o1Var2);
                        RecyclerView recyclerView = this.D;
                        WeakHashMap weakHashMap = r0.j0.f46605a;
                        int iB = (c0Var2.b(iE, recyclerView.getLayoutDirection()) & 65280) >> 8;
                        if (iB == 0) {
                            i11 = 0;
                            c10 = 0;
                        } else {
                            int i15 = (iE & 65280) >> 8;
                            c10 = 0;
                            if (Math.abs(this.f5661n) > Math.abs(this.f5662r)) {
                                i11 = f(o1Var2, iB);
                                if (i11 <= 0) {
                                    i11 = i(o1Var2, iB);
                                    if (i11 <= 0) {
                                        i11 = 0;
                                    }
                                } else if ((i15 & i11) == 0) {
                                    i11 = c0.c(i11, this.D.getLayoutDirection());
                                }
                            } else {
                                i11 = i(o1Var2, iB);
                                if (i11 <= 0) {
                                    i11 = f(o1Var2, iB);
                                    if (i11 <= 0) {
                                        i11 = 0;
                                    } else if ((i15 & i11) == 0) {
                                        i11 = c0.c(i11, this.D.getLayoutDirection());
                                    }
                                }
                            }
                        }
                    }
                    i12 = i11;
                }
                VelocityTracker velocityTracker = this.F;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.F = null;
                }
                int i16 = 4;
                float fSignum2 = 0.0f;
                if (zQ) {
                    objArr = null;
                    fSignum = 0.0f;
                } else if (i12 == 1 || i12 == 2) {
                    fSignum = Math.signum(this.f5662r) * this.D.getHeight();
                    objArr = null;
                } else {
                    if (i12 == 4 || i12 == 8 || i12 == 16 || i12 == 32) {
                        fSignum2 = Math.signum(this.f5661n) * this.D.getWidth();
                    }
                    objArr = null;
                    fSignum = 0.0f;
                }
                if (i13 == 2) {
                    i16 = 8;
                } else if (i12 > 0) {
                    i16 = 2;
                }
                float[] fArr = this.f5657b;
                l(fArr);
                int i17 = i16;
                float f10 = fArr[c10];
                float f11 = fArr[1];
                c0Var = c0Var2;
                z10 = false;
                a0 a0Var = new a0(this, o1Var2, i13, f10, f11, fSignum2, fSignum, i12, o1Var2);
                long jD = c0Var.d(this.D, i17, fSignum2 - f10, fSignum - f11);
                ValueAnimator valueAnimator = a0Var.h;
                valueAnimator.setDuration(jD);
                this.B.add(a0Var);
                o1Var2.q(false);
                valueAnimator.start();
                z11 = true;
            } else {
                c0Var = c0Var2;
                z10 = false;
                o(view);
                c0Var.a(this.D, o1Var2);
                z11 = false;
            }
            this.f5658c = null;
        } else {
            c0Var = c0Var2;
            z10 = false;
            z11 = false;
        }
        if (o1Var != null) {
            View view2 = o1Var.f5789a;
            RecyclerView recyclerView2 = this.D;
            int iE2 = c0Var.e(recyclerView2, o1Var);
            WeakHashMap weakHashMap2 = r0.j0.f46605a;
            this.A = (c0Var.b(iE2, recyclerView2.getLayoutDirection()) & i14) >> (this.f5666y * 8);
            this.f5663s = view2.getLeft();
            this.v = view2.getTop();
            this.f5658c = o1Var;
            if (i10 == 2) {
                try {
                    view2.performHapticFeedback(z10 ? 1 : 0, 2);
                } catch (Exception unused) {
                }
            }
        }
        ViewParent parent = this.D.getParent();
        if (parent != null) {
            if (this.f5658c != null) {
                z10 = true;
            }
            parent.requestDisallowInterceptTouchEvent(z10);
        }
        if (!z11) {
            this.D.getLayoutManager().f5856f = true;
        }
        c0Var.p(this.f5658c, this.f5666y);
        this.D.invalidate();
    }

    public boolean q() {
        return false;
    }

    public final void r(o1 o1Var) {
        RecyclerView recyclerView = this.D;
        c0 c0Var = this.f5665x;
        int iE = c0Var.e(recyclerView, o1Var);
        WeakHashMap weakHashMap = r0.j0.f46605a;
        if ((c0Var.b(iE, recyclerView.getLayoutDirection()) & 16711680) == 0) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
            return;
        }
        if (o1Var.f5789a.getParent() != this.D) {
            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
            return;
        }
        VelocityTracker velocityTracker = this.F;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.F = VelocityTracker.obtain();
        this.f5662r = 0.0f;
        this.f5661n = 0.0f;
        p(o1Var, 2);
    }

    public final void s(int i10, int i11, MotionEvent motionEvent) {
        float x8 = motionEvent.getX(i11);
        float y10 = motionEvent.getY(i11);
        float f10 = x8 - this.d;
        this.f5661n = f10;
        this.f5662r = y10 - this.f5659e;
        if ((i10 & 4) == 0) {
            this.f5661n = Math.max(0.0f, f10);
        }
        if ((i10 & 8) == 0) {
            this.f5661n = Math.min(0.0f, this.f5661n);
        }
        if ((i10 & 1) == 0) {
            this.f5662r = Math.max(0.0f, this.f5662r);
        }
        if ((i10 & 2) == 0) {
            this.f5662r = Math.min(0.0f, this.f5662r);
        }
    }
}
