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
    public final dda f;
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
        dda ddaVar = this.f;
        if (ddaVar != null && (pa9Var = ddaVar.a) != null && pa9Var.getPainting() != null && ddaVar.h != null) {
            nx7 painting = pa9Var.getPainting();
            painting.f.f(new kx7(painting, (byte) 0));
            ddaVar.m.clear();
            ddaVar.n.clear();
            ddaVar.h = null;
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
        uca ucaVar;
        if (this.y instanceof u01) {
            dda ddaVar = this.f;
            Paint paint = ddaVar.c;
            ArrayList arrayList = ddaVar.m;
            pa9 pa9Var = ddaVar.a;
            if (pa9Var != null && pa9Var.getPainting() != null) {
                qma qmaVar = pa9Var.getPainting().g;
                for (int i = 0; i < arrayList.size(); i++) {
                    cda cdaVar = (cda) arrayList.get(i);
                    if (cdaVar.c && !cdaVar.b) {
                        ddaVar.b(canvas, qmaVar, cdaVar);
                    }
                }
                uca ucaVar2 = ddaVar.h;
                if (ucaVar2 != null && ucaVar2.h != 0.0f) {
                    canvas.save();
                    canvas.rotate((float) (((-ucaVar.h) / 3.141592653589793d) * 180.0d), (ddaVar.h.b / qmaVar.a) * canvas.getWidth(), (ddaVar.h.c / qmaVar.b) * canvas.getHeight());
                }
                uca ucaVar3 = ddaVar.h;
                if (ucaVar3 != null && ucaVar3.a.n() == 4) {
                    canvas2 = canvas;
                    canvas2.drawLine(canvas.getWidth() * (ddaVar.h.b / qmaVar.a), canvas.getHeight() * (ddaVar.h.c / qmaVar.b), canvas.getWidth() * (ddaVar.h.i / qmaVar.a), canvas.getHeight() * (ddaVar.h.j / qmaVar.b), paint);
                    canvas2.drawLine(canvas2.getWidth() * (ddaVar.h.d / qmaVar.a), canvas2.getHeight() * (ddaVar.h.e / qmaVar.b), canvas2.getWidth() * (ddaVar.h.i / qmaVar.a), canvas2.getHeight() * (ddaVar.h.j / qmaVar.b), paint);
                } else {
                    canvas2 = canvas;
                }
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    cda cdaVar2 = (cda) arrayList.get(i2);
                    if (cdaVar2.c && cdaVar2.b) {
                        ddaVar.b(canvas2, qmaVar, cdaVar2);
                    }
                }
                uca ucaVar4 = ddaVar.h;
                if (ucaVar4 != null && ucaVar4.h != 0.0f) {
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
        na9Var.postRunnable(new yz8(this, runnable, (byte) 8));
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
            dda ddaVar = this.f;
            ddaVar.getClass();
            Matrix matrix2 = new Matrix();
            ddaVar.o = matrix2;
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
        dda ddaVar = this.f;
        if (z) {
            ddaVar.e();
        }
        this.y = v01Var;
        i();
        this.c.q(this.y);
        v01 v01Var2 = this.y;
        if (v01Var2 instanceof u01) {
            int n = ((u01) v01Var2).n();
            ArrayList arrayList = ddaVar.n;
            ArrayList arrayList2 = ddaVar.m;
            pa9 pa9Var = ddaVar.a;
            if (pa9Var != null && pa9Var.getPainting() != null) {
                arrayList2.clear();
                arrayList.clear();
                ddaVar.h = new uca(u01.o(n));
                qma qmaVar = pa9Var.getPainting().g;
                uca ucaVar = ddaVar.h;
                float f = qmaVar.a;
                ucaVar.b = f / 2.0f;
                float f2 = qmaVar.b;
                ucaVar.c = f2 / 2.0f;
                float min = Math.min(f, f2) / 5.0f;
                ucaVar.e = min;
                ucaVar.d = min;
                ddaVar.h.f = pa9Var.getCurrentWeight();
                ddaVar.h.g = hl.L(32.0f);
                ddaVar.h.l = a78.e(yac.t0).k;
                if (ddaVar.h.a.n() == 4) {
                    uca ucaVar2 = ddaVar.h;
                    float f3 = qmaVar.a / 2.0f;
                    ucaVar2.d = f3;
                    ucaVar2.b = f3;
                    ucaVar2.i = f3 + 1.0f;
                    float f4 = qmaVar.b;
                    float f5 = f4 / 3.0f;
                    float f6 = 1.0f * f5;
                    ucaVar2.c = f6;
                    float f7 = f4 / 2.0f;
                    ucaVar2.j = f7;
                    ucaVar2.e = f5 * 2.0f;
                    ucaVar2.k = Math.abs(f6 - f7);
                    zca zcaVar = new zca(ddaVar, (byte) 0);
                    arrayList2.add(zcaVar);
                    ada adaVar = new ada(ddaVar, zcaVar, (byte) 0);
                    arrayList2.add(adaVar);
                    arrayList.add(adaVar);
                    ada adaVar2 = new ada(ddaVar, zcaVar, (byte) 1);
                    arrayList2.add(adaVar2);
                    arrayList.add(adaVar2);
                }
                if (ddaVar.h.a.n() == 0) {
                    arrayList2.add(new zca(ddaVar, (byte) 1));
                }
                if (ddaVar.h.a.n() == 2) {
                    arrayList2.add(new zca(ddaVar, (byte) 2));
                }
                if (ddaVar.h.a.n() == 1 || ddaVar.h.a.n() == 3) {
                    arrayList2.add(new bda(ddaVar, ddaVar.h, false, false));
                    arrayList2.add(new bda(ddaVar, ddaVar.h, true, false));
                    arrayList2.add(new bda(ddaVar, ddaVar.h, false, true));
                    arrayList2.add(new bda(ddaVar, ddaVar.h, true, true));
                    arrayList2.add(new zca(ddaVar, (byte) 3, false));
                }
                if (ddaVar.h.a.n() == 3) {
                    uca ucaVar3 = ddaVar.h;
                    ucaVar3.i = (ucaVar3.d * 0.8f) + ucaVar3.b;
                    ucaVar3.j = (ucaVar3.e * 1.2f) + ucaVar3.c + ucaVar3.f;
                    zca zcaVar2 = new zca(ddaVar, (byte) 4);
                    arrayList2.add(zcaVar2);
                    zcaVar2.b = false;
                    arrayList.add(zcaVar2);
                }
                ddaVar.l = new zca(ddaVar, (byte) 5, false);
                if (ddaVar.h.a.n() != 4) {
                    ddaVar.l.c = false;
                }
                zca zcaVar3 = ddaVar.l;
                zcaVar3.b = false;
                arrayList.add(zcaVar3);
                arrayList2.add(ddaVar.l);
                pa9Var.getPainting().k(ddaVar.h);
            }
        }
    }

    public void setBrushSize(float f) {
        float f2 = this.c.g.a;
        this.w = c00.x(f2, 0.043945312f, f, 0.00390625f * f2);
        if (this.y instanceof u01) {
            dda ddaVar = this.f;
            pa9 pa9Var = ddaVar.a;
            uca ucaVar = ddaVar.h;
            if (ucaVar != null && ucaVar.f != pa9Var.getCurrentWeight()) {
                ddaVar.h.f = pa9Var.getCurrentWeight();
                pa9Var.getPainting().k(ddaVar.h);
            }
        }
    }

    public void setColor(int i) {
        this.x = i;
        if (this.y instanceof u01) {
            dda ddaVar = this.f;
            if (ddaVar.h != null) {
                ddaVar.a.getPainting().k(ddaVar.h);
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
