package m5;

import a9.r;
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
import androidx.biometric.n;
import c3.h0;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import lf.h;
import n6.l;
import o0.g;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.a2;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.f3;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.py0;
import org.telegram.ui.Components.to0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.dn0;
import org.telegram.ui.f31;
import org.telegram.ui.i5;
import org.telegram.ui.j7;
import org.telegram.ui.jv;
import org.telegram.ui.kv;
import org.telegram.ui.pn0;
import org.telegram.ui.pv0;
import org.telegram.ui.s6;
import org.telegram.ui.sl0;
import org.telegram.ui.xm0;
import pg.i0;
import ph.i;
import s4.g1;
import s4.h1;
import s5.j;
import u2.b1;
import v7.j0;
public class e implements n5.b, to0, l1, j7, dn0, fh.a, f6, le.d, s, SuccessContinuation {
    public final int f14967a;
    public Object f14968b;
    public Object f14969c;

    public e(char c10, int i10) {
        this.f14967a = i10;
    }

    @Override
    public boolean B1() {
        return false;
    }

    @Override
    public void C(float r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: m5.e.C(float, int):void");
    }

    public View D(int i10, int i11, int i12, int i13) {
        int i14;
        g1 g1Var = (g1) this.f14969c;
        h1 h1Var = (h1) this.f14968b;
        int s10 = h1Var.s();
        int v = h1Var.v();
        if (i11 > i10) {
            i14 = 1;
        } else {
            i14 = -1;
        }
        View view = null;
        while (i10 != i11) {
            View I = h1Var.I(i10);
            int k10 = h1Var.k(I);
            int N = h1Var.N(I);
            g1Var.f43038b = s10;
            g1Var.f43039c = v;
            g1Var.d = k10;
            g1Var.e = N;
            if (i12 != 0) {
                g1Var.f43037a = i12;
                if (g1Var.a()) {
                    return I;
                }
            }
            if (i13 != 0) {
                g1Var.f43037a = i13;
                if (g1Var.a()) {
                    view = I;
                }
            }
            i10 += i14;
        }
        return view;
    }

    @Override
    public int F0(int i10) {
        switch (this.f14967a) {
            case 12:
                SparseIntArray sparseIntArray = (SparseIntArray) this.f14968b;
                if (sparseIntArray != null) {
                    return sparseIntArray.get(i10);
                }
                return j6.w0(null, i10, false);
            default:
                SparseIntArray sparseIntArray2 = (SparseIntArray) this.f14968b;
                int indexOfKey = sparseIntArray2.indexOfKey(i10);
                if (indexOfKey >= 0) {
                    return sparseIntArray2.valueAt(indexOfKey);
                }
                f6 f6Var = (f6) this.f14969c;
                if (f6Var == null) {
                    return j6.w0(null, i10, false);
                }
                return f6Var.F0(i10);
        }
    }

    @Override
    public Paint G(String str) {
        switch (this.f14967a) {
            case 12:
                return j6.S0(str);
            default:
                f6 f6Var = (f6) this.f14969c;
                if (f6Var == null) {
                    return j6.S0(str);
                }
                return f6Var.G(str);
        }
    }

    @Override
    public boolean G1(u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public void H(int i10, float f7, float f10, le.e eVar) {
        i iVar = (i) this.f14969c;
        iVar.f41390c.a(f7);
        iVar.d.a(f7);
        iVar.f41389b.a(f7);
        ((Runnable) this.f14968b).run();
    }

    @Override
    public void H0(s6 s6Var, zh.a aVar, boolean z10) {
        kv kvVar = (kv) this.f14969c;
        jv jvVar = kvVar.X;
        if (aVar != null) {
            ((zh.b) this.f14968b).i(aVar);
            kvVar.f35262e0.e();
            zh.b bVar = kvVar.f35264g0;
            py0[] py0VarArr = kvVar.f35259b0;
            a2[] a2VarArr = kvVar.f35260c0;
            a2 a2Var = a2VarArr[0];
            if (a2Var != null) {
                py0 py0Var = py0VarArr[0];
                boolean z11 = bVar.f49526m;
                py0Var.f27450c = z11;
                a2Var.c(z11, true);
            }
            a2 a2Var2 = a2VarArr[1];
            if (a2Var2 != null) {
                py0 py0Var2 = py0VarArr[1];
                boolean z12 = bVar.f49527n;
                py0Var2.f27450c = z12;
                a2Var2.c(z12, true);
            }
            a2 a2Var3 = a2VarArr[2];
            if (a2Var3 != null) {
                py0 py0Var3 = py0VarArr[2];
                boolean z13 = bVar.f49528o;
                py0Var3.f27450c = z13;
                a2Var3.c(z13, true);
            }
            a2 a2Var4 = a2VarArr[3];
            if (a2Var4 != null) {
                py0 py0Var4 = py0VarArr[3];
                boolean z14 = bVar.f49529p;
                py0Var4.f27450c = z14;
                a2Var4.c(z14, true);
            }
            a2 a2Var5 = a2VarArr[4];
            if (a2Var5 != null) {
                py0 py0Var5 = py0VarArr[4];
                boolean z15 = bVar.f49530q;
                py0Var5.f27450c = z15;
                a2Var5.c(z15, true);
            }
            kvVar.f35258a0.a(jvVar.d(), true);
            jvVar.c(true);
        }
    }

    @Override
    public boolean I1() {
        return false;
    }

    public boolean J(View view) {
        g1 g1Var = (g1) this.f14969c;
        h1 h1Var = (h1) this.f14968b;
        int s10 = h1Var.s();
        int v = h1Var.v();
        int k10 = h1Var.k(view);
        int N = h1Var.N(view);
        g1Var.f43038b = s10;
        g1Var.f43039c = v;
        g1Var.d = k10;
        g1Var.e = N;
        g1Var.f43037a = 24579;
        return g1Var.a();
    }

    public void K(g gVar) {
        n nVar = (n) this.f14969c;
        a6.i iVar = (a6.i) this.f14968b;
        int i10 = gVar.f15500b;
        if (i10 == 0) {
            nVar.execute(new i9.s(19, iVar, gVar.f15499a));
        } else {
            nVar.execute(new q4(iVar, i10));
        }
    }

    @Override
    public void L0(int i10, int i11) {
        switch (this.f14967a) {
            case 12:
                return;
            default:
                f6 f6Var = (f6) this.f14969c;
                if (f6Var != null) {
                    f6Var.L0(i10, i11);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean N0(long j3) {
        return ((o01) this.f14969c).v;
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
    public boolean Q1(u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public int V() {
        return 0;
    }

    @Override
    public boolean V1(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    public h0 W(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = (int[]) this.f14968b;
            if (i11 < iArr.length) {
                if (i10 == iArr[i11]) {
                    return ((b1[]) this.f14969c)[i11];
                }
                i11++;
            } else {
                e2.a.e("BaseMediaChunkOutput", "Unmatched track of type: " + i10);
                return new c3.n();
            }
        }
    }

    @Override
    public void X(float f7, boolean z10) {
        i5.f34374c = f7;
        ((TextView) this.f14968b).setText("Saturation " + (f7 * 5.0f));
        cw0 cw0Var = ((i5) this.f14969c).f34375b;
        cw0Var.N();
        cw0Var.M();
    }

    @Override
    public boolean X0(u1 u1Var, boolean z10) {
        return false;
    }

    @Override
    public hh.a Y() {
        return null;
    }

    @Override
    public pv0 Y1() {
        return null;
    }

    public int Z(Context context, com.google.android.gms.common.api.c cVar) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.f14968b;
        l.h(context);
        l.h(cVar);
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
            i10 = ((k6.e) this.f14969c).d(context, l4);
        }
        sparseIntArray.put(l4, i10);
        return i10;
    }

    @Override
    public boolean a() {
        switch (this.f14967a) {
            case 12:
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
        return ((o01) this.f14969c).f26947s;
    }

    @Override
    public void accept(java.lang.Object r53, java.lang.Object r54) {
        throw new UnsupportedOperationException("Method not decompiled: m5.e.accept(java.lang.Object, java.lang.Object):void");
    }

    @Override
    public void b(String str, String str2) {
        pn0 pn0Var = ((xm0) this.f14969c).f39646a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            pn0Var.O1(true, str2, (sl0) this.f14968b, this, pn0Var.B1);
        } else {
            pn0Var.N1(true, false);
        }
    }

    @Override
    public boolean b0(u1 u1Var, TLRPC.User user) {
        return false;
    }

    public void c(Object obj, String str) {
        ((ArrayList) this.f14968b).add(a4.a.C(str, "=", String.valueOf(obj)));
    }

    @Override
    public boolean c2(u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public boolean d1(int i10, u1 u1Var) {
        return false;
    }

    @Override
    public void dismiss() {
        ((kv) this.f14969c).dismiss();
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
    public int f0(int i10) {
        switch (this.f14967a) {
            case 12:
                return F0(i10);
            default:
                f6 f6Var = (f6) this.f14969c;
                if (f6Var == null) {
                    return j6.w0(null, i10, false);
                }
                return f6Var.f0(i10);
        }
    }

    @Override
    public int g1(int i10) {
        switch (this.f14967a) {
            case 12:
                return F0(i10);
            default:
                f6 f6Var = (f6) this.f14969c;
                if (f6Var == null) {
                    return j6.w0(null, i10, false);
                }
                return f6Var.g1(i10);
        }
    }

    @Override
    public Object mo28get() {
        switch (this.f14967a) {
            case 0:
                return new d((Context) ((r) this.f14968b).f350a, (h) ((android.support.v4.media.c) this.f14969c).mo28get());
            default:
                rb.a aVar = new rb.a(23);
                qb.b bVar = new qb.b(23);
                j jVar = (j) ((fd.a) this.f14968b).mo28get();
                return new s5.h(aVar, bVar, s5.a.f43164f, jVar, (fd.a) this.f14969c);
        }
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public Drawable getDrawable(String str) {
        switch (this.f14967a) {
            case 12:
                return null;
            default:
                f6 f6Var = (f6) this.f14969c;
                if (f6Var == null) {
                    return j6.O0(str);
                }
                return f6Var.getDrawable(str);
        }
    }

    @Override
    public String h(u1 u1Var) {
        return null;
    }

    @Override
    public int i0(u1 u1Var) {
        return 0;
    }

    @Override
    public boolean i1(MessageObject messageObject) {
        return c1.a(messageObject);
    }

    @Override
    public ch.d l() {
        if (Build.VERSION.SDK_INT >= 29) {
            ch.e eVar = new ch.e(this);
            ((PhotoViewer) this.f14969c).Z.add(eVar);
            return eVar;
        }
        return new ch.f(this);
    }

    @Override
    public int l0() {
        return 0;
    }

    @Override
    public boolean l2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        switch (this.f14967a) {
            case 12:
                j6.q(f7, f10, i10, i11);
                return;
            default:
                f6 f6Var = (f6) this.f14969c;
                if (f6Var == null) {
                    j6.q(f7, f10, i10, i11);
                    return;
                } else {
                    f6Var.m(f7, f10, i10, i11);
                    return;
                }
        }
    }

    @Override
    public boolean m0() {
        return false;
    }

    @Override
    public boolean n0() {
        switch (this.f14967a) {
            case 12:
                return false;
            default:
                f6 f6Var = (f6) this.f14969c;
                if (f6Var == null) {
                    return j6.a1();
                }
                return f6Var.n0();
        }
    }

    @Override
    public boolean p0(y5 y5Var) {
        return false;
    }

    public ArrayList q() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        Context context = (Context) this.f14968b;
        Class cls = ((fb.e) this.f14969c).f9020a;
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
        switch (this.f14967a) {
            case 27:
                da.a aVar = (da.a) obj;
                w9.n nVar = ((w9.l) this.f14969c).e;
                if (aVar == null) {
                    Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
                    return Tasks.forResult(null);
                }
                return Tasks.whenAll(w9.n.b(nVar), nVar.f45264m.y((Executor) this.f14968b, null));
            default:
                return ((w9.n) this.f14969c).e.l(new u4.g(1, this, (Boolean) obj));
        }
    }

    public String toString() {
        switch (this.f14967a) {
            case 2:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f14969c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f14968b;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    sb2.append((String) arrayList.get(i10));
                    if (i10 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            case 17:
                return "Bounds{lower=" + ((i0.b) this.f14968b) + " upper=" + ((i0.b) this.f14969c) + "}";
            default:
                return super.toString();
        }
    }

    @Override
    public void v(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.save();
        canvas.clipRect(f7, f10, f11, f12);
        ((PhotoViewer) this.f14969c).T0(canvas, (ma) this.f14968b, -14277082, 855638016, false, true, true);
        canvas.drawColor(637534208);
        canvas.restore();
    }

    @Override
    public boolean v2(int i10) {
        return false;
    }

    @Override
    public String w(long j3) {
        String trim = ((EditTextBoldCursor) this.f14968b).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (!((o01) this.f14969c).f26947s && TextUtils.isEmpty(trim)) {
            return null;
        }
        return trim;
    }

    @Override
    public ColorFilter x() {
        switch (this.f14967a) {
            case 12:
                return j6.f19437v3;
            default:
                f6 f6Var = (f6) this.f14969c;
                if (f6Var == null) {
                    return j6.f19437v3;
                }
                return f6Var.x();
        }
    }

    @Override
    public boolean x0(MessageObject messageObject) {
        return true;
    }

    public byte[] y(n3.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.f14969c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f14968b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.f15161a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(aVar.f15162b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f15163c);
            dataOutputStream.writeLong(aVar.d);
            dataOutputStream.write(aVar.e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public s9 z2() {
        return null;
    }

    public e(int i10, Object obj, Object obj2) {
        this.f14967a = i10;
        this.f14968b = obj;
        this.f14969c = obj2;
    }

    public e(Object obj, Object obj2, boolean z10, int i10) {
        this.f14967a = i10;
        this.f14969c = obj;
        this.f14968b = obj2;
    }

    public e(Object obj) {
        this.f14967a = 2;
        this.f14969c = obj;
        this.f14968b = new ArrayList();
    }

    public e(k6.e eVar) {
        this.f14967a = 3;
        this.f14968b = new SparseIntArray();
        l.h(eVar);
        this.f14969c = eVar;
    }

    public e(f6 f6Var) {
        this.f14967a = 13;
        this.f14968b = new SparseIntArray();
        this.f14969c = f6Var;
        g();
    }

    public e(int i10, byte b10) {
        this.f14967a = i10;
        switch (i10) {
            case 29:
                this.f14968b = new AtomicInteger();
                this.f14969c = new AtomicInteger();
                return;
            default:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f14968b = byteArrayOutputStream;
                this.f14969c = new DataOutputStream(byteArrayOutputStream);
                return;
        }
    }

    public e(i0 i0Var) {
        this.f14967a = 14;
        this.f14968b = i0Var;
    }

    public e(f3 f3Var) {
        this.f14967a = 21;
        Context context = (Context) f3Var.f20284b;
        int e = w9.h.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (e != 0) {
            this.f14968b = "Unity";
            String string = context.getResources().getString(e);
            this.f14969c = string;
            String g10 = j0.g("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", g10, null);
                return;
            }
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream open = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (open != null) {
                    open.close();
                }
                this.f14968b = "Flutter";
                this.f14969c = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
                this.f14968b = null;
                this.f14969c = null;
            }
        }
        this.f14968b = null;
        this.f14969c = null;
    }

    @Override
    public void A0() {
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
    public void d() {
    }

    public void g() {
    }

    @Override
    public void h1() {
    }

    @Override
    public void k() {
    }

    @Override
    public void l1() {
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
    public void A(u1 u1Var) {
    }

    @Override
    public void D1(u1 u1Var) {
    }

    @Override
    public void E0(u1 u1Var) {
    }

    @Override
    public void F(u1 u1Var) {
    }

    @Override
    public void G0(u1 u1Var) {
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void J0(u1 u1Var) {
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
    public void O0(u1 u1Var) {
    }

    @Override
    public void T(u1 u1Var) {
    }

    @Override
    public void Y0(u1 u1Var) {
    }

    @Override
    public void a1(u1 u1Var) {
    }

    @Override
    public void d0(int i10) {
    }

    @Override
    public void e2(u1 u1Var) {
    }

    @Override
    public void j0(u1 u1Var) {
    }

    @Override
    public void m2(u1 u1Var) {
    }

    @Override
    public void o(u1 u1Var) {
    }

    @Override
    public void o0(String str) {
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
    public void z(u1 u1Var) {
    }

    @Override
    public void z0(u1 u1Var) {
    }

    private final void U(int i10, int i11) {
    }

    @Override
    public void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void E1(u1 u1Var, boolean z10) {
    }

    @Override
    public void H1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void M(int i10, u1 u1Var) {
    }

    @Override
    public void Q0(int i10, u1 u1Var) {
    }

    @Override
    public void S0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
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
    public void n1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void q1(u1 u1Var, TLRPC.Document document) {
    }

    public e(h1 h1Var) {
        this.f14967a = 19;
        this.f14968b = h1Var;
        ?? obj = new Object();
        obj.f43037a = 0;
        this.f14969c = obj;
    }

    public e(int i10) {
        this.f14967a = 25;
        Bitmap createBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
        this.f14968b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.f14969c = new BitmapShader(createBitmap, tileMode, tileMode);
    }

    public e(w9.l lVar, Executor executor, String str) {
        this.f14967a = 27;
        this.f14969c = lVar;
        this.f14968b = executor;
    }

    public e(f31 f31Var) {
        this.f14967a = 12;
        this.f14969c = f31Var;
    }

    public e(PhotoViewer photoViewer) {
        this.f14967a = 11;
        this.f14969c = photoViewer;
        this.f14968b = new ma(photoViewer.f31214b0, photoViewer.f31242e0, 0, false);
    }

    @Override
    public void B0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void C0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void W0(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void g0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void r0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void v1(u1 u1Var, float f7, float f10) {
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
    public void u0(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void w0(u1 u1Var, float f7, float f10, boolean z10) {
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
