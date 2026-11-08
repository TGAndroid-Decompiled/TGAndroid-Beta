package c8;
public abstract class m0 {
    public static id.f a(id.f fVar, id.g key) {
        kotlin.jvm.internal.j.e(key, "key");
        if (kotlin.jvm.internal.j.a(fVar.getKey(), key)) {
            return fVar;
        }
        return null;
    }

    public static id.h b(id.f fVar, id.g key) {
        kotlin.jvm.internal.j.e(key, "key");
        if (kotlin.jvm.internal.j.a(fVar.getKey(), key)) {
            return id.i.f15456a;
        }
        return fVar;
    }

    public static id.h c(id.f fVar, id.h context) {
        kotlin.jvm.internal.j.e(context, "context");
        if (context == id.i.f15456a) {
            return fVar;
        }
        return (id.h) context.fold(fVar, new b1.e(9));
    }
}
