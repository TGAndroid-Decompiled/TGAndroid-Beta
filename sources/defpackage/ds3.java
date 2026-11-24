package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
public final class ds3 {
    public static Boolean d = null;
    public static String e = null;
    public static boolean f = false;
    public static int g = -1;
    public static Boolean h;
    public static m7f l;
    public static k9f m;
    public final Context a;
    public static final ThreadLocal i = new ThreadLocal();
    public static final a84 j = new a84((byte) 4);
    public static final jdd k = new Object();
    public static final r8d b = new Object();
    public static final lbd c = new lbd((byte) 3);

    public ds3(Context context) {
        this.a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(str.length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!cqe.a(declaredField.get(null), str)) {
                String valueOf = String.valueOf(declaredField.get(null));
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 50 + str.length() + 1);
                sb2.append("Module descriptor id '");
                sb2.append(valueOf);
                sb2.append("' didn't match expected id '");
                sb2.append(str);
                sb2.append("'");
                Log.e("DynamiteModule", sb2.toString());
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(str.length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e2) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage())));
            return 0;
        }
    }

    public static defpackage.ds3 c(android.content.Context r29, defpackage.cs3 r30, java.lang.String r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ds3.c(android.content.Context, cs3, java.lang.String):ds3");
    }

    public static int d(android.content.Context r13, java.lang.String r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ds3.d(android.content.Context, java.lang.String, boolean):int");
    }

    public static boolean e(Context context) {
        int i2;
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(h)) {
            return true;
        }
        boolean z = false;
        if (h == null) {
            PackageManager packageManager = context.getPackageManager();
            if (Build.VERSION.SDK_INT >= 29) {
                i2 = 268435456;
            } else {
                i2 = 0;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider("com.google.android.gms.chimera", i2);
            if (dy4.b.c(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            h = Boolean.valueOf(z);
            if (z && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    public static int f(android.content.Context r14, java.lang.String r15, boolean r16, boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ds3.f(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    public static void g(ClassLoader classLoader) {
        try {
            k9f k9fVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof k9f) {
                    k9fVar = (k9f) queryLocalInterface;
                } else {
                    k9fVar = new ezc(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", (byte) 4);
                }
            }
            m = k9fVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new Exception("Failed to instantiate dynamite loader", e2);
        }
    }

    public static m7f h(Context context) {
        m7f m7fVar;
        synchronized (ds3.class) {
            m7f m7fVar2 = l;
            if (m7fVar2 != null) {
                return m7fVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    m7fVar = 0;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof m7f) {
                        m7fVar = (m7f) queryLocalInterface;
                    } else {
                        m7fVar = new ezc(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", (byte) 4);
                    }
                }
                if (m7fVar != 0) {
                    l = m7fVar;
                    return m7fVar;
                }
            } catch (Exception e2) {
                String message = e2.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 45);
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
                Log.e("DynamiteModule", sb.toString());
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new Exception("Failed to instantiate module class: ".concat(str), e2);
        }
    }
}
