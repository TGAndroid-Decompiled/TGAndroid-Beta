package la;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import java.util.ArrayList;
public final class m0 extends Handler {
    public boolean f11914a;
    public long f11915b;
    public final ArrayList f11916c;

    public m0(Looper looper) {
        super(looper);
        this.f11916c = new ArrayList();
    }

    public final void a(Messenger messenger) {
        String str;
        if (this.f11914a) {
            Object b10 = w8.g.c().b(j0.class);
            kotlin.jvm.internal.j.d(b10, "Firebase.app[SessionGenerator::class.java]");
            c(messenger, ((j0) b10).b().f11843a);
            return;
        }
        Object b11 = w8.g.c().b(s.class);
        kotlin.jvm.internal.j.d(b11, "Firebase.app[SessionDatastore::class.java]");
        m mVar = (m) ((z) ((s) b11)).f11946c.get();
        if (mVar != null) {
            str = mVar.f11913a;
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
        Object b10 = w8.g.c().b(j0.class);
        kotlin.jvm.internal.j.d(b10, "Firebase.app[SessionGenerator::class.java]");
        j0 j0Var = (j0) b10;
        int i10 = j0Var.d + 1;
        j0Var.d = i10;
        if (i10 == 0) {
            a2 = j0Var.f11903c;
        } else {
            a2 = j0Var.a();
        }
        String str = a2;
        String str2 = j0Var.f11903c;
        int i11 = j0Var.d;
        j0Var.f11901a.getClass();
        j0Var.e = new a0(i11, System.currentTimeMillis() * 1000, str, str2);
        j0Var.b();
        StringBuilder sb = new StringBuilder("Generated new session ");
        Object b11 = w8.g.c().b(j0.class);
        kotlin.jvm.internal.j.d(b11, "Firebase.app[SessionGenerator::class.java]");
        sb.append(((j0) b11).b().f11843a);
        Log.d("SessionLifecycleService", sb.toString());
        StringBuilder sb2 = new StringBuilder("Broadcasting new session: ");
        Object b12 = w8.g.c().b(j0.class);
        kotlin.jvm.internal.j.d(b12, "Firebase.app[SessionGenerator::class.java]");
        sb2.append(((j0) b12).b());
        Log.d("SessionLifecycleService", sb2.toString());
        Object b13 = w8.g.c().b(d0.class);
        kotlin.jvm.internal.j.d(b13, "Firebase.app[SessionFirelogPublisher::class.java]");
        Object b14 = w8.g.c().b(j0.class);
        kotlin.jvm.internal.j.d(b14, "Firebase.app[SessionGenerator::class.java]");
        h0 h0Var = (h0) ((d0) b13);
        ld.e0.q(ld.e0.b(h0Var.e), new f0(h0Var, ((j0) b14).b(), null));
        ArrayList arrayList = new ArrayList(this.f11916c);
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            Messenger it = (Messenger) obj;
            kotlin.jvm.internal.j.d(it, "it");
            a(it);
        }
        Object b15 = w8.g.c().b(s.class);
        kotlin.jvm.internal.j.d(b15, "Firebase.app[SessionDatastore::class.java]");
        Object b16 = w8.g.c().b(j0.class);
        kotlin.jvm.internal.j.d(b16, "Firebase.app[SessionGenerator::class.java]");
        String sessionId = ((j0) b16).b().f11843a;
        z zVar = (z) ((s) b15);
        kotlin.jvm.internal.j.e(sessionId, "sessionId");
        ld.e0.q(ld.e0.b(zVar.f11945b), new k1.c(zVar, sessionId, null, 4));
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
            this.f11916c.remove(messenger);
        } catch (Exception e) {
            Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e);
        }
    }

    @Override
    public final void handleMessage(android.os.Message r12) {
        throw new UnsupportedOperationException("Method not decompiled: la.m0.handleMessage(android.os.Message):void");
    }
}
