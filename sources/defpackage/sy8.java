package defpackage;
public enum sy8 implements jj {
    RS256(-257),
    RS384(-258),
    RS512(-259),
    LEGACY_RS1(-262),
    PS256(-37),
    PS384(-38),
    PS512(-39),
    RS1(-65535);
    
    public final int a;

    sy8(int i) {
        this.a = i;
    }

    @Override
    public final int a() {
        return this.a;
    }
}
