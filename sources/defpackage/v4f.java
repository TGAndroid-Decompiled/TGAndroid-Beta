package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.math.BigInteger;
import java.util.Map;
public final class v4f {
    public static final he6 d = new he6("ApplicationAnalyticsUtils", null);
    public static final String e = "21.4.0";
    public final String a;
    public final Map b;
    public final Map c;

    public v4f(String str, Bundle bundle) {
        this.a = str;
        this.b = v3f.a("com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", bundle);
        this.c = v3f.a("com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON", bundle);
    }

    public final defpackage.p8f a(defpackage.e1f r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v4f.a(e1f, int):p8f");
    }

    public final n8f b(e1f e1fVar) {
        long j;
        n8f m = p8f.m();
        long j2 = e1fVar.d;
        m.c();
        p8f.t((p8f) m.b, j2);
        int i = e1fVar.e;
        e1fVar.e = i + 1;
        m.c();
        p8f.o((p8f) m.b, i);
        String str = e1fVar.c;
        if (str != null) {
            m.c();
            p8f.y((p8f) m.b, str);
        }
        String str2 = e1fVar.h;
        if (str2 != null) {
            m.c();
            p8f.u((p8f) m.b, str2);
        }
        x7f l = z7f.l();
        l.c();
        z7f.n((z7f) l.b, e);
        l.c();
        z7f.m((z7f) l.b, this.a);
        m.c();
        p8f.r((p8f) m.b, (z7f) l.a());
        b8f l2 = c8f.l();
        if (e1fVar.b != null) {
            waf l3 = yaf.l();
            String str3 = e1fVar.b;
            l3.c();
            yaf.m((yaf) l3.b, str3);
            l2.c();
            c8f.o((c8f) l2.b, (yaf) l3.a());
        }
        l2.c();
        boolean z = false;
        c8f.p((c8f) l2.b, false);
        String str4 = e1fVar.f;
        if (str4 != null) {
            try {
                String replace = str4.replace("-", "");
                j = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
            } catch (NumberFormatException e2) {
                Object[] objArr = {str4};
                he6 he6Var = d;
                Log.w(he6Var.a, he6Var.d("receiverSessionId %s is not valid for hash", objArr), e2);
                j = 0;
            }
            l2.c();
            c8f.q((c8f) l2.b, j);
        }
        int i2 = e1fVar.g;
        l2.c();
        c8f.t((c8f) l2.b, i2);
        if (e1fVar.a.c == 2) {
            z = true;
        }
        l2.c();
        c8f.u((c8f) l2.b, z);
        boolean z2 = e1fVar.i;
        l2.c();
        c8f.x((c8f) l2.b, z2);
        m.c();
        p8f.p((p8f) m.b, (c8f) l2.a());
        return m;
    }
}
