package i2;
public final class s implements e2.o, e2.j {
    public final b2.r0 f12582a;

    public s(b2.r0 r0Var) {
        this.f12582a = r0Var;
    }

    @Override
    public void accept(Object obj) {
        ((m4.m1) obj).B(this.f12582a);
    }

    @Override
    public void invoke(Object obj) {
        ((b2.d1) obj).onMediaMetadataChanged(this.f12582a);
    }
}
