package m2;

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
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import b2.s0;
import di.oc;
import j9.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ji.w4;
import m.h3;
import n4.v;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.a2;
import org.telegram.ui.Cells.g3;
import org.telegram.ui.Components.az0;
import org.telegram.ui.Components.fp0;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.kg0;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.pa;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.an0;
import org.telegram.ui.gn0;
import org.telegram.ui.l31;
import org.telegram.ui.m5;
import org.telegram.ui.m7;
import org.telegram.ui.nv;
import org.telegram.ui.ov;
import org.telegram.ui.sn0;
import org.telegram.ui.w6;
import org.telegram.ui.xk0;
import s4.g1;
import s4.h1;
import v7.q8;
public class t implements e2.d, n5.b, ne.f, c6, fp0, lu, oc, m7, gn0, gh.a, y2.n {
    public final int f15109a;
    public Object f15110b;
    public Object f15111c;

    public t(int i10, byte b10) {
        this.f15109a = i10;
    }

    public ArrayList A() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        Context context = (Context) this.f15110b;
        Class cls = ((gb.e) this.f15111c).f10047a;
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
            arrayList2.add(new r9.c(str2, 0));
        }
        return arrayList2;
    }

    public View C(int i10, int i11, int i12, int i13) {
        int i14;
        g1 g1Var = (g1) this.f15111c;
        h1 h1Var = (h1) this.f15110b;
        int D = h1Var.D();
        int U = h1Var.U();
        if (i11 > i10) {
            i14 = 1;
        } else {
            i14 = -1;
        }
        View view = null;
        while (i10 != i11) {
            View J0 = h1Var.J0(i10);
            int l4 = h1Var.l(J0);
            int M0 = h1Var.M0(J0);
            g1Var.f44886b = D;
            g1Var.f44887c = U;
            g1Var.d = l4;
            g1Var.e = M0;
            if (i12 != 0) {
                g1Var.f44885a = i12;
                if (g1Var.a()) {
                    return J0;
                }
            }
            if (i13 != 0) {
                g1Var.f44885a = i13;
                if (g1Var.a()) {
                    view = J0;
                }
            }
            i10 += i14;
        }
        return view;
    }

    @Override
    public void E(float f7, boolean z10) {
        yc0 yc0Var = (yc0) this.f15110b;
        kg0 kg0Var = (kg0) this.f15111c;
        i81 i81Var = kg0Var.d;
        if (i81Var != null) {
            long p5 = i81Var.p();
            float max = 2.8f / ((float) Math.max(60L, p5));
            long j10 = (((f7 / (1.0f - max)) * max) + f7) * ((float) p5);
            kg0Var.e = j10;
            kg0Var.d.L(j10, !z10);
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(yc0Var);
                AndroidUtilities.runOnUIThread(yc0Var, 120L);
            }
        }
    }

    @Override
    public int E0(int i10) {
        switch (this.f15109a) {
            case 9:
                SparseIntArray sparseIntArray = (SparseIntArray) this.f15110b;
                int indexOfKey = sparseIntArray.indexOfKey(i10);
                if (indexOfKey >= 0) {
                    return sparseIntArray.valueAt(indexOfKey);
                }
                return g6.x0(null, i10, false);
            case 16:
                SparseIntArray sparseIntArray2 = (SparseIntArray) this.f15110b;
                if (sparseIntArray2 != null) {
                    return sparseIntArray2.get(i10);
                }
                return g6.x0(null, i10, false);
            default:
                SparseIntArray sparseIntArray3 = (SparseIntArray) this.f15110b;
                int indexOfKey2 = sparseIntArray3.indexOfKey(i10);
                if (indexOfKey2 >= 0) {
                    return sparseIntArray3.valueAt(indexOfKey2);
                }
                c6 c6Var = (c6) this.f15111c;
                if (c6Var == null) {
                    return g6.x0(null, i10, false);
                }
                return c6Var.E0(i10);
        }
    }

    @Override
    public Paint F(String str) {
        switch (this.f15109a) {
            case 9:
                return g6.T0(str);
            case 16:
                return g6.T0(str);
            default:
                c6 c6Var = (c6) this.f15111c;
                if (c6Var == null) {
                    return g6.T0(str);
                }
                return c6Var.F(str);
        }
    }

    public boolean G(v vVar, String str) {
        Context context = (Context) this.f15110b;
        int i10 = vVar.f15749b;
        if (i10 < 0) {
            if (context.getPackageManager().checkPermission(str, vVar.f15748a) == 0) {
                return true;
            }
            return false;
        } else if (context.checkPermission(str, i10, vVar.f15750c) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean H(View view) {
        g1 g1Var = (g1) this.f15111c;
        h1 h1Var = (h1) this.f15110b;
        int D = h1Var.D();
        int U = h1Var.U();
        int l4 = h1Var.l(view);
        int M0 = h1Var.M0(view);
        g1Var.f44886b = D;
        g1Var.f44887c = U;
        g1Var.d = l4;
        g1Var.e = M0;
        g1Var.f44885a = 24579;
        return g1Var.a();
    }

    public int K(Context context, com.google.android.gms.common.api.c cVar) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.f15110b;
        n6.l.h(context);
        n6.l.h(cVar);
        int i10 = 0;
        if (!cVar.k()) {
            return 0;
        }
        int l4 = cVar.l();
        int i11 = sparseIntArray.get(l4, -1);
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        while (true) {
            if (i12 < sparseIntArray.size()) {
                int keyAt = sparseIntArray.keyAt(i12);
                if (keyAt > l4 && sparseIntArray.get(keyAt) == 0) {
                    break;
                }
                i12++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            i10 = ((k6.e) this.f15111c).d(context, l4);
        }
        sparseIntArray.put(l4, i10);
        return i10;
    }

    @Override
    public void M0(int i10, int i11) {
        switch (this.f15109a) {
            case 9:
            case 16:
                return;
            default:
                c6 c6Var = (c6) this.f15111c;
                if (c6Var != null) {
                    c6Var.M0(i10, i11);
                    return;
                }
                return;
        }
    }

    @Override
    public void X(float f7, boolean z10) {
        ((TextView) this.f15110b).setText("Alpha " + m5.e);
        m5.e = f7;
        ((m5) this.f15111c).f37910b.M();
    }

    @Override
    public boolean a() {
        switch (this.f15109a) {
            case 9:
            case 16:
            default:
                return g6.I.q();
        }
    }

    @Override
    public int b0(int i10) {
        switch (this.f15109a) {
            case 9:
                return E0(i10);
            case 16:
                return E0(i10);
            default:
                c6 c6Var = (c6) this.f15111c;
                if (c6Var == null) {
                    return g6.x0(null, i10, false);
                }
                return c6Var.b0(i10);
        }
    }

    @Override
    public void c() {
        ((ne.k) this.f15110b).c();
    }

    @Override
    public void d(String str, String str2) {
        sn0 sn0Var = ((an0) this.f15111c).f33999a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            sn0Var.N1(true, str2, (xk0) this.f15110b, this, sn0Var.B1);
        } else {
            sn0Var.M1(true, false);
        }
    }

    @Override
    public void dismiss() {
        ((ov) this.f15111c).dismiss();
    }

    @Override
    public dh.d f() {
        if (Build.VERSION.SDK_INT >= 29) {
            dh.e eVar = new dh.e(this);
            ((PhotoViewer) this.f15111c).Z.add(eVar);
            return eVar;
        }
        return new dh.f(this);
    }

    @Override
    public int f1(int i10) {
        switch (this.f15109a) {
            case 9:
                return ((SparseIntArray) this.f15110b).get(i10);
            case 16:
                return E0(i10);
            default:
                c6 c6Var = (c6) this.f15111c;
                if (c6Var == null) {
                    return g6.x0(null, i10, false);
                }
                return c6Var.f1(i10);
        }
    }

    @Override
    public Object g2(Uri uri, g2.k kVar) {
        t2.a aVar = (t2.a) ((y2.n) this.f15110b).g2(uri, kVar);
        List list = (List) this.f15111c;
        if (list != null && !list.isEmpty()) {
            return (t2.a) aVar.a(list);
        }
        return aVar;
    }

    @Override
    public Object mo27get() {
        switch (this.f15109a) {
            case 2:
                return new m5.d((Context) ((a9.r) this.f15110b).f357a, (h3) ((w4) this.f15111c).mo27get());
            default:
                rb.b bVar = new rb.b(24);
                pb.a aVar = new pb.a(24);
                s5.i iVar = (s5.i) ((hd.a) this.f15110b).mo27get();
                return new s5.g(bVar, aVar, s5.a.f45014f, iVar, (hd.a) this.f15111c);
        }
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public Drawable getDrawable(String str) {
        switch (this.f15109a) {
            case 9:
                return null;
            case 16:
                return null;
            default:
                c6 c6Var = (c6) this.f15111c;
                if (c6Var == null) {
                    return g6.P0(str);
                }
                return c6Var.getDrawable(str);
        }
    }

    @Override
    public boolean i() {
        return false;
    }

    @Override
    public boolean j(float f7) {
        return false;
    }

    @Override
    public void j1(w6 w6Var, ai.b bVar, boolean z10) {
        ov ovVar = (ov) this.f15111c;
        nv nvVar = ovVar.X;
        if (bVar != null) {
            ((ai.c) this.f15110b).i(bVar);
            ovVar.f38755e0.d();
            ai.c cVar = ovVar.f38757g0;
            az0[] az0VarArr = ovVar.f38752b0;
            a2[] a2VarArr = ovVar.f38753c0;
            a2 a2Var = a2VarArr[0];
            if (a2Var != null) {
                az0 az0Var = az0VarArr[0];
                boolean z11 = cVar.f933m;
                az0Var.f23328c = z11;
                a2Var.c(z11, true);
            }
            a2 a2Var2 = a2VarArr[1];
            if (a2Var2 != null) {
                az0 az0Var2 = az0VarArr[1];
                boolean z12 = cVar.f934n;
                az0Var2.f23328c = z12;
                a2Var2.c(z12, true);
            }
            a2 a2Var3 = a2VarArr[2];
            if (a2Var3 != null) {
                az0 az0Var3 = az0VarArr[2];
                boolean z13 = cVar.f935o;
                az0Var3.f23328c = z13;
                a2Var3.c(z13, true);
            }
            a2 a2Var4 = a2VarArr[3];
            if (a2Var4 != null) {
                az0 az0Var4 = az0VarArr[3];
                boolean z14 = cVar.f936p;
                az0Var4.f23328c = z14;
                a2Var4.c(z14, true);
            }
            a2 a2Var5 = a2VarArr[4];
            if (a2Var5 != null) {
                az0 az0Var5 = az0VarArr[4];
                boolean z15 = cVar.f937q;
                az0Var5.f23328c = z15;
                a2Var5.c(z15, true);
            }
            ovVar.f38751a0.a(nvVar.d(), true);
            nvVar.c(true);
        }
    }

    @Override
    public int k0() {
        return 0;
    }

    @Override
    public void l(float f7, float f10, int i10, int i11) {
        switch (this.f15109a) {
            case 9:
                g6.q(f7, f10, i10, i11);
                return;
            case 16:
                g6.q(f7, f10, i10, i11);
                return;
            default:
                c6 c6Var = (c6) this.f15111c;
                if (c6Var == null) {
                    g6.q(f7, f10, i10, i11);
                    return;
                } else {
                    c6Var.l(f7, f10, i10, i11);
                    return;
                }
        }
    }

    @Override
    public boolean m0() {
        switch (this.f15109a) {
            case 9:
                return false;
            case 16:
                return false;
            default:
                c6 c6Var = (c6) this.f15111c;
                if (c6Var == null) {
                    return g6.b1();
                }
                return c6Var.m0();
        }
    }

    @Override
    public y o(s0 s0Var) {
        y o10 = ((e2.d) this.f15110b).o(s0Var);
        if (o10 == null) {
            return null;
        }
        return q8.c(o10, new ji.m5(this, 8));
    }

    @Override
    public void p() {
        ((nu) this.f15110b).getText();
        ((g3) this.f15111c).b();
    }

    public void q(Object obj, String str) {
        ((ArrayList) this.f15110b).add(a1.g.D(str, "=", String.valueOf(obj)));
    }

    @Override
    public void t() {
        ((ne.k) this.f15110b).e((ne.l) this.f15111c);
    }

    public String toString() {
        switch (this.f15109a) {
            case 0:
                return ((String) this.f15110b) + ", " + ((String) this.f15111c);
            case 5:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f15111c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f15110b;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    sb2.append((String) arrayList.get(i10));
                    if (i10 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            case 20:
                return "Bounds{lower=" + ((i0.b) this.f15110b) + " upper=" + ((i0.b) this.f15111c) + "}";
            default:
                return super.toString();
        }
    }

    @Override
    public y u(byte[] bArr) {
        return q8.c(((e2.d) this.f15110b).u(bArr), new ji.m5(this, 8));
    }

    @Override
    public void v(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.save();
        canvas.clipRect(f7, f10, f11, f12);
        ((PhotoViewer) this.f15111c).T0(canvas, (pa) this.f15110b, -14277082, 855638016, false, true, true);
        canvas.drawColor(637534208);
        canvas.restore();
    }

    @Override
    public ColorFilter w() {
        switch (this.f15109a) {
            case 9:
                return g6.f19930v3;
            case 16:
                return g6.f19930v3;
            default:
                c6 c6Var = (c6) this.f15111c;
                if (c6Var == null) {
                    return g6.f19930v3;
                }
                return c6Var.w();
        }
    }

    public t(int i10, Object obj, Object obj2) {
        this.f15109a = i10;
        this.f15110b = obj;
        this.f15111c = obj2;
    }

    public t(Object obj, Object obj2, boolean z10, int i10) {
        this.f15109a = i10;
        this.f15111c = obj;
        this.f15110b = obj2;
    }

    public t(Object obj) {
        this.f15109a = 5;
        this.f15111c = obj;
        this.f15110b = new ArrayList();
    }

    public t(k6.e eVar) {
        this.f15109a = 6;
        this.f15110b = new SparseIntArray();
        n6.l.h(eVar);
        this.f15111c = eVar;
    }

    public t(c6 c6Var) {
        this.f15109a = 17;
        this.f15110b = new SparseIntArray();
        this.f15111c = c6Var;
        x();
    }

    public t(Context context) {
        this.f15109a = 25;
        this.f15110b = context;
        this.f15111c = null;
    }

    public t(byte[] bArr) {
        this.f15109a = 3;
        this.f15110b = bArr;
    }

    public t(kg0 kg0Var) {
        this.f15109a = 12;
        this.f15111c = kg0Var;
        this.f15110b = new yc0(this, 10);
    }

    public t(String str, String str2) {
        this.f15109a = 26;
        this.f15110b = str;
        this.f15111c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    public t(h1 h1Var) {
        this.f15109a = 22;
        this.f15110b = h1Var;
        ?? obj = new Object();
        obj.f44885a = 0;
        this.f15111c = obj;
    }

    @Override
    public void b() {
    }

    @Override
    public void c0() {
    }

    @Override
    public void clear() {
    }

    @Override
    public void h1() {
    }

    @Override
    public void m() {
    }

    @Override
    public void r() {
    }

    public void x() {
    }

    @Override
    public void z() {
    }

    public t(int i10) {
        this.f15109a = 28;
        Bitmap createBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
        this.f15110b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.f15111c = new BitmapShader(createBitmap, tileMode, tileMode);
    }

    @Override
    public void D(float f7) {
    }

    @Override
    public void M(long j10) {
    }

    @Override
    public void N(boolean z10) {
    }

    @Override
    public void P(float f7) {
    }

    @Override
    public void S(float f7) {
    }

    @Override
    public void Z(float f7) {
    }

    @Override
    public void e(int i10) {
    }

    @Override
    public void e0(float f7) {
    }

    @Override
    public void g(float f7) {
    }

    @Override
    public void h(boolean z10) {
    }

    @Override
    public void k(float f7) {
    }

    @Override
    public void l0(long j10) {
    }

    @Override
    public void s(float f7) {
    }

    @Override
    public void y(boolean z10) {
    }

    public t(EditText editText) {
        this.f15109a = 18;
        this.f15110b = editText;
        q1.i iVar = new q1.i(editText);
        this.f15111c = iVar;
        editText.addTextChangedListener(iVar);
        if (q1.a.f42980b == null) {
            synchronized (q1.a.f42979a) {
                try {
                    if (q1.a.f42980b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            q1.a.f42981c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, q1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        q1.a.f42980b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(q1.a.f42980b);
    }

    private final void I(int i10, int i11) {
    }

    private final void J(int i10, int i11) {
    }

    @Override
    public void B(float f7, int i10) {
    }

    @Override
    public void O(float f7, int i10) {
    }

    @Override
    public void Y(float f7, int i10) {
    }

    @Override
    public void f0(int i10, long j10) {
    }

    @Override
    public void n(long j10, boolean z10) {
    }

    public t(l31 l31Var) {
        this.f15109a = 16;
        this.f15111c = l31Var;
    }

    public t(PhotoViewer photoViewer) {
        this.f15109a = 15;
        this.f15111c = photoViewer;
        this.f15110b = new pa(photoViewer.f31900b0, photoViewer.f31928e0, 0, false);
    }
}
