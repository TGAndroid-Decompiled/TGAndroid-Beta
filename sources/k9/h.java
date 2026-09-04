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
import k2.g0;
import n4.y;
import n7.z0;
import q9.n;
import r9.k;
public final class h {
    public static final Object f14854k = new Object();
    public static final a0.f f14855l = new l(0);
    public final Context f14856a;
    public final String f14857b;
    public final j f14858c;
    public final q9.g d;
    public final AtomicBoolean f14859e;
    public final AtomicBoolean f14860f;
    public final n f14861g;
    public final pa.b h;
    public final CopyOnWriteArrayList f14862i;
    public final CopyOnWriteArrayList f14863j;

    public h(Context context, String str, j jVar) {
        boolean z10;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f14859e = atomicBoolean;
        this.f14860f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f14862i = copyOnWriteArrayList;
        this.f14863j = new CopyOnWriteArrayList();
        this.f14856a = context;
        n6.l.f(str);
        this.f14857b = str;
        this.f14858c = jVar;
        a aVar = FirebaseInitProvider.f6421a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList u10 = new z0(11, context, new g0(ComponentDiscoveryService.class, 16)).u();
        Trace.endSection();
        Trace.beginSection("Runtime");
        k kVar = k.f45058a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(u10);
        arrayList.add(new q9.c(new FirebaseCommonRegistrar(), 1));
        arrayList.add(new q9.c(new ExecutorsRegistrar(), 1));
        arrayList2.add(q9.a.c(context, Context.class, new Class[0]));
        arrayList2.add(q9.a.c(this, h.class, new Class[0]));
        arrayList2.add(q9.a.c(jVar, j.class, new Class[0]));
        ob.a aVar2 = new ob.a(6);
        if (Build.VERSION.SDK_INT >= 24) {
            z10 = x.g(context);
        } else {
            z10 = true;
        }
        if (z10 && FirebaseInitProvider.f6422b.get()) {
            arrayList2.add(q9.a.c(aVar, a.class, new Class[0]));
        }
        q9.g gVar = new q9.g(kVar, arrayList, arrayList2, aVar2);
        this.d = gVar;
        Trace.endSection();
        this.f14861g = new n(new d(0, this, context));
        this.h = gVar.c(na.c.class);
        e eVar = new e(this);
        a();
        if (atomicBoolean.get()) {
            com.google.android.gms.common.api.internal.d.f4988e.f4989a.get();
        }
        copyOnWriteArrayList.add(eVar);
        Trace.endSection();
    }

    public static h c() {
        h hVar;
        synchronized (f14854k) {
            try {
                hVar = (h) f14855l.get("[DEFAULT]");
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
        synchronized (f14854k) {
            try {
                if (f14855l.containsKey("[DEFAULT]")) {
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
        AtomicReference atomicReference = f.f14851a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = f.f14851a;
            if (atomicReference2.get() == null) {
                ?? obj = new Object();
                while (true) {
                    if (atomicReference2.compareAndSet(null, obj)) {
                        com.google.android.gms.common.api.internal.d.b(application);
                        com.google.android.gms.common.api.internal.d.f4988e.a(obj);
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
        synchronized (f14854k) {
            a0.f fVar = f14855l;
            n6.l.j("FirebaseApp name [DEFAULT] already exists!", !fVar.containsKey("[DEFAULT]"));
            n6.l.i(context, "Application context cannot be null.");
            hVar = new h(context, "[DEFAULT]", jVar);
            fVar.put("[DEFAULT]", hVar);
        }
        hVar.e();
        return hVar;
    }

    public final void a() {
        n6.l.j("FirebaseApp was deleted", !this.f14860f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.d.a(cls);
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        a();
        sb2.append(u6.b.c(this.f14857b.getBytes(Charset.defaultCharset())));
        sb2.append("+");
        a();
        sb2.append(u6.b.c(this.f14858c.f14869b.getBytes(Charset.defaultCharset())));
        return sb2.toString();
    }

    public final void e() {
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        Context context = this.f14856a;
        if (i10 >= 24) {
            z10 = x.g(context);
        } else {
            z10 = true;
        }
        String str = this.f14857b;
        if (!z10) {
            StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb2.append(str);
            Log.i("FirebaseApp", sb2.toString());
            AtomicReference atomicReference = g.f14852b;
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
        ((na.c) this.h.get()).c();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        hVar.a();
        return this.f14857b.equals(hVar.f14857b);
    }

    public final boolean h() {
        boolean z10;
        a();
        ua.a aVar = (ua.a) this.f14861g.get();
        synchronized (aVar) {
            z10 = aVar.f46980a;
        }
        return z10;
    }

    public final int hashCode() {
        return this.f14857b.hashCode();
    }

    public final String toString() {
        y yVar = new y(this);
        yVar.y(this.f14857b, "name");
        yVar.y(this.f14858c, "options");
        return yVar.toString();
    }
}
