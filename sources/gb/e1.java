package gb;

import android.util.Log;
import java.util.Map;
public final class e1 {
    public final jb.l f13319a;
    public final v0 f13320b;
    public final r0 f13321c;
    public final i1 d;
    public final m1.g f13322e;
    public final e0 f13323f;
    public final id.h f13324g;
    public k0 h;
    public boolean f13325i;
    public boolean f13326j;
    public String f13327k;

    public e1(jb.l sessionsSettings, v0 sessionGenerator, r0 sessionFirelogPublisher, i1 timeProvider, m1.g sessionDataStore, e0 processDataManager, id.h backgroundDispatcher) {
        kotlin.jvm.internal.j.e(sessionsSettings, "sessionsSettings");
        kotlin.jvm.internal.j.e(sessionGenerator, "sessionGenerator");
        kotlin.jvm.internal.j.e(sessionFirelogPublisher, "sessionFirelogPublisher");
        kotlin.jvm.internal.j.e(timeProvider, "timeProvider");
        kotlin.jvm.internal.j.e(sessionDataStore, "sessionDataStore");
        kotlin.jvm.internal.j.e(processDataManager, "processDataManager");
        kotlin.jvm.internal.j.e(backgroundDispatcher, "backgroundDispatcher");
        this.f13319a = sessionsSettings;
        this.f13320b = sessionGenerator;
        this.f13321c = sessionFirelogPublisher;
        this.d = timeProvider;
        this.f13322e = sessionDataStore;
        this.f13323f = processDataManager;
        this.f13324g = backgroundDispatcher;
        b1 b1Var = b1.f13285a;
        this.f13327k = "";
        zd.b0.q(zd.b0.b(backgroundDispatcher), new a1(this, null, 0));
    }

    public static final java.lang.Object a(gb.e1 r4, java.lang.String r5, gb.b1 r6, id.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: gb.e1.a(gb.e1, java.lang.String, gb.b1, id.c):java.lang.Object");
    }

    public final void b() {
        this.f13325i = false;
        if (this.h == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.f13323f.a());
        zd.b0.q(zd.b0.b(this.f13324g), new a1(this, null, 1));
    }

    public final void c() {
        this.f13325i = true;
        k0 k0Var = this.h;
        if (k0Var == null) {
            this.f13326j = true;
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
        } else if (k0Var != null) {
            Log.d("FirebaseSessions", "App foregrounded on " + this.f13323f.a());
            if (!e(k0Var) && !d(k0Var)) {
                return;
            }
            zd.b0.q(zd.b0.b(this.f13324g), new be.l(this, k0Var, null, 5));
        } else {
            kotlin.jvm.internal.j.h("localSessionData");
            throw null;
        }
    }

    public final boolean d(k0 k0Var) {
        Map map = k0Var.f13375c;
        boolean z10 = true;
        e0 e0Var = this.f13323f;
        if (map != null) {
            e0Var.getClass();
            c0 c0Var = (c0) map.get(e0Var.a());
            if (c0Var != null && c0Var.f13294a == e0Var.f13316c && kotlin.jvm.internal.j.a(c0Var.f13295b, (String) e0Var.d.getValue())) {
                z10 = false;
            }
            if (z10) {
                Log.d("FirebaseSessions", "Process " + e0Var.a() + " is stale");
            }
            return z10;
        }
        Log.d("FirebaseSessions", "No process data for " + e0Var.a());
        return true;
    }

    public final boolean e(gb.k0 r12) {
        throw new UnsupportedOperationException("Method not decompiled: gb.e1.e(gb.k0):boolean");
    }
}
