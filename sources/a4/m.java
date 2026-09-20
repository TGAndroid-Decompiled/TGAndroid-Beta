package a4;

import ai.n8;
import android.content.Context;
import android.content.SharedPreferences;
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
import androidx.biometric.p;
import androidx.fragment.app.g0;
import androidx.lifecycle.a0;
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
import com.google.android.gms.common.api.internal.j0;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.internal.cast.b5;
import com.google.android.gms.internal.play_billing.r;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import ei.x4;
import fb.n;
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
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k2.i0;
import lg.o;
import m.i1;
import m.x0;
import n4.y;
import n7.l1;
import n7.m1;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.ti;
import qg.c2;
import v7.a7;
import x2.q;
public class m implements z3.d, a0, androidx.activity.result.b, s, o, sc, OnCompleteListener, n, i1, ti, k0, h1, k2.n, y2.n, x0, n5.b {
    public final int f274a;
    public Object f275b;

    public m(a6.i iVar) {
        this.f274a = 6;
        this.f275b = (r) iVar.f303b;
    }

    @Override
    public void A(float f7, int i10) {
        ArrayList arrayList;
        d7 d7Var = (d7) this.f275b;
        o8 o8Var = d7Var.d;
        if (o8Var != null && (arrayList = o8Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((o8) d7Var.d.T.get(i10)).P = f7;
        }
    }

    public int A0() {
        return ((x0() & 255) << 24) | ((x0() & 255) << 16) | ((x0() & 255) << 8) | (x0() & 255);
    }

    @Override
    public r9 B() {
        r3 r3Var = ((a1) this.f275b).S;
        if (r3Var == null) {
            return null;
        }
        return r3Var.f11604a.getTextSelectionHelper();
    }

    public int B0() {
        return ((x0() & Byte.MAX_VALUE) << 21) | ((x0() & Byte.MAX_VALUE) << 14) | ((x0() & Byte.MAX_VALUE) << 7) | (x0() & Byte.MAX_VALUE);
    }

    @Override
    public void C(float f7) {
        d7 d7Var = (d7) this.f275b;
        o8 o8Var = d7Var.d;
        if (o8Var == null) {
            return;
        }
        o8Var.P = f7;
        d7Var.c();
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
    public void D(ii.i1 i1Var, int i10, int i11) {
        e5 e5Var;
        r9 textSelectionHelper;
        g5 g5Var = (g5) this.f275b;
        if (!g5Var.f11398w && i10 != i11 && (e5Var = g5Var.f11397s) != null && (textSelectionHelper = ((b3) e5Var).f11258a.getTextSelectionHelper()) != null) {
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
    public void E(CharSequence charSequence) {
        r3 r3Var = ((a1) this.f275b).S;
        if (r3Var != null) {
            r3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                r3Var.f11604a.u4(charSequence.toString());
            }
        }
    }

    public void E0(long j3) {
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
    public void F(float f7, boolean z10) {
        d7 d7Var = (d7) this.f275b;
        o8 o8Var = d7Var.d;
        if (o8Var != null) {
            o8Var.Z = f7;
            o8Var.f5163j = true;
            t71 t71Var = d7Var.e;
            if (t71Var != null && t71Var.p() != -9223372036854775807L) {
                d7Var.m(f7 * ((float) d7Var.e.p()));
            }
        }
    }

    @Override
    public void G() {
        q qVar;
        i0 i0Var = (i0) this.f275b;
        synchronized (i0Var.f10685a) {
            qVar = i0Var.H;
        }
        if (qVar != null) {
            qVar.h();
        }
    }

    @Override
    public q9 I() {
        return (a1) this.f275b;
    }

    @Override
    public void J(long j3) {
        d7 d7Var = (d7) this.f275b;
        o8 o8Var = d7Var.d;
        if (o8Var == null) {
            return;
        }
        o8Var.f5179r0 = j3;
        o8Var.f5163j = true;
        d7Var.y(true);
    }

    @Override
    public ii.a M() {
        return ((a1) this.f275b).f11221a;
    }

    @Override
    public boolean N() {
        a1 a1Var = (a1) this.f275b;
        r3 r3Var = a1Var.S;
        if (r3Var != null) {
            ii.a aVar = a1Var.f11221a;
            if (r3Var.f11604a.T4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void O(boolean z10) {
        c2 c2Var;
        oc ocVar = ((cc) ((d7) this.f275b)).C0;
        qb qbVar = ocVar.f5273v1;
        if (qbVar != null) {
            c2 c2Var2 = null;
            if (!z10 && (qbVar.getSelectedEntity() instanceof c2)) {
                ocVar.f5273v1.D0(null, true);
            } else if (z10 && !(ocVar.f5273v1.getSelectedEntity() instanceof c2)) {
                k6 k6Var = ocVar.f5273v1.R0;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 < k6Var.getChildCount()) {
                        View childAt = k6Var.getChildAt(i11);
                        if (childAt instanceof c2) {
                            c2Var = (c2) childAt;
                            break;
                        }
                        i11++;
                    } else {
                        c2Var = null;
                        break;
                    }
                }
                if (c2Var != null) {
                    qb qbVar2 = ocVar.f5273v1;
                    k6 k6Var2 = qbVar2.R0;
                    while (true) {
                        if (i10 >= k6Var2.getChildCount()) {
                            break;
                        }
                        View childAt2 = k6Var2.getChildAt(i10);
                        if (childAt2 instanceof c2) {
                            c2Var2 = (c2) childAt2;
                            break;
                        }
                        i10++;
                    }
                    qbVar2.D0(c2Var2, true);
                }
            }
        }
    }

    @Override
    public void P(Exception exc) {
        e2.a.f("MediaCodecAudioRenderer", "Audio sink error", exc);
        y yVar = ((i0) this.f275b).Y0;
        Handler handler = (Handler) yVar.f15217a;
        if (handler != null) {
            handler.post(new k2.f(yVar, exc, 1));
        }
    }

    @Override
    public void Q(int i10, int i11) {
        a1 a1Var = (a1) this.f275b;
        r3 r3Var = a1Var.S;
        if (r3Var != null) {
            ii.a aVar = a1Var.f11221a;
            h2 h2Var = r3Var.f11604a.J3;
            if (h2Var != null) {
                h2Var.f(i10, i11);
            }
        }
    }

    @Override
    public void R(float f7, int i10) {
        ArrayList arrayList;
        d7 d7Var = (d7) this.f275b;
        o8 o8Var = d7Var.d;
        if (o8Var != null && (arrayList = o8Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((o8) d7Var.d.T.get(i10)).V = f7;
        }
    }

    @Override
    public void S() {
        ((i0) this.f275b).f13307h1 = true;
    }

    @Override
    public boolean S1() {
        return false;
    }

    @Override
    public void T(float f7) {
        d7 d7Var = (d7) this.f275b;
        o8 o8Var = d7Var.d;
        if (o8Var == null) {
            return;
        }
        o8Var.F = f7;
        o8Var.f5163j = true;
        d7Var.w(true);
    }

    @Override
    public void U(Editable editable) {
        ((g5) this.f275b).h();
    }

    @Override
    public void V(k2.k kVar) {
        y yVar = ((i0) this.f275b).Y0;
        Handler handler = (Handler) yVar.f15217a;
        if (handler != null) {
            handler.post(new k2.h(yVar, kVar, 0));
        }
    }

    @Override
    public void W() {
        a1 a1Var = (a1) this.f275b;
        r3 r3Var = a1Var.S;
        if (r3Var != null) {
            ii.a aVar = a1Var.f11221a;
            w3 w3Var = r3Var.f11604a;
            h2 h2Var = w3Var.J3;
            if (h2Var != null) {
                h2Var.g();
            }
            w3Var.f11715h3.onContentChanged();
        }
    }

    @Override
    public void X(float f7) {
        d7 d7Var = (d7) this.f275b;
        o8 o8Var = d7Var.d;
        if (o8Var == null) {
            return;
        }
        o8Var.E = f7;
        o8Var.f5163j = true;
        d7Var.w(true);
    }

    @Override
    public boolean Y(boolean z10) {
        return false;
    }

    @Override
    public void Z(float f7, int i10) {
        ArrayList arrayList;
        d7 d7Var = (d7) this.f275b;
        o8 o8Var = d7Var.d;
        if (o8Var != null && (arrayList = o8Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((o8) d7Var.d.T.get(i10)).W = f7;
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
        o8 o8Var = ((d7) this.f275b).d;
        if (o8Var == null) {
            return;
        }
        o8Var.f5144a0 = f7;
        o8Var.f5163j = true;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f274a) {
            case 5:
                b7.b bVar = new b7.b(0, (TaskCompletionSource) obj2);
                m1 m1Var = (m1) ((l1) obj).u();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(m1Var.f15369b);
                int i10 = n7.j.f15355a;
                obtain.writeStrongBinder(bVar);
                obtain.writeInt(1);
                ((v) this.f275b).writeToParcel(obtain, 0);
                Parcel obtain2 = Parcel.obtain();
                try {
                    m1Var.f15368a.transact(1, obtain, obtain2, 0);
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
                int i11 = q7.a.f41469a;
                obtain3.writeStrongBinder(fVar);
                q7.a.b(obtain3, (GetCredentialRequest) this.f275b);
                q7.a.b(obtain3, gVar);
                ((h7.b) ((h7.d) ((h7.e) obj).u())).G0(obtain3, 1);
                return;
        }
    }

    @Override
    public void b(long j3) {
        y yVar = ((i0) this.f275b).Y0;
        Handler handler = (Handler) yVar.f15217a;
        if (handler != null) {
            handler.post(new ai.j(yVar, j3, 12));
        }
    }

    @Override
    public void b0() {
        ((d7) this.f275b).q(null);
    }

    @Override
    public void c(ii.i1 i1Var) {
        switch (this.f274a) {
            case 21:
                r3 r3Var = ((a1) this.f275b).S;
                if (r3Var != null) {
                    w3 w3Var = r3Var.f11604a;
                    w3.N1(w3Var, i1Var);
                    w3Var.f11715h3.x(i1Var, true);
                    return;
                }
                return;
            default:
                e5 e5Var = ((g5) this.f275b).f11397s;
                if (e5Var != null) {
                    w3 w3Var2 = ((b3) e5Var).f11258a;
                    w3.N1(w3Var2, i1Var);
                    w3Var2.f11715h3.x(i1Var, true);
                    return;
                }
                return;
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
    public void e(int i10) {
        e0 e0Var = ((d7) this.f275b).E;
        if (e0Var != null) {
            ArrayList arrayList = e0Var.h;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                d0 d0Var = (d0) obj;
                if (d0Var.f4465a == i10) {
                    d0Var.f4466b.d(1.0f, true);
                    e0Var.invalidate();
                    return;
                }
            }
        }
    }

    @Override
    public void e0() {
        i2.i0 i0Var = ((i0) this.f275b).W;
        if (i0Var != null) {
            i0Var.a();
        }
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public boolean f0() {
        return false;
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
    public void g0(float f7) {
        d7 d7Var = (d7) this.f275b;
        o8 o8Var = d7Var.d;
        if (o8Var == null) {
            return;
        }
        o8Var.f5183t0 = f7;
        o8Var.f5163j = true;
        d7Var.y(true);
    }

    @Override
    public Object mo28get() {
        return new lf.h((Context) ((a9.r) this.f275b).f353a, new rb.a(23), new qb.b(23), 4);
    }

    @Override
    public void h() {
        a1 a1Var = (a1) this.f275b;
        r3 r3Var = a1Var.S;
        if (r3Var != null) {
            w3.Q1(r3Var.f11604a, a1Var.f11221a);
        }
    }

    @Override
    public void h0(int i10, long j3) {
        ArrayList arrayList;
        d7 d7Var = (d7) this.f275b;
        o8 o8Var = d7Var.d;
        if (o8Var != null && (arrayList = o8Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((o8) d7Var.d.T.get(i10)).X = j3;
        }
    }

    @Override
    public void i(float f7) {
        d7 d7Var = (d7) this.f275b;
        o8 o8Var = d7Var.d;
        if (o8Var == null) {
            return;
        }
        o8Var.f5185u0 = f7;
        o8Var.f5163j = true;
        d7Var.c();
    }

    @Override
    public void j0(k2.k kVar) {
        y yVar = ((i0) this.f275b).Y0;
        Handler handler = (Handler) yVar.f15217a;
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
    public void k0() {
        a1 a1Var = (a1) this.f275b;
        r3 r3Var = a1Var.S;
        if (r3Var != null) {
            ii.a aVar = a1Var.f11221a;
            w3.P1(r3Var.f11604a);
        }
    }

    @Override
    public void l(float f7) {
        d7 d7Var = (d7) this.f275b;
        o8 o8Var = d7Var.d;
        if (o8Var == null) {
            return;
        }
        o8Var.G = f7;
        o8Var.f5163j = true;
        d7Var.c();
    }

    @Override
    public void l0(long j3) {
        d7 d7Var = (d7) this.f275b;
        o8 o8Var = d7Var.d;
        if (o8Var == null) {
            return;
        }
        o8Var.D = j3;
        o8Var.f5163j = true;
        d7Var.w(true);
    }

    @Override
    public void m(long j3, boolean z10) {
        d7 d7Var = (d7) this.f275b;
        if (!z10) {
            d7Var.m(j3);
            return;
        }
        t71 t71Var = d7Var.e;
        if (t71Var != null) {
            t71Var.L(j3, true);
        } else if (d7Var.j()) {
            d7Var.E.m(j3, true);
        } else {
            t71 t71Var2 = d7Var.f4537y;
            if (t71Var2 != null) {
                t71Var2.L(j3, false);
            }
        }
    }

    @Override
    public void m0(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        p pVar = (p) this.f275b;
        if (charSequence != null) {
            if (pVar.R()) {
                pVar.W(charSequence);
            }
            pVar.f2068l0.d(null);
        }
    }

    @Override
    public void n(ii.i1 i1Var) {
        ii.a aVar;
        g5 g5Var = (g5) this.f275b;
        e5 e5Var = g5Var.f11397s;
        if (e5Var != null && (aVar = g5Var.f11221a) != null) {
            w3 w3Var = ((b3) e5Var).f11258a;
            ArrayList arrayList = w3Var.f11722l3;
            long j3 = aVar.f11220t;
            if (j3 != 0) {
                int i10 = -1;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (((ii.a) arrayList.get(i11)).f11211k.contains(Long.valueOf(j3))) {
                        i10 = i11;
                    }
                }
                if (i10 >= 0) {
                    h2 h2Var = w3Var.J3;
                    if (h2Var != null) {
                        h2Var.d();
                    }
                    ii.a aVar2 = new ii.a(new TL_iv.pageBlockParagraph(), 0, 0);
                    ArrayList arrayList2 = aVar.f11211k;
                    ArrayList arrayList3 = aVar2.f11211k;
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

    public c6.o n0() {
        c6.o oVar = (c6.o) this.f275b;
        if (oVar.f4028a != null) {
            if (!Double.isNaN(oVar.d) && oVar.d < 0.0d) {
                throw new IllegalArgumentException("startTime cannot be negative or NaN.");
            }
            if (!Double.isNaN(oVar.e)) {
                if (!Double.isNaN(oVar.f4031f) && oVar.f4031f >= 0.0d) {
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
        ((i0) this.f275b).f13309j1 = true;
    }

    public float o0(ic.c cVar, ic.c cVar2) {
        int i10 = (int) cVar.f4217b;
        int i11 = (int) cVar2.f4217b;
        float D0 = D0((int) cVar.f4216a, i10, (int) cVar2.f4216a, i11);
        float D02 = D0((int) cVar2.f4216a, i11, (int) cVar.f4216a, i10);
        if (Float.isNaN(D0)) {
            return D02 / 7.0f;
        }
        if (Float.isNaN(D02)) {
            return D0 / 7.0f;
        }
        return (D0 + D02) / 14.0f;
    }

    @Override
    public void onAudioSessionIdChanged(int i10) {
        r2.j jVar;
        i0 i0Var = (i0) this.f275b;
        if (Build.VERSION.SDK_INT >= 35 && (jVar = i0Var.f13300a1) != null) {
            jVar.d(i10);
        }
        y yVar = i0Var.Y0;
        Handler handler = (Handler) yVar.f15217a;
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
        y yVar = ((i0) this.f275b).Y0;
        Handler handler = (Handler) yVar.f15217a;
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
            v7.n8 n8Var = ib.c.f11070a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (InstantiationException e7) {
            throw new RuntimeException("Failed to invoke constructor '" + ib.c.b(constructor) + "' with no args", e7);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException("Failed to invoke constructor '" + ib.c.b(constructor) + "' with no args", e10.getCause());
        }
    }

    @Override
    public void q() {
        i2.i0 i0Var = ((i0) this.f275b).W;
        if (i0Var != null) {
            i0Var.f10752a.f10817g0 = true;
        }
    }

    public synchronized void q0() {
        ((SharedPreferences) this.f275b).edit().clear().commit();
    }

    @Override
    public void r() {
        d7 d7Var = (d7) this.f275b;
        d7Var.s(null, null, true);
        oc ocVar = ((cc) d7Var).C0;
        cc ccVar = ocVar.X0;
        if (ccVar != null) {
            ccVar.s(null, null, true);
        }
        qb qbVar = ocVar.f5273v1;
        if (qbVar != null) {
            qbVar.q0();
        }
        ec ecVar = ocVar.f5214c1;
        if (ecVar != null) {
            ecVar.setHasRoundVideo(false);
        }
        o8 o8Var = ocVar.K1;
        if (o8Var != null) {
            File file = o8Var.f5173o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                ocVar.K1.f5173o0 = null;
            }
            if (ocVar.K1.f5175p0 != null) {
                try {
                    new File(ocVar.K1.f5175p0).delete();
                } catch (Exception unused2) {
                }
                ocVar.K1.f5175p0 = null;
            }
        }
    }

    public ic.a r0(float f7, float f10, int i10, int i11) {
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
                int i15 = bVar3.f11074c;
                int i16 = i14 + i15;
                int i17 = bVar3.f11075f;
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
                ArrayList arrayList = bVar3.f11073b;
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
    public List s(long j3) {
        if (j3 >= 0) {
            return (List) this.f275b;
        }
        return Collections.EMPTY_LIST;
    }

    public boolean s0() {
        com.google.android.gms.common.api.internal.x0 x0Var = ((j0) this.f275b).d;
        if (x0Var != null && x0Var.b()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean t(ii.i1 i1Var) {
        return false;
    }

    public void t0(String str, Bitmap bitmap) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 2) {
            throw new IllegalArgumentException(a.p("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.f275b).putParcelable(str, bitmap);
    }

    @Override
    public void u(float f7) {
        d7 d7Var = (d7) this.f275b;
        o8 o8Var = d7Var.d;
        if (o8Var == null) {
            return;
        }
        o8Var.f5181s0 = f7;
        o8Var.f5163j = true;
        d7Var.y(true);
    }

    public void u0(long j3) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey("android.media.metadata.DURATION") && ((Integer) fVar.get("android.media.metadata.DURATION")).intValue() != 0) {
            throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
        }
        ((Bundle) this.f275b).putLong("android.media.metadata.DURATION", j3);
    }

    @Override
    public int v() {
        return 1;
    }

    @Override
    public void w(boolean z10) {
        d7 d7Var = (d7) this.f275b;
        if (d7Var.j()) {
            d7Var.E.getClass();
        }
        d7Var.x(-4, z10);
    }

    public void w0(String str, String str2) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 1) {
            throw new IllegalArgumentException(a.p("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.f275b).putCharSequence(str, str2);
    }

    @Override
    public void x(int i10, long j3, long j10) {
        y yVar = ((i0) this.f275b).Y0;
        Handler handler = (Handler) yVar.f15217a;
        if (handler != null) {
            handler.post(new k2.i(yVar, i10, j3, j10, 0));
        }
    }

    public byte x0() {
        int read = ((com.google.firebase.messaging.d) this.f275b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override
    public void y0(gh ghVar) {
        NotificationCenter.getInstance(hg.m.a0((hg.m) this.f275b)).doOnIdle(ghVar);
    }

    @Override
    public void z() {
        ((ci.j0) this.f275b).d.invalidate();
    }

    public JSONObject z0() {
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
        this.f274a = 13;
        this.f275b = new File(cVar.f3452b, "com.crashlytics.settings.json");
    }

    public m(Context context) {
        boolean isEmpty;
        this.f274a = 11;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f275b = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                q0();
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
            }
        }
    }

    @Override
    public void L0() {
    }

    @Override
    public void i0() {
    }

    @Override
    public void v0() {
    }

    @Override
    public void y() {
    }

    public m(int i10) {
        this.f274a = i10;
        switch (i10) {
            case 16:
                this.f275b = new a6.m(23);
                return;
            case 19:
                return;
            default:
                this.f275b = new Bundle();
                return;
        }
    }

    @Override
    public void H(int i10) {
    }

    @Override
    public void K(CharSequence charSequence) {
    }

    @Override
    public void L(boolean z10) {
    }

    @Override
    public void V0(Object obj) {
    }

    @Override
    public void c0(int i10) {
    }

    @Override
    public void d0(boolean z10) {
    }

    @Override
    public void k1(TLRPC.User user) {
    }

    public m(MediaMetadataCompat mediaMetadataCompat) {
        this.f274a = 1;
        Bundle bundle = new Bundle(mediaMetadataCompat.f1809a);
        this.f275b = bundle;
        b0.a(bundle);
    }

    @Override
    public void j(int i10, int i11) {
    }

    @Override
    public void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }

    @Override
    public void C1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
    }
}
