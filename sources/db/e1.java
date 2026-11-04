package db;

import android.util.Log;
import java.util.Map;
public final class e1 {
    public final gb.l f8644a;
    public final u0 f8645b;
    public final q0 f8646c;
    public final i1 d;
    public final l1.g f8647e;
    public final c0 f8648f;
    public final fd.h f8649g;
    public j0 h;
    public boolean f8650i;
    public boolean f8651j;
    public String f8652k;

    public e1(gb.l sessionsSettings, u0 sessionGenerator, q0 sessionFirelogPublisher, i1 timeProvider, l1.g sessionDataStore, c0 processDataManager, fd.h backgroundDispatcher) {
        kotlin.jvm.internal.j.e(sessionsSettings, "sessionsSettings");
        kotlin.jvm.internal.j.e(sessionGenerator, "sessionGenerator");
        kotlin.jvm.internal.j.e(sessionFirelogPublisher, "sessionFirelogPublisher");
        kotlin.jvm.internal.j.e(timeProvider, "timeProvider");
        kotlin.jvm.internal.j.e(sessionDataStore, "sessionDataStore");
        kotlin.jvm.internal.j.e(processDataManager, "processDataManager");
        kotlin.jvm.internal.j.e(backgroundDispatcher, "backgroundDispatcher");
        this.f8644a = sessionsSettings;
        this.f8645b = sessionGenerator;
        this.f8646c = sessionFirelogPublisher;
        this.d = timeProvider;
        this.f8647e = sessionDataStore;
        this.f8648f = processDataManager;
        this.f8649g = backgroundDispatcher;
        b1 b1Var = b1.f8608a;
        this.f8652k = "";
        wd.b0.q(wd.b0.b(backgroundDispatcher), new a1(this, null, 0));
    }

    public static final java.lang.Object a(db.e1 r4, java.lang.String r5, db.b1 r6, fd.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: db.e1.a(db.e1, java.lang.String, db.b1, fd.c):java.lang.Object");
    }

    public final void b() {
        this.f8650i = false;
        if (this.h == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.f8648f.a());
        wd.b0.q(wd.b0.b(this.f8649g), new a1(this, null, 1));
    }

    public final void c() {
        this.f8650i = true;
        j0 j0Var = this.h;
        if (j0Var == null) {
            this.f8651j = true;
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
        } else if (j0Var != null) {
            Log.d("FirebaseSessions", "App foregrounded on " + this.f8648f.a());
            if (!e(j0Var) && !d(j0Var)) {
                return;
            }
            wd.b0.q(wd.b0.b(this.f8649g), new ae.d(this, j0Var, null, 4));
        } else {
            kotlin.jvm.internal.j.h("localSessionData");
            throw null;
        }
    }

    public final boolean d(j0 j0Var) {
        Map map = j0Var.f8693c;
        boolean z10 = true;
        c0 c0Var = this.f8648f;
        if (map != null) {
            c0Var.getClass();
            a0 a0Var = (a0) map.get(c0Var.a());
            if (a0Var != null && a0Var.f8599a == c0Var.f8619c && kotlin.jvm.internal.j.a(a0Var.f8600b, (String) c0Var.d.getValue())) {
                z10 = false;
            }
            if (z10) {
                Log.d("FirebaseSessions", "Process " + c0Var.a() + " is stale");
            }
            return z10;
        }
        Log.d("FirebaseSessions", "No process data for " + c0Var.a());
        return true;
    }

    public final boolean e(db.j0 r12) {
        throw new UnsupportedOperationException("Method not decompiled: db.e1.e(db.j0):boolean");
    }
}
