package defpackage;

import android.view.View;
public final class h48 extends View {
    public int a;

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(ug8.E(2.0f, this.a, 1073741824), ug8.E(2.0f, this.a, 1073741824));
    }

    public void setItemSize(int i) {
        this.a = i;
    }
}
