package defpackage;
public final class rk8 extends dm8 {
    @Override
    public final void setOffset(float f) {
        boolean z;
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        setAutoPlayEnabled(z);
        super.setOffset(f);
    }
}
