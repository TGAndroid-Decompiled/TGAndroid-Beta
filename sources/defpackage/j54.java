package defpackage;
public enum j54 implements jq7 {
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);
    
    public final boolean a;

    j54(int i) {
        this.a = i;
    }

    @Override
    public final int a() {
        return this.a ? 1 : 0;
    }
}
