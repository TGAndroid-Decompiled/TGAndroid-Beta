package b3;

import android.net.Uri;
import h2.l0;
import j2.b0;
import java.io.IOException;
public final class s implements m {
    public final long f2936a = x2.u.f60282g.getAndIncrement();
    public final j2.m f2937b;
    public final int f2938c;
    public final b0 d;
    public final r f2939e;
    public volatile Object f2940f;

    public s(j2.h hVar, j2.m mVar, int i7, r rVar) {
        this.d = new b0(hVar);
        this.f2937b = mVar;
        this.f2938c = i7;
        this.f2939e = rVar;
    }

    @Override
    public final void a() {
        this.d.f17180b = 0L;
        j2.k kVar = new j2.k(this.d, this.f2937b);
        try {
            kVar.a();
            Uri uri = this.d.f17179a.getUri();
            uri.getClass();
            this.f2940f = this.f2939e.t(uri, kVar);
            try {
                kVar.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = l0.f13815a;
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
