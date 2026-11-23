package j6;

import a8.p0;
import ai.v1;
import ai.w1;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Parcel;
import android.text.Editable;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bi.v3;
import c8.u9;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.o0;
import h2.k0;
import hi.rb;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import m4.a0;
import m4.b0;
import m4.d0;
import m4.f0;
import oi.e1;
import oi.f1;
import oi.h0;
import oi.i0;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.jz;
import org.telegram.messenger.ke;
import org.telegram.messenger.ks;
import org.telegram.messenger.lr;
import org.telegram.messenger.lz;
import org.telegram.messenger.mi;
import org.telegram.messenger.mp;
import org.telegram.messenger.ri;
import org.telegram.messenger.vr;
import org.telegram.messenger.xs;
import org.telegram.tgnet.SerializedData;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Cells.d2;
import org.telegram.ui.Cells.i4;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.ee0;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.no;
import org.telegram.ui.Components.pw0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.zm0;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.bn;
import org.telegram.ui.e8;
import org.telegram.ui.ex;
import org.telegram.ui.ez0;
import org.telegram.ui.g8;
import org.telegram.ui.h5;
import org.telegram.ui.hx0;
import org.telegram.ui.i7;
import org.telegram.ui.iy0;
import org.telegram.ui.j4;
import org.telegram.ui.j8;
import org.telegram.ui.jx;
import org.telegram.ui.s6;
import org.telegram.ui.yt;
import org.telegram.ui.zt;
import org.xml.sax.Attributes;
public final class k implements o, v1, c4.m, a0, Continuation, com.google.android.gms.common.api.internal.q, e1, zm0, lr, no, rb, i7, tj0, f61, h2.d, q5.b, te.b {
    public final int f17342a;
    public Object f17343b;
    public Object f17344c;

    public k(int i7, Object obj, Object obj2) {
        this.f17342a = i7;
        this.f17344c = obj;
        this.f17343b = obj2;
    }

    public static void R(k kVar, l2.d dVar) {
        kVar.getClass();
        for (Map.Entry entry : new HashMap((HashMap) kVar.f17343b).entrySet()) {
            if (entry.getKey() == null) {
                List list = (List) entry.getValue();
                if (!Y(dVar, list).equals(Y((l2.d) kVar.f17344c, list))) {
                    throw null;
                }
            } else {
                throw new ClassCastException();
            }
        }
        kVar.f17344c = dVar;
    }

    public static l2.d Y(l2.d dVar, List list) {
        dVar.getClass();
        Map map = dVar.f19371a;
        HashMap hashMap = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                hashMap.remove(str);
            }
        }
        return new l2.d(hashMap);
    }

    public static k c0(int i7, boolean z10, byte[] bArr, byte[] bArr2) {
        int i10;
        byte[] byteArray;
        k kVar = new k(11, false);
        if (bArr != null && bArr.length != 0) {
            if (z10) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            if (i7 != 1) {
                if (i7 != 2) {
                    return kVar;
                }
                SerializedData serializedData = new SerializedData();
                serializedData.writeBytes(bArr2, 0, 16);
                serializedData.writeBytes(bArr, i10, 36);
                byte[] byteArray2 = serializedData.toByteArray();
                Pattern pattern = Utilities.f22874a;
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
                kVar.f17343b = serializedData3.toByteArray();
                serializedData3.cleanup();
                SerializedData serializedData4 = new SerializedData();
                serializedData4.writeBytes(o10, 0, 8);
                serializedData4.writeBytes(o4, 8, 16);
                serializedData4.writeBytes(o10, 24, 8);
                kVar.f17344c = serializedData4.toByteArray();
                serializedData4.cleanup();
                return kVar;
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
            kVar.f17343b = serializedData9.toByteArray();
            serializedData9.cleanup();
            SerializedData serializedData10 = new SerializedData();
            serializedData10.writeBytes(n10, 8, 12);
            serializedData10.writeBytes(n11, 0, 8);
            serializedData10.writeBytes(n12, 16, 4);
            serializedData10.writeBytes(n13, 0, 8);
            kVar.f17344c = serializedData10.toByteArray();
            serializedData10.cleanup();
            return kVar;
        }
        kVar.f17344c = null;
        kVar.f17343b = null;
        return kVar;
    }

    @Override
    public void A(f1 f1Var) {
        ((h0) this.f17343b).g();
    }

    @Override
    public void C(String str, long j3, long j10, long j11) {
        o oVar = (o) this.f17343b;
        if (oVar != null) {
            oVar.C(str, j3, j10, j11);
        }
    }

    @Override
    public void E(byte[] r19, int r20, int r21, c4.l r22, h2.j r23) {
        throw new UnsupportedOperationException("Method not decompiled: j6.k.E(byte[], int, int, c4.l, h2.j):void");
    }

    @Override
    public void G(float r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: j6.k.G(float, int):void");
    }

    @Override
    public m9.y I(o0 o0Var) {
        m9.y I = ((h2.d) this.f17343b).I(o0Var);
        if (I == null) {
            return null;
        }
        return u9.c(I, new org.telegram.tgnet.g(this, 20));
    }

    @Override
    public void J() {
        int i7;
        ((x60) this.f17343b).v();
        bn bnVar = (bn) this.f17344c;
        i7 = ((g2) bnVar).currentAccount;
        SharedPreferences sharedPreferences = mp.u1(i7).f25753g7;
        boolean z10 = sharedPreferences.getBoolean("sound_enabled_" + xs.v(bnVar.f46271l6, bnVar.b(), false), true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + xs.v(bnVar.f46271l6, bnVar.b(), false), z11).apply();
        if (kc.a(bnVar)) {
            kc.S(z10 ? 1 : 0, bnVar, bnVar.getResourceProvider()).j();
        }
        bnVar.yd(false);
    }

    @Override
    public void K(int i7, float f10, float f11, te.c cVar) {
        rh.h hVar = (rh.h) this.f17344c;
        hVar.f56728c.a(f10);
        hVar.d.a(f10);
        hVar.f56727b.a(f10);
        ((Runnable) this.f17343b).run();
    }

    @Override
    public void M(int i7, String str) {
        ji.n.b((ji.n) this.f17344c, (w1) this.f17343b, str, i7);
    }

    @Override
    public int N() {
        return 1;
    }

    @Override
    public void O(s6 s6Var, ei.b bVar, boolean z10) {
        zt ztVar = (zt) this.f17344c;
        yt ytVar = ztVar.T1;
        if (bVar != null) {
            ((ei.c) this.f17343b).i(bVar);
            ztVar.f54719a2.e();
            ei.c cVar = ztVar.f54721c2;
            pw0[] pw0VarArr = ztVar.X1;
            d2[] d2VarArr = ztVar.Y1;
            d2 d2Var = d2VarArr[0];
            if (d2Var != null) {
                pw0 pw0Var = pw0VarArr[0];
                boolean z11 = cVar.f10972m;
                pw0Var.f38599c = z11;
                d2Var.c(z11, true);
            }
            d2 d2Var2 = d2VarArr[1];
            if (d2Var2 != null) {
                pw0 pw0Var2 = pw0VarArr[1];
                boolean z12 = cVar.f10973n;
                pw0Var2.f38599c = z12;
                d2Var2.c(z12, true);
            }
            d2 d2Var3 = d2VarArr[2];
            if (d2Var3 != null) {
                pw0 pw0Var3 = pw0VarArr[2];
                boolean z13 = cVar.f10974o;
                pw0Var3.f38599c = z13;
                d2Var3.c(z13, true);
            }
            d2 d2Var4 = d2VarArr[3];
            if (d2Var4 != null) {
                pw0 pw0Var4 = pw0VarArr[3];
                boolean z14 = cVar.f10975p;
                pw0Var4.f38599c = z14;
                d2Var4.c(z14, true);
            }
            d2 d2Var5 = d2VarArr[4];
            if (d2Var5 != null) {
                pw0 pw0Var5 = pw0VarArr[4];
                boolean z15 = cVar.f10976q;
                pw0Var5.f38599c = z15;
                d2Var5.c(z15, true);
            }
            ztVar.W1.a(ytVar.d(), true);
            ytVar.c(true);
        }
    }

    @Override
    public void P(String str) {
        w1 w1Var = (w1) this.f17343b;
        ji.n nVar = (ji.n) this.f17344c;
        if (w1Var == nVar.f18067f) {
            nVar.P(str);
        }
    }

    @Override
    public void Q(int i7) {
        bn bnVar = (bn) this.f17344c;
        ((x60) this.f17343b).v();
        if (i7 == 0) {
            if (bnVar.getMessagesController().u2(bnVar.f46271l6, bnVar.b(), null)) {
                bnVar.Ic(true);
            }
            if (kc.a(bnVar)) {
                kc.z(bnVar, 4, i7, bnVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        bnVar.getNotificationsController().H(bnVar.f46271l6, i7, bnVar.b());
        if (kc.a(bnVar)) {
            kc.z(bnVar, 5, i7, bnVar.getResourceProvider()).j();
        }
    }

    public void S(Object obj, String str) {
        int length = str.length();
        String valueOf = String.valueOf(obj);
        ((ArrayList) this.f17343b).add(p5.c.m(str, "=", valueOf, new StringBuilder(length + 1 + valueOf.length())));
    }

    @Override
    public void T(CharSequence charSequence) {
        ((h0) this.f17343b).M(charSequence);
    }

    @Override
    public m9.y V(byte[] bArr) {
        return u9.c(((h2.d) this.f17343b).V(bArr), new org.telegram.tgnet.g(this, 20));
    }

    public boolean W(int i7) {
        return ((e2.s) this.f17343b).f10686a.get(i7);
    }

    @Override
    public void Z(String str, long j3, int i7, Object obj, long j10, long j11) {
        int i10;
        n nVar = (n) this.f17344c;
        if (((o) this.f17343b) != null) {
            if (i7 == 2001) {
                Object[] objArr = {Integer.valueOf(nVar.f17348i)};
                b bVar = nVar.f17368a;
                Log.w(bVar.f17332a, bVar.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                Iterator it = ((h6.h) nVar.h.f7872b).f13920i.iterator();
                while (it.hasNext()) {
                    ((h6.g) it.next()).o();
                }
                i10 = 2001;
            } else {
                i10 = i7;
            }
            ((o) this.f17343b).Z(str, j3, i10, obj, j10, j11);
        }
    }

    @Override
    public void a(String str, String str2) {
        ji.n nVar = (ji.n) this.f17344c;
        w1 w1Var = (w1) this.f17343b;
        if (!nVar.J) {
            if (w1Var == nVar.f18067f) {
                nVar.a(str, str2);
            }
        } else if (w1Var == nVar.U) {
            nVar.U = null;
            if (!str.isEmpty()) {
                nVar.t(w1Var, str);
            }
            nVar.e();
            Log.d("VoiceLive", "field: final words in (" + nVar.L.size() + " words)");
            nVar.m();
        } else if (w1Var != nVar.f18067f) {
        } else {
            Log.d("VoiceLive", "field: recogniser ended by itself error=" + str2);
            if (!str.isEmpty()) {
                nVar.t(w1Var, str);
            }
            nVar.f18067f = null;
            if (vr.f27687k == nVar) {
                vr.f27687k = null;
            }
            nVar.d = null;
            nVar.f18065e = null;
            nVar.e();
            nVar.m();
        }
    }

    @Override
    public int a0() {
        return 0;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        int i7;
        o7.d dVar = (o7.d) this.f17343b;
        o7.b bVar = (o7.b) obj;
        e7.b bVar2 = new e7.b(dVar, (TaskCompletionSource) obj2);
        Context context = dVar.f6379a;
        try {
            i7 = z6.b.a(context).c(0, context.getPackageName()).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i7 = 0;
        }
        m6.b bVar3 = (m6.b) this.f17344c;
        bVar3.f20938f = i7;
        o7.c cVar = (o7.c) bVar.n();
        com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true), true);
        gVar.f6198c = false;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
        int i10 = o7.a.f21832a;
        obtain.writeStrongBinder(bVar2);
        obtain.writeInt(1);
        bVar3.writeToParcel(obtain, 0);
        obtain.writeInt(1);
        gVar.writeToParcel(obtain, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            cVar.f21833a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override
    public void c(h2.x xVar) {
        d0 d0Var = (d0) this.f17344c;
        SparseArray sparseArray = d0Var.h;
        d4.f fVar = (d4.f) this.f17343b;
        if (xVar.A() == 0 && (xVar.A() & 128) != 0) {
            xVar.O(6);
            int a10 = xVar.a() / 4;
            for (int i7 = 0; i7 < a10; i7++) {
                xVar.k(0, 4, (byte[]) fVar.f7827b);
                fVar.J(0);
                int j3 = fVar.j(16);
                fVar.L(3);
                if (j3 == 0) {
                    fVar.L(13);
                } else {
                    int j10 = fVar.j(13);
                    if (sparseArray.get(j10) == null) {
                        sparseArray.put(j10, new b0(new a4.k(d0Var, j10)));
                        d0Var.f20672n++;
                    }
                }
            }
            if (d0Var.f20661a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override
    public void d(f1 f1Var) {
        ((h0) this.f17343b).d(f1Var);
    }

    @Override
    public void dismiss() {
        switch (this.f17342a) {
            case 15:
                ((x60) this.f17343b).v();
                return;
            default:
                ((zt) this.f17344c).dismiss();
                return;
        }
    }

    @Override
    public void e0(f1 f1Var, int i7, int i10) {
        i9 K;
        h0 h0Var = (h0) this.f17343b;
        if (!((i0) this.f17344c).d && i7 != i10 && (K = h0Var.K()) != null) {
            if (!K.x() || K.W != h0Var.P()) {
                f1Var.post(new v3(this, f1Var, i10, K, h0Var, i7));
            }
        }
    }

    @Override
    public void f(float f10) {
        w1 w1Var = (w1) this.f17343b;
        ji.n nVar = (ji.n) this.f17344c;
        if (w1Var == nVar.f18067f) {
            nVar.f(f10);
        }
    }

    public String f0(String str) {
        ArrayList arrayList = (ArrayList) this.f17343b;
        String str2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                str2 = (String) ((jz) arrayList.get(i7)).f25055a.get(str);
                if (str2 != null) {
                    break;
                }
            }
        }
        if (str2 == null) {
            return lz.l(str, (Attributes) this.f17344c);
        }
        return str2;
    }

    @Override
    public boolean mo24g(float f10, float f11, int i7, View view) {
        Rect rect = (Rect) this.f17343b;
        jx jxVar = (jx) this.f17344c;
        if (jxVar.getParentActivity() != null && (view instanceof i4)) {
            ((ImageView) view.getTag(2131296587)).getHitRect(rect);
            if (!rect.contains((int) f10, (int) f11)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jxVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{gd.N0(2131751586, null)}, new ex(this, i7, 0));
                jxVar.showDialog(alertDialog$Builder.f28835a);
                return true;
            }
        }
        return false;
    }

    @Override
    public void g0(Editable editable) {
        ((i0) this.f17344c).i();
        ((h0) this.f17343b).h0();
    }

    @Override
    public Object mo23get() {
        return new p5.e((Context) ((i5) this.f17343b).f29095a, (i61) ((aa) this.f17344c).mo23get());
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    public java.lang.Integer h0(java.lang.String r5) {
        throw new UnsupportedOperationException("Method not decompiled: j6.k.h0(java.lang.String):java.lang.Integer");
    }

    @Override
    public boolean i() {
        return ((h0) this.f17343b).W();
    }

    public boolean i0(q4.t tVar, String str) {
        Context context = (Context) this.f17343b;
        int i7 = tVar.f55953b;
        if (i7 < 0) {
            if (context.getPackageManager().checkPermission(str, tVar.f55952a) == 0) {
                return true;
            }
            return false;
        } else if (context.checkPermission(str, i7, tVar.f55954c) == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void j(boolean z10, float f10) {
        ((TextView) this.f17343b).setText("Alpha " + h5.f48429p1);
        h5.f48429p1 = f10;
        ((h5) this.f17344c).f48430m1.K();
    }

    public void k0(long j3, byte[] bArr) {
        File file;
        e0.g gVar = (e0.g) this.f17344c;
        if (gVar.f10196b) {
            gVar.f10196b = false;
            ((yi.j) gVar.f10198e).h();
            return;
        }
        yi.j jVar = (yi.j) gVar.f10198e;
        jVar.getClass();
        yi.j.q();
        yi.h hVar = jVar.f61468z;
        if (jVar.G == 5 && hVar != null) {
            file = hVar.f61443b;
        } else {
            file = null;
        }
        if (file == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Preview file is unavailable");
            MediaController mediaController = ((ke) this.f17343b).f25122a;
            String[] strArr = MediaController.W1;
            a8.e("AudioRecorderV2 failed", illegalStateException);
            ks.f(mediaController.f22813i1).k(ks.f25250m2, Integer.valueOf(mediaController.f22811h1));
            mediaController.x(false);
            return;
        }
        MediaController mediaController2 = ((ke) this.f17343b).f25122a;
        mediaController2.f22817k1 = file;
        mediaController2.l1 = j3;
        mediaController2.G0(file, j3, bArr);
        ri.d0(mediaController2.f22813i1).F1(mediaController2.n1, mediaController2.f22823o1, mi.a(mediaController2, file.getAbsolutePath(), mediaController2.K1));
        ks.f(mediaController2.f22813i1).k(ks.f25261o2, new Object[0]);
        ks.f(mediaController2.f22813i1).k(ks.f25286s2, Integer.valueOf(mediaController2.f22811h1), mediaController2.f22809g1, file.getAbsolutePath());
        mediaController2.Y(false);
        MediaController.j0(false);
    }

    public int l0(Context context, com.google.android.gms.common.api.c cVar) {
        q6.m.h(context);
        q6.m.h(cVar);
        int i7 = 0;
        if (!cVar.c()) {
            return 0;
        }
        int d = cVar.d();
        int q02 = q0(d);
        if (q02 != -1) {
            return q02;
        }
        SparseIntArray sparseIntArray = (SparseIntArray) this.f17343b;
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
                i7 = ((n6.e) this.f17344c).d(context, d);
            }
            sparseIntArray.put(d, i7);
        }
        return i7;
    }

    @Override
    public void m(int i7, int i10) {
        ((h0) this.f17343b).Y(i7, i10);
    }

    @Override
    public boolean m0(boolean z10) {
        return false;
    }

    @Override
    public boolean o(f1 f1Var) {
        return false;
    }

    @Override
    public void onError(h61 h61Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f17344c;
        int i7 = secretMediaViewer.f43841a0;
        if (i7 > 0) {
            secretMediaViewer.f43841a0 = i7 - 1;
            g0.h3(new iy0(4, this, (File) this.f17343b), 100L);
            return;
        }
        a8.g(exc, true);
    }

    @Override
    public void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f17344c;
        ez0 ez0Var = secretMediaViewer.f43860h1;
        if (secretMediaViewer.E != null && secretMediaViewer.f43857g0 != null) {
            g0.r(ez0Var);
            g0.g3(ez0Var);
            if (i7 != 4 && i7 != 1) {
                try {
                    secretMediaViewer.f43843b.getWindow().addFlags(128);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            } else {
                try {
                    secretMediaViewer.f43843b.getWindow().clearFlags(128);
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
            }
            if (i7 == 3 && secretMediaViewer.f43891x.getVisibility() != 0) {
                secretMediaViewer.f43891x.setVisibility(0);
            }
            if (secretMediaViewer.E.d0() && i7 != 4) {
                if (!secretMediaViewer.F) {
                    secretMediaViewer.F = true;
                }
            } else if (secretMediaViewer.F) {
                secretMediaViewer.F = false;
                if (i7 == 4) {
                    secretMediaViewer.I = true;
                    if (secretMediaViewer.J) {
                        secretMediaViewer.e(true, !secretMediaViewer.f43874p1);
                        return;
                    }
                    secretMediaViewer.E.q0(0L, false);
                    secretMediaViewer.E.h0();
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
        j4 j4Var = ((SecretMediaViewer) this.f17344c).f43891x;
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
    public void q(boolean z10) {
        g8 g8Var = ((e8) this.f17344c).f47472b;
        g8Var.f48168y.finishFragment();
        j8 j8Var = g8Var.f48168y;
        ((bn) this.f17343b).j8(j8Var.Q, j8Var.R + 86400, z10);
    }

    public int q0(int i7) {
        int i10;
        SparseIntArray sparseIntArray = (SparseIntArray) this.f17343b;
        synchronized (sparseIntArray) {
            i10 = sparseIntArray.get(i7, -1);
        }
        return i10;
    }

    @Override
    public void r(String str) {
        ji.n.b((ji.n) this.f17344c, (w1) this.f17343b, str, -1);
    }

    @Override
    public c4.d s(int i7, int i10, byte[] bArr) {
        return p0.a(this, bArr, i10);
    }

    @Override
    public boolean t0(f1 f1Var) {
        return false;
    }

    @Override
    public Object then(Task task) {
        m6.c cVar = (m6.c) this.f17343b;
        Bundle bundle = (Bundle) this.f17344c;
        cVar.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        if (bundle2 != null && bundle2.containsKey("google.messenger")) {
            return cVar.d(bundle).onSuccessTask(m6.d.f20947b, w7.s.f59755c);
        }
        return task;
    }

    public String toString() {
        switch (this.f17342a) {
            case 25:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f17344c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f17343b;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    sb2.append((String) arrayList.get(i7));
                    if (i7 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override
    public void v() {
        ((x60) this.f17343b).v();
        bn bnVar = (bn) this.f17344c;
        bnVar.Ic(true);
        kc.A(bnVar, bnVar.getMessagesController().u2(bnVar.f46271l6, bnVar.b(), null), bnVar.Ba).j();
    }

    @Override
    public void x(boolean z10, float f10) {
        eb0 eb0Var = (eb0) this.f17343b;
        ee0 ee0Var = (ee0) this.f17344c;
        h61 h61Var = ee0Var.d;
        if (h61Var != null) {
            long U = h61Var.U();
            float max = 2.8f / ((float) Math.max(60L, U));
            long j3 = (((f10 / (1.0f - max)) * max) + f10) * ((float) U);
            ee0Var.f34698e = j3;
            ee0Var.d.q0(j3, !z10);
            if (!z10) {
                g0.r(eb0Var);
                g0.h3(eb0Var, 120L);
            }
        }
    }

    @Override
    public void y() {
        ((x60) this.f17343b).v();
        bn bnVar = (bn) this.f17344c;
        if (bnVar.f46271l6 != 0 && bnVar.f46204g4 != 3) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", bnVar.f46271l6);
            if (bnVar.b() != 0) {
                bundle.putLong("topic_id", bnVar.b());
            }
            bnVar.presentFragment(new hx0(bundle, bnVar.Ba));
        }
    }

    public k(int i7, boolean z10) {
        this.f17342a = i7;
    }

    @Override
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f17344c;
        if (secretMediaViewer.f43844b0) {
            return;
        }
        secretMediaViewer.f43844b0 = true;
        secretMediaViewer.f43851e.invalidate();
    }

    public k(Object obj, int i7) {
        this.f17342a = i7;
        this.f17343b = obj;
    }

    public k(Object obj, Object obj2, boolean z10, int i7) {
        this.f17342a = i7;
        this.f17343b = obj;
        this.f17344c = obj2;
    }

    public k(Object obj) {
        this.f17342a = 25;
        this.f17344c = obj;
        this.f17343b = new ArrayList();
    }

    public k(n6.e eVar) {
        this.f17342a = 26;
        this.f17343b = new SparseIntArray();
        q6.m.h(eVar);
        this.f17344c = eVar;
    }

    public k(ee0 ee0Var) {
        this.f17342a = 16;
        this.f17344c = ee0Var;
        this.f17343b = new eb0(this, 8);
    }

    public k(e2.s sVar, SparseArray sparseArray) {
        this.f17342a = 4;
        this.f17343b = sVar;
        SparseBooleanArray sparseBooleanArray = sVar.f10686a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i7 = 0; i7 < sparseBooleanArray.size(); i7++) {
            int a10 = sVar.a(i7);
            m2.a aVar = (m2.a) sparseArray.get(a10);
            aVar.getClass();
            sparseArray2.append(a10, aVar);
        }
        this.f17344c = sparseArray2;
    }

    @Override
    public void B() {
    }

    @Override
    public void F() {
    }

    @Override
    public void clear() {
    }

    @Override
    public void h() {
    }

    @Override
    public void p0() {
    }

    @Override
    public void reset() {
    }

    @Override
    public void t() {
    }

    @Override
    public void u() {
    }

    @Override
    public void w() {
    }

    public k(String str) {
        this.f17342a = 7;
        this.f17344c = null;
        this.f17343b = str;
    }

    public k(ji.n nVar) {
        this.f17342a = 1;
        this.f17344c = nVar;
    }

    public k(d0 d0Var) {
        this.f17342a = 5;
        this.f17344c = d0Var;
        this.f17343b = new d4.f(new byte[4], 4);
    }

    @Override
    public void D(boolean z10) {
    }

    @Override
    public void L(float f10) {
    }

    @Override
    public void U(long j3) {
    }

    @Override
    public void X(boolean z10) {
    }

    @Override
    public void d0(float f10) {
    }

    @Override
    public void e(int i7) {
    }

    @Override
    public void j0(float f10) {
    }

    @Override
    public void k(float f10) {
    }

    @Override
    public void l(float f10) {
    }

    @Override
    public void n(float f10) {
    }

    @Override
    public void o0(float f10) {
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
    public void r0(float f10) {
    }

    @Override
    public void y0(long j3) {
    }

    @Override
    public void z(float f10) {
    }

    public k(jx jxVar) {
        this.f17342a = 18;
        this.f17344c = jxVar;
        this.f17343b = new Rect();
    }

    public k(Attributes attributes, HashMap hashMap) {
        this.f17342a = 12;
        this.f17344c = attributes;
        String l10 = lz.l("style", attributes);
        if (l10 != null) {
            ArrayList arrayList = new ArrayList();
            this.f17343b = arrayList;
            arrayList.add(new jz(l10));
            return;
        }
        String l11 = lz.l("class", attributes);
        if (l11 != null) {
            this.f17343b = new ArrayList();
            for (String str : l11.split(" ")) {
                jz jzVar = (jz) hashMap.get(str.trim());
                if (jzVar != null) {
                    ((ArrayList) this.f17343b).add(jzVar);
                }
            }
        }
    }

    @Override
    public void H(float f10, int i7) {
    }

    @Override
    public void b0(float f10, int i7) {
    }

    @Override
    public void n0(float f10, int i7) {
    }

    @Override
    public void p(long j3, boolean z10) {
    }

    @Override
    public void u0(int i7, long j3) {
    }

    public k(int i7) {
        this.f17342a = i7;
        switch (i7) {
            case 3:
                this.f17343b = new h2.x();
                this.f17344c = new l4.a();
                return;
            default:
                this.f17343b = new HashMap();
                this.f17344c = l2.d.f19370b;
                return;
        }
    }

    @Override
    public void b(k0 k0Var, f3.q qVar, f0 f0Var) {
    }
}
