package m6;

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
import b6.m;
import com.google.android.gms.common.api.internal.o1;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
public final class e {
    public static Boolean d = null;
    public static String f13468e = null;
    public static boolean f13469f = false;
    public static int f13470g = -1;
    public static Boolean h;
    public static j f13474l;
    public static k f13475m;
    public final Context f13476a;
    public static final ThreadLocal f13471i = new ThreadLocal();
    public static final o1 f13472j = new o1(2);
    public static final z9.d f13473k = new z9.d(11);
    public static final ab.a f13466b = new ab.a(12);
    public static final cb.b f13467c = new cb.b(12);

    public e(Context context) {
        this.f13476a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!m.l(declaredField.get(null), str)) {
                String valueOf = String.valueOf(declaredField.get(null));
                Log.e("DynamiteModule", "Module descriptor id '" + valueOf + "' didn't match expected id '" + str + "'");
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e6) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e6.getMessage())));
            return 0;
        }
    }

    public static e c(Context context, d dVar, String str) {
        long j10;
        e eVar;
        Boolean bool;
        l6.a U0;
        e eVar2;
        k kVar;
        boolean z4;
        l6.a U02;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            ThreadLocal threadLocal = f13471i;
            i iVar = (i) threadLocal.get();
            ?? obj = new Object();
            threadLocal.set(obj);
            o1 o1Var = f13472j;
            Long l10 = (Long) o1Var.get();
            long longValue = l10.longValue();
            try {
                o1Var.set(Long.valueOf(SystemClock.uptimeMillis()));
                e8.a k10 = dVar.k(context, str, f13473k);
                j10 = longValue;
                try {
                    int i10 = k10.f4995a;
                    int i11 = k10.f4996b;
                    Log.i("DynamiteModule", "Considering local module " + str + ":" + i10 + " and remote module " + str + ":" + i11);
                    int i12 = k10.f4997c;
                    if (i12 != 0) {
                        if (i12 == -1) {
                            if (k10.f4995a != 0) {
                                i12 = -1;
                            }
                        }
                        if (i12 != 1 || k10.f4996b != 0) {
                            if (i12 == -1) {
                                Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                                eVar = new e(applicationContext);
                            } else if (i12 == 1) {
                                try {
                                    int i13 = k10.f4996b;
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
                                                    kVar = f13475m;
                                                }
                                                if (kVar != null) {
                                                    i iVar2 = (i) threadLocal.get();
                                                    if (iVar2 != null && iVar2.f13479a != null) {
                                                        Context applicationContext2 = context.getApplicationContext();
                                                        Cursor cursor = iVar2.f13479a;
                                                        new l6.b(null);
                                                        synchronized (e.class) {
                                                            if (f13470g >= 2) {
                                                                z4 = true;
                                                            } else {
                                                                z4 = false;
                                                            }
                                                        }
                                                        if (z4) {
                                                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                            U02 = kVar.V0(new l6.b(applicationContext2), str, i13, new l6.b(cursor));
                                                        } else {
                                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                            U02 = kVar.U0(new l6.b(applicationContext2), str, i13, new l6.b(cursor));
                                                        }
                                                        Context context2 = (Context) l6.b.K0(U02);
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
                                                j h9 = h(context);
                                                if (h9 != null) {
                                                    Parcel K0 = h9.K0(h9.M0(), 6);
                                                    int readInt = K0.readInt();
                                                    K0.recycle();
                                                    if (readInt >= 3) {
                                                        i iVar3 = (i) threadLocal.get();
                                                        if (iVar3 != null) {
                                                            U0 = h9.V0(new l6.b(context), str, i13, new l6.b(iVar3.f13479a));
                                                        } else {
                                                            throw new Exception("No cached result cursor holder");
                                                        }
                                                    } else if (readInt == 2) {
                                                        Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                        U0 = h9.W0(new l6.b(context), str, i13);
                                                    } else {
                                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                        U0 = h9.U0(new l6.b(context), str, i13);
                                                    }
                                                    Object K02 = l6.b.K0(U0);
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
                                    } catch (RemoteException e6) {
                                        throw new Exception("Failed to load remote module.", e6);
                                    } catch (b e10) {
                                        throw e10;
                                    } catch (Throwable th2) {
                                        throw new Exception("Failed to load remote module.", th2);
                                    }
                                } catch (b e11) {
                                    String message = e11.getMessage();
                                    Log.w("DynamiteModule", "Failed to load remote module: " + message);
                                    int i14 = k10.f4995a;
                                    if (i14 != 0 && dVar.k(context, str, new c5.c(i14)).f4997c == -1) {
                                        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                                        eVar = new e(applicationContext);
                                    } else {
                                        throw new Exception("Remote load failed. No local fallback found.", e11);
                                    }
                                }
                            } else {
                                throw new Exception("VersionPolicy returned invalid code:" + i12);
                            }
                            if (j10 == 0) {
                                f13472j.remove();
                            } else {
                                f13472j.set(l10);
                            }
                            Cursor cursor2 = obj.f13479a;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            f13471i.set(iVar);
                            return eVar;
                        }
                    }
                    int i15 = k10.f4995a;
                    int i16 = k10.f4996b;
                    throw new Exception("No acceptable module " + str + " found. Local version is " + i15 + " and remote version is " + i16 + ".");
                } catch (Throwable th3) {
                    th = th3;
                    if (j10 == 0) {
                        f13472j.remove();
                    } else {
                        f13472j.set(l10);
                    }
                    Cursor cursor3 = obj.f13479a;
                    if (cursor3 != null) {
                        cursor3.close();
                    }
                    f13471i.set(iVar);
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
        throw new UnsupportedOperationException("Method not decompiled: m6.e.d(android.content.Context, java.lang.String, boolean):int");
    }

    public static int e(android.content.Context r12, java.lang.String r13, boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: m6.e.e(android.content.Context, java.lang.String, boolean, boolean):int");
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
                    kVar = new a7.a(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 0);
                }
            }
            f13475m = kVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e6) {
            throw new Exception("Failed to instantiate dynamite loader", e6);
        }
    }

    public static boolean g(Context context) {
        int i10;
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(h)) {
            return true;
        }
        boolean z4 = false;
        if (h == null) {
            PackageManager packageManager = context.getPackageManager();
            if (Build.VERSION.SDK_INT >= 29) {
                i10 = 268435456;
            } else {
                i10 = 0;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider("com.google.android.gms.chimera", i10);
            if (y5.e.f50768b.d(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z4 = true;
            }
            h = Boolean.valueOf(z4);
            if (z4 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f13469f = true;
            }
        }
        if (!z4) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z4;
    }

    public static j h(Context context) {
        j jVar;
        synchronized (e.class) {
            j jVar2 = f13474l;
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
                        jVar = new a7.a(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 0);
                    }
                }
                if (jVar != 0) {
                    f13474l = jVar;
                    return jVar;
                }
            } catch (Exception e6) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e6.getMessage());
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.f13476a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e6) {
            throw new Exception("Failed to instantiate module class: ".concat(str), e6);
        }
    }
}
