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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p91;
import org.telegram.ui.Wallet.e4;
import yf.p;
public final class a extends View {
    public final int f10892a = 1;
    public final Paint f10893b;
    public final Object f10894c;
    public final Object d;
    public final Object f10895e;

    public a(Activity activity, d6 d6Var) {
        super(activity);
        this.f10894c = new me.b(this, is.h, 380L);
        this.f10893b = new Paint(1);
        this.d = d6Var;
        o61 o61Var = new o61(true);
        this.f10895e = o61Var;
        o61Var.setCallback(this);
        o61Var.b(-1);
        o61Var.f29402i = true;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f10892a) {
            case 1:
                super.onAttachedToWindow();
                ((o61) this.f10895e).d();
                return;
            case 2:
            default:
                super.onAttachedToWindow();
                return;
            case 3:
                super.onAttachedToWindow();
                ((ImageReceiver) this.f10894c).onAttachedToWindow();
                ((ImageReceiver) this.d).onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f10892a) {
            case 1:
                super.onDetachedFromWindow();
                ((o61) this.f10895e).e();
                return;
            case 2:
            default:
                super.onDetachedFromWindow();
                return;
            case 3:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.f10894c).onDetachedFromWindow();
                ((ImageReceiver) this.d).onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int[] iArr;
        int[] iArr2;
        View[] viewPages;
        switch (this.f10892a) {
            case 0:
                super.onDraw(canvas);
                RectF rectF = (RectF) this.f10895e;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, this.f10893b);
                rectF.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, (Paint) this.d);
                rectF.inset(AndroidUtilities.dpf2(4.67f), AndroidUtilities.dpf2(9.066f));
                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, (Paint) this.f10894c);
                return;
            case 1:
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                super.onDraw(canvas);
                int w02 = h6.w0(h6.Yd, (d6) this.d);
                Paint paint = this.f10893b;
                paint.setColor(w02);
                canvas.drawCircle(width, height, AndroidUtilities.dp(19.0f), paint);
                float f7 = ((me.b) this.f10894c).f16401e;
                float f10 = 1.0f - f7;
                if (f10 > 0.0f) {
                    p.b(canvas, (o61) this.f10895e, f10 * 1.35f);
                    invalidate();
                }
                if (f7 > 0.0f) {
                    float dp = AndroidUtilities.dp(6.666f) * f7;
                    float dp2 = AndroidUtilities.dp(2.666f) * f7;
                    canvas.drawRoundRect(width - dp, height - dp, width + dp, dp + height, dp2, dp2, h6.m0(-1));
                    return;
                }
                return;
            case 2:
                e4 e4Var = (e4) this.f10895e;
                e4Var.getClass();
                int themedColor = e4Var.getThemedColor(h6.f20822d6);
                Paint paint2 = this.f10893b;
                paint2.setColor(themedColor);
                e4Var.f34874b0.getLocationInWindow((int[]) this.f10894c);
                getLocationInWindow((int[]) this.d);
                for (View view : ((p91) e4Var.f34874b0).getViewPages()) {
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
                ImageReceiver imageReceiver = (ImageReceiver) this.f10894c;
                float f11 = height2;
                imageReceiver.setImageCoords(width2, f11, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
                imageReceiver.draw(canvas);
                canvas.save();
                canvas.translate((getWidth() / 2.0f) - (AndroidUtilities.dp(6.166f) / 2.0f), getHeight() / 2.0f);
                canvas.drawPath((Path) this.f10895e, this.f10893b);
                canvas.restore();
                ImageReceiver imageReceiver2 = (ImageReceiver) this.d;
                imageReceiver2.setImageCoords(AndroidUtilities.dp(96.0f) + width2, f11, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
                imageReceiver2.draw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f10892a) {
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
        switch (this.f10892a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                p.d((o61) this.f10895e, i10 / 2.0f, i11 / 2.0f, 17);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f10892a) {
            case 1:
                if (!super.verifyDrawable(drawable) && (drawable != ((o61) this.f10895e) || ((me.b) this.f10894c).f16402f)) {
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
        this.f10893b = paint;
        Paint paint2 = new Paint(1);
        this.f10894c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f10895e = new RectF();
        paint2.setColor(-1);
        paint.setColor(h6.w0(h6.f20822d6, d6Var));
        paint3.setColor(h6.w0(h6.wj, d6Var));
    }

    public a(e4 e4Var, Context context) {
        super(context);
        this.f10895e = e4Var;
        this.f10893b = new Paint(1);
        this.f10894c = new int[2];
        this.d = new int[2];
    }

    public a(Context context, TLObject tLObject, TLObject tLObject2) {
        super(context);
        Path path = new Path();
        this.f10895e = path;
        Paint paint = new Paint(1);
        this.f10893b = paint;
        j9 j9Var = new j9((d6) null);
        j9Var.p(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f10894c = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(30.0f));
        imageReceiver.setForUserOrChat(tLObject, j9Var);
        j9 j9Var2 = new j9((d6) null);
        j9Var2.p(tLObject2);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.d = imageReceiver2;
        imageReceiver2.setRoundRadius(AndroidUtilities.dp(30.0f));
        imageReceiver2.setForUserOrChat(tLObject2, j9Var2);
        paint.setColor(h6.x0(null, h6.E6, false));
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
