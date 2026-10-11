package n7;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import ci.pc;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import m.f3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.a2;
import org.telegram.ui.Cells.g3;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.fz0;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Components.m81;
import org.telegram.ui.Components.ng0;
import org.telegram.ui.Components.pa;
import org.telegram.ui.Components.qu;
import org.telegram.ui.Components.su;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.an0;
import org.telegram.ui.d31;
import org.telegram.ui.g7;
import org.telegram.ui.gv;
import org.telegram.ui.h5;
import org.telegram.ui.hv;
import org.telegram.ui.mn0;
import org.telegram.ui.q6;
import org.telegram.ui.sk0;
import org.telegram.ui.um0;
public class z0 implements d6, lp0, qu, pc, g7, an0, fh.a, me.d, com.google.android.gms.common.api.internal.s, n5.b, SuccessContinuation {
    public final int f16868a;
    public Object f16869b;
    public Object f16870c;

    public z0(int i10, byte b10) {
        this.f16868a = i10;
    }

    @Override
    public void A(float r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: n7.z0.A(float, int):void");
    }

    public c3.h0 D(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = (int[]) this.f16869b;
            if (i11 < iArr.length) {
                if (i10 == iArr[i11]) {
                    return ((u2.z0[]) this.f16870c)[i11];
                }
                i11++;
            } else {
                e2.a.e("BaseMediaChunkOutput", "Unmatched track of type: " + i10);
                return new c3.n();
            }
        }
    }

    @Override
    public Paint F(String str) {
        switch (this.f16868a) {
            case 1:
                return h6.T0(str);
            case 8:
                return h6.T0(str);
            default:
                d6 d6Var = (d6) this.f16870c;
                if (d6Var == null) {
                    return h6.T0(str);
                }
                return d6Var.F(str);
        }
    }

    @Override
    public void I0(int i10, int i11) {
        switch (this.f16868a) {
            case 1:
            case 8:
                return;
            default:
                d6 d6Var = (d6) this.f16870c;
                if (d6Var != null) {
                    d6Var.I0(i10, i11);
                    return;
                }
                return;
        }
    }

    @Override
    public void X(float f7, boolean z10) {
        ((TextView) this.f16869b).setText("Alpha " + h5.f38295e);
        h5.f38295e = f7;
        ((h5) this.f16870c).f38296b.M();
    }

    @Override
    public boolean a() {
        switch (this.f16868a) {
            case 1:
            case 8:
            default:
                return h6.I.q();
        }
    }

    @Override
    public int a1(int i10) {
        switch (this.f16868a) {
            case 1:
                return ((SparseIntArray) this.f16869b).get(i10);
            case 8:
                return x0(i10);
            default:
                d6 d6Var = (d6) this.f16870c;
                if (d6Var == null) {
                    return h6.x0(null, i10, false);
                }
                return d6Var.a1(i10);
        }
    }

    @Override
    public void accept(java.lang.Object r53, java.lang.Object r54) {
        throw new UnsupportedOperationException("Method not decompiled: n7.z0.accept(java.lang.Object, java.lang.Object):void");
    }

    @Override
    public void c(String str, String str2) {
        mn0 mn0Var = ((um0) this.f16870c).f42650a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            mn0Var.N1(true, str2, (sk0) this.f16869b, this, mn0Var.B1);
        } else {
            mn0Var.M1(true, false);
        }
    }

    @Override
    public int c0(int i10) {
        switch (this.f16868a) {
            case 1:
                return x0(i10);
            case 8:
                return x0(i10);
            default:
                d6 d6Var = (d6) this.f16870c;
                if (d6Var == null) {
                    return h6.x0(null, i10, false);
                }
                return d6Var.c0(i10);
        }
    }

    @Override
    public void dismiss() {
        ((hv) this.f16870c).dismiss();
    }

    @Override
    public Object mo27get() {
        ob.a aVar = new ob.a(24);
        na.d dVar = new na.d(24);
        Object mo27get = ((gd.a) this.f16869b).mo27get();
        gd.a aVar2 = (gd.a) this.f16870c;
        return new s5.g(aVar, dVar, s5.a.f47923f, (s5.i) mo27get, aVar2);
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public Drawable getDrawable(String str) {
        switch (this.f16868a) {
            case 1:
                return null;
            case 8:
                return null;
            default:
                d6 d6Var = (d6) this.f16870c;
                if (d6Var == null) {
                    return h6.P0(str);
                }
                return d6Var.getDrawable(str);
        }
    }

    @Override
    public void i() {
        ((su) this.f16869b).getText();
        ((g3) this.f16870c).b();
    }

    @Override
    public int i0() {
        return 0;
    }

    public ArrayList j() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        Context context = (Context) this.f16869b;
        Class cls = (Class) ((f3) this.f16870c).f15693b;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, cls), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        for (String str2 : arrayList) {
            arrayList2.add(new q9.c(str2, 0));
        }
        return arrayList2;
    }

    public View k(int i10, int i11, int i12, int i13) {
        int i14;
        s4.i1 i1Var = (s4.i1) this.f16870c;
        s4.j1 j1Var = (s4.j1) this.f16869b;
        int c10 = j1Var.c();
        int c02 = j1Var.c0();
        if (i11 > i10) {
            i14 = 1;
        } else {
            i14 = -1;
        }
        View view = null;
        while (i10 != i11) {
            View u02 = j1Var.u0(i10);
            int b10 = j1Var.b(u02);
            int w02 = j1Var.w0(u02);
            i1Var.f47805b = c10;
            i1Var.f47806c = c02;
            i1Var.d = b10;
            i1Var.f47807e = w02;
            if (i12 != 0) {
                i1Var.f47804a = i12;
                if (i1Var.a()) {
                    return u02;
                }
            }
            if (i13 != 0) {
                i1Var.f47804a = i13;
                if (i1Var.a()) {
                    view = u02;
                }
            }
            i10 += i14;
        }
        return view;
    }

    @Override
    public boolean k0() {
        switch (this.f16868a) {
            case 1:
                return false;
            case 8:
                return false;
            default:
                d6 d6Var = (d6) this.f16870c;
                if (d6Var == null) {
                    return h6.b1();
                }
                return d6Var.k0();
        }
    }

    @Override
    public ch.d l() {
        if (Build.VERSION.SDK_INT >= 29) {
            ch.e eVar = new ch.e(this);
            ((PhotoViewer) this.f16870c).Z.add(eVar);
            return eVar;
        }
        return new ch.f(this);
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        switch (this.f16868a) {
            case 1:
                h6.q(f7, f10, i10, i11);
                return;
            case 8:
                h6.q(f7, f10, i10, i11);
                return;
            default:
                d6 d6Var = (d6) this.f16870c;
                if (d6Var == null) {
                    h6.q(f7, f10, i10, i11);
                    return;
                } else {
                    d6Var.m(f7, f10, i10, i11);
                    return;
                }
        }
    }

    @Override
    public void n(int i10, float f7, float f10, me.e eVar) {
        ph.i iVar = (ph.i) this.f16870c;
        iVar.f45908c.a(f7);
        iVar.d.a(f7);
        iVar.f45907b.a(f7);
        ((Runnable) this.f16869b).run();
    }

    public boolean r(View view) {
        s4.i1 i1Var = (s4.i1) this.f16870c;
        s4.j1 j1Var = (s4.j1) this.f16869b;
        int c10 = j1Var.c();
        int c02 = j1Var.c0();
        int b10 = j1Var.b(view);
        int w02 = j1Var.w0(view);
        i1Var.f47805b = c10;
        i1Var.f47806c = c02;
        i1Var.d = b10;
        i1Var.f47807e = w02;
        i1Var.f47804a = 24579;
        return i1Var.a();
    }

    @Override
    public Task then(Object obj) {
        switch (this.f16868a) {
            case 21:
                da.b bVar = (da.b) obj;
                w9.m mVar = ((w9.k) this.f16870c).f50328e;
                if (bVar == null) {
                    Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
                    return Tasks.forResult(null);
                }
                return Tasks.whenAll(w9.m.b(mVar), mVar.f50342m.y((Executor) this.f16869b, null));
            default:
                return ((w9.m) this.f16870c).f50335e.l(new u4.f(1, this, (Boolean) obj));
        }
    }

    public String toString() {
        switch (this.f16868a) {
            case 13:
                return "Bounds{lower=" + ((i0.b) this.f16869b) + " upper=" + ((i0.b) this.f16870c) + "}";
            default:
                return super.toString();
        }
    }

    @Override
    public void v(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.save();
        canvas.clipRect(f7, f10, f11, f12);
        ((PhotoViewer) this.f16870c).T0(canvas, (pa) this.f16869b, -14277082, 855638016, false, true, true);
        canvas.drawColor(637534208);
        canvas.restore();
    }

    @Override
    public ColorFilter x() {
        switch (this.f16868a) {
            case 1:
                return h6.f21115v3;
            case 8:
                return h6.f21115v3;
            default:
                d6 d6Var = (d6) this.f16870c;
                if (d6Var == null) {
                    return h6.f21115v3;
                }
                return d6Var.x();
        }
    }

    @Override
    public int x0(int i10) {
        switch (this.f16868a) {
            case 1:
                SparseIntArray sparseIntArray = (SparseIntArray) this.f16869b;
                int indexOfKey = sparseIntArray.indexOfKey(i10);
                if (indexOfKey >= 0) {
                    return sparseIntArray.valueAt(indexOfKey);
                }
                return h6.x0(null, i10, false);
            case 8:
                SparseIntArray sparseIntArray2 = (SparseIntArray) this.f16869b;
                if (sparseIntArray2 != null) {
                    return sparseIntArray2.get(i10);
                }
                return h6.x0(null, i10, false);
            default:
                SparseIntArray sparseIntArray3 = (SparseIntArray) this.f16869b;
                int indexOfKey2 = sparseIntArray3.indexOfKey(i10);
                if (indexOfKey2 >= 0) {
                    return sparseIntArray3.valueAt(indexOfKey2);
                }
                d6 d6Var = (d6) this.f16870c;
                if (d6Var == null) {
                    return h6.x0(null, i10, false);
                }
                return d6Var.x0(i10);
        }
    }

    @Override
    public void y(float f7, boolean z10) {
        cd0 cd0Var = (cd0) this.f16869b;
        ng0 ng0Var = (ng0) this.f16870c;
        m81 m81Var = ng0Var.d;
        if (m81Var != null) {
            long p5 = m81Var.p();
            float max = 2.8f / ((float) Math.max(60L, p5));
            long j3 = (((f7 / (1.0f - max)) * max) + f7) * ((float) p5);
            ng0Var.f29052e = j3;
            ng0Var.d.L(j3, !z10);
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(cd0Var);
                AndroidUtilities.runOnUIThread(cd0Var, 120L);
            }
        }
    }

    @Override
    public void y0(q6 q6Var, zh.a aVar, boolean z10) {
        hv hvVar = (hv) this.f16870c;
        gv gvVar = hvVar.X;
        if (aVar != null) {
            ((zh.b) this.f16869b).i(aVar);
            hvVar.f38515e0.d();
            zh.b bVar = hvVar.f38517g0;
            fz0[] fz0VarArr = hvVar.f38512b0;
            a2[] a2VarArr = hvVar.f38513c0;
            a2 a2Var = a2VarArr[0];
            if (a2Var != null) {
                fz0 fz0Var = fz0VarArr[0];
                boolean z11 = bVar.f54797m;
                fz0Var.f26531c = z11;
                a2Var.c(z11, true);
            }
            a2 a2Var2 = a2VarArr[1];
            if (a2Var2 != null) {
                fz0 fz0Var2 = fz0VarArr[1];
                boolean z12 = bVar.f54798n;
                fz0Var2.f26531c = z12;
                a2Var2.c(z12, true);
            }
            a2 a2Var3 = a2VarArr[2];
            if (a2Var3 != null) {
                fz0 fz0Var3 = fz0VarArr[2];
                boolean z13 = bVar.f54799o;
                fz0Var3.f26531c = z13;
                a2Var3.c(z13, true);
            }
            a2 a2Var4 = a2VarArr[3];
            if (a2Var4 != null) {
                fz0 fz0Var4 = fz0VarArr[3];
                boolean z14 = bVar.f54800p;
                fz0Var4.f26531c = z14;
                a2Var4.c(z14, true);
            }
            a2 a2Var5 = a2VarArr[4];
            if (a2Var5 != null) {
                fz0 fz0Var5 = fz0VarArr[4];
                boolean z15 = bVar.f54801q;
                fz0Var5.f26531c = z15;
                a2Var5.c(z15, true);
            }
            hvVar.f38511a0.a(gvVar.d(), true);
            gvVar.c(true);
        }
    }

    public z0(int i10, Object obj, Object obj2) {
        this.f16868a = i10;
        this.f16869b = obj;
        this.f16870c = obj2;
    }

    public z0(Object obj, Object obj2, boolean z10, int i10) {
        this.f16868a = i10;
        this.f16870c = obj;
        this.f16869b = obj2;
    }

    public z0(d6 d6Var) {
        this.f16868a = 9;
        this.f16869b = new SparseIntArray();
        this.f16870c = d6Var;
        f();
    }

    public z0() {
        this.f16868a = 23;
        this.f16869b = new AtomicInteger();
        this.f16870c = new AtomicInteger();
    }

    public z0(pg.i0 i0Var) {
        this.f16868a = 10;
        this.f16869b = i0Var;
    }

    public z0(ng0 ng0Var) {
        this.f16868a = 4;
        this.f16870c = ng0Var;
        this.f16869b = new cd0(this, 9);
    }

    public z0(s4.j1 j1Var) {
        this.f16868a = 15;
        this.f16869b = j1Var;
        ?? obj = new Object();
        obj.f47804a = 0;
        this.f16870c = obj;
    }

    public z0(int i10) {
        this.f16868a = 19;
        Bitmap createBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
        this.f16869b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.f16870c = new BitmapShader(createBitmap, tileMode, tileMode);
    }

    public z0(w9.k kVar, Executor executor, String str) {
        this.f16868a = 21;
        this.f16870c = kVar;
        this.f16869b = executor;
    }

    @Override
    public void Q() {
    }

    @Override
    public void clear() {
    }

    @Override
    public void d() {
    }

    public void f() {
    }

    @Override
    public void g1() {
    }

    @Override
    public void o() {
    }

    @Override
    public void z() {
    }

    public z0(d31 d31Var) {
        this.f16868a = 8;
        this.f16870c = d31Var;
    }

    public z0(PhotoViewer photoViewer) {
        this.f16868a = 7;
        this.f16870c = photoViewer;
        this.f16869b = new pa(photoViewer.f33903b0, photoViewer.f33932e0, 0, false);
    }

    @Override
    public void B(long j3) {
    }

    @Override
    public void C(boolean z10) {
    }

    @Override
    public void I(float f7) {
    }

    @Override
    public void K(float f7) {
    }

    @Override
    public void O(float f7) {
    }

    @Override
    public void S(float f7) {
    }

    @Override
    public void V(long j3) {
    }

    @Override
    public void b(int i10) {
    }

    @Override
    public void e(float f7) {
    }

    @Override
    public void g(float f7) {
    }

    @Override
    public void p(float f7) {
    }

    @Override
    public void q(boolean z10) {
    }

    @Override
    public void w(float f7) {
    }

    private final void t(int i10, int i11) {
    }

    private final void u(int i10, int i11) {
    }

    @Override
    public void G(float f7, int i10) {
    }

    @Override
    public void M(float f7, int i10) {
    }

    @Override
    public void T(int i10, long j3) {
    }

    @Override
    public void h(long j3, boolean z10) {
    }

    @Override
    public void s(float f7, int i10) {
    }
}
