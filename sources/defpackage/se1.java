package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;
public final class se1 implements e3c {
    public final lj4 a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final hk2 e;
    public final hk2 f;

    public se1(Context context, hk2 hk2Var, hk2 hk2Var2) {
        qw5 qw5Var = new qw5();
        g60 g60Var = g60.a;
        qw5Var.a(ai0.class, g60Var);
        qw5Var.a(w80.class, g60Var);
        n60 n60Var = n60.a;
        qw5Var.a(yd6.class, n60Var);
        qw5Var.a(bb0.class, n60Var);
        h60 h60Var = h60.a;
        qw5Var.a(zj2.class, h60Var);
        qw5Var.a(x80.class, h60Var);
        f60 f60Var = f60.a;
        qw5Var.a(bl.class, f60Var);
        qw5Var.a(u80.class, f60Var);
        m60 m60Var = m60.a;
        qw5Var.a(vd6.class, m60Var);
        qw5Var.a(ab0.class, m60Var);
        i60 i60Var = i60.a;
        qw5Var.a(tq2.class, i60Var);
        qw5Var.a(y80.class, i60Var);
        l60 l60Var = l60.a;
        qw5Var.a(r84.class, l60Var);
        qw5Var.a(ta0.class, l60Var);
        k60 k60Var = k60.a;
        qw5Var.a(q84.class, k60Var);
        qw5Var.a(sa0.class, k60Var);
        o60 o60Var = o60.a;
        qw5Var.a(al7.class, o60Var);
        qw5Var.a(db0.class, o60Var);
        j60 j60Var = j60.a;
        qw5Var.a(u74.class, j60Var);
        qw5Var.a(ra0.class, j60Var);
        qw5Var.d = true;
        this.a = new lj4(qw5Var);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(p61.c);
        this.e = hk2Var2;
        this.f = hk2Var;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(b10.h("Invalid url: ", str), e);
        }
    }

    public final defpackage.pa0 a(defpackage.pa0 r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.se1.a(pa0):pa0");
    }
}
