package d6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.cast.n4;
import com.google.android.gms.internal.cast.o4;
import com.google.android.gms.internal.cast.s4;
import j$.util.DesugarCollections;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import v7.i5;
public final class a {
    public static final g6.b f6600l = new g6.b("CastContext", null);
    public static final Object f6601m = new Object();
    public static volatile a f6602n;
    public final Context f6603a;
    public final n f6604b;
    public final g f6605c;
    public final k d;
    public final b f6606e;
    public final g6.r f6607f;
    public final com.google.android.gms.internal.cast.d f6608g;
    public final com.google.android.gms.internal.cast.n h;
    public final List f6609i;
    public final com.google.android.gms.internal.cast.u f6610j;
    public final com.google.android.gms.internal.cast.f f6611k;

    public a(Context context, b bVar, List list, com.google.android.gms.internal.cast.r rVar, g6.r rVar2) {
        r rVar3;
        y yVar;
        com.google.android.gms.internal.cast.z zVar;
        n4 o4Var;
        n4 n4Var;
        this.f6603a = context;
        this.f6606e = bVar;
        this.f6607f = rVar2;
        this.f6609i = list;
        this.h = new com.google.android.gms.internal.cast.n(context);
        this.f6610j = rVar.f5466f;
        if (!TextUtils.isEmpty(bVar.f6613a)) {
            this.f6611k = new com.google.android.gms.internal.cast.f(context, bVar, rVar);
        } else {
            this.f6611k = null;
        }
        HashMap hashMap = new HashMap();
        com.google.android.gms.internal.cast.f fVar = this.f6611k;
        if (fVar != null) {
            hashMap.put(fVar.f5315b, fVar.f5316c);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.cast.f fVar2 = (com.google.android.gms.internal.cast.f) it.next();
                n6.l.i(fVar2, "Additional SessionProvider must not be null.");
                String str = fVar2.f5315b;
                n6.l.g(str, "Category for SessionProvider must not be null or empty string.");
                n6.l.a("SessionProvider for category " + str + " already added", !hashMap.containsKey(str));
                hashMap.put(str, fVar2.f5316c);
            }
        }
        bVar.F = new b0(1);
        try {
            n a2 = com.google.android.gms.internal.cast.e.a(context, bVar, rVar, hashMap);
            this.f6604b = a2;
            try {
                l lVar = (l) a2;
                Parcel Q0 = lVar.Q0(lVar.O0(), 6);
                IBinder readStrongBinder = Q0.readStrongBinder();
                if (readStrongBinder == null) {
                    rVar3 = 0;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
                    if (queryLocalInterface instanceof r) {
                        rVar3 = (r) queryLocalInterface;
                    } else {
                        rVar3 = new a9.a(readStrongBinder, "com.google.android.gms.cast.framework.IDiscoveryManager", 1);
                    }
                }
                Q0.recycle();
                this.d = new k(rVar3);
                try {
                    l lVar2 = (l) a2;
                    Parcel Q02 = lVar2.Q0(lVar2.O0(), 5);
                    IBinder readStrongBinder2 = Q02.readStrongBinder();
                    if (readStrongBinder2 == null) {
                        yVar = 0;
                    } else {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
                        if (queryLocalInterface2 instanceof y) {
                            yVar = (y) queryLocalInterface2;
                        } else {
                            yVar = new a9.a(readStrongBinder2, "com.google.android.gms.cast.framework.ISessionManager", 1);
                        }
                    }
                    Q02.recycle();
                    g gVar = new g(yVar, context);
                    this.f6605c = gVar;
                    n6.l.g("PrecacheManager", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    com.google.android.gms.internal.cast.u uVar = this.f6610j;
                    if (uVar != null) {
                        uVar.f5496f = gVar;
                        com.google.android.gms.internal.cast.c0 c0Var = uVar.f5494c;
                        n6.l.h(c0Var);
                        c0Var.post(new com.google.android.gms.internal.cast.t(uVar, 1));
                    }
                    if (Build.VERSION.SDK_INT >= 23) {
                        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
                        if (newFixedThreadPool instanceof n4) {
                            n4Var = (n4) newFixedThreadPool;
                        } else {
                            if (newFixedThreadPool instanceof ScheduledExecutorService) {
                                o4Var = new s4((ScheduledExecutorService) newFixedThreadPool);
                            } else {
                                o4Var = new o4(newFixedThreadPool);
                            }
                            n4Var = o4Var;
                        }
                        zVar = new com.google.android.gms.internal.cast.z(context, n4Var);
                    } else {
                        zVar = new Object();
                    }
                    n6.l.g("BaseNetUtils", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    zVar.mo5zza();
                    com.google.android.gms.internal.cast.d dVar = new com.google.android.gms.internal.cast.d();
                    this.f6608g = dVar;
                    try {
                        l lVar3 = (l) a2;
                        Parcel O0 = lVar3.O0();
                        com.google.android.gms.internal.cast.v.d(O0, dVar);
                        lVar3.S0(O0, 3);
                        dVar.f5290c.add(this.h.f5427a);
                        if (!DesugarCollections.unmodifiableList(bVar.f6621w).isEmpty()) {
                            g6.b bVar2 = f6600l;
                            Log.i(bVar2.f10414a, bVar2.d("Setting Route Discovery for appIds: ".concat(String.valueOf(DesugarCollections.unmodifiableList(this.f6606e.f6621w))), new Object[0]));
                            com.google.android.gms.internal.cast.n nVar = this.h;
                            List<String> unmodifiableList = DesugarCollections.unmodifiableList(this.f6606e.f6621w);
                            nVar.getClass();
                            com.google.android.gms.internal.cast.n.f5426f.b(i2.g.j(unmodifiableList.size(), "SetRouteDiscovery for ", " IDs"), new Object[0]);
                            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                            for (String str2 : unmodifiableList) {
                                linkedHashSet.add(i5.a(str2));
                            }
                            com.google.android.gms.internal.cast.n.f5426f.b("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(nVar.f5429c.keySet())), new Object[0]);
                            HashMap hashMap2 = new HashMap();
                            synchronized (nVar.f5429c) {
                                try {
                                    for (String str3 : linkedHashSet) {
                                        com.google.android.gms.internal.cast.l lVar4 = (com.google.android.gms.internal.cast.l) nVar.f5429c.get(i5.a(str3));
                                        if (lVar4 != null) {
                                            hashMap2.put(str3, lVar4);
                                        }
                                    }
                                    nVar.f5429c.clear();
                                    nVar.f5429c.putAll(hashMap2);
                                } finally {
                                }
                            }
                            com.google.android.gms.internal.cast.n.f5426f.b("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(nVar.f5429c.keySet())), new Object[0]);
                            synchronized (nVar.d) {
                                nVar.d.clear();
                                nVar.d.addAll(linkedHashSet);
                            }
                            nVar.m();
                        }
                        rVar2.f(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"}).addOnSuccessListener(new a4.m(this, 13));
                        com.google.android.gms.common.api.internal.v e7 = com.google.android.gms.common.api.internal.w.e();
                        e7.f5144c = new a6.i(rVar2, new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"}, 22);
                        e7.d = new k6.c[]{c6.y.d};
                        e7.f5143b = false;
                        e7.f5142a = 8427;
                        rVar2.e(0, e7.a()).addOnSuccessListener(new a6.m(this, 13));
                    } catch (RemoteException e10) {
                        throw new IllegalStateException("Failed to call addAppVisibilityListener", e10);
                    }
                } catch (RemoteException e11) {
                    throw new IllegalStateException("Failed to call getSessionManagerImpl", e11);
                }
            } catch (RemoteException e12) {
                throw new IllegalStateException("Failed to call getDiscoveryManagerImpl", e12);
            }
        } catch (RemoteException e13) {
            throw new IllegalStateException("Failed to call newCastContextImpl", e13);
        }
    }

    public static a c(Context context) {
        n6.l.e("Must be called from the main thread.");
        if (f6602n == null) {
            synchronized (f6601m) {
                if (f6602n == null) {
                    Context applicationContext = context.getApplicationContext();
                    e d = d(applicationContext);
                    b castOptions = d.getCastOptions(applicationContext);
                    ?? jVar = new com.google.android.gms.common.api.j(applicationContext, g6.r.f10452k, com.google.android.gms.common.api.b.f4976t, com.google.android.gms.common.api.i.f4985c);
                    try {
                        f6602n = new a(applicationContext, castOptions, d.getAdditionalSessionProviders(applicationContext), new com.google.android.gms.internal.cast.r(applicationContext, p4.x.d(applicationContext), castOptions, jVar), jVar);
                    } catch (d e7) {
                        throw new RuntimeException(e7);
                    }
                }
            }
        }
        return f6602n;
    }

    public static e d(Context context) {
        k6.h a2;
        try {
            a2 = w6.b.a(context);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e7) {
            e = e7;
        }
        try {
            Bundle bundle = a2.f14849a.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                f6600l.c(new Object[0]);
            }
            String string = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
            if (string != null) {
                return (e) Class.forName(string).asSubclass(e.class).getDeclaredConstructor(null).newInstance(null);
            }
            throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
        } catch (ClassNotFoundException e10) {
            e = e10;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (IllegalAccessException e11) {
            e = e11;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (InstantiationException e12) {
            e = e12;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (NoSuchMethodException e13) {
            e = e13;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (NullPointerException e14) {
            e = e14;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        }
    }

    public final p4.r a() {
        n6.l.e("Must be called from the main thread.");
        try {
            l lVar = (l) this.f6604b;
            Parcel Q0 = lVar.Q0(lVar.O0(), 1);
            Q0.recycle();
            return p4.r.b((Bundle) com.google.android.gms.internal.cast.v.a(Q0, Bundle.CREATOR));
        } catch (RemoteException e7) {
            f6600l.a(e7, "Unable to call %s on %s.", "getMergedSelectorAsBundle", n.class.getSimpleName());
            return null;
        }
    }

    public final g b() {
        n6.l.e("Must be called from the main thread.");
        return this.f6605c;
    }
}
