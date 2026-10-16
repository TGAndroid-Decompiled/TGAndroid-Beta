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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.l91;
import org.telegram.ui.Wallet.d4;
import zf.q;
public final class a extends View {
    public final int f10821a = 1;
    public final Paint f10822b;
    public final Object f10823c;
    public final Object d;
    public final Object e;

    public a(Activity activity, c6 c6Var) {
        super(activity);
        this.f10823c = new ne.b(this, es.h, 380L);
        this.f10822b = new Paint(1);
        this.d = c6Var;
        k61 k61Var = new k61(true);
        this.e = k61Var;
        k61Var.setCallback(this);
        k61Var.b(-1);
        k61Var.f26226i = true;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f10821a) {
            case 1:
                super.onAttachedToWindow();
                ((k61) this.e).d();
                return;
            case 2:
            default:
                super.onAttachedToWindow();
                return;
            case 3:
                super.onAttachedToWindow();
                ((ImageReceiver) this.f10823c).onAttachedToWindow();
                ((ImageReceiver) this.d).onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f10821a) {
            case 1:
                super.onDetachedFromWindow();
                ((k61) this.e).e();
                return;
            case 2:
            default:
                super.onDetachedFromWindow();
                return;
            case 3:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.f10823c).onDetachedFromWindow();
                ((ImageReceiver) this.d).onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int[] iArr;
        int[] iArr2;
        View[] viewPages;
        switch (this.f10821a) {
            case 0:
                super.onDraw(canvas);
                RectF rectF = (RectF) this.e;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, this.f10822b);
                rectF.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, (Paint) this.d);
                rectF.inset(AndroidUtilities.dpf2(4.67f), AndroidUtilities.dpf2(9.066f));
                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, (Paint) this.f10823c);
                return;
            case 1:
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                super.onDraw(canvas);
                int w02 = g6.w0(g6.Yd, (c6) this.d);
                Paint paint = this.f10822b;
                paint.setColor(w02);
                canvas.drawCircle(width, height, AndroidUtilities.dp(19.0f), paint);
                float f7 = ((ne.b) this.f10823c).e;
                float f10 = 1.0f - f7;
                if (f10 > 0.0f) {
                    q.b(canvas, (k61) this.e, f10 * 1.35f);
                    invalidate();
                }
                if (f7 > 0.0f) {
                    float dp = AndroidUtilities.dp(6.666f) * f7;
                    float dp2 = AndroidUtilities.dp(2.666f) * f7;
                    canvas.drawRoundRect(width - dp, height - dp, width + dp, dp + height, dp2, dp2, g6.m0(-1));
                    return;
                }
                return;
            case 2:
                d4 d4Var = (d4) this.e;
                d4Var.getClass();
                int themedColor = d4Var.getThemedColor(g6.f19601d6);
                Paint paint2 = this.f10822b;
                paint2.setColor(themedColor);
                d4Var.f32779b0.getLocationInWindow((int[]) this.f10823c);
                getLocationInWindow((int[]) this.d);
                for (View view : ((l91) d4Var.f32779b0).getViewPages()) {
                    if (view != null && view.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(view.getLeft() + (iArr[0] - iArr2[0]), view.getTop() + (iArr[1] - iArr2[1]));
                        canvas.concat(view.getMatrix());
                        canvas.drawRect(view.getPaddingLeft(), 0.0f, view.getWidth() - view.getPaddingRight(), AndroidUtilities.dp(100.0f) + view.getHeight(), paint2);
                        canvas.restore();
                    }
                }
                return;
            default:
                int width2 = (getWidth() / 2) - (AndroidUtilities.dp(156.0f) / 2);
                int height2 = (getHeight() / 2) - AndroidUtilities.dp(30.0f);
                ImageReceiver imageReceiver = (ImageReceiver) this.f10823c;
                float f11 = height2;
                imageReceiver.setImageCoords(width2, f11, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
                imageReceiver.draw(canvas);
                canvas.save();
                canvas.translate((getWidth() / 2.0f) - (AndroidUtilities.dp(6.166f) / 2.0f), getHeight() / 2.0f);
                canvas.drawPath((Path) this.e, this.f10822b);
                canvas.restore();
                ImageReceiver imageReceiver2 = (ImageReceiver) this.d;
                imageReceiver2.setImageCoords(AndroidUtilities.dp(96.0f) + width2, f11, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
                imageReceiver2.draw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f10821a) {
            case 3:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f10821a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                q.d((k61) this.e, i10 / 2.0f, i11 / 2.0f, 17);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f10821a) {
            case 1:
                if (!super.verifyDrawable(drawable) && (drawable != ((k61) this.e) || ((ne.b) this.f10823c).f16004f)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public a(Context context, c6 c6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f10822b = paint;
        Paint paint2 = new Paint(1);
        this.f10823c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.e = new RectF();
        paint2.setColor(-1);
        paint.setColor(g6.w0(g6.f19601d6, c6Var));
        paint3.setColor(g6.w0(g6.wj, c6Var));
    }

    public a(d4 d4Var, Context context) {
        super(context);
        this.e = d4Var;
        this.f10822b = new Paint(1);
        this.f10823c = new int[2];
        this.d = new int[2];
    }

    public a(Context context, TLObject tLObject, TLObject tLObject2) {
        super(context);
        Path path = new Path();
        this.e = path;
        Paint paint = new Paint(1);
        this.f10822b = paint;
        k9 k9Var = new k9((c6) null);
        k9Var.p(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f10823c = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(30.0f));
        imageReceiver.setForUserOrChat(tLObject, k9Var);
        k9 k9Var2 = new k9((c6) null);
        k9Var2.p(tLObject2);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.d = imageReceiver2;
        imageReceiver2.setRoundRadius(AndroidUtilities.dp(30.0f));
        imageReceiver2.setForUserOrChat(tLObject2, k9Var2);
        paint.setColor(g6.x0(null, g6.E6, false));
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
