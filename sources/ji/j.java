package ji;

import a8.p0;
import ai.b2;
import ai.z1;
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
import c8.r9;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.o0;
import e2.s;
import h2.k0;
import h2.x;
import hi.wa;
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
import oi.e0;
import oi.e1;
import oi.g0;
import oi.h0;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.at;
import org.telegram.messenger.hd;
import org.telegram.messenger.le;
import org.telegram.messenger.ni;
import org.telegram.messenger.np;
import org.telegram.messenger.nr;
import org.telegram.messenger.ns;
import org.telegram.messenger.oz;
import org.telegram.messenger.qz;
import org.telegram.messenger.si;
import org.telegram.messenger.xr;
import org.telegram.tgnet.SerializedData;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.z;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Cells.h4;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.y0;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.ho;
import org.telegram.ui.Components.hw0;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.an;
import org.telegram.ui.bx;
import org.telegram.ui.bz0;
import org.telegram.ui.d8;
import org.telegram.ui.f8;
import org.telegram.ui.fx0;
import org.telegram.ui.fy0;
import org.telegram.ui.gx;
import org.telegram.ui.h5;
import org.telegram.ui.i7;
import org.telegram.ui.i8;
import org.telegram.ui.j4;
import org.telegram.ui.ld0;
import org.telegram.ui.s6;
import org.telegram.ui.xt;
import org.telegram.ui.yt;
import org.xml.sax.Attributes;
import q4.t;
public final class j implements z1, c4.m, a0, Continuation, com.google.android.gms.common.api.internal.q, d1, pm0, nr, ho, wa, i7, jj0, s51, h2.d, q5.b, te.b {
    public final int f17554a;
    public Object f17555b;
    public Object f17556c;

    public j(int i7, Object obj, Object obj2) {
        this.f17554a = i7;
        this.f17555b = obj;
        this.f17556c = obj2;
    }

    public static void T(j jVar, l2.c cVar) {
        jVar.getClass();
        for (Map.Entry entry : new HashMap((HashMap) jVar.f17555b).entrySet()) {
            if (entry.getKey() == null) {
                List list = (List) entry.getValue();
                if (!W(cVar, list).equals(W((l2.c) jVar.f17556c, list))) {
                    throw null;
                }
            } else {
                throw new ClassCastException();
            }
        }
        jVar.f17556c = cVar;
    }

    public static l2.c W(l2.c cVar, List list) {
        cVar.getClass();
        Map map = cVar.f18906a;
        HashMap hashMap = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                hashMap.remove(str);
            }
        }
        return new l2.c(hashMap);
    }

    public static j a0(int i7, boolean z10, byte[] bArr, byte[] bArr2) {
        int i10;
        byte[] byteArray;
        j jVar = new j(10, false);
        if (bArr != null && bArr.length != 0) {
            if (z10) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            if (i7 != 1) {
                if (i7 != 2) {
                    return jVar;
                }
                SerializedData serializedData = new SerializedData();
                serializedData.writeBytes(bArr2, 0, 16);
                serializedData.writeBytes(bArr, i10, 36);
                byte[] byteArray2 = serializedData.toByteArray();
                Pattern pattern = Utilities.f22413a;
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
                jVar.f17555b = serializedData3.toByteArray();
                serializedData3.cleanup();
                SerializedData serializedData4 = new SerializedData();
                serializedData4.writeBytes(o10, 0, 8);
                serializedData4.writeBytes(o4, 8, 16);
                serializedData4.writeBytes(o10, 24, 8);
                jVar.f17556c = serializedData4.toByteArray();
                serializedData4.cleanup();
                return jVar;
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
            jVar.f17555b = serializedData9.toByteArray();
            serializedData9.cleanup();
            SerializedData serializedData10 = new SerializedData();
            serializedData10.writeBytes(n10, 8, 12);
            serializedData10.writeBytes(n11, 0, 8);
            serializedData10.writeBytes(n12, 16, 4);
            serializedData10.writeBytes(n13, 0, 8);
            jVar.f17556c = serializedData10.toByteArray();
            serializedData10.cleanup();
            return jVar;
        }
        jVar.f17556c = null;
        jVar.f17555b = null;
        return jVar;
    }

    @Override
    public void E(float r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: ji.j.E(float, int):void");
    }

    @Override
    public void F() {
        ((m60) this.f17555b).u();
        an anVar = (an) this.f17556c;
        if (anVar.f45259k6 != 0 && anVar.f45204g4 != 3) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", anVar.f45259k6);
            if (anVar.b() != 0) {
                bundle.putLong("topic_id", anVar.b());
            }
            anVar.presentFragment(new fx0(bundle, anVar.Aa));
        }
    }

    @Override
    public void G(int i7, float f10, float f11, te.c cVar) {
        rh.h hVar = (rh.h) this.f17556c;
        hVar.f56031c.a(f10);
        hVar.d.a(f10);
        hVar.f56030b.a(f10);
        ((Runnable) this.f17555b).run();
    }

    @Override
    public void I(CharSequence charSequence) {
        ((g0) this.f17555b).J(charSequence);
    }

    @Override
    public void J() {
        int i7;
        ((m60) this.f17555b).u();
        an anVar = (an) this.f17556c;
        i7 = ((e2) anVar).currentAccount;
        SharedPreferences sharedPreferences = np.s1(i7).f25270e7;
        boolean z10 = sharedPreferences.getBoolean("sound_enabled_" + at.v(anVar.f45259k6, anVar.b(), false), true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + at.v(anVar.f45259k6, anVar.b(), false), z11).apply();
        if (cc.a(anVar)) {
            cc.S(z10 ? 1 : 0, anVar, anVar.getResourceProvider()).j();
        }
        anVar.yd(false);
    }

    @Override
    public void K(byte[] r19, int r20, int r21, c4.l r22, h2.j r23) {
        throw new UnsupportedOperationException("Method not decompiled: ji.j.K(byte[], int, int, c4.l, h2.j):void");
    }

    @Override
    public y L(o0 o0Var) {
        y L = ((h2.d) this.f17555b).L(o0Var);
        if (L == null) {
            return null;
        }
        return r9.c(L, new z(this, 16));
    }

    @Override
    public void M(int i7, String str) {
        m.b((m) this.f17556c, (b2) this.f17555b, str, i7);
    }

    @Override
    public void N(s6 s6Var, ei.b bVar, boolean z10) {
        yt ytVar = (yt) this.f17556c;
        xt xtVar = ytVar.T1;
        if (bVar != null) {
            ((ei.c) this.f17555b).i(bVar);
            ytVar.f53624a2.e();
            ei.c cVar = ytVar.f53626c2;
            hw0[] hw0VarArr = ytVar.X1;
            c2[] c2VarArr = ytVar.Y1;
            c2 c2Var = c2VarArr[0];
            if (c2Var != null) {
                hw0 hw0Var = hw0VarArr[0];
                boolean z11 = cVar.f10662m;
                hw0Var.f35366c = z11;
                c2Var.c(z11, true);
            }
            c2 c2Var2 = c2VarArr[1];
            if (c2Var2 != null) {
                hw0 hw0Var2 = hw0VarArr[1];
                boolean z12 = cVar.f10663n;
                hw0Var2.f35366c = z12;
                c2Var2.c(z12, true);
            }
            c2 c2Var3 = c2VarArr[2];
            if (c2Var3 != null) {
                hw0 hw0Var3 = hw0VarArr[2];
                boolean z13 = cVar.f10664o;
                hw0Var3.f35366c = z13;
                c2Var3.c(z13, true);
            }
            c2 c2Var4 = c2VarArr[3];
            if (c2Var4 != null) {
                hw0 hw0Var4 = hw0VarArr[3];
                boolean z14 = cVar.f10665p;
                hw0Var4.f35366c = z14;
                c2Var4.c(z14, true);
            }
            c2 c2Var5 = c2VarArr[4];
            if (c2Var5 != null) {
                hw0 hw0Var5 = hw0VarArr[4];
                boolean z15 = cVar.f10666q;
                hw0Var5.f35366c = z15;
                c2Var5.c(z15, true);
            }
            ytVar.W1.a(xtVar.d(), true);
            xtVar.c(true);
        }
    }

    @Override
    public void P(String str) {
        b2 b2Var = (b2) this.f17555b;
        m mVar = (m) this.f17556c;
        if (b2Var == mVar.f17578f) {
            mVar.P(str);
        }
    }

    @Override
    public int Q() {
        return 1;
    }

    @Override
    public void R(int i7) {
        an anVar = (an) this.f17556c;
        ((m60) this.f17555b).u();
        if (i7 == 0) {
            if (anVar.getMessagesController().r2(anVar.f45259k6, anVar.b(), null)) {
                anVar.Ic(true);
            }
            if (cc.a(anVar)) {
                cc.z(anVar, 4, i7, anVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        anVar.getNotificationsController().H(anVar.f45259k6, i7, anVar.b());
        if (cc.a(anVar)) {
            cc.z(anVar, 5, i7, anVar.getResourceProvider()).j();
        }
    }

    public void U(Object obj, String str) {
        int length = str.length();
        String valueOf = String.valueOf(obj);
        ((ArrayList) this.f17555b).add(y0.m(str, "=", valueOf, new StringBuilder(length + 1 + valueOf.length())));
    }

    public boolean V(int i7) {
        return ((s) this.f17555b).f10378a.get(i7);
    }

    @Override
    public void Z(e1 e1Var, int i7, int i10) {
        h9 E;
        g0 g0Var = (g0) this.f17555b;
        if (!((h0) this.f17556c).d && i7 != i10 && (E = g0Var.E()) != null) {
            if (!E.x() || E.W != g0Var.N()) {
                e1Var.post(new e0(this, e1Var, i10, E, g0Var, i7));
            }
        }
    }

    @Override
    public void a(String str, String str2) {
        m mVar = (m) this.f17556c;
        b2 b2Var = (b2) this.f17555b;
        if (!mVar.J) {
            if (b2Var == mVar.f17578f) {
                mVar.a(str, str2);
            }
        } else if (b2Var == mVar.U) {
            mVar.U = null;
            if (!str.isEmpty()) {
                mVar.u(b2Var, str);
            }
            mVar.e();
            Log.d("VoiceLive", "field: final words in (" + mVar.L.size() + " words)");
            mVar.n();
        } else if (b2Var != mVar.f17578f) {
        } else {
            Log.d("VoiceLive", "field: recogniser ended by itself error=" + str2);
            if (!str.isEmpty()) {
                mVar.u(b2Var, str);
            }
            mVar.f17578f = null;
            if (xr.f27575k == mVar) {
                xr.f27575k = null;
            }
            mVar.d = null;
            mVar.f17576e = null;
            mVar.e();
            mVar.n();
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        int i7;
        o7.d dVar = (o7.d) this.f17555b;
        o7.b bVar = (o7.b) obj;
        e7.b bVar2 = new e7.b(dVar, (TaskCompletionSource) obj2);
        Context context = dVar.f6102a;
        try {
            i7 = z6.b.a(context).c(0, context.getPackageName()).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i7 = 0;
        }
        m6.b bVar3 = (m6.b) this.f17556c;
        bVar3.f20484f = i7;
        o7.c cVar = (o7.c) bVar.n();
        com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true), true);
        gVar.f5920c = false;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
        int i10 = o7.a.f21375a;
        obtain.writeStrongBinder(bVar2);
        obtain.writeInt(1);
        bVar3.writeToParcel(obtain, 0);
        obtain.writeInt(1);
        gVar.writeToParcel(obtain, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            cVar.f21376a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override
    public void b0(Editable editable) {
        ((h0) this.f17556c).i();
        ((g0) this.f17555b).c0();
    }

    @Override
    public void c(x xVar) {
        d0 d0Var = (d0) this.f17556c;
        SparseArray sparseArray = d0Var.h;
        d4.f fVar = (d4.f) this.f17555b;
        if (xVar.A() == 0 && (xVar.A() & 128) != 0) {
            xVar.O(6);
            int a10 = xVar.a() / 4;
            for (int i7 = 0; i7 < a10; i7++) {
                xVar.k(0, 4, (byte[]) fVar.f7550b);
                fVar.J(0);
                int j3 = fVar.j(16);
                fVar.L(3);
                if (j3 == 0) {
                    fVar.L(13);
                } else {
                    int j10 = fVar.j(13);
                    if (sparseArray.get(j10) == null) {
                        sparseArray.put(j10, new b0(new a4.k(d0Var, j10)));
                        d0Var.f20218n++;
                    }
                }
            }
            if (d0Var.f20207a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    public String c0(String str) {
        ArrayList arrayList = (ArrayList) this.f17555b;
        String str2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                str2 = (String) ((oz) arrayList.get(i7)).f25832a.get(str);
                if (str2 != null) {
                    break;
                }
            }
        }
        if (str2 == null) {
            return qz.l(str, (Attributes) this.f17556c);
        }
        return str2;
    }

    @Override
    public void d(e1 e1Var) {
        ((g0) this.f17555b).d(e1Var);
    }

    @Override
    public y d0(byte[] bArr) {
        return r9.c(((h2.d) this.f17555b).d0(bArr), new z(this, 16));
    }

    @Override
    public void dismiss() {
        switch (this.f17554a) {
            case 14:
                ((m60) this.f17555b).u();
                return;
            default:
                ((yt) this.f17556c).dismiss();
                return;
        }
    }

    public java.lang.Integer e0(java.lang.String r5) {
        throw new UnsupportedOperationException("Method not decompiled: ji.j.e0(java.lang.String):java.lang.Integer");
    }

    @Override
    public boolean mo0f(float f10, float f11, int i7, View view) {
        Rect rect = (Rect) this.f17555b;
        gx gxVar = (gx) this.f17556c;
        if (gxVar.getParentActivity() != null && (view instanceof h4)) {
            ((ImageView) view.getTag(2131296585)).getHitRect(rect);
            if (!rect.contains((int) f10, (int) f11)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gxVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{hd.M0(2131751598, null)}, new bx(this, i7, 0));
                gxVar.showDialog(alertDialog$Builder.f28392a);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean g() {
        return ((g0) this.f17555b).R();
    }

    public boolean g0(t tVar, String str) {
        Context context = (Context) this.f17555b;
        int i7 = tVar.f55256b;
        if (i7 < 0) {
            if (context.getPackageManager().checkPermission(str, tVar.f55255a) == 0) {
                return true;
            }
            return false;
        } else if (context.checkPermission(str, i7, tVar.f55257c) == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object mo24get() {
        return new p5.d((Context) ((d9.o) this.f17555b).f7640b, (ld0) ((ff) this.f17556c).mo24get());
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public void h(float f10) {
        b2 b2Var = (b2) this.f17555b;
        m mVar = (m) this.f17556c;
        if (b2Var == mVar.f17578f) {
            mVar.h(f10);
        }
    }

    @Override
    public boolean h0(boolean z10) {
        return false;
    }

    @Override
    public void j(boolean z10) {
        f8 f8Var = ((d8) this.f17556c).f46334b;
        f8Var.f47058y.finishFragment();
        i8 i8Var = f8Var.f47058y;
        ((an) this.f17555b).j8(i8Var.Q, i8Var.R + 86400, z10);
    }

    @Override
    public void l(boolean z10, float f10) {
        ((TextView) this.f17555b).setText("Alpha " + h5.f47611p1);
        h5.f47611p1 = f10;
        ((h5) this.f17556c).f47612m1.K();
    }

    public void l0(long j3, byte[] bArr) {
        File file;
        e0.g gVar = (e0.g) this.f17556c;
        if (gVar.f9888b) {
            gVar.f9888b = false;
            ((yi.j) gVar.f9890e).h();
            return;
        }
        yi.j jVar = (yi.j) gVar.f9890e;
        jVar.getClass();
        yi.j.q();
        yi.i iVar = jVar.f60774z;
        if (jVar.G == 5 && iVar != null) {
            file = iVar.f60749b;
        } else {
            file = null;
        }
        if (file == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Preview file is unavailable");
            MediaController mediaController = ((le) this.f17555b).f24823a;
            String[] strArr = MediaController.W1;
            a8.e("AudioRecorderV2 failed", illegalStateException);
            ns.f(mediaController.f22352i1).k(ns.f25533m2, Integer.valueOf(mediaController.f22350h1));
            mediaController.x(false);
            return;
        }
        MediaController mediaController2 = ((le) this.f17555b).f24823a;
        mediaController2.f22356k1 = file;
        mediaController2.l1 = j3;
        mediaController2.G0(file, j3, bArr);
        si.b0(mediaController2.f22352i1).B1(mediaController2.n1, mediaController2.f22362o1, ni.a(mediaController2, file.getAbsolutePath(), mediaController2.K1));
        ns.f(mediaController2.f22352i1).k(ns.f25544o2, new Object[0]);
        ns.f(mediaController2.f22352i1).k(ns.f25569s2, Integer.valueOf(mediaController2.f22350h1), mediaController2.f22348g1, file.getAbsolutePath());
        mediaController2.Y(false);
        MediaController.j0(false);
    }

    @Override
    public void m(int i7, int i10) {
        ((g0) this.f17555b).V(i7, i10);
    }

    public int m0(Context context, com.google.android.gms.common.api.c cVar) {
        q6.m.g(context);
        q6.m.g(cVar);
        int i7 = 0;
        if (!cVar.c()) {
            return 0;
        }
        int d = cVar.d();
        int n02 = n0(d);
        if (n02 != -1) {
            return n02;
        }
        SparseIntArray sparseIntArray = (SparseIntArray) this.f17555b;
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
                i7 = ((n6.e) this.f17556c).d(context, d);
            }
            sparseIntArray.put(d, i7);
        }
        return i7;
    }

    public int n0(int i7) {
        int i10;
        SparseIntArray sparseIntArray = (SparseIntArray) this.f17555b;
        synchronized (sparseIntArray) {
            i10 = sparseIntArray.get(i7, -1);
        }
        return i10;
    }

    @Override
    public boolean o(e1 e1Var) {
        return false;
    }

    @Override
    public void onError(u51 u51Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f17556c;
        int i7 = secretMediaViewer.f43269a0;
        if (i7 > 0) {
            secretMediaViewer.f43269a0 = i7 - 1;
            org.telegram.messenger.g0.i3(new fy0(3, this, (File) this.f17555b), 100L);
            return;
        }
        a8.g(exc, true);
    }

    @Override
    public void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f17556c;
        bz0 bz0Var = secretMediaViewer.f43288h1;
        if (secretMediaViewer.E != null && secretMediaViewer.f43285g0 != null) {
            org.telegram.messenger.g0.r(bz0Var);
            org.telegram.messenger.g0.h3(bz0Var);
            if (i7 != 4 && i7 != 1) {
                try {
                    secretMediaViewer.f43271b.getWindow().addFlags(128);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            } else {
                try {
                    secretMediaViewer.f43271b.getWindow().clearFlags(128);
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
            }
            if (i7 == 3 && secretMediaViewer.f43319x.getVisibility() != 0) {
                secretMediaViewer.f43319x.setVisibility(0);
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
                        secretMediaViewer.e(true, !secretMediaViewer.f43302p1);
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
        j4 j4Var = ((SecretMediaViewer) this.f17556c).f43319x;
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
    public int p0() {
        return 0;
    }

    @Override
    public boolean q0(e1 e1Var) {
        return false;
    }

    @Override
    public void r(String str) {
        m.b((m) this.f17556c, (b2) this.f17555b, str, -1);
    }

    @Override
    public Object then(Task task) {
        m6.c cVar = (m6.c) this.f17555b;
        Bundle bundle = (Bundle) this.f17556c;
        cVar.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        if (bundle2 != null && bundle2.containsKey("google.messenger")) {
            return cVar.d(bundle).onSuccessTask(m6.d.f20493b, w7.s.f59062c);
        }
        return task;
    }

    public String toString() {
        switch (this.f17554a) {
            case 24:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f17556c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f17555b;
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
        ((m60) this.f17555b).u();
        an anVar = (an) this.f17556c;
        anVar.Ic(true);
        cc.A(anVar, anVar.getMessagesController().r2(anVar.f45259k6, anVar.b(), null), anVar.Aa).j();
    }

    @Override
    public void v(boolean z10, float f10) {
        wa0 wa0Var = (wa0) this.f17555b;
        ud0 ud0Var = (ud0) this.f17556c;
        u51 u51Var = ud0Var.d;
        if (u51Var != null) {
            long U = u51Var.U();
            float max = 2.8f / ((float) Math.max(60L, U));
            long j3 = (((f10 / (1.0f - max)) * max) + f10) * ((float) U);
            ud0Var.f40002e = j3;
            ud0Var.d.q0(j3, !z10);
            if (!z10) {
                org.telegram.messenger.g0.r(wa0Var);
                org.telegram.messenger.g0.i3(wa0Var, 120L);
            }
        }
    }

    @Override
    public c4.d x(int i7, int i10, byte[] bArr) {
        return p0.a(this, bArr, i10);
    }

    @Override
    public void z(e1 e1Var) {
        ((g0) this.f17555b).h();
    }

    public j(int i7, boolean z10) {
        this.f17554a = i7;
    }

    @Override
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f17556c;
        if (secretMediaViewer.f43272b0) {
            return;
        }
        secretMediaViewer.f43272b0 = true;
        secretMediaViewer.f43279e.invalidate();
    }

    public j(Object obj, int i7) {
        this.f17554a = i7;
        this.f17555b = obj;
    }

    public j(Object obj, Object obj2, boolean z10, int i7) {
        this.f17554a = i7;
        this.f17556c = obj;
        this.f17555b = obj2;
    }

    public j(Object obj) {
        this.f17554a = 24;
        this.f17556c = obj;
        this.f17555b = new ArrayList();
    }

    public j(n6.e eVar) {
        this.f17554a = 25;
        this.f17555b = new SparseIntArray();
        q6.m.g(eVar);
        this.f17556c = eVar;
    }

    public j(ud0 ud0Var) {
        this.f17554a = 15;
        this.f17556c = ud0Var;
        this.f17555b = new wa0(this, 8);
    }

    public j(s sVar, SparseArray sparseArray) {
        this.f17554a = 3;
        this.f17555b = sVar;
        SparseBooleanArray sparseBooleanArray = sVar.f10378a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i7 = 0; i7 < sparseBooleanArray.size(); i7++) {
            int a10 = sVar.a(i7);
            m2.a aVar = (m2.a) sparseArray.get(a10);
            aVar.getClass();
            sparseArray2.append(a10, aVar);
        }
        this.f17556c = sparseArray2;
    }

    @Override
    public void B() {
    }

    @Override
    public void C() {
    }

    @Override
    public void clear() {
    }

    @Override
    public void i() {
    }

    @Override
    public void k0() {
    }

    @Override
    public void reset() {
    }

    @Override
    public void s() {
    }

    @Override
    public void t() {
    }

    @Override
    public void y() {
    }

    public j(String str) {
        this.f17554a = 6;
        this.f17556c = null;
        this.f17555b = str;
    }

    public j(EditText editText) {
        this.f17554a = 29;
        this.f17555b = editText;
        t1.i iVar = new t1.i(editText);
        this.f17556c = iVar;
        editText.addTextChangedListener(iVar);
        if (t1.a.f56946b == null) {
            synchronized (t1.a.f56945a) {
                try {
                    if (t1.a.f56946b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            t1.a.f56947c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, t1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        t1.a.f56946b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(t1.a.f56946b);
    }

    @Override
    public void A(boolean z10) {
    }

    @Override
    public void H(float f10) {
    }

    @Override
    public void O(long j3) {
    }

    @Override
    public void S(boolean z10) {
    }

    @Override
    public void Y(float f10) {
    }

    @Override
    public void e(int i7) {
    }

    @Override
    public void f0(float f10) {
    }

    @Override
    public void j0(float f10) {
    }

    @Override
    public void k(float f10) {
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
    public void q(float f10) {
    }

    @Override
    public void t0(long j3) {
    }

    @Override
    public void w(float f10) {
    }

    @Override
    public void D(float f10, int i7) {
    }

    @Override
    public void X(float f10, int i7) {
    }

    @Override
    public void i0(float f10, int i7) {
    }

    @Override
    public void p(long j3, boolean z10) {
    }

    @Override
    public void s0(int i7, long j3) {
    }

    public j(m mVar) {
        this.f17554a = 0;
        this.f17556c = mVar;
    }

    public j(d0 d0Var) {
        this.f17554a = 4;
        this.f17556c = d0Var;
        this.f17555b = new d4.f(new byte[4], 4);
    }

    public j(gx gxVar) {
        this.f17554a = 17;
        this.f17556c = gxVar;
        this.f17555b = new Rect();
    }

    public j(Attributes attributes, HashMap hashMap) {
        this.f17554a = 11;
        this.f17556c = attributes;
        String l10 = qz.l("style", attributes);
        if (l10 != null) {
            ArrayList arrayList = new ArrayList();
            this.f17555b = arrayList;
            arrayList.add(new oz(l10));
            return;
        }
        String l11 = qz.l("class", attributes);
        if (l11 != null) {
            this.f17555b = new ArrayList();
            for (String str : l11.split(" ")) {
                oz ozVar = (oz) hashMap.get(str.trim());
                if (ozVar != null) {
                    ((ArrayList) this.f17555b).add(ozVar);
                }
            }
        }
    }

    public j(int i7) {
        this.f17554a = i7;
        switch (i7) {
            case 2:
                this.f17555b = new x();
                this.f17556c = new l4.a();
                return;
            default:
                this.f17555b = new HashMap();
                this.f17556c = l2.c.f18905b;
                return;
        }
    }

    @Override
    public void b(k0 k0Var, f3.q qVar, f0 f0Var) {
    }
}
