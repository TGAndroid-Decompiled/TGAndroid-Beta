package defpackage;
public enum ot3 implements jk {
    ED256(-260),
    ED512(-261),
    ED25519(-8),
    ES256(-7),
    ECDH_HKDF_256(-25),
    ES384(-35),
    ES512(-36);
    
    public final short a;

    ot3(int i) {
        this.a = i;
    }

    @Override
    public final int a() {
        return this.a;
    }
}
