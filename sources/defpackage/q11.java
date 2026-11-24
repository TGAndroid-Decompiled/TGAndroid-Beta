package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
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
public abstract class q11 extends FrameLayout implements tjb {
    public static final ri4 IN_OUT_OFFSET_Y = new k11((byte) 0);
    public static final Property<q11, Float> IN_OUT_OFFSET_Y2 = new pm("offsetY", (byte) 5);
    Drawable background;
    private Drawable backgroundBeforeGlass;
    private int backgroundColor;
    private zk0 blurVisibilityDrawable;
    protected m21 bulletin;
    private final List<l11> callbacks;
    private LinearGradient clipGradient;
    private Matrix clipMatrix;
    private Paint clipPaint;
    i11 delegate;
    private Drawable glassBackground;
    private boolean hasCustomBackground;
    public float inOutOffset;
    public View.OnClickListener onClickListener;
    private Runnable onGlassBackgroundRemoved;
    private boolean pillStyle;
    private final wjb resourcesProvider;
    private Drawable themeBackground;
    public boolean top;
    public boolean transitionRunningEnter;
    public boolean transitionRunningExit;
    private int wideScreenGravity;
    private int wideScreenWidth;

    public q11(Context context, wjb wjbVar) {
        super(context);
        this.callbacks = new ArrayList();
        this.wideScreenWidth = -2;
        this.wideScreenGravity = 1;
        this.resourcesProvider = wjbVar;
        setMinimumHeight(gl.L(48.0f));
        setBackground(getThemedColor(bkb.vj));
        this.themeBackground = this.background;
        b();
        setPadding(gl.L(16.0f), gl.L(8.0f), gl.L(16.0f), gl.L(8.0f));
        setWillNotDraw(false);
        ote.b(this, 0.02f, 1.5f);
    }

    public static boolean a() {
        if (!gl.O1()) {
            Point point = gl.q;
            if (point.x < point.y) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static void access$000(q11 q11Var, int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (q11Var.wideScreenWidth != i) {
            q11Var.wideScreenWidth = i;
            z = true;
        } else {
            z = false;
        }
        if (q11Var.wideScreenGravity != i2) {
            q11Var.wideScreenGravity = i2;
        } else {
            z2 = z;
        }
        if (a() && z2) {
            q11Var.b();
        }
    }

    public static boolean access$1600(q11 q11Var, boolean z) {
        q11Var.getClass();
        if (a() && q11Var.wideScreenWidth != -1) {
            int i = q11Var.wideScreenGravity;
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
        m21 m21Var = this.bulletin;
        if (m21Var != null && m21Var.k) {
            invalidate();
        }
    }

    public void addCallback(l11 l11Var) {
        this.callbacks.add(l11Var);
    }

    public final void b() {
        int i;
        int i2 = 80;
        if (this.pillStyle) {
            if (this.top) {
                i2 = 48;
            }
            setLayoutParams(nme.e(-2, -2, i2 | 1));
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
        setLayoutParams(nme.e(i, -2, i2));
    }

    public boolean canHaveGlassBackground() {
        if (!this.hasCustomBackground && this.glassBackground == null && this.backgroundColor == getThemedColor(bkb.vj)) {
            return true;
        }
        return false;
    }

    public p11 createTransition() {
        return new i2f((byte) 14);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        m21 m21Var = this.bulletin;
        if (m21Var != null && m21Var.k) {
            zk0 zk0Var = this.blurVisibilityDrawable;
            if (zk0Var == null) {
                zk0Var = new zk0(new sg0(this, (byte) 17));
                this.blurVisibilityDrawable = zk0Var;
            }
            if (zk0Var.c == null) {
                zk0Var.a(getMeasuredWidth(), getMeasuredHeight(), 6.0f, gl.L(10.0f));
            }
            this.blurVisibilityDrawable.i = moe.b((int) de9.e(this.inOutOffset, getMeasuredHeight(), 1.0f, 255.0f), 0, 255);
            this.blurVisibilityDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.blurVisibilityDrawable.draw(canvas);
            return;
        }
        dispatchDrawImpl(canvas, false, 255);
    }

    public void dispatchDrawImpl(Canvas canvas, boolean z, int i) {
        i11 i11Var;
        boolean z2;
        boolean z3;
        float L;
        Canvas canvas2 = canvas;
        if (this.bulletin != null && i != 0) {
            this.background.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredBackgroundHeight() - getPaddingBottom());
            if (isTransitionRunning() && (i11Var = this.delegate) != null) {
                float h = i11Var.h(this.bulletin.a) - getY();
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
                        this.clipGradient = new LinearGradient(0.0f, 0.0f, 0.0f, gl.L(8.0f), this.top ? new int[]{-16777216, 0} : new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
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
                        L = measuredHeight - gl.L(8.0f);
                    }
                    matrix2.postTranslate(0.0f, L);
                    this.clipGradient.setLocalMatrix(this.clipMatrix);
                    if (this.top) {
                        canvas2.drawRect(0.0f, h, getWidth(), h + gl.L(8.0f), this.clipPaint);
                        canvas2 = canvas;
                    } else {
                        canvas2 = canvas;
                        canvas2.drawRect(0.0f, measuredHeight - gl.L(8.0f), getWidth(), measuredHeight, this.clipPaint);
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
        byte b;
        int e;
        i11 i11Var;
        m21 m21Var;
        yla ylaVar;
        if (this.bulletin != null && (((i11Var = this.delegate) == null || i11Var.d()) && (ylaVar = (m21Var = this.bulletin).d) != null && ylaVar.f)) {
            e = m21Var.o;
        } else {
            i11 i11Var2 = this.delegate;
            if (i11Var2 != null) {
                m21 m21Var2 = this.bulletin;
                if (m21Var2 != null) {
                    b = m21Var2.a;
                } else {
                    b = 0;
                }
                e = i11Var2.e(b);
            } else {
                return 0.0f;
            }
        }
        return e;
    }

    public m21 getBulletin() {
        return this.bulletin;
    }

    public int getMeasuredBackgroundHeight() {
        return getMeasuredHeight();
    }

    public int getThemedColor(int i) {
        return bkb.v0(i, this.resourcesProvider);
    }

    public float getTopOffset() {
        byte b;
        i11 i11Var = this.delegate;
        if (i11Var != null) {
            m21 m21Var = this.bulletin;
            if (m21Var != null) {
                b = m21Var.a;
            } else {
                b = 0;
            }
            return i11Var.h(b);
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

    public void onAttach(m21 m21Var) {
        this.bulletin = m21Var;
        int size = this.callbacks.size();
        for (int i = 0; i < size; i++) {
            this.callbacks.get(i).d(m21Var);
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    public void onDetach() {
        Bitmap bitmap;
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
        zk0 zk0Var = this.blurVisibilityDrawable;
        if (zk0Var != null && (bitmap = zk0Var.c) != null) {
            bitmap.recycle();
            zk0Var.c = null;
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

    public void removeCallback(l11 l11Var) {
        this.callbacks.remove(l11Var);
    }

    public void setBackground(int i, int i2) {
        if (!this.hasCustomBackground) {
            this.background = bkb.b0(gl.L(i2), i);
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
                ((ShapeDrawable) drawable).getPaint().setColor(getThemedColor(bkb.vj));
                invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public void updatePosition() {
        int i;
        byte b;
        i11 i11Var = this.delegate;
        float f = 0.0f;
        if (i11Var != null) {
            if (this.top) {
                m21 m21Var = this.bulletin;
                if (m21Var != null) {
                    b = m21Var.a;
                } else {
                    b = 0;
                }
                f = 0.0f - i11Var.h(b);
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
