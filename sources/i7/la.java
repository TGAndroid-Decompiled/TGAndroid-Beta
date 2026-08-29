package i7;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
public final class la implements ia {
    public final a9.q f8436a;
    public final ha f8437b;

    public la(Context context, ha haVar) {
        this.f8437b = haVar;
        w2.a aVar = w2.a.f49622e;
        y2.q.b(context);
        y2.o c3 = y2.q.a().c(aVar);
        if (w2.a.d.contains(new v2.c("json"))) {
            new a9.q(new h7.c9(c3, 2));
        }
        this.f8436a = new a9.q(new h7.c9(c3, 3));
    }

    @Override
    public final void a(g9.l lVar) {
        f fVar;
        s9.d dVar;
        ha haVar = this.f8437b;
        haVar.getClass();
        y2.p pVar = (y2.p) this.f8436a.get();
        haVar.getClass();
        oa oaVar = oa.f8472c;
        androidx.biometric.e eVar = (androidx.biometric.e) lVar.f7168b;
        ((h7.d8) lVar.f7169c).h = false;
        h7.d8 d8Var = (h7.d8) lVar.f7169c;
        d8Var.f7592f = Boolean.FALSE;
        eVar.f1030b = new k9(d8Var);
        try {
            oa.b();
            k7 k7Var = new k7(eVar);
            androidx.biometric.e eVar2 = new androidx.biometric.e(18);
            oaVar.a(eVar2);
            HashMap hashMap = new HashMap((HashMap) eVar2.f1030b);
            HashMap hashMap2 = new HashMap((HashMap) eVar2.f1031c);
            e eVar3 = (e) eVar2.d;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fVar = new f(byteArrayOutputStream, hashMap, hashMap2, eVar3);
                dVar = (s9.d) hashMap.get(k7.class);
            } catch (IOException unused) {
            }
            if (dVar != null) {
                dVar.a(k7Var, fVar);
                pVar.a(new v2.a(null, byteArrayOutputStream.toByteArray(), v2.d.f49329b, null), new sg.j(17));
                return;
            }
            throw new RuntimeException("No encoder for ".concat(String.valueOf(k7.class)));
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
        }
    }
}
