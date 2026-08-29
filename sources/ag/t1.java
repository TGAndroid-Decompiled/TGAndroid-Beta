package ag;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.ga;
public class t1 extends TextureView {
    public s1 f658a;
    public n2 f659b;
    public final f1 f660c;
    public r1 d;
    public final n0 f661e;
    public final i2 f662f;
    public Bitmap h;
    public Bitmap f663n;
    public boolean f664r;
    public boolean f665s;
    public float v;
    public int f666w;
    public m f667x;
    public boolean f668y;

    public t1(Context context, f1 f1Var, Bitmap bitmap, Bitmap bitmap2, ga gaVar) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.f663n = bitmap2;
        this.f660c = f1Var;
        f1Var.f473f = this;
        setSurfaceTextureListener(new n1(this, gaVar));
        this.f661e = new n0(this);
        l1 l1Var = new l1(this, 0);
        ?? obj = new Object();
        Paint paint = new Paint(1);
        obj.f539c = paint;
        Paint paint2 = new Paint(1);
        obj.d = paint2;
        Paint paint3 = new Paint(1);
        obj.f540e = paint3;
        Paint paint4 = new Paint(1);
        obj.f541f = paint4;
        Paint paint5 = new Paint(1);
        obj.f542g = paint5;
        obj.f547m = new ArrayList();
        obj.f548n = new ArrayList();
        obj.f550p = new float[2];
        obj.f537a = this;
        obj.f538b = l1Var;
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
        this.f662f = obj;
        f1Var.f469a = new o1(this, 0);
    }

    public final void a() {
        l1 l1Var = new l1(this, 2);
        n0 n0Var = this.f661e;
        n0Var.f597g = new j1(n0Var.f592a.getPainting().f474g.f27238a, 0.0d, 1.0d);
        n0Var.f601l = true;
        n0Var.a(new Object(), false, l1Var);
    }

    public final void b() {
        t1 t1Var;
        i2 i2Var = this.f662f;
        if (i2Var != null && (t1Var = i2Var.f537a) != null && t1Var.getPainting() != null && i2Var.h != null) {
            f1 painting = t1Var.getPainting();
            painting.f473f.f(new b1(painting, 0));
            i2Var.f547m.clear();
            i2Var.f548n.clear();
            i2Var.h = null;
        }
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.f667x instanceof l) {
            this.f662f.e();
        }
        r1 r1Var = this.d;
        if (r1Var != null && r1Var.f644f) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                r1Var.postRunnable(new z0(r1Var, z10, z11, bitmapArr, countDownLatch));
                countDownLatch.await();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            return bitmapArr[0];
        }
        return null;
    }

    public final void d(Canvas canvas) {
        Canvas canvas2;
        if (this.f667x instanceof l) {
            i2 i2Var = this.f662f;
            Paint paint = i2Var.f539c;
            ArrayList arrayList = i2Var.f547m;
            t1 t1Var = i2Var.f537a;
            if (t1Var != null && t1Var.getPainting() != null) {
                bv0 bv0Var = t1Var.getPainting().f474g;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    h2 h2Var = (h2) arrayList.get(i10);
                    if (h2Var.f527c && !h2Var.f526b) {
                        i2Var.b(canvas, bv0Var, h2Var);
                    }
                }
                w1 w1Var = i2Var.h;
                if (w1Var != null && w1Var.h != 0.0f) {
                    canvas.save();
                    w1 w1Var2 = i2Var.h;
                    canvas.rotate((float) (((-w1Var2.h) / 3.141592653589793d) * 180.0d), (w1Var2.f695b / bv0Var.f27238a) * canvas.getWidth(), (i2Var.h.f696c / bv0Var.f27239b) * canvas.getHeight());
                }
                w1 w1Var3 = i2Var.h;
                if (w1Var3 != null && w1Var3.f694a.o() == 4) {
                    float width = canvas.getWidth() * (i2Var.h.f695b / bv0Var.f27238a);
                    float height = canvas.getHeight() * (i2Var.h.f696c / bv0Var.f27239b);
                    float width2 = canvas.getWidth() * (i2Var.h.f700i / bv0Var.f27238a);
                    float height2 = canvas.getHeight() * (i2Var.h.f701j / bv0Var.f27239b);
                    canvas2 = canvas;
                    canvas2.drawLine(width, height, width2, height2, paint);
                    canvas2.drawLine(canvas2.getWidth() * (i2Var.h.d / bv0Var.f27238a), canvas2.getHeight() * (i2Var.h.f697e / bv0Var.f27239b), canvas2.getWidth() * (i2Var.h.f700i / bv0Var.f27238a), canvas2.getHeight() * (i2Var.h.f701j / bv0Var.f27239b), paint);
                } else {
                    canvas2 = canvas;
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    h2 h2Var2 = (h2) arrayList.get(i11);
                    if (h2Var2.f527c && h2Var2.f526b) {
                        i2Var.b(canvas2, bv0Var, h2Var2);
                    }
                }
                w1 w1Var4 = i2Var.h;
                if (w1Var4 != null && w1Var4.h != 0.0f) {
                    canvas2.restore();
                }
            }
        }
    }

    public final void e(android.view.MotionEvent r33) {
        throw new UnsupportedOperationException("Method not decompiled: ag.t1.e(android.view.MotionEvent):void");
    }

    public final void f(Runnable runnable) {
        r1 r1Var = this.d;
        if (r1Var == null) {
            return;
        }
        r1Var.postRunnable(new a1.e(5, this, runnable));
    }

    public m getCurrentBrush() {
        return this.f667x;
    }

    public int getCurrentColor() {
        return this.f666w;
    }

    public float getCurrentWeight() {
        return this.v;
    }

    public f1 getPainting() {
        return this.f660c;
    }

    public n2 getUndoStore() {
        return this.f659b;
    }

    public final void h() {
        this.f668y = true;
        if (this.d != null) {
            f(new l1(this, 1));
        }
        setVisibility(8);
    }

    public final void i() {
        float f9;
        if (this.d == null) {
            return;
        }
        Matrix matrix = new Matrix();
        float f10 = 1.0f;
        f1 f1Var = this.f660c;
        if (f1Var != null) {
            f9 = getWidth() / f1Var.f474g.f27238a;
        } else {
            f9 = 1.0f;
        }
        if (f9 > 0.0f) {
            f10 = f9;
        }
        bv0 bv0Var = getPainting().f474g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f10, -f10);
        matrix.preTranslate((-bv0Var.f27238a) / 2.0f, (-bv0Var.f27239b) / 2.0f);
        if (this.f667x instanceof l) {
            i2 i2Var = this.f662f;
            i2Var.getClass();
            Matrix matrix2 = new Matrix();
            i2Var.f549o = matrix2;
            matrix.invert(matrix2);
        } else {
            n0 n0Var = this.f661e;
            n0Var.getClass();
            Matrix matrix3 = new Matrix();
            n0Var.f609t = matrix3;
            matrix.invert(matrix3);
        }
        r1 r1Var = this.d;
        f1Var.f490y = h7.r.c(h7.r.b(r1Var.f645n, r1Var.f646r), h7.r.a(matrix));
    }

    public void setBrush(m mVar) {
        boolean z10 = this.f667x instanceof l;
        i2 i2Var = this.f662f;
        if (z10) {
            i2Var.e();
        }
        this.f667x = mVar;
        i();
        this.f660c.q(this.f667x);
        m mVar2 = this.f667x;
        if (mVar2 instanceof l) {
            int o10 = ((l) mVar2).o();
            ArrayList arrayList = i2Var.f548n;
            ArrayList arrayList2 = i2Var.f547m;
            t1 t1Var = i2Var.f537a;
            if (t1Var != null && t1Var.getPainting() != null) {
                arrayList2.clear();
                arrayList.clear();
                i2Var.h = new w1(l.p(o10));
                bv0 bv0Var = t1Var.getPainting().f474g;
                w1 w1Var = i2Var.h;
                float f9 = bv0Var.f27238a;
                w1Var.f695b = f9 / 2.0f;
                float f10 = bv0Var.f27239b;
                w1Var.f696c = f10 / 2.0f;
                float min = Math.min(f9, f10) / 5.0f;
                w1Var.f697e = min;
                w1Var.d = min;
                i2Var.h.f698f = t1Var.getCurrentWeight();
                i2Var.h.f699g = AndroidUtilities.dp(32.0f);
                i2Var.h.f703l = h1.e(UserConfig.selectedAccount).f523k;
                if (i2Var.h.f694a.o() == 4) {
                    w1 w1Var2 = i2Var.h;
                    float f11 = bv0Var.f27238a / 2.0f;
                    w1Var2.d = f11;
                    w1Var2.f695b = f11;
                    w1Var2.f700i = f11 + 1.0f;
                    float f12 = bv0Var.f27239b;
                    float f13 = f12 / 3.0f;
                    float f14 = 1.0f * f13;
                    w1Var2.f696c = f14;
                    float f15 = f12 / 2.0f;
                    w1Var2.f701j = f15;
                    w1Var2.f697e = f13 * 2.0f;
                    w1Var2.f702k = Math.abs(f14 - f15);
                    e2 e2Var = new e2(i2Var, 0);
                    arrayList2.add(e2Var);
                    f2 f2Var = new f2(i2Var, e2Var, 0);
                    arrayList2.add(f2Var);
                    arrayList.add(f2Var);
                    f2 f2Var2 = new f2(i2Var, e2Var, 1);
                    arrayList2.add(f2Var2);
                    arrayList.add(f2Var2);
                }
                if (i2Var.h.f694a.o() == 0) {
                    arrayList2.add(new e2(i2Var, 1));
                }
                if (i2Var.h.f694a.o() == 2) {
                    arrayList2.add(new e2(i2Var, 2));
                }
                if (i2Var.h.f694a.o() == 1 || i2Var.h.f694a.o() == 3) {
                    arrayList2.add(new g2(i2Var, i2Var.h, false, false));
                    arrayList2.add(new g2(i2Var, i2Var.h, true, false));
                    arrayList2.add(new g2(i2Var, i2Var.h, false, true));
                    arrayList2.add(new g2(i2Var, i2Var.h, true, true));
                    arrayList2.add(new e2(i2Var, 3, false));
                }
                if (i2Var.h.f694a.o() == 3) {
                    w1 w1Var3 = i2Var.h;
                    w1Var3.f700i = (w1Var3.d * 0.8f) + w1Var3.f695b;
                    w1Var3.f701j = (w1Var3.f697e * 1.2f) + w1Var3.f696c + w1Var3.f698f;
                    e2 e2Var2 = new e2(i2Var, 4);
                    arrayList2.add(e2Var2);
                    e2Var2.f526b = false;
                    arrayList.add(e2Var2);
                }
                i2Var.f546l = new e2(i2Var, 5, false);
                if (i2Var.h.f694a.o() != 4) {
                    i2Var.f546l.f527c = false;
                }
                e2 e2Var3 = i2Var.f546l;
                e2Var3.f526b = false;
                arrayList.add(e2Var3);
                arrayList2.add(i2Var.f546l);
                t1Var.getPainting().k(i2Var.h);
            }
        }
    }

    public void setBrushSize(float f9) {
        float f10 = this.f660c.f474g.f27238a;
        this.v = com.google.android.recaptcha.internal.a.x(f10, 0.043945312f, f9, 0.00390625f * f10);
        if (this.f667x instanceof l) {
            i2 i2Var = this.f662f;
            t1 t1Var = i2Var.f537a;
            w1 w1Var = i2Var.h;
            if (w1Var != null && w1Var.f698f != t1Var.getCurrentWeight()) {
                i2Var.h.f698f = t1Var.getCurrentWeight();
                t1Var.getPainting().k(i2Var.h);
            }
        }
    }

    public void setColor(int i10) {
        this.f666w = i10;
        if (this.f667x instanceof l) {
            i2 i2Var = this.f662f;
            if (i2Var.h != null) {
                i2Var.f537a.getPainting().k(i2Var.h);
            }
        }
    }

    public void setDelegate(s1 s1Var) {
        this.f658a = s1Var;
    }

    public void setUndoStore(n2 n2Var) {
        this.f659b = n2Var;
    }

    public void g(m mVar) {
    }

    public void setQueue(DispatchQueue dispatchQueue) {
    }
}
