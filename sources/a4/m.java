package a4;

import ai.o8;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.b0;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.g0;
import androidx.lifecycle.a0;
import c7.v;
import ci.ac;
import ci.b7;
import ci.d0;
import ci.e0;
import ci.j6;
import ci.k8;
import ci.kc;
import ci.mb;
import ci.oc;
import ci.yb;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.internal.cast.b5;
import com.google.android.gms.internal.play_billing.r;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import ei.x4;
import fb.n;
import i2.j0;
import ii.a1;
import ii.c3;
import ii.f5;
import ii.h1;
import ii.h5;
import ii.i2;
import ii.k0;
import ii.p2;
import ii.s3;
import ii.x3;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k2.h0;
import lg.o;
import m.i1;
import m.x0;
import n4.y;
import n7.m1;
import n7.n1;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.hh;
import org.telegram.ui.Components.u71;
import org.telegram.ui.Components.ui;
import qg.b2;
import v7.a7;
import v7.n8;
import x2.p;
public class m implements z3.d, a0, androidx.activity.result.b, s, o, oc, OnCompleteListener, n, i1, ui, k0, h1, k2.n, y2.m, x0, n5.b {
    public final int f274a;
    public Object f275b;

    public m(a6.i iVar) {
        this.f274a = 6;
        this.f275b = (r) iVar.f303b;
    }

    @Override
    public void A(float f7, int i10) {
        ArrayList arrayList;
        b7 b7Var = (b7) this.f275b;
        k8 k8Var = b7Var.d;
        if (k8Var != null && (arrayList = k8Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((k8) b7Var.d.T.get(i10)).P = f7;
        }
    }

    public int A0() {
        return ((w0() & Byte.MAX_VALUE) << 21) | ((w0() & Byte.MAX_VALUE) << 14) | ((w0() & Byte.MAX_VALUE) << 7) | (w0() & Byte.MAX_VALUE);
    }

    @Override
    public void B(ii.i1 i1Var, int i10, int i11) {
        f5 f5Var;
        q9 textSelectionHelper;
        h5 h5Var = (h5) this.f275b;
        if (!h5Var.f11410w && i10 != i11 && (f5Var = h5Var.f11409s) != null && (textSelectionHelper = ((c3) f5Var).f11272a.getTextSelectionHelper()) != null) {
            i1Var.post(new x4(this, i1Var, i11, textSelectionHelper, i10, 3));
        }
    }

    public float B0(int i10, int i11, int i12, int i13) {
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
                    return a7.b(i25, i26, i14, i15);
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
            return a7.b(i24, i17, i14, i15);
        }
        return Float.NaN;
    }

    @Override
    public q9 C() {
        s3 s3Var = ((a1) this.f275b).S;
        if (s3Var == null) {
            return null;
        }
        return s3Var.f11616a.getTextSelectionHelper();
    }

    public float C0(int i10, int i11, int i12, int i13) {
        float f7;
        float f10;
        dc.b bVar = (dc.b) this.f275b;
        float B0 = B0(i10, i11, i12, i13);
        int i14 = i10 - (i12 - i10);
        int i15 = 0;
        if (i14 < 0) {
            f7 = i10 / (i10 - i14);
            i14 = 0;
        } else {
            int i16 = bVar.f7602a;
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
            int i19 = bVar.f7603b;
            if (i18 >= i19) {
                f10 = ((i19 - 1) - i11) / (i18 - i11);
                i15 = i19 - 1;
            } else {
                i15 = i18;
                f10 = 1.0f;
            }
        }
        return (B0(i10, i11, (int) (((i14 - i10) * f10) + i10), i15) + B0) - 1.0f;
    }

    @Override
    public void D(float f7) {
        b7 b7Var = (b7) this.f275b;
        k8 k8Var = b7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.P = f7;
        b7Var.c();
    }

    public void D0(long j3) {
        long j10 = 0;
        while (j10 < j3) {
            long skip = ((com.google.firebase.messaging.d) this.f275b).skip(j3 - j10);
            if (skip > 0) {
                j10 += skip;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override
    public void E(CharSequence charSequence) {
        s3 s3Var = ((a1) this.f275b).S;
        if (s3Var != null) {
            s3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                s3Var.f11616a.u4(charSequence.toString());
            }
        }
    }

    @Override
    public void F(float f7, boolean z10) {
        b7 b7Var = (b7) this.f275b;
        k8 k8Var = b7Var.d;
        if (k8Var != null) {
            k8Var.Z = f7;
            k8Var.f4940j = true;
            u71 u71Var = b7Var.e;
            if (u71Var != null && u71Var.p() != -9223372036854775807L) {
                b7Var.m(f7 * ((float) b7Var.e.p()));
            }
        }
    }

    @Override
    public void G() {
        p pVar;
        h0 h0Var = (h0) this.f275b;
        synchronized (h0Var.f10641a) {
            pVar = h0Var.H;
        }
        if (pVar != null) {
            pVar.h();
        }
    }

    @Override
    public p9 I() {
        return (a1) this.f275b;
    }

    @Override
    public void J(long j3) {
        b7 b7Var = (b7) this.f275b;
        k8 k8Var = b7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.f4956r0 = j3;
        k8Var.f4940j = true;
        b7Var.y(true);
    }

    @Override
    public ii.a M() {
        return ((a1) this.f275b).f11210a;
    }

    @Override
    public boolean N() {
        a1 a1Var = (a1) this.f275b;
        s3 s3Var = a1Var.S;
        if (s3Var != null) {
            ii.a aVar = a1Var.f11210a;
            if (s3Var.f11616a.T4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void O(boolean z10) {
        b2 b2Var;
        kc kcVar = ((yb) ((b7) this.f275b)).C0;
        mb mbVar = kcVar.f5050v1;
        if (mbVar != null) {
            b2 b2Var2 = null;
            if (!z10 && (mbVar.getSelectedEntity() instanceof b2)) {
                kcVar.f5050v1.D0(null, true);
            } else if (z10 && !(kcVar.f5050v1.getSelectedEntity() instanceof b2)) {
                j6 j6Var = kcVar.f5050v1.R0;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 < j6Var.getChildCount()) {
                        View childAt = j6Var.getChildAt(i11);
                        if (childAt instanceof b2) {
                            b2Var = (b2) childAt;
                            break;
                        }
                        i11++;
                    } else {
                        b2Var = null;
                        break;
                    }
                }
                if (b2Var != null) {
                    mb mbVar2 = kcVar.f5050v1;
                    j6 j6Var2 = mbVar2.R0;
                    while (true) {
                        if (i10 >= j6Var2.getChildCount()) {
                            break;
                        }
                        View childAt2 = j6Var2.getChildAt(i10);
                        if (childAt2 instanceof b2) {
                            b2Var2 = (b2) childAt2;
                            break;
                        }
                        i10++;
                    }
                    mbVar2.D0(b2Var2, true);
                }
            }
        }
    }

    @Override
    public void P(Exception exc) {
        e2.a.f("MediaCodecAudioRenderer", "Audio sink error", exc);
        y yVar = ((h0) this.f275b).Y0;
        Handler handler = (Handler) yVar.f15257b;
        if (handler != null) {
            handler.post(new k2.f(yVar, exc, 1));
        }
    }

    @Override
    public void Q(int i10, int i11) {
        a1 a1Var = (a1) this.f275b;
        s3 s3Var = a1Var.S;
        if (s3Var != null) {
            ii.a aVar = a1Var.f11210a;
            i2 i2Var = s3Var.f11616a.J3;
            if (i2Var != null) {
                i2Var.f(i10, i11);
            }
        }
    }

    @Override
    public void R(float f7, int i10) {
        ArrayList arrayList;
        b7 b7Var = (b7) this.f275b;
        k8 k8Var = b7Var.d;
        if (k8Var != null && (arrayList = k8Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((k8) b7Var.d.T.get(i10)).V = f7;
        }
    }

    @Override
    public void S() {
        ((h0) this.f275b).f13292h1 = true;
    }

    @Override
    public boolean S1() {
        return false;
    }

    @Override
    public void T(float f7) {
        b7 b7Var = (b7) this.f275b;
        k8 k8Var = b7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.F = f7;
        k8Var.f4940j = true;
        b7Var.w(true);
    }

    @Override
    public void U(Editable editable) {
        ((h5) this.f275b).h();
    }

    @Override
    public void V(k2.k kVar) {
        y yVar = ((h0) this.f275b).Y0;
        Handler handler = (Handler) yVar.f15257b;
        if (handler != null) {
            handler.post(new k2.h(yVar, kVar, 0));
        }
    }

    @Override
    public void W() {
        a1 a1Var = (a1) this.f275b;
        s3 s3Var = a1Var.S;
        if (s3Var != null) {
            ii.a aVar = a1Var.f11210a;
            x3 x3Var = s3Var.f11616a;
            i2 i2Var = x3Var.J3;
            if (i2Var != null) {
                i2Var.g();
            }
            x3Var.f11731h3.onContentChanged();
        }
    }

    @Override
    public boolean X(boolean z10) {
        return false;
    }

    @Override
    public void Y(float f7) {
        b7 b7Var = (b7) this.f275b;
        k8 k8Var = b7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.E = f7;
        k8Var.f4940j = true;
        b7Var.w(true);
    }

    @Override
    public void Z(float f7, int i10) {
        ArrayList arrayList;
        b7 b7Var = (b7) this.f275b;
        k8 k8Var = b7Var.d;
        if (k8Var != null && (arrayList = k8Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((k8) b7Var.d.T.get(i10)).W = f7;
        }
    }

    @Override
    public void a() {
        l2.g gVar = (l2.g) this.f275b;
        gVar.A.a();
        b5 b5Var = gVar.C;
        if (b5Var == null) {
            return;
        }
        throw b5Var;
    }

    @Override
    public void a0(float f7) {
        k8 k8Var = ((b7) this.f275b).d;
        if (k8Var == null) {
            return;
        }
        k8Var.f4921a0 = f7;
        k8Var.f4940j = true;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f274a) {
            case 5:
                b7.b bVar = new b7.b(0, (TaskCompletionSource) obj2);
                n1 n1Var = (n1) ((m1) obj).u();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(n1Var.f15414b);
                int i10 = n7.j.f15395a;
                obtain.writeStrongBinder(bVar);
                obtain.writeInt(1);
                ((v) this.f275b).writeToParcel(obtain, 0);
                Parcel obtain2 = Parcel.obtain();
                try {
                    n1Var.f15413a.transact(1, obtain, obtain2, 0);
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
                int i11 = q7.a.f41486a;
                obtain3.writeStrongBinder(fVar);
                q7.a.b(obtain3, (GetCredentialRequest) this.f275b);
                q7.a.b(obtain3, gVar);
                ((h7.b) ((h7.d) ((h7.e) obj).u())).G0(obtain3, 1);
                return;
        }
    }

    @Override
    public void b(long j3) {
        y yVar = ((h0) this.f275b).Y0;
        Handler handler = (Handler) yVar.f15257b;
        if (handler != null) {
            handler.post(new ai.j(yVar, j3, 12));
        }
    }

    @Override
    public void b0() {
        ((b7) this.f275b).q(null);
    }

    @Override
    public void c(ii.i1 i1Var) {
        switch (this.f274a) {
            case 20:
                s3 s3Var = ((a1) this.f275b).S;
                if (s3Var != null) {
                    x3 x3Var = s3Var.f11616a;
                    x3.N1(x3Var, i1Var);
                    x3Var.f11731h3.t(i1Var, true);
                    return;
                }
                return;
            default:
                f5 f5Var = ((h5) this.f275b).f11409s;
                if (f5Var != null) {
                    x3 x3Var2 = ((c3) f5Var).f11272a;
                    x3.N1(x3Var2, i1Var);
                    x3Var2.f11731h3.t(i1Var, true);
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
    public int d(long j3) {
        if (j3 < 0) {
            return 0;
        }
        return -1;
    }

    @Override
    public void e(int i10) {
        e0 e0Var = ((b7) this.f275b).E;
        if (e0Var != null) {
            ArrayList arrayList = e0Var.h;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                d0 d0Var = (d0) obj;
                if (d0Var.f4505a == i10) {
                    d0Var.f4506b.d(1.0f, true);
                    e0Var.invalidate();
                    return;
                }
            }
        }
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public void f0() {
        j0 j0Var = ((h0) this.f275b).W;
        if (j0Var != null) {
            j0Var.a();
        }
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
    public Object mo28get() {
        return new la.h((Context) ((a9.r) this.f275b).f353a, new rb.a(23), new qb.b(23), 5);
    }

    @Override
    public void h() {
        a1 a1Var = (a1) this.f275b;
        s3 s3Var = a1Var.S;
        if (s3Var != null) {
            x3.Q1(s3Var.f11616a, a1Var.f11210a);
        }
    }

    @Override
    public void h0(float f7) {
        b7 b7Var = (b7) this.f275b;
        k8 k8Var = b7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.f4960t0 = f7;
        k8Var.f4940j = true;
        b7Var.y(true);
    }

    @Override
    public void i(float f7) {
        b7 b7Var = (b7) this.f275b;
        k8 k8Var = b7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.f4962u0 = f7;
        k8Var.f4940j = true;
        b7Var.c();
    }

    @Override
    public void i0(int i10, long j3) {
        ArrayList arrayList;
        b7 b7Var = (b7) this.f275b;
        k8 k8Var = b7Var.d;
        if (k8Var != null && (arrayList = k8Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((k8) b7Var.d.T.get(i10)).X = j3;
        }
    }

    @Override
    public void j0(k2.k kVar) {
        y yVar = ((h0) this.f275b).Y0;
        Handler handler = (Handler) yVar.f15257b;
        if (handler != null) {
            handler.post(new k2.h(yVar, kVar, 1));
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
        String str = g0Var.f2410a;
        int i10 = g0Var.f2411b;
        androidx.fragment.app.s l4 = k0Var.f2421c.l(str);
        if (l4 == null) {
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
            return;
        }
        l4.x(i10, aVar.f1915a, aVar.f1916b);
    }

    @Override
    public void k0() {
        a1 a1Var = (a1) this.f275b;
        s3 s3Var = a1Var.S;
        if (s3Var != null) {
            ii.a aVar = a1Var.f11210a;
            x3.P1(s3Var.f11616a);
        }
    }

    @Override
    public void l(float f7) {
        b7 b7Var = (b7) this.f275b;
        k8 k8Var = b7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.G = f7;
        k8Var.f4940j = true;
        b7Var.c();
    }

    @Override
    public void l0(long j3) {
        b7 b7Var = (b7) this.f275b;
        k8 k8Var = b7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.D = j3;
        k8Var.f4940j = true;
        b7Var.w(true);
    }

    @Override
    public void m(ii.i1 i1Var) {
        ii.a aVar;
        h5 h5Var = (h5) this.f275b;
        f5 f5Var = h5Var.f11409s;
        if (f5Var != null && (aVar = h5Var.f11210a) != null) {
            x3 x3Var = ((c3) f5Var).f11272a;
            ArrayList arrayList = x3Var.f11738l3;
            long j3 = aVar.f11209t;
            if (j3 != 0) {
                int i10 = -1;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (((ii.a) arrayList.get(i11)).f11200k.contains(Long.valueOf(j3))) {
                        i10 = i11;
                    }
                }
                if (i10 >= 0) {
                    i2 i2Var = x3Var.J3;
                    if (i2Var != null) {
                        i2Var.d();
                    }
                    ii.a aVar2 = new ii.a(new TL_iv.pageBlockParagraph(), 0, 0);
                    ArrayList arrayList2 = aVar.f11200k;
                    ArrayList arrayList3 = aVar2.f11200k;
                    arrayList3.addAll(arrayList2);
                    if (!arrayList3.isEmpty()) {
                        a.x(1, arrayList3);
                    }
                    arrayList.add(i10 + 1, aVar2);
                    x3Var.t4();
                    x3Var.Y2.N(false);
                    i2 i2Var2 = x3Var.J3;
                    if (i2Var2 != null) {
                        i2Var2.h();
                    }
                    x3Var.post(new p2(x3Var, aVar2, 26));
                }
            }
        }
    }

    @Override
    public void m0(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        androidx.biometric.p pVar = (androidx.biometric.p) this.f275b;
        if (charSequence != null) {
            if (pVar.R()) {
                pVar.W(charSequence);
            }
            pVar.f2062l0.d(null);
        }
    }

    @Override
    public void n(long j3, boolean z10) {
        b7 b7Var = (b7) this.f275b;
        if (!z10) {
            b7Var.m(j3);
            return;
        }
        u71 u71Var = b7Var.e;
        if (u71Var != null) {
            u71Var.L(j3, true);
        } else if (b7Var.j()) {
            b7Var.E.m(j3, true);
        } else {
            u71 u71Var2 = b7Var.f4413y;
            if (u71Var2 != null) {
                u71Var2.L(j3, false);
            }
        }
    }

    public c6.o n0() {
        c6.o oVar = (c6.o) this.f275b;
        if (oVar.f4021a != null) {
            if (!Double.isNaN(oVar.d) && oVar.d < 0.0d) {
                throw new IllegalArgumentException("startTime cannot be negative or NaN.");
            }
            if (!Double.isNaN(oVar.e)) {
                if (!Double.isNaN(oVar.f4024f) && oVar.f4024f >= 0.0d) {
                    return oVar;
                }
                throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
            }
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    @Override
    public void o() {
        ((h0) this.f275b).f13294j1 = true;
    }

    public float o0(ic.c cVar, ic.c cVar2) {
        int i10 = (int) cVar.f4210b;
        int i11 = (int) cVar2.f4210b;
        float C0 = C0((int) cVar.f4209a, i10, (int) cVar2.f4209a, i11);
        float C02 = C0((int) cVar2.f4209a, i11, (int) cVar.f4209a, i10);
        if (Float.isNaN(C0)) {
            return C02 / 7.0f;
        }
        if (Float.isNaN(C02)) {
            return C0 / 7.0f;
        }
        return (C0 + C02) / 14.0f;
    }

    @Override
    public void onAudioSessionIdChanged(int i10) {
        r2.j jVar;
        h0 h0Var = (h0) this.f275b;
        if (Build.VERSION.SDK_INT >= 35 && (jVar = h0Var.f13285a1) != null) {
            jVar.d(i10);
        }
        y yVar = h0Var.Y0;
        Handler handler = (Handler) yVar.f15257b;
        if (handler != null) {
            handler.post(new o8(yVar, i10, 11));
        }
    }

    @Override
    public void onComplete(Task task) {
        d6.c.h((d6.c) ((d6.j) this.f275b).f7534c, "joinApplication", task);
    }

    @Override
    public void onSkipSilenceEnabledChanged(boolean z10) {
        y yVar = ((h0) this.f275b).Y0;
        Handler handler = (Handler) yVar.f15257b;
        if (handler != null) {
            handler.post(new bi.f(7, yVar, z10));
        }
    }

    @Override
    public boolean p(ii.i1 i1Var) {
        return false;
    }

    public aa.a p0(of.b r42) {
        throw new UnsupportedOperationException("Method not decompiled: a4.m.p0(of.b):aa.a");
    }

    @Override
    public Object p2() {
        Constructor constructor = (Constructor) this.f275b;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e) {
            n8 n8Var = ib.c.f11059a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (InstantiationException e7) {
            throw new RuntimeException("Failed to invoke constructor '" + ib.c.b(constructor) + "' with no args", e7);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException("Failed to invoke constructor '" + ib.c.b(constructor) + "' with no args", e10.getCause());
        }
    }

    @Override
    public void q() {
        j0 j0Var = ((h0) this.f275b).W;
        if (j0Var != null) {
            j0Var.f10747a.f10829g0 = true;
        }
    }

    public ic.a q0(float f7, float f10, int i10, int i11) {
        int i12;
        ic.a b10;
        ic.a b11;
        int i13 = (int) (f10 * f7);
        int max = Math.max(0, i10 - i13);
        dc.b bVar = (dc.b) this.f275b;
        int min = Math.min(bVar.f7602a - 1, i10 + i13) - max;
        float f11 = 3.0f * f7;
        if (min >= f11) {
            int max2 = Math.max(0, i11 - i13);
            int min2 = Math.min(bVar.f7603b - 1, i11 + i13) - max2;
            if (min2 >= f11) {
                dc.b bVar2 = (dc.b) this.f275b;
                ic.b bVar3 = new ic.b(bVar2, max, max2, min, min2, f7);
                int i14 = bVar3.e;
                int i15 = bVar3.f11063c;
                int i16 = i14 + i15;
                int i17 = bVar3.f11064f;
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
                ArrayList arrayList = bVar3.f11062b;
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
    public void r() {
        b7 b7Var = (b7) this.f275b;
        b7Var.s(null, null, true);
        kc kcVar = ((yb) b7Var).C0;
        yb ybVar = kcVar.X0;
        if (ybVar != null) {
            ybVar.s(null, null, true);
        }
        mb mbVar = kcVar.f5050v1;
        if (mbVar != null) {
            mbVar.q0();
        }
        ac acVar = kcVar.f4991c1;
        if (acVar != null) {
            acVar.setHasRoundVideo(false);
        }
        k8 k8Var = kcVar.K1;
        if (k8Var != null) {
            File file = k8Var.f4950o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                kcVar.K1.f4950o0 = null;
            }
            if (kcVar.K1.f4952p0 != null) {
                try {
                    new File(kcVar.K1.f4952p0).delete();
                } catch (Exception unused2) {
                }
                kcVar.K1.f4952p0 = null;
            }
        }
    }

    public boolean r0() {
        com.google.android.gms.common.api.internal.x0 x0Var = ((com.google.android.gms.common.api.internal.j0) this.f275b).d;
        if (x0Var != null && x0Var.b()) {
            return true;
        }
        return false;
    }

    @Override
    public List s(long j3) {
        if (j3 >= 0) {
            return (List) this.f275b;
        }
        return Collections.EMPTY_LIST;
    }

    public void s0(String str, Bitmap bitmap) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 2) {
            throw new IllegalArgumentException(a.p("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.f275b).putParcelable(str, bitmap);
    }

    @Override
    public boolean t(ii.i1 i1Var) {
        return false;
    }

    public void t0(long j3) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey("android.media.metadata.DURATION") && ((Integer) fVar.get("android.media.metadata.DURATION")).intValue() != 0) {
            throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
        }
        ((Bundle) this.f275b).putLong("android.media.metadata.DURATION", j3);
    }

    @Override
    public void u(float f7) {
        b7 b7Var = (b7) this.f275b;
        k8 k8Var = b7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.f4958s0 = f7;
        k8Var.f4940j = true;
        b7Var.y(true);
    }

    @Override
    public int v() {
        return 1;
    }

    public void v0(String str, String str2) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 1) {
            throw new IllegalArgumentException(a.p("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.f275b).putCharSequence(str, str2);
    }

    @Override
    public void w(boolean z10) {
        b7 b7Var = (b7) this.f275b;
        if (b7Var.j()) {
            b7Var.E.getClass();
        }
        b7Var.x(-4, z10);
    }

    public byte w0() {
        int read = ((com.google.firebase.messaging.d) this.f275b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override
    public void x0(hh hhVar) {
        NotificationCenter.getInstance(hg.m.a0((hg.m) this.f275b)).doOnIdle(hhVar);
    }

    @Override
    public void y(int i10, long j3, long j10) {
        y yVar = ((h0) this.f275b).Y0;
        Handler handler = (Handler) yVar.f15257b;
        if (handler != null) {
            handler.post(new k2.i(yVar, i10, j3, j10, 0));
        }
    }

    public JSONObject y0() {
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
    public void z() {
        ((ci.j0) this.f275b).d.invalidate();
    }

    public int z0() {
        return ((w0() & 255) << 24) | ((w0() & 255) << 16) | ((w0() & 255) << 8) | (w0() & 255);
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
        this.f275b = new File(cVar.f3446b, "com.crashlytics.settings.json");
    }

    public m(int i10) {
        this.f274a = i10;
        switch (i10) {
            case 15:
                this.f275b = new a6.m(23);
                return;
            case 18:
                return;
            default:
                this.f275b = new Bundle();
                return;
        }
    }

    public m(MediaMetadataCompat mediaMetadataCompat) {
        this.f274a = 1;
        Bundle bundle = new Bundle(mediaMetadataCompat.f1803a);
        this.f275b = bundle;
        b0.a(bundle);
    }

    @Override
    public void K0() {
    }

    @Override
    public void g0() {
    }

    @Override
    public void u0() {
    }

    @Override
    public void x() {
    }

    @Override
    public void H(int i10) {
    }

    @Override
    public void K(boolean z10) {
    }

    @Override
    public void L(CharSequence charSequence) {
    }

    @Override
    public void U0(Object obj) {
    }

    @Override
    public void d0(int i10) {
    }

    @Override
    public void e0(boolean z10) {
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
