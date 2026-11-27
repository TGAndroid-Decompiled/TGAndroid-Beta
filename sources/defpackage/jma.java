package defpackage;
public final class jma extends yfb implements is4 {
    @Override
    public final zw2 create(Object obj, zw2 zw2Var) {
        return new yfb(2, zw2Var);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        g9c g9cVar = g9c.a;
        ((jma) create((nm4) obj, (zw2) obj2)).invokeSuspend(g9cVar);
        return g9cVar;
    }
}
