package k5;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;
import l5.f;
import l5.g;
import l5.h;
import l5.i;
import l5.j;
import l5.k;
import l5.l;
import l5.n;
import l5.o;
import l5.q;
import l5.r;
import l5.s;
import l5.v;
import li.h5;
import ma.d;
import n5.e;
import org.telegram.ui.Components.b10;
public final class c implements e {
    public final h5 f16390a;
    public final ConnectivityManager f16391b;
    public final Context f16392c;
    public final URL d;
    public final v5.a e;
    public final v5.a f16393f;
    public final int f16394g;

    public c(Context context, v5.a aVar, v5.a aVar2) {
        d dVar = new d();
        l5.c cVar = l5.c.f16871a;
        dVar.d(o.class, cVar);
        dVar.d(i.class, cVar);
        f fVar = f.f16881a;
        dVar.d(s.class, fVar);
        dVar.d(l.class, fVar);
        l5.d dVar2 = l5.d.f16873a;
        dVar.d(q.class, dVar2);
        dVar.d(j.class, dVar2);
        l5.b bVar = l5.b.f16861a;
        dVar.d(l5.a.class, bVar);
        dVar.d(h.class, bVar);
        l5.e eVar = l5.e.f16876a;
        dVar.d(r.class, eVar);
        dVar.d(k.class, eVar);
        g gVar = g.f16886a;
        dVar.d(v.class, gVar);
        dVar.d(n.class, gVar);
        dVar.d = true;
        this.f16390a = new h5(dVar);
        this.f16392c = context;
        this.f16391b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(a.f16383c);
        this.e = aVar2;
        this.f16393f = aVar;
        this.f16394g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(b10.j("Invalid url: ", str), e);
        }
    }

    public final m5.h a(m5.h r7) {
        throw new UnsupportedOperationException("Method not decompiled: k5.c.a(m5.h):m5.h");
    }
}
