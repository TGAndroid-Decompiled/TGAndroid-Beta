package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public final class z28 extends View implements vlb {
    public final ylb a;
    public final Paint b;
    public final byte c;
    public final int d;
    public boolean e;
    public y28[] f;
    public final int[] h;
    public final Paint n;
    public boolean r;
    public int s;
    public qac w;
    public y28 x;

    public z28(int i, int i2, ylb ylbVar, Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h = new int[]{5, 3, 1, 0, 2, 4, 6, -1};
        this.n = new Paint(1);
        this.r = true;
        this.s = 0;
        this.c = i;
        this.d = i2;
        this.a = ylbVar;
    }

    public final void a(int i, boolean z) {
        boolean z2;
        this.s = i;
        if (this.f != null) {
            int i2 = 0;
            while (true) {
                y28[] y28VarArr = this.f;
                if (i2 < y28VarArr.length) {
                    y28 y28Var = y28VarArr[i2];
                    if (y28Var.o == i) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    y28Var.m = z2;
                    if (!z) {
                        y28Var.n.f(z2, true);
                    }
                    y28Var.r.invalidate();
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f != null) {
            int i = 0;
            while (true) {
                y28[] y28VarArr = this.f;
                if (i >= y28VarArr.length) {
                    break;
                }
                y28 y28Var = y28VarArr[i];
                z28 z28Var = y28Var.r;
                Path path = y28Var.e;
                canvas.save();
                float a = y28Var.l.a(0.05f);
                RectF rectF = y28Var.p;
                canvas.scale(a, a, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = y28Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(y28Var.a);
                if (y28Var.f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, y28Var.b);
                }
                canvas.restore();
                if (y28Var.g) {
                    canvas.save();
                    RectF rectF2 = gm.P;
                    float width = (rectF.width() * 0.315f) / 2.0f;
                    rectF2.set(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, gm.L(2.33f), gm.L(2.33f), y28Var.c);
                    canvas.restore();
                }
                float d = y28Var.n.d(y28Var.m);
                if (d > 0.0f) {
                    Paint paint = z28Var.b;
                    paint.setStrokeWidth(gm.N(2.0f));
                    paint.setColor(cmb.v0(cmb.c6, z28Var.a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (gm.R1(0.5f, -2.0f, d) * paint.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint);
                }
                if (y28Var.h) {
                    if (z28Var.e) {
                        if (y28Var.k == null) {
                            Drawable drawable = z28Var.getContext().getResources().getDrawable(2131232249);
                            y28Var.k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        y28Var.k.setBounds((int) hg9.x(y28Var.k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) hg9.x(y28Var.k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) b10.A(y28Var.k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) b10.A(y28Var.k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        y28Var.k.draw(canvas);
                    } else {
                        if (y28Var.i == null) {
                            y28Var.i = new Path();
                        }
                        if (y28Var.j == null) {
                            Paint paint2 = new Paint(1);
                            y28Var.j = paint2;
                            paint2.setColor(-1);
                            y28Var.j.setStyle(Paint.Style.STROKE);
                            y28Var.j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        y28Var.j.setStrokeWidth(gm.L(2.0f));
                        y28Var.i.rewind();
                        float U1 = gm.U1(d, gm.L(5.0f), gm.L(4.0f));
                        y28Var.i.moveTo(rectF.centerX() - U1, rectF.centerY() - U1);
                        y28Var.i.lineTo(rectF.centerX() + U1, rectF.centerY() + U1);
                        y28Var.i.moveTo(rectF.centerX() + U1, rectF.centerY() - U1);
                        y28Var.i.lineTo(rectF.centerX() - U1, rectF.centerY() + U1);
                        canvas.drawPath(y28Var.i, y28Var.j);
                    }
                }
                canvas.restore();
                i++;
            }
        }
        if (this.r) {
            int v0 = cmb.v0(cmb.c7, this.a);
            Paint paint3 = this.n;
            paint3.setColor(v0);
            canvas.drawRect(gm.L(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - gm.L(21.0f), getMeasuredHeight(), paint3);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z28.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int getColorId() {
        return this.s;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        fc7 fc7Var;
        int size;
        int i3;
        boolean z;
        int i4;
        boolean z2;
        int size2 = View.MeasureSpec.getSize(i);
        oc7 r1 = oc7.r1(this.d);
        byte b = this.c;
        if (b == 1) {
            fc7Var = r1.E3;
        } else {
            fc7Var = r1.F3;
        }
        if (fc7Var == null) {
            size = 0;
        } else {
            size = fc7Var.c.size();
        }
        int i5 = 8;
        byte b2 = 2;
        if (b == 2) {
            size = 8;
        }
        if (b != 2 && b == 1) {
            i5 = 7;
        }
        float f = size2;
        float f2 = i5;
        float f3 = i5 + 1;
        float min = Math.min(gm.L(54.0f), f / ((f3 * 0.28947f) + f2));
        float min2 = Math.min(0.28947f * min, gm.L(8.0f));
        float min3 = Math.min(0.31578946f * min, gm.L(11.33f));
        boolean z3 = true;
        setMeasuredDimension(size2, (int) (((i3 + 1) * min3) + ((size / i5) * min)));
        y28[] y28VarArr = this.f;
        if (y28VarArr == null || y28VarArr.length != size) {
            this.f = new y28[size];
            int i6 = 0;
            while (i6 < size) {
                this.f[i6] = new y28(this);
                if (b == b2) {
                    y28 y28Var = this.f[i6];
                    int i7 = this.h[i6];
                    y28Var.o = i7;
                    if (i7 < 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    y28Var.h = z;
                    if (i7 < 0) {
                        i4 = cmb.b8;
                    } else {
                        int[] iArr = cmb.q8;
                        i4 = iArr[i7 % iArr.length];
                    }
                    int v0 = cmb.v0(i4, this.a);
                    y28Var.g = false;
                    y28Var.f = false;
                    y28Var.a.setColor(v0);
                } else if (fc7Var != null) {
                    ArrayList arrayList = fc7Var.c;
                    if (i6 >= 0 && i6 < arrayList.size()) {
                        this.f[i6].o = ((ec7) arrayList.get(i6)).c;
                        this.f[i6].a((ec7) arrayList.get(i6));
                    }
                }
                i6++;
                b2 = 2;
            }
        }
        float f4 = ((f - ((f3 * min2) + (f2 * min))) / 2.0f) + min2;
        if (this.f != null) {
            int i8 = 0;
            float f5 = f4;
            float f6 = min3;
            while (i8 < this.f.length) {
                RectF rectF = gm.P;
                rectF.set(f5, f6, f5 + min, f6 + min);
                this.f[i8].p.set(rectF);
                rectF.inset((-min2) / 2.0f, (-min3) / 2.0f);
                this.f[i8].q.set(rectF);
                y28 y28Var2 = this.f[i8];
                if (y28Var2.o == this.s) {
                    z2 = z3;
                } else {
                    z2 = false;
                }
                y28Var2.m = z2;
                boolean z4 = z3;
                y28Var2.n.f(z2, z4);
                y28Var2.r.invalidate();
                if (i8 % i5 == i5 - 1) {
                    f6 += min + min3;
                    f5 = f4;
                } else {
                    f5 = min + min2 + f5;
                }
                i8++;
                z3 = z4;
            }
        }
    }

    public void setCloseAsLock(boolean z) {
        this.e = z;
    }

    public void setDivider(boolean z) {
        this.r = z;
        invalidate();
    }

    public void setOnColorClick(qac qacVar) {
        this.w = qacVar;
    }

    @Override
    public final void updateColors() {
        fc7 fc7Var;
        boolean z;
        int i;
        if (this.f == null) {
            return;
        }
        oc7 r1 = oc7.r1(this.d);
        byte b = this.c;
        if (b == 1) {
            fc7Var = r1.E3;
        } else {
            fc7Var = r1.F3;
        }
        int i2 = 0;
        while (true) {
            y28[] y28VarArr = this.f;
            if (i2 < y28VarArr.length) {
                ylb ylbVar = this.a;
                int[] iArr = this.h;
                if (b == 2) {
                    y28 y28Var = y28VarArr[i2];
                    int i3 = iArr[i2];
                    y28Var.o = i3;
                    if (i3 < 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    y28Var.h = z;
                    if (i3 < 0) {
                        i = cmb.b8;
                    } else {
                        int[] iArr2 = cmb.q8;
                        i = iArr2[i3 % iArr2.length];
                    }
                    int v0 = cmb.v0(i, ylbVar);
                    y28Var.g = false;
                    y28Var.f = false;
                    y28Var.a.setColor(v0);
                } else if (i2 < 7 && b == 1) {
                    y28 y28Var2 = y28VarArr[i2];
                    int i4 = iArr[i2];
                    y28Var2.o = i4;
                    int v02 = cmb.v0(cmb.q8[i4], ylbVar);
                    y28Var2.g = false;
                    y28Var2.f = false;
                    y28Var2.a.setColor(v02);
                } else if (fc7Var != null) {
                    ArrayList arrayList = fc7Var.c;
                    if (i2 >= 0 && i2 < arrayList.size()) {
                        this.f[i2].o = ((ec7) arrayList.get(i2)).c;
                        this.f[i2].a((ec7) arrayList.get(i2));
                    }
                }
                i2++;
            } else {
                invalidate();
                return;
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
