package m4;

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
import di.oc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.a2;
import org.telegram.ui.Cells.g3;
import org.telegram.ui.Components.fp0;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.jg0;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.pa;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.Components.zy0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bn0;
import org.telegram.ui.hn0;
import org.telegram.ui.l31;
import org.telegram.ui.m5;
import org.telegram.ui.m7;
import org.telegram.ui.nv;
import org.telegram.ui.ov;
import org.telegram.ui.un0;
import org.telegram.ui.w6;
import org.telegram.ui.yk0;
public class c implements e2.d, ne.f, c6, fp0, lu, oc, m7, hn0, gh.a, n5.b, y2.n {
    public final int f15391a;
    public Object f15392b;
    public Object f15393c;

    public c(int i10, byte b10) {
        this.f15391a = i10;
    }

    public ArrayList A() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        Context context = (Context) this.f15392b;
        Class cls = (Class) ((l2.f) this.f15393c).f14503b;
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
        s4.g1 g1Var = (s4.g1) this.f15393c;
        s4.h1 h1Var = (s4.h1) this.f15392b;
        int D = h1Var.D();
        int b02 = h1Var.b0();
        if (i11 > i10) {
            i14 = 1;
        } else {
            i14 = -1;
        }
        View view = null;
        while (i10 != i11) {
            View D0 = h1Var.D0(i10);
            int q6 = h1Var.q(D0);
            int L0 = h1Var.L0(D0);
            g1Var.f44886b = D;
            g1Var.f44887c = b02;
            g1Var.d = q6;
            g1Var.e = L0;
            if (i12 != 0) {
                g1Var.f44885a = i12;
                if (g1Var.a()) {
                    return D0;
                }
            }
            if (i13 != 0) {
                g1Var.f44885a = i13;
                if (g1Var.a()) {
                    view = D0;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public com.google.android.datatransport.cct.CctBackendFactory D(java.lang.String r14) {
        throw new UnsupportedOperationException("Method not decompiled: m4.c.D(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    public boolean F(n4.v vVar, String str) {
        Context context = (Context) this.f15392b;
        int i10 = vVar.f16035b;
        if (i10 < 0) {
            if (context.getPackageManager().checkPermission(str, vVar.f16034a) == 0) {
                return true;
            }
            return false;
        } else if (context.checkPermission(str, i10, vVar.f16036c) == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int F0(int i10) {
        switch (this.f15391a) {
            case 9:
                SparseIntArray sparseIntArray = (SparseIntArray) this.f15392b;
                int indexOfKey = sparseIntArray.indexOfKey(i10);
                if (indexOfKey >= 0) {
                    return sparseIntArray.valueAt(indexOfKey);
                }
                return g6.x0(null, i10, false);
            case 16:
                SparseIntArray sparseIntArray2 = (SparseIntArray) this.f15392b;
                if (sparseIntArray2 != null) {
                    return sparseIntArray2.get(i10);
                }
                return g6.x0(null, i10, false);
            default:
                SparseIntArray sparseIntArray3 = (SparseIntArray) this.f15392b;
                int indexOfKey2 = sparseIntArray3.indexOfKey(i10);
                if (indexOfKey2 >= 0) {
                    return sparseIntArray3.valueAt(indexOfKey2);
                }
                c6 c6Var = (c6) this.f15393c;
                if (c6Var == null) {
                    return g6.x0(null, i10, false);
                }
                return c6Var.F0(i10);
        }
    }

    @Override
    public Paint G(String str) {
        switch (this.f15391a) {
            case 9:
                return g6.T0(str);
            case 16:
                return g6.T0(str);
            default:
                c6 c6Var = (c6) this.f15393c;
                if (c6Var == null) {
                    return g6.T0(str);
                }
                return c6Var.G(str);
        }
    }

    public boolean H(View view) {
        s4.g1 g1Var = (s4.g1) this.f15393c;
        s4.h1 h1Var = (s4.h1) this.f15392b;
        int D = h1Var.D();
        int b02 = h1Var.b0();
        int q6 = h1Var.q(view);
        int L0 = h1Var.L0(view);
        g1Var.f44886b = D;
        g1Var.f44887c = b02;
        g1Var.d = q6;
        g1Var.e = L0;
        g1Var.f44885a = 24579;
        return g1Var.a();
    }

    @Override
    public void I(float f7, boolean z10) {
        yc0 yc0Var = (yc0) this.f15392b;
        jg0 jg0Var = (jg0) this.f15393c;
        h81 h81Var = jg0Var.d;
        if (h81Var != null) {
            long p5 = h81Var.p();
            float max = 2.8f / ((float) Math.max(60L, p5));
            long j10 = (((f7 / (1.0f - max)) * max) + f7) * ((float) p5);
            jg0Var.e = j10;
            jg0Var.d.L(j10, !z10);
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(yc0Var);
                AndroidUtilities.runOnUIThread(yc0Var, 120L);
            }
        }
    }

    public int L(Context context, com.google.android.gms.common.api.c cVar) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.f15392b;
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
            i10 = ((k6.e) this.f15393c).d(context, l4);
        }
        sparseIntArray.put(l4, i10);
        return i10;
    }

    @Override
    public void N0(int i10, int i11) {
        switch (this.f15391a) {
            case 9:
            case 16:
                return;
            default:
                c6 c6Var = (c6) this.f15393c;
                if (c6Var != null) {
                    c6Var.N0(i10, i11);
                    return;
                }
                return;
        }
    }

    @Override
    public void X(float f7, boolean z10) {
        ((TextView) this.f15392b).setText("Alpha " + m5.e);
        m5.e = f7;
        ((m5) this.f15393c).f38164b.M();
    }

    @Override
    public boolean a() {
        switch (this.f15391a) {
            case 9:
            case 16:
            default:
                return g6.I.q();
        }
    }

    @Override
    public int b0(int i10) {
        switch (this.f15391a) {
            case 9:
                return F0(i10);
            case 16:
                return F0(i10);
            default:
                c6 c6Var = (c6) this.f15393c;
                if (c6Var == null) {
                    return g6.x0(null, i10, false);
                }
                return c6Var.b0(i10);
        }
    }

    @Override
    public void c() {
        ((ne.k) this.f15392b).c();
    }

    @Override
    public j9.y d(b2.s0 s0Var) {
        Uri uri;
        byte[] bArr;
        li.k kVar = (li.k) this.f15393c;
        if (kVar != null && (((uri = (Uri) kVar.f14821c) != null && uri.equals(s0Var.f2353n)) || ((bArr = (byte[]) kVar.f14820b) != null && Arrays.equals(bArr, s0Var.f2350k)))) {
            j9.y yVar = (j9.y) ((li.k) this.f15393c).d;
            yVar.getClass();
            return yVar;
        }
        j9.y d = ((e2.d) this.f15392b).d(s0Var);
        if (d == null) {
            return null;
        }
        this.f15393c = new li.k(s0Var, d);
        return d;
    }

    @Override
    public Object d2(Uri uri, g2.k kVar) {
        t2.a aVar = (t2.a) ((y2.n) this.f15392b).d2(uri, kVar);
        List list = (List) this.f15393c;
        if (list != null && !list.isEmpty()) {
            return (t2.a) aVar.a(list);
        }
        return aVar;
    }

    @Override
    public void dismiss() {
        ((ov) this.f15393c).dismiss();
    }

    @Override
    public int g1(int i10) {
        switch (this.f15391a) {
            case 9:
                return ((SparseIntArray) this.f15392b).get(i10);
            case 16:
                return F0(i10);
            default:
                c6 c6Var = (c6) this.f15393c;
                if (c6Var == null) {
                    return g6.x0(null, i10, false);
                }
                return c6Var.g1(i10);
        }
    }

    @Override
    public Object mo27get() {
        rb.b bVar = new rb.b(24);
        pb.a aVar = new pb.a(24);
        Object mo27get = ((hd.a) this.f15392b).mo27get();
        hd.a aVar2 = (hd.a) this.f15393c;
        return new s5.g(bVar, aVar, s5.a.f45014f, (s5.i) mo27get, aVar2);
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public Drawable getDrawable(String str) {
        switch (this.f15391a) {
            case 9:
                return null;
            case 16:
                return null;
            default:
                c6 c6Var = (c6) this.f15393c;
                if (c6Var == null) {
                    return g6.P0(str);
                }
                return c6Var.getDrawable(str);
        }
    }

    @Override
    public boolean h() {
        return false;
    }

    @Override
    public boolean i(float f7) {
        return false;
    }

    @Override
    public void j1(w6 w6Var, ai.b bVar, boolean z10) {
        ov ovVar = (ov) this.f15393c;
        nv nvVar = ovVar.X;
        if (bVar != null) {
            ((ai.c) this.f15392b).i(bVar);
            ovVar.f39048e0.d();
            ai.c cVar = ovVar.f39050g0;
            zy0[] zy0VarArr = ovVar.f39045b0;
            a2[] a2VarArr = ovVar.f39046c0;
            a2 a2Var = a2VarArr[0];
            if (a2Var != null) {
                zy0 zy0Var = zy0VarArr[0];
                boolean z11 = cVar.f929m;
                zy0Var.f32022c = z11;
                a2Var.c(z11, true);
            }
            a2 a2Var2 = a2VarArr[1];
            if (a2Var2 != null) {
                zy0 zy0Var2 = zy0VarArr[1];
                boolean z12 = cVar.f930n;
                zy0Var2.f32022c = z12;
                a2Var2.c(z12, true);
            }
            a2 a2Var3 = a2VarArr[2];
            if (a2Var3 != null) {
                zy0 zy0Var3 = zy0VarArr[2];
                boolean z13 = cVar.f931o;
                zy0Var3.f32022c = z13;
                a2Var3.c(z13, true);
            }
            a2 a2Var4 = a2VarArr[3];
            if (a2Var4 != null) {
                zy0 zy0Var4 = zy0VarArr[3];
                boolean z14 = cVar.f932p;
                zy0Var4.f32022c = z14;
                a2Var4.c(z14, true);
            }
            a2 a2Var5 = a2VarArr[4];
            if (a2Var5 != null) {
                zy0 zy0Var5 = zy0VarArr[4];
                boolean z15 = cVar.f933q;
                zy0Var5.f32022c = z15;
                a2Var5.c(z15, true);
            }
            ovVar.f39044a0.a(nvVar.d(), true);
            nvVar.c(true);
        }
    }

    @Override
    public dh.d k() {
        if (Build.VERSION.SDK_INT >= 29) {
            dh.e eVar = new dh.e(this);
            ((PhotoViewer) this.f15393c).Z.add(eVar);
            return eVar;
        }
        return new dh.f(this);
    }

    @Override
    public int k0() {
        return 0;
    }

    @Override
    public void l(float f7, float f10, int i10, int i11) {
        switch (this.f15391a) {
            case 9:
                g6.q(f7, f10, i10, i11);
                return;
            case 16:
                g6.q(f7, f10, i10, i11);
                return;
            default:
                c6 c6Var = (c6) this.f15393c;
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
        switch (this.f15391a) {
            case 9:
                return false;
            case 16:
                return false;
            default:
                c6 c6Var = (c6) this.f15393c;
                if (c6Var == null) {
                    return g6.b1();
                }
                return c6Var.m0();
        }
    }

    @Override
    public void o(String str, String str2) {
        un0 un0Var = ((bn0) this.f15393c).f34600a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            un0Var.N1(true, str2, (yk0) this.f15392b, this, un0Var.B1);
        } else {
            un0Var.M1(true, false);
        }
    }

    @Override
    public void p() {
        ((nu) this.f15392b).getText();
        ((g3) this.f15393c).b();
    }

    @Override
    public j9.y q(byte[] bArr) {
        byte[] bArr2;
        li.k kVar = (li.k) this.f15393c;
        if (kVar != null && (bArr2 = (byte[]) kVar.f14820b) != null && Arrays.equals(bArr2, bArr)) {
            j9.y yVar = (j9.y) ((li.k) this.f15393c).d;
            yVar.getClass();
            return yVar;
        }
        j9.y q6 = ((e2.d) this.f15392b).q(bArr);
        this.f15393c = new li.k(bArr, q6);
        return q6;
    }

    @Override
    public void t() {
        ((ne.k) this.f15392b).e((ne.l) this.f15393c);
    }

    public String toString() {
        switch (this.f15391a) {
            case 5:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f15393c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f15392b;
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
                return "Bounds{lower=" + ((i0.b) this.f15392b) + " upper=" + ((i0.b) this.f15393c) + "}";
            default:
                return super.toString();
        }
    }

    public void u(Object obj, String str) {
        ((ArrayList) this.f15392b).add(a1.g.D(str, "=", String.valueOf(obj)));
    }

    @Override
    public void v(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.save();
        canvas.clipRect(f7, f10, f11, f12);
        ((PhotoViewer) this.f15393c).T0(canvas, (pa) this.f15392b, -14277082, 855638016, false, true, true);
        canvas.drawColor(637534208);
        canvas.restore();
    }

    @Override
    public ColorFilter x() {
        switch (this.f15391a) {
            case 9:
                return g6.f20230v3;
            case 16:
                return g6.f20230v3;
            default:
                c6 c6Var = (c6) this.f15393c;
                if (c6Var == null) {
                    return g6.f20230v3;
                }
                return c6Var.x();
        }
    }

    public c(int i10, Object obj, Object obj2) {
        this.f15391a = i10;
        this.f15392b = obj;
        this.f15393c = obj2;
    }

    public c(Context context, int i10) {
        this.f15391a = i10;
        this.f15393c = null;
        this.f15392b = context;
    }

    public c(Object obj, int i10) {
        this.f15391a = i10;
        this.f15392b = obj;
    }

    public c(Object obj, Object obj2, boolean z10, int i10) {
        this.f15391a = i10;
        this.f15393c = obj;
        this.f15392b = obj2;
    }

    public c(Object obj) {
        this.f15391a = 5;
        this.f15393c = obj;
        this.f15392b = new ArrayList();
    }

    public c(k6.e eVar) {
        this.f15391a = 6;
        this.f15392b = new SparseIntArray();
        n6.l.h(eVar);
        this.f15393c = eVar;
    }

    public c(c6 c6Var) {
        this.f15391a = 17;
        this.f15392b = new SparseIntArray();
        this.f15393c = c6Var;
        w();
    }

    public c(jg0 jg0Var) {
        this.f15391a = 12;
        this.f15393c = jg0Var;
        this.f15392b = new yc0(this, 10);
    }

    public c(String str, String str2) {
        this.f15391a = 26;
        this.f15392b = str;
        this.f15393c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    public c(s4.h1 h1Var) {
        this.f15391a = 22;
        this.f15392b = h1Var;
        ?? obj = new Object();
        obj.f44885a = 0;
        this.f15393c = obj;
    }

    @Override
    public void b() {
    }

    @Override
    public void clear() {
    }

    @Override
    public void f0() {
    }

    @Override
    public void i1() {
    }

    @Override
    public void m() {
    }

    @Override
    public void r() {
    }

    public void w() {
    }

    @Override
    public void z() {
    }

    public c(int i10) {
        this.f15391a = 28;
        Bitmap createBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
        this.f15392b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.f15393c = new BitmapShader(createBitmap, tileMode, tileMode);
    }

    @Override
    public void E(float f7) {
    }

    @Override
    public void P(long j10) {
    }

    @Override
    public void R(boolean z10) {
    }

    @Override
    public void V(float f7) {
    }

    @Override
    public void a0(float f7) {
    }

    @Override
    public void e(int i10) {
    }

    @Override
    public void e0(float f7) {
    }

    @Override
    public void f(boolean z10) {
    }

    @Override
    public void g(float f7) {
    }

    @Override
    public void j(float f7) {
    }

    @Override
    public void l0(float f7) {
    }

    @Override
    public void q0(long j10) {
    }

    @Override
    public void s(float f7) {
    }

    @Override
    public void y(boolean z10) {
    }

    public c(EditText editText) {
        this.f15391a = 18;
        this.f15392b = editText;
        q1.i iVar = new q1.i(editText);
        this.f15393c = iVar;
        editText.addTextChangedListener(iVar);
        if (q1.a.f43236b == null) {
            synchronized (q1.a.f43235a) {
                try {
                    if (q1.a.f43236b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            q1.a.f43237c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, q1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        q1.a.f43236b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(q1.a.f43236b);
    }

    private final void J(int i10, int i11) {
    }

    private final void K(int i10, int i11) {
    }

    @Override
    public void B(float f7, int i10) {
    }

    @Override
    public void T(float f7, int i10) {
    }

    @Override
    public void d0(float f7, int i10) {
    }

    @Override
    public void n(long j10, boolean z10) {
    }

    @Override
    public void n0(int i10, long j10) {
    }

    public c(l31 l31Var) {
        this.f15391a = 16;
        this.f15393c = l31Var;
    }

    public c(PhotoViewer photoViewer) {
        this.f15391a = 15;
        this.f15393c = photoViewer;
        this.f15392b = new pa(photoViewer.f32198b0, photoViewer.f32226e0, 0, false);
    }
}
