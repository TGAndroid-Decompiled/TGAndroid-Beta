package hi;

import j$.util.DesugarCollections;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import org.telegram.ui.Dictation.DictationAsr;
public final class r7 {
    public static android.support.v4.media.session.a0 A;
    public static final long[] f15298y = {30000, 90000};
    public static String f15299z;
    public final String f15301b;
    public final p7 f15302c;
    public final Runnable f15303e;
    public android.support.v4.media.session.a0 f15304f;
    public int f15305g;
    public boolean h;
    public long f15309l;
    public long f15310m;
    public n7 f15311n;
    public boolean f15312o;
    public boolean f15313p;
    public boolean f15314q;
    public boolean f15315r;
    public l7 f15317t;
    public m7 f15318u;
    public float v;
    public ai.i f15319w;
    public di.a8 f15320x;
    public final Set f15300a = DesugarCollections.synchronizedSet(new HashSet());
    public int d = -1;
    public final TreeMap f15306i = new TreeMap();
    public final HashMap f15307j = new HashMap();
    public long f15308k = Long.MAX_VALUE;
    public final ArrayList f15316s = new ArrayList();

    public r7(p7 p7Var, long j3, long j10, Runnable runnable) {
        this.f15302c = p7Var;
        this.f15303e = runnable;
        this.f15309l = j3;
        this.f15310m = j10;
        String str = p7Var.l() + "|" + j3;
        this.f15301b = str;
        if (str.equals(f15299z)) {
            this.f15304f = A;
        } else {
            new Thread(new d3.e0(this, j3, j10, p7Var, 3), "StoryCaptions").start();
        }
    }

    public static int a(long j3) {
        return (int) (Math.max(0L, j3) / 30000);
    }

    public static long d(int[] iArr, int i7) {
        return iArr[((i7 + 1) * 4) + 2] - iArr[(i7 * 4) + 3];
    }

    public static int g(int i7, int i10, float[] fArr) {
        int max = Math.max(0, i7);
        int min = Math.min(fArr.length, i10);
        int max2 = Math.max(0, Math.min(fArr.length, (max + min) / 2));
        double d = Double.MAX_VALUE;
        while (true) {
            int i11 = max + 1600;
            if (i11 <= min) {
                double d2 = 0.0d;
                for (int i12 = max; i12 < i11; i12++) {
                    float f10 = fArr[i12];
                    d2 += f10 * f10;
                }
                if (d2 < d) {
                    max2 = max + 800;
                    d = d2;
                }
                max += 800;
            } else {
                return max2;
            }
        }
    }

    public static float k(float[] fArr, float[] fArr2, int i7, int i10) {
        return (fArr[i10 + 1] - fArr[i7]) - fArr2[i7];
    }

    public final float[] b(hi.p7 r38, long r39, long r41, long[] r43) {
        throw new UnsupportedOperationException("Method not decompiled: hi.r7.b(hi.p7, long, long, long[]):float[]");
    }

    public final void c() {
        int i7;
        Closeable[] closeableArr;
        this.h = true;
        i();
        synchronized (this.f15300a) {
            closeableArr = (Closeable[]) this.f15300a.toArray(new Closeable[0]);
        }
        for (Closeable closeable : closeableArr) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public final boolean e(int i7) {
        k7 k7Var = (k7) this.f15306i.get(Integer.valueOf(i7));
        if ((k7Var != null && k7Var.f14783c) || i7 * 30000 >= this.f15308k) {
            return true;
        }
        return false;
    }

    public final void f() {
        throw new UnsupportedOperationException("Method not decompiled: hi.r7.f():void");
    }

    public final void h(long j3, long j10, l7 l7Var) {
        this.f15317t = l7Var;
        if (this.f15304f != null) {
            this.f15309l = j3;
            this.f15310m = j10;
            this.f15312o = true;
            this.f15315r = false;
            ArrayList arrayList = this.f15316s;
            if (!arrayList.isEmpty()) {
                l7Var.g(arrayList);
            }
            f();
        }
    }

    public final void i() {
        this.f15305g++;
        ai.i iVar = this.f15319w;
        if (iVar != null) {
            iVar.run();
            this.f15319w = null;
        }
        Iterator it = this.f15306i.values().iterator();
        while (it.hasNext()) {
            if (!((k7) it.next()).f14783c) {
                it.remove();
            }
        }
        this.f15313p = false;
        this.f15312o = false;
        j();
        this.f15317t = null;
    }

    public final void j() {
        di.a8 a8Var = this.f15320x;
        if (a8Var != null) {
            DictationAsr.U(a8Var);
            this.f15320x = null;
            l7 l7Var = this.f15317t;
            if (l7Var != null) {
                l7Var.j(0L, 0L, false);
            }
        }
    }
}
