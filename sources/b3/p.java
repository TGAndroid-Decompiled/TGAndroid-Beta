package b3;

import a8.ma;
import a8.sa;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
public final class p implements q {
    public static final i d = new i(0, -9223372036854775807L, false);
    public static final i f2882e = new i(2, -9223372036854775807L, false);
    public static final i f2883f = new i(3, -9223372036854775807L, false);
    public final c3.a f2884a;
    public l f2885b;
    public IOException f2886c;

    public p(java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: b3.p.<init>(java.lang.String):void");
    }

    @Override
    public final void a() {
        IOException iOException = this.f2886c;
        if (iOException == null) {
            l lVar = this.f2885b;
            if (lVar != null) {
                int i7 = lVar.f2874a;
                IOException iOException2 = lVar.f2877e;
                if (iOException2 != null && lVar.f2878f > i7) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void b() {
        l lVar = this.f2885b;
        lVar.getClass();
        lVar.a(false);
    }

    public final boolean c() {
        if (this.f2886c != null) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f2885b != null) {
            return true;
        }
        return false;
    }

    public final void e(n nVar) {
        l lVar = this.f2885b;
        if (lVar != null) {
            lVar.a(true);
        }
        c3.a aVar = this.f2884a;
        if (nVar != null) {
            aVar.execute(new sa(nVar, 12));
        }
        aVar.f4359b.accept(aVar.f4358a);
    }

    public final void f(m mVar, k kVar, int i7) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        this.f2886c = null;
        l lVar = new l(this, myLooper, mVar, kVar, i7, SystemClock.elapsedRealtime());
        if (this.f2885b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.p(z10);
        this.f2885b = lVar;
        lVar.b();
    }

    public p(c3.a aVar) {
        this.f2884a = aVar;
    }
}
