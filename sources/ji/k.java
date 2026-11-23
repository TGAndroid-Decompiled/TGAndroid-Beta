package ji;

import a8.p0;
import ai.u1;
import ai.v1;
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
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import bi.v3;
import c8.u9;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.o0;
import e2.s;
import h2.k0;
import h2.x;
import hi.xa;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import m4.a0;
import m4.b0;
import m4.d0;
import m4.f0;
import m9.y;
import oi.d1;
import oi.e1;
import oi.g0;
import oi.h0;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.le;
import org.telegram.messenger.ls;
import org.telegram.messenger.lz;
import org.telegram.messenger.mr;
import org.telegram.messenger.ni;
import org.telegram.messenger.np;
import org.telegram.messenger.nz;
import org.telegram.messenger.si;
import org.telegram.messenger.wr;
import org.telegram.messenger.ys;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.v;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Cells.d2;
import org.telegram.ui.Cells.i4;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.fe0;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.qo;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.zm0;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.au;
import org.telegram.ui.bn;
import org.telegram.ui.d8;
import org.telegram.ui.f8;
import org.telegram.ui.fx;
import org.telegram.ui.fz0;
import org.telegram.ui.h5;
import org.telegram.ui.h7;
import org.telegram.ui.i8;
import org.telegram.ui.j4;
import org.telegram.ui.jx0;
import org.telegram.ui.kx;
import org.telegram.ui.md0;
import org.telegram.ui.r6;
import org.telegram.ui.ur0;
import org.telegram.ui.zt;
import org.xml.sax.Attributes;
import q4.t;
public final class k implements u1, c4.m, a0, Continuation, com.google.android.gms.common.api.internal.q, d1, zm0, mr, qo, xa, h7, tj0, g61, h2.d, q5.b, te.b {
    public final int f17941a;
    public Object f17942b;
    public Object f17943c;

    public k(int i7, Object obj, Object obj2) {
        this.f17941a = i7;
        this.f17942b = obj;
        this.f17943c = obj2;
    }

    public static l2.c I(l2.c cVar, List list) {
        cVar.getClass();
        Map map = cVar.f19267a;
        HashMap hashMap = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                hashMap.remove(str);
            }
        }
        return new l2.c(hashMap);
    }

    public static k K(int i7, boolean z10, byte[] bArr, byte[] bArr2) {
        int i10;
        byte[] byteArray;
        k kVar = new k(10, false);
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
                Pattern pattern = Utilities.f22771a;
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
                kVar.f17942b = serializedData3.toByteArray();
                serializedData3.cleanup();
                SerializedData serializedData4 = new SerializedData();
                serializedData4.writeBytes(o10, 0, 8);
                serializedData4.writeBytes(o4, 8, 16);
                serializedData4.writeBytes(o10, 24, 8);
                kVar.f17943c = serializedData4.toByteArray();
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
            kVar.f17942b = serializedData9.toByteArray();
            serializedData9.cleanup();
            SerializedData serializedData10 = new SerializedData();
            serializedData10.writeBytes(n10, 8, 12);
            serializedData10.writeBytes(n11, 0, 8);
            serializedData10.writeBytes(n12, 16, 4);
            serializedData10.writeBytes(n13, 0, 8);
            kVar.f17943c = serializedData10.toByteArray();
            serializedData10.cleanup();
            return kVar;
        }
        kVar.f17943c = null;
        kVar.f17942b = null;
        return kVar;
    }

    public static void z(k kVar, l2.c cVar) {
        kVar.getClass();
        for (Map.Entry entry : new HashMap((HashMap) kVar.f17942b).entrySet()) {
            if (entry.getKey() == null) {
                List list = (List) entry.getValue();
                if (!I(cVar, list).equals(I((l2.c) kVar.f17943c, list))) {
                    throw null;
                }
            } else {
                throw new ClassCastException();
            }
        }
        kVar.f17943c = cVar;
    }

    @Override
    public void A(int i7, int i10) {
        ((g0) this.f17942b).l1(i7, i10);
    }

    @Override
    public void B(int i7) {
        bn bnVar = (bn) this.f17943c;
        ((a70) this.f17942b).v();
        if (i7 == 0) {
            if (bnVar.getMessagesController().u2(bnVar.f46056l6, bnVar.d(), null)) {
                bnVar.Ic(true);
            }
            if (lc.a(bnVar)) {
                lc.z(bnVar, 4, i7, bnVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        bnVar.getNotificationsController().H(bnVar.f46056l6, i7, bnVar.d());
        if (lc.a(bnVar)) {
            lc.z(bnVar, 5, i7, bnVar.getResourceProvider()).j();
        }
    }

    @Override
    public void D(float r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: ji.k.D(float, int):void");
    }

    public void E(Object obj, String str) {
        int length = str.length();
        String valueOf = String.valueOf(obj);
        ((ArrayList) this.f17942b).add(p5.c.m(str, "=", valueOf, new StringBuilder(length + 1 + valueOf.length())));
    }

    @Override
    public boolean E1(boolean z10) {
        return false;
    }

    public boolean G(int i7) {
        return ((s) this.f17942b).f10688a.get(i7);
    }

    @Override
    public void H(int i7, float f10, float f11, te.c cVar) {
        rh.h hVar = (rh.h) this.f17943c;
        hVar.f56615c.a(f10);
        hVar.d.a(f10);
        hVar.f56614b.a(f10);
        ((Runnable) this.f17942b).run();
    }

    @Override
    public boolean J(e1 e1Var) {
        return false;
    }

    public String L(String str) {
        ArrayList arrayList = (ArrayList) this.f17942b;
        String str2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                str2 = (String) ((lz) arrayList.get(i7)).f25460a.get(str);
                if (str2 != null) {
                    break;
                }
            }
        }
        if (str2 == null) {
            return nz.l(str, (Attributes) this.f17943c);
        }
        return str2;
    }

    public java.lang.Integer N(java.lang.String r5) {
        throw new UnsupportedOperationException("Method not decompiled: ji.k.N(java.lang.String):java.lang.Integer");
    }

    @Override
    public y O(o0 o0Var) {
        y O = ((h2.d) this.f17942b).O(o0Var);
        if (O == null) {
            return null;
        }
        return u9.c(O, new v(this, 18));
    }

    public boolean P(t tVar, String str) {
        Context context = (Context) this.f17942b;
        int i7 = tVar.f55840b;
        if (i7 < 0) {
            if (context.getPackageManager().checkPermission(str, tVar.f55839a) == 0) {
                return true;
            }
            return false;
        } else if (context.checkPermission(str, i7, tVar.f55841c) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void Q(long j3, byte[] bArr) {
        File file;
        e0.g gVar = (e0.g) this.f17943c;
        if (gVar.f10198b) {
            gVar.f10198b = false;
            ((yi.j) gVar.f10200e).h();
            return;
        }
        yi.j jVar = (yi.j) gVar.f10200e;
        jVar.getClass();
        yi.j.q();
        yi.h hVar = jVar.f61349z;
        if (jVar.G == 5 && hVar != null) {
            file = hVar.f61324b;
        } else {
            file = null;
        }
        if (file == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Preview file is unavailable");
            MediaController mediaController = ((le) this.f17942b).f25181a;
            String[] strArr = MediaController.W1;
            a8.e("AudioRecorderV2 failed", illegalStateException);
            ls.f(mediaController.f22710i1).k(ls.f25309m2, Integer.valueOf(mediaController.f22708h1));
            mediaController.x(false);
            return;
        }
        MediaController mediaController2 = ((le) this.f17942b).f25181a;
        mediaController2.f22714k1 = file;
        mediaController2.l1 = j3;
        mediaController2.G0(file, j3, bArr);
        si.d0(mediaController2.f22710i1).F1(mediaController2.n1, mediaController2.f22720o1, ni.a(mediaController2, file.getAbsolutePath(), mediaController2.K1));
        ls.f(mediaController2.f22710i1).k(ls.f25320o2, new Object[0]);
        ls.f(mediaController2.f22710i1).k(ls.f25345s2, Integer.valueOf(mediaController2.f22708h1), mediaController2.f22706g1, file.getAbsolutePath());
        mediaController2.Y(false);
        MediaController.j0(false);
    }

    public int R(Context context, com.google.android.gms.common.api.c cVar) {
        q6.m.h(context);
        q6.m.h(cVar);
        int i7 = 0;
        if (!cVar.c()) {
            return 0;
        }
        int d = cVar.d();
        int S = S(d);
        if (S != -1) {
            return S;
        }
        SparseIntArray sparseIntArray = (SparseIntArray) this.f17942b;
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
                i7 = ((n6.e) this.f17943c).d(context, d);
            }
            sparseIntArray.put(d, i7);
        }
        return i7;
    }

    public int S(int i7) {
        int i10;
        SparseIntArray sparseIntArray = (SparseIntArray) this.f17942b;
        synchronized (sparseIntArray) {
            i10 = sparseIntArray.get(i7, -1);
        }
        return i10;
    }

    @Override
    public void a(String str, String str2) {
        n nVar = (n) this.f17943c;
        v1 v1Var = (v1) this.f17942b;
        if (!nVar.J) {
            if (v1Var == nVar.f17965f) {
                nVar.a(str, str2);
            }
        } else if (v1Var == nVar.U) {
            nVar.U = null;
            if (!str.isEmpty()) {
                nVar.u(v1Var, str);
            }
            nVar.e();
            Log.d("VoiceLive", "field: final words in (" + nVar.L.size() + " words)");
            nVar.o();
        } else if (v1Var != nVar.f17965f) {
        } else {
            Log.d("VoiceLive", "field: recogniser ended by itself error=" + str2);
            if (!str.isEmpty()) {
                nVar.u(v1Var, str);
            }
            nVar.f17965f = null;
            if (wr.f27759k == nVar) {
                wr.f27759k = null;
            }
            nVar.d = null;
            nVar.f17963e = null;
            nVar.e();
            nVar.o();
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        int i7;
        o7.d dVar = (o7.d) this.f17942b;
        o7.b bVar = (o7.b) obj;
        e7.b bVar2 = new e7.b(dVar, (TaskCompletionSource) obj2);
        Context context = dVar.f6380a;
        try {
            i7 = z6.b.a(context).b(0, context.getPackageName()).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i7 = 0;
        }
        m6.b bVar3 = (m6.b) this.f17943c;
        bVar3.f20842f = i7;
        o7.c cVar = (o7.c) bVar.n();
        com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true), true);
        gVar.f6198c = false;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
        int i10 = o7.a.f21732a;
        obtain.writeStrongBinder(bVar2);
        obtain.writeInt(1);
        bVar3.writeToParcel(obtain, 0);
        obtain.writeInt(1);
        gVar.writeToParcel(obtain, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            cVar.f21733a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override
    public void b1(CharSequence charSequence) {
        ((g0) this.f17942b).S0(charSequence);
    }

    @Override
    public void c(x xVar) {
        d0 d0Var = (d0) this.f17943c;
        SparseArray sparseArray = d0Var.h;
        d4.f fVar = (d4.f) this.f17942b;
        if (xVar.A() == 0 && (xVar.A() & 128) != 0) {
            xVar.O(6);
            int a10 = xVar.a() / 4;
            for (int i7 = 0; i7 < a10; i7++) {
                xVar.k(0, 4, (byte[]) fVar.f7828b);
                fVar.J(0);
                int j3 = fVar.j(16);
                fVar.L(3);
                if (j3 == 0) {
                    fVar.L(13);
                } else {
                    int j10 = fVar.j(13);
                    if (sparseArray.get(j10) == null) {
                        sparseArray.put(j10, new b0(new a4.k(d0Var, j10)));
                        d0Var.f20576n++;
                    }
                }
            }
            if (d0Var.f20565a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override
    public void d(boolean z10) {
        f8 f8Var = ((d8) this.f17943c).f46856b;
        f8Var.f47600y.finishFragment();
        i8 i8Var = f8Var.f47600y;
        ((bn) this.f17942b).j8(i8Var.Q, i8Var.R + 86400, z10);
    }

    @Override
    public boolean d2(e1 e1Var) {
        return false;
    }

    @Override
    public void dismiss() {
        switch (this.f17941a) {
            case 14:
                ((a70) this.f17942b).v();
                return;
            default:
                ((au) this.f17943c).dismiss();
                return;
        }
    }

    @Override
    public void e(e1 e1Var) {
        ((g0) this.f17942b).e(e1Var);
    }

    @Override
    public boolean mo23f(float f10, float f11, int i7, View view) {
        Rect rect = (Rect) this.f17942b;
        kx kxVar = (kx) this.f17943c;
        if (kxVar.getParentActivity() != null && (view instanceof i4)) {
            ((ImageView) view.getTag(2131296587)).getHitRect(rect);
            if (!rect.contains((int) f10, (int) f11)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kxVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{hd.N0(2131751586, null)}, new fx(this, i7, 0));
                kxVar.showDialog(alertDialog$Builder.f28743a);
                return true;
            }
        }
        return false;
    }

    @Override
    public void g0(boolean z10, float f10) {
        hb0 hb0Var = (hb0) this.f17942b;
        fe0 fe0Var = (fe0) this.f17943c;
        i61 i61Var = fe0Var.d;
        if (i61Var != null) {
            long U = i61Var.U();
            float max = 2.8f / ((float) Math.max(60L, U));
            long j3 = (((f10 / (1.0f - max)) * max) + f10) * ((float) U);
            fe0Var.f35188e = j3;
            fe0Var.d.q0(j3, !z10);
            if (!z10) {
                org.telegram.messenger.g0.r(hb0Var);
                org.telegram.messenger.g0.h3(hb0Var, 120L);
            }
        }
    }

    @Override
    public Object mo24get() {
        return new p5.e((Context) ((e.a) this.f17942b).f10172a, (md0) ((pf) this.f17943c).mo24get());
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public void h(float f10) {
        v1 v1Var = (v1) this.f17942b;
        n nVar = (n) this.f17943c;
        if (v1Var == nVar.f17965f) {
            nVar.h(f10);
        }
    }

    @Override
    public void i(String str) {
        n.b((n) this.f17943c, (v1) this.f17942b, str, -1);
    }

    @Override
    public void l(int i7, String str) {
        n.b((n) this.f17943c, (v1) this.f17942b, str, i7);
    }

    @Override
    public void m(r6 r6Var, ei.b bVar, boolean z10) {
        au auVar = (au) this.f17943c;
        zt ztVar = auVar.T1;
        if (bVar != null) {
            ((ei.c) this.f17942b).i(bVar);
            auVar.f45650a2.e();
            ei.c cVar = auVar.f45652c2;
            qw0[] qw0VarArr = auVar.X1;
            d2[] d2VarArr = auVar.Y1;
            d2 d2Var = d2VarArr[0];
            if (d2Var != null) {
                qw0 qw0Var = qw0VarArr[0];
                boolean z11 = cVar.f10974m;
                qw0Var.f38962c = z11;
                d2Var.c(z11, true);
            }
            d2 d2Var2 = d2VarArr[1];
            if (d2Var2 != null) {
                qw0 qw0Var2 = qw0VarArr[1];
                boolean z12 = cVar.f10975n;
                qw0Var2.f38962c = z12;
                d2Var2.c(z12, true);
            }
            d2 d2Var3 = d2VarArr[2];
            if (d2Var3 != null) {
                qw0 qw0Var3 = qw0VarArr[2];
                boolean z13 = cVar.f10976o;
                qw0Var3.f38962c = z13;
                d2Var3.c(z13, true);
            }
            d2 d2Var4 = d2VarArr[3];
            if (d2Var4 != null) {
                qw0 qw0Var4 = qw0VarArr[3];
                boolean z14 = cVar.f10977p;
                qw0Var4.f38962c = z14;
                d2Var4.c(z14, true);
            }
            d2 d2Var5 = d2VarArr[4];
            if (d2Var5 != null) {
                qw0 qw0Var5 = qw0VarArr[4];
                boolean z15 = cVar.f10978q;
                qw0Var5.f38962c = z15;
                d2Var5.c(z15, true);
            }
            auVar.W1.a(ztVar.d(), true);
            ztVar.c(true);
        }
    }

    @Override
    public void n(boolean z10, float f10) {
        ((TextView) this.f17942b).setText("Alpha " + h5.f48196p1);
        h5.f48196p1 = f10;
        ((h5) this.f17943c).f48197m1.K();
    }

    @Override
    public boolean o() {
        return ((g0) this.f17942b).g1();
    }

    @Override
    public void onError(i61 i61Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f17943c;
        int i7 = secretMediaViewer.f43725a0;
        if (i7 > 0) {
            secretMediaViewer.f43725a0 = i7 - 1;
            org.telegram.messenger.g0.h3(new ur0(28, this, (File) this.f17942b), 100L);
            return;
        }
        a8.g(exc, true);
    }

    @Override
    public void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f17943c;
        fz0 fz0Var = secretMediaViewer.f43744h1;
        if (secretMediaViewer.E != null && secretMediaViewer.f43741g0 != null) {
            org.telegram.messenger.g0.r(fz0Var);
            org.telegram.messenger.g0.g3(fz0Var);
            if (i7 != 4 && i7 != 1) {
                try {
                    secretMediaViewer.f43727b.getWindow().addFlags(128);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            } else {
                try {
                    secretMediaViewer.f43727b.getWindow().clearFlags(128);
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
            }
            if (i7 == 3 && secretMediaViewer.f43775x.getVisibility() != 0) {
                secretMediaViewer.f43775x.setVisibility(0);
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
                        secretMediaViewer.e(true, !secretMediaViewer.f43758p1);
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
        j4 j4Var = ((SecretMediaViewer) this.f17943c).f43775x;
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
    public c4.d q(int i7, int i10, byte[] bArr) {
        return p0.a(this, bArr, i10);
    }

    @Override
    public int r0() {
        return 0;
    }

    @Override
    public void r1(e1 e1Var, int i7, int i10) {
        j9 P0;
        g0 g0Var = (g0) this.f17942b;
        if (!((h0) this.f17943c).d && i7 != i10 && (P0 = g0Var.P0()) != null) {
            if (!P0.x() || P0.W != g0Var.a1()) {
                e1Var.post(new v3(this, e1Var, i10, P0, g0Var, i7));
            }
        }
    }

    @Override
    public void s() {
        ((a70) this.f17942b).v();
        bn bnVar = (bn) this.f17943c;
        bnVar.Ic(true);
        lc.A(bnVar, bnVar.getMessagesController().u2(bnVar.f46056l6, bnVar.d(), null), bnVar.Ba).j();
    }

    @Override
    public void s1(Editable editable) {
        ((h0) this.f17943c).i();
        ((g0) this.f17942b).u1();
    }

    @Override
    public y t0(byte[] bArr) {
        return u9.c(((h2.d) this.f17942b).t0(bArr), new v(this, 18));
    }

    @Override
    public Object then(Task task) {
        m6.c cVar = (m6.c) this.f17942b;
        Bundle bundle = (Bundle) this.f17943c;
        cVar.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        if (bundle2 != null && bundle2.containsKey("google.messenger")) {
            return cVar.d(bundle).onSuccessTask(m6.d.f20851b, w7.s.f59635c);
        }
        return task;
    }

    public String toString() {
        switch (this.f17941a) {
            case 24:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f17943c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f17942b;
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
    public void u() {
        ((a70) this.f17942b).v();
        bn bnVar = (bn) this.f17943c;
        if (bnVar.f46056l6 != 0 && bnVar.f45989g4 != 3) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", bnVar.f46056l6);
            if (bnVar.d() != 0) {
                bundle.putLong("topic_id", bnVar.d());
            }
            bnVar.presentFragment(new jx0(bundle, bnVar.Ba));
        }
    }

    @Override
    public void v(byte[] r19, int r20, int r21, c4.l r22, h2.j r23) {
        throw new UnsupportedOperationException("Method not decompiled: ji.k.v(byte[], int, int, c4.l, h2.j):void");
    }

    @Override
    public void w() {
        int i7;
        ((a70) this.f17942b).v();
        bn bnVar = (bn) this.f17943c;
        i7 = ((g2) bnVar).currentAccount;
        SharedPreferences sharedPreferences = np.u1(i7).f25821g7;
        boolean z10 = sharedPreferences.getBoolean("sound_enabled_" + ys.v(bnVar.f46056l6, bnVar.d(), false), true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + ys.v(bnVar.f46056l6, bnVar.d(), false), z11).apply();
        if (lc.a(bnVar)) {
            lc.S(z10 ? 1 : 0, bnVar, bnVar.getResourceProvider()).j();
        }
        bnVar.yd(false);
    }

    @Override
    public void x(String str) {
        v1 v1Var = (v1) this.f17942b;
        n nVar = (n) this.f17943c;
        if (v1Var == nVar.f17965f) {
            nVar.x(str);
        }
    }

    @Override
    public void x0(e1 e1Var) {
        ((g0) this.f17942b).u();
    }

    @Override
    public int y() {
        return 1;
    }

    public k(int i7, boolean z10) {
        this.f17941a = i7;
    }

    @Override
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f17943c;
        if (secretMediaViewer.f43728b0) {
            return;
        }
        secretMediaViewer.f43728b0 = true;
        secretMediaViewer.f43735e.invalidate();
    }

    public k(Object obj, int i7) {
        this.f17941a = i7;
        this.f17942b = obj;
    }

    public k(Object obj, Object obj2, boolean z10, int i7) {
        this.f17941a = i7;
        this.f17943c = obj;
        this.f17942b = obj2;
    }

    public k(Object obj) {
        this.f17941a = 24;
        this.f17943c = obj;
        this.f17942b = new ArrayList();
    }

    public k(n6.e eVar) {
        this.f17941a = 25;
        this.f17942b = new SparseIntArray();
        q6.m.h(eVar);
        this.f17943c = eVar;
    }

    public k(fe0 fe0Var) {
        this.f17941a = 15;
        this.f17943c = fe0Var;
        this.f17942b = new hb0(this, 8);
    }

    public k(s sVar, SparseArray sparseArray) {
        this.f17941a = 3;
        this.f17942b = sVar;
        SparseBooleanArray sparseBooleanArray = sVar.f10688a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i7 = 0; i7 < sparseBooleanArray.size(); i7++) {
            int a10 = sVar.a(i7);
            m2.a aVar = (m2.a) sparseArray.get(a10);
            aVar.getClass();
            sparseArray2.append(a10, aVar);
        }
        this.f17943c = sparseArray2;
    }

    public k(String str) {
        this.f17941a = 6;
        this.f17943c = null;
        this.f17942b = str;
    }

    public k(EditText editText) {
        this.f17941a = 29;
        this.f17942b = editText;
        t1.i iVar = new t1.i(editText);
        this.f17943c = iVar;
        editText.addTextChangedListener(iVar);
        if (t1.a.f57530b == null) {
            synchronized (t1.a.f57529a) {
                try {
                    if (t1.a.f57530b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            t1.a.f57531c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, t1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        t1.a.f57530b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(t1.a.f57530b);
    }

    public k(n nVar) {
        this.f17941a = 0;
        this.f17943c = nVar;
    }

    public k(d0 d0Var) {
        this.f17941a = 4;
        this.f17943c = d0Var;
        this.f17942b = new d4.f(new byte[4], 4);
    }

    public k(kx kxVar) {
        this.f17941a = 17;
        this.f17943c = kxVar;
        this.f17942b = new Rect();
    }

    public k(Attributes attributes, HashMap hashMap) {
        this.f17941a = 11;
        this.f17943c = attributes;
        String l10 = nz.l("style", attributes);
        if (l10 != null) {
            ArrayList arrayList = new ArrayList();
            this.f17942b = arrayList;
            arrayList.add(new lz(l10));
            return;
        }
        String l11 = nz.l("class", attributes);
        if (l11 != null) {
            this.f17942b = new ArrayList();
            for (String str : l11.split(" ")) {
                lz lzVar = (lz) hashMap.get(str.trim());
                if (lzVar != null) {
                    ((ArrayList) this.f17942b).add(lzVar);
                }
            }
        }
    }

    public k(int i7) {
        this.f17941a = i7;
        switch (i7) {
            case 2:
                this.f17942b = new x();
                this.f17943c = new l4.a();
                return;
            default:
                this.f17942b = new HashMap();
                this.f17943c = l2.c.f19266b;
                return;
        }
    }

    @Override
    public void C() {
    }

    @Override
    public void E0() {
    }

    @Override
    public void N1() {
    }

    @Override
    public void clear() {
    }

    @Override
    public void f0() {
    }

    @Override
    public void j() {
    }

    @Override
    public void k() {
    }

    @Override
    public void p() {
    }

    @Override
    public void reset() {
    }

    @Override
    public void D0(boolean z10) {
    }

    @Override
    public void F(float f10) {
    }

    @Override
    public void M1(float f10) {
    }

    @Override
    public void Q0(float f10) {
    }

    @Override
    public void b2(float f10) {
    }

    @Override
    public void e1(long j3) {
    }

    @Override
    public void g(int i7) {
    }

    @Override
    public void h1(boolean z10) {
    }

    @Override
    public void m2(long j3) {
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
    public void q1(float f10) {
    }

    @Override
    public void r(float f10) {
    }

    @Override
    public void s0(float f10) {
    }

    @Override
    public void t(float f10) {
    }

    @Override
    public void w1(float f10) {
    }

    @Override
    public void G1(float f10, int i7) {
    }

    @Override
    public void J0(float f10, int i7) {
    }

    @Override
    public void M(long j3, boolean z10) {
    }

    @Override
    public void i2(int i7, long j3) {
    }

    @Override
    public void n1(float f10, int i7) {
    }

    @Override
    public void b(k0 k0Var, f3.q qVar, f0 f0Var) {
    }
}
