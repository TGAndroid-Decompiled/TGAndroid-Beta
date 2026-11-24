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
public final class jg4 {
    public static final Object k = new Object();
    public static final ps l = new aia(0);
    public final Context a;
    public final String b;
    public final xg4 c;
    public final eq2 d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;
    public final e06 g;
    public final mt8 h;
    public final CopyOnWriteArrayList i;
    public final CopyOnWriteArrayList j;

    public jg4(Context context, String str, xg4 xg4Var) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.e = atomicBoolean;
        this.f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.i = copyOnWriteArrayList;
        this.j = new CopyOnWriteArrayList();
        this.a = context;
        fre.f(str);
        this.b = str;
        this.c = xg4Var;
        la0 la0Var = FirebaseInitProvider.a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList v = new tg2(context, new qx4(ComponentDiscoveryService.class), (byte) 17).v();
        Trace.endSection();
        Trace.beginSection("Runtime");
        m4c m4cVar = m4c.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(v);
        arrayList.add(new zp2(new FirebaseCommonRegistrar(), (byte) 1));
        arrayList.add(new zp2(new ExecutorsRegistrar(), (byte) 1));
        arrayList2.add(mp2.c(context, Context.class, new Class[0]));
        arrayList2.add(mp2.c(this, jg4.class, new Class[0]));
        arrayList2.add(mp2.c(xg4Var, xg4.class, new Class[0]));
        o5f o5fVar = new o5f((byte) 15);
        if ((Build.VERSION.SDK_INT >= 24 ? kh0.j(context) : true) && FirebaseInitProvider.b.get()) {
            arrayList2.add(mp2.c(la0Var, la0.class, new Class[0]));
        }
        eq2 eq2Var = new eq2(m4cVar, arrayList, arrayList2, o5fVar);
        this.d = eq2Var;
        Trace.endSection();
        this.g = new e06(new dq2(this, context, (byte) 2));
        this.h = eq2Var.d(oa3.class);
        gg4 gg4Var = new gg4(this);
        a();
        if (atomicBoolean.get()) {
            od0.e.a.get();
        }
        copyOnWriteArrayList.add(gg4Var);
        Trace.endSection();
    }

    public static jg4 c() {
        jg4 jg4Var;
        synchronized (k) {
            jg4Var = (jg4) l.get("[DEFAULT]");
            if (jg4Var != null) {
                ((oa3) jg4Var.h.get()).c();
            } else {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + fo.j() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return jg4Var;
    }

    public static jg4 f(Context context) {
        synchronized (k) {
            if (l.containsKey("[DEFAULT]")) {
                return c();
            }
            xg4 a = xg4.a(context);
            if (a == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return g(context, a);
        }
    }

    public static jg4 g(Context context, xg4 xg4Var) {
        jg4 jg4Var;
        AtomicReference atomicReference = hg4.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = hg4.a;
            if (atomicReference2.get() == null) {
                ?? obj = new Object();
                while (true) {
                    if (atomicReference2.compareAndSet(null, obj)) {
                        od0.b(application);
                        od0.e.a(obj);
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
            ps psVar = l;
            fre.j("FirebaseApp name [DEFAULT] already exists!", !psVar.containsKey("[DEFAULT]"));
            fre.i(context, "Application context cannot be null.");
            jg4Var = new jg4(context, "[DEFAULT]", xg4Var);
            psVar.put("[DEFAULT]", jg4Var);
        }
        jg4Var.e();
        return jg4Var;
    }

    public final void a() {
        fre.j("FirebaseApp was deleted", !this.f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.d.a(cls);
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        a();
        sb.append(und.b(this.b.getBytes(Charset.defaultCharset())));
        sb.append("+");
        a();
        sb.append(und.b(this.c.b.getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    public final void e() {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        Context context = this.a;
        if (i >= 24) {
            z = kh0.j(context);
        } else {
            z = true;
        }
        String str = this.b;
        if (!z) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(str);
            Log.i("FirebaseApp", sb.toString());
            AtomicReference atomicReference = ig4.b;
            if (atomicReference.get() == null) {
                ig4 ig4Var = new ig4(context);
                while (!atomicReference.compareAndSet(null, ig4Var)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(ig4Var, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(str);
        Log.i("FirebaseApp", sb2.toString());
        a();
        this.d.p("[DEFAULT]".equals(str));
        ((oa3) this.h.get()).c();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jg4)) {
            return false;
        }
        jg4 jg4Var = (jg4) obj;
        jg4Var.a();
        return this.b.equals(jg4Var.b);
    }

    public final boolean h() {
        boolean z;
        a();
        x53 x53Var = (x53) this.g.get();
        synchronized (x53Var) {
            z = x53Var.a;
        }
        return z;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        wk4 wk4Var = new wk4(this);
        wk4Var.a(this.b, "name");
        wk4Var.a(this.c, "options");
        return wk4Var.toString();
    }
}
