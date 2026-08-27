package h7;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

public final class la implements ia {

    public final z8.m f8464a;

    public final ha f8465b;

    public la(Context context, ha haVar) {
        this.f8465b = haVar;
        u2.a aVar = u2.a.f48257e;
        w2.q.b(context);
        w2.o oVarC = w2.q.a().c(aVar);
        if (u2.a.d.contains(new t2.c("json"))) {
            new z8.m(new g7.d9(oVarC, 2));
        }
        this.f8464a = new z8.m(new g7.d9(oVarC, 3));
    }

    @Override
    public final void a(g5.b bVar) {
        ha haVar = this.f8465b;
        haVar.getClass();
        w2.p pVar = (w2.p) this.f8464a.get();
        haVar.getClass();
        oa oaVar = oa.f8505c;
        a5.n nVar = (a5.n) bVar.f6389b;
        ((g7.e8) bVar.f6390c).h = false;
        g7.e8 e8Var = (g7.e8) bVar.f6390c;
        e8Var.f6459f = Boolean.FALSE;
        nVar.f100b = new k9(e8Var);
        try {
            oa.b();
            j7 j7Var = new j7(nVar);
            a5.n nVar2 = new a5.n(19);
            oaVar.a(nVar2);
            HashMap map = new HashMap((HashMap) nVar2.f100b);
            HashMap map2 = new HashMap((HashMap) nVar2.f101c);
            e eVar = (e) nVar2.d;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                f fVar = new f(byteArrayOutputStream, map, map2, eVar);
                r9.d dVar = (r9.d) map.get(j7.class);
                if (dVar == null) {
                    throw new r9.b("No encoder for ".concat(String.valueOf(j7.class)));
                }
                dVar.a(j7Var, fVar);
                pVar.a(new t2.a(null, byteArrayOutputStream.toByteArray(), t2.d.f48013b, null), new u3.k(6));
            } catch (IOException unused) {
            }
        } catch (UnsupportedEncodingException e9) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e9);
        }
    }
}
