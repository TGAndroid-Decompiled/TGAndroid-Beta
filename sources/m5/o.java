package m5;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.util.Log;
import android.view.GestureDetector;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.lifecycle.m0;
import androidx.lifecycle.s0;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.internal.cast.c1;
import com.google.android.gms.internal.cast.c2;
import com.google.android.gms.internal.cast.o0;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import m.t3;
import oh.p0;
import oh.q0;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.iq0;
import org.telegram.ui.Components.j50;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.k50;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.ng0;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Components.x4;
import org.telegram.ui.i6;
import org.telegram.ui.rn;
import rh.b2;
import rh.b4;
import rh.d1;
import rh.d3;
import rh.i3;
import rh.j3;
import rh.m3;
import rh.m4;
import rh.n3;
import rh.o3;
import rh.p3;
import rh.t5;
import rh.x1;

public class o implements androidx.activity.result.b, OnSuccessListener, r5.o, oa.m, p0, x4, jg.g, j61, n71, ma.n, rh.g0, n3, com.google.android.gms.common.api.internal.s, r4.g, s0 {

    public final int f17822a;

    public Object f17823b;

    public o(Object obj, int i10) {
        this.f17822a = i10;
        this.f17823b = obj;
    }

    @Override
    public void A(g.y yVar) {
        switch (this.f17822a) {
            case 9:
                yVar.a(((gi) this.f17823b).getThemedColor(g6.f23053d6));
                yVar.b(SharedConfig.chatBlurEnabled());
                break;
            default:
                yVar.a(((sp0) this.f17823b).getThemedColor(g6.f23053d6));
                yVar.b(SharedConfig.chatBlurEnabled());
                break;
        }
    }

    @Override
    public b70 A1(View view) {
        return b70.H((x1) this.f17823b, view);
    }

    public float B(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = 1;
        boolean z10 = Math.abs(i13 - i11) > Math.abs(i12 - i10);
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
        int iAbs = Math.abs(i16 - i14);
        int iAbs2 = Math.abs(i17 - i15);
        int i19 = (-iAbs) / 2;
        int i20 = i14 < i16 ? 1 : -1;
        int i21 = i15 < i17 ? 1 : -1;
        int i22 = i16 + i20;
        int i23 = i14;
        int i24 = i15;
        int i25 = 0;
        while (i23 != i22) {
            boolean z11 = z10;
            int i26 = iAbs;
            if ((i25 == i18) == ((mb.b) this.f17823b).b(z10 ? i24 : i23, z10 ? i23 : i24)) {
                if (i25 == 2) {
                    return h7.y.b(i23, i24, i14, i15);
                }
                i25++;
            }
            i19 += iAbs2;
            if (i19 > 0) {
                if (i24 == i17) {
                    break;
                }
                i24 += i21;
                i19 -= i26;
            }
            i23 += i20;
            iAbs = i26;
            z10 = z11;
            i18 = 1;
        }
        if (i25 == 2) {
            return h7.y.b(i22, i17, i14, i15);
        }
        return Float.NaN;
    }

    @Override
    public void C(m3 m3Var, View view) {
        x1 x1Var = (x1) this.f17823b;
        b70 b70VarH = b70.H(x1Var, view);
        b70VarH.Q = true;
        x1Var.f47573t0 = b4.c(b70VarH, x1Var, x1Var.getParentActivity(), x1Var.getResourceProvider(), m3Var, false);
    }

    public float D(int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        mb.b bVar = (mb.b) this.f17823b;
        float fB = B(i10, i11, i12, i13);
        int i14 = i10 - (i12 - i10);
        int i15 = 0;
        if (i14 < 0) {
            f10 = i10 / (i10 - i14);
            i14 = 0;
        } else {
            int i16 = bVar.f17919a;
            if (i14 >= i16) {
                float f12 = ((i16 - 1) - i10) / (i14 - i10);
                int i17 = i16 - 1;
                f10 = f12;
                i14 = i17;
            } else {
                f10 = 1.0f;
            }
        }
        float f13 = i11;
        int i18 = (int) (f13 - ((i13 - i11) * f10));
        if (i18 < 0) {
            f11 = f13 / (i11 - i18);
        } else {
            int i19 = bVar.f17920b;
            if (i18 >= i19) {
                f11 = ((i19 - 1) - i11) / (i18 - i11);
                i15 = i19 - 1;
            } else {
                i15 = i18;
                f11 = 1.0f;
            }
        }
        return (B(i10, i11, (int) (((i14 - i10) * f11) + i10), i15) + fB) - 1.0f;
    }

    @Override
    public void D0() {
        x1 x1Var = (x1) this.f17823b;
        x1Var.E0 = x1Var.G0;
        x1.Z(x1Var, false, false);
        x1Var.x0(2, true);
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.f17823b;
        e0Var.l0(i10, i11, z10);
        e0Var.dismiss();
    }

    @Override
    public void I0() {
        switch (this.f17822a) {
            case 18:
                rh.x xVar = (rh.x) this.f17823b;
                j3 j3Var = xVar.K;
                if (j3Var != null) {
                    rh.a aVar = xVar.f47594a;
                    p3 p3Var = j3Var.f47223a;
                    b2 b2Var = p3Var.F3;
                    if (b2Var != null) {
                        b2Var.g();
                    }
                    p3Var.f47340d3.onContentChanged();
                }
                break;
            default:
                m4 m4Var = (m4) this.f17823b;
                i3 i3Var = m4Var.J;
                if (i3Var != null) {
                    rh.a aVar2 = m4Var.f47594a;
                    p3 p3Var2 = i3Var.f47191a;
                    b2 b2Var2 = p3Var2.F3;
                    if (b2Var2 != null) {
                        b2Var2.g();
                    }
                    p3Var2.f47340d3.onContentChanged();
                }
                break;
        }
    }

    @Override
    public void J1() {
        x1 x1Var = (x1) this.f17823b;
        x1Var.z0();
        x1Var.C0();
    }

    @Override
    public j9 N() {
        switch (this.f17822a) {
            case 18:
                j3 j3Var = ((rh.x) this.f17823b).K;
                if (j3Var != null) {
                    return j3Var.f47223a.getTextSelectionHelper();
                }
                return null;
            default:
                i3 i3Var = ((m4) this.f17823b).J;
                if (i3Var != null) {
                    return i3Var.f47191a.getTextSelectionHelper();
                }
                return null;
        }
    }

    @Override
    public void S(CharSequence charSequence) {
        switch (this.f17822a) {
            case 18:
                j3 j3Var = ((rh.x) this.f17823b).K;
                if (j3Var != null) {
                    j3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        j3Var.f47223a.t4(charSequence.toString());
                        break;
                    }
                }
                break;
            default:
                i3 i3Var = ((m4) this.f17823b).J;
                if (i3Var != null) {
                    i3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        i3Var.f47191a.t4(charSequence.toString());
                        break;
                    }
                }
                break;
        }
    }

    @Override
    public void S1(o3 o3Var, View view) {
        x1 x1Var = (x1) this.f17823b;
        b70 b70VarH = b70.H(x1Var, view);
        b70VarH.Q = true;
        x1Var.getParentActivity();
        x1Var.getResourceProvider();
        x1Var.f47573t0 = b4.b(b70VarH, x1Var, o3Var, false);
    }

    @Override
    public void X0() {
        switch (this.f17822a) {
            case 18:
                rh.x xVar = (rh.x) this.f17823b;
                j3 j3Var = xVar.K;
                if (j3Var != null) {
                    rh.a aVar = xVar.f47594a;
                    p3.O1(j3Var.f47223a);
                }
                break;
            default:
                m4 m4Var = (m4) this.f17823b;
                i3 i3Var = m4Var.J;
                if (i3Var != null) {
                    rh.a aVar2 = m4Var.f47594a;
                    p3.O1(i3Var.f47191a);
                }
                break;
        }
    }

    @Override
    public void a(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f17823b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f907b;
        int i10 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).f18147a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.I;
        if (resultReceiver != null) {
            resultReceiver.send(i10, intent == null ? null : intent.getExtras());
        }
        int i11 = aVar.f906a;
        if (i11 != -1 || i10 != 0) {
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i11 + " and billing's responseCode: " + i10);
        }
        proxyBillingActivityV2.finish();
    }

    @Override
    public void a0(t5 t5Var, String str) {
        x1 x1Var = (x1) this.f17823b;
        if (x1Var.f47575v0 == null) {
            x1Var.f47575v0 = new t3(new lh.p(this, 22), x1Var.getResourceProvider());
        }
        x1Var.f47575v0.f(t5Var, str);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f17822a) {
            case 22:
                GetCredentialRequest getCredentialRequest = (GetCredentialRequest) this.f17823b;
                s6.f fVar = new s6.f(1, (TaskCompletionSource) obj2);
                s6.d dVar = (s6.d) ((s6.e) obj).u();
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i10 = b7.b.f2036a;
                parcelObtain.writeStrongBinder(fVar);
                b7.b.b(parcelObtain, getCredentialRequest);
                b7.b.b(parcelObtain, gVar);
                ((s6.b) dVar).E0(parcelObtain, 1);
                break;
            default:
                k5.l lVar = new k5.l((TaskCompletionSource) obj2);
                t6.i iVar = (t6.i) ((t6.c) obj).u();
                h5.e eVar = (h5.e) this.f17823b;
                Parcel parcelI0 = iVar.I0();
                int i11 = t6.f.f48106a;
                parcelI0.writeStrongBinder(lVar);
                t6.f.c(parcelI0, eVar);
                iVar.J0(parcelI0, 1);
                break;
        }
    }

    @Override
    public void b(long j10) {
        ((oh.r) this.f17823b).presentFragment(rn.R9(j10));
    }

    @Override
    public int c(long j10) {
        return -1;
    }

    @Override
    public void c0(int i10) {
        ((x1) this.f17823b).o0(74, i10);
    }

    @Override
    public void close() {
        ((oh.r) this.f17823b).finishFragment();
    }

    @Override
    public void d(String str, long j10, long j11, long j12) {
        o5.n nVar = (o5.n) this.f17823b;
        try {
            nVar.a(new o5.m(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e9) {
            r5.b bVar = o5.h.f19330k;
            Log.e(bVar.f46768a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e9);
        }
        Iterator it = nVar.f19351q.f19337i.iterator();
        while (it.hasNext()) {
            ((o5.g) it.next()).h(str, j10, 2103, j11, j12);
        }
    }

    @Override
    public androidx.lifecycle.p0 e(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override
    public long f(int i10) {
        return 0L;
    }

    @Override
    public Object f2() {
        Type type = (Type) this.f17823b;
        if (!(type instanceof ParameterizedType)) {
            throw new ma.j("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new ma.j("Invalid EnumMap type: " + type.toString());
    }

    @Override
    public void g(d1 d1Var) {
        switch (this.f17822a) {
            case 18:
                j3 j3Var = ((rh.x) this.f17823b).K;
                if (j3Var != null) {
                    p3 p3Var = j3Var.f47223a;
                    p3.M1(p3Var, d1Var);
                    p3Var.f47340d3.n0(d1Var, true);
                }
                break;
            default:
                i3 i3Var = ((m4) this.f17823b).J;
                if (i3Var != null) {
                    p3 p3Var2 = i3Var.f47191a;
                    p3.M1(p3Var2, d1Var);
                    p3Var2.f47340d3.n0(d1Var, true);
                }
                break;
        }
    }

    @Override
    public List h(long j10) {
        return (List) this.f17823b;
    }

    @Override
    public void h0() {
        x1 x1Var = (x1) this.f17823b;
        d3 d3Var = x1Var.L.f47352j3;
        x1Var.x0((d3Var != null && d3Var.y() && x1Var.L.C4()) ? 1 : 0, true);
        x1Var.y0();
        x1Var.w0();
    }

    @Override
    public void i() {
        oh.r rVar = (oh.r) this.f17823b;
        ud.a aVar = rVar.f19563a;
        q0 q0Var = rVar.v;
        aVar.a(q0Var.f19558n && q0Var.f19556l == 0, true);
        rVar.d.U2.N(true);
    }

    @Override
    public void j(String str, long j10, int i10, Object obj, long j11, long j12) {
        int i11;
        o5.n nVar = (o5.n) this.f17823b;
        try {
            i11 = i10;
            try {
                Status status = new Status(i11, null, null, null);
                Object obj2 = true == (obj instanceof r5.m) ? obj : null;
                if (obj2 != null) {
                }
                if (obj2 != null) {
                }
                nVar.a(new o5.m(status, 2));
            } catch (IllegalStateException e9) {
                e = e9;
                r5.b bVar = o5.h.f19330k;
                Log.e(bVar.f46768a, bVar.d("Result already set when calling onRequestCompleted", new Object[0]), e);
            }
        } catch (IllegalStateException e10) {
            e = e10;
            i11 = i10;
        }
        Iterator it = nVar.f19351q.f19337i.iterator();
        while (it.hasNext()) {
            ((o5.g) it.next()).h(str, j10, i11, j11, j12);
            i11 = i10;
        }
    }

    public p k() {
        p pVar = (p) this.f17823b;
        if (pVar.f17824a == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        if (!Double.isNaN(pVar.d) && pVar.d < 0.0d) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        }
        if (Double.isNaN(pVar.f17827e)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        if (Double.isNaN(pVar.f17828f) || pVar.f17828f < 0.0d) {
            throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
        }
        return pVar;
    }

    @Override
    public boolean l(float f10) {
        boolean z10;
        x1 x1Var = (x1) this.f17823b;
        FrameLayout frameLayout = x1Var.f47570r0;
        if (frameLayout == null) {
            z10 = false;
        } else {
            int[] iArr = new int[2];
            frameLayout.getLocationOnScreen(iArr);
            if (f10 >= iArr[1]) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        x1.Z(x1Var, z10, true);
        return z10;
    }

    @Override
    public void l2(rh.a aVar) {
        x1 x1Var = (x1) this.f17823b;
        if (aVar != null && (aVar.f47028b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(x1Var)) {
            gi giVar = new gi(x1Var.getParentActivity(), x1Var, false, false, false, x1Var.getResourceProvider());
            giVar.V1 = new ab.a(22);
            giVar.L = true;
            giVar.f28694t1.setVisibility(8);
            giVar.f28681p2 = new iq0(x1Var, aVar, giVar, 6);
            giVar.r1();
            giVar.show();
        }
    }

    @Override
    public void m() {
        switch (this.f17822a) {
            case 18:
                rh.x xVar = (rh.x) this.f17823b;
                j3 j3Var = xVar.K;
                if (j3Var != null) {
                    p3.P1(j3Var.f47223a, xVar.f47594a);
                }
                break;
            default:
                m4 m4Var = (m4) this.f17823b;
                i3 i3Var = m4Var.J;
                if (i3Var != null) {
                    p3.P1(i3Var.f47191a, m4Var.f47594a);
                }
                break;
        }
    }

    @Override
    public void n(Canvas canvas) {
        switch (this.f17822a) {
            case 9:
                gi giVar = (gi) this.f17823b;
                canvas.drawColor(giVar.getThemedColor(g6.f23053d6));
                if (SharedConfig.chatBlurEnabled()) {
                    giVar.f28713y2.b(canvas, -3);
                }
                break;
            default:
                sp0 sp0Var = (sp0) this.f17823b;
                canvas.drawColor(sp0Var.getThemedColor(g6.f23053d6));
                if (SharedConfig.chatBlurEnabled()) {
                    sp0Var.K0.b(canvas, -3);
                }
                break;
        }
    }

    public float o(rb.c cVar, rb.c cVar2) {
        int i10 = (int) cVar.f15529a;
        int i11 = (int) cVar.f15530b;
        int i12 = (int) cVar2.f15529a;
        int i13 = (int) cVar2.f15530b;
        float fD = D(i10, i11, i12, i13);
        float fD2 = D((int) cVar2.f15529a, i13, (int) cVar.f15529a, i11);
        if (Float.isNaN(fD)) {
            return fD2 / 7.0f;
        }
        return Float.isNaN(fD2) ? fD / 7.0f : (fD + fD2) / 14.0f;
    }

    @Override
    public void onContentChanged() {
        x1 x1Var = (x1) this.f17823b;
        if (x1Var.f47574u0 != null) {
            boolean zM3 = x1Var.L.m3();
            x1Var.H0 = zM3;
            x1Var.f47574u0.h(zM3);
            x1Var.f47574u0.invalidate();
        }
        x1Var.C0();
        Runnable runnable = x1Var.I0;
        AndroidUtilities.cancelRunOnUIThread(runnable);
        AndroidUtilities.runOnUIThread(runnable, 1000L);
    }

    @Override
    public void onError(m61 m61Var, Exception exc) {
        FileLog.e(exc);
    }

    @Override
    public void onRenderedFirstFrame(i3.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        k50 k50Var;
        VideoEditedInfo videoEditedInfo;
        j50 j50Var = (j50) this.f17823b;
        m61 m61Var = j50Var.D0.K;
        if (m61Var != null && m61Var.z() && i10 == 4 && (videoEditedInfo = (k50Var = j50Var.D0).J) != null) {
            m61 m61Var2 = k50Var.K;
            long j10 = videoEditedInfo.startTime;
            if (j10 <= 0) {
                j10 = 0;
            }
            m61Var2.L(j10);
        }
    }

    @Override
    public void onSuccess(Object obj) {
        c2 c2Var;
        c1 c1VarB;
        n5.a aVar = (n5.a) this.f17823b;
        Bundle bundle = (Bundle) obj;
        if (o0.f3602j) {
            Context context = aVar.f18279a;
            r5.s sVar = aVar.f18283f;
            o0 o0Var = new o0(context, sVar, aVar.f18281c, aVar.f18286j, aVar.f18284g);
            int i10 = bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE") ? bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0) : (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) ? 1 : 0;
            boolean z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
            if (i10 == 0) {
                if (!z10) {
                    return;
                }
                i10 = 0;
                z10 = true;
            }
            String packageName = context.getPackageName();
            Locale locale = Locale.ROOT;
            String strL = s3.c.l(packageName, ".client_cast_analytics_data");
            o0Var.h = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0 ? 1 : 2;
            w2.q.b(context);
            o0Var.f3608g = w2.q.a().c(u2.a.f48257e).a("CAST_SENDER_SDK", new t2.c("proto"), com.google.android.gms.internal.cast.z.f3744a);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                o0Var.f3606e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(strL, 0);
            if (i10 != 0) {
                com.google.android.gms.common.api.internal.v vVarB = com.google.android.gms.common.api.internal.w.b();
                vVarB.f3359c = new m3.y(sVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"});
                vVarB.d = new v5.c[]{z.f17869c};
                vVarB.f3358b = false;
                vVarB.f3357a = 8426;
                Task taskE = sVar.e(0, vVarB.b());
                d5.x xVar = new d5.x();
                xVar.f4850b = o0Var;
                xVar.f4851c = packageName;
                xVar.f4849a = i10;
                xVar.d = sharedPreferences;
                taskE.addOnSuccessListener(xVar);
            }
            if (z10) {
                y5.l.h(sharedPreferences);
                r5.b bVar = c2.f3487i;
                synchronized (c2.class) {
                    try {
                        if (c2.f3489k == null) {
                            c2.f3489k = new c2(sharedPreferences, o0Var, packageName);
                        }
                        c2Var = c2.f3489k;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                String str = c2Var.f3492c;
                SharedPreferences sharedPreferences2 = c2Var.f3491b;
                HashSet hashSet = c2Var.f3494f;
                String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = c2Var.f3495g;
                hashSet2.clear();
                c2Var.h = 0L;
                String str2 = c2.f3488j;
                if (str2.equals(string) && str.equals(string2)) {
                    c2Var.h = sharedPreferences2.getLong("feature_usage_last_report_time", 0L);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    HashSet hashSet3 = new HashSet();
                    for (String str3 : sharedPreferences2.getAll().keySet()) {
                        if (str3.startsWith("feature_usage_timestamp_")) {
                            long j10 = sharedPreferences2.getLong(str3, 0L);
                            if (j10 != 0 && jCurrentTimeMillis - j10 > 1209600000) {
                                hashSet3.add(str3);
                            } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                                c1 c1VarB2 = c2.b(str3.substring(41));
                                if (c1VarB2 != null) {
                                    hashSet2.add(c1VarB2);
                                    hashSet.add(c1VarB2);
                                }
                            } else if (str3.startsWith("feature_usage_timestamp_detected_feature_") && (c1VarB = c2.b(str3.substring(41))) != null) {
                                hashSet.add(c1VarB);
                            }
                        }
                    }
                    c2Var.c(hashSet3);
                    y5.l.h(c2Var.f3493e);
                    y5.l.h(c2Var.d);
                    c2Var.f3493e.post(c2Var.d);
                } else {
                    HashSet hashSet4 = new HashSet();
                    for (String str4 : sharedPreferences2.getAll().keySet()) {
                        if (str4.startsWith("feature_usage_timestamp_")) {
                            hashSet4.add(str4);
                        }
                    }
                    hashSet4.add("feature_usage_last_report_time");
                    c2Var.c(hashSet4);
                    sharedPreferences2.edit().putString("feature_usage_sdk_version", str2).putString("feature_usage_package_name", str).apply();
                }
                c2.a(c1.CAST_CONTEXT);
            }
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public int p() {
        return 1;
    }

    public boolean q(int i10) {
        g71 g71Var = ((p71) this.f17823b).H;
        if (g71Var == null) {
            return false;
        }
        return g71Var.c(i10);
    }

    @Override
    public i9 q0() {
        switch (this.f17822a) {
            case 18:
                return (rh.x) this.f17823b;
            default:
                return (m4) this.f17823b;
        }
    }

    @Override
    public void q1() {
        x1 x1Var = (x1) this.f17823b;
        x1.Z(x1Var, false, true);
        int i10 = x1Var.E0;
        x1Var.x0(i10 != 2 ? i10 : 0, true);
    }

    @Override
    public androidx.lifecycle.p0 r(Class cls, v1.b bVar) {
        m0 m0Var = null;
        for (v1.c cVar : (v1.c[]) this.f17823b) {
            if (cVar.f48673a.equals(cls)) {
                m0Var = new m0();
            }
        }
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    public void s(Runnable runnable) {
        Runnable runnable2 = (Runnable) ((HashMap) this.f17823b).remove(runnable);
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
        }
    }

    public void t() {
        HashMap map = (HashMap) this.f17823b;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            AndroidUtilities.cancelRunOnUIThread((Runnable) ((Map.Entry) it.next()).getValue());
        }
        map.clear();
    }

    public s0.c u(int i10) {
        return null;
    }

    @Override
    public rh.a u0() {
        switch (this.f17822a) {
            case 18:
                return ((rh.x) this.f17823b).f47594a;
            default:
                return ((m4) this.f17823b).f47594a;
        }
    }

    public rb.a v(float f10, float f11, int i10, int i11) {
        rb.a aVarB;
        rb.a aVarB2;
        int i12 = (int) (f11 * f10);
        int iMax = Math.max(0, i10 - i12);
        mb.b bVar = (mb.b) this.f17823b;
        int iMin = Math.min(bVar.f17919a - 1, i10 + i12) - iMax;
        float f12 = 3.0f * f10;
        if (iMin < f12) {
            throw lb.e.a();
        }
        int iMax2 = Math.max(0, i11 - i12);
        int iMin2 = Math.min(bVar.f17920b - 1, i11 + i12) - iMax2;
        if (iMin2 < f12) {
            throw lb.e.a();
        }
        mb.b bVar2 = (mb.b) this.f17823b;
        rb.b bVar3 = new rb.b(bVar2, iMax, iMax2, iMin, iMin2, f10);
        int i13 = bVar3.f46887e;
        int i14 = bVar3.f46886c;
        int i15 = i13 + i14;
        int i16 = bVar3.f46888f;
        int i17 = (i16 / 2) + bVar3.d;
        int[] iArr = new int[3];
        for (int i18 = 0; i18 < i16; i18++) {
            int i19 = ((i18 & 1) == 0 ? (i18 + 1) / 2 : -((i18 + 1) / 2)) + i17;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i20 = i14;
            while (i20 < i15 && !bVar2.b(i20, i19)) {
                i20++;
            }
            int i21 = 0;
            while (i20 < i15) {
                if (!bVar2.b(i20, i19)) {
                    if (i21 == 1) {
                        i21++;
                    }
                    iArr[i21] = iArr[i21] + 1;
                } else if (i21 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i21 != 2) {
                    i21++;
                    iArr[i21] = iArr[i21] + 1;
                } else {
                    if (bVar3.a(iArr) && (aVarB2 = bVar3.b(i19, i20, iArr)) != null) {
                        return aVarB2;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i21 = 1;
                }
                i20++;
            }
            if (bVar3.a(iArr) && (aVarB = bVar3.b(i19, i15, iArr)) != null) {
                return aVarB;
            }
        }
        ArrayList arrayList = bVar3.f46885b;
        if (arrayList.isEmpty()) {
            throw lb.e.a();
        }
        return (rb.a) arrayList.get(0);
    }

    public s0.c w(int i10) {
        return null;
    }

    @Override
    public boolean w0() {
        switch (this.f17822a) {
            case 18:
                rh.x xVar = (rh.x) this.f17823b;
                j3 j3Var = xVar.K;
                if (j3Var != null) {
                    rh.a aVar = xVar.f47594a;
                    if (j3Var.f47223a.S4()) {
                        return true;
                    }
                }
                return false;
            default:
                m4 m4Var = (m4) this.f17823b;
                i3 i3Var = m4Var.J;
                if (i3Var != null) {
                    rh.a aVar2 = m4Var.f47594a;
                    if (i3Var.f47191a.S4()) {
                        return true;
                    }
                }
                return false;
        }
    }

    public void x(float f10) {
        p71 p71Var = (p71) this.f17823b;
        if (f10 == 1.0f) {
            View[] viewArr = p71Var.f31545e;
            View[] viewArr2 = p71Var.f31545e;
            if (viewArr[1] != null) {
                p71Var.F();
                p71Var.h.put(p71Var.f31546f[1], viewArr2[1]);
                p71Var.removeView(viewArr2[1]);
                p71Var.E(viewArr2[0], 0.0f);
                viewArr2[1] = null;
            }
            p71Var.z(p71Var.f31543b);
            return;
        }
        View[] viewArr3 = p71Var.f31545e;
        View[] viewArr4 = p71Var.f31545e;
        View view = viewArr3[1];
        if (view == null) {
            return;
        }
        if (p71Var.f31552y) {
            p71Var.E(view, (1.0f - f10) * viewArr3[0].getMeasuredWidth());
            View view2 = viewArr4[0];
            p71Var.E(view2, (-view2.getMeasuredWidth()) * f10);
        } else {
            p71Var.E(view, (1.0f - f10) * (-viewArr3[0].getMeasuredWidth()));
            View view3 = viewArr4[0];
            p71Var.E(view3, view3.getMeasuredWidth() * f10);
        }
        p71Var.w(false);
    }

    public boolean y(int i10, int i11, Bundle bundle) {
        return false;
    }

    @Override
    public void y0(int i10, int i11) {
        switch (this.f17822a) {
            case 18:
                rh.x xVar = (rh.x) this.f17823b;
                j3 j3Var = xVar.K;
                if (j3Var != null) {
                    rh.a aVar = xVar.f47594a;
                    b2 b2Var = j3Var.f47223a.F3;
                    if (b2Var != null) {
                        b2Var.f(i10, i11);
                    }
                }
                break;
            default:
                m4 m4Var = (m4) this.f17823b;
                i3 i3Var = m4Var.J;
                if (i3Var != null) {
                    rh.a aVar2 = m4Var.f47594a;
                    b2 b2Var2 = i3Var.f47191a.F3;
                    if (b2Var2 != null) {
                        b2Var2.f(i10, i11);
                    }
                }
                break;
        }
    }

    public ma.i z(Object obj) {
        ma.g gVar = ((pa.a0) this.f17823b).f45606b;
        gVar.getClass();
        if (obj == null) {
            return ma.k.f17910a;
        }
        Class<?> cls = obj.getClass();
        pa.n nVar = new pa.n();
        gVar.f(obj, cls, nVar);
        return nVar.u();
    }

    public o(t6.b bVar, h5.e eVar) {
        this.f17822a = 23;
        this.f17823b = eVar;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public o(MediaInfo mediaInfo) {
        this.f17822a = 0;
        p pVar = new p(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.f17823b = pVar;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public o(JSONObject jSONObject) {
        this.f17822a = 0;
        this.f17823b = new p(jSONObject);
    }

    public o(int i10) {
        this.f17822a = i10;
        switch (i10) {
            case 21:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f17823b = new s0.d(this);
                } else {
                    this.f17823b = new ng0(this);
                }
                break;
            case 25:
                break;
            default:
                this.f17823b = new HashMap();
                break;
        }
    }

    public o(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.f17822a = 16;
        this.f17823b = new GestureDetector(context, onGestureListener, null);
    }

    public o(v1.c[] initializers) {
        this.f17822a = 26;
        kotlin.jvm.internal.j.e(initializers, "initializers");
        this.f17823b = initializers;
    }

    public o(EditText editText) {
        this.f17822a = 15;
        this.f17823b = new i6(editText);
    }

    @Override
    public void V0() {
    }

    @Override
    public void b1(int i10) {
    }

    @Override
    public void onSeekFinished(i3.a aVar) {
    }

    @Override
    public void onSeekStarted(i3.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void n0(d1 d1Var, boolean z10) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
    }
}
