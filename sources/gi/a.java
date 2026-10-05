package gi;

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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.tr;
import yf.p;
public final class a extends View {
    public final int f10888a = 1;
    public final Paint f10889b;
    public final Object f10890c;
    public final Object d;
    public final Object f10891e;

    public a(Activity activity, d6 d6Var) {
        super(activity);
        this.f10890c = new le.b(this, tr.h, 380L);
        this.f10889b = new Paint(1);
        this.d = d6Var;
        f61 f61Var = new f61(true);
        this.f10891e = f61Var;
        f61Var.setCallback(this);
        f61Var.b(-1);
        f61Var.f26396i = true;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f10888a) {
            case 1:
                super.onAttachedToWindow();
                ((f61) this.f10891e).d();
                return;
            case 2:
                super.onAttachedToWindow();
                ((ImageReceiver) this.f10890c).onAttachedToWindow();
                ((ImageReceiver) this.d).onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f10888a) {
            case 1:
                super.onDetachedFromWindow();
                ((f61) this.f10891e).e();
                return;
            case 2:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.f10890c).onDetachedFromWindow();
                ((ImageReceiver) this.d).onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f10888a) {
            case 0:
                super.onDraw(canvas);
                RectF rectF = (RectF) this.f10891e;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, this.f10889b);
                rectF.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, (Paint) this.d);
                rectF.inset(AndroidUtilities.dpf2(4.67f), AndroidUtilities.dpf2(9.066f));
                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, (Paint) this.f10890c);
                return;
            case 1:
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                super.onDraw(canvas);
                int v02 = i6.v0(i6.Yd, (d6) this.d);
                Paint paint = this.f10889b;
                paint.setColor(v02);
                canvas.drawCircle(width, height, AndroidUtilities.dp(19.0f), paint);
                float f7 = ((le.b) this.f10890c).f15436e;
                float f10 = 1.0f - f7;
                if (f10 > 0.0f) {
                    p.b(canvas, (f61) this.f10891e, f10 * 1.35f);
                    invalidate();
                }
                if (f7 > 0.0f) {
                    float dp = AndroidUtilities.dp(6.666f) * f7;
                    float dp2 = AndroidUtilities.dp(2.666f) * f7;
                    canvas.drawRoundRect(width - dp, height - dp, width + dp, height + dp, dp2, dp2, i6.l0(-1));
                    return;
                }
                return;
            default:
                int width2 = (getWidth() / 2) - (AndroidUtilities.dp(156.0f) / 2);
                int height2 = (getHeight() / 2) - AndroidUtilities.dp(30.0f);
                ImageReceiver imageReceiver = (ImageReceiver) this.f10890c;
                float f11 = height2;
                imageReceiver.setImageCoords(width2, f11, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
                imageReceiver.draw(canvas);
                canvas.save();
                canvas.translate((getWidth() / 2.0f) - (AndroidUtilities.dp(6.166f) / 2.0f), getHeight() / 2.0f);
                canvas.drawPath((Path) this.f10891e, this.f10889b);
                canvas.restore();
                ImageReceiver imageReceiver2 = (ImageReceiver) this.d;
                imageReceiver2.setImageCoords(AndroidUtilities.dp(96.0f) + width2, f11, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
                imageReceiver2.draw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f10888a) {
            case 2:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f10888a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                p.d((f61) this.f10891e, i10 / 2.0f, i11 / 2.0f, 17);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f10888a) {
            case 1:
                if (!super.verifyDrawable(drawable) && (drawable != ((f61) this.f10891e) || ((le.b) this.f10890c).f15437f)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public a(Context context, d6 d6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f10889b = paint;
        Paint paint2 = new Paint(1);
        this.f10890c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f10891e = new RectF();
        paint2.setColor(-1);
        paint.setColor(i6.v0(i6.f20827d6, d6Var));
        paint3.setColor(i6.v0(i6.wj, d6Var));
    }

    public a(Context context, TLObject tLObject, TLObject tLObject2) {
        super(context);
        Path path = new Path();
        this.f10891e = path;
        Paint paint = new Paint(1);
        this.f10889b = paint;
        h9 h9Var = new h9((d6) null);
        h9Var.p(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f10890c = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(30.0f));
        imageReceiver.setForUserOrChat(tLObject, h9Var);
        h9 h9Var2 = new h9((d6) null);
        h9Var2.p(tLObject2);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.d = imageReceiver2;
        imageReceiver2.setRoundRadius(AndroidUtilities.dp(30.0f));
        imageReceiver2.setForUserOrChat(tLObject2, h9Var2);
        paint.setColor(i6.w0(null, i6.E6, false));
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
