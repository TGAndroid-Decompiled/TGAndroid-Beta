package fg;

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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.y5;
import qh.e3;
public final class w extends View {
    public final Path f6609a;
    public final CornerPathEffect f6610b;
    public final TextPaint f6611c;
    public StaticLayout d;
    public float f6612e;
    public SpannableStringBuilder f6613f;
    public final ArrayList h;
    public StaticLayout f6614n;
    public boolean f6615r;
    public float f6616s;
    public boolean v;
    public final Paint f6617w;
    public final Paint f6618x;
    public final LimitPreviewView f6619y;

    public w(LimitPreviewView limitPreviewView, Context context) {
        super(context);
        this.f6619y = limitPreviewView;
        this.f6609a = new Path();
        this.f6610b = new CornerPathEffect(AndroidUtilities.dp(6.0f));
        TextPaint textPaint = new TextPaint(1);
        this.f6611c = textPaint;
        this.h = new ArrayList();
        Paint paint = new Paint();
        this.f6617w = paint;
        Paint paint2 = new Paint();
        this.f6618x = paint2;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(22.0f));
        textPaint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.OVERLAY));
    }

    public static void a(w wVar) {
        ArrayList arrayList = wVar.h;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((v) arrayList.get(i10)).f6580f != null) {
                return;
            }
        }
        arrayList.clear();
        wVar.f6615r = false;
        wVar.invalidate();
    }

    public final void b() {
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(8.0f);
        float measuredWidth = getMeasuredWidth() * this.f6616s;
        float clamp = Utilities.clamp(AndroidUtilities.dp(8.0f) + measuredWidth, getMeasuredWidth(), 0.0f);
        float f10 = 10.0f;
        float clamp2 = Utilities.clamp(AndroidUtilities.dp(10.0f) + measuredWidth, getMeasuredWidth(), AndroidUtilities.dp(24.0f));
        if (this.f6616s >= 0.7f) {
            f10 = 24.0f;
        }
        float clamp3 = Utilities.clamp(measuredWidth - AndroidUtilities.dp(f10), getMeasuredWidth(), 0.0f);
        float clamp4 = Utilities.clamp(measuredWidth - AndroidUtilities.dp(8.0f), getMeasuredWidth(), 0.0f);
        Path path = this.f6609a;
        path.rewind();
        float f11 = measuredHeight;
        float f12 = f11 - (f11 / 2.0f);
        path.moveTo(clamp3, f12 - AndroidUtilities.dp(2.0f));
        path.lineTo(clamp3, f11);
        path.lineTo(clamp4, f11);
        path.lineTo(measuredWidth, AndroidUtilities.dp(8.0f) + measuredHeight);
        if (this.f6616s < 0.7f) {
            path.lineTo(clamp, f11);
        }
        path.lineTo(clamp2, f11);
        path.lineTo(clamp2, f12 - AndroidUtilities.dp(2.0f));
        path.close();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint e6;
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(8.0f);
        LimitPreviewView limitPreviewView = this.f6619y;
        Paint paint = limitPreviewView.H;
        if (limitPreviewView.G) {
            measuredHeight = getMeasuredHeight();
            q1.d().f(LimitPreviewView.c(limitPreviewView) - getX(), -getTop(), limitPreviewView.getMeasuredWidth(), limitPreviewView.getMeasuredHeight());
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, AndroidUtilities.dp(3.0f), getMeasuredWidth(), measuredHeight - AndroidUtilities.dp(3.0f));
            float f10 = measuredHeight / 2.0f;
            q1 d = q1.d();
            if (d.f6515c == null) {
                d.f6515c = new Paint(1);
            }
            d.f6515c.setColor(k6.w0(null, k6.Oh, false));
            canvas.drawRoundRect(rectF, f10, f10, d.f6515c);
        } else {
            if (this.v) {
                this.v = false;
                b();
            }
            q1.d().f(LimitPreviewView.c(limitPreviewView) - getX(), -getTop(), limitPreviewView.getMeasuredWidth(), limitPreviewView.getMeasuredHeight());
            RectF rectF2 = AndroidUtilities.rectTmp;
            float f11 = measuredHeight;
            rectF2.set(0.0f, 0.0f, getMeasuredWidth(), f11);
            float f12 = f11 / 2.0f;
            boolean z4 = limitPreviewView.O;
            TextPaint textPaint = this.f6611c;
            if (z4) {
                e6 = paint;
            } else if (limitPreviewView.f24949b0 != null) {
                e6 = textPaint;
            } else {
                e6 = q1.d().e();
            }
            canvas.drawRoundRect(rectF2, f12, f12, e6);
            Paint e10 = q1.d().e();
            CornerPathEffect cornerPathEffect = this.f6610b;
            e10.setPathEffect(cornerPathEffect);
            if (limitPreviewView.f24949b0 != null) {
                textPaint.setPathEffect(cornerPathEffect);
            }
            if (!limitPreviewView.O) {
                if (limitPreviewView.f24949b0 != null) {
                    paint = textPaint;
                } else {
                    paint = q1.d().e();
                }
            }
            canvas.drawPath(this.f6609a, paint);
            q1.d().e().setPathEffect(null);
            if (limitPreviewView.f24949b0 != null) {
                textPaint.setPathEffect(null);
            }
            if (limitPreviewView.f24947a0) {
                invalidate();
            }
        }
        int i10 = measuredHeight;
        if (limitPreviewView.f24949b0 != null) {
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f6617w, 31);
        }
        float measuredWidth = (getMeasuredWidth() - this.f6612e) / 2.0f;
        float height = (i10 - this.d.getHeight()) / 2.0f;
        if (!this.f6615r) {
            if (this.d != null) {
                canvas.save();
                canvas.translate(measuredWidth, height);
                this.d.draw(canvas);
                canvas.restore();
            }
        } else {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(8.0f));
            if (this.f6614n != null) {
                canvas.save();
                canvas.translate(measuredWidth, height);
                this.f6614n.draw(canvas);
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
                boolean z10 = vVar.f6576a;
                ArrayList arrayList2 = vVar.f6577b;
                if (z10) {
                    canvas.translate(vVar.f6579e + measuredWidth, ((i10 * vVar.f6578c) + height) - ((1 - arrayList2.size()) * i10));
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        canvas.translate(0.0f, -i10);
                        ((StaticLayout) arrayList2.get(i12)).draw(canvas);
                    }
                } else if (vVar.d) {
                    canvas.translate(vVar.f6579e + measuredWidth, (height - ((i10 * 10) * vVar.f6578c)) + ((10 - arrayList2.size()) * i10));
                    for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                        canvas.translate(0.0f, i10);
                        ((StaticLayout) arrayList2.get(i13)).draw(canvas);
                    }
                } else {
                    canvas.translate(vVar.f6579e + measuredWidth, (((i10 * 10) * vVar.f6578c) + height) - ((10 - arrayList2.size()) * i10));
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
        if (limitPreviewView.f24949b0 != null) {
            canvas.restore();
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f6618x, 31);
            canvas.drawRect(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f), getMeasuredWidth() - AndroidUtilities.dp(12.0f), getMeasuredHeight() - AndroidUtilities.dp(10.0f), ((y5) ((org.telegram.ui.a1) limitPreviewView.f24949b0).f34976b).t0(getX(), getY()));
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        SpannableStringBuilder spannableStringBuilder = this.f6613f;
        TextPaint textPaint = this.f6611c;
        this.f6612e = e3.g(spannableStringBuilder, textPaint);
        this.d = new StaticLayout(this.f6613f, textPaint, AndroidUtilities.dp(12.0f) + ((int) this.f6612e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f6612e = 0.0f;
        for (int i12 = 0; i12 < this.d.getLineCount(); i12++) {
            this.f6612e = Math.max(this.f6612e, this.d.getLineWidth(i12));
        }
        setMeasuredDimension((int) (this.f6612e + getPaddingRight() + getPaddingLeft()), AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(44.0f));
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
