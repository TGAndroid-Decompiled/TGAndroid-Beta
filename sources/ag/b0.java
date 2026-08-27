package ag;

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
import lh.w3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.v5;

public final class b0 extends View {

    public final Path f294a;

    public final CornerPathEffect f295b;

    public final TextPaint f296c;
    public StaticLayout d;

    public float f297e;

    public SpannableStringBuilder f298f;
    public final ArrayList h;

    public StaticLayout f299n;

    public boolean f300r;

    public float f301s;
    public boolean v;

    public final Paint f302w;

    public final Paint f303x;

    public final LimitPreviewView f304y;

    public b0(LimitPreviewView limitPreviewView, Context context) {
        super(context);
        this.f304y = limitPreviewView;
        this.f294a = new Path();
        this.f295b = new CornerPathEffect(AndroidUtilities.dp(6.0f));
        TextPaint textPaint = new TextPaint(1);
        this.f296c = textPaint;
        this.h = new ArrayList();
        Paint paint = new Paint();
        this.f302w = paint;
        Paint paint2 = new Paint();
        this.f303x = paint2;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(22.0f));
        textPaint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.OVERLAY));
    }

    public static void a(b0 b0Var) {
        ArrayList arrayList = b0Var.h;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((a0) arrayList.get(i10)).f284f != null) {
                return;
            }
        }
        arrayList.clear();
        b0Var.f300r = false;
        b0Var.invalidate();
    }

    public final void b() {
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(8.0f);
        float measuredWidth = getMeasuredWidth() * this.f301s;
        float fClamp = Utilities.clamp(AndroidUtilities.dp(8.0f) + measuredWidth, getMeasuredWidth(), 0.0f);
        float fClamp2 = Utilities.clamp(AndroidUtilities.dp(10.0f) + measuredWidth, getMeasuredWidth(), AndroidUtilities.dp(24.0f));
        float fClamp3 = Utilities.clamp(measuredWidth - AndroidUtilities.dp(this.f301s >= 0.7f ? 24.0f : 10.0f), getMeasuredWidth(), 0.0f);
        float fClamp4 = Utilities.clamp(measuredWidth - AndroidUtilities.dp(8.0f), getMeasuredWidth(), 0.0f);
        Path path = this.f294a;
        path.rewind();
        float f10 = measuredHeight;
        float f11 = f10 - (f10 / 2.0f);
        path.moveTo(fClamp3, f11 - AndroidUtilities.dp(2.0f));
        path.lineTo(fClamp3, f10);
        path.lineTo(fClamp4, f10);
        path.lineTo(measuredWidth, AndroidUtilities.dp(8.0f) + measuredHeight);
        if (this.f301s < 0.7f) {
            path.lineTo(fClamp, f10);
        }
        path.lineTo(fClamp2, f10);
        path.lineTo(fClamp2, f11 - AndroidUtilities.dp(2.0f));
        path.close();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(8.0f);
        LimitPreviewView limitPreviewView = this.f304y;
        Paint paintE = limitPreviewView.G;
        if (limitPreviewView.F) {
            measuredHeight = getMeasuredHeight();
            j2.d().f(limitPreviewView.getGlobalXOffset() - getX(), -getTop(), limitPreviewView.getMeasuredWidth(), limitPreviewView.getMeasuredHeight());
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, AndroidUtilities.dp(3.0f), getMeasuredWidth(), measuredHeight - AndroidUtilities.dp(3.0f));
            float f10 = measuredHeight / 2.0f;
            j2 j2VarD = j2.d();
            if (j2VarD.f494c == null) {
                j2VarD.f494c = new Paint(1);
            }
            j2VarD.f494c.setColor(g6.w0(null, g6.Oh, false));
            canvas.drawRoundRect(rectF, f10, f10, j2VarD.f494c);
        } else {
            if (this.v) {
                this.v = false;
                b();
            }
            j2.d().f(limitPreviewView.getGlobalXOffset() - getX(), -getTop(), limitPreviewView.getMeasuredWidth(), limitPreviewView.getMeasuredHeight());
            RectF rectF2 = AndroidUtilities.rectTmp;
            float f11 = measuredHeight;
            rectF2.set(0.0f, 0.0f, getMeasuredWidth(), f11);
            float f12 = f11 / 2.0f;
            boolean z10 = limitPreviewView.N;
            TextPaint textPaint = this.f296c;
            canvas.drawRoundRect(rectF2, f12, f12, z10 ? paintE : limitPreviewView.f26444a0 != null ? textPaint : j2.d().e());
            Paint paintE2 = j2.d().e();
            CornerPathEffect cornerPathEffect = this.f295b;
            paintE2.setPathEffect(cornerPathEffect);
            if (limitPreviewView.f26444a0 != null) {
                textPaint.setPathEffect(cornerPathEffect);
            }
            if (!limitPreviewView.N) {
                paintE = limitPreviewView.f26444a0 != null ? textPaint : j2.d().e();
            }
            canvas.drawPath(this.f294a, paintE);
            j2.d().e().setPathEffect(null);
            if (limitPreviewView.f26444a0 != null) {
                textPaint.setPathEffect(null);
            }
            if (limitPreviewView.W) {
                invalidate();
            }
        }
        int i10 = measuredHeight;
        if (limitPreviewView.f26444a0 != null) {
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f302w, 31);
        }
        float measuredWidth = (getMeasuredWidth() - this.f297e) / 2.0f;
        float height = (i10 - this.d.getHeight()) / 2.0f;
        if (this.f300r) {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(8.0f));
            if (this.f299n != null) {
                canvas.save();
                canvas.translate(measuredWidth, height);
                this.f299n.draw(canvas);
                canvas.restore();
            }
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i11 >= arrayList.size()) {
                    break;
                }
                a0 a0Var = (a0) arrayList.get(i11);
                canvas.save();
                boolean z11 = a0Var.f280a;
                ArrayList arrayList2 = a0Var.f281b;
                if (z11) {
                    canvas.translate(a0Var.f283e + measuredWidth, ((i10 * a0Var.f282c) + height) - ((1 - arrayList2.size()) * i10));
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        canvas.translate(0.0f, -i10);
                        ((StaticLayout) arrayList2.get(i12)).draw(canvas);
                    }
                } else if (a0Var.d) {
                    canvas.translate(a0Var.f283e + measuredWidth, (height - ((i10 * 10) * a0Var.f282c)) + ((10 - arrayList2.size()) * i10));
                    for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                        canvas.translate(0.0f, i10);
                        ((StaticLayout) arrayList2.get(i13)).draw(canvas);
                    }
                } else {
                    canvas.translate(a0Var.f283e + measuredWidth, (((i10 * 10) * a0Var.f282c) + height) - ((10 - arrayList2.size()) * i10));
                    for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                        canvas.translate(0.0f, -i10);
                        ((StaticLayout) arrayList2.get(i14)).draw(canvas);
                    }
                }
                canvas.restore();
                i11++;
            }
            canvas.restore();
        } else if (this.d != null) {
            canvas.save();
            canvas.translate(measuredWidth, height);
            this.d.draw(canvas);
            canvas.restore();
        }
        if (limitPreviewView.f26444a0 != null) {
            canvas.restore();
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f303x, 31);
            canvas.drawRect(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f), getMeasuredWidth() - AndroidUtilities.dp(12.0f), getMeasuredHeight() - AndroidUtilities.dp(10.0f), ((v5) ((org.telegram.ui.c1) limitPreviewView.f26444a0).f36910b).t0(getX(), getY()));
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        SpannableStringBuilder spannableStringBuilder = this.f298f;
        TextPaint textPaint = this.f296c;
        this.f297e = w3.g(spannableStringBuilder, textPaint);
        this.d = new StaticLayout(this.f298f, textPaint, AndroidUtilities.dp(12.0f) + ((int) this.f297e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f297e = 0.0f;
        for (int i12 = 0; i12 < this.d.getLineCount(); i12++) {
            this.f297e = Math.max(this.f297e, this.d.getLineWidth(i12));
        }
        setMeasuredDimension((int) (this.f297e + getPaddingRight() + getPaddingLeft()), AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(44.0f));
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
