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
public final class k88 extends FrameLayout {
    public final vnb E;
    public final h88 F;
    public final h88 G;
    public j88 a;
    public final b43 b;
    public final t33 c;
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

    public k88(ContextThemeWrapper contextThemeWrapper, vnb vnbVar) {
        super(contextThemeWrapper);
        this.h = true;
        this.r = 1.0f;
        this.x = 0.0f;
        this.y = new Paint(1);
        this.F = new h88(this, (byte) 0);
        this.G = new h88(this, (byte) 1);
        this.E = vnbVar;
        this.d = contextThemeWrapper instanceof BubbleActivity;
        b43 b43Var = new b43(contextThemeWrapper);
        this.b = b43Var;
        b43Var.setListener(new v34(this, (byte) 22));
        b43Var.setBottomPadding(hl.L(64.0f));
        addView(b43Var);
        this.e = new ImageReceiver(this);
        t33 t33Var = new t33(contextThemeWrapper);
        this.c = t33Var;
        t33Var.setListener(new j33(this, (byte) 2));
        addView(t33Var, tre.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        b43 b43Var = this.b;
        b43Var.b.setVisibility(4);
        CropAreaView cropAreaView = b43Var.a;
        cropAreaView.setDimVisibility(false);
        cropAreaView.f(false, false);
        cropAreaView.invalidate();
    }

    public final void b(Bitmap bitmap, int i, boolean z, boolean z2, u33 u33Var, kec kecVar, fo6 fo6Var) {
        boolean z3;
        fo6 fo6Var2;
        requestLayout();
        int i2 = 0;
        this.f = false;
        Bitmap bitmap2 = null;
        this.e.g0(null);
        b43 b43Var = this.b;
        ImageView imageView = b43Var.b;
        b43Var.y = z;
        b43Var.d = kecVar;
        b43Var.e = u33Var;
        b43Var.L = i;
        b43Var.x = bitmap;
        CropAreaView cropAreaView = b43Var.a;
        boolean z4 = true;
        if (kecVar != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        cropAreaView.setIsVideo(z3);
        if (bitmap == null && kecVar == null) {
            b43Var.M = null;
            imageView.setImageDrawable(null);
            fo6Var2 = fo6Var;
        } else {
            int currentWidth = b43Var.getCurrentWidth();
            int currentHeight = b43Var.getCurrentHeight();
            z33 z33Var = b43Var.M;
            if (z33Var != null && z2) {
                float f = currentWidth;
                z33Var.e *= z33Var.a / f;
                z33Var.a = f;
                z33Var.b = currentHeight;
                z33Var.h();
                Matrix matrix = z33Var.k;
                b43 b43Var2 = z33Var.l;
                matrix.getValues(b43Var2.I);
                matrix.reset();
                float f2 = z33Var.e;
                matrix.postScale(f2, f2);
                float[] fArr = b43Var2.I;
                matrix.postTranslate(fArr[2], fArr[5]);
                b43Var2.r(false);
                fo6Var2 = fo6Var;
            } else {
                b43Var.M = new z33(b43Var, currentWidth, currentHeight);
                fo6Var2 = fo6Var;
                cropAreaView.getViewTreeObserver().addOnPreDrawListener(new x33(b43Var, fo6Var2, currentHeight, currentWidth, (byte) 1));
            }
            if (kecVar == null) {
                bitmap2 = b43Var.x;
            }
            imageView.setImageBitmap(bitmap2);
        }
        t33 t33Var = this.c;
        t33Var.setFreeform(z);
        t33Var.b(0.0f);
        t33Var.setMirrored(false);
        t33Var.setRotated(false);
        if (fo6Var2 != null) {
            t33Var.b(fo6Var2.d);
            if (fo6Var2.k == 0) {
                z4 = false;
            }
            t33Var.setRotated(z4);
            t33Var.setMirrored(fo6Var2.l);
        } else {
            t33Var.setRotated(false);
            t33Var.setMirrored(false);
        }
        if (!z) {
            i2 = 4;
        }
        t33Var.setVisibility(i2);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        b43 b43Var;
        boolean drawChild = super.drawChild(canvas, view, j);
        if (this.f && view == (b43Var = this.b)) {
            RectF actualRect = b43Var.getActualRect();
            int L = hl.L(32.0f);
            ua8 ua8Var = (ua8) this.a;
            ua8Var.getClass();
            PhotoViewer photoViewer = ua8Var.a;
            float measuredWidth = (photoViewer.X7.getMeasuredWidth() - hl.L(32.0f)) * photoViewer.B8;
            int i = L / 2;
            int L2 = hl.L(2.0f) + (((int) (measuredWidth + hl.L(16.0f))) - i);
            int measuredHeight = getMeasuredHeight() - hl.L(156.0f);
            float f = actualRect.left;
            float f2 = this.r;
            float f3 = ((L2 - f) * f2) + f;
            float f4 = actualRect.top;
            float A = qd4.A(measuredHeight, f4, f2, f4);
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
            paint.setColor(aob.v0(aob.qg, this.E));
            paint.setAlpha(Math.min(255, (int) (this.r * 255.0f * this.n)));
            canvas.drawCircle(L2 + i, hl.L(8.0f) + measuredHeight + L, hl.L(3.0f), paint);
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
        return this.b.getCropLeft() - hl.L(14.0f);
    }

    public float getRectY() {
        int i;
        float cropTop = this.b.getCropTop() - hl.L(14.0f);
        if (!this.d) {
            i = hl.m;
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
                    ((ua8) this.a).c();
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        z33 z33Var;
        super.onLayout(z, i, i2, i3, i4);
        b43 b43Var = this.b;
        CropAreaView cropAreaView = b43Var.a;
        float cropWidth = cropAreaView.getCropWidth();
        if (cropWidth != 0.0f && (z33Var = b43Var.M) != null) {
            cropAreaView.a(b43Var.h, z33Var.a / z33Var.b);
            cropAreaView.setActualRect(cropAreaView.getAspectRatio());
            cropAreaView.d(b43Var.f);
            b43Var.M.f(cropAreaView.getCropWidth() / cropWidth, 0.0f, 0.0f);
            b43Var.r(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f) {
            if (this.e.H(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((ua8) this.a).c();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f) {
        this.b.setAspectRatio(f);
    }

    public void setDelegate(j88 j88Var) {
        this.a = j88Var;
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
        this.w.addListener(new i88(this, (byte) 1));
        this.w.start();
    }
}
