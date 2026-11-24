package defpackage;
public enum df7 implements dv8 {
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    MESSAGE_OPEN(2);
    
    public final byte a;

    df7(int i) {
        this.a = i;
    }

    @Override
    public final int a() {
        return this.a;
    }
}
