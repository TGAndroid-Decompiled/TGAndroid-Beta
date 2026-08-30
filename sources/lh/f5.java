package lh;

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
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.nr;
public final class f5 extends View {
    public final int f12424a = 2;
    public final Paint f12425b;
    public final Object f12426c;
    public final Object d;
    public final Object e;

    public f5(Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.f12426c = new xd.a(this, nr.h, 380L);
        this.f12425b = new Paint(1);
        this.d = f6Var;
        g51 g51Var = new g51(true);
        this.e = g51Var;
        g51Var.setCallback(this);
        g51Var.b(-1);
        g51Var.f25055i = true;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f12424a) {
            case 0:
                super.onAttachedToWindow();
                ((ImageReceiver) this.f12426c).onAttachedToWindow();
                ((ImageReceiver) this.d).onAttachedToWindow();
                return;
            case 1:
            default:
                super.onAttachedToWindow();
                return;
            case 2:
                super.onAttachedToWindow();
                ((g51) this.e).d();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f12424a) {
            case 0:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.f12426c).onDetachedFromWindow();
                ((ImageReceiver) this.d).onDetachedFromWindow();
                return;
            case 1:
            default:
                super.onDetachedFromWindow();
                return;
            case 2:
                super.onDetachedFromWindow();
                ((g51) this.e).e();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f12424a) {
            case 0:
                int width = (getWidth() / 2) - (AndroidUtilities.dp(156.0f) / 2);
                int height = (getHeight() / 2) - AndroidUtilities.dp(30.0f);
                ImageReceiver imageReceiver = (ImageReceiver) this.f12426c;
                float f10 = height;
                imageReceiver.setImageCoords(width, f10, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
                imageReceiver.draw(canvas);
                canvas.save();
                canvas.translate((getWidth() / 2.0f) - (AndroidUtilities.dp(6.166f) / 2.0f), getHeight() / 2.0f);
                canvas.drawPath((Path) this.e, this.f12425b);
                canvas.restore();
                ImageReceiver imageReceiver2 = (ImageReceiver) this.d;
                imageReceiver2.setImageCoords(AndroidUtilities.dp(96.0f) + width, f10, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
                imageReceiver2.draw(canvas);
                return;
            case 1:
                super.onDraw(canvas);
                RectF rectF = (RectF) this.e;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, this.f12425b);
                rectF.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, (Paint) this.d);
                rectF.inset(AndroidUtilities.dpf2(4.67f), AndroidUtilities.dpf2(9.066f));
                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, (Paint) this.f12426c);
                return;
            default:
                float width2 = getWidth() / 2.0f;
                float height2 = getHeight() / 2.0f;
                super.onDraw(canvas);
                int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Yd, (org.telegram.ui.ActionBar.f6) this.d);
                Paint paint = this.f12425b;
                paint.setColor(v02);
                canvas.drawCircle(width2, height2, AndroidUtilities.dp(19.0f), paint);
                float f11 = ((xd.a) this.f12426c).e;
                float f12 = 1.0f - f11;
                if (f12 > 0.0f) {
                    lf.r.b(canvas, (g51) this.e, f12 * 1.35f);
                    invalidate();
                }
                if (f11 > 0.0f) {
                    float dp = AndroidUtilities.dp(6.666f) * f11;
                    float dp2 = AndroidUtilities.dp(2.666f) * f11;
                    canvas.drawRoundRect(width2 - dp, height2 - dp, width2 + dp, height2 + dp, dp2, dp2, org.telegram.ui.ActionBar.j6.l0(-1));
                    return;
                }
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f12424a) {
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
        switch (this.f12424a) {
            case 2:
                super.onSizeChanged(i10, i11, i12, i13);
                lf.r.d((g51) this.e, i10 / 2.0f, i11 / 2.0f, 17);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f12424a) {
            case 2:
                if (!super.verifyDrawable(drawable) && (drawable != ((g51) this.e) || ((xd.a) this.f12426c).f46893f)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public f5(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f12425b = paint;
        Paint paint2 = new Paint(1);
        this.f12426c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.e = new RectF();
        paint2.setColor(-1);
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19906d6, f6Var));
        paint3.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.wj, f6Var));
    }

    public f5(Context context, TLObject tLObject, TLObject tLObject2) {
        super(context);
        Path path = new Path();
        this.e = path;
        Paint paint = new Paint(1);
        this.f12425b = paint;
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        z8Var.p(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f12426c = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(30.0f));
        imageReceiver.setForUserOrChat(tLObject, z8Var);
        org.telegram.ui.Components.z8 z8Var2 = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        z8Var2.p(tLObject2);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.d = imageReceiver2;
        imageReceiver2.setRoundRadius(AndroidUtilities.dp(30.0f));
        imageReceiver2.setForUserOrChat(tLObject2, z8Var2);
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E6, false));
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
