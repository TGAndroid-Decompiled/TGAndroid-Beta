package fi;

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
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.mu;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.r11;
import org.telegram.ui.Components.ww0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.rs0;
public abstract class m extends FrameLayout {
    public final RectF A0;
    public final RectF B0;
    public boolean C0;
    public r11 D0;
    public final LinearGradient E;
    public r11 E0;
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
    public final ww0 K;
    public boolean K0;
    public final z3 L;
    public int L0;
    public i M;
    public final org.telegram.ui.Components.h6 M0;
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
    public org.telegram.ui.ActionBar.u6 f11190a;
    public int f11191a0;
    public final FrameLayout f11192b;
    public int f11193b0;
    public final ch.i f11194c;
    public final e f11195c0;
    public final ch.i d;
    public Utilities.CallbackVoidReturn f11196d0;
    public final Paint e;
    public boolean f11197e0;
    public final g f11198f;
    public final xc f11199f0;
    public ObjectAnimator f11200g0;
    public final Drawable h;
    public ch.b f11201h0;
    public eh.d f11202i0;
    public Utilities.Callback f11203j0;
    public Utilities.Callback f11204k0;
    public ObjectAnimator f11205l0;
    public boolean m0;
    public final ar f11206n;
    public final e f11207n0;
    public float f11208o0;
    public boolean f11209p0;
    public ValueAnimator f11210q0;
    public final j f11211r;
    public Bitmap f11212r0;
    public final FrameLayout f11213s;
    public BitmapShader f11214s0;
    public Matrix f11215t0;
    public Paint f11216u0;
    public final org.telegram.ui.Components.s6 v;
    public final org.telegram.ui.Components.h6 f11217v0;
    public int f11218w;
    public int f11219w0;
    public long f11220x;
    public float f11221x0;
    public final Paint f11222y;
    public boolean f11223y0;
    public final RectF f11224z0;

    public m(Context context, FrameLayout frameLayout, ww0 ww0Var, FrameLayout frameLayout2, org.telegram.ui.ActionBar.u6 u6Var, org.telegram.ui.Components.la laVar) {
        super(context);
        int i10;
        float f7;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        ch.i iVar = new ch.i();
        this.f11194c = iVar;
        ch.i iVar2 = new ch.i();
        this.d = iVar2;
        Paint paint = new Paint(1);
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.f11222y = paint2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(10.0f), new int[]{-65536, 0}, new float[]{0.05f, 1.0f}, Shader.TileMode.CLAMP);
        this.E = linearGradient;
        this.F = new Matrix();
        this.H = new TextPaint(3);
        Paint paint3 = new Paint(3);
        this.I = paint3;
        this.N = -4;
        this.U = UserConfig.selectedAccount;
        this.f11195c0 = new e(this, 0);
        this.f11199f0 = new xc(this, 1.0f, 3.0f);
        this.f11207n0 = new e(this, 1);
        ds dsVar = ds.h;
        this.f11217v0 = new org.telegram.ui.Components.h6(this, 0L, 300L, dsVar);
        this.f11223y0 = false;
        this.f11224z0 = new RectF();
        this.A0 = new RectF();
        this.B0 = new RectF();
        this.J0 = new Path();
        this.M0 = new org.telegram.ui.Components.h6(this, 500L, dsVar);
        this.f11190a = u6Var;
        this.J = frameLayout;
        this.K = ww0Var;
        this.f11192b = frameLayout2;
        this.O = laVar;
        this.R = new org.telegram.ui.Components.pa(laVar, this, 0, !g());
        this.S = new org.telegram.ui.Components.pa(laVar, this, 8, false);
        this.Q = new org.telegram.ui.Components.pa(laVar, this, 9, false);
        iVar.f6358k = true;
        int i17 = org.telegram.ui.ActionBar.y6.f23357d6;
        iVar.a(new f(u6Var, i17, 0.0f, 0));
        iVar.f6355g.setColor(0);
        iVar.invalidateSelf();
        iVar2.f6358k = true;
        iVar2.a(new f(u6Var, i17, 0.0f, 1));
        iVar2.f6355g.setColor(0);
        iVar2.invalidateSelf();
        paint.setColor(Integer.MIN_VALUE);
        this.L = new z3(frameLayout, false, new ai.i(this, 15));
        g gVar = new g(this, context, ww0Var, getEditTextStyle(), new di.b(), u6Var, laVar);
        this.f11198f = gVar;
        gVar.S = true;
        gVar.getEditText().addTextChangedListener(new org.telegram.ui.Cells.f3());
        gVar.setFocusable(true);
        gVar.setFocusableInTouchMode(true);
        gVar.getEditText().hintLayoutYFix = true;
        gVar.getEditText().drawHint = new ai.e(this, 15);
        gVar.getEditText().setSupportRtlHint(true);
        ju editText = gVar.getEditText();
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
        boolean z10 = this instanceof rs0;
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
        addView(gVar, kb1.h(-1, -2.0f, i11 | 7, 12.0f, 8.0f, b() + 12, 8.0f));
        j jVar = new j(context);
        this.f11211r = jVar;
        kb1.c(jVar, 0.05f, 1.25f);
        Drawable mutate = context.getResources().getDrawable(R.drawable.input_done).mutate();
        this.h = mutate;
        org.telegram.ui.ActionBar.f7.y(this, mutate, org.telegram.ui.ActionBar.y6.U5, null, PorterDuff.Mode.SRC_IN);
        ar arVar = new ar(org.telegram.ui.ActionBar.y6.K(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.zf, u6Var)), mutate, 0, AndroidUtilities.dp(1.0f));
        this.f11206n = arVar;
        int dp = AndroidUtilities.dp(36.0f);
        int dp2 = AndroidUtilities.dp(36.0f);
        arVar.h = dp;
        arVar.f26643n = dp2;
        jVar.setImageDrawable(arVar);
        jVar.setScaleType(ImageView.ScaleType.CENTER);
        jVar.setContentDescription(LocaleController.getString(R.string.Done));
        jVar.setAlpha(0.0f);
        jVar.setVisibility(8);
        jVar.setOnClickListener(new ai.s(this, 19));
        if (z10) {
            i12 = 48;
        } else {
            i12 = 80;
        }
        addView(jVar, kb1.h(44, 44.0f, i12 | 5, 8.0f, 8.0f, 8.0f, 8.0f));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, false, true, true);
        this.v = s6Var;
        s6Var.setGravity(17);
        s6Var.setTextSize(AndroidUtilities.dp(15.0f));
        s6Var.setTextColor(-1);
        s6Var.b(0.4f, 320L, dsVar);
        s6Var.setTypeface(AndroidUtilities.bold());
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f11213s = frameLayout3;
        frameLayout3.setTranslationX(AndroidUtilities.dp(2.0f));
        if (z10) {
            i13 = 48;
        } else {
            i13 = 80;
        }
        frameLayout3.addView(s6Var, kb1.i(52, 16, i13 | 5));
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
        addView(frameLayout3, kb1.h(52, 16.0f, i18, 0.0f, f10, 0.0f, i16));
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
        this.f11198f.clearFocus();
    }

    public abstract void d(boolean z10);

    @Override
    public void dispatchDraw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: fi.m.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f11197e0 && (motionEvent.getAction() != 0 || !l(motionEvent.getX(), motionEvent.getY()))) {
            if (this.B0.contains(motionEvent.getX(), motionEvent.getY()) || this.f11209p0) {
                int action = motionEvent.getAction();
                xc xcVar = this.f11199f0;
                if (action == 0 && !this.f11209p0) {
                    if ((this instanceof r) && ((r) this).O1) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    int i10 = 0;
                    while (true) {
                        int childCount = getChildCount();
                        g gVar = this.f11198f;
                        if (i10 < childCount) {
                            View childAt = getChildAt(i10);
                            if (childAt != null && childAt.isClickable() && childAt.getVisibility() == 0 && childAt.getAlpha() >= 0.5f && gVar != childAt) {
                                float x9 = childAt.getX();
                                float y3 = childAt.getY();
                                float x10 = childAt.getX() + childAt.getWidth();
                                float y10 = childAt.getY() + childAt.getHeight();
                                RectF rectF = this.f11224z0;
                                rectF.set(x9, y3, x10, y10);
                                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                                    return super.dispatchTouchEvent(motionEvent);
                                }
                            }
                            i10++;
                        } else {
                            this.L.b(false);
                            gVar.getEditText().setForceCursorEnd(true);
                            gVar.getEditText().requestFocus();
                            mu muVar = gVar.f32365a;
                            muVar.requestFocus();
                            AndroidUtilities.showKeyboard(muVar);
                            gVar.getEditText().setScrollY(0);
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        g gVar;
        float max;
        RectF rectF = this.A0;
        if (view == this.f11198f) {
            if (this instanceof rs0) {
                max = 0.0f;
            } else {
                max = (1.0f - this.f11208o0) * Math.max(0, (gVar.getHeight() - AndroidUtilities.dp(82.0f)) - gVar.getScrollY());
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
            Paint paint = this.f11222y;
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
        return this.f11218w;
    }

    public int getEditTextHeight() {
        return (int) this.f11217v0.f28864c;
    }

    public int getEditTextHeightClosedKeyboard() {
        return Math.min(AndroidUtilities.dp(82.0f), this.f11198f.getHeight());
    }

    public int getEditTextLeft() {
        return 0;
    }

    public int getEditTextStyle() {
        return 2;
    }

    public float getOver2Alpha() {
        return this.M0.f28864c;
    }

    public int getSelectionLength() {
        g gVar = this.f11198f;
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
        return this.f11198f.getText();
    }

    public abstract void h(org.telegram.ui.Components.pa paVar, Canvas canvas, RectF rectF, float f7, boolean z10, float f10, float f11, boolean z11);

    public void i(Bitmap bitmap) {
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    public abstract boolean l(float f7, float f10);

    public final void m() {
        invalidate();
        g gVar = this.f11198f;
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
        Bitmap bitmap = this.f11212r0;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f11214s0 = null;
        this.f11216u0 = null;
        Bitmap bitmap2 = this.G;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.G = null;
        }
    }

    public final boolean p() {
        g gVar = this.f11198f;
        boolean z10 = gVar.f32373x;
        z3 z3Var = this.L;
        if (z10 && gVar.getEmojiView() != null) {
            if (z3Var.c()) {
                gVar.getEmojiView().B();
                return true;
            }
            nu nuVar = gVar.d;
            if (nuVar != null) {
                nuVar.B();
                gVar.d.t(false);
            }
            return true;
        } else if (gVar.e) {
            gVar.k(true);
            return true;
        } else if ((!gVar.v && !z3Var.c()) || z3Var.d) {
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

    public void setBlurredBackgroundDrawableForMentions(ch.b bVar) {
        this.f11201h0 = bVar;
    }

    public void setDialogId(long j10) {
        this.f11220x = j10;
        i iVar = this.M;
        if (iVar != null) {
            iVar.setDialogId(j10);
        }
    }

    public void setOnHeightUpdate(Utilities.Callback<Integer> callback) {
        this.f11203j0 = callback;
    }

    public void setOnKeyboardOpen(Utilities.Callback<Boolean> callback) {
        this.f11204k0 = callback;
    }

    @Override
    public void setPressed(boolean z10) {
        boolean z11;
        super.setPressed(z10);
        if (z10 && !this.f11209p0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f11199f0.c(z11);
    }

    public void setText(CharSequence charSequence) {
        this.V = true;
        this.f11198f.setText(charSequence);
    }

    public void setUiBlurBitmap(Utilities.CallbackVoidReturn<Bitmap> callbackVoidReturn) {
        this.f11196d0 = callbackVoidReturn;
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
        this.D0 = new r11(spannableStringBuilder, 14.0f, AndroidUtilities.bold());
        if (charSequence == null) {
            charSequence = "";
        }
        this.E0 = new r11(charSequence, 14.0f, null);
    }

    public void w() {
        this.M.getAdapter().f14111c = false;
        this.M.getAdapter().d = false;
        this.M.getAdapter().e = false;
        this.M.getAdapter().m0 = this instanceof r;
    }

    public void x(int i10) {
        int bottomPadding;
        ww0 ww0Var = this.K;
        if (ww0Var != null) {
            ww0Var.R();
        }
        g gVar = this.f11198f;
        boolean z10 = false;
        if (gVar.e) {
            i10 = Math.max(0, gVar.getEmojiPadding() + a());
        } else if (gVar.N) {
            i10 = Math.max(0, gVar.getKeyboardHeight() + a());
        }
        if (ww0Var == null) {
            bottomPadding = 0;
        } else {
            bottomPadding = ww0Var.getBottomPadding();
        }
        int max = Math.max(0, i10 - bottomPadding);
        View view = (View) getParent();
        view.clearAnimation();
        if (!(this instanceof rs0)) {
            ObjectAnimator objectAnimator = this.f11205l0;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.f11205l0.cancel();
                this.f11205l0 = null;
            }
            this.f11205l0 = ObjectAnimator.ofFloat(view, FrameLayout.TRANSLATION_Y, view.getTranslationY(), -max);
            if (max > AndroidUtilities.dp(20.0f)) {
                this.f11205l0.setInterpolator(org.telegram.ui.ActionBar.q1.f22964w);
                this.f11205l0.setDuration(250L);
            } else {
                this.f11205l0.setInterpolator(ds.h);
                this.f11205l0.setDuration(640L);
            }
            this.f11205l0.start();
        }
        if (max > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        }
        this.m0 = z10;
        e eVar = this.f11207n0;
        AndroidUtilities.cancelRunOnUIThread(eVar);
        AndroidUtilities.runOnUIThread(eVar);
        if (max < AndroidUtilities.dp(20.0f)) {
            gVar.getEditText().clearFocus();
            gVar.k(true);
        }
    }

    public void y() {
        if (this.M != null) {
            float translationY = ((View) getParent()).getTranslationY() - this.f11217v0.f28864c;
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
