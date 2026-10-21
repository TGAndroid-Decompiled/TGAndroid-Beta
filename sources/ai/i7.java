package ai;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.e91;
import org.telegram.ui.Components.f61;
public final class i7 extends View {
    public final int f1492a = 1;
    public final Paint f1493b;
    public final Object f1494c;
    public final Object d;
    public final Object e;

    public i7(Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        this.f1494c = new ne.b(this, bs.h, 380L);
        this.f1493b = new Paint(1);
        this.d = d6Var;
        f61 f61Var = new f61(true);
        this.e = f61Var;
        f61Var.setCallback(this);
        f61Var.b(-1);
        f61Var.f26132i = true;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f1492a) {
            case 0:
                super.onAttachedToWindow();
                ((ImageReceiver) this.f1494c).onAttachedToWindow();
                ((ImageReceiver) this.d).onAttachedToWindow();
                return;
            case 1:
                super.onAttachedToWindow();
                ((f61) this.e).d();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f1492a) {
            case 0:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.f1494c).onDetachedFromWindow();
                ((ImageReceiver) this.d).onDetachedFromWindow();
                return;
            case 1:
                super.onDetachedFromWindow();
                ((f61) this.e).e();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        View[] viewPages;
        switch (this.f1492a) {
            case 0:
                int width = (getWidth() / 2) - (AndroidUtilities.dp(156.0f) / 2);
                int height = (getHeight() / 2) - AndroidUtilities.dp(30.0f);
                ImageReceiver imageReceiver = (ImageReceiver) this.f1494c;
                float f7 = height;
                imageReceiver.setImageCoords(width, f7, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
                imageReceiver.draw(canvas);
                canvas.save();
                canvas.translate((getWidth() / 2.0f) - (AndroidUtilities.dp(6.166f) / 2.0f), getHeight() / 2.0f);
                canvas.drawPath((Path) this.e, this.f1493b);
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
                Paint paint = this.f1493b;
                paint.setColor(w02);
                canvas.drawCircle(width2, height2, AndroidUtilities.dp(19.0f), paint);
                float f10 = ((ne.b) this.f1494c).e;
                float f11 = 1.0f - f10;
                if (f11 > 0.0f) {
                    zf.p.b(canvas, (f61) this.e, f11 * 1.35f);
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
                canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, this.f1493b);
                rectF.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, (Paint) this.d);
                rectF.inset(AndroidUtilities.dpf2(4.67f), AndroidUtilities.dpf2(9.066f));
                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, (Paint) this.f1494c);
                return;
            default:
                org.telegram.ui.Wallet.p4 p4Var = (org.telegram.ui.Wallet.p4) this.e;
                p4Var.getClass();
                int themedColor = p4Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20990d6);
                Paint paint2 = this.f1493b;
                paint2.setColor(themedColor);
                ViewGroup viewGroup = p4Var.f34696b0;
                int[] iArr = (int[]) this.f1494c;
                viewGroup.getLocationInWindow(iArr);
                int[] iArr2 = (int[]) this.d;
                getLocationInWindow(iArr2);
                float f12 = iArr[0] - iArr2[0];
                View view = ((e91) p4Var.f34696b0).getViewPages()[0];
                if (view != null) {
                    i10 = view.getPaddingLeft();
                } else {
                    i10 = 0;
                }
                if (view != null) {
                    i11 = view.getPaddingRight();
                } else {
                    i11 = 0;
                }
                canvas.save();
                canvas.clipRect(i10 + f12, 0.0f, (f12 + p4Var.f34696b0.getWidth()) - i11, getHeight());
                for (View view2 : ((e91) p4Var.f34696b0).getViewPages()) {
                    if (view2 != null && view2.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(view2.getLeft() + (iArr[0] - iArr2[0]), view2.getTop() + (iArr[1] - iArr2[1]));
                        canvas.concat(view2.getMatrix());
                        canvas.drawRect(view2.getPaddingLeft(), 0.0f, view2.getWidth() - view2.getPaddingRight(), AndroidUtilities.dp(100.0f) + view2.getHeight(), paint2);
                        canvas.restore();
                    }
                }
                canvas.restore();
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f1492a) {
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
        switch (this.f1492a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                zf.p.d((f61) this.e, i10 / 2.0f, i11 / 2.0f, 17);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f1492a) {
            case 1:
                if (!super.verifyDrawable(drawable) && (drawable != ((f61) this.e) || ((ne.b) this.f1494c).f17384f)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public i7(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f1493b = paint;
        Paint paint2 = new Paint(1);
        this.f1494c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.e = new RectF();
        paint2.setColor(-1);
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20990d6, d6Var));
        paint3.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.wj, d6Var));
    }

    public i7(org.telegram.ui.Wallet.p4 p4Var, Context context) {
        super(context);
        this.e = p4Var;
        this.f1493b = new Paint(1);
        this.f1494c = new int[2];
        this.d = new int[2];
    }

    public i7(Context context, TLObject tLObject, TLObject tLObject2) {
        super(context);
        Path path = new Path();
        this.e = path;
        Paint paint = new Paint(1);
        this.f1493b = paint;
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        h9Var.p(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f1494c = imageReceiver;
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
