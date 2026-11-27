package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
public final class ji4 {
    public static final Object k = new Object();
    public static final qs l = new vla(0);
    public final Context a;
    public final String b;
    public final yi4 c;
    public final xq2 d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;
    public final i26 g;
    public final vw8 h;
    public final CopyOnWriteArrayList i;
    public final CopyOnWriteArrayList j;

    public ji4(Context context, String str, yi4 yi4Var) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.e = atomicBoolean;
        this.f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.i = copyOnWriteArrayList;
        this.j = new CopyOnWriteArrayList();
        this.a = context;
        xve.f(str);
        this.b = str;
        this.c = yi4Var;
        na0 na0Var = FirebaseInitProvider.a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList q = new lh2(context, new ri6(ComponentDiscoveryService.class, (byte) 20), (byte) 17).q();
        Trace.endSection();
        Trace.beginSection("Runtime");
        l8c l8cVar = l8c.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(q);
        arrayList.add(new sq2(new FirebaseCommonRegistrar(), (byte) 1));
        arrayList.add(new sq2(new ExecutorsRegistrar(), (byte) 1));
        arrayList2.add(fq2.c(context, Context.class, new Class[0]));
        arrayList2.add(fq2.c(this, ji4.class, new Class[0]));
        arrayList2.add(fq2.c(yi4Var, yi4.class, new Class[0]));
        faf fafVar = new faf((byte) 15);
        if ((Build.VERSION.SDK_INT >= 24 ? lh0.j(context) : true) && FirebaseInitProvider.b.get()) {
            arrayList2.add(fq2.c(na0Var, na0.class, new Class[0]));
        }
        xq2 xq2Var = new xq2(l8cVar, arrayList, arrayList2, fafVar);
        this.d = xq2Var;
        Trace.endSection();
        this.g = new i26(new wq2(this, context, (byte) 2));
        this.h = xq2Var.d(hb3.class);
        gi4 gi4Var = new gi4(this);
        a();
        if (atomicBoolean.get()) {
            qd0.e.a.get();
        }
        copyOnWriteArrayList.add(gi4Var);
        Trace.endSection();
    }

    public static ji4 c() {
        ji4 ji4Var;
        synchronized (k) {
            ji4Var = (ji4) l.get("[DEFAULT]");
            if (ji4Var != null) {
                ((hb3) ji4Var.h.get()).c();
            } else {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + go.j() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return ji4Var;
    }

    public static ji4 f(Context context) {
        synchronized (k) {
            if (l.containsKey("[DEFAULT]")) {
                return c();
            }
            yi4 a = yi4.a(context);
            if (a == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return g(context, a);
        }
    }

    public static ji4 g(Context context, yi4 yi4Var) {
        ji4 ji4Var;
        AtomicReference atomicReference = hi4.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = hi4.a;
            if (atomicReference2.get() == null) {
                ?? obj = new Object();
                while (true) {
                    if (atomicReference2.compareAndSet(null, obj)) {
                        qd0.b(application);
                        qd0.e.a(obj);
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
        synchronized (k) {
            qs qsVar = l;
            xve.j("FirebaseApp name [DEFAULT] already exists!", !qsVar.containsKey("[DEFAULT]"));
            xve.i(context, "Application context cannot be null.");
            ji4Var = new ji4(context, "[DEFAULT]", yi4Var);
            qsVar.put("[DEFAULT]", ji4Var);
        }
        ji4Var.e();
        return ji4Var;
    }

    public final void a() {
        xve.j("FirebaseApp was deleted", !this.f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.d.a(cls);
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        a();
        sb.append(lsd.b(this.b.getBytes(Charset.defaultCharset())));
        sb.append("+");
        a();
        sb.append(lsd.b(this.c.b.getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    public final void e() {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        Context context = this.a;
        if (i >= 24) {
            z = lh0.j(context);
        } else {
            z = true;
        }
        String str = this.b;
        if (!z) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(str);
            Log.i("FirebaseApp", sb.toString());
            AtomicReference atomicReference = ii4.b;
            if (atomicReference.get() == null) {
                ii4 ii4Var = new ii4(context);
                while (!atomicReference.compareAndSet(null, ii4Var)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(ii4Var, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(str);
        Log.i("FirebaseApp", sb2.toString());
        a();
        this.d.o("[DEFAULT]".equals(str));
        ((hb3) this.h.get()).c();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ji4)) {
            return false;
        }
        ji4 ji4Var = (ji4) obj;
        ji4Var.a();
        return this.b.equals(ji4Var.b);
    }

    public final boolean h() {
        boolean z;
        a();
        q63 q63Var = (q63) this.g.get();
        synchronized (q63Var) {
            z = q63Var.a;
        }
        return z;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        um4 um4Var = new um4(this);
        um4Var.a(this.b, "name");
        um4Var.a(this.c, "options");
        return um4Var.toString();
    }
}
