package a8;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
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
import android.os.Bundle;
import android.view.Surface;
import c8.ic;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.cz;
import org.telegram.messenger.ds;
import org.telegram.messenger.qd;
import org.telegram.ui.Components.xv0;
public class b8 {
    public Object f335a;
    public Object f336b;
    public Object f337c;
    public Object d;
    public Object f338e;
    public Object f339f;

    public b8(int i7, int i10) {
        Paint paint = new Paint(1);
        this.f335a = paint;
        this.d = new RectF();
        this.f339f = new Matrix();
        Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, i7), Math.max(1, i10), Bitmap.Config.ARGB_8888);
        this.f337c = createBitmap;
        this.f336b = new Canvas(createBitmap);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
        this.f338e = bitmapShader;
        paint.setShader(bitmapShader);
        r();
    }

    public static boolean b(int[] iArr, int i7) {
        for (int i10 : iArr) {
            if (i10 == i7) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList e(Context context, int i7) {
        int c10 = m.a3.c(context, 2130968728);
        return new ColorStateList(new int[][]{m.a3.f19060b, m.a3.d, m.a3.f19061c, m.a3.f19063f}, new int[]{m.a3.b(context, 2130968726), i0.a.k(c10, i7), i0.a.k(c10, i7), i7});
    }

    public static x2.g0 f(e2.c1 c1Var, h9.i0 i0Var, x2.g0 g0Var, e2.i1 i1Var) {
        Object l10;
        int i7;
        e2.l1 y02 = c1Var.y0();
        int B = c1Var.B();
        if (y02.p()) {
            l10 = null;
        } else {
            l10 = y02.l(B);
        }
        if (!c1Var.p() && !y02.p()) {
            i7 = y02.f(B, i1Var, false).b(h2.m0.S(c1Var.l()) - i1Var.f10283e);
        } else {
            i7 = -1;
        }
        int i10 = i7;
        for (int i11 = 0; i11 < i0Var.size(); i11++) {
            x2.g0 g0Var2 = (x2.g0) i0Var.get(i11);
            if (i(g0Var2, l10, c1Var.p(), c1Var.n0(), c1Var.O(), i10)) {
                return g0Var2;
            }
        }
        if (!i0Var.isEmpty() || g0Var == null || !i(g0Var, l10, c1Var.p(), c1Var.n0(), c1Var.O(), i10)) {
            return null;
        }
        return g0Var;
    }

    public static LayerDrawable g(m.n2 n2Var, Context context, int i7) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i7);
        Drawable g10 = n2Var.g(context, 2131230846);
        Drawable g11 = n2Var.g(context, 2131230847);
        if ((g10 instanceof BitmapDrawable) && g10.getIntrinsicWidth() == dimensionPixelSize && g10.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) g10;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            g10.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            g10.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((g11 instanceof BitmapDrawable) && g11.getIntrinsicWidth() == dimensionPixelSize && g11.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) g11;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            g11.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            g11.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908303);
        layerDrawable.setId(2, 16908301);
        return layerDrawable;
    }

    public static boolean i(x2.g0 g0Var, Object obj, boolean z9, int i7, int i10, int i11) {
        Object obj2 = g0Var.f58240a;
        int i12 = g0Var.f58241b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (!z9 || i12 != i7 || g0Var.f58242c != i10) {
            if (z9 || i12 != -1 || g0Var.f58243e != i11) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static void n(Drawable drawable, int i7, PorterDuff.Mode mode) {
        PorterDuffColorFilter h;
        int[] iArr = m.m1.f19156a;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = m.r.f19231b;
        }
        PorterDuff.Mode mode2 = m.r.f19231b;
        synchronized (m.r.class) {
            h = m.n2.h(i7, mode);
        }
        mutate.setColorFilter(h);
    }

    public void a(wa waVar, x2.g0 g0Var, e2.l1 l1Var) {
        if (g0Var != null) {
            if (l1Var.b(g0Var.f58240a) != -1) {
                waVar.v(g0Var, l1Var);
                return;
            }
            e2.l1 l1Var2 = (e2.l1) ((h9.y1) this.f337c).get(g0Var);
            if (l1Var2 != null) {
                waVar.v(g0Var, l1Var2);
            }
        }
    }

    public t9.b c() {
        String str;
        String str2;
        q6.m.h((String) this.f339f, "setActionToken is required before calling build().");
        new String((String) this.f338e);
        j("actionToken", (String) this.f339f);
        String str3 = (String) this.f337c;
        String str4 = null;
        if (str3 == null) {
            str = null;
        } else {
            str = new String(str3);
        }
        if (str == null) {
            this.f337c = "AssistAction";
            j("name", "AssistAction");
        }
        String str5 = (String) this.d;
        if (str5 != null) {
            str4 = new String(str5);
        }
        if (str4 == null) {
            String valueOf = String.valueOf((String) this.f339f);
            if (valueOf.length() != 0) {
                str2 = "https://developers.google.com/actions?invocation=".concat(valueOf);
            } else {
                str2 = new String("https://developers.google.com/actions?invocation=");
            }
            q6.m.g(str2);
            this.d = str2;
            j("url", str2);
        }
        q6.m.h((String) this.f337c, "setObject is required before calling build().");
        q6.m.h((String) this.d, "setObject is required before calling build().");
        return new t9.b((String) this.f336b, (String) this.f337c, (String) this.d, null, new t9.a(), (String) this.f338e, (Bundle) this.f335a);
    }

    public void d() {
        ((LocationManager) this.f336b).removeUpdates((qd) this.f337c);
        ((LocationManager) this.f336b).removeUpdates((qd) this.d);
        this.f339f = null;
        this.f338e = null;
    }

    public ColorStateList h(Context context, int i7) {
        if (i7 == 2131230803) {
            return b5.a.a(context, 2131099669);
        }
        if (i7 == 2131230849) {
            return b5.a.a(context, 2131099672);
        }
        if (i7 == 2131230848) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList d = m.a3.d(context, 2130968734);
            if (d != null && d.isStateful()) {
                int[] iArr3 = m.a3.f19060b;
                iArr[0] = iArr3;
                iArr2[0] = d.getColorForState(iArr3, 0);
                iArr[1] = m.a3.f19062e;
                iArr2[1] = m.a3.c(context, 2130968727);
                iArr[2] = m.a3.f19063f;
                iArr2[2] = d.getDefaultColor();
            } else {
                iArr[0] = m.a3.f19060b;
                iArr2[0] = m.a3.b(context, 2130968734);
                iArr[1] = m.a3.f19062e;
                iArr2[1] = m.a3.c(context, 2130968727);
                iArr[2] = m.a3.f19063f;
                iArr2[2] = m.a3.c(context, 2130968734);
            }
            return new ColorStateList(iArr, iArr2);
        } else if (i7 == 2131230791) {
            return e(context, m.a3.c(context, 2130968726));
        } else {
            if (i7 == 2131230785) {
                return e(context, 0);
            }
            if (i7 == 2131230790) {
                return e(context, m.a3.c(context, 2130968724));
            }
            if (i7 != 2131230844 && i7 != 2131230845) {
                if (b((int[]) this.f336b, i7)) {
                    return m.a3.d(context, 2130968729);
                }
                if (b((int[]) this.f338e, i7)) {
                    return b5.a.a(context, 2131099668);
                }
                if (b((int[]) this.f339f, i7)) {
                    return b5.a.a(context, 2131099667);
                }
                if (i7 == 2131230841) {
                    return b5.a.a(context, 2131099670);
                }
                return null;
            }
            return b5.a.a(context, 2131099671);
        }
    }

    public void j(String str, String... strArr) {
        Bundle bundle = (Bundle) this.f335a;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length > 0) {
            int i7 = 0;
            for (int i10 = 0; i10 < Math.min(strArr2.length, 100); i10++) {
                String str2 = strArr2[i10];
                strArr2[i7] = str2;
                if (strArr2[i10] == null) {
                    StringBuilder sb2 = new StringBuilder(59);
                    sb2.append("String at ");
                    sb2.append(i10);
                    sb2.append(" is null and is ignored by put method.");
                    ic.a(sb2.toString());
                } else {
                    int i11 = 20000;
                    if (str2.length() > 20000) {
                        StringBuilder sb3 = new StringBuilder(53);
                        sb3.append("String at ");
                        sb3.append(i10);
                        sb3.append(" is too long, truncating string.");
                        ic.a(sb3.toString());
                        String str3 = strArr2[i7];
                        if (str3.length() > 20000) {
                            if (Character.isHighSurrogate(str3.charAt(19999)) && Character.isLowSurrogate(str3.charAt(20000))) {
                                i11 = 19999;
                            }
                            str3 = str3.substring(0, i11);
                        }
                        strArr2[i7] = str3;
                    }
                    i7++;
                }
            }
            if (i7 > 0) {
                Object[] objArr = (String[]) Arrays.copyOfRange(strArr2, 0, i7);
                if (objArr.length >= 100) {
                    ic.a("Input Array of elements is too big, cutting off.");
                    objArr = Arrays.copyOf(objArr, 100);
                }
                bundle.putStringArray(str, (String[]) objArr);
                return;
            }
            return;
        }
        ic.a("String array is empty and is ignored by put method.");
    }

    public void k(float f10, float f11, float f12, float f13) {
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(f10, f11, f12, f13);
        RectF rectF2 = (RectF) this.d;
        if (rectF2.top == rectF.top && rectF2.bottom == rectF.bottom && rectF2.left == rectF.left && rectF2.right == rectF.right) {
            return;
        }
        rectF2.set(rectF);
        r();
    }

    public void l(java.lang.String r3, android.os.Bundle r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: a8.b8.l(java.lang.String, android.os.Bundle, boolean):void");
    }

    public void m(float f10, float f11, float f12, float f13) {
        Matrix matrix = (Matrix) this.f339f;
        matrix.reset();
        Bitmap bitmap = (Bitmap) this.f337c;
        matrix.postRotate(f13, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        matrix.postScale(f12, f12);
        matrix.postTranslate(f10, f11);
        ((BitmapShader) this.f338e).setLocalMatrix(matrix);
    }

    public void o() {
        if (((LocationManager) this.f336b) == null) {
            this.f336b = (LocationManager) org.telegram.messenger.t0.f25563b.getSystemService("location");
        }
        try {
            ((LocationManager) this.f336b).requestLocationUpdates("gps", 1L, 0.0f, (qd) this.f337c);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            ((LocationManager) this.f336b).requestLocationUpdates("network", 1L, 0.0f, (qd) this.d);
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        try {
            Location lastKnownLocation = ((LocationManager) this.f336b).getLastKnownLocation("gps");
            this.f339f = lastKnownLocation;
            if (lastKnownLocation == null) {
                this.f339f = ((LocationManager) this.f336b).getLastKnownLocation("network");
            }
        } catch (Exception e12) {
            org.telegram.messenger.a8.g(e12, true);
        }
        ds dsVar = (ds) this.f338e;
        if (dsVar != null) {
            org.telegram.messenger.g0.r(dsVar);
        }
        ds dsVar2 = new ds(this, 14);
        this.f338e = dsVar2;
        org.telegram.messenger.g0.i3(dsVar2, 5000L);
    }

    public void p() {
        if (((LocationManager) this.f336b) == null) {
            return;
        }
        ds dsVar = (ds) this.f338e;
        if (dsVar != null) {
            org.telegram.messenger.g0.r(dsVar);
        }
        d();
    }

    public void q(boolean z9) {
        ArrayList arrayList = (ArrayList) this.f337c;
        ArrayList arrayList2 = (ArrayList) this.f336b;
        ArrayList arrayList3 = (ArrayList) this.f335a;
        for (int i7 = 0; i7 < arrayList3.size(); i7++) {
            ((ValueAnimator) arrayList3.get(i7)).cancel();
            if (z9) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) ((ArrayList) this.d).get(i7)).floatValue(), 0.0f);
                ofFloat.addUpdateListener(new xv0(this, i7, 0));
                ofFloat.setDuration(100L);
                ofFloat.start();
            }
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            ((ValueAnimator) arrayList2.get(i10)).cancel();
            if (z9) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(((Float) ((ArrayList) this.f338e).get(i10)).floatValue(), 0.0f);
                ofFloat2.addUpdateListener(new xv0(this, i10, 1));
                ofFloat2.setDuration(100L);
                ofFloat2.start();
            }
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((ValueAnimator) arrayList.get(i11)).cancel();
            if (z9) {
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(((Float) ((ArrayList) this.f339f).get(i11)).floatValue(), 0.0f);
                ofFloat3.addUpdateListener(new xv0(this, i11, 2));
                ofFloat3.setDuration(100L);
                ofFloat3.start();
            }
        }
        arrayList.clear();
        arrayList2.clear();
        arrayList3.clear();
    }

    public void r() {
        Bitmap bitmap = (Bitmap) this.f337c;
        RectF rectF = (RectF) this.d;
        Matrix matrix = (Matrix) this.f339f;
        BitmapShader bitmapShader = (BitmapShader) this.f338e;
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

    public void s(e2.l1 l1Var) {
        wa waVar = new wa(4, 10);
        if (((h9.i0) this.f336b).isEmpty()) {
            a(waVar, (x2.g0) this.f338e, l1Var);
            if (!Objects.equals((x2.g0) this.f339f, (x2.g0) this.f338e)) {
                a(waVar, (x2.g0) this.f339f, l1Var);
            }
            if (!Objects.equals((x2.g0) this.d, (x2.g0) this.f338e) && !Objects.equals((x2.g0) this.d, (x2.g0) this.f339f)) {
                a(waVar, (x2.g0) this.d, l1Var);
            }
        } else {
            for (int i7 = 0; i7 < ((h9.i0) this.f336b).size(); i7++) {
                a(waVar, (x2.g0) ((h9.i0) this.f336b).get(i7), l1Var);
            }
            if (!((h9.i0) this.f336b).contains((x2.g0) this.d)) {
                a(waVar, (x2.g0) this.d, l1Var);
            }
        }
        this.f337c = waVar.d(true);
    }

    public b8(int i7) {
        switch (i7) {
            case 5:
                Paint paint = new Paint(1);
                this.f335a = paint;
                this.d = new RectF();
                this.f339f = new Matrix();
                Bitmap createBitmap = Bitmap.createBitmap(30, 40, Bitmap.Config.ARGB_8888);
                this.f337c = createBitmap;
                this.f336b = new Canvas(createBitmap);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
                this.f338e = bitmapShader;
                paint.setShader(bitmapShader);
                r();
                return;
            case 6:
                this.f335a = new ArrayList();
                this.f336b = new ArrayList();
                this.f337c = new ArrayList();
                this.d = new ArrayList();
                this.f338e = new ArrayList();
                this.f339f = new ArrayList();
                return;
            case 7:
                this.f335a = new Bundle();
                this.f336b = "AssistAction";
                return;
            default:
                this.f335a = new int[]{2131230859, 2131230857, 2131230783};
                this.f336b = new int[]{2131230807, 2131230842, 2131230814, 2131230809, 2131230810, 2131230813, 2131230812};
                this.f337c = new int[]{2131230856, 2131230858, 2131230800, 2131230852, 2131230853, 2131230854, 2131230855};
                this.d = new int[]{2131230832, 2131230798, 2131230831};
                this.f338e = new int[]{2131230850, 2131230860};
                this.f339f = new int[]{2131230786, 2131230792, 2131230787, 2131230793};
                return;
        }
    }

    public b8(u2.o oVar, MediaFormat mediaFormat, e2.u uVar, Surface surface, MediaCrypto mediaCrypto, u2.j jVar) {
        this.f335a = oVar;
        this.f336b = mediaFormat;
        this.f337c = uVar;
        this.d = surface;
        this.f338e = mediaCrypto;
        this.f339f = jVar;
    }

    public b8(cz czVar) {
        this.f337c = new qd(this, 1);
        this.d = new qd(this, 1);
        this.f335a = czVar;
    }
}
