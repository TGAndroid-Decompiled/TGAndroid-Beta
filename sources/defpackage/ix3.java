package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ix3 extends View {
    public il5[] a;
    public ml b;
    public gm c;
    public ValueAnimator d;
    public float e;

    public TLRPC.Document getDocument() {
        gm gmVar = this.c;
        if (gmVar != null) {
            TLRPC.Document document = gmVar.document;
            if (document == null) {
                return vl.e(y6c.t0, gmVar.getDocumentId());
            }
            return document;
        }
        return null;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setPadding(gl.L(2.0f), gl.L(2.0f), gl.L(2.0f), gl.L(2.0f));
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
                    ofFloat.addUpdateListener(new uz1(this, (byte) 19));
                    this.d.addListener(new im2(this, (byte) 16));
                    b00.n(5.0f, this.d);
                    this.d.setDuration(350L);
                    this.d.start();
                }
            }
        }
    }
}
