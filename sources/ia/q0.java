package ia;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import g7.t7;
import java.util.ArrayList;

public final class q0 extends Handler {

    public boolean f11070a;

    public long f11071b;

    public final ArrayList f11072c;

    public q0(Looper looper) {
        super(looper);
        this.f11072c = new ArrayList();
    }

    public final void a(Messenger messenger) {
        if (this.f11070a) {
            Object objB = t8.h.c().b(n0.class);
            kotlin.jvm.internal.j.d(objB, "Firebase.app[SessionGenerator::class.java]");
            c(messenger, ((n0) objB).b().f11000a);
            return;
        }
        Object objB2 = t8.h.c().b(u.class);
        kotlin.jvm.internal.j.d(objB2, "Firebase.app[SessionDatastore::class.java]");
        o oVar = (o) ((d0) ((u) objB2)).f10996c.get();
        String str = oVar != null ? oVar.f11061a : null;
        Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session: " + str);
        if (str != null) {
            c(messenger, str);
        }
    }

    public final void b() {
        Object objB = t8.h.c().b(n0.class);
        kotlin.jvm.internal.j.d(objB, "Firebase.app[SessionGenerator::class.java]");
        n0 n0Var = (n0) objB;
        int i10 = n0Var.d + 1;
        n0Var.d = i10;
        String strA = i10 == 0 ? n0Var.f11059c : n0Var.a();
        String str = n0Var.f11059c;
        int i11 = n0Var.d;
        n0Var.f11057a.getClass();
        n0Var.f11060e = new e0(i11, System.currentTimeMillis() * 1000, strA, str);
        n0Var.b();
        StringBuilder sb2 = new StringBuilder("Generated new session ");
        Object objB2 = t8.h.c().b(n0.class);
        kotlin.jvm.internal.j.d(objB2, "Firebase.app[SessionGenerator::class.java]");
        sb2.append(((n0) objB2).b().f11000a);
        Log.d("SessionLifecycleService", sb2.toString());
        StringBuilder sb3 = new StringBuilder("Broadcasting new session: ");
        Object objB3 = t8.h.c().b(n0.class);
        kotlin.jvm.internal.j.d(objB3, "Firebase.app[SessionGenerator::class.java]");
        sb3.append(((n0) objB3).b());
        Log.d("SessionLifecycleService", sb3.toString());
        Object objB4 = t8.h.c().b(h0.class);
        kotlin.jvm.internal.j.d(objB4, "Firebase.app[SessionFirelogPublisher::class.java]");
        Object objB5 = t8.h.c().b(n0.class);
        kotlin.jvm.internal.j.d(objB5, "Firebase.app[SessionGenerator::class.java]");
        l0 l0Var = (l0) ((h0) objB4);
        rc.c cVar = null;
        id.f0.q(id.f0.b(l0Var.f11050e), new j0(l0Var, ((n0) objB5).b(), null));
        ArrayList arrayList = new ArrayList(this.f11072c);
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            Messenger it = (Messenger) obj;
            kotlin.jvm.internal.j.d(it, "it");
            a(it);
        }
        Object objB6 = t8.h.c().b(u.class);
        kotlin.jvm.internal.j.d(objB6, "Firebase.app[SessionDatastore::class.java]");
        Object objB7 = t8.h.c().b(n0.class);
        kotlin.jvm.internal.j.d(objB7, "Firebase.app[SessionGenerator::class.java]");
        String sessionId = ((n0) objB7).b().f11000a;
        d0 d0Var = (d0) ((u) objB6);
        kotlin.jvm.internal.j.e(sessionId, "sessionId");
        id.f0.q(id.f0.b(d0Var.f10995b), new m(d0Var, sessionId, cVar, 1));
    }

    public final void c(Messenger messenger, String str) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("SessionUpdateExtra", str);
            Message messageObtain = Message.obtain(null, 3, 0, 0);
            messageObtain.setData(bundle);
            messenger.send(messageObtain);
        } catch (DeadObjectException unused) {
            Log.d("SessionLifecycleService", "Removing dead client from list: " + messenger);
            this.f11072c.remove(messenger);
        } catch (Exception e9) {
            Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e9);
        }
    }

    @Override
    public final void handleMessage(Message msg) {
        ka.e eVar;
        Integer num;
        long jA;
        kotlin.jvm.internal.j.e(msg, "msg");
        if (this.f11071b > msg.getWhen()) {
            Log.d("SessionLifecycleService", "Ignoring old message from " + msg.getWhen() + " which is older than " + this.f11071b + '.');
            return;
        }
        int i10 = msg.what;
        if (i10 != 1) {
            if (i10 == 2) {
                Log.d("SessionLifecycleService", "Activity backgrounding at " + msg.getWhen());
                this.f11071b = msg.getWhen();
                return;
            }
            if (i10 != 4) {
                Log.w("SessionLifecycleService", "Received unexpected event from the SessionLifecycleClient: " + msg);
                super.handleMessage(msg);
                return;
            }
            Messenger messenger = msg.replyTo;
            ArrayList arrayList = this.f11072c;
            arrayList.add(messenger);
            Messenger messenger2 = msg.replyTo;
            kotlin.jvm.internal.j.d(messenger2, "msg.replyTo");
            a(messenger2);
            Log.d("SessionLifecycleService", "Client " + msg.replyTo + " bound at " + msg.getWhen() + ". Clients: " + arrayList.size());
            return;
        }
        Log.d("SessionLifecycleService", "Activity foregrounding at " + msg.getWhen() + '.');
        if (this.f11070a) {
            long when = msg.getWhen() - this.f11071b;
            ka.h.f15124c.getClass();
            Object objB = t8.h.c().b(ka.h.class);
            kotlin.jvm.internal.j.d(objB, "Firebase.app[SessionsSettings::class.java]");
            ka.h hVar = (ka.h) objB;
            Bundle bundle = hVar.f15125a.f789a;
            hd.a aVar = null;
            hd.a aVar2 = bundle.containsKey("firebase_sessions_sessions_restart_timeout") ? new hd.a(t7.a(bundle.getInt("firebase_sessions_sessions_restart_timeout"), hd.c.SECONDS)) : null;
            if (aVar2 != null) {
                jA = aVar2.f8910a;
                int i11 = hd.a.d;
                if (jA <= 0 || hd.a.b(jA)) {
                    eVar = hVar.f15126b.f15115c.f15138b;
                    if (eVar != null) {
                        kotlin.jvm.internal.j.h("sessionConfigs");
                        throw null;
                    }
                    num = eVar.f15118c;
                    if (num != null) {
                        int i12 = hd.a.d;
                        aVar = new hd.a(t7.a(num.intValue(), hd.c.SECONDS));
                    }
                    if (aVar != null) {
                        jA = aVar.f8910a;
                        int i13 = hd.a.d;
                        if (jA > 0 || hd.a.b(jA)) {
                            int i14 = hd.a.d;
                            jA = t7.a(30, hd.c.MINUTES);
                        }
                    } else {
                        int i15 = hd.a.d;
                        jA = t7.a(30, hd.c.MINUTES);
                    }
                }
            } else {
                eVar = hVar.f15126b.f15115c.f15138b;
                if (eVar != null) {
                    kotlin.jvm.internal.j.h("sessionConfigs");
                    throw null;
                }
                num = eVar.f15118c;
                if (num != null) {
                    int i16 = hd.a.d;
                    aVar = new hd.a(t7.a(num.intValue(), hd.c.SECONDS));
                }
                if (aVar != null) {
                    jA = aVar.f8910a;
                    int i17 = hd.a.d;
                    if (jA > 0) {
                        int i18 = hd.a.d;
                        jA = t7.a(30, hd.c.MINUTES);
                    } else {
                        int i19 = hd.a.d;
                        jA = t7.a(30, hd.c.MINUTES);
                    }
                } else {
                    int i110 = hd.a.d;
                    jA = t7.a(30, hd.c.MINUTES);
                }
            }
            if (when > (((((int) jA) & 1) != 1 || hd.a.b(jA)) ? hd.a.c(jA, hd.c.MILLISECONDS) : jA >> 1)) {
                Log.d("SessionLifecycleService", "Session too long in background. Creating new session.");
                b();
            }
        } else {
            Log.d("SessionLifecycleService", "Cold start detected.");
            this.f11070a = true;
            b();
        }
        this.f11071b = msg.getWhen();
    }
}
