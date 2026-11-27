package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ey3 extends View {
    public ln5[] a;
    public nl b;
    public hm c;
    public ValueAnimator d;
    public float e;

    public TLRPC.Document getDocument() {
        hm hmVar = this.c;
        if (hmVar != null) {
            TLRPC.Document document = hmVar.document;
            if (document == null) {
                return wl.e(yac.t0, hmVar.getDocumentId());
            }
            return document;
        }
        return null;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setPadding(hl.L(2.0f), hl.L(2.0f), hl.L(2.0f), hl.L(2.0f));
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824));
    }

    @Override
    public void setPressed(boolean z) {
        ValueAnimator valueAnimator;
        if (isPressed() != z) {
            super.setPressed(z);
            invalidate();
            if (z && (valueAnimator = this.d) != null) {
                valueAnimator.removeAllListeners();
                this.d.cancel();
            }
            if (!z) {
                float f = this.e;
                if (f != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
                    this.d = ofFloat;
                    ofFloat.addUpdateListener(new az1(this, (byte) 20));
                    this.d.addListener(new cn2(this, (byte) 16));
                    c00.o(5.0f, this.d);
                    this.d.setDuration(350L);
                    this.d.start();
                }
            }
        }
    }
}
