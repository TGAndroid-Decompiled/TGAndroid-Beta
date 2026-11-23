package gb;

import android.util.Log;
import java.util.Map;
public final class d1 {
    public final jb.l f13314a;
    public final u0 f13315b;
    public final q0 f13316c;
    public final h1 d;
    public final m1.g f13317e;
    public final d0 f13318f;
    public final id.h f13319g;
    public j0 h;
    public boolean f13320i;
    public boolean f13321j;
    public String f13322k;

    public d1(jb.l sessionsSettings, u0 sessionGenerator, q0 sessionFirelogPublisher, h1 timeProvider, m1.g sessionDataStore, d0 processDataManager, id.h backgroundDispatcher) {
        kotlin.jvm.internal.j.e(sessionsSettings, "sessionsSettings");
        kotlin.jvm.internal.j.e(sessionGenerator, "sessionGenerator");
        kotlin.jvm.internal.j.e(sessionFirelogPublisher, "sessionFirelogPublisher");
        kotlin.jvm.internal.j.e(timeProvider, "timeProvider");
        kotlin.jvm.internal.j.e(sessionDataStore, "sessionDataStore");
        kotlin.jvm.internal.j.e(processDataManager, "processDataManager");
        kotlin.jvm.internal.j.e(backgroundDispatcher, "backgroundDispatcher");
        this.f13314a = sessionsSettings;
        this.f13315b = sessionGenerator;
        this.f13316c = sessionFirelogPublisher;
        this.d = timeProvider;
        this.f13317e = sessionDataStore;
        this.f13318f = processDataManager;
        this.f13319g = backgroundDispatcher;
        a1 a1Var = a1.f13281a;
        this.f13322k = "";
        zd.b0.q(zd.b0.b(backgroundDispatcher), new z0(this, null, 0));
    }

    public static final java.lang.Object a(gb.d1 r4, java.lang.String r5, gb.a1 r6, id.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: gb.d1.a(gb.d1, java.lang.String, gb.a1, id.c):java.lang.Object");
    }

    public final void b() {
        this.f13320i = false;
        if (this.h == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.f13318f.a());
        zd.b0.q(zd.b0.b(this.f13319g), new z0(this, null, 1));
    }

    public final void c() {
        this.f13320i = true;
        j0 j0Var = this.h;
        if (j0Var == null) {
            this.f13321j = true;
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
        } else if (j0Var != null) {
            Log.d("FirebaseSessions", "App foregrounded on " + this.f13318f.a());
            if (!e(j0Var) && !d(j0Var)) {
                return;
            }
            zd.b0.q(zd.b0.b(this.f13319g), new be.l(this, j0Var, null, 5));
        } else {
            kotlin.jvm.internal.j.h("localSessionData");
            throw null;
        }
    }

    public final boolean d(j0 j0Var) {
        Map map = j0Var.f13370c;
        boolean z10 = true;
        d0 d0Var = this.f13318f;
        if (map != null) {
            d0Var.getClass();
            b0 b0Var = (b0) map.get(d0Var.a());
            if (b0Var != null && b0Var.f13286a == d0Var.f13311c && kotlin.jvm.internal.j.a(b0Var.f13287b, (String) d0Var.d.getValue())) {
                z10 = false;
            }
            if (z10) {
                Log.d("FirebaseSessions", "Process " + d0Var.a() + " is stale");
            }
            return z10;
        }
        Log.d("FirebaseSessions", "No process data for " + d0Var.a());
        return true;
    }

    public final boolean e(gb.j0 r12) {
        throw new UnsupportedOperationException("Method not decompiled: gb.d1.e(gb.j0):boolean");
    }
}
