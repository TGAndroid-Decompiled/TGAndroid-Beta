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
public final class ie1 {
    public static final ce6 l = new ce6("CastContext", null);
    public static final Object m = new Object();
    public static volatile ie1 n;
    public final Context a;
    public final o9d b;
    public final l8a c;
    public final y7d d;
    public final le1 e;
    public final ua4 f;
    public final r8d g;
    public final tcd h;
    public final List i;
    public final zfd j;
    public final g9d k;

    public ie1(Context context, le1 le1Var, List list, qed qedVar, ua4 ua4Var) {
        sad sadVar;
        pcd pcdVar;
        oef oefVar;
        oef oefVar2;
        LinkProperties linkProperties;
        this.a = context;
        this.e = le1Var;
        this.f = ua4Var;
        this.i = list;
        this.h = new tcd(context);
        this.j = qedVar.e;
        if (!TextUtils.isEmpty(le1Var.a)) {
            this.k = new g9d(context, le1Var, qedVar);
        } else {
            this.k = null;
        }
        HashMap hashMap = new HashMap();
        g9d g9dVar = this.k;
        if (g9dVar != null) {
            hashMap.put(g9dVar.b, g9dVar.c);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                g9d g9dVar2 = (g9d) it.next();
                ite.i(g9dVar2, "Additional SessionProvider must not be null.");
                String str = g9dVar2.b;
                ite.g(str, "Category for SessionProvider must not be null or empty string.");
                ite.a("SessionProvider for category " + str + " already added", !hashMap.containsKey(str));
                hashMap.put(str, g9dVar2.c);
            }
        }
        le1Var.G = new qye(1);
        try {
            o9d a = v8d.a(context, le1Var, qedVar, hashMap);
            this.b = a;
            try {
                e9d e9dVar = (e9d) a;
                Parcel T = e9dVar.T(e9dVar.R(), 6);
                IBinder readStrongBinder = T.readStrongBinder();
                if (readStrongBinder == null) {
                    sadVar = 0;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
                    if (queryLocalInterface instanceof sad) {
                        sadVar = (sad) queryLocalInterface;
                    } else {
                        sadVar = new f1d(readStrongBinder, "com.google.android.gms.cast.framework.IDiscoveryManager", (byte) 3);
                    }
                }
                T.recycle();
                this.d = new y7d(sadVar);
                try {
                    e9d e9dVar2 = (e9d) a;
                    Parcel T2 = e9dVar2.T(e9dVar2.R(), 5);
                    IBinder readStrongBinder2 = T2.readStrongBinder();
                    if (readStrongBinder2 == null) {
                        pcdVar = 0;
                    } else {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
                        if (queryLocalInterface2 instanceof pcd) {
                            pcdVar = (pcd) queryLocalInterface2;
                        } else {
                            pcdVar = new f1d(readStrongBinder2, "com.google.android.gms.cast.framework.ISessionManager", (byte) 3);
                        }
                    }
                    T2.recycle();
                    l8a l8aVar = new l8a(pcdVar, context);
                    this.c = l8aVar;
                    ite.g("PrecacheManager", "The log tag cannot be null or empty.");
                    zfd zfdVar = this.j;
                    if (zfdVar != null) {
                        zfdVar.f = l8aVar;
                        zfdVar.c.post(new kfd(zfdVar, (byte) 1));
                    }
                    ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
                    if (newFixedThreadPool instanceof oef) {
                        oefVar2 = (oef) newFixedThreadPool;
                    } else {
                        if (newFixedThreadPool instanceof ScheduledExecutorService) {
                            oefVar = new bff((ScheduledExecutorService) newFixedThreadPool);
                        } else {
                            oefVar = new oef(newFixedThreadPool);
                        }
                        oefVar2 = oefVar;
                    }
                    rqd rqdVar = new rqd(context, oefVar2);
                    ite.g("BaseNetUtils", "The log tag cannot be null or empty.");
                    ConnectivityManager connectivityManager = rqdVar.c;
                    rqd.j.b("Start monitoring connectivity changes", new Object[0]);
                    if (!rqdVar.f && connectivityManager != null && rs.b(rqdVar.g, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                        Network activeNetwork = connectivityManager.getActiveNetwork();
                        if (activeNetwork != null && (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) != null) {
                            rqdVar.a(activeNetwork, linkProperties);
                        }
                        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(1).build(), rqdVar.b);
                        rqdVar.f = true;
                    }
                    r8d r8dVar = new r8d();
                    this.g = r8dVar;
                    try {
                        e9d e9dVar3 = (e9d) a;
                        Parcel R = e9dVar3.R();
                        kid.d(R, r8dVar);
                        e9dVar3.V(R, 3);
                        r8dVar.b.add(this.h.a);
                        if (!DesugarCollections.unmodifiableList(le1Var.x).isEmpty()) {
                            ce6 ce6Var = l;
                            Log.i(ce6Var.a, ce6Var.d("Setting Route Discovery for appIds: ".concat(String.valueOf(DesugarCollections.unmodifiableList(this.e.x))), new Object[0]));
                            tcd tcdVar = this.h;
                            List<String> unmodifiableList = DesugarCollections.unmodifiableList(this.e.x);
                            tcdVar.getClass();
                            tcd.f.b(td4.o(unmodifiableList.size(), "SetRouteDiscovery for ", " IDs"), new Object[0]);
                            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                            for (String str2 : unmodifiableList) {
                                linkedHashSet.add(p3f.a(str2));
                            }
                            tcd.f.b("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(tcdVar.c.keySet())), new Object[0]);
                            HashMap hashMap2 = new HashMap();
                            synchronized (tcdVar.c) {
                                for (String str3 : linkedHashSet) {
                                    kcd kcdVar = (kcd) tcdVar.c.get(p3f.a(str3));
                                    if (kcdVar != null) {
                                        hashMap2.put(str3, kcdVar);
                                    }
                                }
                                tcdVar.c.clear();
                                tcdVar.c.putAll(hashMap2);
                            }
                            tcd.f.b("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(tcdVar.c.keySet())), new Object[0]);
                            synchronized (tcdVar.d) {
                                tcdVar.d.clear();
                                tcdVar.d.addAll(linkedHashSet);
                            }
                            tcdVar.m();
                        }
                        ua4Var.m(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"}).addOnSuccessListener(new und(this));
                        bib b = cib.b();
                        b.a = new eod(ua4Var, new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"});
                        b.c = new o94[]{jgd.d};
                        b.b = false;
                        b.d = (char) 8427;
                        ua4Var.e(0, b.a()).addOnSuccessListener(new b7d(this));
                    } catch (RemoteException e) {
                        wa3.h("Failed to call addAppVisibilityListener", e);
                        throw null;
                    }
                } catch (RemoteException e2) {
                    wa3.h("Failed to call getSessionManagerImpl", e2);
                    throw null;
                }
            } catch (RemoteException e3) {
                wa3.h("Failed to call getDiscoveryManagerImpl", e3);
                throw null;
            }
        } catch (RemoteException e4) {
            wa3.h("Failed to call newCastContextImpl", e4);
            throw null;
        }
    }

    public static ie1 c(Context context) {
        ite.e("Must be called from the main thread.");
        if (n == null) {
            synchronized (m) {
                if (n == null) {
                    Context applicationContext = context.getApplicationContext();
                    ChromecastOptionsProvider d = d(applicationContext);
                    le1 castOptions = d.getCastOptions(applicationContext);
                    ?? c05Var = new c05(applicationContext, ua4.u, wo.g, b05.c);
                    try {
                        n = new ie1(applicationContext, castOptions, d.getAdditionalSessionProviders(applicationContext), new qed(applicationContext, gw6.d(applicationContext), castOptions, c05Var), c05Var);
                    } catch (sg7 e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return n;
    }

    public static ChromecastOptionsProvider d(Context context) {
        try {
            n63 a = s0d.a(context);
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
            wa3.h("Failed to initialize CastContext.", e);
            return null;
        }
    }

    public final yv6 a() {
        ite.e("Must be called from the main thread.");
        try {
            e9d e9dVar = (e9d) this.b;
            Parcel T = e9dVar.T(e9dVar.R(), 1);
            T.recycle();
            return yv6.b((Bundle) kid.a(T, Bundle.CREATOR));
        } catch (RemoteException e) {
            l.a(e, "Unable to call %s on %s.", "getMergedSelectorAsBundle", o9d.class.getSimpleName());
            return null;
        }
    }

    public final l8a b() {
        ite.e("Must be called from the main thread.");
        return this.c;
    }
}
