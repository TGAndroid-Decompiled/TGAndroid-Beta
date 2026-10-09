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
import v7.j5;
public final class a {
    public static final g6.b f8153l = new g6.b("CastContext", null);
    public static final Object f8154m = new Object();
    public static volatile a f8155n;
    public final Context f8156a;
    public final n f8157b;
    public final g f8158c;
    public final k d;
    public final b f8159e;
    public final g6.r f8160f;
    public final com.google.android.gms.internal.cast.d f8161g;
    public final com.google.android.gms.internal.cast.n h;
    public final List f8162i;
    public final com.google.android.gms.internal.cast.u f8163j;
    public final com.google.android.gms.internal.cast.f f8164k;

    public a(Context context, b bVar, List list, com.google.android.gms.internal.cast.r rVar, g6.r rVar2) {
        r rVar3;
        y yVar;
        l4 m4Var;
        l4 l4Var;
        LinkProperties linkProperties;
        this.f8156a = context;
        this.f8159e = bVar;
        this.f8160f = rVar2;
        this.f8162i = list;
        this.h = new com.google.android.gms.internal.cast.n(context);
        this.f8163j = rVar.f6976f;
        if (!TextUtils.isEmpty(bVar.f8166a)) {
            this.f8164k = new com.google.android.gms.internal.cast.f(context, bVar, rVar);
        } else {
            this.f8164k = null;
        }
        HashMap hashMap = new HashMap();
        com.google.android.gms.internal.cast.f fVar = this.f8164k;
        if (fVar != null) {
            hashMap.put(fVar.f6875b, fVar.f6876c);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.cast.f fVar2 = (com.google.android.gms.internal.cast.f) it.next();
                n6.l.i(fVar2, "Additional SessionProvider must not be null.");
                String str = fVar2.f6875b;
                n6.l.g(str, "Category for SessionProvider must not be null or empty string.");
                n6.l.a("SessionProvider for category " + str + " already added", !hashMap.containsKey(str));
                hashMap.put(str, fVar2.f6876c);
            }
        }
        bVar.F = new b0(1);
        try {
            n a2 = com.google.android.gms.internal.cast.e.a(context, bVar, rVar, hashMap);
            this.f8157b = a2;
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
                    this.f8158c = gVar;
                    n6.l.g("PrecacheManager", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    com.google.android.gms.internal.cast.u uVar = this.f8163j;
                    if (uVar != null) {
                        uVar.f7016f = gVar;
                        com.google.android.gms.internal.cast.a0 a0Var = uVar.f7014c;
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
                    ConnectivityManager connectivityManager = yVar2.f7055c;
                    com.google.android.gms.internal.cast.y.f7052j.b("Start monitoring connectivity changes", new Object[0]);
                    if (!yVar2.f7057f && connectivityManager != null && f0.c.b(yVar2.f7058g, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                        Network activeNetwork = connectivityManager.getActiveNetwork();
                        if (activeNetwork != null && (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) != null) {
                            yVar2.a(activeNetwork, linkProperties);
                        }
                        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(1).build(), yVar2.f7054b);
                        yVar2.f7057f = true;
                    }
                    com.google.android.gms.internal.cast.d dVar = new com.google.android.gms.internal.cast.d();
                    this.f8161g = dVar;
                    try {
                        l lVar3 = (l) a2;
                        Parcel N0 = lVar3.N0();
                        com.google.android.gms.internal.cast.v.d(N0, dVar);
                        lVar3.R0(N0, 3);
                        dVar.f6810c.add(this.h.f6942a);
                        if (!DesugarCollections.unmodifiableList(bVar.f8174w).isEmpty()) {
                            g6.b bVar2 = f8153l;
                            Log.i(bVar2.f10323a, bVar2.d("Setting Route Discovery for appIds: ".concat(String.valueOf(DesugarCollections.unmodifiableList(this.f8159e.f8174w))), new Object[0]));
                            com.google.android.gms.internal.cast.n nVar = this.h;
                            List<String> unmodifiableList = DesugarCollections.unmodifiableList(this.f8159e.f8174w);
                            nVar.getClass();
                            com.google.android.gms.internal.cast.n.f6941f.b(hg.c.i(unmodifiableList.size(), "SetRouteDiscovery for ", " IDs"), new Object[0]);
                            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                            for (String str2 : unmodifiableList) {
                                linkedHashSet.add(j5.a(str2));
                            }
                            com.google.android.gms.internal.cast.n.f6941f.b("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(nVar.f6944c.keySet())), new Object[0]);
                            HashMap hashMap2 = new HashMap();
                            synchronized (nVar.f6944c) {
                                try {
                                    for (String str3 : linkedHashSet) {
                                        com.google.android.gms.internal.cast.l lVar4 = (com.google.android.gms.internal.cast.l) nVar.f6944c.get(j5.a(str3));
                                        if (lVar4 != null) {
                                            hashMap2.put(str3, lVar4);
                                        }
                                    }
                                    nVar.f6944c.clear();
                                    nVar.f6944c.putAll(hashMap2);
                                } finally {
                                }
                            }
                            com.google.android.gms.internal.cast.n.f6941f.b("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(nVar.f6944c.keySet())), new Object[0]);
                            synchronized (nVar.d) {
                                nVar.d.clear();
                                nVar.d.addAll(linkedHashSet);
                            }
                            nVar.m();
                        }
                        rVar2.f(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"}).addOnSuccessListener(new xa.d(this, 14));
                        com.google.android.gms.common.api.internal.v e7 = com.google.android.gms.common.api.internal.w.e();
                        e7.f6696c = new a6.i(rVar2, new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"});
                        e7.d = new k6.c[]{c6.y.d};
                        e7.f6695b = false;
                        e7.f6694a = 8427;
                        rVar2.e(0, e7.a()).addOnSuccessListener(new a6.i(this, 16));
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
        if (f8155n == null) {
            synchronized (f8154m) {
                if (f8155n == null) {
                    Context applicationContext = context.getApplicationContext();
                    e d = d(applicationContext);
                    b castOptions = d.getCastOptions(applicationContext);
                    ?? jVar = new com.google.android.gms.common.api.j(applicationContext, g6.r.f10361k, com.google.android.gms.common.api.b.f6528t, com.google.android.gms.common.api.i.f6537c);
                    try {
                        f8155n = new a(applicationContext, castOptions, d.getAdditionalSessionProviders(applicationContext), new com.google.android.gms.internal.cast.r(applicationContext, p4.x.d(applicationContext), castOptions, jVar), jVar);
                    } catch (d e7) {
                        throw new RuntimeException(e7);
                    }
                }
            }
        }
        return f8155n;
    }

    public static e d(Context context) {
        k6.h a2;
        try {
            a2 = w6.b.a(context);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e7) {
            e = e7;
        }
        try {
            Bundle bundle = a2.f14714a.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                f8153l.c(new Object[0]);
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
            l lVar = (l) this.f8157b;
            Parcel P0 = lVar.P0(lVar.N0(), 1);
            P0.recycle();
            return p4.r.b((Bundle) com.google.android.gms.internal.cast.v.a(P0, Bundle.CREATOR));
        } catch (RemoteException e7) {
            f8153l.a(e7, "Unable to call %s on %s.", "getMergedSelectorAsBundle", n.class.getSimpleName());
            return null;
        }
    }

    public final g b() {
        n6.l.e("Must be called from the main thread.");
        return this.f8158c;
    }
}
