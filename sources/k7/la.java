package k7;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
public final class la implements ia {
    public final c9.q f9899a;
    public final ha f9900b;

    public la(Context context, ha haVar) {
        this.f9900b = haVar;
        w2.a aVar = w2.a.e;
        y2.q.b(context);
        y2.o c3 = y2.q.a().c(aVar);
        if (w2.a.d.contains(new v2.c("json"))) {
            new c9.q(new j7.e9(c3, 2));
        }
        this.f9899a = new c9.q(new j7.e9(c3, 3));
    }

    @Override
    public final void a(f7.b bVar) {
        f fVar;
        u9.d dVar;
        ha haVar = this.f9900b;
        haVar.getClass();
        y2.p pVar = (y2.p) this.f9899a.get();
        haVar.getClass();
        oa oaVar = oa.f9937c;
        af.d dVar2 = (af.d) bVar.f6001b;
        ((j7.g8) bVar.f6002c).h = false;
        j7.g8 g8Var = (j7.g8) bVar.f6002c;
        g8Var.f8988f = Boolean.FALSE;
        dVar2.f159b = new k9(g8Var);
        try {
            oa.b();
            k7 k7Var = new k7(dVar2);
            af.d dVar3 = new af.d(26);
            oaVar.a(dVar3);
            HashMap hashMap = new HashMap((HashMap) dVar3.f159b);
            HashMap hashMap2 = new HashMap((HashMap) dVar3.f160c);
            e eVar = (e) dVar3.d;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fVar = new f(byteArrayOutputStream, hashMap, hashMap2, eVar);
                dVar = (u9.d) hashMap.get(k7.class);
            } catch (IOException unused) {
            }
            if (dVar != null) {
                dVar.a(k7Var, fVar);
                pVar.a(new v2.a(null, byteArrayOutputStream.toByteArray(), v2.d.f45625b, null), new s0.b(29));
                return;
            }
            throw new RuntimeException("No encoder for ".concat(String.valueOf(k7.class)));
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
