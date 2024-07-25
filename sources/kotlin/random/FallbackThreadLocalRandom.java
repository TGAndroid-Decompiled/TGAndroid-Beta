package kotlin.random;

import kotlin.jvm.internal.Intrinsics;
public final class FallbackThreadLocalRandom extends AbstractPlatformRandom {
    private final FallbackThreadLocalRandom$implStorage$1 implStorage = new ThreadLocal<java.util.Random>() {
        @Override
        public java.util.Random initialValue() {
            return new java.util.Random();
        }
    };

    @Override
    public java.util.Random getImpl() {
        java.util.Random random = get();
        Intrinsics.checkNotNullExpressionValue(random, "implStorage.get()");
        return random;
    }
}
