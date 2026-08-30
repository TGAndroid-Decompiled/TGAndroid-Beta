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
import com.google.firebase.messaging.r;
import e3.g;
import e5.f;
import h5.d0;
import i9.k;
import i9.y;
import j$.util.DesugarCollections;
import j3.m2;
import j3.o2;
import j7.f8;
import j7.r7;
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
import k7.a7;
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
import m.d3;
import m.m1;
import m.n2;
import m.q;
import m.s3;
import o4.v;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.rb0;
import p2.w;
import ph.o4;
import q5.g0;
import s8.n0;
import vh.v2;
import x5.j;
import x5.l;
import y2.h;
public final class a implements f6 {
    public Object f143a;
    public Object f144b;
    public Object f145c;
    public Object d;
    public Object e;
    public Object f146f;

    public a(int i10) {
        switch (i10) {
            case 8:
                this.f143a = new int[]{2131230820, 2131230818, 2131230744};
                this.f144b = new int[]{2131230768, 2131230803, 2131230775, 2131230770, 2131230771, 2131230774, 2131230773};
                this.f145c = new int[]{2131230817, 2131230819, 2131230761, 2131230813, 2131230814, 2131230815, 2131230816};
                this.d = new int[]{2131230793, 2131230759, 2131230792};
                this.e = new int[]{2131230811, 2131230821};
                this.f146f = new int[]{2131230747, 2131230753, 2131230748, 2131230754};
                return;
            case 9:
                Paint paint = new Paint(1);
                this.f143a = paint;
                this.d = new RectF();
                this.f146f = new Matrix();
                Bitmap createBitmap = Bitmap.createBitmap(30, 40, Bitmap.Config.ARGB_8888);
                this.f145c = createBitmap;
                this.f144b = new Canvas(createBitmap);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
                this.e = bitmapShader;
                paint.setShader(bitmapShader);
                D();
                return;
            case 10:
                this.f143a = new ArrayList();
                this.f144b = new ArrayList();
                this.f145c = new ArrayList();
                this.d = new ArrayList();
                this.e = new ArrayList();
                this.f146f = new ArrayList();
                return;
            default:
                this.f143a = new Bundle();
                this.f144b = "AssistAction";
                return;
        }
    }

    public static void A(Drawable drawable, int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter h;
        int[] iArr = m1.f13559a;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = q.f13602b;
        }
        PorterDuff.Mode mode2 = q.f13602b;
        synchronized (q.class) {
            h = n2.h(i10, mode);
        }
        mutate.setColorFilter(h);
    }

    public static l0 b(l0 l0Var, e eVar, s3 s3Var) {
        String str;
        a a2 = l0Var.a();
        String c3 = ((c) eVar.f9327b).c();
        if (c3 != null) {
            a2.e = new v0(c3);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        List q10 = q(((d) ((AtomicMarkableReference) ((m) s3Var.d).f2233b).getReference()).a());
        List q11 = q(((d) ((AtomicMarkableReference) ((m) s3Var.e).f2233b).getReference()).a());
        if (!q10.isEmpty() || !q11.isEmpty()) {
            m0 m0Var = (m0) l0Var.f10191c;
            s1 s1Var = m0Var.f10197a;
            Boolean bool = m0Var.d;
            t1 t1Var = m0Var.e;
            List list = m0Var.f10200f;
            int i10 = m0Var.f10201g;
            if (s1Var == null) {
                str = " execution";
            } else {
                str = "";
            }
            if (str.isEmpty()) {
                a2.f145c = new m0(s1Var, q10, q11, bool, t1Var, list, i10);
            } else {
                throw new IllegalStateException("Missing required properties:".concat(str));
            }
        }
        return a2.h();
    }

    public static a2 d(l0 l0Var, s3 s3Var) {
        List f10 = ((w) s3Var.f13644f).f();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < f10.size(); i10++) {
            n nVar = (n) f10.get(i10);
            nVar.getClass();
            r rVar = new r(13, false);
            b bVar = (b) nVar;
            String str = bVar.e;
            if (str != null) {
                String str2 = bVar.f9319b;
                if (str2 != null) {
                    rVar.f4029c = new x0(str2, str);
                    String str3 = bVar.f9320c;
                    if (str3 != null) {
                        rVar.f4028b = str3;
                        String str4 = bVar.d;
                        if (str4 != null) {
                            rVar.d = str4;
                            rVar.e = Long.valueOf(bVar.f9321f);
                            arrayList.add(rVar.q());
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
        a2.f146f = new y0(arrayList);
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

    public static a k(Context context, i9.w wVar, n9.b bVar, i9.a aVar, e eVar, s3 s3Var, g0 g0Var, g gVar, f7.b bVar2, k kVar) {
        i9.q qVar = new i9.q(context, wVar, aVar, g0Var, gVar);
        n9.a aVar2 = new n9.a(bVar, gVar, kVar);
        l9.a aVar3 = o9.a.f16502b;
        y2.q.b(context);
        o9.a aVar4 = new o9.a(new o9.c(y2.q.a().c(new w2.a(o9.a.f16503c, o9.a.d)).a("FIREBASE_CRASHLYTICS_REPORT", new v2.c("json"), o9.a.e), gVar.d(), bVar2));
        ?? obj = new Object();
        obj.f143a = qVar;
        obj.f144b = aVar2;
        obj.f145c = aVar4;
        obj.d = eVar;
        obj.e = s3Var;
        obj.f146f = wVar;
        return obj;
    }

    public static ColorStateList m(Context context, int i10) {
        int c3 = d3.c(context, 2130968728);
        return new ColorStateList(new int[][]{d3.f13484b, d3.d, d3.f13485c, d3.f13486f}, new int[]{d3.b(context, 2130968726), i0.a.h(c3, i10), i0.a.h(c3, i10), i10});
    }

    public static v o(j3.a2 a2Var, s8.v vVar, v vVar2, m2 m2Var) {
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
            i10 = z4.f(m9, m2Var, false).b(d0.G(a2Var.C()) - m2Var.e);
        } else {
            i10 = -1;
        }
        for (int i11 = 0; i11 < vVar.size(); i11++) {
            v vVar3 = (v) vVar.get(i11);
            if (s(vVar3, l10, a2Var.f(), a2Var.w(), a2Var.o(), i10)) {
                return vVar3;
            }
        }
        if (!vVar.isEmpty() || vVar2 == null || !s(vVar2, l10, a2Var.f(), a2Var.w(), a2Var.o(), i10)) {
            return null;
        }
        return vVar2;
    }

    public static LayerDrawable p(n2 n2Var, Context context, int i10) {
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

    public static boolean s(v vVar, Object obj, boolean z4, int i10, int i11, int i12) {
        Object obj2 = vVar.f16424a;
        int i13 = vVar.f16425b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (!z4 || i13 != i10 || vVar.f16426c != i11) {
            if (z4 || i13 != -1 || vVar.e != i12) {
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
            x5.a aVar = (x5.a) this.f145c;
            l lVar = l.f46826a;
            p2.g gVar = aVar.f46806c;
            if (gVar.g() < 12000000) {
                if (gVar.h() != 0) {
                    return aVar.a(bundle).continueWithTask(lVar, new g0(16, aVar, bundle));
                }
                return Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            x5.k d = x5.k.d(aVar.f46805b);
            synchronized (d) {
                i10 = d.f46823a;
                d.f46823a = i10 + 1;
            }
            return d.e(new j(i10, 1, bundle, 1)).continueWith(lVar, x5.b.f46809a);
        } catch (InterruptedException | ExecutionException e) {
            return Tasks.forException(e);
        }
    }

    public void C(boolean z4) {
        ArrayList arrayList = (ArrayList) this.f145c;
        ArrayList arrayList2 = (ArrayList) this.f144b;
        ArrayList arrayList3 = (ArrayList) this.f143a;
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            ((ValueAnimator) arrayList3.get(i10)).cancel();
            if (z4) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) ((ArrayList) this.d).get(i10)).floatValue(), 0.0f);
                ofFloat.addUpdateListener(new wx0(this, i10, 0));
                ofFloat.setDuration(100L);
                ofFloat.start();
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            ((ValueAnimator) arrayList2.get(i11)).cancel();
            if (z4) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(((Float) ((ArrayList) this.e).get(i11)).floatValue(), 0.0f);
                ofFloat2.addUpdateListener(new wx0(this, i11, 1));
                ofFloat2.setDuration(100L);
                ofFloat2.start();
            }
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            ((ValueAnimator) arrayList.get(i12)).cancel();
            if (z4) {
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(((Float) ((ArrayList) this.f146f).get(i12)).floatValue(), 0.0f);
                ofFloat3.addUpdateListener(new wx0(this, i12, 2));
                ofFloat3.setDuration(100L);
                ofFloat3.start();
            }
        }
        arrayList.clear();
        arrayList2.clear();
        arrayList3.clear();
    }

    public void D() {
        Bitmap bitmap = (Bitmap) this.f145c;
        RectF rectF = (RectF) this.d;
        Matrix matrix = (Matrix) this.f146f;
        BitmapShader bitmapShader = (BitmapShader) this.e;
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
        if (((s8.v) this.f144b).isEmpty()) {
            e(e0Var, (v) this.e, o2Var);
            if (!a7.a((v) this.f146f, (v) this.e)) {
                e(e0Var, (v) this.f146f, o2Var);
            }
            if (!a7.a((v) this.d, (v) this.e) && !a7.a((v) this.d, (v) this.f146f)) {
                e(e0Var, (v) this.d, o2Var);
            }
        } else {
            for (int i10 = 0; i10 < ((s8.v) this.f144b).size(); i10++) {
                e(e0Var, (v) ((s8.v) this.f144b).get(i10), o2Var);
            }
            if (!((s8.v) this.f144b).contains((v) this.d)) {
                e(e0Var, (v) this.d, o2Var);
            }
        }
        this.f145c = e0Var.c();
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
                return (TextPaint) this.f144b;
            case 1:
                return (TextPaint) this.f145c;
            case 2:
                return (Paint) this.e;
            case 3:
                return (Paint) this.d;
            case 4:
                return (TextPaint) this.f143a;
            default:
                return j6.S0(str);
        }
    }

    @Override
    public boolean a() {
        return ((o4) this.f146f).f4361y0;
    }

    public void c(String str, String str2) {
        HashMap hashMap = (HashMap) this.f146f;
        if (hashMap != null) {
            hashMap.put(str, str2);
            return;
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }

    @Override
    public int c0(int i10) {
        return x0(i10);
    }

    public void e(e0 e0Var, v vVar, o2 o2Var) {
        if (vVar != null) {
            if (o2Var.b(vVar.f16424a) != -1) {
                e0Var.w(vVar, o2Var);
                return;
            }
            o2 o2Var2 = (o2) ((n0) this.f145c).get(vVar);
            if (o2Var2 != null) {
                e0Var.w(vVar, o2Var2);
            }
        }
    }

    public b9.b g() {
        String str;
        String str2;
        b6.m.i((String) this.f146f, "setActionToken is required before calling build().");
        new String((String) this.e);
        u("actionToken", (String) this.f146f);
        String str3 = (String) this.f145c;
        String str4 = null;
        if (str3 == null) {
            str = null;
        } else {
            str = new String(str3);
        }
        if (str == null) {
            this.f145c = "AssistAction";
            u("name", "AssistAction");
        }
        String str5 = (String) this.d;
        if (str5 != null) {
            str4 = new String(str5);
        }
        if (str4 == null) {
            String valueOf = String.valueOf((String) this.f146f);
            if (valueOf.length() != 0) {
                str2 = "https://developers.google.com/actions?invocation=".concat(valueOf);
            } else {
                str2 = new String("https://developers.google.com/actions?invocation=");
            }
            b6.m.h(str2);
            this.d = str2;
            u("url", str2);
        }
        b6.m.i((String) this.f145c, "setObject is required before calling build().");
        b6.m.i((String) this.d, "setObject is required before calling build().");
        return new b9.b((String) this.f144b, (String) this.f145c, (String) this.d, null, new b9.a(), (String) this.e, (Bundle) this.f143a);
    }

    @Override
    public int g1(int i10) {
        return x0(i10);
    }

    @Override
    public Drawable getDrawable(String str) {
        o4 o4Var = (o4) this.f146f;
        a aVar = o4Var.A0;
        if (str.equals("drawableMsgIn")) {
            if (o4Var.B0 == null) {
                o4Var.B0 = new g5(0, false, false, aVar);
            }
            return o4Var.B0;
        } else if (str.equals("drawableMsgInSelected")) {
            if (o4Var.C0 == null) {
                o4Var.C0 = new g5(0, false, true, aVar);
            }
            return o4Var.C0;
        } else if (str.equals("drawableMsgOut")) {
            if (o4Var.D0 == null) {
                o4Var.D0 = new g5(0, true, false, aVar);
            }
            return o4Var.D0;
        } else if (str.equals("drawableMsgOutSelected")) {
            if (o4Var.E0 == null) {
                o4Var.E0 = new g5(0, true, true, aVar);
            }
            return o4Var.E0;
        } else if (str.equals("drawableMsgInMedia")) {
            if (o4Var.F0 == null) {
                o4Var.F0 = new g5(1, false, false, aVar);
            }
            o4Var.F0.invalidateSelf();
            return o4Var.F0;
        } else if (str.equals("drawableMsgInMediaSelected")) {
            if (o4Var.G0 == null) {
                o4Var.G0 = new g5(1, false, true, aVar);
            }
            return o4Var.G0;
        } else if (str.equals("drawableMsgOutMedia")) {
            if (o4Var.H0 == null) {
                o4Var.H0 = new g5(1, true, false, aVar);
            }
            return o4Var.H0;
        } else if (str.equals("drawableMsgOutMediaSelected")) {
            if (o4Var.I0 == null) {
                o4Var.I0 = new g5(1, true, true, aVar);
            }
            return o4Var.I0;
        } else {
            return j6.O0(str);
        }
    }

    public l0 h() {
        String str;
        if (((Long) this.f143a) == null) {
            str = " timestamp";
        } else {
            str = "";
        }
        if (((String) this.f144b) == null) {
            str = str.concat(" type");
        }
        if (((u1) this.f145c) == null) {
            str = v2.k(str, " app");
        }
        if (((v1) this.d) == null) {
            str = v2.k(str, " device");
        }
        if (str.isEmpty()) {
            return new l0(((Long) this.f143a).longValue(), (String) this.f144b, (u1) this.f145c, (v1) this.d, (w1) this.e, (z1) this.f146f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public u0 i() {
        String str;
        if (((Integer) this.f144b) == null) {
            str = " batteryVelocity";
        } else {
            str = "";
        }
        if (((Boolean) this.f145c) == null) {
            str = str.concat(" proximityOn");
        }
        if (((Integer) this.d) == null) {
            str = v2.k(str, " orientation");
        }
        if (((Long) this.e) == null) {
            str = v2.k(str, " ramUsed");
        }
        if (((Long) this.f146f) == null) {
            str = v2.k(str, " diskUsed");
        }
        if (str.isEmpty()) {
            return new u0((Double) this.f143a, ((Integer) this.f144b).intValue(), ((Boolean) this.f145c).booleanValue(), ((Integer) this.d).intValue(), ((Long) this.e).longValue(), ((Long) this.f146f).longValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public h j() {
        String str;
        if (((String) this.f144b) == null) {
            str = " transportName";
        } else {
            str = "";
        }
        if (((y2.l) this.f145c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.d) == null) {
            str = v2.k(str, " eventMillis");
        }
        if (((Long) this.e) == null) {
            str = v2.k(str, " uptimeMillis");
        }
        if (((HashMap) this.f146f) == null) {
            str = v2.k(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new h((String) this.f144b, (Integer) this.f143a, (y2.l) this.f145c, ((Long) this.d).longValue(), ((Long) this.e).longValue(), (HashMap) this.f146f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override
    public void l(float f10, float f11, int i10, int i11) {
        j6.q(f10, f11, i10, i11);
    }

    @Override
    public boolean m0() {
        return false;
    }

    public Task n(Task task) {
        return task.continueWith(new rb0(1), new a1.c(this, 6));
    }

    public ColorStateList r(Context context, int i10) {
        if (i10 == 2131230764) {
            return r7.a(context, 2131099669);
        }
        if (i10 == 2131230810) {
            return r7.a(context, 2131099672);
        }
        if (i10 == 2131230809) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList d = d3.d(context, 2130968734);
            if (d != null && d.isStateful()) {
                int[] iArr3 = d3.f13484b;
                iArr[0] = iArr3;
                iArr2[0] = d.getColorForState(iArr3, 0);
                iArr[1] = d3.e;
                iArr2[1] = d3.c(context, 2130968727);
                iArr[2] = d3.f13486f;
                iArr2[2] = d.getDefaultColor();
            } else {
                iArr[0] = d3.f13484b;
                iArr2[0] = d3.b(context, 2130968734);
                iArr[1] = d3.e;
                iArr2[1] = d3.c(context, 2130968727);
                iArr[2] = d3.f13486f;
                iArr2[2] = d3.c(context, 2130968734);
            }
            return new ColorStateList(iArr, iArr2);
        } else if (i10 == 2131230752) {
            return m(context, d3.c(context, 2130968726));
        } else {
            if (i10 == 2131230746) {
                return m(context, 0);
            }
            if (i10 == 2131230751) {
                return m(context, d3.c(context, 2130968724));
            }
            if (i10 != 2131230805 && i10 != 2131230806) {
                if (f(i10, (int[]) this.f144b)) {
                    return d3.d(context, 2130968729);
                }
                if (f(i10, (int[]) this.e)) {
                    return r7.a(context, 2131099668);
                }
                if (f(i10, (int[]) this.f146f)) {
                    return r7.a(context, 2131099667);
                }
                if (i10 == 2131230802) {
                    return r7.a(context, 2131099670);
                }
                return null;
            }
            return r7.a(context, 2131099671);
        }
    }

    public void t(Throwable th2, Thread thread, String str, String str2, long j10, boolean z4) {
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        g0 g0Var;
        boolean z10;
        boolean equals = str2.equals("crash");
        i9.q qVar = (i9.q) this.f143a;
        Context context = qVar.f7430a;
        int i10 = context.getResources().getConfiguration().orientation;
        g0 g0Var2 = qVar.d;
        Stack stack = new Stack();
        for (Throwable th3 = th2; th3 != null; th3 = th3.getCause()) {
            stack.push(th3);
        }
        Boolean bool = null;
        r rVar = null;
        while (!stack.isEmpty()) {
            Throwable th4 = (Throwable) stack.pop();
            rVar = new r(th4.getLocalizedMessage(), th4.getClass().getName(), g0Var2.v0(th4.getStackTrace()), rVar, 24);
        }
        r rVar2 = rVar;
        ?? obj = new Object();
        obj.f144b = str2;
        obj.f143a = Long.valueOf(j10);
        t1 b10 = f9.c.f6107a.b(context);
        int i11 = ((t0) b10).f10249c;
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
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) rVar2.d;
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
                p0 c3 = i9.q.c(rVar2, 0);
                q0 q0Var = new q0(0L, "0", "0");
                List a10 = qVar.a();
                if (a10 != null) {
                    obj.f145c = new m0(new k9.n0(unmodifiableList, c3, null, q0Var, a10), null, null, bool2, b10, a2, i10);
                    obj.d = qVar.b(i10);
                    l0 h = obj.h();
                    s3 s3Var = (s3) this.e;
                    ((n9.a) this.f144b).d(d(b(h, (e) this.d, s3Var), s3Var), str, equals);
                    return;
                }
                throw new NullPointerException("Null binaries");
            }
            throw new NullPointerException("Null frames");
        }
        throw new NullPointerException("Null name");
    }

    public void u(String str, String... strArr) {
        Bundle bundle = (Bundle) this.f143a;
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
                    j7.d0.a(sb.toString());
                } else {
                    int i12 = 20000;
                    if (str2.length() > 20000) {
                        StringBuilder sb2 = new StringBuilder(53);
                        sb2.append("String at ");
                        sb2.append(i11);
                        sb2.append(" is too long, truncating string.");
                        j7.d0.a(sb2.toString());
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
                    j7.d0.a("Input Array of elements is too big, cutting off.");
                    objArr = Arrays.copyOf(objArr, 100);
                }
                bundle.putStringArray(str, (String[]) objArr);
                return;
            }
            return;
        }
        j7.d0.a("String array is empty and is ignored by put method.");
    }

    public Task v(Executor executor, String str) {
        boolean z4;
        TaskCompletionSource taskCompletionSource;
        String str2;
        ArrayList b10 = ((n9.a) this.f144b).b();
        ArrayList arrayList = new ArrayList();
        int size = b10.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            File file = (File) b10.get(i10);
            try {
                l9.a aVar = n9.a.f14856g;
                String e = n9.a.e(file);
                aVar.getClass();
                arrayList.add(new i9.b(l9.a.i(e), file.getName(), file));
            } catch (IOException e6) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e6);
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
            if (str == null || str.equals(bVar.f7375b)) {
                o9.a aVar2 = (o9.a) this.f145c;
                if (bVar.f7374a.f10070f == null) {
                    try {
                        str2 = (String) y.a(((ca.c) ((i9.w) this.f146f).d).d());
                    } catch (Exception e10) {
                        Log.w("FirebaseCrashlytics", "Failed to retrieve Firebase Installation ID.", e10);
                        str2 = null;
                    }
                    f8 a2 = bVar.f7374a.a();
                    a2.d = str2;
                    bVar = new i9.b(a2.a(), bVar.f7375b, bVar.f7376c);
                }
                if (str != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                o9.c cVar = aVar2.f16504a;
                synchronized (cVar.f16511f) {
                    try {
                        taskCompletionSource = new TaskCompletionSource();
                        if (z4) {
                            ((AtomicInteger) cVar.f16513i.f6012b).getAndIncrement();
                            if (cVar.f16511f.size() < cVar.e) {
                                f9.b bVar2 = f9.b.f6106a;
                                bVar2.b("Enqueueing report: " + bVar.f7375b);
                                bVar2.b("Queue size: " + cVar.f16511f.size());
                                cVar.f16512g.execute(new com.google.android.gms.common.api.internal.s1(cVar, bVar, taskCompletionSource, 7));
                                bVar2.b("Closing task for report: " + bVar.f7375b);
                                taskCompletionSource.trySetResult(bVar);
                            } else {
                                cVar.a();
                                String str3 = "Dropping report due to queue being full: " + bVar.f7375b;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str3, null);
                                }
                                ((AtomicInteger) cVar.f16513i.f6013c).getAndIncrement();
                                taskCompletionSource.trySetResult(bVar);
                            }
                        } else {
                            cVar.b(bVar, taskCompletionSource);
                        }
                    } finally {
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new f0.d(this)));
            }
            i12 = i13;
        }
        return Tasks.whenAll(arrayList2);
    }

    public void w(float f10, float f11, float f12, float f13) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f10, f11, f12, f13);
        RectF rectF2 = (RectF) this.d;
        if (rectF2.top == rectF.top && rectF2.bottom == rectF.bottom && rectF2.left == rectF.left && rectF2.right == rectF.right) {
            return;
        }
        rectF2.set(rectF);
        D();
    }

    @Override
    public ColorFilter x() {
        return j6.f20222v3;
    }

    @Override
    public int x0(int i10) {
        return ((o4) this.f146f).f4362z0.get(i10, j6.w0(null, i10, false));
    }

    public void y(java.lang.String r2, java.lang.String r3, android.os.Bundle r4) {
        throw new UnsupportedOperationException("Method not decompiled: a9.a.y(java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    public void z(float f10, float f11, float f12, float f13) {
        Matrix matrix = (Matrix) this.f146f;
        matrix.reset();
        Bitmap bitmap = (Bitmap) this.f145c;
        matrix.postRotate(f13, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        matrix.postScale(f12, f12);
        matrix.postTranslate(f10, f11);
        ((BitmapShader) this.e).setLocalMatrix(matrix);
    }

    public a(int i10, int i11) {
        Paint paint = new Paint(1);
        this.f143a = paint;
        this.d = new RectF();
        this.f146f = new Matrix();
        Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, i10), Math.max(1, i11), Bitmap.Config.ARGB_8888);
        this.f145c = createBitmap;
        this.f144b = new Canvas(createBitmap);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
        this.e = bitmapShader;
        paint.setShader(bitmapShader);
        D();
    }

    @Override
    public void K0(int i10, int i11) {
    }
}
