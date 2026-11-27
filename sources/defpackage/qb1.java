package defpackage;

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
import org.telegram.messenger.Utilities;
public abstract class qb1 extends FrameLayout {
    public final RectF A0;
    public final RectF B0;
    public boolean C0;
    public pkb D0;
    public final Paint E;
    public pkb E0;
    public final LinearGradient F;
    public Path F0;
    public final Matrix G;
    public Paint G0;
    public Bitmap H;
    public Path H0;
    public final TextPaint I;
    public float[] I0;
    public final Paint J;
    public final Path J0;
    public final FrameLayout K;
    public boolean K0;
    public final wma L;
    public int L0;
    public final rx5 M;
    public final mm M0;
    public mb1 N;
    public Paint N0;
    public int O;
    public RadialGradient O0;
    public final tl0 P;
    public Paint P0;
    public final xl0 Q;
    public RadialGradient Q0;
    public final xl0 R;
    public Matrix R0;
    public final xl0 S;
    public final xl0 T;
    public xl0 U;
    public int V;
    public boolean W;
    public vnb a;
    public boolean a0;
    public final FrameLayout b;
    public int b0;
    public final sdb c;
    public int c0;
    public final sdb d;
    public final hb1 d0;
    public final Paint e;
    public boolean e0;
    public final kb1 f;
    public final v41 f0;
    public ObjectAnimator g0;
    public final Drawable h;
    public ll0 h0;
    public jl0 i0;
    public pcc j0;
    public pcc k0;
    public ObjectAnimator l0;
    public boolean m0;
    public final zm2 n;
    public final hb1 n0;
    public float o0;
    public boolean p0;
    public ValueAnimator q0;
    public final nb1 r;
    public Bitmap r0;
    public final FrameLayout s;
    public BitmapShader s0;
    public Matrix t0;
    public Paint u0;
    public final mm v0;
    public final in w;
    public int w0;
    public int x;
    public float x0;
    public long y;
    public boolean y0;
    public final RectF z0;

    public qb1(Context context, FrameLayout frameLayout, wma wmaVar, FrameLayout frameLayout2, vnb vnbVar, tl0 tl0Var) {
        super(context);
        int i;
        float f;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        sdb sdbVar = new sdb();
        this.c = sdbVar;
        sdb sdbVar2 = new sdb();
        this.d = sdbVar2;
        Paint paint = new Paint(1);
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, hl.L(10.0f), new int[]{-65536, 0}, new float[]{0.05f, 1.0f}, Shader.TileMode.CLAMP);
        this.F = linearGradient;
        this.G = new Matrix();
        this.I = new TextPaint(3);
        Paint paint3 = new Paint(3);
        this.J = paint3;
        this.O = -4;
        this.V = yac.t0;
        this.d0 = new hb1(this, (byte) 0);
        this.f0 = new v41(this, 1.0f, 3.0f);
        this.n0 = new hb1(this, (byte) 1);
        k43 k43Var = k43.h;
        this.v0 = new mm(this, 0L, 300L, k43Var);
        this.y0 = false;
        this.z0 = new RectF();
        this.A0 = new RectF();
        this.B0 = new RectF();
        this.J0 = new Path();
        this.M0 = new mm(500L, this, k43Var);
        this.a = vnbVar;
        this.K = frameLayout;
        this.L = wmaVar;
        this.b = frameLayout2;
        this.P = tl0Var;
        this.S = new xl0(tl0Var, this, 0, !g());
        this.T = new xl0(tl0Var, this, 8, false);
        this.R = new xl0(tl0Var, this, 9, false);
        sdbVar.l = true;
        int i8 = aob.d6;
        sdbVar.a = new ib1(vnbVar, i8, 0.0f, (byte) 0);
        sdbVar.a();
        sdbVar.g.setColor(0);
        sdbVar.invalidateSelf();
        sdbVar2.l = true;
        sdbVar2.a = new ib1(vnbVar, i8, 0.0f, (byte) 1);
        sdbVar2.a();
        sdbVar2.g.setColor(0);
        sdbVar2.invalidateSelf();
        paint.setColor(Integer.MIN_VALUE);
        this.M = new rx5(frameLayout, false, new te2(this, (byte) 11));
        kb1 kb1Var = new kb1(this, context, wmaVar, getEditTextStyle(), new x53(), vnbVar, tl0Var);
        this.f = kb1Var;
        kb1Var.T = true;
        kb1Var.getEditText().addTextChangedListener(new gi());
        kb1Var.setFocusable(true);
        kb1Var.setFocusableInTouchMode(true);
        kb1Var.getEditText().r0 = true;
        kb1Var.getEditText().t0 = new c(this, (byte) 22);
        kb1Var.getEditText().setSupportRtlHint(true);
        xt3 editText = kb1Var.getEditText();
        if (g()) {
            i = 1;
        } else {
            i = 2;
        }
        this.Q = new xl0(tl0Var, editText, i, false);
        kb1Var.getEditText().setHintColor(-1);
        kb1Var.getEditText().r(ob6.M0(2131754447, null), false);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        kb1Var.getEditText().setTranslationX(hl.L(-26.0f));
        boolean z = this instanceof qb8;
        if (z) {
            kb1Var.getEditText().setGravity(48);
        }
        kb1Var.getEmojiButton().setAlpha(0.0f);
        View emojiButton = kb1Var.getEmojiButton();
        if (z) {
            f = 1.0f;
        } else {
            f = -1.0f;
        }
        emojiButton.setTranslationY(hl.L(f));
        kb1Var.setTranslationY(hl.L(z ? 1.0f : -1.0f));
        kb1Var.getEditText().addTextChangedListener(new lb1(this));
        kb1Var.getEditText().setLinkTextColor(-1);
        if (z) {
            i2 = 48;
        } else {
            i2 = 80;
        }
        addView(kb1Var, tre.d(-1, -2.0f, i2 | 7, 12.0f, 8.0f, b() + 12, 8.0f));
        nb1 nb1Var = new nb1(context);
        this.r = nb1Var;
        iye.b(nb1Var, 0.05f, 1.25f);
        Drawable mutate = context.getResources().getDrawable(2131231505).mutate();
        this.h = mutate;
        yob.x(this, mutate, aob.U5, null, PorterDuff.Mode.SRC_IN);
        zm2 zm2Var = new zm2(aob.K(hl.L(18.0f), aob.v0(aob.qg, vnbVar)), mutate, 0, hl.L(1.0f));
        this.n = zm2Var;
        int L = hl.L(36.0f);
        int L2 = hl.L(36.0f);
        zm2Var.h = L;
        zm2Var.n = L2;
        nb1Var.setImageDrawable(zm2Var);
        nb1Var.setScaleType(ImageView.ScaleType.CENTER);
        nb1Var.setContentDescription(ob6.M0(2131751319, null));
        nb1Var.setAlpha(0.0f);
        nb1Var.setVisibility(8);
        nb1Var.setOnClickListener(new r81(this, (byte) 3));
        if (z) {
            i3 = 48;
        } else {
            i3 = 80;
        }
        addView(nb1Var, tre.d(44, 44.0f, i3 | 5, 8.0f, 8.0f, 8.0f, 8.0f));
        in inVar = new in(context, false, true, true);
        this.w = inVar;
        inVar.setGravity(17);
        inVar.setTextSize(hl.L(15.0f));
        inVar.setTextColor(-1);
        inVar.b(0.4f, 320L, k43Var);
        inVar.setTypeface(hl.o());
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.s = frameLayout3;
        frameLayout3.setTranslationX(hl.L(2.0f));
        if (z) {
            i4 = 48;
        } else {
            i4 = 80;
        }
        frameLayout3.addView(inVar, tre.e(52, 16, i4 | 5));
        if (z) {
            i5 = 48;
        } else {
            i5 = 80;
        }
        int i9 = i5 | 5;
        if (z) {
            i6 = 50;
        } else {
            i6 = 0;
        }
        float f2 = i6;
        if (z) {
            i7 = 0;
        } else {
            i7 = 50;
        }
        addView(frameLayout3, tre.d(52, 16.0f, i9, 0.0f, f2, 0.0f, i7));
        paint2.setShader(linearGradient);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public int a() {
        return hl.n;
    }

    public int b() {
        return 0;
    }

    public abstract void c(boolean z);

    @Override
    public final void clearFocus() {
        this.f.clearFocus();
    }

    public abstract void d(boolean z);

    @Override
    public void dispatchDraw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb1.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.e0 && (motionEvent.getAction() != 0 || !l(motionEvent.getX(), motionEvent.getY()))) {
            if (this.B0.contains(motionEvent.getX(), motionEvent.getY()) || this.p0) {
                int action = motionEvent.getAction();
                v41 v41Var = this.f0;
                if (action == 0 && !this.p0) {
                    if ((this instanceof zb1) && ((zb1) this).O1) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    int i = 0;
                    while (true) {
                        int childCount = getChildCount();
                        kb1 kb1Var = this.f;
                        if (i < childCount) {
                            View childAt = getChildAt(i);
                            if (childAt != null && childAt.isClickable() && childAt.getVisibility() == 0 && childAt.getAlpha() >= 0.5f && kb1Var != childAt) {
                                float x = childAt.getX();
                                float y = childAt.getY();
                                float x2 = childAt.getX() + childAt.getWidth();
                                float y2 = childAt.getY() + childAt.getHeight();
                                RectF rectF = this.z0;
                                rectF.set(x, y, x2, y2);
                                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                                    return super.dispatchTouchEvent(motionEvent);
                                }
                            }
                            i++;
                        } else {
                            this.M.b(false);
                            kb1Var.getEditText().setForceCursorEnd(true);
                            kb1Var.getEditText().requestFocus();
                            du3 du3Var = kb1Var.a;
                            du3Var.requestFocus();
                            hl.E3(du3Var);
                            kb1Var.getEditText().setScrollY(0);
                            v41Var.c(true);
                            return true;
                        }
                    }
                } else {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        v41Var.c(false);
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        kb1 kb1Var;
        float max;
        RectF rectF = this.A0;
        if (view == this.f) {
            if (this instanceof qb8) {
                max = 0.0f;
            } else {
                max = (1.0f - this.o0) * Math.max(0, (kb1Var.getHeight() - hl.L(82.0f)) - kb1Var.getScrollY());
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(0.0f, max);
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            canvas.save();
            Matrix matrix = this.G;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top - 1.0f);
            LinearGradient linearGradient = this.F;
            linearGradient.setLocalMatrix(matrix);
            float f = rectF.left;
            float f2 = rectF.top;
            Paint paint = this.E;
            canvas.drawRect(f, f2, rectF.right, hl.L(10.0f) + f2, paint);
            matrix.reset();
            matrix.postRotate(180.0f);
            matrix.postTranslate(0.0f, rectF.bottom);
            linearGradient.setLocalMatrix(matrix);
            canvas.drawRect(rectF.left, rectF.bottom - hl.L(10.0f), rectF.right, rectF.bottom, paint);
            canvas.restore();
            canvas.restore();
            return drawChild;
        } else if (f(view)) {
            canvas.save();
            canvas.clipRect(rectF);
            boolean drawChild2 = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild2;
        } else {
            return super.drawChild(canvas, view, j);
        }
    }

    public abstract boolean e();

    public boolean f(View view) {
        return true;
    }

    public boolean g() {
        return true;
    }

    public RectF getBounds() {
        return this.A0;
    }

    public int getCaptionDefaultLimit() {
        return 0;
    }

    public int getCaptionLimit() {
        if (yac.h(this.V).p()) {
            return getCaptionPremiumLimit();
        }
        return getCaptionDefaultLimit();
    }

    public int getCaptionPremiumLimit() {
        return 0;
    }

    public int getCodePointCount() {
        return this.x;
    }

    public int getEditTextHeight() {
        return (int) this.v0.c;
    }

    public int getEditTextHeightClosedKeyboard() {
        return Math.min(hl.L(82.0f), this.f.getHeight());
    }

    public int getEditTextLeft() {
        return 0;
    }

    public int getEditTextStyle() {
        return 2;
    }

    public float getOver2Alpha() {
        return this.M0.c;
    }

    public int getSelectionLength() {
        kb1 kb1Var = this.f;
        if (kb1Var != null && kb1Var.getEditText() != null) {
            try {
                return kb1Var.getEditText().getSelectionEnd() - kb1Var.getEditText().getSelectionStart();
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        return 0;
    }

    public CharSequence getText() {
        return this.f.getText();
    }

    public abstract void h(xl0 xl0Var, Canvas canvas, RectF rectF, float f, boolean z, float f2, float f3, boolean z2);

    public void i(Bitmap bitmap) {
        Utilities.stackBlurBitmap(bitmap, 12);
    }

    public abstract boolean l(float f, float f2);

    public final void m() {
        invalidate();
        kb1 kb1Var = this.f;
        kb1Var.getEditText().invalidate();
        kb1Var.getEmojiButton().invalidate();
        mb1 mb1Var = this.N;
        if (mb1Var != null) {
            mb1Var.invalidate();
        }
        if (kb1Var.getEmojiView() != null && g()) {
            kb1Var.getEmojiView().invalidate();
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
            Bitmap bitmap = this.H;
            if (bitmap != null) {
                bitmap.recycle();
                this.H = null;
            }
            TextPaint textPaint = this.I;
            textPaint.setColor(-16777216);
            textPaint.setTextSize(hl.L(16.0f));
            String M0 = ob6.M0(2131754447, null);
            this.H = Bitmap.createBitmap((int) Math.ceil(textPaint.measureText(M0)), (int) Math.ceil(textPaint.getFontMetrics().descent - textPaint.getFontMetrics().ascent), Bitmap.Config.ARGB_8888);
            new Canvas(this.H).drawText(M0, 0.0f, -((int) textPaint.getFontMetrics().ascent), textPaint);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.r0;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.s0 = null;
        this.u0 = null;
        Bitmap bitmap2 = this.H;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.H = null;
        }
    }

    public final boolean p() {
        kb1 kb1Var = this.f;
        boolean z = kb1Var.y;
        rx5 rx5Var = this.M;
        if (z && kb1Var.getEmojiView() != null) {
            if (rx5Var.c()) {
                kb1Var.getEmojiView().z();
                return true;
            }
            eu3 eu3Var = kb1Var.d;
            if (eu3Var != null) {
                eu3Var.z();
                kb1Var.d.r(false);
            }
            return true;
        } else if (kb1Var.e) {
            kb1Var.k(true);
            return true;
        } else if ((!kb1Var.w && !rx5Var.c()) || rx5Var.d) {
            return false;
        } else {
            kb1Var.d();
            kb1Var.k(true);
            return true;
        }
    }

    public void setAccount(int i) {
        this.V = i;
    }

    public void setBlurredBackgroundDrawableForMentions(ll0 ll0Var) {
        this.h0 = ll0Var;
    }

    public void setDialogId(long j) {
        this.y = j;
        mb1 mb1Var = this.N;
        if (mb1Var != null) {
            mb1Var.setDialogId(j);
        }
    }

    public void setOnHeightUpdate(pcc pccVar) {
        this.j0 = pccVar;
    }

    public void setOnKeyboardOpen(pcc pccVar) {
        this.k0 = pccVar;
    }

    @Override
    public void setPressed(boolean z) {
        boolean z2;
        super.setPressed(z);
        if (z && !this.p0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f0.c(z2);
    }

    public void setText(CharSequence charSequence) {
        this.W = true;
        this.f.setText(charSequence);
    }

    public abstract void u(float f);

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
        this.D0 = new pkb(spannableStringBuilder, 14.0f, hl.o());
        if (charSequence == null) {
            charSequence = "";
        }
        this.E0 = new pkb(charSequence, 14.0f, null);
    }

    public void w() {
        this.N.getAdapter().c = false;
        this.N.getAdapter().d = false;
        this.N.getAdapter().e = false;
        this.N.getAdapter().n0 = this instanceof zb1;
    }

    public void x(int i) {
        int bottomPadding;
        wma wmaVar = this.L;
        if (wmaVar != null) {
            wmaVar.R();
        }
        kb1 kb1Var = this.f;
        boolean z = false;
        if (kb1Var.e) {
            i = Math.max(0, kb1Var.getEmojiPadding() + a());
        } else if (kb1Var.O) {
            i = Math.max(0, kb1Var.getKeyboardHeight() + a());
        }
        if (wmaVar == null) {
            bottomPadding = 0;
        } else {
            bottomPadding = wmaVar.getBottomPadding();
        }
        int max = Math.max(0, i - bottomPadding);
        View view = (View) getParent();
        view.clearAnimation();
        if (!(this instanceof qb8)) {
            ObjectAnimator objectAnimator = this.l0;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.l0.cancel();
                this.l0 = null;
            }
            this.l0 = ObjectAnimator.ofFloat(view, FrameLayout.TRANSLATION_Y, view.getTranslationY(), -max);
            int L = hl.L(20.0f);
            ObjectAnimator objectAnimator2 = this.l0;
            if (max > L) {
                objectAnimator2.setInterpolator(hb.w);
                this.l0.setDuration(250L);
            } else {
                objectAnimator2.setInterpolator(k43.h);
                this.l0.setDuration(640L);
            }
            this.l0.start();
        }
        if (max > hl.L(20.0f)) {
            z = true;
        }
        this.m0 = z;
        hb1 hb1Var = this.n0;
        hl.r(hb1Var);
        hl.c3(hb1Var);
        if (max < hl.L(20.0f)) {
            kb1Var.getEditText().clearFocus();
            kb1Var.k(true);
        }
    }

    public void y() {
        if (this.N != null) {
            float translationY = ((View) getParent()).getTranslationY() - this.v0.c;
            if (this.N.getY() != translationY) {
                this.N.setTranslationY(translationY);
                this.N.invalidate();
            }
        }
    }

    public void n() {
    }

    public void t() {
    }

    public void q(boolean z) {
    }

    public void r(int i) {
    }

    public void setUiBlurBitmap(rcc rccVar) {
    }

    public void j(Canvas canvas, RectF rectF) {
    }

    public void s(int i, int i2) {
    }

    public void k(Canvas canvas, RectF rectF, float f) {
    }
}
