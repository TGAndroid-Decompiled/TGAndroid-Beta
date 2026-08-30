package h5;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;
import m.w0;
import m.x0;
import r0.j0;
public final class b0 {
    public int f6930a;
    public int f6931b;
    public Object f6932c;
    public Object d;

    public synchronized void a(Object obj, long j10) {
        int i10 = this.f6931b;
        if (i10 > 0) {
            if (j10 <= ((long[]) this.f6932c)[((this.f6930a + i10) - 1) % ((Object[]) this.d).length]) {
                c();
            }
        }
        d();
        int i11 = this.f6930a;
        int i12 = this.f6931b;
        Object[] objArr = (Object[]) this.d;
        int length = (i11 + i12) % objArr.length;
        ((long[]) this.f6932c)[length] = j10;
        objArr[length] = obj;
        this.f6931b = i12 + 1;
    }

    public void b() {
        new Handler(Looper.getMainLooper()).post(new ef.e(this, 16));
    }

    public synchronized void c() {
        this.f6930a = 0;
        this.f6931b = 0;
        Arrays.fill((Object[]) this.d, (Object) null);
    }

    public void d() {
        int length = ((Object[]) this.d).length;
        if (this.f6931b < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        Object[] objArr = new Object[i10];
        int i11 = this.f6930a;
        int i12 = length - i11;
        System.arraycopy((long[]) this.f6932c, i11, jArr, 0, i12);
        System.arraycopy((Object[]) this.d, this.f6930a, objArr, 0, i12);
        int i13 = this.f6930a;
        if (i13 > 0) {
            System.arraycopy((long[]) this.f6932c, 0, jArr, i12, i13);
            System.arraycopy((Object[]) this.d, 0, objArr, i12, this.f6930a);
        }
        this.f6932c = jArr;
        this.d = objArr;
        this.f6930a = 0;
    }

    public void e(Typeface typeface) {
        int i10;
        boolean z4;
        if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f6930a) != -1) {
            if ((this.f6931b & 2) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            typeface = w0.a(typeface, i10, z4);
        }
        x0 x0Var = (x0) this.d;
        WeakReference weakReference = (WeakReference) this.f6932c;
        if (x0Var.f13680m) {
            x0Var.f13679l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                WeakHashMap weakHashMap = j0.f43118a;
                if (textView.isAttachedToWindow()) {
                    textView.post(new androidx.activity.g(textView, typeface, x0Var.f13677j, 6));
                } else {
                    textView.setTypeface(typeface, x0Var.f13677j);
                }
            }
        }
    }

    public synchronized Object f() {
        Object g10;
        if (this.f6931b == 0) {
            g10 = null;
        } else {
            g10 = g();
        }
        return g10;
    }

    public Object g() {
        boolean z4;
        if (this.f6931b > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        a.i(z4);
        Object[] objArr = (Object[]) this.d;
        int i10 = this.f6930a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f6930a = (i10 + 1) % objArr.length;
        this.f6931b--;
        return obj;
    }
}
