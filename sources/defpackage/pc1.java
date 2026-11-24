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
public abstract class pc1 extends FrameLayout {
    public final RectF A0;
    public final RectF B0;
    public boolean C0;
    public uib D0;
    public final Paint E;
    public uib E0;
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
    public final ela L;
    public int L0;
    public final mx5 M;
    public final ln M0;
    public lc1 N;
    public Paint N0;
    public int O;
    public RadialGradient O0;
    public final sm0 P;
    public Paint P0;
    public final wm0 Q;
    public RadialGradient Q0;
    public final wm0 R;
    public Matrix R0;
    public final wm0 S;
    public final wm0 T;
    public wm0 U;
    public int V;
    public boolean W;
    public ylb a;
    public boolean a0;
    public final FrameLayout b;
    public int b0;
    public final wbb c;
    public int c0;
    public final wbb d;
    public final hc1 d0;
    public final Paint e;
    public boolean e0;
    public final jc1 f;
    public final u51 f0;
    public ObjectAnimator g0;
    public final Drawable h;
    public km0 h0;
    public im0 i0;
    public qac j0;
    public qac k0;
    public ObjectAnimator l0;
    public boolean m0;
    public final sn2 n;
    public final hc1 n0;
    public float o0;
    public boolean p0;
    public ValueAnimator q0;
    public final mc1 r;
    public Bitmap r0;
    public final FrameLayout s;
    public BitmapShader s0;
    public Matrix t0;
    public Paint u0;
    public final ln v0;
    public final io w;
    public int w0;
    public int x;
    public float x0;
    public long y;
    public boolean y0;
    public final RectF z0;

    public pc1(Context context, FrameLayout frameLayout, ela elaVar, FrameLayout frameLayout2, ylb ylbVar, sm0 sm0Var) {
        super(context);
        int i;
        float f;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        wbb wbbVar = new wbb();
        this.c = wbbVar;
        wbb wbbVar2 = new wbb();
        this.d = wbbVar2;
        Paint paint = new Paint(1);
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, gm.L(10.0f), new int[]{-65536, 0}, new float[]{0.05f, 1.0f}, Shader.TileMode.CLAMP);
        this.F = linearGradient;
        this.G = new Matrix();
        this.I = new TextPaint(3);
        Paint paint3 = new Paint(3);
        this.J = paint3;
        this.O = -4;
        this.V = z8c.t0;
        this.d0 = new hc1(this, (byte) 0);
        this.f0 = new u51(this, 1.0f, 3.0f);
        this.n0 = new hc1(this, (byte) 1);
        d53 d53Var = d53.h;
        this.v0 = new ln(this, 0L, 300L, d53Var);
        this.y0 = false;
        this.z0 = new RectF();
        this.A0 = new RectF();
        this.B0 = new RectF();
        this.J0 = new Path();
        this.M0 = new ln(500L, this, d53Var);
        this.a = ylbVar;
        this.K = frameLayout;
        this.L = elaVar;
        this.b = frameLayout2;
        this.P = sm0Var;
        this.S = new wm0(sm0Var, this, 0, !g());
        this.T = new wm0(sm0Var, this, 8, false);
        this.R = new wm0(sm0Var, this, 9, false);
        wbbVar.l = true;
        int i8 = cmb.c6;
        wbbVar.a = new ic1(ylbVar, i8, 0.0f, (byte) 0);
        wbbVar.a();
        wbbVar.g.setColor(0);
        wbbVar.invalidateSelf();
        wbbVar2.l = true;
        wbbVar2.a = new ic1(ylbVar, i8, 0.0f, (byte) 1);
        wbbVar2.a();
        wbbVar2.g.setColor(0);
        wbbVar2.invalidateSelf();
        paint.setColor(Integer.MIN_VALUE);
        this.M = new mx5(frameLayout, false, new mf2(this, (byte) 11));
        jc1 jc1Var = new jc1(this, context, elaVar, getEditTextStyle(), new r63(), ylbVar, sm0Var);
        this.f = jc1Var;
        jc1Var.T = true;
        jc1Var.getEditText().addTextChangedListener(new fj());
        jc1Var.setFocusable(true);
        jc1Var.setFocusableInTouchMode(true);
        jc1Var.getEditText().r0 = true;
        jc1Var.getEditText().t0 = new f(this, (byte) 22);
        jc1Var.getEditText().setSupportRtlHint(true);
        qu3 editText = jc1Var.getEditText();
        if (g()) {
            i = 1;
        } else {
            i = 2;
        }
        this.Q = new wm0(sm0Var, editText, i, false);
        jc1Var.getEditText().setHintColor(-1);
        jc1Var.getEditText().r(jb6.M0(2131754451, null), false);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        jc1Var.getEditText().setTranslationX(gm.L(-26.0f));
        boolean z = this instanceof ba8;
        if (z) {
            jc1Var.getEditText().setGravity(48);
        }
        jc1Var.getEmojiButton().setAlpha(0.0f);
        View emojiButton = jc1Var.getEmojiButton();
        if (z) {
            f = 1.0f;
        } else {
            f = -1.0f;
        }
        emojiButton.setTranslationY(gm.L(f));
        jc1Var.setTranslationY(gm.L(z ? 1.0f : -1.0f));
        jc1Var.getEditText().addTextChangedListener(new kc1(this));
        jc1Var.getEditText().setLinkTextColor(-1);
        if (z) {
            i2 = 48;
        } else {
            i2 = 80;
        }
        addView(jc1Var, qoe.d(-1, -2.0f, i2 | 7, 12.0f, 8.0f, b() + 12, 8.0f));
        mc1 mc1Var = new mc1(context);
        this.r = mc1Var;
        rve.b(mc1Var, 0.05f, 1.25f);
        Drawable mutate = context.getResources().getDrawable(2131231506).mutate();
        this.h = mutate;
        anb.x(this, mutate, cmb.T5, null, PorterDuff.Mode.SRC_IN);
        sn2 sn2Var = new sn2(cmb.K(gm.L(18.0f), cmb.v0(cmb.pg, ylbVar)), mutate, 0, gm.L(1.0f));
        this.n = sn2Var;
        int L = gm.L(36.0f);
        int L2 = gm.L(36.0f);
        sn2Var.h = L;
        sn2Var.n = L2;
        mc1Var.setImageDrawable(sn2Var);
        mc1Var.setScaleType(ImageView.ScaleType.CENTER);
        mc1Var.setContentDescription(jb6.M0(2131751291, null));
        mc1Var.setAlpha(0.0f);
        mc1Var.setVisibility(8);
        mc1Var.setOnClickListener(new k81(this, (byte) 4));
        if (z) {
            i3 = 48;
        } else {
            i3 = 80;
        }
        addView(mc1Var, qoe.d(44, 44.0f, i3 | 5, 8.0f, 8.0f, 8.0f, 8.0f));
        io ioVar = new io(context, false, true, true);
        this.w = ioVar;
        ioVar.setGravity(17);
        ioVar.setTextSize(gm.L(15.0f));
        ioVar.setTextColor(-1);
        ioVar.b(0.4f, 320L, d53Var);
        ioVar.setTypeface(gm.o());
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.s = frameLayout3;
        frameLayout3.setTranslationX(gm.L(2.0f));
        if (z) {
            i4 = 48;
        } else {
            i4 = 80;
        }
        frameLayout3.addView(ioVar, qoe.e(52, 16, i4 | 5));
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
        addView(frameLayout3, qoe.d(52, 16.0f, i9, 0.0f, f2, 0.0f, i7));
        paint2.setShader(linearGradient);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public int a() {
        return gm.n;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pc1.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.e0 && (motionEvent.getAction() != 0 || !l(motionEvent.getX(), motionEvent.getY()))) {
            if (this.B0.contains(motionEvent.getX(), motionEvent.getY()) || this.p0) {
                int action = motionEvent.getAction();
                u51 u51Var = this.f0;
                if (action == 0 && !this.p0) {
                    if ((this instanceof yc1) && ((yc1) this).O1) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    int i = 0;
                    while (true) {
                        int childCount = getChildCount();
                        jc1 jc1Var = this.f;
                        if (i < childCount) {
                            View childAt = getChildAt(i);
                            if (childAt != null && childAt.isClickable() && childAt.getVisibility() == 0 && childAt.getAlpha() >= 0.5f && jc1Var != childAt) {
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
                            jc1Var.getEditText().setForceCursorEnd(true);
                            jc1Var.getEditText().requestFocus();
                            wu3 wu3Var = jc1Var.a;
                            wu3Var.requestFocus();
                            gm.E3(wu3Var);
                            jc1Var.getEditText().setScrollY(0);
                            u51Var.c(true);
                            return true;
                        }
                    }
                } else {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        u51Var.c(false);
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        jc1 jc1Var;
        float max;
        RectF rectF = this.A0;
        if (view == this.f) {
            if (this instanceof ba8) {
                max = 0.0f;
            } else {
                max = (1.0f - this.o0) * Math.max(0, (jc1Var.getHeight() - gm.L(82.0f)) - jc1Var.getScrollY());
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
            canvas.drawRect(f, f2, rectF.right, gm.L(10.0f) + f2, paint);
            matrix.reset();
            matrix.postRotate(180.0f);
            matrix.postTranslate(0.0f, rectF.bottom);
            linearGradient.setLocalMatrix(matrix);
            canvas.drawRect(rectF.left, rectF.bottom - gm.L(10.0f), rectF.right, rectF.bottom, paint);
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
        if (z8c.h(this.V).p()) {
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
        return Math.min(gm.L(82.0f), this.f.getHeight());
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
        jc1 jc1Var = this.f;
        if (jc1Var != null && jc1Var.getEditText() != null) {
            try {
                return jc1Var.getEditText().getSelectionEnd() - jc1Var.getEditText().getSelectionStart();
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        return 0;
    }

    public CharSequence getText() {
        return this.f.getText();
    }

    public abstract void h(wm0 wm0Var, Canvas canvas, RectF rectF, float f, boolean z, float f2, float f3, boolean z2);

    public void i(Bitmap bitmap) {
        Utilities.stackBlurBitmap(bitmap, 12);
    }

    public abstract boolean l(float f, float f2);

    public final void m() {
        invalidate();
        jc1 jc1Var = this.f;
        jc1Var.getEditText().invalidate();
        jc1Var.getEmojiButton().invalidate();
        lc1 lc1Var = this.N;
        if (lc1Var != null) {
            lc1Var.invalidate();
        }
        if (jc1Var.getEmojiView() != null && g()) {
            jc1Var.getEmojiView().invalidate();
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
            textPaint.setTextSize(gm.L(16.0f));
            String M0 = jb6.M0(2131754451, null);
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
        jc1 jc1Var = this.f;
        boolean z = jc1Var.y;
        mx5 mx5Var = this.M;
        if (z && jc1Var.getEmojiView() != null) {
            if (mx5Var.c()) {
                jc1Var.getEmojiView().y();
                return true;
            }
            xu3 xu3Var = jc1Var.d;
            if (xu3Var != null) {
                xu3Var.y();
                jc1Var.d.r(false);
            }
            return true;
        } else if (jc1Var.e) {
            jc1Var.k(true);
            return true;
        } else if ((!jc1Var.w && !mx5Var.c()) || mx5Var.d) {
            return false;
        } else {
            jc1Var.d();
            jc1Var.k(true);
            return true;
        }
    }

    public void setAccount(int i) {
        this.V = i;
    }

    public void setBlurredBackgroundDrawableForMentions(km0 km0Var) {
        this.h0 = km0Var;
    }

    public void setDialogId(long j) {
        this.y = j;
        lc1 lc1Var = this.N;
        if (lc1Var != null) {
            lc1Var.setDialogId(j);
        }
    }

    public void setOnHeightUpdate(qac qacVar) {
        this.j0 = qacVar;
    }

    public void setOnKeyboardOpen(qac qacVar) {
        this.k0 = qacVar;
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
        this.D0 = new uib(spannableStringBuilder, 14.0f, gm.o());
        if (charSequence == null) {
            charSequence = "";
        }
        this.E0 = new uib(charSequence, 14.0f, null);
    }

    public void w() {
        this.N.getAdapter().c = false;
        this.N.getAdapter().d = false;
        this.N.getAdapter().e = false;
        this.N.getAdapter().n0 = this instanceof yc1;
    }

    public void x(int i) {
        int bottomPadding;
        ela elaVar = this.L;
        if (elaVar != null) {
            elaVar.R();
        }
        jc1 jc1Var = this.f;
        boolean z = false;
        if (jc1Var.e) {
            i = Math.max(0, jc1Var.getEmojiPadding() + a());
        } else if (jc1Var.O) {
            i = Math.max(0, jc1Var.getKeyboardHeight() + a());
        }
        if (elaVar == null) {
            bottomPadding = 0;
        } else {
            bottomPadding = elaVar.getBottomPadding();
        }
        int max = Math.max(0, i - bottomPadding);
        View view = (View) getParent();
        view.clearAnimation();
        if (!(this instanceof ba8)) {
            ObjectAnimator objectAnimator = this.l0;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.l0.cancel();
                this.l0 = null;
            }
            this.l0 = ObjectAnimator.ofFloat(view, FrameLayout.TRANSLATION_Y, view.getTranslationY(), -max);
            int L = gm.L(20.0f);
            ObjectAnimator objectAnimator2 = this.l0;
            if (max > L) {
                objectAnimator2.setInterpolator(gb.w);
                this.l0.setDuration(250L);
            } else {
                objectAnimator2.setInterpolator(d53.h);
                this.l0.setDuration(640L);
            }
            this.l0.start();
        }
        if (max > gm.L(20.0f)) {
            z = true;
        }
        this.m0 = z;
        hc1 hc1Var = this.n0;
        gm.r(hc1Var);
        gm.c3(hc1Var);
        if (max < gm.L(20.0f)) {
            jc1Var.getEditText().clearFocus();
            jc1Var.k(true);
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

    public void q(boolean z) {
    }

    public void r(int i) {
    }

    public void setUiBlurBitmap(sac sacVar) {
    }

    public void t() {
    }

    public void j(Canvas canvas, RectF rectF) {
    }

    public void s(int i, int i2) {
    }

    public void k(Canvas canvas, RectF rectF, float f) {
    }
}
