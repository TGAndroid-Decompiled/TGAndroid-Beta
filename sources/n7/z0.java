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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.a2;
import org.telegram.ui.Cells.g3;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.jz0;
import org.telegram.ui.Components.pa;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Components.q81;
import org.telegram.ui.Components.su;
import org.telegram.ui.Components.uu;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.dn0;
import org.telegram.ui.g31;
import org.telegram.ui.k7;
import org.telegram.ui.kv;
import org.telegram.ui.l5;
import org.telegram.ui.lv;
import org.telegram.ui.pn0;
import org.telegram.ui.u6;
import org.telegram.ui.uk0;
import org.telegram.ui.xm0;
public class z0 implements c6, pp0, su, pc, k7, dn0, fh.a, me.d, com.google.android.gms.common.api.internal.s, n5.b, SuccessContinuation {
    public final int f16571a;
    public Object f16572b;
    public Object f16573c;

    public z0(int i10, byte b10) {
        this.f16571a = i10;
    }

    @Override
    public void B(float f7, boolean z10) {
        cd0 cd0Var = (cd0) this.f16572b;
        pg0 pg0Var = (pg0) this.f16573c;
        q81 q81Var = pg0Var.d;
        if (q81Var != null) {
            long p5 = q81Var.p();
            float max = 2.8f / ((float) Math.max(60L, p5));
            long j3 = (((f7 / (1.0f - max)) * max) + f7) * ((float) p5);
            pg0Var.f29497e = j3;
            pg0Var.d.L(j3, !z10);
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(cd0Var);
                AndroidUtilities.runOnUIThread(cd0Var, 120L);
            }
        }
    }

    @Override
    public void C(float r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: n7.z0.C(float, int):void");
    }

    @Override
    public Paint G(String str) {
        switch (this.f16571a) {
            case 1:
                return h6.T0(str);
            case 8:
                return h6.T0(str);
            default:
                c6 c6Var = (c6) this.f16573c;
                if (c6Var == null) {
                    return h6.T0(str);
                }
                return c6Var.G(str);
        }
    }

    @Override
    public void J0(int i10, int i11) {
        switch (this.f16571a) {
            case 1:
            case 8:
                return;
            default:
                c6 c6Var = (c6) this.f16573c;
                if (c6Var != null) {
                    c6Var.J0(i10, i11);
                    return;
                }
                return;
        }
    }

    @Override
    public void X(float f7, boolean z10) {
        ((TextView) this.f16572b).setText("Alpha " + l5.f39643e);
        l5.f39643e = f7;
        ((l5) this.f16573c).f39644b.M();
    }

    @Override
    public boolean a() {
        switch (this.f16571a) {
            case 1:
            case 8:
            default:
                return h6.I.q();
        }
    }

    @Override
    public void accept(java.lang.Object r53, java.lang.Object r54) {
        throw new UnsupportedOperationException("Method not decompiled: n7.z0.accept(java.lang.Object, java.lang.Object):void");
    }

    @Override
    public void c(String str, String str2) {
        pn0 pn0Var = ((xm0) this.f16573c).f44042a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            pn0Var.N1(true, str2, (uk0) this.f16572b, this, pn0Var.B1);
        } else {
            pn0Var.M1(true, false);
        }
    }

    @Override
    public int d0(int i10) {
        switch (this.f16571a) {
            case 1:
                return x0(i10);
            case 8:
                return x0(i10);
            default:
                c6 c6Var = (c6) this.f16573c;
                if (c6Var == null) {
                    return h6.x0(null, i10, false);
                }
                return c6Var.d0(i10);
        }
    }

    @Override
    public void dismiss() {
        ((lv) this.f16573c).dismiss();
    }

    @Override
    public int f1(int i10) {
        switch (this.f16571a) {
            case 1:
                return ((SparseIntArray) this.f16572b).get(i10);
            case 8:
                return x0(i10);
            default:
                c6 c6Var = (c6) this.f16573c;
                if (c6Var == null) {
                    return h6.x0(null, i10, false);
                }
                return c6Var.f1(i10);
        }
    }

    @Override
    public Object mo27get() {
        qb.b bVar = new qb.b(24);
        ob.a aVar = new ob.a(24);
        Object mo27get = ((gd.a) this.f16572b).mo27get();
        gd.a aVar2 = (gd.a) this.f16573c;
        return new s5.g(bVar, aVar, s5.a.f48064f, (s5.i) mo27get, aVar2);
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public Drawable getDrawable(String str) {
        switch (this.f16571a) {
            case 1:
                return null;
            case 8:
                return null;
            default:
                c6 c6Var = (c6) this.f16573c;
                if (c6Var == null) {
                    return h6.P0(str);
                }
                return c6Var.getDrawable(str);
        }
    }

    @Override
    public void i() {
        ((uu) this.f16572b).getText();
        ((g3) this.f16573c).b();
    }

    public ArrayList j() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        Context context = (Context) this.f16572b;
        Class cls = ((fb.e) this.f16573c).f9807a;
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
        s4.i1 i1Var = (s4.i1) this.f16573c;
        s4.j1 j1Var = (s4.j1) this.f16572b;
        int D = j1Var.D();
        int U = j1Var.U();
        if (i11 > i10) {
            i14 = 1;
        } else {
            i14 = -1;
        }
        View view = null;
        while (i10 != i11) {
            View Z = j1Var.Z(i10);
            int m10 = j1Var.m(Z);
            int d02 = j1Var.d0(Z);
            i1Var.f47946b = D;
            i1Var.f47947c = U;
            i1Var.d = m10;
            i1Var.f47948e = d02;
            if (i12 != 0) {
                i1Var.f47945a = i12;
                if (i1Var.a()) {
                    return Z;
                }
            }
            if (i13 != 0) {
                i1Var.f47945a = i13;
                if (i1Var.a()) {
                    view = Z;
                }
            }
            i10 += i14;
        }
        return view;
    }

    @Override
    public ch.d l() {
        if (Build.VERSION.SDK_INT >= 29) {
            ch.e eVar = new ch.e(this);
            ((PhotoViewer) this.f16573c).Z.add(eVar);
            return eVar;
        }
        return new ch.f(this);
    }

    @Override
    public boolean l0() {
        switch (this.f16571a) {
            case 1:
                return false;
            case 8:
                return false;
            default:
                c6 c6Var = (c6) this.f16573c;
                if (c6Var == null) {
                    return h6.b1();
                }
                return c6Var.l0();
        }
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        switch (this.f16571a) {
            case 1:
                h6.q(f7, f10, i10, i11);
                return;
            case 8:
                h6.q(f7, f10, i10, i11);
                return;
            default:
                c6 c6Var = (c6) this.f16573c;
                if (c6Var == null) {
                    h6.q(f7, f10, i10, i11);
                    return;
                } else {
                    c6Var.m(f7, f10, i10, i11);
                    return;
                }
        }
    }

    @Override
    public int m0() {
        return 0;
    }

    @Override
    public void n(int i10, float f7, float f10, me.e eVar) {
        ph.i iVar = (ph.i) this.f16573c;
        iVar.f45755c.a(f7);
        iVar.d.a(f7);
        iVar.f45754b.a(f7);
        ((Runnable) this.f16572b).run();
    }

    public boolean o(View view) {
        s4.i1 i1Var = (s4.i1) this.f16573c;
        s4.j1 j1Var = (s4.j1) this.f16572b;
        int D = j1Var.D();
        int U = j1Var.U();
        int m10 = j1Var.m(view);
        int d02 = j1Var.d0(view);
        i1Var.f47946b = D;
        i1Var.f47947c = U;
        i1Var.d = m10;
        i1Var.f47948e = d02;
        i1Var.f47945a = 24579;
        return i1Var.a();
    }

    @Override
    public Task then(Object obj) {
        switch (this.f16571a) {
            case 21:
                da.b bVar = (da.b) obj;
                w9.n nVar = ((w9.l) this.f16573c).f50469e;
                if (bVar == null) {
                    Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
                    return Tasks.forResult(null);
                }
                return Tasks.whenAll(w9.n.b(nVar), nVar.f50483m.y((Executor) this.f16572b, null));
            default:
                return ((w9.n) this.f16573c).f50476e.l(new u4.f(1, this, (Boolean) obj));
        }
    }

    public String toString() {
        switch (this.f16571a) {
            case 13:
                return "Bounds{lower=" + ((i0.b) this.f16572b) + " upper=" + ((i0.b) this.f16573c) + "}";
            default:
                return super.toString();
        }
    }

    @Override
    public void v(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.save();
        canvas.clipRect(f7, f10, f11, f12);
        ((PhotoViewer) this.f16573c).T0(canvas, (pa) this.f16572b, -14277082, 855638016, false, true, true);
        canvas.drawColor(637534208);
        canvas.restore();
    }

    public c3.h0 w(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = (int[]) this.f16572b;
            if (i11 < iArr.length) {
                if (i10 == iArr[i11]) {
                    return ((u2.z0[]) this.f16573c)[i11];
                }
                i11++;
            } else {
                e2.a.e("BaseMediaChunkOutput", "Unmatched track of type: " + i10);
                return new c3.n();
            }
        }
    }

    @Override
    public ColorFilter x() {
        switch (this.f16571a) {
            case 1:
                return h6.f20889v3;
            case 8:
                return h6.f20889v3;
            default:
                c6 c6Var = (c6) this.f16573c;
                if (c6Var == null) {
                    return h6.f20889v3;
                }
                return c6Var.x();
        }
    }

    @Override
    public int x0(int i10) {
        switch (this.f16571a) {
            case 1:
                SparseIntArray sparseIntArray = (SparseIntArray) this.f16572b;
                int indexOfKey = sparseIntArray.indexOfKey(i10);
                if (indexOfKey >= 0) {
                    return sparseIntArray.valueAt(indexOfKey);
                }
                return h6.x0(null, i10, false);
            case 8:
                SparseIntArray sparseIntArray2 = (SparseIntArray) this.f16572b;
                if (sparseIntArray2 != null) {
                    return sparseIntArray2.get(i10);
                }
                return h6.x0(null, i10, false);
            default:
                SparseIntArray sparseIntArray3 = (SparseIntArray) this.f16572b;
                int indexOfKey2 = sparseIntArray3.indexOfKey(i10);
                if (indexOfKey2 >= 0) {
                    return sparseIntArray3.valueAt(indexOfKey2);
                }
                c6 c6Var = (c6) this.f16573c;
                if (c6Var == null) {
                    return h6.x0(null, i10, false);
                }
                return c6Var.x0(i10);
        }
    }

    @Override
    public void y0(u6 u6Var, zh.a aVar, boolean z10) {
        lv lvVar = (lv) this.f16573c;
        kv kvVar = lvVar.X;
        if (aVar != null) {
            ((zh.b) this.f16572b).i(aVar);
            lvVar.f39849e0.d();
            zh.b bVar = lvVar.f39851g0;
            jz0[] jz0VarArr = lvVar.f39846b0;
            a2[] a2VarArr = lvVar.f39847c0;
            a2 a2Var = a2VarArr[0];
            if (a2Var != null) {
                jz0 jz0Var = jz0VarArr[0];
                boolean z11 = bVar.f54934m;
                jz0Var.f27682c = z11;
                a2Var.c(z11, true);
            }
            a2 a2Var2 = a2VarArr[1];
            if (a2Var2 != null) {
                jz0 jz0Var2 = jz0VarArr[1];
                boolean z12 = bVar.f54935n;
                jz0Var2.f27682c = z12;
                a2Var2.c(z12, true);
            }
            a2 a2Var3 = a2VarArr[2];
            if (a2Var3 != null) {
                jz0 jz0Var3 = jz0VarArr[2];
                boolean z13 = bVar.f54936o;
                jz0Var3.f27682c = z13;
                a2Var3.c(z13, true);
            }
            a2 a2Var4 = a2VarArr[3];
            if (a2Var4 != null) {
                jz0 jz0Var4 = jz0VarArr[3];
                boolean z14 = bVar.f54937p;
                jz0Var4.f27682c = z14;
                a2Var4.c(z14, true);
            }
            a2 a2Var5 = a2VarArr[4];
            if (a2Var5 != null) {
                jz0 jz0Var5 = jz0VarArr[4];
                boolean z15 = bVar.f54938q;
                jz0Var5.f27682c = z15;
                a2Var5.c(z15, true);
            }
            lvVar.f39845a0.a(kvVar.d(), true);
            kvVar.c(true);
        }
    }

    public z0(int i10, Object obj, Object obj2) {
        this.f16571a = i10;
        this.f16572b = obj;
        this.f16573c = obj2;
    }

    public z0(Object obj, Object obj2, boolean z10, int i10) {
        this.f16571a = i10;
        this.f16573c = obj;
        this.f16572b = obj2;
    }

    public z0(c6 c6Var) {
        this.f16571a = 9;
        this.f16572b = new SparseIntArray();
        this.f16573c = c6Var;
        e();
    }

    public z0() {
        this.f16571a = 23;
        this.f16572b = new AtomicInteger();
        this.f16573c = new AtomicInteger();
    }

    public z0(pg.i0 i0Var) {
        this.f16571a = 10;
        this.f16572b = i0Var;
    }

    public z0(pg0 pg0Var) {
        this.f16571a = 4;
        this.f16573c = pg0Var;
        this.f16572b = new cd0(this, 10);
    }

    public z0(s4.j1 j1Var) {
        this.f16571a = 15;
        this.f16572b = j1Var;
        ?? obj = new Object();
        obj.f47945a = 0;
        this.f16573c = obj;
    }

    public z0(int i10) {
        this.f16571a = 19;
        Bitmap createBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
        this.f16572b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.f16573c = new BitmapShader(createBitmap, tileMode, tileMode);
    }

    public z0(w9.l lVar, Executor executor, String str) {
        this.f16571a = 21;
        this.f16573c = lVar;
        this.f16572b = executor;
    }

    @Override
    public void R() {
    }

    @Override
    public void b() {
    }

    @Override
    public void clear() {
    }

    public void e() {
    }

    @Override
    public void g1() {
    }

    @Override
    public void p() {
    }

    @Override
    public void z() {
    }

    public z0(g31 g31Var) {
        this.f16571a = 8;
        this.f16573c = g31Var;
    }

    public z0(PhotoViewer photoViewer) {
        this.f16571a = 7;
        this.f16573c = photoViewer;
        this.f16572b = new pa(photoViewer.f33712b0, photoViewer.f33741e0, 0, false);
    }

    @Override
    public void A(float f7) {
    }

    @Override
    public void E(long j3) {
    }

    @Override
    public void F(boolean z10) {
    }

    @Override
    public void K(float f7) {
    }

    @Override
    public void O(float f7) {
    }

    @Override
    public void Q(float f7) {
    }

    @Override
    public void W(float f7) {
    }

    @Override
    public void Z(long j3) {
    }

    @Override
    public void d(int i10) {
    }

    @Override
    public void f(float f7) {
    }

    @Override
    public void g(float f7) {
    }

    @Override
    public void q(float f7) {
    }

    @Override
    public void r(boolean z10) {
    }

    private final void s(int i10, int i11) {
    }

    private final void u(int i10, int i11) {
    }

    @Override
    public void I(float f7, int i10) {
    }

    @Override
    public void P(float f7, int i10) {
    }

    @Override
    public void Y(int i10, long j3) {
    }

    @Override
    public void h(long j3, boolean z10) {
    }

    @Override
    public void t(float f7, int i10) {
    }
}
