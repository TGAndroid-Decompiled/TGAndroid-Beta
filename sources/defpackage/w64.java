package defpackage;

import android.util.SparseIntArray;
public class w64 extends r35 {
    public final boolean Q;
    public final SparseIntArray R;
    public final SparseIntArray S;
    public int T;
    public int U;
    public int V;
    public int W;

    public w64(int i, boolean z) {
        super(i);
        this.R = new SparseIntArray();
        this.S = new SparseIntArray();
        this.Q = z;
    }

    public static via A1(via viaVar) {
        if (viaVar == null) {
            return null;
        }
        float f = viaVar.a;
        float f2 = 100.0f;
        if (f == 0.0f) {
            viaVar.a = 100.0f;
            f = 100.0f;
        }
        float f3 = viaVar.b;
        if (f3 == 0.0f) {
            viaVar.b = 100.0f;
        } else {
            f2 = f3;
        }
        float f4 = f / f2;
        if (f4 <= 4.0f && f4 >= 0.2f) {
            return viaVar;
        }
        float max = Math.max(f, f2);
        viaVar.a = max;
        viaVar.b = max;
        return viaVar;
    }

    public via B1(int i) {
        return new via(100.0f, 100.0f);
    }

    public final boolean C1(int i) {
        z1();
        if (this.S.get(i, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return true;
        }
        return false;
    }

    @Override
    public final int H(wg2 wg2Var, p49 p49Var) {
        return p49Var.b();
    }

    @Override
    public final int u(wg2 wg2Var, p49 p49Var) {
        return 1;
    }

    @Override
    public final boolean x0() {
        return false;
    }

    public final void z1() {
        via viaVar;
        int i;
        int min;
        boolean z;
        boolean z2;
        float f;
        SparseIntArray sparseIntArray = this.R;
        if (sparseIntArray.size() != z() || this.W != this.m || this.T != this.J) {
            int i2 = this.m;
            this.W = i2;
            float f2 = i2;
            if (f2 == 0.0f) {
                f2 = 100.0f;
            }
            sparseIntArray.clear();
            SparseIntArray sparseIntArray2 = this.S;
            sparseIntArray2.clear();
            boolean z3 = false;
            this.V = 0;
            this.U = 0;
            int z4 = z();
            this.T = z4;
            if (z4 == 0) {
                return;
            }
            int L = gl.L(100.0f);
            int i3 = this.J;
            boolean z5 = this.Q;
            int i4 = z4 + (z5 ? 1 : 0);
            int i5 = 0;
            int i6 = 0;
            int i7 = i3;
            while (i5 < i4) {
                if (i5 < z4) {
                    viaVar = A1(B1(i5));
                } else {
                    viaVar = null;
                }
                if (viaVar == null) {
                    if (i6 != 0) {
                        z2 = true;
                    } else {
                        z2 = z3;
                    }
                    i = L;
                    min = i3;
                } else {
                    i = L;
                    min = Math.min(i3, (int) Math.floor((((viaVar.a / viaVar.b) * L) / f2) * i3));
                    if (i7 >= min && (min <= 33 || i7 >= min - 15)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (viaVar.c) {
                        sparseIntArray.put(i5, i7);
                        this.V++;
                        f = f2;
                        i7 = i3;
                        i6 = 0;
                        i5++;
                        L = i;
                        f2 = f;
                        z3 = false;
                    } else {
                        z2 = z;
                    }
                }
                if (z2) {
                    if (i7 != 0 && i6 != 0) {
                        int i8 = i7 / i6;
                        int i9 = i5 - i6;
                        f = f2;
                        int i10 = i9;
                        while (true) {
                            int i11 = i9 + i6;
                            if (i10 >= i11) {
                                break;
                            }
                            if (i10 == i11 - 1) {
                                sparseIntArray.put(i10, sparseIntArray.get(i10) + i7);
                            } else {
                                sparseIntArray.put(i10, sparseIntArray.get(i10) + i8);
                            }
                            i7 -= i8;
                            i10++;
                        }
                        sparseIntArray2.put(i5 - 1, this.V);
                    } else {
                        f = f2;
                    }
                    if (i5 == z4) {
                        break;
                    }
                    this.V++;
                    i7 = i3;
                    i6 = 0;
                } else {
                    f = f2;
                    if (i7 < min) {
                        min = i7;
                    }
                }
                if (this.V == 0) {
                    this.U = Math.max(this.U, i5);
                }
                if (i5 == z4 - 1 && !z5) {
                    sparseIntArray2.put(i5, this.V);
                }
                i6++;
                i7 -= min;
                sparseIntArray.put(i5, min);
                i5++;
                L = i;
                f2 = f;
                z3 = false;
            }
            this.V++;
        }
    }
}
