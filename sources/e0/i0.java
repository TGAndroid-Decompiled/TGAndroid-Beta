package e0;

import android.app.Notification;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.Arrays;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.hy0;
public final class i0 implements w3.y {
    public int f4707a;
    public final Object f4708b;
    public final Object f4709c;
    public final Object d;
    public final Object f4710e;

    public i0(int i9) {
        this.f4707a = i9;
        int i10 = i9 * 8;
        this.f4708b = new float[i10];
        this.f4709c = new float[i10];
        this.d = new short[i9 * 6];
        this.f4710e = new int[i9 * 4];
        for (short s10 = 0; s10 < i9; s10 = (short) (s10 + 1)) {
            int i11 = s10 * 6;
            int i12 = s10 * 4;
            short[] sArr = (short[]) this.d;
            short s11 = (short) i12;
            sArr[i11] = s11;
            sArr[i11 + 1] = (short) (i12 + 1);
            short s12 = (short) (i12 + 2);
            sArr[i11 + 2] = s12;
            sArr[i11 + 3] = s12;
            sArr[i11 + 4] = (short) (i12 + 3);
            sArr[i11 + 5] = s11;
        }
    }

    public static void a(float[] fArr, int i9, float f10, float f11, float f12, float f13) {
        int i10 = i9 * 8;
        fArr[i10] = f10;
        fArr[i10 + 1] = f11;
        fArr[i10 + 2] = f12;
        fArr[i10 + 3] = f11;
        fArr[i10 + 4] = f12;
        fArr[i10 + 5] = f13;
        fArr[i10 + 6] = f10;
        fArr[i10 + 7] = f13;
    }

    public static void b(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    public void c(int i9, int i10) {
        int[] iArr = (int[]) this.f4710e;
        int i11 = i9 * 4;
        iArr[i11] = i10;
        iArr[i11 + 1] = i10;
        iArr[i11 + 2] = i10;
        iArr[i11 + 3] = i10;
    }

    public void d(int i9) {
        fy0[] fy0VarArr;
        int[] iArr = (int[]) this.d;
        if (iArr[i9] != 0) {
            return;
        }
        iArr[i9] = 1;
        for (fy0 fy0Var : ((fy0[][]) this.f4709c)[i9]) {
            d(fy0Var.f28604a.f30585b);
            int i10 = this.f4707a;
            this.f4707a = i10 - 1;
            ((fy0[]) this.f4708b)[i10] = fy0Var;
        }
        iArr[i9] = 2;
    }

    @Override
    public void g(d5.y r32) {
        throw new UnsupportedOperationException("Method not decompiled: e0.i0.g(d5.y):void");
    }

    public i0(e0.t r23) {
        throw new UnsupportedOperationException("Method not decompiled: e0.i0.<init>(e0.t):void");
    }

    @Override
    public void e(d5.e0 e0Var, m3.m mVar, w3.d0 d0Var) {
    }

    public i0(j3.n0 n0Var, m3.y yVar, byte[] bArr, d5.c[] cVarArr, int i9) {
        this.f4708b = n0Var;
        this.f4709c = yVar;
        this.d = bArr;
        this.f4710e = cVarArr;
        this.f4707a = i9;
    }

    public i0(w3.b0 b0Var, int i9) {
        this.f4710e = b0Var;
        this.f4708b = new d5.x(new byte[5], 5);
        this.f4709c = new SparseArray();
        this.d = new SparseIntArray();
        this.f4707a = i9;
    }

    public i0(hy0 hy0Var, fy0[] fy0VarArr) {
        this.f4710e = hy0Var;
        int length = fy0VarArr.length;
        this.f4708b = new fy0[length];
        this.f4707a = length - 1;
        int e10 = hy0Var.e() + 1;
        fy0[][] fy0VarArr2 = new fy0[e10];
        int[] iArr = new int[e10];
        for (fy0 fy0Var : fy0VarArr) {
            int i9 = fy0Var.f28604a.f30584a;
            iArr[i9] = iArr[i9] + 1;
        }
        for (int i10 = 0; i10 < e10; i10++) {
            fy0VarArr2[i10] = new fy0[iArr[i10]];
        }
        Arrays.fill(iArr, 0);
        for (fy0 fy0Var2 : fy0VarArr) {
            int i11 = fy0Var2.f28604a.f30584a;
            fy0[] fy0VarArr3 = fy0VarArr2[i11];
            int i12 = iArr[i11];
            iArr[i11] = i12 + 1;
            fy0VarArr3[i12] = fy0Var2;
        }
        this.f4709c = fy0VarArr2;
        this.d = new int[((hy0) this.f4710e).e() + 1];
    }
}
