package kotlin;

public final class TuplesKt {
    public static final <A, B> Pair<A, B> to(A a, B b) {
        return new Pair<>(a, b);
    }
}
