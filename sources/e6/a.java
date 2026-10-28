package e6;

import a8.da;
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
import com.google.android.gms.internal.cast.i4;
import com.google.android.gms.internal.cast.j4;
import com.google.android.gms.internal.cast.n4;
import j$.util.DesugarCollections;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
public final class a {
    public static final h6.b f9779l = new h6.b("CastContext", null);
    public static final Object f9780m = new Object();
    public static volatile a f9781n;
    public final Context f9782a;
    public final n f9783b;
    public final g f9784c;
    public final k d;
    public final b e;
    public final h6.r f9785f;
    public final com.google.android.gms.internal.cast.c f9786g;
    public final com.google.android.gms.internal.cast.m h;
    public final List f9787i;
    public final com.google.android.gms.internal.cast.s f9788j;
    public final com.google.android.gms.internal.cast.e f9789k;

    public a(Context context, b bVar, List list, com.google.android.gms.internal.cast.p pVar, h6.r rVar) {
        r rVar2;
        y yVar;
        i4 j4Var;
        i4 i4Var;
        LinkProperties linkProperties;
        this.f9782a = context;
        this.e = bVar;
        this.f9785f = rVar;
        this.f9787i = list;
        this.h = new com.google.android.gms.internal.cast.m(context);
        this.f9788j = pVar.f6849f;
        if (!TextUtils.isEmpty(bVar.f9791a)) {
            this.f9789k = new com.google.android.gms.internal.cast.e(context, bVar, pVar);
        } else {
            this.f9789k = null;
        }
        HashMap hashMap = new HashMap();
        com.google.android.gms.internal.cast.e eVar = this.f9789k;
        if (eVar != null) {
            hashMap.put(eVar.f6770b, eVar.f6771c);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.cast.e eVar2 = (com.google.android.gms.internal.cast.e) it.next();
                o6.l.i(eVar2, "Additional SessionProvider must not be null.");
                String str = eVar2.f6770b;
                o6.l.g(str, "Category for SessionProvider must not be null or empty string.");
                o6.l.a("SessionProvider for category " + str + " already added", !hashMap.containsKey(str));
                hashMap.put(str, eVar2.f6771c);
            }
        }
        bVar.F = new b0(1);
        try {
            n a2 = com.google.android.gms.internal.cast.d.a(context, bVar, pVar, hashMap);
            this.f9783b = a2;
            try {
                l lVar = (l) a2;
                Parcel P0 = lVar.P0(lVar.N0(), 6);
                IBinder readStrongBinder = P0.readStrongBinder();
                if (readStrongBinder == null) {
                    rVar2 = 0;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
                    if (queryLocalInterface instanceof r) {
                        rVar2 = (r) queryLocalInterface;
                    } else {
                        rVar2 = new a8.a(readStrongBinder, "com.google.android.gms.cast.framework.IDiscoveryManager", 2);
                    }
                }
                P0.recycle();
                this.d = new k(rVar2);
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
                            yVar = new a8.a(readStrongBinder2, "com.google.android.gms.cast.framework.ISessionManager", 2);
                        }
                    }
                    P02.recycle();
                    g gVar = new g(yVar, context);
                    this.f9784c = gVar;
                    o6.l.g("PrecacheManager", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    com.google.android.gms.internal.cast.s sVar = this.f9788j;
                    if (sVar != null) {
                        sVar.f6880f = gVar;
                        com.google.android.gms.internal.cast.y yVar2 = sVar.f6879c;
                        o6.l.h(yVar2);
                        yVar2.post(new com.google.android.gms.internal.cast.r(sVar, 1));
                    }
                    ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
                    if (newFixedThreadPool instanceof i4) {
                        i4Var = (i4) newFixedThreadPool;
                    } else {
                        if (newFixedThreadPool instanceof ScheduledExecutorService) {
                            j4Var = new n4((ScheduledExecutorService) newFixedThreadPool);
                        } else {
                            j4Var = new j4(newFixedThreadPool);
                        }
                        i4Var = j4Var;
                    }
                    com.google.android.gms.internal.cast.w wVar = new com.google.android.gms.internal.cast.w(context, i4Var);
                    o6.l.g("BaseNetUtils", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    ConnectivityManager connectivityManager = wVar.f6921c;
                    com.google.android.gms.internal.cast.w.f6918j.b("Start monitoring connectivity changes", new Object[0]);
                    if (!wVar.f6922f && connectivityManager != null && f0.c.b(wVar.f6923g, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                        Network activeNetwork = connectivityManager.getActiveNetwork();
                        if (activeNetwork != null && (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) != null) {
                            wVar.a(activeNetwork, linkProperties);
                        }
                        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(1).build(), wVar.f6920b);
                        wVar.f6922f = true;
                    }
                    com.google.android.gms.internal.cast.c cVar = new com.google.android.gms.internal.cast.c();
                    this.f9786g = cVar;
                    try {
                        l lVar3 = (l) a2;
                        Parcel N0 = lVar3.N0();
                        com.google.android.gms.internal.cast.t.d(N0, cVar);
                        lVar3.R0(N0, 3);
                        cVar.f6753c.add(this.h.f6821a);
                        if (!DesugarCollections.unmodifiableList(bVar.f9798w).isEmpty()) {
                            h6.b bVar2 = f9779l;
                            Log.i(bVar2.f12620a, bVar2.d("Setting Route Discovery for appIds: ".concat(String.valueOf(DesugarCollections.unmodifiableList(this.e.f9798w))), new Object[0]));
                            com.google.android.gms.internal.cast.m mVar = this.h;
                            List<String> unmodifiableList = DesugarCollections.unmodifiableList(this.e.f9798w);
                            mVar.getClass();
                            com.google.android.gms.internal.cast.m.f6820f.b(ic.a.j(unmodifiableList.size(), "SetRouteDiscovery for ", " IDs"), new Object[0]);
                            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                            for (String str2 : unmodifiableList) {
                                linkedHashSet.add(da.a(str2));
                            }
                            com.google.android.gms.internal.cast.m.f6820f.b("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(mVar.f6823c.keySet())), new Object[0]);
                            HashMap hashMap2 = new HashMap();
                            synchronized (mVar.f6823c) {
                                try {
                                    for (String str3 : linkedHashSet) {
                                        com.google.android.gms.internal.cast.k kVar = (com.google.android.gms.internal.cast.k) mVar.f6823c.get(da.a(str3));
                                        if (kVar != null) {
                                            hashMap2.put(str3, kVar);
                                        }
                                    }
                                    mVar.f6823c.clear();
                                    mVar.f6823c.putAll(hashMap2);
                                } finally {
                                }
                            }
                            com.google.android.gms.internal.cast.m.f6820f.b("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(mVar.f6823c.keySet())), new Object[0]);
                            synchronized (mVar.d) {
                                mVar.d.clear();
                                mVar.d.addAll(linkedHashSet);
                            }
                            mVar.m();
                        }
                        rVar.f(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"}).addOnSuccessListener(new b6.i(this, 16));
                        com.google.android.gms.common.api.internal.u b10 = com.google.android.gms.common.api.internal.v.b();
                        b10.f6622c = new za.c(rVar, new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"});
                        b10.d = new l6.c[]{d6.y.d};
                        b10.f6621b = false;
                        b10.f6620a = 8427;
                        rVar.e(0, b10.a()).addOnSuccessListener(new a4.l(this, 14));
                    } catch (RemoteException e) {
                        throw new IllegalStateException("Failed to call addAppVisibilityListener", e);
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
        o6.l.e("Must be called from the main thread.");
        if (f9781n == null) {
            synchronized (f9780m) {
                if (f9781n == null) {
                    Context applicationContext = context.getApplicationContext();
                    e d = d(applicationContext);
                    b castOptions = d.getCastOptions(applicationContext);
                    ?? jVar = new com.google.android.gms.common.api.j(applicationContext, h6.r.f12655k, com.google.android.gms.common.api.b.f6469j, com.google.android.gms.common.api.i.f6478c);
                    try {
                        f9781n = new a(applicationContext, castOptions, d.getAdditionalSessionProviders(applicationContext), new com.google.android.gms.internal.cast.p(applicationContext, p4.x.d(applicationContext), castOptions, jVar), jVar);
                    } catch (d e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return f9781n;
    }

    public static e d(Context context) {
        t6.f a2;
        try {
            a2 = x6.b.a(context);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
            e = e;
        }
        try {
            Bundle bundle = ((Context) a2.f48753a).getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                f9779l.c(new Object[0]);
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
        o6.l.e("Must be called from the main thread.");
        try {
            l lVar = (l) this.f9783b;
            Parcel P0 = lVar.P0(lVar.N0(), 1);
            P0.recycle();
            return p4.r.b((Bundle) com.google.android.gms.internal.cast.t.a(P0, Bundle.CREATOR));
        } catch (RemoteException e) {
            f9779l.a(e, "Unable to call %s on %s.", "getMergedSelectorAsBundle", n.class.getSimpleName());
            return null;
        }
    }

    public final g b() {
        o6.l.e("Must be called from the main thread.");
        return this.f9784c;
    }
}
