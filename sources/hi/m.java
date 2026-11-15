package hi;

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
import org.telegram.messenger.b20;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.z10;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.nt;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.st0;
import org.telegram.ui.yo0;
public abstract class m extends FrameLayout {
    public final RectF A0;
    public final RectF B0;
    public boolean C0;
    public oy0 D0;
    public final Paint E;
    public oy0 E0;
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
    public final st0 L;
    public int L0;
    public final p3 M;
    public final org.telegram.ui.Components.u5 M0;
    public i N;
    public Paint N0;
    public int O;
    public RadialGradient O0;
    public final org.telegram.ui.Components.u9 P;
    public Paint P0;
    public final org.telegram.ui.Components.y9 Q;
    public RadialGradient Q0;
    public final org.telegram.ui.Components.y9 R;
    public Matrix R0;
    public final org.telegram.ui.Components.y9 S;
    public final org.telegram.ui.Components.y9 T;
    public org.telegram.ui.Components.y9 U;
    public int V;
    public boolean W;
    public org.telegram.ui.ActionBar.e6 f14614a;
    public boolean f14615a0;
    public final FrameLayout f14616b;
    public int f14617b0;
    public final dh.j f14618c;
    public int f14619c0;
    public final dh.j d;
    public final e f14620d0;
    public final Paint f14621e;
    public boolean f14622e0;
    public final g f14623f;
    public final dc f14624f0;
    public ObjectAnimator f14625g0;
    public final Drawable h;
    public dh.c f14626h0;
    public fh.g f14627i0;
    public z10 f14628j0;
    public z10 f14629k0;
    public ObjectAnimator f14630l0;
    public boolean m0;
    public final fq f14631n;
    public final e f14632n0;
    public float f14633o0;
    public boolean f14634p0;
    public ValueAnimator f14635q0;
    public final j f14636r;
    public Bitmap f14637r0;
    public final FrameLayout f14638s;
    public BitmapShader f14639s0;
    public Matrix f14640t0;
    public Paint f14641u0;
    public final org.telegram.ui.Components.u5 f14642v0;
    public final org.telegram.ui.Components.h6 f14643w;
    public int f14644w0;
    public int f14645x;
    public float f14646x0;
    public long f14647y;
    public boolean f14648y0;
    public final RectF f14649z0;

    public m(Context context, FrameLayout frameLayout, st0 st0Var, FrameLayout frameLayout2, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.u9 u9Var) {
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
        this.f14618c = jVar;
        dh.j jVar2 = new dh.j();
        this.d = jVar2;
        Paint paint = new Paint(1);
        this.f14621e = paint;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(10.0f), new int[]{-65536, 0}, new float[]{0.05f, 1.0f}, Shader.TileMode.CLAMP);
        this.F = linearGradient;
        this.G = new Matrix();
        this.I = new TextPaint(3);
        Paint paint3 = new Paint(3);
        this.J = paint3;
        this.O = -4;
        this.V = m10.f24940t0;
        this.f14620d0 = new e(this, 0);
        this.f14624f0 = new dc(this, 1.0f, 3.0f);
        this.f14632n0 = new e(this, 1);
        er erVar = er.h;
        this.f14642v0 = new org.telegram.ui.Components.u5(this, 0L, 300L, erVar);
        this.f14648y0 = false;
        this.f14649z0 = new RectF();
        this.A0 = new RectF();
        this.B0 = new RectF();
        this.J0 = new Path();
        this.M0 = new org.telegram.ui.Components.u5(this, 500L, erVar);
        this.f14614a = e6Var;
        this.K = frameLayout;
        this.L = st0Var;
        this.f14616b = frameLayout2;
        this.P = u9Var;
        this.S = new org.telegram.ui.Components.y9(u9Var, this, 0, !g());
        this.T = new org.telegram.ui.Components.y9(u9Var, this, 8, false);
        this.R = new org.telegram.ui.Components.y9(u9Var, this, 9, false);
        jVar.f8172l = true;
        int i16 = org.telegram.ui.ActionBar.j6.f28849d6;
        jVar.f8163a = new f(e6Var, i16, 0.0f, 0);
        jVar.a();
        jVar.f8168g.setColor(0);
        jVar.invalidateSelf();
        jVar2.f8172l = true;
        jVar2.f8163a = new f(e6Var, i16, 0.0f, 1);
        jVar2.a();
        jVar2.f8168g.setColor(0);
        jVar2.invalidateSelf();
        paint.setColor(Integer.MIN_VALUE);
        this.M = new p3(frameLayout, false, new ai.g0(this, 20));
        g gVar = new g(this, context, st0Var, getEditTextStyle(), new fi.b(), e6Var, u9Var);
        this.f14623f = gVar;
        gVar.T = true;
        gVar.getEditText().addTextChangedListener(new org.telegram.ui.Cells.j3());
        gVar.setFocusable(true);
        gVar.setFocusableInTouchMode(true);
        gVar.getEditText().f32537r0 = true;
        gVar.getEditText().f32541t0 = new bi.b(this, 25);
        gVar.getEditText().setSupportRtlHint(true);
        ft editText = gVar.getEditText();
        if (g()) {
            i7 = 1;
        } else {
            i7 = 2;
        }
        this.Q = new org.telegram.ui.Components.y9(u9Var, editText, i7, false);
        gVar.getEditText().setHintColor(-1);
        gVar.getEditText().r(hd.M0(2131754454, null), false);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        gVar.getEditText().setTranslationX(org.telegram.messenger.g0.L(-26.0f));
        boolean z10 = this instanceof yo0;
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
        addView(gVar, c8.ja.d(-1, -2.0f, i10 | 7, 12.0f, 8.0f, b() + 12, 8.0f));
        j jVar3 = new j(context);
        this.f14636r = jVar3;
        c8.na.b(jVar3, 0.05f, 1.25f);
        Drawable mutate = context.getResources().getDrawable(2131231501).mutate();
        this.h = mutate;
        org.telegram.ui.ActionBar.q6.x(this, mutate, org.telegram.ui.ActionBar.j6.U5, null, PorterDuff.Mode.SRC_IN);
        fq fqVar = new fq(org.telegram.ui.ActionBar.j6.L(org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29098qg, e6Var)), mutate, 0, org.telegram.messenger.g0.L(1.0f));
        this.f14631n = fqVar;
        int L = org.telegram.messenger.g0.L(36.0f);
        int L2 = org.telegram.messenger.g0.L(36.0f);
        fqVar.h = L;
        fqVar.f34678n = L2;
        jVar3.setImageDrawable(fqVar);
        jVar3.setScaleType(ImageView.ScaleType.CENTER);
        jVar3.setContentDescription(hd.M0(2131751354, null));
        jVar3.setAlpha(0.0f);
        jVar3.setVisibility(8);
        jVar3.setOnClickListener(new ah.d(this, 26));
        if (z10) {
            i11 = 48;
        } else {
            i11 = 80;
        }
        addView(jVar3, c8.ja.d(44, 44.0f, i11 | 5, 8.0f, 8.0f, 8.0f, 8.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, true, true);
        this.f14643w = h6Var;
        h6Var.setGravity(17);
        h6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        h6Var.setTextColor(-1);
        h6Var.b(0.4f, 320L, erVar);
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f14638s = frameLayout3;
        frameLayout3.setTranslationX(org.telegram.messenger.g0.L(2.0f));
        if (z10) {
            i12 = 48;
        } else {
            i12 = 80;
        }
        frameLayout3.addView(h6Var, c8.ja.e(52, 16, i12 | 5));
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
        addView(frameLayout3, c8.ja.d(52, 16.0f, i17, 0.0f, f11, 0.0f, i15));
        paint2.setShader(linearGradient);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public int a() {
        return org.telegram.messenger.g0.f23606n;
    }

    public int b() {
        return 0;
    }

    public abstract void c(boolean z10);

    @Override
    public final void clearFocus() {
        this.f14623f.clearFocus();
    }

    public abstract void d(boolean z10);

    @Override
    public void dispatchDraw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: hi.m.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f14622e0 && (motionEvent.getAction() != 0 || !l(motionEvent.getX(), motionEvent.getY()))) {
            if (this.B0.contains(motionEvent.getX(), motionEvent.getY()) || this.f14634p0) {
                int action = motionEvent.getAction();
                dc dcVar = this.f14624f0;
                if (action == 0 && !this.f14634p0) {
                    if ((this instanceof r) && ((r) this).O1) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    int i7 = 0;
                    while (true) {
                        int childCount = getChildCount();
                        g gVar = this.f14623f;
                        if (i7 < childCount) {
                            View childAt = getChildAt(i7);
                            if (childAt != null && childAt.isClickable() && childAt.getVisibility() == 0 && childAt.getAlpha() >= 0.5f && gVar != childAt) {
                                float x10 = childAt.getX();
                                float y10 = childAt.getY();
                                float x11 = childAt.getX() + childAt.getWidth();
                                float y11 = childAt.getY() + childAt.getHeight();
                                RectF rectF = this.f14649z0;
                                rectF.set(x10, y10, x11, y11);
                                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                                    return super.dispatchTouchEvent(motionEvent);
                                }
                            }
                            i7++;
                        } else {
                            this.M.b(false);
                            gVar.getEditText().setForceCursorEnd(true);
                            gVar.getEditText().requestFocus();
                            mt mtVar = gVar.f39053a;
                            mtVar.requestFocus();
                            org.telegram.messenger.g0.J3(mtVar);
                            gVar.getEditText().setScrollY(0);
                            dcVar.c(true);
                            return true;
                        }
                    }
                } else {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        dcVar.c(false);
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
        if (view == this.f14623f) {
            if (this instanceof yo0) {
                max = 0.0f;
            } else {
                max = (1.0f - this.f14633o0) * Math.max(0, (gVar.getHeight() - org.telegram.messenger.g0.L(82.0f)) - gVar.getScrollY());
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(0.0f, max);
            boolean drawChild = super.drawChild(canvas, view, j3);
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
        if (m10.i(this.V).q()) {
            return getCaptionPremiumLimit();
        }
        return getCaptionDefaultLimit();
    }

    public int getCaptionPremiumLimit() {
        return 0;
    }

    public int getCodePointCount() {
        return this.f14645x;
    }

    public int getEditTextHeight() {
        return (int) this.f14642v0.f39900c;
    }

    public int getEditTextHeightClosedKeyboard() {
        return Math.min(org.telegram.messenger.g0.L(82.0f), this.f14623f.getHeight());
    }

    public int getEditTextLeft() {
        return 0;
    }

    public int getEditTextStyle() {
        return 2;
    }

    public float getOver2Alpha() {
        return this.M0.f39900c;
    }

    public int getSelectionLength() {
        g gVar = this.f14623f;
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
        return this.f14623f.getText();
    }

    public abstract void h(org.telegram.ui.Components.y9 y9Var, Canvas canvas, RectF rectF, float f10, boolean z10, float f11, float f12, boolean z11);

    public void i(Bitmap bitmap) {
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    public abstract boolean l(float f10, float f11);

    public final void m() {
        invalidate();
        g gVar = this.f14623f;
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
            String M0 = hd.M0(2131754454, null);
            this.H = Bitmap.createBitmap((int) Math.ceil(textPaint.measureText(M0)), (int) Math.ceil(textPaint.getFontMetrics().descent - textPaint.getFontMetrics().ascent), Bitmap.Config.ARGB_8888);
            new Canvas(this.H).drawText(M0, 0.0f, -((int) textPaint.getFontMetrics().ascent), textPaint);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.f14637r0;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f14639s0 = null;
        this.f14641u0 = null;
        Bitmap bitmap2 = this.H;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.H = null;
        }
    }

    public final boolean p() {
        g gVar = this.f14623f;
        boolean z10 = gVar.f39063y;
        p3 p3Var = this.M;
        if (z10 && gVar.getEmojiView() != null) {
            if (p3Var.c()) {
                gVar.getEmojiView().A();
                return true;
            }
            nt ntVar = gVar.d;
            if (ntVar != null) {
                ntVar.A();
                gVar.d.t(false);
            }
            return true;
        } else if (gVar.f39056e) {
            gVar.k(true);
            return true;
        } else if ((!gVar.f39061w && !p3Var.c()) || p3Var.d) {
            return false;
        } else {
            gVar.d();
            gVar.k(true);
            return true;
        }
    }

    public void setAccount(int i7) {
        this.V = i7;
    }

    public void setBlurredBackgroundDrawableForMentions(dh.c cVar) {
        this.f14626h0 = cVar;
    }

    public void setDialogId(long j3) {
        this.f14647y = j3;
        i iVar = this.N;
        if (iVar != null) {
            iVar.setDialogId(j3);
        }
    }

    public void setOnHeightUpdate(z10 z10Var) {
        this.f14628j0 = z10Var;
    }

    public void setOnKeyboardOpen(z10 z10Var) {
        this.f14629k0 = z10Var;
    }

    @Override
    public void setPressed(boolean z10) {
        boolean z11;
        super.setPressed(z10);
        if (z10 && !this.f14634p0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f14624f0.c(z11);
    }

    public void setText(CharSequence charSequence) {
        this.W = true;
        this.f14623f.setText(charSequence);
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
        this.D0 = new oy0(spannableStringBuilder, 14.0f, org.telegram.messenger.g0.o());
        if (charSequence == null) {
            charSequence = "";
        }
        this.E0 = new oy0(charSequence, 14.0f, null);
    }

    public void w() {
        this.N.getAdapter().f17119c = false;
        this.N.getAdapter().d = false;
        this.N.getAdapter().f17122e = false;
        this.N.getAdapter().f17133n0 = this instanceof r;
    }

    public void x(int i7) {
        int bottomPadding;
        st0 st0Var = this.L;
        if (st0Var != null) {
            st0Var.R();
        }
        g gVar = this.f14623f;
        boolean z10 = false;
        if (gVar.f39056e) {
            i7 = Math.max(0, gVar.getEmojiPadding() + a());
        } else if (gVar.O) {
            i7 = Math.max(0, gVar.getKeyboardHeight() + a());
        }
        if (st0Var == null) {
            bottomPadding = 0;
        } else {
            bottomPadding = st0Var.getBottomPadding();
        }
        int max = Math.max(0, i7 - bottomPadding);
        View view = (View) getParent();
        view.clearAnimation();
        if (!(this instanceof yo0)) {
            ObjectAnimator objectAnimator = this.f14630l0;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.f14630l0.cancel();
                this.f14630l0 = null;
            }
            this.f14630l0 = ObjectAnimator.ofFloat(view, FrameLayout.TRANSLATION_Y, view.getTranslationY(), -max);
            if (max > org.telegram.messenger.g0.L(20.0f)) {
                this.f14630l0.setInterpolator(org.telegram.ui.ActionBar.i1.f28644w);
                this.f14630l0.setDuration(250L);
            } else {
                this.f14630l0.setInterpolator(er.h);
                this.f14630l0.setDuration(640L);
            }
            this.f14630l0.start();
        }
        if (max > org.telegram.messenger.g0.L(20.0f)) {
            z10 = true;
        }
        this.m0 = z10;
        e eVar = this.f14632n0;
        org.telegram.messenger.g0.r(eVar);
        org.telegram.messenger.g0.h3(eVar);
        if (max < org.telegram.messenger.g0.L(20.0f)) {
            gVar.getEditText().clearFocus();
            gVar.k(true);
        }
    }

    public void y() {
        if (this.N != null) {
            float translationY = ((View) getParent()).getTranslationY() - this.f14642v0.f39900c;
            if (this.N.getY() != translationY) {
                this.N.setTranslationY(translationY);
                this.N.invalidate();
            }
        }
    }

    public void q(boolean z10) {
    }

    public void r(int i7) {
    }

    public void setUiBlurBitmap(b20 b20Var) {
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
