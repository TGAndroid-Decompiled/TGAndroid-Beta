package defpackage;
public enum kf7 implements lw8 {
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    MESSAGE_OPEN(2);
    
    public final byte a;

    kf7(int i) {
        this.a = i;
    }

    @Override
    public final int a() {
        return this.a;
    }
}
