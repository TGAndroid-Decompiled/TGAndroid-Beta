package e2;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import di.nb;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;
import m.v0;
import m.w0;
import r0.i0;
public final class a0 {
    public int f8750a;
    public int f8751b;
    public Object f8752c = new long[10];
    public Object d = new Object[10];

    public synchronized void a(Object obj, long j3) {
        int i10 = this.f8751b;
        if (i10 > 0) {
            if (j3 <= ((long[]) this.f8752c)[((this.f8750a + i10) - 1) % ((Object[]) this.d).length]) {
                c();
            }
        }
        d();
        int i11 = this.f8750a;
        int i12 = this.f8751b;
        Object[] objArr = (Object[]) this.d;
        int length = (i11 + i12) % objArr.length;
        ((long[]) this.f8752c)[length] = j3;
        objArr[length] = obj;
        this.f8751b = i12 + 1;
    }

    public void b() {
        new Handler(Looper.getMainLooper()).post(new nb(this, 20));
    }

    public synchronized void c() {
        this.f8750a = 0;
        this.f8751b = 0;
        Arrays.fill((Object[]) this.d, (Object) null);
    }

    public void d() {
        int length = ((Object[]) this.d).length;
        if (this.f8751b < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        Object[] objArr = new Object[i10];
        int i11 = this.f8750a;
        int i12 = length - i11;
        System.arraycopy((long[]) this.f8752c, i11, jArr, 0, i12);
        System.arraycopy((Object[]) this.d, this.f8750a, objArr, 0, i12);
        int i13 = this.f8750a;
        if (i13 > 0) {
            System.arraycopy((long[]) this.f8752c, 0, jArr, i12, i13);
            System.arraycopy((Object[]) this.d, 0, objArr, i12, this.f8750a);
        }
        this.f8752c = jArr;
        this.d = objArr;
        this.f8750a = 0;
    }

    public void e(Typeface typeface) {
        int i10;
        boolean z10;
        if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f8750a) != -1) {
            if ((this.f8751b & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            typeface = v0.a(typeface, i10, z10);
        }
        w0 w0Var = (w0) this.d;
        WeakReference weakReference = (WeakReference) this.f8752c;
        if (w0Var.f15724m) {
            w0Var.f15723l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                WeakHashMap weakHashMap = i0.f44725a;
                if (textView.isAttachedToWindow()) {
                    textView.post(new androidx.activity.g(textView, typeface, w0Var.f15721j, 5));
                } else {
                    textView.setTypeface(typeface, w0Var.f15721j);
                }
            }
        }
    }

    public synchronized Object f() {
        Object h;
        if (this.f8751b == 0) {
            h = null;
        } else {
            h = h();
        }
        return h;
    }

    public synchronized Object g(long j3) {
        Object obj;
        obj = null;
        while (this.f8751b > 0 && j3 - ((long[]) this.f8752c)[this.f8750a] >= 0) {
            obj = h();
        }
        return obj;
    }

    public Object h() {
        boolean z10;
        if (this.f8751b > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        d.g(z10);
        Object[] objArr = (Object[]) this.d;
        int i10 = this.f8750a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f8750a = (i10 + 1) % objArr.length;
        this.f8751b--;
        return obj;
    }

    public synchronized int i() {
        return this.f8751b;
    }
}
