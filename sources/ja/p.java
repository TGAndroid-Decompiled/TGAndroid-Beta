package ja;
public enum p implements u9.f {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);
    
    public final int f11392a;

    p(int i10) {
        this.f11392a = i10;
    }

    @Override
    public final int a() {
        return this.f11392a;
    }
}
