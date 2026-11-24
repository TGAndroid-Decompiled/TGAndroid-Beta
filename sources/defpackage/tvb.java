package defpackage;
public final class tvb extends ela {
    public boolean m0;

    @Override
    public final void onMeasure(int i, int i2) {
        Q();
        if (getKeyboardHeight() == 0 && !this.m0) {
            int i3 = oc7.c1().getInt("kbd_height", gm.L(200.0f));
            this.f = i3;
            setPadding(0, 0, 0, i3);
        } else {
            this.m0 = true;
            setPadding(0, 0, 0, 0);
        }
        super.onMeasure(i, i2);
    }
}
