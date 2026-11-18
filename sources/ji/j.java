package ji;

import a8.p0;
import ai.a2;
import ai.c2;
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
import bi.p3;
import c8.t9;
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
import org.telegram.messenger.gd;
import org.telegram.messenger.ke;
import org.telegram.messenger.ks;
import org.telegram.messenger.kz;
import org.telegram.messenger.lr;
import org.telegram.messenger.mi;
import org.telegram.messenger.mp;
import org.telegram.messenger.mz;
import org.telegram.messenger.ri;
import org.telegram.messenger.vr;
import org.telegram.messenger.xs;
import org.telegram.tgnet.SerializedData;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.Cells.h4;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.ee0;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.oo;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.rj0;
import org.telegram.ui.Components.xm0;
import org.telegram.ui.Components.y60;
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
import org.telegram.ui.tr0;
import org.telegram.ui.zt;
import org.xml.sax.Attributes;
import q4.t;
public final class j implements a2, c4.m, a0, Continuation, com.google.android.gms.common.api.internal.q, d1, xm0, lr, oo, xa, h7, rj0, d61, h2.d, q5.b, te.b {
    public final int f17947a;
    public Object f17948b;
    public Object f17949c;

    public j(int i7, Object obj, Object obj2) {
        this.f17947a = i7;
        this.f17948b = obj;
        this.f17949c = obj2;
    }

    public static l2.c I(l2.c cVar, List list) {
        cVar.getClass();
        Map map = cVar.f19273a;
        HashMap hashMap = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                hashMap.remove(str);
            }
        }
        return new l2.c(hashMap);
    }

    public static j K(int i7, boolean z10, byte[] bArr, byte[] bArr2) {
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
                Pattern pattern = Utilities.f22779a;
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
                jVar.f17948b = serializedData3.toByteArray();
                serializedData3.cleanup();
                SerializedData serializedData4 = new SerializedData();
                serializedData4.writeBytes(o10, 0, 8);
                serializedData4.writeBytes(o4, 8, 16);
                serializedData4.writeBytes(o10, 24, 8);
                jVar.f17949c = serializedData4.toByteArray();
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
            jVar.f17948b = serializedData9.toByteArray();
            serializedData9.cleanup();
            SerializedData serializedData10 = new SerializedData();
            serializedData10.writeBytes(n10, 8, 12);
            serializedData10.writeBytes(n11, 0, 8);
            serializedData10.writeBytes(n12, 16, 4);
            serializedData10.writeBytes(n13, 0, 8);
            jVar.f17949c = serializedData10.toByteArray();
            serializedData10.cleanup();
            return jVar;
        }
        jVar.f17949c = null;
        jVar.f17948b = null;
        return jVar;
    }

    public static void z(j jVar, l2.c cVar) {
        jVar.getClass();
        for (Map.Entry entry : new HashMap((HashMap) jVar.f17948b).entrySet()) {
            if (entry.getKey() == null) {
                List list = (List) entry.getValue();
                if (!I(cVar, list).equals(I((l2.c) jVar.f17949c, list))) {
                    throw null;
                }
            } else {
                throw new ClassCastException();
            }
        }
        jVar.f17949c = cVar;
    }

    @Override
    public void A(int i7, int i10) {
        ((g0) this.f17948b).l1(i7, i10);
    }

    @Override
    public void B(int i7) {
        bn bnVar = (bn) this.f17949c;
        ((y60) this.f17948b).v();
        if (i7 == 0) {
            if (bnVar.getMessagesController().u2(bnVar.f46085l6, bnVar.d(), null)) {
                bnVar.Ic(true);
            }
            if (lc.a(bnVar)) {
                lc.z(bnVar, 4, i7, bnVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        bnVar.getNotificationsController().H(bnVar.f46085l6, i7, bnVar.d());
        if (lc.a(bnVar)) {
            lc.z(bnVar, 5, i7, bnVar.getResourceProvider()).j();
        }
    }

    @Override
    public void D(float r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: ji.j.D(float, int):void");
    }

    public void E(Object obj, String str) {
        int length = str.length();
        String valueOf = String.valueOf(obj);
        ((ArrayList) this.f17948b).add(p5.c.m(str, "=", valueOf, new StringBuilder(length + 1 + valueOf.length())));
    }

    @Override
    public boolean E1(boolean z10) {
        return false;
    }

    public boolean G(int i7) {
        return ((s) this.f17948b).f10696a.get(i7);
    }

    @Override
    public void H(int i7, float f10, float f11, te.c cVar) {
        rh.h hVar = (rh.h) this.f17949c;
        hVar.f56605c.a(f10);
        hVar.d.a(f10);
        hVar.f56604b.a(f10);
        ((Runnable) this.f17948b).run();
    }

    @Override
    public boolean J(e1 e1Var) {
        return false;
    }

    public String L(String str) {
        ArrayList arrayList = (ArrayList) this.f17948b;
        String str2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                str2 = (String) ((kz) arrayList.get(i7)).f25304a.get(str);
                if (str2 != null) {
                    break;
                }
            }
        }
        if (str2 == null) {
            return mz.l(str, (Attributes) this.f17949c);
        }
        return str2;
    }

    public java.lang.Integer N(java.lang.String r5) {
        throw new UnsupportedOperationException("Method not decompiled: ji.j.N(java.lang.String):java.lang.Integer");
    }

    @Override
    public y O(o0 o0Var) {
        y O = ((h2.d) this.f17948b).O(o0Var);
        if (O == null) {
            return null;
        }
        return t9.c(O, new org.telegram.ui.ActionBar.p(this, 17));
    }

    public boolean P(t tVar, String str) {
        Context context = (Context) this.f17948b;
        int i7 = tVar.f55830b;
        if (i7 < 0) {
            if (context.getPackageManager().checkPermission(str, tVar.f55829a) == 0) {
                return true;
            }
            return false;
        } else if (context.checkPermission(str, i7, tVar.f55831c) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void Q(long j3, byte[] bArr) {
        File file;
        e0.g gVar = (e0.g) this.f17949c;
        if (gVar.f10206b) {
            gVar.f10206b = false;
            ((yi.j) gVar.f10208e).h();
            return;
        }
        yi.j jVar = (yi.j) gVar.f10208e;
        jVar.getClass();
        yi.j.q();
        yi.h hVar = jVar.f61338z;
        if (jVar.G == 5 && hVar != null) {
            file = hVar.f61313b;
        } else {
            file = null;
        }
        if (file == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Preview file is unavailable");
            MediaController mediaController = ((ke) this.f17948b).f25026a;
            String[] strArr = MediaController.W1;
            a8.e("AudioRecorderV2 failed", illegalStateException);
            ks.f(mediaController.f22718i1).k(ks.f25153m2, Integer.valueOf(mediaController.f22716h1));
            mediaController.x(false);
            return;
        }
        MediaController mediaController2 = ((ke) this.f17948b).f25026a;
        mediaController2.f22722k1 = file;
        mediaController2.l1 = j3;
        mediaController2.G0(file, j3, bArr);
        ri.d0(mediaController2.f22718i1).F1(mediaController2.n1, mediaController2.f22728o1, mi.a(mediaController2, file.getAbsolutePath(), mediaController2.K1));
        ks.f(mediaController2.f22718i1).k(ks.f25164o2, new Object[0]);
        ks.f(mediaController2.f22718i1).k(ks.f25189s2, Integer.valueOf(mediaController2.f22716h1), mediaController2.f22714g1, file.getAbsolutePath());
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
        SparseIntArray sparseIntArray = (SparseIntArray) this.f17948b;
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
                i7 = ((n6.e) this.f17949c).d(context, d);
            }
            sparseIntArray.put(d, i7);
        }
        return i7;
    }

    public int S(int i7) {
        int i10;
        SparseIntArray sparseIntArray = (SparseIntArray) this.f17948b;
        synchronized (sparseIntArray) {
            i10 = sparseIntArray.get(i7, -1);
        }
        return i10;
    }

    @Override
    public void a(String str, String str2) {
        m mVar = (m) this.f17949c;
        c2 c2Var = (c2) this.f17948b;
        if (!mVar.J) {
            if (c2Var == mVar.f17971f) {
                mVar.a(str, str2);
            }
        } else if (c2Var == mVar.U) {
            mVar.U = null;
            if (!str.isEmpty()) {
                mVar.v(c2Var, str);
            }
            mVar.e();
            Log.d("VoiceLive", "field: final words in (" + mVar.L.size() + " words)");
            mVar.p();
        } else if (c2Var != mVar.f17971f) {
        } else {
            Log.d("VoiceLive", "field: recogniser ended by itself error=" + str2);
            if (!str.isEmpty()) {
                mVar.v(c2Var, str);
            }
            mVar.f17971f = null;
            if (vr.f27593k == mVar) {
                vr.f27593k = null;
            }
            mVar.d = null;
            mVar.f17969e = null;
            mVar.e();
            mVar.p();
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        int i7;
        o7.d dVar = (o7.d) this.f17948b;
        o7.b bVar = (o7.b) obj;
        e7.b bVar2 = new e7.b(dVar, (TaskCompletionSource) obj2);
        Context context = dVar.f6388a;
        try {
            i7 = z6.b.a(context).b(0, context.getPackageName()).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i7 = 0;
        }
        m6.b bVar3 = (m6.b) this.f17949c;
        bVar3.f20848f = i7;
        o7.c cVar = (o7.c) bVar.n();
        com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true), true);
        gVar.f6206c = false;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
        int i10 = o7.a.f21741a;
        obtain.writeStrongBinder(bVar2);
        obtain.writeInt(1);
        bVar3.writeToParcel(obtain, 0);
        obtain.writeInt(1);
        gVar.writeToParcel(obtain, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            cVar.f21742a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override
    public void b1(CharSequence charSequence) {
        ((g0) this.f17948b).S0(charSequence);
    }

    @Override
    public void c(x xVar) {
        d0 d0Var = (d0) this.f17949c;
        SparseArray sparseArray = d0Var.h;
        d4.f fVar = (d4.f) this.f17948b;
        if (xVar.A() == 0 && (xVar.A() & 128) != 0) {
            xVar.O(6);
            int a10 = xVar.a() / 4;
            for (int i7 = 0; i7 < a10; i7++) {
                xVar.k(0, 4, (byte[]) fVar.f7836b);
                fVar.J(0);
                int j3 = fVar.j(16);
                fVar.L(3);
                if (j3 == 0) {
                    fVar.L(13);
                } else {
                    int j10 = fVar.j(13);
                    if (sparseArray.get(j10) == null) {
                        sparseArray.put(j10, new b0(new a4.k(d0Var, j10)));
                        d0Var.f20582n++;
                    }
                }
            }
            if (d0Var.f20571a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override
    public void d(boolean z10) {
        f8 f8Var = ((d8) this.f17949c).f46890b;
        f8Var.f47608y.finishFragment();
        i8 i8Var = f8Var.f47608y;
        ((bn) this.f17948b).j8(i8Var.Q, i8Var.R + 86400, z10);
    }

    @Override
    public boolean d2(e1 e1Var) {
        return false;
    }

    @Override
    public void dismiss() {
        switch (this.f17947a) {
            case 14:
                ((y60) this.f17948b).v();
                return;
            default:
                ((au) this.f17949c).dismiss();
                return;
        }
    }

    @Override
    public void e(e1 e1Var) {
        ((g0) this.f17948b).e(e1Var);
    }

    @Override
    public boolean mo23f(float f10, float f11, int i7, View view) {
        Rect rect = (Rect) this.f17948b;
        kx kxVar = (kx) this.f17949c;
        if (kxVar.getParentActivity() != null && (view instanceof h4)) {
            ((ImageView) view.getTag(2131296585)).getHitRect(rect);
            if (!rect.contains((int) f10, (int) f11)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kxVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{gd.M0(2131751587, null)}, new fx(this, i7, 0));
                kxVar.showDialog(alertDialog$Builder.f28746a);
                return true;
            }
        }
        return false;
    }

    @Override
    public void g0(boolean z10, float f10) {
        gb0 gb0Var = (gb0) this.f17948b;
        ee0 ee0Var = (ee0) this.f17949c;
        f61 f61Var = ee0Var.d;
        if (f61Var != null) {
            long U = f61Var.U();
            float max = 2.8f / ((float) Math.max(60L, U));
            long j3 = (((f10 / (1.0f - max)) * max) + f10) * ((float) U);
            ee0Var.f34684e = j3;
            ee0Var.d.q0(j3, !z10);
            if (!z10) {
                org.telegram.messenger.g0.r(gb0Var);
                org.telegram.messenger.g0.h3(gb0Var, 120L);
            }
        }
    }

    @Override
    public Object mo24get() {
        return new p5.e((Context) ((e.a) this.f17948b).f10180a, (md0) ((of) this.f17949c).mo24get());
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public void h(float f10) {
        c2 c2Var = (c2) this.f17948b;
        m mVar = (m) this.f17949c;
        if (c2Var == mVar.f17971f) {
            mVar.h(f10);
        }
    }

    @Override
    public void i(String str) {
        m.b((m) this.f17949c, (c2) this.f17948b, str, -1);
    }

    @Override
    public void l(int i7, String str) {
        m.b((m) this.f17949c, (c2) this.f17948b, str, i7);
    }

    @Override
    public void m(r6 r6Var, ei.b bVar, boolean z10) {
        au auVar = (au) this.f17949c;
        zt ztVar = auVar.T1;
        if (bVar != null) {
            ((ei.c) this.f17948b).i(bVar);
            auVar.f45673a2.e();
            ei.c cVar = auVar.f45675c2;
            ow0[] ow0VarArr = auVar.X1;
            org.telegram.ui.Cells.c2[] c2VarArr = auVar.Y1;
            org.telegram.ui.Cells.c2 c2Var = c2VarArr[0];
            if (c2Var != null) {
                ow0 ow0Var = ow0VarArr[0];
                boolean z11 = cVar.f10982m;
                ow0Var.f38184c = z11;
                c2Var.c(z11, true);
            }
            org.telegram.ui.Cells.c2 c2Var2 = c2VarArr[1];
            if (c2Var2 != null) {
                ow0 ow0Var2 = ow0VarArr[1];
                boolean z12 = cVar.f10983n;
                ow0Var2.f38184c = z12;
                c2Var2.c(z12, true);
            }
            org.telegram.ui.Cells.c2 c2Var3 = c2VarArr[2];
            if (c2Var3 != null) {
                ow0 ow0Var3 = ow0VarArr[2];
                boolean z13 = cVar.f10984o;
                ow0Var3.f38184c = z13;
                c2Var3.c(z13, true);
            }
            org.telegram.ui.Cells.c2 c2Var4 = c2VarArr[3];
            if (c2Var4 != null) {
                ow0 ow0Var4 = ow0VarArr[3];
                boolean z14 = cVar.f10985p;
                ow0Var4.f38184c = z14;
                c2Var4.c(z14, true);
            }
            org.telegram.ui.Cells.c2 c2Var5 = c2VarArr[4];
            if (c2Var5 != null) {
                ow0 ow0Var5 = ow0VarArr[4];
                boolean z15 = cVar.f10986q;
                ow0Var5.f38184c = z15;
                c2Var5.c(z15, true);
            }
            auVar.W1.a(ztVar.d(), true);
            ztVar.c(true);
        }
    }

    @Override
    public void n(boolean z10, float f10) {
        ((TextView) this.f17948b).setText("Alpha " + h5.f48225p1);
        h5.f48225p1 = f10;
        ((h5) this.f17949c).f48226m1.K();
    }

    @Override
    public boolean o() {
        return ((g0) this.f17948b).g1();
    }

    @Override
    public void onError(f61 f61Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f17949c;
        int i7 = secretMediaViewer.f43715a0;
        if (i7 > 0) {
            secretMediaViewer.f43715a0 = i7 - 1;
            org.telegram.messenger.g0.h3(new tr0(28, this, (File) this.f17948b), 100L);
            return;
        }
        a8.g(exc, true);
    }

    @Override
    public void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f17949c;
        fz0 fz0Var = secretMediaViewer.f43734h1;
        if (secretMediaViewer.E != null && secretMediaViewer.f43731g0 != null) {
            org.telegram.messenger.g0.r(fz0Var);
            org.telegram.messenger.g0.g3(fz0Var);
            if (i7 != 4 && i7 != 1) {
                try {
                    secretMediaViewer.f43717b.getWindow().addFlags(128);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            } else {
                try {
                    secretMediaViewer.f43717b.getWindow().clearFlags(128);
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
            }
            if (i7 == 3 && secretMediaViewer.f43765x.getVisibility() != 0) {
                secretMediaViewer.f43765x.setVisibility(0);
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
                        secretMediaViewer.e(true, !secretMediaViewer.f43748p1);
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
        j4 j4Var = ((SecretMediaViewer) this.f17949c).f43765x;
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
        i9 P0;
        g0 g0Var = (g0) this.f17948b;
        if (!((h0) this.f17949c).d && i7 != i10 && (P0 = g0Var.P0()) != null) {
            if (!P0.x() || P0.W != g0Var.a1()) {
                e1Var.post(new p3(this, e1Var, i10, P0, g0Var, i7));
            }
        }
    }

    @Override
    public void s() {
        ((y60) this.f17948b).v();
        bn bnVar = (bn) this.f17949c;
        bnVar.Ic(true);
        lc.A(bnVar, bnVar.getMessagesController().u2(bnVar.f46085l6, bnVar.d(), null), bnVar.Ba).j();
    }

    @Override
    public void s1(Editable editable) {
        ((h0) this.f17949c).i();
        ((g0) this.f17948b).u1();
    }

    @Override
    public y t0(byte[] bArr) {
        return t9.c(((h2.d) this.f17948b).t0(bArr), new org.telegram.ui.ActionBar.p(this, 17));
    }

    @Override
    public Object then(Task task) {
        m6.c cVar = (m6.c) this.f17948b;
        Bundle bundle = (Bundle) this.f17949c;
        cVar.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        if (bundle2 != null && bundle2.containsKey("google.messenger")) {
            return cVar.d(bundle).onSuccessTask(m6.d.f20857b, w7.s.f59627c);
        }
        return task;
    }

    public String toString() {
        switch (this.f17947a) {
            case 24:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f17949c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f17948b;
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
        ((y60) this.f17948b).v();
        bn bnVar = (bn) this.f17949c;
        if (bnVar.f46085l6 != 0 && bnVar.f46018g4 != 3) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", bnVar.f46085l6);
            if (bnVar.d() != 0) {
                bundle.putLong("topic_id", bnVar.d());
            }
            bnVar.presentFragment(new jx0(bundle, bnVar.Ba));
        }
    }

    @Override
    public void v(byte[] r19, int r20, int r21, c4.l r22, h2.j r23) {
        throw new UnsupportedOperationException("Method not decompiled: ji.j.v(byte[], int, int, c4.l, h2.j):void");
    }

    @Override
    public void w() {
        int i7;
        ((y60) this.f17948b).v();
        bn bnVar = (bn) this.f17949c;
        i7 = ((h2) bnVar).currentAccount;
        SharedPreferences sharedPreferences = mp.u1(i7).f25660g7;
        boolean z10 = sharedPreferences.getBoolean("sound_enabled_" + xs.v(bnVar.f46085l6, bnVar.d(), false), true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + xs.v(bnVar.f46085l6, bnVar.d(), false), z11).apply();
        if (lc.a(bnVar)) {
            lc.S(z10 ? 1 : 0, bnVar, bnVar.getResourceProvider()).j();
        }
        bnVar.yd(false);
    }

    @Override
    public void x(String str) {
        c2 c2Var = (c2) this.f17948b;
        m mVar = (m) this.f17949c;
        if (c2Var == mVar.f17971f) {
            mVar.x(str);
        }
    }

    @Override
    public void x0(e1 e1Var) {
        ((g0) this.f17948b).u();
    }

    @Override
    public int y() {
        return 1;
    }

    public j(int i7, boolean z10) {
        this.f17947a = i7;
    }

    @Override
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f17949c;
        if (secretMediaViewer.f43718b0) {
            return;
        }
        secretMediaViewer.f43718b0 = true;
        secretMediaViewer.f43725e.invalidate();
    }

    public j(Object obj, int i7) {
        this.f17947a = i7;
        this.f17948b = obj;
    }

    public j(Object obj, Object obj2, boolean z10, int i7) {
        this.f17947a = i7;
        this.f17949c = obj;
        this.f17948b = obj2;
    }

    public j(Object obj) {
        this.f17947a = 24;
        this.f17949c = obj;
        this.f17948b = new ArrayList();
    }

    public j(n6.e eVar) {
        this.f17947a = 25;
        this.f17948b = new SparseIntArray();
        q6.m.h(eVar);
        this.f17949c = eVar;
    }

    public j(ee0 ee0Var) {
        this.f17947a = 15;
        this.f17949c = ee0Var;
        this.f17948b = new gb0(this, 8);
    }

    public j(s sVar, SparseArray sparseArray) {
        this.f17947a = 3;
        this.f17948b = sVar;
        SparseBooleanArray sparseBooleanArray = sVar.f10696a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i7 = 0; i7 < sparseBooleanArray.size(); i7++) {
            int a10 = sVar.a(i7);
            m2.a aVar = (m2.a) sparseArray.get(a10);
            aVar.getClass();
            sparseArray2.append(a10, aVar);
        }
        this.f17949c = sparseArray2;
    }

    public j(String str) {
        this.f17947a = 6;
        this.f17949c = null;
        this.f17948b = str;
    }

    public j(EditText editText) {
        this.f17947a = 29;
        this.f17948b = editText;
        t1.i iVar = new t1.i(editText);
        this.f17949c = iVar;
        editText.addTextChangedListener(iVar);
        if (t1.a.f57522b == null) {
            synchronized (t1.a.f57521a) {
                try {
                    if (t1.a.f57522b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            t1.a.f57523c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, t1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        t1.a.f57522b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(t1.a.f57522b);
    }

    public j(m mVar) {
        this.f17947a = 0;
        this.f17949c = mVar;
    }

    public j(d0 d0Var) {
        this.f17947a = 4;
        this.f17949c = d0Var;
        this.f17948b = new d4.f(new byte[4], 4);
    }

    public j(kx kxVar) {
        this.f17947a = 17;
        this.f17949c = kxVar;
        this.f17948b = new Rect();
    }

    public j(Attributes attributes, HashMap hashMap) {
        this.f17947a = 11;
        this.f17949c = attributes;
        String l10 = mz.l("style", attributes);
        if (l10 != null) {
            ArrayList arrayList = new ArrayList();
            this.f17948b = arrayList;
            arrayList.add(new kz(l10));
            return;
        }
        String l11 = mz.l("class", attributes);
        if (l11 != null) {
            this.f17948b = new ArrayList();
            for (String str : l11.split(" ")) {
                kz kzVar = (kz) hashMap.get(str.trim());
                if (kzVar != null) {
                    ((ArrayList) this.f17948b).add(kzVar);
                }
            }
        }
    }

    public j(int i7) {
        this.f17947a = i7;
        switch (i7) {
            case 2:
                this.f17948b = new x();
                this.f17949c = new l4.a();
                return;
            default:
                this.f17948b = new HashMap();
                this.f17949c = l2.c.f19272b;
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
