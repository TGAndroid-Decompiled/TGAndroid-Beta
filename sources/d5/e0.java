package d5;

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

public final class e0 {

    public int f4788a;

    public int f4789b;

    public Object f4790c;
    public Object d;

    public void a() {
        new Handler(Looper.getMainLooper()).post(new f2.r(this, 11));
    }

    public synchronized void b() {
        this.f4788a = 0;
        this.f4789b = 0;
        Arrays.fill((Object[]) this.d, (Object) null);
    }

    public void c() {
        int length = ((Object[]) this.d).length;
        if (this.f4789b < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        Object[] objArr = new Object[i10];
        int i11 = this.f4788a;
        int i12 = length - i11;
        System.arraycopy((long[]) this.f4790c, i11, jArr, 0, i12);
        System.arraycopy((Object[]) this.d, this.f4788a, objArr, 0, i12);
        int i13 = this.f4788a;
        if (i13 > 0) {
            System.arraycopy((long[]) this.f4790c, 0, jArr, i12, i13);
            System.arraycopy((Object[]) this.d, 0, objArr, i12, this.f4788a);
        }
        this.f4790c = jArr;
        this.d = objArr;
        this.f4788a = 0;
    }

    public void d(Typeface typeface) {
        int i10;
        if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f4788a) != -1) {
            typeface = w0.a(typeface, i10, (this.f4789b & 2) != 0);
        }
        x0 x0Var = (x0) this.d;
        WeakReference weakReference = (WeakReference) this.f4790c;
        if (x0Var.f17513m) {
            x0Var.f17512l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                WeakHashMap weakHashMap = j0.f46605a;
                if (textView.isAttachedToWindow()) {
                    textView.post(new androidx.activity.g(textView, typeface, x0Var.f17510j, 6));
                } else {
                    textView.setTypeface(typeface, x0Var.f17510j);
                }
            }
        }
    }

    public synchronized Object e() {
        return this.f4789b == 0 ? null : f();
    }

    public Object f() {
        a.i(this.f4789b > 0);
        Object[] objArr = (Object[]) this.d;
        int i10 = this.f4788a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f4788a = (i10 + 1) % objArr.length;
        this.f4789b--;
        return obj;
    }
}
