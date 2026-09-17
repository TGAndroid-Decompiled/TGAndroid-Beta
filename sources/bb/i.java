package bb;

import com.google.firebase.messaging.t;
import java.util.ArrayList;
import java.util.List;
import rd.p;
import za.y;
import zd.c0;
public final class i extends kd.j implements p {
    public final int f3476a;
    public int f3477b;
    public Object f3478c;
    public final Object d;

    public i(Object obj, id.c cVar, int i10) {
        super(2, cVar);
        this.f3476a = i10;
        this.d = obj;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        switch (this.f3476a) {
            case 0:
                return new i((l) this.d, cVar, 0);
            case 1:
                i iVar = new i((List) this.d, cVar, 1);
                iVar.f3478c = obj;
                return iVar;
            case 2:
                return new i((t) this.d, cVar, 2);
            case 3:
                return new i((p) this.f3478c, this.d, cVar, 3);
            case 4:
                return new i((za.l) this.f3478c, (id.h) this.d, cVar, 4);
            case 5:
                return new i((y) this.f3478c, (String) this.d, cVar, 5);
            default:
                return new i((ni.f) this.f3478c, (ArrayList) this.d, cVar, 6);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3476a) {
            case 0:
                return ((i) create((c0) obj, (id.c) obj2)).invokeSuspend(gd.i.f9621a);
            case 1:
                return ((i) create((k1.t) obj, (id.c) obj2)).invokeSuspend(gd.i.f9621a);
            case 2:
                return ((i) create((c0) obj, (id.c) obj2)).invokeSuspend(gd.i.f9621a);
            case 3:
                return ((i) create((c0) obj, (id.c) obj2)).invokeSuspend(gd.i.f9621a);
            case 4:
                return ((i) create((c0) obj, (id.c) obj2)).invokeSuspend(gd.i.f9621a);
            case 5:
                return ((i) create((c0) obj, (id.c) obj2)).invokeSuspend(gd.i.f9621a);
            default:
                return ((i) create((c0) obj, (id.c) obj2)).invokeSuspend(gd.i.f9621a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: bb.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public i(Object obj, Object obj2, id.c cVar, int i10) {
        super(2, cVar);
        this.f3476a = i10;
        this.f3478c = obj;
        this.d = obj2;
    }
}
