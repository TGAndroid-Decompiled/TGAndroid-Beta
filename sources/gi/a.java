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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.o91;
import org.telegram.ui.Wallet.b4;
import yf.p;
public final class a extends View {
    public final int f10893a = 1;
    public final Paint f10894b;
    public final Object f10895c;
    public final Object d;
    public final Object f10896e;

    public a(Activity activity, e6 e6Var) {
        super(activity);
        this.f10895c = new me.b(this, hs.h, 380L);
        this.f10894b = new Paint(1);
        this.d = e6Var;
        n61 n61Var = new n61(true);
        this.f10896e = n61Var;
        n61Var.setCallback(this);
        n61Var.b(-1);
        n61Var.f29058i = true;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f10893a) {
            case 1:
                super.onAttachedToWindow();
                ((n61) this.f10896e).d();
                return;
            case 2:
            default:
                super.onAttachedToWindow();
                return;
            case 3:
                super.onAttachedToWindow();
                ((ImageReceiver) this.f10895c).onAttachedToWindow();
                ((ImageReceiver) this.d).onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f10893a) {
            case 1:
                super.onDetachedFromWindow();
                ((n61) this.f10896e).e();
                return;
            case 2:
            default:
                super.onDetachedFromWindow();
                return;
            case 3:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.f10895c).onDetachedFromWindow();
                ((ImageReceiver) this.d).onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int[] iArr;
        int[] iArr2;
        View[] viewPages;
        switch (this.f10893a) {
            case 0:
                super.onDraw(canvas);
                RectF rectF = (RectF) this.f10896e;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, this.f10894b);
                rectF.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, (Paint) this.d);
                rectF.inset(AndroidUtilities.dpf2(4.67f), AndroidUtilities.dpf2(9.066f));
                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, (Paint) this.f10895c);
                return;
            case 1:
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                super.onDraw(canvas);
                int w02 = i6.w0(i6.Yd, (e6) this.d);
                Paint paint = this.f10894b;
                paint.setColor(w02);
                canvas.drawCircle(width, height, AndroidUtilities.dp(19.0f), paint);
                float f7 = ((me.b) this.f10895c).f16337e;
                float f10 = 1.0f - f7;
                if (f10 > 0.0f) {
                    p.b(canvas, (n61) this.f10896e, f10 * 1.35f);
                    invalidate();
                }
                if (f7 > 0.0f) {
                    float dp = AndroidUtilities.dp(6.666f) * f7;
                    float dp2 = AndroidUtilities.dp(2.666f) * f7;
                    canvas.drawRoundRect(width - dp, height - dp, width + dp, dp + height, dp2, dp2, i6.m0(-1));
                    return;
                }
                return;
            case 2:
                b4 b4Var = (b4) this.f10896e;
                b4Var.getClass();
                int themedColor = b4Var.getThemedColor(i6.f20797d6);
                Paint paint2 = this.f10894b;
                paint2.setColor(themedColor);
                b4Var.f34650b0.getLocationInWindow((int[]) this.f10895c);
                getLocationInWindow((int[]) this.d);
                for (View view : ((o91) b4Var.f34650b0).getViewPages()) {
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
                ImageReceiver imageReceiver = (ImageReceiver) this.f10895c;
                float f11 = height2;
                imageReceiver.setImageCoords(width2, f11, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
                imageReceiver.draw(canvas);
                canvas.save();
                canvas.translate((getWidth() / 2.0f) - (AndroidUtilities.dp(6.166f) / 2.0f), getHeight() / 2.0f);
                canvas.drawPath((Path) this.f10896e, this.f10894b);
                canvas.restore();
                ImageReceiver imageReceiver2 = (ImageReceiver) this.d;
                imageReceiver2.setImageCoords(AndroidUtilities.dp(96.0f) + width2, f11, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
                imageReceiver2.draw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f10893a) {
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
        switch (this.f10893a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                p.d((n61) this.f10896e, i10 / 2.0f, i11 / 2.0f, 17);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f10893a) {
            case 1:
                if (!super.verifyDrawable(drawable) && (drawable != ((n61) this.f10896e) || ((me.b) this.f10895c).f16338f)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public a(Context context, e6 e6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f10894b = paint;
        Paint paint2 = new Paint(1);
        this.f10895c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f10896e = new RectF();
        paint2.setColor(-1);
        paint.setColor(i6.w0(i6.f20797d6, e6Var));
        paint3.setColor(i6.w0(i6.wj, e6Var));
    }

    public a(b4 b4Var, Context context) {
        super(context);
        this.f10896e = b4Var;
        this.f10894b = new Paint(1);
        this.f10895c = new int[2];
        this.d = new int[2];
    }

    public a(Context context, TLObject tLObject, TLObject tLObject2) {
        super(context);
        Path path = new Path();
        this.f10896e = path;
        Paint paint = new Paint(1);
        this.f10894b = paint;
        j9 j9Var = new j9((e6) null);
        j9Var.p(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f10895c = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(30.0f));
        imageReceiver.setForUserOrChat(tLObject, j9Var);
        j9 j9Var2 = new j9((e6) null);
        j9Var2.p(tLObject2);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.d = imageReceiver2;
        imageReceiver2.setRoundRadius(AndroidUtilities.dp(30.0f));
        imageReceiver2.setForUserOrChat(tLObject2, j9Var2);
        paint.setColor(i6.x0(null, i6.E6, false));
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
