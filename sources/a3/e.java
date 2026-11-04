package a3;

import g2.n0;
import java.util.Arrays;
import w2.z0;
public final class e {
    public int f66c;
    public int d;
    public final boolean f64a = true;
    public final int f65b = 65536;
    public int f67e = 0;
    public a[] f68f = new a[100];

    public final synchronized a a() {
        a aVar;
        try {
            int i3 = this.d + 1;
            this.d = i3;
            int i10 = this.f67e;
            if (i10 > 0) {
                a[] aVarArr = this.f68f;
                int i11 = i10 - 1;
                this.f67e = i11;
                aVar = aVarArr[i11];
                aVar.getClass();
                this.f68f[this.f67e] = null;
            } else {
                a aVar2 = new a(new byte[this.f65b], 0);
                a[] aVarArr2 = this.f68f;
                if (i3 > aVarArr2.length) {
                    this.f68f = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                }
                aVar = aVar2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar;
    }

    public final synchronized void b(a aVar) {
        a[] aVarArr = this.f68f;
        int i3 = this.f67e;
        this.f67e = i3 + 1;
        aVarArr[i3] = aVar;
        this.d--;
    }

    public final synchronized void c(z0 z0Var) {
        while (z0Var != null) {
            a[] aVarArr = this.f68f;
            int i3 = this.f67e;
            this.f67e = i3 + 1;
            a aVar = (a) z0Var.f57294c;
            aVar.getClass();
            aVarArr[i3] = aVar;
            this.d--;
            z0Var = (z0) z0Var.d;
            if (z0Var == null || ((a) z0Var.f57294c) == null) {
                z0Var = null;
            }
        }
    }

    public final synchronized void d(int i3) {
        boolean z10;
        if (i3 < this.f66c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f66c = i3;
        if (z10) {
            e();
        }
    }

    public final synchronized void e() {
        int max = Math.max(0, n0.g(this.f66c, this.f65b) - this.d);
        int i3 = this.f67e;
        if (max >= i3) {
            return;
        }
        Arrays.fill(this.f68f, max, i3, (Object) null);
        this.f67e = max;
    }
}
