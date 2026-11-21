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
import org.telegram.messenger.j10;
import org.telegram.messenger.x10;
import org.telegram.messenger.z10;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.ot;
import org.telegram.ui.Components.tt;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.bp0;
public abstract class o extends FrameLayout {
    public final RectF A0;
    public final RectF B0;
    public boolean C0;
    public xy0 D0;
    public final Paint E;
    public xy0 E0;
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
    public final du0 L;
    public int L0;
    public final o3 M;
    public final org.telegram.ui.Components.d6 M0;
    public j N;
    public Paint N0;
    public int O;
    public RadialGradient O0;
    public final org.telegram.ui.Components.ca P;
    public Paint P0;
    public final org.telegram.ui.Components.ga Q;
    public RadialGradient Q0;
    public final org.telegram.ui.Components.ga R;
    public Matrix R0;
    public final org.telegram.ui.Components.ga S;
    public final org.telegram.ui.Components.ga T;
    public org.telegram.ui.Components.ga U;
    public int V;
    public boolean W;
    public org.telegram.ui.ActionBar.h6 f15139a;
    public boolean f15140a0;
    public final FrameLayout f15141b;
    public int f15142b0;
    public final dh.j f15143c;
    public int f15144c0;
    public final dh.j d;
    public final f f15145d0;
    public final Paint f15146e;
    public boolean f15147e0;
    public final h f15148f;
    public final mc f15149f0;
    public ObjectAnimator f15150g0;
    public final Drawable h;
    public dh.c f15151h0;
    public fh.g f15152i0;
    public x10 f15153j0;
    public x10 f15154k0;
    public ObjectAnimator f15155l0;
    public boolean m0;
    public final oq f15156n;
    public final f f15157n0;
    public float f15158o0;
    public boolean f15159p0;
    public ValueAnimator f15160q0;
    public final k f15161r;
    public Bitmap f15162r0;
    public final FrameLayout f15163s;
    public BitmapShader f15164s0;
    public Matrix f15165t0;
    public Paint f15166u0;
    public final org.telegram.ui.Components.d6 f15167v0;
    public final org.telegram.ui.Components.o6 f15168w;
    public int f15169w0;
    public int f15170x;
    public float f15171x0;
    public long f15172y;
    public boolean f15173y0;
    public final RectF f15174z0;

    public o(Context context, FrameLayout frameLayout, du0 du0Var, FrameLayout frameLayout2, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.Components.ca caVar) {
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
        this.f15143c = jVar;
        dh.j jVar2 = new dh.j();
        this.d = jVar2;
        Paint paint = new Paint(1);
        this.f15146e = paint;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(10.0f), new int[]{-65536, 0}, new float[]{0.05f, 1.0f}, Shader.TileMode.CLAMP);
        this.F = linearGradient;
        this.G = new Matrix();
        this.I = new TextPaint(3);
        Paint paint3 = new Paint(3);
        this.J = paint3;
        this.O = -4;
        this.V = j10.f24798t0;
        this.f15145d0 = new f(this, 0);
        this.f15149f0 = new mc(this, 1.0f, 3.0f);
        this.f15157n0 = new f(this, 1);
        nr nrVar = nr.h;
        this.f15167v0 = new org.telegram.ui.Components.d6(this, 0L, 300L, nrVar);
        this.f15173y0 = false;
        this.f15174z0 = new RectF();
        this.A0 = new RectF();
        this.B0 = new RectF();
        this.J0 = new Path();
        this.M0 = new org.telegram.ui.Components.d6(this, 500L, nrVar);
        this.f15139a = h6Var;
        this.K = frameLayout;
        this.L = du0Var;
        this.f15141b = frameLayout2;
        this.P = caVar;
        this.S = new org.telegram.ui.Components.ga(caVar, this, 0, !g());
        this.T = new org.telegram.ui.Components.ga(caVar, this, 8, false);
        this.R = new org.telegram.ui.Components.ga(caVar, this, 9, false);
        jVar.f8480l = true;
        int i16 = org.telegram.ui.ActionBar.m6.f29378d6;
        jVar.f8471a = new g(h6Var, i16, 0.0f, 0);
        jVar.a();
        jVar.f8476g.setColor(0);
        jVar.invalidateSelf();
        jVar2.f8480l = true;
        jVar2.f8471a = new g(h6Var, i16, 0.0f, 1);
        jVar2.a();
        jVar2.f8476g.setColor(0);
        jVar2.invalidateSelf();
        paint.setColor(Integer.MIN_VALUE);
        this.M = new o3(frameLayout, false, new ai.h0(this, 21));
        h hVar = new h(this, context, du0Var, getEditTextStyle(), new fi.b(), h6Var, caVar);
        this.f15148f = hVar;
        hVar.T = true;
        hVar.getEditText().addTextChangedListener(new org.telegram.ui.Cells.k3());
        hVar.setFocusable(true);
        hVar.setFocusableInTouchMode(true);
        hVar.getEditText().f32967r0 = true;
        hVar.getEditText().f32971t0 = new bi.b(this, 24);
        hVar.getEditText().setSupportRtlHint(true);
        ot editText = hVar.getEditText();
        if (g()) {
            i7 = 1;
        } else {
            i7 = 2;
        }
        this.Q = new org.telegram.ui.Components.ga(caVar, editText, i7, false);
        hVar.getEditText().setHintColor(-1);
        hVar.getEditText().r(gd.N0(2131754451, null), false);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        hVar.getEditText().setTranslationX(org.telegram.messenger.g0.L(-26.0f));
        boolean z10 = this instanceof bp0;
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
        addView(hVar, c8.ma.d(-1, -2.0f, i10 | 7, 12.0f, 8.0f, b() + 12, 8.0f));
        k kVar = new k(context);
        this.f15161r = kVar;
        c8.ra.b(kVar, 0.05f, 1.25f);
        Drawable mutate = context.getResources().getDrawable(2131231502).mutate();
        this.h = mutate;
        org.telegram.ui.ActionBar.t6.x(this, mutate, org.telegram.ui.ActionBar.m6.U5, null, PorterDuff.Mode.SRC_IN);
        oq oqVar = new oq(org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29627qg, h6Var)), mutate, 0, org.telegram.messenger.g0.L(1.0f));
        this.f15156n = oqVar;
        int L = org.telegram.messenger.g0.L(36.0f);
        int L2 = org.telegram.messenger.g0.L(36.0f);
        oqVar.h = L;
        oqVar.f38341n = L2;
        kVar.setImageDrawable(oqVar);
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
        addView(kVar, c8.ma.d(44, 44.0f, i11 | 5, 8.0f, 8.0f, 8.0f, 8.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, true, true);
        this.f15168w = o6Var;
        o6Var.setGravity(17);
        o6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        o6Var.setTextColor(-1);
        o6Var.b(0.4f, 320L, nrVar);
        o6Var.setTypeface(org.telegram.messenger.g0.o());
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f15163s = frameLayout3;
        frameLayout3.setTranslationX(org.telegram.messenger.g0.L(2.0f));
        if (z10) {
            i12 = 48;
        } else {
            i12 = 80;
        }
        frameLayout3.addView(o6Var, c8.ma.e(52, 16, i12 | 5));
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
        addView(frameLayout3, c8.ma.d(52, 16.0f, i17, 0.0f, f11, 0.0f, i15));
        paint2.setShader(linearGradient);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public int a() {
        return org.telegram.messenger.g0.f24141n;
    }

    public int b() {
        return 0;
    }

    public abstract void c(boolean z10);

    @Override
    public final void clearFocus() {
        this.f15148f.clearFocus();
    }

    public abstract void d(boolean z10);

    @Override
    public void dispatchDraw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: hi.o.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f15147e0 && (motionEvent.getAction() != 0 || !l(motionEvent.getX(), motionEvent.getY()))) {
            if (this.B0.contains(motionEvent.getX(), motionEvent.getY()) || this.f15159p0) {
                int action = motionEvent.getAction();
                mc mcVar = this.f15149f0;
                if (action == 0 && !this.f15159p0) {
                    if ((this instanceof t) && ((t) this).O1) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    int i7 = 0;
                    while (true) {
                        int childCount = getChildCount();
                        h hVar = this.f15148f;
                        if (i7 < childCount) {
                            View childAt = getChildAt(i7);
                            if (childAt != null && childAt.isClickable() && childAt.getVisibility() == 0 && childAt.getAlpha() >= 0.5f && hVar != childAt) {
                                float x10 = childAt.getX();
                                float y10 = childAt.getY();
                                float x11 = childAt.getX() + childAt.getWidth();
                                float y11 = childAt.getY() + childAt.getHeight();
                                RectF rectF = this.f15174z0;
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
                            tt ttVar = hVar.f42542a;
                            ttVar.requestFocus();
                            org.telegram.messenger.g0.I3(ttVar);
                            hVar.getEditText().setScrollY(0);
                            mcVar.c(true);
                            return true;
                        }
                    }
                } else {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        mcVar.c(false);
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
        if (view == this.f15148f) {
            if (this instanceof bp0) {
                max = 0.0f;
            } else {
                max = (1.0f - this.f15158o0) * Math.max(0, (hVar.getHeight() - org.telegram.messenger.g0.L(82.0f)) - hVar.getScrollY());
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
        if (j10.i(this.V).q()) {
            return getCaptionPremiumLimit();
        }
        return getCaptionDefaultLimit();
    }

    public int getCaptionPremiumLimit() {
        return 0;
    }

    public int getCodePointCount() {
        return this.f15170x;
    }

    public int getEditTextHeight() {
        return (int) this.f15167v0.f34391c;
    }

    public int getEditTextHeightClosedKeyboard() {
        return Math.min(org.telegram.messenger.g0.L(82.0f), this.f15148f.getHeight());
    }

    public int getEditTextLeft() {
        return 0;
    }

    public int getEditTextStyle() {
        return 2;
    }

    public float getOver2Alpha() {
        return this.M0.f34391c;
    }

    public int getSelectionLength() {
        h hVar = this.f15148f;
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
        return this.f15148f.getText();
    }

    public abstract void h(org.telegram.ui.Components.ga gaVar, Canvas canvas, RectF rectF, float f10, boolean z10, float f11, float f12, boolean z11);

    public void i(Bitmap bitmap) {
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    public abstract boolean l(float f10, float f11);

    public final void m() {
        invalidate();
        h hVar = this.f15148f;
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
        Bitmap bitmap = this.f15162r0;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f15164s0 = null;
        this.f15166u0 = null;
        Bitmap bitmap2 = this.H;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.H = null;
        }
    }

    public final boolean p() {
        h hVar = this.f15148f;
        boolean z10 = hVar.f42552y;
        o3 o3Var = this.M;
        if (z10 && hVar.getEmojiView() != null) {
            if (o3Var.c()) {
                hVar.getEmojiView().A();
                return true;
            }
            ut utVar = hVar.d;
            if (utVar != null) {
                utVar.A();
                hVar.d.t(false);
            }
            return true;
        } else if (hVar.f42545e) {
            hVar.k(true);
            return true;
        } else if ((!hVar.f42550w && !o3Var.c()) || o3Var.d) {
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
        this.f15151h0 = cVar;
    }

    public void setDialogId(long j3) {
        this.f15172y = j3;
        j jVar = this.N;
        if (jVar != null) {
            jVar.setDialogId(j3);
        }
    }

    public void setOnHeightUpdate(x10 x10Var) {
        this.f15153j0 = x10Var;
    }

    public void setOnKeyboardOpen(x10 x10Var) {
        this.f15154k0 = x10Var;
    }

    @Override
    public void setPressed(boolean z10) {
        boolean z11;
        super.setPressed(z10);
        if (z10 && !this.f15159p0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f15149f0.c(z11);
    }

    public void setText(CharSequence charSequence) {
        this.W = true;
        this.f15148f.setText(charSequence);
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
        this.D0 = new xy0(spannableStringBuilder, 14.0f, org.telegram.messenger.g0.o());
        if (charSequence == null) {
            charSequence = "";
        }
        this.E0 = new xy0(charSequence, 14.0f, null);
    }

    public void w() {
        this.N.getAdapter().f17527c = false;
        this.N.getAdapter().d = false;
        this.N.getAdapter().f17530e = false;
        this.N.getAdapter().f17541n0 = this instanceof t;
    }

    public void x(int i7) {
        int bottomPadding;
        du0 du0Var = this.L;
        if (du0Var != null) {
            du0Var.R();
        }
        h hVar = this.f15148f;
        boolean z10 = false;
        if (hVar.f42545e) {
            i7 = Math.max(0, hVar.getEmojiPadding() + a());
        } else if (hVar.O) {
            i7 = Math.max(0, hVar.getKeyboardHeight() + a());
        }
        if (du0Var == null) {
            bottomPadding = 0;
        } else {
            bottomPadding = du0Var.getBottomPadding();
        }
        int max = Math.max(0, i7 - bottomPadding);
        View view = (View) getParent();
        view.clearAnimation();
        if (!(this instanceof bp0)) {
            ObjectAnimator objectAnimator = this.f15155l0;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.f15155l0.cancel();
                this.f15155l0 = null;
            }
            this.f15155l0 = ObjectAnimator.ofFloat(view, FrameLayout.TRANSLATION_Y, view.getTranslationY(), -max);
            if (max > org.telegram.messenger.g0.L(20.0f)) {
                this.f15155l0.setInterpolator(org.telegram.ui.ActionBar.i1.f29002w);
                this.f15155l0.setDuration(250L);
            } else {
                this.f15155l0.setInterpolator(nr.h);
                this.f15155l0.setDuration(640L);
            }
            this.f15155l0.start();
        }
        if (max > org.telegram.messenger.g0.L(20.0f)) {
            z10 = true;
        }
        this.m0 = z10;
        f fVar = this.f15157n0;
        org.telegram.messenger.g0.r(fVar);
        org.telegram.messenger.g0.g3(fVar);
        if (max < org.telegram.messenger.g0.L(20.0f)) {
            hVar.getEditText().clearFocus();
            hVar.k(true);
        }
    }

    public void y() {
        if (this.N != null) {
            float translationY = ((View) getParent()).getTranslationY() - this.f15167v0.f34391c;
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

    public void setUiBlurBitmap(z10 z10Var) {
    }

    public void j(Canvas canvas, RectF rectF) {
    }

    public void s(int i7, int i10) {
    }

    public void k(Canvas canvas, RectF rectF, float f10) {
    }
}
