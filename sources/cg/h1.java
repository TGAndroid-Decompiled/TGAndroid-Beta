package cg;
public final class h1 extends k2 {
    @Override
    public final void setOffset(float f9) {
        boolean z10;
        if (f9 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        setAutoPlayEnabled(z10);
        super.setOffset(f9);
    }
}
