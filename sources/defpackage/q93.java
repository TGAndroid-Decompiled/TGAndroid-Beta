package defpackage;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class q93 extends r59 {
    public static final int x3 = 0;
    public boolean f3;
    public int g3;
    public final u46 h3;
    public final o93 i3;
    public final ArrayList j3;
    public final ArrayList k3;
    public final float[] l3;
    public final int[] m3;
    public final ArrayList n3;
    public p93[] o3;
    public p93[] p3;
    public final boolean[] q3;
    public long r3;
    public long s3;
    public long t3;
    public boolean u3;
    public n93 v3;
    public final t93 w3;

    public q93(t93 t93Var, Activity activity) {
        super(activity, null);
        sy4 sy4Var;
        this.w3 = t93Var;
        this.f3 = false;
        this.g3 = 0;
        this.j3 = new ArrayList();
        this.k3 = new ArrayList();
        this.l3 = new float[7];
        this.m3 = new int[7];
        this.n3 = new ArrayList();
        this.q3 = new boolean[7];
        sy4Var = ((d) t93Var).glassEngine;
        sy4Var.b(this);
        setClipToPadding(false);
        setCaptureSectionsDecoratorAllowed(true);
        u46 u46Var = new u46();
        this.h3 = u46Var;
        setLayoutManager(u46Var);
        o93 o93Var = new o93(this, (byte) 0);
        this.i3 = o93Var;
        setAdapter(o93Var);
        r1();
        setOnItemClickListener(new u(this, (byte) 20));
        sc3 sc3Var = new sc3();
        sc3Var.n(220L);
        sc3Var.o(d53.h);
        sc3Var.C = false;
        sc3Var.m = false;
        setItemAnimator(sc3Var);
        eh0.e(this, t93Var.h, t93Var.n, gm.L(42.0f) + a.getCurrentActionBarHeight(), 0);
    }

    public final long A1() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.g3;
        t93 t93Var = this.w3;
        if (i5 == 1 || i5 == 2 || i5 == 3) {
            i = ((d) t93Var).currentAccount;
            return b0b.c(i).h[this.g3 - 1];
        }
        i2 = ((d) t93Var).currentAccount;
        long j = b0b.c(i2).h[0];
        i3 = ((d) t93Var).currentAccount;
        long j2 = b0b.c(i3).h[1];
        i4 = ((d) t93Var).currentAccount;
        long[] jArr = {j, j2, b0b.c(i4).h[2]};
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
        t93 t93Var = this.w3;
        if (i6 == 1 || i6 == 2 || i6 == 3) {
            i2 = ((d) t93Var).currentAccount;
            return b0b.c(i2).e(this.g3 - 1, i);
        }
        i3 = ((d) t93Var).currentAccount;
        long e = b0b.c(i3).e(0, i);
        i4 = ((d) t93Var).currentAccount;
        i5 = ((d) t93Var).currentAccount;
        return b0b.c(i5).e(2, i) + b0b.c(i4).e(1, i) + e;
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
            this.o3 = new p93[7];
        }
        if (this.p3 == null) {
            this.p3 = new p93[7];
        }
        int i14 = 0;
        while (true) {
            int[] iArr = t93.y;
            int length = iArr.length;
            float[] fArr = this.l3;
            if (i14 < length) {
                int i15 = iArr[i14];
                long z1 = z1(i15) + B1(i15);
                p93[] p93VarArr = this.p3;
                p93[] p93VarArr2 = this.o3;
                long z12 = z1(iArr[i14]);
                long B1 = B1(iArr[i14]);
                int i16 = iArr[i14];
                int i17 = this.g3;
                t93 t93Var = this.w3;
                if (i17 != 1 && i17 != 2) {
                    i = 2;
                    if (i17 != 3) {
                        i11 = ((d) t93Var).currentAccount;
                        int i18 = b0b.c(i11).f[0][i16];
                        i12 = ((d) t93Var).currentAccount;
                        int i19 = b0b.c(i12).f[1][i16] + i18;
                        i13 = ((d) t93Var).currentAccount;
                        i3 = b0b.c(i13).f[2][i16] + i19;
                        i4 = iArr[i14];
                        i5 = this.g3;
                        if (i5 != 1 || i5 == i || i5 == 3) {
                            i6 = ((d) t93Var).currentAccount;
                            i7 = b0b.c(i6).e[this.g3 - 1][i4];
                        } else {
                            i8 = ((d) t93Var).currentAccount;
                            int i20 = b0b.c(i8).e[0][i4];
                            i9 = ((d) t93Var).currentAccount;
                            int i21 = b0b.c(i9).e[1][i4] + i20;
                            i10 = ((d) t93Var).currentAccount;
                            i7 = b0b.c(i10).e[2][i4] + i21;
                        }
                        ?? obj = new Object();
                        obj.d = i14;
                        obj.c = z1;
                        obj.b = true;
                        obj.e = z12;
                        obj.g = i3;
                        obj.f = B1;
                        obj.h = i7;
                        p93VarArr2[i14] = obj;
                        p93VarArr[i14] = obj;
                        fArr[i14] = ((float) z1) / ((float) this.r3);
                        i14++;
                    }
                } else {
                    i = 2;
                }
                i2 = ((d) t93Var).currentAccount;
                i3 = b0b.c(i2).f[this.g3 - 1][i16];
                i4 = iArr[i14];
                i5 = this.g3;
                if (i5 != 1) {
                }
                i6 = ((d) t93Var).currentAccount;
                i7 = b0b.c(i6).e[this.g3 - 1][i4];
                ?? obj2 = new Object();
                obj2.d = i14;
                obj2.c = z1;
                obj2.b = true;
                obj2.e = z12;
                obj2.g = i3;
                obj2.f = B1;
                obj2.h = i7;
                p93VarArr2[i14] = obj2;
                p93VarArr[i14] = obj2;
                fArr[i14] = ((float) z1) / ((float) this.r3);
                i14++;
            } else {
                Arrays.sort(this.o3, new x03((byte) 3));
                gm.a3(fArr, this.m3);
                Arrays.fill(this.q3, true);
                return;
            }
        }
    }

    public final void D1(boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q93.D1(boolean):void");
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
        t93 t93Var = this.w3;
        if (i6 == 1 || i6 == 2 || i6 == 3) {
            i2 = ((d) t93Var).currentAccount;
            return b0b.c(i2).d(this.g3 - 1, i);
        }
        i3 = ((d) t93Var).currentAccount;
        long d = b0b.c(i3).d(0, i);
        i4 = ((d) t93Var).currentAccount;
        i5 = ((d) t93Var).currentAccount;
        return b0b.c(i5).d(2, i) + b0b.c(i4).d(1, i) + d;
    }
}
