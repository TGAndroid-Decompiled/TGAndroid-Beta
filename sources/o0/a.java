package o0;

import ai.q4;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import c3.h0;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import k1.p;
import k2.u;
import n4.y;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.ul;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.z1;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a01;
import org.telegram.ui.Components.by0;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.z5;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.fv;
import org.telegram.ui.gv;
import org.telegram.ui.i7;
import org.telegram.ui.in0;
import org.telegram.ui.iv0;
import org.telegram.ui.j5;
import org.telegram.ui.jl0;
import org.telegram.ui.qm0;
import org.telegram.ui.s6;
import org.telegram.ui.wm0;
import org.telegram.ui.x21;
import r0.i0;
import r0.l1;
import r0.n;
import s4.g1;
import s4.h1;
import u2.z0;
import w9.m;
import za.a0;
public class a implements eo0, k1, i7, wm0, fh.a, d6, le.e, s, n5.b, SuccessContinuation, n, ce.b {
    public final int f15274a;
    public Object f15275b;
    public Object f15276c;

    public a(int i10, byte b10) {
        this.f15274a = i10;
    }

    @Override
    public boolean A1() {
        return false;
    }

    @Override
    public void C(float r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: o0.a.C(float, int):void");
    }

    @Override
    public void D(int i10, float f7, float f10, le.f fVar) {
        ph.i iVar = (ph.i) this.f15276c;
        iVar.f41019c.a(f7);
        iVar.d.a(f7);
        iVar.f41018b.a(f7);
        ((Runnable) this.f15275b).run();
    }

    @Override
    public Paint G(String str) {
        switch (this.f15274a) {
            case 8:
                return h6.S0(str);
            default:
                d6 d6Var = (d6) this.f15276c;
                if (d6Var == null) {
                    return h6.S0(str);
                }
                return d6Var.G(str);
        }
    }

    @Override
    public int G0(int i10) {
        switch (this.f15274a) {
            case 8:
                SparseIntArray sparseIntArray = (SparseIntArray) this.f15275b;
                if (sparseIntArray != null) {
                    return sparseIntArray.get(i10);
                }
                return h6.w0(null, i10, false);
            default:
                SparseIntArray sparseIntArray2 = (SparseIntArray) this.f15275b;
                int indexOfKey = sparseIntArray2.indexOfKey(i10);
                if (indexOfKey >= 0) {
                    return sparseIntArray2.valueAt(indexOfKey);
                }
                d6 d6Var = (d6) this.f15276c;
                if (d6Var == null) {
                    return h6.w0(null, i10, false);
                }
                return d6Var.G0(i10);
        }
    }

    @Override
    public boolean G1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public Object H(ce.c cVar, kd.c cVar2) {
        Object H = ((y) this.f15275b).H(new p(cVar, (a0) this.f15276c), cVar2);
        if (H == jd.a.f12959a) {
            return H;
        }
        return gd.i.f9603a;
    }

    @Override
    public void H0(s6 s6Var, zh.a aVar, boolean z10) {
        gv gvVar = (gv) this.f15276c;
        fv fvVar = gvVar.X;
        if (aVar != null) {
            ((zh.b) this.f15275b).i(aVar);
            gvVar.f33664e0.d();
            zh.b bVar = gvVar.f33666g0;
            by0[] by0VarArr = gvVar.f33661b0;
            z1[] z1VarArr = gvVar.f33662c0;
            z1 z1Var = z1VarArr[0];
            if (z1Var != null) {
                by0 by0Var = by0VarArr[0];
                boolean z11 = bVar.f49152m;
                by0Var.f22862c = z11;
                z1Var.c(z11, true);
            }
            z1 z1Var2 = z1VarArr[1];
            if (z1Var2 != null) {
                by0 by0Var2 = by0VarArr[1];
                boolean z12 = bVar.f49153n;
                by0Var2.f22862c = z12;
                z1Var2.c(z12, true);
            }
            z1 z1Var3 = z1VarArr[2];
            if (z1Var3 != null) {
                by0 by0Var3 = by0VarArr[2];
                boolean z13 = bVar.f49154o;
                by0Var3.f22862c = z13;
                z1Var3.c(z13, true);
            }
            z1 z1Var4 = z1VarArr[3];
            if (z1Var4 != null) {
                by0 by0Var4 = by0VarArr[3];
                boolean z14 = bVar.f49155p;
                by0Var4.f22862c = z14;
                z1Var4.c(z14, true);
            }
            z1 z1Var5 = z1VarArr[4];
            if (z1Var5 != null) {
                by0 by0Var5 = by0VarArr[4];
                boolean z15 = bVar.f49156q;
                by0Var5.f22862c = z15;
                z1Var5.c(z15, true);
            }
            gvVar.f33660a0.a(fvVar.d(), true);
            fvVar.c(true);
        }
    }

    @Override
    public boolean I1() {
        return false;
    }

    public void J(g gVar) {
        androidx.biometric.n nVar = (androidx.biometric.n) this.f15276c;
        a6.i iVar = (a6.i) this.f15275b;
        int i10 = gVar.f15289b;
        if (i10 == 0) {
            nVar.execute(new i9.s(19, iVar, gVar.f15288a));
        } else {
            nVar.execute(new q4(iVar, i10));
        }
    }

    @Override
    public void L0(int i10, int i11) {
        switch (this.f15274a) {
            case 8:
                return;
            default:
                d6 d6Var = (d6) this.f15276c;
                if (d6Var != null) {
                    d6Var.L0(i10, i11);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean M0(long j3) {
        return ((a01) this.f15276c).v;
    }

    @Override
    public void N1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        nf.f.s(t1Var.getContext(), str);
    }

    @Override
    public boolean O(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public CharacterStyle O1(t1 t1Var) {
        return null;
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public boolean Q(t1 t1Var) {
        return false;
    }

    @Override
    public l1 Q0(View view, l1 l1Var) {
        z4.g gVar = (z4.g) this.f15276c;
        l1 h = i0.h(view, l1Var);
        if (h.f41807a.n()) {
            return h;
        }
        Rect rect = (Rect) this.f15275b;
        rect.left = h.b();
        rect.top = h.d();
        rect.right = h.c();
        rect.bottom = h.a();
        int childCount = gVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            l1 b10 = i0.b(gVar.getChildAt(i10), h);
            rect.left = Math.min(b10.b(), rect.left);
            rect.top = Math.min(b10.d(), rect.top);
            rect.right = Math.min(b10.c(), rect.right);
            rect.bottom = Math.min(b10.a(), rect.bottom);
        }
        return h.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override
    public boolean Q1(t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public boolean R() {
        return false;
    }

    public h0 U(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = (int[]) this.f15275b;
            if (i11 < iArr.length) {
                if (i10 == iArr[i11]) {
                    return ((z0[]) this.f15276c)[i11];
                }
                i11++;
            } else {
                e2.a.e("BaseMediaChunkOutput", "Unmatched track of type: " + i10);
                return new c3.n();
            }
        }
    }

    @Override
    public int V() {
        return 0;
    }

    @Override
    public boolean V1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean W0(t1 t1Var, boolean z10) {
        return false;
    }

    @Override
    public void X(float f7, boolean z10) {
        j5.f34325c = f7;
        ((TextView) this.f15275b).setText("Saturation " + (f7 * 5.0f));
        pv0 pv0Var = ((j5) this.f15276c).f34326b;
        pv0Var.N();
        pv0Var.M();
    }

    @Override
    public hh.a Y() {
        return null;
    }

    @Override
    public iv0 Y1() {
        return null;
    }

    @Override
    public boolean a() {
        switch (this.f15274a) {
            case 8:
            default:
                return h6.I.q();
        }
    }

    @Override
    public boolean a0(t1 t1Var) {
        return false;
    }

    @Override
    public boolean a2(long j3) {
        return ((a01) this.f15276c).f22282s;
    }

    @Override
    public void accept(java.lang.Object r53, java.lang.Object r54) {
        throw new UnsupportedOperationException("Method not decompiled: o0.a.accept(java.lang.Object, java.lang.Object):void");
    }

    @Override
    public void b(String str, String str2) {
        in0 in0Var = ((qm0) this.f15276c).f36476a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            in0Var.O1(true, str2, (jl0) this.f15275b, this, in0Var.B1);
        } else {
            in0Var.N1(true, false);
        }
    }

    @Override
    public boolean b0(t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean c1(int i10, t1 t1Var) {
        return false;
    }

    @Override
    public boolean c2(t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public void dismiss() {
        ((gv) this.f15276c).dismiss();
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public boolean e0() {
        return false;
    }

    @Override
    public boolean f() {
        return true;
    }

    public ArrayList g() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        Context context = (Context) this.f15275b;
        Class cls = (Class) ((u) this.f15276c).f13371b;
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

    @Override
    public int g0(int i10) {
        switch (this.f15274a) {
            case 8:
                return G0(i10);
            default:
                d6 d6Var = (d6) this.f15276c;
                if (d6Var == null) {
                    return h6.w0(null, i10, false);
                }
                return d6Var.g0(i10);
        }
    }

    @Override
    public int g1(int i10) {
        switch (this.f15274a) {
            case 8:
                return G0(i10);
            default:
                d6 d6Var = (d6) this.f15276c;
                if (d6Var == null) {
                    return h6.w0(null, i10, false);
                }
                return d6Var.g1(i10);
        }
    }

    @Override
    public Object mo28get() {
        rb.a aVar = new rb.a(23);
        qb.b bVar = new qb.b(23);
        Object mo28get = ((fd.a) this.f15275b).mo28get();
        fd.a aVar2 = (fd.a) this.f15276c;
        return new s5.g(aVar, bVar, s5.a.f42796f, (s5.i) mo28get, aVar2);
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public Drawable getDrawable(String str) {
        switch (this.f15274a) {
            case 8:
                return null;
            default:
                d6 d6Var = (d6) this.f15276c;
                if (d6Var == null) {
                    return h6.O0(str);
                }
                return d6Var.getDrawable(str);
        }
    }

    @Override
    public String h(t1 t1Var) {
        return null;
    }

    @Override
    public int h0(t1 t1Var) {
        return 0;
    }

    @Override
    public boolean h1(MessageObject messageObject) {
        return ul.a(messageObject);
    }

    @Override
    public ch.d l() {
        if (Build.VERSION.SDK_INT >= 29) {
            ch.e eVar = new ch.e(this);
            ((PhotoViewer) this.f15276c).Z.add(eVar);
            return eVar;
        }
        return new ch.f(this);
    }

    @Override
    public boolean l0() {
        return false;
    }

    @Override
    public boolean l2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        switch (this.f15274a) {
            case 8:
                h6.q(f7, f10, i10, i11);
                return;
            default:
                d6 d6Var = (d6) this.f15276c;
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
    public int m0() {
        return 0;
    }

    @Override
    public boolean o0(z5 z5Var) {
        return false;
    }

    @Override
    public boolean p0() {
        switch (this.f15274a) {
            case 8:
                return false;
            default:
                d6 d6Var = (d6) this.f15276c;
                if (d6Var == null) {
                    return h6.a1();
                }
                return d6Var.p0();
        }
    }

    public View q(int i10, int i11, int i12, int i13) {
        int i14;
        g1 g1Var = (g1) this.f15276c;
        h1 h1Var = (h1) this.f15275b;
        int u10 = h1Var.u();
        int x10 = h1Var.x();
        if (i11 > i10) {
            i14 = 1;
        } else {
            i14 = -1;
        }
        View view = null;
        while (i10 != i11) {
            View I = h1Var.I(i10);
            int d = h1Var.d(I);
            int N = h1Var.N(I);
            g1Var.f42670b = u10;
            g1Var.f42671c = x10;
            g1Var.d = d;
            g1Var.e = N;
            if (i12 != 0) {
                g1Var.f42669a = i12;
                if (g1Var.a()) {
                    return I;
                }
            }
            if (i13 != 0) {
                g1Var.f42669a = i13;
                if (g1Var.a()) {
                    view = I;
                }
            }
            i10 += i14;
        }
        return view;
    }

    @Override
    public Task then(Object obj) {
        switch (this.f15274a) {
            case 22:
                da.a aVar = (da.a) obj;
                m mVar = ((w9.k) this.f15276c).e;
                if (aVar == null) {
                    Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
                    return Tasks.forResult(null);
                }
                return Tasks.whenAll(m.b(mVar), mVar.f44895m.y((Executor) this.f15275b, null));
            default:
                return ((m) this.f15276c).e.l(new u4.g(1, this, (Boolean) obj));
        }
    }

    public String toString() {
        switch (this.f15274a) {
            case 13:
                return "Bounds{lower=" + ((i0.b) this.f15275b) + " upper=" + ((i0.b) this.f15276c) + "}";
            default:
                return super.toString();
        }
    }

    public boolean v(View view) {
        g1 g1Var = (g1) this.f15276c;
        h1 h1Var = (h1) this.f15275b;
        int u10 = h1Var.u();
        int x10 = h1Var.x();
        int d = h1Var.d(view);
        int N = h1Var.N(view);
        g1Var.f42670b = u10;
        g1Var.f42671c = x10;
        g1Var.d = d;
        g1Var.e = N;
        g1Var.f42669a = 24579;
        return g1Var.a();
    }

    @Override
    public boolean v2(int i10) {
        return false;
    }

    @Override
    public String w(long j3) {
        String trim = ((EditTextBoldCursor) this.f15275b).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (!((a01) this.f15276c).f22282s && TextUtils.isEmpty(trim)) {
            return null;
        }
        return trim;
    }

    @Override
    public boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override
    public ColorFilter x() {
        switch (this.f15274a) {
            case 8:
                return h6.f19115v3;
            default:
                d6 d6Var = (d6) this.f15276c;
                if (d6Var == null) {
                    return h6.f19115v3;
                }
                return d6Var.x();
        }
    }

    @Override
    public void y(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.save();
        canvas.clipRect(f7, f10, f11, f12);
        ((PhotoViewer) this.f15276c).T0(canvas, (na) this.f15275b, -14277082, 855638016, false, true, true);
        canvas.drawColor(637534208);
        canvas.restore();
    }

    @Override
    public s9 z2() {
        return null;
    }

    public a(int i10, Object obj, Object obj2) {
        this.f15274a = i10;
        this.f15275b = obj;
        this.f15276c = obj2;
    }

    public a(Object obj, Object obj2, boolean z10, int i10) {
        this.f15274a = i10;
        this.f15276c = obj;
        this.f15275b = obj2;
    }

    public a(Context context) {
        this.f15274a = 26;
        this.f15276c = new AtomicLong(-1L);
        this.f15275b = new com.google.android.gms.common.api.j(context, p6.b.f40642k, new n6.p("mlkit:vision"), com.google.android.gms.common.api.i.f6017c);
    }

    public a(d6 d6Var) {
        this.f15274a = 9;
        this.f15275b = new SparseIntArray();
        this.f15276c = d6Var;
        c();
    }

    public a() {
        this.f15274a = 24;
        this.f15275b = new AtomicInteger();
        this.f15276c = new AtomicInteger();
    }

    public a(pg.i0 i0Var) {
        this.f15274a = 10;
        this.f15275b = i0Var;
    }

    public a(h1 h1Var) {
        this.f15274a = 15;
        this.f15275b = h1Var;
        ?? obj = new Object();
        obj.f42669a = 0;
        this.f15276c = obj;
    }

    public a(int i10) {
        this.f15274a = 20;
        Bitmap createBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
        this.f15275b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.f15276c = new BitmapShader(createBitmap, tileMode, tileMode);
    }

    @Override
    public void B() {
    }

    @Override
    public void R1() {
    }

    public void c() {
    }

    @Override
    public void clear() {
    }

    @Override
    public void d() {
    }

    @Override
    public void i1() {
    }

    @Override
    public void k() {
    }

    @Override
    public void k1() {
    }

    @Override
    public void p() {
    }

    @Override
    public void q2() {
    }

    @Override
    public void s() {
    }

    @Override
    public void x2() {
    }

    @Override
    public void z0() {
    }

    public a(w9.k kVar, Executor executor, String str) {
        this.f15274a = 22;
        this.f15276c = kVar;
        this.f15275b = executor;
    }

    public a(z4.g gVar) {
        this.f15274a = 27;
        this.f15276c = gVar;
        this.f15275b = new Rect();
    }

    @Override
    public void A(t1 t1Var) {
    }

    @Override
    public void C1(t1 t1Var) {
    }

    @Override
    public void D0(t1 t1Var) {
    }

    @Override
    public void F(t1 t1Var) {
    }

    @Override
    public void F0(t1 t1Var) {
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void I0(t1 t1Var) {
    }

    @Override
    public void K1(t1 t1Var) {
    }

    @Override
    public void L(t1 t1Var) {
    }

    @Override
    public void M1(MessageObject messageObject) {
    }

    @Override
    public void N(MessageObject messageObject) {
    }

    @Override
    public void N0(t1 t1Var) {
    }

    @Override
    public void T(t1 t1Var) {
    }

    @Override
    public void X0(t1 t1Var) {
    }

    @Override
    public void Z0(t1 t1Var) {
    }

    @Override
    public void d0(int i10) {
    }

    @Override
    public void e2(t1 t1Var) {
    }

    @Override
    public void i0(t1 t1Var) {
    }

    @Override
    public void m2(t1 t1Var) {
    }

    @Override
    public void n0(String str) {
    }

    @Override
    public void o(t1 t1Var) {
    }

    @Override
    public void r(t1 t1Var) {
    }

    @Override
    public void t(t1 t1Var) {
    }

    @Override
    public void u(t1 t1Var) {
    }

    @Override
    public void y0(t1 t1Var) {
    }

    @Override
    public void z(t1 t1Var) {
    }

    public a(x21 x21Var) {
        this.f15274a = 8;
        this.f15276c = x21Var;
    }

    public a(PhotoViewer photoViewer) {
        this.f15274a = 7;
        this.f15276c = photoViewer;
        this.f15275b = new na(photoViewer.f30880b0, photoViewer.f30908e0, 0, false);
    }

    private final void K(int i10, int i11) {
    }

    @Override
    public void D1(t1 t1Var, boolean z10) {
    }

    @Override
    public void E(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void H1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void M(int i10, t1 t1Var) {
    }

    @Override
    public void P0(int i10, t1 t1Var) {
    }

    @Override
    public void R0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void T1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void g2(t1 t1Var, long j3) {
    }

    @Override
    public void i(t1 t1Var, bi.f fVar) {
    }

    @Override
    public void m1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void p1(t1 t1Var, TLRPC.Document document) {
    }

    @Override
    public void A0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void B0(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void V0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void f0(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void q0(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void u1(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void y2(t1 t1Var, int i10, int i11) {
    }

    @Override
    public void U1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void n(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void t0(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void v0(t1 t1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void b2(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void j(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void t2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void S(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void P1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
