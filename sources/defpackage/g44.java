package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
public final class g44 extends View {
    public fg0 a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final RectF e;
    public final Drawable f;
    public final String h;
    public int n;
    public int r;
    public int s;
    public int w;

    public g44(Activity activity) {
        super(activity);
        this.b = new Paint(1);
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new RectF();
        this.n = -761748;
        this.r = gm.L(26.0f);
        this.s = 255;
        this.w = 0;
        Drawable mutate = getContext().getDrawable(2131230919).mutate();
        this.f = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        paint.setTextSize(gm.L(18.0f));
        paint.setTypeface(gm.o());
        Paint.Align align = Paint.Align.CENTER;
        paint.setTextAlign(align);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setTextSize(gm.L(18.0f));
        paint2.setTypeface(gm.o());
        paint2.setTextAlign(align);
        paint2.setColor(-16777216);
        setLayerType(2, null);
        setClickable(true);
        this.h = jb6.M0(2131751978, null);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        fg0 fg0Var = this.a;
        if (fg0Var != null) {
            fg0Var.setState(getDrawableState());
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        fg0 fg0Var = this.a;
        if (fg0Var != null) {
            fg0Var.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        int i = this.n;
        Paint paint = this.b;
        paint.setColor(i);
        RectF rectF = this.e;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float f = this.r;
        canvas.drawRoundRect(rectF, f, f, paint);
        Drawable drawable = this.f;
        drawable.setBounds((int) (width - (drawable.getIntrinsicWidth() / 2.0f)), (int) (height - (drawable.getIntrinsicHeight() / 2)), (int) ((drawable.getIntrinsicWidth() / 2) + width), (int) ((drawable.getIntrinsicHeight() / 2) + height));
        drawable.setAlpha(this.s);
        drawable.draw(canvas);
        int i2 = this.w;
        Paint paint2 = this.c;
        paint2.setAlpha(i2);
        Paint paint3 = this.d;
        paint3.setAlpha((this.w / 255) * 38);
        String str = this.h;
        canvas.drawText(str, width, gm.L(6.0f) + height, paint2);
        canvas.drawText(str, width, height + gm.L(6.0f), paint3);
        if (this.a == null) {
            fg0 Y = cmb.Y(cmb.w0(null, cmb.h6, false), 8, 8);
            this.a = Y;
            Y.setCallback(this);
        }
        this.a.setBounds(0, 0, getWidth(), getHeight());
        this.a.draw(canvas);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
