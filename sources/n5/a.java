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
import c2.t0;
import com.google.android.gms.internal.cast.d1;
import com.google.android.gms.internal.cast.j4;
import com.google.android.gms.internal.cast.k4;
import com.google.android.gms.internal.cast.o4;
import g7.j5;
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

    public static final r5.b f18276l = new r5.b("CastContext", null);

    public static final Object f18277m = new Object();

    public static volatile a f18278n;

    public final Context f18279a;

    public final o f18280b;

    public final h f18281c;
    public final l d;

    public final b f18282e;

    public final r5.s f18283f;

    public final com.google.android.gms.internal.cast.d f18284g;
    public final com.google.android.gms.internal.cast.n h;

    public final List f18285i;

    public final com.google.android.gms.internal.cast.s f18286j;

    public final com.google.android.gms.internal.cast.f f18287k;

    public a(Context context, b bVar, List list, com.google.android.gms.internal.cast.p pVar, r5.s sVar) throws d {
        s sVar2;
        z zVar;
        com.google.android.gms.internal.cast.u d1Var;
        this.f18279a = context;
        this.f18282e = bVar;
        this.f18283f = sVar;
        this.f18285i = list;
        this.h = new com.google.android.gms.internal.cast.n(context);
        this.f18286j = pVar.f3613f;
        if (TextUtils.isEmpty(bVar.f18290a)) {
            this.f18287k = null;
        } else {
            this.f18287k = new com.google.android.gms.internal.cast.f(context, bVar, pVar);
        }
        HashMap map = new HashMap();
        com.google.android.gms.internal.cast.f fVar = this.f18287k;
        if (fVar != null) {
            map.put(fVar.f3531b, fVar.f3532c);
        }
        int i10 = 1;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.cast.f fVar2 = (com.google.android.gms.internal.cast.f) it.next();
                y5.l.i(fVar2, "Additional SessionProvider must not be null.");
                String str = fVar2.f3531b;
                y5.l.g(str, "Category for SessionProvider must not be null or empty string.");
                y5.l.a("SessionProvider for category " + str + " already added", !map.containsKey(str));
                map.put(str, fVar2.f3532c);
            }
        }
        bVar.B = new c0(1);
        try {
            o oVarA = com.google.android.gms.internal.cast.e.a(context, bVar, pVar, map);
            this.f18280b = oVarA;
            try {
                m mVar = (m) oVarA;
                Parcel parcelO0 = mVar.O0(mVar.M0(), 6);
                IBinder strongBinder = parcelO0.readStrongBinder();
                if (strongBinder == null) {
                    sVar2 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
                    sVar2 = iInterfaceQueryLocalInterface instanceof s ? (s) iInterfaceQueryLocalInterface : new s(strongBinder, "com.google.android.gms.cast.framework.IDiscoveryManager", 1);
                }
                parcelO0.recycle();
                this.d = new l(sVar2);
                try {
                    m mVar2 = (m) oVarA;
                    Parcel parcelO1 = mVar2.O0(mVar2.M0(), 5);
                    IBinder strongBinder2 = parcelO1.readStrongBinder();
                    if (strongBinder2 == null) {
                        zVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
                        zVar = iInterfaceQueryLocalInterface2 instanceof z ? (z) iInterfaceQueryLocalInterface2 : new z(strongBinder2, "com.google.android.gms.cast.framework.ISessionManager", 1);
                    }
                    parcelO1.recycle();
                    h hVar = new h(zVar, context);
                    this.f18281c = hVar;
                    y5.l.g("PrecacheManager", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    com.google.android.gms.internal.cast.s sVar3 = this.f18286j;
                    if (sVar3 != null) {
                        sVar3.f3649f = hVar;
                        t0 t0Var = sVar3.f3647c;
                        y5.l.h(t0Var);
                        t0Var.post(new com.google.android.gms.internal.cast.r(sVar3, i10));
                    }
                    if (Build.VERSION.SDK_INT >= 23) {
                        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(3);
                        d1Var = new com.google.android.gms.internal.cast.x(context, executorServiceNewFixedThreadPool instanceof j4 ? (j4) executorServiceNewFixedThreadPool : executorServiceNewFixedThreadPool instanceof ScheduledExecutorService ? new o4((ScheduledExecutorService) executorServiceNewFixedThreadPool) : new k4(executorServiceNewFixedThreadPool));
                    } else {
                        d1Var = new d1();
                    }
                    y5.l.g("BaseNetUtils", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    d1Var.mo6zza();
                    com.google.android.gms.internal.cast.d dVar = new com.google.android.gms.internal.cast.d();
                    this.f18284g = dVar;
                    try {
                        m mVar3 = (m) oVarA;
                        Parcel parcelM0 = mVar3.M0();
                        com.google.android.gms.internal.cast.t.d(parcelM0, dVar);
                        mVar3.Q0(parcelM0, 3);
                        dVar.f3508c.add(this.h.f3590a);
                        if (!DesugarCollections.unmodifiableList(bVar.f18298w).isEmpty()) {
                            r5.b bVar2 = f18276l;
                            Log.i(bVar2.f46768a, bVar2.d("Setting Route Discovery for appIds: ".concat(String.valueOf(DesugarCollections.unmodifiableList(this.f18282e.f18298w))), new Object[0]));
                            com.google.android.gms.internal.cast.n nVar = this.h;
                            List listUnmodifiableList = DesugarCollections.unmodifiableList(this.f18282e.f18298w);
                            nVar.getClass();
                            com.google.android.gms.internal.cast.n.f3589f.b(i0.a.l(listUnmodifiableList.size(), "SetRouteDiscovery for ", " IDs"), new Object[0]);
                            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                            Iterator it2 = listUnmodifiableList.iterator();
                            while (it2.hasNext()) {
                                linkedHashSet.add(j5.a((String) it2.next()));
                            }
                            com.google.android.gms.internal.cast.n.f3589f.b("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(nVar.f3592c.keySet())), new Object[0]);
                            HashMap map2 = new HashMap();
                            synchronized (nVar.f3592c) {
                                try {
                                    for (String str2 : linkedHashSet) {
                                        com.google.android.gms.internal.cast.l lVar = (com.google.android.gms.internal.cast.l) nVar.f3592c.get(j5.a(str2));
                                        if (lVar != null) {
                                            map2.put(str2, lVar);
                                        }
                                    }
                                    nVar.f3592c.clear();
                                    nVar.f3592c.putAll(map2);
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            com.google.android.gms.internal.cast.n.f3589f.b("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(nVar.f3592c.keySet())), new Object[0]);
                            synchronized (nVar.d) {
                                nVar.d.clear();
                                nVar.d.addAll(linkedHashSet);
                            }
                            nVar.m();
                        }
                        sVar.f(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"}).addOnSuccessListener(new m5.o(this, 2));
                        com.google.android.gms.common.api.internal.v vVarB = com.google.android.gms.common.api.internal.w.b();
                        vVarB.f3359c = new n1.d(sVar, new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"});
                        vVarB.d = new v5.c[]{m5.z.d};
                        vVarB.f3358b = false;
                        vVarB.f3357a = 8427;
                        sVar.e(0, vVarB.b()).addOnSuccessListener(new n2.b0(this, i10));
                    } catch (RemoteException e9) {
                        throw new IllegalStateException("Failed to call addAppVisibilityListener", e9);
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
        y5.l.e("Must be called from the main thread.");
        if (f18278n == null) {
            synchronized (f18277m) {
                if (f18278n == null) {
                    Context applicationContext = context.getApplicationContext();
                    e eVarD = d(applicationContext);
                    b castOptions = eVarD.getCastOptions(applicationContext);
                    r5.s sVar = new r5.s(applicationContext, r5.s.f46809k, com.google.android.gms.common.api.b.f3189g, com.google.android.gms.common.api.i.f3198c);
                    try {
                        f18278n = new a(applicationContext, castOptions, eVarD.getAdditionalSessionProviders(applicationContext), new com.google.android.gms.internal.cast.p(applicationContext, c2.b0.d(applicationContext), castOptions, sVar), sVar);
                    } catch (d e9) {
                        throw new RuntimeException(e9);
                    }
                }
            }
        }
        return f18278n;
    }

    public static e d(Context context) {
        try {
            v5.h hVarA = h6.b.a(context);
            try {
                Bundle bundle = hVarA.f48802a.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle == null) {
                    f18276l.c(new Object[0]);
                }
                String string = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
                if (string != null) {
                    return (e) Class.forName(string).asSubclass(e.class).getDeclaredConstructor(null).newInstance(null);
                }
                throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
            } catch (ClassNotFoundException e9) {
                e = e9;
                throw new IllegalStateException("Failed to initialize CastContext.", e);
            } catch (IllegalAccessException e10) {
                e = e10;
                throw new IllegalStateException("Failed to initialize CastContext.", e);
            } catch (InstantiationException e11) {
                e = e11;
                throw new IllegalStateException("Failed to initialize CastContext.", e);
            } catch (NoSuchMethodException e12) {
                e = e12;
                throw new IllegalStateException("Failed to initialize CastContext.", e);
            } catch (NullPointerException e13) {
                e = e13;
                throw new IllegalStateException("Failed to initialize CastContext.", e);
            } catch (InvocationTargetException e14) {
                e = e14;
                throw new IllegalStateException("Failed to initialize CastContext.", e);
            }
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e15) {
            e = e15;
        }
    }

    public final c2.u a() {
        y5.l.e("Must be called from the main thread.");
        try {
            m mVar = (m) this.f18280b;
            Parcel parcelO0 = mVar.O0(mVar.M0(), 1);
            Bundle bundle = (Bundle) com.google.android.gms.internal.cast.t.a(parcelO0, Bundle.CREATOR);
            parcelO0.recycle();
            return c2.u.b(bundle);
        } catch (RemoteException e9) {
            f18276l.a(e9, "Unable to call %s on %s.", "getMergedSelectorAsBundle", o.class.getSimpleName());
            return null;
        }
    }

    public final h b() {
        y5.l.e("Must be called from the main thread.");
        return this.f18281c;
    }
}
