package la;
public enum i implements w9.f {
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    COLLECTION_DISABLED_REMOTE(4),
    COLLECTION_SAMPLED(5);
    
    public final int f11786a;

    i(int i10) {
        this.f11786a = i10;
    }

    @Override
    public final int a() {
        return this.f11786a;
    }
}
