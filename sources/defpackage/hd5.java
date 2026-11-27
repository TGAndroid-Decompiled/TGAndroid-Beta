package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
public final class hd5 {
    public int A;
    public int B;
    public boolean C;
    public final wb2 a;
    public fd5 b;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public final mm j;
    public va6 k;
    public final mpa l;
    public int m;
    public final v41 n;
    public gd5 o;
    public boolean p;
    public pkb q;
    public pkb r;
    public long s;
    public Bitmap w;
    public Paint x;
    public int y;
    public int z;
    public final ArrayList c = new ArrayList();
    public final Path t = new Path();
    public final Path u = new Path();
    public final RectF v = new RectF();

    public hd5(wb2 wb2Var) {
        this.a = wb2Var;
        this.l = mpa.e(wb2Var);
        this.j = new mm(wb2Var, 0L, 350L, k43.h);
        this.n = new v41(wb2Var);
    }

    public final boolean a() {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (!((gd5) obj).f.R0) {
                return false;
            }
        }
        return true;
    }

    public final void b(Canvas canvas) {
        ArrayList arrayList;
        wb2 wb2Var;
        RectF rectF;
        Path path;
        float f;
        float f2;
        float f3;
        float f4;
        Path path2;
        float f5;
        r47 r47Var;
        float f6;
        long[] jArr;
        d7a d7aVar;
        boolean z;
        int a;
        int max;
        Canvas canvas2 = canvas;
        if (this.b != null) {
            boolean z2 = this.i;
            mm mmVar = this.j;
            float d = mmVar.d(z2);
            float d2 = mmVar.d(this.i);
            wb2 wb2Var2 = this.a;
            r47 messageObject = wb2Var2.getMessageObject();
            Path path3 = this.u;
            path3.rewind();
            float f7 = Float.MAX_VALUE;
            float f8 = Float.MIN_VALUE;
            float f9 = Float.MIN_VALUE;
            int i = 0;
            float f10 = Float.MAX_VALUE;
            while (true) {
                arrayList = this.c;
                if (i >= arrayList.size()) {
                    break;
                }
                gd5 gd5Var = (gd5) arrayList.get(i);
                ImageReceiver imageReceiver = gd5Var.f;
                RadialProgress2 radialProgress2 = gd5Var.H;
                int i2 = this.d;
                int i3 = gd5Var.a;
                float f11 = d;
                int i4 = this.e;
                int i5 = gd5Var.b;
                float f12 = d2;
                wb2 wb2Var3 = wb2Var2;
                imageReceiver.i0(i2 + i3, i4 + i5, gd5Var.c - i3, gd5Var.d - i5);
                imageReceiver.h(canvas2, null);
                if (imageReceiver.m() != null) {
                    imageReceiver.m().getClass();
                    if (!gd5Var.y && gd5Var.L != (max = Math.max(0, gd5Var.K))) {
                        gd5Var.L = max;
                        gd5Var.M = new pkb(hl.g0(max, true, false), 12.0f, null);
                    }
                }
                if (f12 > 0.0f) {
                    float min = Math.min(this.d + gd5Var.a, f7);
                    float min2 = Math.min(this.e + gd5Var.b, f10);
                    f8 = Math.max(this.d + gd5Var.c, f8);
                    f9 = Math.max(this.e + gd5Var.d, f9);
                    RectF rectF2 = hl.P;
                    int i6 = this.d;
                    int i7 = this.e;
                    rectF2.set(gd5Var.a + i6, gd5Var.b + i7, i6 + gd5Var.c, i7 + gd5Var.d);
                    path3.addRoundRect(rectF2, gd5Var.s, Path.Direction.CW);
                    f7 = min;
                    f10 = min2;
                }
                radialProgress2.g(aob.cf, aob.df, aob.ef, aob.ff);
                RectF rectF3 = radialProgress2.a;
                float f13 = imageReceiver.L0;
                float f14 = imageReceiver.N0 / 2.0f;
                float f15 = radialProgress2.x;
                float f16 = f7;
                float f17 = f10;
                float f18 = imageReceiver.M0;
                float f19 = imageReceiver.O0 / 2.0f;
                rectF3.set((f14 - f15) + f13, (f19 - f15) + f18, f14 + f15 + f13, f19 + f15 + f18);
                boolean n4 = messageObject.n4();
                int i8 = messageObject.K1;
                if (n4) {
                    r7a B = r7a.B(i8);
                    long[] t = in5.z().t(gd5Var.G);
                    int e1 = messageObject.e1();
                    HashMap hashMap = B.a;
                    if (hashMap != null) {
                        Iterator it = hashMap.values().iterator();
                        d7a d7aVar2 = null;
                        while (true) {
                            if (it.hasNext()) {
                                ArrayList arrayList2 = (ArrayList) it.next();
                                if (arrayList2 != null) {
                                    int size = arrayList2.size();
                                    r47Var = messageObject;
                                    int i9 = 0;
                                    while (true) {
                                        if (i9 < size) {
                                            Object obj = arrayList2.get(i9);
                                            int i10 = i9 + 1;
                                            d7a d7aVar3 = (d7a) obj;
                                            jArr = t;
                                            ArrayList arrayList3 = d7aVar3.z;
                                            if (arrayList3 == null) {
                                                t = jArr;
                                                i9 = i10;
                                            } else {
                                                int size2 = arrayList3.size();
                                                f6 = f8;
                                                int i11 = 0;
                                                while (true) {
                                                    if (i11 >= size2) {
                                                        break;
                                                    }
                                                    Object obj2 = arrayList3.get(i11);
                                                    i11++;
                                                    int i12 = size2;
                                                    TLRPC.Message message = (TLRPC.Message) obj2;
                                                    if (message != null && message.id == e1) {
                                                        d7aVar2 = d7aVar3;
                                                        break;
                                                    }
                                                    size2 = i12;
                                                }
                                                if (d7aVar2 != null) {
                                                    break;
                                                }
                                                t = jArr;
                                                i9 = i10;
                                                f8 = f6;
                                            }
                                        } else {
                                            jArr = t;
                                            f6 = f8;
                                            break;
                                        }
                                    }
                                    if (d7aVar2 != null) {
                                        break;
                                    }
                                    t = jArr;
                                    messageObject = r47Var;
                                    f8 = f6;
                                }
                            } else {
                                r47Var = messageObject;
                                jArr = t;
                                f6 = f8;
                                break;
                            }
                        }
                        d7aVar = d7aVar2;
                    } else {
                        r47Var = messageObject;
                        jArr = t;
                        f6 = f8;
                        d7aVar = null;
                    }
                    if (d7aVar != null && i >= 0 && i < d7aVar.z.size()) {
                        e1 = ((TLRPC.Message) d7aVar.z.get(i)).id;
                    }
                    if (B.c.indexOfKey(e1) < 0 && B.d.indexOfKey(e1) < 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (jArr == null && z) {
                        radialProgress2.o(true, 1.0f);
                        if (gd5Var.x) {
                            a = 6;
                        } else {
                            a = gd5Var.a();
                        }
                        gd5Var.b(a);
                    }
                } else {
                    r47Var = messageObject;
                    f6 = f8;
                    if (xb4.G(i8).S(gd5Var.w)) {
                        gd5Var.b(3);
                    } else {
                        gd5Var.b(gd5Var.a());
                    }
                }
                canvas2.saveLayerAlpha(rectF3, (int) ((1.0f - f12) * 255.0f), 31);
                radialProgress2.draw(canvas2);
                canvas2.restore();
                i++;
                f10 = f17;
                d = f11;
                wb2Var2 = wb2Var3;
                d2 = f12;
                f7 = f16;
                messageObject = r47Var;
                f8 = f6;
            }
            float f20 = d;
            float f21 = d2;
            wb2 wb2Var4 = wb2Var2;
            if (f21 > 0.0f) {
                canvas2.save();
                canvas2.clipPath(path3);
                canvas2.translate(f7, f10);
                int i13 = (int) (f8 - f7);
                int i14 = (int) (f9 - f10);
                canvas2.saveLayerAlpha(0.0f, 0.0f, i13, i14, (int) (f21 * 255.0f), 31);
                this.l.c(canvas, wb2Var4, i13, i14, 1.0f, wb2Var4.Tc);
                canvas2 = canvas;
                wb2Var = wb2Var4;
                canvas2.restore();
                canvas2.restore();
                wb2Var.invalidate();
            } else {
                wb2Var = wb2Var4;
            }
            int i15 = 0;
            while (true) {
                int size3 = arrayList.size();
                rectF = this.v;
                path = this.t;
                if (i15 >= size3) {
                    break;
                }
                gd5 gd5Var2 = (gd5) arrayList.get(i15);
                if (gd5Var2.M != null) {
                    float L = hl.L(11.4f) + gd5Var2.M.c;
                    float L2 = hl.L(17.0f);
                    float L3 = hl.L(5.0f);
                    float f22 = this.d + gd5Var2.a + L3;
                    float f23 = this.e + gd5Var2.b + L3;
                    rectF.set(f22, f23, L + f22, f23 + L2);
                    if (this.r == null || rectF.right <= ((this.d + this.g) - (hl.L(11.32f) + this.r.c)) - L3 || rectF.top > this.e + L3) {
                        path.rewind();
                        float f24 = L2 / 2.0f;
                        path.addRoundRect(rectF, f24, f24, Path.Direction.CW);
                        canvas2.save();
                        canvas2.clipPath(path);
                        f5 = f21;
                        c(canvas2, f5);
                        canvas2.drawColor(aob.p1(1.0f, 1073741824));
                        gd5Var2.M.c(this.d + gd5Var2.a + L3 + hl.L(5.66f), this.e + gd5Var2.b + L3 + f24, 1.0f, -1, canvas2);
                        canvas2.restore();
                        i15++;
                        f21 = f5;
                    }
                }
                f5 = f21;
                i15++;
                f21 = f5;
            }
            if (this.q != null && f20 > 0.0f) {
                float a2 = this.n.a(0.05f);
                float L4 = hl.L(28.0f) + this.q.c;
                float L5 = hl.L(32.0f);
                float f25 = this.d;
                float f26 = this.g;
                float z3 = bp1.z(f26, L4, 2.0f, f25);
                f = 11.32f;
                float f27 = this.e;
                f2 = 5.0f;
                float f28 = this.h;
                f3 = 17.0f;
                rectF.set(z3, bp1.z(f28, L5, 2.0f, f27), qd4.e(f26, L4, 2.0f, f25), qd4.e(f28, L5, 2.0f, f27));
                path.rewind();
                float f29 = L5 / 2.0f;
                path.addRoundRect(rectF, f29, f29, Path.Direction.CW);
                canvas2.save();
                canvas2.scale(a2, a2, (this.g / 2.0f) + this.d, (this.h / 2.0f) + this.e);
                canvas2.save();
                canvas2.clipPath(path);
                f4 = f20;
                c(canvas2, f4);
                canvas2.drawColor(aob.p1(f4, 1342177280));
                path2 = path;
                this.q.c((((this.g / 2.0f) + this.d) - (L4 / 2.0f)) + hl.L(14.0f), this.e + (this.h / 2.0f), f4, -1, canvas2);
                canvas2.restore();
                if (wb2Var.getDelegate() != null && wb2Var.getDelegate().k1(wb2Var, 5)) {
                    va6 va6Var = this.k;
                    if (va6Var == null) {
                        va6 va6Var2 = new va6();
                        this.k = va6Var2;
                        va6Var2.setCallback(wb2Var);
                        this.k.g(aob.p1(0.1f, -1), aob.p1(0.3f, -1), aob.p1(0.35f, -1), aob.p1(0.8f, -1));
                        va6 va6Var3 = this.k;
                        va6Var3.D = true;
                        va6Var3.x.setStrokeWidth(hl.N(1.25f));
                    } else if (va6Var.c() || this.k.d()) {
                        va6 va6Var4 = this.k;
                        va6Var4.b = -1L;
                        va6Var4.c = -1L;
                    }
                } else {
                    va6 va6Var5 = this.k;
                    if (va6Var5 != null && !va6Var5.d() && !this.k.c()) {
                        this.k.a();
                    }
                }
                va6 va6Var6 = this.k;
                if (va6Var6 != null) {
                    va6Var6.e(rectF);
                    this.k.j(f29);
                    this.k.setAlpha((int) (f4 * 255.0f));
                    this.k.draw(canvas2);
                }
                canvas2.restore();
            } else {
                f = 11.32f;
                f2 = 5.0f;
                f3 = 17.0f;
                f4 = f20;
                path2 = path;
            }
            if (this.r != null && f4 < 1.0f && a()) {
                float timeAlpha = wb2Var.getTimeAlpha() * (1.0f - f4);
                float L6 = hl.L(f) + this.r.c;
                float L7 = hl.L(f3);
                float L8 = hl.L(f2);
                float f30 = this.d + this.g;
                float f31 = this.e + L8;
                rectF.set((f30 - L6) - L8, f31, f30 - L8, f31 + L7);
                path2.rewind();
                float f32 = L7 / 2.0f;
                path2.addRoundRect(rectF, f32, f32, Path.Direction.CW);
                canvas2.save();
                canvas2.clipPath(path2);
                canvas2.drawColor(aob.p1(timeAlpha, 1073741824));
                this.r.c(hl.L(5.66f) + (((this.d + this.g) - L6) - L8), f32 + this.e + L8, timeAlpha, -1, canvas2);
                canvas.restore();
            }
        }
    }

    public final void c(Canvas canvas, float f) {
        int i;
        float f2;
        ArrayList arrayList;
        int i2;
        int i3;
        if (this.b != null) {
            wb2 wb2Var = this.a;
            if (wb2Var.getMessageObject() != null) {
                i = wb2Var.getMessageObject().e1();
            } else {
                i = 0;
            }
            int i4 = this.g;
            int i5 = this.h;
            float f3 = 100.0f;
            if (i4 > i5) {
                f2 = 100.0f;
            } else {
                f2 = (i4 / i5) * 100.0f;
            }
            int max = (int) Math.max(1.0f, f2);
            int i6 = this.h;
            int i7 = this.g;
            if (i6 <= i7) {
                f3 = 100.0f * (i6 / i7);
            }
            int max2 = (int) Math.max(1.0f, f3);
            int i8 = 0;
            int i9 = 0;
            while (true) {
                arrayList = this.c;
                if (i8 >= arrayList.size()) {
                    break;
                }
                gd5 gd5Var = (gd5) arrayList.get(i8);
                if (gd5Var.f.D() && gd5Var.f.n() != null) {
                    i9 |= 1 << i8;
                }
                i8++;
            }
            Bitmap bitmap = this.w;
            if (bitmap == null || this.z != i || this.y != i9 || this.A != max || this.B != max2) {
                this.y = i9;
                this.z = i;
                this.A = max;
                this.B = max2;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.w = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(this.w);
                float f4 = max / this.g;
                canvas2.scale(f4, f4);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    gd5 gd5Var2 = (gd5) arrayList.get(i10);
                    gd5Var2.f.i0(gd5Var2.a, gd5Var2.b, gd5Var2.c - i2, gd5Var2.d - i3);
                    gd5Var2.f.h(canvas2, null);
                }
                Utilities.stackBlurBitmap(this.w, 12);
                if (this.x == null) {
                    this.x = new Paint(3);
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.5f);
                    this.x.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
            }
            if (this.w != null) {
                canvas.save();
                canvas.translate(this.d, this.e);
                canvas.scale(this.g / this.w.getWidth(), this.g / this.w.getWidth());
                this.x.setAlpha((int) (f * 255.0f));
                canvas.drawBitmap(this.w, 0.0f, 0.0f, this.x);
                canvas.restore();
            }
        }
    }

    public final gd5 d(float f, float f2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i < arrayList.size()) {
                if (((gd5) arrayList.get(i)).f.H(f, f2)) {
                    return (gd5) arrayList.get(i);
                }
                i++;
            } else {
                return null;
            }
        }
    }

    public final void e() {
        if (this.C) {
            this.C = false;
            mpa mpaVar = this.l;
            if (mpaVar != null) {
                mpaVar.a(this.a);
            }
            int i = 0;
            while (true) {
                ArrayList arrayList = this.c;
                if (i < arrayList.size()) {
                    gd5 gd5Var = (gd5) arrayList.get(i);
                    if (gd5Var.N) {
                        gd5Var.N = false;
                        gd5Var.f.K();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final boolean f(MotionEvent motionEvent) {
        boolean z;
        gd5 gd5Var;
        wb2 wb2Var;
        boolean z2;
        boolean z3;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            gd5 d = d(x, y);
            this.o = d;
            if (d != null) {
                RadialProgress2 radialProgress2 = d.H;
                if (radialProgress2.i.q != 4 && radialProgress2.a.contains(x, y)) {
                    z3 = true;
                    this.p = z3;
                }
            }
            z3 = false;
            this.p = z3;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            gd5 d2 = d(x, y);
            if (d2 != null) {
                RadialProgress2 radialProgress22 = d2.H;
                if (radialProgress22.i.q != 4 && radialProgress22.a.contains(x, y)) {
                    z = true;
                    gd5Var = this.o;
                    if (gd5Var != null && gd5Var == d2) {
                        wb2Var = this.a;
                        if (wb2Var.getDelegate() != null && motionEvent.getAction() == 1) {
                            r47 messageObject = wb2Var.getMessageObject();
                            if (!this.p && z && d2.H.i.q == 3 && messageObject != null) {
                                if (messageObject.n4()) {
                                    r7a.B(messageObject.K1).f(messageObject);
                                }
                            } else {
                                rb2 delegate = wb2Var.getDelegate();
                                gd5 gd5Var2 = this.o;
                                ImageReceiver imageReceiver = gd5Var2.f;
                                TLRPC.MessageExtendedMedia messageExtendedMedia = gd5Var2.F;
                                motionEvent.getX();
                                motionEvent.getY();
                                delegate.U(wb2Var, messageExtendedMedia);
                            }
                        }
                    }
                    this.p = false;
                    this.o = null;
                }
            }
            z = false;
            gd5Var = this.o;
            if (gd5Var != null) {
                wb2Var = this.a;
                if (wb2Var.getDelegate() != null) {
                    r47 messageObject2 = wb2Var.getMessageObject();
                    if (!this.p) {
                    }
                    rb2 delegate2 = wb2Var.getDelegate();
                    gd5 gd5Var22 = this.o;
                    ImageReceiver imageReceiver2 = gd5Var22.f;
                    TLRPC.MessageExtendedMedia messageExtendedMedia2 = gd5Var22.F;
                    motionEvent.getX();
                    motionEvent.getY();
                    delegate2.U(wb2Var, messageExtendedMedia2);
                }
            }
            this.p = false;
            this.o = null;
        }
        if (this.o != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.n.c(z2);
        if (this.o == null) {
            return false;
        }
        return true;
    }

    public final void g(defpackage.r47 r36) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hd5.g(r47):void");
    }

    public final void h(r47 r47Var) {
        boolean z;
        boolean z2;
        int i;
        float f;
        int i2;
        int i3;
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        boolean z3;
        boolean z4;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z5;
        wb2 wb2Var = this.a;
        boolean z6 = false;
        if (wb2Var.gb <= 0 && (!wb2Var.w1 || TextUtils.isEmpty(r47Var.z))) {
            z = false;
        } else {
            z = true;
        }
        if ((wb2Var.w1 || TextUtils.isEmpty(r47Var.z)) && wb2Var.O.p && !wb2Var.x7) {
            z2 = false;
        } else {
            z2 = true;
        }
        int i9 = this.m;
        float f2 = 1000.0f;
        if (i9 > 0) {
            f = 1000.0f / this.b.d;
            this.f = i9;
        } else {
            if (hl.O1()) {
                this.f = hl.P0() - hl.L(122.0f);
            } else {
                int min = Math.min(wb2Var.getParentWidth(), hl.q.y);
                if (wb2Var.W(r47Var)) {
                    i = 10;
                } else {
                    i = 0;
                }
                this.f = min - hl.L(i + 64);
            }
            if (wb2Var.b3()) {
                this.f -= hl.L(52.0f);
            }
            f = 1.0f;
        }
        fd5 fd5Var = this.b;
        this.g = (int) ((fd5Var.d / 1000.0f) * f * this.f);
        this.h = (int) (fd5Var.g * fd5Var.i);
        this.i = false;
        int L = hl.L(1.0f);
        int L2 = hl.L(4.0f);
        char c = 2;
        if (xea.U0 > 2) {
            i3 = 2;
        } else {
            i3 = 0;
        }
        int L3 = hl.L(i2 - i3);
        int min2 = Math.min(hl.L(3.0f), L3);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            float f3 = f2;
            j47 j47Var = null;
            if (i10 >= arrayList.size()) {
                break;
            }
            gd5 gd5Var = (gd5) arrayList.get(i10);
            fd5 fd5Var2 = this.b;
            char c2 = c;
            TLRPC.MessageExtendedMedia messageExtendedMedia = gd5Var.F;
            boolean z7 = z6;
            ImageReceiver imageReceiver = gd5Var.f;
            if (messageExtendedMedia == null) {
                fd5Var2.getClass();
            } else {
                j47Var = (j47) fd5Var2.c.get(messageExtendedMedia);
            }
            if (j47Var == null) {
                z3 = z;
                z4 = z2;
                i4 = L;
            } else {
                float f4 = this.f;
                int i11 = (int) ((j47Var.o / f3) * f * f4);
                z3 = z;
                float f5 = j47Var.n;
                float f6 = this.b.i;
                int i12 = (int) (f5 * f6);
                int i13 = (int) (j47Var.f * f6);
                int i14 = (int) ((j47Var.e / f3) * f * f4);
                int i15 = j47Var.l;
                if ((i15 & 1) == 0) {
                    i11 += L;
                    i14 -= L;
                }
                if ((i15 & 4) == 0) {
                    i12 += L;
                    i13 -= L;
                }
                int i16 = i12;
                int i17 = i13;
                if ((i15 & 2) == 0) {
                    i14 -= L;
                }
                int i18 = i14;
                if ((i15 & 8) == 0) {
                    i17 -= L;
                }
                z4 = z2;
                int i19 = i17;
                gd5Var.a = i11;
                gd5Var.b = i16;
                i4 = L;
                gd5Var.c = i11 + i18;
                gd5Var.d = i16 + i19;
                imageReceiver.i0(i11, i16, i18, i19);
                int i20 = j47Var.l;
                int i21 = i20 & 4;
                if (i21 != 0 && (i20 & 1) != 0 && !z3) {
                    i5 = L3;
                } else {
                    i5 = L2;
                }
                if (i21 != 0 && (i20 & 2) != 0 && !z3) {
                    i6 = L3;
                } else {
                    i6 = L2;
                }
                int i22 = i20 & 8;
                if (i22 != 0 && (i20 & 1) != 0 && !z4) {
                    i7 = L3;
                } else {
                    i7 = L2;
                }
                if (i22 != 0 && (i20 & 2) != 0 && !z4) {
                    i8 = L3;
                } else {
                    i8 = L2;
                }
                if (!z4) {
                    if (r47Var.O3()) {
                        i8 = L2;
                    } else {
                        i7 = L2;
                    }
                }
                if (!z3 && wb2Var.F) {
                    if (r47Var.O3()) {
                        i6 = min2;
                    } else {
                        i5 = min2;
                    }
                }
                imageReceiver.r0(i5, i6, i8, i7);
                float[] fArr = gd5Var.s;
                float f7 = i5;
                fArr[1] = f7;
                fArr[z7 ? 1 : 0] = f7;
                float f8 = i6;
                fArr[3] = f8;
                fArr[c2] = f8;
                float f9 = i8;
                fArr[5] = f9;
                fArr[4] = f9;
                float f10 = i7;
                fArr[7] = f10;
                fArr[6] = f10;
                if (r47Var != null && r47Var.n4()) {
                    gd5Var.b(3);
                }
                if (!this.i && !gd5Var.h) {
                    z5 = z7 ? 1 : 0;
                } else {
                    z5 = true;
                }
                this.i = z5;
            }
            i10++;
            f2 = f3;
            c = c2;
            z6 = z7 ? 1 : 0;
            z = z3;
            L = i4;
            z2 = z4;
        }
        boolean z8 = z6;
        if (this.i) {
            if (r47Var == null) {
                tL_messageMediaPaidMedia = null;
            } else {
                tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) r47Var.k.media;
            }
            if (tL_messageMediaPaidMedia != null) {
                pkb pkbVar = new pkb(nza.b1(z8, ob6.H(',', "UnlockPaidContent", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, hl.o());
                this.q = pkbVar;
                if (pkbVar.c > this.g - hl.L(30.0f)) {
                    this.q = new pkb(nza.b1(false, ob6.H(',', "UnlockPaidContentShort", (int) tL_messageMediaPaidMedia.stars_amount), 0.7f, null), 14.0f, hl.o());
                }
            }
        }
    }
}
