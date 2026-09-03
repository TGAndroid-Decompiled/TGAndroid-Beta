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
    public int f6917a;
    public int f6918b;
    public Object f6919c;
    public Object d;

    public synchronized void a(Object obj, long j10) {
        int i10 = this.f6918b;
        if (i10 > 0) {
            if (j10 <= ((long[]) this.f6919c)[((this.f6917a + i10) - 1) % ((Object[]) this.d).length]) {
                c();
            }
        }
        d();
        int i11 = this.f6917a;
        int i12 = this.f6918b;
        Object[] objArr = (Object[]) this.d;
        int length = (i11 + i12) % objArr.length;
        ((long[]) this.f6919c)[length] = j10;
        objArr[length] = obj;
        this.f6918b = i12 + 1;
    }

    public void b() {
        new Handler(Looper.getMainLooper()).post(new e3.h(this, 16));
    }

    public synchronized void c() {
        this.f6917a = 0;
        this.f6918b = 0;
        Arrays.fill((Object[]) this.d, (Object) null);
    }

    public void d() {
        int length = ((Object[]) this.d).length;
        if (this.f6918b < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        Object[] objArr = new Object[i10];
        int i11 = this.f6917a;
        int i12 = length - i11;
        System.arraycopy((long[]) this.f6919c, i11, jArr, 0, i12);
        System.arraycopy((Object[]) this.d, this.f6917a, objArr, 0, i12);
        int i13 = this.f6917a;
        if (i13 > 0) {
            System.arraycopy((long[]) this.f6919c, 0, jArr, i12, i13);
            System.arraycopy((Object[]) this.d, 0, objArr, i12, this.f6917a);
        }
        this.f6919c = jArr;
        this.d = objArr;
        this.f6917a = 0;
    }

    public void e(Typeface typeface) {
        int i10;
        boolean z4;
        if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f6917a) != -1) {
            if ((this.f6918b & 2) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            typeface = w0.a(typeface, i10, z4);
        }
        x0 x0Var = (x0) this.d;
        WeakReference weakReference = (WeakReference) this.f6919c;
        if (x0Var.f13664m) {
            x0Var.f13663l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                WeakHashMap weakHashMap = j0.f43142a;
                if (textView.isAttachedToWindow()) {
                    textView.post(new androidx.activity.g(textView, typeface, x0Var.f13661j, 6));
                } else {
                    textView.setTypeface(typeface, x0Var.f13661j);
                }
            }
        }
    }

    public synchronized Object f() {
        Object g10;
        if (this.f6918b == 0) {
            g10 = null;
        } else {
            g10 = g();
        }
        return g10;
    }

    public Object g() {
        boolean z4;
        if (this.f6918b > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        a.i(z4);
        Object[] objArr = (Object[]) this.d;
        int i10 = this.f6917a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f6917a = (i10 + 1) % objArr.length;
        this.f6918b--;
        return obj;
    }
}
