package a4;

import android.app.Notification;
import android.util.SparseArray;
import android.util.SparseIntArray;
import b4.b0;
import b4.f0;
import b4.h0;
import h5.c0;
import h5.v;
import java.util.Arrays;
import l3.o0;
import l7.w0;
import lh.m5;
import o2.o;
import org.telegram.ui.Components.bz0;
import org.telegram.ui.Components.dz0;
import r3.m;
public final class k implements b0 {
    public int f85a;
    public final Object f86b;
    public final Object f87c;
    public final Object d;
    public final Object e;

    public k(int i10) {
        this.f85a = i10;
        int i11 = i10 * 8;
        this.f86b = new float[i11];
        this.f87c = new float[i11];
        this.d = new short[i10 * 6];
        this.e = new int[i10 * 4];
        for (short s6 = 0; s6 < i10; s6 = (short) (s6 + 1)) {
            int i12 = s6 * 6;
            int i13 = s6 * 4;
            short[] sArr = (short[]) this.d;
            short s9 = (short) i13;
            sArr[i12] = s9;
            sArr[i12 + 1] = (short) (i13 + 1);
            short s10 = (short) (i13 + 2);
            sArr[i12 + 2] = s10;
            sArr[i12 + 3] = s10;
            sArr[i12 + 4] = (short) (i13 + 3);
            sArr[i12 + 5] = s9;
        }
    }

    public static void b(float[] fArr, int i10, float f10, float f11, float f12, float f13) {
        int i11 = i10 * 8;
        fArr[i11] = f10;
        fArr[i11 + 1] = f11;
        fArr[i11 + 2] = f12;
        fArr[i11 + 3] = f11;
        fArr[i11 + 4] = f12;
        fArr[i11 + 5] = f13;
        fArr[i11 + 6] = f10;
        fArr[i11 + 7] = f13;
    }

    public static void d(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    @Override
    public void a(h5.w r32) {
        throw new UnsupportedOperationException("Method not decompiled: a4.k.a(h5.w):void");
    }

    public void e(int i10, int i11) {
        int[] iArr = (int[]) this.e;
        int i12 = i10 * 4;
        iArr[i12] = i11;
        iArr[i12 + 1] = i11;
        iArr[i12 + 2] = i11;
        iArr[i12 + 3] = i11;
    }

    public void f(int i10) {
        bz0[] bz0VarArr;
        int[] iArr = (int[]) this.d;
        if (iArr[i10] != 0) {
            return;
        }
        iArr[i10] = 1;
        for (bz0 bz0Var : ((bz0[][]) this.f87c)[i10]) {
            f(bz0Var.f23769a.f25527b);
            int i11 = this.f85a;
            this.f85a = i11 - 1;
            ((bz0[]) this.f86b)[i11] = bz0Var;
        }
        iArr[i10] = 2;
    }

    public k(e0.t r23) {
        throw new UnsupportedOperationException("Method not decompiled: a4.k.<init>(e0.t):void");
    }

    @Override
    public void c(c0 c0Var, m mVar, h0 h0Var) {
    }

    public k(g5.l lVar, r3.i iVar) {
        m5 m5Var = new m5(iVar, 14);
        w0 w0Var = new w0(14);
        ab.a aVar = new ab.a(7);
        this.f86b = lVar;
        this.f87c = m5Var;
        this.d = w0Var;
        this.e = aVar;
        this.f85a = 1048576;
    }

    public k(o0 o0Var, o oVar, byte[] bArr, h5.c[] cVarArr, int i10) {
        this.f86b = o0Var;
        this.f87c = oVar;
        this.d = bArr;
        this.e = cVarArr;
        this.f85a = i10;
    }

    public k(f0 f0Var, int i10) {
        this.e = f0Var;
        this.f86b = new v(new byte[5], 5);
        this.f87c = new SparseArray();
        this.d = new SparseIntArray();
        this.f85a = i10;
    }

    public k(dz0 dz0Var, bz0[] bz0VarArr) {
        this.e = dz0Var;
        int length = bz0VarArr.length;
        this.f86b = new bz0[length];
        this.f85a = length - 1;
        int e = dz0Var.e() + 1;
        bz0[][] bz0VarArr2 = new bz0[e];
        int[] iArr = new int[e];
        for (bz0 bz0Var : bz0VarArr) {
            int i10 = bz0Var.f23769a.f25526a;
            iArr[i10] = iArr[i10] + 1;
        }
        for (int i11 = 0; i11 < e; i11++) {
            bz0VarArr2[i11] = new bz0[iArr[i11]];
        }
        Arrays.fill(iArr, 0);
        for (bz0 bz0Var2 : bz0VarArr) {
            int i12 = bz0Var2.f23769a.f25526a;
            bz0[] bz0VarArr3 = bz0VarArr2[i12];
            int i13 = iArr[i12];
            iArr[i12] = i13 + 1;
            bz0VarArr3[i13] = bz0Var2;
        }
        this.f87c = bz0VarArr2;
        this.d = new int[((dz0) this.e).e() + 1];
    }
}
