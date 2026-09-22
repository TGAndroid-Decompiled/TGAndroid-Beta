package ai;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.qr;
public final class wa extends View implements org.telegram.ui.Cells.z9 {
    public int E;
    public int F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public final xa J;
    public final PorterDuffColorFilter f1665a;
    public boolean f1666b;
    public final TextPaint f1667c;
    public final TextPaint d;
    public final Paint e;
    public final Paint f1668f;
    public float h;
    public float f1669n;
    public final va[] f1670r;
    public int f1671s;
    public StaticLayout v;
    public float f1672w;
    public boolean f1673x;
    public final boolean f1674y;

    public wa(xa xaVar, Context context) {
        super(context);
        this.J = xaVar;
        TextPaint textPaint = new TextPaint(1);
        this.f1667c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        Paint paint = new Paint();
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.f1668f = paint2;
        this.f1670r = r7;
        this.f1671s = 0;
        new Path();
        this.f1674y = true;
        this.H = false;
        va[] vaVarArr = {new va(this), null};
        textPaint.setColor(-1);
        textPaint.linkColor = -1;
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint2.setColor(-1);
        textPaint2.setTypeface(AndroidUtilities.bold());
        textPaint2.setTextSize(AndroidUtilities.dp(16.0f));
        paint.setColor(-16777216);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(16.0f), 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f1665a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static StaticLayout a(wa waVar, TextPaint textPaint, CharSequence charSequence, int i10) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT >= 24) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10).setBreakStrategy(0).setHyphenationFrequency(0);
            if (LocaleController.isRTL) {
                alignment = jw0.a();
            } else {
                Layout.Alignment[] alignmentArr = jw0.f25443a;
                if (alignmentArr.length >= 5) {
                    alignment = alignmentArr[3];
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            return hyphenationFrequency.setAlignment(alignment).build();
        }
        return new StaticLayout(charSequence, textPaint, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    public final void b(CharSequence charSequence, sa saVar, sa saVar2, boolean z10, boolean z11) {
        if (charSequence == null) {
            charSequence = "";
        }
        va[] vaVarArr = this.f1670r;
        if (MediaDataController.stringsEqual(vaVarArr[0].f1626n, charSequence)) {
            va vaVar = vaVarArr[0];
            if (vaVar.f1627o == saVar && vaVar.f1628p == saVar2) {
                vaVar.f1629q = z10;
                invalidate();
                return;
            }
        }
        this.f1673x = false;
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.H = false;
        if (z11) {
            if (vaVarArr[1] == null) {
                vaVarArr[1] = new va(this);
            }
            va vaVar2 = vaVarArr[1];
            va vaVar3 = vaVarArr[0];
            vaVar2.g(vaVar3.f1626n, vaVar3.f1627o, vaVar3.f1628p);
            va vaVar4 = vaVarArr[1];
            va vaVar5 = vaVarArr[0];
            vaVar4.f1629q = vaVar5.f1629q;
            vaVar4.f1630r.d(vaVar5.f1630r.f22951c, true);
            vaVarArr[0].g(charSequence, saVar, saVar2);
            va vaVar6 = vaVarArr[0];
            vaVar6.f1629q = z10;
            vaVar6.f1630r.d(0.0f, true);
            this.G = 1.0f;
            ValueAnimator valueAnimator2 = this.I;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.H = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, 0.0f);
            this.I = ofFloat;
            ofFloat.addUpdateListener(new a(this, 13));
            this.I.addListener(new b(this, 10));
            this.I.setDuration(180L);
            this.I.setInterpolator(qr.f27421g);
            this.I.start();
            return;
        }
        vaVarArr[0].g(charSequence, saVar, saVar2);
        vaVarArr[0].f1629q = z10;
        invalidate();
        this.G = 0.0f;
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: ai.wa.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public float getAnimatedHeight() {
        int i10 = this.F * 2;
        va[] vaVarArr = this.f1670r;
        int i11 = 0;
        int i12 = vaVarArr[0].f1624l;
        va vaVar = vaVarArr[1];
        if (vaVar != null) {
            i11 = vaVar.f1624l;
        }
        return AndroidUtilities.lerp(i12, i11, this.G) + i10;
    }

    public Paint getPaint() {
        return this.f1667c;
    }

    @Override
    public Layout getStaticTextLayout() {
        return this.f1670r[0].e;
    }

    @Override
    public CharSequence getText() {
        return this.f1670r[0].f1626n;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        va vaVar = this.f1670r[0];
        wa waVar = vaVar.v;
        org.telegram.ui.Components.x5.release(waVar, vaVar.d);
        org.telegram.ui.Components.x5.release(waVar, vaVar.f1619f);
        if (vaVar.h == null) {
            return;
        }
        while (true) {
            ta[] taVarArr = vaVar.h;
            if (i10 < taVarArr.length) {
                ta taVar = taVarArr[i10];
                if (taVar != null) {
                    org.telegram.ui.Components.x5.release(waVar, taVar.f1554a);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.v != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.save();
        }
        va[] vaVarArr = this.f1670r;
        vaVarArr[0].b(canvas2, 1.0f - this.G);
        va vaVar = vaVarArr[1];
        if (vaVar != null) {
            vaVar.b(canvas2, this.G);
        }
        if (this.v != null) {
            float scrollY = this.h + this.J.getScrollY();
            int clamp = (int) ((1.0f - Utilities.clamp(this.f1672w / 0.5f, 1.0f, 0.0f)) * 255.0f);
            Paint paint = this.f1668f;
            paint.setAlpha(clamp);
            Paint paint2 = this.e;
            paint2.setAlpha(clamp);
            this.d.setAlpha(clamp);
            canvas2.save();
            canvas2.translate(this.f1669n - AndroidUtilities.dp(32.0f), scrollY);
            canvas2.drawRect(0.0f, 0.0f, AndroidUtilities.dp(32.0f), this.v.getHeight() + this.F, paint);
            canvas2.restore();
            canvas2.drawRect(this.f1669n - AndroidUtilities.dp(16.0f), scrollY, getMeasuredWidth(), this.v.getHeight() + scrollY + this.F, paint2);
            canvas2.save();
            canvas2.translate(this.f1669n, scrollY);
            this.v.draw(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = (i11 + i10) << 16;
        this.E = AndroidUtilities.dp(16.0f);
        this.F = AndroidUtilities.dp(8.0f);
        int i13 = this.f1671s;
        va[] vaVarArr = this.f1670r;
        int i14 = 0;
        if (i13 != i12) {
            this.f1671s = i12;
            int max = Math.max(0, View.MeasureSpec.getSize(i10) - (this.E * 2));
            vaVarArr[0].e(max);
            va vaVar = vaVarArr[1];
            if (vaVar != null) {
                vaVar.e(max);
            }
        }
        int i15 = this.F * 2;
        int i16 = vaVarArr[0].f1624l;
        va vaVar2 = vaVarArr[1];
        if (vaVar2 != null) {
            i14 = vaVar2.f1624l;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(i16, i14, this.G) + i15, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: ai.wa.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setPressed(boolean z10) {
        boolean z11;
        if (z10 != isPressed()) {
            z11 = true;
        } else {
            z11 = false;
        }
        super.setPressed(z10);
        if (z11) {
            invalidate();
        }
    }

    @Override
    public void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            this.J.invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        va vaVar;
        sa saVar;
        sa saVar2;
        sa saVar3;
        sa saVar4;
        va[] vaVarArr = this.f1670r;
        va vaVar2 = vaVarArr[0];
        if ((vaVar2 != null && (vaVar2.f1631s == drawable || (((saVar3 = vaVar2.f1627o) != null && saVar3.f1516j == drawable) || ((saVar4 = vaVar2.f1628p) != null && saVar4.f1516j == drawable)))) || ((vaVar = vaVarArr[1]) != null && (vaVar.f1631s == drawable || (((saVar = vaVar.f1627o) != null && saVar.f1516j == drawable) || ((saVar2 = vaVar.f1628p) != null && saVar2.f1516j == drawable))))) {
            return true;
        }
        return super.verifyDrawable(drawable);
    }
}
