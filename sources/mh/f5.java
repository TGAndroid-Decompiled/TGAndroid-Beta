package mh;

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
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.pr;
public final class f5 extends View {
    public final int f14037a = 2;
    public final Paint f14038b;
    public final Object f14039c;
    public final Object d;
    public final Object f14040e;

    public f5(Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity);
        this.f14039c = new xd.a(this, pr.h, 380L);
        this.f14038b = new Paint(1);
        this.d = g6Var;
        f51 f51Var = new f51(true);
        this.f14040e = f51Var;
        f51Var.setCallback(this);
        f51Var.b(-1);
        f51Var.f26797i = true;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f14037a) {
            case 0:
                super.onAttachedToWindow();
                ((ImageReceiver) this.f14039c).onAttachedToWindow();
                ((ImageReceiver) this.d).onAttachedToWindow();
                return;
            case 1:
            default:
                super.onAttachedToWindow();
                return;
            case 2:
                super.onAttachedToWindow();
                ((f51) this.f14040e).d();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f14037a) {
            case 0:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.f14039c).onDetachedFromWindow();
                ((ImageReceiver) this.d).onDetachedFromWindow();
                return;
            case 1:
            default:
                super.onDetachedFromWindow();
                return;
            case 2:
                super.onDetachedFromWindow();
                ((f51) this.f14040e).e();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f14037a) {
            case 0:
                int width = (getWidth() / 2) - (AndroidUtilities.dp(156.0f) / 2);
                int height = (getHeight() / 2) - AndroidUtilities.dp(30.0f);
                ImageReceiver imageReceiver = (ImageReceiver) this.f14039c;
                float f10 = height;
                imageReceiver.setImageCoords(width, f10, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
                imageReceiver.draw(canvas);
                canvas.save();
                canvas.translate((getWidth() / 2.0f) - (AndroidUtilities.dp(6.166f) / 2.0f), getHeight() / 2.0f);
                canvas.drawPath((Path) this.f14040e, this.f14038b);
                canvas.restore();
                ImageReceiver imageReceiver2 = (ImageReceiver) this.d;
                imageReceiver2.setImageCoords(AndroidUtilities.dp(96.0f) + width, f10, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
                imageReceiver2.draw(canvas);
                return;
            case 1:
                super.onDraw(canvas);
                RectF rectF = (RectF) this.f14040e;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, this.f14038b);
                rectF.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, (Paint) this.d);
                rectF.inset(AndroidUtilities.dpf2(4.67f), AndroidUtilities.dpf2(9.066f));
                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, (Paint) this.f14039c);
                return;
            default:
                float width2 = getWidth() / 2.0f;
                float height2 = getHeight() / 2.0f;
                super.onDraw(canvas);
                int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Yd, (org.telegram.ui.ActionBar.g6) this.d);
                Paint paint = this.f14038b;
                paint.setColor(v02);
                canvas.drawCircle(width2, height2, AndroidUtilities.dp(19.0f), paint);
                float f11 = ((xd.a) this.f14039c).f50541e;
                float f12 = 1.0f - f11;
                if (f12 > 0.0f) {
                    lf.r.b(canvas, (f51) this.f14040e, f12 * 1.35f);
                    invalidate();
                }
                if (f11 > 0.0f) {
                    float dp = AndroidUtilities.dp(6.666f) * f11;
                    float dp2 = AndroidUtilities.dp(2.666f) * f11;
                    canvas.drawRoundRect(width2 - dp, height2 - dp, width2 + dp, height2 + dp, dp2, dp2, org.telegram.ui.ActionBar.k6.l0(-1));
                    return;
                }
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f14037a) {
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
        switch (this.f14037a) {
            case 2:
                super.onSizeChanged(i10, i11, i12, i13);
                lf.r.d((f51) this.f14040e, i10 / 2.0f, i11 / 2.0f, 17);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f14037a) {
            case 2:
                if (!super.verifyDrawable(drawable) && (drawable != ((f51) this.f14040e) || ((xd.a) this.f14039c).f50542f)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public f5(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f14038b = paint;
        Paint paint2 = new Paint(1);
        this.f14039c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f14040e = new RectF();
        paint2.setColor(-1);
        paint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21661d6, g6Var));
        paint3.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.wj, g6Var));
    }

    public f5(Context context, TLObject tLObject, TLObject tLObject2) {
        super(context);
        Path path = new Path();
        this.f14040e = path;
        Paint paint = new Paint(1);
        this.f14038b = paint;
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        z8Var.p(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f14039c = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(30.0f));
        imageReceiver.setForUserOrChat(tLObject, z8Var);
        org.telegram.ui.Components.z8 z8Var2 = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        z8Var2.p(tLObject2);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.d = imageReceiver2;
        imageReceiver2.setRoundRadius(AndroidUtilities.dp(30.0f));
        imageReceiver2.setForUserOrChat(tLObject2, z8Var2);
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.E6, false));
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
