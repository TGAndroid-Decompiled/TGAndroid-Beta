package defpackage;

import j$.util.DesugarCollections;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import org.telegram.ui.Dictation.DictationAsr;
public final class v5b {
    public static in3 A;
    public static final long[] y = {30000, 90000};
    public static String z;
    public final String b;
    public final t5b c;
    public final Runnable e;
    public in3 f;
    public int g;
    public boolean h;
    public long l;
    public long m;
    public r5b n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public q5b t;
    public ed1 u;
    public float v;
    public rm1 w;
    public j2b x;
    public final Set a = DesugarCollections.synchronizedSet(new HashSet());
    public int d = -1;
    public final TreeMap i = new TreeMap();
    public final HashMap j = new HashMap();
    public long k = Long.MAX_VALUE;
    public final ArrayList s = new ArrayList();

    public v5b(t5b t5bVar, long j, long j2, Runnable runnable) {
        this.c = t5bVar;
        this.e = runnable;
        this.l = j;
        this.m = j2;
        String str = t5bVar.f() + "|" + j;
        this.b = str;
        if (str.equals(z)) {
            this.f = A;
        } else {
            new Thread(new n40(this, j, j2, t5bVar, (byte) 16), "StoryCaptions").start();
        }
    }

    public static int a(long j) {
        return (int) (Math.max(0L, j) / 30000);
    }

    public static long d(int[] iArr, int i) {
        return iArr[((i + 1) << 2) + 2] - iArr[(i << 2) + 3];
    }

    public static int g(int i, int i2, float[] fArr) {
        int max = Math.max(0, i);
        int min = Math.min(fArr.length, i2);
        int max2 = Math.max(0, Math.min(fArr.length, (max + min) / 2));
        double d = Double.MAX_VALUE;
        while (true) {
            int i3 = max + 1600;
            if (i3 <= min) {
                double d2 = 0.0d;
                for (int i4 = max; i4 < i3; i4++) {
                    float f = fArr[i4];
                    d2 += f * f;
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

    public static float k(float[] fArr, float[] fArr2, int i, int i2) {
        return (fArr[i2 + 1] - fArr[i]) - fArr2[i];
    }

    public final float[] b(defpackage.t5b r37, long r38, long r40, long[] r42) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v5b.b(t5b, long, long, long[]):float[]");
    }

    public final void c() {
        int i;
        Closeable[] closeableArr;
        this.h = true;
        i();
        synchronized (this.a) {
            closeableArr = (Closeable[]) this.a.toArray(new Closeable[0]);
        }
        for (Closeable closeable : closeableArr) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public final boolean e(int i) {
        p5b p5bVar = (p5b) this.i.get(Integer.valueOf(i));
        if ((p5bVar != null && p5bVar.c) || i * 30000 >= this.k) {
            return true;
        }
        return false;
    }

    public final void f() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v5b.f():void");
    }

    public final void h(long j, long j2, q5b q5bVar) {
        this.t = q5bVar;
        if (this.f != null) {
            this.l = j;
            this.m = j2;
            this.o = true;
            this.r = false;
            ArrayList arrayList = this.s;
            if (!arrayList.isEmpty()) {
                q5bVar.a(arrayList);
            }
            f();
        }
    }

    public final void i() {
        this.g++;
        rm1 rm1Var = this.w;
        if (rm1Var != null) {
            rm1Var.run();
            this.w = null;
        }
        Iterator it = this.i.values().iterator();
        while (it.hasNext()) {
            if (!((p5b) it.next()).c) {
                it.remove();
            }
        }
        this.p = false;
        this.o = false;
        j();
        this.t = null;
    }

    public final void j() {
        j2b j2bVar = this.x;
        if (j2bVar != null) {
            DictationAsr.T(j2bVar);
            this.x = null;
            q5b q5bVar = this.t;
            if (q5bVar != null) {
                q5bVar.f(0L, 0L, false);
            }
        }
    }
}
