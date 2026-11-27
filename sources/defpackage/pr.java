package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
public final class pr extends d79 implements fn7 {
    public ArrayList f3;
    public x46 g3;
    public int h3;

    public final void A1() {
        ArrayList arrayList = this.f3;
        arrayList.clear();
        arrayList.addAll(Arrays.asList(g26.values()));
        if (uc7.s1(this.h3).M3()) {
            int i = 0;
            while (i < arrayList.size()) {
                if (((g26) arrayList.get(i)).e) {
                    arrayList.remove(i);
                    i--;
                }
                i++;
            }
        }
        getAdapter().f();
        c0();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (ere.a((g26) arrayList.get(i2))) {
                this.g3.g1(i2, hl.L(16.0f));
                return;
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.k5) {
            A1();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.e().b(this, jn7.k5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.e().n(this, jn7.k5);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        c0();
    }
}
