package e2;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import ei.bc;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.WeakHashMap;
import m.w0;
import m.x0;
import v7.u6;
public class j0 {
    public int f8238a;
    public int f8239b;
    public Object f8240c;
    public Object d;

    public j0(int[] iArr) {
        SecureRandom secureRandom = tc.k.f46947a;
        int i10 = Integer.MAX_VALUE;
        for (int i11 : iArr) {
            if (i11 < i10) {
                i10 = i11;
            }
        }
        this.f8238a = Math.max(i10, 1);
        int i12 = Integer.MIN_VALUE;
        for (int i13 : iArr) {
            if (i12 < i13) {
                i12 = i13;
            }
        }
        this.f8239b = i12;
        int i14 = i12 + 1;
        int[] iArr2 = new int[i14];
        for (int i15 : iArr) {
            iArr2[i15] = iArr2[i15] + 1;
        }
        int i16 = this.f8239b + 1;
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
        this.f8240c = iArr3;
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
        this.d = iArr6;
    }

    public synchronized void a(Object obj, long j10) {
        int i10 = this.f8239b;
        if (i10 > 0) {
            if (j10 <= ((long[]) this.f8240c)[((this.f8238a + i10) - 1) % ((Object[]) this.d).length]) {
                c();
            }
        }
        d();
        int i11 = this.f8238a;
        int i12 = this.f8239b;
        Object[] objArr = (Object[]) this.d;
        int length = (i11 + i12) % objArr.length;
        ((long[]) this.f8240c)[length] = j10;
        objArr[length] = obj;
        this.f8239b = i12 + 1;
    }

    public void b() {
        new Handler(Looper.getMainLooper()).post(new bc(this, 12));
    }

    public synchronized void c() {
        this.f8238a = 0;
        this.f8239b = 0;
        Arrays.fill((Object[]) this.d, (Object) null);
    }

    public void d() {
        int length = ((Object[]) this.d).length;
        if (this.f8239b < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        Object[] objArr = new Object[i10];
        int i11 = this.f8238a;
        int i12 = length - i11;
        System.arraycopy((long[]) this.f8240c, i11, jArr, 0, i12);
        System.arraycopy((Object[]) this.d, this.f8238a, objArr, 0, i12);
        int i13 = this.f8238a;
        if (i13 > 0) {
            System.arraycopy((long[]) this.f8240c, 0, jArr, i12, i13);
            System.arraycopy((Object[]) this.d, 0, objArr, i12, this.f8238a);
        }
        this.f8240c = jArr;
        this.d = objArr;
        this.f8238a = 0;
    }

    public void e(Typeface typeface) {
        int i10;
        boolean z10;
        if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f8238a) != -1) {
            if ((this.f8239b & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            typeface = w0.a(typeface, i10, z10);
        }
        x0 x0Var = (x0) this.d;
        WeakReference weakReference = (WeakReference) this.f8240c;
        if (x0Var.f16375m) {
            x0Var.f16374l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                WeakHashMap weakHashMap = r0.i0.f44818a;
                if (textView.isAttachedToWindow()) {
                    textView.post(new androidx.activity.g(textView, typeface, x0Var.f16372j, 4));
                } else {
                    textView.setTypeface(typeface, x0Var.f16372j);
                }
            }
        }
    }

    public synchronized Object f() {
        Object h;
        if (this.f8239b == 0) {
            h = null;
        } else {
            h = h();
        }
        return h;
    }

    public synchronized Object g(long j10) {
        Object obj;
        obj = null;
        while (this.f8239b > 0 && j10 - ((long[]) this.f8240c)[this.f8238a] >= 0) {
            obj = h();
        }
        return obj;
    }

    public Object h() {
        boolean z10;
        if (this.f8239b > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        Object[] objArr = (Object[]) this.d;
        int i10 = this.f8238a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f8238a = (i10 + 1) % objArr.length;
        this.f8239b--;
        return obj;
    }

    public int i(c5.c0 c0Var, int[] iArr) {
        int i10 = this.f8238a;
        while (true) {
            int i11 = 1;
            if (i10 <= this.f8239b) {
                int i12 = ((int[]) this.f8240c)[i10];
                if (i12 >= 0) {
                    int i13 = iArr[0];
                    int i14 = i10 - 1;
                    int i15 = 0;
                    while (i14 >= 0) {
                        if (c0Var.o(i13 + i14)) {
                            i15 += i11;
                        }
                        i14--;
                        i11 *= 2;
                    }
                    if (i12 >= i15) {
                        int i16 = ((int[]) this.d)[i15];
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

    public synchronized int j() {
        return this.f8239b;
    }

    public j0() {
        this.f8240c = new long[10];
        this.d = new Object[10];
    }
}
