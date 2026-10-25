package nd;
public abstract class g extends a {
    public g(ld.c cVar) {
        super(cVar);
        if (cVar != null && cVar.getContext() != ld.i.f16988a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override
    public final ld.h getContext() {
        return ld.i.f16988a;
    }
}
