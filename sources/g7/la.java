package g7;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
public final class la implements ia {
    public final y8.n f7294a;
    public final ha f7295b;

    public la(Context context, ha haVar) {
        this.f7295b = haVar;
        u2.a aVar = u2.a.f47963e;
        w2.q.b(context);
        w2.o c10 = w2.q.a().c(aVar);
        if (u2.a.d.contains(new t2.c("json"))) {
            new y8.n(new f7.e9(c10, 2));
        }
        this.f7294a = new y8.n(new f7.e9(c10, 3));
    }

    @Override
    public final void a(g5.b bVar) {
        f fVar;
        q9.d dVar;
        ha haVar = this.f7295b;
        haVar.getClass();
        w2.p pVar = (w2.p) this.f7294a.get();
        haVar.getClass();
        oa oaVar = oa.f7332c;
        a5.m mVar = (a5.m) bVar.f7111b;
        ((f7.f8) bVar.f7112c).h = false;
        f7.f8 f8Var = (f7.f8) bVar.f7112c;
        f8Var.f5665f = Boolean.FALSE;
        mVar.f98b = new k9(f8Var);
        try {
            oa.b();
            j7 j7Var = new j7(mVar);
            a5.m mVar2 = new a5.m(18);
            oaVar.a(mVar2);
            HashMap hashMap = new HashMap((HashMap) mVar2.f98b);
            HashMap hashMap2 = new HashMap((HashMap) mVar2.f99c);
            e eVar = (e) mVar2.d;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fVar = new f(byteArrayOutputStream, hashMap, hashMap2, eVar);
                dVar = (q9.d) hashMap.get(j7.class);
            } catch (IOException unused) {
            }
            if (dVar != null) {
                dVar.a(j7Var, fVar);
                pVar.a(new t2.a(null, byteArrayOutputStream.toByteArray(), t2.d.f47602b, null), new v0.l(1));
                return;
            }
            throw new RuntimeException("No encoder for ".concat(String.valueOf(j7.class)));
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
        }
    }
}
