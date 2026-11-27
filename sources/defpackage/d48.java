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
public final class d48 extends View implements snb {
    public final vnb a;
    public final Paint b;
    public final byte c;
    public final int d;
    public boolean e;
    public c48[] f;
    public final int[] h;
    public final Paint n;
    public boolean r;
    public int s;
    public pcc w;
    public c48 x;

    public d48(int i, int i2, vnb vnbVar, Context context) {
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
        this.a = vnbVar;
    }

    public final void a(int i, boolean z) {
        boolean z2;
        this.s = i;
        if (this.f != null) {
            int i2 = 0;
            while (true) {
                c48[] c48VarArr = this.f;
                if (i2 < c48VarArr.length) {
                    c48 c48Var = c48VarArr[i2];
                    if (c48Var.o == i) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c48Var.m = z2;
                    if (!z) {
                        c48Var.n.f(z2, true);
                    }
                    c48Var.r.invalidate();
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
                c48[] c48VarArr = this.f;
                if (i >= c48VarArr.length) {
                    break;
                }
                c48 c48Var = c48VarArr[i];
                d48 d48Var = c48Var.r;
                Path path = c48Var.e;
                canvas.save();
                float a = c48Var.l.a(0.05f);
                RectF rectF = c48Var.p;
                canvas.scale(a, a, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = c48Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(c48Var.a);
                if (c48Var.f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, c48Var.b);
                }
                canvas.restore();
                if (c48Var.g) {
                    canvas.save();
                    RectF rectF2 = hl.P;
                    float width = (rectF.width() * 0.315f) / 2.0f;
                    rectF2.set(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, hl.L(2.33f), hl.L(2.33f), c48Var.c);
                    canvas.restore();
                }
                float d = c48Var.n.d(c48Var.m);
                if (d > 0.0f) {
                    Paint paint = d48Var.b;
                    paint.setStrokeWidth(hl.N(2.0f));
                    paint.setColor(aob.v0(aob.d6, d48Var.a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (hl.R1(0.5f, -2.0f, d) * paint.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint);
                }
                if (c48Var.h) {
                    if (d48Var.e) {
                        if (c48Var.k == null) {
                            Drawable drawable = d48Var.getContext().getResources().getDrawable(2131232248);
                            c48Var.k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        c48Var.k.setBounds((int) uh9.x(c48Var.k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) uh9.x(c48Var.k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) c00.B(c48Var.k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) c00.B(c48Var.k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        c48Var.k.draw(canvas);
                    } else {
                        if (c48Var.i == null) {
                            c48Var.i = new Path();
                        }
                        if (c48Var.j == null) {
                            Paint paint2 = new Paint(1);
                            c48Var.j = paint2;
                            paint2.setColor(-1);
                            c48Var.j.setStyle(Paint.Style.STROKE);
                            c48Var.j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        c48Var.j.setStrokeWidth(hl.L(2.0f));
                        c48Var.i.rewind();
                        float U1 = hl.U1(d, hl.L(5.0f), hl.L(4.0f));
                        c48Var.i.moveTo(rectF.centerX() - U1, rectF.centerY() - U1);
                        c48Var.i.lineTo(rectF.centerX() + U1, rectF.centerY() + U1);
                        c48Var.i.moveTo(rectF.centerX() + U1, rectF.centerY() - U1);
                        c48Var.i.lineTo(rectF.centerX() - U1, rectF.centerY() + U1);
                        canvas.drawPath(c48Var.i, c48Var.j);
                    }
                }
                canvas.restore();
                i++;
            }
        }
        if (this.r) {
            int v0 = aob.v0(aob.d7, this.a);
            Paint paint3 = this.n;
            paint3.setColor(v0);
            canvas.drawRect(hl.L(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - hl.L(21.0f), getMeasuredHeight(), paint3);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d48.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int getColorId() {
        return this.s;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        lc7 lc7Var;
        int size;
        int i3;
        boolean z;
        int i4;
        boolean z2;
        int size2 = View.MeasureSpec.getSize(i);
        uc7 s1 = uc7.s1(this.d);
        byte b = this.c;
        if (b == 1) {
            lc7Var = s1.E3;
        } else {
            lc7Var = s1.F3;
        }
        if (lc7Var == null) {
            size = 0;
        } else {
            size = lc7Var.c.size();
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
        float min = Math.min(hl.L(54.0f), f / ((f3 * 0.28947f) + f2));
        float min2 = Math.min(0.28947f * min, hl.L(8.0f));
        float min3 = Math.min(0.31578946f * min, hl.L(11.33f));
        boolean z3 = true;
        setMeasuredDimension(size2, (int) (((i3 + 1) * min3) + ((size / i5) * min)));
        c48[] c48VarArr = this.f;
        if (c48VarArr == null || c48VarArr.length != size) {
            this.f = new c48[size];
            int i6 = 0;
            while (i6 < size) {
                this.f[i6] = new c48(this);
                if (b == b2) {
                    c48 c48Var = this.f[i6];
                    int i7 = this.h[i6];
                    c48Var.o = i7;
                    if (i7 < 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c48Var.h = z;
                    if (i7 < 0) {
                        i4 = aob.c8;
                    } else {
                        int[] iArr = aob.r8;
                        i4 = iArr[i7 % iArr.length];
                    }
                    int v0 = aob.v0(i4, this.a);
                    c48Var.g = false;
                    c48Var.f = false;
                    c48Var.a.setColor(v0);
                } else if (lc7Var != null) {
                    ArrayList arrayList = lc7Var.c;
                    if (i6 >= 0 && i6 < arrayList.size()) {
                        this.f[i6].o = ((kc7) arrayList.get(i6)).c;
                        this.f[i6].a((kc7) arrayList.get(i6));
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
                RectF rectF = hl.P;
                rectF.set(f5, f6, f5 + min, f6 + min);
                this.f[i8].p.set(rectF);
                rectF.inset((-min2) / 2.0f, (-min3) / 2.0f);
                this.f[i8].q.set(rectF);
                c48 c48Var2 = this.f[i8];
                if (c48Var2.o == this.s) {
                    z2 = z3;
                } else {
                    z2 = false;
                }
                c48Var2.m = z2;
                boolean z4 = z3;
                c48Var2.n.f(z2, z4);
                c48Var2.r.invalidate();
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

    public void setOnColorClick(pcc pccVar) {
        this.w = pccVar;
    }

    @Override
    public final void updateColors() {
        lc7 lc7Var;
        boolean z;
        int i;
        if (this.f == null) {
            return;
        }
        uc7 s1 = uc7.s1(this.d);
        byte b = this.c;
        if (b == 1) {
            lc7Var = s1.E3;
        } else {
            lc7Var = s1.F3;
        }
        int i2 = 0;
        while (true) {
            c48[] c48VarArr = this.f;
            if (i2 < c48VarArr.length) {
                vnb vnbVar = this.a;
                int[] iArr = this.h;
                if (b == 2) {
                    c48 c48Var = c48VarArr[i2];
                    int i3 = iArr[i2];
                    c48Var.o = i3;
                    if (i3 < 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c48Var.h = z;
                    if (i3 < 0) {
                        i = aob.c8;
                    } else {
                        int[] iArr2 = aob.r8;
                        i = iArr2[i3 % iArr2.length];
                    }
                    int v0 = aob.v0(i, vnbVar);
                    c48Var.g = false;
                    c48Var.f = false;
                    c48Var.a.setColor(v0);
                } else if (i2 < 7 && b == 1) {
                    c48 c48Var2 = c48VarArr[i2];
                    int i4 = iArr[i2];
                    c48Var2.o = i4;
                    int v02 = aob.v0(aob.r8[i4], vnbVar);
                    c48Var2.g = false;
                    c48Var2.f = false;
                    c48Var2.a.setColor(v02);
                } else if (lc7Var != null) {
                    ArrayList arrayList = lc7Var.c;
                    if (i2 >= 0 && i2 < arrayList.size()) {
                        this.f[i2].o = ((kc7) arrayList.get(i2)).c;
                        this.f[i2].a((kc7) arrayList.get(i2));
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
