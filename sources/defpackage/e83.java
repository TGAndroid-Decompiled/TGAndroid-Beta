package defpackage;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class e83 extends o39 {
    public static final int x3 = 0;
    public boolean f3;
    public int g3;
    public final t26 h3;
    public final c83 i3;
    public final ArrayList j3;
    public final ArrayList k3;
    public final float[] l3;
    public final int[] m3;
    public final ArrayList n3;
    public d83[] o3;
    public d83[] p3;
    public final boolean[] q3;
    public long r3;
    public long s3;
    public long t3;
    public boolean u3;
    public b83 v3;
    public final h83 w3;

    public e83(h83 h83Var, Activity activity) {
        super(activity, null);
        qw4 qw4Var;
        this.w3 = h83Var;
        this.f3 = false;
        this.g3 = 0;
        this.j3 = new ArrayList();
        this.k3 = new ArrayList();
        this.l3 = new float[7];
        this.m3 = new int[7];
        this.n3 = new ArrayList();
        this.q3 = new boolean[7];
        qw4Var = ((d) h83Var).glassEngine;
        qw4Var.b(this);
        setClipToPadding(false);
        setCaptureSectionsDecoratorAllowed(true);
        t26 t26Var = new t26();
        this.h3 = t26Var;
        setLayoutManager(t26Var);
        c83 c83Var = new c83(this, (byte) 0);
        this.i3 = c83Var;
        setAdapter(c83Var);
        r1();
        setOnItemClickListener(new u(this, (byte) 19));
        gb3 gb3Var = new gb3();
        gb3Var.n(220L);
        gb3Var.o(s33.h);
        gb3Var.C = false;
        gb3Var.m = false;
        setItemAnimator(gb3Var);
        dg0.e(this, h83Var.h, h83Var.n, gl.L(42.0f) + a.getCurrentActionBarHeight(), 0);
    }

    public final long A1() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.g3;
        h83 h83Var = this.w3;
        if (i5 == 1 || i5 == 2 || i5 == 3) {
            i = ((d) h83Var).currentAccount;
            return yxa.c(i).h[this.g3 - 1];
        }
        i2 = ((d) h83Var).currentAccount;
        long j = yxa.c(i2).h[0];
        i3 = ((d) h83Var).currentAccount;
        long j2 = yxa.c(i3).h[1];
        i4 = ((d) h83Var).currentAccount;
        long[] jArr = {j, j2, yxa.c(i4).h[2]};
        long j3 = Long.MAX_VALUE;
        for (int i6 = 0; i6 < 3; i6++) {
            long j4 = jArr[i6];
            if (j3 > j4) {
                j3 = j4;
            }
        }
        return j3;
    }

    public final long B1(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.g3;
        h83 h83Var = this.w3;
        if (i6 == 1 || i6 == 2 || i6 == 3) {
            i2 = ((d) h83Var).currentAccount;
            return yxa.c(i2).e(this.g3 - 1, i);
        }
        i3 = ((d) h83Var).currentAccount;
        long e = yxa.c(i3).e(0, i);
        i4 = ((d) h83Var).currentAccount;
        i5 = ((d) h83Var).currentAccount;
        return yxa.c(i5).e(2, i) + yxa.c(i4).e(1, i) + e;
    }

    public final void C1() {
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
        this.r3 = z1(6) + B1(6);
        this.s3 = z1(6);
        this.t3 = B1(6);
        if (this.o3 == null) {
            this.o3 = new d83[7];
        }
        if (this.p3 == null) {
            this.p3 = new d83[7];
        }
        int i14 = 0;
        while (true) {
            int[] iArr = h83.y;
            int length = iArr.length;
            float[] fArr = this.l3;
            if (i14 < length) {
                int i15 = iArr[i14];
                long z1 = z1(i15) + B1(i15);
                d83[] d83VarArr = this.p3;
                d83[] d83VarArr2 = this.o3;
                long z12 = z1(iArr[i14]);
                long B1 = B1(iArr[i14]);
                int i16 = iArr[i14];
                int i17 = this.g3;
                h83 h83Var = this.w3;
                if (i17 != 1 && i17 != 2) {
                    i = 2;
                    if (i17 != 3) {
                        i11 = ((d) h83Var).currentAccount;
                        int i18 = yxa.c(i11).f[0][i16];
                        i12 = ((d) h83Var).currentAccount;
                        int i19 = yxa.c(i12).f[1][i16] + i18;
                        i13 = ((d) h83Var).currentAccount;
                        i3 = yxa.c(i13).f[2][i16] + i19;
                        i4 = iArr[i14];
                        i5 = this.g3;
                        if (i5 != 1 || i5 == i || i5 == 3) {
                            i6 = ((d) h83Var).currentAccount;
                            i7 = yxa.c(i6).e[this.g3 - 1][i4];
                        } else {
                            i8 = ((d) h83Var).currentAccount;
                            int i20 = yxa.c(i8).e[0][i4];
                            i9 = ((d) h83Var).currentAccount;
                            int i21 = yxa.c(i9).e[1][i4] + i20;
                            i10 = ((d) h83Var).currentAccount;
                            i7 = yxa.c(i10).e[2][i4] + i21;
                        }
                        ?? obj = new Object();
                        obj.d = i14;
                        obj.c = z1;
                        obj.b = true;
                        obj.e = z12;
                        obj.g = i3;
                        obj.f = B1;
                        obj.h = i7;
                        d83VarArr2[i14] = obj;
                        d83VarArr[i14] = obj;
                        fArr[i14] = ((float) z1) / ((float) this.r3);
                        i14++;
                    }
                } else {
                    i = 2;
                }
                i2 = ((d) h83Var).currentAccount;
                i3 = yxa.c(i2).f[this.g3 - 1][i16];
                i4 = iArr[i14];
                i5 = this.g3;
                if (i5 != 1) {
                }
                i6 = ((d) h83Var).currentAccount;
                i7 = yxa.c(i6).e[this.g3 - 1][i4];
                ?? obj2 = new Object();
                obj2.d = i14;
                obj2.c = z1;
                obj2.b = true;
                obj2.e = z12;
                obj2.g = i3;
                obj2.f = B1;
                obj2.h = i7;
                d83VarArr2[i14] = obj2;
                d83VarArr[i14] = obj2;
                fArr[i14] = ((float) z1) / ((float) this.r3);
                i14++;
            } else {
                Arrays.sort(this.o3, new mz2((byte) 3));
                gl.b3(fArr, this.m3);
                Arrays.fill(this.q3, true);
                return;
            }
        }
    }

    public final void D1(boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e83.D1(boolean):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
    }

    public final long z1(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.g3;
        h83 h83Var = this.w3;
        if (i6 == 1 || i6 == 2 || i6 == 3) {
            i2 = ((d) h83Var).currentAccount;
            return yxa.c(i2).d(this.g3 - 1, i);
        }
        i3 = ((d) h83Var).currentAccount;
        long d = yxa.c(i3).d(0, i);
        i4 = ((d) h83Var).currentAccount;
        i5 = ((d) h83Var).currentAccount;
        return yxa.c(i5).d(2, i) + yxa.c(i4).d(1, i) + d;
    }
}
