package gb;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
public final class d implements db.v {
    public final int f10509a;
    public final pf.b f10510b;

    public d(pf.b bVar, int i10) {
        this.f10509a = i10;
        this.f10510b = bVar;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        Type[] actualTypeArguments;
        db.u uVar;
        int i10 = this.f10509a;
        pf.b bVar = this.f10510b;
        Type type = Object.class;
        switch (i10) {
            case 0:
                Type type2 = aVar.f14889b;
                Class cls = aVar.f14888a;
                if (!Collection.class.isAssignableFrom(cls)) {
                    return null;
                }
                if (type2 instanceof WildcardType) {
                    type2 = ((WildcardType) type2).getUpperBounds()[0];
                }
                fb.d.b(Collection.class.isAssignableFrom(cls));
                Type j3 = fb.d.j(type2, cls, fb.d.g(type2, cls, Collection.class), new HashMap());
                if (j3 instanceof ParameterizedType) {
                    type = ((ParameterizedType) j3).getActualTypeArguments()[0];
                }
                return new c(gVar, type, gVar.b(new kb.a(type)), bVar.T(aVar));
            default:
                Type type3 = aVar.f14889b;
                Class cls2 = aVar.f14888a;
                if (!Map.class.isAssignableFrom(cls2)) {
                    return null;
                }
                if (type3 == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type3 instanceof WildcardType) {
                        type3 = ((WildcardType) type3).getUpperBounds()[0];
                    }
                    fb.d.b(Map.class.isAssignableFrom(cls2));
                    Type j10 = fb.d.j(type3, cls2, fb.d.g(type3, cls2, Map.class), new HashMap());
                    actualTypeArguments = j10 instanceof ParameterizedType ? ((ParameterizedType) j10).getActualTypeArguments() : new Type[]{type, type};
                }
                Type type4 = actualTypeArguments[0];
                if (type4 != Boolean.TYPE && type4 != Boolean.class) {
                    uVar = gVar.b(new kb.a(type4));
                } else {
                    uVar = h1.f10518c;
                }
                db.u b10 = gVar.b(new kb.a(actualTypeArguments[1]));
                fb.n T = bVar.T(aVar);
                Type[] typeArr = actualTypeArguments;
                return new o(this, gVar, typeArr[0], uVar, typeArr[1], b10, T);
        }
    }
}
