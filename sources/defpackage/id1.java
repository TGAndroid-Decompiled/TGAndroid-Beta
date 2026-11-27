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
public final class id1 {
    public static final he6 l = new he6("CastContext", null);
    public static final Object m = new Object();
    public static volatile id1 n;
    public final Context a;
    public final fcd b;
    public final baa c;
    public final pad d;
    public final ld1 e;
    public final qa4 f;
    public final ibd g;
    public final kfd h;
    public final List i;
    public final pid j;
    public final xbd k;

    public id1(Context context, ld1 ld1Var, List list, hhd hhdVar, qa4 qa4Var) {
        jdd jddVar;
        gfd gfdVar;
        dhf dhfVar;
        dhf dhfVar2;
        LinkProperties linkProperties;
        this.a = context;
        this.e = ld1Var;
        this.f = qa4Var;
        this.i = list;
        this.h = new kfd(context);
        this.j = hhdVar.e;
        if (!TextUtils.isEmpty(ld1Var.a)) {
            this.k = new xbd(context, ld1Var, hhdVar);
        } else {
            this.k = null;
        }
        HashMap hashMap = new HashMap();
        xbd xbdVar = this.k;
        if (xbdVar != null) {
            hashMap.put(xbdVar.b, xbdVar.c);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                xbd xbdVar2 = (xbd) it.next();
                xve.i(xbdVar2, "Additional SessionProvider must not be null.");
                String str = xbdVar2.b;
                xve.g(str, "Category for SessionProvider must not be null or empty string.");
                xve.a("SessionProvider for category " + str + " already added", !hashMap.containsKey(str));
                hashMap.put(str, xbdVar2.c);
            }
        }
        ld1Var.G = new f1f(1);
        try {
            fcd a = mbd.a(context, ld1Var, hhdVar, hashMap);
            this.b = a;
            try {
                vbd vbdVar = (vbd) a;
                Parcel T = vbdVar.T(vbdVar.R(), 6);
                IBinder readStrongBinder = T.readStrongBinder();
                if (readStrongBinder == null) {
                    jddVar = 0;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
                    if (queryLocalInterface instanceof jdd) {
                        jddVar = (jdd) queryLocalInterface;
                    } else {
                        jddVar = new v3d(readStrongBinder, "com.google.android.gms.cast.framework.IDiscoveryManager", (byte) 3);
                    }
                }
                T.recycle();
                this.d = new pad(jddVar);
                try {
                    vbd vbdVar2 = (vbd) a;
                    Parcel T2 = vbdVar2.T(vbdVar2.R(), 5);
                    IBinder readStrongBinder2 = T2.readStrongBinder();
                    if (readStrongBinder2 == null) {
                        gfdVar = 0;
                    } else {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
                        if (queryLocalInterface2 instanceof gfd) {
                            gfdVar = (gfd) queryLocalInterface2;
                        } else {
                            gfdVar = new v3d(readStrongBinder2, "com.google.android.gms.cast.framework.ISessionManager", (byte) 3);
                        }
                    }
                    T2.recycle();
                    baa baaVar = new baa(gfdVar, context);
                    this.c = baaVar;
                    xve.g("PrecacheManager", "The log tag cannot be null or empty.");
                    pid pidVar = this.j;
                    if (pidVar != null) {
                        pidVar.f = baaVar;
                        pidVar.c.post(new bid(pidVar, (byte) 1));
                    }
                    ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
                    if (newFixedThreadPool instanceof dhf) {
                        dhfVar2 = (dhf) newFixedThreadPool;
                    } else {
                        if (newFixedThreadPool instanceof ScheduledExecutorService) {
                            dhfVar = new qhf((ScheduledExecutorService) newFixedThreadPool);
                        } else {
                            dhfVar = new dhf(newFixedThreadPool);
                        }
                        dhfVar2 = dhfVar;
                    }
                    etd etdVar = new etd(context, dhfVar2);
                    xve.g("BaseNetUtils", "The log tag cannot be null or empty.");
                    ConnectivityManager connectivityManager = etdVar.c;
                    etd.j.b("Start monitoring connectivity changes", new Object[0]);
                    if (!etdVar.f && connectivityManager != null && sr.b(etdVar.g, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                        Network activeNetwork = connectivityManager.getActiveNetwork();
                        if (activeNetwork != null && (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) != null) {
                            etdVar.a(activeNetwork, linkProperties);
                        }
                        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(1).build(), etdVar.b);
                        etdVar.f = true;
                    }
                    ibd ibdVar = new ibd();
                    this.g = ibdVar;
                    try {
                        vbd vbdVar3 = (vbd) a;
                        Parcel R = vbdVar3.R();
                        ald.d(R, ibdVar);
                        vbdVar3.V(R, 3);
                        ibdVar.b.add(this.h.a);
                        if (!DesugarCollections.unmodifiableList(ld1Var.x).isEmpty()) {
                            he6 he6Var = l;
                            Log.i(he6Var.a, he6Var.d("Setting Route Discovery for appIds: ".concat(String.valueOf(DesugarCollections.unmodifiableList(this.e.x))), new Object[0]));
                            kfd kfdVar = this.h;
                            List<String> unmodifiableList = DesugarCollections.unmodifiableList(this.e.x);
                            kfdVar.getClass();
                            kfd.f.b(qd4.n(unmodifiableList.size(), "SetRouteDiscovery for ", " IDs"), new Object[0]);
                            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                            for (String str2 : unmodifiableList) {
                                linkedHashSet.add(f6f.a(str2));
                            }
                            kfd.f.b("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(kfdVar.c.keySet())), new Object[0]);
                            HashMap hashMap2 = new HashMap();
                            synchronized (kfdVar.c) {
                                for (String str3 : linkedHashSet) {
                                    bfd bfdVar = (bfd) kfdVar.c.get(f6f.a(str3));
                                    if (bfdVar != null) {
                                        hashMap2.put(str3, bfdVar);
                                    }
                                }
                                kfdVar.c.clear();
                                kfdVar.c.putAll(hashMap2);
                            }
                            kfd.f.b("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(kfdVar.c.keySet())), new Object[0]);
                            synchronized (kfdVar.d) {
                                kfdVar.d.clear();
                                kfdVar.d.addAll(linkedHashSet);
                            }
                            kfdVar.m();
                        }
                        qa4Var.m(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"}).addOnSuccessListener(new xae(this));
                        wjb b = xjb.b();
                        b.a = new g9d(qa4Var, new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"}, (byte) 5);
                        b.c = new a94[]{zid.d};
                        b.b = false;
                        b.d = (char) 8427;
                        qa4Var.e(0, b.a()).addOnSuccessListener(new s9d(this));
                    } catch (RemoteException e) {
                        su3.f("Failed to call addAppVisibilityListener", e);
                        throw null;
                    }
                } catch (RemoteException e2) {
                    su3.f("Failed to call getSessionManagerImpl", e2);
                    throw null;
                }
            } catch (RemoteException e3) {
                su3.f("Failed to call getDiscoveryManagerImpl", e3);
                throw null;
            }
        } catch (RemoteException e4) {
            su3.f("Failed to call newCastContextImpl", e4);
            throw null;
        }
    }

    public static id1 c(Context context) {
        xve.e("Must be called from the main thread.");
        if (n == null) {
            synchronized (m) {
                if (n == null) {
                    Context applicationContext = context.getApplicationContext();
                    ChromecastOptionsProvider d = d(applicationContext);
                    ld1 castOptions = d.getCastOptions(applicationContext);
                    ?? h05Var = new h05(applicationContext, qa4.u, wn.g, g05.c);
                    try {
                        n = new id1(applicationContext, castOptions, d.getAdditionalSessionProviders(applicationContext), new hhd(applicationContext, lw6.d(applicationContext), castOptions, h05Var), h05Var);
                    } catch (zg7 e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return n;
    }

    public static ChromecastOptionsProvider d(Context context) {
        try {
            di4 a = h3d.a(context);
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
            su3.f("Failed to initialize CastContext.", e);
            return null;
        }
    }

    public final dw6 a() {
        xve.e("Must be called from the main thread.");
        try {
            vbd vbdVar = (vbd) this.b;
            Parcel T = vbdVar.T(vbdVar.R(), 1);
            T.recycle();
            return dw6.b((Bundle) ald.a(T, Bundle.CREATOR));
        } catch (RemoteException e) {
            l.a(e, "Unable to call %s on %s.", "getMergedSelectorAsBundle", fcd.class.getSimpleName());
            return null;
        }
    }

    public final baa b() {
        xve.e("Must be called from the main thread.");
        return this.c;
    }
}
