package b3;

import a8.ia;
import a8.ra;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
public final class o implements p {
    public static final i d = new i(0, -9223372036854775807L, false);
    public static final i f2960e = new i(2, -9223372036854775807L, false);
    public static final i f2961f = new i(3, -9223372036854775807L, false);
    public final c3.a f2962a;
    public k f2963b;
    public IOException f2964c;

    public o(java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: b3.o.<init>(java.lang.String):void");
    }

    @Override
    public final void a() {
        IOException iOException = this.f2964c;
        if (iOException == null) {
            k kVar = this.f2963b;
            if (kVar != null) {
                int i7 = kVar.f2952a;
                IOException iOException2 = kVar.f2955e;
                if (iOException2 != null && kVar.f2956f > i7) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void b() {
        k kVar = this.f2963b;
        kVar.getClass();
        kVar.a(false);
    }

    public final boolean c() {
        if (this.f2964c != null) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f2963b != null) {
            return true;
        }
        return false;
    }

    public final void e(m mVar) {
        k kVar = this.f2963b;
        if (kVar != null) {
            kVar.a(true);
        }
        c3.a aVar = this.f2962a;
        if (mVar != null) {
            aVar.execute(new ra(mVar, 10));
        }
        aVar.f5259b.accept(aVar.f5258a);
    }

    public final void f(l lVar, j jVar, int i7) {
        boolean z9;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        this.f2964c = null;
        k kVar = new k(this, myLooper, lVar, jVar, i7, SystemClock.elapsedRealtime());
        if (this.f2963b == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.p(z9);
        this.f2963b = kVar;
        kVar.b();
    }

    public o(c3.a aVar) {
        this.f2962a = aVar;
    }
}
