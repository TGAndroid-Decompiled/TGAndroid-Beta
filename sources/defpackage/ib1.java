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
public abstract class ib1 extends FrameLayout {
    public final RectF A0;
    public final RectF B0;
    public boolean C0;
    public tgb D0;
    public final Paint E;
    public tgb E0;
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
    public final cja L;
    public int L0;
    public final mv5 M;
    public final lm M0;
    public eb1 N;
    public Paint N0;
    public int O;
    public RadialGradient O0;
    public final sl0 P;
    public Paint P0;
    public final wl0 Q;
    public RadialGradient Q0;
    public final wl0 R;
    public Matrix R0;
    public final wl0 S;
    public final wl0 T;
    public wl0 U;
    public int V;
    public boolean W;
    public wjb a;
    public boolean a0;
    public final FrameLayout b;
    public int b0;
    public final u9b c;
    public int c0;
    public final u9b d;
    public final za1 d0;
    public final Paint e;
    public boolean e0;
    public final cb1 f;
    public final n41 f0;
    public ObjectAnimator g0;
    public final Drawable h;
    public kl0 h0;
    public il0 i0;
    public p8c j0;
    public p8c k0;
    public ObjectAnimator l0;
    public boolean m0;
    public final fm2 n;
    public final za1 n0;
    public float o0;
    public boolean p0;
    public ValueAnimator q0;
    public final fb1 r;
    public Bitmap r0;
    public final FrameLayout s;
    public BitmapShader s0;
    public Matrix t0;
    public Paint u0;
    public final lm v0;
    public final hn w;
    public int w0;
    public int x;
    public float x0;
    public long y;
    public boolean y0;
    public final RectF z0;

    public ib1(Context context, FrameLayout frameLayout, cja cjaVar, FrameLayout frameLayout2, wjb wjbVar, sl0 sl0Var) {
        super(context);
        int i;
        float f;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        u9b u9bVar = new u9b();
        this.c = u9bVar;
        u9b u9bVar2 = new u9b();
        this.d = u9bVar2;
        Paint paint = new Paint(1);
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, gl.L(10.0f), new int[]{-65536, 0}, new float[]{0.05f, 1.0f}, Shader.TileMode.CLAMP);
        this.F = linearGradient;
        this.G = new Matrix();
        this.I = new TextPaint(3);
        Paint paint3 = new Paint(3);
        this.J = paint3;
        this.O = -4;
        this.V = y6c.t0;
        this.d0 = new za1(this, (byte) 0);
        this.f0 = new n41(this, 1.0f, 3.0f);
        this.n0 = new za1(this, (byte) 1);
        s33 s33Var = s33.h;
        this.v0 = new lm(this, 0L, 300L, s33Var);
        this.y0 = false;
        this.z0 = new RectF();
        this.A0 = new RectF();
        this.B0 = new RectF();
        this.J0 = new Path();
        this.M0 = new lm(500L, this, s33Var);
        this.a = wjbVar;
        this.K = frameLayout;
        this.L = cjaVar;
        this.b = frameLayout2;
        this.P = sl0Var;
        this.S = new wl0(sl0Var, this, 0, !g());
        this.T = new wl0(sl0Var, this, 8, false);
        this.R = new wl0(sl0Var, this, 9, false);
        u9bVar.l = true;
        int i8 = bkb.c6;
        u9bVar.a = new ab1(wjbVar, i8, 0.0f, (byte) 0);
        u9bVar.a();
        u9bVar.g.setColor(0);
        u9bVar.invalidateSelf();
        u9bVar2.l = true;
        u9bVar2.a = new ab1(wjbVar, i8, 0.0f, (byte) 1);
        u9bVar2.a();
        u9bVar2.g.setColor(0);
        u9bVar2.invalidateSelf();
        paint.setColor(Integer.MIN_VALUE);
        this.M = new mv5(frameLayout, false, new be2(this, (byte) 11));
        cb1 cb1Var = new cb1(this, context, cjaVar, getEditTextStyle(), new f53(), wjbVar, sl0Var);
        this.f = cb1Var;
        cb1Var.T = true;
        cb1Var.getEditText().addTextChangedListener(new fi());
        cb1Var.setFocusable(true);
        cb1Var.setFocusableInTouchMode(true);
        cb1Var.getEditText().r0 = true;
        cb1Var.getEditText().t0 = new f(this, (byte) 22);
        cb1Var.getEditText().setSupportRtlHint(true);
        gt3 editText = cb1Var.getEditText();
        if (g()) {
            i = 1;
        } else {
            i = 2;
        }
        this.Q = new wl0(sl0Var, editText, i, false);
        cb1Var.getEditText().setHintColor(-1);
        cb1Var.getEditText().r(k96.M0(2131754451, null), false);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        cb1Var.getEditText().setTranslationX(gl.L(-26.0f));
        boolean z = this instanceof y78;
        if (z) {
            cb1Var.getEditText().setGravity(48);
        }
        cb1Var.getEmojiButton().setAlpha(0.0f);
        View emojiButton = cb1Var.getEmojiButton();
        if (z) {
            f = 1.0f;
        } else {
            f = -1.0f;
        }
        emojiButton.setTranslationY(gl.L(f));
        cb1Var.setTranslationY(gl.L(z ? 1.0f : -1.0f));
        cb1Var.getEditText().addTextChangedListener(new db1(this));
        cb1Var.getEditText().setLinkTextColor(-1);
        if (z) {
            i2 = 48;
        } else {
            i2 = 80;
        }
        addView(cb1Var, nme.d(-1, -2.0f, i2 | 7, 12.0f, 8.0f, b() + 12, 8.0f));
        fb1 fb1Var = new fb1(context);
        this.r = fb1Var;
        ote.b(fb1Var, 0.05f, 1.25f);
        Drawable mutate = context.getResources().getDrawable(2131231505).mutate();
        this.h = mutate;
        zkb.x(this, mutate, bkb.T5, null, PorterDuff.Mode.SRC_IN);
        fm2 fm2Var = new fm2(bkb.K(gl.L(18.0f), bkb.v0(bkb.pg, wjbVar)), mutate, 0, gl.L(1.0f));
        this.n = fm2Var;
        int L = gl.L(36.0f);
        int L2 = gl.L(36.0f);
        fm2Var.h = L;
        fm2Var.n = L2;
        fb1Var.setImageDrawable(fm2Var);
        fb1Var.setScaleType(ImageView.ScaleType.CENTER);
        fb1Var.setContentDescription(k96.M0(2131751342, null));
        fb1Var.setAlpha(0.0f);
        fb1Var.setVisibility(8);
        fb1Var.setOnClickListener(new x91(this, (byte) 1));
        if (z) {
            i3 = 48;
        } else {
            i3 = 80;
        }
        addView(fb1Var, nme.d(44, 44.0f, i3 | 5, 8.0f, 8.0f, 8.0f, 8.0f));
        hn hnVar = new hn(context, false, true, true);
        this.w = hnVar;
        hnVar.setGravity(17);
        hnVar.setTextSize(gl.L(15.0f));
        hnVar.setTextColor(-1);
        hnVar.b(0.4f, 320L, s33Var);
        hnVar.setTypeface(gl.o());
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.s = frameLayout3;
        frameLayout3.setTranslationX(gl.L(2.0f));
        if (z) {
            i4 = 48;
        } else {
            i4 = 80;
        }
        frameLayout3.addView(hnVar, nme.e(52, 16, i4 | 5));
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
        addView(frameLayout3, nme.d(52, 16.0f, i9, 0.0f, f2, 0.0f, i7));
        paint2.setShader(linearGradient);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public int a() {
        return gl.n;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ib1.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.e0 && (motionEvent.getAction() != 0 || !l(motionEvent.getX(), motionEvent.getY()))) {
            if (this.B0.contains(motionEvent.getX(), motionEvent.getY()) || this.p0) {
                int action = motionEvent.getAction();
                n41 n41Var = this.f0;
                if (action == 0 && !this.p0) {
                    if ((this instanceof rb1) && ((rb1) this).O1) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    int i = 0;
                    while (true) {
                        int childCount = getChildCount();
                        cb1 cb1Var = this.f;
                        if (i < childCount) {
                            View childAt = getChildAt(i);
                            if (childAt != null && childAt.isClickable() && childAt.getVisibility() == 0 && childAt.getAlpha() >= 0.5f && cb1Var != childAt) {
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
                            cb1Var.getEditText().setForceCursorEnd(true);
                            cb1Var.getEditText().requestFocus();
                            mt3 mt3Var = cb1Var.a;
                            mt3Var.requestFocus();
                            gl.E3(mt3Var);
                            cb1Var.getEditText().setScrollY(0);
                            n41Var.c(true);
                            return true;
                        }
                    }
                } else {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        n41Var.c(false);
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        cb1 cb1Var;
        float max;
        RectF rectF = this.A0;
        if (view == this.f) {
            if (this instanceof y78) {
                max = 0.0f;
            } else {
                max = (1.0f - this.o0) * Math.max(0, (cb1Var.getHeight() - gl.L(82.0f)) - cb1Var.getScrollY());
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
            canvas.drawRect(f, f2, rectF.right, gl.L(10.0f) + f2, paint);
            matrix.reset();
            matrix.postRotate(180.0f);
            matrix.postTranslate(0.0f, rectF.bottom);
            linearGradient.setLocalMatrix(matrix);
            canvas.drawRect(rectF.left, rectF.bottom - gl.L(10.0f), rectF.right, rectF.bottom, paint);
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
        if (y6c.h(this.V).p()) {
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
        return Math.min(gl.L(82.0f), this.f.getHeight());
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
        cb1 cb1Var = this.f;
        if (cb1Var != null && cb1Var.getEditText() != null) {
            try {
                return cb1Var.getEditText().getSelectionEnd() - cb1Var.getEditText().getSelectionStart();
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        return 0;
    }

    public CharSequence getText() {
        return this.f.getText();
    }

    public abstract void h(wl0 wl0Var, Canvas canvas, RectF rectF, float f, boolean z, float f2, float f3, boolean z2);

    public void i(Bitmap bitmap) {
        Utilities.stackBlurBitmap(bitmap, 12);
    }

    public abstract boolean l(float f, float f2);

    public final void m() {
        invalidate();
        cb1 cb1Var = this.f;
        cb1Var.getEditText().invalidate();
        cb1Var.getEmojiButton().invalidate();
        eb1 eb1Var = this.N;
        if (eb1Var != null) {
            eb1Var.invalidate();
        }
        if (cb1Var.getEmojiView() != null && g()) {
            cb1Var.getEmojiView().invalidate();
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
            textPaint.setTextSize(gl.L(16.0f));
            String M0 = k96.M0(2131754451, null);
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
        cb1 cb1Var = this.f;
        boolean z = cb1Var.y;
        mv5 mv5Var = this.M;
        if (z && cb1Var.getEmojiView() != null) {
            if (mv5Var.c()) {
                cb1Var.getEmojiView().z();
                return true;
            }
            nt3 nt3Var = cb1Var.d;
            if (nt3Var != null) {
                nt3Var.z();
                cb1Var.d.s(false);
            }
            return true;
        } else if (cb1Var.e) {
            cb1Var.k(true);
            return true;
        } else if ((!cb1Var.w && !mv5Var.c()) || mv5Var.d) {
            return false;
        } else {
            cb1Var.d();
            cb1Var.k(true);
            return true;
        }
    }

    public void setAccount(int i) {
        this.V = i;
    }

    public void setBlurredBackgroundDrawableForMentions(kl0 kl0Var) {
        this.h0 = kl0Var;
    }

    public void setDialogId(long j) {
        this.y = j;
        eb1 eb1Var = this.N;
        if (eb1Var != null) {
            eb1Var.setDialogId(j);
        }
    }

    public void setOnHeightUpdate(p8c p8cVar) {
        this.j0 = p8cVar;
    }

    public void setOnKeyboardOpen(p8c p8cVar) {
        this.k0 = p8cVar;
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
        this.D0 = new tgb(spannableStringBuilder, 14.0f, gl.o());
        if (charSequence == null) {
            charSequence = "";
        }
        this.E0 = new tgb(charSequence, 14.0f, null);
    }

    public void w() {
        this.N.getAdapter().c = false;
        this.N.getAdapter().d = false;
        this.N.getAdapter().e = false;
        this.N.getAdapter().n0 = this instanceof rb1;
    }

    public void x(int i) {
        int bottomPadding;
        cja cjaVar = this.L;
        if (cjaVar != null) {
            cjaVar.R();
        }
        cb1 cb1Var = this.f;
        boolean z = false;
        if (cb1Var.e) {
            i = Math.max(0, cb1Var.getEmojiPadding() + a());
        } else if (cb1Var.O) {
            i = Math.max(0, cb1Var.getKeyboardHeight() + a());
        }
        if (cjaVar == null) {
            bottomPadding = 0;
        } else {
            bottomPadding = cjaVar.getBottomPadding();
        }
        int max = Math.max(0, i - bottomPadding);
        View view = (View) getParent();
        view.clearAnimation();
        if (!(this instanceof y78)) {
            ObjectAnimator objectAnimator = this.l0;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.l0.cancel();
                this.l0 = null;
            }
            this.l0 = ObjectAnimator.ofFloat(view, FrameLayout.TRANSLATION_Y, view.getTranslationY(), -max);
            int L = gl.L(20.0f);
            ObjectAnimator objectAnimator2 = this.l0;
            if (max > L) {
                objectAnimator2.setInterpolator(gb.w);
                this.l0.setDuration(250L);
            } else {
                objectAnimator2.setInterpolator(s33.h);
                this.l0.setDuration(640L);
            }
            this.l0.start();
        }
        if (max > gl.L(20.0f)) {
            z = true;
        }
        this.m0 = z;
        za1 za1Var = this.n0;
        gl.r(za1Var);
        gl.c3(za1Var);
        if (max < gl.L(20.0f)) {
            cb1Var.getEditText().clearFocus();
            cb1Var.k(true);
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

    public void setUiBlurBitmap(r8c r8cVar) {
    }

    public void j(Canvas canvas, RectF rectF) {
    }

    public void s(int i, int i2) {
    }

    public void k(Canvas canvas, RectF rectF, float f) {
    }
}
