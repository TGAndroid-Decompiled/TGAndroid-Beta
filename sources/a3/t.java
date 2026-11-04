package a3;

import android.net.Uri;
import g2.n0;
import i2.c0;
import java.io.IOException;
public final class t implements m {
    public final long f110a = w2.u.f57230g.getAndIncrement();
    public final i2.n f111b;
    public final int f112c;
    public final c0 d;
    public final s f113e;
    public volatile Object f114f;

    public t(i2.h hVar, i2.n nVar, int i3, s sVar) {
        this.d = new c0(hVar);
        this.f111b = nVar;
        this.f112c = i3;
        this.f113e = sVar;
    }

    @Override
    public final void a() {
        this.d.f14528b = 0L;
        i2.l lVar = new i2.l(this.d, this.f111b);
        try {
            lVar.a();
            Uri uri = this.d.f14527a.getUri();
            uri.getClass();
            this.f114f = this.f113e.L(uri, lVar);
            try {
                lVar.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = n0.f11873a;
            try {
                lVar.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override
    public final void X1() {
    }
}
