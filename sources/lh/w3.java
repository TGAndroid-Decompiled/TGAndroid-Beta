package lh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.ReplacementSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.q80;
import org.telegram.ui.zk0;

public class w3 extends View {
    public float A;
    public Paint A0;
    public final Paint B;
    public LinearGradient B0;
    public CharSequence C;
    public Matrix C0;
    public final org.telegram.ui.Components.i6 D;
    public LinearGradient D0;
    public boolean E;
    public long E0;
    public final TextPaint F;
    public final RectF F0;
    public Layout.Alignment G;
    public q80 G0;
    public StaticLayout H;
    public org.telegram.ui.Components.p5 I;
    public float J;
    public float K;
    public float L;
    public final m80 M;
    public float N;
    public float O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public final org.telegram.ui.Components.y5 S;
    public org.telegram.ui.Cells.z T;
    public Paint U;
    public oi0 V;
    public float W;

    public int f16972a;

    public int f16973a0;

    public float f16974b;

    public int f16975b0;

    public float f16976c;

    public int f16977c0;
    public long d;

    public boolean f16978d0;

    public boolean f16979e;

    public float f16980e0;

    public final boolean f16981f;

    public float f16982f0;

    public int f16983g0;
    public int h;

    public Runnable f16984h0;

    public final zk0 f16985i0;

    public ValueAnimator f16986j0;

    public float f16987k0;

    public final org.telegram.ui.Components.nc f16988l0;
    public final Rect m0;

    public Drawable f16989n;

    public final RectF f16990n0;

    public final RectF f16991o0;

    public final Path f16992p0;

    public float f16993q0;

    public boolean f16994r;

    public float f16995r0;

    public boolean f16996s;

    public float f16997s0;

    public float f16998t0;

    public boolean f16999u0;
    public float v;

    public boolean f17000v0;

    public final RectF f17001w;

    public boolean f17002w0;

    public float f17003x;

    public Path f17004x0;

    public float f17005y;

    public float f17006y0;

    public Paint f17007z0;

    public w3(Context context, int i10) {
        super(context);
        this.f16974b = 0.5f;
        this.f16976c = 0.0f;
        this.d = 3500L;
        this.f16979e = true;
        this.f16981f = true;
        this.h = -1;
        this.f16996s = true;
        this.v = AndroidUtilities.dp(8.0f);
        this.f17001w = new RectF(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(7.0f));
        this.f17003x = AndroidUtilities.dp(2.0f);
        this.f17005y = AndroidUtilities.dp(7.0f);
        this.A = AndroidUtilities.dp(6.0f);
        Paint paint = new Paint(1);
        this.B = paint;
        TextPaint textPaint = new TextPaint(1);
        this.F = textPaint;
        this.G = Layout.Alignment.ALIGN_NORMAL;
        this.M = new m80();
        this.P = true;
        this.Q = true;
        er erVar = er.h;
        this.S = new org.telegram.ui.Components.y5(this, 350L, erVar);
        this.f16973a0 = AndroidUtilities.dp(2.0f);
        this.f16985i0 = new zk0(this, 27);
        this.f16987k0 = 1.0f;
        this.f16988l0 = new org.telegram.ui.Components.nc(this, 2.0f, 5.0f);
        this.m0 = new Rect();
        this.f16990n0 = new RectF();
        this.f16991o0 = new RectF();
        this.f16992p0 = new Path();
        this.f17000v0 = true;
        this.F0 = new RectF();
        this.f16972a = i10;
        paint.setColor(-433575896);
        paint.setPathEffect(new CornerPathEffect(this.v));
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(true, true, false, false);
        this.D = i6Var;
        i6Var.k(0.4f, 320L, erVar);
        i6Var.setCallback(this);
        u(14.0f);
        i6Var.r(-1);
        textPaint.setColor(-1);
    }

    public static int a(CharSequence charSequence, TextPaint textPaint) {
        if (TextUtils.indexOf(charSequence, '\n') >= 0) {
            return Integer.MAX_VALUE;
        }
        int length = charSequence.length() / 2;
        float f10 = 0.0f;
        float fG = 0.0f;
        float fG2 = 0.0f;
        float f11 = Float.MAX_VALUE;
        int i10 = 0;
        int i11 = -1;
        while (i10 < 10) {
            while (length > 0 && length < charSequence.length() && charSequence.charAt(length) != ' ') {
                length += i11;
            }
            fG = g(charSequence.subSequence(0, length), textPaint);
            fG2 = g(AndroidUtilities.getTrimmedString(charSequence.subSequence(length, charSequence.length())), textPaint);
            if (fG == f10 && fG2 == f11) {
                break;
            }
            if (fG < fG2) {
                length++;
                i11 = 1;
            } else {
                length--;
                i11 = -1;
            }
            if (length <= 0 || length >= charSequence.length()) {
                break;
            }
            i10++;
            f10 = fG;
            f11 = fG2;
        }
        return (int) Math.ceil(Math.max(fG, fG2));
    }

    public static CharSequence b(CharSequence charSequence, TextPaint textPaint) {
        int i10;
        if (TextUtils.indexOf(charSequence, '\n') >= 0) {
            return charSequence;
        }
        int length = charSequence.length() / 2;
        int i11 = length;
        float f10 = 0.0f;
        float f11 = Float.MAX_VALUE;
        int i12 = 0;
        int i13 = -1;
        while (true) {
            int i14 = 1;
            if (i12 >= 10) {
                break;
            }
            length = i11;
            while (length > 0 && length < charSequence.length() && charSequence.charAt(length) != ' ') {
                length += i13;
            }
            float fG = g(charSequence.subSequence(0, length), textPaint);
            float fG2 = g(AndroidUtilities.getTrimmedString(charSequence.subSequence(length, charSequence.length())), textPaint);
            if (fG == f10 && fG2 == f11) {
                break;
            }
            if (fG < fG2) {
                i10 = length + 1;
            } else {
                i10 = length - 1;
                i14 = -1;
            }
            if (i10 <= 0 || i10 >= charSequence.length()) {
                return charSequence;
            }
            i12++;
            int i15 = i10;
            f10 = fG;
            i11 = i15;
            f11 = fG2;
            i13 = i14;
        }
        return TextUtils.concat(AndroidUtilities.getTrimmedString(charSequence.subSequence(0, length)), "\n", AndroidUtilities.getTrimmedString(charSequence.subSequence(length, charSequence.length())));
    }

    public static float g(CharSequence charSequence, TextPaint textPaint) {
        float fMeasureText = 0.0f;
        if (charSequence == null) {
            return 0.0f;
        }
        if (!(charSequence instanceof Spanned)) {
            return textPaint.measureText(charSequence.toString());
        }
        Spanned spanned = (Spanned) charSequence;
        k41[] k41VarArr = (k41[]) spanned.getSpans(0, charSequence.length(), k41.class);
        ReplacementSpan[] replacementSpanArr = (ReplacementSpan[]) spanned.getSpans(0, charSequence.length(), ReplacementSpan.class);
        int i10 = 0;
        int iMax = 0;
        TextPaint textPaint2 = textPaint;
        while (i10 < replacementSpanArr.length) {
            ReplacementSpan replacementSpan = replacementSpanArr[i10];
            int spanStart = spanned.getSpanStart(replacementSpan);
            int spanEnd = spanned.getSpanEnd(replacementSpan);
            CharSequence charSequence2 = charSequence;
            TextPaint textPaint3 = textPaint2;
            iMax = (int) (Math.max(0.0f, replacementSpan.getSize(textPaint3, charSequence2, spanStart, spanEnd, textPaint2.getFontMetricsInt()) - textPaint3.measureText(spanned, spanStart, spanEnd)) + iMax);
            i10++;
            textPaint2 = textPaint3;
            charSequence = charSequence2;
        }
        CharSequence charSequence3 = charSequence;
        TextPaint textPaint4 = textPaint2;
        if (k41VarArr == null || k41VarArr.length == 0) {
            return textPaint4.measureText(charSequence3.toString()) + iMax;
        }
        int iMax2 = 0;
        for (int i11 = 0; i11 < k41VarArr.length; i11++) {
            int spanStart2 = spanned.getSpanStart(k41VarArr[i11]);
            int spanEnd2 = spanned.getSpanEnd(k41VarArr[i11]);
            int iMax3 = Math.max(iMax2, spanStart2);
            if (iMax3 - iMax2 > 0) {
                fMeasureText += textPaint4.measureText(spanned, iMax2, iMax3);
            }
            iMax2 = Math.max(iMax3, spanEnd2);
            if (iMax2 - iMax3 > 0) {
                Typeface typeface = textPaint4.getTypeface();
                textPaint4.setTypeface(k41VarArr[i11].f29944a);
                float fMeasureText2 = textPaint4.measureText(spanned, iMax3, iMax2) + fMeasureText;
                textPaint4.setTypeface(typeface);
                fMeasureText = fMeasureText2;
            }
        }
        int iMax4 = Math.max(iMax2, charSequence3.length());
        if (iMax4 - iMax2 > 0) {
            fMeasureText += textPaint4.measureText(spanned, iMax2, iMax4);
        }
        return fMeasureText + iMax;
    }

    private int getTextMaxWidth() {
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        RectF rectF = this.f17001w;
        int iMin = measuredWidth - ((int) (rectF.left + rectF.right));
        int i10 = this.h;
        if (i10 > 0) {
            iMin = Math.min(i10, iMin);
        }
        return Math.max(0, iMin);
    }

    public void c(Canvas canvas, float f10) {
        int i10 = this.f16983g0;
        Paint paint = this.B;
        if (i10 != 0) {
            paint.setShadowLayer(this.f16980e0, 0.0f, this.f16982f0, org.telegram.ui.ActionBar.g6.l1(f10, i10));
        }
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f10));
        Path path = this.f16992p0;
        canvas.drawPath(path, paint);
        paint.setAlpha(alpha);
        if (this.f17002w0) {
            int iDp = AndroidUtilities.dp(64.0f);
            float fCurrentTimeMillis = (((this.f16997s0 * 4.0f) + (iDp * 2)) * (((System.currentTimeMillis() - this.E0) % 4000) / 4000.0f)) + (-iDp);
            this.C0.reset();
            this.C0.postTranslate(this.f16990n0.left + fCurrentTimeMillis, 0.0f);
            this.B0.setLocalMatrix(this.C0);
            this.D0.setLocalMatrix(this.C0);
            canvas.drawPath(path, this.f17007z0);
            canvas.drawPath(this.f17004x0, this.A0);
            invalidate();
        }
    }

    public final void d(Path path, float f10, float f11, float f12, RectF rectF, Rect rect) {
        float fClamp;
        float f13 = f10 / 2.0f;
        float f14 = f11 / 2.0f;
        float fMin = Math.min(this.v, Math.min(f13, f14));
        int i10 = this.f16972a;
        if (i10 == 1 || i10 == 3) {
            float fClamp2 = Utilities.clamp(AndroidUtilities.lerp(getPaddingLeft(), getMeasuredWidth() - getPaddingRight(), this.f16974b) + this.f16976c, getMeasuredWidth() - getPaddingRight(), getPaddingLeft());
            float fMin2 = Math.min(Math.max(getPaddingLeft(), fClamp2 - f13) + f10, getMeasuredWidth() - getPaddingRight());
            float f15 = fMin2 - f10;
            float f16 = this.f17005y;
            float fClamp3 = Utilities.clamp(fClamp2, (fMin2 - fMin) - f16, f15 + fMin + f16);
            if (this.f16972a == 1) {
                rectF.set(f15, getPaddingTop() + this.A, fMin2, getPaddingTop() + this.A + f11);
            } else {
                rectF.set(f15, ((getMeasuredHeight() - this.A) - getPaddingBottom()) - f11, fMin2, (getMeasuredHeight() - this.A) - getPaddingBottom());
            }
            fClamp = fClamp3;
        } else {
            float fClamp4 = Utilities.clamp(AndroidUtilities.lerp(getPaddingTop(), getMeasuredHeight() - getPaddingBottom(), this.f16974b) + this.f16976c, getMeasuredHeight() - getPaddingBottom(), getPaddingTop());
            float fMin3 = Math.min(Math.max(getPaddingTop(), fClamp4 - f14) + f11, getMeasuredHeight() - getPaddingBottom());
            float f17 = fMin3 - f11;
            float f18 = this.f17005y;
            fClamp = Utilities.clamp(fClamp4, (fMin3 - fMin) - f18, f17 + fMin + f18);
            if (this.f16972a == 0) {
                rectF.set(getPaddingLeft() + this.A, f17, getPaddingLeft() + this.A + f10, fMin3);
            } else {
                rectF.set(((getMeasuredWidth() - getPaddingRight()) - this.A) - f10, f17, (getMeasuredWidth() - getPaddingRight()) - this.A, fMin3);
            }
        }
        float f19 = -f12;
        rectF.inset(f19, f19);
        if (rect != null) {
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        }
        path.rewind();
        boolean z10 = this.f16996s;
        RectF rectF2 = this.F0;
        if (z10) {
            path.moveTo(rectF.left, rectF.bottom);
        } else {
            float f20 = rectF.left;
            float f21 = rectF.bottom;
            float f22 = fMin * 2.0f;
            rectF2.set(f20, f21 - f22, f22 + f20, f21);
            path.arcTo(rectF2, 90.0f, 90.0f);
        }
        if (this.f16972a == 0) {
            path.lineTo(rectF.left, this.f17005y + fClamp + AndroidUtilities.dp(2.0f));
            path.lineTo(rectF.left, this.f17005y + fClamp);
            path.lineTo(rectF.left - this.A, AndroidUtilities.dp(1.0f) + fClamp);
            float f23 = rectF.left - this.A;
            this.f16993q0 = f23;
            this.f16995r0 = fClamp;
            path.lineTo(f23, fClamp - AndroidUtilities.dp(1.0f));
            path.lineTo(rectF.left, fClamp - this.f17005y);
            path.lineTo(rectF.left, (fClamp - this.f17005y) - AndroidUtilities.dp(2.0f));
            if (rect != null) {
                rect.left = (int) (rect.left - this.A);
            }
        }
        if (this.f16996s) {
            path.lineTo(rectF.left, rectF.top);
        } else {
            float f24 = rectF.left;
            float f25 = rectF.top;
            float f26 = fMin * 2.0f;
            rectF2.set(f24, f25, f24 + f26, f26 + f25);
            path.arcTo(rectF2, 180.0f, 90.0f);
        }
        if (this.f16972a == 1) {
            path.lineTo((fClamp - this.f17005y) - AndroidUtilities.dp(2.0f), rectF.top);
            path.lineTo(fClamp - this.f17005y, rectF.top);
            path.lineTo(fClamp - AndroidUtilities.dp(1.0f), rectF.top - this.A);
            this.f16993q0 = fClamp;
            this.f16995r0 = rectF.top - this.A;
            path.lineTo(AndroidUtilities.dp(1.0f) + fClamp, rectF.top - this.A);
            path.lineTo(this.f17005y + fClamp, rectF.top);
            path.lineTo(this.f17005y + fClamp + AndroidUtilities.dp(2.0f), rectF.top);
            if (rect != null) {
                rect.top = (int) (rect.top - this.A);
            }
        }
        if (this.f16996s) {
            path.lineTo(rectF.right, rectF.top);
        } else {
            float f27 = rectF.right;
            float f28 = fMin * 2.0f;
            float f29 = rectF.top;
            rectF2.set(f27 - f28, f29, f27, f28 + f29);
            path.arcTo(rectF2, 270.0f, 90.0f);
        }
        if (this.f16972a == 2) {
            path.lineTo(rectF.right, (fClamp - this.f17005y) - AndroidUtilities.dp(2.0f));
            path.lineTo(rectF.right, fClamp - this.f17005y);
            path.lineTo(rectF.right + this.A, fClamp - AndroidUtilities.dp(1.0f));
            float f30 = rectF.right + this.A;
            this.f16993q0 = f30;
            this.f16995r0 = fClamp;
            path.lineTo(f30, AndroidUtilities.dp(1.0f) + fClamp);
            path.lineTo(rectF.right, this.f17005y + fClamp);
            path.lineTo(rectF.right, this.f17005y + fClamp + AndroidUtilities.dp(2.0f));
            if (rect != null) {
                rect.right = (int) (rect.right + this.A);
            }
        }
        if (this.f16996s) {
            path.lineTo(rectF.right, rectF.bottom);
        } else {
            float f31 = rectF.right;
            float f32 = fMin * 2.0f;
            float f33 = rectF.bottom;
            rectF2.set(f31 - f32, f33 - f32, f31, f33);
            path.arcTo(rectF2, 0.0f, 90.0f);
        }
        if (this.f16972a == 3) {
            path.lineTo(this.f17005y + fClamp + AndroidUtilities.dp(2.0f), rectF.bottom);
            path.lineTo(this.f17005y + fClamp, rectF.bottom);
            path.lineTo(AndroidUtilities.dp(1.0f) + fClamp, rectF.bottom + this.A);
            this.f16993q0 = fClamp;
            this.f16995r0 = rectF.bottom + this.A;
            path.lineTo(fClamp - AndroidUtilities.dp(1.0f), rectF.bottom + this.A);
            path.lineTo(fClamp - this.f17005y, rectF.bottom);
            path.lineTo((fClamp - this.f17005y) - AndroidUtilities.dp(2.0f), rectF.bottom);
            if (rect != null) {
                rect.bottom = (int) (rect.bottom + this.A);
            }
        }
        path.close();
        this.f16999u0 = true;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        RectF rectF;
        float f10;
        float f11;
        w3 w3Var;
        float f12;
        Canvas canvas2;
        if (this.E && this.H == null) {
            return;
        }
        float fE = this.S.e(this.R && !this.f17000v0);
        if (this.f17000v0) {
            this.f17000v0 = false;
            invalidate();
        }
        if (fE <= 0.0f) {
            return;
        }
        boolean z10 = this.E;
        org.telegram.ui.Components.i6 i6Var = this.D;
        float fD = z10 ? this.K : i6Var.d();
        float fMax = this.E ? this.L : i6Var.f29241e;
        if (this.f16994r) {
            if (this.f16989n == null) {
                Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.msg_mini_close_tooltip).mutate();
                this.f16989n = drawableMutate;
                drawableMutate.setColorFilter(new PorterDuffColorFilter(2113929215, PorterDuff.Mode.MULTIPLY));
            }
            fD += this.f17003x + this.f16989n.getIntrinsicWidth();
            fMax = Math.max(this.f16989n.getIntrinsicHeight(), fMax);
        }
        if (this.V != null) {
            fD += this.f16975b0 + this.f16973a0;
            fMax = Math.max(this.f16977c0, fMax);
        }
        float f13 = fD;
        RectF rectF2 = this.f17001w;
        float f14 = rectF2.left + f13 + rectF2.right;
        float f15 = rectF2.top + fMax + rectF2.bottom;
        boolean z11 = this.f16999u0;
        RectF rectF3 = this.f16990n0;
        if (!z11 || Math.abs(f14 - this.f16997s0) > 0.1f || Math.abs(f15 - this.f16998t0) > 0.1f) {
            this.f16997s0 = f14;
            this.f16998t0 = f15;
            d(this.f16992p0, f14, f15, 0.0f, rectF3, this.m0);
            rectF = rectF3;
            if (this.f17002w0) {
                d(this.f17004x0, f14, f15, this.f17006y0, this.f16991o0, null);
            }
        } else {
            rectF = rectF3;
        }
        float f16 = this.f16981f ? fE : 1.0f;
        canvas.save();
        if (fE < 1.0f && this.f16979e) {
            float fLerp = AndroidUtilities.lerp(0.75f, 1.0f, fE);
            canvas.scale(fLerp, fLerp, this.f16993q0, this.f16995r0);
        }
        float fA = this.f16988l0.a(0.025f);
        if (fA != 1.0f) {
            canvas.scale(fA, fA, this.f16993q0, this.f16995r0);
        }
        if (this.f16987k0 != 1.0f) {
            int i10 = this.f16972a;
            if (i10 == 3 || i10 == 1) {
                canvas.translate(0.0f, (this.f16987k0 - 1.0f) * Math.max(i10 == 3 ? getPaddingBottom() : getPaddingTop(), AndroidUtilities.dp(24.0f)) * (this.f16972a != 1 ? 1 : -1));
            } else {
                canvas.translate((this.f16987k0 - 1.0f) * Math.max(i10 == 0 ? getPaddingLeft() : getPaddingRight(), AndroidUtilities.dp(24.0f)) * (this.f16972a != 0 ? 1 : -1), 0.0f);
            }
        }
        RectF rectF4 = AndroidUtilities.rectTmp;
        rectF4.set(rectF);
        float f17 = -this.A;
        rectF4.inset(f17, f17);
        c(canvas, f16);
        org.telegram.ui.Cells.z zVar = this.T;
        if (zVar != null) {
            zVar.setAlpha((int) (f16 * 255.0f));
            this.T.setBounds(this.m0);
            this.T.draw(canvas);
        }
        float f18 = ((rectF.top + rectF2.top) + (rectF.bottom - rectF2.bottom)) / 2.0f;
        oi0 oi0Var = this.V;
        if (oi0Var != null) {
            if (this.f16978d0) {
                float f19 = (rectF2.left / 2.0f) + rectF.left + 0.0f;
                float f20 = this.W + f18;
                f10 = 255.0f;
                float f21 = this.f16977c0 / 2.0f;
                oi0Var.setBounds((int) f19, (int) (f20 - f21), (int) (f19 + this.f16975b0), (int) (f21 + f20));
                f11 = this.f16975b0 + this.f16973a0 + 0.0f;
            } else {
                f10 = 255.0f;
                float f22 = (0.0f + rectF.right) - (rectF2.right / 2.0f);
                int i11 = (int) (f22 - this.f16975b0);
                float f23 = this.W + f18;
                float f24 = this.f16977c0 / 2.0f;
                oi0Var.setBounds(i11, (int) (f23 - f24), (int) f22, (int) (f24 + f23));
                f11 = 0.0f;
            }
            this.V.setAlpha((int) (f16 * f10));
            this.V.draw(canvas);
        } else {
            f10 = 255.0f;
            f11 = 0.0f;
        }
        if (this.E) {
            f12 = f16;
            w3Var = this;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), Math.max(getHeight(), f15), (int) (f16 * f10), 31);
            float f25 = ((f11 + rectF.left) + rectF2.left) - w3Var.J;
            w3Var.N = f25;
            float f26 = f18 - (w3Var.L / 2.0f);
            w3Var.O = f26;
            canvas2.translate(f25, f26);
            if (w3Var.M.f(canvas2)) {
                w3Var.invalidate();
            }
            w3Var.H.draw(canvas2);
            org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas2, w3Var.H, w3Var.I, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas2.restore();
        } else {
            w3Var = this;
            f12 = f16;
            canvas2 = canvas;
            CharSequence charSequence = w3Var.C;
            if (charSequence != null) {
                i6Var.q(charSequence, w3Var.R, true);
                w3Var.C = null;
            }
            float f27 = rectF.left;
            float f28 = rectF2.left;
            float f29 = w3Var.L / 2.0f;
            i6Var.setBounds((int) (f11 + f27 + f28), (int) (f18 - f29), (int) (f27 + f28 + f13), (int) (f29 + f18));
            i6Var.f29257w = (int) (f12 * f10);
            i6Var.draw(canvas2);
        }
        if (w3Var.f16994r) {
            if (w3Var.f16989n == null) {
                Drawable drawableMutate2 = w3Var.getContext().getResources().getDrawable(R.drawable.msg_mini_close_tooltip).mutate();
                w3Var.f16989n = drawableMutate2;
                drawableMutate2.setColorFilter(new PorterDuffColorFilter(2113929215, PorterDuff.Mode.MULTIPLY));
            }
            w3Var.f16989n.setAlpha((int) (f12 * f10));
            Drawable drawable = w3Var.f16989n;
            drawable.setBounds((int) ((rectF.right - (rectF2.right * 0.66f)) - drawable.getIntrinsicWidth()), (int) (rectF.centerY() - (w3Var.f16989n.getIntrinsicHeight() / 2.0f)), (int) (rectF.right - (rectF2.right * 0.66f)), (int) ((w3Var.f16989n.getIntrinsicHeight() / 2.0f) + rectF.centerY()));
            w3Var.f16989n.draw(canvas2);
        }
        canvas2.restore();
    }

    public final void e(boolean z10) {
        AndroidUtilities.cancelRunOnUIThread(this.f16985i0);
        Runnable runnable = this.f16984h0;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        this.R = false;
        org.telegram.ui.Components.y5 y5Var = this.S;
        if (!z10) {
            y5Var.getClass();
            y5Var.d(0.0f, false);
        }
        invalidate();
        Runnable runnable2 = this.f16984h0;
        if (runnable2 != null) {
            AndroidUtilities.runOnUIThread(runnable2, (long) (y5Var.f34812c * y5Var.f34815g));
        }
        this.M.d(true);
    }

    public final void f(int i10, CharSequence charSequence) {
        this.H = new StaticLayout(charSequence, this.F, i10, this.G, 1.0f, 0.0f, false);
        float fMin = i10;
        float fMax = 0.0f;
        for (int i11 = 0; i11 < this.H.getLineCount(); i11++) {
            fMin = Math.min(fMin, this.H.getLineLeft(i11));
            fMax = Math.max(fMax, this.H.getLineRight(i11));
        }
        this.K = Math.max(0.0f, fMax - fMin);
        this.L = this.H.getHeight();
        this.J = fMin;
        this.I = org.telegram.ui.Components.t5.update(0, this, this.I, this.H);
    }

    public CharSequence getText() {
        CharSequence charSequence = this.C;
        if (charSequence != null) {
            return charSequence;
        }
        if (!this.E) {
            return this.D.f29243g;
        }
        StaticLayout staticLayout = this.H;
        if (staticLayout != null) {
            return staticLayout.getText();
        }
        return null;
    }

    public TextPaint getTextPaint() {
        return this.E ? this.F : this.D.f29238a;
    }

    public final void h(int i10) {
        Paint paint = this.B;
        if (paint.getColor() != i10) {
            paint.setColor(i10);
            invalidate();
        }
    }

    public final void i() {
        this.f16994r = true;
        if (this.E) {
            return;
        }
        this.f17001w.set(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(this.f16994r ? 15.0f : 11.0f), AndroidUtilities.dp(7.0f));
    }

    public final void j(int i10) {
        oi0 oi0Var = new oi0(i10, AndroidUtilities.dp(34.0f), i0.a.k(i10, ""), AndroidUtilities.dp(34.0f));
        oi0Var.start();
        k(oi0Var);
    }

    public final void k(oi0 oi0Var) {
        oi0 oi0Var2 = this.V;
        if (oi0Var2 != null) {
            oi0Var2.setCallback(null);
        }
        this.V = oi0Var;
        oi0Var.setCallback(this);
        oi0 oi0Var3 = this.V;
        if (com.google.android.recaptcha.internal.a.u(oi0Var3)) {
            this.d = Math.max(this.d, oi0Var3.p());
        }
        oi0 oi0Var4 = this.V;
        this.f16975b0 = oi0Var4.f31307b;
        this.f16977c0 = oi0Var4.f31309c;
        this.f16978d0 = true;
    }

    public final void l(float f10, float f11, float f12, float f13) {
        this.f17001w.set(AndroidUtilities.dpf2(f10), AndroidUtilities.dpf2(f11), AndroidUtilities.dpf2(f12), AndroidUtilities.dpf2(f13));
    }

    public final void m(float f10, float f11) {
        if (Math.abs(this.f16974b - f10) >= 1.0f || Math.abs(this.f16976c - AndroidUtilities.dp(f11)) >= 1.0f) {
            this.f16999u0 = false;
            invalidate();
        }
        this.f16974b = f10;
        this.f16976c = AndroidUtilities.dp(f11);
    }

    public final void n(float f10, float f11) {
        if (Math.abs(this.f16974b - f10) >= 1.0f || Math.abs(this.f16976c - f11) >= 1.0f) {
            this.f16999u0 = false;
            invalidate();
        }
        this.f16974b = f10;
        this.f16976c = f11;
    }

    public final void o() {
        this.h = AndroidUtilities.dp(165.0f);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.t5.release(this, this.I);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        this.f16999u0 = false;
        int textMaxWidth = getTextMaxWidth();
        org.telegram.ui.Components.i6 i6Var = this.D;
        i6Var.G = textMaxWidth;
        if (this.E) {
            CharSequence text = this.C;
            if (text == null) {
                StaticLayout staticLayout = this.H;
                if (staticLayout == null) {
                    return;
                } else {
                    text = staticLayout.getText();
                }
            }
            StaticLayout staticLayout2 = this.H;
            if (staticLayout2 == null || staticLayout2.getWidth() != textMaxWidth) {
                f(textMaxWidth, text);
            }
        } else {
            CharSequence charSequence = this.C;
            if (charSequence != null) {
                i6Var.q(charSequence, false, true);
            }
        }
        this.C = null;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Cells.z zVar;
        org.telegram.ui.Cells.z zVar2;
        ClickableSpan clickableSpan;
        CharacterStyle characterStyle;
        if ((this.P || hasOnClickListeners()) && this.R) {
            if (this.H != null) {
                int x8 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                StaticLayout staticLayout = this.H;
                if (staticLayout == null) {
                    clickableSpan = null;
                } else {
                    int i10 = (int) (x8 - this.N);
                    int i11 = (int) (y10 - this.O);
                    int lineForVertical = staticLayout.getLineForVertical(i11);
                    float f10 = i10;
                    int offsetForHorizontal = this.H.getOffsetForHorizontal(lineForVertical, f10);
                    float lineLeft = this.H.getLineLeft(lineForVertical);
                    if (lineLeft > f10 || this.H.getLineWidth(lineForVertical) + lineLeft < f10 || i11 < 0 || i11 > this.H.getHeight()) {
                        clickableSpan = null;
                    } else {
                        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(this.H.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                        if (clickableSpanArr.length == 0 || AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                            clickableSpan = null;
                        } else {
                            clickableSpan = clickableSpanArr[0];
                        }
                    }
                }
                zk0 zk0Var = this.f16985i0;
                m80 m80Var = this.M;
                if (clickableSpan != null && motionEvent.getAction() == 0) {
                    q80 q80Var = new q80(clickableSpan, null, motionEvent.getX(), motionEvent.getY(), 0);
                    this.G0 = q80Var;
                    m80Var.a(q80Var, null);
                    SpannableString spannableString = new SpannableString(this.H.getText());
                    int spanStart = spannableString.getSpanStart(this.G0.f31841i);
                    int spanEnd = spannableString.getSpanEnd(this.G0.f31841i);
                    j80 j80VarB = this.G0.b();
                    j80VarB.d(this.H, spanStart, 0.0f);
                    this.H.getSelectionPath(spanStart, spanEnd, j80VarB);
                    invalidate();
                    AndroidUtilities.runOnUIThread(new gh.z(this, q80Var, clickableSpan), ViewConfiguration.getLongPressTimeout());
                    AndroidUtilities.cancelRunOnUIThread(zk0Var);
                    return true;
                }
                if (motionEvent.getAction() == 1) {
                    m80Var.d(true);
                    invalidate();
                    AndroidUtilities.cancelRunOnUIThread(zk0Var);
                    long j10 = this.d;
                    if (j10 > 0) {
                        AndroidUtilities.runOnUIThread(zk0Var, j10);
                    }
                    q80 q80Var2 = this.G0;
                    if (q80Var2 != null && (characterStyle = q80Var2.f31841i) == clickableSpan) {
                        if (characterStyle != null) {
                            ((ClickableSpan) characterStyle).onClick(this);
                        }
                        this.G0 = null;
                        return true;
                    }
                    this.G0 = null;
                }
                if (motionEvent.getAction() == 3) {
                    m80Var.d(true);
                    invalidate();
                    AndroidUtilities.cancelRunOnUIThread(zk0Var);
                    long j11 = this.d;
                    if (j11 > 0) {
                        AndroidUtilities.runOnUIThread(zk0Var, j11);
                    }
                    this.G0 = null;
                }
            }
            if (this.G0 == null) {
                float x10 = motionEvent.getX();
                float y11 = motionEvent.getY();
                int action = motionEvent.getAction();
                org.telegram.ui.Components.nc ncVar = this.f16988l0;
                if (action == 0) {
                    if (this.f16990n0.contains(motionEvent.getX() - 0.0f, motionEvent.getY() - 0.0f)) {
                        ncVar.c(true);
                        org.telegram.ui.Cells.z zVar3 = this.T;
                        if (zVar3 != null) {
                            zVar3.setHotspot(x10, y11);
                            this.T.setState(new int[]{16842919, 16842910});
                            return true;
                        }
                    } else if (motionEvent.getAction() == 1) {
                        if (hasOnClickListeners()) {
                            performClick();
                        } else if (this.P) {
                            e(true);
                        }
                        ncVar.c(false);
                        zVar2 = this.T;
                        if (zVar2 != null) {
                            zVar2.setState(new int[0]);
                            return true;
                        }
                    } else if (motionEvent.getAction() == 3) {
                        ncVar.c(false);
                        zVar = this.T;
                        if (zVar != null) {
                            zVar.setState(new int[0]);
                        }
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (hasOnClickListeners()) {
                        performClick();
                    } else if (this.P) {
                        e(true);
                    }
                    ncVar.c(false);
                    zVar2 = this.T;
                    if (zVar2 != null) {
                        zVar2.setState(new int[0]);
                        return true;
                    }
                } else if (motionEvent.getAction() == 3) {
                    ncVar.c(false);
                    zVar = this.T;
                    if (zVar != null) {
                        zVar.setState(new int[0]);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void p(int i10) {
        this.h = i10;
    }

    public final void q(boolean z10) {
        this.E = z10;
        RectF rectF = this.f17001w;
        if (z10) {
            rectF.set(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(8.0f));
            this.f17003x = AndroidUtilities.dp(6.0f);
        } else {
            rectF.set(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(this.f16994r ? 15.0f : 11.0f), AndroidUtilities.dp(7.0f));
            this.f17003x = AndroidUtilities.dp(2.0f);
        }
    }

    public final void r(float f10) {
        this.v = AndroidUtilities.dp(f10);
        this.B.setPathEffect(this.f16996s ? new CornerPathEffect(this.v) : null);
        Paint paint = this.U;
        if (paint != null) {
            paint.setPathEffect(this.f16996s ? new CornerPathEffect(this.v) : null);
        }
    }

    public final void s() {
        this.f16996s = false;
        this.B.setPathEffect(null);
    }

    public final void t(CharSequence charSequence) {
        if (getMeasuredWidth() < 0) {
            this.C = charSequence;
        } else if (this.E) {
            f(getTextMaxWidth(), charSequence);
        } else {
            this.D.q(charSequence, false, true);
        }
    }

    public final void u(float f10) {
        this.D.t(AndroidUtilities.dpf2(f10));
        this.F.setTextSize(AndroidUtilities.dpf2(f10));
    }

    public final void v() {
        if (this.R && this.Q) {
            ValueAnimator valueAnimator = this.f16986j0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f16986j0 = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f16986j0 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new m2(this, 2));
            this.f16986j0.addListener(new ag.r1(this, 25));
            this.f16986j0.setInterpolator(er.f28126k);
            this.f16986j0.setDuration(300L);
            this.f16986j0.start();
        }
        AndroidUtilities.makeAccessibilityAnnouncement(getText());
        this.R = true;
        invalidate();
        zk0 zk0Var = this.f16985i0;
        AndroidUtilities.cancelRunOnUIThread(zk0Var);
        long j10 = this.d;
        if (j10 > 0) {
            AndroidUtilities.runOnUIThread(zk0Var, j10);
        }
        Runnable runnable = this.f16984h0;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.D || drawable == this.T || drawable == this.V || super.verifyDrawable(drawable);
    }
}
