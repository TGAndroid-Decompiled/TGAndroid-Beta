package nh;

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
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.uc;
import org.telegram.ui.Components.vt;
import org.telegram.ui.Components.wt;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.yr0;
public abstract class m extends FrameLayout {
    public final LinearGradient A;
    public zz0 A0;
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
    public final hv0 G;
    public boolean G0;
    public final w3 H;
    public int H0;
    public i I;
    public final org.telegram.ui.Components.d6 I0;
    public int J;
    public Paint J0;
    public final org.telegram.ui.Components.ga K;
    public RadialGradient K0;
    public final org.telegram.ui.Components.ka L;
    public Paint L0;
    public final org.telegram.ui.Components.ka M;
    public RadialGradient M0;
    public final org.telegram.ui.Components.ka N;
    public Matrix N0;
    public final org.telegram.ui.Components.ka O;
    public org.telegram.ui.Components.ka P;
    public int Q;
    public boolean R;
    public boolean S;
    public int T;
    public int U;
    public final e V;
    public Utilities.CallbackVoidReturn W;
    public org.telegram.ui.ActionBar.c6 f18067a;
    public boolean f18068a0;
    public final FrameLayout f18069b;
    public final uc f18070b0;
    public final lg.i f18071c;
    public ObjectAnimator f18072c0;
    public final lg.i d;
    public lg.a f18073d0;
    public final Paint f18074e;
    public ng.d f18075e0;
    public final g f18076f;
    public Utilities.Callback f18077f0;
    public Utilities.Callback f18078g0;
    public final Drawable h;
    public ObjectAnimator f18079h0;
    public boolean f18080i0;
    public final e f18081j0;
    public float f18082k0;
    public boolean f18083l0;
    public ValueAnimator m0;
    public final jq f18084n;
    public Bitmap f18085n0;
    public BitmapShader f18086o0;
    public Matrix f18087p0;
    public Paint f18088q0;
    public final j f18089r;
    public final org.telegram.ui.Components.d6 f18090r0;
    public final FrameLayout f18091s;
    public int f18092s0;
    public float f18093t0;
    public boolean f18094u0;
    public final org.telegram.ui.Components.o6 v;
    public final RectF f18095v0;
    public int f18096w;
    public final RectF f18097w0;
    public long f18098x;
    public final RectF f18099x0;
    public final Paint f18100y;
    public boolean f18101y0;
    public zz0 f18102z0;

    public m(Context context, FrameLayout frameLayout, hv0 hv0Var, FrameLayout frameLayout2, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.ga gaVar) {
        super(context);
        int i10;
        float f9;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        lg.i iVar = new lg.i();
        this.f18071c = iVar;
        lg.i iVar2 = new lg.i();
        this.d = iVar2;
        Paint paint = new Paint(1);
        this.f18074e = paint;
        Paint paint2 = new Paint(1);
        this.f18100y = paint2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(10.0f), new int[]{-65536, 0}, new float[]{0.05f, 1.0f}, Shader.TileMode.CLAMP);
        this.A = linearGradient;
        this.B = new Matrix();
        this.D = new TextPaint(3);
        Paint paint3 = new Paint(3);
        this.E = paint3;
        this.J = -4;
        this.Q = UserConfig.selectedAccount;
        this.V = new e(this, 0);
        this.f18070b0 = new uc(this, 1.0f, 3.0f);
        this.f18081j0 = new e(this, 1);
        jr jrVar = jr.h;
        this.f18090r0 = new org.telegram.ui.Components.d6(this, 0L, 300L, jrVar);
        this.f18094u0 = false;
        this.f18095v0 = new RectF();
        this.f18097w0 = new RectF();
        this.f18099x0 = new RectF();
        this.F0 = new Path();
        this.I0 = new org.telegram.ui.Components.d6(this, 500L, jrVar);
        this.f18067a = c6Var;
        this.F = frameLayout;
        this.G = hv0Var;
        this.f18069b = frameLayout2;
        this.K = gaVar;
        this.N = new org.telegram.ui.Components.ka(gaVar, this, 0, !g());
        this.O = new org.telegram.ui.Components.ka(gaVar, this, 8, false);
        this.M = new org.telegram.ui.Components.ka(gaVar, this, 9, false);
        iVar.f15289j = true;
        int i17 = org.telegram.ui.ActionBar.g6.f23062d6;
        iVar.a(new f(c6Var, i17, 0.0f, 0));
        iVar.f15287g.setColor(0);
        iVar.invalidateSelf();
        iVar2.f15289j = true;
        iVar2.a(new f(c6Var, i17, 0.0f, 1));
        iVar2.f15287g.setColor(0);
        iVar2.invalidateSelf();
        paint.setColor(Integer.MIN_VALUE);
        this.H = new w3(frameLayout, false, new ag.i0(this, 29));
        g gVar = new g(this, context, hv0Var, getEditTextStyle(), new lh.b(), c6Var, gaVar);
        this.f18076f = gVar;
        gVar.O = true;
        gVar.getEditText().addTextChangedListener(new org.telegram.ui.Cells.f3());
        gVar.setFocusable(true);
        gVar.setFocusableInTouchMode(true);
        gVar.getEditText().hintLayoutYFix = true;
        gVar.getEditText().drawHint = new bg.t1(this, 25);
        gVar.getEditText().setSupportRtlHint(true);
        st editText = gVar.getEditText();
        if (g()) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        this.L = new org.telegram.ui.Components.ka(gaVar, editText, i10, false);
        gVar.getEditText().setHintColor(-1);
        gVar.getEditText().setHintText(LocaleController.getString(R.string.AddCaption), false);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        gVar.getEditText().setTranslationX(AndroidUtilities.dp(-26.0f));
        boolean z10 = this instanceof yr0;
        if (z10) {
            gVar.getEditText().setGravity(48);
        }
        gVar.getEmojiButton().setAlpha(0.0f);
        View emojiButton = gVar.getEmojiButton();
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = -1.0f;
        }
        emojiButton.setTranslationY(AndroidUtilities.dp(f9));
        gVar.setTranslationY(AndroidUtilities.dp(z10 ? 1.0f : -1.0f));
        gVar.getEditText().addTextChangedListener(new h(this));
        gVar.getEditText().setLinkTextColor(-1);
        if (z10) {
            i11 = 48;
        } else {
            i11 = 80;
        }
        addView(gVar, i7.f6.d(-1, -2.0f, i11 | 7, 12.0f, 8.0f, b() + 12, 8.0f));
        j jVar = new j(context);
        this.f18089r = jVar;
        i7.h6.b(jVar, 0.05f, 1.25f);
        Drawable mutate = context.getResources().getDrawable(R.drawable.input_done).mutate();
        this.h = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.U5, false), PorterDuff.Mode.SRC_IN));
        jq jqVar = new jq(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23459zf, c6Var)), mutate, 0, AndroidUtilities.dp(1.0f));
        this.f18084n = jqVar;
        int dp = AndroidUtilities.dp(36.0f);
        int dp2 = AndroidUtilities.dp(36.0f);
        jqVar.h = dp;
        jqVar.f29789n = dp2;
        jVar.setImageDrawable(jqVar);
        jVar.setScaleType(ImageView.ScaleType.CENTER);
        jVar.setContentDescription(LocaleController.getString(R.string.Done));
        jVar.setAlpha(0.0f);
        jVar.setVisibility(8);
        jVar.setOnClickListener(new mh.n(this, 1));
        if (z10) {
            i12 = 48;
        } else {
            i12 = 80;
        }
        addView(jVar, i7.f6.d(44, 44.0f, i12 | 5, 8.0f, 8.0f, 8.0f, 8.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, true, true);
        this.v = o6Var;
        o6Var.setGravity(17);
        o6Var.setTextSize(AndroidUtilities.dp(15.0f));
        o6Var.setTextColor(-1);
        o6Var.b(0.4f, 320L, jrVar);
        o6Var.setTypeface(AndroidUtilities.bold());
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f18091s = frameLayout3;
        frameLayout3.setTranslationX(AndroidUtilities.dp(2.0f));
        if (z10) {
            i13 = 48;
        } else {
            i13 = 80;
        }
        frameLayout3.addView(o6Var, i7.f6.e(52, 16, i13 | 5));
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
        addView(frameLayout3, i7.f6.d(52, 16.0f, i18, 0.0f, f10, 0.0f, i16));
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
        this.f18076f.clearFocus();
    }

    public abstract void d(boolean z10);

    @Override
    public void dispatchDraw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: nh.m.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f18068a0 && (motionEvent.getAction() != 0 || !l(motionEvent.getX(), motionEvent.getY()))) {
            if (this.f18099x0.contains(motionEvent.getX(), motionEvent.getY()) || this.f18083l0) {
                int action = motionEvent.getAction();
                uc ucVar = this.f18070b0;
                if (action == 0 && !this.f18083l0) {
                    if ((this instanceof r) && ((r) this).K1) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    int i10 = 0;
                    while (true) {
                        int childCount = getChildCount();
                        g gVar = this.f18076f;
                        if (i10 < childCount) {
                            View childAt = getChildAt(i10);
                            if (childAt != null && childAt.isClickable() && childAt.getVisibility() == 0 && childAt.getAlpha() >= 0.5f && gVar != childAt) {
                                float x4 = childAt.getX();
                                float y8 = childAt.getY();
                                float x10 = childAt.getX() + childAt.getWidth();
                                float y10 = childAt.getY() + childAt.getHeight();
                                RectF rectF = this.f18095v0;
                                rectF.set(x4, y8, x10, y10);
                                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                                    return super.dispatchTouchEvent(motionEvent);
                                }
                            }
                            i10++;
                        } else {
                            this.H.b(false);
                            gVar.getEditText().setForceCursorEnd(true);
                            gVar.getEditText().requestFocus();
                            vt vtVar = gVar.f26882a;
                            vtVar.requestFocus();
                            AndroidUtilities.showKeyboard(vtVar);
                            gVar.getEditText().setScrollY(0);
                            ucVar.c(true);
                            return true;
                        }
                    }
                } else {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        ucVar.c(false);
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
        RectF rectF = this.f18097w0;
        g gVar = this.f18076f;
        if (view == gVar) {
            if (this instanceof yr0) {
                max = 0.0f;
            } else {
                max = (1.0f - this.f18082k0) * Math.max(0, (gVar.getHeight() - AndroidUtilities.dp(82.0f)) - gVar.getScrollY());
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
            float f9 = rectF.left;
            float f10 = rectF.top;
            Paint paint = this.f18100y;
            canvas.drawRect(f9, f10, rectF.right, AndroidUtilities.dp(10.0f) + f10, paint);
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
        return this.f18097w0;
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
        return this.f18096w;
    }

    public int getEditTextHeight() {
        return (int) this.f18090r0.f27666c;
    }

    public int getEditTextHeightClosedKeyboard() {
        return Math.min(AndroidUtilities.dp(82.0f), this.f18076f.getHeight());
    }

    public int getEditTextLeft() {
        return 0;
    }

    public int getEditTextStyle() {
        return 2;
    }

    public float getOver2Alpha() {
        return this.I0.f27666c;
    }

    public int getSelectionLength() {
        g gVar = this.f18076f;
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
        return this.f18076f.getText();
    }

    public abstract void h(org.telegram.ui.Components.ka kaVar, Canvas canvas, RectF rectF, float f9, boolean z10, float f10, float f11, boolean z11);

    public void i(Bitmap bitmap) {
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    public abstract boolean l(float f9, float f10);

    public final void m() {
        invalidate();
        g gVar = this.f18076f;
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
        Bitmap bitmap = this.f18085n0;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f18086o0 = null;
        this.f18088q0 = null;
        Bitmap bitmap2 = this.C;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.C = null;
        }
    }

    public final boolean p() {
        g gVar = this.f18076f;
        boolean z10 = gVar.f26891x;
        w3 w3Var = this.H;
        if (z10 && gVar.getEmojiView() != null) {
            if (w3Var.c()) {
                gVar.getEmojiView().B();
                return true;
            }
            wt wtVar = gVar.d;
            if (wtVar != null) {
                wtVar.B();
                gVar.d.t(false);
            }
            return true;
        } else if (gVar.f26885e) {
            gVar.k(true);
            return true;
        } else if ((!gVar.v && !w3Var.c()) || w3Var.d) {
            return false;
        } else {
            gVar.d();
            gVar.k(true);
            return true;
        }
    }

    public void setAccount(int i10) {
        this.Q = i10;
    }

    public void setBlurredBackgroundDrawableForMentions(lg.a aVar) {
        this.f18073d0 = aVar;
    }

    public void setDialogId(long j10) {
        this.f18098x = j10;
        i iVar = this.I;
        if (iVar != null) {
            iVar.setDialogId(j10);
        }
    }

    public void setOnHeightUpdate(Utilities.Callback<Integer> callback) {
        this.f18077f0 = callback;
    }

    public void setOnKeyboardOpen(Utilities.Callback<Boolean> callback) {
        this.f18078g0 = callback;
    }

    @Override
    public void setPressed(boolean z10) {
        boolean z11;
        super.setPressed(z10);
        if (z10 && !this.f18083l0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f18070b0.c(z11);
    }

    public void setText(CharSequence charSequence) {
        this.R = true;
        this.f18076f.setText(charSequence);
    }

    public void setUiBlurBitmap(Utilities.CallbackVoidReturn<Bitmap> callbackVoidReturn) {
        this.W = callbackVoidReturn;
    }

    public abstract void u(float f9);

    public final void v(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
        if (spannableStringBuilder == null && charSequence == null) {
            this.f18101y0 = false;
            invalidate();
            return;
        }
        this.f18101y0 = true;
        if (spannableStringBuilder == null) {
            spannableStringBuilder = "";
        }
        this.f18102z0 = new zz0(spannableStringBuilder, 14.0f, AndroidUtilities.bold());
        if (charSequence == null) {
            charSequence = "";
        }
        this.A0 = new zz0(charSequence, 14.0f, null);
    }

    public void w() {
        this.I.getAdapter().f47364c = false;
        this.I.getAdapter().d = false;
        this.I.getAdapter().f47367e = false;
        this.I.getAdapter().f47373i0 = this instanceof r;
    }

    public void x(int i10) {
        int bottomPadding;
        hv0 hv0Var = this.G;
        if (hv0Var != null) {
            hv0Var.S();
        }
        g gVar = this.f18076f;
        boolean z10 = false;
        if (gVar.f26885e) {
            i10 = Math.max(0, gVar.getEmojiPadding() + a());
        } else if (gVar.J) {
            i10 = Math.max(0, gVar.getKeyboardHeight() + a());
        }
        if (hv0Var == null) {
            bottomPadding = 0;
        } else {
            bottomPadding = hv0Var.getBottomPadding();
        }
        int max = Math.max(0, i10 - bottomPadding);
        View view = (View) getParent();
        view.clearAnimation();
        if (!(this instanceof yr0)) {
            ObjectAnimator objectAnimator = this.f18079h0;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.f18079h0.cancel();
                this.f18079h0 = null;
            }
            this.f18079h0 = ObjectAnimator.ofFloat(view, FrameLayout.TRANSLATION_Y, view.getTranslationY(), -max);
            if (max > AndroidUtilities.dp(20.0f)) {
                this.f18079h0.setInterpolator(org.telegram.ui.ActionBar.q1.f23735w);
                this.f18079h0.setDuration(250L);
            } else {
                this.f18079h0.setInterpolator(jr.h);
                this.f18079h0.setDuration(640L);
            }
            this.f18079h0.start();
        }
        if (max > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        }
        this.f18080i0 = z10;
        e eVar = this.f18081j0;
        AndroidUtilities.cancelRunOnUIThread(eVar);
        AndroidUtilities.runOnUIThread(eVar);
        if (max < AndroidUtilities.dp(20.0f)) {
            gVar.getEditText().clearFocus();
            gVar.k(true);
        }
    }

    public void y() {
        if (this.I != null) {
            float translationY = ((View) getParent()).getTranslationY() - this.f18090r0.f27666c;
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

    public void r(int i10) {
    }

    public void j(Canvas canvas, RectF rectF) {
    }

    public void s(int i10, int i11) {
    }

    public void k(Canvas canvas, RectF rectF, float f9) {
    }
}
