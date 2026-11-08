package m5;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;
import n5.a0;
import n5.b0;
import n5.c;
import n5.c0;
import n5.d0;
import n5.e0;
import n5.f;
import n5.f0;
import n5.g;
import n5.h;
import n5.i;
import n5.i0;
import n5.j;
import n5.k;
import n5.l;
import n5.m;
import n5.o;
import n5.p;
import n5.q;
import n5.r;
import n5.s;
import n5.t;
import n5.v;
import n5.w;
import n5.y;
import org.telegram.ui.Components.n;
import p5.e;
import pa.d;
public final class b implements e {
    public final n f19876a;
    public final ConnectivityManager f19877b;
    public final Context f19878c;
    public final URL d;
    public final x5.a f19879e;
    public final x5.a f19880f;
    public final int f19881g;

    public b(Context context, x5.a aVar, x5.a aVar2) {
        d dVar = new d();
        c cVar = c.f20413a;
        dVar.b(w.class, cVar);
        dVar.b(m.class, cVar);
        j jVar = j.f20440a;
        dVar.b(f0.class, jVar);
        dVar.b(t.class, jVar);
        n5.d dVar2 = n5.d.f20415a;
        dVar.b(y.class, dVar2);
        dVar.b(n5.n.class, dVar2);
        n5.b bVar = n5.b.f20402a;
        dVar.b(n5.a.class, bVar);
        dVar.b(l.class, bVar);
        i iVar = i.f20432a;
        dVar.b(e0.class, iVar);
        dVar.b(s.class, iVar);
        n5.e eVar = n5.e.f20418a;
        dVar.b(a0.class, eVar);
        dVar.b(o.class, eVar);
        h hVar = h.f20428a;
        dVar.b(d0.class, hVar);
        dVar.b(r.class, hVar);
        g gVar = g.f20424a;
        dVar.b(c0.class, gVar);
        dVar.b(q.class, gVar);
        k kVar = k.f20448a;
        dVar.b(i0.class, kVar);
        dVar.b(v.class, kVar);
        f fVar = f.f20421a;
        dVar.b(b0.class, fVar);
        dVar.b(p.class, fVar);
        dVar.d = true;
        this.f19876a = new n(dVar);
        this.f19878c = context;
        this.f19877b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(a.f19871c);
        this.f19879e = aVar2;
        this.f19880f = aVar;
        this.f19881g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(rf.b.i("Invalid url: ", str), e10);
        }
    }

    public final o5.h a(o5.h r7) {
        throw new UnsupportedOperationException("Method not decompiled: m5.b.a(o5.h):o5.h");
    }
}
