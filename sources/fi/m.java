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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.e20;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Components.gt;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zs;
import org.telegram.ui.ap0;
public abstract class m extends FrameLayout {
    public final RectF A0;
    public boolean B0;
    public my0 C0;
    public final Paint D;
    public my0 D0;
    public final LinearGradient E;
    public Path E0;
    public final Matrix F;
    public Paint F0;
    public Bitmap G;
    public Path G0;
    public final TextPaint H;
    public float[] H0;
    public final Paint I;
    public final Path I0;
    public final FrameLayout J;
    public boolean J0;
    public final rt0 K;
    public int K0;
    public final q3 L;
    public final org.telegram.ui.Components.w5 L0;
    public i M;
    public Paint M0;
    public int N;
    public RadialGradient N0;
    public final org.telegram.ui.Components.y9 O;
    public Paint O0;
    public final org.telegram.ui.Components.ca P;
    public RadialGradient P0;
    public final org.telegram.ui.Components.ca Q;
    public Matrix Q0;
    public final org.telegram.ui.Components.ca R;
    public final org.telegram.ui.Components.ca S;
    public org.telegram.ui.Components.ca T;
    public int U;
    public boolean V;
    public boolean W;
    public org.telegram.ui.ActionBar.f6 f12356a;
    public int f12357a0;
    public final FrameLayout f12358b;
    public int f12359b0;
    public final dh.j f12360c;
    public final e f12361c0;
    public final dh.j d;
    public boolean f12362d0;
    public final Paint f12363e;
    public final ic f12364e0;
    public final g f12365f;
    public ObjectAnimator f12366f0;
    public dh.c f12367g0;
    public final Drawable h;
    public fh.g f12368h0;
    public c20 f12369i0;
    public c20 f12370j0;
    public ObjectAnimator f12371k0;
    public boolean f12372l0;
    public final e m0;
    public final xp f12373n;
    public float f12374n0;
    public boolean f12375o0;
    public ValueAnimator f12376p0;
    public Bitmap f12377q0;
    public final j f12378r;
    public BitmapShader f12379r0;
    public final FrameLayout f12380s;
    public Matrix f12381s0;
    public Paint f12382t0;
    public final org.telegram.ui.Components.w5 f12383u0;
    public int f12384v0;
    public final org.telegram.ui.Components.j6 f12385w;
    public float f12386w0;
    public int f12387x;
    public boolean f12388x0;
    public long f12389y;
    public final RectF f12390y0;
    public final RectF f12391z0;

    public m(Context context, FrameLayout frameLayout, rt0 rt0Var, FrameLayout frameLayout2, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.y9 y9Var) {
        super(context);
        int i7;
        float f10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        dh.j jVar = new dh.j();
        this.f12360c = jVar;
        dh.j jVar2 = new dh.j();
        this.d = jVar2;
        Paint paint = new Paint(1);
        this.f12363e = paint;
        Paint paint2 = new Paint(1);
        this.D = paint2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(10.0f), new int[]{-65536, 0}, new float[]{0.05f, 1.0f}, Shader.TileMode.CLAMP);
        this.E = linearGradient;
        this.F = new Matrix();
        this.H = new TextPaint(3);
        Paint paint3 = new Paint(3);
        this.I = paint3;
        this.N = -4;
        this.U = p10.f24470s0;
        this.f12361c0 = new e(this, 0);
        this.f12364e0 = new ic(this, 1.0f, 3.0f);
        this.m0 = new e(this, 1);
        xq xqVar = xq.h;
        this.f12383u0 = new org.telegram.ui.Components.w5(this, 0L, 300L, xqVar);
        this.f12388x0 = false;
        this.f12390y0 = new RectF();
        this.f12391z0 = new RectF();
        this.A0 = new RectF();
        this.I0 = new Path();
        this.L0 = new org.telegram.ui.Components.w5(this, 500L, xqVar);
        this.f12356a = f6Var;
        this.J = frameLayout;
        this.K = rt0Var;
        this.f12358b = frameLayout2;
        this.O = y9Var;
        this.R = new org.telegram.ui.Components.ca(y9Var, this, 0, !g());
        this.S = new org.telegram.ui.Components.ca(y9Var, this, 8, false);
        this.Q = new org.telegram.ui.Components.ca(y9Var, this, 9, false);
        jVar.f8782l = true;
        int i16 = org.telegram.ui.ActionBar.k6.f27852d6;
        jVar.f8773a = new f(f6Var, i16, 0.0f, 0);
        jVar.a();
        jVar.f8778g.setColor(0);
        jVar.invalidateSelf();
        jVar2.f8782l = true;
        jVar2.f8773a = new f(f6Var, i16, 0.0f, 1);
        jVar2.a();
        jVar2.f8778g.setColor(0);
        jVar2.invalidateSelf();
        paint.setColor(Integer.MIN_VALUE);
        this.L = new q3(frameLayout, false, new ai.i(this, 16));
        g gVar = new g(this, context, rt0Var, getEditTextStyle(), new di.b(), f6Var, y9Var);
        this.f12365f = gVar;
        gVar.S = true;
        gVar.getEditText().addTextChangedListener(new org.telegram.ui.Cells.j3());
        gVar.setFocusable(true);
        gVar.setFocusableInTouchMode(true);
        gVar.getEditText().f31359q0 = true;
        gVar.getEditText().f31363s0 = new ai.e(this, 15);
        gVar.getEditText().setSupportRtlHint(true);
        zs editText = gVar.getEditText();
        if (g()) {
            i7 = 1;
        } else {
            i7 = 2;
        }
        this.P = new org.telegram.ui.Components.ca(y9Var, editText, i7, false);
        gVar.getEditText().setHintColor(-1);
        gVar.getEditText().r(id.M0(2131754454, null), false);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        gVar.getEditText().setTranslationX(org.telegram.messenger.g0.L(-26.0f));
        boolean z9 = this instanceof ap0;
        if (z9) {
            gVar.getEditText().setGravity(48);
        }
        gVar.getEmojiButton().setAlpha(0.0f);
        View emojiButton = gVar.getEmojiButton();
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = -1.0f;
        }
        emojiButton.setTranslationY(org.telegram.messenger.g0.L(f10));
        gVar.setTranslationY(org.telegram.messenger.g0.L(z9 ? 1.0f : -1.0f));
        gVar.getEditText().addTextChangedListener(new h(this));
        gVar.getEditText().setLinkTextColor(-1);
        if (z9) {
            i10 = 48;
        } else {
            i10 = 80;
        }
        addView(gVar, c8.ha.d(-1, -2.0f, i10 | 7, 12.0f, 8.0f, b() + 12, 8.0f));
        j jVar3 = new j(context);
        this.f12378r = jVar3;
        c8.ka.b(jVar3, 0.05f, 1.25f);
        Drawable mutate = context.getResources().getDrawable(2131231501).mutate();
        this.h = mutate;
        org.telegram.ui.ActionBar.r6.y(this, mutate, org.telegram.ui.ActionBar.k6.U5, null, PorterDuff.Mode.SRC_IN);
        xp xpVar = new xp(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28043ng, f6Var)), mutate, 0, org.telegram.messenger.g0.L(1.0f));
        this.f12373n = xpVar;
        int L = org.telegram.messenger.g0.L(36.0f);
        int L2 = org.telegram.messenger.g0.L(36.0f);
        xpVar.h = L;
        xpVar.f40357n = L2;
        jVar3.setImageDrawable(xpVar);
        jVar3.setScaleType(ImageView.ScaleType.CENTER);
        jVar3.setContentDescription(id.M0(2131751355, null));
        jVar3.setAlpha(0.0f);
        jVar3.setVisibility(8);
        jVar3.setOnClickListener(new ah.d(this, 20));
        if (z9) {
            i11 = 48;
        } else {
            i11 = 80;
        }
        addView(jVar3, c8.ha.d(44, 44.0f, i11 | 5, 8.0f, 8.0f, 8.0f, 8.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, true, true);
        this.f12385w = j6Var;
        j6Var.setGravity(17);
        j6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        j6Var.setTextColor(-1);
        j6Var.b(0.4f, 320L, xqVar);
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f12380s = frameLayout3;
        frameLayout3.setTranslationX(org.telegram.messenger.g0.L(2.0f));
        if (z9) {
            i12 = 48;
        } else {
            i12 = 80;
        }
        frameLayout3.addView(j6Var, c8.ha.e(52, 16, i12 | 5));
        if (z9) {
            i13 = 48;
        } else {
            i13 = 80;
        }
        int i17 = i13 | 5;
        if (z9) {
            i14 = 50;
        } else {
            i14 = 0;
        }
        float f11 = i14;
        if (z9) {
            i15 = 0;
        } else {
            i15 = 50;
        }
        addView(frameLayout3, c8.ha.d(52, 16.0f, i17, 0.0f, f11, 0.0f, i15));
        paint2.setShader(linearGradient);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public int a() {
        return org.telegram.messenger.g0.f22558n;
    }

    public int b() {
        return 0;
    }

    public abstract void c(boolean z9);

    @Override
    public final void clearFocus() {
        this.f12365f.clearFocus();
    }

    public abstract void d(boolean z9);

    @Override
    public void dispatchDraw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: fi.m.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f12362d0 && (motionEvent.getAction() != 0 || !l(motionEvent.getX(), motionEvent.getY()))) {
            if (this.A0.contains(motionEvent.getX(), motionEvent.getY()) || this.f12375o0) {
                int action = motionEvent.getAction();
                ic icVar = this.f12364e0;
                if (action == 0 && !this.f12375o0) {
                    if ((this instanceof r) && ((r) this).N1) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    int i7 = 0;
                    while (true) {
                        int childCount = getChildCount();
                        g gVar = this.f12365f;
                        if (i7 < childCount) {
                            View childAt = getChildAt(i7);
                            if (childAt != null && childAt.isClickable() && childAt.getVisibility() == 0 && childAt.getAlpha() >= 0.5f && gVar != childAt) {
                                float x10 = childAt.getX();
                                float y10 = childAt.getY();
                                float x11 = childAt.getX() + childAt.getWidth();
                                float y11 = childAt.getY() + childAt.getHeight();
                                RectF rectF = this.f12390y0;
                                rectF.set(x10, y10, x11, y11);
                                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                                    return super.dispatchTouchEvent(motionEvent);
                                }
                            }
                            i7++;
                        } else {
                            this.L.b(false);
                            gVar.getEditText().setForceCursorEnd(true);
                            gVar.getEditText().requestFocus();
                            ft ftVar = gVar.f35777a;
                            ftVar.requestFocus();
                            org.telegram.messenger.g0.K3(ftVar);
                            gVar.getEditText().setScrollY(0);
                            icVar.c(true);
                            return true;
                        }
                    }
                } else {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        icVar.c(false);
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
        RectF rectF = this.f12391z0;
        if (view == this.f12365f) {
            if (this instanceof ap0) {
                max = 0.0f;
            } else {
                max = (1.0f - this.f12374n0) * Math.max(0, (gVar.getHeight() - org.telegram.messenger.g0.L(82.0f)) - gVar.getScrollY());
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
            float f10 = rectF.left;
            float f11 = rectF.top;
            Paint paint = this.D;
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
        return this.f12391z0;
    }

    public int getCaptionDefaultLimit() {
        return 0;
    }

    public int getCaptionLimit() {
        if (p10.i(this.U).q()) {
            return getCaptionPremiumLimit();
        }
        return getCaptionDefaultLimit();
    }

    public int getCaptionPremiumLimit() {
        return 0;
    }

    public int getCodePointCount() {
        return this.f12387x;
    }

    public int getEditTextHeight() {
        return (int) this.f12383u0.f39805c;
    }

    public int getEditTextHeightClosedKeyboard() {
        return Math.min(org.telegram.messenger.g0.L(82.0f), this.f12365f.getHeight());
    }

    public int getEditTextLeft() {
        return 0;
    }

    public int getEditTextStyle() {
        return 2;
    }

    public float getOver2Alpha() {
        return this.L0.f39805c;
    }

    public int getSelectionLength() {
        g gVar = this.f12365f;
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
        return this.f12365f.getText();
    }

    public abstract void h(org.telegram.ui.Components.ca caVar, Canvas canvas, RectF rectF, float f10, boolean z9, float f11, float f12, boolean z10);

    public void i(Bitmap bitmap) {
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    public abstract boolean l(float f10, float f11);

    public final void m() {
        invalidate();
        g gVar = this.f12365f;
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
            textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
            String M0 = id.M0(2131754454, null);
            this.G = Bitmap.createBitmap((int) Math.ceil(textPaint.measureText(M0)), (int) Math.ceil(textPaint.getFontMetrics().descent - textPaint.getFontMetrics().ascent), Bitmap.Config.ARGB_8888);
            new Canvas(this.G).drawText(M0, 0.0f, -((int) textPaint.getFontMetrics().ascent), textPaint);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.f12377q0;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f12379r0 = null;
        this.f12382t0 = null;
        Bitmap bitmap2 = this.G;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.G = null;
        }
    }

    public final boolean p() {
        g gVar = this.f12365f;
        boolean z9 = gVar.f35787y;
        q3 q3Var = this.L;
        if (z9 && gVar.getEmojiView() != null) {
            if (q3Var.c()) {
                gVar.getEmojiView().A();
                return true;
            }
            gt gtVar = gVar.d;
            if (gtVar != null) {
                gtVar.A();
                gVar.d.t(false);
            }
            return true;
        } else if (gVar.f35780e) {
            gVar.k(true);
            return true;
        } else if ((!gVar.f35785w && !q3Var.c()) || q3Var.d) {
            return false;
        } else {
            gVar.d();
            gVar.k(true);
            return true;
        }
    }

    public void setAccount(int i7) {
        this.U = i7;
    }

    public void setBlurredBackgroundDrawableForMentions(dh.c cVar) {
        this.f12367g0 = cVar;
    }

    public void setDialogId(long j3) {
        this.f12389y = j3;
        i iVar = this.M;
        if (iVar != null) {
            iVar.setDialogId(j3);
        }
    }

    public void setOnHeightUpdate(c20 c20Var) {
        this.f12369i0 = c20Var;
    }

    public void setOnKeyboardOpen(c20 c20Var) {
        this.f12370j0 = c20Var;
    }

    @Override
    public void setPressed(boolean z9) {
        boolean z10;
        super.setPressed(z9);
        if (z9 && !this.f12375o0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12364e0.c(z10);
    }

    public void setText(CharSequence charSequence) {
        this.V = true;
        this.f12365f.setText(charSequence);
    }

    public abstract void u(float f10);

    public final void v(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence) {
        if (spannableStringBuilder == null && charSequence == null) {
            this.B0 = false;
            invalidate();
            return;
        }
        this.B0 = true;
        if (spannableStringBuilder == null) {
            spannableStringBuilder = "";
        }
        this.C0 = new my0(spannableStringBuilder, 14.0f, org.telegram.messenger.g0.o());
        if (charSequence == null) {
            charSequence = "";
        }
        this.D0 = new my0(charSequence, 14.0f, null);
    }

    public void w() {
        this.M.getAdapter().f16776c = false;
        this.M.getAdapter().d = false;
        this.M.getAdapter().f16779e = false;
        this.M.getAdapter().m0 = this instanceof r;
    }

    public void x(int i7) {
        int bottomPadding;
        rt0 rt0Var = this.K;
        if (rt0Var != null) {
            rt0Var.R();
        }
        g gVar = this.f12365f;
        boolean z9 = false;
        if (gVar.f35780e) {
            i7 = Math.max(0, gVar.getEmojiPadding() + a());
        } else if (gVar.N) {
            i7 = Math.max(0, gVar.getKeyboardHeight() + a());
        }
        if (rt0Var == null) {
            bottomPadding = 0;
        } else {
            bottomPadding = rt0Var.getBottomPadding();
        }
        int max = Math.max(0, i7 - bottomPadding);
        View view = (View) getParent();
        view.clearAnimation();
        if (!(this instanceof ap0)) {
            ObjectAnimator objectAnimator = this.f12371k0;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.f12371k0.cancel();
                this.f12371k0 = null;
            }
            this.f12371k0 = ObjectAnimator.ofFloat(view, FrameLayout.TRANSLATION_Y, view.getTranslationY(), -max);
            if (max > org.telegram.messenger.g0.L(20.0f)) {
                this.f12371k0.setInterpolator(org.telegram.ui.ActionBar.i1.f27544w);
                this.f12371k0.setDuration(250L);
            } else {
                this.f12371k0.setInterpolator(xq.h);
                this.f12371k0.setDuration(640L);
            }
            this.f12371k0.start();
        }
        if (max > org.telegram.messenger.g0.L(20.0f)) {
            z9 = true;
        }
        this.f12372l0 = z9;
        e eVar = this.m0;
        org.telegram.messenger.g0.r(eVar);
        org.telegram.messenger.g0.h3(eVar);
        if (max < org.telegram.messenger.g0.L(20.0f)) {
            gVar.getEditText().clearFocus();
            gVar.k(true);
        }
    }

    public void y() {
        if (this.M != null) {
            float translationY = ((View) getParent()).getTranslationY() - this.f12383u0.f39805c;
            if (this.M.getY() != translationY) {
                this.M.setTranslationY(translationY);
                this.M.invalidate();
            }
        }
    }

    public void q(boolean z9) {
    }

    public void r(int i7) {
    }

    public void setUiBlurBitmap(e20 e20Var) {
    }

    public void n() {
    }

    public void t() {
    }

    public void j(Canvas canvas, RectF rectF) {
    }

    public void s(int i7, int i10) {
    }

    public void k(Canvas canvas, RectF rectF, float f10) {
    }
}
