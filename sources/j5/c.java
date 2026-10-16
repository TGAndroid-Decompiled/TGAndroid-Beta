package j5;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;
import ji.w4;
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
import la.d;
import m5.e;
public final class c implements e {
    public final w4 f12847a;
    public final ConnectivityManager f12848b;
    public final Context f12849c;
    public final URL d;
    public final u5.a e;
    public final u5.a f12850f;
    public final int f12851g;

    public c(Context context, u5.a aVar, u5.a aVar2) {
        d dVar = new d();
        k5.c cVar = k5.c.f14112a;
        dVar.a(o.class, cVar);
        dVar.a(i.class, cVar);
        f fVar = f.f14122a;
        dVar.a(s.class, fVar);
        dVar.a(l.class, fVar);
        k5.d dVar2 = k5.d.f14114a;
        dVar.a(q.class, dVar2);
        dVar.a(j.class, dVar2);
        k5.b bVar = k5.b.f14102a;
        dVar.a(k5.a.class, bVar);
        dVar.a(h.class, bVar);
        k5.e eVar = k5.e.f14117a;
        dVar.a(r.class, eVar);
        dVar.a(k.class, eVar);
        g gVar = g.f14127a;
        dVar.a(v.class, gVar);
        dVar.a(n.class, gVar);
        dVar.d = true;
        this.f12847a = new w4(dVar, 4);
        this.f12849c = context;
        this.f12848b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(a.f12840c);
        this.e = aVar2;
        this.f12850f = aVar;
        this.f12851g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(t8.b.h("Invalid url: ", str), e);
        }
    }

    public final l5.h a(l5.h r7) {
        throw new UnsupportedOperationException("Method not decompiled: j5.c.a(l5.h):l5.h");
    }
}
