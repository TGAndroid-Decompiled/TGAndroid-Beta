package m9;

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
import m4.w1;
import s9.n;
import t9.k;
public final class h {
    public static final Object f18378k = new Object();
    public static final a0.f f18379l = new l(0);
    public final Context f18380a;
    public final String f18381b;
    public final j f18382c;
    public final s9.g d;
    public final AtomicBoolean e;
    public final AtomicBoolean f18383f;
    public final n f18384g;
    public final ra.b h;
    public final CopyOnWriteArrayList f18385i;
    public final CopyOnWriteArrayList f18386j;

    public h(Context context, String str, j jVar) {
        boolean z10;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.e = atomicBoolean;
        this.f18383f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f18385i = copyOnWriteArrayList;
        this.f18386j = new CopyOnWriteArrayList();
        this.f18380a = context;
        o6.l.f(str);
        this.f18381b = str;
        this.f18382c = jVar;
        a aVar = FirebaseInitProvider.f7792a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList k10 = new m4.c(19, context, new hb.e(ComponentDiscoveryService.class)).k();
        Trace.endSection();
        Trace.beginSection("Runtime");
        k kVar = k.f48752a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(k10);
        arrayList.add(new s9.c(new FirebaseCommonRegistrar(), 1));
        arrayList.add(new s9.c(new ExecutorsRegistrar(), 1));
        arrayList2.add(s9.a.c(context, Context.class, new Class[0]));
        arrayList2.add(s9.a.c(this, h.class, new Class[0]));
        arrayList2.add(s9.a.c(jVar, j.class, new Class[0]));
        ?? obj = new Object();
        if (Build.VERSION.SDK_INT >= 24) {
            z10 = w.g(context);
        } else {
            z10 = true;
        }
        if (z10 && FirebaseInitProvider.f7793b.get()) {
            arrayList2.add(s9.a.c(aVar, a.class, new Class[0]));
        }
        s9.g gVar = new s9.g(kVar, arrayList, arrayList2, obj);
        this.d = gVar;
        Trace.endSection();
        this.f18384g = new n(new d(0, this, context));
        this.h = gVar.d(pa.c.class);
        e eVar = new e(this);
        a();
        if (atomicBoolean.get()) {
            com.google.android.gms.common.api.internal.d.e.f6512a.get();
        }
        copyOnWriteArrayList.add(eVar);
        Trace.endSection();
    }

    public static h c() {
        h hVar;
        synchronized (f18378k) {
            try {
                hVar = (h) f18379l.get("[DEFAULT]");
                if (hVar != null) {
                    ((pa.c) hVar.h.get()).c();
                } else {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + v6.d.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }

    public static h f(Context context) {
        synchronized (f18378k) {
            try {
                if (f18379l.containsKey("[DEFAULT]")) {
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
        AtomicReference atomicReference = f.f18375a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = f.f18375a;
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
        synchronized (f18378k) {
            a0.f fVar = f18379l;
            o6.l.j("FirebaseApp name [DEFAULT] already exists!", !fVar.containsKey("[DEFAULT]"));
            o6.l.i(context, "Application context cannot be null.");
            hVar = new h(context, "[DEFAULT]", jVar);
            fVar.put("[DEFAULT]", hVar);
        }
        hVar.e();
        return hVar;
    }

    public final void a() {
        o6.l.j("FirebaseApp was deleted", !this.f18383f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.d.a(cls);
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        a();
        sb2.append(v6.b.c(this.f18381b.getBytes(Charset.defaultCharset())));
        sb2.append("+");
        a();
        sb2.append(v6.b.c(this.f18382c.f18391b.getBytes(Charset.defaultCharset())));
        return sb2.toString();
    }

    public final void e() {
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        Context context = this.f18380a;
        if (i10 >= 24) {
            z10 = w.g(context);
        } else {
            z10 = true;
        }
        String str = this.f18381b;
        if (!z10) {
            StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb2.append(str);
            Log.i("FirebaseApp", sb2.toString());
            AtomicReference atomicReference = g.f18376b;
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
        this.d.e("[DEFAULT]".equals(str));
        ((pa.c) this.h.get()).c();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        hVar.a();
        return this.f18381b.equals(hVar.f18381b);
    }

    public final boolean h() {
        boolean z10;
        a();
        wa.a aVar = (wa.a) this.f18384g.get();
        synchronized (aVar) {
            z10 = aVar.f51142a;
        }
        return z10;
    }

    public final int hashCode() {
        return this.f18381b.hashCode();
    }

    public final String toString() {
        w1 w1Var = new w1(this);
        w1Var.x(this.f18381b, "name");
        w1Var.x(this.f18382c, "options");
        return w1Var.toString();
    }
}
