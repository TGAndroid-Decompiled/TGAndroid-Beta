package n5;

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
import c2.u0;
import com.google.android.gms.internal.cast.l4;
import com.google.android.gms.internal.cast.m4;
import com.google.android.gms.internal.cast.q4;
import f7.k5;
import j$.util.DesugarCollections;
import j3.r0;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
public final class a {
    public static final q5.b f18449l = new q5.b("CastContext", null);
    public static final Object f18450m = new Object();
    public static volatile a f18451n;
    public final Context f18452a;
    public final n f18453b;
    public final g f18454c;
    public final k d;
    public final b f18455e;
    public final q5.s f18456f;
    public final com.google.android.gms.internal.cast.d f18457g;
    public final com.google.android.gms.internal.cast.n h;
    public final List f18458i;
    public final com.google.android.gms.internal.cast.t f18459j;
    public final com.google.android.gms.internal.cast.f f18460k;

    public a(Context context, b bVar, List list, com.google.android.gms.internal.cast.q qVar, q5.s sVar) {
        r rVar;
        y yVar;
        com.google.android.gms.internal.cast.y yVar2;
        l4 m4Var;
        l4 l4Var;
        this.f18452a = context;
        this.f18455e = bVar;
        this.f18456f = sVar;
        this.f18458i = list;
        this.h = new com.google.android.gms.internal.cast.n(context);
        this.f18459j = qVar.f3195f;
        if (!TextUtils.isEmpty(bVar.f18463a)) {
            this.f18460k = new com.google.android.gms.internal.cast.f(context, bVar, qVar);
        } else {
            this.f18460k = null;
        }
        HashMap hashMap = new HashMap();
        com.google.android.gms.internal.cast.f fVar = this.f18460k;
        if (fVar != null) {
            hashMap.put(fVar.f3100b, fVar.f3101c);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.cast.f fVar2 = (com.google.android.gms.internal.cast.f) it.next();
                x5.l.i(fVar2, "Additional SessionProvider must not be null.");
                String str = fVar2.f3100b;
                x5.l.g(str, "Category for SessionProvider must not be null or empty string.");
                x5.l.a("SessionProvider for category " + str + " already added", !hashMap.containsKey(str));
                hashMap.put(str, fVar2.f3101c);
            }
        }
        bVar.B = new c0(1);
        try {
            n a2 = com.google.android.gms.internal.cast.e.a(context, bVar, qVar, hashMap);
            this.f18453b = a2;
            try {
                l lVar = (l) a2;
                Parcel O0 = lVar.O0(lVar.M0(), 6);
                IBinder readStrongBinder = O0.readStrongBinder();
                if (readStrongBinder == null) {
                    rVar = 0;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
                    if (queryLocalInterface instanceof r) {
                        rVar = (r) queryLocalInterface;
                    } else {
                        rVar = new b7.a(readStrongBinder, "com.google.android.gms.cast.framework.IDiscoveryManager", 2);
                    }
                }
                O0.recycle();
                this.d = new k(rVar);
                try {
                    l lVar2 = (l) a2;
                    Parcel O02 = lVar2.O0(lVar2.M0(), 5);
                    IBinder readStrongBinder2 = O02.readStrongBinder();
                    if (readStrongBinder2 == null) {
                        yVar = 0;
                    } else {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
                        if (queryLocalInterface2 instanceof y) {
                            yVar = (y) queryLocalInterface2;
                        } else {
                            yVar = new b7.a(readStrongBinder2, "com.google.android.gms.cast.framework.ISessionManager", 2);
                        }
                    }
                    O02.recycle();
                    g gVar = new g(yVar, context);
                    this.f18454c = gVar;
                    x5.l.g("PrecacheManager", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    com.google.android.gms.internal.cast.t tVar = this.f18459j;
                    if (tVar != null) {
                        tVar.f3231f = gVar;
                        u0 u0Var = tVar.f3229c;
                        x5.l.h(u0Var);
                        u0Var.post(new com.google.android.gms.internal.cast.s(tVar, 1));
                    }
                    if (Build.VERSION.SDK_INT >= 23) {
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
                        yVar2 = new com.google.android.gms.internal.cast.y(context, l4Var);
                    } else {
                        yVar2 = new Object();
                    }
                    x5.l.g("BaseNetUtils", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    yVar2.mo6zza();
                    com.google.android.gms.internal.cast.d dVar = new com.google.android.gms.internal.cast.d();
                    this.f18457g = dVar;
                    try {
                        l lVar3 = (l) a2;
                        Parcel M0 = lVar3.M0();
                        com.google.android.gms.internal.cast.u.d(M0, dVar);
                        lVar3.Q0(M0, 3);
                        dVar.f3039c.add(this.h.f3167a);
                        if (!DesugarCollections.unmodifiableList(bVar.f18471w).isEmpty()) {
                            q5.b bVar2 = f18449l;
                            Log.i(bVar2.f46009a, bVar2.d("Setting Route Discovery for appIds: ".concat(String.valueOf(DesugarCollections.unmodifiableList(this.f18455e.f18471w))), new Object[0]));
                            com.google.android.gms.internal.cast.n nVar = this.h;
                            List<String> unmodifiableList = DesugarCollections.unmodifiableList(this.f18455e.f18471w);
                            nVar.getClass();
                            com.google.android.gms.internal.cast.n.f3166f.b(r0.m(unmodifiableList.size(), "SetRouteDiscovery for ", " IDs"), new Object[0]);
                            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                            for (String str2 : unmodifiableList) {
                                linkedHashSet.add(k5.a(str2));
                            }
                            com.google.android.gms.internal.cast.n.f3166f.b("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(nVar.f3169c.keySet())), new Object[0]);
                            HashMap hashMap2 = new HashMap();
                            synchronized (nVar.f3169c) {
                                try {
                                    for (String str3 : linkedHashSet) {
                                        com.google.android.gms.internal.cast.l lVar4 = (com.google.android.gms.internal.cast.l) nVar.f3169c.get(k5.a(str3));
                                        if (lVar4 != null) {
                                            hashMap2.put(str3, lVar4);
                                        }
                                    }
                                    nVar.f3169c.clear();
                                    nVar.f3169c.putAll(hashMap2);
                                } finally {
                                }
                            }
                            com.google.android.gms.internal.cast.n.f3166f.b("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(nVar.f3169c.keySet())), new Object[0]);
                            synchronized (nVar.d) {
                                nVar.d.clear();
                                nVar.d.addAll(linkedHashSet);
                            }
                            nVar.m();
                        }
                        sVar.f(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"}).addOnSuccessListener(new a0(this, 0));
                        com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
                        b10.f2914c = new m3.y(sVar, new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"});
                        b10.d = new u5.c[]{m5.y.d};
                        b10.f2913b = false;
                        b10.f2912a = 8427;
                        sVar.e(0, b10.b()).addOnSuccessListener(new m5.c0(this, 3));
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
        x5.l.e("Must be called from the main thread.");
        if (f18451n == null) {
            synchronized (f18450m) {
                if (f18451n == null) {
                    Context applicationContext = context.getApplicationContext();
                    e d = d(applicationContext);
                    b castOptions = d.getCastOptions(applicationContext);
                    ?? jVar = new com.google.android.gms.common.api.j(applicationContext, q5.s.f46050k, com.google.android.gms.common.api.b.f2744g, com.google.android.gms.common.api.i.f2753c);
                    try {
                        f18451n = new a(applicationContext, castOptions, d.getAdditionalSessionProviders(applicationContext), new com.google.android.gms.internal.cast.q(applicationContext, c2.c0.d(applicationContext), castOptions, jVar), jVar);
                    } catch (d e10) {
                        throw new RuntimeException(e10);
                    }
                }
            }
        }
        return f18451n;
    }

    public static e d(Context context) {
        g6.b a2;
        try {
            a2 = g6.c.a(context);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e10) {
            e = e10;
        }
        try {
            Bundle bundle = a2.f7118a.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                f18449l.c(new Object[0]);
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

    public final c2.v a() {
        x5.l.e("Must be called from the main thread.");
        try {
            l lVar = (l) this.f18453b;
            Parcel O0 = lVar.O0(lVar.M0(), 1);
            O0.recycle();
            return c2.v.b((Bundle) com.google.android.gms.internal.cast.u.a(O0, Bundle.CREATOR));
        } catch (RemoteException e10) {
            f18449l.a(e10, "Unable to call %s on %s.", "getMergedSelectorAsBundle", n.class.getSimpleName());
            return null;
        }
    }

    public final g b() {
        x5.l.e("Must be called from the main thread.");
        return this.f18454c;
    }
}
