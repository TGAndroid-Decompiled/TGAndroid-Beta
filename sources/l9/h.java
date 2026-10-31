package l9;

import a0.l;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.emoji2.text.w;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import m2.t;
import r9.n;
import s9.k;
import t7.u;
public final class h {
    public static final Object f11705k = new Object();
    public static final a0.f f11706l = new l(0);
    public final Context f11707a;
    public final String f11708b;
    public final j f11709c;
    public final r9.g d;
    public final AtomicBoolean e;
    public final AtomicBoolean f11710f;
    public final n f11711g;
    public final qa.b h;
    public final CopyOnWriteArrayList f11712i;
    public final CopyOnWriteArrayList f11713j;

    public h(Context context, String str, j jVar) {
        boolean z10;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.e = atomicBoolean;
        this.f11710f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f11712i = copyOnWriteArrayList;
        this.f11713j = new CopyOnWriteArrayList();
        this.f11707a = context;
        n6.l.e(str);
        this.f11708b = str;
        this.f11709c = jVar;
        a aVar = FirebaseInitProvider.f5598a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList l4 = new m5.e(21, context, new t(ComponentDiscoveryService.class, 20)).l();
        Trace.endSection();
        Trace.beginSection("Runtime");
        k kVar = k.f48119a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(l4);
        arrayList.add(new r9.c(new FirebaseCommonRegistrar(), 1));
        arrayList.add(new r9.c(new ExecutorsRegistrar(), 1));
        arrayList2.add(r9.a.c(context, Context.class, new Class[0]));
        arrayList2.add(r9.a.c(this, h.class, new Class[0]));
        arrayList2.add(r9.a.c(jVar, j.class, new Class[0]));
        u uVar = new u(5);
        if (Build.VERSION.SDK_INT >= 24) {
            z10 = w.g(context);
        } else {
            z10 = true;
        }
        if (z10 && FirebaseInitProvider.f5599b.get()) {
            arrayList2.add(r9.a.c(aVar, a.class, new Class[0]));
        }
        r9.g gVar = new r9.g(kVar, arrayList, arrayList2, uVar);
        this.d = gVar;
        Trace.endSection();
        this.f11711g = new n(new d(0, this, context));
        this.h = gVar.c(oa.c.class);
        e eVar = new e(this);
        a();
        if (atomicBoolean.get()) {
            com.google.android.gms.common.api.internal.d.e.f4377a.get();
        }
        copyOnWriteArrayList.add(eVar);
        Trace.endSection();
    }

    public static h c() {
        h hVar;
        synchronized (f11705k) {
            try {
                hVar = (h) f11706l.get("[DEFAULT]");
                if (hVar != null) {
                    ((oa.c) hVar.h.get()).c();
                } else {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + u6.d.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }

    public static h f(Context context) {
        synchronized (f11705k) {
            try {
                if (f11706l.containsKey("[DEFAULT]")) {
                    return c();
                }
                j a2 = j.a(context);
                if (a2 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return g(context, a2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static h g(Context context, j jVar) {
        h hVar;
        AtomicReference atomicReference = f.f11702a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = f.f11702a;
            if (atomicReference2.get() == null) {
                ?? obj = new Object();
                while (true) {
                    if (atomicReference2.compareAndSet(null, obj)) {
                        com.google.android.gms.common.api.internal.d.b(application);
                        com.google.android.gms.common.api.internal.d.e.a(obj);
                        break;
                    } else if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f11705k) {
            a0.f fVar = f11706l;
            n6.l.i("FirebaseApp name [DEFAULT] already exists!", !fVar.containsKey("[DEFAULT]"));
            n6.l.h(context, "Application context cannot be null.");
            hVar = new h(context, "[DEFAULT]", jVar);
            fVar.put("[DEFAULT]", hVar);
        }
        hVar.e();
        return hVar;
    }

    public final void a() {
        n6.l.i("FirebaseApp was deleted", !this.f11710f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.d.b(cls);
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        a();
        sb2.append(u6.b.c(this.f11708b.getBytes(Charset.defaultCharset())));
        sb2.append("+");
        a();
        sb2.append(u6.b.c(this.f11709c.f11718b.getBytes(Charset.defaultCharset())));
        return sb2.toString();
    }

    public final void e() {
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        Context context = this.f11707a;
        if (i10 >= 24) {
            z10 = w.g(context);
        } else {
            z10 = true;
        }
        String str = this.f11708b;
        if (!z10) {
            StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb2.append(str);
            Log.i("FirebaseApp", sb2.toString());
            AtomicReference atomicReference = g.f11703b;
            if (atomicReference.get() == null) {
                g gVar = new g(context);
                while (!atomicReference.compareAndSet(null, gVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(gVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb3 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb3.append(str);
        Log.i("FirebaseApp", sb3.toString());
        a();
        this.d.f("[DEFAULT]".equals(str));
        ((oa.c) this.h.get()).c();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        hVar.a();
        return this.f11708b.equals(hVar.f11708b);
    }

    public final boolean h() {
        boolean z10;
        a();
        va.a aVar = (va.a) this.f11711g.get();
        synchronized (aVar) {
            z10 = aVar.f50746a;
        }
        return z10;
    }

    public final int hashCode() {
        return this.f11708b.hashCode();
    }

    public final String toString() {
        m4.c cVar = new m4.c((Object) this);
        cVar.u(this.f11708b, "name");
        cVar.u(this.f11709c, "options");
        return cVar.toString();
    }
}
