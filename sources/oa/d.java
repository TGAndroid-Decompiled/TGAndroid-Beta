package oa;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
public final class d implements la.v {
    public final int f19118a;
    public final g5.b f19119b;

    public d(g5.b bVar, int i9) {
        this.f19118a = i9;
        this.f19119b = bVar;
    }

    @Override
    public final la.u create(la.g gVar, sa.a aVar) {
        Type[] actualTypeArguments;
        la.u uVar;
        int i9 = this.f19118a;
        g5.b bVar = this.f19119b;
        Type type = Object.class;
        switch (i9) {
            case 0:
                Type type2 = aVar.f47503b;
                Class cls = aVar.f47502a;
                if (!Collection.class.isAssignableFrom(cls)) {
                    return null;
                }
                if (type2 instanceof WildcardType) {
                    type2 = ((WildcardType) type2).getUpperBounds()[0];
                }
                na.d.b(Collection.class.isAssignableFrom(cls));
                Type j10 = na.d.j(type2, cls, na.d.g(type2, cls, Collection.class), new HashMap());
                if (j10 instanceof ParameterizedType) {
                    type = ((ParameterizedType) j10).getActualTypeArguments()[0];
                }
                return new c(gVar, type, gVar.b(new sa.a(type)), bVar.l(aVar));
            default:
                Type type3 = aVar.f47503b;
                Class cls2 = aVar.f47502a;
                if (!Map.class.isAssignableFrom(cls2)) {
                    return null;
                }
                if (type3 == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type3 instanceof WildcardType) {
                        type3 = ((WildcardType) type3).getUpperBounds()[0];
                    }
                    na.d.b(Map.class.isAssignableFrom(cls2));
                    Type j11 = na.d.j(type3, cls2, na.d.g(type3, cls2, Map.class), new HashMap());
                    actualTypeArguments = j11 instanceof ParameterizedType ? ((ParameterizedType) j11).getActualTypeArguments() : new Type[]{type, type};
                }
                Type type4 = actualTypeArguments[0];
                if (type4 != Boolean.TYPE && type4 != Boolean.class) {
                    uVar = gVar.b(new sa.a(type4));
                } else {
                    uVar = h1.f19127c;
                }
                la.u b10 = gVar.b(new sa.a(actualTypeArguments[1]));
                na.n l10 = bVar.l(aVar);
                Type[] typeArr = actualTypeArguments;
                return new o(this, gVar, typeArr[0], uVar, typeArr[1], b10, l10);
        }
    }
}
