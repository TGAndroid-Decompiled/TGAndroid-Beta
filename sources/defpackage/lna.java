package defpackage;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.RLottieNative;
public final class lna extends a29 {
    public int c1;
    public int d1;
    public int e1;
    public Bitmap f1;
    public final RLottieNative[] g1;
    public final int[] h1;
    public final int[] i1;
    public final RLottieNative[] j1;
    public final int[] k1;
    public final int[] l1;
    public boolean m1;

    public lna(String str, int i, int i2) {
        super(str, i, i2);
        this.g1 = new RLottieNative[5];
        this.h1 = new int[5];
        this.i1 = new int[5];
        this.j1 = new RLottieNative[3];
        this.k1 = new int[3];
        this.l1 = new int[3];
    }

    public static int S(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return 4;
        }
        return 3;
    }

    public final void R(boolean z) {
        int i = 0;
        int i2 = 0;
        while (true) {
            RLottieNative[] rLottieNativeArr = this.g1;
            if (i2 >= rLottieNativeArr.length) {
                break;
            }
            RLottieNative rLottieNative = rLottieNativeArr[i2];
            if (rLottieNative != null) {
                if (z && rLottieNative == this.n0) {
                    this.n0 = null;
                }
                this.g1[i2].d();
                this.g1[i2] = null;
            }
            i2++;
        }
        while (true) {
            RLottieNative[] rLottieNativeArr2 = this.j1;
            if (i < rLottieNativeArr2.length) {
                RLottieNative rLottieNative2 = rLottieNativeArr2[i];
                if (rLottieNative2 != null) {
                    if (z && rLottieNative2 == this.V0) {
                        this.V0 = null;
                    }
                    this.j1[i].d();
                    this.j1[i] = null;
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final int e() {
        if (this.m0) {
            return 3;
        }
        if (this.n0 == null || (this.K == 2 && this.V0 == null)) {
            return 2;
        }
        return 1;
    }

    @Override
    public final void k() {
        if (this.W) {
            i();
            if (this.Q == null) {
                R(false);
            }
        }
        if (this.n0 == null && this.V0 == null) {
            z();
            return;
        }
        this.U = true;
        if (!q()) {
            stop();
        }
        D();
    }

    @Override
    public final int w(Bitmap bitmap, boolean z) {
        Runnable runnable;
        boolean z2;
        if (this.f1 == null) {
            try {
                this.f1 = Bitmap.createBitmap(this.b, this.c, Bitmap.Config.ARGB_8888);
            } catch (Throwable th) {
                cc4.g(th, true);
                return 2;
            }
        }
        int i = -1;
        if (this.K == 1) {
            int i2 = 0;
            while (true) {
                RLottieNative[] rLottieNativeArr = this.g1;
                if (i2 >= rLottieNativeArr.length) {
                    break;
                }
                RLottieNative rLottieNative = rLottieNativeArr[i2];
                int i3 = this.i1[i2];
                Bitmap bitmap2 = this.f1;
                if (i2 == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                i = rLottieNative.c(i3, bitmap2, z2);
                if (i2 != 0) {
                    int[] iArr = this.i1;
                    int i4 = iArr[i2] + 1;
                    if (i4 < this.h1[i2]) {
                        iArr[i2] = i4;
                    } else if (i2 != 4) {
                        iArr[i2] = 0;
                        this.O = false;
                        if (this.V0 != null) {
                            this.K = (byte) 2;
                        }
                    }
                }
                i2++;
            }
        } else {
            if (this.Y0) {
                int i5 = 0;
                while (true) {
                    int[] iArr2 = this.l1;
                    if (i5 >= iArr2.length) {
                        break;
                    }
                    iArr2[i5] = this.k1[i5] - 1;
                    i5++;
                }
            }
            if (this.m1) {
                int[] iArr3 = this.i1;
                int i6 = iArr3[0] + 1;
                if (i6 < this.h1[0]) {
                    iArr3[0] = i6;
                } else {
                    iArr3[0] = -1;
                }
            }
            this.g1[0].c(Math.max(this.i1[0], 0), this.f1, true);
            int i7 = 0;
            while (true) {
                RLottieNative[] rLottieNativeArr2 = this.j1;
                if (i7 >= rLottieNativeArr2.length) {
                    break;
                }
                RLottieNative rLottieNative2 = rLottieNativeArr2[i7];
                int i8 = this.l1[i7];
                if (i8 < 0) {
                    i8 = this.k1[i7] - 1;
                }
                rLottieNative2.c(i8, this.f1, false);
                if (!this.O) {
                    int[] iArr4 = this.l1;
                    int i9 = iArr4[i7] + 1;
                    if (i9 < this.k1[i7]) {
                        iArr4[i7] = i9;
                    } else {
                        iArr4[i7] = -1;
                    }
                }
                i7++;
            }
            int c = this.g1[4].c(this.i1[4], this.f1, false);
            int[] iArr5 = this.i1;
            int i10 = iArr5[4] + 1;
            if (i10 < this.h1[4]) {
                iArr5[4] = i10;
            }
            int[] iArr6 = this.l1;
            if (iArr6[0] == -1 && iArr6[1] == -1 && iArr6[2] == -1) {
                this.O = true;
                this.N++;
            }
            int i11 = this.c1;
            int i12 = this.e1;
            if (i11 == i12 && i12 == this.d1) {
                if (this.l1[0] == this.k1[0] - 100) {
                    this.m1 = true;
                    if (i11 == 5) {
                        WeakReference weakReference = this.I;
                        if (weakReference == null) {
                            runnable = null;
                        } else {
                            runnable = (Runnable) weakReference.get();
                        }
                        if (runnable != null) {
                            hl.c3(runnable);
                        }
                    }
                }
            } else {
                this.i1[0] = -1;
            }
            i = c;
        }
        if (i < 0) {
            return 2;
        }
        Utilities.copyBitmaps(this.f1, bitmap);
        return 1;
    }

    @Override
    public final void x(boolean z) {
        this.l0 = false;
        this.m0 = true;
        i();
        g();
        if (!this.Z0 && !this.W0) {
            if (this.Q == null) {
                R(true);
                z();
                return;
            }
            this.W = true;
            return;
        }
        this.X0 = true;
    }

    @Override
    public final void d() {
    }
}
