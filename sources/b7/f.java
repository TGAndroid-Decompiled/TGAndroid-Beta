package b7;

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
import w7.s;
public final class f {
    public static Boolean d = null;
    public static String f2996e = null;
    public static boolean f2997f = false;
    public static int f2998g = -1;
    public static Boolean h;
    public static m f3002l;
    public static n f3003m;
    public final Context f3004a;
    public static final ThreadLocal f2999i = new ThreadLocal();
    public static final j f3000j = new j(0);
    public static final qb.a f3001k = new qb.a(4);
    public static final sa.d f2994b = new sa.d(4);
    public static final s f2995c = new s(4, false);

    public f(Context context) {
        this.f3004a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 61);
            sb2.append("com.google.android.gms.dynamite.descriptors.");
            sb2.append(str);
            sb2.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb2.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!q6.m.k(declaredField.get(null), str)) {
                String valueOf = String.valueOf(declaredField.get(null));
                StringBuilder sb3 = new StringBuilder(valueOf.length() + 50 + String.valueOf(str).length() + 1);
                sb3.append("Module descriptor id '");
                sb3.append(valueOf);
                sb3.append("' didn't match expected id '");
                sb3.append(str);
                sb3.append("'");
                Log.e("DynamiteModule", sb3.toString());
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 45);
            sb4.append("Local module descriptor class for ");
            sb4.append(str);
            sb4.append(" not found.");
            Log.w("DynamiteModule", sb4.toString());
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    public static b7.f c(android.content.Context r29, b7.e r30, java.lang.String r31) {
        throw new UnsupportedOperationException("Method not decompiled: b7.f.c(android.content.Context, b7.e, java.lang.String):b7.f");
    }

    public static int d(android.content.Context r13, java.lang.String r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: b7.f.d(android.content.Context, java.lang.String, boolean):int");
    }

    public static boolean e(Context context) {
        int i7;
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(h)) {
            return true;
        }
        boolean z9 = false;
        if (h == null) {
            PackageManager packageManager = context.getPackageManager();
            if (Build.VERSION.SDK_INT >= 29) {
                i7 = 268435456;
            } else {
                i7 = 0;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider("com.google.android.gms.chimera", i7);
            if (n6.e.f20501b.d(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z9 = true;
            }
            h = Boolean.valueOf(z9);
            if (z9 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f2997f = true;
            }
        }
        if (!z9) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z9;
    }

    public static int f(android.content.Context r14, java.lang.String r15, boolean r16, boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: b7.f.f(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    public static void g(ClassLoader classLoader) {
        try {
            n nVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof n) {
                    nVar = (n) queryLocalInterface;
                } else {
                    nVar = new a8.a(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 9);
                }
            }
            f3003m = nVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new Exception("Failed to instantiate dynamite loader", e10);
        }
    }

    public static m h(Context context) {
        m mVar;
        synchronized (f.class) {
            m mVar2 = f3002l;
            if (mVar2 != null) {
                return mVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    mVar = 0;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof m) {
                        mVar = (m) queryLocalInterface;
                    } else {
                        mVar = new a8.a(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 9);
                    }
                }
                if (mVar != 0) {
                    f3002l = mVar;
                    return mVar;
                }
            } catch (Exception e10) {
                String message = e10.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 45);
                sb2.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb2.append(message);
                Log.e("DynamiteModule", sb2.toString());
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.f3004a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new Exception("Failed to instantiate module class: ".concat(str), e10);
        }
    }
}
