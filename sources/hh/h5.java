package hh;

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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.l41;

public final class h5 extends View {

    public final int f9384a = 2;

    public final Paint f9385b;

    public final Object f9386c;
    public final Object d;

    public final Object f9387e;

    public h5(Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        this.f9386c = new ud.a(this, er.h, 380L);
        this.f9385b = new Paint(1);
        this.d = c6Var;
        l41 l41Var = new l41(true);
        this.f9387e = l41Var;
        l41Var.setCallback(this);
        l41Var.b(-1);
        l41Var.f30295i = true;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f9384a) {
            case 0:
                super.onAttachedToWindow();
                ((ImageReceiver) this.f9386c).onAttachedToWindow();
                ((ImageReceiver) this.d).onAttachedToWindow();
                break;
            case 1:
            default:
                super.onAttachedToWindow();
                break;
            case 2:
                super.onAttachedToWindow();
                ((l41) this.f9387e).d();
                break;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f9384a) {
            case 0:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.f9386c).onDetachedFromWindow();
                ((ImageReceiver) this.d).onDetachedFromWindow();
                break;
            case 1:
            default:
                super.onDetachedFromWindow();
                break;
            case 2:
                super.onDetachedFromWindow();
                ((l41) this.f9387e).e();
                break;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f9384a) {
            case 0:
                int width = (getWidth() / 2) - (AndroidUtilities.dp(156.0f) / 2);
                int height = (getHeight() / 2) - AndroidUtilities.dp(30.0f);
                ImageReceiver imageReceiver = (ImageReceiver) this.f9386c;
                float f10 = height;
                imageReceiver.setImageCoords(width, f10, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
                imageReceiver.draw(canvas);
                canvas.save();
                canvas.translate((getWidth() / 2.0f) - (AndroidUtilities.dp(6.166f) / 2.0f), getHeight() / 2.0f);
                canvas.drawPath((Path) this.f9387e, this.f9385b);
                canvas.restore();
                ImageReceiver imageReceiver2 = (ImageReceiver) this.d;
                imageReceiver2.setImageCoords(AndroidUtilities.dp(96.0f) + width, f10, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
                imageReceiver2.draw(canvas);
                break;
            case 1:
                super.onDraw(canvas);
                RectF rectF = (RectF) this.f9387e;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, this.f9385b);
                rectF.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, (Paint) this.d);
                rectF.inset(AndroidUtilities.dpf2(4.67f), AndroidUtilities.dpf2(9.066f));
                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, (Paint) this.f9386c);
                break;
            default:
                float width2 = getWidth() / 2.0f;
                float height2 = getHeight() / 2.0f;
                super.onDraw(canvas);
                int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Yd, (org.telegram.ui.ActionBar.c6) this.d);
                Paint paint = this.f9385b;
                paint.setColor(iV0);
                canvas.drawCircle(width2, height2, AndroidUtilities.dp(19.0f), paint);
                float f11 = ((ud.a) this.f9386c).f48497e;
                float f12 = 1.0f - f11;
                if (f12 > 0.0f) {
                    gf.s.b(canvas, (l41) this.f9387e, f12 * 1.35f);
                    invalidate();
                }
                if (f11 > 0.0f) {
                    float fDp = AndroidUtilities.dp(6.666f) * f11;
                    float fDp2 = AndroidUtilities.dp(2.666f) * f11;
                    canvas.drawRoundRect(width2 - fDp, height2 - fDp, width2 + fDp, height2 + fDp, fDp2, fDp2, org.telegram.ui.ActionBar.g6.l0(-1));
                }
                break;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f9384a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f9384a) {
            case 2:
                super.onSizeChanged(i10, i11, i12, i13);
                gf.s.d((l41) this.f9387e, i10 / 2.0f, i11 / 2.0f, 17);
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f9384a) {
            case 2:
                return super.verifyDrawable(drawable) || (drawable == ((l41) this.f9387e) && !((ud.a) this.f9386c).f48498f);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public h5(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f9385b = paint;
        Paint paint2 = new Paint(1);
        this.f9386c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f9387e = new RectF();
        paint2.setColor(-1);
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, c6Var));
        paint3.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.wj, c6Var));
    }

    public h5(Context context, TLObject tLObject, TLObject tLObject2) {
        super(context);
        Path path = new Path();
        this.f9387e = path;
        Paint paint = new Paint(1);
        this.f9385b = paint;
        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        y8Var.p(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f9386c = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(30.0f));
        imageReceiver.setForUserOrChat(tLObject, y8Var);
        org.telegram.ui.Components.y8 y8Var2 = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        y8Var2.p(tLObject2);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.d = imageReceiver2;
        imageReceiver2.setRoundRadius(AndroidUtilities.dp(30.0f));
        imageReceiver2.setForUserOrChat(tLObject2, y8Var2);
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
