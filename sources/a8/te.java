package a8;

import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public abstract class te {
    public static n2.v a(g2.h hVar, String str, byte[] bArr, Map map) {
        Map map2;
        List list;
        g2.b0 b0Var = new g2.b0(hVar);
        Map map3 = Collections.EMPTY_MAP;
        Uri parse = Uri.parse(str);
        yb.l(parse, "The uri must be set.");
        g2.m mVar = new g2.m(parse, 2, bArr, map, 0L, -1L, null, 1);
        int i10 = 0;
        g2.m mVar2 = mVar;
        while (true) {
            try {
                g2.k kVar = new g2.k(b0Var, mVar2);
                try {
                    byte[] b10 = g9.f.b(kVar);
                    u2.u uVar = new u2.u(mVar, b0Var.f12230c, b0Var.d, SystemClock.elapsedRealtime(), 0L, b10.length);
                    m4.w1 w1Var = new m4.w1(b10);
                    w1Var.f18293c = uVar;
                    n2.v vVar = new n2.v(w1Var);
                    String str2 = e2.n0.f9691a;
                    try {
                        kVar.close();
                    } catch (IOException unused) {
                    }
                    return vVar;
                } catch (g2.x e) {
                    int i11 = e.f12288c;
                    String str3 = null;
                    if ((i11 == 307 || i11 == 308) && i10 < 5 && (map2 = e.d) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                        str3 = (String) list.get(0);
                    }
                    if (str3 != null) {
                        i10++;
                        g2.l a2 = mVar2.a();
                        a2.e = Uri.parse(str3);
                        mVar2 = a2.d();
                        String str4 = e2.n0.f9691a;
                        try {
                            kVar.close();
                        } catch (IOException unused2) {
                        }
                    } else {
                        throw e;
                    }
                }
            } catch (Exception e10) {
                throw new n2.w(mVar, b0Var.f12230c, b0Var.f12228a.getResponseHeaders(), b0Var.f12229b, e10);
            }
        }
    }

    public static boolean b(Throwable th2) {
        if (Build.VERSION.SDK_INT == 34 && (th2 instanceof NoSuchMethodError) && th2.getMessage() != null && th2.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(")) {
            return true;
        }
        return false;
    }

    public static boolean c(Throwable th2) {
        if (Build.VERSION.SDK_INT == 34 && (th2 instanceof NoSuchMethodError) && th2.getMessage() != null && th2.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(")) {
            return true;
        }
        return false;
    }
}
