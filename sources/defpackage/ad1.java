package defpackage;

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
import j$.util.DesugarCollections;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.messenger.chromecast.ChromecastOptionsProvider;
public final class ad1 {
    public static final dc6 l = new dc6("CastContext", null);
    public static final Object m = new Object();
    public static volatile ad1 n;
    public final Context a;
    public final m7d b;
    public final j6a c;
    public final w5d d;
    public final dd1 e;
    public final u84 f;
    public final p6d g;
    public final rad h;
    public final List i;
    public final ydd j;
    public final e7d k;

    public ad1(Context context, dd1 dd1Var, List list, ocd ocdVar, u84 u84Var) {
        q8d q8dVar;
        nad nadVar;
        ncf ncfVar;
        ncf ncfVar2;
        LinkProperties linkProperties;
        this.a = context;
        this.e = dd1Var;
        this.f = u84Var;
        this.i = list;
        this.h = new rad(context);
        this.j = ocdVar.e;
        if (!TextUtils.isEmpty(dd1Var.a)) {
            this.k = new e7d(context, dd1Var, ocdVar);
        } else {
            this.k = null;
        }
        HashMap hashMap = new HashMap();
        e7d e7dVar = this.k;
        if (e7dVar != null) {
            hashMap.put(e7dVar.b, e7dVar.c);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                e7d e7dVar2 = (e7d) it.next();
                fre.i(e7dVar2, "Additional SessionProvider must not be null.");
                String str = e7dVar2.b;
                fre.g(str, "Category for SessionProvider must not be null or empty string.");
                fre.a("SessionProvider for category " + str + " already added", !hashMap.containsKey(str));
                hashMap.put(str, e7dVar2.c);
            }
        }
        dd1Var.G = new owe(1);
        try {
            m7d a = t6d.a(context, dd1Var, ocdVar, hashMap);
            this.b = a;
            try {
                c7d c7dVar = (c7d) a;
                Parcel T = c7dVar.T(c7dVar.R(), 6);
                IBinder readStrongBinder = T.readStrongBinder();
                if (readStrongBinder == null) {
                    q8dVar = 0;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
                    if (queryLocalInterface instanceof q8d) {
                        q8dVar = (q8d) queryLocalInterface;
                    } else {
                        q8dVar = new ezc(readStrongBinder, "com.google.android.gms.cast.framework.IDiscoveryManager", (byte) 3);
                    }
                }
                T.recycle();
                this.d = new w5d(q8dVar);
                try {
                    c7d c7dVar2 = (c7d) a;
                    Parcel T2 = c7dVar2.T(c7dVar2.R(), 5);
                    IBinder readStrongBinder2 = T2.readStrongBinder();
                    if (readStrongBinder2 == null) {
                        nadVar = 0;
                    } else {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
                        if (queryLocalInterface2 instanceof nad) {
                            nadVar = (nad) queryLocalInterface2;
                        } else {
                            nadVar = new ezc(readStrongBinder2, "com.google.android.gms.cast.framework.ISessionManager", (byte) 3);
                        }
                    }
                    T2.recycle();
                    j6a j6aVar = new j6a(nadVar, context);
                    this.c = j6aVar;
                    fre.g("PrecacheManager", "The log tag cannot be null or empty.");
                    ydd yddVar = this.j;
                    if (yddVar != null) {
                        yddVar.f = j6aVar;
                        yddVar.c.post(new idd(yddVar, (byte) 1));
                    }
                    ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
                    if (newFixedThreadPool instanceof ncf) {
                        ncfVar2 = (ncf) newFixedThreadPool;
                    } else {
                        if (newFixedThreadPool instanceof ScheduledExecutorService) {
                            ncfVar = new adf((ScheduledExecutorService) newFixedThreadPool);
                        } else {
                            ncfVar = new ncf(newFixedThreadPool);
                        }
                        ncfVar2 = ncfVar;
                    }
                    ood oodVar = new ood(context, ncfVar2);
                    fre.g("BaseNetUtils", "The log tag cannot be null or empty.");
                    ConnectivityManager connectivityManager = oodVar.c;
                    ood.j.b("Start monitoring connectivity changes", new Object[0]);
                    if (!oodVar.f && connectivityManager != null && rr.b(oodVar.g, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                        Network activeNetwork = connectivityManager.getActiveNetwork();
                        if (activeNetwork != null && (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) != null) {
                            oodVar.a(activeNetwork, linkProperties);
                        }
                        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(1).build(), oodVar.b);
                        oodVar.f = true;
                    }
                    p6d p6dVar = new p6d();
                    this.g = p6dVar;
                    try {
                        c7d c7dVar3 = (c7d) a;
                        Parcel R = c7dVar3.R();
                        jgd.d(R, p6dVar);
                        c7dVar3.V(R, 3);
                        p6dVar.b.add(this.h.a);
                        if (!DesugarCollections.unmodifiableList(dd1Var.x).isEmpty()) {
                            dc6 dc6Var = l;
                            Log.i(dc6Var.a, dc6Var.d("Setting Route Discovery for appIds: ".concat(String.valueOf(DesugarCollections.unmodifiableList(this.e.x))), new Object[0]));
                            rad radVar = this.h;
                            List<String> unmodifiableList = DesugarCollections.unmodifiableList(this.e.x);
                            radVar.getClass();
                            rad.f.b(tb4.n(unmodifiableList.size(), "SetRouteDiscovery for ", " IDs"), new Object[0]);
                            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                            for (String str2 : unmodifiableList) {
                                linkedHashSet.add(n1f.a(str2));
                            }
                            rad.f.b("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(radVar.c.keySet())), new Object[0]);
                            HashMap hashMap2 = new HashMap();
                            synchronized (radVar.c) {
                                for (String str3 : linkedHashSet) {
                                    iad iadVar = (iad) radVar.c.get(n1f.a(str3));
                                    if (iadVar != null) {
                                        hashMap2.put(str3, iadVar);
                                    }
                                }
                                radVar.c.clear();
                                radVar.c.putAll(hashMap2);
                            }
                            rad.f.b("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(radVar.c.keySet())), new Object[0]);
                            synchronized (radVar.d) {
                                radVar.d.clear();
                                radVar.d.addAll(linkedHashSet);
                            }
                            radVar.m();
                        }
                        u84Var.m(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"}).addOnSuccessListener(new sld(this));
                        agb b = bgb.b();
                        b.a = new g6e(u84Var, new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"});
                        b.c = new f84[]{ied.d};
                        b.b = false;
                        b.d = (char) 8427;
                        u84Var.e(0, b.a()).addOnSuccessListener(new z4d(this));
                    } catch (RemoteException e) {
                        k93.h("Failed to call addAppVisibilityListener", e);
                        throw null;
                    }
                } catch (RemoteException e2) {
                    k93.h("Failed to call getSessionManagerImpl", e2);
                    throw null;
                }
            } catch (RemoteException e3) {
                k93.h("Failed to call getDiscoveryManagerImpl", e3);
                throw null;
            }
        } catch (RemoteException e4) {
            k93.h("Failed to call newCastContextImpl", e4);
            throw null;
        }
    }

    public static ad1 c(Context context) {
        fre.e("Must be called from the main thread.");
        if (n == null) {
            synchronized (m) {
                if (n == null) {
                    Context applicationContext = context.getApplicationContext();
                    ChromecastOptionsProvider d = d(applicationContext);
                    dd1 castOptions = d.getCastOptions(applicationContext);
                    ?? by4Var = new by4(applicationContext, u84.u, vn.g, ay4.c);
                    try {
                        n = new ad1(applicationContext, castOptions, d.getAdditionalSessionProviders(applicationContext), new ocd(applicationContext, gu6.d(applicationContext), castOptions, by4Var), by4Var);
                    } catch (qe7 e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return n;
    }

    public static ChromecastOptionsProvider d(Context context) {
        try {
            p13 a = ryc.a(context);
            Bundle bundle = a.a.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                l.c(new Object[0]);
            }
            String string = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
            if (string != null) {
                return (ChromecastOptionsProvider) Class.forName(string).asSubclass(ChromecastOptionsProvider.class).getDeclaredConstructor(null).newInstance(null);
            }
            throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
            k93.h("Failed to initialize CastContext.", e);
            return null;
        }
    }

    public final yt6 a() {
        fre.e("Must be called from the main thread.");
        try {
            c7d c7dVar = (c7d) this.b;
            Parcel T = c7dVar.T(c7dVar.R(), 1);
            T.recycle();
            return yt6.b((Bundle) jgd.a(T, Bundle.CREATOR));
        } catch (RemoteException e) {
            l.a(e, "Unable to call %s on %s.", "getMergedSelectorAsBundle", m7d.class.getSimpleName());
            return null;
        }
    }

    public final j6a b() {
        fre.e("Must be called from the main thread.");
        return this.c;
    }
}
