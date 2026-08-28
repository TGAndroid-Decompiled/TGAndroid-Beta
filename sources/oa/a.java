package oa;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
public class a implements la.v {
    @Override
    public final la.u create(la.g gVar, sa.a aVar) {
        Type componentType;
        Type type = aVar.f47503b;
        boolean z10 = type instanceof GenericArrayType;
        if (!z10 && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        if (z10) {
            componentType = ((GenericArrayType) type).getGenericComponentType();
        } else {
            componentType = ((Class) type).getComponentType();
        }
        return new b(gVar, gVar.b(new sa.a(componentType)), na.d.h(componentType));
    }
}
