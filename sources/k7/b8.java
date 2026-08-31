package k7;
public abstract class b8 {
    public static uc.f a(uc.f fVar, uc.g key) {
        kotlin.jvm.internal.j.e(key, "key");
        if (kotlin.jvm.internal.j.a(fVar.getKey(), key)) {
            return fVar;
        }
        return null;
    }

    public static uc.h b(uc.f fVar, uc.g key) {
        kotlin.jvm.internal.j.e(key, "key");
        if (kotlin.jvm.internal.j.a(fVar.getKey(), key)) {
            return uc.i.f48480a;
        }
        return fVar;
    }

    public static uc.h c(uc.f fVar, uc.h context) {
        kotlin.jvm.internal.j.e(context, "context");
        if (context == uc.i.f48480a) {
            return fVar;
        }
        return (uc.h) context.fold(fVar, new b1.e(5));
    }
}
