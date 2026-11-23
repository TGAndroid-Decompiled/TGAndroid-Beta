package b3;

import h2.l0;
import java.util.Arrays;
public final class e {
    public int f2843c;
    public int d;
    public final boolean f2841a = true;
    public final int f2842b = 65536;
    public int f2844e = 0;
    public a[] f2845f = new a[100];

    public final synchronized a a() {
        a aVar;
        try {
            int i7 = this.d + 1;
            this.d = i7;
            int i10 = this.f2844e;
            if (i10 > 0) {
                a[] aVarArr = this.f2845f;
                int i11 = i10 - 1;
                this.f2844e = i11;
                aVar = aVarArr[i11];
                aVar.getClass();
                this.f2845f[this.f2844e] = null;
            } else {
                a aVar2 = new a(new byte[this.f2842b], 0);
                a[] aVarArr2 = this.f2845f;
                if (i7 > aVarArr2.length) {
                    this.f2845f = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
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
            a[] aVarArr = this.f2845f;
            int i7 = this.f2844e;
            this.f2844e = i7 + 1;
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
        a[] aVarArr = this.f2845f;
        int i7 = this.f2844e;
        this.f2844e = i7 + 1;
        aVarArr[i7] = aVar;
        this.d--;
    }

    public final synchronized void d(int i7) {
        boolean z10;
        if (i7 < this.f2843c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f2843c = i7;
        if (z10) {
            e();
        }
    }

    public final synchronized void e() {
        int max = Math.max(0, l0.g(this.f2843c, this.f2842b) - this.d);
        int i7 = this.f2844e;
        if (max >= i7) {
            return;
        }
        Arrays.fill(this.f2845f, max, i7, (Object) null);
        this.f2844e = max;
    }
}
