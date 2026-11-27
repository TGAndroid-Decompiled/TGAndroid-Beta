package defpackage;
public enum lf7 implements lw8 {
    UNKNOWN(0),
    DATA_MESSAGE(1),
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);
    
    public final byte a;

    lf7(int i) {
        this.a = i;
    }

    @Override
    public final int a() {
        return this.a;
    }
}
