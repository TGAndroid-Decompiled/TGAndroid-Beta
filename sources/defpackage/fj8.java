package defpackage;
public final class fj8 extends sk8 {
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
