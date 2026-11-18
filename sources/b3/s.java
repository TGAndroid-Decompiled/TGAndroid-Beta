package b3;

import android.net.Uri;
import h2.l0;
import j2.b0;
import java.io.IOException;
public final class s implements m {
    public final long f2916a = x2.u.f60236g.getAndIncrement();
    public final j2.m f2917b;
    public final int f2918c;
    public final b0 d;
    public final r f2919e;
    public volatile Object f2920f;

    public s(j2.h hVar, j2.m mVar, int i7, r rVar) {
        this.d = new b0(hVar);
        this.f2917b = mVar;
        this.f2918c = i7;
        this.f2919e = rVar;
    }

    @Override
    public final void a() {
        this.d.f17155b = 0L;
        j2.k kVar = new j2.k(this.d, this.f2917b);
        try {
            kVar.a();
            Uri uri = this.d.f17154a.getUri();
            uri.getClass();
            this.f2920f = this.f2919e.t(uri, kVar);
            try {
                kVar.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = l0.f13786a;
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
