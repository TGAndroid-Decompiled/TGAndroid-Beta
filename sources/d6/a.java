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
import hg.k0;
import j$.util.DesugarCollections;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import v7.k5;
public final class a {
    public static final g6.b f7507l = new g6.b("CastContext", null);
    public static final Object f7508m = new Object();
    public static volatile a f7509n;
    public final Context f7510a;
    public final n f7511b;
    public final g f7512c;
    public final k d;
    public final b e;
    public final g6.r f7513f;
    public final com.google.android.gms.internal.cast.d f7514g;
    public final com.google.android.gms.internal.cast.n h;
    public final List f7515i;
    public final com.google.android.gms.internal.cast.u f7516j;
    public final com.google.android.gms.internal.cast.f f7517k;

    public a(Context context, b bVar, List list, com.google.android.gms.internal.cast.r rVar, g6.r rVar2) {
        r rVar3;
        y yVar;
        com.google.android.gms.internal.cast.z zVar;
        n4 o4Var;
        n4 n4Var;
        this.f7510a = context;
        this.e = bVar;
        this.f7513f = rVar2;
        this.f7515i = list;
        this.h = new com.google.android.gms.internal.cast.n(context);
        this.f7516j = rVar.f6474f;
        if (!TextUtils.isEmpty(bVar.f7519a)) {
            this.f7517k = new com.google.android.gms.internal.cast.f(context, bVar, rVar);
        } else {
            this.f7517k = null;
        }
        HashMap hashMap = new HashMap();
        com.google.android.gms.internal.cast.f fVar = this.f7517k;
        if (fVar != null) {
            hashMap.put(fVar.f6337b, fVar.f6338c);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.cast.f fVar2 = (com.google.android.gms.internal.cast.f) it.next();
                n6.l.i(fVar2, "Additional SessionProvider must not be null.");
                String str = fVar2.f6337b;
                n6.l.g(str, "Category for SessionProvider must not be null or empty string.");
                n6.l.a("SessionProvider for category " + str + " already added", !hashMap.containsKey(str));
                hashMap.put(str, fVar2.f6338c);
            }
        }
        bVar.F = new b0(1);
        try {
            n a2 = com.google.android.gms.internal.cast.e.a(context, bVar, rVar, hashMap);
            this.f7511b = a2;
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
                    this.f7512c = gVar;
                    n6.l.g("PrecacheManager", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    com.google.android.gms.internal.cast.u uVar = this.f7516j;
                    if (uVar != null) {
                        uVar.f6500f = gVar;
                        com.google.android.gms.internal.cast.c0 c0Var = uVar.f6499c;
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
                    this.f7514g = dVar;
                    try {
                        l lVar3 = (l) a2;
                        Parcel O0 = lVar3.O0();
                        com.google.android.gms.internal.cast.v.d(O0, dVar);
                        lVar3.S0(O0, 3);
                        dVar.f6315c.add(this.h.f6441a);
                        if (!DesugarCollections.unmodifiableList(bVar.f7526w).isEmpty()) {
                            g6.b bVar2 = f7507l;
                            Log.i(bVar2.f9430a, bVar2.d("Setting Route Discovery for appIds: ".concat(String.valueOf(DesugarCollections.unmodifiableList(this.e.f7526w))), new Object[0]));
                            com.google.android.gms.internal.cast.n nVar = this.h;
                            List<String> unmodifiableList = DesugarCollections.unmodifiableList(this.e.f7526w);
                            nVar.getClass();
                            com.google.android.gms.internal.cast.n.f6440f.b(k0.i(unmodifiableList.size(), "SetRouteDiscovery for ", " IDs"), new Object[0]);
                            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                            for (String str2 : unmodifiableList) {
                                linkedHashSet.add(k5.a(str2));
                            }
                            com.google.android.gms.internal.cast.n.f6440f.b("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(nVar.f6443c.keySet())), new Object[0]);
                            HashMap hashMap2 = new HashMap();
                            synchronized (nVar.f6443c) {
                                try {
                                    for (String str3 : linkedHashSet) {
                                        com.google.android.gms.internal.cast.l lVar4 = (com.google.android.gms.internal.cast.l) nVar.f6443c.get(k5.a(str3));
                                        if (lVar4 != null) {
                                            hashMap2.put(str3, lVar4);
                                        }
                                    }
                                    nVar.f6443c.clear();
                                    nVar.f6443c.putAll(hashMap2);
                                } finally {
                                }
                            }
                            com.google.android.gms.internal.cast.n.f6440f.b("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(nVar.f6443c.keySet())), new Object[0]);
                            synchronized (nVar.d) {
                                nVar.d.clear();
                                nVar.d.addAll(linkedHashSet);
                            }
                            nVar.m();
                        }
                        rVar2.f(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"}).addOnSuccessListener(new pb.c(this, 16));
                        com.google.android.gms.common.api.internal.v e = com.google.android.gms.common.api.internal.w.e();
                        e.f6182c = new xa.c(rVar2, new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"});
                        e.d = new k6.c[]{c6.y.d};
                        e.f6181b = false;
                        e.f6180a = 8427;
                        rVar2.e(0, e.a()).addOnSuccessListener(new xa.c(this, 15));
                    } catch (RemoteException e7) {
                        throw new IllegalStateException("Failed to call addAppVisibilityListener", e7);
                    }
                } catch (RemoteException e10) {
                    throw new IllegalStateException("Failed to call getSessionManagerImpl", e10);
                }
            } catch (RemoteException e11) {
                throw new IllegalStateException("Failed to call getDiscoveryManagerImpl", e11);
            }
        } catch (RemoteException e12) {
            throw new IllegalStateException("Failed to call newCastContextImpl", e12);
        }
    }

    public static a c(Context context) {
        n6.l.e("Must be called from the main thread.");
        if (f7509n == null) {
            synchronized (f7508m) {
                if (f7509n == null) {
                    Context applicationContext = context.getApplicationContext();
                    e d = d(applicationContext);
                    b castOptions = d.getCastOptions(applicationContext);
                    ?? jVar = new com.google.android.gms.common.api.j(applicationContext, g6.r.f9465k, com.google.android.gms.common.api.b.f6024t, com.google.android.gms.common.api.i.f6033c);
                    try {
                        f7509n = new a(applicationContext, castOptions, d.getAdditionalSessionProviders(applicationContext), new com.google.android.gms.internal.cast.r(applicationContext, p4.x.d(applicationContext), castOptions, jVar), jVar);
                    } catch (d e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return f7509n;
    }

    public static e d(Context context) {
        v0.k a2;
        try {
            a2 = w6.b.a(context);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
            e = e;
        }
        try {
            Bundle bundle = a2.f44133a.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                f7507l.c(new Object[0]);
            }
            String string = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
            if (string != null) {
                return (e) Class.forName(string).asSubclass(e.class).getDeclaredConstructor(null).newInstance(null);
            }
            throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
        } catch (ClassNotFoundException e7) {
            e = e7;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (IllegalAccessException e10) {
            e = e10;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (InstantiationException e11) {
            e = e11;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (NoSuchMethodException e12) {
            e = e12;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (NullPointerException e13) {
            e = e13;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        }
    }

    public final p4.r a() {
        n6.l.e("Must be called from the main thread.");
        try {
            l lVar = (l) this.f7511b;
            Parcel Q0 = lVar.Q0(lVar.O0(), 1);
            Q0.recycle();
            return p4.r.b((Bundle) com.google.android.gms.internal.cast.v.a(Q0, Bundle.CREATOR));
        } catch (RemoteException e) {
            f7507l.a(e, "Unable to call %s on %s.", "getMergedSelectorAsBundle", n.class.getSimpleName());
            return null;
        }
    }

    public final g b() {
        n6.l.e("Must be called from the main thread.");
        return this.f7512c;
    }
}
