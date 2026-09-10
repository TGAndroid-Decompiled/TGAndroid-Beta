package a4;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.Editable;
import android.util.Log;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.b0;
import androidx.fragment.app.f0;
import androidx.fragment.app.j0;
import androidx.lifecycle.a0;
import androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer;
import b5.p;
import bi.ad;
import bi.n0;
import bi.va;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.internal.cast.v;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import di.b5;
import fb.n;
import g6.q;
import g6.r;
import hi.f3;
import hi.g2;
import hi.j1;
import hi.k1;
import hi.k2;
import hi.r5;
import hi.z3;
import j$.util.Objects;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import kg.o;
import m.g3;
import m.i1;
import og.x0;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONObject;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.c5;
import pg.v1;
import v7.h5;
public final class m implements z3.d, a0, androidx.activity.result.b, p, o, v1, v0, OnSuccessListener, SuccessContinuation, f6.a, n, i1, s, c5, j1, k2.n, l.j, l2.j {
    public final int f272a;
    public Object f273b;

    public m(r rVar, String[] strArr) {
        this.f272a = 18;
        this.f273b = strArr;
    }

    public static com.google.android.gms.common.api.internal.p Q(Looper looper, Object obj, String str) {
        n6.l.i(obj, "Listener must not be null");
        n6.l.i(looper, "Looper must not be null");
        return new com.google.android.gms.common.api.internal.p(looper, obj, str);
    }

    @Override
    public void A() {
        ((n0) this.f273b).d.invalidate();
    }

    @Override
    public boolean B(l.l lVar, MenuItem menuItem) {
        m.k kVar = ((ActionMenuView) this.f273b).P;
        if (kVar != null) {
            Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((l2.h) kVar).f12721b).W.f13002c).iterator();
            while (it.hasNext()) {
                if (((b0) it.next()).f1092a.p()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public String[] C() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f273b).getSupportedFeatures();
    }

    @Override
    public void D(CharSequence charSequence) {
        f3 f3Var = ((r5) this.f273b).E;
        if (f3Var != null && charSequence != null && charSequence.length() > 0) {
            f3Var.f9568a.s4(charSequence.toString());
        }
    }

    @Override
    public boolean E() {
        return true;
    }

    @Override
    public boolean F(k1 k1Var) {
        return false;
    }

    @Override
    public void G(Editable editable) {
        r5 r5Var = (r5) this.f273b;
        hi.a aVar = r5Var.f9464a;
        if (aVar != null) {
            aVar.f9435s = true;
            aVar.f9434r = r5Var.f9829r.E;
        }
        r5Var.u();
        f3 f3Var = r5Var.E;
        if (f3Var != null && r5Var.f9464a != null) {
            f3Var.a();
        }
    }

    @Override
    public boolean H(boolean z10) {
        return false;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        ((g2) this.f273b).s0(i10, i11, z10);
    }

    @Override
    public long J() {
        return 0L;
    }

    @Override
    public long K(long j3) {
        return 1L;
    }

    @Override
    public void L() {
        x2.p pVar;
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.f273b;
        synchronized (ffmpegAudioRenderer.f10173a) {
            pVar = ffmpegAudioRenderer.H;
        }
        if (pVar != null) {
            pVar.h();
        }
    }

    @Override
    public long M(long j3, long j10) {
        return 1L;
    }

    public void O(StringBuilder sb2, Iterator it) {
        CharSequence obj;
        CharSequence obj2;
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                if (next instanceof CharSequence) {
                    obj = (CharSequence) next;
                } else {
                    obj = next.toString();
                }
                sb2.append(obj);
                while (it.hasNext()) {
                    sb2.append((CharSequence) ((String) this.f273b));
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    if (next2 instanceof CharSequence) {
                        obj2 = (CharSequence) next2;
                    } else {
                        obj2 = next2.toString();
                    }
                    sb2.append(obj2);
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override
    public boolean P(k1 k1Var) {
        return false;
    }

    public aa.a R(n4.y r42) {
        throw new UnsupportedOperationException("Method not decompiled: a4.m.R(n4.y):aa.a");
    }

    public int S(int i10, int[] iArr) {
        int[] iArr2;
        int[] iArr3;
        int i11;
        int i12;
        int i13;
        fc.a aVar = (fc.a) this.f273b;
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
                int i17 = aVar.f7936a[aVar.f7940g + i16];
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
            fc.b bVar2 = aVar.f7938c;
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
                    for (int i21 = 1; i21 < aVar.e && i20 < d10; i21++) {
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
                    if (aVar.f7940g != 0) {
                        iArr7[i22] = aVar.c(c13, b12);
                    }
                }
                for (int i25 = 0; i25 < iArr3.length; i25++) {
                    int length4 = iArr.length - 1;
                    int i26 = iArr3[i25];
                    if (i26 != 0) {
                        int i27 = length4 - aVar.f7937b[i26];
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
    public void T(Exception exc) {
        e2.a.f("DecoderAudioRenderer", "Audio sink error", exc);
        of.b bVar = ((FfmpegAudioRenderer) this.f273b).I;
        Handler handler = (Handler) bVar.f14294b;
        if (handler != null) {
            handler.post(new k2.f(bVar, exc, 1));
        }
    }

    public void U() {
        e6.h hVar = (e6.h) this.f273b;
        Iterator it = hVar.h.iterator();
        if (!it.hasNext()) {
            Iterator it2 = hVar.f7319i.iterator();
            while (it2.hasNext()) {
                ((e6.g) it2.next()).a();
            }
            return;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override
    public void V(float f7) {
        ad adVar = (ad) this.f273b;
        x0.e(adVar.F1).k(String.valueOf(og.m.f14420a.indexOf(adVar.O0.getCurrentBrush())), f7);
        og.v1 v1Var = adVar.A1;
        v1Var.f14536c = f7;
        adVar.E0(v1Var, null, false);
    }

    @Override
    public void W() {
        ((FfmpegAudioRenderer) this.f273b).Z = true;
    }

    @Override
    public void Z(k2.k kVar) {
        of.b bVar = ((FfmpegAudioRenderer) this.f273b).I;
        Handler handler = (Handler) bVar.f14294b;
        if (handler != null) {
            handler.post(new k2.h(bVar, kVar, 0));
        }
    }

    @Override
    public long a(long j3) {
        return 0L;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f272a) {
            case 18:
                q qVar = new q(1, (TaskCompletionSource) obj2);
                g6.i iVar = (g6.i) ((g6.s) obj).u();
                Parcel O0 = iVar.O0();
                v.d(O0, qVar);
                O0.writeStringArray((String[]) this.f273b);
                iVar.T0(O0, 6);
                return;
            case 19:
            default:
                i7.a aVar = new i7.a((TaskCompletionSource) obj2);
                i7.i iVar2 = (i7.i) ((i7.c) obj).u();
                String str = ((i7.b) this.f273b).f10498k;
                Parcel K0 = iVar2.K0();
                int i10 = i7.f.f10502a;
                K0.writeStrongBinder(aVar);
                K0.writeString(str);
                iVar2.L0(K0, 2);
                return;
            case 20:
                h7.f fVar = new h7.f(0, (TaskCompletionSource) obj2);
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i11 = q7.a.f40544a;
                obtain.writeStrongBinder(fVar);
                q7.a.b(obtain, (g7.f) this.f273b);
                q7.a.b(obtain, gVar);
                ((h7.b) ((h7.d) ((h7.e) obj).u())).G0(obtain, 6);
                return;
        }
    }

    @Override
    public void b(k1 k1Var) {
        f3 f3Var = ((r5) this.f273b).E;
        if (f3Var != null) {
            z3 z3Var = f3Var.f9568a;
            z3.L1(z3Var, k1Var);
            z3Var.f10001h3.C(k1Var, true);
        }
    }

    @Override
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) se.b.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f273b).createWebView(webView));
    }

    @Override
    public int d(long j3) {
        if (j3 < 0) {
            return 0;
        }
        return -1;
    }

    @Override
    public void e(long j3) {
        of.b bVar = ((FfmpegAudioRenderer) this.f273b).I;
        Handler handler = (Handler) bVar.f14294b;
        if (handler != null) {
            handler.post(new va(bVar, j3, 7));
        }
    }

    @Override
    public boolean f() {
        r5 r5Var = (r5) this.f273b;
        f3 f3Var = r5Var.E;
        if (f3Var != null && r5Var.f9464a != null) {
            return f3Var.f9568a.R4();
        }
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
    public float get() {
        ad adVar = (ad) this.f273b;
        int i10 = adVar.F1;
        og.m currentBrush = adVar.O0.getCurrentBrush();
        if (currentBrush == null) {
            return x0.e(i10).f14557i;
        }
        return x0.e(i10).f(String.valueOf(og.m.f14420a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) se.b.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f273b).getStatics());
    }

    @Override
    public void h(int i10, int i11) {
        k2 k2Var;
        r5 r5Var = (r5) this.f273b;
        f3 f3Var = r5Var.E;
        if (f3Var != null && r5Var.f9464a != null && (k2Var = f3Var.f9568a.J3) != null) {
            k2Var.f(i10, i11);
        }
    }

    @Override
    public long i(long j3, long j10) {
        return 0L;
    }

    @Override
    public void j(Object obj) {
        int i10;
        Bundle extras;
        switch (this.f272a) {
            case 2:
                Map map = (Map) obj;
                j0 j0Var = (j0) this.f273b;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (((Boolean) arrayList.get(i11)).booleanValue()) {
                        i10 = 0;
                    } else {
                        i10 = -1;
                    }
                    iArr[i11] = i10;
                }
                f0 f0Var = (f0) j0Var.F.pollFirst();
                if (f0Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    return;
                }
                String str = f0Var.f1105a;
                if (j0Var.f1119c.l(str) == null) {
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    return;
                }
                return;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f273b;
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar.f603b;
                int i12 = u.e("ProxyBillingActivityV2", intent).f4308a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.N;
                if (resultReceiver != null) {
                    if (intent == null) {
                        extras = null;
                    } else {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(i12, extras);
                }
                int i13 = aVar.f602a;
                if (i13 != -1 || i12 != 0) {
                    u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i13 + " and billing's responseCode: " + i12);
                }
                proxyBillingActivityV2.finish();
                return;
        }
    }

    @Override
    public long k(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override
    public void l() {
        ((FfmpegAudioRenderer) this.f273b).f1349f0 = true;
    }

    @Override
    public m2.j m(long j3) {
        return (m2.j) this.f273b;
    }

    @Override
    public void n(k6.a aVar) {
        x xVar = (x) this.f273b;
        xVar.f4971o.lock();
        try {
            xVar.f4968l = aVar;
            x.l(xVar);
        } finally {
            xVar.f4971o.unlock();
        }
    }

    @Override
    public Object n2() {
        Type type = (Type) this.f273b;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            throw new RuntimeException("Invalid EnumSet type: " + type.toString());
        }
        throw new RuntimeException("Invalid EnumSet type: " + type.toString());
    }

    @Override
    public void o(l.l lVar) {
        g3 g3Var = ((ActionMenuView) this.f273b).K;
        if (g3Var != null) {
            g3Var.o(lVar);
        }
    }

    @Override
    public void o0(k2.k kVar) {
        of.b bVar = ((FfmpegAudioRenderer) this.f273b).I;
        Handler handler = (Handler) bVar.f14294b;
        if (handler != null) {
            handler.post(new k2.h(bVar, kVar, 1));
        }
    }

    @Override
    public void onAudioSessionIdChanged(int i10) {
        of.b bVar = ((FfmpegAudioRenderer) this.f273b).I;
        Handler handler = (Handler) bVar.f14294b;
        if (handler != null) {
            handler.post(new bi.s(bVar, i10, 10));
        }
    }

    @Override
    public void onSkipSilenceEnabledChanged(boolean z10) {
        of.b bVar = ((FfmpegAudioRenderer) this.f273b).I;
        Handler handler = (Handler) bVar.f14294b;
        if (handler != null) {
            handler.post(new ai.j(7, bVar, z10));
        }
    }

    @Override
    public void onSuccess(Object obj) {
        ((d6.a) this.f273b).getClass();
        h5.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    @Override
    public List q(long j3) {
        if (j3 >= 0) {
            return (List) this.f273b;
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public void r(k1 k1Var, int i10, int i11) {
        f3 f3Var;
        s9 textSelectionHelper;
        r5 r5Var = (r5) this.f273b;
        if (!r5Var.G && i10 != i11 && (f3Var = r5Var.E) != null && (textSelectionHelper = f3Var.f9568a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.y() || textSelectionHelper.W != r5Var) {
                r5Var.post(new b5(this, k1Var, i11, textSelectionHelper, i10, 4));
            }
        }
    }

    @Override
    public void r0(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        androidx.biometric.f0 f0Var = (androidx.biometric.f0) this.f273b;
        Handler handler = f0Var.A0;
        androidx.activity.i iVar = f0Var.B0;
        handler.removeCallbacks(iVar);
        TextView textView = f0Var.G0;
        if (textView != null) {
            textView.setText(charSequence);
        }
        handler.postDelayed(iVar, 2000L);
    }

    @Override
    public void s(Bitmap bitmap) {
        g6.b bVar = f6.i.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f7 = width;
            int height = bitmap.getHeight();
            int A = (int) a.A(f7, 9.0f, 16.0f, 0.5f);
            float f10 = (A - height) / 2.0f;
            RectF rectF = new RectF(0.0f, f10, f7, height + f10);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, A, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        ((f6.i) this.f273b).e(bitmap2, 0);
    }

    @Override
    public Task then(Object obj) {
        JSONObject jSONObject;
        FileWriter fileWriter;
        Void r13 = (Void) obj;
        da.b bVar = (da.b) this.f273b;
        c5.i iVar = (c5.i) bVar.f6355f;
        da.d dVar = (da.d) bVar.f6353b;
        String str = iVar.f4314a;
        FileWriter fileWriter2 = null;
        try {
            HashMap b10 = c5.i.b(dVar);
            aa.a aVar = new aa.a(str, b10);
            aVar.t("User-Agent", "Crashlytics Android SDK/18.6.0");
            aVar.t("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            c5.i.a(aVar, dVar);
            String str2 = "Requesting settings from " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            String str3 = "Settings query params were: " + b10;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str3, null);
            }
            jSONObject = iVar.c(aVar.k());
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Settings request failed.", e);
            jSONObject = null;
        }
        if (jSONObject != null) {
            da.a x10 = ((pb.c) bVar.f6354c).x(jSONObject);
            xa.c cVar = (xa.c) bVar.e;
            long j3 = x10.f6350c;
            cVar.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j3);
                fileWriter = new FileWriter((File) cVar.f45077b);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Exception e7) {
                        e = e7;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        w9.h.c(fileWriter, "Failed to close settings writer.");
                        da.b.f("Loaded settings: ", jSONObject);
                        String str4 = dVar.f6361f;
                        SharedPreferences.Editor edit = ((Context) bVar.f6352a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        edit.putString("existing_instance_identifier", str4);
                        edit.apply();
                        ((AtomicReference) bVar.h).set(x10);
                        ((TaskCompletionSource) ((AtomicReference) bVar.f6357i).get()).trySetResult(x10);
                        return Tasks.forResult(null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter2 = fileWriter;
                    w9.h.c(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e10) {
                e = e10;
                fileWriter = null;
            } catch (Throwable th3) {
                th = th3;
                w9.h.c(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            w9.h.c(fileWriter, "Failed to close settings writer.");
            da.b.f("Loaded settings: ", jSONObject);
            String str42 = dVar.f6361f;
            SharedPreferences.Editor edit2 = ((Context) bVar.f6352a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", str42);
            edit2.apply();
            ((AtomicReference) bVar.h).set(x10);
            ((TaskCompletionSource) ((AtomicReference) bVar.f6357i).get()).trySetResult(x10);
        }
        return Tasks.forResult(null);
    }

    @Override
    public int u() {
        return 1;
    }

    @Override
    public void v(int i10) {
        k6.a aVar;
        x xVar = (x) this.f273b;
        Lock lock = xVar.f4971o;
        lock.lock();
        try {
            if (!xVar.f4970n && (aVar = xVar.f4969m) != null && aVar.c()) {
                xVar.f4970n = true;
                xVar.e.onConnectionSuspended(i10);
                lock.unlock();
            }
            xVar.f4970n = false;
            x.k(xVar, i10);
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override
    public long w(long j3, long j10) {
        return 0L;
    }

    @Override
    public void y(int i10, long j3, long j10) {
        of.b bVar = ((FfmpegAudioRenderer) this.f273b).I;
        Handler handler = (Handler) bVar.f14294b;
        if (handler != null) {
            handler.post(new k2.i(bVar, i10, j3, j10, 0));
        }
    }

    @Override
    public void z(Bundle bundle) {
        x xVar = (x) this.f273b;
        xVar.f4971o.lock();
        try {
            Bundle bundle2 = xVar.f4967k;
            if (bundle2 == null) {
                xVar.f4967k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            xVar.f4968l = k6.a.e;
            x.l(xVar);
        } finally {
            xVar.f4971o.unlock();
        }
    }

    public m(Object obj, int i10) {
        this.f272a = i10;
        this.f273b = obj;
    }

    public m(int i10) {
        this.f272a = i10;
        switch (i10) {
            case 19:
                this.f273b = new xa.c(22);
                return;
            case 25:
                return;
            default:
                this.f273b = Collections.newSetFromMap(new WeakHashMap());
                return;
        }
    }

    public m(String str) {
        this.f272a = 11;
        str.getClass();
        this.f273b = str;
    }

    @Override
    public void j0() {
    }

    @Override
    public void m0() {
    }

    @Override
    public void p() {
    }

    @Override
    public void t() {
    }

    @Override
    public void N(boolean z10) {
    }

    @Override
    public void i0(boolean z10) {
    }

    @Override
    public void x(k1 k1Var) {
    }

    @Override
    public long c(long j3, long j10) {
        return j10;
    }
}
