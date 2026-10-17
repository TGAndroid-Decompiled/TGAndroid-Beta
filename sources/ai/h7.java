package ai;

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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.c91;
import org.telegram.ui.Components.d61;
public final class h7 extends View {
    public final int f1428a = 1;
    public final Paint f1429b;
    public final Object f1430c;
    public final Object d;
    public final Object e;

    public h7(Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        this.f1430c = new ne.b(this, bs.h, 380L);
        this.f1429b = new Paint(1);
        this.d = d6Var;
        d61 d61Var = new d61(true);
        this.e = d61Var;
        d61Var.setCallback(this);
        d61Var.b(-1);
        d61Var.f25498i = true;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f1428a) {
            case 0:
                super.onAttachedToWindow();
                ((ImageReceiver) this.f1430c).onAttachedToWindow();
                ((ImageReceiver) this.d).onAttachedToWindow();
                return;
            case 1:
                super.onAttachedToWindow();
                ((d61) this.e).d();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f1428a) {
            case 0:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.f1430c).onDetachedFromWindow();
                ((ImageReceiver) this.d).onDetachedFromWindow();
                return;
            case 1:
                super.onDetachedFromWindow();
                ((d61) this.e).e();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int[] iArr;
        int[] iArr2;
        View[] viewPages;
        switch (this.f1428a) {
            case 0:
                int width = (getWidth() / 2) - (AndroidUtilities.dp(156.0f) / 2);
                int height = (getHeight() / 2) - AndroidUtilities.dp(30.0f);
                ImageReceiver imageReceiver = (ImageReceiver) this.f1430c;
                float f7 = height;
                imageReceiver.setImageCoords(width, f7, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
                imageReceiver.draw(canvas);
                canvas.save();
                canvas.translate((getWidth() / 2.0f) - (AndroidUtilities.dp(6.166f) / 2.0f), getHeight() / 2.0f);
                canvas.drawPath((Path) this.e, this.f1429b);
                canvas.restore();
                ImageReceiver imageReceiver2 = (ImageReceiver) this.d;
                imageReceiver2.setImageCoords(AndroidUtilities.dp(96.0f) + width, f7, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
                imageReceiver2.draw(canvas);
                return;
            case 1:
                float width2 = getWidth() / 2.0f;
                float height2 = getHeight() / 2.0f;
                super.onDraw(canvas);
                int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Yd, (org.telegram.ui.ActionBar.d6) this.d);
                Paint paint = this.f1429b;
                paint.setColor(w02);
                canvas.drawCircle(width2, height2, AndroidUtilities.dp(19.0f), paint);
                float f10 = ((ne.b) this.f1430c).e;
                float f11 = 1.0f - f10;
                if (f11 > 0.0f) {
                    zf.p.b(canvas, (d61) this.e, f11 * 1.35f);
                    invalidate();
                }
                if (f10 > 0.0f) {
                    float dp = AndroidUtilities.dp(6.666f) * f10;
                    float dp2 = AndroidUtilities.dp(2.666f) * f10;
                    canvas.drawRoundRect(width2 - dp, height2 - dp, width2 + dp, dp + height2, dp2, dp2, org.telegram.ui.ActionBar.h6.m0(-1));
                    return;
                }
                return;
            case 2:
                super.onDraw(canvas);
                RectF rectF = (RectF) this.e;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, this.f1429b);
                rectF.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, (Paint) this.d);
                rectF.inset(AndroidUtilities.dpf2(4.67f), AndroidUtilities.dpf2(9.066f));
                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, (Paint) this.f1430c);
                return;
            default:
                org.telegram.ui.Wallet.m4 m4Var = (org.telegram.ui.Wallet.m4) this.e;
                m4Var.getClass();
                int themedColor = m4Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20986d6);
                Paint paint2 = this.f1429b;
                paint2.setColor(themedColor);
                m4Var.f34584b0.getLocationInWindow((int[]) this.f1430c);
                getLocationInWindow((int[]) this.d);
                for (View view : ((c91) m4Var.f34584b0).getViewPages()) {
                    if (view != null && view.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(view.getLeft() + (iArr[0] - iArr2[0]), view.getTop() + (iArr[1] - iArr2[1]));
                        canvas.concat(view.getMatrix());
                        canvas.drawRect(view.getPaddingLeft(), 0.0f, view.getWidth() - view.getPaddingRight(), AndroidUtilities.dp(100.0f) + view.getHeight(), paint2);
                        canvas.restore();
                    }
                }
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f1428a) {
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
        switch (this.f1428a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                zf.p.d((d61) this.e, i10 / 2.0f, i11 / 2.0f, 17);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f1428a) {
            case 1:
                if (!super.verifyDrawable(drawable) && (drawable != ((d61) this.e) || ((ne.b) this.f1430c).f17380f)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public h7(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f1429b = paint;
        Paint paint2 = new Paint(1);
        this.f1430c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.e = new RectF();
        paint2.setColor(-1);
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20986d6, d6Var));
        paint3.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.wj, d6Var));
    }

    public h7(org.telegram.ui.Wallet.m4 m4Var, Context context) {
        super(context);
        this.e = m4Var;
        this.f1429b = new Paint(1);
        this.f1430c = new int[2];
        this.d = new int[2];
    }

    public h7(Context context, TLObject tLObject, TLObject tLObject2) {
        super(context);
        Path path = new Path();
        this.e = path;
        Paint paint = new Paint(1);
        this.f1429b = paint;
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        h9Var.p(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f1430c = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(30.0f));
        imageReceiver.setForUserOrChat(tLObject, h9Var);
        org.telegram.ui.Components.h9 h9Var2 = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        h9Var2.p(tLObject2);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.d = imageReceiver2;
        imageReceiver2.setRoundRadius(AndroidUtilities.dp(30.0f));
        imageReceiver2.setForUserOrChat(tLObject2, h9Var2);
        paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.E6, false));
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
