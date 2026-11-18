package b3;

import android.net.Uri;
import h2.l0;
import j2.b0;
import java.io.IOException;
public final class s implements m {
    public final long f2917a = x2.u.f60237g.getAndIncrement();
    public final j2.m f2918b;
    public final int f2919c;
    public final b0 d;
    public final r f2920e;
    public volatile Object f2921f;

    public s(j2.h hVar, j2.m mVar, int i7, r rVar) {
        this.d = new b0(hVar);
        this.f2918b = mVar;
        this.f2919c = i7;
        this.f2920e = rVar;
    }

    @Override
    public final void a() {
        this.d.f17152b = 0L;
        j2.k kVar = new j2.k(this.d, this.f2918b);
        try {
            kVar.a();
            Uri uri = this.d.f17151a.getUri();
            uri.getClass();
            this.f2921f = this.f2920e.t(uri, kVar);
            try {
                kVar.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = l0.f13783a;
            try {
                kVar.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override
    public final void A() {
    }
}
