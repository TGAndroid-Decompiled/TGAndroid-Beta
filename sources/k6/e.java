package k6;

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
import f7.v;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import z5.l;
public final class e {
    public static Boolean d = null;
    public static String f13452e = null;
    public static boolean f13453f = false;
    public static int f13454g = -1;
    public static Boolean h;
    public static j f13458l;
    public static k f13459m;
    public final Context f13460a;
    public static final ThreadLocal f13455i = new ThreadLocal();
    public static final cd.b f13456j = new cd.b(2);
    public static final v f13457k = new v(10);
    public static final x9.d f13450b = new x9.d(10);
    public static final ya.a f13451c = new ya.a(10);

    public e(Context context) {
        this.f13460a = context;
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
        j6.a U0;
        e eVar2;
        k kVar;
        boolean z10;
        j6.a U02;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            ThreadLocal threadLocal = f13455i;
            i iVar = (i) threadLocal.get();
            ?? obj = new Object();
            threadLocal.set(obj);
            cd.b bVar = f13456j;
            Long l10 = (Long) bVar.get();
            long longValue = l10.longValue();
            try {
                bVar.set(Long.valueOf(SystemClock.uptimeMillis()));
                c8.a z11 = dVar.z(context, str, f13457k);
                j10 = longValue;
                try {
                    int i10 = z11.f3002a;
                    int i11 = z11.f3003b;
                    Log.i("DynamiteModule", "Considering local module " + str + ":" + i10 + " and remote module " + str + ":" + i11);
                    int i12 = z11.f3004c;
                    if (i12 != 0) {
                        if (i12 == -1) {
                            if (z11.f3002a != 0) {
                                i12 = -1;
                            }
                        }
                        if (i12 != 1 || z11.f3003b != 0) {
                            if (i12 == -1) {
                                Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                                eVar = new e(applicationContext);
                            } else if (i12 == 1) {
                                try {
                                    int i13 = z11.f3003b;
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
                                                Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i13);
                                                synchronized (e.class) {
                                                    kVar = f13459m;
                                                }
                                                if (kVar != null) {
                                                    i iVar2 = (i) threadLocal.get();
                                                    if (iVar2 != null && iVar2.f13463a != null) {
                                                        Context applicationContext2 = context.getApplicationContext();
                                                        Cursor cursor = iVar2.f13463a;
                                                        new j6.b(null);
                                                        synchronized (e.class) {
                                                            if (f13454g >= 2) {
                                                                z10 = true;
                                                            } else {
                                                                z10 = false;
                                                            }
                                                        }
                                                        if (z10) {
                                                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                            U02 = kVar.V0(new j6.b(applicationContext2), str, i13, new j6.b(cursor));
                                                        } else {
                                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                            U02 = kVar.U0(new j6.b(applicationContext2), str, i13, new j6.b(cursor));
                                                        }
                                                        Context context2 = (Context) j6.b.K0(U02);
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
                                                Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i13);
                                                j h10 = h(context);
                                                if (h10 != null) {
                                                    Parcel K0 = h10.K0(h10.M0(), 6);
                                                    int readInt = K0.readInt();
                                                    K0.recycle();
                                                    if (readInt >= 3) {
                                                        i iVar3 = (i) threadLocal.get();
                                                        if (iVar3 != null) {
                                                            U0 = h10.V0(new j6.b(context), str, i13, new j6.b(iVar3.f13463a));
                                                        } else {
                                                            throw new Exception("No cached result cursor holder");
                                                        }
                                                    } else if (readInt == 2) {
                                                        Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                        U0 = h10.W0(new j6.b(context), str, i13);
                                                    } else {
                                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                        U0 = h10.U0(new j6.b(context), str, i13);
                                                    }
                                                    Object K02 = j6.b.K0(U0);
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
                                    } catch (Throwable th2) {
                                        throw new Exception("Failed to load remote module.", th2);
                                    }
                                } catch (b e12) {
                                    String message = e12.getMessage();
                                    Log.w("DynamiteModule", "Failed to load remote module: " + message);
                                    int i14 = z11.f3002a;
                                    if (i14 != 0 && dVar.z(context, str, new a5.c(i14)).f3004c == -1) {
                                        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                                        eVar = new e(applicationContext);
                                    } else {
                                        throw new Exception("Remote load failed. No local fallback found.", e12);
                                    }
                                }
                            } else {
                                throw new Exception("VersionPolicy returned invalid code:" + i12);
                            }
                            if (j10 == 0) {
                                f13456j.remove();
                            } else {
                                f13456j.set(l10);
                            }
                            Cursor cursor2 = obj.f13463a;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            f13455i.set(iVar);
                            return eVar;
                        }
                    }
                    int i15 = z11.f3002a;
                    int i16 = z11.f3003b;
                    throw new Exception("No acceptable module " + str + " found. Local version is " + i15 + " and remote version is " + i16 + ".");
                } catch (Throwable th3) {
                    th = th3;
                    if (j10 == 0) {
                        f13456j.remove();
                    } else {
                        f13456j.set(l10);
                    }
                    Cursor cursor3 = obj.f13463a;
                    if (cursor3 != null) {
                        cursor3.close();
                    }
                    f13455i.set(iVar);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                j10 = longValue;
            }
        } else {
            throw new Exception("null application Context");
        }
    }

    public static int d(android.content.Context r11, java.lang.String r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: k6.e.d(android.content.Context, java.lang.String, boolean):int");
    }

    public static int e(android.content.Context r12, java.lang.String r13, boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: k6.e.e(android.content.Context, java.lang.String, boolean, boolean):int");
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
                    kVar = new com.google.android.gms.internal.cast.a(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 11);
                }
            }
            f13459m = kVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new Exception("Failed to instantiate dynamite loader", e10);
        }
    }

    public static boolean g(Context context) {
        int i10;
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(h)) {
            return true;
        }
        boolean z10 = false;
        if (h == null) {
            PackageManager packageManager = context.getPackageManager();
            if (Build.VERSION.SDK_INT >= 29) {
                i10 = 268435456;
            } else {
                i10 = 0;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider("com.google.android.gms.chimera", i10);
            if (w5.e.f49769b.d(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z10 = true;
            }
            h = Boolean.valueOf(z10);
            if (z10 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f13453f = true;
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
            j jVar2 = f13458l;
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
                        jVar = new com.google.android.gms.internal.cast.a(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 11);
                    }
                }
                if (jVar != 0) {
                    f13458l = jVar;
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
            return (IBinder) this.f13460a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new Exception("Failed to instantiate module class: ".concat(str), e10);
        }
    }
}
