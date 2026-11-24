package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.media.MediaExtractor;
import android.media.session.MediaController;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.a;
import android.support.v4.media.session.c;
import android.text.Editable;
import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import j$.util.DesugarCollections;
import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.SecretMediaViewer;
public final class wm4 implements im4, d99, mv8, fqb, yx8, t66, me9, ldc, lv8, SuccessContinuation, t5b {
    public final byte a;
    public Object b;
    public Object c;

    public wm4(ArrayList arrayList, ArrayList arrayList2) {
        this.a = (byte) 3;
        int size = arrayList.size();
        this.b = new int[size];
        this.c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public static wm4 U(int i, boolean z, byte[] bArr, byte[] bArr2) {
        int i2;
        byte[] byteArray;
        wm4 wm4Var = new wm4((byte) 10);
        if (bArr != null && bArr.length != 0) {
            if (z) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            if (i != 1) {
                if (i != 2) {
                    return wm4Var;
                }
                SerializedData serializedData = new SerializedData();
                serializedData.writeBytes(bArr2, 0, 16);
                serializedData.writeBytes(bArr, i2, 36);
                byte[] byteArray2 = serializedData.toByteArray();
                Pattern pattern = Utilities.a;
                byte[] o = Utilities.o(byteArray2.length, byteArray2);
                serializedData.cleanup();
                SerializedData serializedData2 = new SerializedData();
                serializedData2.writeBytes(bArr, i2 + 40, 36);
                serializedData2.writeBytes(bArr2, 0, 16);
                byte[] o2 = Utilities.o(byteArray.length, serializedData2.toByteArray());
                serializedData2.cleanup();
                SerializedData serializedData3 = new SerializedData();
                serializedData3.writeBytes(o, 0, 8);
                serializedData3.writeBytes(o2, 8, 16);
                serializedData3.writeBytes(o, 24, 8);
                wm4Var.b = serializedData3.toByteArray();
                serializedData3.cleanup();
                SerializedData serializedData4 = new SerializedData();
                serializedData4.writeBytes(o2, 0, 8);
                serializedData4.writeBytes(o, 8, 16);
                serializedData4.writeBytes(o2, 24, 8);
                wm4Var.c = serializedData4.toByteArray();
                serializedData4.cleanup();
                return wm4Var;
            }
            SerializedData serializedData5 = new SerializedData();
            serializedData5.writeBytes(bArr2);
            serializedData5.writeBytes(bArr, i2, 32);
            byte[] n = Utilities.n(serializedData5.toByteArray());
            serializedData5.cleanup();
            SerializedData serializedData6 = new SerializedData();
            serializedData6.writeBytes(bArr, i2 + 32, 16);
            serializedData6.writeBytes(bArr2);
            serializedData6.writeBytes(bArr, i2 + 48, 16);
            byte[] n2 = Utilities.n(serializedData6.toByteArray());
            serializedData6.cleanup();
            SerializedData serializedData7 = new SerializedData();
            serializedData7.writeBytes(bArr, i2 + 64, 32);
            serializedData7.writeBytes(bArr2);
            byte[] n3 = Utilities.n(serializedData7.toByteArray());
            serializedData7.cleanup();
            SerializedData serializedData8 = new SerializedData();
            serializedData8.writeBytes(bArr2);
            serializedData8.writeBytes(bArr, i2 + 96, 32);
            byte[] n4 = Utilities.n(serializedData8.toByteArray());
            serializedData8.cleanup();
            SerializedData serializedData9 = new SerializedData();
            serializedData9.writeBytes(n, 0, 8);
            serializedData9.writeBytes(n2, 8, 12);
            serializedData9.writeBytes(n3, 4, 12);
            wm4Var.b = serializedData9.toByteArray();
            serializedData9.cleanup();
            SerializedData serializedData10 = new SerializedData();
            serializedData10.writeBytes(n, 8, 12);
            serializedData10.writeBytes(n2, 0, 8);
            serializedData10.writeBytes(n3, 16, 4);
            serializedData10.writeBytes(n4, 0, 8);
            wm4Var.c = serializedData10.toByteArray();
            serializedData10.cleanup();
            return wm4Var;
        }
        wm4Var.c = null;
        wm4Var.b = null;
        return wm4Var;
    }

    @Override
    public final void A() {
        ((l99) this.b).e((m99) this.c);
    }

    @Override
    public final void B() {
        sa8 sa8Var = (sa8) this.c;
        if (sa8Var.a1) {
            sa8Var.a1 = false;
            return;
        }
        sa8Var.j1.b(1);
        sa8Var.s((u11) u11.a.get(0));
    }

    public final void E(dp4 dp4Var, boolean z) {
        dp4 dp4Var2 = ((hq4) this.b).y;
        if (dp4Var2 != null) {
            dp4Var2.p().o.E(dp4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            rjb.p();
        }
    }

    @Override
    public final boolean F() {
        boolean z;
        sa8 sa8Var = (sa8) this.c;
        if (sa8Var.I0 == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            sa8Var.t0(null, true);
        }
        return z;
    }

    @Override
    public final boolean G(ne9 ne9Var) {
        return false;
    }

    public final void I(dp4 dp4Var, boolean z) {
        hq4 hq4Var = (hq4) this.b;
        Context context = hq4Var.w.b;
        dp4 dp4Var2 = hq4Var.y;
        if (dp4Var2 != null) {
            dp4Var2.p().o.I(dp4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            rjb.p();
        }
    }

    public final void J(dp4 dp4Var, boolean z) {
        dp4 dp4Var2 = ((hq4) this.b).y;
        if (dp4Var2 != null) {
            dp4Var2.p().o.J(dp4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            rjb.p();
        }
    }

    public final void K(dp4 dp4Var, boolean z) {
        dp4 dp4Var2 = ((hq4) this.b).y;
        if (dp4Var2 != null) {
            dp4Var2.p().o.K(dp4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            rjb.p();
        }
    }

    public final void L(dp4 dp4Var, Bundle bundle, boolean z) {
        dp4 dp4Var2 = ((hq4) this.b).y;
        if (dp4Var2 != null) {
            dp4Var2.p().o.L(dp4Var, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            rjb.p();
        }
    }

    @Override
    public final void M(CharSequence charSequence) {
        ((rd9) this.b).O0(charSequence);
    }

    public final void N(dp4 dp4Var, boolean z) {
        dp4 dp4Var2 = ((hq4) this.b).y;
        if (dp4Var2 != null) {
            dp4Var2.p().o.N(dp4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            rjb.p();
        }
    }

    public final void O(dp4 dp4Var, boolean z) {
        dp4 dp4Var2 = ((hq4) this.b).y;
        if (dp4Var2 != null) {
            dp4Var2.p().o.O(dp4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            rjb.p();
        }
    }

    public final void P(dp4 dp4Var, boolean z) {
        dp4 dp4Var2 = ((hq4) this.b).y;
        if (dp4Var2 != null) {
            dp4Var2.p().o.P(dp4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            rjb.p();
        }
    }

    @Override
    public final void Q() {
        sa8 sa8Var = (sa8) this.c;
        sa8Var.v0.a.h();
        sa8Var.b1.setViewHidden(false);
    }

    public final void R(int[] iArr, int i) {
        iu4 iu4Var = (iu4) this.b;
        if (i != 0) {
            int length = iArr.length - i;
            if (length > 0) {
                ArrayList arrayList = (ArrayList) this.c;
                if (i >= arrayList.size()) {
                    ju4 ju4Var = (ju4) b10.f(1, arrayList);
                    for (int size = arrayList.size(); size <= i; size++) {
                        ju4Var = ju4Var.g(new ju4(iu4Var, new int[]{1, iu4Var.a[(size - 1) + (iu4Var.g ? 1 : 0)]}));
                        arrayList.add(ju4Var);
                    }
                }
                ju4 ju4Var2 = (ju4) arrayList.get(i);
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                if (length != 0) {
                    if (length > 1 && iArr2[0] == 0) {
                        int i2 = 1;
                        while (i2 < length && iArr2[i2] == 0) {
                            i2++;
                        }
                        if (i2 == length) {
                            iArr2 = new int[]{0};
                        } else {
                            int i3 = length - i2;
                            int[] iArr3 = new int[i3];
                            System.arraycopy(iArr2, i2, iArr3, 0, i3);
                            iArr2 = iArr3;
                        }
                    }
                    if (i >= 0) {
                        int length2 = iArr2.length;
                        int[] iArr4 = new int[length2 + i];
                        for (int i4 = 0; i4 < length2; i4++) {
                            iArr4[i4] = iu4Var.c(iArr2[i4], 1);
                        }
                        ju4 ju4Var3 = new ju4(iu4Var, iArr4);
                        if (iu4Var.equals(ju4Var2.a)) {
                            if (!ju4Var2.e()) {
                                ju4 ju4Var4 = iu4Var.c;
                                int b = iu4Var.b(ju4Var2.c(ju4Var2.d()));
                                while (ju4Var3.d() >= ju4Var2.d() && !ju4Var3.e()) {
                                    int d = ju4Var3.d() - ju4Var2.d();
                                    int c = iu4Var.c(ju4Var3.c(ju4Var3.d()), b);
                                    ju4 h = ju4Var2.h(d, c);
                                    ju4Var4 = ju4Var4.a(iu4Var.a(d, c));
                                    ju4Var3 = ju4Var3.a(h);
                                }
                                int[] iArr5 = new ju4[]{ju4Var4, ju4Var3}[1].b;
                                int length3 = i - iArr5.length;
                                for (int i5 = 0; i5 < length3; i5++) {
                                    iArr[length + i5] = 0;
                                }
                                System.arraycopy(iArr5, 0, iArr, length + length3, iArr5.length);
                                return;
                            }
                            u36.j("Divide by 0");
                            return;
                        }
                        u36.j("GenericGFPolys do not have same GenericGF field");
                        return;
                    }
                    i98.g();
                    return;
                }
                i98.g();
                return;
            }
            u36.j("No data bytes provided");
            return;
        }
        u36.j("No error correction bytes");
    }

    @Override
    public final void S(Editable editable) {
        ((sd9) this.c).i();
        ((rd9) this.b).E1();
    }

    @Override
    public final void T() {
        sa8 sa8Var = (sa8) this.c;
        if (sa8Var.I0 != null) {
            sa8Var.t0(null, true);
        }
        sa8Var.b1.setViewHidden(true);
    }

    @Override
    public final void W(ne9 ne9Var) {
        ((rd9) this.b).p();
    }

    @Override
    public final void X(boolean z, float f) {
        q78 q78Var = (q78) this.b;
        wb8 wb8Var = (wb8) this.c;
        ndc ndcVar = wb8Var.d;
        if (ndcVar != null) {
            long U = ndcVar.U();
            float max = 2.8f / ((float) Math.max(60L, U));
            long j = (((f / (1.0f - max)) * max) + f) * ((float) U);
            wb8Var.e = j;
            wb8Var.d.p0(j, !z);
            if (!z) {
                gm.r(q78Var);
                gm.d3(q78Var, 120L);
            }
        }
    }

    public final synchronized Map Y() {
        Map map;
        map = (Map) this.c;
        if (map == null) {
            map = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.b));
            this.c = map;
        }
        return map;
    }

    @Override
    public final boolean Z(boolean z) {
        return false;
    }

    public final void a(Object obj, String str) {
        int length = str.length();
        String valueOf = String.valueOf(obj);
        ((ArrayList) this.b).add(kt6.p(str, "=", valueOf, new StringBuilder(length + 1 + valueOf.length())));
    }

    public final xo6 a0() {
        MediaController.TransportControls transportControls = ((a) this.b).a.getTransportControls();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            return new c(transportControls);
        }
        if (i >= 24) {
            return new c(transportControls);
        }
        return new c(transportControls);
    }

    public final void b(dp4 dp4Var, boolean z) {
        dp4 dp4Var2 = ((hq4) this.b).y;
        if (dp4Var2 != null) {
            dp4Var2.p().o.b(dp4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            rjb.p();
        }
    }

    public final void b0(String str, String str2) {
        boolean equals = "PHONE_VERIFICATION_NEEDED".equals(str);
        xz7 xz7Var = ((iz7) this.c).a;
        if (equals) {
            xz7Var.R1(true, str2, (kl7) this.b, this, xz7Var.C1);
        } else {
            xz7Var.Q1(true, false);
        }
    }

    @Override
    public final void c() {
        ((l99) this.b).c();
    }

    public final void c0(boolean z, boolean z2, float f) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
        v48 v48Var = (v48) this.c;
        oab oabVar = v48Var.e;
        oab.B1 = f;
        nab nabVar = oabVar.A0;
        if (nabVar != null) {
            nabVar.setSpeed(f);
        }
        a58 a58Var = v48Var.x;
        int i = a58.U3;
        a58Var.g1(z);
        if (z2 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
        }
    }

    @Override
    public final void d(ne9 ne9Var) {
        ((rd9) this.b).d(ne9Var);
    }

    public final void d0(tu6 tu6Var) {
        if (tu6Var != null) {
            if (!((Set) this.c).add(tu6Var)) {
                Log.w("MediaControllerCompat", "the callback has already been registered");
                return;
            }
            Handler handler = new Handler();
            tu6Var.f(handler);
            a aVar = (a) this.b;
            aVar.a.registerCallback(tu6Var.a, handler);
            synchronized (aVar.b) {
                if (aVar.e.a() != null) {
                    so6 so6Var = new so6(tu6Var);
                    aVar.d.put(tu6Var, so6Var);
                    tu6Var.c = so6Var;
                    try {
                        aVar.e.a().F(so6Var);
                        tu6Var.e(13, null, null);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                    }
                } else {
                    tu6Var.c = null;
                    aVar.c.add(tu6Var);
                }
            }
            return;
        }
        u36.j("callback must not be null");
    }

    @Override
    public final void e(String str) {
        ((qac) this.b).a(str);
    }

    public final void e0(int i) {
        try {
            d8e d8eVar = (d8e) this.b;
            Parcel R = d8eVar.R();
            R.writeInt(i);
            d8eVar.V(R, 16);
        } catch (RemoteException e) {
            i2d.h(e);
        }
    }

    @Override
    public final String f() {
        StringBuilder sb = new StringBuilder();
        sb.append((String) this.b);
        sb.append("|");
        File file = (File) this.c;
        sb.append(file.length());
        sb.append("|");
        sb.append(file.lastModified());
        return sb.toString();
    }

    public final List f0(CharSequence charSequence) {
        charSequence.getClass();
        lna lnaVar = new lna((oo8) this.c, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (lnaVar.hasNext()) {
            arrayList.add((String) lnaVar.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    @Override
    public final java.lang.Object g(defpackage.jm4 r5, defpackage.px2 r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wm4.g(jm4, px2):java.lang.Object");
    }

    public final void g0(tu6 tu6Var) {
        if (tu6Var != null) {
            if (!((Set) this.c).remove(tu6Var)) {
                Log.w("MediaControllerCompat", "the callback has never been registered");
                return;
            }
            try {
                ((a) this.b).b(tu6Var);
                return;
            } finally {
                tu6Var.f(null);
            }
        }
        u36.j("callback must not be null");
    }

    @Override
    public final Object mo8get() {
        switch (this.a) {
            case 11:
                return new of7((Context) ((mq5) this.b).a, (mx6) ((u23) this.c).mo8get());
            default:
                return new j8a((tpb) ((lv8) this.b).mo8get(), (wac) ((lv8) this.c).mo8get());
        }
    }

    @Override
    public final boolean i() {
        return ((rd9) this.b).g1();
    }

    @Override
    public final void k(int i, int i2) {
        ((rd9) this.b).r1(i, i2);
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final boolean m(float f) {
        return false;
    }

    @Override
    public final Closeable n(MediaExtractor mediaExtractor) {
        mediaExtractor.setDataSource((String) this.b);
        return null;
    }

    @Override
    public final void onError(ndc ndcVar, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        int i = secretMediaViewer.a0;
        if (i > 0) {
            secretMediaViewer.a0 = i - 1;
            gm.d3(new il9(this, (File) this.b, (byte) 19), 100L);
            return;
        }
        fc4.g(exc, true);
    }

    @Override
    public final void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        if (!secretMediaViewer.b0) {
            secretMediaViewer.b0 = true;
            secretMediaViewer.e.invalidate();
        }
    }

    @Override
    public final void onStateChanged(boolean z, int i) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        ew9 ew9Var = secretMediaViewer.h1;
        if (secretMediaViewer.E != null && secretMediaViewer.g0 != null) {
            gm.r(ew9Var);
            gm.c3(ew9Var);
            if (i != 4 && i != 1) {
                try {
                    secretMediaViewer.b.getWindow().addFlags(128);
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            } else {
                try {
                    secretMediaViewer.b.getWindow().clearFlags(128);
                } catch (Exception e2) {
                    fc4.g(e2, true);
                }
            }
            if (i == 3 && secretMediaViewer.x.getVisibility() != 0) {
                secretMediaViewer.x.setVisibility(0);
            }
            if (secretMediaViewer.E.c0() && i != 4) {
                if (!secretMediaViewer.F) {
                    secretMediaViewer.F = true;
                }
            } else if (secretMediaViewer.F) {
                secretMediaViewer.F = false;
                if (i == 4) {
                    secretMediaViewer.I = true;
                    if (secretMediaViewer.J) {
                        secretMediaViewer.c(true, !secretMediaViewer.p1);
                        return;
                    }
                    secretMediaViewer.E.p0(0L, false);
                    secretMediaViewer.E.g0();
                }
            }
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
        float f2;
        jy jyVar = ((SecretMediaViewer) this.c).x;
        if (jyVar != null) {
            if (i2 == 0) {
                f2 = 1.0f;
            } else {
                f2 = (i * f) / i2;
            }
            jyVar.a(f2, 0);
        }
    }

    @Override
    public final void p(zx8 zx8Var) {
        gm.B2(zx8Var);
        ((Runnable) this.c).run();
    }

    public final void q(dp4 dp4Var, boolean z) {
        hq4 hq4Var = (hq4) this.b;
        Context context = hq4Var.w.b;
        dp4 dp4Var2 = hq4Var.y;
        if (dp4Var2 != null) {
            dp4Var2.p().o.q(dp4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            rjb.p();
        }
    }

    @Override
    public final void r(ne9 ne9Var, int i, int i2) {
        gkb H0;
        rd9 rd9Var = (rd9) this.b;
        if (!((sd9) this.c).d && i != i2 && (H0 = rd9Var.H0()) != null) {
            if (!H0.w() || H0.W != rd9Var.Y0()) {
                ne9Var.post(new h01(this, ne9Var, i2, H0, rd9Var, i));
            }
        }
    }

    public final void t(dp4 dp4Var, boolean z) {
        dp4 dp4Var2 = ((hq4) this.b).y;
        if (dp4Var2 != null) {
            dp4Var2.p().o.t(dp4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            rjb.p();
        }
    }

    @Override
    public final Task then(Object obj) {
        FileWriter fileWriter;
        Void r9 = (Void) obj;
        ex8 ex8Var = (ex8) this.c;
        JSONObject jSONObject = (JSONObject) ((a13) ((mx6) this.b).d).a.submit(new ml(this, (byte) 3)).get();
        FileWriter fileWriter2 = null;
        if (jSONObject != null) {
            r9a i0 = ((x59) ex8Var.d).i0(jSONObject);
            ni6 ni6Var = (ni6) ex8Var.e;
            long j = i0.c;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j);
                fileWriter = new FileWriter((File) ni6Var.b);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Exception e) {
                        e = e;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        bo2.b(fileWriter, "Failed to close settings writer.");
                        ex8.e("Loaded settings: ", jSONObject);
                        String str = ((laa) ex8Var.c).f;
                        SharedPreferences.Editor edit = ((Context) ex8Var.b).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        edit.putString("existing_instance_identifier", str);
                        edit.apply();
                        ex8Var.a.set(i0);
                        ((TaskCompletionSource) ((AtomicReference) ex8Var.h).get()).trySetResult(i0);
                        return Tasks.forResult(null);
                    }
                } catch (Throwable th) {
                    th = th;
                    fileWriter2 = fileWriter;
                    bo2.b(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                fileWriter = null;
            } catch (Throwable th2) {
                th = th2;
                bo2.b(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            bo2.b(fileWriter, "Failed to close settings writer.");
            ex8.e("Loaded settings: ", jSONObject);
            String str2 = ((laa) ex8Var.c).f;
            SharedPreferences.Editor edit2 = ((Context) ex8Var.b).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", str2);
            edit2.apply();
            ex8Var.a.set(i0);
            ((TaskCompletionSource) ((AtomicReference) ex8Var.h).get()).trySetResult(i0);
        }
        return Tasks.forResult(null);
    }

    public final String toString() {
        switch (this.a) {
            case 14:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.c.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public final void u(dp4 dp4Var, boolean z) {
        dp4 dp4Var2 = ((hq4) this.b).y;
        if (dp4Var2 != null) {
            dp4Var2.p().o.u(dp4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            rjb.p();
        }
    }

    @Override
    public final boolean v(ne9 ne9Var) {
        return false;
    }

    @Override
    public final void w() {
        ((n88) this.b).run();
    }

    public final void x(dp4 dp4Var, boolean z) {
        dp4 dp4Var2 = ((hq4) this.b).y;
        if (dp4Var2 != null) {
            dp4Var2.p().o.x(dp4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            rjb.p();
        }
    }

    @Override
    public final void z() {
        sb sbVar = ((sa8) this.c).N0;
        if (sbVar != null) {
            sbVar.invalidate();
        }
    }

    @Override
    public final void onRenderedFirstFrame(tk tkVar) {
    }

    @Override
    public final void H() {
    }

    @Override
    public final void V() {
    }

    @Override
    public final void V1() {
    }

    @Override
    public final void o() {
    }

    @Override
    public final void H1(float f) {
    }

    @Override
    public final void K0(float f) {
    }

    @Override
    public final void S1(float f) {
    }

    @Override
    public final void c2(float f) {
    }

    @Override
    public final void f1(long j) {
    }

    @Override
    public final void h(int i) {
    }

    @Override
    public final void h1(boolean z) {
    }

    @Override
    public final void j(boolean z) {
    }

    @Override
    public final void k2(long j) {
    }

    @Override
    public final void n0(float f) {
    }

    @Override
    public final void onSeekFinished(tk tkVar) {
    }

    @Override
    public final void onSeekStarted(tk tkVar) {
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public final void s(float f) {
    }

    @Override
    public final void v1(float f) {
    }

    @Override
    public final void w0(boolean z) {
    }

    @Override
    public final void y(float f) {
    }

    @Override
    public final void C(long j, boolean z) {
    }

    @Override
    public final void E0(float f, int i) {
    }

    @Override
    public final void R1(float f, int i) {
    }

    @Override
    public final void e2(int i, long j) {
    }

    @Override
    public final void s1(float f, int i) {
    }

    public wm4(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public wm4(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public wm4(Object obj) {
        this.a = (byte) 14;
        this.c = obj;
        this.b = new ArrayList();
    }

    public wm4(d8e d8eVar) {
        this.a = (byte) 2;
        ite.h(d8eVar);
        this.b = d8eVar;
    }

    public wm4(hq4 hq4Var) {
        this.a = (byte) 1;
        this.b = hq4Var;
        this.c = new CopyOnWriteArrayList();
    }

    public wm4(iu4 iu4Var) {
        this.a = (byte) 21;
        this.b = iu4Var;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        arrayList.add(new ju4(iu4Var, new int[]{1}));
    }

    public wm4(pu7 pu7Var) {
        this.a = (byte) 15;
        this.b = pu7Var;
    }

    public wm4(wb8 wb8Var) {
        this.a = (byte) 18;
        this.c = wb8Var;
        this.b = new q78(this, (byte) 13);
    }

    public wm4() {
        this.a = (byte) 4;
        this.b = new HashMap();
    }

    public wm4(oo8 oo8Var) {
        this.a = (byte) 28;
        yk1 yk1Var = yk1.f;
        this.c = oo8Var;
        this.b = yk1Var;
    }

    public wm4(byte b) {
        this.a = b;
    }

    public wm4(int i, int i2) {
        this.a = (byte) 3;
        this.b = new int[]{i, i2};
        this.c = new float[]{0.0f, 1.0f};
    }

    public wm4(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.a = (byte) 8;
        if (mediaSessionCompat$Token != null) {
            this.c = DesugarCollections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                this.b = new a(context, mediaSessionCompat$Token);
                return;
            } else {
                this.b = new a(context, mediaSessionCompat$Token);
                return;
            }
        }
        u36.j("sessionToken must not be null");
        throw null;
    }

    public wm4(int i, int i2, int i3) {
        this.a = (byte) 3;
        this.b = new int[]{i, i2, i3};
        this.c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public wm4(y79 y79Var, int[] iArr) {
        this.a = (byte) 13;
        this.b = mo5.q(y79Var);
        this.c = iArr;
    }
}
