package bi;

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
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.ix0;
public final class ga extends View implements org.telegram.ui.Cells.x9 {
    public int E;
    public int F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public final ha J;
    public final PorterDuffColorFilter f3092a;
    public boolean f3093b;
    public final TextPaint f3094c;
    public final TextPaint d;
    public final Paint e;
    public final Paint f3095f;
    public float h;
    public float f3096n;
    public final fa[] f3097r;
    public int f3098s;
    public StaticLayout v;
    public float f3099w;
    public boolean f3100x;
    public final boolean f3101y;

    public ga(ha haVar, Context context) {
        super(context);
        this.J = haVar;
        TextPaint textPaint = new TextPaint(1);
        this.f3094c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        Paint paint = new Paint();
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.f3095f = paint2;
        this.f3097r = r7;
        this.f3098s = 0;
        new Path();
        this.f3101y = true;
        this.H = false;
        fa[] faVarArr = {new fa(this), null};
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
        this.f3092a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static StaticLayout a(ga gaVar, TextPaint textPaint, CharSequence charSequence, int i10) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT >= 24) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10).setBreakStrategy(0).setHyphenationFrequency(0);
            if (LocaleController.isRTL) {
                alignment = ix0.a();
            } else {
                Layout.Alignment[] alignmentArr = ix0.f25812a;
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

    public final void b(CharSequence charSequence, ca caVar, ca caVar2, boolean z10, boolean z11) {
        if (charSequence == null) {
            charSequence = "";
        }
        fa[] faVarArr = this.f3097r;
        if (MediaDataController.stringsEqual(faVarArr[0].f3039n, charSequence)) {
            fa faVar = faVarArr[0];
            if (faVar.f3040o == caVar && faVar.f3041p == caVar2) {
                faVar.f3042q = z10;
                invalidate();
                return;
            }
        }
        this.f3100x = false;
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.H = false;
        if (z11) {
            if (faVarArr[1] == null) {
                faVarArr[1] = new fa(this);
            }
            fa faVar2 = faVarArr[1];
            fa faVar3 = faVarArr[0];
            faVar2.g(faVar3.f3039n, faVar3.f3040o, faVar3.f3041p);
            fa faVar4 = faVarArr[1];
            fa faVar5 = faVarArr[0];
            faVar4.f3042q = faVar5.f3042q;
            faVar4.f3043r.d(faVar5.f3043r.f24885c, true);
            faVarArr[0].g(charSequence, caVar, caVar2);
            fa faVar6 = faVarArr[0];
            faVar6.f3042q = z10;
            faVar6.f3043r.d(0.0f, true);
            this.G = 1.0f;
            ValueAnimator valueAnimator2 = this.I;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.H = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, 0.0f);
            this.I = ofFloat;
            ofFloat.addUpdateListener(new ah.c0(this, 14));
            this.I.addListener(new ah.b(this, 13));
            this.I.setDuration(180L);
            this.I.setInterpolator(es.f24466g);
            this.I.start();
            return;
        }
        faVarArr[0].g(charSequence, caVar, caVar2);
        faVarArr[0].f3042q = z10;
        invalidate();
        this.G = 0.0f;
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: bi.ga.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public float getAnimatedHeight() {
        int i10 = this.F * 2;
        fa[] faVarArr = this.f3097r;
        int i11 = 0;
        int i12 = faVarArr[0].f3037l;
        fa faVar = faVarArr[1];
        if (faVar != null) {
            i11 = faVar.f3037l;
        }
        return AndroidUtilities.lerp(i12, i11, this.G) + i10;
    }

    public Paint getPaint() {
        return this.f3094c;
    }

    @Override
    public Layout getStaticTextLayout() {
        return this.f3097r[0].e;
    }

    @Override
    public CharSequence getText() {
        return this.f3097r[0].f3039n;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        fa faVar = this.f3097r[0];
        ga gaVar = faVar.v;
        org.telegram.ui.Components.b6.release(gaVar, faVar.d);
        org.telegram.ui.Components.b6.release(gaVar, faVar.f3032f);
        if (faVar.h == null) {
            return;
        }
        while (true) {
            da[] daVarArr = faVar.h;
            if (i10 < daVarArr.length) {
                da daVar = daVarArr[i10];
                if (daVar != null) {
                    org.telegram.ui.Components.b6.release(gaVar, daVar.f2962a);
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
        fa[] faVarArr = this.f3097r;
        faVarArr[0].b(canvas2, 1.0f - this.G);
        fa faVar = faVarArr[1];
        if (faVar != null) {
            faVar.b(canvas2, this.G);
        }
        if (this.v != null) {
            float scrollY = this.h + this.J.getScrollY();
            int clamp = (int) ((1.0f - Utilities.clamp(this.f3099w / 0.5f, 1.0f, 0.0f)) * 255.0f);
            Paint paint = this.f3095f;
            paint.setAlpha(clamp);
            Paint paint2 = this.e;
            paint2.setAlpha(clamp);
            this.d.setAlpha(clamp);
            canvas2.save();
            canvas2.translate(this.f3096n - AndroidUtilities.dp(32.0f), scrollY);
            canvas2.drawRect(0.0f, 0.0f, AndroidUtilities.dp(32.0f), this.v.getHeight() + this.F, paint);
            canvas2.restore();
            canvas2.drawRect(this.f3096n - AndroidUtilities.dp(16.0f), scrollY, getMeasuredWidth(), this.v.getHeight() + scrollY + this.F, paint2);
            canvas2.save();
            canvas2.translate(this.f3096n, scrollY);
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
        int i13 = this.f3098s;
        fa[] faVarArr = this.f3097r;
        int i14 = 0;
        if (i13 != i12) {
            this.f3098s = i12;
            int max = Math.max(0, View.MeasureSpec.getSize(i10) - (this.E * 2));
            faVarArr[0].e(max);
            fa faVar = faVarArr[1];
            if (faVar != null) {
                faVar.e(max);
            }
        }
        int i15 = this.F * 2;
        int i16 = faVarArr[0].f3037l;
        fa faVar2 = faVarArr[1];
        if (faVar2 != null) {
            i14 = faVar2.f3037l;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(i16, i14, this.G) + i15, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: bi.ga.onTouchEvent(android.view.MotionEvent):boolean");
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
        fa faVar;
        ca caVar;
        ca caVar2;
        ca caVar3;
        ca caVar4;
        fa[] faVarArr = this.f3097r;
        fa faVar2 = faVarArr[0];
        if ((faVar2 != null && (faVar2.f3044s == drawable || (((caVar3 = faVar2.f3040o) != null && caVar3.f2925j == drawable) || ((caVar4 = faVar2.f3041p) != null && caVar4.f2925j == drawable)))) || ((faVar = faVarArr[1]) != null && (faVar.f3044s == drawable || (((caVar = faVar.f3040o) != null && caVar.f2925j == drawable) || ((caVar2 = faVar.f3041p) != null && caVar2.f2925j == drawable))))) {
            return true;
        }
        return super.verifyDrawable(drawable);
    }
}
