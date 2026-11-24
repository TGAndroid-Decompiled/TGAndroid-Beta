package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;
public final class kd1 implements e1c {
    public final gi3 a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final ti2 e;
    public final ti2 f;

    public kd1(Context context, ti2 ti2Var, ti2 ti2Var2) {
        qu5 qu5Var = new qu5();
        g50 g50Var = g50.a;
        qu5Var.a(ah0.class, g50Var);
        qu5Var.a(w70.class, g50Var);
        n50 n50Var = n50.a;
        qu5Var.a(zb6.class, n50Var);
        qu5Var.a(ba0.class, n50Var);
        h50 h50Var = h50.a;
        qu5Var.a(li2.class, h50Var);
        qu5Var.a(x70.class, h50Var);
        f50 f50Var = f50.a;
        qu5Var.a(bk.class, f50Var);
        qu5Var.a(u70.class, f50Var);
        m50 m50Var = m50.a;
        qu5Var.a(wb6.class, m50Var);
        qu5Var.a(aa0.class, m50Var);
        i50 i50Var = i50.a;
        qu5Var.a(ip2.class, i50Var);
        qu5Var.a(y70.class, i50Var);
        l50 l50Var = l50.a;
        qu5Var.a(i74.class, l50Var);
        qu5Var.a(t90.class, l50Var);
        k50 k50Var = k50.a;
        qu5Var.a(h74.class, k50Var);
        qu5Var.a(s90.class, k50Var);
        o50 o50Var = o50.a;
        qu5Var.a(yi7.class, o50Var);
        qu5Var.a(da0.class, o50Var);
        j50 j50Var = j50.a;
        qu5Var.a(l64.class, j50Var);
        qu5Var.a(r90.class, j50Var);
        qu5Var.d = true;
        this.a = new gi3(qu5Var);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(i51.c);
        this.e = ti2Var2;
        this.f = ti2Var;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(b00.h("Invalid url: ", str), e);
        }
    }

    public final defpackage.p90 a(defpackage.p90 r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kd1.a(p90):p90");
    }
}
