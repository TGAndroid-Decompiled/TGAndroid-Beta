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
import org.telegram.ui.ActionBar.d;
public class tmb extends LinearLayout {
    public final cib E;
    public Drawable F;
    public boolean G;
    public final lm H;
    public vd0 a;
    public vd0 b;
    public Drawable c;
    public Drawable d;
    public ColorDrawable e;
    public boolean f;
    public boolean h;
    public final gb2[] n;
    public final Drawable r;
    public final ui5 s;
    public final int w;
    public d x;
    public int y;

    public tmb(android.content.Context r25, defpackage.ui5 r26, int r27, long r28, defpackage.wjb r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tmb.<init>(android.content.Context, ui5, int, long, wjb):void");
    }

    private Drawable getCompactBackground() {
        int w0 = bkb.w0(null, bkb.ta, false);
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

    public gb2[] getCells() {
        return this.n;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        int i = 0;
        while (true) {
            gb2[] gb2VarArr = this.n;
            if (i < gb2VarArr.length) {
                gb2VarArr[i].invalidate();
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
        if (drawable instanceof p72) {
            ((p72) drawable).f(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        vd0 vd0Var = this.a;
        if (vd0Var != null) {
            vd0Var.dispose();
            this.a = null;
        }
        vd0 vd0Var2 = this.b;
        if (vd0Var2 != null) {
            vd0Var2.dispose();
            this.b = null;
        }
        Drawable drawable = this.F;
        if (drawable instanceof p72) {
            ((p72) drawable).g(this);
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
            drawable2 = bkb.s0();
        }
        if (bkb.d != null) {
            invalidate();
        }
        if (this.F == null && gba.D0) {
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
        lm lmVar = this.H;
        if (drawable2 != drawable3 && drawable2 != null) {
            if (!bkb.f1() && !this.G && !this.h) {
                vd0 vd0Var = this.a;
                if (vd0Var != null) {
                    vd0Var.dispose();
                    this.a = null;
                }
            } else {
                this.d = this.c;
                this.b = this.a;
            }
            this.c = drawable2;
            lmVar.e(true, 0.0f);
        }
        boolean z3 = this.G;
        ui5 ui5Var = this.s;
        if (!z3 && !this.h) {
            e = ui5Var.getThemeAnimationValue();
        } else {
            e = lmVar.e(false, 1.0f);
        }
        for (int i2 = 0; i2 < 2; i2++) {
            if (i2 == 0) {
                drawable = this.d;
            } else {
                drawable = this.c;
            }
            if (drawable != null) {
                if (i2 == 1 && this.d != null && (ui5Var != null || this.G)) {
                    i = (int) (255.0f * e);
                } else {
                    i = 255;
                }
                if (i > 0) {
                    drawable.setAlpha(i);
                    if (!(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable) && !(drawable instanceof ye7)) {
                        if (drawable instanceof BitmapDrawable) {
                            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                            bitmapDrawable.setFilterBitmap(true);
                            if (bitmapDrawable.getTileModeX() == Shader.TileMode.REPEAT) {
                                canvas.save();
                                float f = 2.0f / gl.p;
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
                            f4b.j(canvas, drawable, getWidth(), getHeight());
                        }
                    } else {
                        drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                        if (drawable instanceof wd0) {
                            this.a = ((wd0) drawable).b(canvas, this);
                        } else {
                            drawable.draw(canvas);
                        }
                    }
                    if (i2 == 0 && this.d != null && e >= 1.0f) {
                        vd0 vd0Var2 = this.b;
                        if (vd0Var2 != null) {
                            vd0Var2.dispose();
                            this.b = null;
                        }
                        this.d = null;
                        this.h = false;
                        invalidate();
                    }
                }
            }
        }
        if ((getParent() instanceof o39) && ((o39) getParent()).c1()) {
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
        if ((this.F instanceof p72) && isAttachedToWindow()) {
            ((p72) this.F).f(this);
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

    public tmb(Context context, ui5 ui5Var, int i) {
        this(context, ui5Var, i, 0L, null);
    }
}
