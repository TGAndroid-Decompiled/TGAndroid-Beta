package defpackage;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
public final class v3f implements q2f {
    public final e26 a;
    public final l2f b;

    public v3f(Context context, l2f l2fVar) {
        this.b = l2fVar;
        p61 p61Var = p61.e;
        i3c.b(context);
        g3c c = i3c.a().c(p61Var);
        if (p61.d.contains(new d44("json"))) {
            new e26(new l0f(c, (byte) 2));
        }
        this.a = new e26(new l0f(c, (byte) 3));
    }

    @Override
    public final void a(rhb rhbVar) {
        aad aadVar;
        cq7 cq7Var;
        l2f l2fVar = this.b;
        l2fVar.getClass();
        h3c h3cVar = (h3c) this.a.get();
        l2fVar.getClass();
        k4f k4fVar = k4f.n;
        uqd uqdVar = (uqd) rhbVar.b;
        ((sue) rhbVar.c).h = false;
        sue sueVar = (sue) rhbVar.c;
        sueVar.f = Boolean.FALSE;
        uqdVar.b = new rye(sueVar);
        try {
            k4f.O3();
            ioe ioeVar = new ioe(uqdVar);
            rhb rhbVar2 = new rhb((byte) 11);
            k4fVar.h(rhbVar2);
            HashMap hashMap = new HashMap((HashMap) rhbVar2.b);
            HashMap hashMap2 = new HashMap((HashMap) rhbVar2.c);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                aadVar = new aad(byteArrayOutputStream, hashMap, hashMap2);
                cq7Var = (cq7) hashMap.get(ioe.class);
            } catch (IOException unused) {
            }
            if (cq7Var != null) {
                cq7Var.a(ioeVar, aadVar);
                h3cVar.a(new na0(null, byteArrayOutputStream.toByteArray(), fl8.b, null), new rjb((byte) 9));
                return;
            }
            throw new RuntimeException("No encoder for ".concat(String.valueOf(ioe.class)));
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
