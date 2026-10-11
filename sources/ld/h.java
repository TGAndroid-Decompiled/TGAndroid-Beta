package ld;
public abstract class h extends a {
    public h(jd.c cVar) {
        super(cVar);
        if (cVar != null && cVar.getContext() != jd.i.f14128a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override
    public final jd.h getContext() {
        return jd.i.f14128a;
    }
}
