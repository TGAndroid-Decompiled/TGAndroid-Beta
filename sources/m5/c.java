package m5;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;
import n5.a0;
import n5.b0;
import n5.c0;
import n5.d0;
import n5.e;
import n5.e0;
import n5.f0;
import n5.g;
import n5.h;
import n5.i;
import n5.i0;
import n5.j;
import n5.k;
import n5.l;
import n5.m;
import n5.n;
import n5.o;
import n5.p;
import n5.q;
import n5.r;
import n5.s;
import n5.t;
import n5.v;
import n5.w;
import n5.y;
import org.telegram.ui.Cells.b5;
import p5.f;
import pa.d;
public final class c implements f {
    public final b5 f20837a;
    public final ConnectivityManager f20838b;
    public final Context f20839c;
    public final URL d;
    public final x5.a f20840e;
    public final x5.a f20841f;
    public final int f20842g;

    public c(Context context, x5.a aVar, x5.a aVar2) {
        d dVar = new d();
        n5.c cVar = n5.c.f21346a;
        dVar.b(w.class, cVar);
        dVar.b(m.class, cVar);
        j jVar = j.f21373a;
        dVar.b(f0.class, jVar);
        dVar.b(t.class, jVar);
        n5.d dVar2 = n5.d.f21348a;
        dVar.b(y.class, dVar2);
        dVar.b(n.class, dVar2);
        n5.b bVar = n5.b.f21335a;
        dVar.b(n5.a.class, bVar);
        dVar.b(l.class, bVar);
        i iVar = i.f21365a;
        dVar.b(e0.class, iVar);
        dVar.b(s.class, iVar);
        e eVar = e.f21351a;
        dVar.b(a0.class, eVar);
        dVar.b(o.class, eVar);
        h hVar = h.f21361a;
        dVar.b(d0.class, hVar);
        dVar.b(r.class, hVar);
        g gVar = g.f21357a;
        dVar.b(c0.class, gVar);
        dVar.b(q.class, gVar);
        k kVar = k.f21381a;
        dVar.b(i0.class, kVar);
        dVar.b(v.class, kVar);
        n5.f fVar = n5.f.f21354a;
        dVar.b(b0.class, fVar);
        dVar.b(p.class, fVar);
        dVar.d = true;
        this.f20837a = new b5(dVar);
        this.f20839c = context;
        this.f20838b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(a.f20829c);
        this.f20840e = aVar2;
        this.f20841f = aVar;
        this.f20842g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(p5.c.k("Invalid url: ", str), e10);
        }
    }

    public final o5.h a(o5.h r7) {
        throw new UnsupportedOperationException("Method not decompiled: m5.c.a(o5.h):o5.h");
    }
}
