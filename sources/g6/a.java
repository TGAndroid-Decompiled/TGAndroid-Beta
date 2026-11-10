package g6;

import a8.m8;
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
import f3.l0;
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
    public static final j6.b f13520l = new j6.b("CastContext", null);
    public static final Object f13521m = new Object();
    public static volatile a f13522n;
    public final Context f13523a;
    public final n f13524b;
    public final g f13525c;
    public final k d;
    public final b f13526e;
    public final j6.r f13527f;
    public final com.google.android.gms.internal.cast.c f13528g;
    public final com.google.android.gms.internal.cast.m h;
    public final List f13529i;
    public final com.google.android.gms.internal.cast.s f13530j;
    public final com.google.android.gms.internal.cast.e f13531k;

    public a(Context context, b bVar, List list, com.google.android.gms.internal.cast.p pVar, j6.r rVar) {
        r rVar2;
        y yVar;
        i4 j4Var;
        i4 i4Var;
        LinkProperties linkProperties;
        this.f13523a = context;
        this.f13526e = bVar;
        this.f13527f = rVar;
        this.f13529i = list;
        this.h = new com.google.android.gms.internal.cast.m(context);
        this.f13530j = pVar.f6944f;
        if (!TextUtils.isEmpty(bVar.f13533a)) {
            this.f13531k = new com.google.android.gms.internal.cast.e(context, bVar, pVar);
        } else {
            this.f13531k = null;
        }
        HashMap hashMap = new HashMap();
        com.google.android.gms.internal.cast.e eVar = this.f13531k;
        if (eVar != null) {
            hashMap.put(eVar.f6844b, eVar.f6845c);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.cast.e eVar2 = (com.google.android.gms.internal.cast.e) it.next();
                q6.m.h(eVar2, "Additional SessionProvider must not be null.");
                String str = eVar2.f6844b;
                q6.m.f(str, "Category for SessionProvider must not be null or empty string.");
                q6.m.a("SessionProvider for category " + str + " already added", !hashMap.containsKey(str));
                hashMap.put(str, eVar2.f6845c);
            }
        }
        bVar.F = new b0(1);
        try {
            n a10 = com.google.android.gms.internal.cast.d.a(context, bVar, pVar, hashMap);
            this.f13524b = a10;
            try {
                l lVar = (l) a10;
                Parcel r12 = lVar.r1(lVar.p1(), 6);
                IBinder readStrongBinder = r12.readStrongBinder();
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
                r12.recycle();
                this.d = new k(rVar2);
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
                    this.f13525c = gVar;
                    q6.m.f("PrecacheManager", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    com.google.android.gms.internal.cast.s sVar = this.f13530j;
                    if (sVar != null) {
                        sVar.f6986f = gVar;
                        com.google.android.gms.internal.cast.y yVar2 = sVar.f6984c;
                        q6.m.g(yVar2);
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
                    q6.m.f("BaseNetUtils", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    ConnectivityManager connectivityManager = wVar.f7023c;
                    com.google.android.gms.internal.cast.w.f7020j.b("Start monitoring connectivity changes", new Object[0]);
                    if (!wVar.f7025f && connectivityManager != null && f0.d.b(wVar.f7026g, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                        Network activeNetwork = connectivityManager.getActiveNetwork();
                        if (activeNetwork != null && (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) != null) {
                            wVar.a(activeNetwork, linkProperties);
                        }
                        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(1).build(), wVar.f7022b);
                        wVar.f7025f = true;
                    }
                    com.google.android.gms.internal.cast.c cVar = new com.google.android.gms.internal.cast.c();
                    this.f13528g = cVar;
                    try {
                        l lVar3 = (l) a10;
                        Parcel p12 = lVar3.p1();
                        com.google.android.gms.internal.cast.t.d(p12, cVar);
                        lVar3.t1(p12, 3);
                        cVar.f6828c.add(this.h.f6904a);
                        if (!DesugarCollections.unmodifiableList(bVar.f13542x).isEmpty()) {
                            j6.b bVar2 = f13520l;
                            Log.i(bVar2.f16508a, bVar2.d("Setting Route Discovery for appIds: ".concat(String.valueOf(DesugarCollections.unmodifiableList(this.f13526e.f13542x))), new Object[0]));
                            com.google.android.gms.internal.cast.m mVar = this.h;
                            List<String> unmodifiableList = DesugarCollections.unmodifiableList(this.f13526e.f13542x);
                            mVar.getClass();
                            com.google.android.gms.internal.cast.m.f6903f.b(jg.g.k(unmodifiableList.size(), "SetRouteDiscovery for ", " IDs"), new Object[0]);
                            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                            for (String str2 : unmodifiableList) {
                                linkedHashSet.add(m8.a(str2));
                            }
                            com.google.android.gms.internal.cast.m.f6903f.b("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(mVar.f6906c.keySet())), new Object[0]);
                            HashMap hashMap2 = new HashMap();
                            synchronized (mVar.f6906c) {
                                try {
                                    for (String str3 : linkedHashSet) {
                                        com.google.android.gms.internal.cast.k kVar = (com.google.android.gms.internal.cast.k) mVar.f6906c.get(m8.a(str3));
                                        if (kVar != null) {
                                            hashMap2.put(str3, kVar);
                                        }
                                    }
                                    mVar.f6906c.clear();
                                    mVar.f6906c.putAll(hashMap2);
                                } finally {
                                }
                            }
                            com.google.android.gms.internal.cast.m.f6903f.b("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(mVar.f6906c.keySet())), new Object[0]);
                            synchronized (mVar.d) {
                                mVar.d.clear();
                                mVar.d.addAll(linkedHashSet);
                            }
                            mVar.m();
                        }
                        rVar.f(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"}).addOnSuccessListener(new cb.c(this, 29));
                        com.google.android.gms.common.api.internal.s b10 = com.google.android.gms.common.api.internal.t.b();
                        b10.f6685c = new l0(rVar, new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"});
                        b10.d = new n6.c[]{f6.y.d};
                        b10.f6684b = false;
                        b10.f6683a = 8427;
                        rVar.e(0, b10.a()).addOnSuccessListener(new d6.i(this, 27));
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
        if (f13522n == null) {
            synchronized (f13521m) {
                if (f13522n == null) {
                    Context applicationContext = context.getApplicationContext();
                    e d = d(applicationContext);
                    b castOptions = d.getCastOptions(applicationContext);
                    ?? jVar = new com.google.android.gms.common.api.j(applicationContext, j6.r.f16546l, com.google.android.gms.common.api.b.f6535j, com.google.android.gms.common.api.i.f6545c);
                    try {
                        f13522n = new a(applicationContext, castOptions, d.getAdditionalSessionProviders(applicationContext), new com.google.android.gms.internal.cast.p(applicationContext, s4.x.d(applicationContext), castOptions, jVar), jVar);
                    } catch (d e10) {
                        throw new RuntimeException(e10);
                    }
                }
            }
        }
        return f13522n;
    }

    public static e d(Context context) {
        androidx.biometric.t a10;
        try {
            a10 = z6.b.a(context);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e10) {
            e = e10;
        }
        try {
            Bundle bundle = a10.f2020a.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                f13520l.c(new Object[0]);
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
            l lVar = (l) this.f13524b;
            Parcel r12 = lVar.r1(lVar.p1(), 1);
            r12.recycle();
            return s4.r.b((Bundle) com.google.android.gms.internal.cast.t.a(r12, Bundle.CREATOR));
        } catch (RemoteException e10) {
            f13520l.a(e10, "Unable to call %s on %s.", "getMergedSelectorAsBundle", n.class.getSimpleName());
            return null;
        }
    }

    public final g b() {
        q6.m.d("Must be called from the main thread.");
        return this.f13525c;
    }
}
