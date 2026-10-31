package j2;

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
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import b2.f1;
import b2.o1;
import c5.w;
import c5.x;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import e9.c2;
import e9.n0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j6.m;
import j6.n;
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
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import l5.s;
import m.a3;
import m.l1;
import m.m2;
import m.p3;
import m.q;
import m4.f0;
import m4.y;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.ld;
import org.telegram.messenger.ms;
import org.telegram.messenger.mz;
import org.telegram.messenger.w0;
import org.telegram.ui.Components.bx0;
import org.telegram.ui.LaunchActivity;
import th.m1;
import u2.g0;
import v7.a8;
import v7.r7;
import v7.t6;
import x7.g8;
import x9.v;
import z9.a2;
import z9.d0;
import z9.l0;
import z9.m0;
import z9.p0;
import z9.q0;
import z9.r0;
import z9.s1;
import z9.t0;
import z9.t1;
import z9.u0;
import z9.u1;
import z9.v0;
import z9.v1;
import z9.w1;
import z9.x0;
import z9.y0;
import z9.z1;
public class f {
    public Object f9347a;
    public Object f9348b;
    public Object f9349c;
    public Object d;
    public Object e;
    public Object f9350f;

    public f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.f9347a = obj;
        this.f9348b = obj2;
        this.f9349c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f9350f = obj6;
    }

    public static void A(Drawable drawable, int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter h;
        int[] iArr = l1.f12455a;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = q.f12522b;
        }
        PorterDuff.Mode mode2 = q.f12522b;
        synchronized (q.class) {
            h = m2.h(i10, mode);
        }
        mutate.setColorFilter(h);
    }

    public static l0 a(l0 l0Var, y9.e eVar, p3 p3Var) {
        String str;
        f a2 = l0Var.a();
        String e = ((y9.c) eVar.f54331b).e();
        if (e != null) {
            a2.e = new v0(e);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        List r10 = r(((y9.d) ((AtomicMarkableReference) ((ac.a) p3Var.d).f363b).getReference()).a());
        List r11 = r(((y9.d) ((AtomicMarkableReference) ((ac.a) p3Var.e).f363b).getReference()).a());
        if (!r10.isEmpty() || !r11.isEmpty()) {
            m0 m0Var = (m0) l0Var.f55338c;
            s1 s1Var = m0Var.f55344a;
            Boolean bool = m0Var.d;
            t1 t1Var = m0Var.e;
            List list = m0Var.f55347f;
            int i10 = m0Var.f55348g;
            if (s1Var == null) {
                str = " execution";
            } else {
                str = "";
            }
            if (str.isEmpty()) {
                a2.f9349c = new m0(s1Var, r10, r11, bool, t1Var, list, i10);
            } else {
                throw new IllegalStateException("Missing required properties:".concat(str));
            }
        }
        return a2.h();
    }

    public static a2 c(l0 l0Var, p3 p3Var) {
        List m10 = ((x) p3Var.f12521f).m();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < m10.size(); i10++) {
            y9.l lVar = (y9.l) m10.get(i10);
            lVar.getClass();
            ji.f fVar = new ji.f(17, false);
            y9.b bVar = (y9.b) lVar;
            String str = bVar.e;
            if (str != null) {
                String str2 = bVar.f54323b;
                if (str2 != null) {
                    fVar.f10441b = new x0(str2, str);
                    String str3 = bVar.f54324c;
                    if (str3 != null) {
                        fVar.f10442c = str3;
                        String str4 = bVar.d;
                        if (str4 != null) {
                            fVar.d = str4;
                            fVar.e = Long.valueOf(bVar.f54325f);
                            arrayList.add(fVar.e());
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
        f a2 = l0Var.a();
        a2.f9350f = new y0(arrayList);
        return a2.h();
    }

    public static boolean e(int[] iArr, int i10) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static f k(Context context, v vVar, ca.c cVar, x9.a aVar, y9.e eVar, p3 p3Var, n4.q qVar, ea.d dVar, g8 g8Var, x9.j jVar) {
        x9.q qVar2 = new x9.q(context, vVar, aVar, qVar, dVar);
        ca.b bVar = new ca.b(cVar, dVar, jVar);
        aa.b bVar2 = da.a.f5819b;
        s.b(context);
        return new f(qVar2, bVar, new da.a(new da.b(s.a().c(new j5.a(da.a.f5820c, da.a.d)).a("FIREBASE_CRASHLYTICS_REPORT", new i5.c("json"), da.a.e), dVar.d(), g8Var)), eVar, p3Var, vVar);
    }

    public static ColorStateList l(Context context, int i10) {
        int c10 = a3.c(context, 2130968728);
        return new ColorStateList(new int[][]{a3.f12372b, a3.d, a3.f12373c, a3.f12374f}, new int[]{a3.b(context, 2130968726), i0.b.k(c10, i10), i0.b.k(c10, i10), i10});
    }

    public static g0 o(f1 f1Var, n0 n0Var, g0 g0Var, b2.l1 l1Var) {
        Object l4;
        int i10;
        o1 y02 = f1Var.y0();
        int A = f1Var.A();
        if (y02.p()) {
            l4 = null;
        } else {
            l4 = y02.l(A);
        }
        if (!f1Var.n() && !y02.p()) {
            i10 = y02.f(A, l1Var, false).b(e2.l0.S(f1Var.M0()) - l1Var.e);
        } else {
            i10 = -1;
        }
        int i11 = i10;
        for (int i12 = 0; i12 < n0Var.size(); i12++) {
            g0 g0Var2 = (g0) n0Var.get(i12);
            if (t(g0Var2, l4, f1Var.n(), f1Var.l0(), f1Var.N(), i11)) {
                return g0Var2;
            }
        }
        if (!n0Var.isEmpty() || g0Var == null || !t(g0Var, l4, f1Var.n(), f1Var.l0(), f1Var.N(), i11)) {
            return null;
        }
        return g0Var;
    }

    public static LayerDrawable q(m2 m2Var, Context context, int i10) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
        Drawable g10 = m2Var.g(context, 2131230846);
        Drawable g11 = m2Var.g(context, 2131230847);
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

    public static List r(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                String str2 = (String) entry.getValue();
                if (str2 != null) {
                    arrayList.add(new d0(str, str2));
                } else {
                    throw new NullPointerException("Null value");
                }
            } else {
                throw new NullPointerException("Null key");
            }
        }
        Collections.sort(arrayList, new x2.e(6));
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static boolean t(g0 g0Var, Object obj, boolean z10, int i10, int i11, int i12) {
        Object obj2 = g0Var.f49875a;
        int i13 = g0Var.f49876b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (!z10 || i13 != i10 || g0Var.f49877c != i11) {
            if (z10 || i13 != -1 || g0Var.e != i12) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void B() {
        if (((LocationManager) this.f9348b) == null) {
            this.f9348b = (LocationManager) w0.f19025b.getSystemService("location");
        }
        try {
            ((LocationManager) this.f9348b).requestLocationUpdates("gps", 1L, 0.0f, (ld) this.f9349c);
        } catch (Exception e) {
            f8.g(e, true);
        }
        try {
            ((LocationManager) this.f9348b).requestLocationUpdates("network", 1L, 0.0f, (ld) this.d);
        } catch (Exception e7) {
            f8.g(e7, true);
        }
        try {
            Location lastKnownLocation = ((LocationManager) this.f9348b).getLastKnownLocation("gps");
            this.f9350f = lastKnownLocation;
            if (lastKnownLocation == null) {
                this.f9350f = ((LocationManager) this.f9348b).getLastKnownLocation("network");
            }
        } catch (Exception e10) {
            f8.g(e10, true);
        }
        ms msVar = (ms) this.e;
        if (msVar != null) {
            i0.r(msVar);
        }
        ms msVar2 = new ms(this, 15);
        this.e = msVar2;
        i0.h3(msVar2, 5000L);
    }

    public Task C(String str, String str2, Bundle bundle) {
        int i10;
        try {
            y(str, str2, bundle);
            j6.a aVar = (j6.a) this.f9349c;
            n nVar = n.f9701a;
            b4.d dVar = aVar.f9678c;
            if (dVar.h() < 12000000) {
                if (dVar.i() != 0) {
                    return aVar.a(bundle).continueWithTask(nVar, new hf.b(27, aVar, bundle));
                }
                return Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            m j10 = m.j(aVar.f9677b);
            synchronized (j10) {
                i10 = j10.f9698a;
                j10.f9698a = i10 + 1;
            }
            return j10.k(new j6.k(i10, 1, bundle, 1)).continueWith(nVar, j6.b.f9681a);
        } catch (InterruptedException | ExecutionException e) {
            return Tasks.forException(e);
        }
    }

    public void D() {
        if (((LocationManager) this.f9348b) == null) {
            return;
        }
        ms msVar = (ms) this.e;
        if (msVar != null) {
            i0.r(msVar);
        }
        j();
    }

    public void E(boolean z10) {
        ArrayList arrayList = (ArrayList) this.f9349c;
        ArrayList arrayList2 = (ArrayList) this.f9348b;
        ArrayList arrayList3 = (ArrayList) this.f9347a;
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            ((ValueAnimator) arrayList3.get(i10)).cancel();
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) ((ArrayList) this.d).get(i10)).floatValue(), 0.0f);
                ofFloat.addUpdateListener(new bx0(this, i10, 0));
                ofFloat.setDuration(100L);
                ofFloat.start();
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            ((ValueAnimator) arrayList2.get(i11)).cancel();
            if (z10) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(((Float) ((ArrayList) this.e).get(i11)).floatValue(), 0.0f);
                ofFloat2.addUpdateListener(new bx0(this, i11, 1));
                ofFloat2.setDuration(100L);
                ofFloat2.start();
            }
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            ((ValueAnimator) arrayList.get(i12)).cancel();
            if (z10) {
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(((Float) ((ArrayList) this.f9350f).get(i12)).floatValue(), 0.0f);
                ofFloat3.addUpdateListener(new bx0(this, i12, 2));
                ofFloat3.setDuration(100L);
                ofFloat3.start();
            }
        }
        arrayList.clear();
        arrayList2.clear();
        arrayList3.clear();
    }

    public void F() {
        Bitmap bitmap = (Bitmap) this.f9349c;
        RectF rectF = (RectF) this.d;
        Matrix matrix = (Matrix) this.f9350f;
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

    public void G(o1 o1Var) {
        a5.a aVar = new a5.a(4, 6);
        if (((n0) this.f9348b).isEmpty()) {
            d(aVar, (g0) this.e, o1Var);
            if (!Objects.equals((g0) this.f9350f, (g0) this.e)) {
                d(aVar, (g0) this.f9350f, o1Var);
            }
            if (!Objects.equals((g0) this.d, (g0) this.e) && !Objects.equals((g0) this.d, (g0) this.f9350f)) {
                d(aVar, (g0) this.d, o1Var);
            }
        } else {
            for (int i10 = 0; i10 < ((n0) this.f9348b).size(); i10++) {
                d(aVar, (g0) ((n0) this.f9348b).get(i10), o1Var);
            }
            if (!((n0) this.f9348b).contains((g0) this.d)) {
                d(aVar, (g0) this.d, o1Var);
            }
        }
        this.f9349c = aVar.d(true);
    }

    public void H() {
        String str;
        boolean z10;
        boolean z11;
        jf.f fVar = (jf.f) this.e;
        jf.f fVar2 = null;
        for (jf.f fVar3 : ((HashMap) this.f9347a).values()) {
            if (fVar3.f9871m || fVar3.f9863b.f11817a != 0) {
                if (fVar2 == null || fVar3.d > fVar2.d) {
                    fVar2 = fVar3;
                }
            }
        }
        if (fVar != fVar2) {
            this.e = fVar2;
            StringBuilder sb2 = new StringBuilder("onMaxPrioritySourceChanged ");
            if (fVar2 != null) {
                str = fVar2.f9864c;
            } else {
                str = null;
            }
            sb2.append(str);
            Log.i("PIP_DEBUG", sb2.toString());
            LaunchActivity launchActivity = (LaunchActivity) this.d;
            if (Build.VERSION.SDK_INT >= 26) {
                if (fVar2 != null) {
                    i0.v3(launchActivity, fVar2.a());
                } else {
                    i0.b3(launchActivity);
                }
            }
            if (fVar != null && fVar.f9865f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (fVar2 != null && fVar2.f9865f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 != z11) {
                y yVar = (y) this.f9350f;
                if (yVar != null) {
                    try {
                        synchronized (y.f12992b) {
                            y.f12993c.remove(yVar.f12994a.f12743i);
                        }
                        yVar.f12994a.r();
                    } catch (Exception unused) {
                    }
                    this.f9350f = null;
                }
                if (fVar2 != null) {
                    m4.s sVar = new m4.s((LaunchActivity) this.d, fVar2.f9870l);
                    sVar.f12917c = "pip-media-session";
                    t6.p(!sVar.f12924m);
                    sVar.f12924m = true;
                    Context context = sVar.f12915a;
                    Object obj = y.f12992b;
                    int intValue = ((Integer) f0.C.get()).intValue();
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 < 27) {
                        intValue = Math.max(intValue, (int) TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()));
                    }
                    e2.d dVar = sVar.f12919g;
                    if (dVar == null) {
                        ?? obj2 = new Object();
                        obj2.f3777c = context;
                        obj2.f3775a = -1;
                        obj2.f3775a = intValue;
                        obj2.f3776b = true;
                        sVar.f12919g = new g2.j(obj2);
                    } else {
                        sVar.f12919g = new x(dVar, intValue, 10);
                    }
                    if (i10 == 29) {
                        e2.d dVar2 = sVar.f12919g;
                        AtomicReference atomicReference = m4.s.f12914n;
                        i9.a aVar = (i9.a) atomicReference.get();
                        if (aVar == null) {
                            Display defaultDisplay = ((WindowManager) context.getSystemService(WindowManager.class)).getDefaultDisplay();
                            Point point = new Point();
                            defaultDisplay.getSize(point);
                            Point point2 = new Point();
                            defaultDisplay.getRealSize(point2);
                            int i11 = point2.y;
                            int i12 = point2.x;
                            Point point3 = new Point(i11 - (i12 - point.x), i12 - (i11 - point.y));
                            i9.a aVar2 = new i9.a(new int[]{Math.max(point.x / 6, point.y / 6), Math.max(point3.x / 6, point3.y / 6)});
                            atomicReference.set(aVar2);
                            aVar = aVar2;
                        }
                        sVar.f12919g = new n4.q(dVar2, aVar);
                    }
                    sVar.f12919g = new m4.c(sVar.f12919g, 0);
                    this.f9350f = new y(sVar.f12915a, sVar.f12917c, sVar.f12916b, sVar.f12920i, sVar.f12921j, sVar.f12922k, sVar.d, sVar.e, sVar.f12918f, sVar.f12919g, sVar.h, sVar.f12923l);
                }
            }
            if (fVar != null) {
                lf.e eVar = fVar.f9863b;
                eVar.f11827n = false;
                eVar.h();
                jf.f fVar4 = eVar.f11823j;
                ((jf.c) fVar4.f9862a.f9348b).f9838a.remove(eVar);
                ((jf.c) fVar4.f9862a.f9348b).f9839b.remove(eVar);
                f fVar5 = fVar4.f9862a;
                String str2 = fVar4.f9864c;
                HashMap hashMap = ((jf.c) fVar5.f9348b).f9840c;
                ArrayList arrayList = (ArrayList) hashMap.get(str2);
                if (arrayList != null) {
                    arrayList.remove((Object) null);
                    if (arrayList.isEmpty()) {
                        hashMap.remove(str2);
                    }
                }
            }
            if (fVar2 != null) {
                y yVar2 = (y) this.f9350f;
                if (yVar2 != null) {
                    f1 f1Var = yVar2.f12994a.f12754t.f12866a;
                    i2.i0 i0Var = fVar2.f9870l;
                    if (f1Var != i0Var) {
                        yVar2.a(i0Var);
                    }
                }
                ((jf.a) this.f9349c).bringToFront();
                lf.e eVar2 = fVar2.f9863b;
                jf.f fVar6 = eVar2.f11823j;
                ((jf.c) fVar6.f9862a.f9348b).f9838a.add(eVar2);
                ((jf.c) fVar6.f9862a.f9348b).f9839b.add(eVar2);
                f fVar7 = fVar6.f9862a;
                String str3 = fVar6.f9864c;
                HashMap hashMap2 = ((jf.c) fVar7.f9348b).f9840c;
                ArrayList arrayList2 = (ArrayList) hashMap2.get(str3);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    hashMap2.put(str3, arrayList2);
                }
                arrayList2.add(null);
            } else if (fVar != null && i0.H1((LaunchActivity) this.d)) {
                ((LaunchActivity) this.d).moveTaskToBack(false);
            }
            ((jf.a) this.f9349c).invalidate();
        }
    }

    public void b(String str, String str2) {
        HashMap hashMap = (HashMap) this.f9350f;
        if (hashMap != null) {
            hashMap.put(str, str2);
            return;
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }

    public void d(a5.a aVar, g0 g0Var, o1 o1Var) {
        if (g0Var != null) {
            if (o1Var.b(g0Var.f49875a) != -1) {
                aVar.w(g0Var, o1Var);
                return;
            }
            o1 o1Var2 = (o1) ((c2) this.f9349c).get(g0Var);
            if (o1Var2 != null) {
                aVar.w(g0Var, o1Var2);
            }
        }
    }

    public l5.h f() {
        String str;
        if (((String) this.f9347a) == null) {
            str = " transportName";
        } else {
            str = "";
        }
        if (((l5.l) this.f9349c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.d) == null) {
            str = sc.e.A(str, " eventMillis");
        }
        if (((Long) this.e) == null) {
            str = sc.e.A(str, " uptimeMillis");
        }
        if (((HashMap) this.f9350f) == null) {
            str = sc.e.A(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new l5.h((String) this.f9347a, (Integer) this.f9348b, (l5.l) this.f9349c, ((Long) this.d).longValue(), ((Long) this.e).longValue(), (HashMap) this.f9350f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public q9.b g() {
        String str;
        String str2;
        n6.l.h((String) this.f9350f, "setActionToken is required before calling build().");
        new String((String) this.e);
        v("actionToken", (String) this.f9350f);
        String str3 = (String) this.f9349c;
        String str4 = null;
        if (str3 == null) {
            str = null;
        } else {
            str = new String(str3);
        }
        if (str == null) {
            this.f9349c = "AssistAction";
            v("name", "AssistAction");
        }
        String str5 = (String) this.d;
        if (str5 != null) {
            str4 = new String(str5);
        }
        if (str4 == null) {
            String valueOf = String.valueOf((String) this.f9350f);
            if (valueOf.length() != 0) {
                str2 = "https://developers.google.com/actions?invocation=".concat(valueOf);
            } else {
                str2 = new String("https://developers.google.com/actions?invocation=");
            }
            n6.l.g(str2);
            this.d = str2;
            v("url", str2);
        }
        n6.l.h((String) this.f9349c, "setObject is required before calling build().");
        n6.l.h((String) this.d, "setObject is required before calling build().");
        return new q9.b((String) this.f9348b, (String) this.f9349c, (String) this.d, null, new q9.a(), (String) this.e, (Bundle) this.f9347a);
    }

    public l0 h() {
        String str;
        if (((Long) this.f9347a) == null) {
            str = " timestamp";
        } else {
            str = "";
        }
        if (((String) this.f9348b) == null) {
            str = str.concat(" type");
        }
        if (((u1) this.f9349c) == null) {
            str = sc.e.A(str, " app");
        }
        if (((v1) this.d) == null) {
            str = sc.e.A(str, " device");
        }
        if (str.isEmpty()) {
            return new l0(((Long) this.f9347a).longValue(), (String) this.f9348b, (u1) this.f9349c, (v1) this.d, (w1) this.e, (z1) this.f9350f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public u0 i() {
        String str;
        if (((Integer) this.f9348b) == null) {
            str = " batteryVelocity";
        } else {
            str = "";
        }
        if (((Boolean) this.f9349c) == null) {
            str = str.concat(" proximityOn");
        }
        if (((Integer) this.d) == null) {
            str = sc.e.A(str, " orientation");
        }
        if (((Long) this.e) == null) {
            str = sc.e.A(str, " ramUsed");
        }
        if (((Long) this.f9350f) == null) {
            str = sc.e.A(str, " diskUsed");
        }
        if (str.isEmpty()) {
            return new u0((Double) this.f9347a, ((Integer) this.f9348b).intValue(), ((Boolean) this.f9349c).booleanValue(), ((Integer) this.d).intValue(), ((Long) this.e).longValue(), ((Long) this.f9350f).longValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void j() {
        ((LocationManager) this.f9348b).removeUpdates((ld) this.f9349c);
        ((LocationManager) this.f9348b).removeUpdates((ld) this.d);
        this.f9350f = null;
        this.e = null;
    }

    public void m(jf.f fVar) {
        if (((jf.f) this.e) == fVar) {
            LaunchActivity launchActivity = (LaunchActivity) this.d;
            if (Build.VERSION.SDK_INT >= 26) {
                if (fVar != null) {
                    i0.v3(launchActivity, fVar.a());
                } else {
                    i0.b3(launchActivity);
                }
            }
            y yVar = (y) this.f9350f;
            if (yVar != null) {
                f1 f1Var = yVar.f12994a.f12754t.f12866a;
                i2.i0 i0Var = fVar.f9870l;
                if (f1Var != i0Var) {
                    yVar.a(i0Var);
                }
            }
        }
        ((jf.a) this.f9349c).invalidate();
    }

    public Task n(Task task) {
        return task.continueWith(new a3.b(3), new wh.b(this, 4));
    }

    public jf.a p() {
        if (((jf.a) this.f9349c) == null) {
            this.f9349c = new jf.a((LaunchActivity) this.d);
        }
        return (jf.a) this.f9349c;
    }

    public ColorStateList s(Context context, int i10) {
        if (i10 == 2131230803) {
            return r7.a(context, 2131099669);
        }
        if (i10 == 2131230849) {
            return r7.a(context, 2131099672);
        }
        if (i10 == 2131230848) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList d = a3.d(context, 2130968734);
            if (d != null && d.isStateful()) {
                int[] iArr3 = a3.f12372b;
                iArr[0] = iArr3;
                iArr2[0] = d.getColorForState(iArr3, 0);
                iArr[1] = a3.e;
                iArr2[1] = a3.c(context, 2130968727);
                iArr[2] = a3.f12374f;
                iArr2[2] = d.getDefaultColor();
            } else {
                iArr[0] = a3.f12372b;
                iArr2[0] = a3.b(context, 2130968734);
                iArr[1] = a3.e;
                iArr2[1] = a3.c(context, 2130968727);
                iArr[2] = a3.f12374f;
                iArr2[2] = a3.c(context, 2130968734);
            }
            return new ColorStateList(iArr, iArr2);
        } else if (i10 == 2131230791) {
            return l(context, a3.c(context, 2130968726));
        } else {
            if (i10 == 2131230785) {
                return l(context, 0);
            }
            if (i10 == 2131230790) {
                return l(context, a3.c(context, 2130968724));
            }
            if (i10 != 2131230844 && i10 != 2131230845) {
                if (e((int[]) this.f9348b, i10)) {
                    return a3.d(context, 2130968729);
                }
                if (e((int[]) this.e, i10)) {
                    return r7.a(context, 2131099668);
                }
                if (e((int[]) this.f9350f, i10)) {
                    return r7.a(context, 2131099667);
                }
                if (i10 == 2131230841) {
                    return r7.a(context, 2131099670);
                }
                return null;
            }
            return r7.a(context, 2131099671);
        }
    }

    public void u(Throwable th2, Thread thread, String str, String str2, long j10, boolean z10) {
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        n4.q qVar;
        boolean z11;
        boolean equals = str2.equals("crash");
        x9.q qVar2 = (x9.q) this.f9347a;
        Context context = qVar2.f53498a;
        int i10 = context.getResources().getConfiguration().orientation;
        n4.q qVar3 = qVar2.d;
        Stack stack = new Stack();
        for (Throwable th3 = th2; th3 != null; th3 = th3.getCause()) {
            stack.push(th3);
        }
        Boolean bool = null;
        ji.f fVar = null;
        while (!stack.isEmpty()) {
            Throwable th4 = (Throwable) stack.pop();
            fVar = new ji.f(th4.getLocalizedMessage(), th4.getClass().getName(), qVar3.h0(th4.getStackTrace()), fVar, 4);
        }
        ji.f fVar2 = fVar;
        ?? obj = new Object();
        obj.f9348b = str2;
        obj.f9347a = Long.valueOf(j10);
        t1 b10 = u9.d.f50197a.b(context);
        int i11 = ((t0) b10).f55396c;
        if (i11 > 0) {
            if (i11 != 100) {
                z11 = true;
            } else {
                z11 = false;
            }
            bool = Boolean.valueOf(z11);
        }
        Boolean bool2 = bool;
        ArrayList a2 = u9.d.a(context);
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) fVar2.d;
        String name = thread.getName();
        if (name != null) {
            List d = x9.q.d(stackTraceElementArr, 4);
            if (d != null) {
                arrayList.add(new r0(name, 4, d));
                if (z10) {
                    Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = Thread.getAllStackTraces().entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry<Thread, StackTraceElement[]> next = it2.next();
                        Thread key = next.getKey();
                        if (!key.equals(thread)) {
                            StackTraceElement[] h02 = qVar3.h0(next.getValue());
                            String name2 = key.getName();
                            if (name2 != null) {
                                it = it2;
                                List d10 = x9.q.d(h02, 0);
                                if (d10 != null) {
                                    qVar = qVar3;
                                    arrayList.add(new r0(name2, 0, d10));
                                } else {
                                    throw new NullPointerException("Null frames");
                                }
                            } else {
                                throw new NullPointerException("Null name");
                            }
                        } else {
                            it = it2;
                            qVar = qVar3;
                        }
                        it2 = it;
                        qVar3 = qVar;
                    }
                }
                List unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
                p0 c10 = x9.q.c(fVar2, 0);
                q0 q0Var = new q0(0L, "0", "0");
                List a10 = qVar2.a();
                if (a10 != null) {
                    obj.f9349c = new m0(new z9.n0(unmodifiableList, c10, null, q0Var, a10), null, null, bool2, b10, a2, i10);
                    obj.d = qVar2.b(i10);
                    l0 h = obj.h();
                    p3 p3Var = (p3) this.e;
                    ((ca.b) this.f9348b).d(c(a(h, (y9.e) this.d, p3Var), p3Var), str, equals);
                    return;
                }
                throw new NullPointerException("Null binaries");
            }
            throw new NullPointerException("Null frames");
        }
        throw new NullPointerException("Null name");
    }

    public void v(String str, String... strArr) {
        Bundle bundle = (Bundle) this.f9347a;
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
                    w7.t6.a(sb2.toString());
                } else {
                    int i12 = 20000;
                    if (str2.length() > 20000) {
                        StringBuilder sb3 = new StringBuilder(53);
                        sb3.append("String at ");
                        sb3.append(i11);
                        sb3.append(" is too long, truncating string.");
                        w7.t6.a(sb3.toString());
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
                    w7.t6.a("Input Array of elements is too big, cutting off.");
                    objArr = Arrays.copyOf(objArr, 100);
                }
                bundle.putStringArray(str, (String[]) objArr);
                return;
            }
            return;
        }
        w7.t6.a("String array is empty and is ignored by put method.");
    }

    public Task w(Executor executor, String str) {
        x9.b bVar;
        boolean z10;
        ArrayBlockingQueue arrayBlockingQueue;
        TaskCompletionSource taskCompletionSource;
        String str2;
        ArrayList b10 = ((ca.b) this.f9348b).b();
        ArrayList arrayList = new ArrayList();
        int size = b10.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            File file = (File) b10.get(i10);
            try {
                aa.b bVar2 = ca.b.f4078g;
                String e = ca.b.e(file);
                bVar2.getClass();
                arrayList.add(new x9.b(aa.b.i(e), file.getName(), file));
            } catch (IOException e7) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e7);
                file.delete();
            }
            i10 = i11;
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            int i13 = i12 + 1;
            x9.b bVar3 = (x9.b) arrayList.get(i12);
            if (str == null || str.equals(bVar3.f53441b)) {
                da.a aVar = (da.a) this.f9349c;
                if (bVar3.f53440a.f55217f == null) {
                    try {
                        str2 = (String) x9.x.a(((ra.c) ((v) this.f9350f).d).d());
                    } catch (Exception e10) {
                        Log.w("FirebaseCrashlytics", "Failed to retrieve Firebase Installation ID.", e10);
                        str2 = null;
                    }
                    a8 a2 = bVar3.f53440a.a();
                    a2.d = str2;
                    bVar = new x9.b(a2.a(), bVar3.f53441b, bVar3.f53442c);
                } else {
                    bVar = bVar3;
                }
                if (str != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                da.b bVar4 = aVar.f5821a;
                ArrayBlockingQueue arrayBlockingQueue2 = bVar4.f5825f;
                synchronized (arrayBlockingQueue2) {
                    try {
                        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                        if (z10) {
                            ((AtomicInteger) bVar4.f5827i.f53164b).getAndIncrement();
                            if (bVar4.f5825f.size() < bVar4.e) {
                                u9.c cVar = u9.c.f50196a;
                                cVar.b("Enqueueing report: " + bVar.f53441b);
                                cVar.b("Queue size: " + bVar4.f5825f.size());
                                try {
                                    arrayBlockingQueue = arrayBlockingQueue2;
                                    try {
                                        taskCompletionSource = taskCompletionSource2;
                                        bVar4.f5826g.execute(new w(bVar4, bVar, taskCompletionSource2, false, 4));
                                        cVar.b("Closing task for report: " + bVar.f53441b);
                                        taskCompletionSource.trySetResult(bVar);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    arrayBlockingQueue = arrayBlockingQueue2;
                                    throw th;
                                }
                            } else {
                                taskCompletionSource = taskCompletionSource2;
                                bVar4.a();
                                String str3 = "Dropping report due to queue being full: " + bVar.f53441b;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str3, null);
                                }
                                ((AtomicInteger) bVar4.f5827i.f53165c).getAndIncrement();
                                taskCompletionSource.trySetResult(bVar);
                            }
                        } else {
                            taskCompletionSource = taskCompletionSource2;
                            bVar4.b(bVar, taskCompletionSource);
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        arrayBlockingQueue = arrayBlockingQueue2;
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new m1(this)));
            }
            i12 = i13;
        }
        return Tasks.whenAll(arrayList2);
    }

    public void x(float f7, float f10, float f11, float f12) {
        RectF rectF = i0.P;
        rectF.set(f7, f10, f11, f12);
        RectF rectF2 = (RectF) this.d;
        if (rectF2.top == rectF.top && rectF2.bottom == rectF.bottom && rectF2.left == rectF.left && rectF2.right == rectF.right) {
            return;
        }
        rectF2.set(rectF);
        F();
    }

    public void y(java.lang.String r2, java.lang.String r3, android.os.Bundle r4) {
        throw new UnsupportedOperationException("Method not decompiled: j2.f.y(java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    public void z(float f7, float f10, float f11, float f12) {
        Matrix matrix = (Matrix) this.f9350f;
        matrix.reset();
        Bitmap bitmap = (Bitmap) this.f9349c;
        matrix.postRotate(f12, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        matrix.postScale(f11, f11);
        matrix.postTranslate(f7, f10);
        ((BitmapShader) this.e).setLocalMatrix(matrix);
    }

    public f(int i10, int i11) {
        Paint paint = new Paint(1);
        this.f9347a = paint;
        this.d = new RectF();
        this.f9350f = new Matrix();
        Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, i10), Math.max(1, i11), Bitmap.Config.ARGB_8888);
        this.f9349c = createBitmap;
        this.f9348b = new Canvas(createBitmap);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
        this.e = bitmapShader;
        paint.setShader(bitmapShader);
        F();
    }

    public f(int i10) {
        switch (i10) {
            case 5:
                Paint paint = new Paint(1);
                this.f9347a = paint;
                this.d = new RectF();
                this.f9350f = new Matrix();
                Bitmap createBitmap = Bitmap.createBitmap(30, 40, Bitmap.Config.ARGB_8888);
                this.f9349c = createBitmap;
                this.f9348b = new Canvas(createBitmap);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
                this.e = bitmapShader;
                paint.setShader(bitmapShader);
                F();
                return;
            case 6:
                this.f9347a = new ArrayList();
                this.f9348b = new ArrayList();
                this.f9349c = new ArrayList();
                this.d = new ArrayList();
                this.e = new ArrayList();
                this.f9350f = new ArrayList();
                return;
            case 7:
                this.f9347a = new Bundle();
                this.f9348b = "AssistAction";
                return;
            default:
                this.f9347a = new int[]{2131230859, 2131230857, 2131230783};
                this.f9348b = new int[]{2131230807, 2131230842, 2131230814, 2131230809, 2131230810, 2131230813, 2131230812};
                this.f9349c = new int[]{2131230856, 2131230858, 2131230800, 2131230852, 2131230853, 2131230854, 2131230855};
                this.d = new int[]{2131230832, 2131230798, 2131230831};
                this.e = new int[]{2131230850, 2131230860};
                this.f9350f = new int[]{2131230786, 2131230792, 2131230787, 2131230793};
                return;
        }
    }

    public f(mz mzVar) {
        this.f9349c = new ld(this, 1);
        this.d = new ld(this, 1);
        this.f9347a = mzVar;
    }
}
