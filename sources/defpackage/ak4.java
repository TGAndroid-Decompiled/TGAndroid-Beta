package defpackage;

import android.content.Context;
import android.view.View;
public final class ak4 extends View {
    public final byte a;
    public final byte b;

    public ak4(Context context, int i, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 1:
                this.b = i;
                super(context);
                return;
            default:
                this.b = i;
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(this.b), 1073741824));
                return;
            default:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(this.b), 1073741824));
                return;
        }
    }
}
