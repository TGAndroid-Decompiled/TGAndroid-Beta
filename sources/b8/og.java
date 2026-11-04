package b8;

import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public abstract class og {
    public static ng f2997a;

    public static p2.v a(i2.h hVar, String str, byte[] bArr, Map map) {
        Map map2;
        List list;
        i2.c0 c0Var = new i2.c0(hVar);
        Map map3 = Collections.EMPTY_MAP;
        Uri parse = Uri.parse(str);
        zb.k(parse, "The uri must be set.");
        i2.n nVar = new i2.n(parse, 2, bArr, map, 0L, -1L, null, 1);
        int i3 = 0;
        i2.n nVar2 = nVar;
        while (true) {
            try {
                i2.l lVar = new i2.l(c0Var, nVar2);
                try {
                    byte[] b10 = h9.f.b(lVar);
                    w2.u uVar = new w2.u(nVar, c0Var.f14529c, c0Var.d, SystemClock.elapsedRealtime(), 0L, b10.length);
                    m2.t tVar = new m2.t(b10);
                    tVar.f19007c = uVar;
                    p2.v vVar = new p2.v(tVar);
                    String str2 = g2.n0.f11873a;
                    try {
                        lVar.close();
                    } catch (IOException unused) {
                    }
                    return vVar;
                } catch (i2.y e10) {
                    int i10 = e10.f14601c;
                    String str3 = null;
                    if ((i10 == 307 || i10 == 308) && i3 < 5 && (map2 = e10.d) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                        str3 = (String) list.get(0);
                    }
                    if (str3 != null) {
                        i3++;
                        i2.m a10 = nVar2.a();
                        a10.f14560e = Uri.parse(str3);
                        nVar2 = a10.d();
                        String str4 = g2.n0.f11873a;
                        try {
                            lVar.close();
                        } catch (IOException unused2) {
                        }
                    } else {
                        throw e10;
                    }
                }
            } catch (Exception e11) {
                throw new p2.w(nVar, c0Var.f14529c, c0Var.f14527a.getResponseHeaders(), c0Var.f14528b, e11);
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

    public static synchronized hg d(zf zfVar) {
        hg hgVar;
        synchronized (og.class) {
            try {
                if (f2997a == null) {
                    f2997a = new ng(0);
                }
                hgVar = (hg) f2997a.R0(zfVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hgVar;
    }

    public static synchronized hg e() {
        hg d;
        synchronized (og.class) {
            byte b10 = (byte) (((byte) 1) | 2);
            if (b10 == 3) {
                d = d(new Object());
            } else {
                StringBuilder sb2 = new StringBuilder();
                if ((b10 & 1) == 0) {
                    sb2.append(" enableFirelog");
                }
                if ((b10 & 2) == 0) {
                    sb2.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
            }
        }
        return d;
    }
}
