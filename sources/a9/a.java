package a9;

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
import b4.e0;
import cb.m;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import e3.g;
import e5.f;
import f5.u;
import h5.d0;
import i9.k;
import i9.w;
import i9.y;
import j$.util.DesugarCollections;
import j3.o2;
import j7.g8;
import j7.s7;
import j9.b;
import j9.c;
import j9.d;
import j9.e;
import j9.n;
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
import k7.b7;
import k9.a2;
import k9.l0;
import k9.m0;
import k9.p0;
import k9.q0;
import k9.r0;
import k9.s1;
import k9.t0;
import k9.t1;
import k9.u0;
import k9.u1;
import k9.v0;
import k9.v1;
import k9.w1;
import k9.x0;
import k9.y0;
import k9.z1;
import m.c3;
import m.l1;
import m.m2;
import m.q;
import m.r3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.xx0;
import org.telegram.ui.sb0;
import p2.v;
import q5.g0;
import qh.o4;
import s8.n0;
import x5.j;
import x5.l;
import y2.h;
public final class a implements g6 {
    public Object f155a;
    public Object f156b;
    public Object f157c;
    public Object d;
    public Object f158e;
    public Object f159f;

    public a(int i10) {
        switch (i10) {
            case 8:
                this.f155a = new int[]{2131230820, 2131230818, 2131230744};
                this.f156b = new int[]{2131230768, 2131230803, 2131230775, 2131230770, 2131230771, 2131230774, 2131230773};
                this.f157c = new int[]{2131230817, 2131230819, 2131230761, 2131230813, 2131230814, 2131230815, 2131230816};
                this.d = new int[]{2131230793, 2131230759, 2131230792};
                this.f158e = new int[]{2131230811, 2131230821};
                this.f159f = new int[]{2131230747, 2131230753, 2131230748, 2131230754};
                return;
            case 9:
                Paint paint = new Paint(1);
                this.f155a = paint;
                this.d = new RectF();
                this.f159f = new Matrix();
                Bitmap createBitmap = Bitmap.createBitmap(30, 40, Bitmap.Config.ARGB_8888);
                this.f157c = createBitmap;
                this.f156b = new Canvas(createBitmap);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
                this.f158e = bitmapShader;
                paint.setShader(bitmapShader);
                D();
                return;
            case 10:
                this.f155a = new ArrayList();
                this.f156b = new ArrayList();
                this.f157c = new ArrayList();
                this.d = new ArrayList();
                this.f158e = new ArrayList();
                this.f159f = new ArrayList();
                return;
            default:
                this.f155a = new Bundle();
                this.f156b = "AssistAction";
                return;
        }
    }

    public static void A(Drawable drawable, int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter h;
        int[] iArr = l1.f13238a;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = q.f13300b;
        }
        PorterDuff.Mode mode2 = q.f13300b;
        synchronized (q.class) {
            h = m2.h(i10, mode);
        }
        mutate.setColorFilter(h);
    }

    public static l0 b(l0 l0Var, e eVar, r3 r3Var) {
        String str;
        a a2 = l0Var.a();
        String c3 = ((c) eVar.f9961b).c();
        if (c3 != null) {
            a2.f158e = new v0(c3);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        List q10 = q(((d) ((AtomicMarkableReference) ((m) r3Var.d).f2425b).getReference()).a());
        List q11 = q(((d) ((AtomicMarkableReference) ((m) r3Var.f13330e).f2425b).getReference()).a());
        if (!q10.isEmpty() || !q11.isEmpty()) {
            m0 m0Var = (m0) l0Var.f10942c;
            s1 s1Var = m0Var.f10950a;
            Boolean bool = m0Var.d;
            t1 t1Var = m0Var.f10953e;
            List list = m0Var.f10954f;
            int i10 = m0Var.f10955g;
            if (s1Var == null) {
                str = " execution";
            } else {
                str = "";
            }
            if (str.isEmpty()) {
                a2.f157c = new m0(s1Var, q10, q11, bool, t1Var, list, i10);
            } else {
                throw new IllegalStateException("Missing required properties:".concat(str));
            }
        }
        return a2.h();
    }

    public static a2 d(l0 l0Var, r3 r3Var) {
        List f10 = ((v) r3Var.f13331f).f();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < f10.size(); i10++) {
            n nVar = (n) f10.get(i10);
            nVar.getClass();
            ?? obj = new Object();
            b bVar = (b) nVar;
            String str = bVar.f9954e;
            if (str != null) {
                String str2 = bVar.f9952b;
                if (str2 != null) {
                    obj.f4081b = new x0(str2, str);
                    String str3 = bVar.f9953c;
                    if (str3 != null) {
                        obj.f4080a = str3;
                        String str4 = bVar.d;
                        if (str4 != null) {
                            obj.f4082c = str4;
                            obj.d = Long.valueOf(bVar.f9955f);
                            arrayList.add(obj.c());
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
        a a2 = l0Var.a();
        a2.f159f = new y0(arrayList);
        return a2.h();
    }

    public static boolean f(int i10, int[] iArr) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static a k(Context context, w wVar, n9.b bVar, i9.a aVar, e eVar, r3 r3Var, g0 g0Var, g gVar, f7.b bVar2, k kVar) {
        i9.q qVar = new i9.q(context, wVar, aVar, g0Var, gVar);
        n9.a aVar2 = new n9.a(bVar, gVar, kVar);
        l9.a aVar3 = o9.a.f16663b;
        y2.q.b(context);
        o9.a aVar4 = new o9.a(new o9.c(y2.q.a().c(new w2.a(o9.a.f16664c, o9.a.d)).a("FIREBASE_CRASHLYTICS_REPORT", new v2.c("json"), o9.a.f16665e), gVar.d(), bVar2));
        ?? obj = new Object();
        obj.f155a = qVar;
        obj.f156b = aVar2;
        obj.f157c = aVar4;
        obj.d = eVar;
        obj.f158e = r3Var;
        obj.f159f = wVar;
        return obj;
    }

    public static ColorStateList m(Context context, int i10) {
        int c3 = c3.c(context, 2130968728);
        return new ColorStateList(new int[][]{c3.f13156b, c3.d, c3.f13157c, c3.f13159f}, new int[]{c3.b(context, 2130968726), i0.a.h(c3, i10), i0.a.h(c3, i10), i10});
    }

    public static o4.v o(j3.a2 a2Var, s8.v vVar, o4.v vVar2, j3.m2 m2Var) {
        Object l10;
        int i10;
        o2 z4 = a2Var.z();
        int m9 = a2Var.m();
        if (z4.p()) {
            l10 = null;
        } else {
            l10 = z4.l(m9);
        }
        if (!a2Var.f() && !z4.p()) {
            i10 = z4.f(m9, m2Var, false).b(d0.G(a2Var.C()) - m2Var.f9286e);
        } else {
            i10 = -1;
        }
        for (int i11 = 0; i11 < vVar.size(); i11++) {
            o4.v vVar3 = (o4.v) vVar.get(i11);
            if (s(vVar3, l10, a2Var.f(), a2Var.w(), a2Var.o(), i10)) {
                return vVar3;
            }
        }
        if (!vVar.isEmpty() || vVar2 == null || !s(vVar2, l10, a2Var.f(), a2Var.w(), a2Var.o(), i10)) {
            return null;
        }
        return vVar2;
    }

    public static LayerDrawable p(m2 m2Var, Context context, int i10) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
        Drawable g10 = m2Var.g(context, 2131230807);
        Drawable g11 = m2Var.g(context, 2131230808);
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
                    arrayList.add(new k9.d0(str, str2));
                } else {
                    throw new NullPointerException("Null value");
                }
            } else {
                throw new NullPointerException("Null key");
            }
        }
        Collections.sort(arrayList, new f(15));
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static boolean s(o4.v vVar, Object obj, boolean z4, int i10, int i11, int i12) {
        Object obj2 = vVar.f16579a;
        int i13 = vVar.f16580b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (!z4 || i13 != i10 || vVar.f16581c != i11) {
            if (z4 || i13 != -1 || vVar.f16582e != i12) {
                return false;
            }
            return true;
        }
        return true;
    }

    public Task B(String str, String str2, Bundle bundle) {
        int i10;
        try {
            y(str, str2, bundle);
            x5.a aVar = (x5.a) this.f157c;
            l lVar = l.f50431a;
            p2.g gVar = aVar.f50407c;
            if (gVar.g() < 12000000) {
                if (gVar.h() != 0) {
                    return aVar.a(bundle).continueWithTask(lVar, new g0(16, aVar, bundle));
                }
                return Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            x5.k d = x5.k.d(aVar.f50406b);
            synchronized (d) {
                i10 = d.f50428a;
                d.f50428a = i10 + 1;
            }
            return d.e(new j(i10, 1, bundle, 1)).continueWith(lVar, x5.b.f50411a);
        } catch (InterruptedException | ExecutionException e6) {
            return Tasks.forException(e6);
        }
    }

    @Override
    public int B0(int i10) {
        return ((o4) this.f159f).f5564z0.get(i10, k6.w0(null, i10, false));
    }

    public void C(boolean z4) {
        ArrayList arrayList = (ArrayList) this.f157c;
        ArrayList arrayList2 = (ArrayList) this.f156b;
        ArrayList arrayList3 = (ArrayList) this.f155a;
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            ((ValueAnimator) arrayList3.get(i10)).cancel();
            if (z4) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) ((ArrayList) this.d).get(i10)).floatValue(), 0.0f);
                ofFloat.addUpdateListener(new xx0(this, i10, 0));
                ofFloat.setDuration(100L);
                ofFloat.start();
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            ((ValueAnimator) arrayList2.get(i11)).cancel();
            if (z4) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(((Float) ((ArrayList) this.f158e).get(i11)).floatValue(), 0.0f);
                ofFloat2.addUpdateListener(new xx0(this, i11, 1));
                ofFloat2.setDuration(100L);
                ofFloat2.start();
            }
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            ((ValueAnimator) arrayList.get(i12)).cancel();
            if (z4) {
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(((Float) ((ArrayList) this.f159f).get(i12)).floatValue(), 0.0f);
                ofFloat3.addUpdateListener(new xx0(this, i12, 2));
                ofFloat3.setDuration(100L);
                ofFloat3.start();
            }
        }
        arrayList.clear();
        arrayList2.clear();
        arrayList3.clear();
    }

    public void D() {
        Bitmap bitmap = (Bitmap) this.f157c;
        RectF rectF = (RectF) this.d;
        Matrix matrix = (Matrix) this.f159f;
        BitmapShader bitmapShader = (BitmapShader) this.f158e;
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

    public void E(o2 o2Var) {
        e0 e0Var = new e0(4, 22);
        if (((s8.v) this.f156b).isEmpty()) {
            e(e0Var, (o4.v) this.f158e, o2Var);
            if (!b7.a((o4.v) this.f159f, (o4.v) this.f158e)) {
                e(e0Var, (o4.v) this.f159f, o2Var);
            }
            if (!b7.a((o4.v) this.d, (o4.v) this.f158e) && !b7.a((o4.v) this.d, (o4.v) this.f159f)) {
                e(e0Var, (o4.v) this.d, o2Var);
            }
        } else {
            for (int i10 = 0; i10 < ((s8.v) this.f156b).size(); i10++) {
                e(e0Var, (o4.v) ((s8.v) this.f156b).get(i10), o2Var);
            }
            if (!((s8.v) this.f156b).contains((o4.v) this.d)) {
                e(e0Var, (o4.v) this.d, o2Var);
            }
        }
        this.f157c = e0Var.d();
    }

    @Override
    public Paint F(String str) {
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
                return (TextPaint) this.f156b;
            case 1:
                return (TextPaint) this.f157c;
            case 2:
                return (Paint) this.f158e;
            case 3:
                return (Paint) this.d;
            case 4:
                return (TextPaint) this.f155a;
            default:
                return k6.S0(str);
        }
    }

    @Override
    public int Z0(int i10) {
        return B0(i10);
    }

    @Override
    public boolean a() {
        return ((o4) this.f159f).f5563y0;
    }

    public void c(String str, String str2) {
        HashMap hashMap = (HashMap) this.f159f;
        if (hashMap != null) {
            hashMap.put(str, str2);
            return;
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }

    public void e(e0 e0Var, o4.v vVar, o2 o2Var) {
        if (vVar != null) {
            if (o2Var.b(vVar.f16579a) != -1) {
                e0Var.x(vVar, o2Var);
                return;
            }
            o2 o2Var2 = (o2) ((n0) this.f157c).get(vVar);
            if (o2Var2 != null) {
                e0Var.x(vVar, o2Var2);
            }
        }
    }

    @Override
    public int e0(int i10) {
        return B0(i10);
    }

    public b9.b g() {
        String str;
        String str2;
        b6.m.i((String) this.f159f, "setActionToken is required before calling build().");
        new String((String) this.f158e);
        u("actionToken", (String) this.f159f);
        String str3 = (String) this.f157c;
        String str4 = null;
        if (str3 == null) {
            str = null;
        } else {
            str = new String(str3);
        }
        if (str == null) {
            this.f157c = "AssistAction";
            u("name", "AssistAction");
        }
        String str5 = (String) this.d;
        if (str5 != null) {
            str4 = new String(str5);
        }
        if (str4 == null) {
            String valueOf = String.valueOf((String) this.f159f);
            if (valueOf.length() != 0) {
                str2 = "https://developers.google.com/actions?invocation=".concat(valueOf);
            } else {
                str2 = new String("https://developers.google.com/actions?invocation=");
            }
            b6.m.h(str2);
            this.d = str2;
            u("url", str2);
        }
        b6.m.i((String) this.f157c, "setObject is required before calling build().");
        b6.m.i((String) this.d, "setObject is required before calling build().");
        return new b9.b((String) this.f156b, (String) this.f157c, (String) this.d, null, new b9.a(), (String) this.f158e, (Bundle) this.f155a);
    }

    @Override
    public Drawable getDrawable(String str) {
        o4 o4Var = (o4) this.f159f;
        a aVar = o4Var.A0;
        if (str.equals("drawableMsgIn")) {
            if (o4Var.B0 == null) {
                o4Var.B0 = new h5(0, false, false, aVar);
            }
            return o4Var.B0;
        } else if (str.equals("drawableMsgInSelected")) {
            if (o4Var.C0 == null) {
                o4Var.C0 = new h5(0, false, true, aVar);
            }
            return o4Var.C0;
        } else if (str.equals("drawableMsgOut")) {
            if (o4Var.D0 == null) {
                o4Var.D0 = new h5(0, true, false, aVar);
            }
            return o4Var.D0;
        } else if (str.equals("drawableMsgOutSelected")) {
            if (o4Var.E0 == null) {
                o4Var.E0 = new h5(0, true, true, aVar);
            }
            return o4Var.E0;
        } else if (str.equals("drawableMsgInMedia")) {
            if (o4Var.F0 == null) {
                o4Var.F0 = new h5(1, false, false, aVar);
            }
            o4Var.F0.invalidateSelf();
            return o4Var.F0;
        } else if (str.equals("drawableMsgInMediaSelected")) {
            if (o4Var.G0 == null) {
                o4Var.G0 = new h5(1, false, true, aVar);
            }
            return o4Var.G0;
        } else if (str.equals("drawableMsgOutMedia")) {
            if (o4Var.H0 == null) {
                o4Var.H0 = new h5(1, true, false, aVar);
            }
            return o4Var.H0;
        } else if (str.equals("drawableMsgOutMediaSelected")) {
            if (o4Var.I0 == null) {
                o4Var.I0 = new h5(1, true, true, aVar);
            }
            return o4Var.I0;
        } else {
            return k6.O0(str);
        }
    }

    public l0 h() {
        String str;
        if (((Long) this.f155a) == null) {
            str = " timestamp";
        } else {
            str = "";
        }
        if (((String) this.f156b) == null) {
            str = str.concat(" type");
        }
        if (((u1) this.f157c) == null) {
            str = w.c.e(str, " app");
        }
        if (((v1) this.d) == null) {
            str = w.c.e(str, " device");
        }
        if (str.isEmpty()) {
            return new l0(((Long) this.f155a).longValue(), (String) this.f156b, (u1) this.f157c, (v1) this.d, (w1) this.f158e, (z1) this.f159f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public u0 i() {
        String str;
        if (((Integer) this.f156b) == null) {
            str = " batteryVelocity";
        } else {
            str = "";
        }
        if (((Boolean) this.f157c) == null) {
            str = str.concat(" proximityOn");
        }
        if (((Integer) this.d) == null) {
            str = w.c.e(str, " orientation");
        }
        if (((Long) this.f158e) == null) {
            str = w.c.e(str, " ramUsed");
        }
        if (((Long) this.f159f) == null) {
            str = w.c.e(str, " diskUsed");
        }
        if (str.isEmpty()) {
            return new u0((Double) this.f155a, ((Integer) this.f156b).intValue(), ((Boolean) this.f157c).booleanValue(), ((Integer) this.d).intValue(), ((Long) this.f158e).longValue(), ((Long) this.f159f).longValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public h j() {
        String str;
        if (((String) this.f156b) == null) {
            str = " transportName";
        } else {
            str = "";
        }
        if (((y2.l) this.f157c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.d) == null) {
            str = w.c.e(str, " eventMillis");
        }
        if (((Long) this.f158e) == null) {
            str = w.c.e(str, " uptimeMillis");
        }
        if (((HashMap) this.f159f) == null) {
            str = w.c.e(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new h((String) this.f156b, (Integer) this.f155a, (y2.l) this.f157c, ((Long) this.d).longValue(), ((Long) this.f158e).longValue(), (HashMap) this.f159f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override
    public void l(float f10, float f11, int i10, int i11) {
        k6.q(f10, f11, i10, i11);
    }

    public Task n(Task task) {
        return task.continueWith(new sb0(1), new a1.c(this, 5));
    }

    @Override
    public boolean o0() {
        return false;
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
            ColorStateList d = c3.d(context, 2130968734);
            if (d != null && d.isStateful()) {
                int[] iArr3 = c3.f13156b;
                iArr[0] = iArr3;
                iArr2[0] = d.getColorForState(iArr3, 0);
                iArr[1] = c3.f13158e;
                iArr2[1] = c3.c(context, 2130968727);
                iArr[2] = c3.f13159f;
                iArr2[2] = d.getDefaultColor();
            } else {
                iArr[0] = c3.f13156b;
                iArr2[0] = c3.b(context, 2130968734);
                iArr[1] = c3.f13158e;
                iArr2[1] = c3.c(context, 2130968727);
                iArr[2] = c3.f13159f;
                iArr2[2] = c3.c(context, 2130968734);
            }
            return new ColorStateList(iArr, iArr2);
        } else if (i10 == 2131230752) {
            return m(context, c3.c(context, 2130968726));
        } else {
            if (i10 == 2131230746) {
                return m(context, 0);
            }
            if (i10 == 2131230751) {
                return m(context, c3.c(context, 2130968724));
            }
            if (i10 != 2131230805 && i10 != 2131230806) {
                if (f(i10, (int[]) this.f156b)) {
                    return c3.d(context, 2130968729);
                }
                if (f(i10, (int[]) this.f158e)) {
                    return s7.a(context, 2131099668);
                }
                if (f(i10, (int[]) this.f159f)) {
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

    public void t(Throwable th2, Thread thread, String str, String str2, long j10, boolean z4) {
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        g0 g0Var;
        boolean z10;
        boolean equals = str2.equals("crash");
        i9.q qVar = (i9.q) this.f155a;
        Context context = qVar.f7997a;
        int i10 = context.getResources().getConfiguration().orientation;
        g0 g0Var2 = qVar.d;
        Stack stack = new Stack();
        for (Throwable th3 = th2; th3 != null; th3 = th3.getCause()) {
            stack.push(th3);
        }
        Boolean bool = null;
        sf.e eVar = null;
        while (!stack.isEmpty()) {
            Throwable th4 = (Throwable) stack.pop();
            eVar = new sf.e(th4.getLocalizedMessage(), th4.getClass().getName(), g0Var2.v0(th4.getStackTrace()), eVar, 12);
        }
        sf.e eVar2 = eVar;
        ?? obj = new Object();
        obj.f156b = str2;
        obj.f155a = Long.valueOf(j10);
        t1 b10 = f9.c.f6226a.b(context);
        int i11 = ((t0) b10).f11011c;
        if (i11 > 0) {
            if (i11 != 100) {
                z10 = true;
            } else {
                z10 = false;
            }
            bool = Boolean.valueOf(z10);
        }
        Boolean bool2 = bool;
        ArrayList a2 = f9.c.a(context);
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) eVar2.d;
        String name = thread.getName();
        if (name != null) {
            List d = i9.q.d(stackTraceElementArr, 4);
            if (d != null) {
                arrayList.add(new r0(name, 4, d));
                if (z4) {
                    Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = Thread.getAllStackTraces().entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry<Thread, StackTraceElement[]> next = it2.next();
                        Thread key = next.getKey();
                        if (!key.equals(thread)) {
                            StackTraceElement[] v02 = g0Var2.v0(next.getValue());
                            String name2 = key.getName();
                            if (name2 != null) {
                                it = it2;
                                List d10 = i9.q.d(v02, 0);
                                if (d10 != null) {
                                    g0Var = g0Var2;
                                    arrayList.add(new r0(name2, 0, d10));
                                } else {
                                    throw new NullPointerException("Null frames");
                                }
                            } else {
                                throw new NullPointerException("Null name");
                            }
                        } else {
                            it = it2;
                            g0Var = g0Var2;
                        }
                        it2 = it;
                        g0Var2 = g0Var;
                    }
                }
                List unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
                p0 c3 = i9.q.c(eVar2, 0);
                q0 q0Var = new q0(0L, "0", "0");
                List a10 = qVar.a();
                if (a10 != null) {
                    obj.f157c = new m0(new k9.n0(unmodifiableList, c3, null, q0Var, a10), null, null, bool2, b10, a2, i10);
                    obj.d = qVar.b(i10);
                    l0 h = obj.h();
                    r3 r3Var = (r3) this.f158e;
                    ((n9.a) this.f156b).d(d(b(h, (e) this.d, r3Var), r3Var), str, equals);
                    return;
                }
                throw new NullPointerException("Null binaries");
            }
            throw new NullPointerException("Null frames");
        }
        throw new NullPointerException("Null name");
    }

    public void u(String str, String... strArr) {
        Bundle bundle = (Bundle) this.f155a;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length > 0) {
            int i10 = 0;
            for (int i11 = 0; i11 < Math.min(strArr2.length, 100); i11++) {
                String str2 = strArr2[i11];
                strArr2[i10] = str2;
                if (strArr2[i11] == null) {
                    StringBuilder sb = new StringBuilder(59);
                    sb.append("String at ");
                    sb.append(i11);
                    sb.append(" is null and is ignored by put method.");
                    j7.e0.a(sb.toString());
                } else {
                    int i12 = 20000;
                    if (str2.length() > 20000) {
                        StringBuilder sb2 = new StringBuilder(53);
                        sb2.append("String at ");
                        sb2.append(i11);
                        sb2.append(" is too long, truncating string.");
                        j7.e0.a(sb2.toString());
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
                    j7.e0.a("Input Array of elements is too big, cutting off.");
                    objArr = Arrays.copyOf(objArr, 100);
                }
                bundle.putStringArray(str, (String[]) objArr);
                return;
            }
            return;
        }
        j7.e0.a("String array is empty and is ignored by put method.");
    }

    public Task v(Executor executor, String str) {
        boolean z4;
        TaskCompletionSource taskCompletionSource;
        String str2;
        ArrayList b10 = ((n9.a) this.f156b).b();
        ArrayList arrayList = new ArrayList();
        int size = b10.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            File file = (File) b10.get(i10);
            try {
                l9.a aVar = n9.a.f15866g;
                String e6 = n9.a.e(file);
                aVar.getClass();
                arrayList.add(new i9.b(l9.a.i(e6), file.getName(), file));
            } catch (IOException e10) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e10);
                file.delete();
            }
            i10 = i11;
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            int i13 = i12 + 1;
            i9.b bVar = (i9.b) arrayList.get(i12);
            if (str == null || str.equals(bVar.f7938b)) {
                o9.a aVar2 = (o9.a) this.f157c;
                if (bVar.f7937a.f10807f == null) {
                    try {
                        str2 = (String) y.a(((ca.c) ((w) this.f159f).d).d());
                    } catch (Exception e11) {
                        Log.w("FirebaseCrashlytics", "Failed to retrieve Firebase Installation ID.", e11);
                        str2 = null;
                    }
                    g8 a2 = bVar.f7937a.a();
                    a2.d = str2;
                    bVar = new i9.b(a2.a(), bVar.f7938b, bVar.f7939c);
                }
                if (str != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                o9.c cVar = aVar2.f16666a;
                synchronized (cVar.f16675f) {
                    try {
                        taskCompletionSource = new TaskCompletionSource();
                        if (z4) {
                            ((AtomicInteger) cVar.f16677i.f6120b).getAndIncrement();
                            if (cVar.f16675f.size() < cVar.f16674e) {
                                f9.b bVar2 = f9.b.f6225a;
                                bVar2.b("Enqueueing report: " + bVar.f7938b);
                                bVar2.b("Queue size: " + cVar.f16675f.size());
                                cVar.f16676g.execute(new com.google.android.gms.common.api.internal.s1(cVar, bVar, taskCompletionSource, 7));
                                bVar2.b("Closing task for report: " + bVar.f7938b);
                                taskCompletionSource.trySetResult(bVar);
                            } else {
                                cVar.a();
                                String str3 = "Dropping report due to queue being full: " + bVar.f7938b;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str3, null);
                                }
                                ((AtomicInteger) cVar.f16677i.f6121c).getAndIncrement();
                                taskCompletionSource.trySetResult(bVar);
                            }
                        } else {
                            cVar.b(bVar, taskCompletionSource);
                        }
                    } finally {
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new u(this)));
            }
            i12 = i13;
        }
        return Tasks.whenAll(arrayList2);
    }

    @Override
    public ColorFilter w() {
        return k6.f21976v3;
    }

    public void x(float f10, float f11, float f12, float f13) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f10, f11, f12, f13);
        RectF rectF2 = (RectF) this.d;
        if (rectF2.top == rectF.top && rectF2.bottom == rectF.bottom && rectF2.left == rectF.left && rectF2.right == rectF.right) {
            return;
        }
        rectF2.set(rectF);
        D();
    }

    public void y(java.lang.String r2, java.lang.String r3, android.os.Bundle r4) {
        throw new UnsupportedOperationException("Method not decompiled: a9.a.y(java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    public void z(float f10, float f11, float f12, float f13) {
        Matrix matrix = (Matrix) this.f159f;
        matrix.reset();
        Bitmap bitmap = (Bitmap) this.f157c;
        matrix.postRotate(f13, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        matrix.postScale(f12, f12);
        matrix.postTranslate(f10, f11);
        ((BitmapShader) this.f158e).setLocalMatrix(matrix);
    }

    public a(int i10, int i11) {
        Paint paint = new Paint(1);
        this.f155a = paint;
        this.d = new RectF();
        this.f159f = new Matrix();
        Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, i10), Math.max(1, i11), Bitmap.Config.ARGB_8888);
        this.f157c = createBitmap;
        this.f156b = new Canvas(createBitmap);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
        this.f158e = bitmapShader;
        paint.setShader(bitmapShader);
        D();
    }

    @Override
    public void J0(int i10, int i11) {
    }
}
