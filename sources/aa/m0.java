package aa;

import a8.ff;
import a8.kc;
import a8.ng;
import a8.vf;
import a8.yb;
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
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import j$.util.DesugarCollections;
import j$.util.Objects;
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
import java.util.concurrent.atomic.AtomicReference;
import m.b3;
import m.m2;
import m.r3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.bz0;
import org.telegram.ui.LaunchActivity;
public final class m0 {
    public Object f1150a;
    public Object f1151b;
    public Object f1152c;
    public Object d;
    public Object e;
    public Object f1153f;

    public m0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.f1150a = obj;
        this.f1151b = obj2;
        this.f1152c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f1153f = obj6;
    }

    public static n0 a(n0 n0Var, z9.e eVar, r3 r3Var) {
        String str;
        m0 a2 = n0Var.a();
        String y3 = ((z9.c) eVar.f52818b).y();
        if (y3 != null) {
            a2.e = new x0(y3);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        List q5 = q(((z9.d) ((AtomicMarkableReference) ((c2.b) r3Var.d).f5930b).getReference()).a());
        List q9 = q(((z9.d) ((AtomicMarkableReference) ((c2.b) r3Var.e).f5930b).getReference()).a());
        if (!q5.isEmpty() || !q9.isEmpty()) {
            o0 o0Var = (o0) n0Var.f1160c;
            u1 u1Var = o0Var.f1165a;
            Boolean bool = o0Var.d;
            v1 v1Var = o0Var.e;
            List list = o0Var.f1168f;
            int i10 = o0Var.f1169g;
            if (u1Var == null) {
                str = " execution";
            } else {
                str = "";
            }
            if (str.isEmpty()) {
                a2.f1152c = new o0(u1Var, q5, q9, bool, v1Var, list, i10);
            } else {
                throw new IllegalStateException("Missing required properties:".concat(str));
            }
        }
        return a2.f();
    }

    public static c2 c(n0 n0Var, r3 r3Var) {
        List l4 = ((d5.z) r3Var.f17847f).l();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < l4.size(); i10++) {
            z9.l lVar = (z9.l) l4.get(i10);
            lVar.getClass();
            ?? obj = new Object();
            z9.b bVar = (z9.b) lVar;
            String str = bVar.e;
            if (str != null) {
                String str2 = bVar.f52810b;
                if (str2 != null) {
                    obj.f7758b = new z0(str2, str);
                    String str3 = bVar.f52811c;
                    if (str3 != null) {
                        obj.f7757a = str3;
                        String str4 = bVar.d;
                        if (str4 != null) {
                            obj.f7759c = str4;
                            obj.d = Long.valueOf(bVar.f52812f);
                            arrayList.add(obj.e());
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
            return n0Var;
        }
        m0 a2 = n0Var.a();
        a2.f1153f = new a1(arrayList);
        return a2.f();
    }

    public static boolean e(int i10, int[] iArr) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static m0 j(Context context, y9.v vVar, da.c cVar, y9.a aVar, z9.e eVar, r3 r3Var, rf.b bVar, b0 b0Var, y9.l lVar, y9.j jVar) {
        y9.q qVar = new y9.q(context, vVar, aVar, bVar, b0Var);
        da.b bVar2 = new da.b(cVar, b0Var, jVar);
        ba.a aVar2 = ea.a.f9859b;
        m5.t.b(context);
        return new m0(qVar, bVar2, new ea.a(new ea.c(m5.t.a().c(new k5.a(ea.a.f9860c, ea.a.d)).a("FIREBASE_CRASHLYTICS_REPORT", new j5.c("json"), ea.a.e), b0Var.d(), lVar)), eVar, r3Var, vVar);
    }

    public static ColorStateList k(Context context, int i10) {
        int c10 = b3.c(context, 2130968728);
        return new ColorStateList(new int[][]{b3.f17681b, b3.d, b3.f17682c, b3.f17683f}, new int[]{b3.b(context, 2130968726), i0.a.k(c10, i10), i0.a.k(c10, i10), i10});
    }

    public static u2.g0 n(b2.g1 g1Var, f9.i0 i0Var, u2.g0 g0Var, b2.m1 m1Var) {
        Object l4;
        int i10;
        b2.p1 y02 = g1Var.y0();
        int A = g1Var.A();
        if (y02.p()) {
            l4 = null;
        } else {
            l4 = y02.l(A);
        }
        if (!g1Var.n() && !y02.p()) {
            i10 = y02.f(A, m1Var, false).b(e2.n0.S(g1Var.M0()) - m1Var.e);
        } else {
            i10 = -1;
        }
        int i11 = i10;
        for (int i12 = 0; i12 < i0Var.size(); i12++) {
            u2.g0 g0Var2 = (u2.g0) i0Var.get(i12);
            if (s(g0Var2, l4, g1Var.n(), g1Var.m0(), g1Var.N(), i11)) {
                return g0Var2;
            }
        }
        if (!i0Var.isEmpty() || g0Var == null || !s(g0Var, l4, g1Var.n(), g1Var.m0(), g1Var.N(), i11)) {
            return null;
        }
        return g0Var;
    }

    public static LayerDrawable p(m2 m2Var, Context context, int i10) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
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

    public static List q(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                String str2 = (String) entry.getValue();
                if (str2 != null) {
                    arrayList.add(new e0(str, str2));
                } else {
                    throw new NullPointerException("Null value");
                }
            } else {
                throw new NullPointerException("Null key");
            }
        }
        Collections.sort(arrayList, new y2.p(2));
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static boolean s(u2.g0 g0Var, Object obj, boolean z10, int i10, int i11, int i12) {
        Object obj2 = g0Var.f49294a;
        int i13 = g0Var.f49295b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (!z10 || i13 != i10 || g0Var.f49296c != i11) {
            if (z10 || i13 != -1 || g0Var.e != i12) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static void z(Drawable drawable, int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter h;
        int[] iArr = m.l1.f17762a;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = m.q.f17819b;
        }
        PorterDuff.Mode mode2 = m.q.f17819b;
        synchronized (m.q.class) {
            h = m2.h(i10, mode);
        }
        mutate.setColorFilter(h);
    }

    public Task A(String str, String str2, Bundle bundle) {
        int i10;
        try {
            x(str, str2, bundle);
            k6.a aVar = (k6.a) this.f1152c;
            k6.n nVar = k6.n.f16426a;
            b4.d dVar = aVar.f16400c;
            if (dVar.f() < 12000000) {
                if (dVar.g() != 0) {
                    return aVar.a(bundle).continueWithTask(nVar, new rf.b(28, aVar, bundle));
                }
                return Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            k6.m j10 = k6.m.j(aVar.f16399b);
            synchronized (j10) {
                i10 = j10.f16423a;
                j10.f16423a = i10 + 1;
            }
            return j10.k(new k6.l(i10, 1, bundle, 1)).continueWith(nVar, k6.b.f16403a);
        } catch (InterruptedException | ExecutionException e) {
            return Tasks.forException(e);
        }
    }

    public void B(boolean z10) {
        ArrayList arrayList = (ArrayList) this.f1152c;
        ArrayList arrayList2 = (ArrayList) this.f1151b;
        ArrayList arrayList3 = (ArrayList) this.f1150a;
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            ((ValueAnimator) arrayList3.get(i10)).cancel();
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) ((ArrayList) this.d).get(i10)).floatValue(), 0.0f);
                ofFloat.addUpdateListener(new bz0(this, i10, 0));
                ofFloat.setDuration(100L);
                ofFloat.start();
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            ((ValueAnimator) arrayList2.get(i11)).cancel();
            if (z10) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(((Float) ((ArrayList) this.e).get(i11)).floatValue(), 0.0f);
                ofFloat2.addUpdateListener(new bz0(this, i11, 1));
                ofFloat2.setDuration(100L);
                ofFloat2.start();
            }
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            ((ValueAnimator) arrayList.get(i12)).cancel();
            if (z10) {
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(((Float) ((ArrayList) this.f1153f).get(i12)).floatValue(), 0.0f);
                ofFloat3.addUpdateListener(new bz0(this, i12, 2));
                ofFloat3.setDuration(100L);
                ofFloat3.start();
            }
        }
        arrayList.clear();
        arrayList2.clear();
        arrayList3.clear();
    }

    public void C() {
        Bitmap bitmap = (Bitmap) this.f1152c;
        RectF rectF = (RectF) this.d;
        Matrix matrix = (Matrix) this.f1153f;
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

    public void D(b2.p1 p1Var) {
        ng ngVar = new ng(4, 7);
        if (((f9.i0) this.f1151b).isEmpty()) {
            d(ngVar, (u2.g0) this.e, p1Var);
            if (!Objects.equals((u2.g0) this.f1153f, (u2.g0) this.e)) {
                d(ngVar, (u2.g0) this.f1153f, p1Var);
            }
            if (!Objects.equals((u2.g0) this.d, (u2.g0) this.e) && !Objects.equals((u2.g0) this.d, (u2.g0) this.f1153f)) {
                d(ngVar, (u2.g0) this.d, p1Var);
            }
        } else {
            for (int i10 = 0; i10 < ((f9.i0) this.f1151b).size(); i10++) {
                d(ngVar, (u2.g0) ((f9.i0) this.f1151b).get(i10), p1Var);
            }
            if (!((f9.i0) this.f1151b).contains((u2.g0) this.d)) {
                d(ngVar, (u2.g0) this.d, p1Var);
            }
        }
        this.f1152c = ngVar.c(true);
    }

    public void E() {
        String str;
        boolean z10;
        boolean z11;
        sf.d dVar = (sf.d) this.e;
        sf.d dVar2 = null;
        for (sf.d dVar3 : ((HashMap) this.f1150a).values()) {
            if (dVar3.f48134m || dVar3.f48126b.f49719a != 0) {
                if (dVar2 == null || dVar3.d > dVar2.d) {
                    dVar2 = dVar3;
                }
            }
        }
        if (dVar != dVar2) {
            this.e = dVar2;
            StringBuilder sb2 = new StringBuilder("onMaxPrioritySourceChanged ");
            if (dVar2 != null) {
                str = dVar2.f48127c;
            } else {
                str = null;
            }
            sb2.append(str);
            Log.i("PIP_DEBUG", sb2.toString());
            LaunchActivity launchActivity = (LaunchActivity) this.d;
            if (Build.VERSION.SDK_INT >= 26) {
                if (dVar2 != null) {
                    AndroidUtilities.setPictureInPictureParams(launchActivity, dVar2.a());
                } else {
                    AndroidUtilities.resetPictureInPictureParams(launchActivity);
                }
            }
            if (dVar != null && dVar.f48128f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (dVar2 != null && dVar2.f48128f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 != z11) {
                m4.y yVar = (m4.y) this.f1153f;
                if (yVar != null) {
                    try {
                        synchronized (m4.y.f18299b) {
                            m4.y.f18300c.remove(yVar.f18301a.f18046i);
                        }
                        yVar.f18301a.r();
                    } catch (Exception unused) {
                    }
                    this.f1153f = null;
                }
                if (dVar2 != null) {
                    m4.s sVar = new m4.s((LaunchActivity) this.d, dVar2.f48133l);
                    sVar.f18220c = "pip-media-session";
                    yb.p(!sVar.f18227m);
                    sVar.f18227m = true;
                    Context context = sVar.f18218a;
                    Object obj = m4.y.f18299b;
                    int intValue = ((Integer) m4.f0.C.get()).intValue();
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 < 27) {
                        intValue = Math.max(intValue, (int) TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()));
                    }
                    e2.d dVar4 = sVar.f18222g;
                    if (dVar4 == null) {
                        ?? obj2 = new Object();
                        obj2.f7972c = context;
                        obj2.f7970a = -1;
                        obj2.f7970a = intValue;
                        obj2.f7971b = true;
                        sVar.f18222g = new g2.i(obj2);
                    } else {
                        sVar.f18222g = new d5.z(dVar4, intValue, 6);
                    }
                    if (i10 == 29) {
                        e2.d dVar5 = sVar.f18222g;
                        AtomicReference atomicReference = m4.s.f18217n;
                        j9.a aVar = (j9.a) atomicReference.get();
                        if (aVar == null) {
                            Display defaultDisplay = ((WindowManager) context.getSystemService(WindowManager.class)).getDefaultDisplay();
                            Point point = new Point();
                            defaultDisplay.getSize(point);
                            Point point2 = new Point();
                            defaultDisplay.getRealSize(point2);
                            int i11 = point2.y;
                            int i12 = point2.x;
                            Point point3 = new Point(i11 - (i12 - point.x), i12 - (i11 - point.y));
                            j9.a aVar2 = new j9.a(new int[]{Math.max(point.x / 6, point.y / 6), Math.max(point3.x / 6, point3.y / 6)});
                            atomicReference.set(aVar2);
                            aVar = aVar2;
                        }
                        sVar.f18222g = new m4.w1(0, dVar5, aVar);
                    }
                    sVar.f18222g = new m4.c(sVar.f18222g, 0);
                    this.f1153f = new m4.y(sVar.f18218a, sVar.f18220c, sVar.f18219b, sVar.f18223i, sVar.f18224j, sVar.f18225k, sVar.d, sVar.e, sVar.f18221f, sVar.f18222g, sVar.h, sVar.f18226l);
                }
            }
            if (dVar != null) {
                uf.e eVar = dVar.f48126b;
                eVar.f49729n = false;
                eVar.h();
                sf.d dVar6 = eVar.f49725j;
                ((sf.b) dVar6.f48125a.f1151b).f48103a.remove(eVar);
                ((sf.b) dVar6.f48125a.f1151b).f48104b.remove(eVar);
                m0 m0Var = dVar6.f48125a;
                String str2 = dVar6.f48127c;
                HashMap hashMap = ((sf.b) m0Var.f1151b).f48105c;
                ArrayList arrayList = (ArrayList) hashMap.get(str2);
                if (arrayList != null) {
                    arrayList.remove((Object) null);
                    if (arrayList.isEmpty()) {
                        hashMap.remove(str2);
                    }
                }
            }
            if (dVar2 != null) {
                m4.y yVar2 = (m4.y) this.f1153f;
                if (yVar2 != null) {
                    b2.g1 g1Var = yVar2.f18301a.f18057t.f18169a;
                    i2.j0 j0Var = dVar2.f48133l;
                    if (g1Var != j0Var) {
                        yVar2.a(j0Var);
                    }
                }
                ((sf.a) this.f1152c).bringToFront();
                uf.e eVar2 = dVar2.f48126b;
                sf.d dVar7 = eVar2.f49725j;
                ((sf.b) dVar7.f48125a.f1151b).f48103a.add(eVar2);
                ((sf.b) dVar7.f48125a.f1151b).f48104b.add(eVar2);
                m0 m0Var2 = dVar7.f48125a;
                String str3 = dVar7.f48127c;
                HashMap hashMap2 = ((sf.b) m0Var2.f1151b).f48105c;
                ArrayList arrayList2 = (ArrayList) hashMap2.get(str3);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    hashMap2.put(str3, arrayList2);
                }
                arrayList2.add(null);
            } else if (dVar != null && AndroidUtilities.isInPictureInPictureMode((LaunchActivity) this.d)) {
                ((LaunchActivity) this.d).moveTaskToBack(false);
            }
            ((sf.a) this.f1152c).invalidate();
        }
    }

    public void b(String str, String str2) {
        HashMap hashMap = (HashMap) this.f1153f;
        if (hashMap != null) {
            hashMap.put(str, str2);
            return;
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }

    public void d(ng ngVar, u2.g0 g0Var, b2.p1 p1Var) {
        if (g0Var != null) {
            if (p1Var.b(g0Var.f49294a) != -1) {
                ngVar.w(g0Var, p1Var);
                return;
            }
            b2.p1 p1Var2 = (b2.p1) ((f9.x1) this.f1152c).get(g0Var);
            if (p1Var2 != null) {
                ngVar.w(g0Var, p1Var2);
            }
        }
    }

    public n0 f() {
        String str;
        if (((Long) this.f1150a) == null) {
            str = " timestamp";
        } else {
            str = "";
        }
        if (((String) this.f1151b) == null) {
            str = str.concat(" type");
        }
        if (((w1) this.f1152c) == null) {
            str = b10.u(str, " app");
        }
        if (((x1) this.d) == null) {
            str = b10.u(str, " device");
        }
        if (str.isEmpty()) {
            return new n0(((Long) this.f1150a).longValue(), (String) this.f1151b, (w1) this.f1152c, (x1) this.d, (y1) this.e, (b2) this.f1153f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public w0 g() {
        String str;
        if (((Integer) this.f1152c) == null) {
            str = " batteryVelocity";
        } else {
            str = "";
        }
        if (((Boolean) this.d) == null) {
            str = str.concat(" proximityOn");
        }
        if (((Integer) this.e) == null) {
            str = b10.u(str, " orientation");
        }
        if (((Long) this.f1150a) == null) {
            str = b10.u(str, " ramUsed");
        }
        if (((Long) this.f1153f) == null) {
            str = b10.u(str, " diskUsed");
        }
        if (str.isEmpty()) {
            return new w0((Double) this.f1151b, ((Integer) this.f1152c).intValue(), ((Boolean) this.d).booleanValue(), ((Integer) this.e).intValue(), ((Long) this.f1150a).longValue(), ((Long) this.f1153f).longValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public m5.h h() {
        String str;
        if (((String) this.f1151b) == null) {
            str = " transportName";
        } else {
            str = "";
        }
        if (((m5.m) this.d) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.f1150a) == null) {
            str = b10.u(str, " eventMillis");
        }
        if (((Long) this.e) == null) {
            str = b10.u(str, " uptimeMillis");
        }
        if (((HashMap) this.f1153f) == null) {
            str = b10.u(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new m5.h((String) this.f1151b, (Integer) this.f1152c, (m5.m) this.d, ((Long) this.f1150a).longValue(), ((Long) this.e).longValue(), (HashMap) this.f1153f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public r9.b i() {
        String str;
        String str2;
        o6.l.i((String) this.f1153f, "setActionToken is required before calling build().");
        new String((String) this.e);
        u("actionToken", (String) this.f1153f);
        String str3 = (String) this.f1152c;
        String str4 = null;
        if (str3 == null) {
            str = null;
        } else {
            str = new String(str3);
        }
        if (str == null) {
            this.f1152c = "AssistAction";
            u("name", "AssistAction");
        }
        String str5 = (String) this.d;
        if (str5 != null) {
            str4 = new String(str5);
        }
        if (str4 == null) {
            String valueOf = String.valueOf((String) this.f1153f);
            if (valueOf.length() != 0) {
                str2 = "https://developers.google.com/actions?invocation=".concat(valueOf);
            } else {
                str2 = new String("https://developers.google.com/actions?invocation=");
            }
            o6.l.h(str2);
            this.d = str2;
            u("url", str2);
        }
        o6.l.i((String) this.f1152c, "setObject is required before calling build().");
        o6.l.i((String) this.d, "setObject is required before calling build().");
        return new r9.b((String) this.f1151b, (String) this.f1152c, (String) this.d, null, new r9.a(), (String) this.e, (Bundle) this.f1150a);
    }

    public void l(sf.d dVar) {
        if (((sf.d) this.e) == dVar) {
            LaunchActivity launchActivity = (LaunchActivity) this.d;
            if (Build.VERSION.SDK_INT >= 26) {
                if (dVar != null) {
                    AndroidUtilities.setPictureInPictureParams(launchActivity, dVar.a());
                } else {
                    AndroidUtilities.resetPictureInPictureParams(launchActivity);
                }
            }
            m4.y yVar = (m4.y) this.f1153f;
            if (yVar != null) {
                b2.g1 g1Var = yVar.f18301a.f18057t.f18169a;
                i2.j0 j0Var = dVar.f48133l;
                if (g1Var != j0Var) {
                    yVar.a(j0Var);
                }
            }
        }
        ((sf.a) this.f1152c).invalidate();
    }

    public Task m(Task task) {
        return task.continueWith(new a3.b(2), new a1.c(this, 16));
    }

    public sf.a o() {
        if (((sf.a) this.f1152c) == null) {
            this.f1152c = new sf.a((LaunchActivity) this.d);
        }
        return (sf.a) this.f1152c;
    }

    public ColorStateList r(Context context, int i10) {
        if (i10 == 2131230803) {
            return kc.a(context, 2131099669);
        }
        if (i10 == 2131230849) {
            return kc.a(context, 2131099672);
        }
        if (i10 == 2131230848) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList d = b3.d(context, 2130968734);
            if (d != null && d.isStateful()) {
                int[] iArr3 = b3.f17681b;
                iArr[0] = iArr3;
                iArr2[0] = d.getColorForState(iArr3, 0);
                iArr[1] = b3.e;
                iArr2[1] = b3.c(context, 2130968727);
                iArr[2] = b3.f17683f;
                iArr2[2] = d.getDefaultColor();
            } else {
                iArr[0] = b3.f17681b;
                iArr2[0] = b3.b(context, 2130968734);
                iArr[1] = b3.e;
                iArr2[1] = b3.c(context, 2130968727);
                iArr[2] = b3.f17683f;
                iArr2[2] = b3.c(context, 2130968734);
            }
            return new ColorStateList(iArr, iArr2);
        } else if (i10 == 2131230791) {
            return k(context, b3.c(context, 2130968726));
        } else {
            if (i10 == 2131230785) {
                return k(context, 0);
            }
            if (i10 == 2131230790) {
                return k(context, b3.c(context, 2130968724));
            }
            if (i10 != 2131230844 && i10 != 2131230845) {
                if (e(i10, (int[]) this.f1151b)) {
                    return b3.d(context, 2130968729);
                }
                if (e(i10, (int[]) this.e)) {
                    return kc.a(context, 2131099668);
                }
                if (e(i10, (int[]) this.f1153f)) {
                    return kc.a(context, 2131099667);
                }
                if (i10 == 2131230841) {
                    return kc.a(context, 2131099670);
                }
                return null;
            }
            return kc.a(context, 2131099671);
        }
    }

    public void t(Throwable th2, Thread thread, String str, String str2, long j10, boolean z10) {
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        rf.b bVar;
        boolean z11;
        boolean equals = str2.equals("crash");
        y9.q qVar = (y9.q) this.f1150a;
        Context context = qVar.f52469a;
        int i10 = context.getResources().getConfiguration().orientation;
        rf.b bVar2 = qVar.d;
        Stack stack = new Stack();
        for (Throwable th3 = th2; th3 != null; th3 = th3.getCause()) {
            stack.push(th3);
        }
        Boolean bool = null;
        com.google.firebase.messaging.q qVar2 = null;
        while (!stack.isEmpty()) {
            Throwable th4 = (Throwable) stack.pop();
            qVar2 = new com.google.firebase.messaging.q(th4.getLocalizedMessage(), th4.getClass().getName(), bVar2.w(th4.getStackTrace()), qVar2);
        }
        ?? obj = new Object();
        obj.f1151b = str2;
        obj.f1150a = Long.valueOf(j10);
        v1 b10 = v9.c.f50098a.b(context);
        int i11 = ((v0) b10).f1215c;
        if (i11 > 0) {
            if (i11 != 100) {
                z11 = true;
            } else {
                z11 = false;
            }
            bool = Boolean.valueOf(z11);
        }
        Boolean bool2 = bool;
        ArrayList a2 = v9.c.a(context);
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) qVar2.f7759c;
        String name = thread.getName();
        if (name != null) {
            List d = y9.q.d(stackTraceElementArr, 4);
            if (d != null) {
                arrayList.add(new t0(name, 4, d));
                if (z10) {
                    Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = Thread.getAllStackTraces().entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry<Thread, StackTraceElement[]> next = it2.next();
                        Thread key = next.getKey();
                        if (!key.equals(thread)) {
                            StackTraceElement[] w10 = bVar2.w(next.getValue());
                            String name2 = key.getName();
                            if (name2 != null) {
                                it = it2;
                                List d10 = y9.q.d(w10, 0);
                                if (d10 != null) {
                                    bVar = bVar2;
                                    arrayList.add(new t0(name2, 0, d10));
                                } else {
                                    throw new NullPointerException("Null frames");
                                }
                            } else {
                                throw new NullPointerException("Null name");
                            }
                        } else {
                            it = it2;
                            bVar = bVar2;
                        }
                        it2 = it;
                        bVar2 = bVar;
                    }
                }
                List unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
                r0 c10 = y9.q.c(qVar2, 0);
                s0 s0Var = new s0(0L, "0", "0");
                List a10 = qVar.a();
                if (a10 != null) {
                    obj.f1152c = new o0(new p0(unmodifiableList, c10, null, s0Var, a10), null, null, bool2, b10, a2, i10);
                    obj.d = qVar.b(i10);
                    n0 f7 = obj.f();
                    r3 r3Var = (r3) this.e;
                    ((da.b) this.f1151b).d(c(a(f7, (z9.e) this.d, r3Var), r3Var), str, equals);
                    return;
                }
                throw new NullPointerException("Null binaries");
            }
            throw new NullPointerException("Null frames");
        }
        throw new NullPointerException("Null name");
    }

    public void u(String str, String... strArr) {
        Bundle bundle = (Bundle) this.f1150a;
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
                    vf.a(sb2.toString());
                } else {
                    int i12 = 20000;
                    if (str2.length() > 20000) {
                        StringBuilder sb3 = new StringBuilder(53);
                        sb3.append("String at ");
                        sb3.append(i11);
                        sb3.append(" is too long, truncating string.");
                        vf.a(sb3.toString());
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
                    vf.a("Input Array of elements is too big, cutting off.");
                    objArr = Arrays.copyOf(objArr, 100);
                }
                bundle.putStringArray(str, (String[]) objArr);
                return;
            }
            return;
        }
        vf.a("String array is empty and is ignored by put method.");
    }

    public Task v(Executor executor, String str) {
        boolean z10;
        TaskCompletionSource taskCompletionSource;
        String str2;
        ArrayList b10 = ((da.b) this.f1151b).b();
        ArrayList arrayList = new ArrayList();
        int size = b10.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            File file = (File) b10.get(i10);
            try {
                ba.a aVar = da.b.f8268g;
                String e = da.b.e(file);
                aVar.getClass();
                arrayList.add(new y9.b(ba.a.i(e), file.getName(), file));
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
            y9.b bVar = (y9.b) arrayList.get(i12);
            if (str == null || str.equals(bVar.f52413b)) {
                ea.a aVar2 = (ea.a) this.f1152c;
                if (bVar.f52412a.f1017f == null) {
                    try {
                        str2 = (String) y9.x.a(((sa.c) ((y9.v) this.f1153f).d).d());
                    } catch (Exception e11) {
                        Log.w("FirebaseCrashlytics", "Failed to retrieve Firebase Installation ID.", e11);
                        str2 = null;
                    }
                    ff a2 = bVar.f52412a.a();
                    a2.e = str2;
                    bVar = new y9.b(a2.a(), bVar.f52413b, bVar.f52414c);
                }
                if (str != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ea.c cVar = aVar2.f9861a;
                synchronized (cVar.f9868f) {
                    try {
                        taskCompletionSource = new TaskCompletionSource();
                        if (z10) {
                            ((AtomicInteger) cVar.f9870i.f52434a).getAndIncrement();
                            if (cVar.f9868f.size() < cVar.e) {
                                v9.b bVar2 = v9.b.f50097a;
                                bVar2.b("Enqueueing report: " + bVar.f52413b);
                                bVar2.b("Queue size: " + cVar.f9868f.size());
                                cVar.f9869g.execute(new com.google.android.gms.common.api.internal.q1(cVar, bVar, taskCompletionSource, 5));
                                bVar2.b("Closing task for report: " + bVar.f52413b);
                                taskCompletionSource.trySetResult(bVar);
                            } else {
                                cVar.a();
                                String str3 = "Dropping report due to queue being full: " + bVar.f52413b;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str3, null);
                                }
                                ((AtomicInteger) cVar.f9870i.f52435b).getAndIncrement();
                                taskCompletionSource.trySetResult(bVar);
                            }
                        } else {
                            cVar.b(bVar, taskCompletionSource);
                        }
                    } finally {
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new vg.d(this)));
            }
            i12 = i13;
        }
        return Tasks.whenAll(arrayList2);
    }

    public void w(float f7, float f10, float f11, float f12) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f7, f10, f11, f12);
        RectF rectF2 = (RectF) this.d;
        if (rectF2.top == rectF.top && rectF2.bottom == rectF.bottom && rectF2.left == rectF.left && rectF2.right == rectF.right) {
            return;
        }
        rectF2.set(rectF);
        C();
    }

    public void x(java.lang.String r2, java.lang.String r3, android.os.Bundle r4) {
        throw new UnsupportedOperationException("Method not decompiled: aa.m0.x(java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    public void y(float f7, float f10, float f11, float f12) {
        Matrix matrix = (Matrix) this.f1153f;
        matrix.reset();
        Bitmap bitmap = (Bitmap) this.f1152c;
        matrix.postRotate(f12, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        matrix.postScale(f11, f11);
        matrix.postTranslate(f7, f10);
        ((BitmapShader) this.e).setLocalMatrix(matrix);
    }

    public m0(int i10, int i11) {
        Paint paint = new Paint(1);
        this.f1150a = paint;
        this.d = new RectF();
        this.f1153f = new Matrix();
        Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, i10), Math.max(1, i11), Bitmap.Config.ARGB_8888);
        this.f1152c = createBitmap;
        this.f1151b = new Canvas(createBitmap);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
        this.e = bitmapShader;
        paint.setShader(bitmapShader);
        C();
    }

    public m0(int i10) {
        switch (i10) {
            case 6:
                Paint paint = new Paint(1);
                this.f1150a = paint;
                this.d = new RectF();
                this.f1153f = new Matrix();
                Bitmap createBitmap = Bitmap.createBitmap(30, 40, Bitmap.Config.ARGB_8888);
                this.f1152c = createBitmap;
                this.f1151b = new Canvas(createBitmap);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
                this.e = bitmapShader;
                paint.setShader(bitmapShader);
                C();
                return;
            case 7:
                this.f1150a = new ArrayList();
                this.f1151b = new ArrayList();
                this.f1152c = new ArrayList();
                this.d = new ArrayList();
                this.e = new ArrayList();
                this.f1153f = new ArrayList();
                return;
            case 8:
                this.f1150a = new Bundle();
                this.f1151b = "AssistAction";
                return;
            default:
                this.f1150a = new int[]{2131230859, 2131230857, 2131230783};
                this.f1151b = new int[]{2131230807, 2131230842, 2131230814, 2131230809, 2131230810, 2131230813, 2131230812};
                this.f1152c = new int[]{2131230856, 2131230858, 2131230800, 2131230852, 2131230853, 2131230854, 2131230855};
                this.d = new int[]{2131230832, 2131230798, 2131230831};
                this.e = new int[]{2131230850, 2131230860};
                this.f1153f = new int[]{2131230786, 2131230792, 2131230787, 2131230793};
                return;
        }
    }
}
