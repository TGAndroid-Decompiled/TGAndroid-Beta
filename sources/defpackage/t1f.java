package defpackage;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
public final class t1f implements o0f {
    public final e06 a;
    public final j0f b;

    public t1f(Context context, j0f j0fVar) {
        this.b = j0fVar;
        i51 i51Var = i51.e;
        i1c.b(context);
        g1c c = i1c.a().c(i51Var);
        if (i51.d.contains(new s24("json"))) {
            new e06(new jye(c, (byte) 2));
        }
        this.a = new e06(new jye(c, (byte) 3));
    }

    @Override
    public final void a(aec aecVar) {
        y7d y7dVar;
        zn7 zn7Var;
        j0f j0fVar = this.b;
        j0fVar.getClass();
        h1c h1cVar = (h1c) this.a.get();
        j0fVar.getClass();
        i2f i2fVar = i2f.n;
        rod rodVar = (rod) aecVar.b;
        ((pse) aecVar.c).h = false;
        pse pseVar = (pse) aecVar.c;
        pseVar.f = Boolean.FALSE;
        rodVar.b = new pwe(pseVar);
        try {
            i2f.O3();
            fme fmeVar = new fme(rodVar);
            aec aecVar2 = new aec((byte) 9);
            i2fVar.i(aecVar2);
            HashMap hashMap = new HashMap((HashMap) aecVar2.b);
            HashMap hashMap2 = new HashMap((HashMap) aecVar2.c);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                y7dVar = new y7d(byteArrayOutputStream, hashMap, hashMap2);
                zn7Var = (zn7) hashMap.get(fme.class);
            } catch (IOException unused) {
            }
            if (zn7Var != null) {
                zn7Var.a(fmeVar, y7dVar);
                h1cVar.a(new n90(null, byteArrayOutputStream.toByteArray(), cj8.b, null), new fyb((byte) 3));
                return;
            }
            throw new RuntimeException("No encoder for ".concat(String.valueOf(fme.class)));
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
