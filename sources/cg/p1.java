package cg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.TextureView;
import j7.n5;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.jv0;
public class p1 extends TextureView {
    public o1 f2475a;
    public i2 f2476b;
    public final d1 f2477c;
    public n1 d;
    public final m0 e;
    public final e2 f2478f;
    public Bitmap h;
    public Bitmap f2479n;
    public boolean f2480r;
    public boolean f2481s;
    public float v;
    public int f2482w;
    public m f2483x;
    public boolean f2484y;

    public p1(Context context, d1 d1Var, Bitmap bitmap, Bitmap bitmap2, ba baVar) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.f2479n = bitmap2;
        this.f2477c = d1Var;
        d1Var.f2320f = this;
        setSurfaceTextureListener(new l1(this, baVar));
        this.e = new m0(this);
        j1 j1Var = new j1(this, 0);
        ?? obj = new Object();
        Paint paint = new Paint(1);
        obj.f2353c = paint;
        Paint paint2 = new Paint(1);
        obj.d = paint2;
        Paint paint3 = new Paint(1);
        obj.e = paint3;
        Paint paint4 = new Paint(1);
        obj.f2354f = paint4;
        Paint paint5 = new Paint(1);
        obj.f2355g = paint5;
        obj.f2360m = new ArrayList();
        obj.f2361n = new ArrayList();
        obj.f2363p = new float[2];
        obj.f2351a = this;
        obj.f2352b = j1Var;
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
        this.f2478f = obj;
        d1Var.f2317a = new o5.i(this, 8);
    }

    public final void a() {
        j1 j1Var = new j1(this, 2);
        m0 m0Var = this.e;
        m0Var.f2435g = new h1(m0Var.f2431a.getPainting().f2321g.f26062a, 0.0d, 1.0d);
        m0Var.f2439l = true;
        m0Var.a(new Object(), false, j1Var);
    }

    public final void b() {
        p1 p1Var;
        e2 e2Var = this.f2478f;
        if (e2Var != null && (p1Var = e2Var.f2351a) != null && p1Var.getPainting() != null && e2Var.h != null) {
            d1 painting = p1Var.getPainting();
            painting.f2320f.f(new z0(painting, 0));
            e2Var.f2360m.clear();
            e2Var.f2361n.clear();
            e2Var.h = null;
        }
    }

    public final Bitmap c(boolean z4, boolean z10) {
        if (this.f2483x instanceof l) {
            this.f2478f.e();
        }
        n1 n1Var = this.d;
        if (n1Var != null && n1Var.f2462f) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                n1Var.postRunnable(new x0(n1Var, z4, z10, bitmapArr, countDownLatch));
                countDownLatch.await();
            } catch (Exception e) {
                FileLog.e(e);
            }
            return bitmapArr[0];
        }
        return null;
    }

    public final void d(Canvas canvas) {
        Canvas canvas2;
        if (this.f2483x instanceof l) {
            e2 e2Var = this.f2478f;
            Paint paint = e2Var.f2353c;
            ArrayList arrayList = e2Var.f2360m;
            p1 p1Var = e2Var.f2351a;
            if (p1Var != null && p1Var.getPainting() != null) {
                jv0 jv0Var = p1Var.getPainting().f2321g;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    d2 d2Var = (d2) arrayList.get(i10);
                    if (d2Var.f2341c && !d2Var.f2340b) {
                        e2Var.b(canvas, jv0Var, d2Var);
                    }
                }
                s1 s1Var = e2Var.h;
                if (s1Var != null && s1Var.h != 0.0f) {
                    canvas.save();
                    s1 s1Var2 = e2Var.h;
                    canvas.rotate((float) (((-s1Var2.h) / 3.141592653589793d) * 180.0d), (s1Var2.f2500b / jv0Var.f26062a) * canvas.getWidth(), (e2Var.h.f2501c / jv0Var.f26063b) * canvas.getHeight());
                }
                s1 s1Var3 = e2Var.h;
                if (s1Var3 != null && s1Var3.f2499a.o() == 4) {
                    float width = canvas.getWidth() * (e2Var.h.f2500b / jv0Var.f26062a);
                    float height = canvas.getHeight() * (e2Var.h.f2501c / jv0Var.f26063b);
                    float width2 = canvas.getWidth() * (e2Var.h.f2504i / jv0Var.f26062a);
                    float height2 = canvas.getHeight() * (e2Var.h.f2505j / jv0Var.f26063b);
                    canvas2 = canvas;
                    canvas2.drawLine(width, height, width2, height2, paint);
                    canvas2.drawLine(canvas2.getWidth() * (e2Var.h.d / jv0Var.f26062a), canvas2.getHeight() * (e2Var.h.e / jv0Var.f26063b), canvas2.getWidth() * (e2Var.h.f2504i / jv0Var.f26062a), canvas2.getHeight() * (e2Var.h.f2505j / jv0Var.f26063b), paint);
                } else {
                    canvas2 = canvas;
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    d2 d2Var2 = (d2) arrayList.get(i11);
                    if (d2Var2.f2341c && d2Var2.f2340b) {
                        e2Var.b(canvas2, jv0Var, d2Var2);
                    }
                }
                s1 s1Var4 = e2Var.h;
                if (s1Var4 != null && s1Var4.h != 0.0f) {
                    canvas2.restore();
                }
            }
        }
    }

    public final void e(android.view.MotionEvent r33) {
        throw new UnsupportedOperationException("Method not decompiled: cg.p1.e(android.view.MotionEvent):void");
    }

    public final void f(Runnable runnable) {
        n1 n1Var = this.d;
        if (n1Var == null) {
            return;
        }
        n1Var.postRunnable(new a1.e(11, this, runnable));
    }

    public m getCurrentBrush() {
        return this.f2483x;
    }

    public int getCurrentColor() {
        return this.f2482w;
    }

    public float getCurrentWeight() {
        return this.v;
    }

    public d1 getPainting() {
        return this.f2477c;
    }

    public i2 getUndoStore() {
        return this.f2476b;
    }

    public final void h() {
        this.f2484y = true;
        if (this.d != null) {
            f(new j1(this, 1));
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
        d1 d1Var = this.f2477c;
        if (d1Var != null) {
            f10 = getWidth() / d1Var.f2321g.f26062a;
        } else {
            f10 = 1.0f;
        }
        if (f10 > 0.0f) {
            f11 = f10;
        }
        jv0 jv0Var = getPainting().f2321g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f11, -f11);
        matrix.preTranslate((-jv0Var.f26062a) / 2.0f, (-jv0Var.f26063b) / 2.0f);
        if (this.f2483x instanceof l) {
            e2 e2Var = this.f2478f;
            e2Var.getClass();
            Matrix matrix2 = new Matrix();
            e2Var.f2362o = matrix2;
            matrix.invert(matrix2);
        } else {
            m0 m0Var = this.e;
            m0Var.getClass();
            Matrix matrix3 = new Matrix();
            m0Var.f2447t = matrix3;
            matrix.invert(matrix3);
        }
        n1 n1Var = this.d;
        d1Var.f2337y = n5.c(n5.b(n1Var.f2463n, n1Var.f2464r), n5.a(matrix));
    }

    public void setBrush(m mVar) {
        boolean z4 = this.f2483x instanceof l;
        e2 e2Var = this.f2478f;
        if (z4) {
            e2Var.e();
        }
        this.f2483x = mVar;
        i();
        this.f2477c.q(this.f2483x);
        m mVar2 = this.f2483x;
        if (mVar2 instanceof l) {
            int o10 = ((l) mVar2).o();
            ArrayList arrayList = e2Var.f2361n;
            ArrayList arrayList2 = e2Var.f2360m;
            p1 p1Var = e2Var.f2351a;
            if (p1Var != null && p1Var.getPainting() != null) {
                arrayList2.clear();
                arrayList.clear();
                e2Var.h = new s1(l.p(o10));
                jv0 jv0Var = p1Var.getPainting().f2321g;
                s1 s1Var = e2Var.h;
                float f10 = jv0Var.f26062a;
                s1Var.f2500b = f10 / 2.0f;
                float f11 = jv0Var.f26063b;
                s1Var.f2501c = f11 / 2.0f;
                float min = Math.min(f10, f11) / 5.0f;
                s1Var.e = min;
                s1Var.d = min;
                e2Var.h.f2502f = p1Var.getCurrentWeight();
                e2Var.h.f2503g = AndroidUtilities.dp(32.0f);
                e2Var.h.f2507l = f1.e(UserConfig.selectedAccount).f2382k;
                if (e2Var.h.f2499a.o() == 4) {
                    s1 s1Var2 = e2Var.h;
                    float f12 = jv0Var.f26062a / 2.0f;
                    s1Var2.d = f12;
                    s1Var2.f2500b = f12;
                    s1Var2.f2504i = f12 + 1.0f;
                    float f13 = jv0Var.f26063b;
                    float f14 = f13 / 3.0f;
                    float f15 = 1.0f * f14;
                    s1Var2.f2501c = f15;
                    float f16 = f13 / 2.0f;
                    s1Var2.f2505j = f16;
                    s1Var2.e = f14 * 2.0f;
                    s1Var2.f2506k = Math.abs(f15 - f16);
                    a2 a2Var = new a2(e2Var, 0);
                    arrayList2.add(a2Var);
                    b2 b2Var = new b2(e2Var, a2Var, 0);
                    arrayList2.add(b2Var);
                    arrayList.add(b2Var);
                    b2 b2Var2 = new b2(e2Var, a2Var, 1);
                    arrayList2.add(b2Var2);
                    arrayList.add(b2Var2);
                }
                if (e2Var.h.f2499a.o() == 0) {
                    arrayList2.add(new a2(e2Var, 1));
                }
                if (e2Var.h.f2499a.o() == 2) {
                    arrayList2.add(new a2(e2Var, 2));
                }
                if (e2Var.h.f2499a.o() == 1 || e2Var.h.f2499a.o() == 3) {
                    arrayList2.add(new c2(e2Var, e2Var.h, false, false));
                    arrayList2.add(new c2(e2Var, e2Var.h, true, false));
                    arrayList2.add(new c2(e2Var, e2Var.h, false, true));
                    arrayList2.add(new c2(e2Var, e2Var.h, true, true));
                    arrayList2.add(new a2(e2Var, 3, false));
                }
                if (e2Var.h.f2499a.o() == 3) {
                    s1 s1Var3 = e2Var.h;
                    s1Var3.f2504i = (s1Var3.d * 0.8f) + s1Var3.f2500b;
                    s1Var3.f2505j = (s1Var3.e * 1.2f) + s1Var3.f2501c + s1Var3.f2502f;
                    a2 a2Var2 = new a2(e2Var, 4);
                    arrayList2.add(a2Var2);
                    a2Var2.f2340b = false;
                    arrayList.add(a2Var2);
                }
                e2Var.f2359l = new a2(e2Var, 5, false);
                if (e2Var.h.f2499a.o() != 4) {
                    e2Var.f2359l.f2341c = false;
                }
                a2 a2Var3 = e2Var.f2359l;
                a2Var3.f2340b = false;
                arrayList.add(a2Var3);
                arrayList2.add(e2Var.f2359l);
                p1Var.getPainting().k(e2Var.h);
            }
        }
    }

    public void setBrushSize(float f10) {
        float f11 = this.f2477c.f2321g.f26062a;
        this.v = e2.c.u(f11, 0.043945312f, f10, 0.00390625f * f11);
        if (this.f2483x instanceof l) {
            e2 e2Var = this.f2478f;
            p1 p1Var = e2Var.f2351a;
            s1 s1Var = e2Var.h;
            if (s1Var != null && s1Var.f2502f != p1Var.getCurrentWeight()) {
                e2Var.h.f2502f = p1Var.getCurrentWeight();
                p1Var.getPainting().k(e2Var.h);
            }
        }
    }

    public void setColor(int i10) {
        this.f2482w = i10;
        if (this.f2483x instanceof l) {
            e2 e2Var = this.f2478f;
            if (e2Var.h != null) {
                e2Var.f2351a.getPainting().k(e2Var.h);
            }
        }
    }

    public void setDelegate(o1 o1Var) {
        this.f2475a = o1Var;
    }

    public void setUndoStore(i2 i2Var) {
        this.f2476b = i2Var;
    }

    public void g(m mVar) {
    }

    public void setQueue(DispatchQueue dispatchQueue) {
    }
}
