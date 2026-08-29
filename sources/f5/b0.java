package f5;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import cg.m2;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;
import m.w0;
import m.x0;
import r0.j0;
public final class b0 {
    public int f6572a;
    public int f6573b;
    public Object f6574c;
    public Object d;

    public void a() {
        new Handler(Looper.getMainLooper()).post(new m2(this, 15));
    }

    public synchronized void b() {
        this.f6572a = 0;
        this.f6573b = 0;
        Arrays.fill((Object[]) this.d, (Object) null);
    }

    public void c() {
        int length = ((Object[]) this.d).length;
        if (this.f6573b < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        Object[] objArr = new Object[i10];
        int i11 = this.f6572a;
        int i12 = length - i11;
        System.arraycopy((long[]) this.f6574c, i11, jArr, 0, i12);
        System.arraycopy((Object[]) this.d, this.f6572a, objArr, 0, i12);
        int i13 = this.f6572a;
        if (i13 > 0) {
            System.arraycopy((long[]) this.f6574c, 0, jArr, i12, i13);
            System.arraycopy((Object[]) this.d, 0, objArr, i12, this.f6572a);
        }
        this.f6574c = jArr;
        this.d = objArr;
        this.f6572a = 0;
    }

    public void d(Typeface typeface) {
        int i10;
        boolean z10;
        if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f6572a) != -1) {
            if ((this.f6573b & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            typeface = w0.a(typeface, i10, z10);
        }
        x0 x0Var = (x0) this.d;
        WeakReference weakReference = (WeakReference) this.f6574c;
        if (x0Var.f16735m) {
            x0Var.f16734l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                WeakHashMap weakHashMap = j0.f46829a;
                if (textView.isAttachedToWindow()) {
                    textView.post(new androidx.activity.g(textView, typeface, x0Var.f16732j, 6));
                } else {
                    textView.setTypeface(typeface, x0Var.f16732j);
                }
            }
        }
    }

    public synchronized Object e() {
        Object f9;
        if (this.f6573b == 0) {
            f9 = null;
        } else {
            f9 = f();
        }
        return f9;
    }

    public Object f() {
        boolean z10;
        if (this.f6573b > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        a.i(z10);
        Object[] objArr = (Object[]) this.d;
        int i10 = this.f6572a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f6572a = (i10 + 1) % objArr.length;
        this.f6573b--;
        return obj;
    }
}
