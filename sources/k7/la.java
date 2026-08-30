package k7;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
public final class la implements ia {
    public final c9.p f9919a;
    public final ha f9920b;

    public la(Context context, ha haVar) {
        this.f9920b = haVar;
        w2.a aVar = w2.a.e;
        y2.q.b(context);
        y2.o c3 = y2.q.a().c(aVar);
        if (w2.a.d.contains(new v2.c("json"))) {
            new c9.p(new j7.e9(c3, 2));
        }
        this.f9919a = new c9.p(new j7.e9(c3, 3));
    }

    @Override
    public final void a(f7.b bVar) {
        f fVar;
        u9.d dVar;
        ha haVar = this.f9920b;
        haVar.getClass();
        y2.p pVar = (y2.p) this.f9919a.get();
        haVar.getClass();
        oa oaVar = oa.f9957c;
        androidx.biometric.e eVar = (androidx.biometric.e) bVar.f6012b;
        ((j7.f8) bVar.f6013c).h = false;
        j7.f8 f8Var = (j7.f8) bVar.f6013c;
        f8Var.f8999f = Boolean.FALSE;
        eVar.f478b = new k9(f8Var);
        try {
            oa.b();
            k7 k7Var = new k7(eVar);
            androidx.biometric.e eVar2 = new androidx.biometric.e(26);
            oaVar.a(eVar2);
            HashMap hashMap = new HashMap((HashMap) eVar2.f478b);
            HashMap hashMap2 = new HashMap((HashMap) eVar2.f479c);
            e eVar3 = (e) eVar2.d;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fVar = new f(byteArrayOutputStream, hashMap, hashMap2, eVar3);
                dVar = (u9.d) hashMap.get(k7.class);
            } catch (IOException unused) {
            }
            if (dVar != null) {
                dVar.a(k7Var, fVar);
                pVar.a(new v2.a(null, byteArrayOutputStream.toByteArray(), v2.d.f45561b, null), new s0.b(28));
                return;
            }
            throw new RuntimeException("No encoder for ".concat(String.valueOf(k7.class)));
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
