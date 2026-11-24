package defpackage;
public enum dke {
    BROADCAST_ACTION_UNSPECIFIED(0),
    PURCHASES_UPDATED_ACTION(1),
    LOCAL_PURCHASES_UPDATED_ACTION(2),
    ALTERNATIVE_BILLING_ACTION(3);
    
    public final byte a;

    dke(int i) {
        this.a = i;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.a);
    }
}
