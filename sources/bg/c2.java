package bg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import h7.d8;
import h7.s7;
import i7.o6;
import i7.w8;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import nh.f5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.mx0;
import org.telegram.ui.ib0;
public final class c2 implements c6 {
    public Object f2118a;
    public Object f2119b;
    public Object f2120c;
    public Object d;
    public Object f2121e;
    public Object f2122f;

    public c2(int i10, int i11) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.f2120c = new RectF();
        this.f2122f = new Matrix();
        Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, i10), Math.max(1, i11), Bitmap.Config.ARGB_8888);
        this.f2119b = createBitmap;
        this.f2118a = new Canvas(createBitmap);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
        this.f2121e = bitmapShader;
        paint.setShader(bitmapShader);
        D();
    }

    public static i9.l0 b(i9.l0 l0Var, h9.e eVar, m.s3 s3Var) {
        String str;
        c2 a2 = l0Var.a();
        String i10 = ((h9.c) eVar.f7953b).i();
        if (i10 != null) {
            a2.f2121e = new i9.v0(i10);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        List q6 = q(((h9.d) ((AtomicMarkableReference) ((ab.m) s3Var.d).f325b).getReference()).a());
        List q9 = q(((h9.d) ((AtomicMarkableReference) ((ab.m) s3Var.f16691e).f325b).getReference()).a());
        if (!q6.isEmpty() || !q9.isEmpty()) {
            i9.m0 m0Var = (i9.m0) l0Var.f8722c;
            i9.s1 s1Var = m0Var.f8730a;
            Boolean bool = m0Var.d;
            i9.t1 t1Var = m0Var.f8733e;
            List list = m0Var.f8734f;
            int i11 = m0Var.f8735g;
            if (s1Var == null) {
                str = " execution";
            } else {
                str = "";
            }
            if (str.isEmpty()) {
                a2.f2120c = new i9.m0(s1Var, q6, q9, bool, t1Var, list, i11);
            } else {
                throw new IllegalStateException("Missing required properties:".concat(str));
            }
        }
        return a2.g();
    }

    public static i9.a2 d(i9.l0 l0Var, m.s3 s3Var) {
        List f9 = ((p2.u) s3Var.f16692f).f();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < f9.size(); i10++) {
            h9.n nVar = (h9.n) f9.get(i10);
            nVar.getClass();
            com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(11, false);
            h9.b bVar = (h9.b) nVar;
            String str = bVar.f7946e;
            if (str != null) {
                String str2 = bVar.f7944b;
                if (str2 != null) {
                    sVar.f5186c = new i9.x0(str2, str);
                    String str3 = bVar.f7945c;
                    if (str3 != null) {
                        sVar.f5185b = str3;
                        String str4 = bVar.d;
                        if (str4 != null) {
                            sVar.d = str4;
                            sVar.f5187e = Long.valueOf(bVar.f7947f);
                            arrayList.add(sVar.l());
                        } else {
                            throw new NullPointerException("Null parameterValue");
                        }
                    } else {
                        throw new NullPointerException("Null parameterKey");
                    }
                } else {
                    throw new NullPointerException("Null rolloutId");
                }
            } else {
                throw new NullPointerException("Null variantId");
            }
        }
        if (arrayList.isEmpty()) {
            return l0Var;
        }
        c2 a2 = l0Var.a();
        a2.f2122f = new i9.y0(arrayList);
        return a2.g();
    }

    public static boolean f(int i10, int[] iArr) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static c2 k(Context context, g9.y yVar, l9.b bVar, g9.a aVar, h9.e eVar, m.s3 s3Var, g9.l lVar, e3.f fVar, g9.l lVar2, g9.k kVar) {
        g9.s sVar = new g9.s(context, yVar, aVar, lVar, fVar);
        l9.a aVar2 = new l9.a(bVar, fVar, kVar);
        j9.a aVar3 = m9.a.f16929b;
        y2.q.b(context);
        m9.a aVar4 = new m9.a(new m9.c(y2.q.a().c(new w2.a(m9.a.f16930c, m9.a.d)).a("FIREBASE_CRASHLYTICS_REPORT", new v2.c("json"), m9.a.f16931e), fVar.d(), lVar2));
        ?? obj = new Object();
        obj.f2118a = sVar;
        obj.f2119b = aVar2;
        obj.f2120c = aVar4;
        obj.d = eVar;
        obj.f2121e = s3Var;
        obj.f2122f = yVar;
        return obj;
    }

    public static ColorStateList m(Context context, int i10) {
        int c3 = m.d3.c(context, 2130968728);
        return new ColorStateList(new int[][]{m.d3.f16517b, m.d3.d, m.d3.f16518c, m.d3.f16520f}, new int[]{m.d3.b(context, 2130968726), i0.a.h(c3, i10), i0.a.h(c3, i10), i10});
    }

    public static l4.c0 o(j3.c2 c2Var, q8.z zVar, l4.c0 c0Var, j3.p2 p2Var) {
        Object l10;
        int i10;
        j3.r2 A = c2Var.A();
        int k9 = c2Var.k();
        if (A.p()) {
            l10 = null;
        } else {
            l10 = A.l(k9);
        }
        if (!c2Var.c() && !A.p()) {
            i10 = A.f(k9, p2Var, false).b(f5.d0.H(c2Var.D()) - p2Var.f10677e);
        } else {
            i10 = -1;
        }
        for (int i11 = 0; i11 < zVar.size(); i11++) {
            l4.c0 c0Var2 = (l4.c0) zVar.get(i11);
            if (s(c0Var2, l10, c2Var.c(), c2Var.w(), c2Var.m(), i10)) {
                return c0Var2;
            }
        }
        if (!zVar.isEmpty() || c0Var == null || !s(c0Var, l10, c2Var.c(), c2Var.w(), c2Var.m(), i10)) {
            return null;
        }
        return c0Var;
    }

    public static LayerDrawable p(m.n2 n2Var, Context context, int i10) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
        Drawable g10 = n2Var.g(context, 2131230807);
        Drawable g11 = n2Var.g(context, 2131230808);
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

    public static List q(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                String str2 = (String) entry.getValue();
                if (str2 != null) {
                    arrayList.add(new i9.d0(str, str2));
                } else {
                    throw new NullPointerException("Null value");
                }
            } else {
                throw new NullPointerException("Null key");
            }
        }
        Collections.sort(arrayList, new c5.e(15));
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static boolean s(l4.c0 c0Var, Object obj, boolean z10, int i10, int i11, int i12) {
        Object obj2 = c0Var.f14262a;
        int i13 = c0Var.f14263b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (!z10 || i13 != i10 || c0Var.f14264c != i11) {
            if (z10 || i13 != -1 || c0Var.f14265e != i12) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static void z(Drawable drawable, int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter h;
        int[] iArr = m.m1.f16599a;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = m.r.f16661b;
        }
        PorterDuff.Mode mode2 = m.r.f16661b;
        synchronized (m.r.class) {
            h = m.n2.h(i10, mode);
        }
        mutate.setColorFilter(h);
    }

    public Task A(String str, String str2, Bundle bundle) {
        int i10;
        try {
            x(str, str2, bundle);
            v5.a aVar = (v5.a) this.f2120c;
            v5.m mVar = v5.m.f49429a;
            com.google.android.exoplayer2.upstream.w wVar = aVar.f49402c;
            if (wVar.f() < 12000000) {
                if (wVar.g() != 0) {
                    return aVar.a(bundle).continueWithTask(mVar, new v5.n(0, aVar, bundle));
                }
                return Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            v5.l b10 = v5.l.b(aVar.f49401b);
            synchronized (b10) {
                i10 = b10.f49426a;
                b10.f49426a = i10 + 1;
            }
            return b10.c(new v5.k(i10, 1, bundle, 1)).continueWith(mVar, v5.b.f49406a);
        } catch (InterruptedException | ExecutionException e10) {
            return Tasks.forException(e10);
        }
    }

    @Override
    public ColorFilter B() {
        return g6.f23380v3;
    }

    public void C(boolean z10) {
        ArrayList arrayList = (ArrayList) this.f2120c;
        ArrayList arrayList2 = (ArrayList) this.f2119b;
        ArrayList arrayList3 = (ArrayList) this.f2118a;
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            ((ValueAnimator) arrayList3.get(i10)).cancel();
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) ((ArrayList) this.d).get(i10)).floatValue(), 0.0f);
                ofFloat.addUpdateListener(new mx0(this, i10, 0));
                ofFloat.setDuration(100L);
                ofFloat.start();
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            ((ValueAnimator) arrayList2.get(i11)).cancel();
            if (z10) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(((Float) ((ArrayList) this.f2121e).get(i11)).floatValue(), 0.0f);
                ofFloat2.addUpdateListener(new mx0(this, i11, 1));
                ofFloat2.setDuration(100L);
                ofFloat2.start();
            }
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            ((ValueAnimator) arrayList.get(i12)).cancel();
            if (z10) {
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(((Float) ((ArrayList) this.f2122f).get(i12)).floatValue(), 0.0f);
                ofFloat3.addUpdateListener(new mx0(this, i12, 2));
                ofFloat3.setDuration(100L);
                ofFloat3.start();
            }
        }
        arrayList.clear();
        arrayList2.clear();
        arrayList3.clear();
    }

    @Override
    public int C0(int i10) {
        return ((f5) this.f2122f).f2159y0.get(i10, g6.w0(null, i10, false));
    }

    public void D() {
        Bitmap bitmap = (Bitmap) this.f2119b;
        RectF rectF = (RectF) this.f2120c;
        Matrix matrix = (Matrix) this.f2122f;
        BitmapShader bitmapShader = (BitmapShader) this.f2121e;
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

    public void E(j3.r2 r2Var) {
        ag.j2 j2Var = new ag.j2(4, 21);
        if (((q8.z) this.f2119b).isEmpty()) {
            e(j2Var, (l4.c0) this.f2121e, r2Var);
            if (!o6.a((l4.c0) this.f2122f, (l4.c0) this.f2121e)) {
                e(j2Var, (l4.c0) this.f2122f, r2Var);
            }
            if (!o6.a((l4.c0) this.d, (l4.c0) this.f2121e) && !o6.a((l4.c0) this.d, (l4.c0) this.f2122f)) {
                e(j2Var, (l4.c0) this.d, r2Var);
            }
        } else {
            for (int i10 = 0; i10 < ((q8.z) this.f2119b).size(); i10++) {
                e(j2Var, (l4.c0) ((q8.z) this.f2119b).get(i10), r2Var);
            }
            if (!((q8.z) this.f2119b).contains((l4.c0) this.d)) {
                e(j2Var, (l4.c0) this.d, r2Var);
            }
        }
        this.f2120c = j2Var.c();
    }

    @Override
    public Paint G(String str) {
        str.getClass();
        char c3 = 65535;
        switch (str.hashCode()) {
            case -1490966183:
                if (str.equals("paintChatActionText2")) {
                    c3 = 0;
                    break;
                }
                break;
            case 1712385955:
                if (str.equals("paintChatBotButton")) {
                    c3 = 1;
                    break;
                }
                break;
            case 1790254137:
                if (str.equals("paintChatActionBackgroundDarken")) {
                    c3 = 2;
                    break;
                }
                break;
            case 1897339317:
                if (str.equals("paintChatActionBackgroundSelected")) {
                    c3 = 3;
                    break;
                }
                break;
            case 2030114297:
                if (str.equals("paintChatActionText")) {
                    c3 = 4;
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
                return (TextPaint) this.f2119b;
            case 1:
                return (TextPaint) this.f2120c;
            case 2:
                return (Paint) this.f2121e;
            case 3:
                return (Paint) this.d;
            case 4:
                return (TextPaint) this.f2118a;
            default:
                return g6.S0(str);
        }
    }

    @Override
    public boolean a() {
        return ((f5) this.f2122f).f2158x0;
    }

    public void c(String str, String str2) {
        HashMap hashMap = (HashMap) this.f2122f;
        if (hashMap != null) {
            hashMap.put(str, str2);
            return;
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }

    public void e(ag.j2 j2Var, l4.c0 c0Var, j3.r2 r2Var) {
        if (c0Var != null) {
            if (r2Var.b(c0Var.f14262a) != -1) {
                j2Var.l(c0Var, r2Var);
                return;
            }
            j3.r2 r2Var2 = (j3.r2) ((q8.q0) this.f2120c).get(c0Var);
            if (r2Var2 != null) {
                j2Var.l(c0Var, r2Var2);
            }
        }
    }

    public i9.l0 g() {
        String str;
        if (((Long) this.f2118a) == null) {
            str = " timestamp";
        } else {
            str = "";
        }
        if (((String) this.f2119b) == null) {
            str = str.concat(" type");
        }
        if (((i9.u1) this.f2120c) == null) {
            str = u3.c.k(str, " app");
        }
        if (((i9.v1) this.d) == null) {
            str = u3.c.k(str, " device");
        }
        if (str.isEmpty()) {
            return new i9.l0(((Long) this.f2118a).longValue(), (String) this.f2119b, (i9.u1) this.f2120c, (i9.v1) this.d, (i9.w1) this.f2121e, (i9.z1) this.f2122f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override
    public int g1(int i10) {
        return C0(i10);
    }

    @Override
    public Drawable getDrawable(String str) {
        f5 f5Var = (f5) this.f2122f;
        c2 c2Var = f5Var.f2160z0;
        if (str.equals("drawableMsgIn")) {
            if (f5Var.A0 == null) {
                f5Var.A0 = new d5(0, false, false, c2Var);
            }
            return f5Var.A0;
        } else if (str.equals("drawableMsgInSelected")) {
            if (f5Var.B0 == null) {
                f5Var.B0 = new d5(0, false, true, c2Var);
            }
            return f5Var.B0;
        } else if (str.equals("drawableMsgOut")) {
            if (f5Var.C0 == null) {
                f5Var.C0 = new d5(0, true, false, c2Var);
            }
            return f5Var.C0;
        } else if (str.equals("drawableMsgOutSelected")) {
            if (f5Var.D0 == null) {
                f5Var.D0 = new d5(0, true, true, c2Var);
            }
            return f5Var.D0;
        } else if (str.equals("drawableMsgInMedia")) {
            if (f5Var.E0 == null) {
                f5Var.E0 = new d5(1, false, false, c2Var);
            }
            f5Var.E0.invalidateSelf();
            return f5Var.E0;
        } else if (str.equals("drawableMsgInMediaSelected")) {
            if (f5Var.F0 == null) {
                f5Var.F0 = new d5(1, false, true, c2Var);
            }
            return f5Var.F0;
        } else if (str.equals("drawableMsgOutMedia")) {
            if (f5Var.G0 == null) {
                f5Var.G0 = new d5(1, true, false, c2Var);
            }
            return f5Var.G0;
        } else if (str.equals("drawableMsgOutMediaSelected")) {
            if (f5Var.H0 == null) {
                f5Var.H0 = new d5(1, true, true, c2Var);
            }
            return f5Var.H0;
        } else {
            return g6.O0(str);
        }
    }

    public i9.u0 h() {
        String str;
        if (((Integer) this.f2119b) == null) {
            str = " batteryVelocity";
        } else {
            str = "";
        }
        if (((Boolean) this.f2120c) == null) {
            str = str.concat(" proximityOn");
        }
        if (((Integer) this.d) == null) {
            str = u3.c.k(str, " orientation");
        }
        if (((Long) this.f2121e) == null) {
            str = u3.c.k(str, " ramUsed");
        }
        if (((Long) this.f2122f) == null) {
            str = u3.c.k(str, " diskUsed");
        }
        if (str.isEmpty()) {
            return new i9.u0((Double) this.f2118a, ((Integer) this.f2119b).intValue(), ((Boolean) this.f2120c).booleanValue(), ((Integer) this.d).intValue(), ((Long) this.f2121e).longValue(), ((Long) this.f2122f).longValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override
    public int h0(int i10) {
        return C0(i10);
    }

    public y2.h i() {
        String str;
        if (((String) this.f2118a) == null) {
            str = " transportName";
        } else {
            str = "";
        }
        if (((y2.l) this.f2120c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.d) == null) {
            str = u3.c.k(str, " eventMillis");
        }
        if (((Long) this.f2121e) == null) {
            str = u3.c.k(str, " uptimeMillis");
        }
        if (((HashMap) this.f2122f) == null) {
            str = u3.c.k(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new y2.h((String) this.f2118a, (Integer) this.f2119b, (y2.l) this.f2120c, ((Long) this.d).longValue(), ((Long) this.f2121e).longValue(), (HashMap) this.f2122f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public z8.b j() {
        String str;
        String str2;
        z5.l.i((String) this.f2122f, "setActionToken is required before calling build().");
        new String((String) this.f2121e);
        u("actionToken", (String) this.f2122f);
        String str3 = (String) this.f2120c;
        String str4 = null;
        if (str3 == null) {
            str = null;
        } else {
            str = new String(str3);
        }
        if (str == null) {
            this.f2120c = "AssistAction";
            u("name", "AssistAction");
        }
        String str5 = (String) this.d;
        if (str5 != null) {
            str4 = new String(str5);
        }
        if (str4 == null) {
            String valueOf = String.valueOf((String) this.f2122f);
            if (valueOf.length() != 0) {
                str2 = "https://developers.google.com/actions?invocation=".concat(valueOf);
            } else {
                str2 = new String("https://developers.google.com/actions?invocation=");
            }
            z5.l.h(str2);
            this.d = str2;
            u("url", str2);
        }
        z5.l.i((String) this.f2120c, "setObject is required before calling build().");
        z5.l.i((String) this.d, "setObject is required before calling build().");
        return new z8.b((String) this.f2119b, (String) this.f2120c, (String) this.d, null, new z8.a(), (String) this.f2121e, (Bundle) this.f2118a);
    }

    @Override
    public void l(float f9, float f10, int i10, int i11) {
        g6.q(f9, f10, i10, i11);
    }

    @Override
    public boolean l0() {
        return false;
    }

    public Task n(Task task) {
        return task.continueWith(new ib0(1), new a1.c(this, 16));
    }

    public ColorStateList r(Context context, int i10) {
        if (i10 == 2131230764) {
            return s7.a(context, 2131099669);
        }
        if (i10 == 2131230810) {
            return s7.a(context, 2131099672);
        }
        if (i10 == 2131230809) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList d = m.d3.d(context, 2130968734);
            if (d != null && d.isStateful()) {
                int[] iArr3 = m.d3.f16517b;
                iArr[0] = iArr3;
                iArr2[0] = d.getColorForState(iArr3, 0);
                iArr[1] = m.d3.f16519e;
                iArr2[1] = m.d3.c(context, 2130968727);
                iArr[2] = m.d3.f16520f;
                iArr2[2] = d.getDefaultColor();
            } else {
                iArr[0] = m.d3.f16517b;
                iArr2[0] = m.d3.b(context, 2130968734);
                iArr[1] = m.d3.f16519e;
                iArr2[1] = m.d3.c(context, 2130968727);
                iArr[2] = m.d3.f16520f;
                iArr2[2] = m.d3.c(context, 2130968734);
            }
            return new ColorStateList(iArr, iArr2);
        } else if (i10 == 2131230752) {
            return m(context, m.d3.c(context, 2130968726));
        } else {
            if (i10 == 2131230746) {
                return m(context, 0);
            }
            if (i10 == 2131230751) {
                return m(context, m.d3.c(context, 2130968724));
            }
            if (i10 != 2131230805 && i10 != 2131230806) {
                if (f(i10, (int[]) this.f2119b)) {
                    return m.d3.d(context, 2130968729);
                }
                if (f(i10, (int[]) this.f2121e)) {
                    return s7.a(context, 2131099668);
                }
                if (f(i10, (int[]) this.f2122f)) {
                    return s7.a(context, 2131099667);
                }
                if (i10 == 2131230802) {
                    return s7.a(context, 2131099670);
                }
                return null;
            }
            return s7.a(context, 2131099671);
        }
    }

    public void t(Throwable th2, Thread thread, String str, String str2, long j10, boolean z10) {
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        g9.l lVar;
        boolean z11;
        boolean equals = str2.equals("crash");
        g9.s sVar = (g9.s) this.f2118a;
        Context context = sVar.f7212a;
        int i10 = context.getResources().getConfiguration().orientation;
        g9.l lVar2 = sVar.d;
        Stack stack = new Stack();
        for (Throwable th3 = th2; th3 != null; th3 = th3.getCause()) {
            stack.push(th3);
        }
        Boolean bool = null;
        com.google.firebase.messaging.s sVar2 = null;
        while (!stack.isEmpty()) {
            Throwable th4 = (Throwable) stack.pop();
            sVar2 = new com.google.firebase.messaging.s(th4.getLocalizedMessage(), th4.getClass().getName(), lVar2.m(th4.getStackTrace()), sVar2, 21);
        }
        com.google.firebase.messaging.s sVar3 = sVar2;
        ?? obj = new Object();
        obj.f2119b = str2;
        obj.f2118a = Long.valueOf(j10);
        i9.t1 b10 = d9.e.f5539a.b(context);
        int i11 = ((i9.t0) b10).f8791c;
        if (i11 > 0) {
            if (i11 != 100) {
                z11 = true;
            } else {
                z11 = false;
            }
            bool = Boolean.valueOf(z11);
        }
        Boolean bool2 = bool;
        ArrayList a2 = d9.e.a(context);
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) sVar3.d;
        String name = thread.getName();
        if (name != null) {
            List d = g9.s.d(stackTraceElementArr, 4);
            if (d != null) {
                arrayList.add(new i9.r0(name, 4, d));
                if (z10) {
                    Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = Thread.getAllStackTraces().entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry<Thread, StackTraceElement[]> next = it2.next();
                        Thread key = next.getKey();
                        if (!key.equals(thread)) {
                            StackTraceElement[] m10 = lVar2.m(next.getValue());
                            String name2 = key.getName();
                            if (name2 != null) {
                                it = it2;
                                List d10 = g9.s.d(m10, 0);
                                if (d10 != null) {
                                    lVar = lVar2;
                                    arrayList.add(new i9.r0(name2, 0, d10));
                                } else {
                                    throw new NullPointerException("Null frames");
                                }
                            } else {
                                throw new NullPointerException("Null name");
                            }
                        } else {
                            it = it2;
                            lVar = lVar2;
                        }
                        it2 = it;
                        lVar2 = lVar;
                    }
                }
                List unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
                i9.p0 c3 = g9.s.c(sVar3, 0);
                i9.q0 q0Var = new i9.q0(0L, "0", "0");
                List a10 = sVar.a();
                if (a10 != null) {
                    obj.f2120c = new i9.m0(new i9.n0(unmodifiableList, c3, null, q0Var, a10), null, null, bool2, b10, a2, i10);
                    obj.d = sVar.b(i10);
                    i9.l0 g10 = obj.g();
                    m.s3 s3Var = (m.s3) this.f2121e;
                    ((l9.a) this.f2119b).d(d(b(g10, (h9.e) this.d, s3Var), s3Var), str, equals);
                    return;
                }
                throw new NullPointerException("Null binaries");
            }
            throw new NullPointerException("Null frames");
        }
        throw new NullPointerException("Null name");
    }

    public void u(String str, String... strArr) {
        Bundle bundle = (Bundle) this.f2118a;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length > 0) {
            int i10 = 0;
            for (int i11 = 0; i11 < Math.min(strArr2.length, 100); i11++) {
                String str2 = strArr2[i11];
                strArr2[i10] = str2;
                if (strArr2[i11] == null) {
                    StringBuilder sb2 = new StringBuilder(59);
                    sb2.append("String at ");
                    sb2.append(i11);
                    sb2.append(" is null and is ignored by put method.");
                    w8.a(sb2.toString());
                } else {
                    int i12 = 20000;
                    if (str2.length() > 20000) {
                        StringBuilder sb3 = new StringBuilder(53);
                        sb3.append("String at ");
                        sb3.append(i11);
                        sb3.append(" is too long, truncating string.");
                        w8.a(sb3.toString());
                        String str3 = strArr2[i10];
                        if (str3.length() > 20000) {
                            if (Character.isHighSurrogate(str3.charAt(19999)) && Character.isLowSurrogate(str3.charAt(20000))) {
                                i12 = 19999;
                            }
                            str3 = str3.substring(0, i12);
                        }
                        strArr2[i10] = str3;
                    }
                    i10++;
                }
            }
            if (i10 > 0) {
                Object[] objArr = (String[]) Arrays.copyOfRange(strArr2, 0, i10);
                if (objArr.length >= 100) {
                    w8.a("Input Array of elements is too big, cutting off.");
                    objArr = Arrays.copyOf(objArr, 100);
                }
                bundle.putStringArray(str, (String[]) objArr);
                return;
            }
            return;
        }
        w8.a("String array is empty and is ignored by put method.");
    }

    public Task v(Executor executor, String str) {
        boolean z10;
        TaskCompletionSource taskCompletionSource;
        String str2;
        ArrayList b10 = ((l9.a) this.f2119b).b();
        ArrayList arrayList = new ArrayList();
        int size = b10.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            File file = (File) b10.get(i10);
            try {
                j9.a aVar = l9.a.f15097g;
                String e10 = l9.a.e(file);
                aVar.getClass();
                arrayList.add(new g9.b(j9.a.i(e10), file.getName(), file));
            } catch (IOException e11) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e11);
                file.delete();
            }
            i10 = i11;
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            int i13 = i12 + 1;
            g9.b bVar = (g9.b) arrayList.get(i12);
            if (str == null || str.equals(bVar.f7147b)) {
                m9.a aVar2 = (m9.a) this.f2120c;
                if (bVar.f7146a.f8587f == null) {
                    try {
                        str2 = (String) g9.a0.a(((aa.c) ((g9.y) this.f2122f).d).d());
                    } catch (Exception e12) {
                        Log.w("FirebaseCrashlytics", "Failed to retrieve Firebase Installation ID.", e12);
                        str2 = null;
                    }
                    d8 a2 = bVar.f7146a.a();
                    a2.d = str2;
                    bVar = new g9.b(a2.a(), bVar.f7147b, bVar.f7148c);
                }
                if (str != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                m9.c cVar = aVar2.f16932a;
                synchronized (cVar.f16941f) {
                    try {
                        taskCompletionSource = new TaskCompletionSource();
                        if (z10) {
                            ((AtomicInteger) cVar.f16943i.f7168b).getAndIncrement();
                            if (cVar.f16941f.size() < cVar.f16940e) {
                                d9.d dVar = d9.d.f5538a;
                                dVar.b("Enqueueing report: " + bVar.f7147b);
                                dVar.b("Queue size: " + cVar.f16941f.size());
                                cVar.f16942g.execute(new com.google.android.gms.common.api.internal.q1(cVar, bVar, taskCompletionSource, 6));
                                dVar.b("Closing task for report: " + bVar.f7147b);
                                taskCompletionSource.trySetResult(bVar);
                            } else {
                                cVar.a();
                                String str3 = "Dropping report due to queue being full: " + bVar.f7147b;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str3, null);
                                }
                                ((AtomicInteger) cVar.f16943i.f7169c).getAndIncrement();
                                taskCompletionSource.trySetResult(bVar);
                            }
                        } else {
                            cVar.b(bVar, taskCompletionSource);
                        }
                    } finally {
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new eg.c(this)));
            }
            i12 = i13;
        }
        return Tasks.whenAll(arrayList2);
    }

    public void w(float f9, float f10, float f11, float f12) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f9, f10, f11, f12);
        RectF rectF2 = (RectF) this.f2120c;
        if (rectF2.top == rectF.top && rectF2.bottom == rectF.bottom && rectF2.left == rectF.left && rectF2.right == rectF.right) {
            return;
        }
        rectF2.set(rectF);
        D();
    }

    public void x(java.lang.String r2, java.lang.String r3, android.os.Bundle r4) {
        throw new UnsupportedOperationException("Method not decompiled: bg.c2.x(java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    public void y(float f9, float f10, float f11, float f12) {
        Matrix matrix = (Matrix) this.f2122f;
        matrix.reset();
        Bitmap bitmap = (Bitmap) this.f2119b;
        matrix.postRotate(f12, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        matrix.postScale(f11, f11);
        matrix.postTranslate(f9, f10);
        ((BitmapShader) this.f2121e).setLocalMatrix(matrix);
    }

    public c2(int i10) {
        switch (i10) {
            case 8:
                Paint paint = new Paint(1);
                this.d = paint;
                this.f2120c = new RectF();
                this.f2122f = new Matrix();
                Bitmap createBitmap = Bitmap.createBitmap(30, 40, Bitmap.Config.ARGB_8888);
                this.f2119b = createBitmap;
                this.f2118a = new Canvas(createBitmap);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
                this.f2121e = bitmapShader;
                paint.setShader(bitmapShader);
                D();
                return;
            case 9:
                this.f2118a = new ArrayList();
                this.f2119b = new ArrayList();
                this.f2120c = new ArrayList();
                this.d = new ArrayList();
                this.f2121e = new ArrayList();
                this.f2122f = new ArrayList();
                return;
            case 10:
            default:
                this.f2118a = new int[]{2131230820, 2131230818, 2131230744};
                this.f2119b = new int[]{2131230768, 2131230803, 2131230775, 2131230770, 2131230771, 2131230774, 2131230773};
                this.f2120c = new int[]{2131230817, 2131230819, 2131230761, 2131230813, 2131230814, 2131230815, 2131230816};
                this.d = new int[]{2131230793, 2131230759, 2131230792};
                this.f2121e = new int[]{2131230811, 2131230821};
                this.f2122f = new int[]{2131230747, 2131230753, 2131230748, 2131230754};
                return;
            case 11:
                this.f2118a = new Bundle();
                this.f2119b = "AssistAction";
                return;
        }
    }

    @Override
    public void L0(int i10, int i11) {
    }
}
