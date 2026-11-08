package b3;

import android.net.Uri;
import h2.m0;
import j2.c0;
import java.io.IOException;
import x2.u;
public final class r implements l {
    public final long f2965a = u.f58476g.getAndIncrement();
    public final j2.m f2966b;
    public final int f2967c;
    public final c0 d;
    public final q f2968e;
    public volatile Object f2969f;

    public r(j2.h hVar, j2.m mVar, int i7, q qVar) {
        this.d = new c0(hVar);
        this.f2966b = mVar;
        this.f2967c = i7;
        this.f2968e = qVar;
    }

    @Override
    public final void a() {
        this.d.f16416b = 0L;
        j2.k kVar = new j2.k(this.d, this.f2966b);
        try {
            kVar.a();
            Uri uri = this.d.f16415a.getUri();
            uri.getClass();
            this.f2969f = this.f2968e.L1(uri, kVar);
            try {
                kVar.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = m0.f14112a;
            try {
                kVar.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override
    public final void q0() {
    }
}
