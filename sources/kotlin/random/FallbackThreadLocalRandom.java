package kotlin.random;

import kotlin.jvm.internal.Intrinsics;

public final class FallbackThreadLocalRandom extends AbstractPlatformRandom {
    private final FallbackThreadLocalRandom$implStorage$1 implStorage = new ThreadLocal() {
        @Override
        public java.util.Random initialValue() {
            return new java.util.Random();
        }
    };

    @Override
    public java.util.Random getImpl() {
        Object obj = get();
        Intrinsics.checkNotNullExpressionValue(obj, "implStorage.get()");
        return (java.util.Random) obj;
    }
}
