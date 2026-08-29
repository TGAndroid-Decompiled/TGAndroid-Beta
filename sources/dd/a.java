package dd;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import kotlin.jvm.internal.j;
public final class a extends cd.a {
    @Override
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        j.d(current, "current(...)");
        return current;
    }
}
