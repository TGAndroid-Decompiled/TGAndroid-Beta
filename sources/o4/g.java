package o4;

import a4.w;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.Editable;
import android.text.style.CharacterStyle;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.exoplayer2.upstream.r0;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.u;
import com.google.android.gms.internal.cast.z4;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import h7.q5;
import i7.c7;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import o5.d0;
import o5.e0;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.o6;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.ca;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.dq0;
import org.telegram.ui.Components.g20;
import org.telegram.ui.Components.h20;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y5;
import org.telegram.ui.lu0;
import s5.x;
import th.b2;
import th.c1;
import th.d1;
import th.g0;
import th.i2;
import th.k3;
import th.p3;
import th.v2;
import th.w0;
import th.w4;
import th.y4;
public final class g implements r0, s, j1, lg.g, wd.a, androidx.activity.result.b, OnSuccessListener, pa.m, g0, c1, v0.i {
    public final int f19158a;
    public Object f19159b;

    public g(Object obj, int i10) {
        this.f19158a = i10;
        this.f19159b = obj;
    }

    @Override
    public boolean A1() {
        return false;
    }

    @Override
    public void B(CharSequence charSequence) {
        k3 k3Var = ((w0) this.f19159b).O;
        if (k3Var != null) {
            k3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                k3Var.f48546a.t4(charSequence.toString());
            }
        }
    }

    @Override
    public j9 D() {
        return (w0) this.f19159b;
    }

    @Override
    public th.a G() {
        return ((w0) this.f19159b).f48892a;
    }

    @Override
    public boolean H1(s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public boolean J1() {
        return false;
    }

    @Override
    public boolean M() {
        w0 w0Var = (w0) this.f19159b;
        k3 k3Var = w0Var.O;
        if (k3Var != null) {
            th.a aVar = w0Var.f48892a;
            if (k3Var.f48546a.S4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public boolean M0(long j10) {
        return false;
    }

    @Override
    public boolean O(s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public void O1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        ye.d.s(s1Var.getContext(), str);
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public void P0(int i10, s1 s1Var) {
        ca caVar = (ca) this.f19159b;
        org.telegram.ui.Cells.g gVar = caVar.v;
        if (caVar.a()) {
            caVar.f24193s = 2;
            s1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public CharacterStyle P1(s1 s1Var) {
        return null;
    }

    @Override
    public boolean Q(s1 s1Var) {
        return false;
    }

    @Override
    public void Q1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        ca caVar = (ca) this.f19159b;
        org.telegram.ui.Cells.g gVar = caVar.v;
        if (caVar.a()) {
            caVar.f24193s = 2;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean R1(s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public void S0(d1 d1Var) {
        th.a aVar;
        y4 y4Var = (y4) this.f19159b;
        w4 w4Var = y4Var.f48908s;
        if (w4Var != null && (aVar = y4Var.f48892a) != null) {
            p3 p3Var = ((v2) w4Var).f48817a;
            ArrayList arrayList = p3Var.f48646h3;
            long j10 = aVar.f48344t;
            if (j10 != 0) {
                int i10 = -1;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (((th.a) arrayList.get(i11)).f48335k.contains(Long.valueOf(j10))) {
                        i10 = i11;
                    }
                }
                if (i10 >= 0) {
                    b2 b2Var = p3Var.F3;
                    if (b2Var != null) {
                        b2Var.d();
                    }
                    th.a aVar2 = new th.a(new TL_iv.pageBlockParagraph(), 0, 0);
                    ArrayList arrayList2 = aVar.f48335k;
                    ArrayList arrayList3 = aVar2.f48335k;
                    arrayList3.addAll(arrayList2);
                    if (!arrayList3.isEmpty()) {
                        w.t(1, arrayList3);
                    }
                    arrayList.add(i10 + 1, aVar2);
                    p3Var.s4();
                    p3Var.U2.N(false);
                    b2 b2Var2 = p3Var.F3;
                    if (b2Var2 != null) {
                        b2Var2.h();
                    }
                    p3Var.post(new i2(p3Var, aVar2, 26));
                }
            }
        }
    }

    @Override
    public void T0(d1 d1Var, int i10, int i11) {
        w4 w4Var;
        k9 textSelectionHelper;
        y4 y4Var = (y4) this.f19159b;
        if (!y4Var.f48909w && i10 != i11 && (w4Var = y4Var.f48908s) != null && (textSelectionHelper = ((v2) w4Var).f48817a.getTextSelectionHelper()) != null) {
            d1Var.post(new o6(this, d1Var, i11, textSelectionHelper, i10, 5));
        }
    }

    @Override
    public int V() {
        return 0;
    }

    @Override
    public boolean W0(s1 s1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean W1(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public sg.a X() {
        return null;
    }

    @Override
    public boolean Y(s1 s1Var) {
        return false;
    }

    @Override
    public lu0 Y1() {
        return null;
    }

    @Override
    public boolean Z(s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public void a() {
        h hVar = (h) this.f19159b;
        hVar.A.a();
        z4 z4Var = hVar.C;
        if (z4Var == null) {
            return;
        }
        throw z4Var;
    }

    @Override
    public boolean a2(long j10) {
        return false;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        x xVar = (x) obj;
        s5.f fVar = (s5.f) xVar.u();
        d0 d0Var = ((e0) this.f19159b).f19252k;
        Parcel M0 = fVar.M0();
        u.d(M0, d0Var);
        fVar.R0(M0, 18);
        s5.f fVar2 = (s5.f) xVar.u();
        fVar2.R0(fVar2.M0(), 17);
        ((TaskCompletionSource) obj2).setResult(null);
    }

    public void b(HashMap hashMap) {
        if (((SparseArray) this.f19159b) == null) {
            this.f19159b = new SparseArray(hashMap.size());
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            ((SparseArray) this.f19159b).put(((String) entry.getKey()).hashCode(), (String) entry.getValue());
        }
    }

    @Override
    public void b2(s1 s1Var, int i10, float f9, float f10, boolean z10) {
        ca caVar = (ca) this.f19159b;
        org.telegram.ui.Cells.g gVar = caVar.v;
        if (caVar.a()) {
            caVar.f24193s = 0;
            s1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public boolean c() {
        return ((ca) this.f19159b).a();
    }

    @Override
    public boolean c1(int i10, s1 s1Var) {
        if (i10 == ((ca) this.f19159b).f24193s) {
            return true;
        }
        return false;
    }

    @Override
    public boolean c2(s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public void d(Canvas canvas) {
        switch (this.f19158a) {
            case 3:
                ni niVar = (ni) this.f19159b;
                canvas.drawColor(niVar.getThemedColor(g6.f23062d6));
                if (SharedConfig.chatBlurEnabled()) {
                    niVar.f31068y2.b(canvas, -2);
                    return;
                }
                return;
            default:
                dq0 dq0Var = (dq0) this.f19159b;
                canvas.drawColor(dq0Var.getThemedColor(g6.f23062d6));
                if (SharedConfig.chatBlurEnabled()) {
                    dq0Var.K0.b(canvas, -2);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean d0() {
        return false;
    }

    @Override
    public void e(d1 d1Var) {
        switch (this.f19158a) {
            case 16:
                k3 k3Var = ((w0) this.f19159b).O;
                if (k3Var != null) {
                    p3 p3Var = k3Var.f48546a;
                    p3.M1(p3Var, d1Var);
                    p3Var.f48638d3.U(d1Var, true);
                    return;
                }
                return;
            default:
                w4 w4Var = ((y4) this.f19159b).f48908s;
                if (w4Var != null) {
                    p3 p3Var2 = ((v2) w4Var).f48817a;
                    p3.M1(p3Var2, d1Var);
                    p3Var2.f48638d3.U(d1Var, true);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public int f0(s1 s1Var) {
        return 0;
    }

    @Override
    public boolean forceEnableVibration() {
        return false;
    }

    @Override
    public String g(s1 s1Var) {
        return null;
    }

    @Override
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    public int h(int i10, int[] iArr) {
        int[] iArr2;
        int[] iArr3;
        int i11;
        int i12;
        int i13;
        pb.a aVar = (pb.a) this.f19159b;
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
                int i17 = aVar.f45710a[aVar.f45715g + i16];
                if (i17 == 0) {
                    i13 = iArr2[iArr2.length - 1];
                } else {
                    if (i17 == 1) {
                        i12 = 0;
                        for (int i18 : iArr2) {
                            pb.a aVar2 = pb.a.h;
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
            pb.b bVar = new pb.b(aVar, iArr5);
            pb.b a2 = aVar.a(i10, 1);
            pb.b bVar2 = aVar.f45712c;
            if (a2.d() >= bVar.d()) {
                a2 = bVar;
                bVar = a2;
            }
            pb.b bVar3 = aVar.d;
            pb.b bVar4 = a2;
            pb.b bVar5 = bVar;
            pb.b bVar6 = bVar4;
            pb.b bVar7 = bVar2;
            while (bVar6.d() * 2 >= i10) {
                if (!bVar6.e()) {
                    int b10 = aVar.b(bVar6.c(bVar6.d()));
                    pb.b bVar8 = bVar2;
                    while (bVar5.d() >= bVar6.d() && !bVar5.e()) {
                        int d = bVar5.d() - bVar6.d();
                        int c3 = aVar.c(bVar5.c(bVar5.d()), b10);
                        bVar8 = bVar8.a(aVar.a(d, c3));
                        bVar5 = bVar5.a(bVar6.h(d, c3));
                    }
                    pb.b a10 = bVar8.g(bVar3).a(bVar7);
                    if (bVar5.d() < bVar6.d()) {
                        pb.b bVar9 = bVar5;
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
            int c6 = bVar3.c(0);
            if (c6 != 0) {
                int b11 = aVar.b(c6);
                pb.b[] bVarArr = {bVar3.f(b11), bVar6.f(b11)};
                pb.b bVar10 = bVarArr[0];
                pb.b bVar11 = bVarArr[1];
                int d10 = bVar10.d();
                if (d10 == 1) {
                    iArr3 = new int[]{bVar10.c(1)};
                } else {
                    int[] iArr6 = new int[d10];
                    int i20 = 0;
                    for (int i21 = 1; i21 < aVar.f45713e && i20 < d10; i21++) {
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
                            int c10 = aVar.c(iArr3[i24], b12);
                            if ((c10 & 1) == 0) {
                                i11 = c10 | 1;
                            } else {
                                i11 = c10 & (-2);
                            }
                            i23 = aVar.c(i23, i11);
                        }
                    }
                    int c11 = aVar.c(bVar11.b(b12), aVar.b(i23));
                    iArr7[i22] = c11;
                    if (aVar.f45715g != 0) {
                        iArr7[i22] = aVar.c(c11, b12);
                    }
                }
                for (int i25 = 0; i25 < iArr3.length; i25++) {
                    int length4 = iArr.length - 1;
                    int i26 = iArr3[i25];
                    if (i26 != 0) {
                        int i27 = length4 - aVar.f45711b[i26];
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
    public void h0(int i10, int i11) {
        w0 w0Var = (w0) this.f19159b;
        k3 k3Var = w0Var.O;
        if (k3Var != null) {
            th.a aVar = w0Var.f48892a;
            b2 b2Var = k3Var.f48546a.F3;
            if (b2Var != null) {
                b2Var.f(i10, i11);
            }
        }
    }

    @Override
    public boolean h1(MessageObject messageObject) {
        return org.telegram.ui.b.a(messageObject);
    }

    @Override
    public void i() {
        w0 w0Var = (w0) this.f19159b;
        k3 k3Var = w0Var.O;
        if (k3Var != null) {
            p3.P1(k3Var.f48546a, w0Var.f48892a);
        }
    }

    @Override
    public void i0() {
        w0 w0Var = (w0) this.f19159b;
        k3 k3Var = w0Var.O;
        if (k3Var != null) {
            th.a aVar = w0Var.f48892a;
            p3 p3Var = k3Var.f48546a;
            b2 b2Var = p3Var.F3;
            if (b2Var != null) {
                b2Var.g();
            }
            p3Var.f48638d3.onContentChanged();
        }
    }

    @Override
    public boolean i1(d1 d1Var) {
        return false;
    }

    @Override
    public boolean ignoreHapticFeedbackSettings(float f9, float f10) {
        return false;
    }

    @Override
    public boolean j0() {
        return c();
    }

    @Override
    public void l(Object obj) {
        Bundle extras;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f19159b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f894b;
        int i10 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).f45457a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.J;
        if (resultReceiver != null) {
            if (intent == null) {
                extras = null;
            } else {
                extras = intent.getExtras();
            }
            resultReceiver.send(i10, extras);
        }
        int i11 = aVar.f893a;
        if (i11 != -1 || i10 != 0) {
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i11 + " and billing's responseCode: " + i10);
        }
        proxyBillingActivityV2.finish();
    }

    @Override
    public void l0() {
        w0 w0Var = (w0) this.f19159b;
        k3 k3Var = w0Var.O;
        if (k3Var != null) {
            th.a aVar = w0Var.f48892a;
            p3.O1(k3Var.f48546a);
        }
    }

    @Override
    public boolean m() {
        return false;
    }

    @Override
    public boolean m2(s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean n0(y5 y5Var) {
        return false;
    }

    @Override
    public void n1(Editable editable) {
        ((y4) this.f19159b).h();
    }

    @Override
    public boolean needCancelTouchBySlopMove() {
        return true;
    }

    @Override
    public boolean needClickAt(View view, float f9, float f10) {
        int dp = AndroidUtilities.dp(9.0f);
        x51 x51Var = (x51) this.f19159b;
        float f11 = -dp;
        x51Var.f34585g.inset(f11, f11);
        boolean contains = x51Var.f34585g.contains(f9, f10);
        float f12 = dp;
        x51Var.f34585g.inset(f12, f12);
        return contains;
    }

    @Override
    public boolean needLongPress(float f9, float f10) {
        return false;
    }

    @Override
    public void onClickAt(View view, float f9, float f10) {
        Runnable runnable = ((x51) this.f19159b).f34587j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void onClickTouchDown(View view, float f9, float f10) {
        ((x51) this.f19159b).h.c(true);
    }

    @Override
    public void onClickTouchUp(View view, float f9, float f10) {
        ((x51) this.f19159b).h.c(false);
    }

    @Override
    public void onError(Object obj) {
        w0.d e10 = (w0.d) obj;
        kotlin.jvm.internal.j.e(e10, "e");
        jd.m mVar = (jd.m) this.f19159b;
        if (mVar.w()) {
            mVar.resumeWith(c7.a(e10));
        }
    }

    @Override
    public boolean onLongPressRequestedAt(View view, float f9, float f10) {
        return false;
    }

    @Override
    public void onResult(Object obj) {
        v0.c result = (v0.c) obj;
        kotlin.jvm.internal.j.e(result, "result");
        jd.m mVar = (jd.m) this.f19159b;
        if (mVar.w()) {
            mVar.resumeWith(result);
        }
    }

    @Override
    public void onSuccess(Object obj) {
        ((p5.a) this.f19159b).getClass();
        q5.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    @Override
    public Object p2() {
        Type type = (Type) this.f19159b;
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
    public void q(g.x xVar) {
        switch (this.f19158a) {
            case 3:
                xVar.a(((ni) this.f19159b).getThemedColor(g6.f23062d6));
                xVar.b(SharedConfig.chatBlurEnabled());
                return;
            default:
                xVar.a(((dq0) this.f19159b).getThemedColor(g6.f23062d6));
                xVar.b(SharedConfig.chatBlurEnabled());
                return;
        }
    }

    public boolean r(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: o4.g.r(android.view.MotionEvent):boolean");
    }

    @Override
    public boolean r0(d1 d1Var) {
        return false;
    }

    @Override
    public boolean t1(boolean z10) {
        return false;
    }

    @Override
    public boolean u2(int i10) {
        return false;
    }

    public void v() {
        q5.h hVar = (q5.h) this.f19159b;
        Iterator it = hVar.h.iterator();
        if (!it.hasNext()) {
            Iterator it2 = hVar.f46397i.iterator();
            while (it2.hasNext()) {
                ((q5.g) it2.next()).a();
            }
            return;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override
    public boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override
    public k9 x() {
        k3 k3Var = ((w0) this.f19159b).O;
        if (k3Var == null) {
            return null;
        }
        return k3Var.f48546a.getTextSelectionHelper();
    }

    @Override
    public String y(long j10) {
        return null;
    }

    @Override
    public l9 y2() {
        return null;
    }

    public g(JSONArray jSONArray) {
        this.f19158a = 7;
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                if (optJSONObject != null) {
                    arrayList.add(new p2.j(optJSONObject));
                }
            }
        }
        this.f19159b = arrayList;
    }

    public g(int i10) {
        this.f19158a = i10;
        switch (i10) {
            case 15:
                return;
            default:
                this.f19159b = new LinkedHashMap(5, 1.0f, false);
                return;
        }
    }

    public g(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.f19158a = 14;
        this.f19159b = new GestureDetector(context, onGestureListener, null);
    }

    public g(Context context, h20 h20Var) {
        this.f19158a = 4;
        this.f19159b = new g20(context, h20Var);
    }

    @Override
    public void S1() {
    }

    @Override
    public void k() {
    }

    @Override
    public void k1() {
    }

    @Override
    public void p() {
    }

    @Override
    public void q2() {
    }

    @Override
    public void t() {
    }

    @Override
    public void u0() {
    }

    @Override
    public void w2() {
    }

    @Override
    public void z0() {
    }

    @Override
    public void A(s1 s1Var) {
    }

    @Override
    public void C(s1 s1Var) {
    }

    @Override
    public void C1(s1 s1Var) {
    }

    @Override
    public void D0(s1 s1Var) {
    }

    @Override
    public void F(s1 s1Var) {
    }

    @Override
    public void F0(s1 s1Var) {
    }

    @Override
    public void H(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void J0(s1 s1Var) {
    }

    @Override
    public void K(s1 s1Var) {
    }

    @Override
    public void L1(s1 s1Var) {
    }

    @Override
    public void N(MessageObject messageObject) {
    }

    @Override
    public void N0(s1 s1Var) {
    }

    @Override
    public void N1(MessageObject messageObject) {
    }

    @Override
    public void T(s1 s1Var) {
    }

    @Override
    public void X0(s1 s1Var) {
    }

    @Override
    public void Y0(s1 s1Var) {
    }

    @Override
    public void Z0(CharSequence charSequence) {
    }

    @Override
    public void c0(int i10) {
    }

    @Override
    public void e2(s1 s1Var) {
    }

    @Override
    public void g0(s1 s1Var) {
    }

    @Override
    public void m0(String str) {
    }

    @Override
    public void n2(s1 s1Var) {
    }

    @Override
    public void o(s1 s1Var) {
    }

    @Override
    public void s(s1 s1Var) {
    }

    @Override
    public void u(s1 s1Var) {
    }

    @Override
    public void w(s1 s1Var) {
    }

    @Override
    public void y0(s1 s1Var) {
    }

    @Override
    public void E(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void F1(s1 s1Var, boolean z10) {
    }

    @Override
    public void I1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void L(int i10, s1 s1Var) {
    }

    @Override
    public void R0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void U1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void g2(s1 s1Var, long j10) {
    }

    @Override
    public void j2(s1 s1Var, hh.f fVar) {
    }

    @Override
    public void m1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void p1(s1 s1Var, TLRPC.Document document) {
    }

    @Override
    public void z(int i10, int i11) {
    }

    @Override
    public void A0(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void B0(s1 s1Var, float f9, float f10) {
    }

    @Override
    public void V0(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void e0(s1 s1Var, float f9, float f10) {
    }

    @Override
    public void onClickTouchMove(View view, float f9, float f10) {
    }

    @Override
    public void onLongPressCancelled(View view, float f9, float f10) {
    }

    @Override
    public void onLongPressFinish(View view, float f9, float f10) {
    }

    @Override
    public void p0(s1 s1Var, float f9, float f10) {
    }

    @Override
    public void u1(s1 s1Var, float f9, float f10) {
    }

    @Override
    public void x2(s1 s1Var, int i10, int i11) {
    }

    @Override
    public void V1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void n(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void t0(s1 s1Var, TLRPC.User user, float f9, float f10) {
    }

    @Override
    public void v0(s1 s1Var, float f9, float f10, boolean z10) {
    }

    @Override
    public void j(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void s2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
    }

    @Override
    public void S(s1 s1Var, TLRPC.Chat chat, int i10, float f9, float f10, boolean z10) {
    }

    @Override
    public void onLongPressMove(View view, MotionEvent motionEvent, float f9, float f10, float f11, float f12) {
    }
}
