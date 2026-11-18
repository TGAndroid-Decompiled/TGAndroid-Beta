package g6;

import a8.n8;
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
import hi.w4;
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
    public static final j6.b f13183l = new j6.b("CastContext", null);
    public static final Object f13184m = new Object();
    public static volatile a f13185n;
    public final Context f13186a;
    public final n f13187b;
    public final g f13188c;
    public final k d;
    public final b f13189e;
    public final j6.s f13190f;
    public final com.google.android.gms.internal.cast.c f13191g;
    public final com.google.android.gms.internal.cast.m h;
    public final List f13192i;
    public final com.google.android.gms.internal.cast.s f13193j;
    public final com.google.android.gms.internal.cast.e f13194k;

    public a(Context context, b bVar, List list, com.google.android.gms.internal.cast.p pVar, j6.s sVar) {
        r rVar;
        y yVar;
        i4 j4Var;
        i4 i4Var;
        LinkProperties linkProperties;
        this.f13186a = context;
        this.f13189e = bVar;
        this.f13190f = sVar;
        this.f13192i = list;
        this.h = new com.google.android.gms.internal.cast.m(context);
        this.f13193j = pVar.f6613f;
        if (!TextUtils.isEmpty(bVar.f13196a)) {
            this.f13194k = new com.google.android.gms.internal.cast.e(context, bVar, pVar);
        } else {
            this.f13194k = null;
        }
        HashMap hashMap = new HashMap();
        com.google.android.gms.internal.cast.e eVar = this.f13194k;
        if (eVar != null) {
            hashMap.put(eVar.f6513b, eVar.f6514c);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.cast.e eVar2 = (com.google.android.gms.internal.cast.e) it.next();
                q6.m.i(eVar2, "Additional SessionProvider must not be null.");
                String str = eVar2.f6513b;
                q6.m.g(str, "Category for SessionProvider must not be null or empty string.");
                q6.m.a("SessionProvider for category " + str + " already added", !hashMap.containsKey(str));
                hashMap.put(str, eVar2.f6514c);
            }
        }
        bVar.G = new b0(1);
        try {
            n a10 = com.google.android.gms.internal.cast.d.a(context, bVar, pVar, hashMap);
            this.f13187b = a10;
            try {
                l lVar = (l) a10;
                Parcel r12 = lVar.r1(lVar.p1(), 6);
                IBinder readStrongBinder = r12.readStrongBinder();
                if (readStrongBinder == null) {
                    rVar = 0;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
                    if (queryLocalInterface instanceof r) {
                        rVar = (r) queryLocalInterface;
                    } else {
                        rVar = new a8.a(readStrongBinder, "com.google.android.gms.cast.framework.IDiscoveryManager", 2);
                    }
                }
                r12.recycle();
                this.d = new k(rVar);
                try {
                    l lVar2 = (l) a10;
                    Parcel r13 = lVar2.r1(lVar2.p1(), 5);
                    IBinder readStrongBinder2 = r13.readStrongBinder();
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
                    r13.recycle();
                    g gVar = new g(yVar, context);
                    this.f13188c = gVar;
                    q6.m.g("PrecacheManager", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    com.google.android.gms.internal.cast.s sVar2 = this.f13193j;
                    if (sVar2 != null) {
                        sVar2.f6655f = gVar;
                        com.google.android.gms.internal.cast.y yVar2 = sVar2.f6653c;
                        q6.m.h(yVar2);
                        yVar2.post(new com.google.android.gms.internal.cast.r(sVar2, 1));
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
                    q6.m.g("BaseNetUtils", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    ConnectivityManager connectivityManager = wVar.f6692c;
                    com.google.android.gms.internal.cast.w.f6689j.b("Start monitoring connectivity changes", new Object[0]);
                    if (!wVar.f6694f && connectivityManager != null && f0.d.b(wVar.f6695g, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                        Network activeNetwork = connectivityManager.getActiveNetwork();
                        if (activeNetwork != null && (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) != null) {
                            wVar.a(activeNetwork, linkProperties);
                        }
                        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(1).build(), wVar.f6691b);
                        wVar.f6694f = true;
                    }
                    com.google.android.gms.internal.cast.c cVar = new com.google.android.gms.internal.cast.c();
                    this.f13191g = cVar;
                    try {
                        l lVar3 = (l) a10;
                        Parcel p12 = lVar3.p1();
                        com.google.android.gms.internal.cast.t.d(p12, cVar);
                        lVar3.t1(p12, 3);
                        cVar.f6497c.add(this.h.f6573a);
                        if (!DesugarCollections.unmodifiableList(bVar.f13205x).isEmpty()) {
                            j6.b bVar2 = f13183l;
                            Log.i(bVar2.f17241a, bVar2.d("Setting Route Discovery for appIds: ".concat(String.valueOf(DesugarCollections.unmodifiableList(this.f13189e.f13205x))), new Object[0]));
                            com.google.android.gms.internal.cast.m mVar = this.h;
                            List<String> unmodifiableList = DesugarCollections.unmodifiableList(this.f13189e.f13205x);
                            mVar.getClass();
                            com.google.android.gms.internal.cast.m.f6572f.b(i5.c.j(unmodifiableList.size(), "SetRouteDiscovery for ", " IDs"), new Object[0]);
                            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                            for (String str2 : unmodifiableList) {
                                linkedHashSet.add(n8.a(str2));
                            }
                            com.google.android.gms.internal.cast.m.f6572f.b("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(mVar.f6575c.keySet())), new Object[0]);
                            HashMap hashMap2 = new HashMap();
                            synchronized (mVar.f6575c) {
                                try {
                                    for (String str3 : linkedHashSet) {
                                        com.google.android.gms.internal.cast.k kVar = (com.google.android.gms.internal.cast.k) mVar.f6575c.get(n8.a(str3));
                                        if (kVar != null) {
                                            hashMap2.put(str3, kVar);
                                        }
                                    }
                                    mVar.f6575c.clear();
                                    mVar.f6575c.putAll(hashMap2);
                                } finally {
                                }
                            }
                            com.google.android.gms.internal.cast.m.f6572f.b("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(mVar.f6575c.keySet())), new Object[0]);
                            synchronized (mVar.d) {
                                mVar.d.clear();
                                mVar.d.addAll(linkedHashSet);
                            }
                            mVar.m();
                        }
                        sVar.f(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"}).addOnSuccessListener(new d6.i(this, 23));
                        com.google.android.gms.common.api.internal.t b10 = com.google.android.gms.common.api.internal.u.b();
                        b10.f6354c = new w4(sVar, new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"});
                        b10.d = new n6.c[]{f6.y.d};
                        b10.f6353b = false;
                        b10.f6352a = 8427;
                        sVar.e(0, b10.a()).addOnSuccessListener(new ob.c(this, 23));
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
        q6.m.e("Must be called from the main thread.");
        if (f13185n == null) {
            synchronized (f13184m) {
                if (f13185n == null) {
                    Context applicationContext = context.getApplicationContext();
                    e d = d(applicationContext);
                    b castOptions = d.getCastOptions(applicationContext);
                    ?? jVar = new com.google.android.gms.common.api.j(applicationContext, j6.s.f17281l, com.google.android.gms.common.api.b.f6197j, com.google.android.gms.common.api.i.f6207c);
                    try {
                        f13185n = new a(applicationContext, castOptions, d.getAdditionalSessionProviders(applicationContext), new com.google.android.gms.internal.cast.p(applicationContext, s4.x.d(applicationContext), castOptions, jVar), jVar);
                    } catch (d e10) {
                        throw new RuntimeException(e10);
                    }
                }
            }
        }
        return f13185n;
    }

    public static e d(Context context) {
        androidx.biometric.t a10;
        try {
            a10 = z6.b.a(context);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e10) {
            e = e10;
        }
        try {
            Bundle bundle = a10.f1963a.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                f13183l.c(new Object[0]);
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

    public final s4.r a() {
        q6.m.e("Must be called from the main thread.");
        try {
            l lVar = (l) this.f13187b;
            Parcel r12 = lVar.r1(lVar.p1(), 1);
            r12.recycle();
            return s4.r.b((Bundle) com.google.android.gms.internal.cast.t.a(r12, Bundle.CREATOR));
        } catch (RemoteException e10) {
            f13183l.a(e10, "Unable to call %s on %s.", "getMergedSelectorAsBundle", n.class.getSimpleName());
            return null;
        }
    }

    public final g b() {
        q6.m.e("Must be called from the main thread.");
        return this.f13188c;
    }
}
