package defpackage;
public enum bd7 implements ct8 {
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    MESSAGE_OPEN(2);
    
    public final byte a;

    bd7(int i) {
        this.a = i;
    }

    @Override
    public final int a() {
        return this.a;
    }
}
