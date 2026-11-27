package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
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
public final class um4 implements mm4, oa9, uw8, esb, iz8, x66, cg9, ifc, tw8, SuccessContinuation {
    public final byte a;
    public Object b;
    public Object c;

    public um4(ArrayList arrayList, ArrayList arrayList2) {
        this.a = (byte) 4;
        int size = arrayList.size();
        this.b = new int[size];
        this.c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public static um4 S(int i, boolean z, byte[] bArr, byte[] bArr2) {
        int i2;
        byte[] byteArray;
        um4 um4Var = new um4((byte) 11);
        if (bArr != null && bArr.length != 0) {
            if (z) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            if (i != 1) {
                if (i != 2) {
                    return um4Var;
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
                um4Var.b = serializedData3.toByteArray();
                serializedData3.cleanup();
                SerializedData serializedData4 = new SerializedData();
                serializedData4.writeBytes(o2, 0, 8);
                serializedData4.writeBytes(o, 8, 16);
                serializedData4.writeBytes(o2, 24, 8);
                um4Var.c = serializedData4.toByteArray();
                serializedData4.cleanup();
                return um4Var;
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
            um4Var.b = serializedData9.toByteArray();
            serializedData9.cleanup();
            SerializedData serializedData10 = new SerializedData();
            serializedData10.writeBytes(n, 8, 12);
            serializedData10.writeBytes(n2, 0, 8);
            serializedData10.writeBytes(n3, 16, 4);
            serializedData10.writeBytes(n4, 0, 8);
            um4Var.c = serializedData10.toByteArray();
            serializedData10.cleanup();
            return um4Var;
        }
        um4Var.c = null;
        um4Var.b = null;
        return um4Var;
    }

    @Override
    public final void A(jz8 jz8Var) {
        hl.B2(jz8Var);
        ((Runnable) this.c).run();
    }

    public final void B(gp4 gp4Var, boolean z) {
        gp4 gp4Var2 = ((kq4) this.b).y;
        if (gp4Var2 != null) {
            gp4Var2.p().o.B(gp4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            grb.o();
        }
    }

    @Override
    public final boolean E() {
        boolean z;
        hc8 hc8Var = (hc8) this.c;
        if (hc8Var.C0 == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            hc8Var.t0(null, true);
        }
        return z;
    }

    @Override
    public final boolean F(dg9 dg9Var) {
        return false;
    }

    @Override
    public final void H() {
        ((wa9) this.b).f((xa9) this.c);
    }

    public final void I(gp4 gp4Var, boolean z) {
        gp4 gp4Var2 = ((kq4) this.b).y;
        if (gp4Var2 != null) {
            gp4Var2.p().o.I(gp4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            grb.o();
        }
    }

    public final void J(gp4 gp4Var, Bundle bundle, boolean z) {
        gp4 gp4Var2 = ((kq4) this.b).y;
        if (gp4Var2 != null) {
            gp4Var2.p().o.J(gp4Var, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            grb.o();
        }
    }

    public final void K(gp4 gp4Var, boolean z) {
        gp4 gp4Var2 = ((kq4) this.b).y;
        if (gp4Var2 != null) {
            gp4Var2.p().o.K(gp4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            grb.o();
        }
    }

    public final void L(gp4 gp4Var, boolean z) {
        gp4 gp4Var2 = ((kq4) this.b).y;
        if (gp4Var2 != null) {
            gp4Var2.p().o.L(gp4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            grb.o();
        }
    }

    @Override
    public final void M(CharSequence charSequence) {
        ((hf9) this.b).L0(charSequence);
    }

    public final void N(gp4 gp4Var, boolean z) {
        gp4 gp4Var2 = ((kq4) this.b).y;
        if (gp4Var2 != null) {
            gp4Var2.p().o.N(gp4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            grb.o();
        }
    }

    @Override
    public final void O() {
        hc8 hc8Var = (hc8) this.c;
        hc8Var.p0.a.f();
        hc8Var.V0.setViewHidden(false);
    }

    public final void P(int[] iArr, int i) {
        lu4 lu4Var = (lu4) this.b;
        if (i != 0) {
            int length = iArr.length - i;
            if (length > 0) {
                ArrayList arrayList = (ArrayList) this.c;
                if (i >= arrayList.size()) {
                    mu4 mu4Var = (mu4) c00.g(1, arrayList);
                    for (int size = arrayList.size(); size <= i; size++) {
                        mu4Var = mu4Var.g(new mu4(lu4Var, new int[]{1, lu4Var.a[(size - 1) + (lu4Var.g ? 1 : 0)]}));
                        arrayList.add(mu4Var);
                    }
                }
                mu4 mu4Var2 = (mu4) arrayList.get(i);
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
                            iArr4[i4] = lu4Var.c(iArr2[i4], 1);
                        }
                        mu4 mu4Var3 = new mu4(lu4Var, iArr4);
                        if (lu4Var.equals(mu4Var2.a)) {
                            if (!mu4Var2.e()) {
                                mu4 mu4Var4 = lu4Var.c;
                                int b = lu4Var.b(mu4Var2.c(mu4Var2.d()));
                                while (mu4Var3.d() >= mu4Var2.d() && !mu4Var3.e()) {
                                    int d = mu4Var3.d() - mu4Var2.d();
                                    int c = lu4Var.c(mu4Var3.c(mu4Var3.d()), b);
                                    mu4 h = mu4Var2.h(d, c);
                                    mu4Var4 = mu4Var4.a(lu4Var.a(d, c));
                                    mu4Var3 = mu4Var3.a(h);
                                }
                                int[] iArr5 = new mu4[]{mu4Var4, mu4Var3}[1].b;
                                int length3 = i - iArr5.length;
                                for (int i5 = 0; i5 < length3; i5++) {
                                    iArr[length + i5] = 0;
                                }
                                System.arraycopy(iArr5, 0, iArr, length + length3, iArr5.length);
                                return;
                            }
                            lq5.j("Divide by 0");
                            return;
                        }
                        lq5.j("GenericGFPolys do not have same GenericGF field");
                        return;
                    }
                    iy8.d();
                    return;
                }
                iy8.d();
                return;
            }
            lq5.j("No data bytes provided");
            return;
        }
        lq5.j("No error correction bytes");
    }

    @Override
    public final void Q(Editable editable) {
        ((if9) this.c).i();
        ((hf9) this.b).B1();
    }

    @Override
    public final void R() {
        hc8 hc8Var = (hc8) this.c;
        if (hc8Var.C0 != null) {
            hc8Var.t0(null, true);
        }
        hc8Var.V0.setViewHidden(true);
    }

    public final synchronized Map T() {
        Map map;
        map = (Map) this.c;
        if (map == null) {
            map = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.b));
            this.c = map;
        }
        return map;
    }

    @Override
    public final void U(dg9 dg9Var) {
        ((hf9) this.b).q();
    }

    @Override
    public final boolean W(boolean z) {
        return false;
    }

    @Override
    public final void X(boolean z, float f) {
        x38 x38Var = (x38) this.b;
        ld8 ld8Var = (ld8) this.c;
        kfc kfcVar = ld8Var.d;
        if (kfcVar != null) {
            long U = kfcVar.U();
            float max = 2.8f / ((float) Math.max(60L, U));
            long j = (((f / (1.0f - max)) * max) + f) * ((float) U);
            ld8Var.e = j;
            ld8Var.d.p0(j, !z);
            if (!z) {
                hl.r(x38Var);
                hl.d3(x38Var, 120L);
            }
        }
    }

    public final bp6 Y() {
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

    public final void Z(String str, String str2) {
        boolean equals = "PHONE_VERIFICATION_NEEDED".equals(str);
        b18 b18Var = ((m08) this.c).a;
        if (equals) {
            b18Var.R1(true, str2, (fe7) this.b, this, b18Var.C1);
        } else {
            b18Var.Q1(true, false);
        }
    }

    public final void a(Object obj, String str) {
        int length = str.length();
        String valueOf = String.valueOf(obj);
        ((ArrayList) this.b).add(qu6.o(str, "=", valueOf, new StringBuilder(length + 1 + valueOf.length())));
    }

    public final void a0(boolean z, boolean z2, float f) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
        j68 j68Var = (j68) this.c;
        lcb lcbVar = j68Var.e;
        lcb.B1 = f;
        kcb kcbVar = lcbVar.A0;
        if (kcbVar != null) {
            kcbVar.setSpeed(f);
        }
        o68 o68Var = j68Var.x;
        int i = o68.O3;
        o68Var.g1(z);
        if (z2 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
        }
    }

    public final void b(gp4 gp4Var, boolean z) {
        gp4 gp4Var2 = ((kq4) this.b).y;
        if (gp4Var2 != null) {
            gp4Var2.p().o.b(gp4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            grb.o();
        }
    }

    public final void b0(yu6 yu6Var) {
        if (yu6Var != null) {
            if (!((Set) this.c).add(yu6Var)) {
                Log.w("MediaControllerCompat", "the callback has already been registered");
                return;
            }
            Handler handler = new Handler();
            yu6Var.f(handler);
            a aVar = (a) this.b;
            aVar.a.registerCallback(yu6Var.a, handler);
            synchronized (aVar.b) {
                if (aVar.e.a() != null) {
                    wo6 wo6Var = new wo6(yu6Var);
                    aVar.d.put(yu6Var, wo6Var);
                    yu6Var.c = wo6Var;
                    try {
                        aVar.e.a().F(wo6Var);
                        yu6Var.e(13, null, null);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                    }
                } else {
                    yu6Var.c = null;
                    aVar.c.add(yu6Var);
                }
            }
            return;
        }
        lq5.j("callback must not be null");
    }

    @Override
    public final void c() {
        ((wa9) this.b).c();
    }

    public final void c0(int i) {
        try {
            qae qaeVar = (qae) this.b;
            Parcel R = qaeVar.R();
            R.writeInt(i);
            qaeVar.V(R, 16);
        } catch (RemoteException e) {
            p3d.i(e);
        }
    }

    @Override
    public final void d(String str) {
        ((pcc) this.b).a(str);
    }

    public final List d0(CharSequence charSequence) {
        charSequence.getClass();
        hpa hpaVar = new hpa((k09) this.c, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (hpaVar.hasNext()) {
            arrayList.add((String) hpaVar.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    @Override
    public final void e(dg9 dg9Var) {
        ((hf9) this.b).e(dg9Var);
    }

    public final void e0(yu6 yu6Var) {
        if (yu6Var != null) {
            if (!((Set) this.c).remove(yu6Var)) {
                Log.w("MediaControllerCompat", "the callback has never been registered");
                return;
            }
            try {
                ((a) this.b).b(yu6Var);
                return;
            } finally {
                yu6Var.f(null);
            }
        }
        lq5.j("callback must not be null");
    }

    public final void f(gp4 gp4Var, boolean z) {
        kq4 kq4Var = (kq4) this.b;
        Context context = kq4Var.w.b;
        gp4 gp4Var2 = kq4Var.y;
        if (gp4Var2 != null) {
            gp4Var2.p().o.f(gp4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            grb.o();
        }
    }

    @Override
    public final Object mo21get() {
        switch (this.a) {
            case 12:
                return new vf7((Context) ((pq5) this.b).a, (rx6) ((b23) this.c).mo21get());
            default:
                return new z9a((srb) ((tw8) this.b).mo21get(), (vcc) ((tw8) this.c).mo21get());
        }
    }

    public final void h(gp4 gp4Var, boolean z) {
        gp4 gp4Var2 = ((kq4) this.b).y;
        if (gp4Var2 != null) {
            gp4Var2.p().o.h(gp4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            grb.o();
        }
    }

    @Override
    public final boolean i() {
        return ((hf9) this.b).d1();
    }

    @Override
    public final java.lang.Object k(defpackage.nm4 r10, defpackage.zw2 r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.um4.k(nm4, zw2):java.lang.Object");
    }

    @Override
    public final void l(int i, int i2) {
        ((hf9) this.b).o1(i, i2);
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final boolean n(float f) {
        return false;
    }

    public final void o(gp4 gp4Var, boolean z) {
        gp4 gp4Var2 = ((kq4) this.b).y;
        if (gp4Var2 != null) {
            gp4Var2.p().o.o(gp4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            grb.o();
        }
    }

    @Override
    public final void onError(kfc kfcVar, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        int i = secretMediaViewer.a0;
        if (i > 0) {
            secretMediaViewer.a0 = i - 1;
            hl.d3(new en9(this, (File) this.b, (byte) 16), 100L);
            return;
        }
        cc4.g(exc, true);
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
        xx9 xx9Var = secretMediaViewer.h1;
        if (secretMediaViewer.E != null && secretMediaViewer.g0 != null) {
            hl.r(xx9Var);
            hl.c3(xx9Var);
            if (i != 4 && i != 1) {
                try {
                    secretMediaViewer.b.getWindow().addFlags(128);
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            } else {
                try {
                    secretMediaViewer.b.getWindow().clearFlags(128);
                } catch (Exception e2) {
                    cc4.g(e2, true);
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
        jx jxVar = ((SecretMediaViewer) this.c).x;
        if (jxVar != null) {
            if (i2 == 0) {
                f2 = 1.0f;
            } else {
                f2 = (i * f) / i2;
            }
            jxVar.a(f2, 0);
        }
    }

    @Override
    public final void q() {
        ((y98) this.b).run();
    }

    public final void r(gp4 gp4Var, boolean z) {
        gp4 gp4Var2 = ((kq4) this.b).y;
        if (gp4Var2 != null) {
            gp4Var2.p().o.r(gp4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            grb.o();
        }
    }

    @Override
    public final void s(dg9 dg9Var, int i, int i2) {
        amb E0;
        hf9 hf9Var = (hf9) this.b;
        if (!((if9) this.c).d && i != i2 && (E0 = hf9Var.E0()) != null) {
            if (!E0.w() || E0.W != hf9Var.S0()) {
                dg9Var.post(new iz0(this, dg9Var, i2, E0, hf9Var, i));
            }
        }
    }

    @Override
    public final Task then(Object obj) {
        FileWriter fileWriter;
        Void r9 = (Void) obj;
        oy8 oy8Var = (oy8) this.c;
        JSONObject jSONObject = (JSONObject) ((i03) ((rx6) this.b).d).a.submit(new mk(this, (byte) 3)).get();
        FileWriter fileWriter2 = null;
        if (jSONObject != null) {
            hba c0 = ((ve9) oy8Var.d).c0(jSONObject);
            ri6 ri6Var = (ri6) oy8Var.e;
            long j = c0.c;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j);
                fileWriter = new FileWriter((File) ri6Var.b);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Exception e) {
                        e = e;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        jn2.b(fileWriter, "Failed to close settings writer.");
                        oy8.e("Loaded settings: ", jSONObject);
                        String str = ((bca) oy8Var.c).f;
                        SharedPreferences.Editor edit = ((Context) oy8Var.b).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        edit.putString("existing_instance_identifier", str);
                        edit.apply();
                        oy8Var.a.set(c0);
                        ((TaskCompletionSource) ((AtomicReference) oy8Var.h).get()).trySetResult(c0);
                        return Tasks.forResult(null);
                    }
                } catch (Throwable th) {
                    th = th;
                    fileWriter2 = fileWriter;
                    jn2.b(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                fileWriter = null;
            } catch (Throwable th2) {
                th = th2;
                jn2.b(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            jn2.b(fileWriter, "Failed to close settings writer.");
            oy8.e("Loaded settings: ", jSONObject);
            String str2 = ((bca) oy8Var.c).f;
            SharedPreferences.Editor edit2 = ((Context) oy8Var.b).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", str2);
            edit2.apply();
            oy8Var.a.set(c0);
            ((TaskCompletionSource) ((AtomicReference) oy8Var.h).get()).trySetResult(c0);
        }
        return Tasks.forResult(null);
    }

    public final String toString() {
        switch (this.a) {
            case 15:
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

    @Override
    public final void u() {
        tb tbVar = ((hc8) this.c).H0;
        if (tbVar != null) {
            tbVar.invalidate();
        }
    }

    @Override
    public final void v() {
        hc8 hc8Var = (hc8) this.c;
        if (hc8Var.U0) {
            hc8Var.U0 = false;
            return;
        }
        hc8Var.d1.b(1);
        hc8Var.s((v01) v01.a.get(0));
    }

    @Override
    public final boolean w(dg9 dg9Var) {
        return false;
    }

    public final void x(gp4 gp4Var, boolean z) {
        gp4 gp4Var2 = ((kq4) this.b).y;
        if (gp4Var2 != null) {
            gp4Var2.p().o.x(gp4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            grb.o();
        }
    }

    public final void z(gp4 gp4Var, boolean z) {
        kq4 kq4Var = (kq4) this.b;
        Context context = kq4Var.w.b;
        gp4 gp4Var2 = kq4Var.y;
        if (gp4Var2 != null) {
            gp4Var2.p().o.z(gp4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            grb.o();
        }
    }

    @Override
    public final void onRenderedFirstFrame(uj ujVar) {
    }

    @Override
    public final void G() {
    }

    @Override
    public final void S1() {
    }

    @Override
    public final void V() {
    }

    @Override
    public final void p() {
    }

    @Override
    public final void E1(float f) {
    }

    @Override
    public final void H0(float f) {
    }

    @Override
    public final void P1(float f) {
    }

    @Override
    public final void Z1(float f) {
    }

    @Override
    public final void b1(long j) {
    }

    @Override
    public final void e1(boolean z) {
    }

    @Override
    public final void g(int i) {
    }

    @Override
    public final void g2(long j) {
    }

    @Override
    public final void j(boolean z) {
    }

    @Override
    public final void m0(float f) {
    }

    @Override
    public final void onSeekFinished(uj ujVar) {
    }

    @Override
    public final void onSeekStarted(uj ujVar) {
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public final void s1(float f) {
    }

    @Override
    public final void t(float f) {
    }

    @Override
    public final void v0(boolean z) {
    }

    @Override
    public final void y(float f) {
    }

    @Override
    public final void B0(float f, int i) {
    }

    @Override
    public final void C(long j, boolean z) {
    }

    @Override
    public final void O1(float f, int i) {
    }

    @Override
    public final void b2(int i, long j) {
    }

    @Override
    public final void p1(float f, int i) {
    }

    public um4(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public um4(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public um4(Object obj) {
        this.a = (byte) 15;
        this.c = obj;
        this.b = new ArrayList();
    }

    public um4(qae qaeVar) {
        this.a = (byte) 3;
        xve.h(qaeVar);
        this.b = qaeVar;
    }

    public um4(kq4 kq4Var) {
        this.a = (byte) 2;
        this.b = kq4Var;
        this.c = new CopyOnWriteArrayList();
    }

    public um4(lu4 lu4Var) {
        this.a = (byte) 22;
        this.b = lu4Var;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        arrayList.add(new mu4(lu4Var, new int[]{1}));
    }

    public um4(vv7 vv7Var) {
        this.a = (byte) 16;
        this.b = vv7Var;
    }

    public um4(ld8 ld8Var) {
        this.a = (byte) 19;
        this.c = ld8Var;
        this.b = new x38(this, (byte) 21);
    }

    public um4() {
        this.a = (byte) 5;
        this.b = new HashMap();
    }

    public um4(k09 k09Var) {
        this.a = (byte) 29;
        zj1 zj1Var = zj1.f;
        this.c = k09Var;
        this.b = zj1Var;
    }

    public um4(byte b) {
        this.a = b;
    }

    public um4(int i, int i2) {
        this.a = (byte) 4;
        this.b = new int[]{i, i2};
        this.c = new float[]{0.0f, 1.0f};
    }

    public um4(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.a = (byte) 9;
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
        lq5.j("sessionToken must not be null");
        throw null;
    }

    public um4(int i, int i2, int i3) {
        this.a = (byte) 4;
        this.b = new int[]{i, i2, i3};
        this.c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public um4(j99 j99Var, int[] iArr) {
        this.a = (byte) 14;
        this.b = po5.q(j99Var);
        this.c = iArr;
    }
}
