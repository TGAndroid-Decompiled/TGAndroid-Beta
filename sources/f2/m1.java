package f2;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;
public final class m1 implements Runnable {
    public int f6421a;
    public int f6422b;
    public OverScroller f6423c;
    public Interpolator d;
    public boolean f6424e;
    public boolean f6425f;
    public final RecyclerView h;

    public m1(RecyclerView recyclerView) {
        this.h = recyclerView;
        a0 a0Var = RecyclerView.P0;
        this.d = a0Var;
        this.f6424e = false;
        this.f6425f = false;
        this.f6423c = new OverScroller(recyclerView.getContext(), a0Var);
    }

    public final void a() {
        if (this.f6424e) {
            this.f6425f = true;
            return;
        }
        RecyclerView recyclerView = this.h;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = r0.j0.f46829a;
        recyclerView.postOnAnimation(this);
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        boolean z10;
        int height;
        int i13;
        RecyclerView recyclerView = this.h;
        if (i12 == Integer.MIN_VALUE) {
            int abs = Math.abs(i10);
            int abs2 = Math.abs(i11);
            if (abs > abs2) {
                z10 = true;
            } else {
                z10 = false;
            }
            int sqrt = (int) Math.sqrt(0);
            int sqrt2 = (int) Math.sqrt((i11 * i11) + (i10 * i10));
            if (z10) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
            }
            int i14 = height / 2;
            float f9 = height;
            float f10 = i14;
            float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f9) - 0.5f) * 0.47123894f)) * f10) + f10;
            if (sqrt > 0) {
                i13 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
            } else {
                if (!z10) {
                    abs = abs2;
                }
                i13 = (int) (((abs / f9) + 1.0f) * 300.0f);
            }
            i12 = Math.min(i13, 2000);
        }
        int i15 = i12;
        if (interpolator == null) {
            interpolator = RecyclerView.P0;
        }
        if (this.d != interpolator) {
            this.d = interpolator;
            this.f6423c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f6422b = 0;
        this.f6421a = 0;
        recyclerView.setScrollState(2);
        this.f6423c.startScroll(0, 0, i10, i11, i15);
        if (Build.VERSION.SDK_INT < 23) {
            this.f6423c.computeScrollOffset();
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
        boolean z10;
        boolean z11;
        boolean z12;
        int i14;
        RecyclerView recyclerView = this.h;
        int[] iArr = recyclerView.E0;
        if (recyclerView.f1858x == null) {
            recyclerView.J0 = true;
            recyclerView.removeCallbacks(this);
            this.f6423c.abortAnimation();
            return;
        }
        this.f6425f = false;
        this.f6424e = true;
        recyclerView.p();
        OverScroller overScroller = this.f6423c;
        recyclerView.K0 = true;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i15 = currX - this.f6421a;
            int i16 = currY - this.f6422b;
            this.f6421a = currX;
            this.f6422b = currY;
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
            if (recyclerView.f1856w != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.t0(i10, i11, iArr);
                i12 = iArr[0];
                i13 = iArr[1];
                i10 -= i12;
                i11 -= i13;
                j1 j1Var = recyclerView.f1858x.f6499e;
                if (j1Var != null && !j1Var.d && j1Var.f6376e) {
                    int b10 = recyclerView.f1847p0.b();
                    if (b10 == 0) {
                        j1Var.h();
                    } else if (j1Var.f6373a >= b10) {
                        j1Var.f6373a = b10 - 1;
                        j1Var.c(i12, i13);
                    } else {
                        j1Var.c(i12, i13);
                    }
                }
            } else {
                i12 = 0;
                i13 = 0;
            }
            if (!recyclerView.f1860y.isEmpty()) {
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
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            if (overScroller.getCurrX() == overScroller.getFinalX()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (overScroller.getCurrY() == overScroller.getFinalY()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!overScroller.isFinished() && ((!z10 && i17 == 0) || (!z11 && i18 == 0))) {
                z12 = false;
            } else {
                z12 = true;
            }
            j1 j1Var2 = recyclerView.f1858x.f6499e;
            if ((j1Var2 == null || !j1Var2.d) && z12) {
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
                        WeakHashMap weakHashMap = r0.j0.f46829a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.O0) {
                    androidx.datastore.preferences.protobuf.i iVar = recyclerView.f1846o0;
                    int[] iArr4 = (int[]) iVar.d;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    iVar.f1254c = 0;
                }
            } else {
                a();
                s sVar = recyclerView.f1845n0;
                if (sVar != null) {
                    sVar.a(recyclerView, i12, i13);
                }
            }
        }
        recyclerView.K0 = false;
        j1 j1Var3 = recyclerView.f1858x.f6499e;
        if (j1Var3 != null && j1Var3.d) {
            j1Var3.c(0, 0);
        }
        this.f6424e = false;
        if (this.f6425f) {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = r0.j0.f46829a;
            recyclerView.postOnAnimation(this);
            return;
        }
        recyclerView.setScrollState(0);
        recyclerView.A0(1);
    }
}
