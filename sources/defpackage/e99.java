package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
public class e99 extends TextureView {
    public boolean E;
    public d99 a;
    public b7c b;
    public final hw7 c;
    public c99 d;
    public final yp5 e;
    public final mba f;
    public Bitmap h;
    public Bitmap n;
    public boolean r;
    public boolean s;
    public float w;
    public int x;
    public u11 y;

    public e99(Context context, hw7 hw7Var, Bitmap bitmap, Bitmap bitmap2, sm0 sm0Var) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.n = bitmap2;
        this.c = hw7Var;
        hw7Var.f = this;
        setSurfaceTextureListener(new a99(this, sm0Var));
        this.e = new yp5(this);
        y89 y89Var = new y89(this, (byte) 0);
        ?? obj = new Object();
        Paint paint = new Paint(1);
        obj.c = paint;
        Paint paint2 = new Paint(1);
        obj.d = paint2;
        Paint paint3 = new Paint(1);
        obj.e = paint3;
        Paint paint4 = new Paint(1);
        obj.f = paint4;
        Paint paint5 = new Paint(1);
        obj.g = paint5;
        obj.m = new ArrayList();
        obj.n = new ArrayList();
        obj.p = new float[2];
        obj.a = this;
        obj.b = y89Var;
        paint2.setColor(-13840296);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint3.setColor(-1);
        paint3.setStrokeWidth(gm.L(1.0f));
        paint4.setColor(-16745729);
        paint5.setStyle(style);
        paint5.setColor(-1);
        paint5.setStrokeWidth(gm.L(1.0f));
        paint.setStyle(style);
        paint.setColor(-1);
        paint.setStrokeWidth(gm.L(0.8f));
        paint.setPathEffect(new DashPathEffect(new float[]{gm.L(8.0f), gm.L(8.0f)}, 0.0f));
        paint.setShadowLayer(4.0f, 0.0f, 1.5f, 1073741824);
        this.f = obj;
        hw7Var.a = new x59(this, (byte) 2);
    }

    public final void a() {
        y89 y89Var = new y89(this, (byte) 2);
        yp5 yp5Var = this.e;
        yp5Var.g = new jf8(yp5Var.a.getPainting().g.a, 0.0d, 1.0d);
        yp5Var.l = true;
        yp5Var.a(new Object(), false, y89Var);
    }

    public final void b() {
        e99 e99Var;
        mba mbaVar = this.f;
        if (mbaVar != null && (e99Var = mbaVar.a) != null && e99Var.getPainting() != null && mbaVar.h != null) {
            hw7 painting = e99Var.getPainting();
            painting.f.f(new ew7(painting, (byte) 0));
            mbaVar.m.clear();
            mbaVar.n.clear();
            mbaVar.h = null;
        }
    }

    public final Bitmap c(boolean z, boolean z2) {
        if (this.y instanceof t11) {
            this.f.e();
        }
        c99 c99Var = this.d;
        if (c99Var != null && c99Var.f) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                c99Var.postRunnable(new hy6(c99Var, z, z2, bitmapArr, countDownLatch));
                countDownLatch.await();
            } catch (Exception e) {
                fc4.g(e, true);
            }
            return bitmapArr[0];
        }
        return null;
    }

    public final void d(Canvas canvas) {
        Canvas canvas2;
        dba dbaVar;
        if (this.y instanceof t11) {
            mba mbaVar = this.f;
            Paint paint = mbaVar.c;
            ArrayList arrayList = mbaVar.m;
            e99 e99Var = mbaVar.a;
            if (e99Var != null && e99Var.getPainting() != null) {
                xka xkaVar = e99Var.getPainting().g;
                for (int i = 0; i < arrayList.size(); i++) {
                    lba lbaVar = (lba) arrayList.get(i);
                    if (lbaVar.c && !lbaVar.b) {
                        mbaVar.b(canvas, xkaVar, lbaVar);
                    }
                }
                dba dbaVar2 = mbaVar.h;
                if (dbaVar2 != null && dbaVar2.h != 0.0f) {
                    canvas.save();
                    canvas.rotate((float) (((-dbaVar.h) / 3.141592653589793d) * 180.0d), (mbaVar.h.b / xkaVar.a) * canvas.getWidth(), (mbaVar.h.c / xkaVar.b) * canvas.getHeight());
                }
                dba dbaVar3 = mbaVar.h;
                if (dbaVar3 != null && dbaVar3.a.n() == 4) {
                    canvas2 = canvas;
                    canvas2.drawLine(canvas.getWidth() * (mbaVar.h.b / xkaVar.a), canvas.getHeight() * (mbaVar.h.c / xkaVar.b), canvas.getWidth() * (mbaVar.h.i / xkaVar.a), canvas.getHeight() * (mbaVar.h.j / xkaVar.b), paint);
                    canvas2.drawLine(canvas2.getWidth() * (mbaVar.h.d / xkaVar.a), canvas2.getHeight() * (mbaVar.h.e / xkaVar.b), canvas2.getWidth() * (mbaVar.h.i / xkaVar.a), canvas2.getHeight() * (mbaVar.h.j / xkaVar.b), paint);
                } else {
                    canvas2 = canvas;
                }
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    lba lbaVar2 = (lba) arrayList.get(i2);
                    if (lbaVar2.c && lbaVar2.b) {
                        mbaVar.b(canvas2, xkaVar, lbaVar2);
                    }
                }
                dba dbaVar4 = mbaVar.h;
                if (dbaVar4 != null && dbaVar4.h != 0.0f) {
                    canvas2.restore();
                }
            }
        }
    }

    public final void e(android.view.MotionEvent r35) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e99.e(android.view.MotionEvent):void");
    }

    public final void f(Runnable runnable) {
        c99 c99Var = this.d;
        if (c99Var == null) {
            return;
        }
        c99Var.postRunnable(new ey8(this, runnable, (byte) 11));
    }

    public u11 getCurrentBrush() {
        return this.y;
    }

    public int getCurrentColor() {
        return this.x;
    }

    public float getCurrentWeight() {
        return this.w;
    }

    public hw7 getPainting() {
        return this.c;
    }

    public b7c getUndoStore() {
        return this.b;
    }

    public final void h() {
        this.E = true;
        if (this.d != null) {
            f(new y89(this, (byte) 1));
        }
        setVisibility(8);
    }

    public final void i() {
        float f;
        if (this.d == null) {
            return;
        }
        Matrix matrix = new Matrix();
        float f2 = 1.0f;
        hw7 hw7Var = this.c;
        if (hw7Var != null) {
            f = getWidth() / hw7Var.g.a;
        } else {
            f = 1.0f;
        }
        if (f > 0.0f) {
            f2 = f;
        }
        xka xkaVar = getPainting().g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f2, -f2);
        matrix.preTranslate((-xkaVar.a) / 2.0f, (-xkaVar.b) / 2.0f);
        if (this.y instanceof t11) {
            mba mbaVar = this.f;
            mbaVar.getClass();
            Matrix matrix2 = new Matrix();
            mbaVar.o = matrix2;
            matrix.invert(matrix2);
        } else {
            yp5 yp5Var = this.e;
            yp5Var.getClass();
            Matrix matrix3 = new Matrix();
            yp5Var.t = matrix3;
            matrix.invert(matrix3);
        }
        c99 c99Var = this.d;
        hw7Var.y = pke.c(pke.b(c99Var.n, c99Var.r), pke.a(matrix));
    }

    public void setBrush(u11 u11Var) {
        boolean z = this.y instanceof t11;
        mba mbaVar = this.f;
        if (z) {
            mbaVar.e();
        }
        this.y = u11Var;
        i();
        this.c.q(this.y);
        u11 u11Var2 = this.y;
        if (u11Var2 instanceof t11) {
            int n = ((t11) u11Var2).n();
            ArrayList arrayList = mbaVar.n;
            ArrayList arrayList2 = mbaVar.m;
            e99 e99Var = mbaVar.a;
            if (e99Var != null && e99Var.getPainting() != null) {
                arrayList2.clear();
                arrayList.clear();
                mbaVar.h = new dba(t11.o(n));
                xka xkaVar = e99Var.getPainting().g;
                dba dbaVar = mbaVar.h;
                float f = xkaVar.a;
                dbaVar.b = f / 2.0f;
                float f2 = xkaVar.b;
                dbaVar.c = f2 / 2.0f;
                float min = Math.min(f, f2) / 5.0f;
                dbaVar.e = min;
                dbaVar.d = min;
                mbaVar.h.f = e99Var.getCurrentWeight();
                mbaVar.h.g = gm.L(32.0f);
                mbaVar.h.l = m58.e(z8c.t0).k;
                if (mbaVar.h.a.n() == 4) {
                    dba dbaVar2 = mbaVar.h;
                    float f3 = xkaVar.a / 2.0f;
                    dbaVar2.d = f3;
                    dbaVar2.b = f3;
                    dbaVar2.i = f3 + 1.0f;
                    float f4 = xkaVar.b;
                    float f5 = f4 / 3.0f;
                    float f6 = 1.0f * f5;
                    dbaVar2.c = f6;
                    float f7 = f4 / 2.0f;
                    dbaVar2.j = f7;
                    dbaVar2.e = f5 * 2.0f;
                    dbaVar2.k = Math.abs(f6 - f7);
                    iba ibaVar = new iba(mbaVar, (byte) 0);
                    arrayList2.add(ibaVar);
                    jba jbaVar = new jba(mbaVar, ibaVar, (byte) 0);
                    arrayList2.add(jbaVar);
                    arrayList.add(jbaVar);
                    jba jbaVar2 = new jba(mbaVar, ibaVar, (byte) 1);
                    arrayList2.add(jbaVar2);
                    arrayList.add(jbaVar2);
                }
                if (mbaVar.h.a.n() == 0) {
                    arrayList2.add(new iba(mbaVar, (byte) 1));
                }
                if (mbaVar.h.a.n() == 2) {
                    arrayList2.add(new iba(mbaVar, (byte) 2));
                }
                if (mbaVar.h.a.n() == 1 || mbaVar.h.a.n() == 3) {
                    arrayList2.add(new kba(mbaVar, mbaVar.h, false, false));
                    arrayList2.add(new kba(mbaVar, mbaVar.h, true, false));
                    arrayList2.add(new kba(mbaVar, mbaVar.h, false, true));
                    arrayList2.add(new kba(mbaVar, mbaVar.h, true, true));
                    arrayList2.add(new iba(mbaVar, (byte) 3, false));
                }
                if (mbaVar.h.a.n() == 3) {
                    dba dbaVar3 = mbaVar.h;
                    dbaVar3.i = (dbaVar3.d * 0.8f) + dbaVar3.b;
                    dbaVar3.j = (dbaVar3.e * 1.2f) + dbaVar3.c + dbaVar3.f;
                    iba ibaVar2 = new iba(mbaVar, (byte) 4);
                    arrayList2.add(ibaVar2);
                    ibaVar2.b = false;
                    arrayList.add(ibaVar2);
                }
                mbaVar.l = new iba(mbaVar, (byte) 5, false);
                if (mbaVar.h.a.n() != 4) {
                    mbaVar.l.c = false;
                }
                iba ibaVar3 = mbaVar.l;
                ibaVar3.b = false;
                arrayList.add(ibaVar3);
                arrayList2.add(mbaVar.l);
                e99Var.getPainting().k(mbaVar.h);
            }
        }
    }

    public void setBrushSize(float f) {
        float f2 = this.c.g.a;
        this.w = b10.w(f2, 0.043945312f, f, 0.00390625f * f2);
        if (this.y instanceof t11) {
            mba mbaVar = this.f;
            e99 e99Var = mbaVar.a;
            dba dbaVar = mbaVar.h;
            if (dbaVar != null && dbaVar.f != e99Var.getCurrentWeight()) {
                mbaVar.h.f = e99Var.getCurrentWeight();
                e99Var.getPainting().k(mbaVar.h);
            }
        }
    }

    public void setColor(int i) {
        this.x = i;
        if (this.y instanceof t11) {
            mba mbaVar = this.f;
            if (mbaVar.h != null) {
                mbaVar.a.getPainting().k(mbaVar.h);
            }
        }
    }

    public void setDelegate(d99 d99Var) {
        this.a = d99Var;
    }

    public void setUndoStore(b7c b7cVar) {
        this.b = b7cVar;
    }

    public void g(u11 u11Var) {
    }

    public void setQueue(np3 np3Var) {
    }
}
