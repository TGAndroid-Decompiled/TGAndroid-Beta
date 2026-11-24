package defpackage;
public enum cd7 implements ct8 {
    UNKNOWN(0),
    DATA_MESSAGE(1),
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);
    
    public final byte a;

    cd7(int i) {
        this.a = i;
    }

    @Override
    public final int a() {
        return this.a;
    }
}
