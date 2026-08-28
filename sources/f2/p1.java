package f2;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;
public final class p1 implements Runnable {
    public int f5490a;
    public int f5491b;
    public OverScroller f5492c;
    public Interpolator d;
    public boolean f5493e;
    public boolean f5494f;
    public final RecyclerView h;

    public p1(RecyclerView recyclerView) {
        this.h = recyclerView;
        c0 c0Var = RecyclerView.P0;
        this.d = c0Var;
        this.f5493e = false;
        this.f5494f = false;
        this.f5492c = new OverScroller(recyclerView.getContext(), c0Var);
    }

    public final void a() {
        if (this.f5493e) {
            this.f5494f = true;
            return;
        }
        RecyclerView recyclerView = this.h;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = r0.j0.f46915a;
        recyclerView.postOnAnimation(this);
    }

    public final void b(int i9, int i10, int i11, Interpolator interpolator) {
        boolean z10;
        int height;
        int i12;
        RecyclerView recyclerView = this.h;
        if (i11 == Integer.MIN_VALUE) {
            int abs = Math.abs(i9);
            int abs2 = Math.abs(i10);
            if (abs > abs2) {
                z10 = true;
            } else {
                z10 = false;
            }
            int sqrt = (int) Math.sqrt(0);
            int sqrt2 = (int) Math.sqrt((i10 * i10) + (i9 * i9));
            if (z10) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
            }
            int i13 = height / 2;
            float f10 = height;
            float f11 = i13;
            float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f10) - 0.5f) * 0.47123894f)) * f11) + f11;
            if (sqrt > 0) {
                i12 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
            } else {
                if (!z10) {
                    abs = abs2;
                }
                i12 = (int) (((abs / f10) + 1.0f) * 300.0f);
            }
            i11 = Math.min(i12, 2000);
        }
        int i14 = i11;
        if (interpolator == null) {
            interpolator = RecyclerView.P0;
        }
        if (this.d != interpolator) {
            this.d = interpolator;
            this.f5492c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f5491b = 0;
        this.f5490a = 0;
        recyclerView.setScrollState(2);
        this.f5492c.startScroll(0, 0, i9, i10, i14);
        if (Build.VERSION.SDK_INT < 23) {
            this.f5492c.computeScrollOffset();
        }
        a();
    }

    @Override
    public final void run() {
        int i9;
        int i10;
        int i11;
        int i12;
        boolean awakenScrollBars;
        boolean z10;
        boolean z11;
        boolean z12;
        int i13;
        RecyclerView recyclerView = this.h;
        int[] iArr = recyclerView.E0;
        if (recyclerView.f1368x == null) {
            recyclerView.J0 = true;
            recyclerView.removeCallbacks(this);
            this.f5492c.abortAnimation();
            return;
        }
        this.f5494f = false;
        this.f5493e = true;
        recyclerView.p();
        OverScroller overScroller = this.f5492c;
        recyclerView.K0 = true;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i14 = currX - this.f5490a;
            int i15 = currY - this.f5491b;
            this.f5490a = currX;
            this.f5491b = currY;
            int[] iArr2 = recyclerView.E0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.v(i14, i15, 1, iArr2, null)) {
                i9 = i14 - iArr[0];
                i10 = i15 - iArr[1];
            } else {
                i9 = i14;
                i10 = i15;
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.o(i9, i10);
            }
            if (recyclerView.f1366w != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.t0(i9, i10, iArr);
                i11 = iArr[0];
                i12 = iArr[1];
                i9 -= i11;
                i10 -= i12;
                m1 m1Var = recyclerView.f1368x.f5565e;
                if (m1Var != null && !m1Var.d && m1Var.f5446e) {
                    int b10 = recyclerView.f1357p0.b();
                    if (b10 == 0) {
                        m1Var.h();
                    } else if (m1Var.f5443a >= b10) {
                        m1Var.f5443a = b10 - 1;
                        m1Var.c(i11, i12);
                    } else {
                        m1Var.c(i11, i12);
                    }
                }
            } else {
                i11 = 0;
                i12 = 0;
            }
            if (!recyclerView.f1370y.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.E0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.w(i11, i12, i9, i10, null, 1, iArr3);
            int i16 = i9 - iArr[0];
            int i17 = i10 - iArr[1];
            if (i11 != 0 || i12 != 0) {
                recyclerView.x(i11, i12);
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
            if (!overScroller.isFinished() && ((!z10 && i16 == 0) || (!z11 && i17 == 0))) {
                z12 = false;
            } else {
                z12 = true;
            }
            m1 m1Var2 = recyclerView.f1368x.f5565e;
            if ((m1Var2 == null || !m1Var2.d) && z12) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i16 < 0) {
                        i13 = -currVelocity;
                    } else if (i16 > 0) {
                        i13 = currVelocity;
                    } else {
                        i13 = 0;
                    }
                    if (i17 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i17 <= 0) {
                        currVelocity = 0;
                    }
                    if (i13 < 0) {
                        recyclerView.z();
                        if (recyclerView.R.isFinished()) {
                            recyclerView.R.onAbsorb(-i13);
                        }
                    } else if (i13 > 0) {
                        recyclerView.A();
                        if (recyclerView.T.isFinished()) {
                            recyclerView.T.onAbsorb(i13);
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
                    if (i13 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = r0.j0.f46915a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.O0) {
                    androidx.datastore.preferences.protobuf.i iVar = recyclerView.f1356o0;
                    int[] iArr4 = (int[]) iVar.d;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    iVar.f760c = 0;
                }
            } else {
                a();
                u uVar = recyclerView.f1355n0;
                if (uVar != null) {
                    uVar.a(recyclerView, i11, i12);
                }
            }
        }
        recyclerView.K0 = false;
        m1 m1Var3 = recyclerView.f1368x.f5565e;
        if (m1Var3 != null && m1Var3.d) {
            m1Var3.c(0, 0);
        }
        this.f5493e = false;
        if (this.f5494f) {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = r0.j0.f46915a;
            recyclerView.postOnAnimation(this);
            return;
        }
        recyclerView.setScrollState(0);
        recyclerView.A0(1);
    }
}
