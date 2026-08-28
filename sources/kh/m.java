package kh;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.pt;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.zr0;
public abstract class m extends FrameLayout {
    public final LinearGradient A;
    public nz0 A0;
    public final Matrix B;
    public Path B0;
    public Bitmap C;
    public Paint C0;
    public final TextPaint D;
    public Path D0;
    public final Paint E;
    public float[] E0;
    public final FrameLayout F;
    public final Path F0;
    public final xu0 G;
    public boolean G0;
    public final b4 H;
    public int H0;
    public i I;
    public final org.telegram.ui.Components.y5 I0;
    public int J;
    public Paint J0;
    public final org.telegram.ui.Components.ba K;
    public RadialGradient K0;
    public final org.telegram.ui.Components.fa L;
    public Paint L0;
    public final org.telegram.ui.Components.fa M;
    public RadialGradient M0;
    public final org.telegram.ui.Components.fa N;
    public Matrix N0;
    public final org.telegram.ui.Components.fa O;
    public org.telegram.ui.Components.fa P;
    public int Q;
    public boolean R;
    public boolean S;
    public int T;
    public int U;
    public final e V;
    public Utilities.CallbackVoidReturn W;
    public org.telegram.ui.ActionBar.b6 f15623a;
    public boolean f15624a0;
    public final FrameLayout f15625b;
    public final org.telegram.ui.Components.pc f15626b0;
    public final ig.i f15627c;
    public ObjectAnimator f15628c0;
    public final ig.i d;
    public ig.a f15629d0;
    public final Paint f15630e;
    public kg.d f15631e0;
    public final g f15632f;
    public Utilities.Callback f15633f0;
    public Utilities.Callback f15634g0;
    public final Drawable h;
    public ObjectAnimator f15635h0;
    public boolean f15636i0;
    public final e f15637j0;
    public float f15638k0;
    public boolean f15639l0;
    public ValueAnimator m0;
    public final fq f15640n;
    public Bitmap f15641n0;
    public BitmapShader f15642o0;
    public Matrix f15643p0;
    public Paint f15644q0;
    public final j f15645r;
    public final org.telegram.ui.Components.y5 f15646r0;
    public final FrameLayout f15647s;
    public int f15648s0;
    public float f15649t0;
    public boolean f15650u0;
    public final org.telegram.ui.Components.j6 v;
    public final RectF f15651v0;
    public int f15652w;
    public final RectF f15653w0;
    public long f15654x;
    public final RectF f15655x0;
    public final Paint f15656y;
    public boolean f15657y0;
    public nz0 f15658z0;

    public m(Context context, FrameLayout frameLayout, xu0 xu0Var, FrameLayout frameLayout2, org.telegram.ui.ActionBar.b6 b6Var, org.telegram.ui.Components.ba baVar) {
        super(context);
        int i9;
        float f10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        ig.i iVar = new ig.i();
        this.f15627c = iVar;
        ig.i iVar2 = new ig.i();
        this.d = iVar2;
        Paint paint = new Paint(1);
        this.f15630e = paint;
        Paint paint2 = new Paint(1);
        this.f15656y = paint2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(10.0f), new int[]{-65536, 0}, new float[]{0.05f, 1.0f}, Shader.TileMode.CLAMP);
        this.A = linearGradient;
        this.B = new Matrix();
        this.D = new TextPaint(3);
        Paint paint3 = new Paint(3);
        this.E = paint3;
        this.J = -4;
        this.Q = UserConfig.selectedAccount;
        this.V = new e(this, 0);
        this.f15626b0 = new org.telegram.ui.Components.pc(this, 1.0f, 3.0f);
        this.f15637j0 = new e(this, 1);
        gr grVar = gr.h;
        this.f15646r0 = new org.telegram.ui.Components.y5(this, 0L, 300L, grVar);
        this.f15650u0 = false;
        this.f15651v0 = new RectF();
        this.f15653w0 = new RectF();
        this.f15655x0 = new RectF();
        this.F0 = new Path();
        this.I0 = new org.telegram.ui.Components.y5(this, 500L, grVar);
        this.f15623a = b6Var;
        this.F = frameLayout;
        this.G = xu0Var;
        this.f15625b = frameLayout2;
        this.K = baVar;
        this.N = new org.telegram.ui.Components.fa(baVar, this, 0, !g());
        this.O = new org.telegram.ui.Components.fa(baVar, this, 8, false);
        this.M = new org.telegram.ui.Components.fa(baVar, this, 9, false);
        iVar.f11196j = true;
        int i16 = org.telegram.ui.ActionBar.f6.f23001d6;
        iVar.a(new f(b6Var, i16, 0.0f, 0));
        iVar.f11194g.setColor(0);
        iVar.invalidateSelf();
        iVar2.f11196j = true;
        iVar2.a(new f(b6Var, i16, 0.0f, 1));
        iVar2.f11194g.setColor(0);
        iVar2.invalidateSelf();
        paint.setColor(Integer.MIN_VALUE);
        this.H = new b4(frameLayout, false, new bg.i(this, 22));
        g gVar = new g(this, context, xu0Var, getEditTextStyle(), new ih.b(), b6Var, baVar);
        this.f15632f = gVar;
        gVar.O = true;
        gVar.getEditText().addTextChangedListener(new org.telegram.ui.Cells.i3());
        gVar.setFocusable(true);
        gVar.setFocusableInTouchMode(true);
        gVar.getEditText().hintLayoutYFix = true;
        gVar.getEditText().drawHint = new bh.c(this, 24);
        gVar.getEditText().setSupportRtlHint(true);
        mt editText = gVar.getEditText();
        if (g()) {
            i9 = 1;
        } else {
            i9 = 2;
        }
        this.L = new org.telegram.ui.Components.fa(baVar, editText, i9, false);
        gVar.getEditText().setHintColor(-1);
        gVar.getEditText().setHintText(LocaleController.getString(R.string.AddCaption), false);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        gVar.getEditText().setTranslationX(AndroidUtilities.dp(-26.0f));
        boolean z10 = this instanceof zr0;
        if (z10) {
            gVar.getEditText().setGravity(48);
        }
        gVar.getEmojiButton().setAlpha(0.0f);
        View emojiButton = gVar.getEmojiButton();
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = -1.0f;
        }
        emojiButton.setTranslationY(AndroidUtilities.dp(f10));
        gVar.setTranslationY(AndroidUtilities.dp(z10 ? 1.0f : -1.0f));
        gVar.getEditText().addTextChangedListener(new h(this));
        gVar.getEditText().setLinkTextColor(-1);
        if (z10) {
            i10 = 48;
        } else {
            i10 = 80;
        }
        addView(gVar, g7.e6.d(-1, -2.0f, i10 | 7, 12.0f, 8.0f, b() + 12, 8.0f));
        j jVar = new j(context);
        this.f15645r = jVar;
        g7.g6.b(jVar, 0.05f, 1.25f);
        Drawable mutate = context.getResources().getDrawable(R.drawable.input_done).mutate();
        this.h = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.U5, false), PorterDuff.Mode.SRC_IN));
        fq fqVar = new fq(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23395zf, b6Var)), mutate, 0, AndroidUtilities.dp(1.0f));
        this.f15640n = fqVar;
        int dp = AndroidUtilities.dp(36.0f);
        int dp2 = AndroidUtilities.dp(36.0f);
        fqVar.h = dp;
        fqVar.f28547n = dp2;
        jVar.setImageDrawable(fqVar);
        jVar.setScaleType(ImageView.ScaleType.CENTER);
        jVar.setContentDescription(LocaleController.getString(R.string.Done));
        jVar.setAlpha(0.0f);
        jVar.setVisibility(8);
        jVar.setOnClickListener(new androidx.mediarouter.app.c(this, 25));
        if (z10) {
            i11 = 48;
        } else {
            i11 = 80;
        }
        addView(jVar, g7.e6.d(44, 44.0f, i11 | 5, 8.0f, 8.0f, 8.0f, 8.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, true, true);
        this.v = j6Var;
        j6Var.setGravity(17);
        j6Var.setTextSize(AndroidUtilities.dp(15.0f));
        j6Var.setTextColor(-1);
        j6Var.b(0.4f, 320L, grVar);
        j6Var.setTypeface(AndroidUtilities.bold());
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f15647s = frameLayout3;
        frameLayout3.setTranslationX(AndroidUtilities.dp(2.0f));
        if (z10) {
            i12 = 48;
        } else {
            i12 = 80;
        }
        frameLayout3.addView(j6Var, g7.e6.e(52, 16, i12 | 5));
        if (z10) {
            i13 = 48;
        } else {
            i13 = 80;
        }
        int i17 = i13 | 5;
        if (z10) {
            i14 = 50;
        } else {
            i14 = 0;
        }
        float f11 = i14;
        if (z10) {
            i15 = 0;
        } else {
            i15 = 50;
        }
        addView(frameLayout3, g7.e6.d(52, 16.0f, i17, 0.0f, f11, 0.0f, i15));
        paint2.setShader(linearGradient);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public int a() {
        return AndroidUtilities.navigationBarHeight;
    }

    public int b() {
        return 0;
    }

    public abstract void c(boolean z10);

    @Override
    public final void clearFocus() {
        this.f15632f.clearFocus();
    }

    public abstract void d(boolean z10);

    @Override
    public void dispatchDraw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: kh.m.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f15624a0 && (motionEvent.getAction() != 0 || !l(motionEvent.getX(), motionEvent.getY()))) {
            if (this.f15655x0.contains(motionEvent.getX(), motionEvent.getY()) || this.f15639l0) {
                int action = motionEvent.getAction();
                org.telegram.ui.Components.pc pcVar = this.f15626b0;
                if (action == 0 && !this.f15639l0) {
                    if ((this instanceof s) && ((s) this).K1) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    int i9 = 0;
                    while (true) {
                        int childCount = getChildCount();
                        g gVar = this.f15632f;
                        if (i9 < childCount) {
                            View childAt = getChildAt(i9);
                            if (childAt != null && childAt.isClickable() && childAt.getVisibility() == 0 && childAt.getAlpha() >= 0.5f && gVar != childAt) {
                                float x10 = childAt.getX();
                                float y10 = childAt.getY();
                                float x11 = childAt.getX() + childAt.getWidth();
                                float y11 = childAt.getY() + childAt.getHeight();
                                RectF rectF = this.f15651v0;
                                rectF.set(x10, y10, x11, y11);
                                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                                    return super.dispatchTouchEvent(motionEvent);
                                }
                            }
                            i9++;
                        } else {
                            this.H.b(false);
                            gVar.getEditText().setForceCursorEnd(true);
                            gVar.getEditText().requestFocus();
                            pt ptVar = gVar.f33121a;
                            ptVar.requestFocus();
                            AndroidUtilities.showKeyboard(ptVar);
                            gVar.getEditText().setScrollY(0);
                            pcVar.c(true);
                            return true;
                        }
                    }
                } else {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        pcVar.c(false);
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float max;
        RectF rectF = this.f15653w0;
        g gVar = this.f15632f;
        if (view == gVar) {
            if (this instanceof zr0) {
                max = 0.0f;
            } else {
                max = (1.0f - this.f15638k0) * Math.max(0, (gVar.getHeight() - AndroidUtilities.dp(82.0f)) - gVar.getScrollY());
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(0.0f, max);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            canvas.save();
            Matrix matrix = this.B;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top - 1.0f);
            LinearGradient linearGradient = this.A;
            linearGradient.setLocalMatrix(matrix);
            float f10 = rectF.left;
            float f11 = rectF.top;
            Paint paint = this.f15656y;
            canvas.drawRect(f10, f11, rectF.right, AndroidUtilities.dp(10.0f) + f11, paint);
            matrix.reset();
            matrix.postRotate(180.0f);
            matrix.postTranslate(0.0f, rectF.bottom);
            linearGradient.setLocalMatrix(matrix);
            canvas.drawRect(rectF.left, rectF.bottom - AndroidUtilities.dp(10.0f), rectF.right, rectF.bottom, paint);
            canvas.restore();
            canvas.restore();
            return drawChild;
        } else if (f(view)) {
            canvas.save();
            canvas.clipRect(rectF);
            boolean drawChild2 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild2;
        } else {
            return super.drawChild(canvas, view, j10);
        }
    }

    public abstract boolean e();

    public boolean f(View view) {
        return true;
    }

    public abstract boolean g();

    public RectF getBounds() {
        return this.f15653w0;
    }

    public int getCaptionDefaultLimit() {
        return 0;
    }

    public int getCaptionLimit() {
        if (UserConfig.getInstance(this.Q).isPremium()) {
            return getCaptionPremiumLimit();
        }
        return getCaptionDefaultLimit();
    }

    public int getCaptionPremiumLimit() {
        return 0;
    }

    public int getCodePointCount() {
        return this.f15652w;
    }

    public int getEditTextHeight() {
        return (int) this.f15646r0.f34854c;
    }

    public int getEditTextHeightClosedKeyboard() {
        return Math.min(AndroidUtilities.dp(82.0f), this.f15632f.getHeight());
    }

    public int getEditTextLeft() {
        return 0;
    }

    public int getEditTextStyle() {
        return 2;
    }

    public float getOver2Alpha() {
        return this.I0.f34854c;
    }

    public int getSelectionLength() {
        g gVar = this.f15632f;
        if (gVar != null && gVar.getEditText() != null) {
            try {
                return gVar.getEditText().getSelectionEnd() - gVar.getEditText().getSelectionStart();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        return 0;
    }

    public CharSequence getText() {
        return this.f15632f.getText();
    }

    public abstract void h(org.telegram.ui.Components.fa faVar, Canvas canvas, RectF rectF, float f10, boolean z10, float f11, float f12, boolean z11);

    public void i(Bitmap bitmap) {
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    public abstract boolean l(float f10, float f11);

    public final void m() {
        invalidate();
        g gVar = this.f15632f;
        gVar.getEditText().invalidate();
        gVar.getEmojiButton().invalidate();
        i iVar = this.I;
        if (iVar != null) {
            iVar.invalidate();
        }
        if (gVar.getEmojiView() != null && g()) {
            gVar.getEmojiView().invalidate();
        }
    }

    public final boolean o() {
        if (getCodePointCount() > getCaptionLimit()) {
            return true;
        }
        return false;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (g()) {
            Bitmap bitmap = this.C;
            if (bitmap != null) {
                bitmap.recycle();
                this.C = null;
            }
            TextPaint textPaint = this.D;
            textPaint.setColor(-16777216);
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            String string = LocaleController.getString(R.string.AddCaption);
            this.C = Bitmap.createBitmap((int) Math.ceil(textPaint.measureText(string)), (int) Math.ceil(textPaint.getFontMetrics().descent - textPaint.getFontMetrics().ascent), Bitmap.Config.ARGB_8888);
            new Canvas(this.C).drawText(string, 0.0f, -((int) textPaint.getFontMetrics().ascent), textPaint);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.f15641n0;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f15642o0 = null;
        this.f15644q0 = null;
        Bitmap bitmap2 = this.C;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.C = null;
        }
    }

    public final boolean p() {
        g gVar = this.f15632f;
        boolean z10 = gVar.f33130x;
        b4 b4Var = this.H;
        if (z10 && gVar.getEmojiView() != null) {
            if (b4Var.c()) {
                gVar.getEmojiView().A();
                return true;
            }
            qt qtVar = gVar.d;
            if (qtVar != null) {
                qtVar.A();
                gVar.d.t(false);
            }
            return true;
        } else if (gVar.f33124e) {
            gVar.k(true);
            return true;
        } else if ((!gVar.v && !b4Var.c()) || b4Var.d) {
            return false;
        } else {
            gVar.d();
            gVar.k(true);
            return true;
        }
    }

    public void setAccount(int i9) {
        this.Q = i9;
    }

    public void setBlurredBackgroundDrawableForMentions(ig.a aVar) {
        this.f15629d0 = aVar;
    }

    public void setDialogId(long j10) {
        this.f15654x = j10;
        i iVar = this.I;
        if (iVar != null) {
            iVar.setDialogId(j10);
        }
    }

    public void setOnHeightUpdate(Utilities.Callback<Integer> callback) {
        this.f15633f0 = callback;
    }

    public void setOnKeyboardOpen(Utilities.Callback<Boolean> callback) {
        this.f15634g0 = callback;
    }

    @Override
    public void setPressed(boolean z10) {
        boolean z11;
        super.setPressed(z10);
        if (z10 && !this.f15639l0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f15626b0.c(z11);
    }

    public void setText(CharSequence charSequence) {
        this.R = true;
        this.f15632f.setText(charSequence);
    }

    public void setUiBlurBitmap(Utilities.CallbackVoidReturn<Bitmap> callbackVoidReturn) {
        this.W = callbackVoidReturn;
    }

    public abstract void u(float f10);

    public final void v(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
        if (spannableStringBuilder == null && charSequence == null) {
            this.f15657y0 = false;
            invalidate();
            return;
        }
        this.f15657y0 = true;
        if (spannableStringBuilder == null) {
            spannableStringBuilder = "";
        }
        this.f15658z0 = new nz0(spannableStringBuilder, 14.0f, AndroidUtilities.bold());
        if (charSequence == null) {
            charSequence = "";
        }
        this.A0 = new nz0(charSequence, 14.0f, null);
    }

    public void w() {
        this.I.getAdapter().f19322c = false;
        this.I.getAdapter().d = false;
        this.I.getAdapter().f19325e = false;
        this.I.getAdapter().f19331i0 = this instanceof s;
    }

    public void x(int i9) {
        int bottomPadding;
        xu0 xu0Var = this.G;
        if (xu0Var != null) {
            xu0Var.S();
        }
        g gVar = this.f15632f;
        boolean z10 = false;
        if (gVar.f33124e) {
            i9 = Math.max(0, gVar.getEmojiPadding() + a());
        } else if (gVar.J) {
            i9 = Math.max(0, gVar.getKeyboardHeight() + a());
        }
        if (xu0Var == null) {
            bottomPadding = 0;
        } else {
            bottomPadding = xu0Var.getBottomPadding();
        }
        int max = Math.max(0, i9 - bottomPadding);
        View view = (View) getParent();
        view.clearAnimation();
        if (!(this instanceof zr0)) {
            ObjectAnimator objectAnimator = this.f15635h0;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.f15635h0.cancel();
                this.f15635h0 = null;
            }
            this.f15635h0 = ObjectAnimator.ofFloat(view, FrameLayout.TRANSLATION_Y, view.getTranslationY(), -max);
            if (max > AndroidUtilities.dp(20.0f)) {
                this.f15635h0.setInterpolator(org.telegram.ui.ActionBar.q1.f23713w);
                this.f15635h0.setDuration(250L);
            } else {
                this.f15635h0.setInterpolator(gr.h);
                this.f15635h0.setDuration(640L);
            }
            this.f15635h0.start();
        }
        if (max > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        }
        this.f15636i0 = z10;
        e eVar = this.f15637j0;
        AndroidUtilities.cancelRunOnUIThread(eVar);
        AndroidUtilities.runOnUIThread(eVar);
        if (max < AndroidUtilities.dp(20.0f)) {
            gVar.getEditText().clearFocus();
            gVar.k(true);
        }
    }

    public void y() {
        if (this.I != null) {
            float translationY = ((View) getParent()).getTranslationY() - this.f15646r0.f34854c;
            if (this.I.getY() != translationY) {
                this.I.setTranslationY(translationY);
                this.I.invalidate();
            }
        }
    }

    public void n() {
    }

    public void t() {
    }

    public void q(boolean z10) {
    }

    public void r(int i9) {
    }

    public void j(Canvas canvas, RectF rectF) {
    }

    public void s(int i9, int i10) {
    }

    public void k(Canvas canvas, RectF rectF, float f10) {
    }
}
