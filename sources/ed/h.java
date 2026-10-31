package ed;
public abstract class h extends a {
    public h(cd.c cVar) {
        super(cVar);
        if (cVar != null && cVar.getContext() != cd.i.f4123a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override
    public final cd.h getContext() {
        return cd.i.f4123a;
    }
}
