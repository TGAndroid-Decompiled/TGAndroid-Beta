package l2;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.location.Location;
import android.location.LocationManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import b8.kg;
import b8.oc;
import b8.zb;
import d2.e1;
import d2.k1;
import d2.n1;
import d2.v;
import e5.u;
import g2.n0;
import g9.i0;
import g9.x1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import m.l1;
import m.m2;
import m.q;
import m.z2;
import m2.t;
import mi.h0;
import o4.e0;
import o4.x;
import org.telegram.messenger.a8;
import org.telegram.messenger.jd;
import org.telegram.messenger.t0;
import org.telegram.messenger.uy;
import org.telegram.messenger.vs;
import org.telegram.ui.Components.wv0;
import org.telegram.ui.LaunchActivity;
import p6.m;
import t2.o;
import w2.g0;
import x7.r;
public class e {
    public Object f17689a;
    public Object f17690b;
    public Object f17691c;
    public Object d;
    public Object f17692e;
    public Object f17693f;

    public e(int i3, int i10) {
        Paint paint = new Paint(1);
        this.f17689a = paint;
        this.d = new RectF();
        this.f17693f = new Matrix();
        Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, i3), Math.max(1, i10), Bitmap.Config.ARGB_8888);
        this.f17691c = createBitmap;
        this.f17690b = new Canvas(createBitmap);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
        this.f17692e = bitmapShader;
        paint.setShader(bitmapShader);
        t();
    }

    public static boolean b(int[] iArr, int i3) {
        for (int i10 : iArr) {
            if (i10 == i3) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList e(Context context, int i3) {
        int c2 = z2.c(context, 2130968728);
        return new ColorStateList(new int[][]{z2.f18802b, z2.d, z2.f18803c, z2.f18805f}, new int[]{z2.b(context, 2130968726), i0.a.k(c2, i3), i0.a.k(c2, i3), i3});
    }

    public static g0 g(e1 e1Var, i0 i0Var, g0 g0Var, k1 k1Var) {
        Object l10;
        int i3;
        n1 y02 = e1Var.y0();
        int B = e1Var.B();
        if (y02.p()) {
            l10 = null;
        } else {
            l10 = y02.l(B);
        }
        if (!e1Var.n() && !y02.p()) {
            i3 = y02.f(B, k1Var, false).b(n0.S(e1Var.N0()) - k1Var.f8164e);
        } else {
            i3 = -1;
        }
        int i10 = i3;
        for (int i11 = 0; i11 < i0Var.size(); i11++) {
            g0 g0Var2 = (g0) i0Var.get(i11);
            if (k(g0Var2, l10, e1Var.n(), e1Var.k0(), e1Var.M(), i10)) {
                return g0Var2;
            }
        }
        if (!i0Var.isEmpty() || g0Var == null || !k(g0Var, l10, e1Var.n(), e1Var.k0(), e1Var.M(), i10)) {
            return null;
        }
        return g0Var;
    }

    public static LayerDrawable i(m2 m2Var, Context context, int i3) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i3);
        Drawable g7 = m2Var.g(context, 2131230846);
        Drawable g10 = m2Var.g(context, 2131230847);
        if ((g7 instanceof BitmapDrawable) && g7.getIntrinsicWidth() == dimensionPixelSize && g7.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) g7;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            g7.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            g7.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((g10 instanceof BitmapDrawable) && g10.getIntrinsicWidth() == dimensionPixelSize && g10.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) g10;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            g10.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            g10.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908303);
        layerDrawable.setId(2, 16908301);
        return layerDrawable;
    }

    public static boolean k(g0 g0Var, Object obj, boolean z10, int i3, int i10, int i11) {
        Object obj2 = g0Var.f57081a;
        int i12 = g0Var.f57082b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (!z10 || i12 != i3 || g0Var.f57083c != i10) {
            if (z10 || i12 != -1 || g0Var.f57084e != i11) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static void p(Drawable drawable, int i3, PorterDuff.Mode mode) {
        PorterDuffColorFilter h;
        int[] iArr = l1.f18640a;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = q.f18703b;
        }
        PorterDuff.Mode mode2 = q.f18703b;
        synchronized (q.class) {
            h = m2.h(i3, mode);
        }
        mutate.setColorFilter(h);
    }

    public void a(kg kgVar, g0 g0Var, n1 n1Var) {
        if (g0Var != null) {
            if (n1Var.b(g0Var.f57081a) != -1) {
                kgVar.w(g0Var, n1Var);
                return;
            }
            n1 n1Var2 = (n1) ((x1) this.f17691c).get(g0Var);
            if (n1Var2 != null) {
                kgVar.w(g0Var, n1Var2);
            }
        }
    }

    public s9.b c() {
        String str;
        String str2;
        m.h((String) this.f17693f, "setActionToken is required before calling build().");
        new String((String) this.f17692e);
        l("actionToken", (String) this.f17693f);
        String str3 = (String) this.f17691c;
        String str4 = null;
        if (str3 == null) {
            str = null;
        } else {
            str = new String(str3);
        }
        if (str == null) {
            this.f17691c = "AssistAction";
            l("name", "AssistAction");
        }
        String str5 = (String) this.d;
        if (str5 != null) {
            str4 = new String(str5);
        }
        if (str4 == null) {
            String valueOf = String.valueOf((String) this.f17693f);
            if (valueOf.length() != 0) {
                str2 = "https://developers.google.com/actions?invocation=".concat(valueOf);
            } else {
                str2 = new String("https://developers.google.com/actions?invocation=");
            }
            m.g(str2);
            this.d = str2;
            l("url", str2);
        }
        m.h((String) this.f17691c, "setObject is required before calling build().");
        m.h((String) this.d, "setObject is required before calling build().");
        return new s9.b((String) this.f17690b, (String) this.f17691c, (String) this.d, null, new s9.a(), (String) this.f17692e, (Bundle) this.f17689a);
    }

    public void d() {
        ((LocationManager) this.f17690b).removeUpdates((jd) this.f17691c);
        ((LocationManager) this.f17690b).removeUpdates((jd) this.d);
        this.f17693f = null;
        this.f17692e = null;
    }

    public void f(uf.d dVar) {
        if (((uf.d) this.f17692e) == dVar) {
            LaunchActivity launchActivity = (LaunchActivity) this.d;
            if (Build.VERSION.SDK_INT >= 26) {
                if (dVar != null) {
                    org.telegram.messenger.g0.w3(launchActivity, dVar.a());
                } else {
                    org.telegram.messenger.g0.c3(launchActivity);
                }
            }
            x xVar = (x) this.f17693f;
            if (xVar != null) {
                e1 e1Var = xVar.f20895a.f20636t.f20751a;
                k2.i0 i0Var = dVar.f55858l;
                if (e1Var != i0Var) {
                    xVar.a(i0Var);
                }
            }
        }
        ((uf.a) this.f17691c).invalidate();
    }

    public uf.a h() {
        if (((uf.a) this.f17691c) == null) {
            this.f17691c = new uf.a((LaunchActivity) this.d);
        }
        return (uf.a) this.f17691c;
    }

    public ColorStateList j(Context context, int i3) {
        if (i3 == 2131230803) {
            return oc.a(context, 2131099669);
        }
        if (i3 == 2131230849) {
            return oc.a(context, 2131099672);
        }
        if (i3 == 2131230848) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList d = z2.d(context, 2130968734);
            if (d != null && d.isStateful()) {
                int[] iArr3 = z2.f18802b;
                iArr[0] = iArr3;
                iArr2[0] = d.getColorForState(iArr3, 0);
                iArr[1] = z2.f18804e;
                iArr2[1] = z2.c(context, 2130968727);
                iArr[2] = z2.f18805f;
                iArr2[2] = d.getDefaultColor();
            } else {
                iArr[0] = z2.f18802b;
                iArr2[0] = z2.b(context, 2130968734);
                iArr[1] = z2.f18804e;
                iArr2[1] = z2.c(context, 2130968727);
                iArr[2] = z2.f18805f;
                iArr2[2] = z2.c(context, 2130968734);
            }
            return new ColorStateList(iArr, iArr2);
        } else if (i3 == 2131230791) {
            return e(context, z2.c(context, 2130968726));
        } else {
            if (i3 == 2131230785) {
                return e(context, 0);
            }
            if (i3 == 2131230790) {
                return e(context, z2.c(context, 2130968724));
            }
            if (i3 != 2131230844 && i3 != 2131230845) {
                if (b((int[]) this.f17690b, i3)) {
                    return z2.d(context, 2130968729);
                }
                if (b((int[]) this.f17692e, i3)) {
                    return oc.a(context, 2131099668);
                }
                if (b((int[]) this.f17693f, i3)) {
                    return oc.a(context, 2131099667);
                }
                if (i3 == 2131230841) {
                    return oc.a(context, 2131099670);
                }
                return null;
            }
            return oc.a(context, 2131099671);
        }
    }

    public void l(String str, String... strArr) {
        Bundle bundle = (Bundle) this.f17689a;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length > 0) {
            int i3 = 0;
            for (int i10 = 0; i10 < Math.min(strArr2.length, 100); i10++) {
                String str2 = strArr2[i10];
                strArr2[i3] = str2;
                if (strArr2[i10] == null) {
                    StringBuilder sb2 = new StringBuilder(59);
                    sb2.append("String at ");
                    sb2.append(i10);
                    sb2.append(" is null and is ignored by put method.");
                    r.a(sb2.toString());
                } else {
                    int i11 = 20000;
                    if (str2.length() > 20000) {
                        StringBuilder sb3 = new StringBuilder(53);
                        sb3.append("String at ");
                        sb3.append(i10);
                        sb3.append(" is too long, truncating string.");
                        r.a(sb3.toString());
                        String str3 = strArr2[i3];
                        if (str3.length() > 20000) {
                            if (Character.isHighSurrogate(str3.charAt(19999)) && Character.isLowSurrogate(str3.charAt(20000))) {
                                i11 = 19999;
                            }
                            str3 = str3.substring(0, i11);
                        }
                        strArr2[i3] = str3;
                    }
                    i3++;
                }
            }
            if (i3 > 0) {
                Object[] objArr = (String[]) Arrays.copyOfRange(strArr2, 0, i3);
                if (objArr.length >= 100) {
                    r.a("Input Array of elements is too big, cutting off.");
                    objArr = Arrays.copyOf(objArr, 100);
                }
                bundle.putStringArray(str, (String[]) objArr);
                return;
            }
            return;
        }
        r.a("String array is empty and is ignored by put method.");
    }

    public void m(float f10, float f11, float f12, float f13) {
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(f10, f11, f12, f13);
        RectF rectF2 = (RectF) this.d;
        if (rectF2.top == rectF.top && rectF2.bottom == rectF.bottom && rectF2.left == rectF.left && rectF2.right == rectF.right) {
            return;
        }
        rectF2.set(rectF);
        t();
    }

    public void n(java.lang.String r3, android.os.Bundle r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: l2.e.n(java.lang.String, android.os.Bundle, boolean):void");
    }

    public void o(float f10, float f11, float f12, float f13) {
        Matrix matrix = (Matrix) this.f17693f;
        matrix.reset();
        Bitmap bitmap = (Bitmap) this.f17691c;
        matrix.postRotate(f13, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        matrix.postScale(f12, f12);
        matrix.postTranslate(f10, f11);
        ((BitmapShader) this.f17692e).setLocalMatrix(matrix);
    }

    public void q() {
        if (((LocationManager) this.f17690b) == null) {
            this.f17690b = (LocationManager) t0.f25457b.getSystemService("location");
        }
        try {
            ((LocationManager) this.f17690b).requestLocationUpdates("gps", 1L, 0.0f, (jd) this.f17691c);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        try {
            ((LocationManager) this.f17690b).requestLocationUpdates("network", 1L, 0.0f, (jd) this.d);
        } catch (Exception e11) {
            a8.g(e11, true);
        }
        try {
            Location lastKnownLocation = ((LocationManager) this.f17690b).getLastKnownLocation("gps");
            this.f17693f = lastKnownLocation;
            if (lastKnownLocation == null) {
                this.f17693f = ((LocationManager) this.f17690b).getLastKnownLocation("network");
            }
        } catch (Exception e12) {
            a8.g(e12, true);
        }
        vs vsVar = (vs) this.f17692e;
        if (vsVar != null) {
            org.telegram.messenger.g0.r(vsVar);
        }
        vs vsVar2 = new vs(this, 14);
        this.f17692e = vsVar2;
        org.telegram.messenger.g0.i3(vsVar2, 5000L);
    }

    public void r() {
        if (((LocationManager) this.f17690b) == null) {
            return;
        }
        vs vsVar = (vs) this.f17692e;
        if (vsVar != null) {
            org.telegram.messenger.g0.r(vsVar);
        }
        d();
    }

    public void s(boolean z10) {
        ArrayList arrayList = (ArrayList) this.f17691c;
        ArrayList arrayList2 = (ArrayList) this.f17690b;
        ArrayList arrayList3 = (ArrayList) this.f17689a;
        for (int i3 = 0; i3 < arrayList3.size(); i3++) {
            ((ValueAnimator) arrayList3.get(i3)).cancel();
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) ((ArrayList) this.d).get(i3)).floatValue(), 0.0f);
                ofFloat.addUpdateListener(new wv0(this, i3, 0));
                ofFloat.setDuration(100L);
                ofFloat.start();
            }
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            ((ValueAnimator) arrayList2.get(i10)).cancel();
            if (z10) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(((Float) ((ArrayList) this.f17692e).get(i10)).floatValue(), 0.0f);
                ofFloat2.addUpdateListener(new wv0(this, i10, 1));
                ofFloat2.setDuration(100L);
                ofFloat2.start();
            }
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((ValueAnimator) arrayList.get(i11)).cancel();
            if (z10) {
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(((Float) ((ArrayList) this.f17693f).get(i11)).floatValue(), 0.0f);
                ofFloat3.addUpdateListener(new wv0(this, i11, 2));
                ofFloat3.setDuration(100L);
                ofFloat3.start();
            }
        }
        arrayList.clear();
        arrayList2.clear();
        arrayList3.clear();
    }

    public void t() {
        Bitmap bitmap = (Bitmap) this.f17691c;
        RectF rectF = (RectF) this.d;
        Matrix matrix = (Matrix) this.f17693f;
        BitmapShader bitmapShader = (BitmapShader) this.f17692e;
        if (bitmapShader == null) {
            return;
        }
        float width = rectF.width() / bitmap.getWidth();
        float height = rectF.height() / bitmap.getHeight();
        matrix.reset();
        matrix.postTranslate(rectF.left, rectF.top);
        matrix.preScale(width, height);
        bitmapShader.setLocalMatrix(matrix);
    }

    public void u(n1 n1Var) {
        kg kgVar = new kg(4, 8);
        if (((i0) this.f17690b).isEmpty()) {
            a(kgVar, (g0) this.f17692e, n1Var);
            if (!Objects.equals((g0) this.f17693f, (g0) this.f17692e)) {
                a(kgVar, (g0) this.f17693f, n1Var);
            }
            if (!Objects.equals((g0) this.d, (g0) this.f17692e) && !Objects.equals((g0) this.d, (g0) this.f17693f)) {
                a(kgVar, (g0) this.d, n1Var);
            }
        } else {
            for (int i3 = 0; i3 < ((i0) this.f17690b).size(); i3++) {
                a(kgVar, (g0) ((i0) this.f17690b).get(i3), n1Var);
            }
            if (!((i0) this.f17690b).contains((g0) this.d)) {
                a(kgVar, (g0) this.d, n1Var);
            }
        }
        this.f17691c = kgVar.e(true);
    }

    public void v() {
        String str;
        boolean z10;
        boolean z11;
        uf.d dVar = (uf.d) this.f17692e;
        uf.d dVar2 = null;
        for (uf.d dVar3 : ((HashMap) this.f17689a).values()) {
            if (dVar3.f55859m || dVar3.f55850b.f57570a != 0) {
                if (dVar2 == null || dVar3.d > dVar2.d) {
                    dVar2 = dVar3;
                }
            }
        }
        if (dVar != dVar2) {
            this.f17692e = dVar2;
            StringBuilder sb2 = new StringBuilder("onMaxPrioritySourceChanged ");
            if (dVar2 != null) {
                str = dVar2.f55851c;
            } else {
                str = null;
            }
            sb2.append(str);
            Log.i("PIP_DEBUG", sb2.toString());
            LaunchActivity launchActivity = (LaunchActivity) this.d;
            if (Build.VERSION.SDK_INT >= 26) {
                if (dVar2 != null) {
                    org.telegram.messenger.g0.w3(launchActivity, dVar2.a());
                } else {
                    org.telegram.messenger.g0.c3(launchActivity);
                }
            }
            if (dVar != null && dVar.f55853f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (dVar2 != null && dVar2.f55853f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 != z11) {
                x xVar = (x) this.f17693f;
                if (xVar != null) {
                    try {
                        synchronized (x.f20893b) {
                            x.f20894c.remove(xVar.f20895a.f20625i);
                        }
                        xVar.f20895a.r();
                    } catch (Exception unused) {
                    }
                    this.f17693f = null;
                }
                if (dVar2 != null) {
                    o4.r rVar = new o4.r((LaunchActivity) this.d, dVar2.f55858l);
                    rVar.f20828c = "pip-media-session";
                    zb.p(!rVar.f20836m);
                    rVar.f20836m = true;
                    Context context = rVar.f20826a;
                    Object obj = x.f20893b;
                    int intValue = ((Integer) e0.C.get()).intValue();
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 < 27) {
                        intValue = Math.max(intValue, (int) TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()));
                    }
                    g2.e eVar = rVar.f20831g;
                    if (eVar == null) {
                        ?? obj2 = new Object();
                        obj2.f4759c = context;
                        obj2.f4758b = -1;
                        obj2.f4758b = intValue;
                        obj2.f4757a = true;
                        rVar.f20831g = new i2.j(obj2);
                    } else {
                        rVar.f20831g = new u(eVar, intValue, 8);
                    }
                    if (i3 == 29) {
                        g2.e eVar2 = rVar.f20831g;
                        AtomicReference atomicReference = o4.r.f20825n;
                        k9.a aVar = (k9.a) atomicReference.get();
                        if (aVar == null) {
                            Display defaultDisplay = ((WindowManager) context.getSystemService(WindowManager.class)).getDefaultDisplay();
                            Point point = new Point();
                            defaultDisplay.getSize(point);
                            Point point2 = new Point();
                            defaultDisplay.getRealSize(point2);
                            int i10 = point2.y;
                            int i11 = point2.x;
                            Point point3 = new Point(i10 - (i11 - point.x), i11 - (i10 - point.y));
                            k9.a aVar2 = new k9.a(new int[]{Math.max(point.x / 6, point.y / 6), Math.max(point3.x / 6, point3.y / 6)});
                            atomicReference.set(aVar2);
                            aVar = aVar2;
                        }
                        rVar.f20831g = new t(eVar2, aVar, false, 3);
                    }
                    rVar.f20831g = new h0(rVar.f20831g, 2);
                    this.f17693f = new x(rVar.f20826a, rVar.f20828c, rVar.f20827b, rVar.f20832i, rVar.f20833j, rVar.f20834k, rVar.d, rVar.f20829e, rVar.f20830f, rVar.f20831g, rVar.h, rVar.f20835l);
                }
            }
            if (dVar != null) {
                wf.e eVar3 = dVar.f55850b;
                eVar3.f57581n = false;
                eVar3.h();
                uf.d dVar4 = eVar3.f57577j;
                ((uf.b) dVar4.f55849a.f17690b).f55825a.remove(eVar3);
                ((uf.b) dVar4.f55849a.f17690b).f55826b.remove(eVar3);
                e eVar4 = dVar4.f55849a;
                String str2 = dVar4.f55851c;
                HashMap hashMap = ((uf.b) eVar4.f17690b).f55827c;
                ArrayList arrayList = (ArrayList) hashMap.get(str2);
                if (arrayList != null) {
                    arrayList.remove((Object) null);
                    if (arrayList.isEmpty()) {
                        hashMap.remove(str2);
                    }
                }
            }
            if (dVar2 != null) {
                x xVar2 = (x) this.f17693f;
                if (xVar2 != null) {
                    e1 e1Var = xVar2.f20895a.f20636t.f20751a;
                    k2.i0 i0Var = dVar2.f55858l;
                    if (e1Var != i0Var) {
                        xVar2.a(i0Var);
                    }
                }
                ((uf.a) this.f17691c).bringToFront();
                wf.e eVar5 = dVar2.f55850b;
                uf.d dVar5 = eVar5.f57577j;
                ((uf.b) dVar5.f55849a.f17690b).f55825a.add(eVar5);
                ((uf.b) dVar5.f55849a.f17690b).f55826b.add(eVar5);
                e eVar6 = dVar5.f55849a;
                String str3 = dVar5.f55851c;
                HashMap hashMap2 = ((uf.b) eVar6.f17690b).f55827c;
                ArrayList arrayList2 = (ArrayList) hashMap2.get(str3);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    hashMap2.put(str3, arrayList2);
                }
                arrayList2.add(null);
            } else if (dVar != null && org.telegram.messenger.g0.H1((LaunchActivity) this.d)) {
                ((LaunchActivity) this.d).moveTaskToBack(false);
            }
            ((uf.a) this.f17691c).invalidate();
        }
    }

    public e(int i3) {
        switch (i3) {
            case 3:
                Paint paint = new Paint(1);
                this.f17689a = paint;
                this.d = new RectF();
                this.f17693f = new Matrix();
                Bitmap createBitmap = Bitmap.createBitmap(30, 40, Bitmap.Config.ARGB_8888);
                this.f17691c = createBitmap;
                this.f17690b = new Canvas(createBitmap);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
                this.f17692e = bitmapShader;
                paint.setShader(bitmapShader);
                t();
                return;
            case 4:
                this.f17689a = new ArrayList();
                this.f17690b = new ArrayList();
                this.f17691c = new ArrayList();
                this.d = new ArrayList();
                this.f17692e = new ArrayList();
                this.f17693f = new ArrayList();
                return;
            case 5:
                this.f17689a = new Bundle();
                this.f17690b = "AssistAction";
                return;
            default:
                this.f17689a = new int[]{2131230859, 2131230857, 2131230783};
                this.f17690b = new int[]{2131230807, 2131230842, 2131230814, 2131230809, 2131230810, 2131230813, 2131230812};
                this.f17691c = new int[]{2131230856, 2131230858, 2131230800, 2131230852, 2131230853, 2131230854, 2131230855};
                this.d = new int[]{2131230832, 2131230798, 2131230831};
                this.f17692e = new int[]{2131230850, 2131230860};
                this.f17693f = new int[]{2131230786, 2131230792, 2131230787, 2131230793};
                return;
        }
    }

    public e(o oVar, MediaFormat mediaFormat, v vVar, Surface surface, MediaCrypto mediaCrypto, t2.j jVar) {
        this.f17689a = oVar;
        this.f17690b = mediaFormat;
        this.f17691c = vVar;
        this.d = surface;
        this.f17692e = mediaCrypto;
        this.f17693f = jVar;
    }

    public e(uy uyVar) {
        this.f17691c = new jd(this, 1);
        this.d = new jd(this, 1);
        this.f17689a = uyVar;
    }
}
