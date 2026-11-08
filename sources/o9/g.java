package o9;

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
import org.telegram.ui.Components.rt;
import q6.m;
import sg.i0;
import u9.n;
import v9.j;
public final class g {
    public static final Object f20873k = new Object();
    public static final a0.f f20874l = new l(0);
    public final Context f20875a;
    public final String f20876b;
    public final i f20877c;
    public final u9.g d;
    public final AtomicBoolean f20878e;
    public final AtomicBoolean f20879f;
    public final n f20880g;
    public final ua.b h;
    public final CopyOnWriteArrayList f20881i;
    public final CopyOnWriteArrayList f20882j;

    public g(Context context, String str, i iVar) {
        boolean z9;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f20878e = atomicBoolean;
        this.f20879f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f20881i = copyOnWriteArrayList;
        this.f20882j = new CopyOnWriteArrayList();
        this.f20875a = context;
        m.e(str);
        this.f20876b = str;
        this.f20877c = iVar;
        a aVar = FirebaseInitProvider.f7899a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList b10 = new i0(4, context, new rt(ComponentDiscoveryService.class, 20)).b();
        Trace.endSection();
        Trace.beginSection("Runtime");
        j jVar = j.f57280a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(b10);
        arrayList.add(new u9.c(new FirebaseCommonRegistrar(), 1));
        arrayList.add(new u9.c(new ExecutorsRegistrar(), 1));
        arrayList2.add(u9.a.c(context, Context.class, new Class[0]));
        arrayList2.add(u9.a.c(this, g.class, new Class[0]));
        arrayList2.add(u9.a.c(iVar, i.class, new Class[0]));
        qb.a aVar2 = new qb.a(12);
        if (Build.VERSION.SDK_INT >= 24) {
            z9 = w.g(context);
        } else {
            z9 = true;
        }
        if (z9 && FirebaseInitProvider.f7900b.get()) {
            arrayList2.add(u9.a.c(aVar, a.class, new Class[0]));
        }
        u9.g gVar = new u9.g(jVar, arrayList, arrayList2, aVar2);
        this.d = gVar;
        Trace.endSection();
        this.f20880g = new n(new c(0, this, context));
        this.h = gVar.c(sa.c.class);
        d dVar = new d(this);
        a();
        if (atomicBoolean.get()) {
            com.google.android.gms.common.api.internal.c.f6576e.f6577a.get();
        }
        copyOnWriteArrayList.add(dVar);
        Trace.endSection();
    }

    public static g c() {
        g gVar;
        synchronized (f20873k) {
            try {
                gVar = (g) f20874l.get("[DEFAULT]");
                if (gVar != null) {
                    ((sa.c) gVar.h.get()).c();
                } else {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + x6.d.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    public static g f(Context context) {
        synchronized (f20873k) {
            try {
                if (f20874l.containsKey("[DEFAULT]")) {
                    return c();
                }
                i a10 = i.a(context);
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

    public static g g(Context context, i iVar) {
        g gVar;
        AtomicReference atomicReference = e.f20870a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = e.f20870a;
            if (atomicReference2.get() == null) {
                ?? obj = new Object();
                while (true) {
                    if (atomicReference2.compareAndSet(null, obj)) {
                        com.google.android.gms.common.api.internal.c.b(application);
                        com.google.android.gms.common.api.internal.c.f6576e.a(obj);
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
        synchronized (f20873k) {
            a0.f fVar = f20874l;
            m.i("FirebaseApp name [DEFAULT] already exists!", !fVar.containsKey("[DEFAULT]"));
            m.h(context, "Application context cannot be null.");
            gVar = new g(context, "[DEFAULT]", iVar);
            fVar.put("[DEFAULT]", gVar);
        }
        gVar.e();
        return gVar;
    }

    public final void a() {
        m.i("FirebaseApp was deleted", !this.f20879f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.d.a(cls);
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        a();
        sb2.append(x6.b.c(this.f20876b.getBytes(Charset.defaultCharset())));
        sb2.append("+");
        a();
        sb2.append(x6.b.c(this.f20877c.f20888b.getBytes(Charset.defaultCharset())));
        return sb2.toString();
    }

    public final void e() {
        boolean z9;
        int i7 = Build.VERSION.SDK_INT;
        Context context = this.f20875a;
        if (i7 >= 24) {
            z9 = w.g(context);
        } else {
            z9 = true;
        }
        String str = this.f20876b;
        if (!z9) {
            StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb2.append(str);
            Log.i("FirebaseApp", sb2.toString());
            AtomicReference atomicReference = f.f20871b;
            if (atomicReference.get() == null) {
                f fVar = new f(context);
                while (!atomicReference.compareAndSet(null, fVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(fVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
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
        ((sa.c) this.h.get()).c();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.a();
        return this.f20876b.equals(gVar.f20876b);
    }

    public final boolean h() {
        boolean z9;
        a();
        za.a aVar = (za.a) this.f20880g.get();
        synchronized (aVar) {
            z9 = aVar.f60023a;
        }
        return z9;
    }

    public final int hashCode() {
        return this.f20876b.hashCode();
    }

    public final String toString() {
        j2.n nVar = new j2.n(this);
        nVar.X(this.f20876b, "name");
        nVar.X(this.f20877c, "options");
        return nVar.toString();
    }
}
