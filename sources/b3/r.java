package b3;

import android.net.Uri;
import h2.l0;
import j2.b0;
import java.io.IOException;
public final class r implements l {
    public final long f2919a = x2.t.f59664g.getAndIncrement();
    public final j2.m f2920b;
    public final int f2921c;
    public final b0 d;
    public final q f2922e;
    public volatile Object f2923f;

    public r(j2.h hVar, j2.m mVar, int i7, q qVar) {
        this.d = new b0(hVar);
        this.f2920b = mVar;
        this.f2921c = i7;
        this.f2922e = qVar;
    }

    @Override
    public final void a() {
        this.d.f16770b = 0L;
        j2.k kVar = new j2.k(this.d, this.f2920b);
        try {
            kVar.a();
            Uri uri = this.d.f16769a.getUri();
            uri.getClass();
            this.f2923f = this.f2922e.l(uri, kVar);
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
