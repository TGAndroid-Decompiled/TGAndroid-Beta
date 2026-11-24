package defpackage;

import java.io.IOException;
import java.nio.charset.Charset;
public abstract class rrd {
    protected int zza;

    public final byte[] a() {
        try {
            c2e c2eVar = (c2e) this;
            int e = c2eVar.e();
            byte[] bArr = new byte[e];
            cwd cwdVar = new cwd(e, bArr);
            bbe a = jae.c.a(c2eVar.getClass());
            xdd xddVar = cwdVar.a;
            xdd xddVar2 = xddVar;
            if (xddVar == null) {
                ?? obj = new Object();
                Charset charset = h3e.a;
                obj.a = cwdVar;
                cwdVar.a = obj;
                xddVar2 = obj;
            }
            a.f(c2eVar, xddVar2);
            if (e - cwdVar.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e2) {
            fyb.j(tb4.y("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e2);
            return null;
        }
    }

    public abstract int b(bbe bbeVar);
}
