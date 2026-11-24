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
public final class w08 extends View implements tjb {
    public final wjb a;
    public final Paint b;
    public final byte c;
    public final int d;
    public boolean e;
    public v08[] f;
    public final int[] h;
    public final Paint n;
    public boolean r;
    public int s;
    public p8c w;
    public v08 x;

    public w08(int i, int i2, wjb wjbVar, Context context) {
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
        this.a = wjbVar;
    }

    public final void a(int i, boolean z) {
        boolean z2;
        this.s = i;
        if (this.f != null) {
            int i2 = 0;
            while (true) {
                v08[] v08VarArr = this.f;
                if (i2 < v08VarArr.length) {
                    v08 v08Var = v08VarArr[i2];
                    if (v08Var.o == i) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    v08Var.m = z2;
                    if (!z) {
                        v08Var.n.f(z2, true);
                    }
                    v08Var.r.invalidate();
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
                v08[] v08VarArr = this.f;
                if (i >= v08VarArr.length) {
                    break;
                }
                v08 v08Var = v08VarArr[i];
                w08 w08Var = v08Var.r;
                Path path = v08Var.e;
                canvas.save();
                float a = v08Var.l.a(0.05f);
                RectF rectF = v08Var.p;
                canvas.scale(a, a, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = v08Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(v08Var.a);
                if (v08Var.f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, v08Var.b);
                }
                canvas.restore();
                if (v08Var.g) {
                    canvas.save();
                    RectF rectF2 = gl.P;
                    float width = (rectF.width() * 0.315f) / 2.0f;
                    rectF2.set(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, gl.L(2.33f), gl.L(2.33f), v08Var.c);
                    canvas.restore();
                }
                float d = v08Var.n.d(v08Var.m);
                if (d > 0.0f) {
                    Paint paint = w08Var.b;
                    paint.setStrokeWidth(gl.N(2.0f));
                    paint.setColor(bkb.v0(bkb.c6, w08Var.a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (gl.R1(0.5f, -2.0f, d) * paint.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint);
                }
                if (v08Var.h) {
                    if (w08Var.e) {
                        if (v08Var.k == null) {
                            Drawable drawable = w08Var.getContext().getResources().getDrawable(2131232248);
                            v08Var.k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        v08Var.k.setBounds((int) de9.x(v08Var.k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) de9.x(v08Var.k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) b00.A(v08Var.k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) b00.A(v08Var.k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        v08Var.k.draw(canvas);
                    } else {
                        if (v08Var.i == null) {
                            v08Var.i = new Path();
                        }
                        if (v08Var.j == null) {
                            Paint paint2 = new Paint(1);
                            v08Var.j = paint2;
                            paint2.setColor(-1);
                            v08Var.j.setStyle(Paint.Style.STROKE);
                            v08Var.j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        v08Var.j.setStrokeWidth(gl.L(2.0f));
                        v08Var.i.rewind();
                        float U1 = gl.U1(d, gl.L(5.0f), gl.L(4.0f));
                        v08Var.i.moveTo(rectF.centerX() - U1, rectF.centerY() - U1);
                        v08Var.i.lineTo(rectF.centerX() + U1, rectF.centerY() + U1);
                        v08Var.i.moveTo(rectF.centerX() + U1, rectF.centerY() - U1);
                        v08Var.i.lineTo(rectF.centerX() - U1, rectF.centerY() + U1);
                        canvas.drawPath(v08Var.i, v08Var.j);
                    }
                }
                canvas.restore();
                i++;
            }
        }
        if (this.r) {
            int v0 = bkb.v0(bkb.c7, this.a);
            Paint paint3 = this.n;
            paint3.setColor(v0);
            canvas.drawRect(gl.L(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - gl.L(21.0f), getMeasuredHeight(), paint3);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w08.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int getColorId() {
        return this.s;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        ea7 ea7Var;
        int size;
        int i3;
        boolean z;
        int i4;
        boolean z2;
        int size2 = View.MeasureSpec.getSize(i);
        na7 q1 = na7.q1(this.d);
        byte b = this.c;
        if (b == 1) {
            ea7Var = q1.E3;
        } else {
            ea7Var = q1.F3;
        }
        if (ea7Var == null) {
            size = 0;
        } else {
            size = ea7Var.c.size();
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
        float min = Math.min(gl.L(54.0f), f / ((f3 * 0.28947f) + f2));
        float min2 = Math.min(0.28947f * min, gl.L(8.0f));
        float min3 = Math.min(0.31578946f * min, gl.L(11.33f));
        boolean z3 = true;
        setMeasuredDimension(size2, (int) (((i3 + 1) * min3) + ((size / i5) * min)));
        v08[] v08VarArr = this.f;
        if (v08VarArr == null || v08VarArr.length != size) {
            this.f = new v08[size];
            int i6 = 0;
            while (i6 < size) {
                this.f[i6] = new v08(this);
                if (b == b2) {
                    v08 v08Var = this.f[i6];
                    int i7 = this.h[i6];
                    v08Var.o = i7;
                    if (i7 < 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    v08Var.h = z;
                    if (i7 < 0) {
                        i4 = bkb.b8;
                    } else {
                        int[] iArr = bkb.q8;
                        i4 = iArr[i7 % iArr.length];
                    }
                    int v0 = bkb.v0(i4, this.a);
                    v08Var.g = false;
                    v08Var.f = false;
                    v08Var.a.setColor(v0);
                } else if (ea7Var != null) {
                    ArrayList arrayList = ea7Var.c;
                    if (i6 >= 0 && i6 < arrayList.size()) {
                        this.f[i6].o = ((da7) arrayList.get(i6)).c;
                        this.f[i6].a((da7) arrayList.get(i6));
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
                RectF rectF = gl.P;
                rectF.set(f5, f6, f5 + min, f6 + min);
                this.f[i8].p.set(rectF);
                rectF.inset((-min2) / 2.0f, (-min3) / 2.0f);
                this.f[i8].q.set(rectF);
                v08 v08Var2 = this.f[i8];
                if (v08Var2.o == this.s) {
                    z2 = z3;
                } else {
                    z2 = false;
                }
                v08Var2.m = z2;
                boolean z4 = z3;
                v08Var2.n.f(z2, z4);
                v08Var2.r.invalidate();
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

    public void setOnColorClick(p8c p8cVar) {
        this.w = p8cVar;
    }

    @Override
    public final void updateColors() {
        ea7 ea7Var;
        boolean z;
        int i;
        if (this.f == null) {
            return;
        }
        na7 q1 = na7.q1(this.d);
        byte b = this.c;
        if (b == 1) {
            ea7Var = q1.E3;
        } else {
            ea7Var = q1.F3;
        }
        int i2 = 0;
        while (true) {
            v08[] v08VarArr = this.f;
            if (i2 < v08VarArr.length) {
                wjb wjbVar = this.a;
                int[] iArr = this.h;
                if (b == 2) {
                    v08 v08Var = v08VarArr[i2];
                    int i3 = iArr[i2];
                    v08Var.o = i3;
                    if (i3 < 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    v08Var.h = z;
                    if (i3 < 0) {
                        i = bkb.b8;
                    } else {
                        int[] iArr2 = bkb.q8;
                        i = iArr2[i3 % iArr2.length];
                    }
                    int v0 = bkb.v0(i, wjbVar);
                    v08Var.g = false;
                    v08Var.f = false;
                    v08Var.a.setColor(v0);
                } else if (i2 < 7 && b == 1) {
                    v08 v08Var2 = v08VarArr[i2];
                    int i4 = iArr[i2];
                    v08Var2.o = i4;
                    int v02 = bkb.v0(bkb.q8[i4], wjbVar);
                    v08Var2.g = false;
                    v08Var2.f = false;
                    v08Var2.a.setColor(v02);
                } else if (ea7Var != null) {
                    ArrayList arrayList = ea7Var.c;
                    if (i2 >= 0 && i2 < arrayList.size()) {
                        this.f[i2].o = ((da7) arrayList.get(i2)).c;
                        this.f[i2].a((da7) arrayList.get(i2));
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
