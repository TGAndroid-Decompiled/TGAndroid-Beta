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
public class ss3 extends View {
    public final tgb a;
    public final Drawable b;
    public final ImageReceiver c;
    public final Rect d;
    public final RectF e;
    public il0 f;

    public ss3(Context context, String str) {
        super(context);
        this.d = new Rect();
        this.e = new RectF();
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.c = imageReceiver;
        imageReceiver.q0(gl.L(22.66f));
        this.a = new tgb(str, 14.0f, gl.o());
        Drawable d = b00.d(context, 2131230872);
        this.b = d;
        d.setColorFilter(new PorterDuffColorFilter(-1711276033, PorterDuff.Mode.SRC_IN));
    }

    public final void a(TLRPC.Photo photo, Object obj) {
        TLRPC.PhotoSize w = ba4.w(photo.sizes, gl.L(48.0f), false, null, true);
        TLRPC.PhotoSize w2 = ba4.w(photo.sizes, gl.L(24.0f), false, w, false);
        this.c.Z(gl5.i(w, photo), "24_24", gl5.i(w2, photo), "24_24", null, 0L, null, obj, 0);
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
        int L2 = gl.L(19.0f) + ((int) Math.ceil(this.a.c)) + gl.L(f);
        int L3 = gl.L(24.0f);
        int width = (getWidth() - L2) / 2;
        int height = getHeight() / 2;
        int i = height - (L3 / 2);
        int i2 = L2 + width;
        Rect rect = this.d;
        rect.set(width, i, i2, L3 + i);
        rect.inset(-gl.L(4.0f), -gl.L(4.0f));
        il0 il0Var = this.f;
        if (il0Var != null) {
            il0Var.setBounds(rect);
            this.f.draw(canvas);
        }
        if (B) {
            float f2 = height;
            float L4 = (gl.L(22.66f) / 2.0f) + f2;
            RectF rectF = this.e;
            rectF.set(gl.L(0.66f) + width, f2 - (gl.L(22.66f) / 2.0f), gl.L(23.32f) + width, L4);
            imageReceiver.k0(rectF);
            imageReceiver.h(canvas, null);
        }
        this.a.c(width + L, height, 1.0f, -1, canvas);
        Drawable drawable = this.b;
        drawable.setBounds(i2 - gl.L(17.0f), height - gl.L(6.0f), i2 - gl.L(5.0f), gl.L(6.0f) + height);
        drawable.draw(canvas);
    }

    public void setBlurredBackgroundDrawable(il0 il0Var) {
        il0Var.q(gl.L(4.0f));
        il0Var.r(gl.L(11.0f));
        this.f = il0Var;
    }

    public void setImage(String str) {
        if (str == null) {
            setImage((Bitmap) null);
        } else {
            Utilities.e.c(new wc3(this, str, (byte) 25));
        }
    }

    public void setImage(Bitmap bitmap) {
        this.c.f0(bitmap);
        invalidate();
    }
}
