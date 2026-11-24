package defpackage;

import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public abstract class ree {
    public static lq6 a(o63 o63Var, String str, byte[] bArr, Map map) {
        Throwable th;
        Map map2;
        List list;
        byte[] b;
        u63 u63Var;
        zxa zxaVar = new zxa(o63Var);
        Map map3 = Collections.EMPTY_MAP;
        Uri parse = Uri.parse(str);
        gre.l(parse, "The uri must be set.");
        u63 u63Var2 = new u63(parse, 2, bArr, map, 0L, -1L, null, 1);
        int i = 0;
        u63 u63Var3 = u63Var2;
        while (true) {
            try {
                s63 s63Var = new s63(zxaVar, u63Var3);
                try {
                    b = b51.b(s63Var);
                    u63Var = u63Var2;
                } catch (lg5 e) {
                    e = e;
                }
                try {
                    e86 e86Var = new e86(-1L, u63Var, SystemClock.elapsedRealtime());
                    e86Var.d = zxaVar.c;
                    e86Var.e = zxaVar.d;
                    e86Var.g = b.length;
                    f86 f86Var = new f86(e86Var);
                    sk4 sk4Var = new sk4(b);
                    sk4Var.c = f86Var;
                    lq6 lq6Var = new lq6(sk4Var);
                    String str2 = g8c.a;
                    try {
                        s63Var.close();
                    } catch (IOException unused) {
                    }
                    return lq6Var;
                } catch (lg5 e2) {
                    e = e2;
                    u63Var2 = u63Var;
                    try {
                        int i2 = e.c;
                        String str3 = null;
                        if ((i2 == 307 || i2 == 308) && i < 5 && (map2 = e.d) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                            str3 = (String) list.get(0);
                        }
                        if (str3 != null) {
                            i++;
                            t63 a = u63Var3.a();
                            a.a = Uri.parse(str3);
                            u63Var3 = a.a();
                            String str4 = g8c.a;
                            try {
                                s63Var.close();
                            } catch (IOException unused2) {
                            }
                        } else {
                            throw e;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        Throwable th3 = th;
                        String str5 = g8c.a;
                        try {
                            s63Var.close();
                        } catch (IOException unused3) {
                        }
                        throw th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    Throwable th32 = th;
                    String str52 = g8c.a;
                    s63Var.close();
                    throw th32;
                }
            } catch (Exception e3) {
                throw new mq6(u63Var2, zxaVar.c, zxaVar.a.getResponseHeaders(), zxaVar.b, e3);
            }
        }
    }

    public static boolean b(Throwable th) {
        if (Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(")) {
            return true;
        }
        return false;
    }

    public static boolean c(Throwable th) {
        if (Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(")) {
            return true;
        }
        return false;
    }
}
