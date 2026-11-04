package g2;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import b8.zb;
import gi.f6;
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
public class k0 {
    public int f11858a;
    public int f11859b;
    public Object f11860c;
    public Object d;

    public k0(int[] iArr) {
        SecureRandom secureRandom = oc.k.f20982a;
        int i3 = Integer.MAX_VALUE;
        for (int i10 : iArr) {
            if (i10 < i3) {
                i3 = i10;
            }
        }
        this.f11858a = Math.max(i3, 1);
        int i11 = Integer.MIN_VALUE;
        for (int i12 : iArr) {
            if (i11 < i12) {
                i11 = i12;
            }
        }
        this.f11859b = i11;
        int i13 = i11 + 1;
        int[] iArr2 = new int[i13];
        for (int i14 : iArr) {
            iArr2[i14] = iArr2[i14] + 1;
        }
        int i15 = this.f11859b + 1;
        int[] iArr3 = new int[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            iArr3[i16] = -1;
        }
        iArr2[0] = 0;
        int[] iArr4 = new int[i15];
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 1; i19 < i13; i19++) {
            i18 = (i18 + iArr2[i19 - 1]) << 1;
            iArr4[i19] = i18;
            i17 = (iArr2[i19] + i18) - 1;
            iArr3[i19] = i17;
        }
        Object[] objArr = {iArr4, Integer.valueOf(i17)};
        this.f11860c = iArr3;
        int[] iArr5 = (int[]) objArr[0];
        int[] iArr6 = new int[((Integer) objArr[1]).intValue() + 1];
        for (int i20 = 0; i20 < iArr.length; i20++) {
            int i21 = iArr[i20];
            if (i21 != 0) {
                int i22 = iArr5[i21];
                iArr5[i21] = i22 + 1;
                iArr6[i22] = i20;
            }
        }
        this.d = iArr6;
    }

    public synchronized void a(Object obj, long j10) {
        int i3 = this.f11859b;
        if (i3 > 0) {
            if (j10 <= ((long[]) this.f11860c)[((this.f11858a + i3) - 1) % ((Object[]) this.d).length]) {
                c();
            }
        }
        d();
        int i10 = this.f11858a;
        int i11 = this.f11859b;
        Object[] objArr = (Object[]) this.d;
        int length = (i10 + i11) % objArr.length;
        ((long[]) this.f11860c)[length] = j10;
        objArr[length] = obj;
        this.f11859b = i11 + 1;
    }

    public void b() {
        new Handler(Looper.getMainLooper()).post(new f6(this, 12));
    }

    public synchronized void c() {
        this.f11858a = 0;
        this.f11859b = 0;
        Arrays.fill((Object[]) this.d, (Object) null);
    }

    public void d() {
        int length = ((Object[]) this.d).length;
        if (this.f11859b < length) {
            return;
        }
        int i3 = length * 2;
        long[] jArr = new long[i3];
        Object[] objArr = new Object[i3];
        int i10 = this.f11858a;
        int i11 = length - i10;
        System.arraycopy((long[]) this.f11860c, i10, jArr, 0, i11);
        System.arraycopy((Object[]) this.d, this.f11858a, objArr, 0, i11);
        int i12 = this.f11858a;
        if (i12 > 0) {
            System.arraycopy((long[]) this.f11860c, 0, jArr, i11, i12);
            System.arraycopy((Object[]) this.d, 0, objArr, i11, this.f11858a);
        }
        this.f11860c = jArr;
        this.d = objArr;
        this.f11858a = 0;
    }

    public Object f(String str) {
        if (str != null) {
            synchronized (this) {
                try {
                    Object obj = ((LinkedHashMap) this.f11860c).get(str);
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
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f11860c;
        Object remove = linkedHashMap.remove(str);
        if (remove != null) {
            linkedHashMap.put(str, remove);
        }
    }

    public void h(Typeface typeface) {
        int i3;
        boolean z10;
        if (Build.VERSION.SDK_INT >= 28 && (i3 = this.f11858a) != -1) {
            if ((this.f11859b & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            typeface = v0.a(typeface, i3, z10);
        }
        w0 w0Var = (w0) this.d;
        WeakReference weakReference = (WeakReference) this.f11860c;
        if (w0Var.f18760m) {
            w0Var.f18759l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                WeakHashMap weakHashMap = r0.i0.f54015a;
                if (textView.isAttachedToWindow()) {
                    textView.post(new androidx.activity.g(textView, typeface, w0Var.f18757j, 4));
                } else {
                    textView.setTypeface(typeface, w0Var.f18757j);
                }
            }
        }
    }

    public synchronized Object i() {
        Object k10;
        if (this.f11859b == 0) {
            k10 = null;
        } else {
            k10 = k();
        }
        return k10;
    }

    public synchronized Object j(long j10) {
        Object obj;
        obj = null;
        while (this.f11859b > 0 && j10 - ((long[]) this.f11860c)[this.f11858a] >= 0) {
            obj = k();
        }
        return obj;
    }

    public Object k() {
        boolean z10;
        if (this.f11859b > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.p(z10);
        Object[] objArr = (Object[]) this.d;
        int i3 = this.f11858a;
        Object obj = objArr[i3];
        objArr[i3] = null;
        this.f11858a = (i3 + 1) % objArr.length;
        this.f11859b--;
        return obj;
    }

    public Object l(String str, Object obj) {
        Object put;
        if (str != null && obj != null) {
            synchronized (this) {
                try {
                    this.f11858a += o(obj, str);
                    put = ((LinkedHashMap) this.f11860c).put(str, obj);
                    if (put != null) {
                        this.f11858a -= o(put, str);
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
            r(this.f11859b, str);
            return put;
        }
        throw new NullPointerException("key == null || value == null");
    }

    public int m(e5.u uVar, int[] iArr) {
        int i3 = this.f11858a;
        while (true) {
            int i10 = 1;
            if (i3 <= this.f11859b) {
                int i11 = ((int[]) this.f11860c)[i3];
                if (i11 >= 0) {
                    int i12 = iArr[0];
                    int i13 = i3 - 1;
                    int i14 = 0;
                    while (i13 >= 0) {
                        if (uVar.k(i12 + i13)) {
                            i14 += i10;
                        }
                        i13--;
                        i10 *= 2;
                    }
                    if (i11 >= i14) {
                        int i15 = ((int[]) this.d)[i14];
                        iArr[0] = iArr[0] + i3;
                        return i15;
                    }
                }
                i3++;
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
                    remove = ((LinkedHashMap) this.f11860c).remove(str);
                    if (remove != null) {
                        this.f11858a -= o(remove, str);
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
        int q10 = q(obj);
        if (q10 >= 0) {
            return q10;
        }
        throw new IllegalStateException("Negative size: " + str + "=" + obj);
    }

    public synchronized int p() {
        return this.f11859b;
    }

    public int q(Object obj) {
        return 1;
    }

    public void r(int i3, String str) {
        ArrayList arrayList;
        synchronized (this) {
            try {
                Iterator it = ((LinkedHashMap) this.f11860c).entrySet().iterator();
                while (it.hasNext() && this.f11858a > i3 && !((LinkedHashMap) this.f11860c).isEmpty()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str2 = (String) entry.getKey();
                    if (str == null || !str.equals(str2)) {
                        Object value = entry.getValue();
                        this.f11858a -= o(value, str2);
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

    public k0(int i3, int i10) {
        switch (i10) {
            case 5:
                this.f11860c = new y3.s[i3];
                this.f11859b = 0;
                return;
            default:
                if (i3 > 0) {
                    this.f11859b = i3;
                    this.f11860c = new LinkedHashMap(0, 0.75f, true);
                    this.d = new LinkedHashMap();
                    return;
                }
                throw new IllegalArgumentException("maxSize <= 0");
        }
    }

    public k0() {
        this.f11860c = new long[10];
        this.d = new Object[10];
    }

    public void e(String str, Object obj, Object obj2) {
    }
}
