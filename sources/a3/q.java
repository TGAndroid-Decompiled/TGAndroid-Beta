package a3;

import android.os.Looper;
import android.os.SystemClock;
import b8.zb;
import java.io.IOException;
public final class q implements r {
    public static final i d = new i(0, -9223372036854775807L, false);
    public static final i f105e = new i(2, -9223372036854775807L, false);
    public static final i f106f = new i(3, -9223372036854775807L, false);
    public final b3.a f107a;
    public l f108b;
    public IOException f109c;

    public q(java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: a3.q.<init>(java.lang.String):void");
    }

    @Override
    public final void a() {
        IOException iOException = this.f109c;
        if (iOException == null) {
            l lVar = this.f108b;
            if (lVar != null) {
                int i3 = lVar.f95a;
                IOException iOException2 = lVar.f98e;
                if (iOException2 != null && lVar.f99f > i3) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void b() {
        l lVar = this.f108b;
        lVar.getClass();
        lVar.a(false);
    }

    public final boolean c() {
        if (this.f109c != null) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f108b != null) {
            return true;
        }
        return false;
    }

    public final void e(n nVar) {
        l lVar = this.f108b;
        if (lVar != null) {
            lVar.a(true);
        }
        b3.a aVar = this.f107a;
        if (nVar != null) {
            aVar.execute(new o(nVar, 0));
        }
        aVar.f2344b.accept(aVar.f2343a);
    }

    public final void f(m mVar, k kVar, int i3) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        this.f109c = null;
        l lVar = new l(this, myLooper, mVar, kVar, i3, SystemClock.elapsedRealtime());
        if (this.f108b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.p(z10);
        this.f108b = lVar;
        lVar.b();
    }

    public q(b3.a aVar) {
        this.f107a = aVar;
    }
}
