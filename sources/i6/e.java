package i6;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import d7.u;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import x5.l;
public final class e {
    public static Boolean d = null;
    public static String f10929e = null;
    public static boolean f10930f = false;
    public static int f10931g = -1;
    public static Boolean h;
    public static j f10935l;
    public static k f10936m;
    public final Context f10937a;
    public static final ThreadLocal f10932i = new ThreadLocal();
    public static final ad.b f10933j = new ad.b(2);
    public static final ya.b f10934k = new ya.b(9);
    public static final za.a f10927b = new za.a(9);
    public static final u f10928c = new u(10);

    public e(Context context) {
        this.f10937a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!l.l(declaredField.get(null), str)) {
                String valueOf = String.valueOf(declaredField.get(null));
                Log.e("DynamiteModule", "Module descriptor id '" + valueOf + "' didn't match expected id '" + str + "'");
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    public static e c(Context context, d dVar, String str) {
        long j10;
        e eVar;
        Boolean bool;
        h6.a U0;
        e eVar2;
        k kVar;
        boolean z10;
        h6.a U02;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            ThreadLocal threadLocal = f10932i;
            i iVar = (i) threadLocal.get();
            ?? obj = new Object();
            threadLocal.set(obj);
            ad.b bVar = f10933j;
            Long l10 = (Long) bVar.get();
            long longValue = l10.longValue();
            try {
                bVar.set(Long.valueOf(SystemClock.uptimeMillis()));
                a8.b K = dVar.K(context, str, f10934k);
                j10 = longValue;
                try {
                    int i9 = K.f109a;
                    int i10 = K.f110b;
                    Log.i("DynamiteModule", "Considering local module " + str + ":" + i9 + " and remote module " + str + ":" + i10);
                    int i11 = K.f111c;
                    if (i11 != 0) {
                        if (i11 == -1) {
                            if (K.f109a != 0) {
                                i11 = -1;
                            }
                        }
                        if (i11 != 1 || K.f110b != 0) {
                            if (i11 == -1) {
                                Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                                eVar = new e(applicationContext);
                            } else if (i11 == 1) {
                                try {
                                    int i12 = K.f110b;
                                    try {
                                        synchronized (e.class) {
                                            if (g(context)) {
                                                bool = d;
                                            } else {
                                                throw new Exception("Remote loading disabled");
                                            }
                                        }
                                        if (bool != null) {
                                            if (bool.booleanValue()) {
                                                Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i12);
                                                synchronized (e.class) {
                                                    kVar = f10936m;
                                                }
                                                if (kVar != null) {
                                                    i iVar2 = (i) threadLocal.get();
                                                    if (iVar2 != null && iVar2.f10940a != null) {
                                                        Context applicationContext2 = context.getApplicationContext();
                                                        Cursor cursor = iVar2.f10940a;
                                                        new h6.b(null);
                                                        synchronized (e.class) {
                                                            if (f10931g >= 2) {
                                                                z10 = true;
                                                            } else {
                                                                z10 = false;
                                                            }
                                                        }
                                                        if (z10) {
                                                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                            U02 = kVar.V0(new h6.b(applicationContext2), str, i12, new h6.b(cursor));
                                                        } else {
                                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                            U02 = kVar.U0(new h6.b(applicationContext2), str, i12, new h6.b(cursor));
                                                        }
                                                        Context context2 = (Context) h6.b.K0(U02);
                                                        if (context2 != null) {
                                                            eVar2 = new e(context2);
                                                        } else {
                                                            throw new Exception("Failed to get module context");
                                                        }
                                                    } else {
                                                        throw new Exception("No result cursor");
                                                    }
                                                } else {
                                                    throw new Exception("DynamiteLoaderV2 was not cached.");
                                                }
                                            } else {
                                                Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i12);
                                                j h10 = h(context);
                                                if (h10 != null) {
                                                    Parcel K0 = h10.K0(h10.M0(), 6);
                                                    int readInt = K0.readInt();
                                                    K0.recycle();
                                                    if (readInt >= 3) {
                                                        i iVar3 = (i) threadLocal.get();
                                                        if (iVar3 != null) {
                                                            U0 = h10.V0(new h6.b(context), str, i12, new h6.b(iVar3.f10940a));
                                                        } else {
                                                            throw new Exception("No cached result cursor holder");
                                                        }
                                                    } else if (readInt == 2) {
                                                        Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                        U0 = h10.W0(new h6.b(context), str, i12);
                                                    } else {
                                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                        U0 = h10.U0(new h6.b(context), str, i12);
                                                    }
                                                    Object K02 = h6.b.K0(U0);
                                                    if (K02 != null) {
                                                        eVar2 = new e((Context) K02);
                                                    } else {
                                                        throw new Exception("Failed to load remote module.");
                                                    }
                                                } else {
                                                    throw new Exception("Failed to create IDynamiteLoader.");
                                                }
                                            }
                                            eVar = eVar2;
                                        } else {
                                            throw new Exception("Failed to determine which loading route to use.");
                                        }
                                    } catch (RemoteException e10) {
                                        throw new Exception("Failed to load remote module.", e10);
                                    } catch (b e11) {
                                        throw e11;
                                    } catch (Throwable th) {
                                        throw new Exception("Failed to load remote module.", th);
                                    }
                                } catch (b e12) {
                                    String message = e12.getMessage();
                                    Log.w("DynamiteModule", "Failed to load remote module: " + message);
                                    int i13 = K.f109a;
                                    if (i13 != 0 && dVar.K(context, str, new com.google.android.gms.internal.cast.a(i13)).f111c == -1) {
                                        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                                        eVar = new e(applicationContext);
                                    } else {
                                        throw new Exception("Remote load failed. No local fallback found.", e12);
                                    }
                                }
                            } else {
                                throw new Exception("VersionPolicy returned invalid code:" + i11);
                            }
                            if (j10 == 0) {
                                f10933j.remove();
                            } else {
                                f10933j.set(l10);
                            }
                            Cursor cursor2 = obj.f10940a;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            f10932i.set(iVar);
                            return eVar;
                        }
                    }
                    int i14 = K.f109a;
                    int i15 = K.f110b;
                    throw new Exception("No acceptable module " + str + " found. Local version is " + i14 + " and remote version is " + i15 + ".");
                } catch (Throwable th2) {
                    th = th2;
                    if (j10 == 0) {
                        f10933j.remove();
                    } else {
                        f10933j.set(l10);
                    }
                    Cursor cursor3 = obj.f10940a;
                    if (cursor3 != null) {
                        cursor3.close();
                    }
                    f10932i.set(iVar);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                j10 = longValue;
            }
        } else {
            throw new Exception("null application Context");
        }
    }

    public static int d(android.content.Context r11, java.lang.String r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: i6.e.d(android.content.Context, java.lang.String, boolean):int");
    }

    public static int e(android.content.Context r12, java.lang.String r13, boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: i6.e.e(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    public static void f(ClassLoader classLoader) {
        try {
            k kVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof k) {
                    kVar = (k) queryLocalInterface;
                } else {
                    kVar = new b7.a(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 11);
                }
            }
            f10936m = kVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new Exception("Failed to instantiate dynamite loader", e10);
        }
    }

    public static boolean g(Context context) {
        int i9;
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(h)) {
            return true;
        }
        boolean z10 = false;
        if (h == null) {
            PackageManager packageManager = context.getPackageManager();
            if (Build.VERSION.SDK_INT >= 29) {
                i9 = 268435456;
            } else {
                i9 = 0;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider("com.google.android.gms.chimera", i9);
            if (u5.e.f48110b.d(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z10 = true;
            }
            h = Boolean.valueOf(z10);
            if (z10 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f10930f = true;
            }
        }
        if (!z10) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z10;
    }

    public static j h(Context context) {
        j jVar;
        synchronized (e.class) {
            j jVar2 = f10935l;
            if (jVar2 != null) {
                return jVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    jVar = 0;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof j) {
                        jVar = (j) queryLocalInterface;
                    } else {
                        jVar = new b7.a(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 11);
                    }
                }
                if (jVar != 0) {
                    f10935l = jVar;
                    return jVar;
                }
            } catch (Exception e10) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e10.getMessage());
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.f10937a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new Exception("Failed to instantiate module class: ".concat(str), e10);
        }
    }
}
