package e2;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import ci.rc;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.WeakHashMap;
import m.v0;
import m.w0;
import r0.i0;
public class a0 {
    public final int f8516a;
    public int f8517b;
    public int f8518c;
    public Object d;
    public Object f8519e;

    public a0(int[] iArr) {
        this.f8516a = 3;
        SecureRandom secureRandom = sc.k.f47914a;
        int i10 = Integer.MAX_VALUE;
        for (int i11 : iArr) {
            if (i11 < i10) {
                i10 = i11;
            }
        }
        this.f8517b = Math.max(i10, 1);
        int i12 = Integer.MIN_VALUE;
        for (int i13 : iArr) {
            if (i12 < i13) {
                i12 = i13;
            }
        }
        this.f8518c = i12;
        int i14 = i12 + 1;
        int[] iArr2 = new int[i14];
        for (int i15 : iArr) {
            iArr2[i15] = iArr2[i15] + 1;
        }
        int i16 = this.f8518c + 1;
        int[] iArr3 = new int[i16];
        for (int i17 = 0; i17 < i16; i17++) {
            iArr3[i17] = -1;
        }
        iArr2[0] = 0;
        int[] iArr4 = new int[i16];
        int i18 = 0;
        int i19 = 0;
        for (int i20 = 1; i20 < i14; i20++) {
            i19 = (i19 + iArr2[i20 - 1]) << 1;
            iArr4[i20] = i19;
            i18 = (iArr2[i20] + i19) - 1;
            iArr3[i20] = i18;
        }
        Object[] objArr = {iArr4, Integer.valueOf(i18)};
        this.d = iArr3;
        int[] iArr5 = (int[]) objArr[0];
        int[] iArr6 = new int[((Integer) objArr[1]).intValue() + 1];
        for (int i21 = 0; i21 < iArr.length; i21++) {
            int i22 = iArr[i21];
            if (i22 != 0) {
                int i23 = iArr5[i22];
                iArr5[i22] = i23 + 1;
                iArr6[i23] = i21;
            }
        }
        this.f8519e = iArr6;
    }

    private final synchronized void d() {
        this.f8517b = 0;
        this.f8518c = 0;
        Arrays.fill((Object[]) this.f8519e, (Object) null);
    }

    private final synchronized void e() {
        this.f8518c = 0;
        this.f8517b = 0;
    }

    public synchronized void a(Object obj, long j3) {
        int i10 = this.f8518c;
        if (i10 > 0) {
            if (j3 <= ((long[]) this.d)[((this.f8517b + i10) - 1) % ((Object[]) this.f8519e).length]) {
                c();
            }
        }
        f();
        int i11 = this.f8517b;
        int i12 = this.f8518c;
        Object[] objArr = (Object[]) this.f8519e;
        int length = (i11 + i12) % objArr.length;
        ((long[]) this.d)[length] = j3;
        objArr[length] = obj;
        this.f8518c = i12 + 1;
    }

    public void b() {
        new Handler(Looper.getMainLooper()).post(new rc(this, 17));
    }

    public synchronized void c() {
        switch (this.f8516a) {
            case 0:
                d();
                return;
            default:
                e();
                return;
        }
    }

    public void f() {
        int length = ((Object[]) this.f8519e).length;
        if (this.f8518c < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        Object[] objArr = new Object[i10];
        int i11 = this.f8517b;
        int i12 = length - i11;
        System.arraycopy((long[]) this.d, i11, jArr, 0, i12);
        System.arraycopy((Object[]) this.f8519e, this.f8517b, objArr, 0, i12);
        int i13 = this.f8517b;
        if (i13 > 0) {
            System.arraycopy((long[]) this.d, 0, jArr, i12, i13);
            System.arraycopy((Object[]) this.f8519e, 0, objArr, i12, this.f8517b);
        }
        this.d = jArr;
        this.f8519e = objArr;
        this.f8517b = 0;
    }

    public void g(Typeface typeface) {
        int i10;
        boolean z10;
        if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f8517b) != -1) {
            if ((this.f8518c & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            typeface = v0.a(typeface, i10, z10);
        }
        w0 w0Var = (w0) this.f8519e;
        WeakReference weakReference = (WeakReference) this.d;
        if (w0Var.f15852m) {
            w0Var.f15851l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                WeakHashMap weakHashMap = i0.f46766a;
                if (textView.isAttachedToWindow()) {
                    textView.post(new androidx.activity.g(textView, typeface, w0Var.f15849j, 4));
                } else {
                    textView.setTypeface(typeface, w0Var.f15849j);
                }
            }
        }
    }

    public synchronized Object h() {
        Object j3;
        if (this.f8518c == 0) {
            j3 = null;
        } else {
            j3 = j();
        }
        return j3;
    }

    public synchronized Object i(long j3) {
        Object obj;
        obj = null;
        while (this.f8518c > 0 && j3 - ((long[]) this.d)[this.f8517b] >= 0) {
            obj = j();
        }
        return obj;
    }

    public Object j() {
        boolean z10;
        if (this.f8518c > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        d.g(z10);
        Object[] objArr = (Object[]) this.f8519e;
        int i10 = this.f8517b;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f8517b = (i10 + 1) % objArr.length;
        this.f8518c--;
        return obj;
    }

    public int k(c5.b0 b0Var, int[] iArr) {
        int i10 = this.f8517b;
        while (true) {
            int i11 = 1;
            if (i10 <= this.f8518c) {
                int i12 = ((int[]) this.d)[i10];
                if (i12 >= 0) {
                    int i13 = iArr[0];
                    int i14 = i10 - 1;
                    int i15 = 0;
                    while (i14 >= 0) {
                        if (b0Var.j(i13 + i14)) {
                            i15 += i11;
                        }
                        i14--;
                        i11 *= 2;
                    }
                    if (i12 >= i15) {
                        int i16 = ((int[]) this.f8519e)[i15];
                        iArr[0] = iArr[0] + i10;
                        return i16;
                    }
                }
                i10++;
            } else {
                throw new Exception(String.format("[%s] Bad code at the bit index '%d'.", getClass().getSimpleName(), Integer.valueOf(iArr[0])));
            }
        }
    }

    public synchronized void l(long j3, long j10) {
        long[] jArr = (long[]) this.d;
        int i10 = this.f8517b;
        jArr[i10] = j3;
        ((long[]) this.f8519e)[i10] = j10;
        this.f8517b = (i10 + 1) % jArr.length;
        this.f8518c = Math.min(this.f8518c + 1, jArr.length);
    }

    public synchronized int m() {
        return this.f8518c;
    }

    public a0(int i10, byte b10) {
        this.f8516a = i10;
        switch (i10) {
            case 2:
                this.d = new long[64];
                this.f8519e = new long[64];
                return;
            default:
                this.d = new long[10];
                this.f8519e = new Object[10];
                return;
        }
    }

    public a0(w0 w0Var, int i10, int i11, WeakReference weakReference) {
        this.f8516a = 1;
        this.f8519e = w0Var;
        this.f8517b = i10;
        this.f8518c = i11;
        this.d = weakReference;
    }

    public a0(int i10) {
        this.f8516a = 4;
        this.d = new w3.r[i10];
        this.f8518c = 0;
    }
}
