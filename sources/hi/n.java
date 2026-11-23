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
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.w10;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.ap0;
public abstract class n extends FrameLayout {
    public final RectF A0;
    public final RectF B0;
    public boolean C0;
    public wy0 D0;
    public final Paint E;
    public wy0 E0;
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
    public final cu0 L;
    public int L0;
    public final x3 M;
    public final org.telegram.ui.Components.c6 M0;
    public j N;
    public Paint N0;
    public int O;
    public RadialGradient O0;
    public final org.telegram.ui.Components.ba P;
    public Paint P0;
    public final org.telegram.ui.Components.fa Q;
    public RadialGradient Q0;
    public final org.telegram.ui.Components.fa R;
    public Matrix R0;
    public final org.telegram.ui.Components.fa S;
    public final org.telegram.ui.Components.fa T;
    public org.telegram.ui.Components.fa U;
    public int V;
    public boolean W;
    public org.telegram.ui.ActionBar.i6 f14927a;
    public boolean f14928a0;
    public final FrameLayout f14929b;
    public int f14930b0;
    public final dh.j f14931c;
    public int f14932c0;
    public final dh.j d;
    public final f f14933d0;
    public final Paint f14934e;
    public boolean f14935e0;
    public final h f14936f;
    public final org.telegram.ui.Components.lc f14937f0;
    public ObjectAnimator f14938g0;
    public final Drawable h;
    public dh.c f14939h0;
    public fh.g f14940i0;
    public w10 f14941j0;
    public w10 f14942k0;
    public ObjectAnimator f14943l0;
    public boolean m0;
    public final lq f14944n;
    public final f f14945n0;
    public float f14946o0;
    public boolean f14947p0;
    public ValueAnimator f14948q0;
    public final k f14949r;
    public Bitmap f14950r0;
    public final FrameLayout f14951s;
    public BitmapShader f14952s0;
    public Matrix f14953t0;
    public Paint f14954u0;
    public final org.telegram.ui.Components.c6 f14955v0;
    public final org.telegram.ui.Components.n6 f14956w;
    public int f14957w0;
    public int f14958x;
    public float f14959x0;
    public long f14960y;
    public boolean f14961y0;
    public final RectF f14962z0;

    public n(Context context, FrameLayout frameLayout, cu0 cu0Var, FrameLayout frameLayout2, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.Components.ba baVar) {
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
        this.f14931c = jVar;
        dh.j jVar2 = new dh.j();
        this.d = jVar2;
        Paint paint = new Paint(1);
        this.f14934e = paint;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(10.0f), new int[]{-65536, 0}, new float[]{0.05f, 1.0f}, Shader.TileMode.CLAMP);
        this.F = linearGradient;
        this.G = new Matrix();
        this.I = new TextPaint(3);
        Paint paint3 = new Paint(3);
        this.J = paint3;
        this.O = -4;
        this.V = i10.f24637t0;
        this.f14933d0 = new f(this, 0);
        this.f14937f0 = new org.telegram.ui.Components.lc(this, 1.0f, 3.0f);
        this.f14945n0 = new f(this, 1);
        kr krVar = kr.h;
        this.f14955v0 = new org.telegram.ui.Components.c6(this, 0L, 300L, krVar);
        this.f14961y0 = false;
        this.f14962z0 = new RectF();
        this.A0 = new RectF();
        this.B0 = new RectF();
        this.J0 = new Path();
        this.M0 = new org.telegram.ui.Components.c6(this, 500L, krVar);
        this.f14927a = i6Var;
        this.K = frameLayout;
        this.L = cu0Var;
        this.f14929b = frameLayout2;
        this.P = baVar;
        this.S = new org.telegram.ui.Components.fa(baVar, this, 0, !g());
        this.T = new org.telegram.ui.Components.fa(baVar, this, 8, false);
        this.R = new org.telegram.ui.Components.fa(baVar, this, 9, false);
        jVar.f8445l = true;
        int i16 = org.telegram.ui.ActionBar.n6.f29451d6;
        jVar.f8436a = new g(i6Var, i16, 0.0f, 0);
        jVar.a();
        jVar.f8441g.setColor(0);
        jVar.invalidateSelf();
        jVar2.f8445l = true;
        jVar2.f8436a = new g(i6Var, i16, 0.0f, 1);
        jVar2.a();
        jVar2.f8441g.setColor(0);
        jVar2.invalidateSelf();
        paint.setColor(Integer.MIN_VALUE);
        this.M = new x3(frameLayout, false, new ai.d0(this, 21));
        h hVar = new h(this, context, cu0Var, getEditTextStyle(), new fi.b(), i6Var, baVar);
        this.f14936f = hVar;
        hVar.T = true;
        hVar.getEditText().addTextChangedListener(new org.telegram.ui.Cells.k3());
        hVar.setFocusable(true);
        hVar.setFocusableInTouchMode(true);
        hVar.getEditText().f33034r0 = true;
        hVar.getEditText().f33038t0 = new bi.b(this, 24);
        hVar.getEditText().setSupportRtlHint(true);
        mt editText = hVar.getEditText();
        if (g()) {
            i7 = 1;
        } else {
            i7 = 2;
        }
        this.Q = new org.telegram.ui.Components.fa(baVar, editText, i7, false);
        hVar.getEditText().setHintColor(-1);
        hVar.getEditText().r(gd.N0(2131754451, null), false);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        hVar.getEditText().setTranslationX(org.telegram.messenger.g0.L(-26.0f));
        boolean z10 = this instanceof ap0;
        if (z10) {
            hVar.getEditText().setGravity(48);
        }
        hVar.getEmojiButton().setAlpha(0.0f);
        View emojiButton = hVar.getEmojiButton();
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = -1.0f;
        }
        emojiButton.setTranslationY(org.telegram.messenger.g0.L(f10));
        hVar.setTranslationY(org.telegram.messenger.g0.L(z10 ? 1.0f : -1.0f));
        hVar.getEditText().addTextChangedListener(new i(this));
        hVar.getEditText().setLinkTextColor(-1);
        if (z10) {
            i10 = 48;
        } else {
            i10 = 80;
        }
        addView(hVar, c8.na.d(-1, -2.0f, i10 | 7, 12.0f, 8.0f, b() + 12, 8.0f));
        k kVar = new k(context);
        this.f14949r = kVar;
        c8.sa.b(kVar, 0.05f, 1.25f);
        Drawable mutate = context.getResources().getDrawable(2131231505).mutate();
        this.h = mutate;
        org.telegram.ui.ActionBar.u6.x(this, mutate, org.telegram.ui.ActionBar.n6.U5, null, PorterDuff.Mode.SRC_IN);
        lq lqVar = new lq(org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29700qg, i6Var)), mutate, 0, org.telegram.messenger.g0.L(1.0f));
        this.f14944n = lqVar;
        int L = org.telegram.messenger.g0.L(36.0f);
        int L2 = org.telegram.messenger.g0.L(36.0f);
        lqVar.h = L;
        lqVar.f37200n = L2;
        kVar.setImageDrawable(lqVar);
        kVar.setScaleType(ImageView.ScaleType.CENTER);
        kVar.setContentDescription(gd.N0(2131751342, null));
        kVar.setAlpha(0.0f);
        kVar.setVisibility(8);
        kVar.setOnClickListener(new ah.d(this, 27));
        if (z10) {
            i11 = 48;
        } else {
            i11 = 80;
        }
        addView(kVar, c8.na.d(44, 44.0f, i11 | 5, 8.0f, 8.0f, 8.0f, 8.0f));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, false, true, true);
        this.f14956w = n6Var;
        n6Var.setGravity(17);
        n6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        n6Var.setTextColor(-1);
        n6Var.b(0.4f, 320L, krVar);
        n6Var.setTypeface(org.telegram.messenger.g0.o());
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f14951s = frameLayout3;
        frameLayout3.setTranslationX(org.telegram.messenger.g0.L(2.0f));
        if (z10) {
            i12 = 48;
        } else {
            i12 = 80;
        }
        frameLayout3.addView(n6Var, c8.na.e(52, 16, i12 | 5));
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
        addView(frameLayout3, c8.na.d(52, 16.0f, i17, 0.0f, f11, 0.0f, i15));
        paint2.setShader(linearGradient);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public int a() {
        return org.telegram.messenger.g0.f24221n;
    }

    public int b() {
        return 0;
    }

    public abstract void c(boolean z10);

    @Override
    public final void clearFocus() {
        this.f14936f.clearFocus();
    }

    public abstract void d(boolean z10);

    @Override
    public void dispatchDraw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: hi.n.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f14935e0 && (motionEvent.getAction() != 0 || !l(motionEvent.getX(), motionEvent.getY()))) {
            if (this.B0.contains(motionEvent.getX(), motionEvent.getY()) || this.f14947p0) {
                int action = motionEvent.getAction();
                org.telegram.ui.Components.lc lcVar = this.f14937f0;
                if (action == 0 && !this.f14947p0) {
                    if ((this instanceof s) && ((s) this).O1) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    int i7 = 0;
                    while (true) {
                        int childCount = getChildCount();
                        h hVar = this.f14936f;
                        if (i7 < childCount) {
                            View childAt = getChildAt(i7);
                            if (childAt != null && childAt.isClickable() && childAt.getVisibility() == 0 && childAt.getAlpha() >= 0.5f && hVar != childAt) {
                                float x10 = childAt.getX();
                                float y10 = childAt.getY();
                                float x11 = childAt.getX() + childAt.getWidth();
                                float y11 = childAt.getY() + childAt.getHeight();
                                RectF rectF = this.f14962z0;
                                rectF.set(x10, y10, x11, y11);
                                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                                    return super.dispatchTouchEvent(motionEvent);
                                }
                            }
                            i7++;
                        } else {
                            this.M.b(false);
                            hVar.getEditText().setForceCursorEnd(true);
                            hVar.getEditText().requestFocus();
                            rt rtVar = hVar.f41719a;
                            rtVar.requestFocus();
                            org.telegram.messenger.g0.I3(rtVar);
                            hVar.getEditText().setScrollY(0);
                            lcVar.c(true);
                            return true;
                        }
                    }
                } else {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        lcVar.c(false);
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        h hVar;
        float max;
        RectF rectF = this.A0;
        if (view == this.f14936f) {
            if (this instanceof ap0) {
                max = 0.0f;
            } else {
                max = (1.0f - this.f14946o0) * Math.max(0, (hVar.getHeight() - org.telegram.messenger.g0.L(82.0f)) - hVar.getScrollY());
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
        if (i10.i(this.V).q()) {
            return getCaptionPremiumLimit();
        }
        return getCaptionDefaultLimit();
    }

    public int getCaptionPremiumLimit() {
        return 0;
    }

    public int getCodePointCount() {
        return this.f14958x;
    }

    public int getEditTextHeight() {
        return (int) this.f14955v0.f33931c;
    }

    public int getEditTextHeightClosedKeyboard() {
        return Math.min(org.telegram.messenger.g0.L(82.0f), this.f14936f.getHeight());
    }

    public int getEditTextLeft() {
        return 0;
    }

    public int getEditTextStyle() {
        return 2;
    }

    public float getOver2Alpha() {
        return this.M0.f33931c;
    }

    public int getSelectionLength() {
        h hVar = this.f14936f;
        if (hVar != null && hVar.getEditText() != null) {
            try {
                return hVar.getEditText().getSelectionEnd() - hVar.getEditText().getSelectionStart();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        return 0;
    }

    public CharSequence getText() {
        return this.f14936f.getText();
    }

    public abstract void h(org.telegram.ui.Components.fa faVar, Canvas canvas, RectF rectF, float f10, boolean z10, float f11, float f12, boolean z11);

    public void i(Bitmap bitmap) {
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    public abstract boolean l(float f10, float f11);

    public final void m() {
        invalidate();
        h hVar = this.f14936f;
        hVar.getEditText().invalidate();
        hVar.getEmojiButton().invalidate();
        j jVar = this.N;
        if (jVar != null) {
            jVar.invalidate();
        }
        if (hVar.getEmojiView() != null && g()) {
            hVar.getEmojiView().invalidate();
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
            String N0 = gd.N0(2131754451, null);
            this.H = Bitmap.createBitmap((int) Math.ceil(textPaint.measureText(N0)), (int) Math.ceil(textPaint.getFontMetrics().descent - textPaint.getFontMetrics().ascent), Bitmap.Config.ARGB_8888);
            new Canvas(this.H).drawText(N0, 0.0f, -((int) textPaint.getFontMetrics().ascent), textPaint);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.f14950r0;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f14952s0 = null;
        this.f14954u0 = null;
        Bitmap bitmap2 = this.H;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.H = null;
        }
    }

    public final boolean p() {
        h hVar = this.f14936f;
        boolean z10 = hVar.f41729y;
        x3 x3Var = this.M;
        if (z10 && hVar.getEmojiView() != null) {
            if (x3Var.c()) {
                hVar.getEmojiView().A();
                return true;
            }
            st stVar = hVar.d;
            if (stVar != null) {
                stVar.A();
                hVar.d.t(false);
            }
            return true;
        } else if (hVar.f41722e) {
            hVar.k(true);
            return true;
        } else if ((!hVar.f41727w && !x3Var.c()) || x3Var.d) {
            return false;
        } else {
            hVar.d();
            hVar.k(true);
            return true;
        }
    }

    public void setAccount(int i7) {
        this.V = i7;
    }

    public void setBlurredBackgroundDrawableForMentions(dh.c cVar) {
        this.f14939h0 = cVar;
    }

    public void setDialogId(long j3) {
        this.f14960y = j3;
        j jVar = this.N;
        if (jVar != null) {
            jVar.setDialogId(j3);
        }
    }

    public void setOnHeightUpdate(w10 w10Var) {
        this.f14941j0 = w10Var;
    }

    public void setOnKeyboardOpen(w10 w10Var) {
        this.f14942k0 = w10Var;
    }

    @Override
    public void setPressed(boolean z10) {
        boolean z11;
        super.setPressed(z10);
        if (z10 && !this.f14947p0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f14937f0.c(z11);
    }

    public void setText(CharSequence charSequence) {
        this.W = true;
        this.f14936f.setText(charSequence);
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
        this.D0 = new wy0(spannableStringBuilder, 14.0f, org.telegram.messenger.g0.o());
        if (charSequence == null) {
            charSequence = "";
        }
        this.E0 = new wy0(charSequence, 14.0f, null);
    }

    public void w() {
        this.N.getAdapter().f17598c = false;
        this.N.getAdapter().d = false;
        this.N.getAdapter().f17601e = false;
        this.N.getAdapter().f17612n0 = this instanceof s;
    }

    public void x(int i7) {
        int bottomPadding;
        cu0 cu0Var = this.L;
        if (cu0Var != null) {
            cu0Var.R();
        }
        h hVar = this.f14936f;
        boolean z10 = false;
        if (hVar.f41722e) {
            i7 = Math.max(0, hVar.getEmojiPadding() + a());
        } else if (hVar.O) {
            i7 = Math.max(0, hVar.getKeyboardHeight() + a());
        }
        if (cu0Var == null) {
            bottomPadding = 0;
        } else {
            bottomPadding = cu0Var.getBottomPadding();
        }
        int max = Math.max(0, i7 - bottomPadding);
        View view = (View) getParent();
        view.clearAnimation();
        if (!(this instanceof ap0)) {
            ObjectAnimator objectAnimator = this.f14943l0;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.f14943l0.cancel();
                this.f14943l0 = null;
            }
            this.f14943l0 = ObjectAnimator.ofFloat(view, FrameLayout.TRANSLATION_Y, view.getTranslationY(), -max);
            if (max > org.telegram.messenger.g0.L(20.0f)) {
                this.f14943l0.setInterpolator(org.telegram.ui.ActionBar.i1.f29066w);
                this.f14943l0.setDuration(250L);
            } else {
                this.f14943l0.setInterpolator(kr.h);
                this.f14943l0.setDuration(640L);
            }
            this.f14943l0.start();
        }
        if (max > org.telegram.messenger.g0.L(20.0f)) {
            z10 = true;
        }
        this.m0 = z10;
        f fVar = this.f14945n0;
        org.telegram.messenger.g0.r(fVar);
        org.telegram.messenger.g0.g3(fVar);
        if (max < org.telegram.messenger.g0.L(20.0f)) {
            hVar.getEditText().clearFocus();
            hVar.k(true);
        }
    }

    public void y() {
        if (this.N != null) {
            float translationY = ((View) getParent()).getTranslationY() - this.f14955v0.f33931c;
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

    public void q(boolean z10) {
    }

    public void r(int i7) {
    }

    public void setUiBlurBitmap(y10 y10Var) {
    }

    public void j(Canvas canvas, RectF rectF) {
    }

    public void s(int i7, int i10) {
    }

    public void k(Canvas canvas, RectF rectF, float f10) {
    }
}
