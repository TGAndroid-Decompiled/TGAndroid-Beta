package defpackage;

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
public class ir {
    public int a;
    public int b;
    public Object c;
    public Object d;

    public ir(int[] iArr) {
        SecureRandom secureRandom = ag7.a;
        int i = Integer.MAX_VALUE;
        for (int i2 : iArr) {
            if (i2 < i) {
                i = i2;
            }
        }
        this.a = Math.max(i, 1);
        int i3 = Integer.MIN_VALUE;
        for (int i4 : iArr) {
            if (i3 < i4) {
                i3 = i4;
            }
        }
        this.b = i3;
        int i5 = i3 + 1;
        int[] iArr2 = new int[i5];
        for (int i6 : iArr) {
            iArr2[i6] = iArr2[i6] + 1;
        }
        int i7 = this.b + 1;
        int[] iArr3 = new int[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            iArr3[i8] = -1;
        }
        iArr2[0] = 0;
        int[] iArr4 = new int[i7];
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 1; i11 < i5; i11++) {
            i10 = (i10 + iArr2[i11 - 1]) << 1;
            iArr4[i11] = i10;
            i9 = (iArr2[i11] + i10) - 1;
            iArr3[i11] = i9;
        }
        Object[] objArr = {iArr4, Integer.valueOf(i9)};
        this.c = iArr3;
        int[] iArr5 = (int[]) objArr[0];
        int[] iArr6 = new int[((Integer) objArr[1]).intValue() + 1];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            int i13 = iArr[i12];
            if (i13 != 0) {
                int i14 = iArr5[i13];
                iArr5[i13] = i14 + 1;
                iArr6[i14] = i12;
            }
        }
        this.d = iArr6;
    }

    public final synchronized void a(Object obj, long j) {
        int i = this.b;
        if (i > 0) {
            if (j <= ((long[]) this.c)[((this.a + i) - 1) % ((Object[]) this.d).length]) {
                c();
            }
        }
        d();
        int i2 = this.a;
        int i3 = this.b;
        Object[] objArr = (Object[]) this.d;
        int length = (i2 + i3) % objArr.length;
        ((long[]) this.c)[length] = j;
        objArr[length] = obj;
        this.b = i3 + 1;
    }

    public final void b() {
        new Handler(Looper.getMainLooper()).post(new bo6(this, (byte) 17));
    }

    public final synchronized void c() {
        this.a = 0;
        this.b = 0;
        Arrays.fill((Object[]) this.d, (Object) null);
    }

    public final void d() {
        int length = ((Object[]) this.d).length;
        if (this.b < length) {
            return;
        }
        int i = length << 1;
        long[] jArr = new long[i];
        Object[] objArr = new Object[i];
        int i2 = this.a;
        int i3 = length - i2;
        System.arraycopy((long[]) this.c, i2, jArr, 0, i3);
        System.arraycopy((Object[]) this.d, this.a, objArr, 0, i3);
        int i4 = this.a;
        if (i4 > 0) {
            System.arraycopy((long[]) this.c, 0, jArr, i3, i4);
            System.arraycopy((Object[]) this.d, 0, objArr, i3, this.a);
        }
        this.c = jArr;
        this.d = objArr;
        this.a = 0;
    }

    public final Object f(String str) {
        if (str != null) {
            synchronized (this) {
                Object obj = ((LinkedHashMap) this.c).get(str);
                if (obj == null) {
                    return null;
                }
                return obj;
            }
        }
        gxc.d("key == null");
        return null;
    }

    public final void g(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
        Object remove = linkedHashMap.remove(str);
        if (remove != null) {
            linkedHashMap.put(str, remove);
        }
    }

    public final void h(Typeface typeface) {
        int i;
        boolean z;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.a) != -1) {
            if ((this.b & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            typeface = or.a(typeface, i, z);
        }
        pr prVar = (pr) this.d;
        WeakReference weakReference = (WeakReference) this.c;
        if (prVar.m) {
            prVar.l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                WeakHashMap weakHashMap = kfc.a;
                boolean isAttachedToWindow = textView.isAttachedToWindow();
                int i2 = prVar.j;
                if (isAttachedToWindow) {
                    textView.post(new jr(textView, typeface, i2, (byte) 0));
                } else {
                    textView.setTypeface(typeface, i2);
                }
            }
        }
    }

    public final synchronized Object i() {
        Object k;
        if (this.b == 0) {
            k = null;
        } else {
            k = k();
        }
        return k;
    }

    public final synchronized Object j(long j) {
        Object obj;
        obj = null;
        while (this.b > 0 && j - ((long[]) this.c)[this.a] >= 0) {
            obj = k();
        }
        return obj;
    }

    public final Object k() {
        boolean z;
        if (this.b > 0) {
            z = true;
        } else {
            z = false;
        }
        jte.p(z);
        Object[] objArr = (Object[]) this.d;
        int i = this.a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.a = (i + 1) % objArr.length;
        this.b--;
        return obj;
    }

    public Object l(String str, Object obj) {
        Object put;
        if (str != null && obj != null) {
            synchronized (this) {
                this.a += o(obj, str);
                put = ((LinkedHashMap) this.c).put(str, obj);
                if (put != null) {
                    this.a -= o(put, str);
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
                e(put, obj, str);
            }
            r(this.b, str);
            return put;
        }
        gxc.d("key == null || value == null");
        return null;
    }

    public final int m(de deVar, int[] iArr) {
        int i = this.a;
        while (true) {
            int i2 = 1;
            if (i <= this.b) {
                int i3 = ((int[]) this.c)[i];
                if (i3 >= 0) {
                    int i4 = iArr[0];
                    int i5 = i - 1;
                    int i6 = 0;
                    while (i5 >= 0) {
                        if (deVar.h0(i4 + i5)) {
                            i6 += i2;
                        }
                        i5--;
                        i2 <<= 1;
                    }
                    if (i3 >= i6) {
                        int i7 = ((int[]) this.d)[i6];
                        iArr[0] = iArr[0] + i;
                        return i7;
                    }
                }
                i++;
            } else {
                throw new Exception(String.format("[%s] Bad code at the bit index '%d'.", getClass().getSimpleName(), Integer.valueOf(iArr[0])));
            }
        }
    }

    public final void n(String str) {
        Object remove;
        ArrayList arrayList;
        if (str != null) {
            synchronized (this) {
                remove = ((LinkedHashMap) this.c).remove(str);
                if (remove != null) {
                    this.a -= o(remove, str);
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
                e(remove, null, str);
                return;
            }
            return;
        }
        gxc.d("key == null");
    }

    public final int o(Object obj, String str) {
        int q = q(obj);
        if (q >= 0) {
            return q;
        }
        throw new IllegalStateException("Negative size: " + str + "=" + obj);
    }

    public final synchronized int p() {
        return this.b;
    }

    public int q(Object obj) {
        return 1;
    }

    public final void r(int i, String str) {
        ArrayList arrayList;
        synchronized (this) {
            Iterator it = ((LinkedHashMap) this.c).entrySet().iterator();
            while (it.hasNext() && this.a > i && !((LinkedHashMap) this.c).isEmpty()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                if (str == null || !str.equals(str2)) {
                    Object value = entry.getValue();
                    this.a -= o(value, str2);
                    it.remove();
                    String[] split = str2.split("@");
                    if (split.length > 1 && (arrayList = (ArrayList) ((LinkedHashMap) this.d).get(split[0])) != null) {
                        arrayList.remove(split[1]);
                        if (arrayList.isEmpty()) {
                            ((LinkedHashMap) this.d).remove(split[0]);
                        }
                    }
                    e(value, null, str2);
                }
            }
        }
    }

    public void e(Object obj, Object obj2, String str) {
    }

    public ir(int i) {
        if (i > 0) {
            this.b = i;
            this.c = new LinkedHashMap(0, 0.75f, true);
            this.d = new LinkedHashMap();
            return;
        }
        u36.j("maxSize <= 0");
        throw null;
    }

    public ir() {
        this.c = new long[10];
        this.d = new Object[10];
    }
}
