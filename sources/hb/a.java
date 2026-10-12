package hb;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
public class a implements eb.v {
    @Override
    public final eb.u create(eb.g gVar, lb.a aVar) {
        Type componentType;
        Type type = aVar.f14654b;
        boolean z10 = type instanceof GenericArrayType;
        if (!z10 && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        if (z10) {
            componentType = ((GenericArrayType) type).getGenericComponentType();
        } else {
            componentType = ((Class) type).getComponentType();
        }
        return new b(gVar, gVar.b(new lb.a(componentType)), gb.d.h(componentType));
    }
}
