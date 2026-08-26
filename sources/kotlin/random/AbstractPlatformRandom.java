package kotlin.random;

public abstract class AbstractPlatformRandom extends Random {
    public abstract java.util.Random getImpl();
}
