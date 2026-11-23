package b3;

import android.net.Uri;
import h2.l0;
import j2.b0;
import java.io.IOException;
public final class s implements m {
    public final long f2888a = x2.u.f60365g.getAndIncrement();
    public final j2.m f2889b;
    public final int f2890c;
    public final b0 d;
    public final r f2891e;
    public volatile Object f2892f;

    public s(j2.h hVar, j2.m mVar, int i7, r rVar) {
        this.d = new b0(hVar);
        this.f2889b = mVar;
        this.f2890c = i7;
        this.f2891e = rVar;
    }

    @Override
    public final void a() {
        this.d.f17243b = 0L;
        j2.k kVar = new j2.k(this.d, this.f2889b);
        try {
            kVar.a();
            Uri uri = this.d.f17242a.getUri();
            uri.getClass();
            this.f2892f = this.f2891e.g(uri, kVar);
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
    public final void y() {
    }
}
