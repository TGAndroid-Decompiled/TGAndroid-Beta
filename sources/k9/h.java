package k9;

import a0.l;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.emoji2.text.x;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import og.u0;
import q9.n;
public final class h {
    public static final Object f12390k = new Object();
    public static final a0.f f12391l = new l(0);
    public final Context f12392a;
    public final String f12393b;
    public final j f12394c;
    public final q9.g d;
    public final AtomicBoolean e;
    public final AtomicBoolean f12395f;
    public final n f12396g;
    public final pa.b h;
    public final CopyOnWriteArrayList f12397i;
    public final CopyOnWriteArrayList f12398j;

    public h(Context context, String str, j jVar) {
        boolean z10;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.e = atomicBoolean;
        this.f12395f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f12397i = copyOnWriteArrayList;
        this.f12398j = new CopyOnWriteArrayList();
        this.f12392a = context;
        n6.l.f(str);
        this.f12393b = str;
        this.f12394c = jVar;
        a aVar = FirebaseInitProvider.f6143a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList f7 = new u0(11, context, new l2.g(ComponentDiscoveryService.class, 15)).f();
        Trace.endSection();
        Trace.beginSection("Runtime");
        r9.j jVar2 = r9.j.f41389a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(f7);
        arrayList.add(new q9.c(new FirebaseCommonRegistrar(), 1));
        arrayList.add(new q9.c(new ExecutorsRegistrar(), 1));
        arrayList2.add(q9.a.c(context, Context.class, new Class[0]));
        arrayList2.add(q9.a.c(this, h.class, new Class[0]));
        arrayList2.add(q9.a.c(jVar, j.class, new Class[0]));
        ?? obj = new Object();
        if (Build.VERSION.SDK_INT >= 24) {
            z10 = x.g(context);
        } else {
            z10 = true;
        }
        if (z10 && FirebaseInitProvider.f6144b.get()) {
            arrayList2.add(q9.a.c(aVar, a.class, new Class[0]));
        }
        q9.g gVar = new q9.g(jVar2, arrayList, arrayList2, obj);
        this.d = gVar;
        Trace.endSection();
        this.f12396g = new n(new d(0, this, context));
        this.h = gVar.c(na.c.class);
        e eVar = new e(this);
        a();
        if (atomicBoolean.get()) {
            com.google.android.gms.common.api.internal.d.e.f4837a.get();
        }
        copyOnWriteArrayList.add(eVar);
        Trace.endSection();
    }

    public static h c() {
        h hVar;
        synchronized (f12390k) {
            try {
                hVar = (h) f12391l.get("[DEFAULT]");
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
        synchronized (f12390k) {
            try {
                if (f12391l.containsKey("[DEFAULT]")) {
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
        AtomicReference atomicReference = f.f12387a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = f.f12387a;
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
        synchronized (f12390k) {
            a0.f fVar = f12391l;
            n6.l.j("FirebaseApp name [DEFAULT] already exists!", !fVar.containsKey("[DEFAULT]"));
            n6.l.i(context, "Application context cannot be null.");
            hVar = new h(context, "[DEFAULT]", jVar);
            fVar.put("[DEFAULT]", hVar);
        }
        hVar.e();
        return hVar;
    }

    public final void a() {
        n6.l.j("FirebaseApp was deleted", !this.f12395f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.d.a(cls);
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        a();
        sb2.append(u6.b.c(this.f12393b.getBytes(Charset.defaultCharset())));
        sb2.append("+");
        a();
        sb2.append(u6.b.c(this.f12394c.f12403b.getBytes(Charset.defaultCharset())));
        return sb2.toString();
    }

    public final void e() {
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        Context context = this.f12392a;
        if (i10 >= 24) {
            z10 = x.g(context);
        } else {
            z10 = true;
        }
        String str = this.f12393b;
        if (!z10) {
            StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb2.append(str);
            Log.i("FirebaseApp", sb2.toString());
            AtomicReference atomicReference = g.f12388b;
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
        this.d.g("[DEFAULT]".equals(str));
        ((na.c) this.h.get()).c();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        hVar.a();
        return this.f12393b.equals(hVar.f12393b);
    }

    public final boolean h() {
        boolean z10;
        a();
        ua.a aVar = (ua.a) this.f12396g.get();
        synchronized (aVar) {
            z10 = aVar.f42619a;
        }
        return z10;
    }

    public final int hashCode() {
        return this.f12393b.hashCode();
    }

    public final String toString() {
        of.b bVar = new of.b(this);
        bVar.E(this.f12393b, "name");
        bVar.E(this.f12394c, "options");
        return bVar.toString();
    }
}
