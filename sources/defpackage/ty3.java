package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ty3 extends View {
    public in5[] a;
    public mm b;
    public gn c;
    public ValueAnimator d;
    public float e;

    public TLRPC.Document getDocument() {
        gn gnVar = this.c;
        if (gnVar != null) {
            TLRPC.Document document = gnVar.document;
            if (document == null) {
                return vm.e(z8c.t0, gnVar.getDocumentId());
            }
            return document;
        }
        return null;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setPadding(gm.L(2.0f), gm.L(2.0f), gm.L(2.0f), gm.L(2.0f));
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
                    ofFloat.addUpdateListener(new et1(this, (byte) 21));
                    this.d.addListener(new kh2(this, (byte) 18));
                    b10.n(5.0f, this.d);
                    this.d.setDuration(350L);
                    this.d.start();
                }
            }
        }
    }
}
