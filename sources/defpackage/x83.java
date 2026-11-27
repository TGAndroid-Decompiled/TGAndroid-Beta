package defpackage;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
public final class x83 extends d79 {
    public static final int x3 = 0;
    public boolean f3;
    public int g3;
    public final x46 h3;
    public final v83 i3;
    public final ArrayList j3;
    public final ArrayList k3;
    public final float[] l3;
    public final int[] m3;
    public final ArrayList n3;
    public w83[] o3;
    public w83[] p3;
    public final boolean[] q3;
    public long r3;
    public long s3;
    public long t3;
    public boolean u3;
    public u83 v3;
    public final a93 w3;

    public x83(a93 a93Var, Activity activity) {
        super(activity, null);
        vy4 vy4Var;
        this.w3 = a93Var;
        this.f3 = false;
        this.g3 = 0;
        this.j3 = new ArrayList();
        this.k3 = new ArrayList();
        this.l3 = new float[7];
        this.m3 = new int[7];
        this.n3 = new ArrayList();
        this.q3 = new boolean[7];
        vy4Var = ((e) a93Var).glassEngine;
        vy4Var.b(this);
        setClipToPadding(false);
        setCaptureSectionsDecoratorAllowed(true);
        x46 x46Var = new x46();
        this.h3 = x46Var;
        setLayoutManager(x46Var);
        v83 v83Var = new v83(this, (byte) 0);
        this.i3 = v83Var;
        setAdapter(v83Var);
        s1();
        setOnItemClickListener(new u(this, (byte) 19));
        zb3 zb3Var = new zb3();
        zb3Var.n(220L);
        zb3Var.o(k43.h);
        zb3Var.C = false;
        zb3Var.m = false;
        setItemAnimator(zb3Var);
        eg0.g(this, a93Var.h, a93Var.n, hl.L(42.0f) + a.getCurrentActionBarHeight(), 0);
    }

    public final long A1(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.g3;
        a93 a93Var = this.w3;
        if (i6 == 1 || i6 == 2 || i6 == 3) {
            i2 = ((e) a93Var).currentAccount;
            return a2b.c(i2).d(this.g3 - 1, i);
        }
        i3 = ((e) a93Var).currentAccount;
        long d = a2b.c(i3).d(0, i);
        i4 = ((e) a93Var).currentAccount;
        i5 = ((e) a93Var).currentAccount;
        return a2b.c(i5).d(2, i) + a2b.c(i4).d(1, i) + d;
    }

    public final long B1() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.g3;
        a93 a93Var = this.w3;
        if (i5 == 1 || i5 == 2 || i5 == 3) {
            i = ((e) a93Var).currentAccount;
            return a2b.c(i).h[this.g3 - 1];
        }
        i2 = ((e) a93Var).currentAccount;
        long j = a2b.c(i2).h[0];
        i3 = ((e) a93Var).currentAccount;
        long j2 = a2b.c(i3).h[1];
        i4 = ((e) a93Var).currentAccount;
        long[] jArr = {j, j2, a2b.c(i4).h[2]};
        long j3 = Long.MAX_VALUE;
        for (int i6 = 0; i6 < 3; i6++) {
            long j4 = jArr[i6];
            if (j3 > j4) {
                j3 = j4;
            }
        }
        return j3;
    }

    public final long C1(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.g3;
        a93 a93Var = this.w3;
        if (i6 == 1 || i6 == 2 || i6 == 3) {
            i2 = ((e) a93Var).currentAccount;
            return a2b.c(i2).e(this.g3 - 1, i);
        }
        i3 = ((e) a93Var).currentAccount;
        long e = a2b.c(i3).e(0, i);
        i4 = ((e) a93Var).currentAccount;
        i5 = ((e) a93Var).currentAccount;
        return a2b.c(i5).e(2, i) + a2b.c(i4).e(1, i) + e;
    }

    public final void D1() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        this.r3 = A1(6) + C1(6);
        this.s3 = A1(6);
        this.t3 = C1(6);
        if (this.o3 == null) {
            this.o3 = new w83[7];
        }
        if (this.p3 == null) {
            this.p3 = new w83[7];
        }
        int i14 = 0;
        while (true) {
            int[] iArr = a93.y;
            int length = iArr.length;
            float[] fArr = this.l3;
            if (i14 < length) {
                int i15 = iArr[i14];
                long A1 = A1(i15) + C1(i15);
                w83[] w83VarArr = this.p3;
                w83[] w83VarArr2 = this.o3;
                long A12 = A1(iArr[i14]);
                long C1 = C1(iArr[i14]);
                int i16 = iArr[i14];
                int i17 = this.g3;
                a93 a93Var = this.w3;
                if (i17 != 1 && i17 != 2) {
                    i = 2;
                    if (i17 != 3) {
                        i11 = ((e) a93Var).currentAccount;
                        int i18 = a2b.c(i11).f[0][i16];
                        i12 = ((e) a93Var).currentAccount;
                        int i19 = a2b.c(i12).f[1][i16] + i18;
                        i13 = ((e) a93Var).currentAccount;
                        i3 = a2b.c(i13).f[2][i16] + i19;
                        i4 = iArr[i14];
                        i5 = this.g3;
                        if (i5 != 1 || i5 == i || i5 == 3) {
                            i6 = ((e) a93Var).currentAccount;
                            i7 = a2b.c(i6).e[this.g3 - 1][i4];
                        } else {
                            i8 = ((e) a93Var).currentAccount;
                            int i20 = a2b.c(i8).e[0][i4];
                            i9 = ((e) a93Var).currentAccount;
                            int i21 = a2b.c(i9).e[1][i4] + i20;
                            i10 = ((e) a93Var).currentAccount;
                            i7 = a2b.c(i10).e[2][i4] + i21;
                        }
                        ?? obj = new Object();
                        obj.d = i14;
                        obj.c = A1;
                        obj.b = true;
                        obj.e = A12;
                        obj.g = i3;
                        obj.f = C1;
                        obj.h = i7;
                        w83VarArr2[i14] = obj;
                        w83VarArr[i14] = obj;
                        fArr[i14] = ((float) A1) / ((float) this.r3);
                        i14++;
                    }
                } else {
                    i = 2;
                }
                i2 = ((e) a93Var).currentAccount;
                i3 = a2b.c(i2).f[this.g3 - 1][i16];
                i4 = iArr[i14];
                i5 = this.g3;
                if (i5 != 1) {
                }
                i6 = ((e) a93Var).currentAccount;
                i7 = a2b.c(i6).e[this.g3 - 1][i4];
                ?? obj2 = new Object();
                obj2.d = i14;
                obj2.c = A1;
                obj2.b = true;
                obj2.e = A12;
                obj2.g = i3;
                obj2.f = C1;
                obj2.h = i7;
                w83VarArr2[i14] = obj2;
                w83VarArr[i14] = obj2;
                fArr[i14] = ((float) A1) / ((float) this.r3);
                i14++;
            } else {
                Arrays.sort(this.o3, new f03((byte) 3));
                hl.a3(fArr, this.m3);
                Arrays.fill(this.q3, true);
                return;
            }
        }
    }

    public final void E1(boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x83.E1(boolean):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
    }
}
