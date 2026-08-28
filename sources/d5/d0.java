package d5;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import fh.o1;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;
import m.w0;
import m.x0;
import r0.j0;
public final class d0 {
    public int f4338a;
    public int f4339b;
    public Object f4340c;
    public Object d;

    public void a() {
        new Handler(Looper.getMainLooper()).post(new o1(this, 22));
    }

    public synchronized void b() {
        this.f4338a = 0;
        this.f4339b = 0;
        Arrays.fill((Object[]) this.d, (Object) null);
    }

    public void c() {
        int length = ((Object[]) this.d).length;
        if (this.f4339b < length) {
            return;
        }
        int i9 = length * 2;
        long[] jArr = new long[i9];
        Object[] objArr = new Object[i9];
        int i10 = this.f4338a;
        int i11 = length - i10;
        System.arraycopy((long[]) this.f4340c, i10, jArr, 0, i11);
        System.arraycopy((Object[]) this.d, this.f4338a, objArr, 0, i11);
        int i12 = this.f4338a;
        if (i12 > 0) {
            System.arraycopy((long[]) this.f4340c, 0, jArr, i11, i12);
            System.arraycopy((Object[]) this.d, 0, objArr, i11, this.f4338a);
        }
        this.f4340c = jArr;
        this.d = objArr;
        this.f4338a = 0;
    }

    public void d(Typeface typeface) {
        int i9;
        boolean z10;
        if (Build.VERSION.SDK_INT >= 28 && (i9 = this.f4338a) != -1) {
            if ((this.f4339b & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            typeface = w0.a(typeface, i9, z10);
        }
        x0 x0Var = (x0) this.d;
        WeakReference weakReference = (WeakReference) this.f4340c;
        if (x0Var.f17138m) {
            x0Var.f17137l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                WeakHashMap weakHashMap = j0.f46915a;
                if (textView.isAttachedToWindow()) {
                    textView.post(new androidx.activity.g(textView, typeface, x0Var.f17135j, 6));
                } else {
                    textView.setTypeface(typeface, x0Var.f17135j);
                }
            }
        }
    }

    public synchronized Object e() {
        Object f10;
        if (this.f4339b == 0) {
            f10 = null;
        } else {
            f10 = f();
        }
        return f10;
    }

    public Object f() {
        boolean z10;
        if (this.f4339b > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        a.i(z10);
        Object[] objArr = (Object[]) this.d;
        int i9 = this.f4338a;
        Object obj = objArr[i9];
        objArr[i9] = null;
        this.f4338a = (i9 + 1) % objArr.length;
        this.f4339b--;
        return obj;
    }
}
