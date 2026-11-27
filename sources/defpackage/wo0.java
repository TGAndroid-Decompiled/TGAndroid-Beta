package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_keyboard;
public final class wo0 {
    public final Runnable a;
    public boolean b;
    public float c;
    public int d;
    public float e;
    public int f;
    public int g;
    public pkb h;
    public TL_keyboard.KeyboardInlineButton i;
    public iq0 j;
    public gq0 k;
    public boolean l;
    public boolean m;
    public final Path n = new Path();
    public final Paint o = new Paint(1);
    public final RectF p = new RectF();
    public final float[] q = new float[8];
    public va6 r;
    public hf0 s;
    public Drawable t;
    public wl u;
    public boolean v;
    public float w;
    public ValueAnimator x;

    public wo0(Runnable runnable) {
        this.a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f = this.w;
            if (f != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / hl.r) / 100.0f) + f;
                this.w = min;
                this.w = Utilities.i(min, 1.0f, 0.0f);
                this.a.run();
            }
        }
        return qd4.A(1.0f, this.w, 0.04f, 0.96f);
    }

    public final void b(boolean z) {
        ValueAnimator valueAnimator;
        if (this.v != z) {
            this.v = z;
            this.a.run();
            if (z && (valueAnimator = this.x) != null) {
                valueAnimator.removeAllListeners();
                this.x.cancel();
            }
            if (!z) {
                float f = this.w;
                if (f != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
                    this.x = ofFloat;
                    ofFloat.addUpdateListener(new g0(this, (byte) 16));
                    this.x.addListener(new h0(this, (byte) 22));
                    c00.o(2.0f, this.x);
                    this.x.setDuration(350L);
                    this.x.start();
                }
            }
        }
    }
}
