package g7;
public abstract class u6 {
    public static qc.f a(qc.f fVar, qc.g key) {
        kotlin.jvm.internal.i.e(key, "key");
        if (kotlin.jvm.internal.i.a(fVar.getKey(), key)) {
            return fVar;
        }
        return null;
    }

    public static qc.h b(qc.f fVar, qc.g key) {
        kotlin.jvm.internal.i.e(key, "key");
        if (kotlin.jvm.internal.i.a(fVar.getKey(), key)) {
            return qc.i.f46140a;
        }
        return fVar;
    }

    public static qc.h c(qc.f fVar, qc.h context) {
        kotlin.jvm.internal.i.e(context, "context");
        if (context == qc.i.f46140a) {
            return fVar;
        }
        return (qc.h) context.fold(fVar, new b1.e(5));
    }
}
