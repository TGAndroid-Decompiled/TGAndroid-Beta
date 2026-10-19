package md;
public abstract class g extends a {
    public g(kd.c cVar) {
        super(cVar);
        if (cVar != null && cVar.getContext() != kd.i.f15031a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override
    public final kd.h getContext() {
        return kd.i.f15031a;
    }
}
