package o5;
public enum c implements la.c {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);
    
    public final int f16967a;

    c(int i10) {
        this.f16967a = i10;
    }

    @Override
    public final int a() {
        return this.f16967a;
    }
}
