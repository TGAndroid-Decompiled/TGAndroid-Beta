package defpackage;
public enum l73 implements np7 {
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    COLLECTION_DISABLED_REMOTE(4),
    COLLECTION_SAMPLED(5);
    
    public final byte a;

    l73(int i) {
        this.a = i;
    }

    @Override
    public final int a() {
        return this.a;
    }
}
