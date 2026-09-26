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
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.uw0;
public final class wa extends View implements org.telegram.ui.Cells.z9 {
    public int E;
    public int F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public final xa J;
    public final PorterDuffColorFilter f1663a;
    public boolean f1664b;
    public final TextPaint f1665c;
    public final TextPaint d;
    public final Paint e;
    public final Paint f1666f;
    public float h;
    public float f1667n;
    public final va[] f1668r;
    public int f1669s;
    public StaticLayout v;
    public float f1670w;
    public boolean f1671x;
    public final boolean f1672y;

    public wa(xa xaVar, Context context) {
        super(context);
        this.J = xaVar;
        TextPaint textPaint = new TextPaint(1);
        this.f1665c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        Paint paint = new Paint();
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.f1666f = paint2;
        this.f1668r = r7;
        this.f1669s = 0;
        new Path();
        this.f1672y = true;
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
        this.f1663a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static StaticLayout a(wa waVar, TextPaint textPaint, CharSequence charSequence, int i10) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT >= 24) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10).setBreakStrategy(0).setHyphenationFrequency(0);
            if (LocaleController.isRTL) {
                alignment = uw0.a();
            } else {
                Layout.Alignment[] alignmentArr = uw0.f28935a;
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
        va[] vaVarArr = this.f1668r;
        if (MediaDataController.stringsEqual(vaVarArr[0].f1630n, charSequence)) {
            va vaVar = vaVarArr[0];
            if (vaVar.f1631o == saVar && vaVar.f1632p == saVar2) {
                vaVar.f1633q = z10;
                invalidate();
                return;
            }
        }
        this.f1671x = false;
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
            vaVar2.g(vaVar3.f1630n, vaVar3.f1631o, vaVar3.f1632p);
            va vaVar4 = vaVarArr[1];
            va vaVar5 = vaVarArr[0];
            vaVar4.f1633q = vaVar5.f1633q;
            vaVar4.f1634r.d(vaVar5.f1634r.f23844c, true);
            vaVarArr[0].g(charSequence, saVar, saVar2);
            va vaVar6 = vaVarArr[0];
            vaVar6.f1633q = z10;
            vaVar6.f1634r.d(0.0f, true);
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
            this.I.setInterpolator(rr.f28031g);
            this.I.start();
            return;
        }
        vaVarArr[0].g(charSequence, saVar, saVar2);
        vaVarArr[0].f1633q = z10;
        invalidate();
        this.G = 0.0f;
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: ai.wa.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public float getAnimatedHeight() {
        int i10 = this.F * 2;
        va[] vaVarArr = this.f1668r;
        int i11 = 0;
        int i12 = vaVarArr[0].f1628l;
        va vaVar = vaVarArr[1];
        if (vaVar != null) {
            i11 = vaVar.f1628l;
        }
        return AndroidUtilities.lerp(i12, i11, this.G) + i10;
    }

    public Paint getPaint() {
        return this.f1665c;
    }

    @Override
    public Layout getStaticTextLayout() {
        return this.f1668r[0].e;
    }

    @Override
    public CharSequence getText() {
        return this.f1668r[0].f1630n;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        va vaVar = this.f1668r[0];
        wa waVar = vaVar.v;
        org.telegram.ui.Components.z5.release(waVar, vaVar.d);
        org.telegram.ui.Components.z5.release(waVar, vaVar.f1623f);
        if (vaVar.h == null) {
            return;
        }
        while (true) {
            ta[] taVarArr = vaVar.h;
            if (i10 < taVarArr.length) {
                ta taVar = taVarArr[i10];
                if (taVar != null) {
                    org.telegram.ui.Components.z5.release(waVar, taVar.f1560a);
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
        va[] vaVarArr = this.f1668r;
        vaVarArr[0].b(canvas2, 1.0f - this.G);
        va vaVar = vaVarArr[1];
        if (vaVar != null) {
            vaVar.b(canvas2, this.G);
        }
        if (this.v != null) {
            float scrollY = this.h + this.J.getScrollY();
            int clamp = (int) ((1.0f - Utilities.clamp(this.f1670w / 0.5f, 1.0f, 0.0f)) * 255.0f);
            Paint paint = this.f1666f;
            paint.setAlpha(clamp);
            Paint paint2 = this.e;
            paint2.setAlpha(clamp);
            this.d.setAlpha(clamp);
            canvas2.save();
            canvas2.translate(this.f1667n - AndroidUtilities.dp(32.0f), scrollY);
            canvas2.drawRect(0.0f, 0.0f, AndroidUtilities.dp(32.0f), this.v.getHeight() + this.F, paint);
            canvas2.restore();
            canvas2.drawRect(this.f1667n - AndroidUtilities.dp(16.0f), scrollY, getMeasuredWidth(), this.v.getHeight() + scrollY + this.F, paint2);
            canvas2.save();
            canvas2.translate(this.f1667n, scrollY);
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
        int i13 = this.f1669s;
        va[] vaVarArr = this.f1668r;
        int i14 = 0;
        if (i13 != i12) {
            this.f1669s = i12;
            int max = Math.max(0, View.MeasureSpec.getSize(i10) - (this.E * 2));
            vaVarArr[0].e(max);
            va vaVar = vaVarArr[1];
            if (vaVar != null) {
                vaVar.e(max);
            }
        }
        int i15 = this.F * 2;
        int i16 = vaVarArr[0].f1628l;
        va vaVar2 = vaVarArr[1];
        if (vaVar2 != null) {
            i14 = vaVar2.f1628l;
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
        va[] vaVarArr = this.f1668r;
        va vaVar2 = vaVarArr[0];
        if ((vaVar2 != null && (vaVar2.f1635s == drawable || (((saVar3 = vaVar2.f1631o) != null && saVar3.f1518j == drawable) || ((saVar4 = vaVar2.f1632p) != null && saVar4.f1518j == drawable)))) || ((vaVar = vaVarArr[1]) != null && (vaVar.f1635s == drawable || (((saVar = vaVar.f1631o) != null && saVar.f1518j == drawable) || ((saVar2 = vaVar.f1632p) != null && saVar2.f1518j == drawable))))) {
            return true;
        }
        return super.verifyDrawable(drawable);
    }
}
