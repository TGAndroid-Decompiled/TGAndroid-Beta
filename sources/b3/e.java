package b3;

import h2.m0;
import java.util.Arrays;
public final class e {
    public int f2924c;
    public int d;
    public final boolean f2922a = true;
    public final int f2923b = 65536;
    public int f2925e = 0;
    public a[] f2926f = new a[100];

    public final synchronized a a() {
        a aVar;
        try {
            int i7 = this.d + 1;
            this.d = i7;
            int i10 = this.f2925e;
            if (i10 > 0) {
                a[] aVarArr = this.f2926f;
                int i11 = i10 - 1;
                this.f2925e = i11;
                aVar = aVarArr[i11];
                aVar.getClass();
                this.f2926f[this.f2925e] = null;
            } else {
                a aVar2 = new a(new byte[this.f2923b], 0);
                a[] aVarArr2 = this.f2926f;
                if (i7 > aVarArr2.length) {
                    this.f2926f = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
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
            a[] aVarArr = this.f2926f;
            int i7 = this.f2925e;
            this.f2925e = i7 + 1;
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
        a[] aVarArr = this.f2926f;
        int i7 = this.f2925e;
        this.f2925e = i7 + 1;
        aVarArr[i7] = aVar;
        this.d--;
    }

    public final synchronized void d(int i7) {
        boolean z9;
        if (i7 < this.f2924c) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f2924c = i7;
        if (z9) {
            e();
        }
    }

    public final synchronized void e() {
        int max = Math.max(0, m0.g(this.f2924c, this.f2923b) - this.d);
        int i7 = this.f2925e;
        if (max >= i7) {
            return;
        }
        Arrays.fill(this.f2926f, max, i7, (Object) null);
        this.f2925e = max;
    }
}
