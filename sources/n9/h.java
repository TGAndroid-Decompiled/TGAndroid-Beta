package n9;

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
import m2.t;
import org.telegram.ui.Components.i9;
import p6.m;
import t9.n;
public final class h {
    public static final Object f20294k = new Object();
    public static final a0.f f20295l = new l(0);
    public final Context f20296a;
    public final String f20297b;
    public final k f20298c;
    public final t9.g d;
    public final AtomicBoolean f20299e;
    public final AtomicBoolean f20300f;
    public final n f20301g;
    public final ta.b h;
    public final CopyOnWriteArrayList f20302i;
    public final CopyOnWriteArrayList f20303j;

    public h(Context context, String str, k kVar) {
        boolean z10;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f20299e = atomicBoolean;
        this.f20300f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f20302i = copyOnWriteArrayList;
        this.f20303j = new CopyOnWriteArrayList();
        this.f20296a = context;
        m.e(str);
        this.f20297b = str;
        this.f20298c = kVar;
        a aVar = FirebaseInitProvider.f7954a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList l02 = new t(context, new i9(ComponentDiscoveryService.class, 20), false, 26).l0();
        Trace.endSection();
        Trace.beginSection("Runtime");
        u9.m mVar = u9.m.f55776a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(l02);
        arrayList.add(new t9.c(new FirebaseCommonRegistrar(), 1));
        arrayList.add(new t9.c(new ExecutorsRegistrar(), 1));
        arrayList2.add(t9.a.c(context, Context.class, new Class[0]));
        arrayList2.add(t9.a.c(this, h.class, new Class[0]));
        arrayList2.add(t9.a.c(kVar, k.class, new Class[0]));
        kb.a aVar2 = new kb.a(10);
        if (Build.VERSION.SDK_INT >= 24) {
            z10 = x.g(context);
        } else {
            z10 = true;
        }
        if (z10 && FirebaseInitProvider.f7955b.get()) {
            arrayList2.add(t9.a.c(aVar, a.class, new Class[0]));
        }
        t9.g gVar = new t9.g(mVar, arrayList, arrayList2, aVar2);
        this.d = gVar;
        Trace.endSection();
        this.f20301g = new n(new d(0, this, context));
        this.h = gVar.f(ra.d.class);
        e eVar = new e(this);
        a();
        if (atomicBoolean.get()) {
            com.google.android.gms.common.api.internal.c.f6627e.f6628a.get();
        }
        copyOnWriteArrayList.add(eVar);
        Trace.endSection();
    }

    public static h c() {
        h hVar;
        synchronized (f20294k) {
            try {
                hVar = (h) f20295l.get("[DEFAULT]");
                if (hVar != null) {
                    ((ra.d) hVar.h.get()).c();
                } else {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + w6.d.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }

    public static h f(Context context) {
        synchronized (f20294k) {
            try {
                if (f20295l.containsKey("[DEFAULT]")) {
                    return c();
                }
                k a10 = k.a(context);
                if (a10 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return g(context, a10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static h g(Context context, k kVar) {
        h hVar;
        AtomicReference atomicReference = f.f20291a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = f.f20291a;
            if (atomicReference2.get() == null) {
                ?? obj = new Object();
                while (true) {
                    if (atomicReference2.compareAndSet(null, obj)) {
                        com.google.android.gms.common.api.internal.c.b(application);
                        com.google.android.gms.common.api.internal.c.f6627e.a(obj);
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
        synchronized (f20294k) {
            a0.f fVar = f20295l;
            m.i("FirebaseApp name [DEFAULT] already exists!", !fVar.containsKey("[DEFAULT]"));
            m.h(context, "Application context cannot be null.");
            hVar = new h(context, "[DEFAULT]", kVar);
            fVar.put("[DEFAULT]", hVar);
        }
        hVar.e();
        return hVar;
    }

    public final void a() {
        m.i("FirebaseApp was deleted", !this.f20300f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.d.a(cls);
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        a();
        sb2.append(w6.b.c(this.f20297b.getBytes(Charset.defaultCharset())));
        sb2.append("+");
        a();
        sb2.append(w6.b.c(this.f20298c.f20310b.getBytes(Charset.defaultCharset())));
        return sb2.toString();
    }

    public final void e() {
        boolean z10;
        int i3 = Build.VERSION.SDK_INT;
        Context context = this.f20296a;
        if (i3 >= 24) {
            z10 = x.g(context);
        } else {
            z10 = true;
        }
        String str = this.f20297b;
        if (!z10) {
            StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb2.append(str);
            Log.i("FirebaseApp", sb2.toString());
            AtomicReference atomicReference = g.f20292b;
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
        ((ra.d) this.h.get()).c();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        hVar.a();
        return this.f20297b.equals(hVar.f20297b);
    }

    public final boolean h() {
        boolean z10;
        a();
        ya.a aVar = (ya.a) this.f20301g.get();
        synchronized (aVar) {
            z10 = aVar.f59348a;
        }
        return z10;
    }

    public final int hashCode() {
        return this.f20297b.hashCode();
    }

    public final String toString() {
        t tVar = new t(this);
        tVar.A(this.f20297b, "name");
        tVar.A(this.f20298c, "options");
        return tVar.toString();
    }
}
