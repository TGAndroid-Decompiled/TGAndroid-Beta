package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
public abstract class z11 extends FrameLayout implements snb {
    public static final vk4 IN_OUT_OFFSET_Y = new t11((byte) 0);
    public static final Property<z11, Float> IN_OUT_OFFSET_Y2 = new qm("offsetY", (byte) 5);
    Drawable background;
    private Drawable backgroundBeforeGlass;
    private int backgroundColor;
    private al0 blurVisibilityDrawable;
    protected v21 bulletin;
    private final List<u11> callbacks;
    private LinearGradient clipGradient;
    private Matrix clipMatrix;
    private Paint clipPaint;
    r11 delegate;
    private Drawable glassBackground;
    private boolean hasCustomBackground;
    public float inOutOffset;
    public View.OnClickListener onClickListener;
    private Runnable onGlassBackgroundRemoved;
    private boolean pillStyle;
    private final vnb resourcesProvider;
    private Drawable themeBackground;
    public boolean top;
    public boolean transitionRunningEnter;
    public boolean transitionRunningExit;
    private int wideScreenGravity;
    private int wideScreenWidth;

    public z11(Context context, vnb vnbVar) {
        super(context);
        this.callbacks = new ArrayList();
        this.wideScreenWidth = -2;
        this.wideScreenGravity = 1;
        this.resourcesProvider = vnbVar;
        setMinimumHeight(hl.L(48.0f));
        setBackground(getThemedColor(aob.wj));
        this.themeBackground = this.background;
        f();
        setPadding(hl.L(16.0f), hl.L(8.0f), hl.L(16.0f), hl.L(8.0f));
        setWillNotDraw(false);
        iye.b(this, 0.02f, 1.5f);
    }

    public static boolean d() {
        if (!hl.O1()) {
            Point point = hl.q;
            if (point.x < point.y) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setInOutOffset(float f) {
        this.inOutOffset = f;
        updatePosition();
        v21 v21Var = this.bulletin;
        if (v21Var != null && v21Var.k) {
            invalidate();
        }
    }

    public void addCallback(u11 u11Var) {
        this.callbacks.add(u11Var);
    }

    public final boolean c(boolean z) {
        if (d() && this.wideScreenWidth != -1) {
            int i = this.wideScreenGravity;
            if (i != 1) {
                if (z) {
                    if (i != 5) {
                        return false;
                    }
                } else if (i == 5) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean canHaveGlassBackground() {
        if (!this.hasCustomBackground && this.glassBackground == null && this.backgroundColor == getThemedColor(aob.wj)) {
            return true;
        }
        return false;
    }

    public y11 createTransition() {
        return new z6f((byte) 14);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        v21 v21Var = this.bulletin;
        if (v21Var != null && v21Var.k) {
            al0 al0Var = this.blurVisibilityDrawable;
            if (al0Var == null) {
                al0Var = new al0(new tg0(this, (byte) 18));
                this.blurVisibilityDrawable = al0Var;
            }
            al0 al0Var2 = al0Var;
            if (al0Var.c == null) {
                al0Var2.b(getMeasuredWidth(), getMeasuredHeight(), 6.0f, hl.L(10.0f));
            }
            this.blurVisibilityDrawable.i = ete.b((int) uh9.e(this.inOutOffset, getMeasuredHeight(), 1.0f, 255.0f), 0, 255);
            this.blurVisibilityDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.blurVisibilityDrawable.draw(canvas);
            return;
        }
        dispatchDrawImpl(canvas, false, 255);
    }

    public void dispatchDrawImpl(Canvas canvas, boolean z, int i) {
        r11 r11Var;
        boolean z2;
        boolean z3;
        float L;
        Canvas canvas2 = canvas;
        if (this.bulletin != null && i != 0) {
            this.background.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredBackgroundHeight() - getPaddingBottom());
            if (isTransitionRunning() && (r11Var = this.delegate) != null) {
                float h = r11Var.h(this.bulletin.a) - getY();
                float measuredHeight = (((View) getParent()).getMeasuredHeight() - getBottomOffset()) - getY();
                if (!z && this.delegate.f(this.bulletin.a)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                canvas2.save();
                if (!z) {
                    canvas2.clipRect(0.0f, h, getMeasuredWidth(), measuredHeight);
                }
                if (!z2 && i == 255) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), i, 31);
                }
                this.background.draw(canvas2);
                super.dispatchDraw(canvas);
                if (z2) {
                    if (this.clipPaint == null) {
                        Paint paint = new Paint(1);
                        this.clipPaint = paint;
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                        this.clipGradient = new LinearGradient(0.0f, 0.0f, 0.0f, hl.L(8.0f), this.top ? new int[]{-16777216, 0} : new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                        Matrix matrix = new Matrix();
                        this.clipMatrix = matrix;
                        this.clipGradient.setLocalMatrix(matrix);
                        this.clipPaint.setShader(this.clipGradient);
                    }
                    canvas2.save();
                    this.clipMatrix.reset();
                    Matrix matrix2 = this.clipMatrix;
                    if (this.top) {
                        L = h;
                    } else {
                        L = measuredHeight - hl.L(8.0f);
                    }
                    matrix2.postTranslate(0.0f, L);
                    this.clipGradient.setLocalMatrix(this.clipMatrix);
                    if (this.top) {
                        canvas2.drawRect(0.0f, h, getWidth(), h + hl.L(8.0f), this.clipPaint);
                        canvas2 = canvas;
                    } else {
                        canvas2 = canvas;
                        canvas2.drawRect(0.0f, measuredHeight - hl.L(8.0f), getWidth(), measuredHeight, this.clipPaint);
                    }
                    canvas2.restore();
                }
                if (z3) {
                    canvas2.restore();
                }
                canvas2.restore();
                invalidate();
                return;
            }
            this.background.draw(canvas2);
            super.dispatchDraw(canvas);
        }
    }

    public void dispatchDrawImplBlur(Canvas canvas, int i) {
        dispatchDrawImpl(canvas, true, i);
    }

    public final void e(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (this.wideScreenWidth != i) {
            this.wideScreenWidth = i;
            z = true;
        } else {
            z = false;
        }
        if (this.wideScreenGravity != i2) {
            this.wideScreenGravity = i2;
        } else {
            z2 = z;
        }
        if (d() && z2) {
            f();
        }
    }

    public final void f() {
        int i;
        int i2 = 80;
        if (this.pillStyle) {
            if (this.top) {
                i2 = 48;
            }
            setLayoutParams(tre.e(-2, -2, i2 | 1));
            return;
        }
        boolean d = d();
        if (d) {
            i = this.wideScreenWidth;
        } else {
            i = -1;
        }
        boolean z = this.top;
        if (d) {
            if (z) {
                i2 = 48;
            }
            i2 |= this.wideScreenGravity;
        } else if (z) {
            i2 = 48;
        }
        setLayoutParams(tre.e(i, -2, i2));
    }

    public CharSequence getAccessibilityText() {
        return null;
    }

    public float getBottomOffset() {
        int i;
        int e;
        r11 r11Var;
        v21 v21Var;
        vpa vpaVar;
        if (this.bulletin != null && (((r11Var = this.delegate) == null || r11Var.d()) && (vpaVar = (v21Var = this.bulletin).d) != null && vpaVar.f)) {
            e = v21Var.p;
        } else {
            r11 r11Var2 = this.delegate;
            if (r11Var2 != null) {
                v21 v21Var2 = this.bulletin;
                if (v21Var2 != null) {
                    i = v21Var2.a;
                } else {
                    i = 0;
                }
                e = r11Var2.e(i);
            } else {
                return 0.0f;
            }
        }
        return e;
    }

    public v21 getBulletin() {
        return this.bulletin;
    }

    public int getMeasuredBackgroundHeight() {
        return getMeasuredHeight();
    }

    public int getThemedColor(int i) {
        return aob.v0(i, this.resourcesProvider);
    }

    public float getTopOffset() {
        int i;
        r11 r11Var = this.delegate;
        if (r11Var != null) {
            v21 v21Var = this.bulletin;
            if (v21Var != null) {
                i = v21Var.a;
            } else {
                i = 0;
            }
            return r11Var.h(i);
        }
        return 0.0f;
    }

    public boolean isAttachedToBulletin() {
        if (this.bulletin != null) {
            return true;
        }
        return false;
    }

    public boolean isTransitionRunning() {
        if (!this.transitionRunningEnter && !this.transitionRunningExit) {
            return false;
        }
        return true;
    }

    public void onAttach(v21 v21Var) {
        this.bulletin = v21Var;
        int size = this.callbacks.size();
        for (int i = 0; i < size; i++) {
            this.callbacks.get(i).d(v21Var);
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        f();
    }

    public void onDetach() {
        this.bulletin = null;
        if (this.glassBackground != null) {
            this.background = this.backgroundBeforeGlass;
            this.backgroundBeforeGlass = null;
            this.glassBackground = null;
            Runnable runnable = this.onGlassBackgroundRemoved;
            this.onGlassBackgroundRemoved = null;
            if (runnable != null) {
                runnable.run();
            }
        }
        int size = this.callbacks.size();
        for (int i = 0; i < size; i++) {
            this.callbacks.get(i).c();
        }
        al0 al0Var = this.blurVisibilityDrawable;
        if (al0Var != null) {
            al0Var.a();
        }
    }

    public void onEnterTransitionEnd() {
        int size = this.callbacks.size();
        for (int i = 0; i < size; i++) {
            this.callbacks.get(i).getClass();
        }
    }

    public void onEnterTransitionStart() {
        int size = this.callbacks.size();
        for (int i = 0; i < size; i++) {
            this.callbacks.get(i).getClass();
        }
    }

    public void onExitTransitionEnd() {
        int size = this.callbacks.size();
        for (int i = 0; i < size; i++) {
            this.callbacks.get(i).getClass();
        }
    }

    public void onExitTransitionStart() {
        int size = this.callbacks.size();
        for (int i = 0; i < size; i++) {
            this.callbacks.get(i).getClass();
        }
    }

    public void onHide() {
        int size = this.callbacks.size();
        for (int i = 0; i < size; i++) {
            this.callbacks.get(i).b();
        }
    }

    public void onShow() {
        int size = this.callbacks.size();
        for (int i = 0; i < size; i++) {
            this.callbacks.get(i).a();
        }
    }

    public void removeCallback(u11 u11Var) {
        this.callbacks.remove(u11Var);
    }

    public void setBackground(int i, int i2) {
        if (!this.hasCustomBackground) {
            this.background = aob.b0(hl.L(i2), i);
            this.backgroundColor = i;
        }
    }

    public void setCustomBackground(Drawable drawable) {
        this.background = drawable;
        this.hasCustomBackground = true;
    }

    public void setGlassBackground(Drawable drawable, Runnable runnable) {
        this.backgroundBeforeGlass = this.background;
        this.background = drawable;
        this.glassBackground = drawable;
        this.onGlassBackgroundRemoved = runnable;
        invalidate();
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void setTop(boolean z) {
        if (this.top != z) {
            this.top = z;
            f();
        }
    }

    public void updateColors() {
        try {
            Drawable drawable = this.background;
            if (drawable != null && drawable == this.themeBackground && (drawable instanceof ShapeDrawable)) {
                ((ShapeDrawable) drawable).getPaint().setColor(getThemedColor(aob.wj));
                invalidate();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public void updatePosition() {
        int i;
        int i2;
        r11 r11Var = this.delegate;
        float f = 0.0f;
        if (r11Var != null) {
            if (this.top) {
                v21 v21Var = this.bulletin;
                if (v21Var != null) {
                    i2 = v21Var.a;
                } else {
                    i2 = 0;
                }
                f = 0.0f - r11Var.h(i2);
            } else {
                f = 0.0f + getBottomOffset();
            }
        }
        float f2 = -f;
        float f3 = this.inOutOffset;
        if (this.top) {
            i = -1;
        } else {
            i = 1;
        }
        setTranslationY((f3 * i) + f2);
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        if (this.background != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void setBackground(int i) {
        setBackground(i, 16);
    }

    public void addColorKeys(HashSet hashSet) {
    }
}
