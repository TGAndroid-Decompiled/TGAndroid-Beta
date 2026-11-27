package defpackage;

import java.io.IOException;
import java.nio.charset.Charset;
public abstract class hwd {
    protected int zza;

    public final byte[] a() {
        try {
            s6e s6eVar = (s6e) this;
            int e = s6eVar.e();
            byte[] bArr = new byte[e];
            s0e s0eVar = new s0e(e, bArr);
            rfe a = zee.c.a(s6eVar.getClass());
            oqd oqdVar = s0eVar.a;
            oqd oqdVar2 = oqdVar;
            if (oqdVar == null) {
                ?? obj = new Object();
                Charset charset = x7e.a;
                obj.a = s0eVar;
                s0eVar.a = obj;
                oqdVar2 = obj;
            }
            a.f(s6eVar, oqdVar2);
            if (e - s0eVar.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e2) {
            grb.j(qd4.y("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e2);
            return null;
        }
    }

    public abstract int b(rfe rfeVar);
}
