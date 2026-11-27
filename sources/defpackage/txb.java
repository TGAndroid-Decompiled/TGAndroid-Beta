package defpackage;
public final class txb extends wma {
    public boolean g0;

    @Override
    public final void onMeasure(int i, int i2) {
        Q();
        if (getKeyboardHeight() == 0 && !this.g0) {
            int i3 = uc7.d1().getInt("kbd_height", hl.L(200.0f));
            this.f = i3;
            setPadding(0, 0, 0, i3);
        } else {
            this.g0 = true;
            setPadding(0, 0, 0, 0);
        }
        super.onMeasure(i, i2);
    }
}
