package b3;

import android.net.Uri;
import h2.l0;
import j2.b0;
import java.io.IOException;
public final class s implements m {
    public final long f2887a = x2.u.f60247g.getAndIncrement();
    public final j2.m f2888b;
    public final int f2889c;
    public final b0 d;
    public final r f2890e;
    public volatile Object f2891f;

    public s(j2.h hVar, j2.m mVar, int i7, r rVar) {
        this.d = new b0(hVar);
        this.f2888b = mVar;
        this.f2889c = i7;
        this.f2890e = rVar;
    }

    @Override
    public final void a() {
        this.d.f17146b = 0L;
        j2.k kVar = new j2.k(this.d, this.f2888b);
        try {
            kVar.a();
            Uri uri = this.d.f17145a.getUri();
            uri.getClass();
            this.f2891f = this.f2890e.t(uri, kVar);
            try {
                kVar.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = l0.f13778a;
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
