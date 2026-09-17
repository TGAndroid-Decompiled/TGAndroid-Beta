package bb;

import com.google.firebase.messaging.s;
import java.util.ArrayList;
import java.util.List;
import k1.t;
import rd.p;
import za.y;
import zd.c0;
public final class j extends kd.j implements p {
    public final int f2583a;
    public int f2584b;
    public Object f2585c;
    public final Object d;

    public j(Object obj, id.c cVar, int i10) {
        super(2, cVar);
        this.f2583a = i10;
        this.d = obj;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        switch (this.f2583a) {
            case 0:
                return new j((m) this.d, cVar, 0);
            case 1:
                j jVar = new j((List) this.d, cVar, 1);
                jVar.f2585c = obj;
                return jVar;
            case 2:
                return new j((s) this.d, cVar, 2);
            case 3:
                return new j((p) this.f2585c, this.d, cVar, 3);
            case 4:
                return new j((za.l) this.f2585c, (id.h) this.d, cVar, 4);
            case 5:
                return new j((y) this.f2585c, (String) this.d, cVar, 5);
            default:
                return new j((fg.f) this.f2585c, (ArrayList) this.d, cVar, 6);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2583a) {
            case 0:
                return ((j) create((c0) obj, (id.c) obj2)).invokeSuspend(gd.i.f10616a);
            case 1:
                return ((j) create((t) obj, (id.c) obj2)).invokeSuspend(gd.i.f10616a);
            case 2:
                return ((j) create((c0) obj, (id.c) obj2)).invokeSuspend(gd.i.f10616a);
            case 3:
                return ((j) create((c0) obj, (id.c) obj2)).invokeSuspend(gd.i.f10616a);
            case 4:
                return ((j) create((c0) obj, (id.c) obj2)).invokeSuspend(gd.i.f10616a);
            case 5:
                return ((j) create((c0) obj, (id.c) obj2)).invokeSuspend(gd.i.f10616a);
            default:
                return ((j) create((c0) obj, (id.c) obj2)).invokeSuspend(gd.i.f10616a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: bb.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public j(Object obj, Object obj2, id.c cVar, int i10) {
        super(2, cVar);
        this.f2583a = i10;
        this.f2585c = obj;
        this.d = obj2;
    }
}
