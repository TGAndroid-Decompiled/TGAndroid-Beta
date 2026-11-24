package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.math.BigInteger;
import java.util.Map;
public final class g2f {
    public static final ce6 d = new ce6("ApplicationAnalyticsUtils", null);
    public static final String e = "21.4.0";
    public final String a;
    public final Map b;
    public final Map c;

    public g2f(String str, Bundle bundle) {
        this.a = str;
        this.b = e1f.a("com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", bundle);
        this.c = e1f.a("com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON", bundle);
    }

    public final defpackage.a6f a(defpackage.pye r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g2f.a(pye, int):a6f");
    }

    public final y5f b(pye pyeVar) {
        long j;
        y5f m = a6f.m();
        long j2 = pyeVar.d;
        m.c();
        a6f.t((a6f) m.b, j2);
        int i = pyeVar.e;
        pyeVar.e = i + 1;
        m.c();
        a6f.o((a6f) m.b, i);
        String str = pyeVar.c;
        if (str != null) {
            m.c();
            a6f.y((a6f) m.b, str);
        }
        String str2 = pyeVar.h;
        if (str2 != null) {
            m.c();
            a6f.u((a6f) m.b, str2);
        }
        h5f l = k5f.l();
        l.c();
        k5f.n((k5f) l.b, e);
        l.c();
        k5f.m((k5f) l.b, this.a);
        m.c();
        a6f.r((a6f) m.b, (k5f) l.a());
        m5f l2 = n5f.l();
        if (pyeVar.b != null) {
            h8f l3 = j8f.l();
            String str3 = pyeVar.b;
            l3.c();
            j8f.m((j8f) l3.b, str3);
            l2.c();
            n5f.o((n5f) l2.b, (j8f) l3.a());
        }
        l2.c();
        boolean z = false;
        n5f.p((n5f) l2.b, false);
        String str4 = pyeVar.f;
        if (str4 != null) {
            try {
                String replace = str4.replace("-", "");
                j = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
            } catch (NumberFormatException e2) {
                Object[] objArr = {str4};
                ce6 ce6Var = d;
                Log.w(ce6Var.a, ce6Var.d("receiverSessionId %s is not valid for hash", objArr), e2);
                j = 0;
            }
            l2.c();
            n5f.q((n5f) l2.b, j);
        }
        int i2 = pyeVar.g;
        l2.c();
        n5f.t((n5f) l2.b, i2);
        if (pyeVar.a.c == 2) {
            z = true;
        }
        l2.c();
        n5f.u((n5f) l2.b, z);
        boolean z2 = pyeVar.i;
        l2.c();
        n5f.x((n5f) l2.b, z2);
        m.c();
        a6f.p((a6f) m.b, (n5f) l2.a());
        return m;
    }
}
