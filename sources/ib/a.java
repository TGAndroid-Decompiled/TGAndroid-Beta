package ib;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
public class a implements fb.v {
    @Override
    public final fb.u create(fb.g gVar, mb.a aVar) {
        Type componentType;
        Type type = aVar.f18407b;
        boolean z10 = type instanceof GenericArrayType;
        if (!z10 && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        if (z10) {
            componentType = ((GenericArrayType) type).getGenericComponentType();
        } else {
            componentType = ((Class) type).getComponentType();
        }
        return new b(gVar, gVar.b(new mb.a(componentType)), hb.d.h(componentType));
    }
}
