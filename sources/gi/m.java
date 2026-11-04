package gi;

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
import b8.mf;
import b8.pf;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.u10;
import org.telegram.messenger.w10;
import org.telegram.ui.Components.dt;
import org.telegram.ui.Components.et;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.xs;
import org.telegram.ui.ro0;
public abstract class m extends FrameLayout {
    public final RectF A0;
    public final RectF B0;
    public boolean C0;
    public ly0 D0;
    public final Paint E;
    public ly0 E0;
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
    public final qt0 L;
    public int L0;
    public final p3 M;
    public final org.telegram.ui.Components.u5 M0;
    public i N;
    public Paint N0;
    public int O;
    public RadialGradient O0;
    public final org.telegram.ui.Components.x9 P;
    public Paint P0;
    public final org.telegram.ui.Components.ba Q;
    public RadialGradient Q0;
    public final org.telegram.ui.Components.ba R;
    public Matrix R0;
    public final org.telegram.ui.Components.ba S;
    public final org.telegram.ui.Components.ba T;
    public org.telegram.ui.Components.ba U;
    public int V;
    public boolean W;
    public org.telegram.ui.ActionBar.e6 f13135a;
    public boolean f13136a0;
    public final FrameLayout f13137b;
    public int f13138b0;
    public final eh.j f13139c;
    public int f13140c0;
    public final eh.j d;
    public final e f13141d0;
    public final Paint f13142e;
    public boolean f13143e0;
    public final g f13144f;
    public final gc f13145f0;
    public ObjectAnimator f13146g0;
    public final Drawable h;
    public eh.c f13147h0;
    public gh.g f13148i0;
    public u10 f13149j0;
    public u10 f13150k0;
    public ObjectAnimator f13151l0;
    public boolean m0;
    public final xp f13152n;
    public final e f13153n0;
    public float f13154o0;
    public boolean f13155p0;
    public ValueAnimator f13156q0;
    public final j f13157r;
    public Bitmap f13158r0;
    public final FrameLayout f13159s;
    public BitmapShader f13160s0;
    public Matrix f13161t0;
    public Paint f13162u0;
    public final org.telegram.ui.Components.u5 f13163v0;
    public final org.telegram.ui.Components.h6 f13164w;
    public int f13165w0;
    public int f13166x;
    public float f13167x0;
    public long f13168y;
    public boolean f13169y0;
    public final RectF f13170z0;

    public m(Context context, FrameLayout frameLayout, qt0 qt0Var, FrameLayout frameLayout2, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.x9 x9Var) {
        super(context);
        int i3;
        float f10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        eh.j jVar = new eh.j();
        this.f13139c = jVar;
        eh.j jVar2 = new eh.j();
        this.d = jVar2;
        Paint paint = new Paint(1);
        this.f13142e = paint;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(10.0f), new int[]{-65536, 0}, new float[]{0.05f, 1.0f}, Shader.TileMode.CLAMP);
        this.F = linearGradient;
        this.G = new Matrix();
        this.I = new TextPaint(3);
        Paint paint3 = new Paint(3);
        this.J = paint3;
        this.O = -4;
        this.V = h10.f22829t0;
        this.f13141d0 = new e(this, 0);
        this.f13145f0 = new gc(this, 1.0f, 3.0f);
        this.f13153n0 = new e(this, 1);
        xq xqVar = xq.h;
        this.f13163v0 = new org.telegram.ui.Components.u5(this, 0L, 300L, xqVar);
        this.f13169y0 = false;
        this.f13170z0 = new RectF();
        this.A0 = new RectF();
        this.B0 = new RectF();
        this.J0 = new Path();
        this.M0 = new org.telegram.ui.Components.u5(this, 500L, xqVar);
        this.f13135a = e6Var;
        this.K = frameLayout;
        this.L = qt0Var;
        this.f13137b = frameLayout2;
        this.P = x9Var;
        this.S = new org.telegram.ui.Components.ba(x9Var, this, 0, !g());
        this.T = new org.telegram.ui.Components.ba(x9Var, this, 8, false);
        this.R = new org.telegram.ui.Components.ba(x9Var, this, 9, false);
        jVar.f10060l = true;
        int i16 = org.telegram.ui.ActionBar.k6.f27878d6;
        jVar.f10051a = new f(e6Var, i16, 0.0f, 0);
        jVar.a();
        jVar.f10056g.setColor(0);
        jVar.invalidateSelf();
        jVar2.f10060l = true;
        jVar2.f10051a = new f(e6Var, i16, 0.0f, 1);
        jVar2.a();
        jVar2.f10056g.setColor(0);
        jVar2.invalidateSelf();
        paint.setColor(Integer.MIN_VALUE);
        this.M = new p3(frameLayout, false, new ai.v2(this, 19));
        g gVar = new g(this, context, qt0Var, getEditTextStyle(), new ei.b(), e6Var, x9Var);
        this.f13144f = gVar;
        gVar.T = true;
        gVar.getEditText().addTextChangedListener(new org.telegram.ui.Cells.j3());
        gVar.setFocusable(true);
        gVar.setFocusableInTouchMode(true);
        gVar.getEditText().f31431r0 = true;
        gVar.getEditText().f31435t0 = new ai.c(this, 25);
        gVar.getEditText().setSupportRtlHint(true);
        xs editText = gVar.getEditText();
        if (g()) {
            i3 = 1;
        } else {
            i3 = 2;
        }
        this.Q = new org.telegram.ui.Components.ba(x9Var, editText, i3, false);
        gVar.getEditText().setHintColor(-1);
        gVar.getEditText().r(bd.M0(2131754454, null), false);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        gVar.getEditText().setTranslationX(org.telegram.messenger.g0.L(-26.0f));
        boolean z10 = this instanceof ro0;
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
        emojiButton.setTranslationY(org.telegram.messenger.g0.L(f10));
        gVar.setTranslationY(org.telegram.messenger.g0.L(z10 ? 1.0f : -1.0f));
        gVar.getEditText().addTextChangedListener(new h(this));
        gVar.getEditText().setLinkTextColor(-1);
        if (z10) {
            i10 = 48;
        } else {
            i10 = 80;
        }
        addView(gVar, mf.d(-1, -2.0f, i10 | 7, 12.0f, 8.0f, b() + 12, 8.0f));
        j jVar3 = new j(context);
        this.f13157r = jVar3;
        pf.b(jVar3, 0.05f, 1.25f);
        Drawable mutate = context.getResources().getDrawable(2131231501).mutate();
        this.h = mutate;
        org.telegram.ui.ActionBar.r6.y(this, mutate, org.telegram.ui.ActionBar.k6.U5, null, PorterDuff.Mode.SRC_IN);
        xp xpVar = new xp(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28071ng, e6Var)), mutate, 0, org.telegram.messenger.g0.L(1.0f));
        this.f13152n = xpVar;
        int L = org.telegram.messenger.g0.L(36.0f);
        int L2 = org.telegram.messenger.g0.L(36.0f);
        xpVar.h = L;
        xpVar.f40443n = L2;
        jVar3.setImageDrawable(xpVar);
        jVar3.setScaleType(ImageView.ScaleType.CENTER);
        jVar3.setContentDescription(bd.M0(2131751355, null));
        jVar3.setAlpha(0.0f);
        jVar3.setVisibility(8);
        jVar3.setOnClickListener(new ai.b(this, 23));
        if (z10) {
            i11 = 48;
        } else {
            i11 = 80;
        }
        addView(jVar3, mf.d(44, 44.0f, i11 | 5, 8.0f, 8.0f, 8.0f, 8.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, true, true);
        this.f13164w = h6Var;
        h6Var.setGravity(17);
        h6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        h6Var.setTextColor(-1);
        h6Var.b(0.4f, 320L, xqVar);
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f13159s = frameLayout3;
        frameLayout3.setTranslationX(org.telegram.messenger.g0.L(2.0f));
        if (z10) {
            i12 = 48;
        } else {
            i12 = 80;
        }
        frameLayout3.addView(h6Var, mf.e(52, 16, i12 | 5));
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
        addView(frameLayout3, mf.d(52, 16.0f, i17, 0.0f, f11, 0.0f, i15));
        paint2.setShader(linearGradient);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public int a() {
        return org.telegram.messenger.g0.f22603n;
    }

    public int b() {
        return 0;
    }

    public abstract void c(boolean z10);

    @Override
    public final void clearFocus() {
        this.f13144f.clearFocus();
    }

    public abstract void d(boolean z10);

    @Override
    public void dispatchDraw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: gi.m.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f13143e0 && (motionEvent.getAction() != 0 || !l(motionEvent.getX(), motionEvent.getY()))) {
            if (this.B0.contains(motionEvent.getX(), motionEvent.getY()) || this.f13155p0) {
                int action = motionEvent.getAction();
                gc gcVar = this.f13145f0;
                if (action == 0 && !this.f13155p0) {
                    if ((this instanceof r) && ((r) this).O1) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    int i3 = 0;
                    while (true) {
                        int childCount = getChildCount();
                        g gVar = this.f13144f;
                        if (i3 < childCount) {
                            View childAt = getChildAt(i3);
                            if (childAt != null && childAt.isClickable() && childAt.getVisibility() == 0 && childAt.getAlpha() >= 0.5f && gVar != childAt) {
                                float x10 = childAt.getX();
                                float y9 = childAt.getY();
                                float x11 = childAt.getX() + childAt.getWidth();
                                float y10 = childAt.getY() + childAt.getHeight();
                                RectF rectF = this.f13170z0;
                                rectF.set(x10, y9, x11, y10);
                                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                                    return super.dispatchTouchEvent(motionEvent);
                                }
                            }
                            i3++;
                        } else {
                            this.M.b(false);
                            gVar.getEditText().setForceCursorEnd(true);
                            gVar.getEditText().requestFocus();
                            dt dtVar = gVar.f35188a;
                            dtVar.requestFocus();
                            org.telegram.messenger.g0.K3(dtVar);
                            gVar.getEditText().setScrollY(0);
                            gcVar.c(true);
                            return true;
                        }
                    }
                } else {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        gcVar.c(false);
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
        if (view == this.f13144f) {
            if (this instanceof ro0) {
                max = 0.0f;
            } else {
                max = (1.0f - this.f13154o0) * Math.max(0, (gVar.getHeight() - org.telegram.messenger.g0.L(82.0f)) - gVar.getScrollY());
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(0.0f, max);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            canvas.save();
            Matrix matrix = this.G;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top - 1.0f);
            LinearGradient linearGradient = this.F;
            linearGradient.setLocalMatrix(matrix);
            float f10 = rectF.left;
            float f11 = rectF.top;
            Paint paint = this.E;
            canvas.drawRect(f10, f11, rectF.right, org.telegram.messenger.g0.L(10.0f) + f11, paint);
            matrix.reset();
            matrix.postRotate(180.0f);
            matrix.postTranslate(0.0f, rectF.bottom);
            linearGradient.setLocalMatrix(matrix);
            canvas.drawRect(rectF.left, rectF.bottom - org.telegram.messenger.g0.L(10.0f), rectF.right, rectF.bottom, paint);
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
        if (h10.i(this.V).q()) {
            return getCaptionPremiumLimit();
        }
        return getCaptionDefaultLimit();
    }

    public int getCaptionPremiumLimit() {
        return 0;
    }

    public int getCodePointCount() {
        return this.f13166x;
    }

    public int getEditTextHeight() {
        return (int) this.f13163v0.f38645c;
    }

    public int getEditTextHeightClosedKeyboard() {
        return Math.min(org.telegram.messenger.g0.L(82.0f), this.f13144f.getHeight());
    }

    public int getEditTextLeft() {
        return 0;
    }

    public int getEditTextStyle() {
        return 2;
    }

    public float getOver2Alpha() {
        return this.M0.f38645c;
    }

    public int getSelectionLength() {
        g gVar = this.f13144f;
        if (gVar != null && gVar.getEditText() != null) {
            try {
                return gVar.getEditText().getSelectionEnd() - gVar.getEditText().getSelectionStart();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        return 0;
    }

    public CharSequence getText() {
        return this.f13144f.getText();
    }

    public abstract void h(org.telegram.ui.Components.ba baVar, Canvas canvas, RectF rectF, float f10, boolean z10, float f11, float f12, boolean z11);

    public void i(Bitmap bitmap) {
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    public abstract boolean l(float f10, float f11);

    public final void m() {
        invalidate();
        g gVar = this.f13144f;
        gVar.getEditText().invalidate();
        gVar.getEmojiButton().invalidate();
        i iVar = this.N;
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
            Bitmap bitmap = this.H;
            if (bitmap != null) {
                bitmap.recycle();
                this.H = null;
            }
            TextPaint textPaint = this.I;
            textPaint.setColor(-16777216);
            textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
            String M0 = bd.M0(2131754454, null);
            this.H = Bitmap.createBitmap((int) Math.ceil(textPaint.measureText(M0)), (int) Math.ceil(textPaint.getFontMetrics().descent - textPaint.getFontMetrics().ascent), Bitmap.Config.ARGB_8888);
            new Canvas(this.H).drawText(M0, 0.0f, -((int) textPaint.getFontMetrics().ascent), textPaint);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.f13158r0;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f13160s0 = null;
        this.f13162u0 = null;
        Bitmap bitmap2 = this.H;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.H = null;
        }
    }

    public final boolean p() {
        g gVar = this.f13144f;
        boolean z10 = gVar.f35198y;
        p3 p3Var = this.M;
        if (z10 && gVar.getEmojiView() != null) {
            if (p3Var.c()) {
                gVar.getEmojiView().A();
                return true;
            }
            et etVar = gVar.d;
            if (etVar != null) {
                etVar.A();
                gVar.d.t(false);
            }
            return true;
        } else if (gVar.f35191e) {
            gVar.k(true);
            return true;
        } else if ((!gVar.f35196w && !p3Var.c()) || p3Var.d) {
            return false;
        } else {
            gVar.d();
            gVar.k(true);
            return true;
        }
    }

    public void setAccount(int i3) {
        this.V = i3;
    }

    public void setBlurredBackgroundDrawableForMentions(eh.c cVar) {
        this.f13147h0 = cVar;
    }

    public void setDialogId(long j10) {
        this.f13168y = j10;
        i iVar = this.N;
        if (iVar != null) {
            iVar.setDialogId(j10);
        }
    }

    public void setOnHeightUpdate(u10 u10Var) {
        this.f13149j0 = u10Var;
    }

    public void setOnKeyboardOpen(u10 u10Var) {
        this.f13150k0 = u10Var;
    }

    @Override
    public void setPressed(boolean z10) {
        boolean z11;
        super.setPressed(z10);
        if (z10 && !this.f13155p0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f13145f0.c(z11);
    }

    public void setText(CharSequence charSequence) {
        this.W = true;
        this.f13144f.setText(charSequence);
    }

    public abstract void u(float f10);

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
        this.D0 = new ly0(spannableStringBuilder, 14.0f, org.telegram.messenger.g0.o());
        if (charSequence == null) {
            charSequence = "";
        }
        this.E0 = new ly0(charSequence, 14.0f, null);
    }

    public void w() {
        this.N.getAdapter().f16992c = false;
        this.N.getAdapter().d = false;
        this.N.getAdapter().f16995e = false;
        this.N.getAdapter().f17006n0 = this instanceof r;
    }

    public void x(int i3) {
        int bottomPadding;
        qt0 qt0Var = this.L;
        if (qt0Var != null) {
            qt0Var.R();
        }
        g gVar = this.f13144f;
        boolean z10 = false;
        if (gVar.f35191e) {
            i3 = Math.max(0, gVar.getEmojiPadding() + a());
        } else if (gVar.O) {
            i3 = Math.max(0, gVar.getKeyboardHeight() + a());
        }
        if (qt0Var == null) {
            bottomPadding = 0;
        } else {
            bottomPadding = qt0Var.getBottomPadding();
        }
        int max = Math.max(0, i3 - bottomPadding);
        View view = (View) getParent();
        view.clearAnimation();
        if (!(this instanceof ro0)) {
            ObjectAnimator objectAnimator = this.f13151l0;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.f13151l0.cancel();
                this.f13151l0 = null;
            }
            this.f13151l0 = ObjectAnimator.ofFloat(view, FrameLayout.TRANSLATION_Y, view.getTranslationY(), -max);
            if (max > org.telegram.messenger.g0.L(20.0f)) {
                this.f13151l0.setInterpolator(org.telegram.ui.ActionBar.h1.f27551w);
                this.f13151l0.setDuration(250L);
            } else {
                this.f13151l0.setInterpolator(xq.h);
                this.f13151l0.setDuration(640L);
            }
            this.f13151l0.start();
        }
        if (max > org.telegram.messenger.g0.L(20.0f)) {
            z10 = true;
        }
        this.m0 = z10;
        e eVar = this.f13153n0;
        org.telegram.messenger.g0.r(eVar);
        org.telegram.messenger.g0.h3(eVar);
        if (max < org.telegram.messenger.g0.L(20.0f)) {
            gVar.getEditText().clearFocus();
            gVar.k(true);
        }
    }

    public void y() {
        if (this.N != null) {
            float translationY = ((View) getParent()).getTranslationY() - this.f13163v0.f38645c;
            if (this.N.getY() != translationY) {
                this.N.setTranslationY(translationY);
                this.N.invalidate();
            }
        }
    }

    public void q(boolean z10) {
    }

    public void r(int i3) {
    }

    public void setUiBlurBitmap(w10 w10Var) {
    }

    public void n() {
    }

    public void t() {
    }

    public void j(Canvas canvas, RectF rectF) {
    }

    public void s(int i3, int i10) {
    }

    public void k(Canvas canvas, RectF rectF, float f10) {
    }
}
