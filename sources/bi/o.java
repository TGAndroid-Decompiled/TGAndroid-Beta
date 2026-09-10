package bi;

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
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.wr;
import org.telegram.ui.bt0;
public abstract class o extends FrameLayout {
    public final RectF A0;
    public final RectF B0;
    public boolean C0;
    public t01 D0;
    public final LinearGradient E;
    public t01 E0;
    public final Matrix F;
    public Path F0;
    public Bitmap G;
    public Paint G0;
    public final TextPaint H;
    public Path H0;
    public final Paint I;
    public float[] I0;
    public final FrameLayout J;
    public final Path J0;
    public final aw0 K;
    public boolean K0;
    public final b5 L;
    public int L0;
    public k M;
    public final org.telegram.ui.Components.d6 M0;
    public int N;
    public Paint N0;
    public final org.telegram.ui.Components.ia O;
    public RadialGradient O0;
    public final org.telegram.ui.Components.ma P;
    public Paint P0;
    public final org.telegram.ui.Components.ma Q;
    public RadialGradient Q0;
    public final org.telegram.ui.Components.ma R;
    public Matrix R0;
    public final org.telegram.ui.Components.ma S;
    public org.telegram.ui.Components.ma T;
    public int U;
    public boolean V;
    public boolean W;
    public org.telegram.ui.ActionBar.f6 f3260a;
    public int f3261a0;
    public final FrameLayout f3262b;
    public int f3263b0;
    public final zg.i f3264c;
    public final e f3265c0;
    public final zg.i d;
    public Utilities.CallbackVoidReturn f3266d0;
    public final Paint e;
    public boolean f3267e0;
    public final i f3268f;
    public final org.telegram.ui.Components.xc f3269f0;
    public ObjectAnimator f3270g0;
    public final Drawable h;
    public zg.a f3271h0;
    public bh.d f3272i0;
    public Utilities.Callback f3273j0;
    public Utilities.Callback f3274k0;
    public ObjectAnimator f3275l0;
    public boolean m0;
    public final vq f3276n;
    public final e f3277n0;
    public float f3278o0;
    public boolean f3279p0;
    public ValueAnimator f3280q0;
    public final l f3281r;
    public Bitmap f3282r0;
    public final FrameLayout f3283s;
    public BitmapShader f3284s0;
    public Matrix f3285t0;
    public Paint f3286u0;
    public final org.telegram.ui.Components.o6 v;
    public final org.telegram.ui.Components.d6 f3287v0;
    public int f3288w;
    public int f3289w0;
    public long f3290x;
    public float f3291x0;
    public final Paint f3292y;
    public boolean f3293y0;
    public final RectF f3294z0;

    public o(Context context, FrameLayout frameLayout, aw0 aw0Var, FrameLayout frameLayout2, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.ia iaVar) {
        super(context);
        int i10;
        float f7;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        zg.i iVar = new zg.i();
        this.f3264c = iVar;
        zg.i iVar2 = new zg.i();
        this.d = iVar2;
        Paint paint = new Paint(1);
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.f3292y = paint2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(10.0f), new int[]{-65536, 0}, new float[]{0.05f, 1.0f}, Shader.TileMode.CLAMP);
        this.E = linearGradient;
        this.F = new Matrix();
        this.H = new TextPaint(3);
        Paint paint3 = new Paint(3);
        this.I = paint3;
        this.N = -4;
        this.U = UserConfig.selectedAccount;
        this.f3265c0 = new e(this, 0);
        this.f3269f0 = new org.telegram.ui.Components.xc(this, 1.0f, 3.0f);
        this.f3277n0 = new e(this, 1);
        wr wrVar = wr.h;
        this.f3287v0 = new org.telegram.ui.Components.d6(this, 0L, 300L, wrVar);
        this.f3293y0 = false;
        this.f3294z0 = new RectF();
        this.A0 = new RectF();
        this.B0 = new RectF();
        this.J0 = new Path();
        this.M0 = new org.telegram.ui.Components.d6(this, 500L, wrVar);
        this.f3260a = f6Var;
        this.J = frameLayout;
        this.K = aw0Var;
        this.f3262b = frameLayout2;
        this.O = iaVar;
        this.R = new org.telegram.ui.Components.ma(iaVar, this, 0, !g());
        this.S = new org.telegram.ui.Components.ma(iaVar, this, 8, false);
        this.Q = new org.telegram.ui.Components.ma(iaVar, this, 9, false);
        iVar.f48140j = true;
        int i17 = org.telegram.ui.ActionBar.j6.f17928d6;
        iVar.a(new f(f6Var, i17, 0.0f, 0));
        iVar.f48138g.setColor(0);
        iVar.invalidateSelf();
        iVar2.f48140j = true;
        iVar2.a(new f(f6Var, i17, 0.0f, 1));
        iVar2.f48138g.setColor(0);
        iVar2.invalidateSelf();
        paint.setColor(Integer.MIN_VALUE);
        this.L = new b5(frameLayout, false, new ai.b(this, 1));
        i iVar3 = new i(this, context, aw0Var, getEditTextStyle(), new zh.b(), f6Var, iaVar);
        this.f3268f = iVar3;
        iVar3.S = true;
        iVar3.getEditText().addTextChangedListener(new org.telegram.ui.Cells.h3());
        iVar3.setFocusable(true);
        iVar3.setFocusableInTouchMode(true);
        iVar3.getEditText().hintLayoutYFix = true;
        iVar3.getEditText().drawHint = new ai.c0(this, 1);
        iVar3.getEditText().setSupportRtlHint(true);
        fu editText = iVar3.getEditText();
        if (g()) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        this.P = new org.telegram.ui.Components.ma(iaVar, editText, i10, false);
        iVar3.getEditText().setHintColor(-1);
        iVar3.getEditText().setHintText(LocaleController.getString(R.string.AddCaption), false);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        iVar3.getEditText().setTranslationX(AndroidUtilities.dp(-26.0f));
        boolean z10 = this instanceof bt0;
        if (z10) {
            iVar3.getEditText().setGravity(48);
        }
        iVar3.getEmojiButton().setAlpha(0.0f);
        View emojiButton = iVar3.getEmojiButton();
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = -1.0f;
        }
        emojiButton.setTranslationY(AndroidUtilities.dp(f7));
        iVar3.setTranslationY(AndroidUtilities.dp(z10 ? 1.0f : -1.0f));
        iVar3.getEditText().addTextChangedListener(new j(this));
        iVar3.getEditText().setLinkTextColor(-1);
        if (z10) {
            i11 = 48;
        } else {
            i11 = 80;
        }
        addView(iVar3, w7.a6.d(-1, -2.0f, i11 | 7, 12.0f, 8.0f, b() + 12, 8.0f));
        l lVar = new l(context);
        this.f3281r = lVar;
        w7.c6.b(lVar, 0.05f, 1.25f);
        Drawable mutate = context.getResources().getDrawable(R.drawable.input_done).mutate();
        this.h = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.U5, false), PorterDuff.Mode.SRC_IN));
        vq vqVar = new vq(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18334zf, f6Var)), mutate, 0, AndroidUtilities.dp(1.0f));
        this.f3276n = vqVar;
        int dp = AndroidUtilities.dp(36.0f);
        int dp2 = AndroidUtilities.dp(36.0f);
        vqVar.h = dp;
        vqVar.f28577n = dp2;
        lVar.setImageDrawable(vqVar);
        lVar.setScaleType(ImageView.ScaleType.CENTER);
        lVar.setContentDescription(LocaleController.getString(R.string.Done));
        lVar.setAlpha(0.0f);
        lVar.setVisibility(8);
        lVar.setOnClickListener(new ai.u(this, 2));
        if (z10) {
            i12 = 48;
        } else {
            i12 = 80;
        }
        addView(lVar, w7.a6.d(44, 44.0f, i12 | 5, 8.0f, 8.0f, 8.0f, 8.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, true, true);
        this.v = o6Var;
        o6Var.setGravity(17);
        o6Var.setTextSize(AndroidUtilities.dp(15.0f));
        o6Var.setTextColor(-1);
        o6Var.b(0.4f, 320L, wrVar);
        o6Var.setTypeface(AndroidUtilities.bold());
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f3283s = frameLayout3;
        frameLayout3.setTranslationX(AndroidUtilities.dp(2.0f));
        if (z10) {
            i13 = 48;
        } else {
            i13 = 80;
        }
        frameLayout3.addView(o6Var, w7.a6.e(52, 16, i13 | 5));
        if (z10) {
            i14 = 48;
        } else {
            i14 = 80;
        }
        int i18 = i14 | 5;
        if (z10) {
            i15 = 50;
        } else {
            i15 = 0;
        }
        float f10 = i15;
        if (z10) {
            i16 = 0;
        } else {
            i16 = 50;
        }
        addView(frameLayout3, w7.a6.d(52, 16.0f, i18, 0.0f, f10, 0.0f, i16));
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
        this.f3268f.clearFocus();
    }

    public abstract void d(boolean z10);

    @Override
    public void dispatchDraw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: bi.o.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f3267e0 && (motionEvent.getAction() != 0 || !l(motionEvent.getX(), motionEvent.getY()))) {
            if (this.B0.contains(motionEvent.getX(), motionEvent.getY()) || this.f3279p0) {
                int action = motionEvent.getAction();
                org.telegram.ui.Components.xc xcVar = this.f3269f0;
                if (action == 0 && !this.f3279p0) {
                    if ((this instanceof v) && ((v) this).O1) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    int i10 = 0;
                    while (true) {
                        int childCount = getChildCount();
                        i iVar = this.f3268f;
                        if (i10 < childCount) {
                            View childAt = getChildAt(i10);
                            if (childAt != null && childAt.isClickable() && childAt.getVisibility() == 0 && childAt.getAlpha() >= 0.5f && iVar != childAt) {
                                float x10 = childAt.getX();
                                float y3 = childAt.getY();
                                float x11 = childAt.getX() + childAt.getWidth();
                                float y10 = childAt.getY() + childAt.getHeight();
                                RectF rectF = this.f3294z0;
                                rectF.set(x10, y3, x11, y10);
                                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                                    return super.dispatchTouchEvent(motionEvent);
                                }
                            }
                            i10++;
                        } else {
                            this.L.b(false);
                            iVar.getEditText().setForceCursorEnd(true);
                            iVar.getEditText().requestFocus();
                            iu iuVar = iVar.f25595a;
                            iuVar.requestFocus();
                            AndroidUtilities.showKeyboard(iuVar);
                            iVar.getEditText().setScrollY(0);
                            xcVar.c(true);
                            return true;
                        }
                    }
                } else {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        xcVar.c(false);
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        float max;
        RectF rectF = this.A0;
        i iVar = this.f3268f;
        if (view == iVar) {
            if (this instanceof bt0) {
                max = 0.0f;
            } else {
                max = (1.0f - this.f3278o0) * Math.max(0, (iVar.getHeight() - AndroidUtilities.dp(82.0f)) - iVar.getScrollY());
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(0.0f, max);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            canvas.save();
            Matrix matrix = this.F;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top - 1.0f);
            LinearGradient linearGradient = this.E;
            linearGradient.setLocalMatrix(matrix);
            float f7 = rectF.left;
            float f10 = rectF.top;
            Paint paint = this.f3292y;
            canvas.drawRect(f7, f10, rectF.right, AndroidUtilities.dp(10.0f) + f10, paint);
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
            boolean drawChild2 = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild2;
        } else {
            return super.drawChild(canvas, view, j3);
        }
    }

    public abstract boolean e();

    public boolean f(View view) {
        return true;
    }

    public abstract boolean g();

    public RectF getBounds() {
        return this.A0;
    }

    public int getCaptionDefaultLimit() {
        return 0;
    }

    public int getCaptionLimit() {
        if (UserConfig.getInstance(this.U).isPremium()) {
            return getCaptionPremiumLimit();
        }
        return getCaptionDefaultLimit();
    }

    public int getCaptionPremiumLimit() {
        return 0;
    }

    public int getCodePointCount() {
        return this.f3288w;
    }

    public int getEditTextHeight() {
        return (int) this.f3287v0.f22295c;
    }

    public int getEditTextHeightClosedKeyboard() {
        return Math.min(AndroidUtilities.dp(82.0f), this.f3268f.getHeight());
    }

    public int getEditTextLeft() {
        return 0;
    }

    public int getEditTextStyle() {
        return 2;
    }

    public float getOver2Alpha() {
        return this.M0.f22295c;
    }

    public int getSelectionLength() {
        i iVar = this.f3268f;
        if (iVar != null && iVar.getEditText() != null) {
            try {
                return iVar.getEditText().getSelectionEnd() - iVar.getEditText().getSelectionStart();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return 0;
    }

    public CharSequence getText() {
        return this.f3268f.getText();
    }

    public abstract void h(org.telegram.ui.Components.ma maVar, Canvas canvas, RectF rectF, float f7, boolean z10, float f10, float f11, boolean z11);

    public void i(Bitmap bitmap) {
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    public abstract boolean l(float f7, float f10);

    public final void m() {
        invalidate();
        i iVar = this.f3268f;
        iVar.getEditText().invalidate();
        iVar.getEmojiButton().invalidate();
        k kVar = this.M;
        if (kVar != null) {
            kVar.invalidate();
        }
        if (iVar.getEmojiView() != null && g()) {
            iVar.getEmojiView().invalidate();
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
            Bitmap bitmap = this.G;
            if (bitmap != null) {
                bitmap.recycle();
                this.G = null;
            }
            TextPaint textPaint = this.H;
            textPaint.setColor(-16777216);
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            String string = LocaleController.getString(R.string.AddCaption);
            this.G = Bitmap.createBitmap((int) Math.ceil(textPaint.measureText(string)), (int) Math.ceil(textPaint.getFontMetrics().descent - textPaint.getFontMetrics().ascent), Bitmap.Config.ARGB_8888);
            new Canvas(this.G).drawText(string, 0.0f, -((int) textPaint.getFontMetrics().ascent), textPaint);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.f3282r0;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f3284s0 = null;
        this.f3286u0 = null;
        Bitmap bitmap2 = this.G;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.G = null;
        }
    }

    public final boolean p() {
        i iVar = this.f3268f;
        boolean z10 = iVar.f25603x;
        b5 b5Var = this.L;
        if (z10 && iVar.getEmojiView() != null) {
            if (b5Var.c()) {
                iVar.getEmojiView().A();
                return true;
            }
            ju juVar = iVar.d;
            if (juVar != null) {
                juVar.A();
                iVar.d.t(false);
            }
            return true;
        } else if (iVar.e) {
            iVar.k(true);
            return true;
        } else if ((!iVar.v && !b5Var.c()) || b5Var.d) {
            return false;
        } else {
            iVar.d();
            iVar.k(true);
            return true;
        }
    }

    public void setAccount(int i10) {
        this.U = i10;
    }

    public void setBlurredBackgroundDrawableForMentions(zg.a aVar) {
        this.f3271h0 = aVar;
    }

    public void setDialogId(long j3) {
        this.f3290x = j3;
        k kVar = this.M;
        if (kVar != null) {
            kVar.setDialogId(j3);
        }
    }

    public void setOnHeightUpdate(Utilities.Callback<Integer> callback) {
        this.f3273j0 = callback;
    }

    public void setOnKeyboardOpen(Utilities.Callback<Boolean> callback) {
        this.f3274k0 = callback;
    }

    @Override
    public void setPressed(boolean z10) {
        boolean z11;
        super.setPressed(z10);
        if (z10 && !this.f3279p0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f3269f0.c(z11);
    }

    public void setText(CharSequence charSequence) {
        this.V = true;
        this.f3268f.setText(charSequence);
    }

    public void setUiBlurBitmap(Utilities.CallbackVoidReturn<Bitmap> callbackVoidReturn) {
        this.f3266d0 = callbackVoidReturn;
    }

    public abstract void u(float f7);

    public final void v(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
        if (spannableStringBuilder == null && charSequence == null) {
            this.C0 = false;
            invalidate();
            return;
        }
        this.C0 = true;
        if (spannableStringBuilder == null) {
            spannableStringBuilder = "";
        }
        this.D0 = new t01(spannableStringBuilder, 14.0f, AndroidUtilities.bold());
        if (charSequence == null) {
            charSequence = "";
        }
        this.E0 = new t01(charSequence, 14.0f, null);
    }

    public void w() {
        this.M.getAdapter().f8104c = false;
        this.M.getAdapter().d = false;
        this.M.getAdapter().e = false;
        this.M.getAdapter().m0 = this instanceof v;
    }

    public void x(int i10) {
        int bottomPadding;
        aw0 aw0Var = this.K;
        if (aw0Var != null) {
            aw0Var.S();
        }
        i iVar = this.f3268f;
        boolean z10 = false;
        if (iVar.e) {
            i10 = Math.max(0, iVar.getEmojiPadding() + a());
        } else if (iVar.N) {
            i10 = Math.max(0, iVar.getKeyboardHeight() + a());
        }
        if (aw0Var == null) {
            bottomPadding = 0;
        } else {
            bottomPadding = aw0Var.getBottomPadding();
        }
        int max = Math.max(0, i10 - bottomPadding);
        View view = (View) getParent();
        view.clearAnimation();
        if (!(this instanceof bt0)) {
            ObjectAnimator objectAnimator = this.f3275l0;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.f3275l0.cancel();
                this.f3275l0 = null;
            }
            this.f3275l0 = ObjectAnimator.ofFloat(view, FrameLayout.TRANSLATION_Y, view.getTranslationY(), -max);
            if (max > AndroidUtilities.dp(20.0f)) {
                this.f3275l0.setInterpolator(org.telegram.ui.ActionBar.r1.f18592w);
                this.f3275l0.setDuration(250L);
            } else {
                this.f3275l0.setInterpolator(wr.h);
                this.f3275l0.setDuration(640L);
            }
            this.f3275l0.start();
        }
        if (max > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        }
        this.m0 = z10;
        e eVar = this.f3277n0;
        AndroidUtilities.cancelRunOnUIThread(eVar);
        AndroidUtilities.runOnUIThread(eVar);
        if (max < AndroidUtilities.dp(20.0f)) {
            iVar.getEditText().clearFocus();
            iVar.k(true);
        }
    }

    public void y() {
        if (this.M != null) {
            float translationY = ((View) getParent()).getTranslationY() - this.f3287v0.f22295c;
            if (this.M.getY() != translationY) {
                this.M.setTranslationY(translationY);
                this.M.invalidate();
            }
        }
    }

    public void n() {
    }

    public void q(boolean z10) {
    }

    public void r(int i10) {
    }

    public void t() {
    }

    public void j(Canvas canvas, RectF rectF) {
    }

    public void s(int i10, int i11) {
    }

    public void k(Canvas canvas, RectF rectF, float f7) {
    }
}
