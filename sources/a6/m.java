package a6;

import ai.bc;
import ai.f6;
import ai.p8;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.Editable;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import androidx.biometric.t;
import androidx.biometric.x;
import androidx.fragment.app.g0;
import androidx.fragment.app.k0;
import androidx.fragment.app.l0;
import androidx.fragment.app.v;
import androidx.lifecycle.a0;
import androidx.lifecycle.z;
import androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer;
import c6.d0;
import c6.e0;
import ci.b7;
import ci.j6;
import ci.l8;
import ci.lc;
import ci.nb;
import ci.pc;
import ci.zb;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.internal.j0;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.x0;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import ei.w4;
import g6.q;
import g6.r;
import g6.w;
import ii.d3;
import ii.e2;
import ii.h1;
import ii.i1;
import ii.i2;
import ii.p5;
import ii.x3;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.concurrent.Executor;
import k2.n;
import lg.o;
import m.j1;
import n4.y;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.json.JSONObject;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.q81;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ov0;
import qg.c2;
import v7.a8;
import x2.p;
public final class m implements ov0, a0, androidx.activity.result.b, WebMessageListenerBoundaryInterface, s, o, pc, OnCompleteListener, f6.a, fb.o, j1, f5, h1, n {
    public final int f329a;
    public final Object f330b;

    public m(r rVar, String[] strArr) {
        this.f329a = 20;
        this.f330b = strArr;
    }

    @Override
    public void A(float f7) {
        b7 b7Var = (b7) this.f330b;
        l8 l8Var = b7Var.d;
        if (l8Var == null) {
            return;
        }
        l8Var.P = f7;
        b7Var.c();
    }

    @Override
    public void B(float f7, boolean z10) {
        b7 b7Var = (b7) this.f330b;
        l8 l8Var = b7Var.d;
        if (l8Var != null) {
            l8Var.Z = f7;
            l8Var.f5413j = true;
            q81 q81Var = b7Var.f4761e;
            if (q81Var != null && q81Var.p() != -9223372036854775807L) {
                b7Var.m(f7 * ((float) b7Var.f4761e.p()));
            }
        }
    }

    @Override
    public void C() {
        p pVar;
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.f330b;
        synchronized (ffmpegAudioRenderer.f11642a) {
            pVar = ffmpegAudioRenderer.H;
        }
        if (pVar != null) {
            pVar.h();
        }
    }

    @Override
    public void D(i1 i1Var, int i10, int i11) {
        d3 d3Var;
        o9 textSelectionHelper;
        p5 p5Var = (p5) this.f330b;
        if (!p5Var.G && i10 != i11 && (d3Var = p5Var.E) != null && (textSelectionHelper = d3Var.f12343a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.x() || textSelectionHelper.W != p5Var) {
                p5Var.post(new w4(this, i1Var, i11, textSelectionHelper, i10, 4));
            }
        }
    }

    @Override
    public void E(long j3) {
        b7 b7Var = (b7) this.f330b;
        l8 l8Var = b7Var.d;
        if (l8Var == null) {
            return;
        }
        l8Var.f5429r0 = j3;
        l8Var.f5413j = true;
        b7Var.y(true);
    }

    @Override
    public void F(boolean z10) {
        c2 c2Var;
        lc lcVar = ((zb) ((b7) this.f330b)).C0;
        nb nbVar = lcVar.f5525v1;
        if (nbVar != null) {
            c2 c2Var2 = null;
            if (!z10 && (nbVar.getSelectedEntity() instanceof c2)) {
                lcVar.f5525v1.C0(null, true);
            } else if (z10 && !(lcVar.f5525v1.getSelectedEntity() instanceof c2)) {
                j6 j6Var = lcVar.f5525v1.R0;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 < j6Var.getChildCount()) {
                        View childAt = j6Var.getChildAt(i11);
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
                    nb nbVar2 = lcVar.f5525v1;
                    j6 j6Var2 = nbVar2.R0;
                    while (true) {
                        if (i10 >= j6Var2.getChildCount()) {
                            break;
                        }
                        View childAt2 = j6Var2.getChildAt(i10);
                        if (childAt2 instanceof c2) {
                            c2Var2 = (c2) childAt2;
                            break;
                        }
                        i10++;
                    }
                    nbVar2.C0(c2Var2, true);
                }
            }
        }
    }

    @Override
    public void G(Exception exc) {
        e2.a.f("DecoderAudioRenderer", "Audio sink error", exc);
        y yVar = ((FfmpegAudioRenderer) this.f330b).I;
        Handler handler = (Handler) yVar.f16362b;
        if (handler != null) {
            handler.post(new k2.f(yVar, exc, 1));
        }
    }

    @Override
    public void H(MessageObject messageObject) {
        ((bc) ((f6) this.f330b).Q1).f(false);
    }

    @Override
    public void I(float f7, int i10) {
        ArrayList arrayList;
        b7 b7Var = (b7) this.f330b;
        l8 l8Var = b7Var.d;
        if (l8Var != null && (arrayList = l8Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((l8) b7Var.d.T.get(i10)).V = f7;
        }
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ((e2) this.f330b).s0(i10, i11, z10);
    }

    @Override
    public void K(float f7) {
        b7 b7Var = (b7) this.f330b;
        l8 l8Var = b7Var.d;
        if (l8Var == null) {
            return;
        }
        l8Var.F = f7;
        l8Var.f5413j = true;
        b7Var.w(true);
    }

    @Override
    public void L() {
        ((FfmpegAudioRenderer) this.f330b).Z = true;
    }

    @Override
    public void M(CharSequence charSequence) {
        d3 d3Var = ((p5) this.f330b).E;
        if (d3Var != null && charSequence != null && charSequence.length() > 0) {
            d3Var.f12343a.u4(charSequence.toString());
        }
    }

    @Override
    public void N(k2.k kVar) {
        y yVar = ((FfmpegAudioRenderer) this.f330b).I;
        Handler handler = (Handler) yVar.f16362b;
        if (handler != null) {
            handler.post(new k2.h(yVar, kVar, 0));
        }
    }

    @Override
    public void O(float f7) {
        b7 b7Var = (b7) this.f330b;
        l8 l8Var = b7Var.d;
        if (l8Var == null) {
            return;
        }
        l8Var.E = f7;
        l8Var.f5413j = true;
        b7Var.w(true);
    }

    @Override
    public void P(float f7, int i10) {
        ArrayList arrayList;
        b7 b7Var = (b7) this.f330b;
        l8 l8Var = b7Var.d;
        if (l8Var != null && (arrayList = l8Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((l8) b7Var.d.T.get(i10)).W = f7;
        }
    }

    @Override
    public void Q(float f7) {
        l8 l8Var = ((b7) this.f330b).d;
        if (l8Var == null) {
            return;
        }
        l8Var.f5393a0 = f7;
        l8Var.f5413j = true;
    }

    @Override
    public void R() {
        ((b7) this.f330b).q(null);
    }

    @Override
    public void S(Editable editable) {
        p5 p5Var = (p5) this.f330b;
        ii.a aVar = p5Var.f12249a;
        if (aVar != null) {
            aVar.f12247s = true;
            aVar.f12246r = p5Var.f12629r.E;
        }
        p5Var.u();
        d3 d3Var = p5Var.E;
        if (d3Var != null && p5Var.f12249a != null) {
            d3Var.a();
        }
    }

    @Override
    public boolean U(boolean z10) {
        return false;
    }

    @Override
    public void W(float f7) {
        b7 b7Var = (b7) this.f330b;
        l8 l8Var = b7Var.d;
        if (l8Var == null) {
            return;
        }
        l8Var.f5433t0 = f7;
        l8Var.f5413j = true;
        b7Var.y(true);
    }

    @Override
    public void Y(int i10, long j3) {
        ArrayList arrayList;
        b7 b7Var = (b7) this.f330b;
        l8 l8Var = b7Var.d;
        if (l8Var != null && (arrayList = l8Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((l8) b7Var.d.T.get(i10)).X = j3;
        }
    }

    @Override
    public void Z(long j3) {
        b7 b7Var = (b7) this.f330b;
        l8 l8Var = b7Var.d;
        if (l8Var == null) {
            return;
        }
        l8Var.D = j3;
        l8Var.f5413j = true;
        b7Var.w(true);
    }

    public void a(j6.l lVar, t tVar) {
        Object obj = this.f330b;
        l0 l0Var = (l0) obj;
        if (l0Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
        } else if (l0Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
        } else {
            l0 l0Var2 = (l0) obj;
            androidx.biometric.p pVar = (androidx.biometric.p) l0Var2.D("androidx.biometric.BiometricFragment");
            if (pVar == null) {
                pVar = new androidx.biometric.p();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(l0Var2);
                aVar.f(0, pVar, "androidx.biometric.BiometricFragment");
                aVar.e(true, true);
                l0Var2.A(true);
                l0Var2.E();
            }
            v k10 = pVar.k();
            if (k10 == null) {
                Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
                return;
            }
            x xVar = pVar.f2315l0;
            xVar.f2325f = lVar;
            int i10 = lVar.f14058a;
            if (i10 == 0) {
                if (tVar != null) {
                    i10 = 15;
                } else {
                    i10 = 255;
                }
            }
            if (Build.VERSION.SDK_INT < 30 && i10 == 15 && tVar == null) {
                xVar.f2326g = v7.m.a();
            } else {
                xVar.f2326g = tVar;
            }
            if (pVar.Q()) {
                pVar.f2315l0.f2329k = pVar.q(2131689576);
            } else {
                pVar.f2315l0.f2329k = null;
            }
            if (pVar.Q() && new aa.a(new k6.h(k10, 1)).f(255) != 0) {
                pVar.f2315l0.f2332n = true;
                pVar.S();
            } else if (pVar.f2315l0.f2334p) {
                pVar.f2314k0.postDelayed(new androidx.biometric.o(pVar), 600L);
            } else {
                pVar.X();
            }
        }
    }

    @Override
    public void a0(k2.k kVar) {
        y yVar = ((FfmpegAudioRenderer) this.f330b).I;
        Handler handler = (Handler) yVar.f16362b;
        if (handler != null) {
            handler.post(new k2.h(yVar, kVar, 1));
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        int i10 = this.f329a;
        Object obj3 = this.f330b;
        switch (i10) {
            case 9:
                w wVar = (w) obj;
                g6.f fVar = (g6.f) wVar.u();
                d0 d0Var = ((e0) obj3).f4345k;
                Parcel N0 = fVar.N0();
                com.google.android.gms.internal.cast.v.d(N0, d0Var);
                fVar.S0(N0, 18);
                g6.f fVar2 = (g6.f) wVar.u();
                fVar2.S0(fVar2.N0(), 17);
                ((TaskCompletionSource) obj2).setResult(null);
                return;
            case 20:
                q qVar = new q(1, (TaskCompletionSource) obj2);
                g6.i iVar = (g6.i) ((g6.s) obj).u();
                Parcel N02 = iVar.N0();
                com.google.android.gms.internal.cast.v.d(N02, qVar);
                N02.writeStringArray((String[]) obj3);
                iVar.S0(N02, 6);
                return;
            case 22:
                h7.f fVar3 = new h7.f(1, (TaskCompletionSource) obj2);
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i11 = q7.a.f45937a;
                obtain.writeStrongBinder(fVar3);
                q7.a.b(obtain, (GetCredentialRequest) obj3);
                q7.a.b(obtain, gVar);
                ((h7.b) ((h7.d) ((h7.e) obj).u())).F0(obtain, 1);
                return;
            default:
                i7.a aVar = new i7.a((TaskCompletionSource) obj2);
                i7.i iVar2 = (i7.i) ((i7.c) obj).u();
                String str = ((i7.b) obj3).f12035k;
                Parcel J0 = iVar2.J0();
                int i12 = i7.f.f12039a;
                J0.writeStrongBinder(aVar);
                J0.writeString(str);
                iVar2.K0(J0, 2);
                return;
        }
    }

    @Override
    public void b(long j3) {
        y yVar = ((FfmpegAudioRenderer) this.f330b).I;
        Handler handler = (Handler) yVar.f16362b;
        if (handler != null) {
            handler.post(new ai.j(yVar, j3, 13));
        }
    }

    public aa.a b0(pf.b r42) {
        throw new UnsupportedOperationException("Method not decompiled: a6.m.b0(pf.b):aa.a");
    }

    @Override
    public void c(i1 i1Var) {
        d3 d3Var = ((p5) this.f330b).E;
        if (d3Var != null) {
            x3 x3Var = d3Var.f12343a;
            x3.N1(x3Var, i1Var);
            x3Var.f12807f3.w(i1Var, true);
        }
    }

    public int c0(int i10, int[] iArr) {
        int[] iArr2;
        int[] iArr3;
        int i11;
        int i12;
        int i13;
        fc.a aVar = (fc.a) this.f330b;
        if (iArr.length != 0) {
            int length = iArr.length;
            if (length > 1 && iArr[0] == 0) {
                int i14 = 1;
                while (i14 < length && iArr[i14] == 0) {
                    i14++;
                }
                if (i14 == length) {
                    iArr2 = new int[]{0};
                } else {
                    int i15 = length - i14;
                    int[] iArr4 = new int[i15];
                    System.arraycopy(iArr, i14, iArr4, 0, i15);
                    iArr2 = iArr4;
                }
            } else {
                iArr2 = iArr;
            }
            int[] iArr5 = new int[i10];
            boolean z10 = true;
            for (int i16 = 0; i16 < i10; i16++) {
                int i17 = aVar.f9845a[aVar.f9850g + i16];
                if (i17 == 0) {
                    i13 = iArr2[iArr2.length - 1];
                } else {
                    if (i17 == 1) {
                        i12 = 0;
                        for (int i18 : iArr2) {
                            fc.a aVar2 = fc.a.h;
                            i12 ^= i18;
                        }
                    } else {
                        i12 = iArr2[0];
                        int length2 = iArr2.length;
                        for (int i19 = 1; i19 < length2; i19++) {
                            i12 = aVar.c(i17, i12) ^ iArr2[i19];
                        }
                    }
                    i13 = i12;
                }
                iArr5[(i10 - 1) - i16] = i13;
                if (i13 != 0) {
                    z10 = false;
                }
            }
            if (z10) {
                return 0;
            }
            fc.b bVar = new fc.b(aVar, iArr5);
            fc.b a2 = aVar.a(i10, 1);
            fc.b bVar2 = aVar.f9847c;
            if (a2.d() >= bVar.d()) {
                a2 = bVar;
                bVar = a2;
            }
            fc.b bVar3 = aVar.d;
            fc.b bVar4 = a2;
            fc.b bVar5 = bVar;
            fc.b bVar6 = bVar4;
            fc.b bVar7 = bVar2;
            while (bVar6.d() * 2 >= i10) {
                if (!bVar6.e()) {
                    int b10 = aVar.b(bVar6.c(bVar6.d()));
                    fc.b bVar8 = bVar2;
                    while (bVar5.d() >= bVar6.d() && !bVar5.e()) {
                        int d = bVar5.d() - bVar6.d();
                        int c10 = aVar.c(bVar5.c(bVar5.d()), b10);
                        bVar8 = bVar8.a(aVar.a(d, c10));
                        bVar5 = bVar5.a(bVar6.h(d, c10));
                    }
                    fc.b a10 = bVar8.g(bVar3).a(bVar7);
                    if (bVar5.d() < bVar6.d()) {
                        fc.b bVar9 = bVar5;
                        bVar5 = bVar6;
                        bVar6 = bVar9;
                        bVar7 = bVar3;
                        bVar3 = a10;
                    } else {
                        throw new IllegalStateException("Division algorithm failed to reduce polynomial? r: " + bVar5 + ", rLast: " + bVar6);
                    }
                } else {
                    throw new Exception("r_{i-1} was zero");
                }
            }
            int c11 = bVar3.c(0);
            if (c11 != 0) {
                int b11 = aVar.b(c11);
                fc.b[] bVarArr = {bVar3.f(b11), bVar6.f(b11)};
                fc.b bVar10 = bVarArr[0];
                fc.b bVar11 = bVarArr[1];
                int d10 = bVar10.d();
                if (d10 == 1) {
                    iArr3 = new int[]{bVar10.c(1)};
                } else {
                    int[] iArr6 = new int[d10];
                    int i20 = 0;
                    for (int i21 = 1; i21 < aVar.f9848e && i20 < d10; i21++) {
                        if (bVar10.b(i21) == 0) {
                            iArr6[i20] = aVar.b(i21);
                            i20++;
                        }
                    }
                    if (i20 == d10) {
                        iArr3 = iArr6;
                    } else {
                        throw new Exception("Error locator degree does not match number of roots");
                    }
                }
                int length3 = iArr3.length;
                int[] iArr7 = new int[length3];
                for (int i22 = 0; i22 < length3; i22++) {
                    int b12 = aVar.b(iArr3[i22]);
                    int i23 = 1;
                    for (int i24 = 0; i24 < length3; i24++) {
                        if (i22 != i24) {
                            int c12 = aVar.c(iArr3[i24], b12);
                            if ((c12 & 1) == 0) {
                                i11 = c12 | 1;
                            } else {
                                i11 = c12 & (-2);
                            }
                            i23 = aVar.c(i23, i11);
                        }
                    }
                    int c13 = aVar.c(bVar11.b(b12), aVar.b(i23));
                    iArr7[i22] = c13;
                    if (aVar.f9850g != 0) {
                        iArr7[i22] = aVar.c(c13, b12);
                    }
                }
                for (int i25 = 0; i25 < iArr3.length; i25++) {
                    int length4 = iArr.length - 1;
                    int i26 = iArr3[i25];
                    if (i26 != 0) {
                        int i27 = length4 - aVar.f9846b[i26];
                        if (i27 >= 0) {
                            iArr[i27] = iArr[i27] ^ iArr7[i25];
                        } else {
                            throw new Exception("Bad error location");
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                return iArr3.length;
            }
            throw new Exception("sigmaTilde(0) was zero");
        }
        throw new IllegalArgumentException();
    }

    @Override
    public void d(int i10) {
        ci.e0 e0Var = ((b7) this.f330b).E;
        if (e0Var != null) {
            ArrayList arrayList = e0Var.h;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                ci.d0 d0Var = (ci.d0) obj;
                if (d0Var.f4877a == i10) {
                    d0Var.f4878b.d(1.0f, true);
                    e0Var.invalidate();
                    return;
                }
            }
        }
    }

    public synchronized void d0() {
        ((SharedPreferences) this.f330b).edit().clear().commit();
    }

    @Override
    public boolean e() {
        p5 p5Var = (p5) this.f330b;
        d3 d3Var = p5Var.E;
        if (d3Var != null && p5Var.f12249a != null) {
            return d3Var.f12343a.T4();
        }
        return false;
    }

    public boolean e0() {
        x0 x0Var = ((j0) this.f330b).d;
        if (x0Var != null && x0Var.b()) {
            return true;
        }
        return false;
    }

    @Override
    public void f(float f7) {
        b7 b7Var = (b7) this.f330b;
        l8 l8Var = b7Var.d;
        if (l8Var == null) {
            return;
        }
        l8Var.f5435u0 = f7;
        l8Var.f5413j = true;
        b7Var.c();
    }

    public JSONObject f0() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f330b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(w9.h.j(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e7) {
                        e = e7;
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
        } catch (Exception e10) {
            e = e10;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            w9.h.c(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override
    public void g(float f7) {
        b7 b7Var = (b7) this.f330b;
        l8 l8Var = b7Var.d;
        if (l8Var == null) {
            return;
        }
        l8Var.G = f7;
        l8Var.f5413j = true;
        b7Var.c();
    }

    @Override
    public TextureView g0() {
        return null;
    }

    @Override
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override
    public void h(long j3, boolean z10) {
        b7 b7Var = (b7) this.f330b;
        if (!z10) {
            b7Var.m(j3);
            return;
        }
        q81 q81Var = b7Var.f4761e;
        if (q81Var != null) {
            q81Var.L(j3, true);
        } else if (b7Var.j()) {
            b7Var.E.m(j3, true);
        } else {
            q81 q81Var2 = b7Var.f4787y;
            if (q81Var2 != null) {
                q81Var2.L(j3, false);
            }
        }
    }

    @Override
    public void h0(Object obj) {
        int i10 = this.f329a;
        Object obj2 = this.f330b;
        switch (i10) {
            case 3:
                androidx.biometric.p pVar = (androidx.biometric.p) obj2;
                if (((Boolean) obj).booleanValue()) {
                    if (pVar.R()) {
                        pVar.W(pVar.q(2131689613));
                    }
                    x xVar = pVar.f2315l0;
                    if (!xVar.f2332n) {
                        Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                    } else {
                        Executor executor = xVar.d;
                        if (executor == null) {
                            executor = new androidx.biometric.n(1);
                        }
                        executor.execute(new androidx.biometric.g(pVar, 0));
                    }
                    x xVar2 = pVar.f2315l0;
                    if (xVar2.f2339u == null) {
                        xVar2.f2339u = new z();
                    }
                    x.h(xVar2.f2339u, Boolean.FALSE);
                    return;
                }
                return;
            default:
                androidx.fragment.app.p pVar2 = (androidx.fragment.app.p) obj2;
                if (((androidx.lifecycle.t) obj) != null && pVar2.f2744r0) {
                    pVar2.getClass();
                    throw new IllegalStateException("Fragment " + pVar2 + " did not return a View from onCreateView() or this was called before onCreateView().");
                }
                return;
        }
    }

    @Override
    public void i() {
        ((FfmpegAudioRenderer) this.f330b).f2945f0 = true;
    }

    @Override
    public void j(int i10, int i11) {
        i2 i2Var;
        p5 p5Var = (p5) this.f330b;
        d3 d3Var = p5Var.E;
        if (d3Var != null && p5Var.f12249a != null && (i2Var = d3Var.f12343a.H3) != null) {
            i2Var.f(i10, i11);
        }
    }

    @Override
    public void k(Object obj) {
        Bundle extras;
        switch (this.f329a) {
            case 6:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                k0 k0Var = (k0) this.f330b;
                g0 g0Var = (g0) k0Var.F.pollFirst();
                if (g0Var == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    return;
                }
                String str = g0Var.f2686a;
                int i10 = g0Var.f2687b;
                androidx.fragment.app.s l4 = k0Var.f2697c.l(str);
                if (l4 == null) {
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                    return;
                }
                l4.x(i10, aVar.f2158a, aVar.f2159b);
                return;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f330b;
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.f2159b;
                int i11 = u.e("ProxyBillingActivityV2", intent).f4252a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.M;
                if (resultReceiver != null) {
                    if (intent == null) {
                        extras = null;
                    } else {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(i11, extras);
                }
                int i12 = aVar2.f2158a;
                if (i12 != -1 || i11 != 0) {
                    u.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i12 + " and billing's responseCode: " + i11);
                }
                proxyBillingActivityV2.finish();
                return;
        }
    }

    @Override
    public void m(Bitmap bitmap) {
        g6.b bVar = f6.i.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f7 = width;
            int height = bitmap.getHeight();
            int B = (int) a1.g.B(f7, 9.0f, 16.0f, 0.5f);
            float f10 = (B - height) / 2.0f;
            RectF rectF = new RectF(0.0f, f10, f7, height + f10);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, B, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        ((f6.i) this.f330b).e(bitmap2, 0);
    }

    @Override
    public boolean o(i1 i1Var) {
        return false;
    }

    @Override
    public void onAudioSessionIdChanged(int i10) {
        y yVar = ((FfmpegAudioRenderer) this.f330b).I;
        Handler handler = (Handler) yVar.f16362b;
        if (handler != null) {
            handler.post(new p8(yVar, i10, 11));
        }
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f329a) {
            case 14:
                d6.c.h((d6.c) ((d6.j) this.f330b).f8194c, "joinApplication", task);
                return;
            default:
                ae.m mVar = (ae.m) this.f330b;
                Exception exception = task.getException();
                if (exception == null) {
                    if (task.isCanceled()) {
                        mVar.n(null);
                        return;
                    } else {
                        mVar.resumeWith(task.getResult());
                        return;
                    }
                }
                mVar.resumeWith(a8.a(exception));
                return;
        }
    }

    @Override
    public void onPostMessage(android.webkit.WebView r8, java.lang.reflect.InvocationHandler r9, android.net.Uri r10, boolean r11, java.lang.reflect.InvocationHandler r12) {
        throw new UnsupportedOperationException("Method not decompiled: a6.m.onPostMessage(android.webkit.WebView, java.lang.reflect.InvocationHandler, android.net.Uri, boolean, java.lang.reflect.InvocationHandler):void");
    }

    @Override
    public void onSkipSilenceEnabledChanged(boolean z10) {
        y yVar = ((FfmpegAudioRenderer) this.f330b).I;
        Handler handler = (Handler) yVar.f16362b;
        if (handler != null) {
            handler.post(new bi.f(8, yVar, z10));
        }
    }

    @Override
    public void p() {
        b7 b7Var = (b7) this.f330b;
        b7Var.s(null, null, true);
        lc lcVar = ((zb) b7Var).C0;
        zb zbVar = lcVar.X0;
        if (zbVar != null) {
            zbVar.s(null, null, true);
        }
        nb nbVar = lcVar.f5525v1;
        if (nbVar != null) {
            nbVar.p0();
        }
        ci.bc bcVar = lcVar.f5465c1;
        if (bcVar != null) {
            bcVar.setHasRoundVideo(false);
        }
        l8 l8Var = lcVar.K1;
        if (l8Var != null) {
            File file = l8Var.f5423o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                lcVar.K1.f5423o0 = null;
            }
            if (lcVar.K1.f5425p0 != null) {
                try {
                    new File(lcVar.K1.f5425p0).delete();
                } catch (Exception unused2) {
                }
                lcVar.K1.f5425p0 = null;
            }
        }
    }

    @Override
    public void q(float f7) {
        b7 b7Var = (b7) this.f330b;
        l8 l8Var = b7Var.d;
        if (l8Var == null) {
            return;
        }
        l8Var.f5431s0 = f7;
        l8Var.f5413j = true;
        b7Var.y(true);
    }

    @Override
    public void r(boolean z10) {
        b7 b7Var = (b7) this.f330b;
        if (b7Var.j()) {
            b7Var.E.getClass();
        }
        b7Var.x(-4, z10);
    }

    @Override
    public void s(int i10, long j3, long j10) {
        y yVar = ((FfmpegAudioRenderer) this.f330b).I;
        Handler handler = (Handler) yVar.f16362b;
        if (handler != null) {
            handler.post(new k2.i(yVar, i10, j3, j10, 0));
        }
    }

    @Override
    public void t(float f7, int i10) {
        ArrayList arrayList;
        b7 b7Var = (b7) this.f330b;
        l8 l8Var = b7Var.d;
        if (l8Var != null && (arrayList = l8Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((l8) b7Var.d.T.get(i10)).P = f7;
        }
    }

    @Override
    public void u() {
        ((ci.l0) this.f330b).f5367e.invalidate();
    }

    public void v(StringBuilder sb2) {
        String str;
        if (((Boolean) hg.c.A(1, (ArrayList) this.f330b)).booleanValue()) {
            str = "</ol>";
        } else {
            str = "</ul>";
        }
        sb2.append(str);
    }

    @Override
    public boolean w(i1 i1Var) {
        return false;
    }

    @Override
    public void w0(MessageObject messageObject) {
        ((bc) ((f6) this.f330b).Q1).f(true);
    }

    @Override
    public Object w2() {
        Type type = (Type) this.f330b;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            throw new RuntimeException("Invalid EnumSet type: " + type.toString());
        }
        throw new RuntimeException("Invalid EnumSet type: " + type.toString());
    }

    public void x(StringBuilder sb2) {
        while (!((ArrayList) this.f330b).isEmpty()) {
            v(sb2);
        }
    }

    public m(Object obj, int i10) {
        this.f329a = i10;
        this.f330b = obj;
    }

    public m(ba.c cVar) {
        this.f329a = 15;
        this.f330b = new File(cVar.f3798b, "com.crashlytics.settings.json");
    }

    public m(int i10) {
        this.f329a = i10;
        switch (i10) {
            case 25:
                this.f330b = new ArrayList();
                return;
            default:
                this.f330b = new xa.c(21);
                return;
        }
    }

    public m(Context context) {
        boolean isEmpty;
        this.f329a = 13;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f330b = sharedPreferences;
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
                d0();
            }
        } catch (IOException e7) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e7.getMessage());
            }
        }
    }

    public m(LaunchActivity launchActivity, Executor executor, v7.l lVar) {
        this.f329a = 4;
        if (launchActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            l0 s10 = launchActivity.s();
            x xVar = (x) new aa.a(launchActivity).k(x.class);
            this.f330b = s10;
            xVar.d = executor;
            xVar.f2324e = lVar;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }

    @Override
    public void V() {
    }

    @Override
    public void X() {
    }

    @Override
    public void n() {
    }

    @Override
    public void y() {
    }

    @Override
    public void T(boolean z10) {
    }

    @Override
    public void l(i1 i1Var) {
    }

    @Override
    public void z(boolean z10) {
    }
}
