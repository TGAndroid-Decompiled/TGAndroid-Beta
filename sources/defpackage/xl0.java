package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;
public final class xl0 {
    public final tl0 a;
    public final View b;
    public final ColorMatrix c;
    public final boolean d;
    public boolean e;
    public float f;
    public Paint g;
    public Paint h;
    public final byte i;
    public final Integer j;
    public final Path k;
    public int l;
    public int m;
    public Bitmap n;
    public BitmapShader o;
    public final Matrix p;
    public final RectF q;
    public boolean r;
    public Paint[] s;
    public ValueAnimator t;
    public final int[] u;
    public final int[] v;

    public xl0(tl0 tl0Var, View view, int i, boolean z) {
        float f;
        float f2;
        this.g = new Paint(3);
        this.h = new Paint(3);
        this.k = new Path();
        this.p = new Matrix();
        this.q = new RectF();
        this.r = false;
        this.u = new int[2];
        this.v = new int[2];
        this.a = tl0Var;
        this.b = view;
        this.i = i;
        this.d = z;
        ColorMatrix colorMatrix = new ColorMatrix();
        this.c = colorMatrix;
        if (i == 0) {
            hl.i(colorMatrix, 0.45f);
        } else if (i == 5) {
            Paint paint = this.h;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            this.g.setXfermode(new PorterDuffXfermode(mode));
            hl.i(colorMatrix, 0.3f);
        } else if (i == 2) {
            Paint paint2 = this.h;
            PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
            paint2.setXfermode(new PorterDuffXfermode(mode2));
            this.g.setXfermode(new PorterDuffXfermode(mode2));
            hl.h(colorMatrix, 0.4f);
            hl.i(colorMatrix, 0.3f);
        } else if (i == 1) {
            hl.i(colorMatrix, 0.35f);
            hl.h(colorMatrix, 0.7f);
            hl.l2(colorMatrix, 1.5f);
        } else if (i == 3) {
            hl.i(colorMatrix, 0.5f);
        } else if (i == 4) {
            this.j = -10329502;
            hl.i(colorMatrix, 0.6f);
            hl.h(colorMatrix, 0.3f);
            hl.l2(colorMatrix, 1.2f);
        } else if (i == 6) {
            hl.i(colorMatrix, 0.4f);
            hl.l2(colorMatrix, 0.35f);
        } else if (i == 7) {
            hl.i(colorMatrix, 0.5f);
            hl.l2(colorMatrix, 0.95f);
        } else if (i == 8) {
            hl.h(colorMatrix, -0.15f);
            hl.i(colorMatrix, 0.47f);
        } else if (i == 9) {
            Paint paint3 = this.h;
            PorterDuff.Mode mode3 = PorterDuff.Mode.SRC_IN;
            paint3.setXfermode(new PorterDuffXfermode(mode3));
            this.g.setXfermode(new PorterDuffXfermode(mode3));
            hl.h(colorMatrix, 0.4f);
            hl.i(colorMatrix, 0.45f);
        } else if (i == 10) {
            colorMatrix.setSaturation(1.6f);
            if (this.r) {
                f = 0.97f;
            } else {
                f = 0.92f;
            }
            hl.l2(colorMatrix, f);
            if (this.r) {
                f2 = 0.12f;
            } else {
                f2 = -0.06f;
            }
            hl.h(colorMatrix, f2);
        }
        this.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        if (view.isAttachedToWindow() && tl0Var != null) {
            tl0Var.d.add(this);
        }
        view.addOnAttachStateChangeListener(new vl0(this, tl0Var, (byte) 0));
    }

    public final void a(Canvas canvas) {
        b(canvas, true);
    }

    public final void b(Canvas canvas, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        tl0 tl0Var = this.a;
        if (tl0Var.c() && Build.VERSION.SDK_INT >= 31) {
            boolean isHardwareAccelerated = canvas.isHardwareAccelerated();
            Integer num = this.j;
            if (!isHardwareAccelerated) {
                if (num != null) {
                    i4 = num.intValue();
                } else {
                    i4 = tl0Var.i;
                }
                canvas.drawColor(i4);
                return;
            }
            RenderNode renderNode = (RenderNode) tl0Var.l;
            if (!renderNode.hasDisplayList()) {
                RenderNode renderNode2 = (RenderNode) tl0Var.k;
                renderNode.setPosition(0, 0, renderNode2.getWidth(), renderNode2.getHeight());
                RecordingCanvas beginRecording = renderNode.beginRecording();
                if (num != null) {
                    i3 = num.intValue();
                } else {
                    i3 = tl0Var.i;
                }
                beginRecording.drawColor(i3);
                beginRecording.drawRenderNode(renderNode2);
                renderNode.endRecording();
            }
            if (!renderNode.hasDisplayList()) {
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    i2 = tl0Var.i;
                }
                canvas.drawColor(i2);
                return;
            }
            if (num != null) {
                i = num.intValue();
            } else {
                i = tl0Var.i;
            }
            canvas.drawColor(i);
            f(renderNode.getWidth(), renderNode.getHeight(), true);
            if (renderNode.hasDisplayList()) {
                Matrix matrix = this.p;
                matrix.postTranslate(-0.0f, -0.0f);
                this.h.setAlpha(255);
                canvas.saveLayer(null, this.h);
                canvas.concat(matrix);
                if (z) {
                    int i5 = this.l;
                    int width = renderNode.getWidth();
                    Path path = this.k;
                    if (i5 != width || this.m != renderNode.getHeight()) {
                        path.rewind();
                        RectF rectF = hl.P;
                        int width2 = renderNode.getWidth();
                        this.l = width2;
                        int height = renderNode.getHeight();
                        this.m = height;
                        rectF.set(0.0f, 0.0f, width2, height);
                        path.addRoundRect(rectF, hl.L(12.0f), hl.L(12.0f), Path.Direction.CW);
                    }
                    canvas.clipPath(path);
                }
                canvas.drawRenderNode(renderNode);
                canvas.restore();
                return;
            }
            return;
        }
        Paint c = c(1.0f);
        if (c != null) {
            canvas.drawPaint(c);
        }
    }

    public final Paint c(float f) {
        Bitmap b;
        Bitmap bitmap;
        tl0 tl0Var = this.a;
        if (tl0Var == null || (b = tl0Var.b()) == null) {
            return null;
        }
        BitmapShader bitmapShader = this.o;
        if (bitmapShader == null || this.n != b) {
            if (this.d && bitmapShader != null && (bitmap = this.n) != null && !bitmap.isRecycled() && !b.isRecycled()) {
                Paint paint = this.h;
                this.h = this.g;
                this.g = paint;
                this.e = true;
                ValueAnimator valueAnimator = this.t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.t = null;
                }
                this.f = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                this.t = ofFloat;
                ofFloat.addUpdateListener(new g0(this, (byte) 14));
                this.t.start();
            }
            this.n = b;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader2 = new BitmapShader(b, tileMode, tileMode);
            this.o = bitmapShader2;
            this.h.setShader(bitmapShader2);
        }
        f(b.getWidth(), b.getHeight(), false);
        Matrix matrix = this.p;
        matrix.postTranslate(-0.0f, -0.0f);
        this.o.setLocalMatrix(matrix);
        this.h.setAlpha((int) (f * 255.0f));
        return this.h;
    }

    public final Paint[] d() {
        Paint paint;
        Paint c = c(1.0f);
        boolean z = this.e;
        if (z) {
            paint = this.g;
        } else {
            paint = null;
        }
        if (c != null && z) {
            c.setAlpha((int) qd4.z(1.0f, this.f, 255.0f, 1.0f));
        }
        if (paint != null) {
            paint.setAlpha(255);
        }
        Paint[] paintArr = this.s;
        if (paintArr == null) {
            paintArr = new Paint[2];
            this.s = paintArr;
        }
        paintArr[0] = paint;
        paintArr[1] = c;
        return paintArr;
    }

    public final void e(float f, float f2, float f3, float f4) {
        RectF rectF = hl.P;
        rectF.set(f, f2, f3, f4);
        RectF rectF2 = this.q;
        if (rectF2.top != rectF.top || rectF2.bottom != rectF.bottom || rectF2.left != rectF.left || rectF2.right != rectF.right) {
            rectF2.set(rectF);
            Bitmap b = this.a.b();
            if (b == null) {
                return;
            }
            if (this.o == null || this.n != b) {
                this.n = b;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(b, tileMode, tileMode);
                this.o = bitmapShader;
                this.h.setShader(bitmapShader);
            }
            float width = rectF2.width() / this.n.getWidth();
            float height = rectF2.height() / this.n.getHeight();
            Matrix matrix = this.p;
            matrix.reset();
            matrix.postTranslate(rectF2.left, rectF2.top);
            matrix.preScale(width, height);
            this.o.setLocalMatrix(matrix);
        }
    }

    public final void f(int i, int i2, boolean z) {
        View view;
        View view2;
        Matrix matrix = this.p;
        matrix.reset();
        tl0 tl0Var = this.a;
        if (tl0Var != null) {
            if (z) {
                view = tl0Var.j;
            } else {
                view = tl0Var.b;
            }
        } else {
            view = null;
        }
        if (tl0Var != null) {
            ArrayList arrayList = tl0Var.c;
            View view3 = this.b;
            do {
                matrix.preScale(1.0f / view3.getScaleX(), 1.0f / view3.getScaleY(), view3.getPivotX(), view3.getPivotY());
                matrix.preRotate(-view3.getRotation(), view3.getPivotX(), view3.getPivotY());
                matrix.preTranslate(-view3.getX(), -view3.getY());
                if (!(view3.getParent() instanceof View) || (view3 = (View) view3.getParent()) == null) {
                    break;
                }
            } while (!arrayList.contains(view3));
            if (view != view3) {
                int indexOf = arrayList.indexOf(view3) + 1;
                if (indexOf == 0 && (view2 = (View) arrayList.get(indexOf)) != null) {
                    int[] iArr = this.u;
                    view3.getLocationOnScreen(iArr);
                    int[] iArr2 = this.v;
                    view2.getLocationOnScreen(iArr2);
                    matrix.preTranslate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
                }
                while (indexOf >= 0 && indexOf < arrayList.size()) {
                    View view4 = (View) arrayList.get(indexOf);
                    if (view4 != null) {
                        matrix.preScale(view4.getScaleX(), view4.getScaleY(), view4.getPivotX(), view4.getPivotY());
                        matrix.preRotate(view4.getRotation(), view4.getPivotX(), view4.getPivotY());
                        matrix.preTranslate(view4.getX(), view4.getY());
                        indexOf++;
                    }
                }
            }
        }
        if (view != null) {
            matrix.preScale(view.getWidth() / i, view.getHeight() / i2);
        }
    }

    public xl0(tl0 tl0Var, View view) {
        this(tl0Var, view, 6, false);
    }
}
