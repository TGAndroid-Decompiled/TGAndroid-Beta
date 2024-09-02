package kotlin.random.jdk8;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.AbstractPlatformRandom;

public final class PlatformThreadLocalRandom extends AbstractPlatformRandom {
    @Override
    public Random getImpl() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        Intrinsics.checkNotNullExpressionValue(current, "current()");
        return current;
    }
}
