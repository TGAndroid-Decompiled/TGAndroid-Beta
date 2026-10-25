package a8;
public abstract class yd {
    public static ld.f a(ld.f fVar, ld.g key) {
        kotlin.jvm.internal.i.e(key, "key");
        if (kotlin.jvm.internal.i.a(fVar.getKey(), key)) {
            return fVar;
        }
        return null;
    }

    public static ld.h b(ld.f fVar, ld.g key) {
        kotlin.jvm.internal.i.e(key, "key");
        if (kotlin.jvm.internal.i.a(fVar.getKey(), key)) {
            return ld.i.f16988a;
        }
        return fVar;
    }

    public static ld.h c(ld.f fVar, ld.h context) {
        kotlin.jvm.internal.i.e(context, "context");
        if (context == ld.i.f16988a) {
            return fVar;
        }
        return (ld.h) context.fold(fVar, new b1.e(5));
    }
}
