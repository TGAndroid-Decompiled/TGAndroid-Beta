package ci;

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
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.su;
import org.telegram.ui.Components.tw0;
import org.telegram.ui.Components.vu;
import org.telegram.ui.Components.wu;
import org.telegram.ui.bt0;
public abstract class m extends FrameLayout {
    public final RectF A0;
    public final RectF B0;
    public boolean C0;
    public m11 D0;
    public final LinearGradient E;
    public m11 E0;
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
    public final tw0 K;
    public boolean K0;
    public final h4 L;
    public int L0;
    public i M;
    public final org.telegram.ui.Components.g6 M0;
    public int N;
    public Paint N0;
    public final org.telegram.ui.Components.la O;
    public RadialGradient O0;
    public final org.telegram.ui.Components.pa P;
    public Paint P0;
    public final org.telegram.ui.Components.pa Q;
    public RadialGradient Q0;
    public final org.telegram.ui.Components.pa R;
    public Matrix R0;
    public final org.telegram.ui.Components.pa S;
    public org.telegram.ui.Components.pa T;
    public int U;
    public boolean V;
    public boolean W;
    public org.telegram.ui.ActionBar.d6 f5545a;
    public int f5546a0;
    public final FrameLayout f5547b;
    public int f5548b0;
    public final ah.l f5549c;
    public final e f5550c0;
    public final ah.l d;
    public Utilities.CallbackVoidReturn f5551d0;
    public final Paint f5552e;
    public boolean f5553e0;
    public final g f5554f;
    public final org.telegram.ui.Components.bd f5555f0;
    public ObjectAnimator f5556g0;
    public final Drawable h;
    public ah.c f5557h0;
    public ch.d f5558i0;
    public Utilities.Callback f5559j0;
    public Utilities.Callback f5560k0;
    public ObjectAnimator f5561l0;
    public boolean m0;
    public final fr f5562n;
    public final e f5563n0;
    public float f5564o0;
    public boolean f5565p0;
    public ValueAnimator f5566q0;
    public final j f5567r;
    public Bitmap f5568r0;
    public final FrameLayout f5569s;
    public BitmapShader f5570s0;
    public Matrix f5571t0;
    public Paint f5572u0;
    public final org.telegram.ui.Components.r6 v;
    public final org.telegram.ui.Components.g6 f5573v0;
    public int f5574w;
    public int f5575w0;
    public long f5576x;
    public float f5577x0;
    public final Paint f5578y;
    public boolean f5579y0;
    public final RectF f5580z0;

    public m(Context context, FrameLayout frameLayout, tw0 tw0Var, FrameLayout frameLayout2, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.la laVar) {
        super(context);
        int i10;
        float f7;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        ah.l lVar = new ah.l();
        this.f5549c = lVar;
        ah.l lVar2 = new ah.l();
        this.d = lVar2;
        Paint paint = new Paint(1);
        this.f5552e = paint;
        Paint paint2 = new Paint(1);
        this.f5578y = paint2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(10.0f), new int[]{-65536, 0}, new float[]{0.05f, 1.0f}, Shader.TileMode.CLAMP);
        this.E = linearGradient;
        this.F = new Matrix();
        this.H = new TextPaint(3);
        Paint paint3 = new Paint(3);
        this.I = paint3;
        this.N = -4;
        this.U = UserConfig.selectedAccount;
        this.f5550c0 = new e(this, 0);
        this.f5555f0 = new org.telegram.ui.Components.bd(this, 1.0f, 3.0f);
        this.f5563n0 = new e(this, 1);
        is isVar = is.h;
        this.f5573v0 = new org.telegram.ui.Components.g6(this, 0L, 300L, isVar);
        this.f5579y0 = false;
        this.f5580z0 = new RectF();
        this.A0 = new RectF();
        this.B0 = new RectF();
        this.J0 = new Path();
        this.M0 = new org.telegram.ui.Components.g6(this, 500L, isVar);
        this.f5545a = d6Var;
        this.J = frameLayout;
        this.K = tw0Var;
        this.f5547b = frameLayout2;
        this.O = laVar;
        this.R = new org.telegram.ui.Components.pa(laVar, this, 0, !g());
        this.S = new org.telegram.ui.Components.pa(laVar, this, 8, false);
        this.Q = new org.telegram.ui.Components.pa(laVar, this, 9, false);
        lVar.f611j = true;
        int i17 = org.telegram.ui.ActionBar.h6.f20822d6;
        lVar.a(new f(d6Var, i17, 0.0f, 0));
        lVar.f609g.setColor(0);
        lVar.invalidateSelf();
        lVar2.f611j = true;
        lVar2.a(new f(d6Var, i17, 0.0f, 1));
        lVar2.f609g.setColor(0);
        lVar2.invalidateSelf();
        paint.setColor(Integer.MIN_VALUE);
        this.L = new h4(frameLayout, false, new ai.y1(this, 5));
        g gVar = new g(this, context, tw0Var, getEditTextStyle(), new ai.d(), d6Var, laVar);
        this.f5554f = gVar;
        gVar.S = true;
        gVar.getEditText().addTextChangedListener(new org.telegram.ui.Cells.i3());
        gVar.setFocusable(true);
        gVar.setFocusableInTouchMode(true);
        gVar.getEditText().hintLayoutYFix = true;
        gVar.getEditText().drawHint = new bi.v(this, 1);
        gVar.getEditText().setSupportRtlHint(true);
        su editText = gVar.getEditText();
        if (g()) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        this.P = new org.telegram.ui.Components.pa(laVar, editText, i10, false);
        gVar.getEditText().setHintColor(-1);
        gVar.getEditText().setHintText(LocaleController.getString(R.string.AddCaption), false);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        gVar.getEditText().setTranslationX(AndroidUtilities.dp(-26.0f));
        boolean z10 = this instanceof bt0;
        if (z10) {
            gVar.getEditText().setGravity(48);
        }
        gVar.getEmojiButton().setAlpha(0.0f);
        View emojiButton = gVar.getEmojiButton();
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = -1.0f;
        }
        emojiButton.setTranslationY(AndroidUtilities.dp(f7));
        gVar.setTranslationY(AndroidUtilities.dp(z10 ? 1.0f : -1.0f));
        gVar.getEditText().addTextChangedListener(new h(this));
        gVar.getEditText().setLinkTextColor(-1);
        if (z10) {
            i11 = 48;
        } else {
            i11 = 80;
        }
        addView(gVar, w7.x5.a(-2.0f, 12.0f, 8.0f, b() + 12, 8.0f, -1, i11 | 7));
        j jVar = new j(context);
        this.f5567r = jVar;
        w7.z5.b(jVar, 0.05f, 1.25f);
        Drawable mutate = context.getResources().getDrawable(R.drawable.input_done).mutate();
        this.h = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.U5, false), PorterDuff.Mode.SRC_IN));
        fr frVar = new fr(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21234zf, d6Var)), mutate, 0, AndroidUtilities.dp(1.0f));
        this.f5562n = frVar;
        int dp = AndroidUtilities.dp(36.0f);
        int dp2 = AndroidUtilities.dp(36.0f);
        frVar.h = dp;
        frVar.f26549n = dp2;
        jVar.setImageDrawable(frVar);
        jVar.setScaleType(ImageView.ScaleType.CENTER);
        jVar.setContentDescription(LocaleController.getString(R.string.Done));
        jVar.setAlpha(0.0f);
        jVar.setVisibility(8);
        jVar.setOnClickListener(new ai.v0(this, 7));
        if (z10) {
            i12 = 48;
        } else {
            i12 = 80;
        }
        addView(jVar, w7.x5.a(44.0f, 8.0f, 8.0f, 8.0f, 8.0f, 44, i12 | 5));
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(context, false, true, true);
        this.v = r6Var;
        r6Var.setGravity(17);
        r6Var.setTextSize(AndroidUtilities.dp(15.0f));
        r6Var.setTextColor(-1);
        r6Var.b(0.4f, 320L, isVar);
        r6Var.setTypeface(AndroidUtilities.bold());
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f5569s = frameLayout3;
        frameLayout3.setTranslationX(AndroidUtilities.dp(2.0f));
        if (z10) {
            i13 = 48;
        } else {
            i13 = 80;
        }
        frameLayout3.addView(r6Var, w7.x5.e(52, 16, i13 | 5));
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
        addView(frameLayout3, w7.x5.a(16.0f, 0.0f, f10, 0.0f, i16, 52, i18));
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
        this.f5554f.clearFocus();
    }

    public abstract void d(boolean z10);

    @Override
    public void dispatchDraw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: ci.m.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f5553e0 && (motionEvent.getAction() != 0 || !l(motionEvent.getX(), motionEvent.getY()))) {
            if (this.B0.contains(motionEvent.getX(), motionEvent.getY()) || this.f5565p0) {
                int action = motionEvent.getAction();
                org.telegram.ui.Components.bd bdVar = this.f5555f0;
                if (action == 0 && !this.f5565p0) {
                    if ((this instanceof r) && ((r) this).O1) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    int i10 = 0;
                    while (true) {
                        int childCount = getChildCount();
                        g gVar = this.f5554f;
                        if (i10 < childCount) {
                            View childAt = getChildAt(i10);
                            if (childAt != null && childAt.isClickable() && childAt.getVisibility() == 0 && childAt.getAlpha() >= 0.5f && gVar != childAt) {
                                float x10 = childAt.getX();
                                float y3 = childAt.getY();
                                float x11 = childAt.getX() + childAt.getWidth();
                                float y10 = childAt.getY() + childAt.getHeight();
                                RectF rectF = this.f5580z0;
                                rectF.set(x10, y3, x11, y10);
                                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                                    return super.dispatchTouchEvent(motionEvent);
                                }
                            }
                            i10++;
                        } else {
                            this.L.b(false);
                            gVar.getEditText().setForceCursorEnd(true);
                            gVar.getEditText().requestFocus();
                            vu vuVar = gVar.f24679a;
                            vuVar.requestFocus();
                            AndroidUtilities.showKeyboard(vuVar);
                            gVar.getEditText().setScrollY(0);
                            bdVar.c(true);
                            return true;
                        }
                    }
                } else {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        bdVar.c(false);
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        g gVar;
        float max;
        RectF rectF = this.A0;
        if (view == this.f5554f) {
            if (this instanceof bt0) {
                max = 0.0f;
            } else {
                max = (1.0f - this.f5564o0) * Math.max(0, (gVar.getHeight() - AndroidUtilities.dp(82.0f)) - gVar.getScrollY());
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
            Paint paint = this.f5578y;
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
        return this.f5574w;
    }

    public int getEditTextHeight() {
        return (int) this.f5573v0.f26665c;
    }

    public int getEditTextHeightClosedKeyboard() {
        return Math.min(AndroidUtilities.dp(82.0f), this.f5554f.getHeight());
    }

    public int getEditTextLeft() {
        return 0;
    }

    public int getEditTextStyle() {
        return 2;
    }

    public float getOver2Alpha() {
        return this.M0.f26665c;
    }

    public int getSelectionLength() {
        g gVar = this.f5554f;
        if (gVar != null && gVar.getEditText() != null) {
            try {
                return gVar.getEditText().getSelectionEnd() - gVar.getEditText().getSelectionStart();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        return 0;
    }

    public CharSequence getText() {
        return this.f5554f.getText();
    }

    public abstract void h(org.telegram.ui.Components.pa paVar, Canvas canvas, RectF rectF, float f7, boolean z10, float f10, float f11, boolean z11);

    public void i(Bitmap bitmap) {
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    public abstract boolean l(float f7, float f10);

    public final void m() {
        invalidate();
        g gVar = this.f5554f;
        gVar.getEditText().invalidate();
        gVar.getEmojiButton().invalidate();
        i iVar = this.M;
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
        Bitmap bitmap = this.f5568r0;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f5570s0 = null;
        this.f5572u0 = null;
        Bitmap bitmap2 = this.G;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.G = null;
        }
    }

    public final boolean p() {
        g gVar = this.f5554f;
        boolean z10 = gVar.f24688x;
        h4 h4Var = this.L;
        if (z10 && gVar.getEmojiView() != null) {
            if (h4Var.c()) {
                gVar.getEmojiView().C();
                return true;
            }
            wu wuVar = gVar.d;
            if (wuVar != null) {
                wuVar.C();
                gVar.d.u(false);
            }
            return true;
        } else if (gVar.f24682e) {
            gVar.k(true);
            return true;
        } else if ((!gVar.v && !h4Var.c()) || h4Var.d) {
            return false;
        } else {
            gVar.d();
            gVar.k(true);
            return true;
        }
    }

    public void setAccount(int i10) {
        this.U = i10;
    }

    public void setBlurredBackgroundDrawableForMentions(ah.c cVar) {
        this.f5557h0 = cVar;
    }

    public void setDialogId(long j3) {
        this.f5576x = j3;
        i iVar = this.M;
        if (iVar != null) {
            iVar.setDialogId(j3);
        }
    }

    public void setOnHeightUpdate(Utilities.Callback<Integer> callback) {
        this.f5559j0 = callback;
    }

    public void setOnKeyboardOpen(Utilities.Callback<Boolean> callback) {
        this.f5560k0 = callback;
    }

    @Override
    public void setPressed(boolean z10) {
        boolean z11;
        super.setPressed(z10);
        if (z10 && !this.f5565p0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f5555f0.c(z11);
    }

    public void setText(CharSequence charSequence) {
        this.V = true;
        this.f5554f.setText(charSequence);
    }

    public void setUiBlurBitmap(Utilities.CallbackVoidReturn<Bitmap> callbackVoidReturn) {
        this.f5551d0 = callbackVoidReturn;
    }

    public abstract void u(float f7);

    public final void v(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence) {
        if (spannableStringBuilder == null && charSequence == null) {
            this.C0 = false;
            invalidate();
            return;
        }
        this.C0 = true;
        if (spannableStringBuilder == null) {
            spannableStringBuilder = "";
        }
        this.D0 = new m11(spannableStringBuilder, 14.0f, AndroidUtilities.bold());
        if (charSequence == null) {
            charSequence = "";
        }
        this.E0 = new m11(charSequence, 14.0f, null);
    }

    public void w() {
        this.M.getAdapter().f10667c = false;
        this.M.getAdapter().d = false;
        this.M.getAdapter().f10670e = false;
        this.M.getAdapter().m0 = this instanceof r;
    }

    public void x(int i10) {
        int bottomPadding;
        tw0 tw0Var = this.K;
        if (tw0Var != null) {
            tw0Var.S();
        }
        g gVar = this.f5554f;
        boolean z10 = false;
        if (gVar.f24682e) {
            i10 = Math.max(0, gVar.getEmojiPadding() + a());
        } else if (gVar.N) {
            i10 = Math.max(0, gVar.getKeyboardHeight() + a());
        }
        if (tw0Var == null) {
            bottomPadding = 0;
        } else {
            bottomPadding = tw0Var.getBottomPadding();
        }
        int max = Math.max(0, i10 - bottomPadding);
        View view = (View) getParent();
        view.clearAnimation();
        if (!(this instanceof bt0)) {
            ObjectAnimator objectAnimator = this.f5561l0;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.f5561l0.cancel();
                this.f5561l0 = null;
            }
            this.f5561l0 = ObjectAnimator.ofFloat(view, FrameLayout.TRANSLATION_Y, view.getTranslationY(), -max);
            if (max > AndroidUtilities.dp(20.0f)) {
                this.f5561l0.setInterpolator(org.telegram.ui.ActionBar.o1.f21443w);
                this.f5561l0.setDuration(250L);
            } else {
                this.f5561l0.setInterpolator(is.h);
                this.f5561l0.setDuration(640L);
            }
            this.f5561l0.start();
        }
        if (max > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        }
        this.m0 = z10;
        e eVar = this.f5563n0;
        AndroidUtilities.cancelRunOnUIThread(eVar);
        AndroidUtilities.runOnUIThread(eVar);
        if (max < AndroidUtilities.dp(20.0f)) {
            gVar.getEditText().clearFocus();
            gVar.k(true);
        }
    }

    public void y() {
        if (this.M != null) {
            float translationY = ((View) getParent()).getTranslationY() - this.f5573v0.f26665c;
            if (this.M.getY() != translationY) {
                this.M.setTranslationY(translationY);
                this.M.invalidate();
            }
        }
    }

    public void q(boolean z10) {
    }

    public void r(int i10) {
    }

    public void n() {
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
