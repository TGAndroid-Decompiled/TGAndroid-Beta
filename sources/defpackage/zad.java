package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
public abstract class zad {
    public static final Object f = new Object();
    public static Context g;
    public static volatile Boolean h;
    public final ko9 a;
    public final String b;
    public final String c;
    public final Object d;
    public volatile iad e = null;

    public zad(ko9 ko9Var, String str, Object obj) {
        String str2;
        String str3;
        if (((Uri) ko9Var.b) != null) {
            this.a = ko9Var;
            String valueOf = String.valueOf((String) ko9Var.c);
            if (str.length() != 0) {
                str2 = valueOf.concat(str);
            } else {
                str2 = new String(valueOf);
            }
            this.c = str2;
            String valueOf2 = String.valueOf((String) ko9Var.d);
            if (str.length() != 0) {
                str3 = valueOf2.concat(str);
            } else {
                str3 = new String(valueOf2);
            }
            this.b = str3;
            this.d = obj;
            return;
        }
        lq5.j("Must pass a valid SharedPreferences file name or ContentProvider URI");
        throw null;
    }

    public static void b(Context context) {
        Context applicationContext;
        if (g == null) {
            synchronized (f) {
                if ((Build.VERSION.SDK_INT < 24 || !context.isDeviceProtectedStorage()) && (applicationContext = context.getApplicationContext()) != null) {
                    context = applicationContext;
                }
                if (g != context) {
                    h = null;
                }
                g = context;
            }
        }
    }

    public static Object c(zcd zcdVar) {
        try {
            return zcdVar.zzp();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return zcdVar.zzp();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    public static boolean e() {
        String str;
        if (h == null) {
            Context context = g;
            boolean z = false;
            if (context == null) {
                return false;
            }
            if (Binder.getCallingPid() == Process.myPid()) {
                str = context.getPackageName();
            } else {
                str = null;
            }
            if (ive.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES", Binder.getCallingPid(), Binder.getCallingUid(), str) == 0) {
                z = true;
            }
            h = Boolean.valueOf(z);
        }
        return h.booleanValue();
    }

    public final java.lang.Object a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zad.a():java.lang.Object");
    }

    public abstract Object d(String str);
}
