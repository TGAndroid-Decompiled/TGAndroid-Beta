package j5;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;
import ji.u4;
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
import org.telegram.ui.Cells.p6;
public final class c implements e {
    public final u4 f13541a;
    public final ConnectivityManager f13542b;
    public final Context f13543c;
    public final URL d;
    public final u5.a f13544e;
    public final u5.a f13545f;
    public final int f13546g;

    public c(Context context, u5.a aVar, u5.a aVar2) {
        d dVar = new d();
        k5.c cVar = k5.c.f14776a;
        dVar.j(o.class, cVar);
        dVar.j(i.class, cVar);
        f fVar = f.f14787a;
        dVar.j(s.class, fVar);
        dVar.j(l.class, fVar);
        k5.d dVar2 = k5.d.f14778a;
        dVar.j(q.class, dVar2);
        dVar.j(j.class, dVar2);
        k5.b bVar = k5.b.f14765a;
        dVar.j(k5.a.class, bVar);
        dVar.j(h.class, bVar);
        k5.e eVar = k5.e.f14781a;
        dVar.j(r.class, eVar);
        dVar.j(k.class, eVar);
        g gVar = g.f14793a;
        dVar.j(v.class, gVar);
        dVar.j(n.class, gVar);
        dVar.d = true;
        this.f13541a = new u4(dVar, 2);
        this.f13543c = context;
        this.f13542b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(a.f13533c);
        this.f13544e = aVar2;
        this.f13545f = aVar;
        this.f13546g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e7) {
            throw new IllegalArgumentException(p6.i("Invalid url: ", str), e7);
        }
    }

    public final l5.h a(l5.h r7) {
        throw new UnsupportedOperationException("Method not decompiled: j5.c.a(l5.h):l5.h");
    }
}
