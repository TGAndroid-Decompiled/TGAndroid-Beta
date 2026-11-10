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
import org.telegram.ui.Components.m;
import p5.e;
import pa.d;
public final class b implements e {
    public final m f19881a;
    public final ConnectivityManager f19882b;
    public final Context f19883c;
    public final URL d;
    public final x5.a f19884e;
    public final x5.a f19885f;
    public final int f19886g;

    public b(Context context, x5.a aVar, x5.a aVar2) {
        d dVar = new d();
        c cVar = c.f20418a;
        dVar.b(w.class, cVar);
        dVar.b(n5.m.class, cVar);
        j jVar = j.f20445a;
        dVar.b(f0.class, jVar);
        dVar.b(t.class, jVar);
        n5.d dVar2 = n5.d.f20420a;
        dVar.b(y.class, dVar2);
        dVar.b(n.class, dVar2);
        n5.b bVar = n5.b.f20407a;
        dVar.b(n5.a.class, bVar);
        dVar.b(l.class, bVar);
        i iVar = i.f20437a;
        dVar.b(e0.class, iVar);
        dVar.b(s.class, iVar);
        n5.e eVar = n5.e.f20423a;
        dVar.b(a0.class, eVar);
        dVar.b(o.class, eVar);
        h hVar = h.f20433a;
        dVar.b(d0.class, hVar);
        dVar.b(r.class, hVar);
        g gVar = g.f20429a;
        dVar.b(c0.class, gVar);
        dVar.b(q.class, gVar);
        k kVar = k.f20453a;
        dVar.b(i0.class, kVar);
        dVar.b(v.class, kVar);
        f fVar = f.f20426a;
        dVar.b(b0.class, fVar);
        dVar.b(p.class, fVar);
        dVar.d = true;
        this.f19881a = new m(dVar);
        this.f19883c = context;
        this.f19882b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(a.f19876c);
        this.f19884e = aVar2;
        this.f19885f = aVar;
        this.f19886g = 130000;
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
