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
public class pa9 extends TextureView {
    public boolean E;
    public oa9 a;
    public a9c b;
    public final nx7 c;
    public na9 d;
    public final bq5 e;
    public final cda f;
    public Bitmap h;
    public Bitmap n;
    public boolean r;
    public boolean s;
    public float w;
    public int x;
    public v01 y;

    public pa9(Context context, nx7 nx7Var, Bitmap bitmap, Bitmap bitmap2, tl0 tl0Var) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.n = bitmap2;
        this.c = nx7Var;
        nx7Var.f = this;
        setSurfaceTextureListener(new la9(this, tl0Var));
        this.e = new bq5(this);
        ja9 ja9Var = new ja9(this, (byte) 0);
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
        obj.b = ja9Var;
        paint2.setColor(-13840296);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint3.setColor(-1);
        paint3.setStrokeWidth(hl.L(1.0f));
        paint4.setColor(-16745729);
        paint5.setStyle(style);
        paint5.setColor(-1);
        paint5.setStrokeWidth(hl.L(1.0f));
        paint.setStyle(style);
        paint.setColor(-1);
        paint.setStrokeWidth(hl.L(0.8f));
        paint.setPathEffect(new DashPathEffect(new float[]{hl.L(8.0f), hl.L(8.0f)}, 0.0f));
        paint.setShadowLayer(4.0f, 0.0f, 1.5f, 1073741824);
        this.f = obj;
        nx7Var.a = new xh4(this, (byte) 29);
    }

    public final void a() {
        ja9 ja9Var = new ja9(this, (byte) 2);
        bq5 bq5Var = this.e;
        bq5Var.g = new vg8(bq5Var.a.getPainting().g.a, 0.0d, 1.0d);
        bq5Var.l = true;
        bq5Var.a(new Object(), false, ja9Var);
    }

    public final void b() {
        pa9 pa9Var;
        cda cdaVar = this.f;
        if (cdaVar != null && (pa9Var = cdaVar.a) != null && pa9Var.getPainting() != null && cdaVar.h != null) {
            nx7 painting = pa9Var.getPainting();
            painting.f.f(new kx7(painting, (byte) 0));
            cdaVar.m.clear();
            cdaVar.n.clear();
            cdaVar.h = null;
        }
    }

    public final Bitmap c(boolean z, boolean z2) {
        if (this.y instanceof u01) {
            this.f.e();
        }
        na9 na9Var = this.d;
        if (na9Var != null && na9Var.f) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                na9Var.postRunnable(new my6(na9Var, z, z2, bitmapArr, countDownLatch));
                countDownLatch.await();
            } catch (Exception e) {
                cc4.g(e, true);
            }
            return bitmapArr[0];
        }
        return null;
    }

    public final void d(Canvas canvas) {
        Canvas canvas2;
        tca tcaVar;
        if (this.y instanceof u01) {
            cda cdaVar = this.f;
            Paint paint = cdaVar.c;
            ArrayList arrayList = cdaVar.m;
            pa9 pa9Var = cdaVar.a;
            if (pa9Var != null && pa9Var.getPainting() != null) {
                qma qmaVar = pa9Var.getPainting().g;
                for (int i = 0; i < arrayList.size(); i++) {
                    bda bdaVar = (bda) arrayList.get(i);
                    if (bdaVar.c && !bdaVar.b) {
                        cdaVar.b(canvas, qmaVar, bdaVar);
                    }
                }
                tca tcaVar2 = cdaVar.h;
                if (tcaVar2 != null && tcaVar2.h != 0.0f) {
                    canvas.save();
                    canvas.rotate((float) (((-tcaVar.h) / 3.141592653589793d) * 180.0d), (cdaVar.h.b / qmaVar.a) * canvas.getWidth(), (cdaVar.h.c / qmaVar.b) * canvas.getHeight());
                }
                tca tcaVar3 = cdaVar.h;
                if (tcaVar3 != null && tcaVar3.a.n() == 4) {
                    canvas2 = canvas;
                    canvas2.drawLine(canvas.getWidth() * (cdaVar.h.b / qmaVar.a), canvas.getHeight() * (cdaVar.h.c / qmaVar.b), canvas.getWidth() * (cdaVar.h.i / qmaVar.a), canvas.getHeight() * (cdaVar.h.j / qmaVar.b), paint);
                    canvas2.drawLine(canvas2.getWidth() * (cdaVar.h.d / qmaVar.a), canvas2.getHeight() * (cdaVar.h.e / qmaVar.b), canvas2.getWidth() * (cdaVar.h.i / qmaVar.a), canvas2.getHeight() * (cdaVar.h.j / qmaVar.b), paint);
                } else {
                    canvas2 = canvas;
                }
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    bda bdaVar2 = (bda) arrayList.get(i2);
                    if (bdaVar2.c && bdaVar2.b) {
                        cdaVar.b(canvas2, qmaVar, bdaVar2);
                    }
                }
                tca tcaVar4 = cdaVar.h;
                if (tcaVar4 != null && tcaVar4.h != 0.0f) {
                    canvas2.restore();
                }
            }
        }
    }

    public final void e(android.view.MotionEvent r35) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pa9.e(android.view.MotionEvent):void");
    }

    public final void f(Runnable runnable) {
        na9 na9Var = this.d;
        if (na9Var == null) {
            return;
        }
        na9Var.postRunnable(new z09(this, runnable, (byte) 7));
    }

    public v01 getCurrentBrush() {
        return this.y;
    }

    public int getCurrentColor() {
        return this.x;
    }

    public float getCurrentWeight() {
        return this.w;
    }

    public nx7 getPainting() {
        return this.c;
    }

    public a9c getUndoStore() {
        return this.b;
    }

    public final void h() {
        this.E = true;
        if (this.d != null) {
            f(new ja9(this, (byte) 1));
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
        nx7 nx7Var = this.c;
        if (nx7Var != null) {
            f = getWidth() / nx7Var.g.a;
        } else {
            f = 1.0f;
        }
        if (f > 0.0f) {
            f2 = f;
        }
        qma qmaVar = getPainting().g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f2, -f2);
        matrix.preTranslate((-qmaVar.a) / 2.0f, (-qmaVar.b) / 2.0f);
        if (this.y instanceof u01) {
            cda cdaVar = this.f;
            cdaVar.getClass();
            Matrix matrix2 = new Matrix();
            cdaVar.o = matrix2;
            matrix.invert(matrix2);
        } else {
            bq5 bq5Var = this.e;
            bq5Var.getClass();
            Matrix matrix3 = new Matrix();
            bq5Var.t = matrix3;
            matrix.invert(matrix3);
        }
        na9 na9Var = this.d;
        nx7Var.y = gne.c(gne.b(na9Var.n, na9Var.r), gne.a(matrix));
    }

    public void setBrush(v01 v01Var) {
        boolean z = this.y instanceof u01;
        cda cdaVar = this.f;
        if (z) {
            cdaVar.e();
        }
        this.y = v01Var;
        i();
        this.c.q(this.y);
        v01 v01Var2 = this.y;
        if (v01Var2 instanceof u01) {
            int n = ((u01) v01Var2).n();
            ArrayList arrayList = cdaVar.n;
            ArrayList arrayList2 = cdaVar.m;
            pa9 pa9Var = cdaVar.a;
            if (pa9Var != null && pa9Var.getPainting() != null) {
                arrayList2.clear();
                arrayList.clear();
                cdaVar.h = new tca(u01.o(n));
                qma qmaVar = pa9Var.getPainting().g;
                tca tcaVar = cdaVar.h;
                float f = qmaVar.a;
                tcaVar.b = f / 2.0f;
                float f2 = qmaVar.b;
                tcaVar.c = f2 / 2.0f;
                float min = Math.min(f, f2) / 5.0f;
                tcaVar.e = min;
                tcaVar.d = min;
                cdaVar.h.f = pa9Var.getCurrentWeight();
                cdaVar.h.g = hl.L(32.0f);
                cdaVar.h.l = a78.e(yac.t0).k;
                if (cdaVar.h.a.n() == 4) {
                    tca tcaVar2 = cdaVar.h;
                    float f3 = qmaVar.a / 2.0f;
                    tcaVar2.d = f3;
                    tcaVar2.b = f3;
                    tcaVar2.i = f3 + 1.0f;
                    float f4 = qmaVar.b;
                    float f5 = f4 / 3.0f;
                    float f6 = 1.0f * f5;
                    tcaVar2.c = f6;
                    float f7 = f4 / 2.0f;
                    tcaVar2.j = f7;
                    tcaVar2.e = f5 * 2.0f;
                    tcaVar2.k = Math.abs(f6 - f7);
                    yca ycaVar = new yca(cdaVar, (byte) 0);
                    arrayList2.add(ycaVar);
                    zca zcaVar = new zca(cdaVar, ycaVar, (byte) 0);
                    arrayList2.add(zcaVar);
                    arrayList.add(zcaVar);
                    zca zcaVar2 = new zca(cdaVar, ycaVar, (byte) 1);
                    arrayList2.add(zcaVar2);
                    arrayList.add(zcaVar2);
                }
                if (cdaVar.h.a.n() == 0) {
                    arrayList2.add(new yca(cdaVar, (byte) 1));
                }
                if (cdaVar.h.a.n() == 2) {
                    arrayList2.add(new yca(cdaVar, (byte) 2));
                }
                if (cdaVar.h.a.n() == 1 || cdaVar.h.a.n() == 3) {
                    arrayList2.add(new ada(cdaVar, cdaVar.h, false, false));
                    arrayList2.add(new ada(cdaVar, cdaVar.h, true, false));
                    arrayList2.add(new ada(cdaVar, cdaVar.h, false, true));
                    arrayList2.add(new ada(cdaVar, cdaVar.h, true, true));
                    arrayList2.add(new yca(cdaVar, (byte) 3, false));
                }
                if (cdaVar.h.a.n() == 3) {
                    tca tcaVar3 = cdaVar.h;
                    tcaVar3.i = (tcaVar3.d * 0.8f) + tcaVar3.b;
                    tcaVar3.j = (tcaVar3.e * 1.2f) + tcaVar3.c + tcaVar3.f;
                    yca ycaVar2 = new yca(cdaVar, (byte) 4);
                    arrayList2.add(ycaVar2);
                    ycaVar2.b = false;
                    arrayList.add(ycaVar2);
                }
                cdaVar.l = new yca(cdaVar, (byte) 5, false);
                if (cdaVar.h.a.n() != 4) {
                    cdaVar.l.c = false;
                }
                yca ycaVar3 = cdaVar.l;
                ycaVar3.b = false;
                arrayList.add(ycaVar3);
                arrayList2.add(cdaVar.l);
                pa9Var.getPainting().k(cdaVar.h);
            }
        }
    }

    public void setBrushSize(float f) {
        float f2 = this.c.g.a;
        this.w = c00.x(f2, 0.043945312f, f, 0.00390625f * f2);
        if (this.y instanceof u01) {
            cda cdaVar = this.f;
            pa9 pa9Var = cdaVar.a;
            tca tcaVar = cdaVar.h;
            if (tcaVar != null && tcaVar.f != pa9Var.getCurrentWeight()) {
                cdaVar.h.f = pa9Var.getCurrentWeight();
                pa9Var.getPainting().k(cdaVar.h);
            }
        }
    }

    public void setColor(int i) {
        this.x = i;
        if (this.y instanceof u01) {
            cda cdaVar = this.f;
            if (cdaVar.h != null) {
                cdaVar.a.getPainting().k(cdaVar.h);
            }
        }
    }

    public void setDelegate(oa9 oa9Var) {
        this.a = oa9Var;
    }

    public void setUndoStore(a9c a9cVar) {
        this.b = a9cVar;
    }

    public void g(v01 v01Var) {
    }

    public void setQueue(uo3 uo3Var) {
    }
}
