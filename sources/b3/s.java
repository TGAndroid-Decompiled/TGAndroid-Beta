package b3;

import android.net.Uri;
import h2.l0;
import j2.b0;
import java.io.IOException;
public final class s implements m {
    public final long f2929a = x2.u.f60278g.getAndIncrement();
    public final j2.m f2930b;
    public final int f2931c;
    public final b0 d;
    public final r f2932e;
    public volatile Object f2933f;

    public s(j2.h hVar, j2.m mVar, int i7, r rVar) {
        this.d = new b0(hVar);
        this.f2930b = mVar;
        this.f2931c = i7;
        this.f2932e = rVar;
    }

    @Override
    public final void a() {
        this.d.f17177b = 0L;
        j2.k kVar = new j2.k(this.d, this.f2930b);
        try {
            kVar.a();
            Uri uri = this.d.f17176a.getUri();
            uri.getClass();
            this.f2933f = this.f2932e.t(uri, kVar);
            try {
                kVar.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = l0.f13812a;
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
