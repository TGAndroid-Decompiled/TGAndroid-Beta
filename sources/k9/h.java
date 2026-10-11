package k9;

import a0.m;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.emoji2.text.v;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import m.f3;
import n6.k;
import n7.z0;
import q9.n;
public final class h {
    public static final Object f14744k = new Object();
    public static final a0.f f14745l = new m(0);
    public final Context f14746a;
    public final String f14747b;
    public final j f14748c;
    public final q9.g d;
    public final AtomicBoolean f14749e;
    public final AtomicBoolean f14750f;
    public final n f14751g;
    public final pa.b h;
    public final CopyOnWriteArrayList f14752i;
    public final CopyOnWriteArrayList f14753j;

    public h(Context context, String str, j jVar) {
        boolean z10;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f14749e = atomicBoolean;
        this.f14750f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f14752i = copyOnWriteArrayList;
        this.f14753j = new CopyOnWriteArrayList();
        this.f14746a = context;
        n6.m.f(str);
        this.f14747b = str;
        this.f14748c = jVar;
        a aVar = FirebaseInitProvider.f7999a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList j3 = new z0(12, context, new f3(ComponentDiscoveryService.class, 14)).j();
        Trace.endSection();
        Trace.beginSection("Runtime");
        r9.j jVar2 = r9.j.f47248a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(j3);
        arrayList.add(new q9.c(new FirebaseCommonRegistrar(), 1));
        arrayList.add(new q9.c(new ExecutorsRegistrar(), 1));
        arrayList2.add(q9.a.c(context, Context.class, new Class[0]));
        arrayList2.add(q9.a.c(this, h.class, new Class[0]));
        arrayList2.add(q9.a.c(jVar, j.class, new Class[0]));
        na.d dVar = new na.d(6);
        if (Build.VERSION.SDK_INT >= 24) {
            z10 = v.g(context);
        } else {
            z10 = true;
        }
        if (z10 && FirebaseInitProvider.f8000b.get()) {
            arrayList2.add(q9.a.c(aVar, a.class, new Class[0]));
        }
        q9.g gVar = new q9.g(jVar2, arrayList, arrayList2, dVar);
        this.d = gVar;
        Trace.endSection();
        this.f14751g = new n(new d(0, this, context));
        this.h = gVar.c(na.c.class);
        e eVar = new e(this);
        a();
        if (atomicBoolean.get()) {
            com.google.android.gms.common.api.internal.d.f6566e.f6567a.get();
        }
        copyOnWriteArrayList.add(eVar);
        Trace.endSection();
    }

    public static h c() {
        h hVar;
        synchronized (f14744k) {
            try {
                hVar = (h) f14745l.get("[DEFAULT]");
                if (hVar != null) {
                    ((na.c) hVar.h.get()).c();
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
        synchronized (f14744k) {
            try {
                if (f14745l.containsKey("[DEFAULT]")) {
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
        AtomicReference atomicReference = f.f14741a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = f.f14741a;
            if (atomicReference2.get() == null) {
                ?? obj = new Object();
                while (true) {
                    if (atomicReference2.compareAndSet(null, obj)) {
                        com.google.android.gms.common.api.internal.d.b(application);
                        com.google.android.gms.common.api.internal.d.f6566e.a(obj);
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
        synchronized (f14744k) {
            a0.f fVar = f14745l;
            n6.m.j("FirebaseApp name [DEFAULT] already exists!", !fVar.containsKey("[DEFAULT]"));
            n6.m.i(context, "Application context cannot be null.");
            hVar = new h(context, "[DEFAULT]", jVar);
            fVar.put("[DEFAULT]", hVar);
        }
        hVar.e();
        return hVar;
    }

    public final void a() {
        n6.m.j("FirebaseApp was deleted", !this.f14750f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.d.a(cls);
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        a();
        sb2.append(u6.b.c(this.f14747b.getBytes(Charset.defaultCharset())));
        sb2.append("+");
        a();
        sb2.append(u6.b.c(this.f14748c.f14759b.getBytes(Charset.defaultCharset())));
        return sb2.toString();
    }

    public final void e() {
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        Context context = this.f14746a;
        if (i10 >= 24) {
            z10 = v.g(context);
        } else {
            z10 = true;
        }
        String str = this.f14747b;
        if (!z10) {
            StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb2.append(str);
            Log.i("FirebaseApp", sb2.toString());
            AtomicReference atomicReference = g.f14742b;
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
        this.d.h("[DEFAULT]".equals(str));
        ((na.c) this.h.get()).c();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        hVar.a();
        return this.f14747b.equals(hVar.f14747b);
    }

    public final boolean h() {
        boolean z10;
        a();
        ua.a aVar = (ua.a) this.f14751g.get();
        synchronized (aVar) {
            z10 = aVar.f49002a;
        }
        return z10;
    }

    public final int hashCode() {
        return this.f14747b.hashCode();
    }

    public final String toString() {
        k kVar = new k((Object) this);
        kVar.m(this.f14747b, "name");
        kVar.m(this.f14748c, "options");
        return kVar.toString();
    }
}
