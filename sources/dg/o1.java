package dg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.TextureView;
import j7.z6;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.kv0;
public class o1 extends TextureView {
    public n1 f4624a;
    public h2 f4625b;
    public final c1 f4626c;
    public m1 d;
    public final m0 f4627e;
    public final d2 f4628f;
    public Bitmap h;
    public Bitmap f4629n;
    public boolean f4630r;
    public boolean f4631s;
    public float v;
    public int f4632w;
    public m f4633x;
    public boolean f4634y;

    public o1(Context context, c1 c1Var, Bitmap bitmap, Bitmap bitmap2, ba baVar) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.f4629n = bitmap2;
        this.f4626c = c1Var;
        c1Var.f4455f = this;
        setSurfaceTextureListener(new k1(this, baVar));
        this.f4627e = new m0(this);
        i1 i1Var = new i1(this, 0);
        ?? obj = new Object();
        Paint paint = new Paint(1);
        obj.f4489c = paint;
        Paint paint2 = new Paint(1);
        obj.d = paint2;
        Paint paint3 = new Paint(1);
        obj.f4490e = paint3;
        Paint paint4 = new Paint(1);
        obj.f4491f = paint4;
        Paint paint5 = new Paint(1);
        obj.f4492g = paint5;
        obj.f4497m = new ArrayList();
        obj.f4498n = new ArrayList();
        obj.f4500p = new float[2];
        obj.f4487a = this;
        obj.f4488b = i1Var;
        paint2.setColor(-13840296);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint3.setColor(-1);
        paint3.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint4.setColor(-16745729);
        paint5.setStyle(style);
        paint5.setColor(-1);
        paint5.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(style);
        paint.setColor(-1);
        paint.setStrokeWidth(AndroidUtilities.dp(0.8f));
        paint.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f)}, 0.0f));
        paint.setShadowLayer(4.0f, 0.0f, 1.5f, 1073741824);
        this.f4628f = obj;
        c1Var.f4451a = new o5.i(this, 9);
    }

    public final void a() {
        i1 i1Var = new i1(this, 2);
        m0 m0Var = this.f4627e;
        m0Var.f4587g = new g1(m0Var.f4582a.getPainting().f4456g.f28463a, 0.0d, 1.0d);
        m0Var.f4591l = true;
        m0Var.a(new Object(), false, i1Var);
    }

    public final void b() {
        o1 o1Var;
        d2 d2Var = this.f4628f;
        if (d2Var != null && (o1Var = d2Var.f4487a) != null && o1Var.getPainting() != null && d2Var.h != null) {
            c1 painting = o1Var.getPainting();
            painting.f4455f.f(new y0(painting, 0));
            d2Var.f4497m.clear();
            d2Var.f4498n.clear();
            d2Var.h = null;
        }
    }

    public final Bitmap c(boolean z4, boolean z10) {
        if (this.f4633x instanceof l) {
            this.f4628f.e();
        }
        m1 m1Var = this.d;
        if (m1Var != null && m1Var.f4609f) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                m1Var.postRunnable(new w0(m1Var, z4, z10, bitmapArr, countDownLatch));
                countDownLatch.await();
            } catch (Exception e6) {
                FileLog.e(e6);
            }
            return bitmapArr[0];
        }
        return null;
    }

    public final void d(Canvas canvas) {
        Canvas canvas2;
        if (this.f4633x instanceof l) {
            d2 d2Var = this.f4628f;
            Paint paint = d2Var.f4489c;
            ArrayList arrayList = d2Var.f4497m;
            o1 o1Var = d2Var.f4487a;
            if (o1Var != null && o1Var.getPainting() != null) {
                kv0 kv0Var = o1Var.getPainting().f4456g;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    c2 c2Var = (c2) arrayList.get(i10);
                    if (c2Var.f4476c && !c2Var.f4475b) {
                        d2Var.b(canvas, kv0Var, c2Var);
                    }
                }
                r1 r1Var = d2Var.h;
                if (r1Var != null && r1Var.h != 0.0f) {
                    canvas.save();
                    r1 r1Var2 = d2Var.h;
                    canvas.rotate((float) (((-r1Var2.h) / 3.141592653589793d) * 180.0d), (r1Var2.f4652b / kv0Var.f28463a) * canvas.getWidth(), (d2Var.h.f4653c / kv0Var.f28464b) * canvas.getHeight());
                }
                r1 r1Var3 = d2Var.h;
                if (r1Var3 != null && r1Var3.f4651a.o() == 4) {
                    float width = canvas.getWidth() * (d2Var.h.f4652b / kv0Var.f28463a);
                    float height = canvas.getHeight() * (d2Var.h.f4653c / kv0Var.f28464b);
                    float width2 = canvas.getWidth() * (d2Var.h.f4657i / kv0Var.f28463a);
                    float height2 = canvas.getHeight() * (d2Var.h.f4658j / kv0Var.f28464b);
                    canvas2 = canvas;
                    canvas2.drawLine(width, height, width2, height2, paint);
                    canvas2.drawLine(canvas2.getWidth() * (d2Var.h.d / kv0Var.f28463a), canvas2.getHeight() * (d2Var.h.f4654e / kv0Var.f28464b), canvas2.getWidth() * (d2Var.h.f4657i / kv0Var.f28463a), canvas2.getHeight() * (d2Var.h.f4658j / kv0Var.f28464b), paint);
                } else {
                    canvas2 = canvas;
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    c2 c2Var2 = (c2) arrayList.get(i11);
                    if (c2Var2.f4476c && c2Var2.f4475b) {
                        d2Var.b(canvas2, kv0Var, c2Var2);
                    }
                }
                r1 r1Var4 = d2Var.h;
                if (r1Var4 != null && r1Var4.h != 0.0f) {
                    canvas2.restore();
                }
            }
        }
    }

    public final void e(android.view.MotionEvent r33) {
        throw new UnsupportedOperationException("Method not decompiled: dg.o1.e(android.view.MotionEvent):void");
    }

    public final void f(Runnable runnable) {
        m1 m1Var = this.d;
        if (m1Var == null) {
            return;
        }
        m1Var.postRunnable(new a1.e(16, this, runnable));
    }

    public m getCurrentBrush() {
        return this.f4633x;
    }

    public int getCurrentColor() {
        return this.f4632w;
    }

    public float getCurrentWeight() {
        return this.v;
    }

    public c1 getPainting() {
        return this.f4626c;
    }

    public h2 getUndoStore() {
        return this.f4625b;
    }

    public final void h() {
        this.f4634y = true;
        if (this.d != null) {
            f(new i1(this, 1));
        }
        setVisibility(8);
    }

    public final void i() {
        float f10;
        if (this.d == null) {
            return;
        }
        Matrix matrix = new Matrix();
        float f11 = 1.0f;
        c1 c1Var = this.f4626c;
        if (c1Var != null) {
            f10 = getWidth() / c1Var.f4456g.f28463a;
        } else {
            f10 = 1.0f;
        }
        if (f10 > 0.0f) {
            f11 = f10;
        }
        kv0 kv0Var = getPainting().f4456g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f11, -f11);
        matrix.preTranslate((-kv0Var.f28463a) / 2.0f, (-kv0Var.f28464b) / 2.0f);
        if (this.f4633x instanceof l) {
            d2 d2Var = this.f4628f;
            d2Var.getClass();
            Matrix matrix2 = new Matrix();
            d2Var.f4499o = matrix2;
            matrix.invert(matrix2);
        } else {
            m0 m0Var = this.f4627e;
            m0Var.getClass();
            Matrix matrix3 = new Matrix();
            m0Var.f4599t = matrix3;
            matrix.invert(matrix3);
        }
        m1 m1Var = this.d;
        c1Var.f4472y = z6.c(z6.b(m1Var.f4610n, m1Var.f4611r), z6.a(matrix));
    }

    public void setBrush(m mVar) {
        boolean z4 = this.f4633x instanceof l;
        d2 d2Var = this.f4628f;
        if (z4) {
            d2Var.e();
        }
        this.f4633x = mVar;
        i();
        this.f4626c.q(this.f4633x);
        m mVar2 = this.f4633x;
        if (mVar2 instanceof l) {
            int o10 = ((l) mVar2).o();
            ArrayList arrayList = d2Var.f4498n;
            ArrayList arrayList2 = d2Var.f4497m;
            o1 o1Var = d2Var.f4487a;
            if (o1Var != null && o1Var.getPainting() != null) {
                arrayList2.clear();
                arrayList.clear();
                d2Var.h = new r1(l.p(o10));
                kv0 kv0Var = o1Var.getPainting().f4456g;
                r1 r1Var = d2Var.h;
                float f10 = kv0Var.f28463a;
                r1Var.f4652b = f10 / 2.0f;
                float f11 = kv0Var.f28464b;
                r1Var.f4653c = f11 / 2.0f;
                float min = Math.min(f10, f11) / 5.0f;
                r1Var.f4654e = min;
                r1Var.d = min;
                d2Var.h.f4655f = o1Var.getCurrentWeight();
                d2Var.h.f4656g = AndroidUtilities.dp(32.0f);
                d2Var.h.f4660l = e1.e(UserConfig.selectedAccount).f4522k;
                if (d2Var.h.f4651a.o() == 4) {
                    r1 r1Var2 = d2Var.h;
                    float f12 = kv0Var.f28463a / 2.0f;
                    r1Var2.d = f12;
                    r1Var2.f4652b = f12;
                    r1Var2.f4657i = f12 + 1.0f;
                    float f13 = kv0Var.f28464b;
                    float f14 = f13 / 3.0f;
                    float f15 = 1.0f * f14;
                    r1Var2.f4653c = f15;
                    float f16 = f13 / 2.0f;
                    r1Var2.f4658j = f16;
                    r1Var2.f4654e = f14 * 2.0f;
                    r1Var2.f4659k = Math.abs(f15 - f16);
                    z1 z1Var = new z1(d2Var, 0);
                    arrayList2.add(z1Var);
                    a2 a2Var = new a2(d2Var, z1Var, 0);
                    arrayList2.add(a2Var);
                    arrayList.add(a2Var);
                    a2 a2Var2 = new a2(d2Var, z1Var, 1);
                    arrayList2.add(a2Var2);
                    arrayList.add(a2Var2);
                }
                if (d2Var.h.f4651a.o() == 0) {
                    arrayList2.add(new z1(d2Var, 1));
                }
                if (d2Var.h.f4651a.o() == 2) {
                    arrayList2.add(new z1(d2Var, 2));
                }
                if (d2Var.h.f4651a.o() == 1 || d2Var.h.f4651a.o() == 3) {
                    arrayList2.add(new b2(d2Var, d2Var.h, false, false));
                    arrayList2.add(new b2(d2Var, d2Var.h, true, false));
                    arrayList2.add(new b2(d2Var, d2Var.h, false, true));
                    arrayList2.add(new b2(d2Var, d2Var.h, true, true));
                    arrayList2.add(new z1(d2Var, 3, false));
                }
                if (d2Var.h.f4651a.o() == 3) {
                    r1 r1Var3 = d2Var.h;
                    r1Var3.f4657i = (r1Var3.d * 0.8f) + r1Var3.f4652b;
                    r1Var3.f4658j = (r1Var3.f4654e * 1.2f) + r1Var3.f4653c + r1Var3.f4655f;
                    z1 z1Var2 = new z1(d2Var, 4);
                    arrayList2.add(z1Var2);
                    z1Var2.f4475b = false;
                    arrayList.add(z1Var2);
                }
                d2Var.f4496l = new z1(d2Var, 5, false);
                if (d2Var.h.f4651a.o() != 4) {
                    d2Var.f4496l.f4476c = false;
                }
                z1 z1Var3 = d2Var.f4496l;
                z1Var3.f4475b = false;
                arrayList.add(z1Var3);
                arrayList2.add(d2Var.f4496l);
                o1Var.getPainting().k(d2Var.h);
            }
        }
    }

    public void setBrushSize(float f10) {
        float f11 = this.f4626c.f4456g.f28463a;
        this.v = e2.c.u(f11, 0.043945312f, f10, 0.00390625f * f11);
        if (this.f4633x instanceof l) {
            d2 d2Var = this.f4628f;
            o1 o1Var = d2Var.f4487a;
            r1 r1Var = d2Var.h;
            if (r1Var != null && r1Var.f4655f != o1Var.getCurrentWeight()) {
                d2Var.h.f4655f = o1Var.getCurrentWeight();
                o1Var.getPainting().k(d2Var.h);
            }
        }
    }

    public void setColor(int i10) {
        this.f4632w = i10;
        if (this.f4633x instanceof l) {
            d2 d2Var = this.f4628f;
            if (d2Var.h != null) {
                d2Var.f4487a.getPainting().k(d2Var.h);
            }
        }
    }

    public void setDelegate(n1 n1Var) {
        this.f4624a = n1Var;
    }

    public void setUndoStore(h2 h2Var) {
        this.f4625b = h2Var;
    }

    public void g(m mVar) {
    }

    public void setQueue(DispatchQueue dispatchQueue) {
    }
}
