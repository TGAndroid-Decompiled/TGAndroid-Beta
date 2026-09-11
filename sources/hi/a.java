package hi;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.pr;
import yf.p;
public final class a extends View {
    public final int f11345a = 1;
    public final Paint f11346b;
    public final Object f11347c;
    public final Object d;
    public final Object f11348e;

    public a(Activity activity, f6 f6Var) {
        super(activity);
        this.f11347c = new le.b(this, pr.h, 380L);
        this.f11346b = new Paint(1);
        this.d = f6Var;
        f51 f51Var = new f51(true);
        this.f11348e = f51Var;
        f51Var.setCallback(this);
        f51Var.b(-1);
        f51Var.f25923i = true;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f11345a) {
            case 1:
                super.onAttachedToWindow();
                ((f51) this.f11348e).d();
                return;
            case 2:
                super.onAttachedToWindow();
                ((ImageReceiver) this.f11347c).onAttachedToWindow();
                ((ImageReceiver) this.d).onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f11345a) {
            case 1:
                super.onDetachedFromWindow();
                ((f51) this.f11348e).e();
                return;
            case 2:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.f11347c).onDetachedFromWindow();
                ((ImageReceiver) this.d).onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f11345a) {
            case 0:
                super.onDraw(canvas);
                RectF rectF = (RectF) this.f11348e;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, this.f11346b);
                rectF.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, (Paint) this.d);
                rectF.inset(AndroidUtilities.dpf2(4.67f), AndroidUtilities.dpf2(9.066f));
                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, (Paint) this.f11347c);
                return;
            case 1:
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                super.onDraw(canvas);
                int v02 = j6.v0(j6.Yd, (f6) this.d);
                Paint paint = this.f11346b;
                paint.setColor(v02);
                canvas.drawCircle(width, height, AndroidUtilities.dp(19.0f), paint);
                float f7 = ((le.b) this.f11347c).f15368e;
                float f10 = 1.0f - f7;
                if (f10 > 0.0f) {
                    p.b(canvas, (f51) this.f11348e, f10 * 1.35f);
                    invalidate();
                }
                if (f7 > 0.0f) {
                    float dp = AndroidUtilities.dp(6.666f) * f7;
                    float dp2 = AndroidUtilities.dp(2.666f) * f7;
                    canvas.drawRoundRect(width - dp, height - dp, width + dp, height + dp, dp2, dp2, j6.l0(-1));
                    return;
                }
                return;
            default:
                int width2 = (getWidth() / 2) - (AndroidUtilities.dp(156.0f) / 2);
                int height2 = (getHeight() / 2) - AndroidUtilities.dp(30.0f);
                ImageReceiver imageReceiver = (ImageReceiver) this.f11347c;
                float f11 = height2;
                imageReceiver.setImageCoords(width2, f11, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
                imageReceiver.draw(canvas);
                canvas.save();
                canvas.translate((getWidth() / 2.0f) - (AndroidUtilities.dp(6.166f) / 2.0f), getHeight() / 2.0f);
                canvas.drawPath((Path) this.f11348e, this.f11346b);
                canvas.restore();
                ImageReceiver imageReceiver2 = (ImageReceiver) this.d;
                imageReceiver2.setImageCoords(AndroidUtilities.dp(96.0f) + width2, f11, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
                imageReceiver2.draw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f11345a) {
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
        switch (this.f11345a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                p.d((f51) this.f11348e, i10 / 2.0f, i11 / 2.0f, 17);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f11345a) {
            case 1:
                if (!super.verifyDrawable(drawable) && (drawable != ((f51) this.f11348e) || ((le.b) this.f11347c).f15369f)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public a(Context context, f6 f6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f11346b = paint;
        Paint paint2 = new Paint(1);
        this.f11347c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f11348e = new RectF();
        paint2.setColor(-1);
        paint.setColor(j6.v0(j6.f20663d6, f6Var));
        paint3.setColor(j6.v0(j6.wj, f6Var));
    }

    public a(Context context, TLObject tLObject, TLObject tLObject2) {
        super(context);
        Path path = new Path();
        this.f11348e = path;
        Paint paint = new Paint(1);
        this.f11346b = paint;
        i9 i9Var = new i9((f6) null);
        i9Var.p(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f11347c = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(30.0f));
        imageReceiver.setForUserOrChat(tLObject, i9Var);
        i9 i9Var2 = new i9((f6) null);
        i9Var2.p(tLObject2);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.d = imageReceiver2;
        imageReceiver2.setRoundRadius(AndroidUtilities.dp(30.0f));
        imageReceiver2.setForUserOrChat(tLObject2, i9Var2);
        paint.setColor(j6.w0(null, j6.E6, false));
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
