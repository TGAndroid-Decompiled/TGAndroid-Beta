package eg;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.y5;
import ph.f3;
public final class w extends View {
    public final Path f5560a;
    public final CornerPathEffect f5561b;
    public final TextPaint f5562c;
    public StaticLayout d;
    public float e;
    public SpannableStringBuilder f5563f;
    public final ArrayList h;
    public StaticLayout f5564n;
    public boolean f5565r;
    public float f5566s;
    public boolean v;
    public final Paint f5567w;
    public final Paint f5568x;
    public final LimitPreviewView f5569y;

    public w(LimitPreviewView limitPreviewView, Context context) {
        super(context);
        this.f5569y = limitPreviewView;
        this.f5560a = new Path();
        this.f5561b = new CornerPathEffect(AndroidUtilities.dp(6.0f));
        TextPaint textPaint = new TextPaint(1);
        this.f5562c = textPaint;
        this.h = new ArrayList();
        Paint paint = new Paint();
        this.f5567w = paint;
        Paint paint2 = new Paint();
        this.f5568x = paint2;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(22.0f));
        textPaint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.OVERLAY));
    }

    public static void a(w wVar) {
        ArrayList arrayList = wVar.h;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((v) arrayList.get(i10)).f5533f != null) {
                return;
            }
        }
        arrayList.clear();
        wVar.f5565r = false;
        wVar.invalidate();
    }

    public final void b() {
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(8.0f);
        float measuredWidth = getMeasuredWidth() * this.f5566s;
        float clamp = Utilities.clamp(AndroidUtilities.dp(8.0f) + measuredWidth, getMeasuredWidth(), 0.0f);
        float f10 = 10.0f;
        float clamp2 = Utilities.clamp(AndroidUtilities.dp(10.0f) + measuredWidth, getMeasuredWidth(), AndroidUtilities.dp(24.0f));
        if (this.f5566s >= 0.7f) {
            f10 = 24.0f;
        }
        float clamp3 = Utilities.clamp(measuredWidth - AndroidUtilities.dp(f10), getMeasuredWidth(), 0.0f);
        float clamp4 = Utilities.clamp(measuredWidth - AndroidUtilities.dp(8.0f), getMeasuredWidth(), 0.0f);
        Path path = this.f5560a;
        path.rewind();
        float f11 = measuredHeight;
        float f12 = f11 - (f11 / 2.0f);
        path.moveTo(clamp3, f12 - AndroidUtilities.dp(2.0f));
        path.lineTo(clamp3, f11);
        path.lineTo(clamp4, f11);
        path.lineTo(measuredWidth, AndroidUtilities.dp(8.0f) + measuredHeight);
        if (this.f5566s < 0.7f) {
            path.lineTo(clamp, f11);
        }
        path.lineTo(clamp2, f11);
        path.lineTo(clamp2, f12 - AndroidUtilities.dp(2.0f));
        path.close();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint e;
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(8.0f);
        LimitPreviewView limitPreviewView = this.f5569y;
        Paint paint = limitPreviewView.H;
        if (limitPreviewView.G) {
            measuredHeight = getMeasuredHeight();
            r1.d().f(LimitPreviewView.c(limitPreviewView) - getX(), -getTop(), limitPreviewView.getMeasuredWidth(), limitPreviewView.getMeasuredHeight());
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, AndroidUtilities.dp(3.0f), getMeasuredWidth(), measuredHeight - AndroidUtilities.dp(3.0f));
            float f10 = measuredHeight / 2.0f;
            r1 d = r1.d();
            if (d.f5484c == null) {
                d.f5484c = new Paint(1);
            }
            d.f5484c.setColor(j6.w0(null, j6.Oh, false));
            canvas.drawRoundRect(rectF, f10, f10, d.f5484c);
        } else {
            if (this.v) {
                this.v = false;
                b();
            }
            r1.d().f(LimitPreviewView.c(limitPreviewView) - getX(), -getTop(), limitPreviewView.getMeasuredWidth(), limitPreviewView.getMeasuredHeight());
            RectF rectF2 = AndroidUtilities.rectTmp;
            float f11 = measuredHeight;
            rectF2.set(0.0f, 0.0f, getMeasuredWidth(), f11);
            float f12 = f11 / 2.0f;
            boolean z4 = limitPreviewView.O;
            TextPaint textPaint = this.f5562c;
            if (z4) {
                e = paint;
            } else if (limitPreviewView.f23094b0 != null) {
                e = textPaint;
            } else {
                e = r1.d().e();
            }
            canvas.drawRoundRect(rectF2, f12, f12, e);
            Paint e6 = r1.d().e();
            CornerPathEffect cornerPathEffect = this.f5561b;
            e6.setPathEffect(cornerPathEffect);
            if (limitPreviewView.f23094b0 != null) {
                textPaint.setPathEffect(cornerPathEffect);
            }
            if (!limitPreviewView.O) {
                if (limitPreviewView.f23094b0 != null) {
                    paint = textPaint;
                } else {
                    paint = r1.d().e();
                }
            }
            canvas.drawPath(this.f5560a, paint);
            r1.d().e().setPathEffect(null);
            if (limitPreviewView.f23094b0 != null) {
                textPaint.setPathEffect(null);
            }
            if (limitPreviewView.f23092a0) {
                invalidate();
            }
        }
        int i10 = measuredHeight;
        if (limitPreviewView.f23094b0 != null) {
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f5567w, 31);
        }
        float measuredWidth = (getMeasuredWidth() - this.e) / 2.0f;
        float height = (i10 - this.d.getHeight()) / 2.0f;
        if (!this.f5565r) {
            if (this.d != null) {
                canvas.save();
                canvas.translate(measuredWidth, height);
                this.d.draw(canvas);
                canvas.restore();
            }
        } else {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(8.0f));
            if (this.f5564n != null) {
                canvas.save();
                canvas.translate(measuredWidth, height);
                this.f5564n.draw(canvas);
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
                boolean z10 = vVar.f5530a;
                ArrayList arrayList2 = vVar.f5531b;
                if (z10) {
                    canvas.translate(vVar.e + measuredWidth, ((i10 * vVar.f5532c) + height) - ((1 - arrayList2.size()) * i10));
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        canvas.translate(0.0f, -i10);
                        ((StaticLayout) arrayList2.get(i12)).draw(canvas);
                    }
                } else if (vVar.d) {
                    canvas.translate(vVar.e + measuredWidth, (height - ((i10 * 10) * vVar.f5532c)) + ((10 - arrayList2.size()) * i10));
                    for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                        canvas.translate(0.0f, i10);
                        ((StaticLayout) arrayList2.get(i13)).draw(canvas);
                    }
                } else {
                    canvas.translate(vVar.e + measuredWidth, (((i10 * 10) * vVar.f5532c) + height) - ((10 - arrayList2.size()) * i10));
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
        if (limitPreviewView.f23094b0 != null) {
            canvas.restore();
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f5568x, 31);
            canvas.drawRect(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f), getMeasuredWidth() - AndroidUtilities.dp(12.0f), getMeasuredHeight() - AndroidUtilities.dp(10.0f), ((y5) ((org.telegram.ui.a1) limitPreviewView.f23094b0).f32428b).t0(getX(), getY()));
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        SpannableStringBuilder spannableStringBuilder = this.f5563f;
        TextPaint textPaint = this.f5562c;
        this.e = f3.g(spannableStringBuilder, textPaint);
        this.d = new StaticLayout(this.f5563f, textPaint, AndroidUtilities.dp(12.0f) + ((int) this.e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = 0.0f;
        for (int i12 = 0; i12 < this.d.getLineCount(); i12++) {
            this.e = Math.max(this.e, this.d.getLineWidth(i12));
        }
        setMeasuredDimension((int) (this.e + getPaddingRight() + getPaddingLeft()), AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(44.0f));
        b();
    }

    @Override
    public final void setTranslationX(float f10) {
        if (f10 != getTranslationX()) {
            super.setTranslationX(f10);
            invalidate();
        }
    }
}
