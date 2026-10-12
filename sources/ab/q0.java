package ab;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import java.util.ArrayList;
public final class q0 extends Handler {
    public boolean f454a;
    public long f455b;
    public final ArrayList f456c;

    public q0(Looper looper) {
        super(looper);
        this.f456c = new ArrayList();
    }

    public final void a(Messenger messenger) {
        String str;
        if (this.f454a) {
            Object b10 = l9.h.c().b(m0.class);
            kotlin.jvm.internal.i.d(b10, "Firebase.app[SessionGenerator::class.java]");
            c(messenger, ((m0) b10).b().f384a);
            return;
        }
        Object b11 = l9.h.c().b(t.class);
        kotlin.jvm.internal.i.d(b11, "Firebase.app[SessionDatastore::class.java]");
        n nVar = (n) ((c0) ((t) b11)).f378c.get();
        if (nVar != null) {
            str = nVar.f441a;
        } else {
            str = null;
        }
        Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session: " + str);
        if (str != null) {
            c(messenger, str);
        }
    }

    public final void b() {
        String a2;
        Object b10 = l9.h.c().b(m0.class);
        kotlin.jvm.internal.i.d(b10, "Firebase.app[SessionGenerator::class.java]");
        m0 m0Var = (m0) b10;
        int i10 = m0Var.d + 1;
        m0Var.d = i10;
        if (i10 == 0) {
            a2 = m0Var.f440c;
        } else {
            a2 = m0Var.a();
        }
        String str = a2;
        String str2 = m0Var.f440c;
        int i11 = m0Var.d;
        m0Var.f438a.getClass();
        m0Var.e = new d0(i11, System.currentTimeMillis() * 1000, str, str2);
        m0Var.b();
        StringBuilder sb2 = new StringBuilder("Generated new session ");
        Object b11 = l9.h.c().b(m0.class);
        kotlin.jvm.internal.i.d(b11, "Firebase.app[SessionGenerator::class.java]");
        sb2.append(((m0) b11).b().f384a);
        Log.d("SessionLifecycleService", sb2.toString());
        StringBuilder sb3 = new StringBuilder("Broadcasting new session: ");
        Object b12 = l9.h.c().b(m0.class);
        kotlin.jvm.internal.i.d(b12, "Firebase.app[SessionGenerator::class.java]");
        sb3.append(((m0) b12).b());
        Log.d("SessionLifecycleService", sb3.toString());
        Object b13 = l9.h.c().b(g0.class);
        kotlin.jvm.internal.i.d(b13, "Firebase.app[SessionFirelogPublisher::class.java]");
        Object b14 = l9.h.c().b(m0.class);
        kotlin.jvm.internal.i.d(b14, "Firebase.app[SessionGenerator::class.java]");
        k0 k0Var = (k0) ((g0) b13);
        be.f0.q(be.f0.b(k0Var.e), new i0(k0Var, ((m0) b14).b(), null));
        ArrayList arrayList = new ArrayList(this.f456c);
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            Messenger it = (Messenger) obj;
            kotlin.jvm.internal.i.d(it, "it");
            a(it);
        }
        Object b15 = l9.h.c().b(t.class);
        kotlin.jvm.internal.i.d(b15, "Firebase.app[SessionDatastore::class.java]");
        Object b16 = l9.h.c().b(m0.class);
        kotlin.jvm.internal.i.d(b16, "Firebase.app[SessionGenerator::class.java]");
        String sessionId = ((m0) b16).b().f384a;
        c0 c0Var = (c0) ((t) b15);
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        be.f0.q(be.f0.b(c0Var.f377b), new l(c0Var, sessionId, null, 1));
    }

    public final void c(Messenger messenger, String str) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("SessionUpdateExtra", str);
            Message obtain = Message.obtain(null, 3, 0, 0);
            obtain.setData(bundle);
            messenger.send(obtain);
        } catch (DeadObjectException unused) {
            Log.d("SessionLifecycleService", "Removing dead client from list: " + messenger);
            this.f456c.remove(messenger);
        } catch (Exception e) {
            Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e);
        }
    }

    @Override
    public final void handleMessage(android.os.Message r12) {
        throw new UnsupportedOperationException("Method not decompiled: ab.q0.handleMessage(android.os.Message):void");
    }
}
