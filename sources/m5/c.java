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
import org.telegram.ui.ActionBar.i5;
import p5.f;
import pa.d;
public final class c implements f {
    public final i5 f20927a;
    public final ConnectivityManager f20928b;
    public final Context f20929c;
    public final URL d;
    public final x5.a f20930e;
    public final x5.a f20931f;
    public final int f20932g;

    public c(Context context, x5.a aVar, x5.a aVar2) {
        d dVar = new d();
        n5.c cVar = n5.c.f21439a;
        dVar.c(w.class, cVar);
        dVar.c(m.class, cVar);
        j jVar = j.f21466a;
        dVar.c(f0.class, jVar);
        dVar.c(t.class, jVar);
        n5.d dVar2 = n5.d.f21441a;
        dVar.c(y.class, dVar2);
        dVar.c(n.class, dVar2);
        n5.b bVar = n5.b.f21428a;
        dVar.c(n5.a.class, bVar);
        dVar.c(l.class, bVar);
        i iVar = i.f21458a;
        dVar.c(e0.class, iVar);
        dVar.c(s.class, iVar);
        e eVar = e.f21444a;
        dVar.c(a0.class, eVar);
        dVar.c(o.class, eVar);
        h hVar = h.f21454a;
        dVar.c(d0.class, hVar);
        dVar.c(r.class, hVar);
        g gVar = g.f21450a;
        dVar.c(c0.class, gVar);
        dVar.c(q.class, gVar);
        k kVar = k.f21474a;
        dVar.c(i0.class, kVar);
        dVar.c(v.class, kVar);
        n5.f fVar = n5.f.f21447a;
        dVar.c(b0.class, fVar);
        dVar.c(p.class, fVar);
        dVar.d = true;
        this.f20927a = new i5(dVar);
        this.f20929c = context;
        this.f20928b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(a.f20919c);
        this.f20930e = aVar2;
        this.f20931f = aVar;
        this.f20932g = 130000;
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
