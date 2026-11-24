package defpackage;
public final class dh8 extends qi8 {
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
