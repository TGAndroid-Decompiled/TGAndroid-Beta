package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public final class f63 extends ccb implements eq4 {
    public Iterator a;
    public vfa b;
    public Object c;
    public byte d;
    public Object e;
    public final List f;
    public final ArrayList h;

    public f63(List list, ArrayList arrayList, fw2 fw2Var) {
        super(2, fw2Var);
        this.f = list;
        this.h = arrayList;
    }

    @Override
    public final fw2 create(Object obj, fw2 fw2Var) {
        f63 f63Var = new f63(this.f, this.h, fw2Var);
        f63Var.e = obj;
        return f63Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((f63) create(obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f63.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
