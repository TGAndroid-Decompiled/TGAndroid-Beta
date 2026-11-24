package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public abstract class tib extends View {
    public int E;
    public boolean F;
    public float G;
    public Animator H;
    public cib I;
    public boolean J;
    public Path K;
    public StaticLayout a;
    public TextPaint b;
    public Paint c;
    public int d;
    public OvershootInterpolator e;
    public float f;
    public int h;
    public int n;
    public int r;
    public float s;
    public float w;
    public int x;
    public int y;

    public static void b(Path path, float f, float f2, float f3, float f4, float f5, float f6, boolean z, boolean z2) {
        path.reset();
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        float f7 = f3 - f;
        float f8 = f4 - f2;
        float f9 = f7 / 2.0f;
        if (f5 > f9) {
            f5 = f9;
        }
        float f10 = f8 / 2.0f;
        if (f6 > f10) {
            f6 = f10;
        }
        float f11 = f7 - (f5 * 2.0f);
        float f12 = f8 - (2.0f * f6);
        path.moveTo(f3, f2 + f6);
        float f13 = -f6;
        if (z2) {
            path.rQuadTo(0.0f, f13, -f5, f13);
        } else {
            path.rLineTo(0.0f, f13);
            path.rLineTo(-f5, 0.0f);
        }
        path.rLineTo(-f11, 0.0f);
        float f14 = -f5;
        if (z) {
            path.rQuadTo(f14, 0.0f, f14, f6);
        } else {
            path.rLineTo(f14, 0.0f);
            path.rLineTo(0.0f, f6);
        }
        path.rLineTo(0.0f, f12);
        path.rLineTo(0.0f, f6);
        path.rLineTo(f5, 0.0f);
        path.rLineTo(f11, 0.0f);
        path.rLineTo(f5, 0.0f);
        path.rLineTo(0.0f, -f6);
        path.rLineTo(0.0f, -f12);
        path.close();
    }

    public final void a() {
        Animator animator = this.H;
        if (animator != null) {
            animator.removeAllListeners();
            this.H.cancel();
        }
        this.F = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, 0.0f);
        ofFloat.addUpdateListener(new sib(this, (byte) 0));
        ofFloat.addListener(new iab(this, (byte) 1));
        this.H = ofFloat;
        ofFloat.start();
    }

    public final void c() {
        cib cibVar = this.I;
        gl.r(cibVar);
        Animator animator = this.H;
        if (animator != null) {
            animator.removeAllListeners();
            this.H.cancel();
        }
        if (getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            this.F = true;
            setVisibility(0);
            this.G = 0.0f;
            this.f = 0.0f;
            this.x = this.h;
            this.y = this.n;
            this.s = 1.0f;
            this.w = 1.0f;
            invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new sib(this, (byte) 1));
            ofFloat.setDuration(210L);
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new sib(this, (byte) 2));
            ofFloat2.setStartDelay(600L);
            ofFloat2.setDuration(250L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat3.setStartDelay(500L);
            ofFloat3.addUpdateListener(new sib(this, (byte) 3));
            s33 s33Var = s33.g;
            ofFloat3.setInterpolator(s33Var);
            ofFloat3.setDuration(500L);
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat4.setStartDelay(400L);
            ofFloat4.addUpdateListener(new sib(this, (byte) 4));
            ofFloat4.setInterpolator(s33Var);
            ofFloat4.setDuration(900L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(ofFloat, ofFloat2, ofFloat3, ofFloat4);
            this.H = animatorSet;
            animatorSet.start();
            gl.e3(cibVar, 5000L);
            return;
        }
        this.J = true;
    }

    public float getPrepareProgress() {
        return this.G;
    }

    @Override
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        Paint paint;
        int i;
        float f;
        TextPaint textPaint;
        int i2;
        Path.Direction direction;
        float f2;
        TextPaint textPaint2 = this.b;
        Paint paint2 = this.c;
        Path path = this.K;
        if (this.a == null) {
            return;
        }
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(this.d, (getMeasuredHeight() - this.a.getHeight()) >> 1);
        if (this.f != 0.0f) {
            StaticLayout staticLayout = this.a;
            int i3 = this.x;
            int i4 = this.y;
            int lineForOffset = staticLayout.getLineForOffset(i3);
            int lineForOffset2 = staticLayout.getLineForOffset(i4);
            int primaryHorizontal = (int) staticLayout.getPrimaryHorizontal(i4);
            float primaryHorizontal2 = (int) staticLayout.getPrimaryHorizontal(i3);
            if (lineForOffset == lineForOffset2) {
                canvas.drawRect(primaryHorizontal2, staticLayout.getLineTop(lineForOffset), primaryHorizontal, staticLayout.getLineBottom(lineForOffset), paint2);
            } else {
                canvas.drawRect(primaryHorizontal2, staticLayout.getLineTop(lineForOffset), staticLayout.getLineWidth(lineForOffset), staticLayout.getLineBottom(lineForOffset), paint2);
                canvas.drawRect(0.0f, staticLayout.getLineTop(lineForOffset2), primaryHorizontal, staticLayout.getLineBottom(lineForOffset2), paint2);
                int i5 = lineForOffset + 1;
                while (i5 < lineForOffset2) {
                    canvas.drawRect(0.0f, staticLayout.getLineTop(i5), staticLayout.getLineWidth(i5), staticLayout.getLineBottom(i5), paint2);
                    i5++;
                    paint2 = paint2;
                }
            }
            paint = paint2;
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            paint = paint2;
        }
        this.a.draw(canvas2);
        int L = gl.L(14.0f);
        int lineForOffset3 = this.a.getLineForOffset(this.y);
        this.a.getPrimaryHorizontal(this.y);
        int lineBottom = this.a.getLineBottom(lineForOffset3);
        int i6 = this.y;
        int i7 = this.r;
        if (i6 == i7) {
            b(path, this.a.getPrimaryHorizontal(i7), this.a.getLineTop(lineForOffset3), gl.N(4.0f) + this.a.getPrimaryHorizontal(this.r), this.a.getLineBottom(lineForOffset3), gl.N(4.0f), gl.N(4.0f), false, true);
            canvas2.drawPath(path, paint);
        }
        float interpolation = this.e.getInterpolation(this.f);
        float A = tb4.A(1.0f, this.w, gl.N(4.0f), this.a.getPrimaryHorizontal(this.r));
        canvas2.save();
        canvas2.translate((int) (((this.a.getPrimaryHorizontal(this.n) - this.a.getPrimaryHorizontal(this.r)) * this.w) + A), lineBottom);
        float f3 = L;
        float f4 = f3 / 2.0f;
        canvas2.scale(interpolation, interpolation, f4, f4);
        path.reset();
        Path.Direction direction2 = Path.Direction.CCW;
        path.addCircle(f4, f4, f4, direction2);
        path.addRect(0.0f, 0.0f, f4, f4, direction2);
        canvas2.drawPath(path, textPaint2);
        canvas2.restore();
        int lineForOffset4 = this.a.getLineForOffset(this.x);
        this.a.getPrimaryHorizontal(this.x);
        int lineBottom2 = this.a.getLineBottom(lineForOffset4);
        if (this.x == 0) {
            textPaint = textPaint2;
            f2 = 1.0f;
            i = L;
            direction = direction2;
            f = f3;
            i2 = lineBottom2;
            b(path, -gl.L(4.0f), this.a.getLineTop(lineForOffset4), 0.0f, this.a.getLineBottom(lineForOffset4), gl.L(4.0f), gl.L(4.0f), true, false);
            canvas2.drawPath(path, paint);
        } else {
            i = L;
            f = f3;
            textPaint = textPaint2;
            i2 = lineBottom2;
            direction = direction2;
            f2 = 1.0f;
        }
        canvas2.save();
        float primaryHorizontal3 = this.a.getPrimaryHorizontal(0);
        canvas2.translate(((int) (((this.a.getPrimaryHorizontal(this.h) - this.a.getPrimaryHorizontal(0)) * this.s) + ls6.B(f2, this.s, gl.L(4.0f), primaryHorizontal3))) - i, i2);
        canvas2.scale(interpolation, interpolation, f4, f4);
        path.reset();
        path.addCircle(f4, f4, f4, direction);
        path.addRect(f4, 0.0f, f, f4, direction);
        canvas2.drawPath(path, textPaint);
        canvas2.restore();
        canvas2.restore();
    }

    @Override
    public void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        if (getMeasuredWidth() != this.E || this.a == null) {
            Animator animator = this.H;
            if (animator != null) {
                animator.removeAllListeners();
                this.H.cancel();
            }
            String str = null;
            String M0 = k96.M0(2131743951, null);
            Matcher matcher = Pattern.compile("\\*\\*.*\\*\\*").matcher(M0);
            if (matcher.matches()) {
                str = matcher.group();
            }
            String replace = M0.replace("**", "");
            this.a = new StaticLayout(replace, this.b, getMeasuredWidth() - (this.d << 1), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.h = 0;
            this.n = 0;
            if (str != null) {
                i3 = replace.indexOf(str);
                this.h = i3;
            } else {
                i3 = 0;
            }
            if (i3 > 0) {
                this.n = str.length() + i3;
            } else {
                int i4 = 0;
                for (int i5 = 0; i5 < replace.length(); i5++) {
                    if (replace.charAt(i5) == ' ') {
                        i4++;
                        if (i4 == 2) {
                            this.h = i5 + 1;
                        }
                        if (i4 == 3) {
                            this.n = i5 - 1;
                        }
                    }
                }
            }
            int i6 = this.n;
            if (i6 == 0) {
                i6 = replace.length();
                this.n = i6;
            }
            StaticLayout staticLayout = this.a;
            int offsetForHorizontal = staticLayout.getOffsetForHorizontal(staticLayout.getLineForOffset(i6), this.a.getWidth() - 1);
            this.r = offsetForHorizontal;
            this.x = this.h;
            this.y = this.n;
            if (this.F) {
                this.G = 1.0f;
                this.f = 1.0f;
                this.x = 0;
                this.y = offsetForHorizontal;
                this.s = 0.0f;
                this.w = 0.0f;
            } else if (this.J) {
                c();
            }
            this.J = false;
            this.E = getMeasuredWidth();
        }
        int height = this.a.getHeight() + (gl.L(8.0f) << 1);
        if (height < gl.L(56.0f)) {
            height = gl.L(56.0f);
        }
        setMeasuredDimension(getMeasuredWidth(), height);
    }
}
