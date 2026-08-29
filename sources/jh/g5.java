package jh;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.u41;
public final class g5 extends View {
    public final int f12118a = 2;
    public final Paint f12119b;
    public final Object f12120c;
    public final Object d;
    public final Object f12121e;

    public g5(Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        this.f12120c = new vd.a(this, jr.h, 380L);
        this.f12119b = new Paint(1);
        this.d = c6Var;
        u41 u41Var = new u41(true);
        this.f12121e = u41Var;
        u41Var.setCallback(this);
        u41Var.b(-1);
        u41Var.f33137i = true;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f12118a) {
            case 0:
                super.onAttachedToWindow();
                ((ImageReceiver) this.f12120c).onAttachedToWindow();
                ((ImageReceiver) this.d).onAttachedToWindow();
                return;
            case 1:
            default:
                super.onAttachedToWindow();
                return;
            case 2:
                super.onAttachedToWindow();
                ((u41) this.f12121e).d();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f12118a) {
            case 0:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.f12120c).onDetachedFromWindow();
                ((ImageReceiver) this.d).onDetachedFromWindow();
                return;
            case 1:
            default:
                super.onDetachedFromWindow();
                return;
            case 2:
                super.onDetachedFromWindow();
                ((u41) this.f12121e).e();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f12118a) {
            case 0:
                int width = (getWidth() / 2) - (AndroidUtilities.dp(156.0f) / 2);
                int height = (getHeight() / 2) - AndroidUtilities.dp(30.0f);
                ImageReceiver imageReceiver = (ImageReceiver) this.f12120c;
                float f9 = height;
                imageReceiver.setImageCoords(width, f9, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
                imageReceiver.draw(canvas);
                canvas.save();
                canvas.translate((getWidth() / 2.0f) - (AndroidUtilities.dp(6.166f) / 2.0f), getHeight() / 2.0f);
                canvas.drawPath((Path) this.f12121e, this.f12119b);
                canvas.restore();
                ImageReceiver imageReceiver2 = (ImageReceiver) this.d;
                imageReceiver2.setImageCoords(AndroidUtilities.dp(96.0f) + width, f9, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
                imageReceiver2.draw(canvas);
                return;
            case 1:
                super.onDraw(canvas);
                RectF rectF = (RectF) this.f12121e;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, this.f12119b);
                rectF.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, (Paint) this.d);
                rectF.inset(AndroidUtilities.dpf2(4.67f), AndroidUtilities.dpf2(9.066f));
                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, (Paint) this.f12120c);
                return;
            default:
                float width2 = getWidth() / 2.0f;
                float height2 = getHeight() / 2.0f;
                super.onDraw(canvas);
                int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Yd, (org.telegram.ui.ActionBar.c6) this.d);
                Paint paint = this.f12119b;
                paint.setColor(v02);
                canvas.drawCircle(width2, height2, AndroidUtilities.dp(19.0f), paint);
                float f10 = ((vd.a) this.f12120c).f49505e;
                float f11 = 1.0f - f10;
                if (f11 > 0.0f) {
                    jf.r.b(canvas, (u41) this.f12121e, f11 * 1.35f);
                    invalidate();
                }
                if (f10 > 0.0f) {
                    float dp = AndroidUtilities.dp(6.666f) * f10;
                    float dp2 = AndroidUtilities.dp(2.666f) * f10;
                    canvas.drawRoundRect(width2 - dp, height2 - dp, width2 + dp, height2 + dp, dp2, dp2, org.telegram.ui.ActionBar.g6.l0(-1));
                    return;
                }
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f12118a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f12118a) {
            case 2:
                super.onSizeChanged(i10, i11, i12, i13);
                jf.r.d((u41) this.f12121e, i10 / 2.0f, i11 / 2.0f, 17);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f12118a) {
            case 2:
                if (!super.verifyDrawable(drawable) && (drawable != ((u41) this.f12121e) || ((vd.a) this.f12120c).f49506f)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public g5(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f12119b = paint;
        Paint paint2 = new Paint(1);
        this.f12120c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f12121e = new RectF();
        paint2.setColor(-1);
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, c6Var));
        paint3.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.wj, c6Var));
    }

    public g5(Context context, TLObject tLObject, TLObject tLObject2) {
        super(context);
        Path path = new Path();
        this.f12121e = path;
        Paint paint = new Paint(1);
        this.f12119b = paint;
        org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        e9Var.p(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f12120c = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(30.0f));
        imageReceiver.setForUserOrChat(tLObject, e9Var);
        org.telegram.ui.Components.e9 e9Var2 = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        e9Var2.p(tLObject2);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.d = imageReceiver2;
        imageReceiver2.setRoundRadius(AndroidUtilities.dp(30.0f));
        imageReceiver2.setForUserOrChat(tLObject2, e9Var2);
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E6, false));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        path.rewind();
        path.moveTo(0.0f, -AndroidUtilities.dp(8.0f));
        path.lineTo(AndroidUtilities.dp(6.166f), 0.0f);
        path.lineTo(0.0f, AndroidUtilities.dp(8.0f));
    }
}
