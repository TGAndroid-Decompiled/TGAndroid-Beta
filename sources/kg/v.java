package kg;

import android.animation.ValueAnimator;
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
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.wy;
import org.telegram.ui.t5;
import vh.p2;
public final class v extends View {
    public final LimitPreviewView D;
    public final Path f11280a;
    public final CornerPathEffect f11281b;
    public final TextPaint f11282c;
    public StaticLayout d;
    public float e;
    public SpannableStringBuilder f11283f;
    public final ArrayList h;
    public StaticLayout f11284n;
    public boolean f11285r;
    public float f11286s;
    public boolean f11287w;
    public final Paint f11288x;
    public final Paint f11289y;

    public v(LimitPreviewView limitPreviewView, Context context) {
        super(context);
        this.D = limitPreviewView;
        this.f11280a = new Path();
        this.f11281b = new CornerPathEffect(org.telegram.messenger.i0.L(6.0f));
        TextPaint textPaint = new TextPaint(1);
        this.f11282c = textPaint;
        this.h = new ArrayList();
        Paint paint = new Paint();
        this.f11288x = paint;
        Paint paint2 = new Paint();
        this.f11289y = paint2;
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint.setTextSize(org.telegram.messenger.i0.L(22.0f));
        textPaint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.OVERLAY));
    }

    public static void a(v vVar) {
        ArrayList arrayList = vVar.h;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((u) arrayList.get(i10)).f11276f != null) {
                return;
            }
        }
        arrayList.clear();
        vVar.f11285r = false;
        vVar.invalidate();
    }

    public final void b(SpannableStringBuilder spannableStringBuilder, boolean z10) {
        TextPaint textPaint;
        char c10;
        if (!z10) {
            this.f11283f = spannableStringBuilder;
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = this.f11283f;
        this.f11283f = spannableStringBuilder;
        if (this.d != null) {
            ArrayList arrayList = this.h;
            arrayList.clear();
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(this.f11283f);
            int length = this.f11283f.length() - 1;
            int i10 = 0;
            while (true) {
                textPaint = this.f11282c;
                if (length < 0) {
                    break;
                }
                if (length < spannableStringBuilder2.length()) {
                    c10 = spannableStringBuilder2.charAt(length);
                } else {
                    c10 = ' ';
                }
                if (c10 != this.f11283f.charAt(length) && Character.isDigit(this.f11283f.charAt(length))) {
                    u uVar = new u();
                    arrayList.add(uVar);
                    uVar.e = this.d.getSecondaryHorizontal(length);
                    uVar.f11273a = true;
                    if (i10 >= 1) {
                        i10 = 0;
                    }
                    i10++;
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    StaticLayout staticLayout = new StaticLayout("" + c10, textPaint, (int) this.e, alignment, 1.0f, 0.0f, false);
                    ArrayList arrayList2 = uVar.f11274b;
                    arrayList2.add(staticLayout);
                    arrayList2.add(new StaticLayout("" + this.f11283f.charAt(length), textPaint, (int) this.e, alignment, 1.0f, 0.0f, false));
                    spannableStringBuilder3.setSpan(new wy(false), length, length + 1, 0);
                }
                length--;
            }
            this.f11284n = new StaticLayout(spannableStringBuilder3, textPaint, org.telegram.messenger.i0.L(12.0f) + ((int) this.e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                this.f11285r = true;
                u uVar2 = (u) arrayList.get(i11);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                uVar2.f11276f = ofFloat;
                ofFloat.addUpdateListener(new s(this, uVar2, 0));
                uVar2.f11276f.addListener(new t(this, uVar2, 1));
                uVar2.f11276f.setInterpolator(gr.f26524g);
                uVar2.f11276f.setDuration(250L);
                uVar2.f11276f.setStartDelay(((arrayList.size() - 1) - i11) * 60);
                uVar2.f11276f.start();
            }
        }
    }

    public final void c() {
        int measuredHeight = getMeasuredHeight() - org.telegram.messenger.i0.L(8.0f);
        float measuredWidth = getMeasuredWidth() * this.f11286s;
        float i10 = Utilities.i(org.telegram.messenger.i0.L(8.0f) + measuredWidth, getMeasuredWidth(), 0.0f);
        float f7 = 10.0f;
        float i11 = Utilities.i(org.telegram.messenger.i0.L(10.0f) + measuredWidth, getMeasuredWidth(), org.telegram.messenger.i0.L(24.0f));
        if (this.f11286s >= 0.7f) {
            f7 = 24.0f;
        }
        float i12 = Utilities.i(measuredWidth - org.telegram.messenger.i0.L(f7), getMeasuredWidth(), 0.0f);
        float i13 = Utilities.i(measuredWidth - org.telegram.messenger.i0.L(8.0f), getMeasuredWidth(), 0.0f);
        Path path = this.f11280a;
        path.rewind();
        float f10 = measuredHeight;
        float f11 = f10 - (f10 / 2.0f);
        path.moveTo(i12, f11 - org.telegram.messenger.i0.L(2.0f));
        path.lineTo(i12, f10);
        path.lineTo(i13, f10);
        path.lineTo(measuredWidth, org.telegram.messenger.i0.L(8.0f) + measuredHeight);
        if (this.f11286s < 0.7f) {
            path.lineTo(i10, f10);
        }
        path.lineTo(i11, f10);
        path.lineTo(i11, f11 - org.telegram.messenger.i0.L(2.0f));
        path.close();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float globalXOffset;
        Paint e;
        float globalXOffset2;
        int measuredHeight = getMeasuredHeight() - org.telegram.messenger.i0.L(8.0f);
        LimitPreviewView limitPreviewView = this.D;
        Paint paint = limitPreviewView.K;
        if (limitPreviewView.J) {
            measuredHeight = getMeasuredHeight();
            ea.f d = ea.f.d();
            int measuredWidth = limitPreviewView.getMeasuredWidth();
            int measuredHeight2 = limitPreviewView.getMeasuredHeight();
            globalXOffset2 = limitPreviewView.getGlobalXOffset();
            d.f(globalXOffset2 - getX(), -getTop(), measuredWidth, measuredHeight2);
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(0.0f, org.telegram.messenger.i0.L(3.0f), getMeasuredWidth(), measuredHeight - org.telegram.messenger.i0.L(3.0f));
            float f7 = measuredHeight / 2.0f;
            ea.f d10 = ea.f.d();
            if (((Paint) d10.d) == null) {
                d10.d = new Paint(1);
            }
            ((Paint) d10.d).setColor(t6.x0(null, t6.Ci, false));
            canvas.drawRoundRect(rectF, f7, f7, (Paint) d10.d);
        } else {
            if (this.f11287w) {
                this.f11287w = false;
                c();
            }
            ea.f d11 = ea.f.d();
            int measuredWidth2 = limitPreviewView.getMeasuredWidth();
            int measuredHeight3 = limitPreviewView.getMeasuredHeight();
            globalXOffset = limitPreviewView.getGlobalXOffset();
            d11.f(globalXOffset - getX(), -getTop(), measuredWidth2, measuredHeight3);
            RectF rectF2 = org.telegram.messenger.i0.P;
            float f10 = measuredHeight;
            rectF2.set(0.0f, 0.0f, getMeasuredWidth(), f10);
            float f11 = f10 / 2.0f;
            boolean z10 = limitPreviewView.R;
            TextPaint textPaint = this.f11282c;
            if (z10) {
                e = paint;
            } else if (limitPreviewView.f24105e0 != null) {
                e = textPaint;
            } else {
                e = ea.f.d().e();
            }
            canvas.drawRoundRect(rectF2, f11, f11, e);
            Paint e7 = ea.f.d().e();
            CornerPathEffect cornerPathEffect = this.f11281b;
            e7.setPathEffect(cornerPathEffect);
            if (limitPreviewView.f24105e0 != null) {
                textPaint.setPathEffect(cornerPathEffect);
            }
            if (!limitPreviewView.R) {
                if (limitPreviewView.f24105e0 != null) {
                    paint = textPaint;
                } else {
                    paint = ea.f.d().e();
                }
            }
            canvas.drawPath(this.f11280a, paint);
            ea.f.d().e().setPathEffect(null);
            if (limitPreviewView.f24105e0 != null) {
                textPaint.setPathEffect(null);
            }
            if (limitPreviewView.f24104d0) {
                invalidate();
            }
        }
        int i10 = measuredHeight;
        if (limitPreviewView.f24105e0 != null) {
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f11288x, 31);
        }
        float measuredWidth3 = (getMeasuredWidth() - this.e) / 2.0f;
        float height = (i10 - this.d.getHeight()) / 2.0f;
        if (!this.f11285r) {
            if (this.d != null) {
                canvas.save();
                canvas.translate(measuredWidth3, height);
                this.d.draw(canvas);
                canvas.restore();
            }
        } else {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.i0.L(8.0f));
            if (this.f11284n != null) {
                canvas.save();
                canvas.translate(measuredWidth3, height);
                this.f11284n.draw(canvas);
                canvas.restore();
            }
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i11 >= arrayList.size()) {
                    break;
                }
                u uVar = (u) arrayList.get(i11);
                canvas.save();
                boolean z11 = uVar.f11273a;
                ArrayList arrayList2 = uVar.f11274b;
                if (z11) {
                    canvas.translate(uVar.e + measuredWidth3, ((i10 * uVar.f11275c) + height) - ((1 - arrayList2.size()) * i10));
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        canvas.translate(0.0f, -i10);
                        ((StaticLayout) arrayList2.get(i12)).draw(canvas);
                    }
                } else if (uVar.d) {
                    canvas.translate(uVar.e + measuredWidth3, (height - ((i10 * 10) * uVar.f11275c)) + ((10 - arrayList2.size()) * i10));
                    for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                        canvas.translate(0.0f, i10);
                        ((StaticLayout) arrayList2.get(i13)).draw(canvas);
                    }
                } else {
                    canvas.translate(uVar.e + measuredWidth3, (((i10 * 10) * uVar.f11275c) + height) - ((10 - arrayList2.size()) * i10));
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
        if (limitPreviewView.f24105e0 != null) {
            canvas.restore();
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f11289y, 31);
            canvas.drawRect(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(10.0f), getMeasuredWidth() - org.telegram.messenger.i0.L(12.0f), getMeasuredHeight() - org.telegram.messenger.i0.L(10.0f), ((t5) ((org.telegram.ui.y0) limitPreviewView.f24105e0).f43494b).v0(getX(), getY()));
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        SpannableStringBuilder spannableStringBuilder = this.f11283f;
        TextPaint textPaint = this.f11282c;
        this.e = p2.g(spannableStringBuilder, textPaint);
        this.d = new StaticLayout(this.f11283f, textPaint, org.telegram.messenger.i0.L(12.0f) + ((int) this.e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = 0.0f;
        for (int i12 = 0; i12 < this.d.getLineCount(); i12++) {
            this.e = Math.max(this.e, this.d.getLineWidth(i12));
        }
        setMeasuredDimension((int) (this.e + getPaddingRight() + getPaddingLeft()), org.telegram.messenger.i0.L(8.0f) + org.telegram.messenger.i0.L(44.0f));
        c();
    }

    @Override
    public final void setTranslationX(float f7) {
        if (f7 != getTranslationX()) {
            super.setTranslationX(f7);
            invalidate();
        }
    }
}
