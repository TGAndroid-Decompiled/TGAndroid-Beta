package j5;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;
import k5.c;
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
import ka.d;
import m5.e;
public final class b implements e {
    public final k2.e f13988a;
    public final ConnectivityManager f13989b;
    public final Context f13990c;
    public final URL d;
    public final u5.a f13991e;
    public final u5.a f13992f;
    public final int f13993g;

    public b(Context context, u5.a aVar, u5.a aVar2) {
        d dVar = new d();
        c cVar = c.f14608a;
        dVar.a(o.class, cVar);
        dVar.a(i.class, cVar);
        f fVar = f.f14619a;
        dVar.a(s.class, fVar);
        dVar.a(l.class, fVar);
        k5.d dVar2 = k5.d.f14610a;
        dVar.a(q.class, dVar2);
        dVar.a(j.class, dVar2);
        k5.b bVar = k5.b.f14597a;
        dVar.a(k5.a.class, bVar);
        dVar.a(h.class, bVar);
        k5.e eVar = k5.e.f14613a;
        dVar.a(r.class, eVar);
        dVar.a(k.class, eVar);
        g gVar = g.f14625a;
        dVar.a(v.class, gVar);
        dVar.a(n.class, gVar);
        dVar.d = true;
        this.f13988a = new k2.e(dVar, 1);
        this.f13990c = context;
        this.f13989b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(a.f13983c);
        this.f13991e = aVar2;
        this.f13992f = aVar;
        this.f13993g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e7) {
            throw new IllegalArgumentException(t8.b.i("Invalid url: ", str), e7);
        }
    }

    public final l5.h a(l5.h r7) {
        throw new UnsupportedOperationException("Method not decompiled: j5.b.a(l5.h):l5.h");
    }
}
