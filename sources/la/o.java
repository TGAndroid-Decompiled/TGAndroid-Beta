package la;
public enum o implements w9.f {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);
    
    public final int f11919a;

    o(int i10) {
        this.f11919a = i10;
    }

    @Override
    public final int a() {
        return this.f11919a;
    }
}
