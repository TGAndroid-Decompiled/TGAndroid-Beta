package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public final class y63 extends yfb implements is4 {
    public Iterator a;
    public oja b;
    public Object c;
    public byte d;
    public Object e;
    public final List f;
    public final ArrayList h;

    public y63(List list, ArrayList arrayList, zw2 zw2Var) {
        super(2, zw2Var);
        this.f = list;
        this.h = arrayList;
    }

    @Override
    public final zw2 create(Object obj, zw2 zw2Var) {
        y63 y63Var = new y63(this.f, this.h, zw2Var);
        y63Var.e = obj;
        return y63Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((y63) create(obj, (zw2) obj2)).invokeSuspend(g9c.a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y63.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
