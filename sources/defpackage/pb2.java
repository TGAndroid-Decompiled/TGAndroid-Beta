package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class pb2 extends Drawable {
    public final byte a;
    public final Object b;
    public boolean c;
    public final Paint d;
    public final Object e;
    public final Object f;

    public pb2(Context context, int i, int i2) {
        this.a = (byte) 1;
        this.c = true;
        this.e = context.getResources().getDrawable(i);
        if (i2 >= 0) {
            this.b = new Path();
            Paint paint = new Paint(1);
            this.d = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(-16777216);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            paint.setPathEffect(new CornerPathEffect(hl.L(1.0f)));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            Paint paint2 = new Paint(1);
            this.f = paint2;
            paint2.setStyle(Paint.Style.FILL);
            int[] iArr = aob.r8;
            paint2.setColor(aob.w0(null, iArr[i2 % iArr.length], false));
            paint2.setPathEffect(new CornerPathEffect(hl.L(1.0f)));
            return;
        }
        this.b = null;
        this.d = null;
        this.f = null;
    }

    public final void d() {
        float f;
        boolean z;
        j47 j47Var;
        cc2 cc2Var;
        int i;
        int i2;
        Rect bounds = getBounds();
        RectF rectF = (RectF) this.e;
        rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        Path path = (Path) this.b;
        path.rewind();
        wb2 wb2Var = (wb2) this.f;
        int[] iArr = wb2Var.L2;
        boolean z2 = this.c;
        int i3 = iArr[z2 ? 1 : 0];
        if (i3 != 3 && i3 != 4) {
            float f2 = 0.0f;
            if (i3 == 2) {
                r47 r47Var = wb2Var.Q5;
                if (r47Var != null && r47Var.O3()) {
                    z = true;
                } else {
                    z = false;
                }
                for (int i4 = 0; i4 < 4; i4++) {
                    if (!wb2Var.E2) {
                        if (z) {
                            i = 3;
                        } else {
                            i = 2;
                        }
                        if (i4 == i) {
                            float[] fArr = wb2.Id;
                            int i5 = i4 << 1;
                            float L = hl.L(xea.U0);
                            fArr[i5 + 1] = L;
                            fArr[i5] = L;
                        } else if (((wb2Var.C6 && wb2Var.M == null) || wb2Var.G) && (i4 == 2 || i4 == 3)) {
                            float[] fArr2 = wb2.Id;
                            int i6 = i4 << 1;
                            int i7 = i6 + 1;
                            if (wb2Var.G) {
                                i2 = Math.min(5, xea.U0);
                            } else {
                                i2 = xea.U0;
                            }
                            float L2 = hl.L(i2);
                            fArr2[i7] = L2;
                            fArr2[i6] = L2;
                        }
                    }
                    float[] fArr3 = wb2.Id;
                    int i8 = i4 << 1;
                    fArr3[i8 + 1] = 0.0f;
                    fArr3[i8] = 0.0f;
                }
                if (!z && !wb2Var.K && (j47Var = wb2Var.M) == null && (j47Var == null || ((cc2Var = wb2Var.x2) != null && cc2Var.b))) {
                    path.moveTo(rectF.left + hl.L(6.0f), rectF.top);
                    path.lineTo(rectF.left + hl.L(6.0f), (rectF.bottom - hl.L(6.0f)) - hl.L(5.0f));
                    RectF rectF2 = hl.P;
                    rectF2.set(rectF.left + hl.L(-7.0f), rectF.bottom - hl.L(23.0f), rectF.left + hl.L(6.0f), rectF.bottom);
                    path.arcTo(rectF2, 0.0f, 83.0f, false);
                    float f3 = rectF.right;
                    float[] fArr4 = wb2.Id;
                    float f4 = rectF.bottom;
                    rectF2.set(f3 - (fArr4[4] * 2.0f), f4 - (fArr4[5] * 2.0f), f3, f4);
                    path.arcTo(rectF2, 90.0f, -90.0f, false);
                    path.lineTo(rectF.right, rectF.top);
                    path.close();
                } else {
                    path.addRoundRect(rectF, wb2.Id, Path.Direction.CW);
                }
                path.close();
                return;
            }
            if (i3 == 0) {
                f2 = hl.L(6.0f);
            }
            path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
            return;
        }
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        if (iArr[z2 ? 1 : 0] == 3) {
            f = 16.0f;
        } else {
            f = 20.0f;
        }
        path.addCircle(centerX, centerY, hl.L(f), Path.Direction.CW);
    }

    @Override
    public final void draw(Canvas canvas) {
        byte b = this.a;
        Paint paint = this.d;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                d();
                canvas.drawPath((Path) obj3, paint);
                return;
            case 1:
                Drawable drawable = (Drawable) obj2;
                Path path = (Path) obj3;
                if (path != null) {
                    canvas.saveLayerAlpha(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, 255);
                    drawable.setBounds(getBounds());
                    drawable.draw(canvas);
                    if (this.c) {
                        path.rewind();
                        path.moveTo(e(0.4871f), f(0.6025f));
                        path.lineTo(e(0.8974f), f(0.6025f));
                        path.lineTo(e(1.0f), f(0.7564f));
                        path.lineTo(e(0.8974f), f(0.9102f));
                        path.lineTo(e(0.4871f), f(0.9102f));
                        path.close();
                        this.c = false;
                        paint.setStrokeWidth(hl.L(3.0f));
                    }
                    canvas.drawPath(path, paint);
                    canvas.drawPath(path, (Paint) obj);
                    canvas.restore();
                    return;
                }
                drawable.setBounds(getBounds());
                drawable.draw(canvas);
                return;
            default:
                Rect bounds = getBounds();
                canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
                Drawable drawable2 = (Drawable) obj2;
                drawable2.setBounds(bounds);
                drawable2.draw(canvas);
                float d = ((mm) obj).d(this.c);
                if (d > 0.0f) {
                    float N = hl.N(0.783f);
                    float centerX = (bounds.centerX() - hl.L(9.0f)) + N;
                    float centerY = (bounds.centerY() - hl.L(9.0f)) + N;
                    float L = (hl.L(9.0f) + bounds.centerX()) - N;
                    float L2 = (hl.L(9.0f) + bounds.centerY()) - N;
                    if (this.c) {
                        centerX = hl.R1(L, centerX, d);
                        centerY = hl.R1(L2, centerY, d);
                    } else {
                        L = hl.R1(centerX, L, d);
                        L2 = hl.R1(centerY, L2, d);
                    }
                    float f = centerX;
                    float f2 = centerY;
                    float f3 = L2;
                    float f4 = L;
                    canvas.drawLine(f, f2, f4, f3, (Paint) obj3);
                    Paint paint2 = this.d;
                    paint2.setAlpha((int) (Math.min(1.0f, d * 10.0f) * 255.0f));
                    canvas.drawLine(f, f2, f4, f3, paint2);
                }
                canvas.restore();
                return;
        }
    }

    public final int e(float f) {
        return hl.U1(f, getBounds().left, getBounds().right);
    }

    public final int f(float f) {
        return hl.U1(f, getBounds().top, getBounds().bottom);
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.a) {
            case 1:
                return ((Drawable) this.e).getIntrinsicHeight();
            case 2:
                return hl.L(24.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.a) {
            case 1:
                return ((Drawable) this.e).getIntrinsicWidth();
            case 2:
                return hl.L(24.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.a) {
            case 0:
            default:
                return -2;
            case 1:
                return ((Drawable) this.e).getOpacity();
        }
    }

    @Override
    public final void setAlpha(int i) {
        switch (this.a) {
            case 0:
                return;
            case 1:
                ((Drawable) this.e).setAlpha(i);
                return;
            default:
                ((Drawable) this.e).setAlpha(i);
                return;
        }
    }

    @Override
    public final void setBounds(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 1:
                super.setBounds(i, i2, i3, i4);
                this.c = true;
                return;
            default:
                super.setBounds(i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.a) {
            case 0:
                return;
            case 1:
                ((Drawable) this.e).setColorFilter(colorFilter);
                return;
            default:
                return;
        }
    }

    private final void a(int i) {
    }

    private final void b(ColorFilter colorFilter) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    public pb2(Context context) {
        this.a = (byte) 2;
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        this.f = new mm(new ge7(this, (byte) 4), 200L, k43.g, 0);
        this.e = c00.e(context, 2131231173);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(hl.N(1.566f));
        paint.setColor(-1);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Join join = Paint.Join.ROUND;
        paint.setStrokeJoin(join);
        paint2.setStyle(style);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint2.setStrokeWidth(hl.N(4.5f));
        paint2.setColor(-65536);
        paint2.setStrokeCap(cap);
        paint2.setStrokeJoin(join);
    }

    public pb2(wb2 wb2Var, int i) {
        this.a = (byte) 0;
        this.f = wb2Var;
        this.c = i;
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setColor(-1);
        this.e = new RectF();
        this.b = new Path();
    }
}
