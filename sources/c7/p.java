package c7;
public enum p implements a {
    ED256(-260),
    ED512(-261),
    ED25519(-8),
    ES256(-7),
    ECDH_HKDF_256(-25),
    ES384(-35),
    ES512(-36);
    
    public final int f4677a;

    p(int i10) {
        this.f4677a = i10;
    }

    @Override
    public final int a() {
        return this.f4677a;
    }
}
