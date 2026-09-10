package fi;

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
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.t51;
import org.telegram.ui.Components.wr;
import xf.p;
public final class a extends View {
    public final int f8296a = 1;
    public final Paint f8297b;
    public final Object f8298c;
    public final Object d;
    public final Object e;

    public a(Activity activity, f6 f6Var) {
        super(activity);
        this.f8298c = new le.b(this, wr.h, 380L);
        this.f8297b = new Paint(1);
        this.d = f6Var;
        t51 t51Var = new t51(true);
        this.e = t51Var;
        t51Var.setCallback(this);
        t51Var.b(-1);
        t51Var.f27341i = true;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f8296a) {
            case 1:
                super.onAttachedToWindow();
                ((t51) this.e).d();
                return;
            case 2:
                super.onAttachedToWindow();
                ((ImageReceiver) this.f8298c).onAttachedToWindow();
                ((ImageReceiver) this.d).onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f8296a) {
            case 1:
                super.onDetachedFromWindow();
                ((t51) this.e).e();
                return;
            case 2:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.f8298c).onDetachedFromWindow();
                ((ImageReceiver) this.d).onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f8296a) {
            case 0:
                super.onDraw(canvas);
                RectF rectF = (RectF) this.e;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, this.f8297b);
                rectF.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, (Paint) this.d);
                rectF.inset(AndroidUtilities.dpf2(4.67f), AndroidUtilities.dpf2(9.066f));
                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, (Paint) this.f8298c);
                return;
            case 1:
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                super.onDraw(canvas);
                int v02 = j6.v0(j6.Yd, (f6) this.d);
                Paint paint = this.f8297b;
                paint.setColor(v02);
                canvas.drawCircle(width, height, AndroidUtilities.dp(19.0f), paint);
                float f7 = ((le.b) this.f8298c).e;
                float f10 = 1.0f - f7;
                if (f10 > 0.0f) {
                    p.b(canvas, (t51) this.e, f10 * 1.35f);
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
                ImageReceiver imageReceiver = (ImageReceiver) this.f8298c;
                float f11 = height2;
                imageReceiver.setImageCoords(width2, f11, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
                imageReceiver.draw(canvas);
                canvas.save();
                canvas.translate((getWidth() / 2.0f) - (AndroidUtilities.dp(6.166f) / 2.0f), getHeight() / 2.0f);
                canvas.drawPath((Path) this.e, this.f8297b);
                canvas.restore();
                ImageReceiver imageReceiver2 = (ImageReceiver) this.d;
                imageReceiver2.setImageCoords(AndroidUtilities.dp(96.0f) + width2, f11, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
                imageReceiver2.draw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f8296a) {
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
        switch (this.f8296a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                p.d((t51) this.e, i10 / 2.0f, i11 / 2.0f, 17);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f8296a) {
            case 1:
                if (!super.verifyDrawable(drawable) && (drawable != ((t51) this.e) || ((le.b) this.f8298c).f12870f)) {
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
        this.f8297b = paint;
        Paint paint2 = new Paint(1);
        this.f8298c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.e = new RectF();
        paint2.setColor(-1);
        paint.setColor(j6.v0(j6.f17928d6, f6Var));
        paint3.setColor(j6.v0(j6.wj, f6Var));
    }

    public a(Context context, TLObject tLObject, TLObject tLObject2) {
        super(context);
        Path path = new Path();
        this.e = path;
        Paint paint = new Paint(1);
        this.f8297b = paint;
        g9 g9Var = new g9((f6) null);
        g9Var.p(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f8298c = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(30.0f));
        imageReceiver.setForUserOrChat(tLObject, g9Var);
        g9 g9Var2 = new g9((f6) null);
        g9Var2.p(tLObject2);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.d = imageReceiver2;
        imageReceiver2.setRoundRadius(AndroidUtilities.dp(30.0f));
        imageReceiver2.setForUserOrChat(tLObject2, g9Var2);
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
