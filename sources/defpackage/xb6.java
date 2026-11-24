package defpackage;
public enum xb6 implements ct8 {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);
    
    public final byte a;

    xb6(int i) {
        this.a = i;
    }

    @Override
    public final int a() {
        return this.a;
    }
}
