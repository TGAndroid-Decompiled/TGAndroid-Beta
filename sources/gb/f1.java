package gb;

import android.util.Log;
import java.util.Map;
public final class f1 {
    public final jb.l f13676a;
    public final v0 f13677b;
    public final r0 f13678c;
    public final j1 d;
    public final m1.g f13679e;
    public final d0 f13680f;
    public final id.h f13681g;
    public k0 h;
    public boolean f13682i;
    public boolean f13683j;
    public String f13684k;

    public f1(jb.l sessionsSettings, v0 sessionGenerator, r0 sessionFirelogPublisher, j1 timeProvider, m1.g sessionDataStore, d0 processDataManager, id.h backgroundDispatcher) {
        kotlin.jvm.internal.j.e(sessionsSettings, "sessionsSettings");
        kotlin.jvm.internal.j.e(sessionGenerator, "sessionGenerator");
        kotlin.jvm.internal.j.e(sessionFirelogPublisher, "sessionFirelogPublisher");
        kotlin.jvm.internal.j.e(timeProvider, "timeProvider");
        kotlin.jvm.internal.j.e(sessionDataStore, "sessionDataStore");
        kotlin.jvm.internal.j.e(processDataManager, "processDataManager");
        kotlin.jvm.internal.j.e(backgroundDispatcher, "backgroundDispatcher");
        this.f13676a = sessionsSettings;
        this.f13677b = sessionGenerator;
        this.f13678c = sessionFirelogPublisher;
        this.d = timeProvider;
        this.f13679e = sessionDataStore;
        this.f13680f = processDataManager;
        this.f13681g = backgroundDispatcher;
        c1 c1Var = c1.f13642a;
        this.f13684k = "";
        zd.b0.q(zd.b0.b(backgroundDispatcher), new b1(this, null, 0));
    }

    public static final java.lang.Object a(gb.f1 r4, java.lang.String r5, gb.c1 r6, id.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: gb.f1.a(gb.f1, java.lang.String, gb.c1, id.c):java.lang.Object");
    }

    public final void b() {
        this.f13682i = false;
        if (this.h == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.f13680f.a());
        zd.b0.q(zd.b0.b(this.f13681g), new b1(this, null, 1));
    }

    public final void c() {
        this.f13682i = true;
        k0 k0Var = this.h;
        if (k0Var == null) {
            this.f13683j = true;
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
        } else if (k0Var != null) {
            Log.d("FirebaseSessions", "App foregrounded on " + this.f13680f.a());
            if (!e(k0Var) && !d(k0Var)) {
                return;
            }
            zd.b0.q(zd.b0.b(this.f13681g), new be.l(this, k0Var, null, 5));
        } else {
            kotlin.jvm.internal.j.h("localSessionData");
            throw null;
        }
    }

    public final boolean d(k0 k0Var) {
        Map map = k0Var.f13724c;
        boolean z9 = true;
        d0 d0Var = this.f13680f;
        if (map != null) {
            d0Var.getClass();
            b0 b0Var = (b0) map.get(d0Var.a());
            if (b0Var != null && b0Var.f13629a == d0Var.f13653c && kotlin.jvm.internal.j.a(b0Var.f13630b, (String) d0Var.d.getValue())) {
                z9 = false;
            }
            if (z9) {
                Log.d("FirebaseSessions", "Process " + d0Var.a() + " is stale");
            }
            return z9;
        }
        Log.d("FirebaseSessions", "No process data for " + d0Var.a());
        return true;
    }

    public final boolean e(gb.k0 r12) {
        throw new UnsupportedOperationException("Method not decompiled: gb.f1.e(gb.k0):boolean");
    }
}
