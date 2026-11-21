package gb;

import android.util.Log;
import java.util.Map;
public final class d1 {
    public final jb.l f13348a;
    public final u0 f13349b;
    public final q0 f13350c;
    public final h1 d;
    public final m1.g f13351e;
    public final d0 f13352f;
    public final id.h f13353g;
    public j0 h;
    public boolean f13354i;
    public boolean f13355j;
    public String f13356k;

    public d1(jb.l sessionsSettings, u0 sessionGenerator, q0 sessionFirelogPublisher, h1 timeProvider, m1.g sessionDataStore, d0 processDataManager, id.h backgroundDispatcher) {
        kotlin.jvm.internal.j.e(sessionsSettings, "sessionsSettings");
        kotlin.jvm.internal.j.e(sessionGenerator, "sessionGenerator");
        kotlin.jvm.internal.j.e(sessionFirelogPublisher, "sessionFirelogPublisher");
        kotlin.jvm.internal.j.e(timeProvider, "timeProvider");
        kotlin.jvm.internal.j.e(sessionDataStore, "sessionDataStore");
        kotlin.jvm.internal.j.e(processDataManager, "processDataManager");
        kotlin.jvm.internal.j.e(backgroundDispatcher, "backgroundDispatcher");
        this.f13348a = sessionsSettings;
        this.f13349b = sessionGenerator;
        this.f13350c = sessionFirelogPublisher;
        this.d = timeProvider;
        this.f13351e = sessionDataStore;
        this.f13352f = processDataManager;
        this.f13353g = backgroundDispatcher;
        a1 a1Var = a1.f13315a;
        this.f13356k = "";
        zd.b0.q(zd.b0.b(backgroundDispatcher), new z0(this, null, 0));
    }

    public static final java.lang.Object a(gb.d1 r4, java.lang.String r5, gb.a1 r6, id.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: gb.d1.a(gb.d1, java.lang.String, gb.a1, id.c):java.lang.Object");
    }

    public final void b() {
        this.f13354i = false;
        if (this.h == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.f13352f.a());
        zd.b0.q(zd.b0.b(this.f13353g), new z0(this, null, 1));
    }

    public final void c() {
        this.f13354i = true;
        j0 j0Var = this.h;
        if (j0Var == null) {
            this.f13355j = true;
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
        } else if (j0Var != null) {
            Log.d("FirebaseSessions", "App foregrounded on " + this.f13352f.a());
            if (!e(j0Var) && !d(j0Var)) {
                return;
            }
            zd.b0.q(zd.b0.b(this.f13353g), new be.l(this, j0Var, null, 5));
        } else {
            kotlin.jvm.internal.j.h("localSessionData");
            throw null;
        }
    }

    public final boolean d(j0 j0Var) {
        Map map = j0Var.f13404c;
        boolean z10 = true;
        d0 d0Var = this.f13352f;
        if (map != null) {
            d0Var.getClass();
            b0 b0Var = (b0) map.get(d0Var.a());
            if (b0Var != null && b0Var.f13320a == d0Var.f13345c && kotlin.jvm.internal.j.a(b0Var.f13321b, (String) d0Var.d.getValue())) {
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
