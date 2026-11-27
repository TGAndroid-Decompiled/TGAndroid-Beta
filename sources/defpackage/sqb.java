package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import org.telegram.ui.ActionBar.e;
public class sqb extends LinearLayout {
    public final s8b E;
    public Drawable F;
    public boolean G;
    public final mm H;
    public xd0 a;
    public xd0 b;
    public Drawable c;
    public Drawable d;
    public ColorDrawable e;
    public boolean f;
    public boolean h;
    public final wb2[] n;
    public final Drawable r;
    public final wk5 s;
    public final int w;
    public e x;
    public int y;

    public sqb(android.content.Context r25, defpackage.wk5 r26, int r27, long r28, defpackage.vnb r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sqb.<init>(android.content.Context, wk5, int, long, vnb):void");
    }

    private Drawable getCompactBackground() {
        int w0 = aob.w0(null, aob.ua, false);
        ColorDrawable colorDrawable = this.e;
        if (colorDrawable == null || colorDrawable.getColor() != w0) {
            this.e = new ColorDrawable(w0);
        }
        return this.e;
    }

    public final boolean a() {
        int i = this.w;
        if (i != 3 && i != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.w != 2 && !a()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public wb2[] getCells() {
        return this.n;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        int i = 0;
        while (true) {
            wb2[] wb2VarArr = this.n;
            if (i < wb2VarArr.length) {
                wb2VarArr[i].invalidate();
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.F;
        if (drawable instanceof g82) {
            ((g82) drawable).f(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        xd0 xd0Var = this.a;
        if (xd0Var != null) {
            xd0Var.dispose();
            this.a = null;
        }
        xd0 xd0Var2 = this.b;
        if (xd0Var2 != null) {
            xd0Var2.dispose();
            this.b = null;
        }
        Drawable drawable = this.F;
        if (drawable instanceof g82) {
            ((g82) drawable).g(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z;
        float e;
        Drawable drawable;
        int i;
        boolean z2;
        Drawable drawable2 = this.F;
        if (drawable2 == null) {
            drawable2 = aob.s0();
        }
        if (aob.d != null) {
            invalidate();
        }
        if (this.F == null && xea.D0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            drawable2 = getCompactBackground();
        }
        if (this.f != z) {
            this.f = z;
            if (this.c != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.h = z2;
        }
        Drawable drawable3 = this.c;
        mm mmVar = this.H;
        if (drawable2 != drawable3 && drawable2 != null) {
            if (!aob.f1() && !this.G && !this.h) {
                xd0 xd0Var = this.a;
                if (xd0Var != null) {
                    xd0Var.dispose();
                    this.a = null;
                }
            } else {
                this.d = this.c;
                this.b = this.a;
            }
            this.c = drawable2;
            mmVar.e(true, 0.0f);
        }
        boolean z3 = this.G;
        wk5 wk5Var = this.s;
        if (!z3 && !this.h) {
            e = wk5Var.getThemeAnimationValue();
        } else {
            e = mmVar.e(false, 1.0f);
        }
        for (int i2 = 0; i2 < 2; i2++) {
            if (i2 == 0) {
                drawable = this.d;
            } else {
                drawable = this.c;
            }
            if (drawable != null) {
                if (i2 == 1 && this.d != null && (wk5Var != null || this.G)) {
                    i = (int) (255.0f * e);
                } else {
                    i = 255;
                }
                if (i > 0) {
                    drawable.setAlpha(i);
                    if (!(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable) && !(drawable instanceof ih7)) {
                        if (drawable instanceof BitmapDrawable) {
                            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                            bitmapDrawable.setFilterBitmap(true);
                            if (bitmapDrawable.getTileModeX() == Shader.TileMode.REPEAT) {
                                canvas.save();
                                float f = 2.0f / hl.p;
                                canvas.scale(f, f);
                                drawable.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f), (int) Math.ceil(getMeasuredHeight() / f));
                            } else {
                                int measuredHeight = getMeasuredHeight();
                                float max = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), measuredHeight / drawable.getIntrinsicHeight());
                                int ceil = (int) Math.ceil(drawable.getIntrinsicWidth() * max);
                                int ceil2 = (int) Math.ceil(drawable.getIntrinsicHeight() * max);
                                int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                                int i3 = (measuredHeight - ceil2) / 2;
                                canvas.save();
                                canvas.clipRect(0, 0, ceil, getMeasuredHeight());
                                drawable.setBounds(measuredWidth, i3, ceil + measuredWidth, ceil2 + i3);
                            }
                            drawable.draw(canvas);
                            canvas.restore();
                        } else {
                            c8b.j(canvas, drawable, getWidth(), getHeight());
                        }
                    } else {
                        drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                        if (drawable instanceof yd0) {
                            this.a = ((yd0) drawable).b(canvas, this);
                        } else {
                            drawable.draw(canvas);
                        }
                    }
                    if (i2 == 0 && this.d != null && e >= 1.0f) {
                        xd0 xd0Var2 = this.b;
                        if (xd0Var2 != null) {
                            xd0Var2.dispose();
                            this.b = null;
                        }
                        this.d = null;
                        this.h = false;
                        invalidate();
                    }
                }
            }
        }
        if ((getParent() instanceof d79) && ((d79) getParent()).d1()) {
            return;
        }
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        Drawable drawable4 = this.r;
        drawable4.setBounds(0, 0, measuredWidth2, measuredHeight2);
        drawable4.draw(canvas);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.w != 2 && !a()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.w != 2 && !a()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOverrideBackground(Drawable drawable) {
        this.F = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        if ((this.F instanceof g82) && isAttachedToWindow()) {
            ((g82) this.F).f(this);
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.F && drawable != this.d && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void dispatchSetPressed(boolean z) {
    }

    public sqb(Context context, wk5 wk5Var, int i) {
        this(context, wk5Var, i, 0L, null);
    }
}
