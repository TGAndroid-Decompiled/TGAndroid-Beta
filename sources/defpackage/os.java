package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
public final class os extends r59 implements jm7 {
    public ArrayList f3;
    public u46 g3;
    public int h3;

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.l5) {
            z1();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.e().b(this, nm7.l5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.e().n(this, nm7.l5);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        b0();
    }

    public final void z1() {
        ArrayList arrayList = this.f3;
        arrayList.clear();
        arrayList.addAll(Arrays.asList(c26.values()));
        if (oc7.r1(this.h3).H3()) {
            int i = 0;
            while (i < arrayList.size()) {
                if (((c26) arrayList.get(i)).e) {
                    arrayList.remove(i);
                    i--;
                }
                i++;
            }
        }
        getAdapter().f();
        b0();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (moe.a((c26) arrayList.get(i2))) {
                this.g3.g1(i2, gm.L(16.0f));
                return;
            }
        }
    }
}
