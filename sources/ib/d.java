package ib;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
public final class d implements fb.v {
    public final int f13916a;
    public final rf.b f13917b;

    public d(rf.b bVar, int i10) {
        this.f13916a = i10;
        this.f13917b = bVar;
    }

    @Override
    public final fb.u create(fb.g gVar, mb.a aVar) {
        Type[] actualTypeArguments;
        fb.u uVar;
        int i10 = this.f13916a;
        rf.b bVar = this.f13917b;
        Type type = Object.class;
        switch (i10) {
            case 0:
                Type type2 = aVar.f18408b;
                Class cls = aVar.f18407a;
                if (!Collection.class.isAssignableFrom(cls)) {
                    return null;
                }
                if (type2 instanceof WildcardType) {
                    type2 = ((WildcardType) type2).getUpperBounds()[0];
                }
                hb.d.b(Collection.class.isAssignableFrom(cls));
                Type j10 = hb.d.j(type2, cls, hb.d.g(type2, cls, Collection.class), new HashMap());
                if (j10 instanceof ParameterizedType) {
                    type = ((ParameterizedType) j10).getActualTypeArguments()[0];
                }
                return new c(gVar, type, gVar.b(new mb.a(type)), bVar.K(aVar));
            default:
                Type type3 = aVar.f18408b;
                Class cls2 = aVar.f18407a;
                if (!Map.class.isAssignableFrom(cls2)) {
                    return null;
                }
                if (type3 == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type3 instanceof WildcardType) {
                        type3 = ((WildcardType) type3).getUpperBounds()[0];
                    }
                    hb.d.b(Map.class.isAssignableFrom(cls2));
                    Type j11 = hb.d.j(type3, cls2, hb.d.g(type3, cls2, Map.class), new HashMap());
                    actualTypeArguments = j11 instanceof ParameterizedType ? ((ParameterizedType) j11).getActualTypeArguments() : new Type[]{type, type};
                }
                Type type4 = actualTypeArguments[0];
                if (type4 != Boolean.TYPE && type4 != Boolean.class) {
                    uVar = gVar.b(new mb.a(type4));
                } else {
                    uVar = h1.f13925c;
                }
                fb.u b10 = gVar.b(new mb.a(actualTypeArguments[1]));
                hb.n K = bVar.K(aVar);
                Type[] typeArr = actualTypeArguments;
                return new o(this, gVar, typeArr[0], uVar, typeArr[1], b10, K);
        }
    }
}
