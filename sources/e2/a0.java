package e2;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.widget.TextView;
import ci.uc;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;
import m.v0;
import m.w0;
import r0.i0;
public final class a0 {
    public int f7873a;
    public int f7874b;
    public Object f7875c;
    public Object d;

    public a0() {
        this.f7875c = new long[10];
        this.d = new Object[10];
    }

    public synchronized void a(Object obj, long j3) {
        int i10 = this.f7874b;
        if (i10 > 0) {
            if (j3 <= ((long[]) this.f7875c)[((this.f7873a + i10) - 1) % ((Object[]) this.d).length]) {
                c();
            }
        }
        d();
        int i11 = this.f7873a;
        int i12 = this.f7874b;
        Object[] objArr = (Object[]) this.d;
        int length = (i11 + i12) % objArr.length;
        ((long[]) this.f7875c)[length] = j3;
        objArr[length] = obj;
        this.f7874b = i12 + 1;
    }

    public void b() {
        new Handler(Looper.getMainLooper()).post(new uc(this, 17));
    }

    public synchronized void c() {
        this.f7873a = 0;
        this.f7874b = 0;
        Arrays.fill((Object[]) this.d, (Object) null);
    }

    public void d() {
        int length = ((Object[]) this.d).length;
        if (this.f7874b < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        Object[] objArr = new Object[i10];
        int i11 = this.f7873a;
        int i12 = length - i11;
        System.arraycopy((long[]) this.f7875c, i11, jArr, 0, i12);
        System.arraycopy((Object[]) this.d, this.f7873a, objArr, 0, i12);
        int i13 = this.f7873a;
        if (i13 > 0) {
            System.arraycopy((long[]) this.f7875c, 0, jArr, i12, i13);
            System.arraycopy((Object[]) this.d, 0, objArr, i12, this.f7873a);
        }
        this.f7875c = jArr;
        this.d = objArr;
        this.f7873a = 0;
    }

    public void e(Typeface typeface) {
        int i10;
        boolean z10;
        if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f7873a) != -1) {
            if ((this.f7874b & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            typeface = v0.a(typeface, i10, z10);
        }
        w0 w0Var = (w0) this.d;
        WeakReference weakReference = (WeakReference) this.f7875c;
        if (w0Var.f14525m) {
            w0Var.f14524l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                WeakHashMap weakHashMap = i0.f42096a;
                if (textView.isAttachedToWindow()) {
                    textView.post(new androidx.activity.g(textView, typeface, w0Var.f14522j, 5));
                } else {
                    textView.setTypeface(typeface, w0Var.f14522j);
                }
            }
        }
    }

    public synchronized Object f() {
        Object h;
        if (this.f7874b == 0) {
            h = null;
        } else {
            h = h();
        }
        return h;
    }

    public synchronized Object g(long j3) {
        Object obj;
        obj = null;
        while (this.f7874b > 0 && j3 - ((long[]) this.f7875c)[this.f7873a] >= 0) {
            obj = h();
        }
        return obj;
    }

    public Object h() {
        boolean z10;
        if (this.f7874b > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        d.g(z10);
        Object[] objArr = (Object[]) this.d;
        int i10 = this.f7873a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f7873a = (i10 + 1) % objArr.length;
        this.f7874b--;
        return obj;
    }

    public synchronized int i() {
        return this.f7874b;
    }

    public a0(Size size, Size size2, int i10, int i11) {
        this.f7875c = size;
        this.d = size2;
        this.f7873a = i10;
        this.f7874b = i11;
    }
}
