package e0;

import android.app.Notification;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.Arrays;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.sy0;
public final class i0 implements y3.y {
    public int f5677a;
    public final Object f5678b;
    public final Object f5679c;
    public final Object d;
    public final Object f5680e;

    public i0(int i10) {
        this.f5677a = i10;
        int i11 = i10 * 8;
        this.f5678b = new float[i11];
        this.f5679c = new float[i11];
        this.d = new short[i10 * 6];
        this.f5680e = new int[i10 * 4];
        for (short s10 = 0; s10 < i10; s10 = (short) (s10 + 1)) {
            int i12 = s10 * 6;
            int i13 = s10 * 4;
            short[] sArr = (short[]) this.d;
            short s11 = (short) i13;
            sArr[i12] = s11;
            sArr[i12 + 1] = (short) (i13 + 1);
            short s12 = (short) (i13 + 2);
            sArr[i12 + 2] = s12;
            sArr[i12 + 3] = s12;
            sArr[i12 + 4] = (short) (i13 + 3);
            sArr[i12 + 5] = s11;
        }
    }

    public static void a(float[] fArr, int i10, float f9, float f10, float f11, float f12) {
        int i11 = i10 * 8;
        fArr[i11] = f9;
        fArr[i11 + 1] = f10;
        fArr[i11 + 2] = f11;
        fArr[i11 + 3] = f10;
        fArr[i11 + 4] = f11;
        fArr[i11 + 5] = f12;
        fArr[i11 + 6] = f9;
        fArr[i11 + 7] = f12;
    }

    public static void d(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    @Override
    public void c(f5.w r32) {
        throw new UnsupportedOperationException("Method not decompiled: e0.i0.c(f5.w):void");
    }

    public void e(int i10, int i11) {
        int[] iArr = (int[]) this.f5680e;
        int i12 = i10 * 4;
        iArr[i12] = i11;
        iArr[i12 + 1] = i11;
        iArr[i12 + 2] = i11;
        iArr[i12 + 3] = i11;
    }

    public void f(int i10) {
        qy0[] qy0VarArr;
        int[] iArr = (int[]) this.d;
        if (iArr[i10] != 0) {
            return;
        }
        iArr[i10] = 1;
        for (qy0 qy0Var : ((qy0[][]) this.f5679c)[i10]) {
            f(qy0Var.f32135a.f34516b);
            int i11 = this.f5677a;
            this.f5677a = i11 - 1;
            ((qy0[]) this.f5678b)[i11] = qy0Var;
        }
        iArr[i10] = 2;
    }

    public i0(e0.t r23) {
        throw new UnsupportedOperationException("Method not decompiled: e0.i0.<init>(e0.t):void");
    }

    @Override
    public void b(f5.c0 c0Var, o3.m mVar, y3.d0 d0Var) {
    }

    public i0(l3.p0 p0Var, o3.y yVar, byte[] bArr, f5.c[] cVarArr, int i10) {
        this.f5678b = p0Var;
        this.f5679c = yVar;
        this.d = bArr;
        this.f5680e = cVarArr;
        this.f5677a = i10;
    }

    public i0(y3.b0 b0Var, int i10) {
        this.f5680e = b0Var;
        this.f5678b = new f5.v(new byte[5], 5);
        this.f5679c = new SparseArray();
        this.d = new SparseIntArray();
        this.f5677a = i10;
    }

    public i0(sy0 sy0Var, qy0[] qy0VarArr) {
        this.f5680e = sy0Var;
        int length = qy0VarArr.length;
        this.f5678b = new qy0[length];
        this.f5677a = length - 1;
        int e10 = sy0Var.e() + 1;
        qy0[][] qy0VarArr2 = new qy0[e10];
        int[] iArr = new int[e10];
        for (qy0 qy0Var : qy0VarArr) {
            int i10 = qy0Var.f32135a.f34515a;
            iArr[i10] = iArr[i10] + 1;
        }
        for (int i11 = 0; i11 < e10; i11++) {
            qy0VarArr2[i11] = new qy0[iArr[i11]];
        }
        Arrays.fill(iArr, 0);
        for (qy0 qy0Var2 : qy0VarArr) {
            int i12 = qy0Var2.f32135a.f34515a;
            qy0[] qy0VarArr3 = qy0VarArr2[i12];
            int i13 = iArr[i12];
            iArr[i12] = i13 + 1;
            qy0VarArr3[i13] = qy0Var2;
        }
        this.f5679c = qy0VarArr2;
        this.d = new int[((sy0) this.f5680e).e() + 1];
    }
}
