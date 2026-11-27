package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public class kt3 extends View {
    public final pkb a;
    public final Drawable b;
    public final ImageReceiver c;
    public final Rect d;
    public final RectF e;
    public jl0 f;

    public kt3(Context context, String str) {
        super(context);
        this.d = new Rect();
        this.e = new RectF();
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.c = imageReceiver;
        imageReceiver.q0(hl.L(22.66f));
        this.a = new pkb(str, 14.0f, hl.o());
        Drawable e = c00.e(context, 2131230872);
        this.b = e;
        e.setColorFilter(new PorterDuffColorFilter(-1711276033, PorterDuff.Mode.SRC_IN));
    }

    public final void a(TLRPC.Photo photo, Object obj) {
        TLRPC.PhotoSize w = xb4.w(photo.sizes, hl.L(48.0f), false, null, true);
        TLRPC.PhotoSize w2 = xb4.w(photo.sizes, hl.L(24.0f), false, w, false);
        this.c.Z(jn5.i(w, photo), "24_24", jn5.i(w2, photo), "24_24", null, 0L, null, obj, 0);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.d.contains((int) motionEvent.getX(), (int) motionEvent.getY()) && motionEvent.getAction() == 0) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c.I();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.K();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        int L;
        ImageReceiver imageReceiver = this.c;
        boolean B = imageReceiver.B();
        if (B) {
            f = 30.33f;
        } else {
            f = 11.33f;
        }
        int L2 = hl.L(19.0f) + ((int) Math.ceil(this.a.c)) + hl.L(f);
        int L3 = hl.L(24.0f);
        int width = (getWidth() - L2) / 2;
        int height = getHeight() / 2;
        int i = height - (L3 / 2);
        int i2 = L2 + width;
        Rect rect = this.d;
        rect.set(width, i, i2, L3 + i);
        rect.inset(-hl.L(4.0f), -hl.L(4.0f));
        jl0 jl0Var = this.f;
        if (jl0Var != null) {
            jl0Var.setBounds(rect);
            this.f.draw(canvas);
        }
        if (B) {
            float f2 = height;
            float L4 = (hl.L(22.66f) / 2.0f) + f2;
            RectF rectF = this.e;
            rectF.set(hl.L(0.66f) + width, f2 - (hl.L(22.66f) / 2.0f), hl.L(23.32f) + width, L4);
            imageReceiver.k0(rectF);
            imageReceiver.h(canvas, null);
        }
        this.a.c(width + L, height, 1.0f, -1, canvas);
        Drawable drawable = this.b;
        drawable.setBounds(i2 - hl.L(17.0f), height - hl.L(6.0f), i2 - hl.L(5.0f), hl.L(6.0f) + height);
        drawable.draw(canvas);
    }

    public void setBlurredBackgroundDrawable(jl0 jl0Var) {
        jl0Var.q(hl.L(4.0f));
        jl0Var.r(hl.L(11.0f));
        this.f = jl0Var;
    }

    public void setImage(String str) {
        if (str == null) {
            setImage((Bitmap) null);
        } else {
            Utilities.e.c(new wd3(this, str, (byte) 23));
        }
    }

    public void setImage(Bitmap bitmap) {
        this.c.f0(bitmap);
        invalidate();
    }
}
