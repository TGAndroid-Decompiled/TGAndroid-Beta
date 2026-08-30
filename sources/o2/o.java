package o2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.webkit.WebView;
import b7.y0;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.t;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import dg.b3;
import g.x;
import g5.n0;
import j$.util.Objects;
import j7.t5;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import k7.n6;
import k7.p7;
import l7.w0;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.c81;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.j81;
import org.telegram.ui.Components.l81;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.lq0;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.w50;
import org.telegram.ui.Components.x50;
import org.telegram.ui.Components.y4;
import org.telegram.ui.si0;
import org.telegram.ui.xn;
import ph.f0;
import ph.i5;
import ph.l5;
import q5.d0;
import q5.e0;
import sh.o0;
import sh.q;
import vh.p;
public final class o implements n, od.b, y4, ng.g, f71, j81, androidx.activity.result.b, SuccessContinuation, yf.m, s, n0, OnSuccessListener, ra.m, u5.o, sh.n0, td.a, v0.i {
    public final int f16219a;
    public Object f16220b;

    public o(Object obj, int i10) {
        this.f16219a = i10;
        this.f16220b = obj;
    }

    public float D(int i10, int i11, int i12, int i13) {
        boolean z4;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z10;
        int i21 = 1;
        if (Math.abs(i13 - i11) > Math.abs(i12 - i10)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
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
            if (z4) {
                i19 = i26;
            } else {
                i19 = i25;
            }
            if (z4) {
                i20 = i25;
            } else {
                i20 = i26;
            }
            boolean z11 = z4;
            if (i27 == i21) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i28 = abs;
            if (z10 == ((pb.b) this.f16220b).b(i19, i20)) {
                if (i27 == 2) {
                    return n6.b(i25, i26, i14, i15);
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
            z4 = z11;
            i21 = 1;
        }
        if (i27 == 2) {
            return n6.b(i24, i17, i14, i15);
        }
        return Float.NaN;
    }

    public float E(int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        pb.b bVar = (pb.b) this.f16220b;
        float D = D(i10, i11, i12, i13);
        int i14 = i10 - (i12 - i10);
        int i15 = 0;
        if (i14 < 0) {
            f10 = i10 / (i10 - i14);
            i14 = 0;
        } else {
            int i16 = bVar.f41096a;
            if (i14 >= i16) {
                int i17 = i16 - 1;
                f10 = ((i16 - 1) - i10) / (i14 - i10);
                i14 = i17;
            } else {
                f10 = 1.0f;
            }
        }
        float f12 = i11;
        int i18 = (int) (f12 - ((i13 - i11) * f10));
        if (i18 < 0) {
            f11 = f12 / (i11 - i18);
        } else {
            int i19 = bVar.f41097b;
            if (i18 >= i19) {
                f11 = ((i19 - 1) - i11) / (i18 - i11);
                i15 = i19 - 1;
            } else {
                i15 = i18;
                f11 = 1.0f;
            }
        }
        return (D(i10, i11, (int) (((i14 - i10) * f11) + i10), i15) + D) - 1.0f;
    }

    @Override
    public void G() {
        ((f0) this.f16220b).e.invalidate();
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        switch (this.f16219a) {
            case 3:
                org.telegram.ui.Components.f0 f0Var = (org.telegram.ui.Components.f0) this.f16220b;
                f0Var.l0(i10, i11, z4);
                f0Var.dismiss();
                return;
            default:
                ((p) this.f16220b).H(i10, z4, i11, false, 0L);
                p pVar = (p) this.f16220b;
                si0 si0Var = pVar.L;
                if (si0Var != null) {
                    si0Var.i();
                    pVar.L = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void Y(x xVar) {
        switch (this.f16219a) {
            case 4:
                xVar.a(((li) this.f16220b).getThemedColor(j6.f19906d6));
                xVar.b(SharedConfig.chatBlurEnabled());
                return;
            default:
                xVar.a(((lq0) this.f16220b).getThemedColor(j6.f19906d6));
                xVar.b(SharedConfig.chatBlurEnabled());
                return;
        }
    }

    @Override
    public void a() {
        r4.g gVar = (r4.g) this.f16220b;
        gVar.B.a();
        y0 y0Var = gVar.D;
        if (y0Var == null) {
            return;
        }
        throw y0Var;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f16219a) {
            case 14:
                u5.x xVar = (u5.x) obj;
                u5.f fVar = (u5.f) xVar.u();
                d0 d0Var = ((e0) this.f16220b).f42789k;
                Parcel M0 = fVar.M0();
                t.d(M0, d0Var);
                fVar.R0(M0, 18);
                u5.f fVar2 = (u5.f) xVar.u();
                fVar2.R0(fVar2.M0(), 17);
                ((TaskCompletionSource) obj2).setResult(null);
                return;
            default:
                v6.f fVar3 = new v6.f(0, (TaskCompletionSource) obj2);
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i10 = e7.a.f5152a;
                obtain.writeStrongBinder(fVar3);
                e7.a.b(obtain, (u6.f) this.f16220b);
                e7.a.b(obtain, gVar);
                ((v6.b) ((v6.d) ((v6.e) obj).u())).E0(obtain, 6);
                return;
        }
    }

    @Override
    public void b(long j10) {
        ((q) this.f16220b).presentFragment(xn.R9(j10));
    }

    @Override
    public void c(String str, long j10, long j11, long j12) {
        s5.o oVar = (s5.o) this.f16220b;
        try {
            oVar.a(new s5.n(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e) {
            u5.b bVar = s5.h.f44071k;
            Log.e(bVar.f45098a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e);
        }
        Iterator it = oVar.f44094q.f44077i.iterator();
        while (it.hasNext()) {
            ((s5.g) it.next()).h(str, j10, 2103, j11, j12);
        }
    }

    @Override
    public void close() {
        ((q) this.f16220b).finishFragment();
    }

    @Override
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) ee.b.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f16220b).createWebView(webView));
    }

    @Override
    public void d() {
        boolean z4;
        q qVar = (q) this.f16220b;
        xd.a aVar = qVar.f44401a;
        o0 o0Var = qVar.v;
        if (o0Var.f44394n && o0Var.f44392l == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        aVar.a(z4, true);
        qVar.d.V2.N(true);
    }

    @Override
    public String[] e() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f16220b).getSupportedFeatures();
    }

    @Override
    public void f(Object obj) {
        Bundle extras;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f16220b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f330b;
        int i10 = aVar.f329a;
        if (intent == null) {
            extras = null;
        } else {
            extras = intent.getExtras();
        }
        if (i10 != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            u.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i10);
            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i10);
        }
        int i11 = u.e("ProxyBillingActivityV2", intent).f40993a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.L;
        if (resultReceiver != null) {
            resultReceiver.send(i11, extras);
        } else {
            u.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
        }
        if (i11 != 0) {
            u.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i11);
        }
        proxyBillingActivityV2.finish();
    }

    @Override
    public void g(java.lang.String r14, long r15, int r17, java.lang.Object r18, long r19, long r21) {
        throw new UnsupportedOperationException("Method not decompiled: o2.o.g(java.lang.String, long, int, java.lang.Object, long, long):void");
    }

    @Override
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) ee.b.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f16220b).getStatics());
    }

    public void h(StringBuilder sb, AbstractCollection abstractCollection) {
        CharSequence obj;
        CharSequence obj2;
        Iterator it = abstractCollection.iterator();
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                if (next instanceof CharSequence) {
                    obj = (CharSequence) next;
                } else {
                    obj = next.toString();
                }
                sb.append(obj);
                while (it.hasNext()) {
                    sb.append((CharSequence) ((String) this.f16220b));
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    if (next2 instanceof CharSequence) {
                        obj2 = (CharSequence) next2;
                    } else {
                        obj2 = next2.toString();
                    }
                    sb.append(obj2);
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public float i(ub.c cVar, ub.c cVar2) {
        int i10 = (int) cVar.f16536b;
        int i11 = (int) cVar2.f16536b;
        float E = E((int) cVar.f16535a, i10, (int) cVar2.f16535a, i11);
        float E2 = E((int) cVar2.f16535a, i11, (int) cVar.f16535a, i10);
        if (Float.isNaN(E)) {
            return E2 / 7.0f;
        }
        if (Float.isNaN(E2)) {
            return E / 7.0f;
        }
        return (E + E2) / 14.0f;
    }

    public boolean j(int i10) {
        c81 c81Var = ((l81) this.f16220b).I;
        if (c81Var == null) {
            return false;
        }
        return c81Var.c(i10);
    }

    @Override
    public void k(Canvas canvas) {
        switch (this.f16219a) {
            case 4:
                li liVar = (li) this.f16220b;
                canvas.drawColor(liVar.getThemedColor(j6.f19906d6));
                if (SharedConfig.chatBlurEnabled()) {
                    liVar.f26765z2.b(canvas, -3);
                    return;
                }
                return;
            default:
                lq0 lq0Var = (lq0) this.f16220b;
                canvas.drawColor(lq0Var.getThemedColor(j6.f19906d6));
                if (SharedConfig.chatBlurEnabled()) {
                    lq0Var.L0.b(canvas, -3);
                    return;
                }
                return;
        }
    }

    public void l(Runnable runnable) {
        Runnable runnable2 = (Runnable) ((HashMap) this.f16220b).remove(runnable);
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
        }
    }

    public void m() {
        HashMap hashMap = (HashMap) this.f16220b;
        for (Map.Entry entry : hashMap.entrySet()) {
            AndroidUtilities.cancelRunOnUIThread((Runnable) entry.getValue());
        }
        hashMap.clear();
    }

    public int n(int i10, int[] iArr) {
        int[] iArr2;
        int[] iArr3;
        int i11;
        int i12;
        int i13;
        rb.a aVar = (rb.a) this.f16220b;
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
            boolean z4 = true;
            for (int i16 = 0; i16 < i10; i16++) {
                int i17 = aVar.f43435a[aVar.f43439g + i16];
                if (i17 == 0) {
                    i13 = iArr2[iArr2.length - 1];
                } else {
                    if (i17 == 1) {
                        i12 = 0;
                        for (int i18 : iArr2) {
                            rb.a aVar2 = rb.a.h;
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
                    z4 = false;
                }
            }
            if (z4) {
                return 0;
            }
            rb.b bVar = new rb.b(aVar, iArr5);
            rb.b a2 = aVar.a(i10, 1);
            rb.b bVar2 = aVar.f43437c;
            if (a2.d() >= bVar.d()) {
                a2 = bVar;
                bVar = a2;
            }
            rb.b bVar3 = aVar.d;
            rb.b bVar4 = a2;
            rb.b bVar5 = bVar;
            rb.b bVar6 = bVar4;
            rb.b bVar7 = bVar2;
            while (bVar6.d() * 2 >= i10) {
                if (!bVar6.e()) {
                    int b10 = aVar.b(bVar6.c(bVar6.d()));
                    rb.b bVar8 = bVar2;
                    while (bVar5.d() >= bVar6.d() && !bVar5.e()) {
                        int d = bVar5.d() - bVar6.d();
                        int c3 = aVar.c(bVar5.c(bVar5.d()), b10);
                        bVar8 = bVar8.a(aVar.a(d, c3));
                        bVar5 = bVar5.a(bVar6.h(d, c3));
                    }
                    rb.b a10 = bVar8.g(bVar3).a(bVar7);
                    if (bVar5.d() < bVar6.d()) {
                        rb.b bVar9 = bVar5;
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
            int c10 = bVar3.c(0);
            if (c10 != 0) {
                int b11 = aVar.b(c10);
                rb.b[] bVarArr = {bVar3.f(b11), bVar6.f(b11)};
                rb.b bVar10 = bVarArr[0];
                rb.b bVar11 = bVarArr[1];
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
                            int c11 = aVar.c(iArr3[i24], b12);
                            if ((c11 & 1) == 0) {
                                i11 = c11 | 1;
                            } else {
                                i11 = c11 & (-2);
                            }
                            i23 = aVar.c(i23, i11);
                        }
                    }
                    int c12 = aVar.c(bVar11.b(b12), aVar.b(i23));
                    iArr7[i22] = c12;
                    if (aVar.f43439g != 0) {
                        iArr7[i22] = aVar.c(c12, b12);
                    }
                }
                for (int i25 = 0; i25 < iArr3.length; i25++) {
                    int length4 = iArr.length - 1;
                    int i26 = iArr3[i25];
                    if (i26 != 0) {
                        int i27 = length4 - aVar.f43436b[i26];
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

    public ub.a o(float f10, float f11, int i10, int i11) {
        int i12;
        ub.a b10;
        ub.a b11;
        int i13 = (int) (f11 * f10);
        int max = Math.max(0, i10 - i13);
        pb.b bVar = (pb.b) this.f16220b;
        int min = Math.min(bVar.f41096a - 1, i10 + i13) - max;
        float f12 = 3.0f * f10;
        if (min >= f12) {
            int max2 = Math.max(0, i11 - i13);
            int min2 = Math.min(bVar.f41097b - 1, i11 + i13) - max2;
            if (min2 >= f12) {
                pb.b bVar2 = (pb.b) this.f16220b;
                ub.b bVar3 = new ub.b(bVar2, max, max2, min, min2, f10);
                int i14 = bVar3.e;
                int i15 = bVar3.f45208c;
                int i16 = i14 + i15;
                int i17 = bVar3.f45209f;
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
                ArrayList arrayList = bVar3.f45207b;
                if (!arrayList.isEmpty()) {
                    return (ub.a) arrayList.get(0);
                }
                throw ob.e.a();
            }
            throw ob.e.a();
        }
        throw ob.e.a();
    }

    @Override
    public void onError(Object obj) {
        w0.d e = (w0.d) obj;
        kotlin.jvm.internal.j.e(e, "e");
        ld.m mVar = (ld.m) this.f16220b;
        if (mVar.w()) {
            mVar.resumeWith(p7.a(e));
        }
    }

    @Override
    public void onRenderedFirstFrame() {
        int i10 = this.f16219a;
    }

    @Override
    public void onResult(Object obj) {
        v0.c result = (v0.c) obj;
        kotlin.jvm.internal.j.e(result, "result");
        ld.m mVar = (ld.m) this.f16220b;
        if (mVar.w()) {
            mVar.resumeWith(result);
        }
    }

    @Override
    public void onSeekFinished(k3.a aVar) {
        int i10 = this.f16219a;
    }

    @Override
    public void onSeekStarted(k3.a aVar) {
        int i10 = this.f16219a;
    }

    @Override
    public void onStateChanged(boolean z4, int i10) {
        x50 x50Var;
        VideoEditedInfo videoEditedInfo;
        switch (this.f16219a) {
            case 5:
                w50 w50Var = (w50) this.f16220b;
                i71 i71Var = w50Var.E0.L;
                if (i71Var != null && i71Var.y() && i10 == 4 && (videoEditedInfo = (x50Var = w50Var.E0).K) != null) {
                    i71 i71Var2 = x50Var.L;
                    long j10 = videoEditedInfo.startTime;
                    if (j10 <= 0) {
                        j10 = 0;
                    }
                    i71Var2.K(j10);
                    return;
                }
                return;
            default:
                l5 l5Var = (l5) this.f16220b;
                i5 i5Var = l5Var.J;
                i71 i71Var3 = l5Var.f41908x;
                if (i71Var3 != null) {
                    if (i71Var3.y()) {
                        AndroidUtilities.runOnUIThread(i5Var);
                        return;
                    } else {
                        AndroidUtilities.cancelRunOnUIThread(i5Var);
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void onSuccess(Object obj) {
        ((r5.a) this.f16220b).getClass();
        t5.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f16219a) {
            case 5:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        int i10 = this.f16219a;
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        switch (this.f16219a) {
            case 5:
                return;
            default:
                l5 l5Var = (l5) this.f16220b;
                l5Var.getClass();
                l5Var.getClass();
                b3 b3Var = l5Var.f41906w;
                if (b3Var != null) {
                    float f11 = i10 / i11;
                    if (Math.abs(b3Var.f4401v0 - f11) >= 1.0E-4f) {
                        b3Var.f4401v0 = f11;
                        b3Var.requestLayout();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public void q(float f10) {
        l81 l81Var = (l81) this.f16220b;
        if (f10 == 1.0f) {
            View[] viewArr = l81Var.e;
            View[] viewArr2 = l81Var.e;
            if (viewArr[1] != null) {
                l81Var.F();
                l81Var.h.put(l81Var.f26595f[1], viewArr2[1]);
                l81Var.removeView(viewArr2[1]);
                l81Var.E(viewArr2[0], 0.0f);
                viewArr2[1] = null;
            }
            l81Var.z(l81Var.f26593b);
            return;
        }
        View[] viewArr3 = l81Var.e;
        View[] viewArr4 = l81Var.e;
        View view = viewArr3[1];
        if (view == null) {
            return;
        }
        if (l81Var.f26601y) {
            l81Var.E(view, (1.0f - f10) * viewArr3[0].getMeasuredWidth());
            View view2 = viewArr4[0];
            l81Var.E(view2, (-view2.getMeasuredWidth()) * f10);
        } else {
            l81Var.E(view, (1.0f - f10) * (-viewArr3[0].getMeasuredWidth()));
            View view3 = viewArr4[0];
            l81Var.E(view3, view3.getMeasuredWidth() * f10);
        }
        l81Var.w(false);
    }

    @Override
    public Object s2() {
        Type type = (Type) this.f16220b;
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
    public Task then(Object obj) {
        JSONObject jSONObject;
        FileWriter fileWriter;
        Void r13 = (Void) obj;
        e3.g gVar = (e3.g) this.f16220b;
        com.google.android.gms.internal.clearcut.e eVar = (com.google.android.gms.internal.clearcut.e) gVar.f5098f;
        p9.c cVar = (p9.c) gVar.f5096b;
        String str = eVar.f3292a;
        FileWriter fileWriter2 = null;
        try {
            HashMap b10 = com.google.android.gms.internal.clearcut.e.b(cVar);
            w0 w0Var = new w0(str, b10);
            w0Var.w("User-Agent", "Crashlytics Android SDK/18.6.0");
            w0Var.w("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            com.google.android.gms.internal.clearcut.e.a(w0Var, cVar);
            String str2 = "Requesting settings from " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            String str3 = "Settings query params were: " + b10;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str3, null);
            }
            jSONObject = eVar.c(w0Var.p());
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Settings request failed.", e);
            jSONObject = null;
        }
        if (jSONObject != null) {
            p9.a f10 = ((qk0) gVar.f5097c).f(jSONObject);
            f1 f1Var = (f1) gVar.e;
            long j10 = f10.f41063c;
            f1Var.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j10);
                fileWriter = new FileWriter((File) f1Var.f21045b);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Exception e6) {
                        e = e6;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        i9.h.c(fileWriter, "Failed to close settings writer.");
                        e3.g.f("Loaded settings: ", jSONObject);
                        String str4 = cVar.f41068f;
                        SharedPreferences.Editor edit = ((Context) gVar.f5095a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        edit.putString("existing_instance_identifier", str4);
                        edit.apply();
                        ((AtomicReference) gVar.h).set(f10);
                        ((TaskCompletionSource) ((AtomicReference) gVar.f5100i).get()).trySetResult(f10);
                        return Tasks.forResult(null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter2 = fileWriter;
                    i9.h.c(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e10) {
                e = e10;
                fileWriter = null;
            } catch (Throwable th3) {
                th = th3;
                i9.h.c(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            i9.h.c(fileWriter, "Failed to close settings writer.");
            e3.g.f("Loaded settings: ", jSONObject);
            String str42 = cVar.f41068f;
            SharedPreferences.Editor edit2 = ((Context) gVar.f5095a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", str42);
            edit2.apply();
            ((AtomicReference) gVar.h).set(f10);
            ((TaskCompletionSource) ((AtomicReference) gVar.f5100i).get()).trySetResult(f10);
        }
        return Tasks.forResult(null);
    }

    @Override
    public java.lang.Object z(od.c r7, wc.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: o2.o.z(od.c, wc.c):java.lang.Object");
    }

    public o(int i10) {
        this.f16219a = i10;
        switch (i10) {
            case 9:
                return;
            case 23:
                this.f16220b = new SparseArray();
                return;
            default:
                this.f16220b = new HashMap();
                return;
        }
    }

    @Override
    public void onRenderedFirstFrame(k3.a aVar) {
        int i10 = this.f16219a;
    }

    @Override
    public void onError(i71 i71Var, Exception exc) {
        switch (this.f16219a) {
            case 5:
                FileLog.e(exc);
                return;
            default:
                return;
        }
    }

    public o(String str) {
        this.f16219a = 18;
        str.getClass();
        this.f16220b = str;
    }

    private final void r() {
    }

    private final void t() {
    }

    @Override
    public void c0() {
    }

    private final void A(SurfaceTexture surfaceTexture) {
    }

    private final void B(SurfaceTexture surfaceTexture) {
    }

    private final void s(k3.a aVar) {
    }

    private final void u(k3.a aVar) {
    }

    private final void v(k3.a aVar) {
    }

    private final void w(k3.a aVar) {
    }

    private final void x(k3.a aVar) {
    }

    private final void y(k3.a aVar) {
    }

    @Override
    public void H(boolean z4) {
    }

    @Override
    public void b0(boolean z4) {
    }

    private final void p(i71 i71Var, Exception exc) {
    }

    private final void C(int i10, int i11, float f10, int i12) {
    }
}
