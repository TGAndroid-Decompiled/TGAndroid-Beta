package gb;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
public class a implements db.v {
    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        Type componentType;
        Type type = aVar.f12420b;
        boolean z10 = type instanceof GenericArrayType;
        if (!z10 && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        if (z10) {
            componentType = ((GenericArrayType) type).getGenericComponentType();
        } else {
            componentType = ((Class) type).getComponentType();
        }
        return new b(gVar, gVar.b(new kb.a(componentType)), fb.d.h(componentType));
    }
}
