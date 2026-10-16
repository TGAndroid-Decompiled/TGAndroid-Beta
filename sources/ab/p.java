package ab;
public enum p implements la.f {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);
    
    public final int f454a;

    p(int i10) {
        this.f454a = i10;
    }

    @Override
    public final int a() {
        return this.f454a;
    }
}
