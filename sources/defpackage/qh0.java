package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
public final class qh0 extends View {
    public Bitmap a;
    public Bitmap b;
    public Paint c;
    public byte d;
    public int e;
    public ph0 f;

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
                i = bkb.l5;
            } else {
                i = bkb.s5;
            }
            paint.setColor(bkb.w0(null, i, false));
            if (i2 < this.e) {
                bitmap = this.a;
            } else {
                bitmap = this.b;
            }
            canvas.drawBitmap(bitmap, gl.L(48.0f) * i2, 0.0f, paint);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        byte b = this.d;
        setMeasuredDimension(de9.y(16.0f, b - 1, gl.L(32.0f) * b), gl.L(32.0f));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        float L = gl.L(-8.0f);
        boolean z = false;
        for (int i3 = 0; i3 < this.d; i3++) {
            if (motionEvent.getX() > L && motionEvent.getX() < gl.L(48.0f) + L && this.e != (i = i3 + 1)) {
                this.e = i;
                ph0 ph0Var = this.f;
                if (ph0Var != null) {
                    View view = ((em0) ph0Var).a;
                    if (i > 0) {
                        z = true;
                    }
                    view.setEnabled(z);
                    TextView textView = (TextView) view;
                    if (i < 4) {
                        i2 = 2131748058;
                    } else {
                        i2 = 2131745448;
                    }
                    textView.setText(k96.M0(i2, null).toUpperCase());
                }
                invalidate();
                return true;
            }
            L += gl.L(48.0f);
        }
        return true;
    }

    public void setOnRatingChangeListener(ph0 ph0Var) {
        this.f = ph0Var;
    }
}
