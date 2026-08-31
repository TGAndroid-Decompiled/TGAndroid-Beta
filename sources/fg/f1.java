package fg;
public final class f1 extends i2 {
    @Override
    public final void setOffset(float f10) {
        boolean z4;
        if (f10 == 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        setAutoPlayEnabled(z4);
        super.setOffset(f10);
    }
}
