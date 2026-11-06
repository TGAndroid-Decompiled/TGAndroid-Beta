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
    public final n f19873a;
    public final ConnectivityManager f19874b;
    public final Context f19875c;
    public final URL d;
    public final x5.a f19876e;
    public final x5.a f19877f;
    public final int f19878g;

    public b(Context context, x5.a aVar, x5.a aVar2) {
        d dVar = new d();
        c cVar = c.f20410a;
        dVar.b(w.class, cVar);
        dVar.b(m.class, cVar);
        j jVar = j.f20437a;
        dVar.b(f0.class, jVar);
        dVar.b(t.class, jVar);
        n5.d dVar2 = n5.d.f20412a;
        dVar.b(y.class, dVar2);
        dVar.b(n5.n.class, dVar2);
        n5.b bVar = n5.b.f20399a;
        dVar.b(n5.a.class, bVar);
        dVar.b(l.class, bVar);
        i iVar = i.f20429a;
        dVar.b(e0.class, iVar);
        dVar.b(s.class, iVar);
        n5.e eVar = n5.e.f20415a;
        dVar.b(a0.class, eVar);
        dVar.b(o.class, eVar);
        h hVar = h.f20425a;
        dVar.b(d0.class, hVar);
        dVar.b(r.class, hVar);
        g gVar = g.f20421a;
        dVar.b(c0.class, gVar);
        dVar.b(q.class, gVar);
        k kVar = k.f20445a;
        dVar.b(i0.class, kVar);
        dVar.b(v.class, kVar);
        f fVar = f.f20418a;
        dVar.b(b0.class, fVar);
        dVar.b(p.class, fVar);
        dVar.d = true;
        this.f19873a = new n(dVar);
        this.f19875c = context;
        this.f19874b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(a.f19868c);
        this.f19876e = aVar2;
        this.f19877f = aVar;
        this.f19878g = 130000;
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
