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
import n4.y;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.a2;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.z5;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.dn0;
import org.telegram.ui.e31;
import org.telegram.ui.i5;
import org.telegram.ui.j7;
import org.telegram.ui.jv;
import org.telegram.ui.kv;
import org.telegram.ui.pn0;
import org.telegram.ui.pv0;
import org.telegram.ui.s6;
import org.telegram.ui.sl0;
import org.telegram.ui.xm0;
import r0.i0;
import r0.m1;
import r0.n;
import s4.g1;
import s4.h1;
import u2.a1;
import w9.m;
public class a implements so0, l1, j7, dn0, fh.a, e6, le.d, s, n5.b, SuccessContinuation, n, ce.b {
    public final int f15438a;
    public Object f15439b;
    public Object f15440c;

    public a(int i10, byte b10) {
        this.f15438a = i10;
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
    public void D(int i10, float f7, float f10, le.e eVar) {
        ph.i iVar = (ph.i) this.f15440c;
        iVar.f41327c.a(f7);
        iVar.d.a(f7);
        iVar.f41326b.a(f7);
        ((Runnable) this.f15439b).run();
    }

    @Override
    public Paint G(String str) {
        switch (this.f15438a) {
            case 8:
                return j6.S0(str);
            default:
                e6 e6Var = (e6) this.f15440c;
                if (e6Var == null) {
                    return j6.S0(str);
                }
                return e6Var.G(str);
        }
    }

    @Override
    public int G0(int i10) {
        switch (this.f15438a) {
            case 8:
                SparseIntArray sparseIntArray = (SparseIntArray) this.f15439b;
                if (sparseIntArray != null) {
                    return sparseIntArray.get(i10);
                }
                return j6.w0(null, i10, false);
            default:
                SparseIntArray sparseIntArray2 = (SparseIntArray) this.f15439b;
                int indexOfKey = sparseIntArray2.indexOfKey(i10);
                if (indexOfKey >= 0) {
                    return sparseIntArray2.valueAt(indexOfKey);
                }
                e6 e6Var = (e6) this.f15440c;
                if (e6Var == null) {
                    return j6.w0(null, i10, false);
                }
                return e6Var.G0(i10);
        }
    }

    @Override
    public boolean G1(u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    public boolean H(View view) {
        g1 g1Var = (g1) this.f15440c;
        h1 h1Var = (h1) this.f15439b;
        int g10 = h1Var.g();
        int x10 = h1Var.x();
        int c10 = h1Var.c(view);
        int C = h1Var.C(view);
        g1Var.f42972b = g10;
        g1Var.f42973c = x10;
        g1Var.d = c10;
        g1Var.e = C;
        g1Var.f42971a = 24579;
        return g1Var.a();
    }

    @Override
    public void H0(s6 s6Var, zh.a aVar, boolean z10) {
        kv kvVar = (kv) this.f15440c;
        jv jvVar = kvVar.X;
        if (aVar != null) {
            ((zh.b) this.f15439b).i(aVar);
            kvVar.f35181e0.e();
            zh.b bVar = kvVar.f35183g0;
            oy0[] oy0VarArr = kvVar.f35178b0;
            a2[] a2VarArr = kvVar.f35179c0;
            a2 a2Var = a2VarArr[0];
            if (a2Var != null) {
                oy0 oy0Var = oy0VarArr[0];
                boolean z11 = bVar.f49459m;
                oy0Var.f27074c = z11;
                a2Var.c(z11, true);
            }
            a2 a2Var2 = a2VarArr[1];
            if (a2Var2 != null) {
                oy0 oy0Var2 = oy0VarArr[1];
                boolean z12 = bVar.f49460n;
                oy0Var2.f27074c = z12;
                a2Var2.c(z12, true);
            }
            a2 a2Var3 = a2VarArr[2];
            if (a2Var3 != null) {
                oy0 oy0Var3 = oy0VarArr[2];
                boolean z13 = bVar.f49461o;
                oy0Var3.f27074c = z13;
                a2Var3.c(z13, true);
            }
            a2 a2Var4 = a2VarArr[3];
            if (a2Var4 != null) {
                oy0 oy0Var4 = oy0VarArr[3];
                boolean z14 = bVar.f49462p;
                oy0Var4.f27074c = z14;
                a2Var4.c(z14, true);
            }
            a2 a2Var5 = a2VarArr[4];
            if (a2Var5 != null) {
                oy0 oy0Var5 = oy0VarArr[4];
                boolean z15 = bVar.f49463q;
                oy0Var5.f27074c = z15;
                a2Var5.c(z15, true);
            }
            kvVar.f35177a0.a(jvVar.d(), true);
            jvVar.c(true);
        }
    }

    @Override
    public boolean I1() {
        return false;
    }

    public void J(g gVar) {
        androidx.biometric.n nVar = (androidx.biometric.n) this.f15440c;
        a6.i iVar = (a6.i) this.f15439b;
        int i10 = gVar.f15453b;
        if (i10 == 0) {
            nVar.execute(new i9.s(19, iVar, gVar.f15452a));
        } else {
            nVar.execute(new q4(iVar, i10));
        }
    }

    @Override
    public void L0(int i10, int i11) {
        switch (this.f15438a) {
            case 8:
                return;
            default:
                e6 e6Var = (e6) this.f15440c;
                if (e6Var != null) {
                    e6Var.L0(i10, i11);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean M0(long j3) {
        return ((n01) this.f15440c).v;
    }

    @Override
    public void N1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        nf.f.s(u1Var.getContext(), str);
    }

    @Override
    public boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public CharacterStyle O1(u1 u1Var) {
        return null;
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public boolean Q(u1 u1Var) {
        return false;
    }

    @Override
    public m1 Q0(View view, m1 m1Var) {
        z4.g gVar = (z4.g) this.f15440c;
        m1 h = i0.h(view, m1Var);
        if (h.f42109a.n()) {
            return h;
        }
        Rect rect = (Rect) this.f15439b;
        rect.left = h.b();
        rect.top = h.d();
        rect.right = h.c();
        rect.bottom = h.a();
        int childCount = gVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            m1 b10 = i0.b(gVar.getChildAt(i10), h);
            rect.left = Math.min(b10.b(), rect.left);
            rect.top = Math.min(b10.d(), rect.top);
            rect.right = Math.min(b10.c(), rect.right);
            rect.bottom = Math.min(b10.a(), rect.bottom);
        }
        return h.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override
    public boolean Q1(u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public boolean R() {
        return false;
    }

    public h0 U(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = (int[]) this.f15439b;
            if (i11 < iArr.length) {
                if (i10 == iArr[i11]) {
                    return ((a1[]) this.f15440c)[i11];
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
    public boolean V1(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean W0(u1 u1Var, boolean z10) {
        return false;
    }

    @Override
    public void X(float f7, boolean z10) {
        i5.f34310c = f7;
        ((TextView) this.f15439b).setText("Saturation " + (f7 * 5.0f));
        bw0 bw0Var = ((i5) this.f15440c).f34311b;
        bw0Var.N();
        bw0Var.M();
    }

    @Override
    public hh.a Y() {
        return null;
    }

    @Override
    public pv0 Y1() {
        return null;
    }

    @Override
    public boolean a() {
        switch (this.f15438a) {
            case 8:
            default:
                return j6.I.q();
        }
    }

    @Override
    public boolean a0(u1 u1Var) {
        return false;
    }

    @Override
    public boolean a2(long j3) {
        return ((n01) this.f15440c).f26585s;
    }

    @Override
    public void accept(java.lang.Object r53, java.lang.Object r54) {
        throw new UnsupportedOperationException("Method not decompiled: o0.a.accept(java.lang.Object, java.lang.Object):void");
    }

    @Override
    public boolean b0(u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public void c(String str, String str2) {
        pn0 pn0Var = ((xm0) this.f15440c).f39521a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            pn0Var.O1(true, str2, (sl0) this.f15439b, this, pn0Var.B1);
        } else {
            pn0Var.N1(true, false);
        }
    }

    @Override
    public boolean c1(int i10, u1 u1Var) {
        return false;
    }

    @Override
    public boolean c2(u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public ch.d d() {
        if (Build.VERSION.SDK_INT >= 29) {
            ch.e eVar = new ch.e(this);
            ((PhotoViewer) this.f15440c).Z.add(eVar);
            return eVar;
        }
        return new ch.f(this);
    }

    @Override
    public void dismiss() {
        ((kv) this.f15440c).dismiss();
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

    @Override
    public int g0(int i10) {
        switch (this.f15438a) {
            case 8:
                return G0(i10);
            default:
                e6 e6Var = (e6) this.f15440c;
                if (e6Var == null) {
                    return j6.w0(null, i10, false);
                }
                return e6Var.g0(i10);
        }
    }

    @Override
    public int g1(int i10) {
        switch (this.f15438a) {
            case 8:
                return G0(i10);
            default:
                e6 e6Var = (e6) this.f15440c;
                if (e6Var == null) {
                    return j6.w0(null, i10, false);
                }
                return e6Var.g1(i10);
        }
    }

    @Override
    public Object mo28get() {
        rb.a aVar = new rb.a(23);
        qb.b bVar = new qb.b(23);
        Object mo28get = ((fd.a) this.f15439b).mo28get();
        fd.a aVar2 = (fd.a) this.f15440c;
        return new s5.h(aVar, bVar, s5.a.f43098f, (s5.j) mo28get, aVar2);
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public Drawable getDrawable(String str) {
        switch (this.f15438a) {
            case 8:
                return null;
            default:
                e6 e6Var = (e6) this.f15440c;
                if (e6Var == null) {
                    return j6.O0(str);
                }
                return e6Var.getDrawable(str);
        }
    }

    @Override
    public String h(u1 u1Var) {
        return null;
    }

    @Override
    public int h0(u1 u1Var) {
        return 0;
    }

    @Override
    public boolean h1(MessageObject messageObject) {
        return c1.a(messageObject);
    }

    @Override
    public Object l(ce.c cVar, kd.c cVar2) {
        Object l4 = ((y) this.f15439b).l(new p(cVar, (za.y) this.f15440c), cVar2);
        if (l4 == jd.a.f12970a) {
            return l4;
        }
        return gd.i.f9620a;
    }

    @Override
    public boolean l0() {
        return false;
    }

    @Override
    public boolean l2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        switch (this.f15438a) {
            case 8:
                j6.q(f7, f10, i10, i11);
                return;
            default:
                e6 e6Var = (e6) this.f15440c;
                if (e6Var == null) {
                    j6.q(f7, f10, i10, i11);
                    return;
                } else {
                    e6Var.m(f7, f10, i10, i11);
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
        switch (this.f15438a) {
            case 8:
                return false;
            default:
                e6 e6Var = (e6) this.f15440c;
                if (e6Var == null) {
                    return j6.a1();
                }
                return e6Var.p0();
        }
    }

    public ArrayList q() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        Context context = (Context) this.f15439b;
        Class cls = (Class) ((n2.e) this.f15440c).f15073b;
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
    public Task then(Object obj) {
        switch (this.f15438a) {
            case 22:
                da.a aVar = (da.a) obj;
                m mVar = ((w9.k) this.f15440c).e;
                if (aVar == null) {
                    Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
                    return Tasks.forResult(null);
                }
                return Tasks.whenAll(m.b(mVar), mVar.f45199m.y((Executor) this.f15439b, null));
            default:
                return ((m) this.f15440c).e.l(new u4.g(1, this, (Boolean) obj));
        }
    }

    public String toString() {
        switch (this.f15438a) {
            case 13:
                return "Bounds{lower=" + ((i0.b) this.f15439b) + " upper=" + ((i0.b) this.f15440c) + "}";
            default:
                return super.toString();
        }
    }

    public View v(int i10, int i11, int i12, int i13) {
        int i14;
        g1 g1Var = (g1) this.f15440c;
        h1 h1Var = (h1) this.f15439b;
        int g10 = h1Var.g();
        int x10 = h1Var.x();
        if (i11 > i10) {
            i14 = 1;
        } else {
            i14 = -1;
        }
        View view = null;
        while (i10 != i11) {
            View y3 = h1Var.y(i10);
            int c10 = h1Var.c(y3);
            int C = h1Var.C(y3);
            g1Var.f42972b = g10;
            g1Var.f42973c = x10;
            g1Var.d = c10;
            g1Var.e = C;
            if (i12 != 0) {
                g1Var.f42971a = i12;
                if (g1Var.a()) {
                    return y3;
                }
            }
            if (i13 != 0) {
                g1Var.f42971a = i13;
                if (g1Var.a()) {
                    view = y3;
                }
            }
            i10 += i14;
        }
        return view;
    }

    @Override
    public boolean v2(int i10) {
        return false;
    }

    @Override
    public String w(long j3) {
        String trim = ((EditTextBoldCursor) this.f15439b).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (!((n01) this.f15440c).f26585s && TextUtils.isEmpty(trim)) {
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
        switch (this.f15438a) {
            case 8:
                return j6.f19390v3;
            default:
                e6 e6Var = (e6) this.f15440c;
                if (e6Var == null) {
                    return j6.f19390v3;
                }
                return e6Var.x();
        }
    }

    @Override
    public void y(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.save();
        canvas.clipRect(f7, f10, f11, f12);
        ((PhotoViewer) this.f15440c).T0(canvas, (na) this.f15439b, -14277082, 855638016, false, true, true);
        canvas.drawColor(637534208);
        canvas.restore();
    }

    @Override
    public r9 z2() {
        return null;
    }

    public a(int i10, Object obj, Object obj2) {
        this.f15438a = i10;
        this.f15439b = obj;
        this.f15440c = obj2;
    }

    public a(Object obj, Object obj2, boolean z10, int i10) {
        this.f15438a = i10;
        this.f15440c = obj;
        this.f15439b = obj2;
    }

    public a(Context context) {
        this.f15438a = 26;
        this.f15440c = new AtomicLong(-1L);
        this.f15439b = new com.google.android.gms.common.api.j(context, p6.b.f40944k, new n6.p("mlkit:vision"), com.google.android.gms.common.api.i.f6034c);
    }

    public a(e6 e6Var) {
        this.f15438a = 9;
        this.f15439b = new SparseIntArray();
        this.f15440c = e6Var;
        g();
    }

    public a() {
        this.f15438a = 24;
        this.f15439b = new AtomicInteger();
        this.f15440c = new AtomicInteger();
    }

    public a(pg.i0 i0Var) {
        this.f15438a = 10;
        this.f15439b = i0Var;
    }

    public a(h1 h1Var) {
        this.f15438a = 15;
        this.f15439b = h1Var;
        ?? obj = new Object();
        obj.f42971a = 0;
        this.f15440c = obj;
    }

    public a(int i10) {
        this.f15438a = 20;
        Bitmap createBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
        this.f15439b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.f15440c = new BitmapShader(createBitmap, tileMode, tileMode);
    }

    @Override
    public void B() {
    }

    @Override
    public void R1() {
    }

    @Override
    public void b() {
    }

    @Override
    public void clear() {
    }

    public void g() {
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
        this.f15438a = 22;
        this.f15440c = kVar;
        this.f15439b = executor;
    }

    public a(z4.g gVar) {
        this.f15438a = 27;
        this.f15440c = gVar;
        this.f15439b = new Rect();
    }

    @Override
    public void A(u1 u1Var) {
    }

    @Override
    public void C1(u1 u1Var) {
    }

    @Override
    public void D0(u1 u1Var) {
    }

    @Override
    public void F(u1 u1Var) {
    }

    @Override
    public void F0(u1 u1Var) {
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void I0(u1 u1Var) {
    }

    @Override
    public void K1(u1 u1Var) {
    }

    @Override
    public void L(u1 u1Var) {
    }

    @Override
    public void M1(MessageObject messageObject) {
    }

    @Override
    public void N(MessageObject messageObject) {
    }

    @Override
    public void N0(u1 u1Var) {
    }

    @Override
    public void T(u1 u1Var) {
    }

    @Override
    public void X0(u1 u1Var) {
    }

    @Override
    public void Z0(u1 u1Var) {
    }

    @Override
    public void d0(int i10) {
    }

    @Override
    public void e2(u1 u1Var) {
    }

    @Override
    public void i0(u1 u1Var) {
    }

    @Override
    public void m2(u1 u1Var) {
    }

    @Override
    public void n0(String str) {
    }

    @Override
    public void o(u1 u1Var) {
    }

    @Override
    public void r(u1 u1Var) {
    }

    @Override
    public void t(u1 u1Var) {
    }

    @Override
    public void u(u1 u1Var) {
    }

    @Override
    public void y0(u1 u1Var) {
    }

    @Override
    public void z(u1 u1Var) {
    }

    public a(e31 e31Var) {
        this.f15438a = 8;
        this.f15440c = e31Var;
    }

    public a(PhotoViewer photoViewer) {
        this.f15438a = 7;
        this.f15440c = photoViewer;
        this.f15439b = new na(photoViewer.f31153b0, photoViewer.f31181e0, 0, false);
    }

    private final void K(int i10, int i11) {
    }

    @Override
    public void D1(u1 u1Var, boolean z10) {
    }

    @Override
    public void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void H1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void M(int i10, u1 u1Var) {
    }

    @Override
    public void P0(int i10, u1 u1Var) {
    }

    @Override
    public void R0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void T1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void g2(u1 u1Var, long j3) {
    }

    @Override
    public void i(u1 u1Var, bi.f fVar) {
    }

    @Override
    public void m1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void p1(u1 u1Var, TLRPC.Document document) {
    }

    @Override
    public void A0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void B0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void V0(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void f0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void q0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void u1(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void y2(u1 u1Var, int i10, int i11) {
    }

    @Override
    public void U1(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void n(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void t0(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void v0(u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void b2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void j(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void t2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void S(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void P1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
