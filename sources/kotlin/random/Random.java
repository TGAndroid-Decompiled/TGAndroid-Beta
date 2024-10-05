package kotlin.random;

import java.io.Serializable;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class Random {
    public static final Default Default = new Default(null);
    private static final Random defaultRandom = PlatformImplementationsKt.IMPLEMENTATIONS.defaultPlatformRandom();

    public static final class Default extends Random implements Serializable {
        private Default() {
        }

        public Default(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override
        public int nextInt() {
            return Random.defaultRandom.nextInt();
        }
    }

    public abstract int nextInt();
}
