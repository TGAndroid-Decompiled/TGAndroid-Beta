package k7;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
public final class la implements ia {
    public final c9.p f10649a;
    public final ha f10650b;

    public la(Context context, ha haVar) {
        this.f10650b = haVar;
        w2.a aVar = w2.a.f49361e;
        y2.q.b(context);
        y2.o c3 = y2.q.a().c(aVar);
        if (w2.a.d.contains(new v2.c("json"))) {
            new c9.p(new j7.e9(c3, 2));
        }
        this.f10649a = new c9.p(new j7.e9(c3, 3));
    }

    @Override
    public final void a(f7.b bVar) {
        f fVar;
        u9.d dVar;
        ha haVar = this.f10650b;
        haVar.getClass();
        y2.p pVar = (y2.p) this.f10649a.get();
        haVar.getClass();
        oa oaVar = oa.f10687c;
        androidx.biometric.e eVar = (androidx.biometric.e) bVar.f6120b;
        ((j7.g8) bVar.f6121c).h = false;
        j7.g8 g8Var = (j7.g8) bVar.f6121c;
        g8Var.f9619f = Boolean.FALSE;
        eVar.f527b = new k9(g8Var);
        try {
            oa.b();
            k7 k7Var = new k7(eVar);
            androidx.biometric.e eVar2 = new androidx.biometric.e(26);
            oaVar.a(eVar2);
            HashMap hashMap = new HashMap((HashMap) eVar2.f527b);
            HashMap hashMap2 = new HashMap((HashMap) eVar2.f528c);
            e eVar3 = (e) eVar2.d;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fVar = new f(byteArrayOutputStream, hashMap, hashMap2, eVar3);
                dVar = (u9.d) hashMap.get(k7.class);
            } catch (IOException unused) {
            }
            if (dVar != null) {
                dVar.a(k7Var, fVar);
                pVar.a(new v2.a(null, byteArrayOutputStream.toByteArray(), v2.d.f48887b, null), new sg.a(29));
                return;
            }
            throw new RuntimeException("No encoder for ".concat(String.valueOf(k7.class)));
        } catch (UnsupportedEncodingException e6) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e6);
        }
    }
}
