package f2;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;
public final class k1 implements Runnable {
    public int f5769a;
    public int f5770b;
    public OverScroller f5771c;
    public Interpolator d;
    public boolean e;
    public boolean f5772f;
    public final RecyclerView h;

    public k1(RecyclerView recyclerView) {
        this.h = recyclerView;
        a0 a0Var = RecyclerView.Q0;
        this.d = a0Var;
        this.e = false;
        this.f5772f = false;
        this.f5771c = new OverScroller(recyclerView.getContext(), a0Var);
    }

    public final void a() {
        if (this.e) {
            this.f5772f = true;
            return;
        }
        RecyclerView recyclerView = this.h;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = r0.j0.f43118a;
        recyclerView.postOnAnimation(this);
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        boolean z4;
        int height;
        int i13;
        RecyclerView recyclerView = this.h;
        if (i12 == Integer.MIN_VALUE) {
            int abs = Math.abs(i10);
            int abs2 = Math.abs(i11);
            if (abs > abs2) {
                z4 = true;
            } else {
                z4 = false;
            }
            int sqrt = (int) Math.sqrt(0);
            int sqrt2 = (int) Math.sqrt((i11 * i11) + (i10 * i10));
            if (z4) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
            }
            int i14 = height / 2;
            float f10 = height;
            float f11 = i14;
            float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f10) - 0.5f) * 0.47123894f)) * f11) + f11;
            if (sqrt > 0) {
                i13 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
            } else {
                if (!z4) {
                    abs = abs2;
                }
                i13 = (int) (((abs / f10) + 1.0f) * 300.0f);
            }
            i12 = Math.min(i13, 2000);
        }
        int i15 = i12;
        if (interpolator == null) {
            interpolator = RecyclerView.Q0;
        }
        if (this.d != interpolator) {
            this.d = interpolator;
            this.f5771c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f5770b = 0;
        this.f5769a = 0;
        recyclerView.setScrollState(2);
        this.f5771c.startScroll(0, 0, i10, i11, i15);
        if (Build.VERSION.SDK_INT < 23) {
            this.f5771c.computeScrollOffset();
        }
        a();
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean awakenScrollBars;
        boolean z4;
        boolean z10;
        boolean z11;
        int i14;
        RecyclerView recyclerView = this.h;
        int[] iArr = recyclerView.F0;
        if (recyclerView.f1250x == null) {
            recyclerView.K0 = true;
            recyclerView.removeCallbacks(this);
            this.f5771c.abortAnimation();
            return;
        }
        this.f5772f = false;
        this.e = true;
        recyclerView.p();
        OverScroller overScroller = this.f5771c;
        recyclerView.L0 = true;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i15 = currX - this.f5769a;
            int i16 = currY - this.f5770b;
            this.f5769a = currX;
            this.f5770b = currY;
            int[] iArr2 = recyclerView.F0;
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
            if (recyclerView.f1248w != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.t0(i10, i11, iArr);
                i12 = iArr[0];
                i13 = iArr[1];
                i10 -= i12;
                i11 -= i13;
                h1 h1Var = recyclerView.f1250x.e;
                if (h1Var != null && !h1Var.d && h1Var.e) {
                    int b10 = recyclerView.f1240q0.b();
                    if (b10 == 0) {
                        h1Var.h();
                    } else if (h1Var.f5723a >= b10) {
                        h1Var.f5723a = b10 - 1;
                        h1Var.c(i12, i13);
                    } else {
                        h1Var.c(i12, i13);
                    }
                }
            } else {
                i12 = 0;
                i13 = 0;
            }
            if (!recyclerView.f1252y.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.F0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.w(i12, i13, i10, i11, null, 1, iArr3);
            int i17 = i10 - iArr[0];
            int i18 = i11 - iArr[1];
            if (i12 != 0 || i13 != 0) {
                recyclerView.x(i12, i13);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            if (overScroller.getCurrX() == overScroller.getFinalX()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (overScroller.getCurrY() == overScroller.getFinalY()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!overScroller.isFinished() && ((!z4 && i17 == 0) || (!z10 && i18 == 0))) {
                z11 = false;
            } else {
                z11 = true;
            }
            h1 h1Var2 = recyclerView.f1250x.e;
            if ((h1Var2 == null || !h1Var2.d) && z11) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i17 < 0) {
                        i14 = -currVelocity;
                    } else if (i17 > 0) {
                        i14 = currVelocity;
                    } else {
                        i14 = 0;
                    }
                    if (i18 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i18 <= 0) {
                        currVelocity = 0;
                    }
                    if (i14 < 0) {
                        recyclerView.z();
                        if (recyclerView.S.isFinished()) {
                            recyclerView.S.onAbsorb(-i14);
                        }
                    } else if (i14 > 0) {
                        recyclerView.A();
                        if (recyclerView.U.isFinished()) {
                            recyclerView.U.onAbsorb(i14);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.B();
                        if (recyclerView.T.isFinished()) {
                            recyclerView.T.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.y();
                        if (recyclerView.V.isFinished()) {
                            recyclerView.V.onAbsorb(currVelocity);
                        }
                    }
                    if (i14 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = r0.j0.f43118a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.P0) {
                    androidx.datastore.preferences.protobuf.i iVar = recyclerView.f1239p0;
                    int[] iArr4 = (int[]) iVar.d;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    iVar.f673c = 0;
                }
            } else {
                a();
                s sVar = recyclerView.f1238o0;
                if (sVar != null) {
                    sVar.a(recyclerView, i12, i13);
                }
            }
        }
        recyclerView.L0 = false;
        h1 h1Var3 = recyclerView.f1250x.e;
        if (h1Var3 != null && h1Var3.d) {
            h1Var3.c(0, 0);
        }
        this.e = false;
        if (this.f5772f) {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = r0.j0.f43118a;
            recyclerView.postOnAnimation(this);
            return;
        }
        recyclerView.setScrollState(0);
        recyclerView.A0(1);
    }
}
