package defpackage;
public enum xbe {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4);
    
    public final byte a;

    xbe(int i) {
        this.a = i;
    }
}
