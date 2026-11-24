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
public final class wk4 implements hk4, b79, lt8, eob, xv8, t46, lc9, ibc, kt8, SuccessContinuation, s3b {
    public final byte a;
    public Object b;
    public Object c;

    public wk4(ArrayList arrayList, ArrayList arrayList2) {
        this.a = (byte) 3;
        int size = arrayList.size();
        this.b = new int[size];
        this.c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public static wk4 W(int i, boolean z, byte[] bArr, byte[] bArr2) {
        int i2;
        byte[] byteArray;
        wk4 wk4Var = new wk4((byte) 10);
        if (bArr != null && bArr.length != 0) {
            if (z) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            if (i != 1) {
                if (i != 2) {
                    return wk4Var;
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
                wk4Var.b = serializedData3.toByteArray();
                serializedData3.cleanup();
                SerializedData serializedData4 = new SerializedData();
                serializedData4.writeBytes(o2, 0, 8);
                serializedData4.writeBytes(o, 8, 16);
                serializedData4.writeBytes(o2, 24, 8);
                wk4Var.c = serializedData4.toByteArray();
                serializedData4.cleanup();
                return wk4Var;
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
            wk4Var.b = serializedData9.toByteArray();
            serializedData9.cleanup();
            SerializedData serializedData10 = new SerializedData();
            serializedData10.writeBytes(n, 8, 12);
            serializedData10.writeBytes(n2, 0, 8);
            serializedData10.writeBytes(n3, 16, 4);
            serializedData10.writeBytes(n4, 0, 8);
            wk4Var.c = serializedData10.toByteArray();
            serializedData10.cleanup();
            return wk4Var;
        }
        wk4Var.c = null;
        wk4Var.b = null;
        return wk4Var;
    }

    @Override
    public final boolean A(mc9 mc9Var) {
        return false;
    }

    public final void B(bn4 bn4Var, boolean z) {
        bn4 bn4Var2 = ((go4) this.b).y;
        if (bn4Var2 != null) {
            bn4Var2.p().o.B(bn4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            fyb.g();
        }
    }

    @Override
    public final void D(yv8 yv8Var) {
        gl.B2(yv8Var);
        ((Runnable) this.c).run();
    }

    public final void E(bn4 bn4Var, boolean z) {
        bn4 bn4Var2 = ((go4) this.b).y;
        if (bn4Var2 != null) {
            bn4Var2.p().o.E(bn4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            fyb.g();
        }
    }

    @Override
    public final void F() {
        ((j79) this.b).f((k79) this.c);
    }

    public final void G(bn4 bn4Var, boolean z) {
        go4 go4Var = (go4) this.b;
        Context context = go4Var.w.b;
        bn4 bn4Var2 = go4Var.y;
        if (bn4Var2 != null) {
            bn4Var2.p().o.G(bn4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            fyb.g();
        }
    }

    @Override
    public final boolean H(mc9 mc9Var) {
        return false;
    }

    public final void J(bn4 bn4Var, boolean z) {
        bn4 bn4Var2 = ((go4) this.b).y;
        if (bn4Var2 != null) {
            bn4Var2.p().o.J(bn4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            fyb.g();
        }
    }

    public final void L(bn4 bn4Var, boolean z) {
        bn4 bn4Var2 = ((go4) this.b).y;
        if (bn4Var2 != null) {
            bn4Var2.p().o.L(bn4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            fyb.g();
        }
    }

    @Override
    public final void M(boolean z, float f) {
        w88 w88Var = (w88) this.b;
        v98 v98Var = (v98) this.c;
        lbc lbcVar = v98Var.d;
        if (lbcVar != null) {
            long U = lbcVar.U();
            float max = 2.8f / ((float) Math.max(60L, U));
            long j = (((f / (1.0f - max)) * max) + f) * ((float) U);
            v98Var.e = j;
            v98Var.d.p0(j, !z);
            if (!z) {
                gl.r(w88Var);
                gl.d3(w88Var, 120L);
            }
        }
    }

    public final void N(bn4 bn4Var, Bundle bundle, boolean z) {
        bn4 bn4Var2 = ((go4) this.b).y;
        if (bn4Var2 != null) {
            bn4Var2.p().o.N(bn4Var, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            fyb.g();
        }
    }

    @Override
    public final void O(CharSequence charSequence) {
        ((rb9) this.b).y0(charSequence);
    }

    @Override
    public final void P() {
        q88 q88Var = (q88) this.c;
        q88Var.v0.a.h();
        q88Var.b1.setViewHidden(false);
    }

    public final void Q(bn4 bn4Var, boolean z) {
        bn4 bn4Var2 = ((go4) this.b).y;
        if (bn4Var2 != null) {
            bn4Var2.p().o.Q(bn4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            fyb.g();
        }
    }

    public final void R(bn4 bn4Var, boolean z) {
        bn4 bn4Var2 = ((go4) this.b).y;
        if (bn4Var2 != null) {
            bn4Var2.p().o.R(bn4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            fyb.g();
        }
    }

    public final void S(bn4 bn4Var, boolean z) {
        bn4 bn4Var2 = ((go4) this.b).y;
        if (bn4Var2 != null) {
            bn4Var2.p().o.S(bn4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            fyb.g();
        }
    }

    @Override
    public final void T() {
        q88 q88Var = (q88) this.c;
        if (q88Var.I0 != null) {
            q88Var.t0(null, true);
        }
        q88Var.b1.setViewHidden(true);
    }

    @Override
    public final void U(Editable editable) {
        ((sb9) this.c).i();
        ((rb9) this.b).d1();
    }

    public final void V(int[] iArr, int i) {
        hs4 hs4Var = (hs4) this.b;
        if (i != 0) {
            int length = iArr.length - i;
            if (length > 0) {
                ArrayList arrayList = (ArrayList) this.c;
                if (i >= arrayList.size()) {
                    is4 is4Var = (is4) b00.f(1, arrayList);
                    for (int size = arrayList.size(); size <= i; size++) {
                        is4Var = is4Var.g(new is4(hs4Var, new int[]{1, hs4Var.a[(size - 1) + (hs4Var.g ? 1 : 0)]}));
                        arrayList.add(is4Var);
                    }
                }
                is4 is4Var2 = (is4) arrayList.get(i);
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
                            iArr4[i4] = hs4Var.c(iArr2[i4], 1);
                        }
                        is4 is4Var3 = new is4(hs4Var, iArr4);
                        if (hs4Var.equals(is4Var2.a)) {
                            if (!is4Var2.e()) {
                                is4 is4Var4 = hs4Var.c;
                                int b = hs4Var.b(is4Var2.c(is4Var2.d()));
                                while (is4Var3.d() >= is4Var2.d() && !is4Var3.e()) {
                                    int d = is4Var3.d() - is4Var2.d();
                                    int c = hs4Var.c(is4Var3.c(is4Var3.d()), b);
                                    is4 h = is4Var2.h(d, c);
                                    is4Var4 = is4Var4.a(hs4Var.a(d, c));
                                    is4Var3 = is4Var3.a(h);
                                }
                                int[] iArr5 = new is4[]{is4Var4, is4Var3}[1].b;
                                int length3 = i - iArr5.length;
                                for (int i5 = 0; i5 < length3; i5++) {
                                    iArr[length + i5] = 0;
                                }
                                System.arraycopy(iArr5, 0, iArr, length + length3, iArr5.length);
                                return;
                            }
                            w26.j("Divide by 0");
                            return;
                        }
                        w26.j("GenericGFPolys do not have same GenericGF field");
                        return;
                    }
                    sc8.e();
                    return;
                }
                sc8.e();
                return;
            }
            w26.j("No data bytes provided");
            return;
        }
        w26.j("No error correction bytes");
    }

    public final synchronized Map X() {
        Map map;
        map = (Map) this.c;
        if (map == null) {
            map = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.b));
            this.c = map;
        }
        return map;
    }

    @Override
    public final void Y(mc9 mc9Var) {
        ((rb9) this.b).m();
    }

    public final xm6 Z() {
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

    public final void a(Object obj, String str) {
        int length = str.length();
        String valueOf = String.valueOf(obj);
        ((ArrayList) this.b).add(ls6.o(str, "=", valueOf, new StringBuilder(length + 1 + valueOf.length())));
    }

    public final void a0(String str, String str2) {
        boolean equals = "PHONE_VERIFICATION_NEEDED".equals(str);
        vx7 vx7Var = ((gx7) this.c).a;
        if (equals) {
            vx7Var.Q1(true, str2, (oq7) this.b, this, vx7Var.C1);
        } else {
            vx7Var.P1(true, false);
        }
    }

    public final void b(bn4 bn4Var, boolean z) {
        bn4 bn4Var2 = ((go4) this.b).y;
        if (bn4Var2 != null) {
            bn4Var2.p().o.b(bn4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            fyb.g();
        }
    }

    @Override
    public final void c() {
        ((j79) this.b).c();
    }

    @Override
    public final boolean c0(boolean z) {
        return false;
    }

    @Override
    public final void d(mc9 mc9Var) {
        ((rb9) this.b).d(mc9Var);
    }

    public final void d0(boolean z, boolean z2, float f) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
        s28 s28Var = (s28) this.c;
        m8b m8bVar = s28Var.e;
        m8b.B1 = f;
        l8b l8bVar = m8bVar.A0;
        if (l8bVar != null) {
            l8bVar.setSpeed(f);
        }
        y28 y28Var = s28Var.x;
        int i = y28.U3;
        y28Var.g1(z);
        if (z2 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
        }
    }

    @Override
    public final void e(String str) {
        ((p8c) this.b).a(str);
    }

    public final void e0(ts6 ts6Var) {
        if (ts6Var != null) {
            if (!((Set) this.c).add(ts6Var)) {
                Log.w("MediaControllerCompat", "the callback has already been registered");
                return;
            }
            Handler handler = new Handler();
            ts6Var.f(handler);
            a aVar = (a) this.b;
            aVar.a.registerCallback(ts6Var.a, handler);
            synchronized (aVar.b) {
                if (aVar.e.a() != null) {
                    sm6 sm6Var = new sm6(ts6Var);
                    aVar.d.put(ts6Var, sm6Var);
                    ts6Var.c = sm6Var;
                    try {
                        aVar.e.a().F(sm6Var);
                        ts6Var.e(13, null, null);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                    }
                } else {
                    ts6Var.c = null;
                    aVar.c.add(ts6Var);
                }
            }
            return;
        }
        w26.j("callback must not be null");
    }

    public final void f0(int i) {
        try {
            a6e a6eVar = (a6e) this.b;
            Parcel R = a6eVar.R();
            R.writeInt(i);
            a6eVar.V(R, 16);
        } catch (RemoteException e) {
            fvc.g(e);
        }
    }

    @Override
    public final String g() {
        StringBuilder sb = new StringBuilder();
        sb.append((String) this.b);
        sb.append("|");
        File file = (File) this.c;
        sb.append(file.length());
        sb.append("|");
        sb.append(file.lastModified());
        return sb.toString();
    }

    public final List g0(CharSequence charSequence) {
        charSequence.getClass();
        kla klaVar = new kla((v39) this.c, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (klaVar.hasNext()) {
            arrayList.add((String) klaVar.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    @Override
    public final Object mo9get() {
        switch (this.a) {
            case 11:
                return new md7((Context) ((pj4) this.b).b, (mv6) ((i13) this.c).mo9get());
            default:
                return new h6a((snb) ((kt8) this.b).mo9get(), (v8c) ((kt8) this.c).mo9get());
        }
    }

    @Override
    public final java.lang.Object h(defpackage.ik4 r5, defpackage.fw2 r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wk4.h(ik4, fw2):java.lang.Object");
    }

    public final void h0(ts6 ts6Var) {
        if (ts6Var != null) {
            if (!((Set) this.c).remove(ts6Var)) {
                Log.w("MediaControllerCompat", "the callback has never been registered");
                return;
            }
            try {
                ((a) this.b).b(ts6Var);
                return;
            } finally {
                ts6Var.f(null);
            }
        }
        w26.j("callback must not be null");
    }

    @Override
    public final boolean i() {
        return ((rb9) this.b).P0();
    }

    public final void j(bn4 bn4Var, boolean z) {
        go4 go4Var = (go4) this.b;
        Context context = go4Var.w.b;
        bn4 bn4Var2 = go4Var.y;
        if (bn4Var2 != null) {
            bn4Var2.p().o.j(bn4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            fyb.g();
        }
    }

    @Override
    public final void l(int i, int i2) {
        ((rb9) this.b).U0(i, i2);
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final boolean n(float f) {
        return false;
    }

    @Override
    public final Closeable o(MediaExtractor mediaExtractor) {
        mediaExtractor.setDataSource((String) this.b);
        return null;
    }

    @Override
    public final void onError(lbc lbcVar, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        int i = secretMediaViewer.a0;
        if (i > 0) {
            secretMediaViewer.a0 = i - 1;
            gl.d3(new tj9(this, (File) this.b, (byte) 17), 100L);
            return;
        }
        fa4.g(exc, true);
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
        cu9 cu9Var = secretMediaViewer.h1;
        if (secretMediaViewer.E != null && secretMediaViewer.g0 != null) {
            gl.r(cu9Var);
            gl.c3(cu9Var);
            if (i != 4 && i != 1) {
                try {
                    secretMediaViewer.b.getWindow().addFlags(128);
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            } else {
                try {
                    secretMediaViewer.b.getWindow().clearFlags(128);
                } catch (Exception e2) {
                    fa4.g(e2, true);
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
        ix ixVar = ((SecretMediaViewer) this.c).x;
        if (ixVar != null) {
            if (i2 == 0) {
                f2 = 1.0f;
            } else {
                f2 = (i * f) / i2;
            }
            ixVar.a(f2, 0);
        }
    }

    @Override
    public final void q() {
        ((l68) this.b).run();
    }

    @Override
    public final void r() {
        sb sbVar = ((q88) this.c).N0;
        if (sbVar != null) {
            sbVar.invalidate();
        }
    }

    @Override
    public final void s() {
        q88 q88Var = (q88) this.c;
        if (q88Var.a1) {
            q88Var.a1 = false;
            return;
        }
        q88Var.j1.b(1);
        q88Var.s((m01) m01.a.get(0));
    }

    @Override
    public final void t(mc9 mc9Var, int i, int i2) {
        fib q0;
        rb9 rb9Var = (rb9) this.b;
        if (!((sb9) this.c).d && i != i2 && (q0 = rb9Var.q0()) != null) {
            if (!q0.w() || q0.W != rb9Var.G0()) {
                mc9Var.post(new az0(this, mc9Var, i2, q0, rb9Var, i));
            }
        }
    }

    @Override
    public final Task then(Object obj) {
        FileWriter fileWriter;
        Void r9 = (Void) obj;
        dv8 dv8Var = (dv8) this.c;
        JSONObject jSONObject = (JSONObject) ((pz2) ((mv6) this.b).d).a.submit(new mk(this, (byte) 3)).get();
        FileWriter fileWriter2 = null;
        if (jSONObject != null) {
            q7a k0 = ((u39) dv8Var.d).k0(jSONObject);
            l69 l69Var = (l69) dv8Var.e;
            long j = k0.c;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j);
                fileWriter = new FileWriter((File) l69Var.b);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Exception e) {
                        e = e;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        pm2.b(fileWriter, "Failed to close settings writer.");
                        dv8.e("Loaded settings: ", jSONObject);
                        String str = ((l8a) dv8Var.c).f;
                        SharedPreferences.Editor edit = ((Context) dv8Var.b).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        edit.putString("existing_instance_identifier", str);
                        edit.apply();
                        dv8Var.a.set(k0);
                        ((TaskCompletionSource) ((AtomicReference) dv8Var.h).get()).trySetResult(k0);
                        return Tasks.forResult(null);
                    }
                } catch (Throwable th) {
                    th = th;
                    fileWriter2 = fileWriter;
                    pm2.b(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                fileWriter = null;
            } catch (Throwable th2) {
                th = th2;
                pm2.b(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            pm2.b(fileWriter, "Failed to close settings writer.");
            dv8.e("Loaded settings: ", jSONObject);
            String str2 = ((l8a) dv8Var.c).f;
            SharedPreferences.Editor edit2 = ((Context) dv8Var.b).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", str2);
            edit2.apply();
            dv8Var.a.set(k0);
            ((TaskCompletionSource) ((AtomicReference) dv8Var.h).get()).trySetResult(k0);
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

    public final void v(bn4 bn4Var, boolean z) {
        bn4 bn4Var2 = ((go4) this.b).y;
        if (bn4Var2 != null) {
            bn4Var2.p().o.v(bn4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            fyb.g();
        }
    }

    @Override
    public final boolean x() {
        boolean z;
        q88 q88Var = (q88) this.c;
        if (q88Var.I0 == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            q88Var.t0(null, true);
        }
        return z;
    }

    public final void y(bn4 bn4Var, boolean z) {
        bn4 bn4Var2 = ((go4) this.b).y;
        if (bn4Var2 != null) {
            bn4Var2.p().o.y(bn4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            fyb.g();
        }
    }

    @Override
    public final void onRenderedFirstFrame(tj tjVar) {
    }

    @Override
    public final void I() {
    }

    @Override
    public final void K() {
    }

    @Override
    public final void p() {
    }

    @Override
    public final void p1() {
    }

    @Override
    public final void H1(long j) {
    }

    @Override
    public final void L0(long j) {
    }

    @Override
    public final void Q0(boolean z) {
    }

    @Override
    public final void Z0(float f) {
    }

    @Override
    public final void b0(float f) {
    }

    @Override
    public final void e1(float f) {
    }

    @Override
    public final void f(int i) {
    }

    @Override
    public final void k(boolean z) {
    }

    @Override
    public final void k0(boolean z) {
    }

    @Override
    public final void k1(float f) {
    }

    @Override
    public final void onSeekFinished(tj tjVar) {
    }

    @Override
    public final void onSeekStarted(tj tjVar) {
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public final void u(float f) {
    }

    @Override
    public final void u0(float f) {
    }

    @Override
    public final void u1(float f) {
    }

    @Override
    public final void w(float f) {
    }

    @Override
    public final void B1(int i, long j) {
    }

    @Override
    public final void W0(float f, int i) {
    }

    @Override
    public final void j1(float f, int i) {
    }

    @Override
    public final void p0(float f, int i) {
    }

    @Override
    public final void z(long j, boolean z) {
    }

    public wk4(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public wk4(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public wk4(Object obj) {
        this.a = (byte) 14;
        this.c = obj;
        this.b = new ArrayList();
    }

    public wk4(a6e a6eVar) {
        this.a = (byte) 2;
        fre.h(a6eVar);
        this.b = a6eVar;
    }

    public wk4(go4 go4Var) {
        this.a = (byte) 1;
        this.b = go4Var;
        this.c = new CopyOnWriteArrayList();
    }

    public wk4(hs4 hs4Var) {
        this.a = (byte) 21;
        this.b = hs4Var;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        arrayList.add(new is4(hs4Var, new int[]{1}));
    }

    public wk4(os7 os7Var) {
        this.a = (byte) 15;
        this.b = os7Var;
    }

    public wk4(v98 v98Var) {
        this.a = (byte) 18;
        this.c = v98Var;
        this.b = new w88(this, (byte) 6);
    }

    public wk4() {
        this.a = (byte) 4;
        this.b = new HashMap();
    }

    public wk4(v39 v39Var) {
        this.a = (byte) 28;
        qj1 qj1Var = qj1.f;
        this.c = v39Var;
        this.b = qj1Var;
    }

    public wk4(byte b) {
        this.a = b;
    }

    public wk4(int i, int i2) {
        this.a = (byte) 3;
        this.b = new int[]{i, i2};
        this.c = new float[]{0.0f, 1.0f};
    }

    public wk4(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
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
        w26.j("sessionToken must not be null");
        throw null;
    }

    public wk4(int i, int i2, int i3) {
        this.a = (byte) 3;
        this.b = new int[]{i, i2, i3};
        this.c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public wk4(w59 w59Var, int[] iArr) {
        this.a = (byte) 13;
        this.b = mm5.q(w59Var);
        this.c = iArr;
    }
}
