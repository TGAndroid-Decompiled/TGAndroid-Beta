package defpackage;

import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class hn4 extends FrameLayout implements vlb {
    public float E;
    public boolean F;
    public ValueAnimator G;
    public wi2 H;
    public int I;
    public boolean J;
    public Paint a;
    public ho b;
    public ho c;
    public float d;
    public ln e;
    public View f;
    public ShapeDrawable h;
    public float n;
    public boolean r;
    public ValueAnimator s;
    public float w;
    public ValueAnimator x;
    public int y;

    public final void a(boolean z) {
        float f;
        if (this.r != z) {
            ValueAnimator valueAnimator = this.s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.s = null;
            }
            float f2 = this.n;
            this.r = z;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
            this.s = ofFloat;
            ofFloat.addUpdateListener(new fn4(this, (byte) 2));
            this.s.addListener(new jf4((byte) 2, this, z));
            this.s.setDuration(320L);
            this.s.setInterpolator(d53.h);
            this.s.start();
        }
    }

    public final void b(CharSequence charSequence, boolean z) {
        ho hoVar = this.b;
        if (z) {
            hoVar.a();
        }
        hoVar.t(charSequence, z, true);
        invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z;
        Paint paint = this.a;
        ho hoVar = this.c;
        ho hoVar2 = this.b;
        this.f.draw(canvas);
        if (this.n > 0.0f) {
            if (this.H == null) {
                this.H = new wi2(hoVar2.a.getColor());
            }
            int L = (int) ((1.0f - this.n) * gm.L(24.0f));
            this.H.setBounds(0, L, getWidth(), getHeight() + L);
            this.H.setAlpha((int) (this.n * 255.0f));
            this.H.draw(canvas);
            invalidate();
        }
        float f = this.n;
        if (f < 1.0f) {
            if (f != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, (int) (this.n * gm.L(-24.0f)));
                canvas.scale(1.0f, 1.0f - (this.n * 0.4f));
                z = true;
            } else {
                z = false;
            }
            float c = hoVar2.c();
            float e = this.e.e(false, this.d);
            float c2 = ((hoVar.c() + gm.L(15.66f)) * e) + c;
            Rect rect = gm.Q;
            rect.set((int) (((getMeasuredWidth() - c2) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - hoVar2.e) / 2.0f) - gm.L(1.0f)), (int) td4.e(getMeasuredWidth() - c2, getWidth(), 2.0f, c), (int) (((getMeasuredHeight() + hoVar2.e) / 2.0f) - gm.L(1.0f)));
            hoVar2.C = (int) (gm.R1(0.5f, 1.0f, this.E) * (1.0f - this.n) * 255.0f);
            hoVar2.setBounds(rect);
            hoVar2.draw(canvas);
            rect.set((int) (aq1.z(getMeasuredWidth(), c2, 2.0f, c) + gm.L(5.0f)), (int) ((getMeasuredHeight() - gm.L(18.0f)) / 2.0f), (int) (Math.max(gm.L(9.0f), hoVar.c()) + aq1.z(getMeasuredWidth(), c2, 2.0f, c) + gm.L(13.0f)), (int) ((gm.L(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = gm.P;
            rectF.set(rect);
            if (this.w != 1.0f) {
                canvas.save();
                float f2 = this.w;
                canvas.scale(f2, f2, rect.centerX(), rect.centerY());
            }
            paint.setAlpha((int) ((1.0f - this.n) * 255.0f * e * e));
            canvas.drawRoundRect(rectF, gm.L(10.0f), gm.L(10.0f), paint);
            rect.offset(-gm.L(0.3f), -gm.L(0.4f));
            hoVar.C = (int) td4.z(1.0f, this.n, 255.0f, e);
            hoVar.setBounds(rect);
            hoVar.draw(canvas);
            if (this.w != 1.0f) {
                canvas.restore();
            }
            if (z) {
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
        StringBuilder sb = new StringBuilder();
        sb.append((Object) this.b.i);
        if (this.y > 0) {
            str = ", ".concat(jb6.G(this.y, "Chats", new Object[0]));
        } else {
            str = "";
        }
        sb.append(str);
        accessibilityNodeInfo.setContentDescription(sb.toString());
    }

    @Override
    public final void setEnabled(boolean z) {
        float f;
        if (this.F != z) {
            ValueAnimator valueAnimator = this.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.G = null;
            }
            float f2 = this.E;
            this.F = z;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new fn4(this, (byte) 0));
            this.G.addListener(new AnimatorListenerAdapter());
            this.G.start();
        }
    }

    @Override
    public final void updateColors() {
        ShapeDrawable shapeDrawable = this.h;
        ho hoVar = this.b;
        Paint paint = this.a;
        if (paint != null && hoVar != null) {
            int i = cmb.Ei;
            int w0 = cmb.w0(null, i, false);
            if (w0 != this.I || this.J != cmb.I.o()) {
                this.I = w0;
                this.J = cmb.I.o();
                View view = this.f;
                if (view != null) {
                    view.setBackground(ulb.d(0, ulb.b(w0), 8.0f));
                }
                if (shapeDrawable != null) {
                    shapeDrawable.getPaint().setColor(w0);
                    shapeDrawable.invalidateSelf();
                }
            }
            int i2 = cmb.Ii;
            paint.setColor(cmb.w0(null, i2, false));
            hoVar.u(cmb.w0(null, i2, false));
            try {
                ho hoVar2 = this.c;
                if (hoVar2 != null) {
                    hoVar2.u(cmb.w0(null, i, false));
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.b != drawable && this.c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
