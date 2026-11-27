package defpackage;

import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public abstract class ije {
    public static ps6 a(h73 h73Var, String str, byte[] bArr, Map map) {
        Throwable th;
        Map map2;
        List list;
        byte[] b;
        n73 n73Var;
        b2b b2bVar = new b2b(h73Var);
        Map map3 = Collections.EMPTY_MAP;
        Uri parse = Uri.parse(str);
        yve.l(parse, "The uri must be set.");
        n73 n73Var2 = new n73(parse, 2, bArr, map, 0L, -1L, null, 1);
        int i = 0;
        n73 n73Var3 = n73Var2;
        while (true) {
            try {
                l73 l73Var = new l73(b2bVar, n73Var3);
                try {
                    b = j51.b(l73Var);
                    n73Var = n73Var2;
                } catch (ni5 e) {
                    e = e;
                }
                try {
                    ia6 ia6Var = new ia6(-1L, n73Var, SystemClock.elapsedRealtime());
                    ia6Var.d = b2bVar.c;
                    ia6Var.e = b2bVar.d;
                    ia6Var.g = b.length;
                    ja6 ja6Var = new ja6(ia6Var);
                    ym4 ym4Var = new ym4(b);
                    ym4Var.c = ja6Var;
                    ps6 ps6Var = new ps6(ym4Var);
                    String str2 = gcc.a;
                    try {
                        l73Var.close();
                    } catch (IOException unused) {
                    }
                    return ps6Var;
                } catch (ni5 e2) {
                    e = e2;
                    n73Var2 = n73Var;
                    try {
                        int i2 = e.c;
                        String str3 = null;
                        if ((i2 == 307 || i2 == 308) && i < 5 && (map2 = e.d) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                            str3 = (String) list.get(0);
                        }
                        if (str3 != null) {
                            i++;
                            m73 a = n73Var3.a();
                            a.a = Uri.parse(str3);
                            n73Var3 = a.a();
                            String str4 = gcc.a;
                            try {
                                l73Var.close();
                            } catch (IOException unused2) {
                            }
                        } else {
                            throw e;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        Throwable th3 = th;
                        String str5 = gcc.a;
                        try {
                            l73Var.close();
                        } catch (IOException unused3) {
                        }
                        throw th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    Throwable th32 = th;
                    String str52 = gcc.a;
                    l73Var.close();
                    throw th32;
                }
            } catch (Exception e3) {
                throw new qs6(n73Var2, b2bVar.c, b2bVar.a.getResponseHeaders(), b2bVar.b, e3);
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
