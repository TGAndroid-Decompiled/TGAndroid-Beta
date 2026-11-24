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
public class cu3 extends View {
    public final uib a;
    public final Drawable b;
    public final ImageReceiver c;
    public final Rect d;
    public final RectF e;
    public im0 f;

    public cu3(Context context, String str) {
        super(context);
        this.d = new Rect();
        this.e = new RectF();
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.c = imageReceiver;
        imageReceiver.q0(gm.L(22.66f));
        this.a = new uib(str, 14.0f, gm.o());
        Drawable d = b10.d(context, 2131230873);
        this.b = d;
        d.setColorFilter(new PorterDuffColorFilter(-1711276033, PorterDuff.Mode.SRC_IN));
    }

    public final void a(TLRPC.Photo photo, Object obj) {
        TLRPC.PhotoSize w = bc4.w(photo.sizes, gm.L(48.0f), false, null, true);
        TLRPC.PhotoSize w2 = bc4.w(photo.sizes, gm.L(24.0f), false, w, false);
        this.c.Z(gn5.i(w, photo), "24_24", gn5.i(w2, photo), "24_24", null, 0L, null, obj, 0);
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
        int L2 = gm.L(19.0f) + ((int) Math.ceil(this.a.c)) + gm.L(f);
        int L3 = gm.L(24.0f);
        int width = (getWidth() - L2) / 2;
        int height = getHeight() / 2;
        int i = height - (L3 / 2);
        int i2 = L2 + width;
        Rect rect = this.d;
        rect.set(width, i, i2, L3 + i);
        rect.inset(-gm.L(4.0f), -gm.L(4.0f));
        im0 im0Var = this.f;
        if (im0Var != null) {
            im0Var.setBounds(rect);
            this.f.draw(canvas);
        }
        if (B) {
            float f2 = height;
            float L4 = (gm.L(22.66f) / 2.0f) + f2;
            RectF rectF = this.e;
            rectF.set(gm.L(0.66f) + width, f2 - (gm.L(22.66f) / 2.0f), gm.L(23.32f) + width, L4);
            imageReceiver.k0(rectF);
            imageReceiver.h(canvas, null);
        }
        this.a.c(width + L, height, 1.0f, -1, canvas);
        Drawable drawable = this.b;
        drawable.setBounds(i2 - gm.L(17.0f), height - gm.L(6.0f), i2 - gm.L(5.0f), gm.L(6.0f) + height);
        drawable.draw(canvas);
    }

    public void setBlurredBackgroundDrawable(im0 im0Var) {
        im0Var.q(gm.L(4.0f));
        im0Var.r(gm.L(11.0f));
        this.f = im0Var;
    }

    public void setImage(String str) {
        if (str == null) {
            setImage((Bitmap) null);
        } else {
            Utilities.e.c(new rd3(this, str, (byte) 26));
        }
    }

    public void setImage(Bitmap bitmap) {
        this.c.f0(bitmap);
        invalidate();
    }
}
