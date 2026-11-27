package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
public final class h5c {
    public static volatile u53 e;
    public final pj2 a;
    public final pj2 b;
    public final rc3 c;
    public final ba0 d;

    public h5c(pj2 pj2Var, pj2 pj2Var2, rc3 rc3Var, ba0 ba0Var, u8a u8aVar) {
        this.a = pj2Var;
        this.b = pj2Var2;
        this.c = rc3Var;
        this.d = ba0Var;
        ((Executor) u8aVar.a).execute(new olc(u8aVar, (byte) 27));
    }

    public static h5c a() {
        u53 u53Var = e;
        if (u53Var != null) {
            return (h5c) u53Var.f.mo21get();
        }
        grb.i("Not initialized!");
        return null;
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (h5c.class) {
                if (e == null) {
                    z8d z8dVar = new z8d((byte) 24);
                    context.getClass();
                    z8dVar.b = context;
                    e = z8dVar.W0();
                }
            }
        }
    }

    public final f5c c(q51 q51Var) {
        Set singleton;
        byte[] bytes;
        if (ik8.A(q51Var)) {
            singleton = DesugarCollections.unmodifiableSet(q51.d);
        } else {
            singleton = Collections.singleton(new n34("proto"));
        }
        rx6 a = ta0.a();
        q51Var.getClass();
        a.b = "cct";
        String str = q51Var.a;
        String str2 = q51Var.b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = qd4.q("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a.c = bytes;
        return new f5c(singleton, a.t(), this);
    }
}
