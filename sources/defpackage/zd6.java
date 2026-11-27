package defpackage;
public enum zd6 implements jq7 {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);
    
    public final byte a;

    zd6(int i) {
        this.a = i;
    }

    @Override
    public final int a() {
        return this.a;
    }
}
