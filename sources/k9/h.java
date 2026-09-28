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
import n4.y;
import n6.l;
import q9.n;
public final class h {
    public static final Object f13532k = new Object();
    public static final a0.f f13533l = new m(0);
    public final Context f13534a;
    public final String f13535b;
    public final j f13536c;
    public final q9.g d;
    public final AtomicBoolean e;
    public final AtomicBoolean f13537f;
    public final n f13538g;
    public final pa.b h;
    public final CopyOnWriteArrayList f13539i;
    public final CopyOnWriteArrayList f13540j;

    public h(Context context, String str, j jVar) {
        boolean z10;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.e = atomicBoolean;
        this.f13537f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f13539i = copyOnWriteArrayList;
        this.f13540j = new CopyOnWriteArrayList();
        this.f13534a = context;
        l.f(str);
        this.f13535b = str;
        this.f13536c = jVar;
        a aVar = FirebaseInitProvider.f7352a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList q6 = new o0.a(12, context, new n2.e(ComponentDiscoveryService.class, 14)).q();
        Trace.endSection();
        Trace.beginSection("Runtime");
        r9.j jVar2 = r9.j.f42457a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(q6);
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
        if (z10 && FirebaseInitProvider.f7353b.get()) {
            arrayList2.add(q9.a.c(aVar, a.class, new Class[0]));
        }
        q9.g gVar = new q9.g(jVar2, arrayList, arrayList2, dVar);
        this.d = gVar;
        Trace.endSection();
        this.f13538g = new n(new d(0, this, context));
        this.h = gVar.c(na.c.class);
        e eVar = new e(this);
        a();
        if (atomicBoolean.get()) {
            com.google.android.gms.common.api.internal.d.e.f6046a.get();
        }
        copyOnWriteArrayList.add(eVar);
        Trace.endSection();
    }

    public static h c() {
        h hVar;
        synchronized (f13532k) {
            try {
                hVar = (h) f13533l.get("[DEFAULT]");
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
        synchronized (f13532k) {
            try {
                if (f13533l.containsKey("[DEFAULT]")) {
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
        AtomicReference atomicReference = f.f13529a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = f.f13529a;
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
        synchronized (f13532k) {
            a0.f fVar = f13533l;
            l.j("FirebaseApp name [DEFAULT] already exists!", !fVar.containsKey("[DEFAULT]"));
            l.i(context, "Application context cannot be null.");
            hVar = new h(context, "[DEFAULT]", jVar);
            fVar.put("[DEFAULT]", hVar);
        }
        hVar.e();
        return hVar;
    }

    public final void a() {
        l.j("FirebaseApp was deleted", !this.f13537f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.d.a(cls);
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        a();
        sb2.append(u6.b.c(this.f13535b.getBytes(Charset.defaultCharset())));
        sb2.append("+");
        a();
        sb2.append(u6.b.c(this.f13536c.f13545b.getBytes(Charset.defaultCharset())));
        return sb2.toString();
    }

    public final void e() {
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        Context context = this.f13534a;
        if (i10 >= 24) {
            z10 = v.g(context);
        } else {
            z10 = true;
        }
        String str = this.f13535b;
        if (!z10) {
            StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb2.append(str);
            Log.i("FirebaseApp", sb2.toString());
            AtomicReference atomicReference = g.f13530b;
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
        return this.f13535b.equals(hVar.f13535b);
    }

    public final boolean h() {
        boolean z10;
        a();
        ua.a aVar = (ua.a) this.f13538g.get();
        synchronized (aVar) {
            z10 = aVar.f43933a;
        }
        return z10;
    }

    public final int hashCode() {
        return this.f13535b.hashCode();
    }

    public final String toString() {
        y yVar = new y(this);
        yVar.k(this.f13535b, "name");
        yVar.k(this.f13536c, "options");
        return yVar.toString();
    }
}
