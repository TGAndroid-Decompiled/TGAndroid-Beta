package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
public final class qi0 extends View {
    public Bitmap a;
    public Bitmap b;
    public Paint c;
    public byte d;
    public int e;
    public pi0 f;

    public int getRating() {
        return this.e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        Bitmap bitmap;
        Paint paint = this.c;
        for (int i2 = 0; i2 < this.d; i2++) {
            if (i2 < this.e) {
                i = cmb.l5;
            } else {
                i = cmb.s5;
            }
            paint.setColor(cmb.w0(null, i, false));
            if (i2 < this.e) {
                bitmap = this.a;
            } else {
                bitmap = this.b;
            }
            canvas.drawBitmap(bitmap, gm.L(48.0f) * i2, 0.0f, paint);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        byte b = this.d;
        setMeasuredDimension(hg9.y(16.0f, b - 1, gm.L(32.0f) * b), gm.L(32.0f));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        float L = gm.L(-8.0f);
        boolean z = false;
        for (int i3 = 0; i3 < this.d; i3++) {
            if (motionEvent.getX() > L && motionEvent.getX() < gm.L(48.0f) + L && this.e != (i = i3 + 1)) {
                this.e = i;
                pi0 pi0Var = this.f;
                if (pi0Var != null) {
                    View view = ((en0) pi0Var).a;
                    if (i > 0) {
                        z = true;
                    }
                    view.setEnabled(z);
                    TextView textView = (TextView) view;
                    if (i < 4) {
                        i2 = 2131747984;
                    } else {
                        i2 = 2131745374;
                    }
                    textView.setText(jb6.M0(i2, null).toUpperCase());
                }
                invalidate();
                return true;
            }
            L += gm.L(48.0f);
        }
        return true;
    }

    public void setOnRatingChangeListener(pi0 pi0Var) {
        this.f = pi0Var;
    }
}
