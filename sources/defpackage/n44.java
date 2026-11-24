package defpackage;
public enum n44 implements jn7 {
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);
    
    public final boolean a;

    n44(int i) {
        this.a = i;
    }

    @Override
    public final int a() {
        return this.a ? 1 : 0;
    }
}
