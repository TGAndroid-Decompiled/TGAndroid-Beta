package db;

import android.support.v4.media.session.a0;
import java.io.Serializable;
import java.util.Map;
import ld.p;
import org.json.JSONObject;
import td.c0;
public final class b extends ed.j implements p {
    public final int f5833a = 1;
    public int f5834b;
    public Object f5835c;
    public Object d;
    public Serializable e;
    public final Object f5836f;

    public b(a0 a0Var, Map map, b bVar, c cVar, cd.c cVar2) {
        super(2, cVar2);
        this.d = a0Var;
        this.f5835c = map;
        this.e = bVar;
        this.f5836f = cVar;
    }

    @Override
    public final cd.c create(Object obj, cd.c cVar) {
        switch (this.f5833a) {
            case 0:
                b bVar = new b((d) this.f5836f, cVar);
                bVar.f5835c = obj;
                return bVar;
            default:
                return new b((a0) this.d, this.f5835c, (b) this.e, (c) this.f5836f, cVar);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5833a) {
            case 0:
                return ((b) create((JSONObject) obj, (cd.c) obj2)).invokeSuspend(ad.j.f401a);
            default:
                return ((b) create((c0) obj, (cd.c) obj2)).invokeSuspend(ad.j.f401a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        throw new UnsupportedOperationException("Method not decompiled: db.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public b(d dVar, cd.c cVar) {
        super(2, cVar);
        this.f5836f = dVar;
    }
}
