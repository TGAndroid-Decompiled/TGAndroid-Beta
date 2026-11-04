package f6;

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
import b8.aa;
import com.google.android.gms.internal.cast.j4;
import com.google.android.gms.internal.cast.k4;
import com.google.android.gms.internal.cast.o4;
import gi.w5;
import j$.util.DesugarCollections;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import k2.p1;
public final class a {
    public static final i6.b f11442l = new i6.b("CastContext", null);
    public static final Object f11443m = new Object();
    public static volatile a f11444n;
    public final Context f11445a;
    public final n f11446b;
    public final g f11447c;
    public final k d;
    public final b f11448e;
    public final i6.r f11449f;
    public final com.google.android.gms.internal.cast.c f11450g;
    public final com.google.android.gms.internal.cast.m h;
    public final List f11451i;
    public final com.google.android.gms.internal.cast.t f11452j;
    public final com.google.android.gms.internal.cast.e f11453k;

    public a(Context context, b bVar, List list, com.google.android.gms.internal.cast.q qVar, i6.r rVar) {
        r rVar2;
        y yVar;
        j4 k4Var;
        j4 j4Var;
        LinkProperties linkProperties;
        this.f11445a = context;
        this.f11448e = bVar;
        this.f11449f = rVar;
        this.f11451i = list;
        this.h = new com.google.android.gms.internal.cast.m(context);
        this.f11452j = qVar.f7007f;
        if (!TextUtils.isEmpty(bVar.f11455a)) {
            this.f11453k = new com.google.android.gms.internal.cast.e(context, bVar, qVar);
        } else {
            this.f11453k = null;
        }
        HashMap hashMap = new HashMap();
        com.google.android.gms.internal.cast.e eVar = this.f11453k;
        if (eVar != null) {
            hashMap.put(eVar.f6904b, eVar.f6905c);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.cast.e eVar2 = (com.google.android.gms.internal.cast.e) it.next();
                p6.m.h(eVar2, "Additional SessionProvider must not be null.");
                String str = eVar2.f6904b;
                p6.m.f(str, "Category for SessionProvider must not be null or empty string.");
                p6.m.a("SessionProvider for category " + str + " already added", !hashMap.containsKey(str));
                hashMap.put(str, eVar2.f6905c);
            }
        }
        bVar.G = new b0(1);
        try {
            n a10 = com.google.android.gms.internal.cast.d.a(context, bVar, qVar, hashMap);
            this.f11446b = a10;
            try {
                l lVar = (l) a10;
                Parcel R0 = lVar.R0(lVar.P0(), 6);
                IBinder readStrongBinder = R0.readStrongBinder();
                if (readStrongBinder == null) {
                    rVar2 = 0;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
                    if (queryLocalInterface instanceof r) {
                        rVar2 = (r) queryLocalInterface;
                    } else {
                        rVar2 = new b8.a(readStrongBinder, "com.google.android.gms.cast.framework.IDiscoveryManager", 2);
                    }
                }
                R0.recycle();
                this.d = new k(rVar2);
                try {
                    l lVar2 = (l) a10;
                    Parcel R02 = lVar2.R0(lVar2.P0(), 5);
                    IBinder readStrongBinder2 = R02.readStrongBinder();
                    if (readStrongBinder2 == null) {
                        yVar = 0;
                    } else {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
                        if (queryLocalInterface2 instanceof y) {
                            yVar = (y) queryLocalInterface2;
                        } else {
                            yVar = new b8.a(readStrongBinder2, "com.google.android.gms.cast.framework.ISessionManager", 2);
                        }
                    }
                    R02.recycle();
                    g gVar = new g(yVar, context);
                    this.f11447c = gVar;
                    p6.m.f("PrecacheManager", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    com.google.android.gms.internal.cast.t tVar = this.f11452j;
                    if (tVar != null) {
                        tVar.f7049f = gVar;
                        com.google.android.gms.internal.cast.z zVar = tVar.f7047c;
                        p6.m.g(zVar);
                        zVar.post(new com.google.android.gms.internal.cast.s(tVar, 1));
                    }
                    ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
                    if (newFixedThreadPool instanceof j4) {
                        j4Var = (j4) newFixedThreadPool;
                    } else {
                        if (newFixedThreadPool instanceof ScheduledExecutorService) {
                            k4Var = new o4((ScheduledExecutorService) newFixedThreadPool);
                        } else {
                            k4Var = new k4(newFixedThreadPool);
                        }
                        j4Var = k4Var;
                    }
                    com.google.android.gms.internal.cast.x xVar = new com.google.android.gms.internal.cast.x(context, j4Var);
                    p6.m.f("BaseNetUtils", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    ConnectivityManager connectivityManager = xVar.f7086c;
                    com.google.android.gms.internal.cast.x.f7083j.b("Start monitoring connectivity changes", new Object[0]);
                    if (!xVar.f7088f && connectivityManager != null && f0.d.b(xVar.f7089g, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                        Network activeNetwork = connectivityManager.getActiveNetwork();
                        if (activeNetwork != null && (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) != null) {
                            xVar.a(activeNetwork, linkProperties);
                        }
                        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(1).build(), xVar.f7085b);
                        xVar.f7088f = true;
                    }
                    com.google.android.gms.internal.cast.c cVar = new com.google.android.gms.internal.cast.c();
                    this.f11450g = cVar;
                    try {
                        l lVar3 = (l) a10;
                        Parcel P0 = lVar3.P0();
                        com.google.android.gms.internal.cast.u.d(P0, cVar);
                        lVar3.T0(P0, 3);
                        cVar.f6880c.add(this.h.f6962a);
                        if (!DesugarCollections.unmodifiableList(bVar.f11464x).isEmpty()) {
                            i6.b bVar2 = f11442l;
                            Log.i(bVar2.f14620a, bVar2.d("Setting Route Discovery for appIds: ".concat(String.valueOf(DesugarCollections.unmodifiableList(this.f11448e.f11464x))), new Object[0]));
                            com.google.android.gms.internal.cast.m mVar = this.h;
                            List<String> unmodifiableList = DesugarCollections.unmodifiableList(this.f11448e.f11464x);
                            mVar.getClass();
                            com.google.android.gms.internal.cast.m.f6961f.b(p1.j(unmodifiableList.size(), "SetRouteDiscovery for ", " IDs"), new Object[0]);
                            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                            for (String str2 : unmodifiableList) {
                                linkedHashSet.add(aa.a(str2));
                            }
                            com.google.android.gms.internal.cast.m.f6961f.b("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(mVar.f6964c.keySet())), new Object[0]);
                            HashMap hashMap2 = new HashMap();
                            synchronized (mVar.f6964c) {
                                try {
                                    for (String str3 : linkedHashSet) {
                                        com.google.android.gms.internal.cast.k kVar = (com.google.android.gms.internal.cast.k) mVar.f6964c.get(aa.a(str3));
                                        if (kVar != null) {
                                            hashMap2.put(str3, kVar);
                                        }
                                    }
                                    mVar.f6964c.clear();
                                    mVar.f6964c.putAll(hashMap2);
                                } finally {
                                }
                            }
                            com.google.android.gms.internal.cast.m.f6961f.b("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(mVar.f6964c.keySet())), new Object[0]);
                            synchronized (mVar.d) {
                                mVar.d.clear();
                                mVar.d.addAll(linkedHashSet);
                            }
                            mVar.m();
                        }
                        rVar.f(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"}).addOnSuccessListener(new android.support.v4.media.c(this, 22));
                        com.google.android.gms.common.api.internal.s b10 = com.google.android.gms.common.api.internal.t.b();
                        b10.f6737c = new w5(rVar, new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"}, 3);
                        b10.d = new m6.c[]{e6.y.d};
                        b10.f6736b = false;
                        b10.f6735a = 8427;
                        rVar.e(0, b10.a()).addOnSuccessListener(new bb.c(this, 23));
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
        p6.m.d("Must be called from the main thread.");
        if (f11444n == null) {
            synchronized (f11443m) {
                if (f11444n == null) {
                    Context applicationContext = context.getApplicationContext();
                    e d = d(applicationContext);
                    b castOptions = d.getCastOptions(applicationContext);
                    ?? jVar = new com.google.android.gms.common.api.j(applicationContext, i6.r.f14658l, com.google.android.gms.common.api.b.f6584j, com.google.android.gms.common.api.i.f6594c);
                    try {
                        f11444n = new a(applicationContext, castOptions, d.getAdditionalSessionProviders(applicationContext), new com.google.android.gms.internal.cast.q(applicationContext, r4.y.d(applicationContext), castOptions, jVar), jVar);
                    } catch (d e10) {
                        throw new RuntimeException(e10);
                    }
                }
            }
        }
        return f11444n;
    }

    public static e d(Context context) {
        androidx.emoji2.text.n a10;
        try {
            a10 = y6.b.a(context);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e10) {
            e = e10;
        }
        try {
            Bundle bundle = a10.f1741a.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                f11442l.c(new Object[0]);
            }
            String string = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
            if (string != null) {
                return (e) Class.forName(string).asSubclass(e.class).getDeclaredConstructor(null).newInstance(null);
            }
            throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
        } catch (ClassNotFoundException e11) {
            e = e11;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (IllegalAccessException e12) {
            e = e12;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (InstantiationException e13) {
            e = e13;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (NoSuchMethodException e14) {
            e = e14;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (NullPointerException e15) {
            e = e15;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        }
    }

    public final r4.r a() {
        p6.m.d("Must be called from the main thread.");
        try {
            l lVar = (l) this.f11446b;
            Parcel R0 = lVar.R0(lVar.P0(), 1);
            R0.recycle();
            return r4.r.b((Bundle) com.google.android.gms.internal.cast.u.a(R0, Bundle.CREATOR));
        } catch (RemoteException e10) {
            f11442l.a(e10, "Unable to call %s on %s.", "getMergedSelectorAsBundle", n.class.getSimpleName());
            return null;
        }
    }

    public final g b() {
        p6.m.d("Must be called from the main thread.");
        return this.f11447c;
    }
}
