package kotlin.random;

public abstract class AbstractPlatformRandom extends Random {
    public abstract java.util.Random getImpl();

    @Override
    public int nextInt() {
        return getImpl().nextInt();
    }

    @Override
    public int nextInt(int i) {
        return getImpl().nextInt(i);
    }
}
