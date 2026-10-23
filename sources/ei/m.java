package ei;

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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.mu;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.zq;
import org.telegram.ui.is0;
public abstract class m extends FrameLayout {
    public final RectF A0;
    public final RectF B0;
    public boolean C0;
    public f11 D0;
    public final LinearGradient E;
    public f11 E0;
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
    public final lw0 K;
    public boolean K0;
    public final b4 L;
    public int L0;
    public i M;
    public final org.telegram.ui.Components.f6 M0;
    public int N;
    public Paint N0;
    public final org.telegram.ui.Components.ja O;
    public RadialGradient O0;
    public final org.telegram.ui.Components.na P;
    public Paint P0;
    public final org.telegram.ui.Components.na Q;
    public RadialGradient Q0;
    public final org.telegram.ui.Components.na R;
    public Matrix R0;
    public final org.telegram.ui.Components.na S;
    public org.telegram.ui.Components.na T;
    public int U;
    public boolean V;
    public boolean W;
    public org.telegram.ui.ActionBar.d6 f9391a;
    public int f9392a0;
    public final FrameLayout f9393b;
    public int f9394b0;
    public final bh.j f9395c;
    public final e f9396c0;
    public final bh.j d;
    public Utilities.CallbackVoidReturn f9397d0;
    public final Paint e;
    public boolean f9398e0;
    public final g f9399f;
    public final yc f9400f0;
    public ObjectAnimator f9401g0;
    public final Drawable h;
    public bh.b f9402h0;
    public dh.d f9403i0;
    public Utilities.Callback f9404j0;
    public Utilities.Callback f9405k0;
    public ObjectAnimator f9406l0;
    public boolean m0;
    public final zq f9407n;
    public final e f9408n0;
    public float f9409o0;
    public boolean f9410p0;
    public ValueAnimator f9411q0;
    public final j f9412r;
    public Bitmap f9413r0;
    public final FrameLayout f9414s;
    public BitmapShader f9415s0;
    public Matrix f9416t0;
    public Paint f9417u0;
    public final org.telegram.ui.Components.q6 v;
    public final org.telegram.ui.Components.f6 f9418v0;
    public int f9419w;
    public int f9420w0;
    public long f9421x;
    public float f9422x0;
    public final Paint f9423y;
    public boolean f9424y0;
    public final RectF f9425z0;

    public m(Context context, FrameLayout frameLayout, lw0 lw0Var, FrameLayout frameLayout2, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.ja jaVar) {
        super(context);
        int i10;
        float f7;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        bh.j jVar = new bh.j();
        this.f9395c = jVar;
        bh.j jVar2 = new bh.j();
        this.d = jVar2;
        Paint paint = new Paint(1);
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.f9423y = paint2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(10.0f), new int[]{-65536, 0}, new float[]{0.05f, 1.0f}, Shader.TileMode.CLAMP);
        this.E = linearGradient;
        this.F = new Matrix();
        this.H = new TextPaint(3);
        Paint paint3 = new Paint(3);
        this.I = paint3;
        this.N = -4;
        this.U = UserConfig.selectedAccount;
        this.f9396c0 = new e(this, 0);
        this.f9400f0 = new yc(this, 1.0f, 3.0f);
        this.f9408n0 = new e(this, 1);
        bs bsVar = bs.h;
        this.f9418v0 = new org.telegram.ui.Components.f6(this, 0L, 300L, bsVar);
        this.f9424y0 = false;
        this.f9425z0 = new RectF();
        this.A0 = new RectF();
        this.B0 = new RectF();
        this.J0 = new Path();
        this.M0 = new org.telegram.ui.Components.f6(this, 500L, bsVar);
        this.f9391a = d6Var;
        this.J = frameLayout;
        this.K = lw0Var;
        this.f9393b = frameLayout2;
        this.O = jaVar;
        this.R = new org.telegram.ui.Components.na(jaVar, this, 0, !g());
        this.S = new org.telegram.ui.Components.na(jaVar, this, 8, false);
        this.Q = new org.telegram.ui.Components.na(jaVar, this, 9, false);
        jVar.f4417j = true;
        int i17 = org.telegram.ui.ActionBar.h6.f20994d6;
        jVar.a(new f(d6Var, i17, 0.0f, 0));
        jVar.f4415g.setColor(0);
        jVar.invalidateSelf();
        jVar2.f4417j = true;
        jVar2.a(new f(d6Var, i17, 0.0f, 1));
        jVar2.f4415g.setColor(0);
        jVar2.invalidateSelf();
        paint.setColor(Integer.MIN_VALUE);
        this.L = new b4(frameLayout, false, new ai.r0(this, 11));
        g gVar = new g(this, context, lw0Var, getEditTextStyle(), new ci.b(), d6Var, jaVar);
        this.f9399f = gVar;
        gVar.S = true;
        gVar.getEditText().addTextChangedListener(new org.telegram.ui.Cells.h3());
        gVar.setFocusable(true);
        gVar.setFocusableInTouchMode(true);
        gVar.getEditText().hintLayoutYFix = true;
        gVar.getEditText().drawHint = new ai.q(this, 12);
        gVar.getEditText().setSupportRtlHint(true);
        iu editText = gVar.getEditText();
        if (g()) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        this.P = new org.telegram.ui.Components.na(jaVar, editText, i10, false);
        gVar.getEditText().setHintColor(-1);
        gVar.getEditText().setHintText(LocaleController.getString(R.string.AddCaption), false);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        gVar.getEditText().setTranslationX(AndroidUtilities.dp(-26.0f));
        boolean z10 = this instanceof is0;
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
        addView(gVar, w7.z5.d(-1, -2.0f, i11 | 7, 12.0f, 8.0f, b() + 12, 8.0f));
        j jVar3 = new j(context);
        this.f9412r = jVar3;
        w7.b6.b(jVar3, 0.05f, 1.25f);
        Drawable mutate = context.getResources().getDrawable(R.drawable.input_done).mutate();
        this.h = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.U5, false), PorterDuff.Mode.SRC_IN));
        zq zqVar = new zq(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21407zf, d6Var)), mutate, 0, AndroidUtilities.dp(1.0f));
        this.f9407n = zqVar;
        int dp = AndroidUtilities.dp(36.0f);
        int dp2 = AndroidUtilities.dp(36.0f);
        zqVar.h = dp;
        zqVar.f33025n = dp2;
        jVar3.setImageDrawable(zqVar);
        jVar3.setScaleType(ImageView.ScaleType.CENTER);
        jVar3.setContentDescription(LocaleController.getString(R.string.Done));
        jVar3.setAlpha(0.0f);
        jVar3.setVisibility(8);
        jVar3.setOnClickListener(new ah.g0(this, 18));
        if (z10) {
            i12 = 48;
        } else {
            i12 = 80;
        }
        addView(jVar3, w7.z5.d(44, 44.0f, i12 | 5, 8.0f, 8.0f, 8.0f, 8.0f));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, false, true, true);
        this.v = q6Var;
        q6Var.setGravity(17);
        q6Var.setTextSize(AndroidUtilities.dp(15.0f));
        q6Var.setTextColor(-1);
        q6Var.b(0.4f, 320L, bsVar);
        q6Var.setTypeface(AndroidUtilities.bold());
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f9414s = frameLayout3;
        frameLayout3.setTranslationX(AndroidUtilities.dp(2.0f));
        if (z10) {
            i13 = 48;
        } else {
            i13 = 80;
        }
        frameLayout3.addView(q6Var, w7.z5.e(52, 16, i13 | 5));
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
        addView(frameLayout3, w7.z5.d(52, 16.0f, i18, 0.0f, f10, 0.0f, i16));
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
        this.f9399f.clearFocus();
    }

    public abstract void d(boolean z10);

    @Override
    public void dispatchDraw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: ei.m.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f9398e0 && (motionEvent.getAction() != 0 || !l(motionEvent.getX(), motionEvent.getY()))) {
            if (this.B0.contains(motionEvent.getX(), motionEvent.getY()) || this.f9410p0) {
                int action = motionEvent.getAction();
                yc ycVar = this.f9400f0;
                if (action == 0 && !this.f9410p0) {
                    if ((this instanceof r) && ((r) this).O1) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    int i10 = 0;
                    while (true) {
                        int childCount = getChildCount();
                        g gVar = this.f9399f;
                        if (i10 < childCount) {
                            View childAt = getChildAt(i10);
                            if (childAt != null && childAt.isClickable() && childAt.getVisibility() == 0 && childAt.getAlpha() >= 0.5f && gVar != childAt) {
                                float x10 = childAt.getX();
                                float y3 = childAt.getY();
                                float x11 = childAt.getX() + childAt.getWidth();
                                float y10 = childAt.getY() + childAt.getHeight();
                                RectF rectF = this.f9425z0;
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
                            lu luVar = gVar.f29714a;
                            luVar.requestFocus();
                            AndroidUtilities.showKeyboard(luVar);
                            gVar.getEditText().setScrollY(0);
                            ycVar.c(true);
                            return true;
                        }
                    }
                } else {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        ycVar.c(false);
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        g gVar;
        float max;
        RectF rectF = this.A0;
        if (view == this.f9399f) {
            if (this instanceof is0) {
                max = 0.0f;
            } else {
                max = (1.0f - this.f9409o0) * Math.max(0, (gVar.getHeight() - AndroidUtilities.dp(82.0f)) - gVar.getScrollY());
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(0.0f, max);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            canvas.save();
            Matrix matrix = this.F;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top - 1.0f);
            LinearGradient linearGradient = this.E;
            linearGradient.setLocalMatrix(matrix);
            float f7 = rectF.left;
            float f10 = rectF.top;
            Paint paint = this.f9423y;
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
        return this.f9419w;
    }

    public int getEditTextHeight() {
        return (int) this.f9418v0.f26090c;
    }

    public int getEditTextHeightClosedKeyboard() {
        return Math.min(AndroidUtilities.dp(82.0f), this.f9399f.getHeight());
    }

    public int getEditTextLeft() {
        return 0;
    }

    public int getEditTextStyle() {
        return 2;
    }

    public float getOver2Alpha() {
        return this.M0.f26090c;
    }

    public int getSelectionLength() {
        g gVar = this.f9399f;
        if (gVar != null && gVar.getEditText() != null) {
            try {
                return gVar.getEditText().getSelectionEnd() - gVar.getEditText().getSelectionStart();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return 0;
    }

    public CharSequence getText() {
        return this.f9399f.getText();
    }

    public abstract void h(org.telegram.ui.Components.na naVar, Canvas canvas, RectF rectF, float f7, boolean z10, float f10, float f11, boolean z11);

    public void i(Bitmap bitmap) {
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    public abstract boolean l(float f7, float f10);

    public final void m() {
        invalidate();
        g gVar = this.f9399f;
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
        Bitmap bitmap = this.f9413r0;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f9415s0 = null;
        this.f9417u0 = null;
        Bitmap bitmap2 = this.G;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.G = null;
        }
    }

    public final boolean p() {
        g gVar = this.f9399f;
        boolean z10 = gVar.f29722x;
        b4 b4Var = this.L;
        if (z10 && gVar.getEmojiView() != null) {
            if (b4Var.c()) {
                gVar.getEmojiView().B();
                return true;
            }
            mu muVar = gVar.d;
            if (muVar != null) {
                muVar.B();
                gVar.d.u(false);
            }
            return true;
        } else if (gVar.e) {
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

    public void setAccount(int i10) {
        this.U = i10;
    }

    public void setBlurredBackgroundDrawableForMentions(bh.b bVar) {
        this.f9402h0 = bVar;
    }

    public void setDialogId(long j10) {
        this.f9421x = j10;
        i iVar = this.M;
        if (iVar != null) {
            iVar.setDialogId(j10);
        }
    }

    public void setOnHeightUpdate(Utilities.Callback<Integer> callback) {
        this.f9404j0 = callback;
    }

    public void setOnKeyboardOpen(Utilities.Callback<Boolean> callback) {
        this.f9405k0 = callback;
    }

    @Override
    public void setPressed(boolean z10) {
        boolean z11;
        super.setPressed(z10);
        if (z10 && !this.f9410p0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f9400f0.c(z11);
    }

    public void setText(CharSequence charSequence) {
        this.V = true;
        this.f9399f.setText(charSequence);
    }

    public void setUiBlurBitmap(Utilities.CallbackVoidReturn<Bitmap> callbackVoidReturn) {
        this.f9397d0 = callbackVoidReturn;
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
        this.D0 = new f11(spannableStringBuilder, 14.0f, AndroidUtilities.bold());
        if (charSequence == null) {
            charSequence = "";
        }
        this.E0 = new f11(charSequence, 14.0f, null);
    }

    public void w() {
        this.M.getAdapter().f11921c = false;
        this.M.getAdapter().d = false;
        this.M.getAdapter().e = false;
        this.M.getAdapter().m0 = this instanceof r;
    }

    public void x(int i10) {
        int bottomPadding;
        lw0 lw0Var = this.K;
        if (lw0Var != null) {
            lw0Var.S();
        }
        g gVar = this.f9399f;
        boolean z10 = false;
        if (gVar.e) {
            i10 = Math.max(0, gVar.getEmojiPadding() + a());
        } else if (gVar.N) {
            i10 = Math.max(0, gVar.getKeyboardHeight() + a());
        }
        if (lw0Var == null) {
            bottomPadding = 0;
        } else {
            bottomPadding = lw0Var.getBottomPadding();
        }
        int max = Math.max(0, i10 - bottomPadding);
        View view = (View) getParent();
        view.clearAnimation();
        if (!(this instanceof is0)) {
            ObjectAnimator objectAnimator = this.f9406l0;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.f9406l0.cancel();
                this.f9406l0 = null;
            }
            this.f9406l0 = ObjectAnimator.ofFloat(view, FrameLayout.TRANSLATION_Y, view.getTranslationY(), -max);
            if (max > AndroidUtilities.dp(20.0f)) {
                this.f9406l0.setInterpolator(org.telegram.ui.ActionBar.o1.f21636w);
                this.f9406l0.setDuration(250L);
            } else {
                this.f9406l0.setInterpolator(bs.h);
                this.f9406l0.setDuration(640L);
            }
            this.f9406l0.start();
        }
        if (max > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        }
        this.m0 = z10;
        e eVar = this.f9408n0;
        AndroidUtilities.cancelRunOnUIThread(eVar);
        AndroidUtilities.runOnUIThread(eVar);
        if (max < AndroidUtilities.dp(20.0f)) {
            gVar.getEditText().clearFocus();
            gVar.k(true);
        }
    }

    public void y() {
        if (this.M != null) {
            float translationY = ((View) getParent()).getTranslationY() - this.f9418v0.f26090c;
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
