package m6;
public enum c0 implements a {
    RS256(-257),
    RS384(-258),
    RS512(-259),
    LEGACY_RS1(-262),
    PS256(-37),
    PS384(-38),
    PS512(-39),
    RS1(-65535);
    
    public final int f17503a;

    c0(int i9) {
        this.f17503a = i9;
    }

    @Override
    public final int a() {
        return this.f17503a;
    }
}
