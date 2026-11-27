package defpackage;
public final class jma extends yfb implements is4 {
    @Override
    public final zw2 create(Object obj, zw2 zw2Var) {
        return new yfb(2, zw2Var);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        f9c f9cVar = f9c.a;
        ((jma) create((nm4) obj, (zw2) obj2)).invokeSuspend(f9cVar);
        return f9cVar;
    }
}
