package m5;

import a4.m;
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
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.m01;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.ny0;
import org.telegram.ui.Components.ro0;
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
import u4.g;
import v7.j0;
import w9.k;
public class e implements n5.b, ro0, l1, j7, dn0, fh.a, f6, le.d, s, SuccessContinuation {
    public final int f14952a;
    public Object f14953b;
    public Object f14954c;

    public e(char c10, int i10) {
        this.f14952a = i10;
    }

    @Override
    public boolean B1() {
        return false;
    }

    @Override
    public void C(float r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: m5.e.C(float, int):void");
    }

    @Override
    public void D(int i10, float f7, float f10, le.e eVar) {
        i iVar = (i) this.f14954c;
        iVar.f41368c.a(f7);
        iVar.d.a(f7);
        iVar.f41367b.a(f7);
        ((Runnable) this.f14953b).run();
    }

    @Override
    public int F0(int i10) {
        switch (this.f14952a) {
            case 12:
                SparseIntArray sparseIntArray = (SparseIntArray) this.f14953b;
                if (sparseIntArray != null) {
                    return sparseIntArray.get(i10);
                }
                return j6.w0(null, i10, false);
            default:
                SparseIntArray sparseIntArray2 = (SparseIntArray) this.f14953b;
                int indexOfKey = sparseIntArray2.indexOfKey(i10);
                if (indexOfKey >= 0) {
                    return sparseIntArray2.valueAt(indexOfKey);
                }
                f6 f6Var = (f6) this.f14954c;
                if (f6Var == null) {
                    return j6.w0(null, i10, false);
                }
                return f6Var.F0(i10);
        }
    }

    @Override
    public Paint G(String str) {
        switch (this.f14952a) {
            case 12:
                return j6.S0(str);
            default:
                f6 f6Var = (f6) this.f14954c;
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

    public View H(int i10, int i11, int i12, int i13) {
        int i14;
        g1 g1Var = (g1) this.f14954c;
        h1 h1Var = (h1) this.f14953b;
        int g10 = h1Var.g();
        int x10 = h1Var.x();
        if (i11 > i10) {
            i14 = 1;
        } else {
            i14 = -1;
        }
        View view = null;
        while (i10 != i11) {
            View C = h1Var.C(i10);
            int c10 = h1Var.c(C);
            int D = h1Var.D(C);
            g1Var.f43017b = g10;
            g1Var.f43018c = x10;
            g1Var.d = c10;
            g1Var.e = D;
            if (i12 != 0) {
                g1Var.f43016a = i12;
                if (g1Var.a()) {
                    return C;
                }
            }
            if (i13 != 0) {
                g1Var.f43016a = i13;
                if (g1Var.a()) {
                    view = C;
                }
            }
            i10 += i14;
        }
        return view;
    }

    @Override
    public void H0(s6 s6Var, zh.a aVar, boolean z10) {
        kv kvVar = (kv) this.f14954c;
        jv jvVar = kvVar.X;
        if (aVar != null) {
            ((zh.b) this.f14953b).i(aVar);
            kvVar.f35244e0.e();
            zh.b bVar = kvVar.f35246g0;
            ny0[] ny0VarArr = kvVar.f35241b0;
            a2[] a2VarArr = kvVar.f35242c0;
            a2 a2Var = a2VarArr[0];
            if (a2Var != null) {
                ny0 ny0Var = ny0VarArr[0];
                boolean z11 = bVar.f49505m;
                ny0Var.f26756c = z11;
                a2Var.c(z11, true);
            }
            a2 a2Var2 = a2VarArr[1];
            if (a2Var2 != null) {
                ny0 ny0Var2 = ny0VarArr[1];
                boolean z12 = bVar.f49506n;
                ny0Var2.f26756c = z12;
                a2Var2.c(z12, true);
            }
            a2 a2Var3 = a2VarArr[2];
            if (a2Var3 != null) {
                ny0 ny0Var3 = ny0VarArr[2];
                boolean z13 = bVar.f49507o;
                ny0Var3.f26756c = z13;
                a2Var3.c(z13, true);
            }
            a2 a2Var4 = a2VarArr[3];
            if (a2Var4 != null) {
                ny0 ny0Var4 = ny0VarArr[3];
                boolean z14 = bVar.f49508p;
                ny0Var4.f26756c = z14;
                a2Var4.c(z14, true);
            }
            a2 a2Var5 = a2VarArr[4];
            if (a2Var5 != null) {
                ny0 ny0Var5 = ny0VarArr[4];
                boolean z15 = bVar.f49509q;
                ny0Var5.f26756c = z15;
                a2Var5.c(z15, true);
            }
            kvVar.f35240a0.a(jvVar.d(), true);
            jvVar.c(true);
        }
    }

    @Override
    public boolean I1() {
        return false;
    }

    public boolean J(View view) {
        g1 g1Var = (g1) this.f14954c;
        h1 h1Var = (h1) this.f14953b;
        int g10 = h1Var.g();
        int x10 = h1Var.x();
        int c10 = h1Var.c(view);
        int D = h1Var.D(view);
        g1Var.f43017b = g10;
        g1Var.f43018c = x10;
        g1Var.d = c10;
        g1Var.e = D;
        g1Var.f43016a = 24579;
        return g1Var.a();
    }

    public void K(o0.f fVar) {
        n nVar = (n) this.f14954c;
        a6.i iVar = (a6.i) this.f14953b;
        int i10 = fVar.f15485b;
        if (i10 == 0) {
            nVar.execute(new i9.s(19, iVar, fVar.f15484a));
        } else {
            nVar.execute(new q4(iVar, i10));
        }
    }

    @Override
    public void L0(int i10, int i11) {
        switch (this.f14952a) {
            case 12:
                return;
            default:
                f6 f6Var = (f6) this.f14954c;
                if (f6Var != null) {
                    f6Var.L0(i10, i11);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean N0(long j3) {
        return ((m01) this.f14954c).v;
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
            int[] iArr = (int[]) this.f14953b;
            if (i11 < iArr.length) {
                if (i10 == iArr[i11]) {
                    return ((b1[]) this.f14954c)[i11];
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
        i5.f34354c = f7;
        ((TextView) this.f14953b).setText("Saturation " + (f7 * 5.0f));
        aw0 aw0Var = ((i5) this.f14954c).f34355b;
        aw0Var.N();
        aw0Var.M();
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
        SparseIntArray sparseIntArray = (SparseIntArray) this.f14953b;
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
            i10 = ((k6.e) this.f14954c).d(context, l4);
        }
        sparseIntArray.put(l4, i10);
        return i10;
    }

    @Override
    public boolean a() {
        switch (this.f14952a) {
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
        return ((m01) this.f14954c).f26288s;
    }

    @Override
    public void accept(java.lang.Object r53, java.lang.Object r54) {
        throw new UnsupportedOperationException("Method not decompiled: m5.e.accept(java.lang.Object, java.lang.Object):void");
    }

    @Override
    public boolean b0(u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public void c(String str, String str2) {
        pn0 pn0Var = ((xm0) this.f14954c).f39626a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            pn0Var.O1(true, str2, (sl0) this.f14953b, this, pn0Var.B1);
        } else {
            pn0Var.N1(true, false);
        }
    }

    @Override
    public boolean c2(u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public ch.d d() {
        if (Build.VERSION.SDK_INT >= 29) {
            ch.e eVar = new ch.e(this);
            ((PhotoViewer) this.f14954c).Z.add(eVar);
            return eVar;
        }
        return new ch.f(this);
    }

    @Override
    public boolean d1(int i10, u1 u1Var) {
        return false;
    }

    @Override
    public void dismiss() {
        ((kv) this.f14954c).dismiss();
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
        switch (this.f14952a) {
            case 12:
                return F0(i10);
            default:
                f6 f6Var = (f6) this.f14954c;
                if (f6Var == null) {
                    return j6.w0(null, i10, false);
                }
                return f6Var.f0(i10);
        }
    }

    public void g(Object obj, String str) {
        ((ArrayList) this.f14953b).add(a4.a.C(str, "=", String.valueOf(obj)));
    }

    @Override
    public int g1(int i10) {
        switch (this.f14952a) {
            case 12:
                return F0(i10);
            default:
                f6 f6Var = (f6) this.f14954c;
                if (f6Var == null) {
                    return j6.w0(null, i10, false);
                }
                return f6Var.g1(i10);
        }
    }

    @Override
    public Object mo28get() {
        switch (this.f14952a) {
            case 0:
                return new d((Context) ((r) this.f14953b).f353a, (h) ((m) this.f14954c).mo28get());
            default:
                rb.a aVar = new rb.a(23);
                qb.b bVar = new qb.b(23);
                j jVar = (j) ((fd.a) this.f14953b).mo28get();
                return new s5.h(aVar, bVar, s5.a.f43143f, jVar, (fd.a) this.f14954c);
        }
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public Drawable getDrawable(String str) {
        switch (this.f14952a) {
            case 12:
                return null;
            default:
                f6 f6Var = (f6) this.f14954c;
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
    public int l0() {
        return 0;
    }

    @Override
    public boolean l2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        switch (this.f14952a) {
            case 12:
                j6.q(f7, f10, i10, i11);
                return;
            default:
                f6 f6Var = (f6) this.f14954c;
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
        switch (this.f14952a) {
            case 12:
                return false;
            default:
                f6 f6Var = (f6) this.f14954c;
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
        Context context = (Context) this.f14953b;
        Class cls = (Class) ((n2.e) this.f14954c).f15112b;
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
        switch (this.f14952a) {
            case 27:
                da.a aVar = (da.a) obj;
                w9.m mVar = ((k) this.f14954c).e;
                if (aVar == null) {
                    Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
                    return Tasks.forResult(null);
                }
                return Tasks.whenAll(w9.m.b(mVar), mVar.f45243m.y((Executor) this.f14953b, null));
            default:
                return ((w9.m) this.f14954c).e.l(new g(1, this, (Boolean) obj));
        }
    }

    public String toString() {
        switch (this.f14952a) {
            case 2:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f14954c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f14953b;
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
                return "Bounds{lower=" + ((i0.b) this.f14953b) + " upper=" + ((i0.b) this.f14954c) + "}";
            default:
                return super.toString();
        }
    }

    public byte[] v(n3.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.f14954c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f14953b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.f15148a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(aVar.f15149b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f15150c);
            dataOutputStream.writeLong(aVar.d);
            dataOutputStream.write(aVar.e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean v2(int i10) {
        return false;
    }

    @Override
    public String w(long j3) {
        String trim = ((EditTextBoldCursor) this.f14953b).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (!((m01) this.f14954c).f26288s && TextUtils.isEmpty(trim)) {
            return null;
        }
        return trim;
    }

    @Override
    public ColorFilter x() {
        switch (this.f14952a) {
            case 12:
                return j6.f19422v3;
            default:
                f6 f6Var = (f6) this.f14954c;
                if (f6Var == null) {
                    return j6.f19422v3;
                }
                return f6Var.x();
        }
    }

    @Override
    public boolean x0(MessageObject messageObject) {
        return true;
    }

    @Override
    public void y(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.save();
        canvas.clipRect(f7, f10, f11, f12);
        ((PhotoViewer) this.f14954c).T0(canvas, (ma) this.f14953b, -14277082, 855638016, false, true, true);
        canvas.drawColor(637534208);
        canvas.restore();
    }

    @Override
    public s9 z2() {
        return null;
    }

    public e(int i10, Object obj, Object obj2) {
        this.f14952a = i10;
        this.f14953b = obj;
        this.f14954c = obj2;
    }

    public e(Object obj, Object obj2, boolean z10, int i10) {
        this.f14952a = i10;
        this.f14954c = obj;
        this.f14953b = obj2;
    }

    public e(Object obj) {
        this.f14952a = 2;
        this.f14954c = obj;
        this.f14953b = new ArrayList();
    }

    public e(k6.e eVar) {
        this.f14952a = 3;
        this.f14953b = new SparseIntArray();
        l.h(eVar);
        this.f14954c = eVar;
    }

    public e(f6 f6Var) {
        this.f14952a = 13;
        this.f14953b = new SparseIntArray();
        this.f14954c = f6Var;
        l();
    }

    public e(int i10, byte b10) {
        this.f14952a = i10;
        switch (i10) {
            case 29:
                this.f14953b = new AtomicInteger();
                this.f14954c = new AtomicInteger();
                return;
            default:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f14953b = byteArrayOutputStream;
                this.f14954c = new DataOutputStream(byteArrayOutputStream);
                return;
        }
    }

    public e(i0 i0Var) {
        this.f14952a = 14;
        this.f14953b = i0Var;
    }

    public e(f3 f3Var) {
        this.f14952a = 21;
        Context context = (Context) f3Var.f20269b;
        int e = w9.h.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (e != 0) {
            this.f14953b = "Unity";
            String string = context.getResources().getString(e);
            this.f14954c = string;
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
                this.f14953b = "Flutter";
                this.f14954c = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
                this.f14953b = null;
                this.f14954c = null;
            }
        }
        this.f14953b = null;
        this.f14954c = null;
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
    public void b() {
    }

    @Override
    public void clear() {
    }

    @Override
    public void h1() {
    }

    @Override
    public void k() {
    }

    public void l() {
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
        this.f14952a = 19;
        this.f14953b = h1Var;
        ?? obj = new Object();
        obj.f43016a = 0;
        this.f14954c = obj;
    }

    public e(int i10) {
        this.f14952a = 25;
        Bitmap createBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
        this.f14953b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.f14954c = new BitmapShader(createBitmap, tileMode, tileMode);
    }

    public e(k kVar, Executor executor, String str) {
        this.f14952a = 27;
        this.f14954c = kVar;
        this.f14953b = executor;
    }

    public e(f31 f31Var) {
        this.f14952a = 12;
        this.f14954c = f31Var;
    }

    public e(PhotoViewer photoViewer) {
        this.f14952a = 11;
        this.f14954c = photoViewer;
        this.f14953b = new ma(photoViewer.f31193b0, photoViewer.f31221e0, 0, false);
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
