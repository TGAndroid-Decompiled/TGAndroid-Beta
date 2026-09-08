package di;

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
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.zt;
import org.telegram.ui.bt0;
public abstract class m extends FrameLayout {
    public final RectF A0;
    public final RectF B0;
    public boolean C0;
    public f01 D0;
    public final LinearGradient E;
    public f01 E0;
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
    public final ov0 K;
    public boolean K0;
    public final j4 L;
    public int L0;
    public i M;
    public final org.telegram.ui.Components.e6 M0;
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
    public org.telegram.ui.ActionBar.f6 f7612a;
    public int f7613a0;
    public final FrameLayout f7614b;
    public int f7615b0;
    public final bh.j f7616c;
    public final e f7617c0;
    public final bh.j d;
    public Utilities.CallbackVoidReturn f7618d0;
    public final Paint f7619e;
    public boolean f7620e0;
    public final g f7621f;
    public final org.telegram.ui.Components.zc f7622f0;
    public ObjectAnimator f7623g0;
    public final Drawable h;
    public bh.b f7624h0;
    public dh.d f7625i0;
    public Utilities.Callback f7626j0;
    public Utilities.Callback f7627k0;
    public ObjectAnimator f7628l0;
    public boolean m0;
    public final oq f7629n;
    public final e f7630n0;
    public float f7631o0;
    public boolean f7632p0;
    public ValueAnimator f7633q0;
    public final j f7634r;
    public Bitmap f7635r0;
    public final FrameLayout f7636s;
    public BitmapShader f7637s0;
    public Matrix f7638t0;
    public Paint f7639u0;
    public final org.telegram.ui.Components.q6 v;
    public final org.telegram.ui.Components.e6 f7640v0;
    public int f7641w;
    public int f7642w0;
    public long f7643x;
    public float f7644x0;
    public final Paint f7645y;
    public boolean f7646y0;
    public final RectF f7647z0;

    public m(Context context, FrameLayout frameLayout, ov0 ov0Var, FrameLayout frameLayout2, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.ja jaVar) {
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
        this.f7616c = jVar;
        bh.j jVar2 = new bh.j();
        this.d = jVar2;
        Paint paint = new Paint(1);
        this.f7619e = paint;
        Paint paint2 = new Paint(1);
        this.f7645y = paint2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(10.0f), new int[]{-65536, 0}, new float[]{0.05f, 1.0f}, Shader.TileMode.CLAMP);
        this.E = linearGradient;
        this.F = new Matrix();
        this.H = new TextPaint(3);
        Paint paint3 = new Paint(3);
        this.I = paint3;
        this.N = -4;
        this.U = UserConfig.selectedAccount;
        this.f7617c0 = new e(this, 0);
        this.f7622f0 = new org.telegram.ui.Components.zc(this, 1.0f, 3.0f);
        this.f7630n0 = new e(this, 1);
        pr prVar = pr.h;
        this.f7640v0 = new org.telegram.ui.Components.e6(this, 0L, 300L, prVar);
        this.f7646y0 = false;
        this.f7647z0 = new RectF();
        this.A0 = new RectF();
        this.B0 = new RectF();
        this.J0 = new Path();
        this.M0 = new org.telegram.ui.Components.e6(this, 500L, prVar);
        this.f7612a = f6Var;
        this.J = frameLayout;
        this.K = ov0Var;
        this.f7614b = frameLayout2;
        this.O = jaVar;
        this.R = new org.telegram.ui.Components.na(jaVar, this, 0, !g());
        this.S = new org.telegram.ui.Components.na(jaVar, this, 8, false);
        this.Q = new org.telegram.ui.Components.na(jaVar, this, 9, false);
        jVar.f2745j = true;
        int i17 = org.telegram.ui.ActionBar.j6.f20690d6;
        jVar.a(new f(f6Var, i17, 0.0f, 0));
        jVar.f2743g.setColor(0);
        jVar.invalidateSelf();
        jVar2.f2745j = true;
        jVar2.a(new f(f6Var, i17, 0.0f, 1));
        jVar2.f2743g.setColor(0);
        jVar2.invalidateSelf();
        paint.setColor(Integer.MIN_VALUE);
        this.L = new j4(frameLayout, false, new bi.o1(this, 5));
        g gVar = new g(this, context, ov0Var, getEditTextStyle(), new bi.b(), f6Var, jaVar);
        this.f7621f = gVar;
        gVar.S = true;
        gVar.getEditText().addTextChangedListener(new org.telegram.ui.Cells.h3());
        gVar.setFocusable(true);
        gVar.setFocusableInTouchMode(true);
        gVar.getEditText().hintLayoutYFix = true;
        gVar.getEditText().drawHint = new ci.u(this, 1);
        gVar.getEditText().setSupportRtlHint(true);
        zt editText = gVar.getEditText();
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
        boolean z10 = this instanceof bt0;
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
        addView(gVar, w7.x5.d(-1, -2.0f, i11 | 7, 12.0f, 8.0f, b() + 12, 8.0f));
        j jVar3 = new j(context);
        this.f7634r = jVar3;
        w7.z5.b(jVar3, 0.05f, 1.25f);
        Drawable mutate = context.getResources().getDrawable(R.drawable.input_done).mutate();
        this.h = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.U5, false), PorterDuff.Mode.SRC_IN));
        oq oqVar = new oq(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21097zf, f6Var)), mutate, 0, AndroidUtilities.dp(1.0f));
        this.f7629n = oqVar;
        int dp = AndroidUtilities.dp(36.0f);
        int dp2 = AndroidUtilities.dp(36.0f);
        oqVar.h = dp;
        oqVar.f29191n = dp2;
        jVar3.setImageDrawable(oqVar);
        jVar3.setScaleType(ImageView.ScaleType.CENTER);
        jVar3.setContentDescription(LocaleController.getString(R.string.Done));
        jVar3.setAlpha(0.0f);
        jVar3.setVisibility(8);
        jVar3.setOnClickListener(new ah.h0(this, 8));
        if (z10) {
            i12 = 48;
        } else {
            i12 = 80;
        }
        addView(jVar3, w7.x5.d(44, 44.0f, i12 | 5, 8.0f, 8.0f, 8.0f, 8.0f));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, false, true, true);
        this.v = q6Var;
        q6Var.setGravity(17);
        q6Var.setTextSize(AndroidUtilities.dp(15.0f));
        q6Var.setTextColor(-1);
        q6Var.b(0.4f, 320L, prVar);
        q6Var.setTypeface(AndroidUtilities.bold());
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f7636s = frameLayout3;
        frameLayout3.setTranslationX(AndroidUtilities.dp(2.0f));
        if (z10) {
            i13 = 48;
        } else {
            i13 = 80;
        }
        frameLayout3.addView(q6Var, w7.x5.e(52, 16, i13 | 5));
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
        addView(frameLayout3, w7.x5.d(52, 16.0f, i18, 0.0f, f10, 0.0f, i16));
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
        this.f7621f.clearFocus();
    }

    public abstract void d(boolean z10);

    @Override
    public void dispatchDraw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: di.m.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f7620e0 && (motionEvent.getAction() != 0 || !l(motionEvent.getX(), motionEvent.getY()))) {
            if (this.B0.contains(motionEvent.getX(), motionEvent.getY()) || this.f7632p0) {
                int action = motionEvent.getAction();
                org.telegram.ui.Components.zc zcVar = this.f7622f0;
                if (action == 0 && !this.f7632p0) {
                    if ((this instanceof r) && ((r) this).O1) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    int i10 = 0;
                    while (true) {
                        int childCount = getChildCount();
                        g gVar = this.f7621f;
                        if (i10 < childCount) {
                            View childAt = getChildAt(i10);
                            if (childAt != null && childAt.isClickable() && childAt.getVisibility() == 0 && childAt.getAlpha() >= 0.5f && gVar != childAt) {
                                float x10 = childAt.getX();
                                float y3 = childAt.getY();
                                float x11 = childAt.getX() + childAt.getWidth();
                                float y10 = childAt.getY() + childAt.getHeight();
                                RectF rectF = this.f7647z0;
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
                            cu cuVar = gVar.f26874a;
                            cuVar.requestFocus();
                            AndroidUtilities.showKeyboard(cuVar);
                            gVar.getEditText().setScrollY(0);
                            zcVar.c(true);
                            return true;
                        }
                    }
                } else {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        zcVar.c(false);
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        float max;
        RectF rectF = this.A0;
        g gVar = this.f7621f;
        if (view == gVar) {
            if (this instanceof bt0) {
                max = 0.0f;
            } else {
                max = (1.0f - this.f7631o0) * Math.max(0, (gVar.getHeight() - AndroidUtilities.dp(82.0f)) - gVar.getScrollY());
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
            float f7 = rectF.left;
            float f10 = rectF.top;
            Paint paint = this.f7645y;
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
        if (UserConfig.getInstance(this.U).isPremium()) {
            return getCaptionPremiumLimit();
        }
        return getCaptionDefaultLimit();
    }

    public int getCaptionPremiumLimit() {
        return 0;
    }

    public int getCodePointCount() {
        return this.f7641w;
    }

    public int getEditTextHeight() {
        return (int) this.f7640v0.f25592c;
    }

    public int getEditTextHeightClosedKeyboard() {
        return Math.min(AndroidUtilities.dp(82.0f), this.f7621f.getHeight());
    }

    public int getEditTextLeft() {
        return 0;
    }

    public int getEditTextStyle() {
        return 2;
    }

    public float getOver2Alpha() {
        return this.M0.f25592c;
    }

    public int getSelectionLength() {
        g gVar = this.f7621f;
        if (gVar != null && gVar.getEditText() != null) {
            try {
                return gVar.getEditText().getSelectionEnd() - gVar.getEditText().getSelectionStart();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        return 0;
    }

    public CharSequence getText() {
        return this.f7621f.getText();
    }

    public abstract void h(org.telegram.ui.Components.na naVar, Canvas canvas, RectF rectF, float f7, boolean z10, float f10, float f11, boolean z11);

    public void i(Bitmap bitmap) {
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    public abstract boolean l(float f7, float f10);

    public final void m() {
        invalidate();
        g gVar = this.f7621f;
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
        Bitmap bitmap = this.f7635r0;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f7637s0 = null;
        this.f7639u0 = null;
        Bitmap bitmap2 = this.G;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.G = null;
        }
    }

    public final boolean p() {
        g gVar = this.f7621f;
        boolean z10 = gVar.f26883x;
        j4 j4Var = this.L;
        if (z10 && gVar.getEmojiView() != null) {
            if (j4Var.c()) {
                gVar.getEmojiView().B();
                return true;
            }
            du duVar = gVar.d;
            if (duVar != null) {
                duVar.B();
                gVar.d.t(false);
            }
            return true;
        } else if (gVar.f26877e) {
            gVar.k(true);
            return true;
        } else if ((!gVar.v && !j4Var.c()) || j4Var.d) {
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
        this.f7624h0 = bVar;
    }

    public void setDialogId(long j3) {
        this.f7643x = j3;
        i iVar = this.M;
        if (iVar != null) {
            iVar.setDialogId(j3);
        }
    }

    public void setOnHeightUpdate(Utilities.Callback<Integer> callback) {
        this.f7626j0 = callback;
    }

    public void setOnKeyboardOpen(Utilities.Callback<Boolean> callback) {
        this.f7627k0 = callback;
    }

    @Override
    public void setPressed(boolean z10) {
        boolean z11;
        super.setPressed(z10);
        if (z10 && !this.f7632p0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f7622f0.c(z11);
    }

    public void setText(CharSequence charSequence) {
        this.V = true;
        this.f7621f.setText(charSequence);
    }

    public void setUiBlurBitmap(Utilities.CallbackVoidReturn<Bitmap> callbackVoidReturn) {
        this.f7618d0 = callbackVoidReturn;
    }

    public abstract void u(float f7);

    public final void v(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
        if (spannableStringBuilder == null && charSequence == null) {
            this.C0 = false;
            invalidate();
            return;
        }
        this.C0 = true;
        if (spannableStringBuilder == null) {
            spannableStringBuilder = "";
        }
        this.D0 = new f01(spannableStringBuilder, 14.0f, AndroidUtilities.bold());
        if (charSequence == null) {
            charSequence = "";
        }
        this.E0 = new f01(charSequence, 14.0f, null);
    }

    public void w() {
        this.M.getAdapter().f11156c = false;
        this.M.getAdapter().d = false;
        this.M.getAdapter().f11159e = false;
        this.M.getAdapter().m0 = this instanceof r;
    }

    public void x(int i10) {
        int bottomPadding;
        ov0 ov0Var = this.K;
        if (ov0Var != null) {
            ov0Var.S();
        }
        g gVar = this.f7621f;
        boolean z10 = false;
        if (gVar.f26877e) {
            i10 = Math.max(0, gVar.getEmojiPadding() + a());
        } else if (gVar.N) {
            i10 = Math.max(0, gVar.getKeyboardHeight() + a());
        }
        if (ov0Var == null) {
            bottomPadding = 0;
        } else {
            bottomPadding = ov0Var.getBottomPadding();
        }
        int max = Math.max(0, i10 - bottomPadding);
        View view = (View) getParent();
        view.clearAnimation();
        if (!(this instanceof bt0)) {
            ObjectAnimator objectAnimator = this.f7628l0;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.f7628l0.cancel();
                this.f7628l0 = null;
            }
            this.f7628l0 = ObjectAnimator.ofFloat(view, FrameLayout.TRANSLATION_Y, view.getTranslationY(), -max);
            if (max > AndroidUtilities.dp(20.0f)) {
                this.f7628l0.setInterpolator(org.telegram.ui.ActionBar.p1.f21302w);
                this.f7628l0.setDuration(250L);
            } else {
                this.f7628l0.setInterpolator(pr.h);
                this.f7628l0.setDuration(640L);
            }
            this.f7628l0.start();
        }
        if (max > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        }
        this.m0 = z10;
        e eVar = this.f7630n0;
        AndroidUtilities.cancelRunOnUIThread(eVar);
        AndroidUtilities.runOnUIThread(eVar);
        if (max < AndroidUtilities.dp(20.0f)) {
            gVar.getEditText().clearFocus();
            gVar.k(true);
        }
    }

    public void y() {
        if (this.M != null) {
            float translationY = ((View) getParent()).getTranslationY() - this.f7640v0.f25592c;
            if (this.M.getY() != translationY) {
                this.M.setTranslationY(translationY);
                this.M.invalidate();
            }
        }
    }

    public void n() {
    }

    public void t() {
    }

    public void q(boolean z10) {
    }

    public void r(int i10) {
    }

    public void j(Canvas canvas, RectF rectF) {
    }

    public void s(int i10, int i11) {
    }

    public void k(Canvas canvas, RectF rectF, float f7) {
    }
}
