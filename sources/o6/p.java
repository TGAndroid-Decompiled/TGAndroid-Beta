package o6;
public enum p implements a {
    ED256(-260),
    ED512(-261),
    ED25519(-8),
    ES256(-7),
    ECDH_HKDF_256(-25),
    ES384(-35),
    ES512(-36);
    
    public final int f19413a;

    p(int i10) {
        this.f19413a = i10;
    }

    @Override
    public final int a() {
        return this.f19413a;
    }
}
