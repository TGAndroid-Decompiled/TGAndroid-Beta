package b3;

import android.net.Uri;
import h2.l0;
import j2.b0;
import java.io.IOException;
public final class r implements l {
    public final long f2922a = x2.t.f59664g.getAndIncrement();
    public final j2.m f2923b;
    public final int f2924c;
    public final b0 d;
    public final q f2925e;
    public volatile Object f2926f;

    public r(j2.h hVar, j2.m mVar, int i7, q qVar) {
        this.d = new b0(hVar);
        this.f2923b = mVar;
        this.f2924c = i7;
        this.f2925e = qVar;
    }

    @Override
    public final void a() {
        this.d.f16770b = 0L;
        j2.k kVar = new j2.k(this.d, this.f2923b);
        try {
            kVar.a();
            Uri uri = this.d.f16769a.getUri();
            uri.getClass();
            this.f2926f = this.f2925e.l(uri, kVar);
            try {
                kVar.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = l0.f13471a;
            try {
                kVar.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override
    public final void D() {
    }
}
