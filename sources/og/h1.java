package og;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.TextureView;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.ia;
import org.telegram.ui.Components.tv0;
public class h1 extends TextureView {
    public g1 f14388a;
    public y1 f14389b;
    public final v0 f14390c;
    public f1 d;
    public final g0 e;
    public final u1 f14391f;
    public Bitmap h;
    public Bitmap f14392n;
    public boolean f14393r;
    public boolean f14394s;
    public float v;
    public int f14395w;
    public m f14396x;
    public boolean f14397y;

    public h1(Context context, v0 v0Var, Bitmap bitmap, Bitmap bitmap2, ia iaVar) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.f14392n = bitmap2;
        this.f14390c = v0Var;
        v0Var.f14515f = this;
        setSurfaceTextureListener(new d1(this, iaVar));
        this.e = new g0(this);
        b1 b1Var = new b1(this, 0);
        ?? obj = new Object();
        Paint paint = new Paint(1);
        obj.f14501c = paint;
        Paint paint2 = new Paint(1);
        obj.d = paint2;
        Paint paint3 = new Paint(1);
        obj.e = paint3;
        Paint paint4 = new Paint(1);
        obj.f14502f = paint4;
        Paint paint5 = new Paint(1);
        obj.f14503g = paint5;
        obj.f14508m = new ArrayList();
        obj.f14509n = new ArrayList();
        obj.f14511p = new float[2];
        obj.f14499a = this;
        obj.f14500b = b1Var;
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
        this.f14391f = obj;
        v0Var.f14512a = new l2.h(this, 7);
    }

    public final void a() {
        b1 b1Var = new b1(this, 2);
        g0 g0Var = this.e;
        g0Var.f14368g = new z0(g0Var.f14364a.getPainting().f14516g.f27499a, 0.0d, 1.0d);
        g0Var.f14372l = true;
        g0Var.a(new Object(), false, b1Var);
    }

    public final void b() {
        h1 h1Var;
        u1 u1Var = this.f14391f;
        if (u1Var != null && (h1Var = u1Var.f14499a) != null && h1Var.getPainting() != null && u1Var.h != null) {
            v0 painting = h1Var.getPainting();
            painting.f14515f.f(new r0(painting, 0));
            u1Var.f14508m.clear();
            u1Var.f14509n.clear();
            u1Var.h = null;
        }
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.f14396x instanceof l) {
            this.f14391f.e();
        }
        f1 f1Var = this.d;
        if (f1Var != null && f1Var.f14357f) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                f1Var.postRunnable(new p0(f1Var, z10, z11, bitmapArr, countDownLatch));
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
        if (this.f14396x instanceof l) {
            u1 u1Var = this.f14391f;
            Paint paint = u1Var.f14501c;
            ArrayList arrayList = u1Var.f14508m;
            h1 h1Var = u1Var.f14499a;
            if (h1Var != null && h1Var.getPainting() != null) {
                tv0 tv0Var = h1Var.getPainting().f14516g;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    t1 t1Var = (t1) arrayList.get(i10);
                    if (t1Var.f14489c && !t1Var.f14488b) {
                        u1Var.b(canvas, tv0Var, t1Var);
                    }
                }
                k1 k1Var = u1Var.h;
                if (k1Var != null && k1Var.h != 0.0f) {
                    canvas.save();
                    k1 k1Var2 = u1Var.h;
                    canvas.rotate((float) (((-k1Var2.h) / 3.141592653589793d) * 180.0d), (k1Var2.f14406b / tv0Var.f27499a) * canvas.getWidth(), (u1Var.h.f14407c / tv0Var.f27500b) * canvas.getHeight());
                }
                k1 k1Var3 = u1Var.h;
                if (k1Var3 != null && k1Var3.f14405a.o() == 4) {
                    float width = canvas.getWidth() * (u1Var.h.f14406b / tv0Var.f27499a);
                    float height = canvas.getHeight() * (u1Var.h.f14407c / tv0Var.f27500b);
                    float width2 = canvas.getWidth() * (u1Var.h.f14410i / tv0Var.f27499a);
                    float height2 = canvas.getHeight() * (u1Var.h.f14411j / tv0Var.f27500b);
                    canvas2 = canvas;
                    canvas2.drawLine(width, height, width2, height2, paint);
                    canvas2.drawLine(canvas2.getWidth() * (u1Var.h.d / tv0Var.f27499a), canvas2.getHeight() * (u1Var.h.e / tv0Var.f27500b), canvas2.getWidth() * (u1Var.h.f14410i / tv0Var.f27499a), canvas2.getHeight() * (u1Var.h.f14411j / tv0Var.f27500b), paint);
                } else {
                    canvas2 = canvas;
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    t1 t1Var2 = (t1) arrayList.get(i11);
                    if (t1Var2.f14489c && t1Var2.f14488b) {
                        u1Var.b(canvas2, tv0Var, t1Var2);
                    }
                }
                k1 k1Var4 = u1Var.h;
                if (k1Var4 != null && k1Var4.h != 0.0f) {
                    canvas2.restore();
                }
            }
        }
    }

    public final void e(android.view.MotionEvent r33) {
        throw new UnsupportedOperationException("Method not decompiled: og.h1.e(android.view.MotionEvent):void");
    }

    public final void f(Runnable runnable) {
        f1 f1Var = this.d;
        if (f1Var == null) {
            return;
        }
        f1Var.postRunnable(new m4.w(10, this, runnable));
    }

    public m getCurrentBrush() {
        return this.f14396x;
    }

    public int getCurrentColor() {
        return this.f14395w;
    }

    public float getCurrentWeight() {
        return this.v;
    }

    public v0 getPainting() {
        return this.f14390c;
    }

    public y1 getUndoStore() {
        return this.f14389b;
    }

    public final void h() {
        this.f14397y = true;
        if (this.d != null) {
            f(new b1(this, 1));
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
        v0 v0Var = this.f14390c;
        if (v0Var != null) {
            f7 = getWidth() / v0Var.f14516g.f27499a;
        } else {
            f7 = 1.0f;
        }
        if (f7 > 0.0f) {
            f10 = f7;
        }
        tv0 tv0Var = getPainting().f14516g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f10, -f10);
        matrix.preTranslate((-tv0Var.f27499a) / 2.0f, (-tv0Var.f27500b) / 2.0f);
        if (this.f14396x instanceof l) {
            u1 u1Var = this.f14391f;
            u1Var.getClass();
            Matrix matrix2 = new Matrix();
            u1Var.f14510o = matrix2;
            matrix.invert(matrix2);
        } else {
            g0 g0Var = this.e;
            g0Var.getClass();
            Matrix matrix3 = new Matrix();
            g0Var.f14380t = matrix3;
            matrix.invert(matrix3);
        }
        f1 f1Var = this.d;
        v0Var.f14532y = w7.h0.c(w7.h0.b(f1Var.f14358n, f1Var.f14359r), w7.h0.a(matrix));
    }

    public void setBrush(m mVar) {
        boolean z10 = this.f14396x instanceof l;
        u1 u1Var = this.f14391f;
        if (z10) {
            u1Var.e();
        }
        this.f14396x = mVar;
        i();
        this.f14390c.q(this.f14396x);
        m mVar2 = this.f14396x;
        if (mVar2 instanceof l) {
            int o9 = ((l) mVar2).o();
            ArrayList arrayList = u1Var.f14509n;
            ArrayList arrayList2 = u1Var.f14508m;
            h1 h1Var = u1Var.f14499a;
            if (h1Var != null && h1Var.getPainting() != null) {
                arrayList2.clear();
                arrayList.clear();
                u1Var.h = new k1(l.p(o9));
                tv0 tv0Var = h1Var.getPainting().f14516g;
                k1 k1Var = u1Var.h;
                float f7 = tv0Var.f27499a;
                k1Var.f14406b = f7 / 2.0f;
                float f10 = tv0Var.f27500b;
                k1Var.f14407c = f10 / 2.0f;
                float min = Math.min(f7, f10) / 5.0f;
                k1Var.e = min;
                k1Var.d = min;
                u1Var.h.f14408f = h1Var.getCurrentWeight();
                u1Var.h.f14409g = AndroidUtilities.dp(32.0f);
                u1Var.h.f14413l = x0.e(UserConfig.selectedAccount).f14559k;
                if (u1Var.h.f14405a.o() == 4) {
                    k1 k1Var2 = u1Var.h;
                    float f11 = tv0Var.f27499a / 2.0f;
                    k1Var2.d = f11;
                    k1Var2.f14406b = f11;
                    k1Var2.f14410i = f11 + 1.0f;
                    float f12 = tv0Var.f27500b;
                    float f13 = f12 / 3.0f;
                    float f14 = 1.0f * f13;
                    k1Var2.f14407c = f14;
                    float f15 = f12 / 2.0f;
                    k1Var2.f14411j = f15;
                    k1Var2.e = f13 * 2.0f;
                    k1Var2.f14412k = Math.abs(f14 - f15);
                    q1 q1Var = new q1(u1Var, 0);
                    arrayList2.add(q1Var);
                    r1 r1Var = new r1(u1Var, q1Var, 0);
                    arrayList2.add(r1Var);
                    arrayList.add(r1Var);
                    r1 r1Var2 = new r1(u1Var, q1Var, 1);
                    arrayList2.add(r1Var2);
                    arrayList.add(r1Var2);
                }
                if (u1Var.h.f14405a.o() == 0) {
                    arrayList2.add(new q1(u1Var, 1));
                }
                if (u1Var.h.f14405a.o() == 2) {
                    arrayList2.add(new q1(u1Var, 2));
                }
                if (u1Var.h.f14405a.o() == 1 || u1Var.h.f14405a.o() == 3) {
                    arrayList2.add(new s1(u1Var, u1Var.h, false, false));
                    arrayList2.add(new s1(u1Var, u1Var.h, true, false));
                    arrayList2.add(new s1(u1Var, u1Var.h, false, true));
                    arrayList2.add(new s1(u1Var, u1Var.h, true, true));
                    arrayList2.add(new q1(u1Var, 3, false));
                }
                if (u1Var.h.f14405a.o() == 3) {
                    k1 k1Var3 = u1Var.h;
                    k1Var3.f14410i = (k1Var3.d * 0.8f) + k1Var3.f14406b;
                    k1Var3.f14411j = (k1Var3.e * 1.2f) + k1Var3.f14407c + k1Var3.f14408f;
                    q1 q1Var2 = new q1(u1Var, 4);
                    arrayList2.add(q1Var2);
                    q1Var2.f14488b = false;
                    arrayList.add(q1Var2);
                }
                u1Var.f14507l = new q1(u1Var, 5, false);
                if (u1Var.h.f14405a.o() != 4) {
                    u1Var.f14507l.f14489c = false;
                }
                q1 q1Var3 = u1Var.f14507l;
                q1Var3.f14488b = false;
                arrayList.add(q1Var3);
                arrayList2.add(u1Var.f14507l);
                h1Var.getPainting().k(u1Var.h);
            }
        }
    }

    public void setBrushSize(float f7) {
        float f10 = this.f14390c.f14516g.f27499a;
        this.v = e2.x(f10, 0.043945312f, f7, 0.00390625f * f10);
        if (this.f14396x instanceof l) {
            u1 u1Var = this.f14391f;
            h1 h1Var = u1Var.f14499a;
            k1 k1Var = u1Var.h;
            if (k1Var != null && k1Var.f14408f != h1Var.getCurrentWeight()) {
                u1Var.h.f14408f = h1Var.getCurrentWeight();
                h1Var.getPainting().k(u1Var.h);
            }
        }
    }

    public void setColor(int i10) {
        this.f14395w = i10;
        if (this.f14396x instanceof l) {
            u1 u1Var = this.f14391f;
            if (u1Var.h != null) {
                u1Var.f14499a.getPainting().k(u1Var.h);
            }
        }
    }

    public void setDelegate(g1 g1Var) {
        this.f14388a = g1Var;
    }

    public void setUndoStore(y1 y1Var) {
        this.f14389b = y1Var;
    }

    public void g(m mVar) {
    }

    public void setQueue(DispatchQueue dispatchQueue) {
    }
}
