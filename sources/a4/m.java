package a4;

import ai.n8;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.b0;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.g0;
import androidx.lifecycle.a0;
import b2.l1;
import c7.v;
import ci.cc;
import ci.d0;
import ci.d7;
import ci.e0;
import ci.ec;
import ci.k6;
import ci.o8;
import ci.oc;
import ci.qb;
import ci.sc;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.x0;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.internal.cast.k4;
import com.google.android.gms.internal.play_billing.r;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import ei.x4;
import fb.n;
import i2.i0;
import ii.a1;
import ii.b3;
import ii.e5;
import ii.g5;
import ii.h1;
import ii.h2;
import ii.k0;
import ii.o2;
import ii.r3;
import ii.w3;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import k2.j0;
import lg.o;
import m.i1;
import n4.y;
import n7.n1;
import n7.o1;
import o2.q;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.fh;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.ti;
import qg.e2;
import u2.c1;
import u2.d1;
import v7.m8;
import v7.z6;
import x2.p;
public final class m implements z3.d, a0, androidx.activity.result.b, s, o, sc, OnCompleteListener, n, i1, ti, k0, h1, k2.n, m.k, fo0, o0.b, c1 {
    public final int f274a;
    public Object f275b;

    public m(int i10, boolean z10) {
        this.f274a = i10;
    }

    @Override
    public int A() {
        return 1;
    }

    public void A0(String str, String str2) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 1) {
            throw new IllegalArgumentException(a.p("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.f275b).putCharSequence(str, str2);
    }

    public JSONObject B0() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f275b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(w9.h.j(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e) {
                        e = e;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        w9.h.c(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    w9.h.c(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            w9.h.c(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e7) {
            e = e7;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            w9.h.c(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override
    public void C(float f7, int i10) {
        ArrayList arrayList;
        d7 d7Var = (d7) this.f275b;
        o8 o8Var = d7Var.d;
        if (o8Var != null && (arrayList = o8Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((o8) d7Var.d.T.get(i10)).P = f7;
        }
    }

    public float C0(int i10, int i11, int i12, int i13) {
        boolean z10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z11;
        int i21 = 1;
        if (Math.abs(i13 - i11) > Math.abs(i12 - i10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i15 = i10;
            i14 = i11;
            i17 = i12;
            i16 = i13;
        } else {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
        }
        int abs = Math.abs(i16 - i14);
        int abs2 = Math.abs(i17 - i15);
        int i22 = (-abs) / 2;
        int i23 = -1;
        if (i14 < i16) {
            i18 = 1;
        } else {
            i18 = -1;
        }
        if (i15 < i17) {
            i23 = 1;
        }
        int i24 = i16 + i18;
        int i25 = i14;
        int i26 = i15;
        int i27 = 0;
        while (i25 != i24) {
            if (z10) {
                i19 = i26;
            } else {
                i19 = i25;
            }
            if (z10) {
                i20 = i25;
            } else {
                i20 = i26;
            }
            boolean z12 = z10;
            if (i27 == i21) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i28 = abs;
            if (z11 == ((dc.b) this.f275b).b(i19, i20)) {
                if (i27 == 2) {
                    return z6.b(i25, i26, i14, i15);
                }
                i27++;
            }
            i22 += abs2;
            if (i22 > 0) {
                if (i26 == i17) {
                    break;
                }
                i26 += i23;
                i22 -= i28;
            }
            i25 += i18;
            abs = i28;
            z10 = z12;
            i21 = 1;
        }
        if (i27 == 2) {
            return z6.b(i24, i17, i14, i15);
        }
        return Float.NaN;
    }

    @Override
    public void D(ii.i1 i1Var, int i10, int i11) {
        e5 e5Var;
        q9 textSelectionHelper;
        g5 g5Var = (g5) this.f275b;
        if (!g5Var.f11397w && i10 != i11 && (e5Var = g5Var.f11396s) != null && (textSelectionHelper = ((b3) e5Var).f11257a.getTextSelectionHelper()) != null) {
            i1Var.post(new x4(this, i1Var, i11, textSelectionHelper, i10, 3));
        }
    }

    public float D0(int i10, int i11, int i12, int i13) {
        float f7;
        float f10;
        dc.b bVar = (dc.b) this.f275b;
        float C0 = C0(i10, i11, i12, i13);
        int i14 = i10 - (i12 - i10);
        int i15 = 0;
        if (i14 < 0) {
            f7 = i10 / (i10 - i14);
            i14 = 0;
        } else {
            int i16 = bVar.f7618a;
            if (i14 >= i16) {
                int i17 = i16 - 1;
                f7 = ((i16 - 1) - i10) / (i14 - i10);
                i14 = i17;
            } else {
                f7 = 1.0f;
            }
        }
        float f11 = i11;
        int i18 = (int) (f11 - ((i13 - i11) * f7));
        if (i18 < 0) {
            f10 = f11 / (i11 - i18);
        } else {
            int i19 = bVar.f7619b;
            if (i18 >= i19) {
                f10 = ((i19 - 1) - i11) / (i18 - i11);
                i15 = i19 - 1;
            } else {
                i15 = i18;
                f10 = 1.0f;
            }
        }
        return (C0(i10, i11, (int) (((i14 - i10) * f10) + i10), i15) + C0) - 1.0f;
    }

    @Override
    public q9 E() {
        r3 r3Var = ((a1) this.f275b).S;
        if (r3Var == null) {
            return null;
        }
        return r3Var.f11603a.getTextSelectionHelper();
    }

    @Override
    public void F(float f7) {
        d7 d7Var = (d7) this.f275b;
        o8 o8Var = d7Var.d;
        if (o8Var == null) {
            return;
        }
        o8Var.P = f7;
        d7Var.c();
    }

    @Override
    public Cursor G(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f275b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e) {
            Log.w("FontsProvider", "Unable to query the content provider", e);
            return null;
        }
    }

    @Override
    public void H(float f7, boolean z10) {
        d7 d7Var = (d7) this.f275b;
        o8 o8Var = d7Var.d;
        if (o8Var != null) {
            o8Var.Z = f7;
            o8Var.f5162j = true;
            h71 h71Var = d7Var.e;
            if (h71Var != null && h71Var.p() != -9223372036854775807L) {
                d7Var.m(f7 * ((float) d7Var.e.p()));
            }
        }
    }

    @Override
    public void I(CharSequence charSequence) {
        r3 r3Var = ((a1) this.f275b).S;
        if (r3Var != null) {
            r3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                r3Var.f11603a.u4(charSequence.toString());
            }
        }
    }

    @Override
    public void J() {
        p pVar;
        j0 j0Var = (j0) this.f275b;
        synchronized (j0Var.f10684a) {
            pVar = j0Var.H;
        }
        if (pVar != null) {
            pVar.h();
        }
    }

    @Override
    public p9 K() {
        return (a1) this.f275b;
    }

    @Override
    public ii.a N() {
        return ((a1) this.f275b).f11220a;
    }

    @Override
    public void O(long j3) {
        d7 d7Var = (d7) this.f275b;
        o8 o8Var = d7Var.d;
        if (o8Var == null) {
            return;
        }
        o8Var.f5178r0 = j3;
        o8Var.f5162j = true;
        d7Var.y(true);
    }

    @Override
    public boolean P() {
        a1 a1Var = (a1) this.f275b;
        r3 r3Var = a1Var.S;
        if (r3Var != null) {
            ii.a aVar = a1Var.f11220a;
            if (r3Var.f11603a.T4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void Q(boolean z10) {
        e2 e2Var;
        oc ocVar = ((cc) ((d7) this.f275b)).C0;
        qb qbVar = ocVar.f5272v1;
        if (qbVar != null) {
            e2 e2Var2 = null;
            if (!z10 && (qbVar.getSelectedEntity() instanceof e2)) {
                ocVar.f5272v1.D0(null, true);
            } else if (z10 && !(ocVar.f5272v1.getSelectedEntity() instanceof e2)) {
                k6 k6Var = ocVar.f5272v1.R0;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 < k6Var.getChildCount()) {
                        View childAt = k6Var.getChildAt(i11);
                        if (childAt instanceof e2) {
                            e2Var = (e2) childAt;
                            break;
                        }
                        i11++;
                    } else {
                        e2Var = null;
                        break;
                    }
                }
                if (e2Var != null) {
                    qb qbVar2 = ocVar.f5272v1;
                    k6 k6Var2 = qbVar2.R0;
                    while (true) {
                        if (i10 >= k6Var2.getChildCount()) {
                            break;
                        }
                        View childAt2 = k6Var2.getChildAt(i10);
                        if (childAt2 instanceof e2) {
                            e2Var2 = (e2) childAt2;
                            break;
                        }
                        i10++;
                    }
                    qbVar2.D0(e2Var2, true);
                }
            }
        }
    }

    @Override
    public void R(Exception exc) {
        e2.a.f("MediaCodecAudioRenderer", "Audio sink error", exc);
        y yVar = ((j0) this.f275b).Y0;
        Handler handler = (Handler) yVar.f15004b;
        if (handler != null) {
            handler.post(new k2.f(yVar, exc, 1));
        }
    }

    @Override
    public void S(int i10, int i11) {
        a1 a1Var = (a1) this.f275b;
        r3 r3Var = a1Var.S;
        if (r3Var != null) {
            ii.a aVar = a1Var.f11220a;
            h2 h2Var = r3Var.f11603a.J3;
            if (h2Var != null) {
                h2Var.f(i10, i11);
            }
        }
    }

    @Override
    public boolean S1() {
        return false;
    }

    @Override
    public void T(float f7, int i10) {
        ArrayList arrayList;
        d7 d7Var = (d7) this.f275b;
        o8 o8Var = d7Var.d;
        if (o8Var != null && (arrayList = o8Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((o8) d7Var.d.T.get(i10)).V = f7;
        }
    }

    @Override
    public void U() {
        ((j0) this.f275b).f13308h1 = true;
    }

    @Override
    public void V(float f7) {
        d7 d7Var = (d7) this.f275b;
        o8 o8Var = d7Var.d;
        if (o8Var == null) {
            return;
        }
        o8Var.F = f7;
        o8Var.f5162j = true;
        d7Var.w(true);
    }

    @Override
    public void W(Editable editable) {
        ((g5) this.f275b).h();
    }

    @Override
    public void X(float f7, boolean z10) {
        mg.h hVar = (mg.h) this.f275b;
        float f10 = hVar.f14830b;
        float z11 = com.google.android.gms.internal.vision.e2.z(hVar.f14831c, f10, f7, f10);
        hVar.d = z11;
        if (z10) {
            p6 p6Var = hVar.e;
            p6Var.getClass();
            p6Var.c(null, z11);
        }
        hVar.invalidate();
    }

    @Override
    public void Y(k2.k kVar) {
        y yVar = ((j0) this.f275b).Y0;
        Handler handler = (Handler) yVar.f15004b;
        if (handler != null) {
            handler.post(new k2.h(yVar, kVar, 0));
        }
    }

    @Override
    public void Z(float f7) {
        d7 d7Var = (d7) this.f275b;
        o8 o8Var = d7Var.d;
        if (o8Var == null) {
            return;
        }
        o8Var.E = f7;
        o8Var.f5162j = true;
        d7Var.w(true);
    }

    @Override
    public void a0() {
        a1 a1Var = (a1) this.f275b;
        r3 r3Var = a1Var.S;
        if (r3Var != null) {
            ii.a aVar = a1Var.f11220a;
            w3 w3Var = r3Var.f11603a;
            h2 h2Var = w3Var.J3;
            if (h2Var != null) {
                h2Var.g();
            }
            w3Var.f11714h3.onContentChanged();
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f274a) {
            case 5:
                b7.b bVar = new b7.b(0, (TaskCompletionSource) obj2);
                o1 o1Var = (o1) ((n1) obj).u();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(o1Var.f15166b);
                int i10 = n7.k.f15147a;
                obtain.writeStrongBinder(bVar);
                obtain.writeInt(1);
                ((v) this.f275b).writeToParcel(obtain, 0);
                Parcel obtain2 = Parcel.obtain();
                try {
                    o1Var.f15165a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                    obtain.recycle();
                    obtain2.recycle();
                }
            default:
                h7.f fVar = new h7.f(1, (TaskCompletionSource) obj2);
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain3 = Parcel.obtain();
                obtain3.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i11 = q7.a.f41194a;
                obtain3.writeStrongBinder(fVar);
                q7.a.b(obtain3, (GetCredentialRequest) this.f275b);
                q7.a.b(obtain3, gVar);
                ((h7.b) ((h7.d) ((h7.e) obj).u())).G0(obtain3, 1);
                return;
        }
    }

    @Override
    public void b(int i10) {
        e0 e0Var = ((d7) this.f275b).E;
        if (e0Var != null) {
            ArrayList arrayList = e0Var.h;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                d0 d0Var = (d0) obj;
                if (d0Var.f4464a == i10) {
                    d0Var.f4465b.d(1.0f, true);
                    e0Var.invalidate();
                    return;
                }
            }
        }
    }

    @Override
    public boolean b0(boolean z10) {
        return false;
    }

    @Override
    public void c(ii.i1 i1Var) {
        switch (this.f274a) {
            case 20:
                r3 r3Var = ((a1) this.f275b).S;
                if (r3Var != null) {
                    w3 w3Var = r3Var.f11603a;
                    w3.N1(w3Var, i1Var);
                    w3Var.f11714h3.t(i1Var, true);
                    return;
                }
                return;
            default:
                e5 e5Var = ((g5) this.f275b).f11396s;
                if (e5Var != null) {
                    w3 w3Var2 = ((b3) e5Var).f11257a;
                    w3.N1(w3Var2, i1Var);
                    w3Var2.f11714h3.t(i1Var, true);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean c0() {
        return false;
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f275b;
        if (contentProviderClient != null) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                k4.h((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    @Override
    public int d(long j3) {
        if (j3 < 0) {
            return 0;
        }
        return -1;
    }

    @Override
    public void d0(float f7, int i10) {
        ArrayList arrayList;
        d7 d7Var = (d7) this.f275b;
        o8 o8Var = d7Var.d;
        if (o8Var != null && (arrayList = o8Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((o8) d7Var.d.T.get(i10)).W = f7;
        }
    }

    @Override
    public void e(long j3) {
        y yVar = ((j0) this.f275b).Y0;
        Handler handler = (Handler) yVar.f15004b;
        if (handler != null) {
            handler.post(new ai.j(yVar, j3, 12));
        }
    }

    @Override
    public void e0(float f7) {
        o8 o8Var = ((d7) this.f275b).d;
        if (o8Var == null) {
            return;
        }
        o8Var.f5143a0 = f7;
        o8Var.f5162j = true;
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public void f0() {
        ((d7) this.f275b).q(null);
    }

    @Override
    public long g(int i10) {
        boolean z10;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        return 0L;
    }

    @Override
    public CharSequence getContentDescription() {
        mg.h hVar = (mg.h) this.f275b;
        float f7 = hVar.f14830b;
        return String.valueOf(Math.round((hVar.f14829a.getProgress() * (hVar.f14831c - f7)) + f7));
    }

    @Override
    public void h(float f7) {
        d7 d7Var = (d7) this.f275b;
        o8 o8Var = d7Var.d;
        if (o8Var == null) {
            return;
        }
        o8Var.f5184u0 = f7;
        o8Var.f5162j = true;
        d7Var.c();
    }

    @Override
    public void h0() {
        i0 i0Var = ((j0) this.f275b).W;
        if (i0Var != null) {
            i0Var.a();
        }
    }

    @Override
    public void i() {
        a1 a1Var = (a1) this.f275b;
        r3 r3Var = a1Var.S;
        if (r3Var != null) {
            w3.Q1(r3Var.f11603a, a1Var.f11220a);
        }
    }

    @Override
    public void i0(float f7) {
        d7 d7Var = (d7) this.f275b;
        o8 o8Var = d7Var.d;
        if (o8Var == null) {
            return;
        }
        o8Var.f5182t0 = f7;
        o8Var.f5162j = true;
        d7Var.y(true);
    }

    @Override
    public void j0(int i10, long j3) {
        ArrayList arrayList;
        d7 d7Var = (d7) this.f275b;
        o8 o8Var = d7Var.d;
        if (o8Var != null && (arrayList = o8Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((o8) d7Var.d.T.get(i10)).X = j3;
        }
    }

    @Override
    public void k(Object obj) {
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        androidx.fragment.app.k0 k0Var = (androidx.fragment.app.k0) this.f275b;
        g0 g0Var = (g0) k0Var.F.pollLast();
        if (g0Var == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = g0Var.f2416a;
        int i10 = g0Var.f2417b;
        androidx.fragment.app.s l4 = k0Var.f2427c.l(str);
        if (l4 == null) {
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
            return;
        }
        l4.x(i10, aVar.f1921a, aVar.f1922b);
    }

    @Override
    public List l(long j3) {
        if (j3 >= 0) {
            return (List) this.f275b;
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public void l0(k2.k kVar) {
        y yVar = ((j0) this.f275b).Y0;
        Handler handler = (Handler) yVar.f15004b;
        if (handler != null) {
            handler.post(new k2.h(yVar, kVar, 1));
        }
    }

    @Override
    public void m(ii.i1 i1Var) {
        ii.a aVar;
        g5 g5Var = (g5) this.f275b;
        e5 e5Var = g5Var.f11396s;
        if (e5Var != null && (aVar = g5Var.f11220a) != null) {
            w3 w3Var = ((b3) e5Var).f11257a;
            ArrayList arrayList = w3Var.f11721l3;
            long j3 = aVar.f11219t;
            if (j3 != 0) {
                int i10 = -1;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (((ii.a) arrayList.get(i11)).f11210k.contains(Long.valueOf(j3))) {
                        i10 = i11;
                    }
                }
                if (i10 >= 0) {
                    h2 h2Var = w3Var.J3;
                    if (h2Var != null) {
                        h2Var.d();
                    }
                    ii.a aVar2 = new ii.a(new TL_iv.pageBlockParagraph(), 0, 0);
                    ArrayList arrayList2 = aVar.f11210k;
                    ArrayList arrayList3 = aVar2.f11210k;
                    arrayList3.addAll(arrayList2);
                    if (!arrayList3.isEmpty()) {
                        a.x(1, arrayList3);
                    }
                    arrayList.add(i10 + 1, aVar2);
                    w3Var.t4();
                    w3Var.Y2.N(false);
                    h2 h2Var2 = w3Var.J3;
                    if (h2Var2 != null) {
                        h2Var2.h();
                    }
                    w3Var.post(new o2(w3Var, aVar2, 26));
                }
            }
        }
    }

    @Override
    public int m0() {
        return 0;
    }

    @Override
    public void n(float f7) {
        d7 d7Var = (d7) this.f275b;
        o8 o8Var = d7Var.d;
        if (o8Var == null) {
            return;
        }
        o8Var.G = f7;
        o8Var.f5162j = true;
        d7Var.c();
    }

    @Override
    public void n0() {
        a1 a1Var = (a1) this.f275b;
        r3 r3Var = a1Var.S;
        if (r3Var != null) {
            ii.a aVar = a1Var.f11220a;
            w3.P1(r3Var.f11603a);
        }
    }

    @Override
    public void o(long j3, boolean z10) {
        d7 d7Var = (d7) this.f275b;
        if (!z10) {
            d7Var.m(j3);
            return;
        }
        h71 h71Var = d7Var.e;
        if (h71Var != null) {
            h71Var.L(j3, true);
        } else if (d7Var.j()) {
            d7Var.E.m(j3, true);
        } else {
            h71 h71Var2 = d7Var.f4536y;
            if (h71Var2 != null) {
                h71Var2.L(j3, false);
            }
        }
    }

    @Override
    public void o0(long j3) {
        d7 d7Var = (d7) this.f275b;
        o8 o8Var = d7Var.d;
        if (o8Var == null) {
            return;
        }
        o8Var.D = j3;
        o8Var.f5162j = true;
        d7Var.w(true);
    }

    @Override
    public void onAudioSessionIdChanged(int i10) {
        r2.j jVar;
        j0 j0Var = (j0) this.f275b;
        if (Build.VERSION.SDK_INT >= 35 && (jVar = j0Var.f13301a1) != null) {
            jVar.d(i10);
        }
        y yVar = j0Var.Y0;
        Handler handler = (Handler) yVar.f15004b;
        if (handler != null) {
            handler.post(new n8(yVar, i10, 11));
        }
    }

    @Override
    public void onComplete(Task task) {
        d6.c.h((d6.c) ((d6.j) this.f275b).f7550c, "joinApplication", task);
    }

    @Override
    public void onSkipSilenceEnabledChanged(boolean z10) {
        y yVar = ((j0) this.f275b).Y0;
        Handler handler = (Handler) yVar.f15004b;
        if (handler != null) {
            handler.post(new bi.f(7, yVar, z10));
        }
    }

    @Override
    public void p() {
        ((j0) this.f275b).f13310j1 = true;
    }

    @Override
    public void p0(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        androidx.biometric.p pVar = (androidx.biometric.p) this.f275b;
        if (charSequence != null) {
            if (pVar.R()) {
                pVar.W(charSequence);
            }
            pVar.f2068l0.d(null);
        }
    }

    @Override
    public Object p2() {
        Constructor constructor = (Constructor) this.f275b;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e) {
            m8 m8Var = ib.c.f11069a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (InstantiationException e7) {
            throw new RuntimeException("Failed to invoke constructor '" + ib.c.b(constructor) + "' with no args", e7);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException("Failed to invoke constructor '" + ib.c.b(constructor) + "' with no args", e10.getCause());
        }
    }

    @Override
    public boolean q(ii.i1 i1Var) {
        return false;
    }

    public c6.o q0() {
        c6.o oVar = (c6.o) this.f275b;
        if (oVar.f4027a != null) {
            if (!Double.isNaN(oVar.d) && oVar.d < 0.0d) {
                throw new IllegalArgumentException("startTime cannot be negative or NaN.");
            }
            if (!Double.isNaN(oVar.e)) {
                if (!Double.isNaN(oVar.f4030f) && oVar.f4030f >= 0.0d) {
                    return oVar;
                }
                throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
            }
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    @Override
    public void r() {
        i0 i0Var = ((j0) this.f275b).W;
        if (i0Var != null) {
            i0Var.f10751a.f10816g0 = true;
        }
    }

    public float r0(ic.c cVar, ic.c cVar2) {
        int i10 = (int) cVar.f4216b;
        int i11 = (int) cVar2.f4216b;
        float D0 = D0((int) cVar.f4215a, i10, (int) cVar2.f4215a, i11);
        float D02 = D0((int) cVar2.f4215a, i11, (int) cVar.f4215a, i10);
        if (Float.isNaN(D0)) {
            return D02 / 7.0f;
        }
        if (Float.isNaN(D02)) {
            return D0 / 7.0f;
        }
        return (D0 + D02) / 14.0f;
    }

    @Override
    public void s() {
        d7 d7Var = (d7) this.f275b;
        d7Var.s(null, null, true);
        oc ocVar = ((cc) d7Var).C0;
        cc ccVar = ocVar.X0;
        if (ccVar != null) {
            ccVar.s(null, null, true);
        }
        qb qbVar = ocVar.f5272v1;
        if (qbVar != null) {
            qbVar.q0();
        }
        ec ecVar = ocVar.f5213c1;
        if (ecVar != null) {
            ecVar.setHasRoundVideo(false);
        }
        o8 o8Var = ocVar.K1;
        if (o8Var != null) {
            File file = o8Var.f5172o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                ocVar.K1.f5172o0 = null;
            }
            if (ocVar.K1.f5174p0 != null) {
                try {
                    new File(ocVar.K1.f5174p0).delete();
                } catch (Exception unused2) {
                }
                ocVar.K1.f5174p0 = null;
            }
        }
    }

    public aa.a s0(of.b r42) {
        throw new UnsupportedOperationException("Method not decompiled: a4.m.s0(of.b):aa.a");
    }

    @Override
    public boolean t(ii.i1 i1Var) {
        return false;
    }

    public ic.a t0(float f7, float f10, int i10, int i11) {
        int i12;
        ic.a b10;
        ic.a b11;
        int i13 = (int) (f10 * f7);
        int max = Math.max(0, i10 - i13);
        dc.b bVar = (dc.b) this.f275b;
        int min = Math.min(bVar.f7618a - 1, i10 + i13) - max;
        float f11 = 3.0f * f7;
        if (min >= f11) {
            int max2 = Math.max(0, i11 - i13);
            int min2 = Math.min(bVar.f7619b - 1, i11 + i13) - max2;
            if (min2 >= f11) {
                dc.b bVar2 = (dc.b) this.f275b;
                ic.b bVar3 = new ic.b(bVar2, max, max2, min, min2, f7);
                int i14 = bVar3.e;
                int i15 = bVar3.f11073c;
                int i16 = i14 + i15;
                int i17 = bVar3.f11074f;
                int i18 = (i17 / 2) + bVar3.d;
                int[] iArr = new int[3];
                for (int i19 = 0; i19 < i17; i19++) {
                    if ((i19 & 1) == 0) {
                        i12 = (i19 + 1) / 2;
                    } else {
                        i12 = -((i19 + 1) / 2);
                    }
                    int i20 = i12 + i18;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    iArr[2] = 0;
                    int i21 = i15;
                    while (i21 < i16 && !bVar2.b(i21, i20)) {
                        i21++;
                    }
                    int i22 = 0;
                    while (i21 < i16) {
                        if (bVar2.b(i21, i20)) {
                            if (i22 == 1) {
                                iArr[1] = iArr[1] + 1;
                            } else if (i22 == 2) {
                                if (bVar3.a(iArr) && (b11 = bVar3.b(i20, i21, iArr)) != null) {
                                    return b11;
                                }
                                iArr[0] = iArr[2];
                                iArr[1] = 1;
                                iArr[2] = 0;
                                i22 = 1;
                            } else {
                                i22++;
                                iArr[i22] = iArr[i22] + 1;
                            }
                        } else {
                            if (i22 == 1) {
                                i22++;
                            }
                            iArr[i22] = iArr[i22] + 1;
                        }
                        i21++;
                    }
                    if (bVar3.a(iArr) && (b10 = bVar3.b(i20, i16, iArr)) != null) {
                        return b10;
                    }
                }
                ArrayList arrayList = bVar3.f11072b;
                if (!arrayList.isEmpty()) {
                    return (ic.a) arrayList.get(0);
                }
                throw cc.e.a();
            }
            throw cc.e.a();
        }
        throw cc.e.a();
    }

    @Override
    public void u(float f7) {
        d7 d7Var = (d7) this.f275b;
        o8 o8Var = d7Var.d;
        if (o8Var == null) {
            return;
        }
        o8Var.f5180s0 = f7;
        o8Var.f5162j = true;
        d7Var.y(true);
    }

    @Override
    public void v(d1 d1Var) {
        q qVar = (q) d1Var;
        o2.k kVar = (o2.k) this.f275b;
        kVar.G.v(kVar);
    }

    public boolean v0() {
        x0 x0Var = ((com.google.android.gms.common.api.internal.j0) this.f275b).d;
        if (x0Var != null && x0Var.b()) {
            return true;
        }
        return false;
    }

    @Override
    public void w(boolean z10) {
        d7 d7Var = (d7) this.f275b;
        if (d7Var.j()) {
            d7Var.E.getClass();
        }
        d7Var.x(-4, z10);
    }

    public void w0() {
        q[] qVarArr;
        q[] qVarArr2;
        o2.k kVar = (o2.k) this.f275b;
        int i10 = kVar.H - 1;
        kVar.H = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (q qVar : kVar.J) {
            qVar.e();
            i11 += qVar.Y.f43485a;
        }
        l1[] l1VarArr = new l1[i11];
        int i12 = 0;
        for (q qVar2 : kVar.J) {
            qVar2.e();
            int i13 = qVar2.Y.f43485a;
            int i14 = 0;
            while (i14 < i13) {
                qVar2.e();
                l1VarArr[i12] = qVar2.Y.a(i14);
                i14++;
                i12++;
            }
        }
        kVar.I = new u2.o1(l1VarArr);
        kVar.G.a(kVar);
    }

    @Override
    public void x0(fh fhVar) {
        NotificationCenter.getInstance(hg.m.a0((hg.m) this.f275b)).doOnIdle(fhVar);
    }

    @Override
    public void y(int i10, long j3, long j10) {
        y yVar = ((j0) this.f275b).Y0;
        Handler handler = (Handler) yVar.f15004b;
        if (handler != null) {
            handler.post(new k2.i(yVar, i10, j3, j10, 0));
        }
    }

    public void y0(String str, Bitmap bitmap) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 2) {
            throw new IllegalArgumentException(a.p("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.f275b).putParcelable(str, bitmap);
    }

    @Override
    public void z() {
        ((ci.j0) this.f275b).d.invalidate();
    }

    public void z0(long j3) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey("android.media.metadata.DURATION") && ((Integer) fVar.get("android.media.metadata.DURATION")).intValue() != 0) {
            throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
        }
        ((Bundle) this.f275b).putLong("android.media.metadata.DURATION", j3);
    }

    public m(a6.i iVar) {
        this.f274a = 6;
        this.f275b = (r) iVar.f303b;
    }

    public m(b7.a aVar, v vVar) {
        this.f274a = 5;
        this.f275b = vVar;
    }

    public m(Object obj, int i10) {
        this.f274a = i10;
        this.f275b = obj;
    }

    public m(MediaInfo mediaInfo) {
        this.f274a = 7;
        c6.o oVar = new c6.o(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.f275b = oVar;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public m(JSONObject jSONObject) {
        this.f274a = 7;
        this.f275b = new c6.o(jSONObject);
    }

    public m(ba.c cVar) {
        this.f274a = 12;
        this.f275b = new File(cVar.f3452b, "com.crashlytics.settings.json");
    }

    public m(Context context, Uri uri) {
        this.f274a = 28;
        this.f275b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public m(int i10) {
        this.f274a = i10;
        switch (i10) {
            case 15:
                this.f275b = new a6.m(23);
                return;
            default:
                this.f275b = new Bundle();
                return;
        }
    }

    public m(MediaMetadataCompat mediaMetadataCompat) {
        this.f274a = 1;
        Bundle bundle = new Bundle(mediaMetadataCompat.f1809a);
        this.f275b = bundle;
        b0.a(bundle);
    }

    @Override
    public void B() {
    }

    @Override
    public void K0() {
    }

    @Override
    public void k0() {
    }

    @Override
    public void u0() {
    }

    @Override
    public void x() {
    }

    @Override
    public void L(boolean z10) {
    }

    @Override
    public void M(CharSequence charSequence) {
    }

    @Override
    public void U0(Object obj) {
    }

    @Override
    public void g0(boolean z10) {
    }

    @Override
    public void j1(TLRPC.User user) {
    }

    @Override
    public void j(int i10, int i11) {
    }

    @Override
    public void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }

    @Override
    public void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
    }
}
