package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public final class r73 extends eeb implements fs4 {
    public Iterator a;
    public xha b;
    public Object c;
    public byte d;
    public Object e;
    public final List f;
    public final ArrayList h;

    public r73(List list, ArrayList arrayList, px2 px2Var) {
        super(2, px2Var);
        this.f = list;
        this.h = arrayList;
    }

    @Override
    public final px2 create(Object obj, px2 px2Var) {
        r73 r73Var = new r73(this.f, this.h, px2Var);
        r73Var.e = obj;
        return r73Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((r73) create(obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r73.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
