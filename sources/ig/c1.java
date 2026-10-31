package ig;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.s5;
import org.telegram.ui.Components.pu0;
import org.telegram.ui.Components.s9;
public class c1 extends TextureView {
    public boolean D;
    public b1 f8282a;
    public t1 f8283b;
    public final q0 f8284c;
    public a1 d;
    public final a0 e;
    public final p1 f8285f;
    public Bitmap h;
    public Bitmap f8286n;
    public boolean f8287r;
    public boolean f8288s;
    public float f8289w;
    public int f8290x;
    public h f8291y;

    public c1(Context context, q0 q0Var, Bitmap bitmap, Bitmap bitmap2, s9 s9Var) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.f8286n = bitmap2;
        this.f8284c = q0Var;
        q0Var.f8413f = this;
        setSurfaceTextureListener(new y0(this, s9Var));
        this.e = new a0(this);
        w0 w0Var = new w0(this, 0);
        ?? obj = new Object();
        Paint paint = new Paint(1);
        obj.f8393c = paint;
        Paint paint2 = new Paint(1);
        obj.d = paint2;
        Paint paint3 = new Paint(1);
        obj.e = paint3;
        Paint paint4 = new Paint(1);
        obj.f8394f = paint4;
        Paint paint5 = new Paint(1);
        obj.f8395g = paint5;
        obj.f8400m = new ArrayList();
        obj.f8401n = new ArrayList();
        obj.f8403p = new float[2];
        obj.f8391a = this;
        obj.f8392b = w0Var;
        paint2.setColor(-13840296);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint3.setColor(-1);
        paint3.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
        paint4.setColor(-16745729);
        paint5.setStyle(style);
        paint5.setColor(-1);
        paint5.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
        paint.setStyle(style);
        paint.setColor(-1);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(0.8f));
        paint.setPathEffect(new DashPathEffect(new float[]{org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f)}, 0.0f));
        paint.setShadowLayer(4.0f, 0.0f, 1.5f, 1073741824);
        this.f8285f = obj;
        q0Var.f8410a = new a4.l(this, 21);
    }

    public final void a() {
        w0 w0Var = new w0(this, 2);
        a0 a0Var = this.e;
        a0Var.f8250g = new u0(a0Var.f8246a.getPainting().f8414g.f29435a, 0.0d, 1.0d);
        a0Var.f8254l = true;
        a0Var.a(new Object(), false, w0Var);
    }

    public final void b() {
        c1 c1Var;
        p1 p1Var = this.f8285f;
        if (p1Var != null && (c1Var = p1Var.f8391a) != null && c1Var.getPainting() != null && p1Var.h != null) {
            q0 painting = c1Var.getPainting();
            painting.f8413f.f(new m0(painting, 0));
            p1Var.f8400m.clear();
            p1Var.f8401n.clear();
            p1Var.h = null;
        }
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.f8291y instanceof g) {
            this.f8285f.e();
        }
        a1 a1Var = this.d;
        if (a1Var != null && a1Var.f8271f) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                a1Var.postRunnable(new k0(a1Var, z10, z11, bitmapArr, countDownLatch));
                countDownLatch.await();
            } catch (Exception e) {
                f8.g(e, true);
            }
            return bitmapArr[0];
        }
        return null;
    }

    public final void d(Canvas canvas) {
        Canvas canvas2;
        f1 f1Var;
        if (this.f8291y instanceof g) {
            p1 p1Var = this.f8285f;
            Paint paint = p1Var.f8393c;
            ArrayList arrayList = p1Var.f8400m;
            c1 c1Var = p1Var.f8391a;
            if (c1Var != null && c1Var.getPainting() != null) {
                pu0 pu0Var = c1Var.getPainting().f8414g;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    o1 o1Var = (o1) arrayList.get(i10);
                    if (o1Var.f8383c && !o1Var.f8382b) {
                        p1Var.b(canvas, pu0Var, o1Var);
                    }
                }
                f1 f1Var2 = p1Var.h;
                if (f1Var2 != null && f1Var2.h != 0.0f) {
                    canvas.save();
                    canvas.rotate((float) (((-f1Var.h) / 3.141592653589793d) * 180.0d), (p1Var.h.f8300b / pu0Var.f29435a) * canvas.getWidth(), (p1Var.h.f8301c / pu0Var.f29436b) * canvas.getHeight());
                }
                f1 f1Var3 = p1Var.h;
                if (f1Var3 != null && f1Var3.f8299a.o() == 4) {
                    canvas2 = canvas;
                    canvas2.drawLine(canvas.getWidth() * (p1Var.h.f8300b / pu0Var.f29435a), canvas.getHeight() * (p1Var.h.f8301c / pu0Var.f29436b), canvas.getWidth() * (p1Var.h.f8304i / pu0Var.f29435a), canvas.getHeight() * (p1Var.h.f8305j / pu0Var.f29436b), paint);
                    canvas2.drawLine(canvas2.getWidth() * (p1Var.h.d / pu0Var.f29435a), canvas2.getHeight() * (p1Var.h.e / pu0Var.f29436b), canvas2.getWidth() * (p1Var.h.f8304i / pu0Var.f29435a), canvas2.getHeight() * (p1Var.h.f8305j / pu0Var.f29436b), paint);
                } else {
                    canvas2 = canvas;
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    o1 o1Var2 = (o1) arrayList.get(i11);
                    if (o1Var2.f8383c && o1Var2.f8382b) {
                        p1Var.b(canvas2, pu0Var, o1Var2);
                    }
                }
                f1 f1Var4 = p1Var.h;
                if (f1Var4 != null && f1Var4.h != 0.0f) {
                    canvas2.restore();
                }
            }
        }
    }

    public final void e(android.view.MotionEvent r33) {
        throw new UnsupportedOperationException("Method not decompiled: ig.c1.e(android.view.MotionEvent):void");
    }

    public final void f(Runnable runnable) {
        a1 a1Var = this.d;
        if (a1Var == null) {
            return;
        }
        a1Var.postRunnable(new d1.e(18, this, runnable));
    }

    public h getCurrentBrush() {
        return this.f8291y;
    }

    public int getCurrentColor() {
        return this.f8290x;
    }

    public float getCurrentWeight() {
        return this.f8289w;
    }

    public q0 getPainting() {
        return this.f8284c;
    }

    public t1 getUndoStore() {
        return this.f8283b;
    }

    public final void h() {
        this.D = true;
        if (this.d != null) {
            f(new w0(this, 1));
        }
        setVisibility(8);
    }

    public final void i() {
        float f7;
        if (this.d == null) {
            return;
        }
        Matrix matrix = new Matrix();
        float f10 = 1.0f;
        q0 q0Var = this.f8284c;
        if (q0Var != null) {
            f7 = getWidth() / q0Var.f8414g.f29435a;
        } else {
            f7 = 1.0f;
        }
        if (f7 > 0.0f) {
            f10 = f7;
        }
        pu0 pu0Var = getPainting().f8414g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f10, -f10);
        matrix.preTranslate((-pu0Var.f29435a) / 2.0f, (-pu0Var.f29436b) / 2.0f);
        if (this.f8291y instanceof g) {
            p1 p1Var = this.f8285f;
            p1Var.getClass();
            Matrix matrix2 = new Matrix();
            p1Var.f8402o = matrix2;
            matrix.invert(matrix2);
        } else {
            a0 a0Var = this.e;
            a0Var.getClass();
            Matrix matrix3 = new Matrix();
            a0Var.f8262t = matrix3;
            matrix.invert(matrix3);
        }
        a1 a1Var = this.d;
        q0Var.f8430y = v7.f8.c(v7.f8.b(a1Var.f8272n, a1Var.f8273r), v7.f8.a(matrix));
    }

    public void setBrush(h hVar) {
        boolean z10 = this.f8291y instanceof g;
        p1 p1Var = this.f8285f;
        if (z10) {
            p1Var.e();
        }
        this.f8291y = hVar;
        i();
        this.f8284c.q(this.f8291y);
        h hVar2 = this.f8291y;
        if (hVar2 instanceof g) {
            int o10 = ((g) hVar2).o();
            ArrayList arrayList = p1Var.f8401n;
            ArrayList arrayList2 = p1Var.f8400m;
            c1 c1Var = p1Var.f8391a;
            if (c1Var != null && c1Var.getPainting() != null) {
                arrayList2.clear();
                arrayList.clear();
                p1Var.h = new f1(g.p(o10));
                pu0 pu0Var = c1Var.getPainting().f8414g;
                f1 f1Var = p1Var.h;
                float f7 = pu0Var.f29435a;
                f1Var.f8300b = f7 / 2.0f;
                float f10 = pu0Var.f29436b;
                f1Var.f8301c = f10 / 2.0f;
                float min = Math.min(f7, f10) / 5.0f;
                f1Var.e = min;
                f1Var.d = min;
                p1Var.h.f8302f = c1Var.getCurrentWeight();
                p1Var.h.f8303g = org.telegram.messenger.i0.L(32.0f);
                p1Var.h.f8307l = s0.e(d20.f15147s0).f8458k;
                if (p1Var.h.f8299a.o() == 4) {
                    f1 f1Var2 = p1Var.h;
                    float f11 = pu0Var.f29435a / 2.0f;
                    f1Var2.d = f11;
                    f1Var2.f8300b = f11;
                    f1Var2.f8304i = f11 + 1.0f;
                    float f12 = pu0Var.f29436b;
                    float f13 = f12 / 3.0f;
                    float f14 = 1.0f * f13;
                    f1Var2.f8301c = f14;
                    float f15 = f12 / 2.0f;
                    f1Var2.f8305j = f15;
                    f1Var2.e = f13 * 2.0f;
                    f1Var2.f8306k = Math.abs(f14 - f15);
                    l1 l1Var = new l1(p1Var, 0);
                    arrayList2.add(l1Var);
                    m1 m1Var = new m1(p1Var, l1Var, 0);
                    arrayList2.add(m1Var);
                    arrayList.add(m1Var);
                    m1 m1Var2 = new m1(p1Var, l1Var, 1);
                    arrayList2.add(m1Var2);
                    arrayList.add(m1Var2);
                }
                if (p1Var.h.f8299a.o() == 0) {
                    arrayList2.add(new l1(p1Var, 1));
                }
                if (p1Var.h.f8299a.o() == 2) {
                    arrayList2.add(new l1(p1Var, 2));
                }
                if (p1Var.h.f8299a.o() == 1 || p1Var.h.f8299a.o() == 3) {
                    arrayList2.add(new n1(p1Var, p1Var.h, false, false));
                    arrayList2.add(new n1(p1Var, p1Var.h, true, false));
                    arrayList2.add(new n1(p1Var, p1Var.h, false, true));
                    arrayList2.add(new n1(p1Var, p1Var.h, true, true));
                    arrayList2.add(new l1(p1Var, 3, false));
                }
                if (p1Var.h.f8299a.o() == 3) {
                    f1 f1Var3 = p1Var.h;
                    f1Var3.f8304i = (f1Var3.d * 0.8f) + f1Var3.f8300b;
                    f1Var3.f8305j = (f1Var3.e * 1.2f) + f1Var3.f8301c + f1Var3.f8302f;
                    l1 l1Var2 = new l1(p1Var, 4);
                    arrayList2.add(l1Var2);
                    l1Var2.f8382b = false;
                    arrayList.add(l1Var2);
                }
                p1Var.f8399l = new l1(p1Var, 5, false);
                if (p1Var.h.f8299a.o() != 4) {
                    p1Var.f8399l.f8383c = false;
                }
                l1 l1Var3 = p1Var.f8399l;
                l1Var3.f8382b = false;
                arrayList.add(l1Var3);
                arrayList2.add(p1Var.f8399l);
                c1Var.getPainting().k(p1Var.h);
            }
        }
    }

    public void setBrushSize(float f7) {
        float f10 = this.f8284c.f8414g.f29435a;
        this.f8289w = c3.i0.u(f10, 0.043945312f, f7, 0.00390625f * f10);
        if (this.f8291y instanceof g) {
            p1 p1Var = this.f8285f;
            c1 c1Var = p1Var.f8391a;
            f1 f1Var = p1Var.h;
            if (f1Var != null && f1Var.f8302f != c1Var.getCurrentWeight()) {
                p1Var.h.f8302f = c1Var.getCurrentWeight();
                c1Var.getPainting().k(p1Var.h);
            }
        }
    }

    public void setColor(int i10) {
        this.f8290x = i10;
        if (this.f8291y instanceof g) {
            p1 p1Var = this.f8285f;
            if (p1Var.h != null) {
                p1Var.f8391a.getPainting().k(p1Var.h);
            }
        }
    }

    public void setDelegate(b1 b1Var) {
        this.f8282a = b1Var;
    }

    public void setUndoStore(t1 t1Var) {
        this.f8283b = t1Var;
    }

    public void g(h hVar) {
    }

    public void setQueue(s5 s5Var) {
    }
}
