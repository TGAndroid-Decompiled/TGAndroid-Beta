package m6;
public enum p implements a {
    ED256(-260),
    ED512(-261),
    ED25519(-8),
    ES256(-7),
    ECDH_HKDF_256(-25),
    ES384(-35),
    ES512(-36);
    
    public final int f17553a;

    p(int i9) {
        this.f17553a = i9;
    }

    @Override
    public final int a() {
        return this.f17553a;
    }
}
