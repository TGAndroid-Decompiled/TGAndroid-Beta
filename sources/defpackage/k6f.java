package defpackage;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
public final class k6f implements f5f {
    public final i26 a;
    public final b5f b;

    public k6f(Context context, b5f b5fVar) {
        this.b = b5fVar;
        q51 q51Var = q51.e;
        h5c.b(context);
        f5c c = h5c.a().c(q51Var);
        if (q51.d.contains(new n34("json"))) {
            new i26(new a3f(c, (byte) 2));
        }
        this.a = new i26(new a3f(c, (byte) 3));
    }

    @Override
    public final void a(zhc zhcVar) {
        rcd rcdVar;
        zq7 zq7Var;
        b5f b5fVar = this.b;
        b5fVar.getClass();
        g5c g5cVar = (g5c) this.a.get();
        b5fVar.getClass();
        z6f z6fVar = z6f.n;
        htd htdVar = (htd) zhcVar.b;
        ((gxe) zhcVar.c).h = false;
        gxe gxeVar = (gxe) zhcVar.c;
        gxeVar.f = Boolean.FALSE;
        htdVar.b = new g1f(gxeVar);
        try {
            z6f.O3();
            wqe wqeVar = new wqe(htdVar);
            zhc zhcVar2 = new zhc((byte) 9);
            z6fVar.j(zhcVar2);
            HashMap hashMap = new HashMap((HashMap) zhcVar2.b);
            HashMap hashMap2 = new HashMap((HashMap) zhcVar2.c);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                rcdVar = new rcd(byteArrayOutputStream, hashMap, hashMap2);
                zq7Var = (zq7) hashMap.get(wqe.class);
            } catch (IOException unused) {
            }
            if (zq7Var != null) {
                zq7Var.a(wqeVar, rcdVar);
                g5cVar.a(new p90(null, byteArrayOutputStream.toByteArray(), pm8.b, null), new grb((byte) 10));
                return;
            }
            throw new RuntimeException("No encoder for ".concat(String.valueOf(wqe.class)));
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
