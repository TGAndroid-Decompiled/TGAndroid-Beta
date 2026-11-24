package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
public class d02 extends s09 {
    public final ln E;
    public final a02 F;
    public b02 r;
    public c02 s;
    public final byte w;
    public boolean x;
    public Drawable y;

    public d02(Context context, int i) {
        super(context);
        this.E = new ln(this, 0L, 320L, d53.h);
        this.F = new a02(this, (byte) 0);
        this.w = i;
    }

    public b02 getCurrentState() {
        return this.r;
    }

    public final void j(defpackage.b02 r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d02.j(b02, boolean):void");
    }

    @Override
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.E.d(this.x);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        if (d < 1.0f) {
            if (d > 0.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - d) * 255.0f), 31);
            } else {
                canvas2 = canvas;
                canvas2.save();
            }
            float A = td4.A(1.0f, d, 0.6f, 0.4f);
            canvas2.scale(A, A, width, height);
            super.onDraw(canvas);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        if (d > 0.0f) {
            Drawable drawable = this.y;
            if (drawable == null) {
                drawable = getContext().getResources().getDrawable(2131232122).mutate();
                this.y = drawable;
            }
            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
            int intrinsicHeight = this.y.getIntrinsicHeight() / 2;
            int i = (int) width;
            int i2 = (int) height;
            this.y.setBounds(i - intrinsicWidth, i2 - intrinsicHeight, i + intrinsicWidth, i2 + intrinsicHeight);
            this.y.setColorFilter(getColorFilter());
            this.y.setAlpha((int) (255.0f * d));
            canvas2.save();
            float f = (d * 0.6f) + 0.4f;
            canvas2.scale(f, f, width, height);
            this.y.draw(canvas2);
            canvas2.restore();
        }
    }

    public d02(Context context) {
        this(context, 32);
    }
}
