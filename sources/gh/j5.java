package gh;

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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.j41;
public final class j5 extends View {
    public final int f8344a = 2;
    public final Paint f8345b;
    public final Object f8346c;
    public final Object d;
    public final Object f8347e;

    public j5(Activity activity, org.telegram.ui.ActionBar.b6 b6Var) {
        super(activity);
        this.f8346c = new td.a(this, gr.h, 380L);
        this.f8345b = new Paint(1);
        this.d = b6Var;
        j41 j41Var = new j41(true);
        this.f8347e = j41Var;
        j41Var.setCallback(this);
        j41Var.b(-1);
        j41Var.f29633i = true;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f8344a) {
            case 0:
                super.onAttachedToWindow();
                ((ImageReceiver) this.f8346c).onAttachedToWindow();
                ((ImageReceiver) this.d).onAttachedToWindow();
                return;
            case 1:
            default:
                super.onAttachedToWindow();
                return;
            case 2:
                super.onAttachedToWindow();
                ((j41) this.f8347e).d();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f8344a) {
            case 0:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.f8346c).onDetachedFromWindow();
                ((ImageReceiver) this.d).onDetachedFromWindow();
                return;
            case 1:
            default:
                super.onDetachedFromWindow();
                return;
            case 2:
                super.onDetachedFromWindow();
                ((j41) this.f8347e).e();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f8344a) {
            case 0:
                int width = (getWidth() / 2) - (AndroidUtilities.dp(156.0f) / 2);
                int height = (getHeight() / 2) - AndroidUtilities.dp(30.0f);
                ImageReceiver imageReceiver = (ImageReceiver) this.f8346c;
                float f10 = height;
                imageReceiver.setImageCoords(width, f10, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
                imageReceiver.draw(canvas);
                canvas.save();
                canvas.translate((getWidth() / 2.0f) - (AndroidUtilities.dp(6.166f) / 2.0f), getHeight() / 2.0f);
                canvas.drawPath((Path) this.f8347e, this.f8345b);
                canvas.restore();
                ImageReceiver imageReceiver2 = (ImageReceiver) this.d;
                imageReceiver2.setImageCoords(AndroidUtilities.dp(96.0f) + width, f10, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
                imageReceiver2.draw(canvas);
                return;
            case 1:
                super.onDraw(canvas);
                RectF rectF = (RectF) this.f8347e;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, this.f8345b);
                rectF.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, (Paint) this.d);
                rectF.inset(AndroidUtilities.dpf2(4.67f), AndroidUtilities.dpf2(9.066f));
                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, (Paint) this.f8346c);
                return;
            default:
                float width2 = getWidth() / 2.0f;
                float height2 = getHeight() / 2.0f;
                super.onDraw(canvas);
                int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Yd, (org.telegram.ui.ActionBar.b6) this.d);
                Paint paint = this.f8345b;
                paint.setColor(v02);
                canvas.drawCircle(width2, height2, AndroidUtilities.dp(19.0f), paint);
                float f11 = ((td.a) this.f8346c).f47775e;
                float f12 = 1.0f - f11;
                if (f12 > 0.0f) {
                    ff.s.b(canvas, (j41) this.f8347e, f12 * 1.35f);
                    invalidate();
                }
                if (f11 > 0.0f) {
                    float dp = AndroidUtilities.dp(6.666f) * f11;
                    float dp2 = AndroidUtilities.dp(2.666f) * f11;
                    canvas.drawRoundRect(width2 - dp, height2 - dp, width2 + dp, height2 + dp, dp2, dp2, org.telegram.ui.ActionBar.f6.l0(-1));
                    return;
                }
                return;
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        switch (this.f8344a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824));
                return;
            default:
                super.onMeasure(i9, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        switch (this.f8344a) {
            case 2:
                super.onSizeChanged(i9, i10, i11, i12);
                ff.s.d((j41) this.f8347e, i9 / 2.0f, i10 / 2.0f, 17);
                return;
            default:
                super.onSizeChanged(i9, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f8344a) {
            case 2:
                if (!super.verifyDrawable(drawable) && (drawable != ((j41) this.f8347e) || ((td.a) this.f8346c).f47776f)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public j5(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f8345b = paint;
        Paint paint2 = new Paint(1);
        this.f8346c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f8347e = new RectF();
        paint2.setColor(-1);
        paint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, b6Var));
        paint3.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.wj, b6Var));
    }

    public j5(Context context, TLObject tLObject, TLObject tLObject2) {
        super(context);
        Path path = new Path();
        this.f8347e = path;
        Paint paint = new Paint(1);
        this.f8345b = paint;
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        z8Var.p(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f8346c = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(30.0f));
        imageReceiver.setForUserOrChat(tLObject, z8Var);
        org.telegram.ui.Components.z8 z8Var2 = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        z8Var2.p(tLObject2);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.d = imageReceiver2;
        imageReceiver2.setRoundRadius(AndroidUtilities.dp(30.0f));
        imageReceiver2.setForUserOrChat(tLObject2, z8Var2);
        paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E6, false));
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
