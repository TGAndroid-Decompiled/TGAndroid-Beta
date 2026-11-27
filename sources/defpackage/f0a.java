package defpackage;

import android.content.Context;
import android.view.View;
public final class f0a extends View {
    public final byte a;
    public final Integer b;

    public f0a(Context context, Integer num, byte b) {
        super(context);
        this.a = b;
        this.b = num;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        byte b = this.a;
        Integer num = this.b;
        switch (b) {
            case 0:
                super.onMeasure(i, i2);
                if (num != null) {
                    setPivotX(num.intValue());
                    return;
                }
                return;
            default:
                super.onMeasure(i, i2);
                if (num != null) {
                    setPivotX(num.intValue());
                    return;
                }
                return;
        }
    }
}
