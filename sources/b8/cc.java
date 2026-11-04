package b8;
public abstract class cc {
    public static fd.f a(fd.f fVar, fd.g key) {
        kotlin.jvm.internal.j.e(key, "key");
        if (kotlin.jvm.internal.j.a(fVar.getKey(), key)) {
            return fVar;
        }
        return null;
    }

    public static fd.h b(fd.f fVar, fd.g key) {
        kotlin.jvm.internal.j.e(key, "key");
        if (kotlin.jvm.internal.j.a(fVar.getKey(), key)) {
            return fd.i.f11567a;
        }
        return fVar;
    }

    public static fd.h c(fd.f fVar, fd.h context) {
        kotlin.jvm.internal.j.e(context, "context");
        if (context == fd.i.f11567a) {
            return fVar;
        }
        return (fd.h) context.fold(fVar, new ae.j(9));
    }
}
