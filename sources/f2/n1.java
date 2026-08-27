package f2;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

public final class n1 implements Runnable {

    public int f5778a;

    public int f5779b;

    public OverScroller f5780c;
    public Interpolator d;

    public boolean f5781e;

    public boolean f5782f;
    public final RecyclerView h;

    public n1(RecyclerView recyclerView) {
        this.h = recyclerView;
        b0 b0Var = RecyclerView.P0;
        this.d = b0Var;
        this.f5781e = false;
        this.f5782f = false;
        this.f5780c = new OverScroller(recyclerView.getContext(), b0Var);
    }

    public final void a() {
        if (this.f5781e) {
            this.f5782f = true;
            return;
        }
        RecyclerView recyclerView = this.h;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = r0.j0.f46605a;
        recyclerView.postOnAnimation(this);
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        int iRound;
        RecyclerView recyclerView = this.h;
        if (i12 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i10);
            int iAbs2 = Math.abs(i11);
            boolean z10 = iAbs > iAbs2;
            int iSqrt = (int) Math.sqrt(0);
            int iSqrt2 = (int) Math.sqrt((i11 * i11) + (i10 * i10));
            int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i13 = width / 2;
            float f10 = width;
            float f11 = i13;
            float fSin = (((float) Math.sin((Math.min(1.0f, (iSqrt2 * 1.0f) / f10) - 0.5f) * 0.47123894f)) * f11) + f11;
            if (iSqrt > 0) {
                iRound = Math.round(Math.abs(fSin / iSqrt) * 1000.0f) * 4;
            } else {
                if (!z10) {
                    iAbs = iAbs2;
                }
                iRound = (int) (((iAbs / f10) + 1.0f) * 300.0f);
            }
            i12 = Math.min(iRound, 2000);
        }
        int i14 = i12;
        if (interpolator == null) {
            interpolator = RecyclerView.P0;
        }
        if (this.d != interpolator) {
            this.d = interpolator;
            this.f5780c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f5779b = 0;
        this.f5778a = 0;
        recyclerView.setScrollState(2);
        this.f5780c.startScroll(0, 0, i10, i11, i14);
        if (Build.VERSION.SDK_INT < 23) {
            this.f5780c.computeScrollOffset();
        }
        a();
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        RecyclerView recyclerView = this.h;
        int[] iArr = recyclerView.E0;
        if (recyclerView.f1864x == null) {
            recyclerView.J0 = true;
            recyclerView.removeCallbacks(this);
            this.f5780c.abortAnimation();
            return;
        }
        this.f5782f = false;
        this.f5781e = true;
        recyclerView.p();
        OverScroller overScroller = this.f5780c;
        recyclerView.K0 = true;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i15 = currX - this.f5778a;
            int i16 = currY - this.f5779b;
            this.f5778a = currX;
            this.f5779b = currY;
            int[] iArr2 = recyclerView.E0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.v(i15, i16, 1, iArr2, null)) {
                i10 = i15 - iArr[0];
                i11 = i16 - iArr[1];
            } else {
                i10 = i15;
                i11 = i16;
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.o(i10, i11);
            }
            if (recyclerView.f1862w != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.t0(i10, i11, iArr);
                i12 = iArr[0];
                i13 = iArr[1];
                i10 -= i12;
                i11 -= i13;
                k1 k1Var = recyclerView.f1864x.f5855e;
                if (k1Var != null && !k1Var.d && k1Var.f5734e) {
                    int iB = recyclerView.f1853p0.b();
                    if (iB == 0) {
                        k1Var.h();
                    } else if (k1Var.f5731a >= iB) {
                        k1Var.f5731a = iB - 1;
                        k1Var.c(i12, i13);
                    } else {
                        k1Var.c(i12, i13);
                    }
                }
            } else {
                i12 = 0;
                i13 = 0;
            }
            if (!recyclerView.f1866y.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.E0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.w(i12, i13, i10, i11, null, 1, iArr3);
            int i17 = i10 - iArr[0];
            int i18 = i11 - iArr[1];
            if (i12 != 0 || i13 != 0) {
                recyclerView.x(i12, i13);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i17 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i18 != 0));
            k1 k1Var2 = recyclerView.f1864x.f5855e;
            if ((k1Var2 == null || !k1Var2.d) && z10) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i17 < 0) {
                        i14 = -currVelocity;
                    } else {
                        i14 = i17 > 0 ? currVelocity : 0;
                    }
                    if (i18 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i18 <= 0) {
                        currVelocity = 0;
                    }
                    if (i14 < 0) {
                        recyclerView.z();
                        if (recyclerView.R.isFinished()) {
                            recyclerView.R.onAbsorb(-i14);
                        }
                    } else if (i14 > 0) {
                        recyclerView.A();
                        if (recyclerView.T.isFinished()) {
                            recyclerView.T.onAbsorb(i14);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.B();
                        if (recyclerView.S.isFinished()) {
                            recyclerView.S.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.y();
                        if (recyclerView.U.isFinished()) {
                            recyclerView.U.onAbsorb(currVelocity);
                        }
                    }
                    if (i14 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = r0.j0.f46605a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.O0) {
                    androidx.datastore.preferences.protobuf.i iVar = recyclerView.f1852o0;
                    int[] iArr4 = (int[]) iVar.d;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    iVar.f1257c = 0;
                }
            } else {
                a();
                t tVar = recyclerView.f1851n0;
                if (tVar != null) {
                    tVar.a(recyclerView, i12, i13);
                }
            }
        }
        recyclerView.K0 = false;
        k1 k1Var3 = recyclerView.f1864x.f5855e;
        if (k1Var3 != null && k1Var3.d) {
            k1Var3.c(0, 0);
        }
        this.f5781e = false;
        if (!this.f5782f) {
            recyclerView.setScrollState(0);
            recyclerView.A0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = r0.j0.f46605a;
            recyclerView.postOnAnimation(this);
        }
    }
}
