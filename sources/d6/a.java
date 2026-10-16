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
    public static final g6.b f6373l = new g6.b("CastContext", null);
    public static final Object f6374m = new Object();
    public static volatile a f6375n;
    public final Context f6376a;
    public final n f6377b;
    public final g f6378c;
    public final k d;
    public final b e;
    public final g6.r f6379f;
    public final com.google.android.gms.internal.cast.d f6380g;
    public final com.google.android.gms.internal.cast.n h;
    public final List f6381i;
    public final com.google.android.gms.internal.cast.u f6382j;
    public final com.google.android.gms.internal.cast.f f6383k;

    public a(Context context, b bVar, List list, com.google.android.gms.internal.cast.r rVar, g6.r rVar2) {
        r rVar3;
        y yVar;
        l4 m4Var;
        l4 l4Var;
        LinkProperties linkProperties;
        this.f6376a = context;
        this.e = bVar;
        this.f6379f = rVar2;
        this.f6381i = list;
        this.h = new com.google.android.gms.internal.cast.n(context);
        this.f6382j = rVar.f5310f;
        if (!TextUtils.isEmpty(bVar.f6385a)) {
            this.f6383k = new com.google.android.gms.internal.cast.f(context, bVar, rVar);
        } else {
            this.f6383k = null;
        }
        HashMap hashMap = new HashMap();
        com.google.android.gms.internal.cast.f fVar = this.f6383k;
        if (fVar != null) {
            hashMap.put(fVar.f5216b, fVar.f5217c);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.cast.f fVar2 = (com.google.android.gms.internal.cast.f) it.next();
                n6.l.i(fVar2, "Additional SessionProvider must not be null.");
                String str = fVar2.f5216b;
                n6.l.g(str, "Category for SessionProvider must not be null or empty string.");
                n6.l.a("SessionProvider for category " + str + " already added", !hashMap.containsKey(str));
                hashMap.put(str, fVar2.f5217c);
            }
        }
        bVar.F = new b0(1);
        try {
            n a2 = com.google.android.gms.internal.cast.e.a(context, bVar, rVar, hashMap);
            this.f6377b = a2;
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
                    this.f6378c = gVar;
                    n6.l.g("PrecacheManager", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    com.google.android.gms.internal.cast.u uVar = this.f6382j;
                    if (uVar != null) {
                        uVar.f5344f = gVar;
                        com.google.android.gms.internal.cast.a0 a0Var = uVar.f5343c;
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
                    ConnectivityManager connectivityManager = yVar2.f5381c;
                    com.google.android.gms.internal.cast.y.f5378j.b("Start monitoring connectivity changes", new Object[0]);
                    if (!yVar2.f5382f && connectivityManager != null && f0.c.b(yVar2.f5383g, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                        Network activeNetwork = connectivityManager.getActiveNetwork();
                        if (activeNetwork != null && (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) != null) {
                            yVar2.a(activeNetwork, linkProperties);
                        }
                        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(1).build(), yVar2.f5380b);
                        yVar2.f5382f = true;
                    }
                    com.google.android.gms.internal.cast.d dVar = new com.google.android.gms.internal.cast.d();
                    this.f6380g = dVar;
                    try {
                        l lVar3 = (l) a2;
                        Parcel N0 = lVar3.N0();
                        com.google.android.gms.internal.cast.v.d(N0, dVar);
                        lVar3.R0(N0, 3);
                        dVar.f5156c.add(this.h.f5278a);
                        if (!DesugarCollections.unmodifiableList(bVar.f6392w).isEmpty()) {
                            g6.b bVar2 = f6373l;
                            Log.i(bVar2.f9937a, bVar2.d("Setting Route Discovery for appIds: ".concat(String.valueOf(DesugarCollections.unmodifiableList(this.e.f6392w))), new Object[0]));
                            com.google.android.gms.internal.cast.n nVar = this.h;
                            List<String> unmodifiableList = DesugarCollections.unmodifiableList(this.e.f6392w);
                            nVar.getClass();
                            com.google.android.gms.internal.cast.n.f5277f.b(i2.d.k(unmodifiableList.size(), "SetRouteDiscovery for ", " IDs"), new Object[0]);
                            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                            for (String str2 : unmodifiableList) {
                                linkedHashSet.add(k5.a(str2));
                            }
                            com.google.android.gms.internal.cast.n.f5277f.b("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(nVar.f5280c.keySet())), new Object[0]);
                            HashMap hashMap2 = new HashMap();
                            synchronized (nVar.f5280c) {
                                try {
                                    for (String str3 : linkedHashSet) {
                                        com.google.android.gms.internal.cast.l lVar4 = (com.google.android.gms.internal.cast.l) nVar.f5280c.get(k5.a(str3));
                                        if (lVar4 != null) {
                                            hashMap2.put(str3, lVar4);
                                        }
                                    }
                                    nVar.f5280c.clear();
                                    nVar.f5280c.putAll(hashMap2);
                                } finally {
                                }
                            }
                            com.google.android.gms.internal.cast.n.f5277f.b("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(nVar.f5280c.keySet())), new Object[0]);
                            synchronized (nVar.d) {
                                nVar.d.clear();
                                nVar.d.addAll(linkedHashSet);
                            }
                            nVar.m();
                        }
                        rVar2.f(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"}).addOnSuccessListener(new a6.i(this, 12));
                        com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
                        b10.f5049c = new a6.i(rVar2, new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"}, 20);
                        b10.d = new k6.c[]{c6.y.d};
                        b10.f5048b = false;
                        b10.f5047a = 8427;
                        rVar2.e(0, b10.a()).addOnSuccessListener(new a4.l(this, 15));
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
        if (f6375n == null) {
            synchronized (f6374m) {
                if (f6375n == null) {
                    Context applicationContext = context.getApplicationContext();
                    e d = d(applicationContext);
                    b castOptions = d.getCastOptions(applicationContext);
                    ?? jVar = new com.google.android.gms.common.api.j(applicationContext, g6.r.f9972k, com.google.android.gms.common.api.b.f4891p, com.google.android.gms.common.api.i.f4900c);
                    try {
                        f6375n = new a(applicationContext, castOptions, d.getAdditionalSessionProviders(applicationContext), new com.google.android.gms.internal.cast.r(applicationContext, p4.x.d(applicationContext), castOptions, jVar), jVar);
                    } catch (d e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return f6375n;
    }

    public static e d(Context context) {
        k0.b a2;
        try {
            a2 = w6.b.a(context);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
            e = e;
        }
        try {
            Bundle bundle = a2.f13764a.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                f6373l.c(new Object[0]);
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
            l lVar = (l) this.f6377b;
            Parcel P0 = lVar.P0(lVar.N0(), 1);
            P0.recycle();
            return p4.r.b((Bundle) com.google.android.gms.internal.cast.v.a(P0, Bundle.CREATOR));
        } catch (RemoteException e) {
            f6373l.a(e, "Unable to call %s on %s.", "getMergedSelectorAsBundle", n.class.getSimpleName());
            return null;
        }
    }

    public final g b() {
        n6.l.e("Must be called from the main thread.");
        return this.f6378c;
    }
}
