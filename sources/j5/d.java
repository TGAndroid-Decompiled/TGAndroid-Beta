package j5;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;
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
import ki.t1;
import m5.e;
public final class d implements e {
    public final t1 f14261a;
    public final ConnectivityManager f14262b;
    public final Context f14263c;
    public final URL d;
    public final u5.a e;
    public final u5.a f14264f;
    public final int f14265g;

    public d(Context context, u5.a aVar, u5.a aVar2) {
        la.d dVar = new la.d();
        k5.c cVar = k5.c.f14915a;
        dVar.a(o.class, cVar);
        dVar.a(i.class, cVar);
        f fVar = f.f14925a;
        dVar.a(s.class, fVar);
        dVar.a(l.class, fVar);
        k5.d dVar2 = k5.d.f14917a;
        dVar.a(q.class, dVar2);
        dVar.a(j.class, dVar2);
        k5.b bVar = k5.b.f14905a;
        dVar.a(k5.a.class, bVar);
        dVar.a(h.class, bVar);
        k5.e eVar = k5.e.f14920a;
        dVar.a(r.class, eVar);
        dVar.a(k.class, eVar);
        g gVar = g.f14930a;
        dVar.a(v.class, gVar);
        dVar.a(n.class, gVar);
        dVar.d = true;
        this.f14261a = new t1(dVar, 4);
        this.f14263c = context;
        this.f14262b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(a.f14252c);
        this.e = aVar2;
        this.f14264f = aVar;
        this.f14265g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(r4.c.h("Invalid url: ", str), e);
        }
    }

    public final l5.h a(l5.h r7) {
        throw new UnsupportedOperationException("Method not decompiled: j5.d.a(l5.h):l5.h");
    }
}
