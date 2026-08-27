package j6;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import e7.v;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import y5.l;

public final class e {

    public static final v f12727b;

    public static final w9.d f12728c;
    public static Boolean d = null;

    public static String f12729e = null;

    public static boolean f12730f = false;

    public static int f12731g = -1;
    public static Boolean h;

    public static final ThreadLocal f12732i = new ThreadLocal();

    public static final bd.b f12733j = new bd.b(2);

    public static final ab.a f12734k;

    public static j f12735l;

    public static k f12736m;

    public final Context f12737a;

    static {
        int i10 = 10;
        f12734k = new ab.a(i10);
        f12727b = new v(i10);
        f12728c = new w9.d(i10);
    }

    public e(Context context) {
        this.f12737a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (l.l(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e9) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e9.getMessage())));
            return 0;
        }
    }

    public static e c(Context context, d dVar, String str) throws Throwable {
        long j10;
        e eVar;
        int i10;
        Boolean bool;
        j jVarH;
        int i11;
        i6.a aVarU0;
        Object objK0;
        e eVar2;
        i iVar;
        k kVar;
        i iVar2;
        boolean z10;
        i6.a aVarU1;
        Cursor cursor;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new b("null application Context");
        }
        ThreadLocal threadLocal = f12732i;
        i iVar3 = (i) threadLocal.get();
        i iVar4 = new i();
        threadLocal.set(iVar4);
        bd.b bVar = f12733j;
        Long l10 = (Long) bVar.get();
        long jLongValue = l10.longValue();
        try {
            bVar.set(Long.valueOf(SystemClock.uptimeMillis()));
            b8.b bVarY1 = dVar.Y1(context, str, f12734k);
            j10 = jLongValue;
            try {
                Log.i("DynamiteModule", "Considering local module " + str + ":" + bVarY1.f2041a + " and remote module " + str + ":" + bVarY1.f2042b);
                int i12 = bVarY1.f2043c;
                if (i12 != 0) {
                    if (i12 != -1) {
                        if (i12 == 1 || bVarY1.f2042b != 0) {
                            if (i12 == -1) {
                                Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                                eVar = new e(applicationContext);
                            } else {
                                if (i12 == 1) {
                                    throw new b("VersionPolicy returned invalid code:" + i12);
                                }
                                try {
                                    i10 = bVarY1.f2042b;
                                    try {
                                        synchronized (e.class) {
                                            if (g(context)) {
                                                throw new b("Remote loading disabled");
                                            }
                                            bool = d;
                                        }
                                        if (bool != null) {
                                            throw new b("Failed to determine which loading route to use.");
                                        }
                                        if (bool.booleanValue()) {
                                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                                            synchronized (e.class) {
                                                kVar = f12736m;
                                            }
                                            if (kVar != null) {
                                                throw new b("DynamiteLoaderV2 was not cached.");
                                            }
                                            iVar2 = (i) threadLocal.get();
                                            if (iVar2 != null || iVar2.f12740a == null) {
                                                throw new b("No result cursor");
                                            }
                                            Context applicationContext2 = context.getApplicationContext();
                                            Cursor cursor2 = iVar2.f12740a;
                                            new i6.b(null);
                                            synchronized (e.class) {
                                                z10 = f12731g >= 2;
                                            }
                                            if (z10) {
                                                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                aVarU1 = kVar.V0(new i6.b(applicationContext2), str, i10, new i6.b(cursor2));
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                aVarU1 = kVar.U0(new i6.b(applicationContext2), str, i10, new i6.b(cursor2));
                                            }
                                            Context context2 = (Context) i6.b.K0(aVarU1);
                                            if (context2 == null) {
                                                throw new b("Failed to get module context");
                                            }
                                            eVar2 = new e(context2);
                                        } else {
                                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                                            jVarH = h(context);
                                            if (jVarH != null) {
                                                throw new b("Failed to create IDynamiteLoader.");
                                            }
                                            Parcel parcelK0 = jVarH.K0(jVarH.M0(), 6);
                                            i11 = parcelK0.readInt();
                                            parcelK0.recycle();
                                            if (i11 >= 3) {
                                                iVar = (i) threadLocal.get();
                                                if (iVar != null) {
                                                    throw new b("No cached result cursor holder");
                                                }
                                                aVarU0 = jVarH.V0(new i6.b(context), str, i10, new i6.b(iVar.f12740a));
                                            } else if (i11 == 2) {
                                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                aVarU0 = jVarH.W0(new i6.b(context), str, i10);
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                aVarU0 = jVarH.U0(new i6.b(context), str, i10);
                                            }
                                            objK0 = i6.b.K0(aVarU0);
                                            if (objK0 != null) {
                                                throw new b("Failed to load remote module.");
                                            }
                                            eVar2 = new e((Context) objK0);
                                        }
                                        eVar = eVar2;
                                    } catch (RemoteException e9) {
                                        throw new b("Failed to load remote module.", e9);
                                    } catch (b e10) {
                                        throw e10;
                                    } catch (Throwable th) {
                                        throw new b("Failed to load remote module.", th);
                                    }
                                } catch (b e11) {
                                    Log.w("DynamiteModule", "Failed to load remote module: " + e11.getMessage());
                                    int i13 = bVarY1.f2041a;
                                    if (i13 == 0 || dVar.Y1(context, str, new com.google.android.gms.internal.cast.a(i13)).f2043c != -1) {
                                        throw new b("Remote load failed. No local fallback found.", e11);
                                    }
                                    Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                                    eVar = new e(applicationContext);
                                }
                            }
                            if (j10 == 0) {
                                f12733j.remove();
                            } else {
                                f12733j.set(l10);
                            }
                            cursor = iVar4.f12740a;
                            if (cursor != null) {
                                cursor.close();
                            }
                            f12732i.set(iVar3);
                            return eVar;
                        }
                    } else if (bVarY1.f2041a != 0) {
                        i12 = -1;
                        if (i12 == 1) {
                        }
                        if (i12 == -1) {
                            Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                            eVar = new e(applicationContext);
                        } else {
                            if (i12 == 1) {
                                throw new b("VersionPolicy returned invalid code:" + i12);
                            }
                            i10 = bVarY1.f2042b;
                            synchronized (e.class) {
                                if (g(context)) {
                                    throw new b("Remote loading disabled");
                                }
                                bool = d;
                                if (bool != null) {
                                    throw new b("Failed to determine which loading route to use.");
                                }
                                if (bool.booleanValue()) {
                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                                    synchronized (e.class) {
                                        kVar = f12736m;
                                        if (kVar != null) {
                                            throw new b("DynamiteLoaderV2 was not cached.");
                                        }
                                        iVar2 = (i) threadLocal.get();
                                        if (iVar2 != null) {
                                        }
                                        throw new b("No result cursor");
                                    }
                                }
                                Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                                jVarH = h(context);
                                if (jVarH != null) {
                                    throw new b("Failed to create IDynamiteLoader.");
                                }
                                Parcel parcelK1 = jVarH.K0(jVarH.M0(), 6);
                                i11 = parcelK1.readInt();
                                parcelK1.recycle();
                                if (i11 >= 3) {
                                    iVar = (i) threadLocal.get();
                                    if (iVar != null) {
                                        throw new b("No cached result cursor holder");
                                    }
                                    aVarU0 = jVarH.V0(new i6.b(context), str, i10, new i6.b(iVar.f12740a));
                                } else if (i11 == 2) {
                                    Log.w("DynamiteModule", "IDynamite loader version = 2");
                                    aVarU0 = jVarH.W0(new i6.b(context), str, i10);
                                } else {
                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                    aVarU0 = jVarH.U0(new i6.b(context), str, i10);
                                }
                                objK0 = i6.b.K0(aVarU0);
                                if (objK0 != null) {
                                    throw new b("Failed to load remote module.");
                                }
                                eVar2 = new e((Context) objK0);
                                eVar = eVar2;
                            }
                        }
                        if (j10 == 0) {
                            f12733j.remove();
                        } else {
                            f12733j.set(l10);
                        }
                        cursor = iVar4.f12740a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        f12732i.set(iVar3);
                        return eVar;
                    }
                }
                throw new b("No acceptable module " + str + " found. Local version is " + bVarY1.f2041a + " and remote version is " + bVarY1.f2042b + ".");
            } catch (Throwable th2) {
                th = th2;
                if (j10 == 0) {
                    f12733j.remove();
                } else {
                    f12733j.set(l10);
                }
                Cursor cursor3 = iVar4.f12740a;
                if (cursor3 != null) {
                    cursor3.close();
                }
                f12732i.set(iVar3);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            j10 = jLongValue;
        }
    }

    public static int d(Context context, String str, boolean z10) {
        Throwable th;
        RemoteException remoteException;
        int i10;
        Cursor cursor;
        try {
            synchronized (e.class) {
                Boolean bool = d;
                boolean z11 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        f(classLoader);
                                    } catch (b unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!g(context)) {
                                        return 0;
                                    }
                                    if (f12730f) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iE = e(context, str, z10, true);
                                                String str2 = f12729e;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderA = g.a();
                                                    if (classLoaderA == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            a.b();
                                                            String str3 = f12729e;
                                                            l.h(str3);
                                                            classLoaderA = a.a(ClassLoader.getSystemClassLoader(), str3);
                                                        } else {
                                                            String str4 = f12729e;
                                                            l.h(str4);
                                                            classLoaderA = new h(str4, ClassLoader.getSystemClassLoader());
                                                        }
                                                    }
                                                    f(classLoaderA);
                                                    declaredField.set(null, classLoaderA);
                                                    d = bool2;
                                                    return iE;
                                                }
                                                return iE;
                                            } catch (b unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                d = bool;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e9) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e9.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return e(context, str, z10, false);
                    } catch (b e10) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e10.getMessage());
                        return 0;
                    }
                }
                j jVarH = h(context);
                try {
                    if (jVarH == null) {
                        return 0;
                    }
                    try {
                        Parcel parcelK0 = jVarH.K0(jVarH.M0(), 6);
                        int i11 = parcelK0.readInt();
                        parcelK0.recycle();
                        if (i11 >= 3) {
                            ThreadLocal threadLocal = f12732i;
                            i iVar = (i) threadLocal.get();
                            if (iVar != null && (cursor = iVar.f12740a) != null) {
                                return cursor.getInt(0);
                            }
                            Cursor cursor3 = (Cursor) i6.b.K0(jVarH.X0(new i6.b(context), str, z10, ((Long) f12733j.get()).longValue()));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        i10 = cursor3.getInt(0);
                                        if (i10 > 0) {
                                            i iVar2 = (i) threadLocal.get();
                                            if (iVar2 == null || iVar2.f12740a != null) {
                                                z11 = false;
                                            } else {
                                                iVar2.f12740a = cursor3;
                                            }
                                            cursor2 = z11 ? null : cursor3;
                                        }
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e11) {
                                    remoteException = e11;
                                    cursor2 = cursor3;
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version: " + remoteException.getMessage());
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th3) {
                                    th = th3;
                                    cursor2 = cursor3;
                                    if (cursor2 == null) {
                                        throw th;
                                    }
                                    cursor2.close();
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor3 == null) {
                                return 0;
                            }
                            cursor3.close();
                            return 0;
                        }
                        if (i11 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            i6.b bVar = new i6.b(context);
                            Parcel parcelM0 = jVarH.M0();
                            x6.a.c(parcelM0, bVar);
                            parcelM0.writeString(str);
                            parcelM0.writeInt(z10 ? 1 : 0);
                            Parcel parcelK1 = jVarH.K0(parcelM0, 5);
                            i10 = parcelK1.readInt();
                            parcelK1.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            i6.b bVar2 = new i6.b(context);
                            Parcel parcelM1 = jVarH.M0();
                            x6.a.c(parcelM1, bVar2);
                            parcelM1.writeString(str);
                            parcelM1.writeInt(z10 ? 1 : 0);
                            Parcel parcelK2 = jVarH.K0(parcelM1, 3);
                            i10 = parcelK2.readInt();
                            parcelK2.recycle();
                        }
                        return i10;
                    } catch (RemoteException e12) {
                        remoteException = e12;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            try {
                l.h(context);
                throw th5;
            } catch (Exception e13) {
                Log.e("CrashUtils", "Error adding exception to DropBox!", e13);
                throw th5;
            }
        }
    }

    public static int e(Context context, String str, boolean z10, boolean z11) throws Throwable {
        Throwable th;
        Exception exc;
        MatrixCursor matrixCursor;
        boolean z12;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z13 = true;
                Uri uriBuild = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z10 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) f12733j.get()).longValue())).build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z14 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    matrixCursor = null;
                } else {
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery == null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        } else {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i10 = 0; i10 < count; i10++) {
                                    if (!cursorQuery.moveToPosition(i10)) {
                                        throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    Object[] objArr = new Object[columnCount];
                                    for (int i11 = 0; i11 < columnCount; i11++) {
                                        int type = cursorQuery.getType(i11);
                                        if (type == 0) {
                                            objArr[i11] = null;
                                        } else if (type == 1) {
                                            objArr[i11] = Long.valueOf(cursorQuery.getLong(i11));
                                        } else if (type == 2) {
                                            objArr[i11] = Double.valueOf(cursorQuery.getDouble(i11));
                                        } else if (type == 3) {
                                            objArr[i11] = cursorQuery.getString(i11);
                                        } else {
                                            if (type != 4) {
                                                throw new RemoteException("Unknown column type");
                                            }
                                            objArr[i11] = cursorQuery.getBlob(i11);
                                        }
                                    }
                                    matrixCursor.addRow(objArr);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (Throwable th2) {
                                try {
                                    cursorQuery.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        }
                    } catch (RemoteException unused) {
                    } catch (Throwable th4) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th4;
                    }
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i12 = matrixCursor.getInt(0);
                            if (i12 > 0) {
                                synchronized (e.class) {
                                    try {
                                        f12729e = matrixCursor.getString(2);
                                        int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f12731g = matrixCursor.getInt(columnIndex);
                                        }
                                        int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z12 = matrixCursor.getInt(columnIndex2) != 0;
                                            f12730f = z12;
                                        } else {
                                            z12 = false;
                                        }
                                    } catch (Throwable th5) {
                                        throw th5;
                                    }
                                }
                                i iVar = (i) f12732i.get();
                                if (iVar == null || iVar.f12740a != null) {
                                    z13 = false;
                                } else {
                                    iVar.f12740a = matrixCursor;
                                }
                                z14 = z12;
                                matrixCursor2 = z13 ? null : matrixCursor;
                            }
                            if (z11 && z14) {
                                throw new b("forcing fallback to container DynamiteLoader impl");
                            }
                            if (matrixCursor2 != null) {
                                matrixCursor2.close();
                            }
                            return i12;
                        }
                    } catch (Exception e9) {
                        exc = e9;
                        if (exc instanceof b) {
                            throw exc;
                        }
                        throw new b("V2 version check failed: " + exc.getMessage(), exc);
                    } catch (Throwable th6) {
                        th = th6;
                        matrixCursor2 = matrixCursor;
                        if (matrixCursor2 == null) {
                            throw th;
                        }
                        matrixCursor2.close();
                        throw th;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new b("Failed to connect to dynamite module ContentResolver.");
            } catch (Exception e10) {
                exc = e10;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    public static void f(ClassLoader classLoader) throws b {
        try {
            k kVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                kVar = iInterfaceQueryLocalInterface instanceof k ? (k) iInterfaceQueryLocalInterface : new k(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 11);
            }
            f12736m = kVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e9) {
            throw new b("Failed to instantiate dynamite loader", e9);
        }
    }

    public static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(h)) {
            return true;
        }
        boolean z10 = false;
        if (h == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? 268435456 : 0);
            if (v5.e.f48795b.d(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z10 = true;
            }
            h = Boolean.valueOf(z10);
            if (z10 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f12730f = true;
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
            j jVar2 = f12735l;
            if (jVar2 != null) {
                return jVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    jVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    jVar = iInterfaceQueryLocalInterface instanceof j ? (j) iInterfaceQueryLocalInterface : new j(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 11);
                }
                if (jVar != null) {
                    f12735l = jVar;
                    return jVar;
                }
            } catch (Exception e9) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e9.getMessage());
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.f12737a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e9) {
            throw new b("Failed to instantiate module class: ".concat(str), e9);
        }
    }
}
