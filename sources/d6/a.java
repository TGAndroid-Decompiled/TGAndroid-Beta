package d6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import c3.l0;
import com.google.android.gms.internal.cast.l4;
import com.google.android.gms.internal.cast.m4;
import com.google.android.gms.internal.cast.q4;
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
    public static final g6.b f7828l = new g6.b("CastContext", null);
    public static final Object f7829m = new Object();
    public static volatile a f7830n;
    public final Context f7831a;
    public final n f7832b;
    public final g f7833c;
    public final k d;
    public final b e;
    public final g6.r f7834f;
    public final com.google.android.gms.internal.cast.d f7835g;
    public final com.google.android.gms.internal.cast.n h;
    public final List f7836i;
    public final com.google.android.gms.internal.cast.u f7837j;
    public final com.google.android.gms.internal.cast.f f7838k;

    public a(Context context, b bVar, List list, com.google.android.gms.internal.cast.r rVar, g6.r rVar2) {
        r rVar3;
        y yVar;
        l4 m4Var;
        l4 l4Var;
        LinkProperties linkProperties;
        this.f7831a = context;
        this.e = bVar;
        this.f7834f = rVar2;
        this.f7836i = list;
        this.h = new com.google.android.gms.internal.cast.n(context);
        this.f7837j = rVar.f6764f;
        if (!TextUtils.isEmpty(bVar.f7840a)) {
            this.f7838k = new com.google.android.gms.internal.cast.f(context, bVar, rVar);
        } else {
            this.f7838k = null;
        }
        HashMap hashMap = new HashMap();
        com.google.android.gms.internal.cast.f fVar = this.f7838k;
        if (fVar != null) {
            hashMap.put(fVar.f6670b, fVar.f6671c);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.cast.f fVar2 = (com.google.android.gms.internal.cast.f) it.next();
                n6.l.i(fVar2, "Additional SessionProvider must not be null.");
                String str = fVar2.f6670b;
                n6.l.g(str, "Category for SessionProvider must not be null or empty string.");
                n6.l.a("SessionProvider for category " + str + " already added", !hashMap.containsKey(str));
                hashMap.put(str, fVar2.f6671c);
            }
        }
        bVar.F = new b0(1);
        try {
            n a2 = com.google.android.gms.internal.cast.e.a(context, bVar, rVar, hashMap);
            this.f7832b = a2;
            try {
                l lVar = (l) a2;
                Parcel P0 = lVar.P0(lVar.N0(), 6);
                IBinder readStrongBinder = P0.readStrongBinder();
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
                P0.recycle();
                this.d = new k(rVar3);
                try {
                    l lVar2 = (l) a2;
                    Parcel P02 = lVar2.P0(lVar2.N0(), 5);
                    IBinder readStrongBinder2 = P02.readStrongBinder();
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
                    P02.recycle();
                    g gVar = new g(yVar, context);
                    this.f7833c = gVar;
                    n6.l.g("PrecacheManager", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    com.google.android.gms.internal.cast.u uVar = this.f7837j;
                    if (uVar != null) {
                        uVar.f6793f = gVar;
                        com.google.android.gms.internal.cast.a0 a0Var = uVar.f6792c;
                        n6.l.h(a0Var);
                        a0Var.post(new com.google.android.gms.internal.cast.t(uVar, 1));
                    }
                    ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
                    if (newFixedThreadPool instanceof l4) {
                        l4Var = (l4) newFixedThreadPool;
                    } else {
                        if (newFixedThreadPool instanceof ScheduledExecutorService) {
                            m4Var = new q4((ScheduledExecutorService) newFixedThreadPool);
                        } else {
                            m4Var = new m4(newFixedThreadPool);
                        }
                        l4Var = m4Var;
                    }
                    com.google.android.gms.internal.cast.y yVar2 = new com.google.android.gms.internal.cast.y(context, l4Var);
                    n6.l.g("BaseNetUtils", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    ConnectivityManager connectivityManager = yVar2.f6832c;
                    com.google.android.gms.internal.cast.y.f6829j.b("Start monitoring connectivity changes", new Object[0]);
                    if (!yVar2.f6833f && connectivityManager != null && f0.c.b(yVar2.f6834g, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                        Network activeNetwork = connectivityManager.getActiveNetwork();
                        if (activeNetwork != null && (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) != null) {
                            yVar2.a(activeNetwork, linkProperties);
                        }
                        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(1).build(), yVar2.f6831b);
                        yVar2.f6833f = true;
                    }
                    com.google.android.gms.internal.cast.d dVar = new com.google.android.gms.internal.cast.d();
                    this.f7835g = dVar;
                    try {
                        l lVar3 = (l) a2;
                        Parcel N0 = lVar3.N0();
                        com.google.android.gms.internal.cast.v.d(N0, dVar);
                        lVar3.R0(N0, 3);
                        dVar.f6610c.add(this.h.f6731a);
                        if (!DesugarCollections.unmodifiableList(bVar.f7847w).isEmpty()) {
                            g6.b bVar2 = f7828l;
                            Log.i(bVar2.f10843a, bVar2.d("Setting Route Discovery for appIds: ".concat(String.valueOf(DesugarCollections.unmodifiableList(this.e.f7847w))), new Object[0]));
                            com.google.android.gms.internal.cast.n nVar = this.h;
                            List<String> unmodifiableList = DesugarCollections.unmodifiableList(this.e.f7847w);
                            nVar.getClass();
                            com.google.android.gms.internal.cast.n.f6730f.b(i0.a.k(unmodifiableList.size(), "SetRouteDiscovery for ", " IDs"), new Object[0]);
                            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                            for (String str2 : unmodifiableList) {
                                linkedHashSet.add(k5.a(str2));
                            }
                            com.google.android.gms.internal.cast.n.f6730f.b("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(nVar.f6733c.keySet())), new Object[0]);
                            HashMap hashMap2 = new HashMap();
                            synchronized (nVar.f6733c) {
                                try {
                                    for (String str3 : linkedHashSet) {
                                        com.google.android.gms.internal.cast.l lVar4 = (com.google.android.gms.internal.cast.l) nVar.f6733c.get(k5.a(str3));
                                        if (lVar4 != null) {
                                            hashMap2.put(str3, lVar4);
                                        }
                                    }
                                    nVar.f6733c.clear();
                                    nVar.f6733c.putAll(hashMap2);
                                } finally {
                                }
                            }
                            com.google.android.gms.internal.cast.n.f6730f.b("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(nVar.f6733c.keySet())), new Object[0]);
                            synchronized (nVar.d) {
                                nVar.d.clear();
                                nVar.d.addAll(linkedHashSet);
                            }
                            nVar.m();
                        }
                        rVar2.f(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"}).addOnSuccessListener(new ag.b(this, 11));
                        com.google.android.gms.common.api.internal.u b10 = com.google.android.gms.common.api.internal.v.b();
                        b10.f6499c = new l0(rVar2, new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"});
                        b10.d = new k6.c[]{c6.y.d};
                        b10.f6498b = false;
                        b10.f6497a = 8427;
                        rVar2.e(0, b10.a()).addOnSuccessListener(new a6.m(this, 16));
                    } catch (RemoteException e) {
                        throw new IllegalStateException("Failed to call addAppVisibilityListener", e);
                    }
                } catch (RemoteException e7) {
                    throw new IllegalStateException("Failed to call getSessionManagerImpl", e7);
                }
            } catch (RemoteException e10) {
                throw new IllegalStateException("Failed to call getDiscoveryManagerImpl", e10);
            }
        } catch (RemoteException e11) {
            throw new IllegalStateException("Failed to call newCastContextImpl", e11);
        }
    }

    public static a c(Context context) {
        n6.l.e("Must be called from the main thread.");
        if (f7830n == null) {
            synchronized (f7829m) {
                if (f7830n == null) {
                    Context applicationContext = context.getApplicationContext();
                    e d = d(applicationContext);
                    b castOptions = d.getCastOptions(applicationContext);
                    ?? jVar = new com.google.android.gms.common.api.j(applicationContext, g6.r.f10878k, com.google.android.gms.common.api.b.f6349p, com.google.android.gms.common.api.i.f6358c);
                    try {
                        f7830n = new a(applicationContext, castOptions, d.getAdditionalSessionProviders(applicationContext), new com.google.android.gms.internal.cast.r(applicationContext, p4.x.d(applicationContext), castOptions, jVar), jVar);
                    } catch (d e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return f7830n;
    }

    public static e d(Context context) {
        q2.b a2;
        try {
            a2 = w6.b.a(context);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
            e = e;
        }
        try {
            Bundle bundle = a2.f44368a.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                f7828l.c(new Object[0]);
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
            l lVar = (l) this.f7832b;
            Parcel P0 = lVar.P0(lVar.N0(), 1);
            P0.recycle();
            return p4.r.b((Bundle) com.google.android.gms.internal.cast.v.a(P0, Bundle.CREATOR));
        } catch (RemoteException e) {
            f7828l.a(e, "Unable to call %s on %s.", "getMergedSelectorAsBundle", n.class.getSimpleName());
            return null;
        }
    }

    public final g b() {
        n6.l.e("Must be called from the main thread.");
        return this.f7833c;
    }
}
