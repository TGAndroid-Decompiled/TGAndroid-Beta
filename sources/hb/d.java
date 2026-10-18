package hb;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
public final class d implements eb.v {
    public final int f11716a;
    public final qf.b f11717b;

    public d(qf.b bVar, int i10) {
        this.f11716a = i10;
        this.f11717b = bVar;
    }

    @Override
    public final eb.u create(eb.g gVar, lb.a aVar) {
        Type[] actualTypeArguments;
        eb.u uVar;
        int i10 = this.f11716a;
        qf.b bVar = this.f11717b;
        Type type = Object.class;
        switch (i10) {
            case 0:
                Type type2 = aVar.f15994b;
                Class cls = aVar.f15993a;
                if (!Collection.class.isAssignableFrom(cls)) {
                    return null;
                }
                if (type2 instanceof WildcardType) {
                    type2 = ((WildcardType) type2).getUpperBounds()[0];
                }
                gb.d.b(Collection.class.isAssignableFrom(cls));
                Type j10 = gb.d.j(type2, cls, gb.d.g(type2, cls, Collection.class), new HashMap());
                if (j10 instanceof ParameterizedType) {
                    type = ((ParameterizedType) j10).getActualTypeArguments()[0];
                }
                return new c(gVar, type, gVar.b(new lb.a(type)), bVar.W(aVar));
            default:
                Type type3 = aVar.f15994b;
                Class cls2 = aVar.f15993a;
                if (!Map.class.isAssignableFrom(cls2)) {
                    return null;
                }
                if (type3 == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type3 instanceof WildcardType) {
                        type3 = ((WildcardType) type3).getUpperBounds()[0];
                    }
                    gb.d.b(Map.class.isAssignableFrom(cls2));
                    Type j11 = gb.d.j(type3, cls2, gb.d.g(type3, cls2, Map.class), new HashMap());
                    actualTypeArguments = j11 instanceof ParameterizedType ? ((ParameterizedType) j11).getActualTypeArguments() : new Type[]{type, type};
                }
                Type type4 = actualTypeArguments[0];
                if (type4 != Boolean.TYPE && type4 != Boolean.class) {
                    uVar = gVar.b(new lb.a(type4));
                } else {
                    uVar = h1.f11725c;
                }
                eb.u b10 = gVar.b(new lb.a(actualTypeArguments[1]));
                gb.n W = bVar.W(aVar);
                Type[] typeArr = actualTypeArguments;
                return new o(this, gVar, typeArr[0], uVar, typeArr[1], b10, W);
        }
    }
}
