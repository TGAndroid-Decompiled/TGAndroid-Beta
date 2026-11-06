package f7;
public enum c0 implements a {
    RS256(-257),
    RS384(-258),
    RS512(-259),
    LEGACY_RS1(-262),
    PS256(-37),
    PS384(-38),
    PS512(-39),
    RS1(-65535);
    
    public final int f11360a;

    c0(int i7) {
        this.f11360a = i7;
    }

    @Override
    public final int a() {
        return this.f11360a;
    }
}
