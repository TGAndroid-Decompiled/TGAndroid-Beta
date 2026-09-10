package e2;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import gg.v1;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;
import m.v0;
import m.w0;
import r0.i0;
public final class a0 {
    public int f7174a;
    public int f7175b;
    public Object f7176c = new long[10];
    public Object d = new Object[10];

    public synchronized void a(Object obj, long j3) {
        int i10 = this.f7175b;
        if (i10 > 0) {
            if (j3 <= ((long[]) this.f7176c)[((this.f7174a + i10) - 1) % ((Object[]) this.d).length]) {
                c();
            }
        }
        d();
        int i11 = this.f7174a;
        int i12 = this.f7175b;
        Object[] objArr = (Object[]) this.d;
        int length = (i11 + i12) % objArr.length;
        ((long[]) this.f7176c)[length] = j3;
        objArr[length] = obj;
        this.f7175b = i12 + 1;
    }

    public void b() {
        new Handler(Looper.getMainLooper()).post(new v1(this, 2));
    }

    public synchronized void c() {
        this.f7174a = 0;
        this.f7175b = 0;
        Arrays.fill((Object[]) this.d, (Object) null);
    }

    public void d() {
        int length = ((Object[]) this.d).length;
        if (this.f7175b < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        Object[] objArr = new Object[i10];
        int i11 = this.f7174a;
        int i12 = length - i11;
        System.arraycopy((long[]) this.f7176c, i11, jArr, 0, i12);
        System.arraycopy((Object[]) this.d, this.f7174a, objArr, 0, i12);
        int i13 = this.f7174a;
        if (i13 > 0) {
            System.arraycopy((long[]) this.f7176c, 0, jArr, i12, i13);
            System.arraycopy((Object[]) this.d, 0, objArr, i12, this.f7174a);
        }
        this.f7176c = jArr;
        this.d = objArr;
        this.f7174a = 0;
    }

    public void e(Typeface typeface) {
        int i10;
        boolean z10;
        if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f7174a) != -1) {
            if ((this.f7175b & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            typeface = v0.a(typeface, i10, z10);
        }
        w0 w0Var = (w0) this.d;
        WeakReference weakReference = (WeakReference) this.f7176c;
        if (w0Var.f13178m) {
            w0Var.f13177l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                WeakHashMap weakHashMap = i0.f41062a;
                if (textView.isAttachedToWindow()) {
                    textView.post(new androidx.activity.g(textView, typeface, w0Var.f13175j, 5));
                } else {
                    textView.setTypeface(typeface, w0Var.f13175j);
                }
            }
        }
    }

    public synchronized Object f() {
        Object h;
        if (this.f7175b == 0) {
            h = null;
        } else {
            h = h();
        }
        return h;
    }

    public synchronized Object g(long j3) {
        Object obj;
        obj = null;
        while (this.f7175b > 0 && j3 - ((long[]) this.f7176c)[this.f7174a] >= 0) {
            obj = h();
        }
        return obj;
    }

    public Object h() {
        boolean z10;
        if (this.f7175b > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        d.g(z10);
        Object[] objArr = (Object[]) this.d;
        int i10 = this.f7174a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f7174a = (i10 + 1) % objArr.length;
        this.f7175b--;
        return obj;
    }

    public synchronized int i() {
        return this.f7175b;
    }
}
