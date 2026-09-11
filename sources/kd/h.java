package kd;
public abstract class h extends a {
    public h(id.c cVar) {
        super(cVar);
        if (cVar != null && cVar.getContext() != id.i.f11954a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override
    public final id.h getContext() {
        return id.i.f11954a;
    }
}
