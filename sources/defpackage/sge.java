package defpackage;

import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public abstract class sge {
    public static ls6 a(a83 a83Var, String str, byte[] bArr, Map map) {
        Throwable th;
        Map map2;
        List list;
        byte[] b;
        g83 g83Var;
        c0b c0bVar = new c0b(a83Var);
        Map map3 = Collections.EMPTY_MAP;
        Uri parse = Uri.parse(str);
        jte.l(parse, "The uri must be set.");
        g83 g83Var2 = new g83(parse, 2, bArr, map, 0L, -1L, null, 1);
        int i = 0;
        g83 g83Var3 = g83Var2;
        while (true) {
            try {
                e83 e83Var = new e83(c0bVar, g83Var3);
                try {
                    b = i61.b(e83Var);
                    g83Var = g83Var2;
                } catch (ki5 e) {
                    e = e;
                }
                try {
                    da6 da6Var = new da6(-1L, g83Var, SystemClock.elapsedRealtime());
                    da6Var.d = c0bVar.c;
                    da6Var.e = c0bVar.d;
                    da6Var.g = b.length;
                    ea6 ea6Var = new ea6(da6Var);
                    mj4 mj4Var = new mj4(b);
                    mj4Var.c = ea6Var;
                    ls6 ls6Var = new ls6(mj4Var);
                    String str2 = hac.a;
                    try {
                        e83Var.close();
                    } catch (IOException unused) {
                    }
                    return ls6Var;
                } catch (ki5 e2) {
                    e = e2;
                    g83Var2 = g83Var;
                    try {
                        int i2 = e.c;
                        String str3 = null;
                        if ((i2 == 307 || i2 == 308) && i < 5 && (map2 = e.d) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                            str3 = (String) list.get(0);
                        }
                        if (str3 != null) {
                            i++;
                            f83 a = g83Var3.a();
                            a.a = Uri.parse(str3);
                            g83Var3 = a.a();
                            String str4 = hac.a;
                            try {
                                e83Var.close();
                            } catch (IOException unused2) {
                            }
                        } else {
                            throw e;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        Throwable th3 = th;
                        String str5 = hac.a;
                        try {
                            e83Var.close();
                        } catch (IOException unused3) {
                        }
                        throw th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    Throwable th32 = th;
                    String str52 = hac.a;
                    e83Var.close();
                    throw th32;
                }
            } catch (Exception e3) {
                throw new ms6(g83Var2, c0bVar.c, c0bVar.a.getResponseHeaders(), c0bVar.b, e3);
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
