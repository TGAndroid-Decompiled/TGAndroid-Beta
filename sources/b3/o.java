package b3;

import a8.ja;
import a8.sa;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
public final class o implements p {
    public static final i d = new i(0, -9223372036854775807L, false);
    public static final i f2914e = new i(2, -9223372036854775807L, false);
    public static final i f2915f = new i(3, -9223372036854775807L, false);
    public final c3.a f2916a;
    public k f2917b;
    public IOException f2918c;

    public o(java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: b3.o.<init>(java.lang.String):void");
    }

    @Override
    public final void a() {
        IOException iOException = this.f2918c;
        if (iOException == null) {
            k kVar = this.f2917b;
            if (kVar != null) {
                int i7 = kVar.f2906a;
                IOException iOException2 = kVar.f2909e;
                if (iOException2 != null && kVar.f2910f > i7) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void b() {
        k kVar = this.f2917b;
        kVar.getClass();
        kVar.a(false);
    }

    public final boolean c() {
        if (this.f2918c != null) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f2917b != null) {
            return true;
        }
        return false;
    }

    public final void e(m mVar) {
        k kVar = this.f2917b;
        if (kVar != null) {
            kVar.a(true);
        }
        c3.a aVar = this.f2916a;
        if (mVar != null) {
            aVar.execute(new sa(mVar, 12));
        }
        aVar.f4083b.accept(aVar.f4082a);
    }

    public final void f(l lVar, j jVar, int i7) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        this.f2918c = null;
        k kVar = new k(this, myLooper, lVar, jVar, i7, SystemClock.elapsedRealtime());
        if (this.f2917b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.p(z10);
        this.f2917b = kVar;
        kVar.b();
    }

    public o(c3.a aVar) {
        this.f2916a = aVar;
    }
}
