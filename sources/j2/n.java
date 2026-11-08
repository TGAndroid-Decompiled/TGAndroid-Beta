package j2;

import a8.p0;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Editable;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import c8.s9;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.o0;
import fi.za;
import h2.k0;
import h2.m0;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import li.f1;
import li.g0;
import li.g1;
import li.i0;
import li.j0;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.dt;
import org.telegram.messenger.id;
import org.telegram.messenger.me;
import org.telegram.messenger.pi;
import org.telegram.messenger.qp;
import org.telegram.messenger.qr;
import org.telegram.messenger.qs;
import org.telegram.messenger.qz;
import org.telegram.messenger.sz;
import org.telegram.messenger.ui;
import org.telegram.tgnet.SerializedData;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Cells.h4;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Components.ej0;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.t51;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.Components.xn;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.an;
import org.telegram.ui.by0;
import org.telegram.ui.c8;
import org.telegram.ui.dz0;
import org.telegram.ui.e8;
import org.telegram.ui.ex;
import org.telegram.ui.gx0;
import org.telegram.ui.h5;
import org.telegram.ui.h8;
import org.telegram.ui.hy0;
import org.telegram.ui.i7;
import org.telegram.ui.j4;
import org.telegram.ui.s6;
import org.telegram.ui.vt;
import org.telegram.ui.wt;
import org.telegram.ui.zw;
import org.xml.sax.Attributes;
public final class n implements g, j6.n, ja.a, c4.m, f1, f3.i, com.google.android.gms.common.api.internal.p, lm0, qr, xn, za, i7, ej0, q51, h2.d, q5.b, s2.t {
    public final int f16455a;
    public Object f16456b;
    public Object f16457c;

    public n(int i7, Object obj, Object obj2) {
        this.f16455a = i7;
        this.f16457c = obj;
        this.f16456b = obj2;
    }

    public static void U(n nVar, l2.c cVar) {
        nVar.getClass();
        for (Map.Entry entry : new HashMap((HashMap) nVar.f16456b).entrySet()) {
            if (entry.getKey() == null) {
                List list = (List) entry.getValue();
                if (!Z(cVar, list).equals(Z((l2.c) nVar.f16457c, list))) {
                    throw null;
                }
            } else {
                throw new ClassCastException();
            }
        }
        nVar.f16457c = cVar;
    }

    public static l2.c Z(l2.c cVar, List list) {
        cVar.getClass();
        Map map = cVar.f17773a;
        HashMap hashMap = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                hashMap.remove(str);
            }
        }
        return new l2.c(hashMap);
    }

    public static n d0(int i7, boolean z9, byte[] bArr, byte[] bArr2) {
        int i10;
        byte[] byteArray;
        n nVar = new n(12, false);
        if (bArr != null && bArr.length != 0) {
            if (z9) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            if (i7 != 1) {
                if (i7 != 2) {
                    return nVar;
                }
                SerializedData serializedData = new SerializedData();
                serializedData.writeBytes(bArr2, 0, 16);
                serializedData.writeBytes(bArr, i10, 36);
                byte[] byteArray2 = serializedData.toByteArray();
                Pattern pattern = Utilities.f21333a;
                byte[] o4 = Utilities.o(byteArray2.length, byteArray2);
                serializedData.cleanup();
                SerializedData serializedData2 = new SerializedData();
                serializedData2.writeBytes(bArr, i10 + 40, 36);
                serializedData2.writeBytes(bArr2, 0, 16);
                byte[] o10 = Utilities.o(byteArray.length, serializedData2.toByteArray());
                serializedData2.cleanup();
                SerializedData serializedData3 = new SerializedData();
                serializedData3.writeBytes(o4, 0, 8);
                serializedData3.writeBytes(o10, 8, 16);
                serializedData3.writeBytes(o4, 24, 8);
                nVar.f16456b = serializedData3.toByteArray();
                serializedData3.cleanup();
                SerializedData serializedData4 = new SerializedData();
                serializedData4.writeBytes(o10, 0, 8);
                serializedData4.writeBytes(o4, 8, 16);
                serializedData4.writeBytes(o10, 24, 8);
                nVar.f16457c = serializedData4.toByteArray();
                serializedData4.cleanup();
                return nVar;
            }
            SerializedData serializedData5 = new SerializedData();
            serializedData5.writeBytes(bArr2);
            serializedData5.writeBytes(bArr, i10, 32);
            byte[] n10 = Utilities.n(serializedData5.toByteArray());
            serializedData5.cleanup();
            SerializedData serializedData6 = new SerializedData();
            serializedData6.writeBytes(bArr, i10 + 32, 16);
            serializedData6.writeBytes(bArr2);
            serializedData6.writeBytes(bArr, i10 + 48, 16);
            byte[] n11 = Utilities.n(serializedData6.toByteArray());
            serializedData6.cleanup();
            SerializedData serializedData7 = new SerializedData();
            serializedData7.writeBytes(bArr, i10 + 64, 32);
            serializedData7.writeBytes(bArr2);
            byte[] n12 = Utilities.n(serializedData7.toByteArray());
            serializedData7.cleanup();
            SerializedData serializedData8 = new SerializedData();
            serializedData8.writeBytes(bArr2);
            serializedData8.writeBytes(bArr, i10 + 96, 32);
            byte[] n13 = Utilities.n(serializedData8.toByteArray());
            serializedData8.cleanup();
            SerializedData serializedData9 = new SerializedData();
            serializedData9.writeBytes(n10, 0, 8);
            serializedData9.writeBytes(n11, 8, 12);
            serializedData9.writeBytes(n12, 4, 12);
            nVar.f16456b = serializedData9.toByteArray();
            serializedData9.cleanup();
            SerializedData serializedData10 = new SerializedData();
            serializedData10.writeBytes(n10, 8, 12);
            serializedData10.writeBytes(n11, 0, 8);
            serializedData10.writeBytes(n12, 16, 4);
            serializedData10.writeBytes(n13, 0, 8);
            nVar.f16457c = serializedData10.toByteArray();
            serializedData10.cleanup();
            return nVar;
        }
        nVar.f16457c = null;
        nVar.f16456b = null;
        return nVar;
    }

    @Override
    public m9.y A(o0 o0Var) {
        m9.y A = ((h2.d) this.f16456b).A(o0Var);
        if (A == null) {
            return null;
        }
        return s9.c(A, new m3(this, 12));
    }

    @Override
    public StackTraceElement[] B(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        ja.a[] aVarArr = (ja.a[]) this.f16456b;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i7 = 0; i7 < 1; i7++) {
            ja.a aVar = aVarArr[i7];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.B(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > 1024) {
            return ((w7.s) this.f16457c).B(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }

    @Override
    public boolean E(g1 g1Var) {
        return false;
    }

    @Override
    public void F(g1 g1Var) {
        ((i0) this.f16456b).t();
    }

    @Override
    public void H(String str, long j3, int i7, Object obj, long j10, long j11) {
        ((j6.m) this.f16457c).f16520g = null;
        j6.n nVar = (j6.n) this.f16456b;
        if (nVar != null) {
            nVar.H(str, j3, i7, obj, j10, j11);
        }
    }

    @Override
    public b3.q I(s2.p pVar, s2.m mVar) {
        return new sg.i0(8, ((s2.t) this.f16456b).I(pVar, mVar), (List) this.f16457c);
    }

    @Override
    public void L() {
        int i7;
        ((k60) this.f16456b).u();
        an anVar = (an) this.f16457c;
        i7 = ((f2) anVar).currentAccount;
        SharedPreferences sharedPreferences = qp.s1(i7).f24764d7;
        boolean z9 = sharedPreferences.getBoolean("sound_enabled_" + dt.v(anVar.f43848j6, anVar.b(), false), true);
        boolean z10 = !z9 ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + dt.v(anVar.f43848j6, anVar.b(), false), z10).apply();
        if (hc.a(anVar)) {
            hc.S(z9 ? 1 : 0, anVar, anVar.getResourceProvider()).j();
        }
        anVar.ud(false);
    }

    @Override
    public void M() {
        h2.x xVar = (h2.x) this.f16457c;
        byte[] bArr = m0.f14113b;
        xVar.getClass();
        xVar.L(bArr.length, bArr);
    }

    @Override
    public int P() {
        return 1;
    }

    @Override
    public void R(int i7) {
        an anVar = (an) this.f16457c;
        ((k60) this.f16456b).u();
        if (i7 == 0) {
            if (anVar.getMessagesController().r2(anVar.f43848j6, anVar.b(), null)) {
                anVar.Ec(true);
            }
            if (hc.a(anVar)) {
                hc.z(anVar, 4, i7, anVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        anVar.getNotificationsController().H(anVar.f43848j6, i7, anVar.b());
        if (hc.a(anVar)) {
            hc.z(anVar, 5, i7, anVar.getResourceProvider()).j();
        }
    }

    @Override
    public void T0(CharSequence charSequence) {
        ((i0) this.f16456b).I0(charSequence);
    }

    @Override
    public m9.y W(byte[] bArr) {
        return s9.c(((h2.d) this.f16456b).W(bArr), new m3(this, 12));
    }

    public void X(Object obj, String str) {
        int length = str.length();
        String valueOf = String.valueOf(obj);
        ((ArrayList) this.f16456b).add(org.telegram.ui.Cells.f1.n(str, "=", valueOf, new StringBuilder(length + 1 + valueOf.length())));
    }

    @Override
    public b3.q Y() {
        return new sg.i0(8, ((s2.t) this.f16456b).Y(), (List) this.f16457c);
    }

    @Override
    public f3.h a(f3.p pVar, long j3) {
        long position = pVar.getPosition();
        int min = (int) Math.min(20000L, pVar.getLength() - position);
        h2.x xVar = (h2.x) this.f16457c;
        xVar.K(min);
        pVar.b(0, min, xVar.f14162a);
        int i7 = -1;
        int i10 = -1;
        long j10 = -9223372036854775807L;
        while (xVar.a() >= 4) {
            if (k3.a.a(xVar.f14163b, xVar.f14162a) != 442) {
                xVar.O(1);
            } else {
                xVar.O(4);
                long c10 = m4.x.c(xVar);
                if (c10 != -9223372036854775807L) {
                    long b10 = ((k0) this.f16456b).b(c10);
                    if (b10 > j3) {
                        if (j10 == -9223372036854775807L) {
                            return new f3.h(b10, -1, position);
                        }
                        return new f3.h(-9223372036854775807L, 0, position + i10);
                    } else if (b10 + 100000 > j3) {
                        return new f3.h(-9223372036854775807L, 0, position + xVar.f14163b);
                    } else {
                        j10 = b10;
                        i10 = xVar.f14163b;
                    }
                }
                int i11 = xVar.f14164c;
                if (xVar.a() < 10) {
                    xVar.N(i11);
                } else {
                    xVar.O(9);
                    int A = xVar.A() & 7;
                    if (xVar.a() < A) {
                        xVar.N(i11);
                    } else {
                        xVar.O(A);
                        if (xVar.a() < 4) {
                            xVar.N(i11);
                        } else {
                            if (k3.a.a(xVar.f14163b, xVar.f14162a) == 443) {
                                xVar.O(4);
                                int H = xVar.H();
                                if (xVar.a() < H) {
                                    xVar.N(i11);
                                } else {
                                    xVar.O(H);
                                }
                            }
                            while (true) {
                                if (xVar.a() < 4) {
                                    break;
                                }
                                int a10 = k3.a.a(xVar.f14163b, xVar.f14162a);
                                if (a10 == 442 || a10 == 441 || (a10 >>> 8) != 1) {
                                    break;
                                }
                                xVar.O(4);
                                if (xVar.a() < 2) {
                                    xVar.N(i11);
                                    break;
                                }
                                xVar.N(Math.min(xVar.f14164c, xVar.f14163b + xVar.H()));
                            }
                        }
                    }
                }
                i7 = xVar.f14163b;
            }
        }
        if (j10 != -9223372036854775807L) {
            return new f3.h(j10, -2, position + i7);
        }
        return f3.h.d;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        int i7;
        o7.d dVar = (o7.d) this.f16456b;
        o7.b bVar = (o7.b) obj;
        e7.b bVar2 = new e7.b(dVar, (TaskCompletionSource) obj2);
        Context context = dVar.f6715a;
        try {
            i7 = z6.b.a(context).c(0, context.getPackageName()).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i7 = 0;
        }
        m6.b bVar3 = (m6.b) this.f16457c;
        bVar3.f19887f = i7;
        o7.c cVar = (o7.c) bVar.n();
        com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true), true);
        gVar.f6538c = false;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
        int i10 = o7.a.f20853a;
        obtain.writeStrongBinder(bVar2);
        obtain.writeInt(1);
        bVar3.writeToParcel(obtain, 0);
        obtain.writeInt(1);
        gVar.writeToParcel(obtain, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            cVar.f20854a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override
    public void b(g1 g1Var) {
        ((i0) this.f16456b).b(g1Var);
    }

    @Override
    public c4.d c(int i7, int i10, byte[] bArr) {
        return p0.a(this, bArr, i10);
    }

    public void c0(l2.d dVar) {
        synchronized (dVar) {
        }
        Handler handler = (Handler) this.f16456b;
        if (handler != null) {
            handler.post(new n2.q(this, dVar, 0));
        }
    }

    @Override
    public h createDataSource() {
        return new o((Context) this.f16456b, ((p) this.f16457c).createDataSource());
    }

    @Override
    public void dismiss() {
        switch (this.f16455a) {
            case 16:
                ((k60) this.f16456b).u();
                return;
            default:
                ((wt) this.f16457c).dismiss();
                return;
        }
    }

    @Override
    public boolean mo19f(float f10, float f11, int i7, View view) {
        Rect rect = (Rect) this.f16456b;
        ex exVar = (ex) this.f16457c;
        if (exVar.getParentActivity() != null && (view instanceof h4)) {
            ((ImageView) view.getTag(2131296585)).getHitRect(rect);
            if (!rect.contains((int) f10, (int) f11)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(exVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{id.M0(2131751599, null)}, new zw(this, i7, 0));
                exVar.showDialog(alertDialog$Builder.f27296a);
                return true;
            }
        }
        return false;
    }

    public String f0(String str) {
        ArrayList arrayList = (ArrayList) this.f16456b;
        String str2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                str2 = (String) ((qz) arrayList.get(i7)).f25182a.get(str);
                if (str2 != null) {
                    break;
                }
            }
        }
        if (str2 == null) {
            return sz.l(str, (Attributes) this.f16457c);
        }
        return str2;
    }

    @Override
    public void f1(Editable editable) {
        ((j0) this.f16457c).i();
        ((i0) this.f16456b).i1();
    }

    public java.lang.Integer g0(java.lang.String r5) {
        throw new UnsupportedOperationException("Method not decompiled: j2.n.g0(java.lang.String):java.lang.Integer");
    }

    @Override
    public Object mo24get() {
        return new p5.d((Context) ((e.a) this.f16456b).f10026a, (hy0) ((rt) this.f16457c).mo24get());
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    public boolean h0(q4.t tVar, String str) {
        Context context = (Context) this.f16456b;
        int i7 = tVar.f53808b;
        if (i7 < 0) {
            if (context.getPackageManager().checkPermission(str, tVar.f53807a) == 0) {
                return true;
            }
            return false;
        } else if (context.checkPermission(str, i7, tVar.f53809c) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void i0(long j3, byte[] bArr) {
        File file;
        e0.g gVar = (e0.g) this.f16457c;
        if (gVar.f10052b) {
            gVar.f10052b = false;
            ((vi.h) gVar.f10054e).h();
            return;
        }
        vi.h hVar = (vi.h) gVar.f10054e;
        hVar.getClass();
        vi.h.q();
        vi.g gVar2 = hVar.f57563z;
        if (hVar.G == 5 && gVar2 != null) {
            file = gVar2.f57538b;
        } else {
            file = null;
        }
        if (file == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Preview file is unavailable");
            MediaController mediaController = ((me) this.f16456b).f24011a;
            String[] strArr = MediaController.V1;
            a8.e("AudioRecorderV2 failed", illegalStateException);
            qs.f(mediaController.f21270h1).k(qs.f25037m2, Integer.valueOf(mediaController.f21268g1));
            mediaController.x(false);
            return;
        }
        MediaController mediaController2 = ((me) this.f16456b).f24011a;
        mediaController2.f21274j1 = file;
        mediaController2.f21276k1 = j3;
        mediaController2.G0(file, j3, bArr);
        ui.b0(mediaController2.f21270h1).B1(mediaController2.f21278m1, mediaController2.n1, pi.a(mediaController2, file.getAbsolutePath(), mediaController2.J1));
        qs.f(mediaController2.f21270h1).k(qs.f25048o2, new Object[0]);
        qs.f(mediaController2.f21270h1).k(qs.f25073s2, Integer.valueOf(mediaController2.f21268g1), mediaController2.f21266f1, file.getAbsolutePath());
        mediaController2.Y(false);
        MediaController.j0(false);
    }

    public int j0(Context context, com.google.android.gms.common.api.c cVar) {
        q6.m.g(context);
        q6.m.g(cVar);
        int i7 = 0;
        if (!cVar.c()) {
            return 0;
        }
        int d = cVar.d();
        int k02 = k0(d);
        if (k02 != -1) {
            return k02;
        }
        SparseIntArray sparseIntArray = (SparseIntArray) this.f16456b;
        synchronized (sparseIntArray) {
            int i10 = 0;
            while (true) {
                try {
                    if (i10 < sparseIntArray.size()) {
                        int keyAt = sparseIntArray.keyAt(i10);
                        if (keyAt > d && sparseIntArray.get(keyAt) == 0) {
                            break;
                        }
                        i10++;
                    } else {
                        i7 = -1;
                        break;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (i7 == -1) {
                i7 = ((n6.e) this.f16457c).d(context, d);
            }
            sparseIntArray.put(d, i7);
        }
        return i7;
    }

    @Override
    public void k(boolean z9) {
        e8 e8Var = ((c8) this.f16457c).f44715b;
        e8Var.f45231y.finishFragment();
        h8 h8Var = e8Var.f45231y;
        ((an) this.f16456b).h8(h8Var.P, h8Var.Q + 86400, z9);
    }

    public int k0(int i7) {
        int i10;
        SparseIntArray sparseIntArray = (SparseIntArray) this.f16456b;
        synchronized (sparseIntArray) {
            i10 = sparseIntArray.get(i7, -1);
        }
        return i10;
    }

    @Override
    public void l(boolean z9, float f10) {
        ((TextView) this.f16456b).setText("Alpha " + h5.l1);
        h5.l1 = f10;
        ((h5) this.f16457c).f46221i1.L();
    }

    @Override
    public void l0(g1 g1Var, int i7, int i10) {
        i9 w02;
        i0 i0Var = (i0) this.f16456b;
        if (!((j0) this.f16457c).d && i7 != i10 && (w02 = i0Var.w0()) != null) {
            if (!w02.x() || w02.W != i0Var.S0()) {
                g1Var.post(new g0(this, g1Var, i10, w02, i0Var, i7));
            }
        }
    }

    @Override
    public boolean l1(boolean z9) {
        return false;
    }

    @Override
    public boolean m() {
        return ((i0) this.f16456b).a1();
    }

    @Override
    public void o(s6 s6Var, ci.b bVar, boolean z9) {
        wt wtVar = (wt) this.f16457c;
        vt vtVar = wtVar.P1;
        if (bVar != null) {
            ((ci.c) this.f16456b).i(bVar);
            wtVar.W1.e();
            ci.c cVar = wtVar.Y1;
            ew0[] ew0VarArr = wtVar.T1;
            c2[] c2VarArr = wtVar.U1;
            c2 c2Var = c2VarArr[0];
            if (c2Var != null) {
                ew0 ew0Var = ew0VarArr[0];
                boolean z10 = cVar.f6433m;
                ew0Var.f33393c = z10;
                c2Var.c(z10, true);
            }
            c2 c2Var2 = c2VarArr[1];
            if (c2Var2 != null) {
                ew0 ew0Var2 = ew0VarArr[1];
                boolean z11 = cVar.f6434n;
                ew0Var2.f33393c = z11;
                c2Var2.c(z11, true);
            }
            c2 c2Var3 = c2VarArr[2];
            if (c2Var3 != null) {
                ew0 ew0Var3 = ew0VarArr[2];
                boolean z12 = cVar.f6435o;
                ew0Var3.f33393c = z12;
                c2Var3.c(z12, true);
            }
            c2 c2Var4 = c2VarArr[3];
            if (c2Var4 != null) {
                ew0 ew0Var4 = ew0VarArr[3];
                boolean z13 = cVar.f6436p;
                ew0Var4.f33393c = z13;
                c2Var4.c(z13, true);
            }
            c2 c2Var5 = c2VarArr[4];
            if (c2Var5 != null) {
                ew0 ew0Var5 = ew0VarArr[4];
                boolean z14 = cVar.f6437q;
                ew0Var5.f33393c = z14;
                c2Var5.c(z14, true);
            }
            wtVar.S1.a(vtVar.d(), true);
            vtVar.c(true);
        }
    }

    @Override
    public void onError(t51 t51Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f16457c;
        int i7 = secretMediaViewer.Z;
        if (i7 > 0) {
            secretMediaViewer.Z = i7 - 1;
            org.telegram.messenger.g0.i3(new by0(6, this, (File) this.f16456b), 100L);
            return;
        }
        a8.g(exc, true);
    }

    @Override
    public void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z9, int i7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f16457c;
        dz0 dz0Var = secretMediaViewer.f41915g1;
        if (secretMediaViewer.D != null && secretMediaViewer.f41912f0 != null) {
            org.telegram.messenger.g0.r(dz0Var);
            org.telegram.messenger.g0.h3(dz0Var);
            if (i7 != 4 && i7 != 1) {
                try {
                    secretMediaViewer.f41900b.getWindow().addFlags(128);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            } else {
                try {
                    secretMediaViewer.f41900b.getWindow().clearFlags(128);
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
            }
            if (i7 == 3 && secretMediaViewer.f41947x.getVisibility() != 0) {
                secretMediaViewer.f41947x.setVisibility(0);
            }
            if (secretMediaViewer.D.d0() && i7 != 4) {
                if (!secretMediaViewer.E) {
                    secretMediaViewer.E = true;
                }
            } else if (secretMediaViewer.E) {
                secretMediaViewer.E = false;
                if (i7 == 4) {
                    secretMediaViewer.H = true;
                    if (secretMediaViewer.I) {
                        secretMediaViewer.e(true, !secretMediaViewer.f41929o1);
                        return;
                    }
                    secretMediaViewer.D.q0(0L, false);
                    secretMediaViewer.D.h0();
                }
            }
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        float f11;
        j4 j4Var = ((SecretMediaViewer) this.f16457c).f41947x;
        if (j4Var != null) {
            if (i10 == 0) {
                f11 = 1.0f;
            } else {
                f11 = (i7 * f10) / i10;
            }
            j4Var.a(f11, 0);
        }
    }

    @Override
    public void p() {
        ((k60) this.f16456b).u();
        an anVar = (an) this.f16457c;
        anVar.Ec(true);
        hc.A(anVar, anVar.getMessagesController().r2(anVar.f43848j6, anVar.b(), null), anVar.f44028xa).j();
    }

    @Override
    public int q0() {
        return 0;
    }

    @Override
    public boolean s(g1 g1Var) {
        return false;
    }

    @Override
    public void t(boolean z9, float f10) {
        ob0 ob0Var = (ob0) this.f16456b;
        ud0 ud0Var = (ud0) this.f16457c;
        t51 t51Var = ud0Var.d;
        if (t51Var != null) {
            long U = t51Var.U();
            float max = 2.8f / ((float) Math.max(60L, U));
            long j3 = (((f10 / (1.0f - max)) * max) + f10) * ((float) U);
            ud0Var.f38616e = j3;
            ud0Var.d.q0(j3, !z9);
            if (!z9) {
                org.telegram.messenger.g0.r(ob0Var);
                org.telegram.messenger.g0.i3(ob0Var, 120L);
            }
        }
    }

    public String toString() {
        switch (this.f16455a) {
            case 26:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f16457c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f16456b;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    sb2.append((String) arrayList.get(i7));
                    if (i7 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            case 27:
            default:
                return super.toString();
            case 28:
                return "Bounds{lower=" + ((i0.b) this.f16456b) + " upper=" + ((i0.b) this.f16457c) + "}";
        }
    }

    @Override
    public void v(String str, long j3, long j10, long j11) {
        j6.n nVar = (j6.n) this.f16456b;
        if (nVar != null) {
            nVar.v(str, j3, j10, j11);
        }
    }

    @Override
    public void w(int i7, int i10) {
        ((i0) this.f16456b).d1(i7, i10);
    }

    @Override
    public void y() {
        ((k60) this.f16456b).u();
        an anVar = (an) this.f16457c;
        if (anVar.f43848j6 != 0 && anVar.f43796f4 != 3) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", anVar.f43848j6);
            if (anVar.b() != 0) {
                bundle.putLong("topic_id", anVar.b());
            }
            anVar.presentFragment(new gx0(bundle, anVar.f44028xa));
        }
    }

    @Override
    public void z(byte[] r19, int r20, int r21, c4.l r22, h2.j r23) {
        throw new UnsupportedOperationException("Method not decompiled: j2.n.z(byte[], int, int, c4.l, h2.j):void");
    }

    public n(int i7, boolean z9) {
        this.f16455a = i7;
    }

    @Override
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f16457c;
        if (secretMediaViewer.f41898a0) {
            return;
        }
        secretMediaViewer.f41898a0 = true;
        secretMediaViewer.f41908e.invalidate();
    }

    public n(Object obj, Object obj2, boolean z9, int i7) {
        this.f16455a = i7;
        this.f16456b = obj;
        this.f16457c = obj2;
    }

    public n(IBinder iBinder) {
        this.f16455a = 7;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f16456b = new Messenger(iBinder);
            this.f16457c = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f16457c = new m6.g(iBinder);
            this.f16456b = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public n(Object obj) {
        this.f16455a = 26;
        this.f16457c = obj;
        this.f16456b = new ArrayList();
    }

    public n(n6.e eVar) {
        this.f16455a = 27;
        this.f16456b = new SparseIntArray();
        q6.m.g(eVar);
        this.f16457c = eVar;
    }

    public n(ja.a[] aVarArr) {
        this.f16455a = 2;
        this.f16456b = aVarArr;
        this.f16457c = new w7.s(11, false);
    }

    public n(byte[] bArr) {
        this.f16455a = 24;
        this.f16456b = bArr;
    }

    @Override
    public void D() {
    }

    @Override
    public void V() {
    }

    @Override
    public void clear() {
    }

    @Override
    public void d() {
    }

    @Override
    public void i() {
    }

    @Override
    public void n() {
    }

    @Override
    public void r() {
    }

    @Override
    public void r0() {
    }

    @Override
    public void reset() {
    }

    public n(k0 k0Var) {
        this.f16455a = 6;
        this.f16456b = k0Var;
        this.f16457c = new h2.x();
    }

    public n(ud0 ud0Var) {
        this.f16455a = 17;
        this.f16457c = ud0Var;
        this.f16456b = new ob0(this, 6);
    }

    public n(Context context) {
        this.f16455a = 0;
        p pVar = new p();
        this.f16456b = context.getApplicationContext();
        this.f16457c = pVar;
    }

    @Override
    public void G(float f10) {
    }

    @Override
    public void J(long j3) {
    }

    @Override
    public void K(boolean z9) {
    }

    @Override
    public void O(float f10) {
    }

    @Override
    public void Q(float f10) {
    }

    @Override
    public void T(float f10) {
    }

    @Override
    public void a0(float f10) {
    }

    @Override
    public void e(int i7) {
    }

    @Override
    public void e0(long j3) {
    }

    @Override
    public void g(float f10) {
    }

    @Override
    public void h(float f10) {
    }

    @Override
    public void onSeekFinished(m2.a aVar) {
    }

    @Override
    public void onSeekStarted(m2.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void q(float f10) {
    }

    @Override
    public void u(float f10) {
    }

    @Override
    public void x(boolean z9) {
    }

    public n(Handler handler, n2.s sVar) {
        this.f16455a = 8;
        if (sVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f16456b = handler;
        this.f16457c = sVar;
    }

    public n(ex exVar) {
        this.f16455a = 19;
        this.f16457c = exVar;
        this.f16456b = new Rect();
    }

    public n(Attributes attributes, HashMap hashMap) {
        this.f16455a = 13;
        this.f16457c = attributes;
        String l10 = sz.l("style", attributes);
        if (l10 != null) {
            ArrayList arrayList = new ArrayList();
            this.f16456b = arrayList;
            arrayList.add(new qz(l10));
            return;
        }
        String l11 = sz.l("class", attributes);
        if (l11 != null) {
            this.f16456b = new ArrayList();
            for (String str : l11.split(" ")) {
                qz qzVar = (qz) hashMap.get(str.trim());
                if (qzVar != null) {
                    ((ArrayList) this.f16456b).add(qzVar);
                }
            }
        }
    }

    @Override
    public void C(float f10, int i7) {
    }

    @Override
    public void N(float f10, int i7) {
    }

    @Override
    public void S(float f10, int i7) {
    }

    @Override
    public void b0(int i7, long j3) {
    }

    @Override
    public void j(long j3, boolean z9) {
    }

    public n(int i7) {
        this.f16455a = i7;
        switch (i7) {
            case 4:
                this.f16456b = new h2.x();
                this.f16457c = new l4.a();
                return;
            default:
                this.f16456b = new HashMap();
                this.f16457c = l2.c.f17772b;
                return;
        }
    }
}
