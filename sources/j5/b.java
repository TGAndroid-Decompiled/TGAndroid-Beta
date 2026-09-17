package j5;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;
import k5.d;
import k5.f;
import k5.g;
import k5.h;
import k5.i;
import k5.j;
import k5.k;
import k5.l;
import k5.n;
import k5.o;
import k5.q;
import k5.r;
import k5.s;
import k5.v;
import ka.c;
import m5.e;
import org.telegram.ui.Cells.p6;
public final class b implements e {
    public final c f12881a;
    public final ConnectivityManager f12882b;
    public final Context f12883c;
    public final URL d;
    public final u5.a e;
    public final u5.a f12884f;
    public final int f12885g;

    public b(Context context, u5.a aVar, u5.a aVar2) {
        ka.e eVar = new ka.e();
        k5.c cVar = k5.c.f13452a;
        eVar.m(o.class, cVar);
        eVar.m(i.class, cVar);
        f fVar = f.f13462a;
        eVar.m(s.class, fVar);
        eVar.m(l.class, fVar);
        d dVar = d.f13454a;
        eVar.m(q.class, dVar);
        eVar.m(j.class, dVar);
        k5.b bVar = k5.b.f13442a;
        eVar.m(k5.a.class, bVar);
        eVar.m(h.class, bVar);
        k5.e eVar2 = k5.e.f13457a;
        eVar.m(r.class, eVar2);
        eVar.m(k.class, eVar2);
        g gVar = g.f13467a;
        eVar.m(v.class, gVar);
        eVar.m(n.class, gVar);
        eVar.d = true;
        this.f12881a = new c(eVar, 0);
        this.f12883c = context;
        this.f12882b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(a.f12877c);
        this.e = aVar2;
        this.f12884f = aVar;
        this.f12885g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(p6.i("Invalid url: ", str), e);
        }
    }

    public final l5.h a(l5.h r7) {
        throw new UnsupportedOperationException("Method not decompiled: j5.b.a(l5.h):l5.h");
    }
}
