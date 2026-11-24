package defpackage;
public enum y54 implements np7 {
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);
    
    public final boolean a;

    y54(int i) {
        this.a = i;
    }

    @Override
    public final int a() {
        return this.a ? 1 : 0;
    }
}
