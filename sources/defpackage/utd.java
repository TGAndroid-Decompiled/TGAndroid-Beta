package defpackage;

import java.io.IOException;
public abstract class utd {
    protected int zza;

    public final byte[] a() {
        try {
            f4e f4eVar = (f4e) this;
            int e = f4eVar.e();
            byte[] bArr = new byte[e];
            fyd fydVar = new fyd(e, bArr);
            cde a = kce.c.a(f4eVar.getClass());
            cf9 cf9Var = fydVar.a;
            if (cf9Var == null) {
                cf9Var = new cf9(fydVar);
            }
            a.d(f4eVar, cf9Var);
            if (e - fydVar.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e2) {
            rjb.k(kt6.o("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e2);
            return null;
        }
    }

    public abstract int b(cde cdeVar);
}
