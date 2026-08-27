package h7;

public abstract class y6 {
    public static rc.f a(rc.f fVar, rc.g key) {
        kotlin.jvm.internal.j.e(key, "key");
        if (kotlin.jvm.internal.j.a(fVar.getKey(), key)) {
            return fVar;
        }
        return null;
    }

    public static rc.h b(rc.f fVar, rc.g key) {
        kotlin.jvm.internal.j.e(key, "key");
        return kotlin.jvm.internal.j.a(fVar.getKey(), key) ? rc.i.f46899a : fVar;
    }

    public static rc.h c(rc.f fVar, rc.h context) {
        kotlin.jvm.internal.j.e(context, "context");
        return context == rc.i.f46899a ? fVar : (rc.h) context.fold(fVar, new b1.e(5));
    }
}
