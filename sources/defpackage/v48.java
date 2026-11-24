package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.PhotoViewer;
public final class v48 extends FrameLayout {
    public final wjb E;
    public final s48 F;
    public final s48 G;
    public u48 a;
    public final j33 b;
    public final b33 c;
    public final boolean d;
    public final ImageReceiver e;
    public boolean f;
    public boolean h;
    public float n;
    public float r;
    public AnimatorSet s;
    public AnimatorSet w;
    public float x;
    public final Paint y;

    public v48(ContextThemeWrapper contextThemeWrapper, wjb wjbVar) {
        super(contextThemeWrapper);
        this.h = true;
        this.r = 1.0f;
        this.x = 0.0f;
        this.y = new Paint(1);
        this.F = new s48(this, (byte) 0);
        this.G = new s48(this, (byte) 1);
        this.E = wjbVar;
        this.d = contextThemeWrapper instanceof BubbleActivity;
        j33 j33Var = new j33(contextThemeWrapper);
        this.b = j33Var;
        j33Var.setListener(new s34(this, (byte) 22));
        j33Var.setBottomPadding(gl.L(64.0f));
        addView(j33Var);
        this.e = new ImageReceiver(this);
        b33 b33Var = new b33(contextThemeWrapper);
        this.c = b33Var;
        b33Var.setListener(new r23(this, (byte) 2));
        addView(b33Var, nme.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        j33 j33Var = this.b;
        j33Var.b.setVisibility(4);
        CropAreaView cropAreaView = j33Var.a;
        cropAreaView.setDimVisibility(false);
        cropAreaView.f(false, false);
        cropAreaView.invalidate();
    }

    public final void b(Bitmap bitmap, int i, boolean z, boolean z2, c33 c33Var, kac kacVar, zl6 zl6Var) {
        boolean z3;
        zl6 zl6Var2;
        requestLayout();
        int i2 = 0;
        this.f = false;
        Bitmap bitmap2 = null;
        this.e.g0(null);
        j33 j33Var = this.b;
        ImageView imageView = j33Var.b;
        j33Var.y = z;
        j33Var.d = kacVar;
        j33Var.e = c33Var;
        j33Var.L = i;
        j33Var.x = bitmap;
        CropAreaView cropAreaView = j33Var.a;
        boolean z4 = true;
        if (kacVar != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        cropAreaView.setIsVideo(z3);
        if (bitmap == null && kacVar == null) {
            j33Var.M = null;
            imageView.setImageDrawable(null);
            zl6Var2 = zl6Var;
        } else {
            int currentWidth = j33Var.getCurrentWidth();
            int currentHeight = j33Var.getCurrentHeight();
            h33 h33Var = j33Var.M;
            if (h33Var != null && z2) {
                float f = currentWidth;
                h33Var.e *= h33Var.a / f;
                h33Var.a = f;
                h33Var.b = currentHeight;
                h33Var.h();
                Matrix matrix = h33Var.k;
                j33 j33Var2 = h33Var.l;
                matrix.getValues(j33Var2.I);
                matrix.reset();
                float f2 = h33Var.e;
                matrix.postScale(f2, f2);
                float[] fArr = j33Var2.I;
                matrix.postTranslate(fArr[2], fArr[5]);
                j33Var2.r(false);
                zl6Var2 = zl6Var;
            } else {
                j33Var.M = new h33(j33Var, currentWidth, currentHeight);
                zl6Var2 = zl6Var;
                cropAreaView.getViewTreeObserver().addOnPreDrawListener(new f33(j33Var, zl6Var2, currentHeight, currentWidth, (byte) 1));
            }
            if (kacVar == null) {
                bitmap2 = j33Var.x;
            }
            imageView.setImageBitmap(bitmap2);
        }
        b33 b33Var = this.c;
        b33Var.setFreeform(z);
        b33Var.b(0.0f);
        b33Var.setMirrored(false);
        b33Var.setRotated(false);
        if (zl6Var2 != null) {
            b33Var.b(zl6Var2.d);
            if (zl6Var2.k == 0) {
                z4 = false;
            }
            b33Var.setRotated(z4);
            b33Var.setMirrored(zl6Var2.l);
        } else {
            b33Var.setRotated(false);
            b33Var.setMirrored(false);
        }
        if (!z) {
            i2 = 4;
        }
        b33Var.setVisibility(i2);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        j33 j33Var;
        boolean drawChild = super.drawChild(canvas, view, j);
        if (this.f && view == (j33Var = this.b)) {
            RectF actualRect = j33Var.getActualRect();
            int L = gl.L(32.0f);
            c78 c78Var = (c78) this.a;
            c78Var.getClass();
            PhotoViewer photoViewer = c78Var.a;
            float measuredWidth = (photoViewer.X7.getMeasuredWidth() - gl.L(32.0f)) * photoViewer.B8;
            int i = L / 2;
            int L2 = gl.L(2.0f) + (((int) (measuredWidth + gl.L(16.0f))) - i);
            int measuredHeight = getMeasuredHeight() - gl.L(156.0f);
            float f = actualRect.left;
            float f2 = this.r;
            float f3 = ((L2 - f) * f2) + f;
            float f4 = actualRect.top;
            float A = tb4.A(measuredHeight, f4, f2, f4);
            float width = ((L - actualRect.width()) * this.r) + actualRect.width();
            ImageReceiver imageReceiver = this.e;
            imageReceiver.q0((int) (width / 2.0f));
            imageReceiver.i0(f3, A, width, width);
            imageReceiver.setAlpha(this.n);
            imageReceiver.h(canvas, null);
            int i2 = (this.x > 0.0f ? 1 : (this.x == 0.0f ? 0 : -1));
            Paint paint = this.y;
            if (i2 > 0) {
                paint.setColor(-1);
                paint.setAlpha((int) (this.x * 255.0f));
                canvas.drawCircle(actualRect.centerX(), actualRect.centerY(), actualRect.width() / 2.0f, paint);
            }
            paint.setColor(bkb.v0(bkb.pg, this.E));
            paint.setAlpha(Math.min(255, (int) (this.r * 255.0f * this.n)));
            canvas.drawCircle(L2 + i, gl.L(8.0f) + measuredHeight + L, gl.L(3.0f), paint);
        }
        return drawChild;
    }

    public float getRectSizeX() {
        return this.b.getCropWidth();
    }

    public float getRectSizeY() {
        return this.b.getCropHeight();
    }

    public float getRectX() {
        return this.b.getCropLeft() - gl.L(14.0f);
    }

    public float getRectY() {
        int i;
        float cropTop = this.b.getCropTop() - gl.L(14.0f);
        if (!this.d) {
            i = gl.m;
        } else {
            i = 0;
        }
        return cropTop - i;
    }

    public Bitmap getVideoThumb() {
        if (this.f && this.h) {
            return this.e.n();
        }
        return null;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.b.invalidate();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f) {
            if (this.e.H(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((c78) this.a).c();
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        h33 h33Var;
        super.onLayout(z, i, i2, i3, i4);
        j33 j33Var = this.b;
        CropAreaView cropAreaView = j33Var.a;
        float cropWidth = cropAreaView.getCropWidth();
        if (cropWidth != 0.0f && (h33Var = j33Var.M) != null) {
            cropAreaView.a(j33Var.h, h33Var.a / h33Var.b);
            cropAreaView.setActualRect(cropAreaView.getAspectRatio());
            cropAreaView.d(j33Var.f);
            j33Var.M.f(cropAreaView.getCropWidth() / cropWidth, 0.0f, 0.0f);
            j33Var.r(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f) {
            if (this.e.H(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((c78) this.a).c();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f) {
        this.b.setAspectRatio(f);
    }

    public void setDelegate(u48 u48Var) {
        this.a = u48Var;
    }

    public void setFreeform(boolean z) {
        this.b.setFreeform(z);
    }

    public void setSubtitle(String str) {
        this.b.setSubtitle(str);
    }

    public void setVideoThumbFlashAlpha(float f) {
        this.x = f;
        invalidate();
    }

    public void setVideoThumbVisible(boolean z) {
        float f;
        if (this.h == z) {
            return;
        }
        this.h = z;
        AnimatorSet animatorSet = this.w;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.w = animatorSet2;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.G, f));
        this.w.setDuration(180L);
        this.w.addListener(new t48(this, (byte) 1));
        this.w.start();
    }
}
