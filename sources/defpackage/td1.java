package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;
public final class td1 implements d5c {
    public final kj4 a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final pj2 e;
    public final pj2 f;

    public td1(Context context, pj2 pj2Var, pj2 pj2Var2) {
        vw5 vw5Var = new vw5();
        i50 i50Var = i50.a;
        vw5Var.a(bh0.class, i50Var);
        vw5Var.a(y70.class, i50Var);
        p50 p50Var = p50.a;
        vw5Var.a(de6.class, p50Var);
        vw5Var.a(da0.class, p50Var);
        j50 j50Var = j50.a;
        vw5Var.a(hj2.class, j50Var);
        vw5Var.a(z70.class, j50Var);
        h50 h50Var = h50.a;
        vw5Var.a(ck.class, h50Var);
        vw5Var.a(w70.class, h50Var);
        o50 o50Var = o50.a;
        vw5Var.a(ae6.class, o50Var);
        vw5Var.a(ca0.class, o50Var);
        k50 k50Var = k50.a;
        vw5Var.a(bq2.class, k50Var);
        vw5Var.a(a80.class, k50Var);
        n50 n50Var = n50.a;
        vw5Var.a(d84.class, n50Var);
        vw5Var.a(v90.class, n50Var);
        m50 m50Var = m50.a;
        vw5Var.a(c84.class, m50Var);
        vw5Var.a(u90.class, m50Var);
        q50 q50Var = q50.a;
        vw5Var.a(hl7.class, q50Var);
        vw5Var.a(fa0.class, q50Var);
        l50 l50Var = l50.a;
        vw5Var.a(f74.class, l50Var);
        vw5Var.a(t90.class, l50Var);
        vw5Var.d = true;
        this.a = new kj4(vw5Var, (byte) 10);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(q51.c);
        this.e = pj2Var2;
        this.f = pj2Var;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(c00.i("Invalid url: ", str), e);
        }
    }

    public final defpackage.r90 a(defpackage.r90 r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.td1.a(r90):r90");
    }
}
