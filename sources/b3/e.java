package b3;

import h2.l0;
import java.util.Arrays;
public final class e {
    public int f2885c;
    public int d;
    public final boolean f2883a = true;
    public final int f2884b = 65536;
    public int f2886e = 0;
    public a[] f2887f = new a[100];

    public final synchronized a a() {
        a aVar;
        try {
            int i7 = this.d + 1;
            this.d = i7;
            int i10 = this.f2886e;
            if (i10 > 0) {
                a[] aVarArr = this.f2887f;
                int i11 = i10 - 1;
                this.f2886e = i11;
                aVar = aVarArr[i11];
                aVar.getClass();
                this.f2887f[this.f2886e] = null;
            } else {
                a aVar2 = new a(new byte[this.f2884b], 0);
                a[] aVarArr2 = this.f2887f;
                if (i7 > aVarArr2.length) {
                    this.f2887f = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                }
                aVar = aVar2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar;
    }

    public final synchronized void b(a4.c cVar) {
        while (cVar != null) {
            a[] aVarArr = this.f2887f;
            int i7 = this.f2886e;
            this.f2886e = i7 + 1;
            a aVar = (a) cVar.f160c;
            aVar.getClass();
            aVarArr[i7] = aVar;
            this.d--;
            cVar = (a4.c) cVar.d;
            if (cVar == null || ((a) cVar.f160c) == null) {
                cVar = null;
            }
        }
    }

    public final synchronized void c(a aVar) {
        a[] aVarArr = this.f2887f;
        int i7 = this.f2886e;
        this.f2886e = i7 + 1;
        aVarArr[i7] = aVar;
        this.d--;
    }

    public final synchronized void d(int i7) {
        boolean z10;
        if (i7 < this.f2885c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f2885c = i7;
        if (z10) {
            e();
        }
    }

    public final synchronized void e() {
        int max = Math.max(0, l0.g(this.f2885c, this.f2884b) - this.d);
        int i7 = this.f2886e;
        if (max >= i7) {
            return;
        }
        Arrays.fill(this.f2887f, max, i7, (Object) null);
        this.f2886e = max;
    }
}
