package cg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
import nh.t3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.v5;
public final class w extends View {
    public final Path f3430a;
    public final CornerPathEffect f3431b;
    public final TextPaint f3432c;
    public StaticLayout d;
    public float f3433e;
    public SpannableStringBuilder f3434f;
    public final ArrayList h;
    public StaticLayout f3435n;
    public boolean f3436r;
    public float f3437s;
    public boolean v;
    public final Paint f3438w;
    public final Paint f3439x;
    public final LimitPreviewView f3440y;

    public w(LimitPreviewView limitPreviewView, Context context) {
        super(context);
        this.f3440y = limitPreviewView;
        this.f3430a = new Path();
        this.f3431b = new CornerPathEffect(AndroidUtilities.dp(6.0f));
        TextPaint textPaint = new TextPaint(1);
        this.f3432c = textPaint;
        this.h = new ArrayList();
        Paint paint = new Paint();
        this.f3438w = paint;
        Paint paint2 = new Paint();
        this.f3439x = paint2;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(22.0f));
        textPaint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.OVERLAY));
    }

    public static void a(w wVar) {
        ArrayList arrayList = wVar.h;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((v) arrayList.get(i10)).f3400f != null) {
                return;
            }
        }
        arrayList.clear();
        wVar.f3436r = false;
        wVar.invalidate();
    }

    public final void b() {
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(8.0f);
        float measuredWidth = getMeasuredWidth() * this.f3437s;
        float clamp = Utilities.clamp(AndroidUtilities.dp(8.0f) + measuredWidth, getMeasuredWidth(), 0.0f);
        float f9 = 10.0f;
        float clamp2 = Utilities.clamp(AndroidUtilities.dp(10.0f) + measuredWidth, getMeasuredWidth(), AndroidUtilities.dp(24.0f));
        if (this.f3437s >= 0.7f) {
            f9 = 24.0f;
        }
        float clamp3 = Utilities.clamp(measuredWidth - AndroidUtilities.dp(f9), getMeasuredWidth(), 0.0f);
        float clamp4 = Utilities.clamp(measuredWidth - AndroidUtilities.dp(8.0f), getMeasuredWidth(), 0.0f);
        Path path = this.f3430a;
        path.rewind();
        float f10 = measuredHeight;
        float f11 = f10 - (f10 / 2.0f);
        path.moveTo(clamp3, f11 - AndroidUtilities.dp(2.0f));
        path.lineTo(clamp3, f10);
        path.lineTo(clamp4, f10);
        path.lineTo(measuredWidth, AndroidUtilities.dp(8.0f) + measuredHeight);
        if (this.f3437s < 0.7f) {
            path.lineTo(clamp, f10);
        }
        path.lineTo(clamp2, f10);
        path.lineTo(clamp2, f11 - AndroidUtilities.dp(2.0f));
        path.close();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint e10;
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(8.0f);
        LimitPreviewView limitPreviewView = this.f3440y;
        Paint paint = limitPreviewView.G;
        if (limitPreviewView.F) {
            measuredHeight = getMeasuredHeight();
            s1.d().f(LimitPreviewView.c(limitPreviewView) - getX(), -getTop(), limitPreviewView.getMeasuredWidth(), limitPreviewView.getMeasuredHeight());
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, AndroidUtilities.dp(3.0f), getMeasuredWidth(), measuredHeight - AndroidUtilities.dp(3.0f));
            float f9 = measuredHeight / 2.0f;
            s1 d = s1.d();
            if (d.f3362c == null) {
                d.f3362c = new Paint(1);
            }
            d.f3362c.setColor(g6.w0(null, g6.Oh, false));
            canvas.drawRoundRect(rectF, f9, f9, d.f3362c);
        } else {
            if (this.v) {
                this.v = false;
                b();
            }
            s1.d().f(LimitPreviewView.c(limitPreviewView) - getX(), -getTop(), limitPreviewView.getMeasuredWidth(), limitPreviewView.getMeasuredHeight());
            RectF rectF2 = AndroidUtilities.rectTmp;
            float f10 = measuredHeight;
            rectF2.set(0.0f, 0.0f, getMeasuredWidth(), f10);
            float f11 = f10 / 2.0f;
            boolean z10 = limitPreviewView.N;
            TextPaint textPaint = this.f3432c;
            if (z10) {
                e10 = paint;
            } else if (limitPreviewView.f26459a0 != null) {
                e10 = textPaint;
            } else {
                e10 = s1.d().e();
            }
            canvas.drawRoundRect(rectF2, f11, f11, e10);
            Paint e11 = s1.d().e();
            CornerPathEffect cornerPathEffect = this.f3431b;
            e11.setPathEffect(cornerPathEffect);
            if (limitPreviewView.f26459a0 != null) {
                textPaint.setPathEffect(cornerPathEffect);
            }
            if (!limitPreviewView.N) {
                if (limitPreviewView.f26459a0 != null) {
                    paint = textPaint;
                } else {
                    paint = s1.d().e();
                }
            }
            canvas.drawPath(this.f3430a, paint);
            s1.d().e().setPathEffect(null);
            if (limitPreviewView.f26459a0 != null) {
                textPaint.setPathEffect(null);
            }
            if (limitPreviewView.W) {
                invalidate();
            }
        }
        int i10 = measuredHeight;
        if (limitPreviewView.f26459a0 != null) {
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f3438w, 31);
        }
        float measuredWidth = (getMeasuredWidth() - this.f3433e) / 2.0f;
        float height = (i10 - this.d.getHeight()) / 2.0f;
        if (!this.f3436r) {
            if (this.d != null) {
                canvas.save();
                canvas.translate(measuredWidth, height);
                this.d.draw(canvas);
                canvas.restore();
            }
        } else {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(8.0f));
            if (this.f3435n != null) {
                canvas.save();
                canvas.translate(measuredWidth, height);
                this.f3435n.draw(canvas);
                canvas.restore();
            }
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i11 >= arrayList.size()) {
                    break;
                }
                v vVar = (v) arrayList.get(i11);
                canvas.save();
                boolean z11 = vVar.f3396a;
                ArrayList arrayList2 = vVar.f3397b;
                if (z11) {
                    canvas.translate(vVar.f3399e + measuredWidth, ((i10 * vVar.f3398c) + height) - ((1 - arrayList2.size()) * i10));
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        canvas.translate(0.0f, -i10);
                        ((StaticLayout) arrayList2.get(i12)).draw(canvas);
                    }
                } else if (vVar.d) {
                    canvas.translate(vVar.f3399e + measuredWidth, (height - ((i10 * 10) * vVar.f3398c)) + ((10 - arrayList2.size()) * i10));
                    for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                        canvas.translate(0.0f, i10);
                        ((StaticLayout) arrayList2.get(i13)).draw(canvas);
                    }
                } else {
                    canvas.translate(vVar.f3399e + measuredWidth, (((i10 * 10) * vVar.f3398c) + height) - ((10 - arrayList2.size()) * i10));
                    for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                        canvas.translate(0.0f, -i10);
                        ((StaticLayout) arrayList2.get(i14)).draw(canvas);
                    }
                }
                canvas.restore();
                i11++;
            }
            canvas.restore();
        }
        if (limitPreviewView.f26459a0 != null) {
            canvas.restore();
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f3439x, 31);
            canvas.drawRect(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f), getMeasuredWidth() - AndroidUtilities.dp(12.0f), getMeasuredHeight() - AndroidUtilities.dp(10.0f), ((v5) ((org.telegram.ui.c1) limitPreviewView.f26459a0).f36955b).t0(getX(), getY()));
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        SpannableStringBuilder spannableStringBuilder = this.f3434f;
        TextPaint textPaint = this.f3432c;
        this.f3433e = t3.g(spannableStringBuilder, textPaint);
        this.d = new StaticLayout(this.f3434f, textPaint, AndroidUtilities.dp(12.0f) + ((int) this.f3433e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f3433e = 0.0f;
        for (int i12 = 0; i12 < this.d.getLineCount(); i12++) {
            this.f3433e = Math.max(this.f3433e, this.d.getLineWidth(i12));
        }
        setMeasuredDimension((int) (this.f3433e + getPaddingRight() + getPaddingLeft()), AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(44.0f));
        b();
    }

    @Override
    public final void setTranslationX(float f9) {
        if (f9 != getTranslationX()) {
            super.setTranslationX(f9);
            invalidate();
        }
    }
}
