package bb;

import ae.d0;
import com.google.firebase.messaging.s;
import java.util.ArrayList;
import java.util.List;
import k1.t;
import sd.p;
import za.m;
import za.z;
public final class i extends ld.j implements p {
    public final int f3828a;
    public int f3829b;
    public Object f3830c;
    public final Object d;

    public i(Object obj, Object obj2, jd.c cVar, int i10) {
        super(2, cVar);
        this.f3828a = i10;
        this.f3830c = obj;
        this.d = obj2;
    }

    @Override
    public final jd.c create(Object obj, jd.c cVar) {
        switch (this.f3828a) {
            case 0:
                return new i((l) this.d, cVar, 0);
            case 1:
                i iVar = new i((List) this.d, cVar, 1);
                iVar.f3830c = obj;
                return iVar;
            case 2:
                return new i((s) this.d, cVar, 2);
            case 3:
                return new i((p) this.f3830c, this.d, cVar, 3);
            case 4:
                return new i((m) this.f3830c, (jd.h) this.d, cVar, 4);
            case 5:
                return new i((z) this.f3830c, (String) this.d, cVar, 5);
            default:
                return new i((pi.f) this.f3830c, (ArrayList) this.d, cVar, 6);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3828a) {
            case 0:
                return ((i) create((d0) obj, (jd.c) obj2)).invokeSuspend(hd.i.f11091a);
            case 1:
                return ((i) create((t) obj, (jd.c) obj2)).invokeSuspend(hd.i.f11091a);
            case 2:
                return ((i) create((d0) obj, (jd.c) obj2)).invokeSuspend(hd.i.f11091a);
            case 3:
                return ((i) create((d0) obj, (jd.c) obj2)).invokeSuspend(hd.i.f11091a);
            case 4:
                return ((i) create((d0) obj, (jd.c) obj2)).invokeSuspend(hd.i.f11091a);
            case 5:
                return ((i) create((d0) obj, (jd.c) obj2)).invokeSuspend(hd.i.f11091a);
            default:
                return ((i) create((d0) obj, (jd.c) obj2)).invokeSuspend(hd.i.f11091a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: bb.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public i(Object obj, jd.c cVar, int i10) {
        super(2, cVar);
        this.f3828a = i10;
        this.d = obj;
    }
}
