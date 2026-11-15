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
    public static final j6.b f12869l = new j6.b("CastContext", null);
    public static final Object f12870m = new Object();
    public static volatile a f12871n;
    public final Context f12872a;
    public final n f12873b;
    public final g f12874c;
    public final k d;
    public final b f12875e;
    public final j6.s f12876f;
    public final com.google.android.gms.internal.cast.c f12877g;
    public final com.google.android.gms.internal.cast.m h;
    public final List f12878i;
    public final com.google.android.gms.internal.cast.s f12879j;
    public final com.google.android.gms.internal.cast.e f12880k;

    public a(Context context, b bVar, List list, com.google.android.gms.internal.cast.p pVar, j6.s sVar) {
        r rVar;
        y yVar;
        i4 j4Var;
        i4 i4Var;
        LinkProperties linkProperties;
        this.f12872a = context;
        this.f12875e = bVar;
        this.f12876f = sVar;
        this.f12878i = list;
        this.h = new com.google.android.gms.internal.cast.m(context);
        this.f12879j = pVar.f6333f;
        if (!TextUtils.isEmpty(bVar.f12882a)) {
            this.f12880k = new com.google.android.gms.internal.cast.e(context, bVar, pVar);
        } else {
            this.f12880k = null;
        }
        HashMap hashMap = new HashMap();
        com.google.android.gms.internal.cast.e eVar = this.f12880k;
        if (eVar != null) {
            hashMap.put(eVar.f6233b, eVar.f6234c);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.cast.e eVar2 = (com.google.android.gms.internal.cast.e) it.next();
                q6.m.h(eVar2, "Additional SessionProvider must not be null.");
                String str = eVar2.f6233b;
                q6.m.f(str, "Category for SessionProvider must not be null or empty string.");
                q6.m.a("SessionProvider for category " + str + " already added", !hashMap.containsKey(str));
                hashMap.put(str, eVar2.f6234c);
            }
        }
        bVar.G = new b0(1);
        try {
            n a10 = com.google.android.gms.internal.cast.d.a(context, bVar, pVar, hashMap);
            this.f12873b = a10;
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
                    this.f12874c = gVar;
                    q6.m.f("PrecacheManager", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    com.google.android.gms.internal.cast.s sVar2 = this.f12879j;
                    if (sVar2 != null) {
                        sVar2.f6375f = gVar;
                        com.google.android.gms.internal.cast.y yVar2 = sVar2.f6373c;
                        q6.m.g(yVar2);
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
                    q6.m.f("BaseNetUtils", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    ConnectivityManager connectivityManager = wVar.f6412c;
                    com.google.android.gms.internal.cast.w.f6409j.b("Start monitoring connectivity changes", new Object[0]);
                    if (!wVar.f6414f && connectivityManager != null && f0.d.b(wVar.f6415g, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                        Network activeNetwork = connectivityManager.getActiveNetwork();
                        if (activeNetwork != null && (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) != null) {
                            wVar.a(activeNetwork, linkProperties);
                        }
                        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(1).build(), wVar.f6411b);
                        wVar.f6414f = true;
                    }
                    com.google.android.gms.internal.cast.c cVar = new com.google.android.gms.internal.cast.c();
                    this.f12877g = cVar;
                    try {
                        l lVar3 = (l) a10;
                        Parcel p12 = lVar3.p1();
                        com.google.android.gms.internal.cast.t.d(p12, cVar);
                        lVar3.t1(p12, 3);
                        cVar.f6217c.add(this.h.f6293a);
                        if (!DesugarCollections.unmodifiableList(bVar.f12891x).isEmpty()) {
                            j6.b bVar2 = f12869l;
                            Log.i(bVar2.f16859a, bVar2.d("Setting Route Discovery for appIds: ".concat(String.valueOf(DesugarCollections.unmodifiableList(this.f12875e.f12891x))), new Object[0]));
                            com.google.android.gms.internal.cast.m mVar = this.h;
                            List<String> unmodifiableList = DesugarCollections.unmodifiableList(this.f12875e.f12891x);
                            mVar.getClass();
                            com.google.android.gms.internal.cast.m.f6292f.b(i5.c.j(unmodifiableList.size(), "SetRouteDiscovery for ", " IDs"), new Object[0]);
                            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                            for (String str2 : unmodifiableList) {
                                linkedHashSet.add(n8.a(str2));
                            }
                            com.google.android.gms.internal.cast.m.f6292f.b("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(mVar.f6295c.keySet())), new Object[0]);
                            HashMap hashMap2 = new HashMap();
                            synchronized (mVar.f6295c) {
                                try {
                                    for (String str3 : linkedHashSet) {
                                        com.google.android.gms.internal.cast.k kVar = (com.google.android.gms.internal.cast.k) mVar.f6295c.get(n8.a(str3));
                                        if (kVar != null) {
                                            hashMap2.put(str3, kVar);
                                        }
                                    }
                                    mVar.f6295c.clear();
                                    mVar.f6295c.putAll(hashMap2);
                                } finally {
                                }
                            }
                            com.google.android.gms.internal.cast.m.f6292f.b("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(mVar.f6295c.keySet())), new Object[0]);
                            synchronized (mVar.d) {
                                mVar.d.clear();
                                mVar.d.addAll(linkedHashSet);
                            }
                            mVar.m();
                        }
                        sVar.f(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"}).addOnSuccessListener(new cb.c(this, 27));
                        com.google.android.gms.common.api.internal.t b10 = com.google.android.gms.common.api.internal.u.b();
                        b10.f6074c = new gc.b(sVar, new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"});
                        b10.d = new n6.c[]{f6.y.d};
                        b10.f6073b = false;
                        b10.f6072a = 8427;
                        sVar.e(0, b10.a()).addOnSuccessListener(new d6.i(this, 20));
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
        q6.m.d("Must be called from the main thread.");
        if (f12871n == null) {
            synchronized (f12870m) {
                if (f12871n == null) {
                    Context applicationContext = context.getApplicationContext();
                    e d = d(applicationContext);
                    b castOptions = d.getCastOptions(applicationContext);
                    ?? jVar = new com.google.android.gms.common.api.j(applicationContext, j6.s.f16899l, com.google.android.gms.common.api.b.f5917j, com.google.android.gms.common.api.i.f5927c);
                    try {
                        f12871n = new a(applicationContext, castOptions, d.getAdditionalSessionProviders(applicationContext), new com.google.android.gms.internal.cast.p(applicationContext, s4.x.d(applicationContext), castOptions, jVar), jVar);
                    } catch (d e10) {
                        throw new RuntimeException(e10);
                    }
                }
            }
        }
        return f12871n;
    }

    public static e d(Context context) {
        androidx.biometric.t a10;
        try {
            a10 = z6.b.a(context);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e10) {
            e = e10;
        }
        try {
            Bundle bundle = a10.f1971a.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                f12869l.c(new Object[0]);
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
        q6.m.d("Must be called from the main thread.");
        try {
            l lVar = (l) this.f12873b;
            Parcel r12 = lVar.r1(lVar.p1(), 1);
            r12.recycle();
            return s4.r.b((Bundle) com.google.android.gms.internal.cast.t.a(r12, Bundle.CREATOR));
        } catch (RemoteException e10) {
            f12869l.a(e10, "Unable to call %s on %s.", "getMergedSelectorAsBundle", n.class.getSimpleName());
            return null;
        }
    }

    public final g b() {
        q6.m.d("Must be called from the main thread.");
        return this.f12874c;
    }
}
