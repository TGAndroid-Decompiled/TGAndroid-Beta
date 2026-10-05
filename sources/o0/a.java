package o0;

import a4.m;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.a2;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.oa;
import org.telegram.ui.Components.x01;
import org.telegram.ui.Components.yo0;
import org.telegram.ui.Components.yy0;
import org.telegram.ui.Components.z5;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.iv;
import org.telegram.ui.j5;
import org.telegram.ui.jv;
import org.telegram.ui.k7;
import org.telegram.ui.kn0;
import org.telegram.ui.kv0;
import org.telegram.ui.nl0;
import org.telegram.ui.sm0;
import org.telegram.ui.u6;
import org.telegram.ui.y21;
import org.telegram.ui.ym0;
import r0.i0;
import r0.n;
import s4.g1;
import s4.h1;
import u2.b1;
import w9.l;
public class a implements yo0, l1, k7, ym0, fh.a, d6, le.d, s, n5.b, SuccessContinuation, n, ce.b {
    public final int f16936a;
    public Object f16937b;
    public Object f16938c;

    public a(int i10, byte b10) {
        this.f16936a = i10;
    }

    @Override
    public boolean A1() {
        return false;
    }

    public View C(int i10, int i11, int i12, int i13) {
        int i14;
        g1 g1Var = (g1) this.f16938c;
        h1 h1Var = (h1) this.f16937b;
        int l4 = h1Var.l();
        int n10 = h1Var.n();
        if (i11 > i10) {
            i14 = 1;
        } else {
            i14 = -1;
        }
        View view = null;
        while (i10 != i11) {
            View p5 = h1Var.p(i10);
            int e7 = h1Var.e(p5);
            int r10 = h1Var.r(p5);
            g1Var.f46586b = l4;
            g1Var.f46587c = n10;
            g1Var.d = e7;
            g1Var.f46588e = r10;
            if (i12 != 0) {
                g1Var.f46585a = i12;
                if (g1Var.a()) {
                    return p5;
                }
            }
            if (i13 != 0) {
                g1Var.f46585a = i13;
                if (g1Var.a()) {
                    view = p5;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public boolean D(View view) {
        g1 g1Var = (g1) this.f16938c;
        h1 h1Var = (h1) this.f16937b;
        int l4 = h1Var.l();
        int n10 = h1Var.n();
        int e7 = h1Var.e(view);
        int r10 = h1Var.r(view);
        g1Var.f46586b = l4;
        g1Var.f46587c = n10;
        g1Var.d = e7;
        g1Var.f46588e = r10;
        g1Var.f46585a = 24579;
        return g1Var.a();
    }

    public void E(g gVar) {
        androidx.biometric.n nVar = (androidx.biometric.n) this.f16938c;
        m mVar = (m) this.f16937b;
        int i10 = gVar.f16953b;
        if (i10 == 0) {
            nVar.execute(new i9.s(19, mVar, gVar.f16952a));
        } else {
            nVar.execute(new q4(mVar, i10));
        }
    }

    @Override
    public boolean G1(u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public Paint H(String str) {
        switch (this.f16936a) {
            case 8:
                return i6.S0(str);
            default:
                d6 d6Var = (d6) this.f16938c;
                if (d6Var == null) {
                    return i6.S0(str);
                }
                return d6Var.H(str);
        }
    }

    @Override
    public int H0(int i10) {
        switch (this.f16936a) {
            case 8:
                SparseIntArray sparseIntArray = (SparseIntArray) this.f16937b;
                if (sparseIntArray != null) {
                    return sparseIntArray.get(i10);
                }
                return i6.w0(null, i10, false);
            default:
                SparseIntArray sparseIntArray2 = (SparseIntArray) this.f16937b;
                int indexOfKey = sparseIntArray2.indexOfKey(i10);
                if (indexOfKey >= 0) {
                    return sparseIntArray2.valueAt(indexOfKey);
                }
                d6 d6Var = (d6) this.f16938c;
                if (d6Var == null) {
                    return i6.w0(null, i10, false);
                }
                return d6Var.H0(i10);
        }
    }

    @Override
    public boolean I1() {
        return false;
    }

    public h0 K(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = (int[]) this.f16937b;
            if (i11 < iArr.length) {
                if (i10 == iArr[i11]) {
                    return ((b1[]) this.f16938c)[i11];
                }
                i11++;
            } else {
                e2.a.e("BaseMediaChunkOutput", "Unmatched track of type: " + i10);
                return new c3.n();
            }
        }
    }

    @Override
    public void L0(int i10, int i11) {
        switch (this.f16936a) {
            case 8:
                return;
            default:
                d6 d6Var = (d6) this.f16938c;
                if (d6Var != null) {
                    d6Var.L0(i10, i11);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean M0(long j3) {
        return ((x01) this.f16938c).v;
    }

    @Override
    public void N1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        nf.f.s(u1Var.getContext(), str);
    }

    @Override
    public CharacterStyle O1(u1 u1Var) {
        return null;
    }

    @Override
    public boolean P(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public boolean Q() {
        return false;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        z4.g gVar = (z4.g) this.f16938c;
        r0.l1 h = i0.h(view, l1Var);
        if (h.f45624a.n()) {
            return h;
        }
        Rect rect = (Rect) this.f16937b;
        rect.left = h.b();
        rect.top = h.d();
        rect.right = h.c();
        rect.bottom = h.a();
        int childCount = gVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.l1 b10 = i0.b(gVar.getChildAt(i10), h);
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
    public boolean R(u1 u1Var) {
        return false;
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public void V(float r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: o0.a.V(float, int):void");
    }

    @Override
    public boolean V1(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public int W() {
        return 0;
    }

    @Override
    public boolean W0(u1 u1Var, boolean z10) {
        return false;
    }

    @Override
    public void Y(float f7, boolean z10) {
        j5.f37571c = f7;
        ((TextView) this.f16937b).setText("Saturation " + (f7 * 5.0f));
        mw0 mw0Var = ((j5) this.f16938c).f37573b;
        mw0Var.N();
        mw0Var.M();
    }

    @Override
    public kv0 Y1() {
        return null;
    }

    @Override
    public hh.a Z() {
        return null;
    }

    @Override
    public boolean a() {
        switch (this.f16936a) {
            case 8:
            default:
                return i6.I.q();
        }
    }

    @Override
    public void a0(int i10, float f7, float f10, le.e eVar) {
        ph.i iVar = (ph.i) this.f16938c;
        iVar.f44730c.a(f7);
        iVar.d.a(f7);
        iVar.f44729b.a(f7);
        ((Runnable) this.f16937b).run();
    }

    @Override
    public boolean a2(long j3) {
        return ((x01) this.f16938c).f32783s;
    }

    @Override
    public void accept(java.lang.Object r53, java.lang.Object r54) {
        throw new UnsupportedOperationException("Method not decompiled: o0.a.accept(java.lang.Object, java.lang.Object):void");
    }

    @Override
    public ch.d b() {
        if (Build.VERSION.SDK_INT >= 29) {
            ch.e eVar = new ch.e(this);
            ((PhotoViewer) this.f16938c).Z.add(eVar);
            return eVar;
        }
        return new ch.f(this);
    }

    @Override
    public boolean b0(u1 u1Var) {
        return false;
    }

    @Override
    public void c(String str, String str2) {
        kn0 kn0Var = ((sm0) this.f16938c).f40550a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            kn0Var.O1(true, str2, (nl0) this.f16937b, this, kn0Var.B1);
        } else {
            kn0Var.N1(true, false);
        }
    }

    @Override
    public boolean c0(u1 u1Var, TLRPC.User user) {
        return false;
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
    public Object d(ce.c cVar, kd.c cVar2) {
        Object d = ((y) this.f16937b).d(new p(cVar, (za.y) this.f16938c), cVar2);
        if (d == jd.a.f14088a) {
            return d;
        }
        return gd.i.f10453a;
    }

    @Override
    public void dismiss() {
        ((jv) this.f16938c).dismiss();
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public void f(u6 u6Var, zh.a aVar, boolean z10) {
        jv jvVar = (jv) this.f16938c;
        iv ivVar = jvVar.X;
        if (aVar != null) {
            ((zh.b) this.f16937b).i(aVar);
            jvVar.f37785e0.e();
            zh.b bVar = jvVar.f37787g0;
            yy0[] yy0VarArr = jvVar.f37782b0;
            a2[] a2VarArr = jvVar.f37783c0;
            a2 a2Var = a2VarArr[0];
            if (a2Var != null) {
                yy0 yy0Var = yy0VarArr[0];
                boolean z11 = bVar.f53589m;
                yy0Var.f33371c = z11;
                a2Var.c(z11, true);
            }
            a2 a2Var2 = a2VarArr[1];
            if (a2Var2 != null) {
                yy0 yy0Var2 = yy0VarArr[1];
                boolean z12 = bVar.f53590n;
                yy0Var2.f33371c = z12;
                a2Var2.c(z12, true);
            }
            a2 a2Var3 = a2VarArr[2];
            if (a2Var3 != null) {
                yy0 yy0Var3 = yy0VarArr[2];
                boolean z13 = bVar.f53591o;
                yy0Var3.f33371c = z13;
                a2Var3.c(z13, true);
            }
            a2 a2Var4 = a2VarArr[3];
            if (a2Var4 != null) {
                yy0 yy0Var4 = yy0VarArr[3];
                boolean z14 = bVar.f53592p;
                yy0Var4.f33371c = z14;
                a2Var4.c(z14, true);
            }
            a2 a2Var5 = a2VarArr[4];
            if (a2Var5 != null) {
                yy0 yy0Var5 = yy0VarArr[4];
                boolean z15 = bVar.f53593q;
                yy0Var5.f33371c = z15;
                a2Var5.c(z15, true);
            }
            jvVar.f37781a0.a(ivVar.d(), true);
            ivVar.c(true);
        }
    }

    @Override
    public boolean f0() {
        return false;
    }

    @Override
    public boolean g() {
        return true;
    }

    @Override
    public Object mo28get() {
        rb.a aVar = new rb.a(23);
        qb.b bVar = new qb.b(23);
        Object mo28get = ((fd.a) this.f16937b).mo28get();
        fd.a aVar2 = (fd.a) this.f16938c;
        return new s5.g(aVar, bVar, s5.a.f46727f, (s5.i) mo28get, aVar2);
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public Drawable getDrawable(String str) {
        switch (this.f16936a) {
            case 8:
                return null;
            default:
                d6 d6Var = (d6) this.f16938c;
                if (d6Var == null) {
                    return i6.O0(str);
                }
                return d6Var.getDrawable(str);
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
    public int j0(int i10) {
        switch (this.f16936a) {
            case 8:
                return H0(i10);
            default:
                d6 d6Var = (d6) this.f16938c;
                if (d6Var == null) {
                    return i6.w0(null, i10, false);
                }
                return d6Var.j0(i10);
        }
    }

    @Override
    public int j1(int i10) {
        switch (this.f16936a) {
            case 8:
                return H0(i10);
            default:
                d6 d6Var = (d6) this.f16938c;
                if (d6Var == null) {
                    return i6.w0(null, i10, false);
                }
                return d6Var.j1(i10);
        }
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
        switch (this.f16936a) {
            case 8:
                i6.q(f7, f10, i10, i11);
                return;
            default:
                d6 d6Var = (d6) this.f16938c;
                if (d6Var == null) {
                    i6.q(f7, f10, i10, i11);
                    return;
                } else {
                    d6Var.m(f7, f10, i10, i11);
                    return;
                }
        }
    }

    @Override
    public boolean o0(z5 z5Var) {
        return false;
    }

    @Override
    public int p0() {
        return 0;
    }

    @Override
    public boolean r0() {
        switch (this.f16936a) {
            case 8:
                return false;
            default:
                d6 d6Var = (d6) this.f16938c;
                if (d6Var == null) {
                    return i6.a1();
                }
                return d6Var.r0();
        }
    }

    @Override
    public Task then(Object obj) {
        switch (this.f16936a) {
            case 22:
                da.a aVar = (da.a) obj;
                w9.n nVar = ((l) this.f16938c).f48960e;
                if (aVar == null) {
                    Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
                    return Tasks.forResult(null);
                }
                return Tasks.whenAll(w9.n.b(nVar), nVar.f48974m.y((Executor) this.f16937b, null));
            default:
                return ((w9.n) this.f16938c).f48967e.m(new u4.g(1, this, (Boolean) obj));
        }
    }

    public String toString() {
        switch (this.f16936a) {
            case 13:
                return "Bounds{lower=" + ((i0.b) this.f16937b) + " upper=" + ((i0.b) this.f16938c) + "}";
            default:
                return super.toString();
        }
    }

    @Override
    public void v(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.save();
        canvas.clipRect(f7, f10, f11, f12);
        ((PhotoViewer) this.f16938c).T0(canvas, (oa) this.f16937b, -14277082, 855638016, false, true, true);
        canvas.drawColor(637534208);
        canvas.restore();
    }

    @Override
    public boolean v2(int i10) {
        return false;
    }

    @Override
    public String w(long j3) {
        String trim = ((EditTextBoldCursor) this.f16937b).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (!((x01) this.f16938c).f32783s && TextUtils.isEmpty(trim)) {
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
        switch (this.f16936a) {
            case 8:
                return i6.f21159v3;
            default:
                d6 d6Var = (d6) this.f16938c;
                if (d6Var == null) {
                    return i6.f21159v3;
                }
                return d6Var.x();
        }
    }

    public ArrayList y() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        Context context = (Context) this.f16937b;
        Class cls = (Class) ((k2.e) this.f16938c).f14389b;
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
    public r9 z2() {
        return null;
    }

    public a(int i10, Object obj, Object obj2) {
        this.f16936a = i10;
        this.f16937b = obj;
        this.f16938c = obj2;
    }

    public a(Object obj, Object obj2, boolean z10, int i10) {
        this.f16936a = i10;
        this.f16938c = obj;
        this.f16937b = obj2;
    }

    public a(Context context) {
        this.f16936a = 26;
        this.f16938c = new AtomicLong(-1L);
        this.f16937b = new com.google.android.gms.common.api.j(context, p6.b.f44311k, new n6.p("mlkit:vision"), com.google.android.gms.common.api.i.f6485c);
    }

    public a(d6 d6Var) {
        this.f16936a = 9;
        this.f16937b = new SparseIntArray();
        this.f16938c = d6Var;
        q();
    }

    public a() {
        this.f16936a = 24;
        this.f16937b = new AtomicInteger();
        this.f16938c = new AtomicInteger();
    }

    public a(pg.i0 i0Var) {
        this.f16936a = 10;
        this.f16937b = i0Var;
    }

    public a(h1 h1Var) {
        this.f16936a = 15;
        this.f16937b = h1Var;
        ?? obj = new Object();
        obj.f46585a = 0;
        this.f16938c = obj;
    }

    public a(int i10) {
        this.f16936a = 20;
        Bitmap createBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
        this.f16937b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.f16938c = new BitmapShader(createBitmap, tileMode, tileMode);
    }

    @Override
    public void B() {
    }

    @Override
    public void R1() {
    }

    @Override
    public void clear() {
    }

    @Override
    public void i() {
    }

    @Override
    public void k1() {
    }

    @Override
    public void l() {
    }

    @Override
    public void p() {
    }

    public void q() {
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

    public a(l lVar, Executor executor, String str) {
        this.f16936a = 22;
        this.f16938c = lVar;
        this.f16937b = executor;
    }

    public a(z4.g gVar) {
        this.f16936a = 27;
        this.f16938c = gVar;
        this.f16937b = new Rect();
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
    public void F0(u1 u1Var) {
    }

    @Override
    public void G(u1 u1Var) {
    }

    @Override
    public void I0(u1 u1Var) {
    }

    @Override
    public void J(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void K1(u1 u1Var) {
    }

    @Override
    public void M(u1 u1Var) {
    }

    @Override
    public void M1(MessageObject messageObject) {
    }

    @Override
    public void N0(u1 u1Var) {
    }

    @Override
    public void O(MessageObject messageObject) {
    }

    @Override
    public void U(u1 u1Var) {
    }

    @Override
    public void X0(u1 u1Var) {
    }

    @Override
    public void Z0(u1 u1Var) {
    }

    @Override
    public void e0(int i10) {
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

    public a(y21 y21Var) {
        this.f16936a = 8;
        this.f16938c = y21Var;
    }

    public a(PhotoViewer photoViewer) {
        this.f16936a = 7;
        this.f16938c = photoViewer;
        this.f16937b = new oa(photoViewer.f33885b0, photoViewer.f33914e0, 0, false);
    }

    private final void I(int i10, int i11) {
    }

    @Override
    public void D1(u1 u1Var, boolean z10) {
    }

    @Override
    public void F(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void H1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void N(int i10, u1 u1Var) {
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
    public void j(u1 u1Var, bi.f fVar) {
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
    public void g0(u1 u1Var, float f7, float f10) {
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
    public void k(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void t2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void T(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void P1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
