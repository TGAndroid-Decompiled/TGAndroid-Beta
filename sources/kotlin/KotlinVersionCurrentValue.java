package kotlin;
final class KotlinVersionCurrentValue {
    static {
        new KotlinVersionCurrentValue();
    }

    private KotlinVersionCurrentValue() {
    }

    public static final KotlinVersion get() {
        return new KotlinVersion(1, 8, 0);
    }
}
