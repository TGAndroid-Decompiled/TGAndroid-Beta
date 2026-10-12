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
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Wallet.c4;
import zf.q;
public final class a extends View {
    public final int f10817a = 1;
    public final Paint f10818b;
    public final Object f10819c;
    public final Object d;
    public final Object e;

    public a(Activity activity, c6 c6Var) {
        super(activity);
        this.f10819c = new ne.b(this, es.h, 380L);
        this.f10818b = new Paint(1);
        this.d = c6Var;
        j61 j61Var = new j61(true);
        this.e = j61Var;
        j61Var.setCallback(this);
        j61Var.b(-1);
        j61Var.f26207i = true;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f10817a) {
            case 1:
                super.onAttachedToWindow();
                ((j61) this.e).d();
                return;
            case 2:
            default:
                super.onAttachedToWindow();
                return;
            case 3:
                super.onAttachedToWindow();
                ((ImageReceiver) this.f10819c).onAttachedToWindow();
                ((ImageReceiver) this.d).onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f10817a) {
            case 1:
                super.onDetachedFromWindow();
                ((j61) this.e).e();
                return;
            case 2:
            default:
                super.onDetachedFromWindow();
                return;
            case 3:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.f10819c).onDetachedFromWindow();
                ((ImageReceiver) this.d).onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int[] iArr;
        int[] iArr2;
        View[] viewPages;
        switch (this.f10817a) {
            case 0:
                super.onDraw(canvas);
                RectF rectF = (RectF) this.e;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, this.f10818b);
                rectF.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, (Paint) this.d);
                rectF.inset(AndroidUtilities.dpf2(4.67f), AndroidUtilities.dpf2(9.066f));
                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, (Paint) this.f10819c);
                return;
            case 1:
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                super.onDraw(canvas);
                int w02 = g6.w0(g6.Yd, (c6) this.d);
                Paint paint = this.f10818b;
                paint.setColor(w02);
                canvas.drawCircle(width, height, AndroidUtilities.dp(19.0f), paint);
                float f7 = ((ne.b) this.f10819c).e;
                float f10 = 1.0f - f7;
                if (f10 > 0.0f) {
                    q.b(canvas, (j61) this.e, f10 * 1.35f);
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
                c4 c4Var = (c4) this.e;
                c4Var.getClass();
                int themedColor = c4Var.getThemedColor(g6.f19901d6);
                Paint paint2 = this.f10818b;
                paint2.setColor(themedColor);
                c4Var.f33007b0.getLocationInWindow((int[]) this.f10819c);
                getLocationInWindow((int[]) this.d);
                for (View view : ((k91) c4Var.f33007b0).getViewPages()) {
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
                ImageReceiver imageReceiver = (ImageReceiver) this.f10819c;
                float f11 = height2;
                imageReceiver.setImageCoords(width2, f11, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
                imageReceiver.draw(canvas);
                canvas.save();
                canvas.translate((getWidth() / 2.0f) - (AndroidUtilities.dp(6.166f) / 2.0f), getHeight() / 2.0f);
                canvas.drawPath((Path) this.e, this.f10818b);
                canvas.restore();
                ImageReceiver imageReceiver2 = (ImageReceiver) this.d;
                imageReceiver2.setImageCoords(AndroidUtilities.dp(96.0f) + width2, f11, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
                imageReceiver2.draw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f10817a) {
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
        switch (this.f10817a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                q.d((j61) this.e, i10 / 2.0f, i11 / 2.0f, 17);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f10817a) {
            case 1:
                if (!super.verifyDrawable(drawable) && (drawable != ((j61) this.e) || ((ne.b) this.f10819c).f16293f)) {
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
        this.f10818b = paint;
        Paint paint2 = new Paint(1);
        this.f10819c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.e = new RectF();
        paint2.setColor(-1);
        paint.setColor(g6.w0(g6.f19901d6, c6Var));
        paint3.setColor(g6.w0(g6.wj, c6Var));
    }

    public a(c4 c4Var, Context context) {
        super(context);
        this.e = c4Var;
        this.f10818b = new Paint(1);
        this.f10819c = new int[2];
        this.d = new int[2];
    }

    public a(Context context, TLObject tLObject, TLObject tLObject2) {
        super(context);
        Path path = new Path();
        this.e = path;
        Paint paint = new Paint(1);
        this.f10818b = paint;
        k9 k9Var = new k9((c6) null);
        k9Var.p(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f10819c = imageReceiver;
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
