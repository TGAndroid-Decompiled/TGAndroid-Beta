package e2;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import di.x8;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.WeakHashMap;
import m.x0;
import m.y0;
import v7.u6;
public class j0 {
    public final int f8361a;
    public int f8362b;
    public int f8363c;
    public Object d;
    public Object e;

    public j0(int[] iArr) {
        this.f8361a = 3;
        SecureRandom secureRandom = tc.k.f45586a;
        int i10 = Integer.MAX_VALUE;
        for (int i11 : iArr) {
            if (i11 < i10) {
                i10 = i11;
            }
        }
        this.f8362b = Math.max(i10, 1);
        int i12 = Integer.MIN_VALUE;
        for (int i13 : iArr) {
            if (i12 < i13) {
                i12 = i13;
            }
        }
        this.f8363c = i12;
        int i14 = i12 + 1;
        int[] iArr2 = new int[i14];
        for (int i15 : iArr) {
            iArr2[i15] = iArr2[i15] + 1;
        }
        int i16 = this.f8363c + 1;
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
        this.e = iArr6;
    }

    private final synchronized void d() {
        this.f8362b = 0;
        this.f8363c = 0;
        Arrays.fill((Object[]) this.e, (Object) null);
    }

    private final synchronized void e() {
        this.f8363c = 0;
        this.f8362b = 0;
    }

    public synchronized void a(Object obj, long j10) {
        int i10 = this.f8363c;
        if (i10 > 0) {
            if (j10 <= ((long[]) this.d)[((this.f8362b + i10) - 1) % ((Object[]) this.e).length]) {
                c();
            }
        }
        f();
        int i11 = this.f8362b;
        int i12 = this.f8363c;
        Object[] objArr = (Object[]) this.e;
        int length = (i11 + i12) % objArr.length;
        ((long[]) this.d)[length] = j10;
        objArr[length] = obj;
        this.f8363c = i12 + 1;
    }

    public void b() {
        new Handler(Looper.getMainLooper()).post(new x8(this, 22));
    }

    public synchronized void c() {
        switch (this.f8361a) {
            case 0:
                d();
                return;
            default:
                e();
                return;
        }
    }

    public void f() {
        int length = ((Object[]) this.e).length;
        if (this.f8363c < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        Object[] objArr = new Object[i10];
        int i11 = this.f8362b;
        int i12 = length - i11;
        System.arraycopy((long[]) this.d, i11, jArr, 0, i12);
        System.arraycopy((Object[]) this.e, this.f8362b, objArr, 0, i12);
        int i13 = this.f8362b;
        if (i13 > 0) {
            System.arraycopy((long[]) this.d, 0, jArr, i12, i13);
            System.arraycopy((Object[]) this.e, 0, objArr, i12, this.f8362b);
        }
        this.d = jArr;
        this.e = objArr;
        this.f8362b = 0;
    }

    public void g(Typeface typeface) {
        int i10;
        boolean z10;
        if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f8362b) != -1) {
            if ((this.f8363c & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            typeface = x0.a(typeface, i10, z10);
        }
        y0 y0Var = (y0) this.e;
        WeakReference weakReference = (WeakReference) this.d;
        if (y0Var.f15024m) {
            y0Var.f15023l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                WeakHashMap weakHashMap = r0.i0.f43485a;
                if (textView.isAttachedToWindow()) {
                    textView.post(new androidx.activity.g(textView, typeface, y0Var.f15021j, 4));
                } else {
                    textView.setTypeface(typeface, y0Var.f15021j);
                }
            }
        }
    }

    public synchronized Object h() {
        Object j10;
        if (this.f8363c == 0) {
            j10 = null;
        } else {
            j10 = j();
        }
        return j10;
    }

    public synchronized Object i(long j10) {
        Object obj;
        obj = null;
        while (this.f8363c > 0 && j10 - ((long[]) this.d)[this.f8362b] >= 0) {
            obj = j();
        }
        return obj;
    }

    public Object j() {
        boolean z10;
        if (this.f8363c > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        Object[] objArr = (Object[]) this.e;
        int i10 = this.f8362b;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f8362b = (i10 + 1) % objArr.length;
        this.f8363c--;
        return obj;
    }

    public int k(c5.c0 c0Var, int[] iArr) {
        int i10 = this.f8362b;
        while (true) {
            int i11 = 1;
            if (i10 <= this.f8363c) {
                int i12 = ((int[]) this.d)[i10];
                if (i12 >= 0) {
                    int i13 = iArr[0];
                    int i14 = i10 - 1;
                    int i15 = 0;
                    while (i14 >= 0) {
                        if (c0Var.i(i13 + i14)) {
                            i15 += i11;
                        }
                        i14--;
                        i11 *= 2;
                    }
                    if (i12 >= i15) {
                        int i16 = ((int[]) this.e)[i15];
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

    public synchronized void l(long j10, long j11) {
        long[] jArr = (long[]) this.d;
        int i10 = this.f8362b;
        jArr[i10] = j10;
        ((long[]) this.e)[i10] = j11;
        this.f8362b = (i10 + 1) % jArr.length;
        this.f8363c = Math.min(this.f8363c + 1, jArr.length);
    }

    public synchronized int m() {
        return this.f8363c;
    }

    public j0(int i10, byte b10) {
        this.f8361a = i10;
        switch (i10) {
            case 2:
                this.d = new long[64];
                this.e = new long[64];
                return;
            default:
                this.d = new long[10];
                this.e = new Object[10];
                return;
        }
    }

    public j0(y0 y0Var, int i10, int i11, WeakReference weakReference) {
        this.f8361a = 1;
        this.e = y0Var;
        this.f8362b = i10;
        this.f8363c = i11;
        this.d = weakReference;
    }

    public j0(int i10) {
        this.f8361a = 4;
        this.d = new w3.r[i10];
        this.f8363c = 0;
    }
}
