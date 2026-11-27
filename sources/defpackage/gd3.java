package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Map;
public final class gd3 extends c2c {
    public static final gd3 F0 = new gd3(new fd3());
    public static final String G0;
    public static final String H0;
    public static final String I0;
    public static final String J0;
    public static final String K0;
    public static final String L0;
    public static final String M0;
    public static final String N0;
    public static final String O0;
    public static final String P0;
    public static final String Q0;
    public static final String R0;
    public static final String S0;
    public static final String T0;
    public static final String U0;
    public static final String V0;
    public static final String W0;
    public static final String X0;
    public static final String Y0;
    public final boolean A0;
    public final boolean B0;
    public final boolean C0;
    public final SparseArray D0;
    public final SparseBooleanArray E0;
    public final boolean w0;
    public final boolean x0;
    public final boolean y0;
    public final boolean z0;

    static {
        String str = gcc.a;
        G0 = "rs";
        H0 = "rt";
        I0 = "ru";
        J0 = "rv";
        K0 = "rw";
        L0 = "rx";
        M0 = "ry";
        N0 = "rz";
        O0 = "s0";
        P0 = "s1";
        Q0 = "s2";
        R0 = "s3";
        S0 = "s4";
        T0 = "s5";
        U0 = "s6";
        V0 = "s7";
        W0 = "s8";
        X0 = "s9";
        Y0 = "sa";
    }

    public gd3(fd3 fd3Var) {
        super(fd3Var);
        this.w0 = fd3Var.J;
        this.x0 = fd3Var.K;
        this.y0 = fd3Var.L;
        this.z0 = fd3Var.M;
        this.A0 = fd3Var.N;
        this.B0 = fd3Var.O;
        this.C0 = fd3Var.P;
        this.D0 = fd3Var.Q;
        this.E0 = fd3Var.R;
    }

    @Override
    public final b2c a() {
        return new fd3(this);
    }

    @Override
    public final Bundle c() {
        Bundle c = super.c();
        c.putBoolean(G0, this.w0);
        c.putBoolean(H0, false);
        c.putBoolean(I0, this.x0);
        c.putBoolean(U0, false);
        c.putBoolean(J0, this.y0);
        c.putBoolean(K0, false);
        c.putBoolean(L0, false);
        c.putBoolean(M0, false);
        c.putBoolean(V0, false);
        c.putBoolean(Y0, this.z0);
        c.putBoolean(W0, this.A0);
        c.putBoolean(N0, this.B0);
        c.putBoolean(O0, false);
        c.putBoolean(P0, this.C0);
        c.putBoolean(X0, false);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray sparseArray2 = this.D0;
            if (i < sparseArray2.size()) {
                int keyAt = sparseArray2.keyAt(i);
                for (Map.Entry entry : ((Map) sparseArray2.valueAt(i)).entrySet()) {
                    if (entry.getValue() == null) {
                        arrayList2.add((u1c) entry.getKey());
                        arrayList.add(Integer.valueOf(keyAt));
                    } else {
                        grb.o();
                        return null;
                    }
                }
                c.putIntArray(Q0, ype.e(arrayList));
                c.putParcelableArrayList(R0, e31.c(arrayList2, new p31((byte) 5)));
                SparseArray<? extends Parcelable> sparseArray3 = new SparseArray<>(sparseArray.size());
                if (sparseArray.size() <= 0) {
                    c.putSparseParcelableArray(S0, sparseArray3);
                    i++;
                } else {
                    sparseArray.keyAt(0);
                    bs2.u(sparseArray.valueAt(0));
                    throw null;
                }
            } else {
                SparseBooleanArray sparseBooleanArray = this.E0;
                int[] iArr = new int[sparseBooleanArray.size()];
                for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
                    iArr[i2] = sparseBooleanArray.keyAt(i2);
                }
                c.putIntArray(T0, iArr);
                return c;
            }
        }
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && gd3.class == obj.getClass()) {
                gd3 gd3Var = (gd3) obj;
                if (super.equals(gd3Var) && this.w0 == gd3Var.w0 && this.x0 == gd3Var.x0 && this.y0 == gd3Var.y0 && this.z0 == gd3Var.z0 && this.A0 == gd3Var.A0 && this.B0 == gd3Var.B0 && this.C0 == gd3Var.C0) {
                    SparseBooleanArray sparseBooleanArray = gd3Var.E0;
                    SparseBooleanArray sparseBooleanArray2 = this.E0;
                    int size = sparseBooleanArray2.size();
                    if (sparseBooleanArray.size() == size) {
                        int i = 0;
                        while (true) {
                            if (i < size) {
                                if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i)) < 0) {
                                    break;
                                }
                                i++;
                            } else {
                                SparseArray sparseArray = gd3Var.D0;
                                SparseArray sparseArray2 = this.D0;
                                int size2 = sparseArray2.size();
                                if (sparseArray.size() == size2) {
                                    for (int i2 = 0; i2 < size2; i2++) {
                                        int indexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i2));
                                        if (indexOfKey >= 0) {
                                            Map map = (Map) sparseArray2.valueAt(i2);
                                            Map map2 = (Map) sparseArray.valueAt(indexOfKey);
                                            if (map2.size() == map.size()) {
                                                for (Map.Entry entry : map.entrySet()) {
                                                    u1c u1cVar = (u1c) entry.getKey();
                                                    if (map2.containsKey(u1cVar)) {
                                                        if (!Objects.equals(entry.getValue(), map2.get(u1cVar))) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.w0 ? 1 : 0)) * 961) + (this.x0 ? 1 : 0)) * 961) + (this.y0 ? 1 : 0)) * 28629151) + (this.z0 ? 1 : 0)) * 31) + (this.A0 ? 1 : 0)) * 31) + (this.B0 ? 1 : 0)) * 961) + (this.C0 ? 1 : 0)) * 31;
    }
}
