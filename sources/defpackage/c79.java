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
public class c79 extends TextureView {
    public boolean E;
    public b79 a;
    public b5c b;
    public final gu7 c;
    public a79 d;
    public final yn5 e;
    public final m9a f;
    public Bitmap h;
    public Bitmap n;
    public boolean r;
    public boolean s;
    public float w;
    public int x;
    public m01 y;

    public c79(Context context, gu7 gu7Var, Bitmap bitmap, Bitmap bitmap2, sl0 sl0Var) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.n = bitmap2;
        this.c = gu7Var;
        gu7Var.f = this;
        setSurfaceTextureListener(new y69(this, sl0Var));
        this.e = new yn5(this);
        w69 w69Var = new w69(this, (byte) 0);
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
        obj.b = w69Var;
        paint2.setColor(-13840296);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint3.setColor(-1);
        paint3.setStrokeWidth(gl.L(1.0f));
        paint4.setColor(-16745729);
        paint5.setStyle(style);
        paint5.setColor(-1);
        paint5.setStrokeWidth(gl.L(1.0f));
        paint.setStyle(style);
        paint.setColor(-1);
        paint.setStrokeWidth(gl.L(0.8f));
        paint.setPathEffect(new DashPathEffect(new float[]{gl.L(8.0f), gl.L(8.0f)}, 0.0f));
        paint.setShadowLayer(4.0f, 0.0f, 1.5f, 1073741824);
        this.f = obj;
        gu7Var.a = new u39(this, (byte) 2);
    }

    public final void a() {
        w69 w69Var = new w69(this, (byte) 2);
        yn5 yn5Var = this.e;
        yn5Var.g = new hd8(yn5Var.a.getPainting().g.a, 0.0d, 1.0d);
        yn5Var.l = true;
        yn5Var.a(new Object(), false, w69Var);
    }

    public final void b() {
        c79 c79Var;
        m9a m9aVar = this.f;
        if (m9aVar != null && (c79Var = m9aVar.a) != null && c79Var.getPainting() != null && m9aVar.h != null) {
            gu7 painting = c79Var.getPainting();
            painting.f.f(new du7(painting, (byte) 0));
            m9aVar.m.clear();
            m9aVar.n.clear();
            m9aVar.h = null;
        }
    }

    public final Bitmap c(boolean z, boolean z2) {
        if (this.y instanceof l01) {
            this.f.e();
        }
        a79 a79Var = this.d;
        if (a79Var != null && a79Var.f) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                a79Var.postRunnable(new hw6(a79Var, z, z2, bitmapArr, countDownLatch));
                countDownLatch.await();
            } catch (Exception e) {
                fa4.g(e, true);
            }
            return bitmapArr[0];
        }
        return null;
    }

    public final void d(Canvas canvas) {
        Canvas canvas2;
        d9a d9aVar;
        if (this.y instanceof l01) {
            m9a m9aVar = this.f;
            Paint paint = m9aVar.c;
            ArrayList arrayList = m9aVar.m;
            c79 c79Var = m9aVar.a;
            if (c79Var != null && c79Var.getPainting() != null) {
                via viaVar = c79Var.getPainting().g;
                for (int i = 0; i < arrayList.size(); i++) {
                    l9a l9aVar = (l9a) arrayList.get(i);
                    if (l9aVar.c && !l9aVar.b) {
                        m9aVar.b(canvas, viaVar, l9aVar);
                    }
                }
                d9a d9aVar2 = m9aVar.h;
                if (d9aVar2 != null && d9aVar2.h != 0.0f) {
                    canvas.save();
                    canvas.rotate((float) (((-d9aVar.h) / 3.141592653589793d) * 180.0d), (m9aVar.h.b / viaVar.a) * canvas.getWidth(), (m9aVar.h.c / viaVar.b) * canvas.getHeight());
                }
                d9a d9aVar3 = m9aVar.h;
                if (d9aVar3 != null && d9aVar3.a.n() == 4) {
                    canvas2 = canvas;
                    canvas2.drawLine(canvas.getWidth() * (m9aVar.h.b / viaVar.a), canvas.getHeight() * (m9aVar.h.c / viaVar.b), canvas.getWidth() * (m9aVar.h.i / viaVar.a), canvas.getHeight() * (m9aVar.h.j / viaVar.b), paint);
                    canvas2.drawLine(canvas2.getWidth() * (m9aVar.h.d / viaVar.a), canvas2.getHeight() * (m9aVar.h.e / viaVar.b), canvas2.getWidth() * (m9aVar.h.i / viaVar.a), canvas2.getHeight() * (m9aVar.h.j / viaVar.b), paint);
                } else {
                    canvas2 = canvas;
                }
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    l9a l9aVar2 = (l9a) arrayList.get(i2);
                    if (l9aVar2.c && l9aVar2.b) {
                        m9aVar.b(canvas2, viaVar, l9aVar2);
                    }
                }
                d9a d9aVar4 = m9aVar.h;
                if (d9aVar4 != null && d9aVar4.h != 0.0f) {
                    canvas2.restore();
                }
            }
        }
    }

    public final void e(android.view.MotionEvent r35) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c79.e(android.view.MotionEvent):void");
    }

    public final void f(Runnable runnable) {
        a79 a79Var = this.d;
        if (a79Var == null) {
            return;
        }
        a79Var.postRunnable(new lw8(this, runnable, (byte) 9));
    }

    public m01 getCurrentBrush() {
        return this.y;
    }

    public int getCurrentColor() {
        return this.x;
    }

    public float getCurrentWeight() {
        return this.w;
    }

    public gu7 getPainting() {
        return this.c;
    }

    public b5c getUndoStore() {
        return this.b;
    }

    public final void h() {
        this.E = true;
        if (this.d != null) {
            f(new w69(this, (byte) 1));
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
        gu7 gu7Var = this.c;
        if (gu7Var != null) {
            f = getWidth() / gu7Var.g.a;
        } else {
            f = 1.0f;
        }
        if (f > 0.0f) {
            f2 = f;
        }
        via viaVar = getPainting().g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f2, -f2);
        matrix.preTranslate((-viaVar.a) / 2.0f, (-viaVar.b) / 2.0f);
        if (this.y instanceof l01) {
            m9a m9aVar = this.f;
            m9aVar.getClass();
            Matrix matrix2 = new Matrix();
            m9aVar.o = matrix2;
            matrix.invert(matrix2);
        } else {
            yn5 yn5Var = this.e;
            yn5Var.getClass();
            Matrix matrix3 = new Matrix();
            yn5Var.t = matrix3;
            matrix.invert(matrix3);
        }
        a79 a79Var = this.d;
        gu7Var.y = oie.c(oie.b(a79Var.n, a79Var.r), oie.a(matrix));
    }

    public void setBrush(m01 m01Var) {
        boolean z = this.y instanceof l01;
        m9a m9aVar = this.f;
        if (z) {
            m9aVar.e();
        }
        this.y = m01Var;
        i();
        this.c.q(this.y);
        m01 m01Var2 = this.y;
        if (m01Var2 instanceof l01) {
            int n = ((l01) m01Var2).n();
            ArrayList arrayList = m9aVar.n;
            ArrayList arrayList2 = m9aVar.m;
            c79 c79Var = m9aVar.a;
            if (c79Var != null && c79Var.getPainting() != null) {
                arrayList2.clear();
                arrayList.clear();
                m9aVar.h = new d9a(l01.o(n));
                via viaVar = c79Var.getPainting().g;
                d9a d9aVar = m9aVar.h;
                float f = viaVar.a;
                d9aVar.b = f / 2.0f;
                float f2 = viaVar.b;
                d9aVar.c = f2 / 2.0f;
                float min = Math.min(f, f2) / 5.0f;
                d9aVar.e = min;
                d9aVar.d = min;
                m9aVar.h.f = c79Var.getCurrentWeight();
                m9aVar.h.g = gl.L(32.0f);
                m9aVar.h.l = k38.e(y6c.t0).k;
                if (m9aVar.h.a.n() == 4) {
                    d9a d9aVar2 = m9aVar.h;
                    float f3 = viaVar.a / 2.0f;
                    d9aVar2.d = f3;
                    d9aVar2.b = f3;
                    d9aVar2.i = f3 + 1.0f;
                    float f4 = viaVar.b;
                    float f5 = f4 / 3.0f;
                    float f6 = 1.0f * f5;
                    d9aVar2.c = f6;
                    float f7 = f4 / 2.0f;
                    d9aVar2.j = f7;
                    d9aVar2.e = f5 * 2.0f;
                    d9aVar2.k = Math.abs(f6 - f7);
                    i9a i9aVar = new i9a(m9aVar, (byte) 0);
                    arrayList2.add(i9aVar);
                    j9a j9aVar = new j9a(m9aVar, i9aVar, (byte) 0);
                    arrayList2.add(j9aVar);
                    arrayList.add(j9aVar);
                    j9a j9aVar2 = new j9a(m9aVar, i9aVar, (byte) 1);
                    arrayList2.add(j9aVar2);
                    arrayList.add(j9aVar2);
                }
                if (m9aVar.h.a.n() == 0) {
                    arrayList2.add(new i9a(m9aVar, (byte) 1));
                }
                if (m9aVar.h.a.n() == 2) {
                    arrayList2.add(new i9a(m9aVar, (byte) 2));
                }
                if (m9aVar.h.a.n() == 1 || m9aVar.h.a.n() == 3) {
                    arrayList2.add(new k9a(m9aVar, m9aVar.h, false, false));
                    arrayList2.add(new k9a(m9aVar, m9aVar.h, true, false));
                    arrayList2.add(new k9a(m9aVar, m9aVar.h, false, true));
                    arrayList2.add(new k9a(m9aVar, m9aVar.h, true, true));
                    arrayList2.add(new i9a(m9aVar, (byte) 3, false));
                }
                if (m9aVar.h.a.n() == 3) {
                    d9a d9aVar3 = m9aVar.h;
                    d9aVar3.i = (d9aVar3.d * 0.8f) + d9aVar3.b;
                    d9aVar3.j = (d9aVar3.e * 1.2f) + d9aVar3.c + d9aVar3.f;
                    i9a i9aVar2 = new i9a(m9aVar, (byte) 4);
                    arrayList2.add(i9aVar2);
                    i9aVar2.b = false;
                    arrayList.add(i9aVar2);
                }
                m9aVar.l = new i9a(m9aVar, (byte) 5, false);
                if (m9aVar.h.a.n() != 4) {
                    m9aVar.l.c = false;
                }
                i9a i9aVar3 = m9aVar.l;
                i9aVar3.b = false;
                arrayList.add(i9aVar3);
                arrayList2.add(m9aVar.l);
                c79Var.getPainting().k(m9aVar.h);
            }
        }
    }

    public void setBrushSize(float f) {
        float f2 = this.c.g.a;
        this.w = b00.w(f2, 0.043945312f, f, 0.00390625f * f2);
        if (this.y instanceof l01) {
            m9a m9aVar = this.f;
            c79 c79Var = m9aVar.a;
            d9a d9aVar = m9aVar.h;
            if (d9aVar != null && d9aVar.f != c79Var.getCurrentWeight()) {
                m9aVar.h.f = c79Var.getCurrentWeight();
                c79Var.getPainting().k(m9aVar.h);
            }
        }
    }

    public void setColor(int i) {
        this.x = i;
        if (this.y instanceof l01) {
            m9a m9aVar = this.f;
            if (m9aVar.h != null) {
                m9aVar.a.getPainting().k(m9aVar.h);
            }
        }
    }

    public void setDelegate(b79 b79Var) {
        this.a = b79Var;
    }

    public void setUndoStore(b5c b5cVar) {
        this.b = b5cVar;
    }

    public void g(m01 m01Var) {
    }

    public void setQueue(do3 do3Var) {
    }
}
