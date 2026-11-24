package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.Components.FragmentContextView;
public class fj3 extends om implements tjb {
    public FragmentContextView E;
    public boolean F;
    public boolean G;
    public il0 s;
    public final Path w;
    public final RectF x;
    public int y;

    public fj3(Context context) {
        super(context);
        this.w = new Path();
        this.x = new RectF();
        this.y = 24;
        setOrientation(1);
        updateColors();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean z;
        int currentStyle;
        FragmentContextView fragmentContextView;
        Canvas canvas2 = canvas;
        if (getMetadata().c.a != 0.0f) {
            il0 il0Var = this.s;
            if (il0Var != null) {
                il0Var.draw(canvas2);
            }
            FragmentContextView fragmentContextView2 = this.E;
            x46 x46Var = this.c;
            View view = null;
            if (fragmentContextView2 != null && ((currentStyle = fragmentContextView2.getCurrentStyle()) == 3 || currentStyle == 1)) {
                int entriesCount = getEntriesCount();
                for (int i = 0; i < entriesCount; i++) {
                    u46 i2 = x46Var.i(i);
                    float paddingTop = getPaddingTop() + i2.b().top;
                    View view2 = ((nm) i2.a).a;
                    float c = i2.c();
                    if (c > 0.0f && (fragmentContextView = this.E) != null && (fragmentContextView == view2 || fragmentContextView.getParent() == view2)) {
                        ua1 capsuleBlobDrawable = this.E.getCapsuleBlobDrawable();
                        int L = gl.L(1.0f) + ((int) capsuleBlobDrawable.d());
                        int i3 = -L;
                        capsuleBlobDrawable.setBounds(getPaddingLeft() - L, i3, (getMeasuredWidth() - getPaddingRight()) + L, gl.L(36.0f) + (L << 1) + i3);
                        capsuleBlobDrawable.setAlpha((int) (c * 255.0f));
                        canvas2.save();
                        canvas2.translate(0.0f, paddingTop);
                        capsuleBlobDrawable.draw(canvas2);
                        canvas2.restore();
                        view = view2;
                    }
                }
            }
            View view3 = view;
            canvas2.save();
            canvas2.clipPath(this.w);
            int entriesCount2 = getEntriesCount();
            int i4 = 0;
            while (i4 < entriesCount2) {
                u46 i5 = x46Var.i(i4);
                float paddingTop2 = getPaddingTop() + i5.b().top;
                View view4 = ((nm) i5.a).a;
                float min = Math.min(1.0f, i5.c.a) * i5.c();
                if (min > 0.0f && view3 != view4) {
                    int alpha = bkb.j0.getAlpha();
                    bkb.j0.setAlpha((int) (alpha * min));
                    float f = 1.0f - min;
                    canvas2.drawLine(getPaddingLeft() + (gl.L(16.0f) * f), paddingTop2, getWidth() - ((gl.L(16.0f) * f) + getPaddingRight()), paddingTop2, bkb.j0);
                    bkb.j0.setAlpha(alpha);
                }
                i4++;
                canvas2 = canvas;
            }
            if (view3 != null) {
                z = true;
            } else {
                z = false;
            }
            this.F = z;
            this.G = false;
            super.dispatchDraw(canvas);
            canvas.restore();
            if (view3 != null) {
                this.G = true;
                this.F = false;
                super.dispatchDraw(canvas);
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        il0 il0Var;
        if (!super.dispatchTouchEvent(motionEvent)) {
            if (motionEvent.getAction() != 0 || (il0Var = this.s) == null || !il0Var.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        FragmentContextView fragmentContextView = this.E;
        if (fragmentContextView != null && (fragmentContextView == view || fragmentContextView.getParent() == view)) {
            if (this.F) {
                return false;
            }
        } else if (this.G) {
            return false;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void f() {
        k();
        invalidate();
    }

    public final void k() {
        float f = getMetadata().g.a;
        float f2 = getMetadata().c.a;
        RectF rectF = this.x;
        rectF.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getPaddingTop() + f);
        float min = Math.min(gl.L(this.y), Math.min(rectF.width(), rectF.height()) / 2.0f);
        Path path = this.w;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        il0 il0Var = this.s;
        if (il0Var != null) {
            il0Var.setAlpha((int) (f2 * 255.0f));
            this.s.setBounds(gl.L(4.0f), gl.L(14.0f), getMeasuredWidth() - gl.L(4.0f), ((getPaddingBottom() + getPaddingTop()) + ((int) f)) - gl.L(14.0f));
            this.s.r(Math.min(gl.L(this.y), f / 2.0f));
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        k();
    }

    public void setBlurredBackground(il0 il0Var) {
        this.s = il0Var;
    }

    public void setCallFragmentContextView(FragmentContextView fragmentContextView) {
        this.E = fragmentContextView;
        fragmentContextView.getCapsuleBlobDrawable().setCallback(this);
    }

    public void setDefaultRadiusDp(int i) {
        this.y = i;
    }

    @Override
    public final void updateColors() {
        il0 il0Var = this.s;
        if (il0Var != null) {
            il0Var.updateColors();
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            FragmentContextView fragmentContextView = this.E;
            if (fragmentContextView == null || fragmentContextView.getCapsuleBlobDrawable() != drawable) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
