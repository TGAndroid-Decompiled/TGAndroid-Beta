package e2;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import m.v0;
import m.w0;
import v7.t6;
public class j0 {
    public int f6152a;
    public int f6153b;
    public Object f6154c;
    public Object d;

    public j0(int[] iArr) {
        SecureRandom secureRandom = lc.k.f11757a;
        int i10 = Integer.MAX_VALUE;
        for (int i11 : iArr) {
            if (i11 < i10) {
                i10 = i11;
            }
        }
        this.f6152a = Math.max(i10, 1);
        int i12 = Integer.MIN_VALUE;
        for (int i13 : iArr) {
            if (i12 < i13) {
                i12 = i13;
            }
        }
        this.f6153b = i12;
        int i14 = i12 + 1;
        int[] iArr2 = new int[i14];
        for (int i15 : iArr) {
            iArr2[i15] = iArr2[i15] + 1;
        }
        int i16 = this.f6153b + 1;
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
        this.f6154c = iArr3;
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
        int i10 = this.f6153b;
        if (i10 > 0) {
            if (j10 <= ((long[]) this.f6154c)[((this.f6152a + i10) - 1) % ((Object[]) this.d).length]) {
                c();
            }
        }
        d();
        int i11 = this.f6152a;
        int i12 = this.f6153b;
        Object[] objArr = (Object[]) this.d;
        int length = (i11 + i12) % objArr.length;
        ((long[]) this.f6154c)[length] = j10;
        objArr[length] = obj;
        this.f6153b = i12 + 1;
    }

    public void b() {
        new Handler(Looper.getMainLooper()).post(new gg.c(this, 1));
    }

    public synchronized void c() {
        this.f6152a = 0;
        this.f6153b = 0;
        Arrays.fill((Object[]) this.d, (Object) null);
    }

    public void d() {
        int length = ((Object[]) this.d).length;
        if (this.f6153b < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        Object[] objArr = new Object[i10];
        int i11 = this.f6152a;
        int i12 = length - i11;
        System.arraycopy((long[]) this.f6154c, i11, jArr, 0, i12);
        System.arraycopy((Object[]) this.d, this.f6152a, objArr, 0, i12);
        int i13 = this.f6152a;
        if (i13 > 0) {
            System.arraycopy((long[]) this.f6154c, 0, jArr, i12, i13);
            System.arraycopy((Object[]) this.d, 0, objArr, i12, this.f6152a);
        }
        this.f6154c = jArr;
        this.d = objArr;
        this.f6152a = 0;
    }

    public Object f(String str) {
        if (str != null) {
            synchronized (this) {
                try {
                    Object obj = ((LinkedHashMap) this.f6154c).get(str);
                    if (obj != null) {
                        return obj;
                    }
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        throw new NullPointerException("key == null");
    }

    public void g(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f6154c;
        Object remove = linkedHashMap.remove(str);
        if (remove != null) {
            linkedHashMap.put(str, remove);
        }
    }

    public void h(Typeface typeface) {
        int i10;
        boolean z10;
        if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f6152a) != -1) {
            if ((this.f6153b & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            typeface = v0.a(typeface, i10, z10);
        }
        w0 w0Var = (w0) this.d;
        WeakReference weakReference = (WeakReference) this.f6154c;
        if (w0Var.f12578m) {
            w0Var.f12577l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                WeakHashMap weakHashMap = r0.h0.f46134a;
                if (textView.isAttachedToWindow()) {
                    textView.post(new androidx.activity.g(textView, typeface, w0Var.f12575j, 4));
                } else {
                    textView.setTypeface(typeface, w0Var.f12575j);
                }
            }
        }
    }

    public synchronized Object i() {
        Object k10;
        if (this.f6153b == 0) {
            k10 = null;
        } else {
            k10 = k();
        }
        return k10;
    }

    public synchronized Object j(long j10) {
        Object obj;
        obj = null;
        while (this.f6153b > 0 && j10 - ((long[]) this.f6154c)[this.f6152a] >= 0) {
            obj = k();
        }
        return obj;
    }

    public Object k() {
        boolean z10;
        if (this.f6153b > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.p(z10);
        Object[] objArr = (Object[]) this.d;
        int i10 = this.f6152a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f6152a = (i10 + 1) % objArr.length;
        this.f6153b--;
        return obj;
    }

    public Object l(String str, Object obj) {
        Object put;
        if (str != null && obj != null) {
            synchronized (this) {
                try {
                    this.f6152a += o(obj, str);
                    put = ((LinkedHashMap) this.f6154c).put(str, obj);
                    if (put != null) {
                        this.f6152a -= o(put, str);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            String[] split = str.split("@");
            if (split.length > 1) {
                ArrayList arrayList = (ArrayList) ((LinkedHashMap) this.d).get(split[0]);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    ((LinkedHashMap) this.d).put(split[0], arrayList);
                }
                if (!arrayList.contains(split[1])) {
                    arrayList.add(split[1]);
                }
            }
            if (put != null) {
                e(str, put, obj);
            }
            r(this.f6153b, str);
            return put;
        }
        throw new NullPointerException("key == null || value == null");
    }

    public int m(c5.x xVar, int[] iArr) {
        int i10 = this.f6152a;
        while (true) {
            int i11 = 1;
            if (i10 <= this.f6153b) {
                int i12 = ((int[]) this.f6154c)[i10];
                if (i12 >= 0) {
                    int i13 = iArr[0];
                    int i14 = i10 - 1;
                    int i15 = 0;
                    while (i14 >= 0) {
                        if (xVar.l(i13 + i14)) {
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

    public void n(String str) {
        Object remove;
        ArrayList arrayList;
        if (str != null) {
            synchronized (this) {
                try {
                    remove = ((LinkedHashMap) this.f6154c).remove(str);
                    if (remove != null) {
                        this.f6152a -= o(remove, str);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (remove != null) {
                String[] split = str.split("@");
                if (split.length > 1 && (arrayList = (ArrayList) ((LinkedHashMap) this.d).get(split[0])) != null) {
                    arrayList.remove(split[1]);
                    if (arrayList.isEmpty()) {
                        ((LinkedHashMap) this.d).remove(split[0]);
                    }
                }
                e(str, remove, null);
                return;
            }
            return;
        }
        throw new NullPointerException("key == null");
    }

    public int o(Object obj, String str) {
        int q6 = q(obj);
        if (q6 >= 0) {
            return q6;
        }
        throw new IllegalStateException("Negative size: " + str + "=" + obj);
    }

    public synchronized int p() {
        return this.f6153b;
    }

    public int q(Object obj) {
        return 1;
    }

    public void r(int i10, String str) {
        ArrayList arrayList;
        synchronized (this) {
            try {
                Iterator it = ((LinkedHashMap) this.f6154c).entrySet().iterator();
                while (it.hasNext() && this.f6152a > i10 && !((LinkedHashMap) this.f6154c).isEmpty()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str2 = (String) entry.getKey();
                    if (str == null || !str.equals(str2)) {
                        Object value = entry.getValue();
                        this.f6152a -= o(value, str2);
                        it.remove();
                        String[] split = str2.split("@");
                        if (split.length > 1 && (arrayList = (ArrayList) ((LinkedHashMap) this.d).get(split[0])) != null) {
                            arrayList.remove(split[1]);
                            if (arrayList.isEmpty()) {
                                ((LinkedHashMap) this.d).remove(split[0]);
                            }
                        }
                        e(str2, value, null);
                    }
                }
            } finally {
            }
        }
    }

    public j0(int i10, int i11) {
        switch (i11) {
            case 5:
                this.f6154c = new w3.r[i10];
                this.f6153b = 0;
                return;
            default:
                if (i10 > 0) {
                    this.f6153b = i10;
                    this.f6154c = new LinkedHashMap(0, 0.75f, true);
                    this.d = new LinkedHashMap();
                    return;
                }
                throw new IllegalArgumentException("maxSize <= 0");
        }
    }

    public j0() {
        this.f6154c = new long[10];
        this.d = new Object[10];
    }

    public void e(String str, Object obj, Object obj2) {
    }
}
