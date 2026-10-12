package bb;

import ae.d0;
import com.google.firebase.messaging.s;
import java.util.ArrayList;
import java.util.List;
import k1.t;
import sd.p;
import za.z;
public final class j extends ld.j implements p {
    public final int f3827a;
    public int f3828b;
    public Object f3829c;
    public final Object d;

    public j(Object obj, Object obj2, jd.c cVar, int i10) {
        super(2, cVar);
        this.f3827a = i10;
        this.f3829c = obj;
        this.d = obj2;
    }

    @Override
    public final jd.c create(Object obj, jd.c cVar) {
        switch (this.f3827a) {
            case 0:
                return new j((m) this.d, cVar, 0);
            case 1:
                j jVar = new j((List) this.d, cVar, 1);
                jVar.f3829c = obj;
                return jVar;
            case 2:
                return new j((s) this.d, cVar, 2);
            case 3:
                return new j((p) this.f3829c, this.d, cVar, 3);
            case 4:
                return new j((za.m) this.f3829c, (jd.h) this.d, cVar, 4);
            case 5:
                return new j((z) this.f3829c, (String) this.d, cVar, 5);
            default:
                return new j((oi.f) this.f3829c, (ArrayList) this.d, cVar, 6);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3827a) {
            case 0:
                return ((j) create((d0) obj, (jd.c) obj2)).invokeSuspend(hd.i.f11090a);
            case 1:
                return ((j) create((t) obj, (jd.c) obj2)).invokeSuspend(hd.i.f11090a);
            case 2:
                return ((j) create((d0) obj, (jd.c) obj2)).invokeSuspend(hd.i.f11090a);
            case 3:
                return ((j) create((d0) obj, (jd.c) obj2)).invokeSuspend(hd.i.f11090a);
            case 4:
                return ((j) create((d0) obj, (jd.c) obj2)).invokeSuspend(hd.i.f11090a);
            case 5:
                return ((j) create((d0) obj, (jd.c) obj2)).invokeSuspend(hd.i.f11090a);
            default:
                return ((j) create((d0) obj, (jd.c) obj2)).invokeSuspend(hd.i.f11090a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: bb.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public j(Object obj, jd.c cVar, int i10) {
        super(2, cVar);
        this.f3827a = i10;
        this.d = obj;
    }
}
