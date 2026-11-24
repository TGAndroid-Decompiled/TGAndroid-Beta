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
public abstract class y21 extends FrameLayout implements vlb {
    public static final vk4 IN_OUT_OFFSET_Y = new s21((byte) 0);
    public static final Property<y21, Float> IN_OUT_OFFSET_Y2 = new pn("offsetY", (byte) 5);
    Drawable background;
    private Drawable backgroundBeforeGlass;
    private int backgroundColor;
    private zl0 blurVisibilityDrawable;
    protected u31 bulletin;
    private final List<t21> callbacks;
    private LinearGradient clipGradient;
    private Matrix clipMatrix;
    private Paint clipPaint;
    q21 delegate;
    private Drawable glassBackground;
    private boolean hasCustomBackground;
    public float inOutOffset;
    public View.OnClickListener onClickListener;
    private Runnable onGlassBackgroundRemoved;
    private boolean pillStyle;
    private final ylb resourcesProvider;
    private Drawable themeBackground;
    public boolean top;
    public boolean transitionRunningEnter;
    public boolean transitionRunningExit;
    private int wideScreenGravity;
    private int wideScreenWidth;

    public y21(Context context, ylb ylbVar) {
        super(context);
        this.callbacks = new ArrayList();
        this.wideScreenWidth = -2;
        this.wideScreenGravity = 1;
        this.resourcesProvider = ylbVar;
        setMinimumHeight(gm.L(48.0f));
        setBackground(getThemedColor(cmb.vj));
        this.themeBackground = this.background;
        b();
        setPadding(gm.L(16.0f), gm.L(8.0f), gm.L(16.0f), gm.L(8.0f));
        setWillNotDraw(false);
        rve.b(this, 0.02f, 1.5f);
    }

    public static boolean a() {
        if (!gm.O1()) {
            Point point = gm.q;
            if (point.x < point.y) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static void access$000(y21 y21Var, int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (y21Var.wideScreenWidth != i) {
            y21Var.wideScreenWidth = i;
            z = true;
        } else {
            z = false;
        }
        if (y21Var.wideScreenGravity != i2) {
            y21Var.wideScreenGravity = i2;
        } else {
            z2 = z;
        }
        if (a() && z2) {
            y21Var.b();
        }
    }

    public static boolean access$1600(y21 y21Var, boolean z) {
        y21Var.getClass();
        if (a() && y21Var.wideScreenWidth != -1) {
            int i = y21Var.wideScreenGravity;
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

    public void setInOutOffset(float f) {
        this.inOutOffset = f;
        updatePosition();
        u31 u31Var = this.bulletin;
        if (u31Var != null && u31Var.k) {
            invalidate();
        }
    }

    public void addCallback(t21 t21Var) {
        this.callbacks.add(t21Var);
    }

    public final void b() {
        int i;
        int i2 = 80;
        if (this.pillStyle) {
            if (this.top) {
                i2 = 48;
            }
            setLayoutParams(qoe.e(-2, -2, i2 | 1));
            return;
        }
        boolean a = a();
        if (a) {
            i = this.wideScreenWidth;
        } else {
            i = -1;
        }
        boolean z = this.top;
        if (a) {
            if (z) {
                i2 = 48;
            }
            i2 |= this.wideScreenGravity;
        } else if (z) {
            i2 = 48;
        }
        setLayoutParams(qoe.e(i, -2, i2));
    }

    public boolean canHaveGlassBackground() {
        if (!this.hasCustomBackground && this.glassBackground == null && this.backgroundColor == getThemedColor(cmb.vj)) {
            return true;
        }
        return false;
    }

    public x21 createTransition() {
        return new k4f((byte) 14);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        u31 u31Var = this.bulletin;
        if (u31Var != null && u31Var.k) {
            zl0 zl0Var = this.blurVisibilityDrawable;
            if (zl0Var == null) {
                zl0Var = new zl0(new xg0(this, (byte) 20));
                this.blurVisibilityDrawable = zl0Var;
            }
            zl0 zl0Var2 = zl0Var;
            if (zl0Var.c == null) {
                zl0Var2.b(getMeasuredWidth(), getMeasuredHeight(), 6.0f, gm.L(10.0f));
            }
            this.blurVisibilityDrawable.i = pqe.b((int) hg9.e(this.inOutOffset, getMeasuredHeight(), 1.0f, 255.0f), 0, 255);
            this.blurVisibilityDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.blurVisibilityDrawable.draw(canvas);
            return;
        }
        dispatchDrawImpl(canvas, false, 255);
    }

    public void dispatchDrawImpl(Canvas canvas, boolean z, int i) {
        q21 q21Var;
        boolean z2;
        boolean z3;
        float L;
        Canvas canvas2 = canvas;
        if (this.bulletin != null && i != 0) {
            this.background.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredBackgroundHeight() - getPaddingBottom());
            if (isTransitionRunning() && (q21Var = this.delegate) != null) {
                float h = q21Var.h(this.bulletin.a) - getY();
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
                        this.clipGradient = new LinearGradient(0.0f, 0.0f, 0.0f, gm.L(8.0f), this.top ? new int[]{-16777216, 0} : new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
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
                        L = measuredHeight - gm.L(8.0f);
                    }
                    matrix2.postTranslate(0.0f, L);
                    this.clipGradient.setLocalMatrix(this.clipMatrix);
                    if (this.top) {
                        canvas2.drawRect(0.0f, h, getWidth(), h + gm.L(8.0f), this.clipPaint);
                        canvas2 = canvas;
                    } else {
                        canvas2 = canvas;
                        canvas2.drawRect(0.0f, measuredHeight - gm.L(8.0f), getWidth(), measuredHeight, this.clipPaint);
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

    public CharSequence getAccessibilityText() {
        return null;
    }

    public float getBottomOffset() {
        int i;
        int e;
        q21 q21Var;
        u31 u31Var;
        zna znaVar;
        if (this.bulletin != null && (((q21Var = this.delegate) == null || q21Var.d()) && (znaVar = (u31Var = this.bulletin).d) != null && znaVar.f)) {
            e = u31Var.p;
        } else {
            q21 q21Var2 = this.delegate;
            if (q21Var2 != null) {
                u31 u31Var2 = this.bulletin;
                if (u31Var2 != null) {
                    i = u31Var2.a;
                } else {
                    i = 0;
                }
                e = q21Var2.e(i);
            } else {
                return 0.0f;
            }
        }
        return e;
    }

    public u31 getBulletin() {
        return this.bulletin;
    }

    public int getMeasuredBackgroundHeight() {
        return getMeasuredHeight();
    }

    public int getThemedColor(int i) {
        return cmb.v0(i, this.resourcesProvider);
    }

    public float getTopOffset() {
        int i;
        q21 q21Var = this.delegate;
        if (q21Var != null) {
            u31 u31Var = this.bulletin;
            if (u31Var != null) {
                i = u31Var.a;
            } else {
                i = 0;
            }
            return q21Var.h(i);
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

    public void onAttach(u31 u31Var) {
        this.bulletin = u31Var;
        int size = this.callbacks.size();
        for (int i = 0; i < size; i++) {
            this.callbacks.get(i).d(u31Var);
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
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
        zl0 zl0Var = this.blurVisibilityDrawable;
        if (zl0Var != null) {
            zl0Var.a();
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

    public void removeCallback(t21 t21Var) {
        this.callbacks.remove(t21Var);
    }

    public void setBackground(int i, int i2) {
        if (!this.hasCustomBackground) {
            this.background = cmb.b0(gm.L(i2), i);
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
            b();
        }
    }

    public void updateColors() {
        try {
            Drawable drawable = this.background;
            if (drawable != null && drawable == this.themeBackground && (drawable instanceof ShapeDrawable)) {
                ((ShapeDrawable) drawable).getPaint().setColor(getThemedColor(cmb.vj));
                invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public void updatePosition() {
        int i;
        int i2;
        q21 q21Var = this.delegate;
        float f = 0.0f;
        if (q21Var != null) {
            if (this.top) {
                u31 u31Var = this.bulletin;
                if (u31Var != null) {
                    i2 = u31Var.a;
                } else {
                    i2 = 0;
                }
                f = 0.0f - q21Var.h(i2);
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
