package i7;
public abstract class s7 {
    public static sc.f a(sc.f fVar, sc.g key) {
        kotlin.jvm.internal.j.e(key, "key");
        if (kotlin.jvm.internal.j.a(fVar.getKey(), key)) {
            return fVar;
        }
        return null;
    }

    public static sc.h b(sc.f fVar, sc.g key) {
        kotlin.jvm.internal.j.e(key, "key");
        if (kotlin.jvm.internal.j.a(fVar.getKey(), key)) {
            return sc.i.f47711a;
        }
        return fVar;
    }

    public static sc.h c(sc.f fVar, sc.h context) {
        kotlin.jvm.internal.j.e(context, "context");
        if (context == sc.i.f47711a) {
            return fVar;
        }
        return (sc.h) context.fold(fVar, new b1.e(5));
    }
}
