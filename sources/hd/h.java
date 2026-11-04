package hd;
public abstract class h extends a {
    public h(fd.c cVar) {
        super(cVar);
        if (cVar != null && cVar.getContext() != fd.i.f11567a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override
    public final fd.h getContext() {
        return fd.i.f11567a;
    }
}
