package o9;

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
import org.telegram.ui.Components.cf;
import sg.h0;
import u9.m;
import v9.j;
public final class g {
    public static final Object f21395k = new Object();
    public static final a0.f f21396l = new l(0);
    public final Context f21397a;
    public final String f21398b;
    public final i f21399c;
    public final u9.f d;
    public final AtomicBoolean f21400e;
    public final AtomicBoolean f21401f;
    public final m f21402g;
    public final ua.b h;
    public final CopyOnWriteArrayList f21403i;
    public final CopyOnWriteArrayList f21404j;

    public g(Context context, String str, i iVar) {
        boolean z10;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f21400e = atomicBoolean;
        this.f21401f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f21403i = copyOnWriteArrayList;
        this.f21404j = new CopyOnWriteArrayList();
        this.f21397a = context;
        q6.m.e(str);
        this.f21398b = str;
        this.f21399c = iVar;
        a aVar = FirebaseInitProvider.f7289a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList b10 = new h0(4, context, new cf(ComponentDiscoveryService.class)).b();
        Trace.endSection();
        Trace.beginSection("Runtime");
        j jVar = j.f58761a;
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
            z10 = x.g(context);
        } else {
            z10 = true;
        }
        if (z10 && FirebaseInitProvider.f7290b.get()) {
            arrayList2.add(u9.a.c(aVar, a.class, new Class[0]));
        }
        u9.f fVar = new u9.f(jVar, arrayList, arrayList2, aVar2);
        this.d = fVar;
        Trace.endSection();
        this.f21402g = new m(new c(0, this, context));
        this.h = fVar.c(sa.c.class);
        d dVar = new d(this);
        a();
        if (atomicBoolean.get()) {
            com.google.android.gms.common.api.internal.c.f5951e.f5952a.get();
        }
        copyOnWriteArrayList.add(dVar);
        Trace.endSection();
    }

    public static g c() {
        g gVar;
        synchronized (f21395k) {
            try {
                gVar = (g) f21396l.get("[DEFAULT]");
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
        synchronized (f21395k) {
            try {
                if (f21396l.containsKey("[DEFAULT]")) {
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
        AtomicReference atomicReference = e.f21392a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = e.f21392a;
            if (atomicReference2.get() == null) {
                ?? obj = new Object();
                while (true) {
                    if (atomicReference2.compareAndSet(null, obj)) {
                        com.google.android.gms.common.api.internal.c.b(application);
                        com.google.android.gms.common.api.internal.c.f5951e.a(obj);
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
        synchronized (f21395k) {
            a0.f fVar = f21396l;
            q6.m.i("FirebaseApp name [DEFAULT] already exists!", !fVar.containsKey("[DEFAULT]"));
            q6.m.h(context, "Application context cannot be null.");
            gVar = new g(context, "[DEFAULT]", iVar);
            fVar.put("[DEFAULT]", gVar);
        }
        gVar.e();
        return gVar;
    }

    public final void a() {
        q6.m.i("FirebaseApp was deleted", !this.f21401f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.d.a(cls);
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        a();
        sb2.append(x6.b.c(this.f21398b.getBytes(Charset.defaultCharset())));
        sb2.append("+");
        a();
        sb2.append(x6.b.c(this.f21399c.f21410b.getBytes(Charset.defaultCharset())));
        return sb2.toString();
    }

    public final void e() {
        boolean z10;
        int i7 = Build.VERSION.SDK_INT;
        Context context = this.f21397a;
        if (i7 >= 24) {
            z10 = x.g(context);
        } else {
            z10 = true;
        }
        String str = this.f21398b;
        if (!z10) {
            StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb2.append(str);
            Log.i("FirebaseApp", sb2.toString());
            AtomicReference atomicReference = f.f21393b;
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
        return this.f21398b.equals(gVar.f21398b);
    }

    public final boolean h() {
        boolean z10;
        a();
        za.a aVar = (za.a) this.f21402g.get();
        synchronized (aVar) {
            z10 = aVar.f61231a;
        }
        return z10;
    }

    public final int hashCode() {
        return this.f21398b.hashCode();
    }

    public final String toString() {
        ji.j jVar = new ji.j(this);
        jVar.U(this.f21398b, "name");
        jVar.U(this.f21399c, "options");
        return jVar.toString();
    }
}
