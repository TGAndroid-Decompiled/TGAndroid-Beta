package o2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.Editable;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.internal.cast.o0;
import com.google.android.gms.internal.cast.z;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import dg.b3;
import g.x;
import g5.h0;
import g5.j0;
import g5.p0;
import h5.d0;
import h7.u;
import j3.r1;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import k7.a8;
import k7.p7;
import o4.m0;
import o4.n0;
import o4.s0;
import o4.t0;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.p6;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.da;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.lq0;
import org.telegram.ui.Components.m20;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.cv0;
import ph.c0;
import ph.ga;
import ph.h9;
import ph.ia;
import ph.k5;
import ph.s9;
import ph.t6;
import ph.t9;
import ph.w4;
import ph.y;
import t4.r;
import tf.i1;
import tf.u0;
import u5.t;
import v0.p;
import vh.b5;
import vh.d1;
import vh.d2;
import vh.e1;
import vh.k2;
import vh.n3;
import vh.s3;
import vh.w2;
import vh.x0;
import vh.y2;
import vh.z4;
import y2.q;
public final class i implements n0, o8.n, j1, ng.g, yd.a, androidx.activity.result.b, yf.m, ia, h0, OnSuccessListener, ra.m, r4.h, m0, i1, s, OnCompleteListener, vh.h0, d1 {
    public final int f16194a;
    public Object f16195b;

    public i(com.google.android.gms.common.api.j jVar, Object obj, int i10) {
        this.f16194a = i10;
        this.f16195b = obj;
    }

    public static v0.j p2(i iVar, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return iVar.y2();
        }
        if (obj instanceof v0.n) {
            for (p pVar : ((v0.n) obj).f45611a) {
            }
        }
        Context ctx = (Context) iVar.f16195b;
        kotlin.jvm.internal.j.e(ctx, "ctx");
        if (!ctx.getPackageManager().hasSystemFeature("android.software.leanback") && !ctx.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            int i10 = Build.VERSION.SDK_INT;
            v0.l lVar = null;
            if (i10 >= 34) {
                v0.l lVar2 = new v0.l(ctx);
                if (lVar2.isAvailableOnDevice()) {
                    lVar = lVar2;
                }
                if (lVar == null) {
                    return iVar.y2();
                }
                return lVar;
            } else if (i10 > 33) {
                return null;
            } else {
                return iVar.y2();
            }
        }
        return iVar.y2();
    }

    @Override
    public void A1(float f10, int i10) {
        ArrayList arrayList;
        k5 k5Var = (k5) this.f16195b;
        t6 t6Var = k5Var.d;
        if (t6Var != null && (arrayList = t6Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((t6) k5Var.d.T.get(i10)).W = f10;
        }
    }

    @Override
    public void B(float f10) {
        k5 k5Var = (k5) this.f16195b;
        t6 t6Var = k5Var.d;
        if (t6Var == null) {
            return;
        }
        t6Var.G = f10;
        t6Var.f42419j = true;
        k5Var.c();
    }

    @Override
    public boolean B0(MessageObject messageObject) {
        return true;
    }

    @Override
    public void B1(float f10) {
        t6 t6Var = ((k5) this.f16195b).d;
        if (t6Var == null) {
            return;
        }
        t6Var.f42400a0 = f10;
        t6Var.f42419j = true;
    }

    @Override
    public void C(long j10, boolean z4) {
        k5 k5Var = (k5) this.f16195b;
        if (!z4) {
            k5Var.m(j10);
            return;
        }
        i71 i71Var = k5Var.e;
        if (i71Var != null) {
            i71Var.L(j10, true);
        } else if (k5Var.j()) {
            k5Var.B.m(j10, true);
        } else {
            i71 i71Var2 = k5Var.f41920y;
            if (i71Var2 != null) {
                i71Var2.L(j10, false);
            }
        }
    }

    @Override
    public void C0(float f10, boolean z4) {
        k5 k5Var = (k5) this.f16195b;
        t6 t6Var = k5Var.d;
        if (t6Var != null) {
            t6Var.Z = f10;
            t6Var.f42419j = true;
            i71 i71Var = k5Var.e;
            if (i71Var != null && i71Var.p() != -9223372036854775807L) {
                k5Var.m(f10 * ((float) k5Var.e.p()));
            }
        }
    }

    @Override
    public void C1() {
        ((k5) this.f16195b).p(null);
    }

    @Override
    public void D(Canvas canvas) {
        switch (this.f16194a) {
            case 4:
                li liVar = (li) this.f16195b;
                canvas.drawColor(liVar.getThemedColor(j6.f19881d6));
                if (SharedConfig.chatBlurEnabled()) {
                    liVar.f26761z2.b(canvas, -2);
                    return;
                }
                return;
            default:
                lq0 lq0Var = (lq0) this.f16195b;
                canvas.drawColor(lq0Var.getThemedColor(j6.f19881d6));
                if (SharedConfig.chatBlurEnabled()) {
                    lq0Var.L0.b(canvas, -2);
                    return;
                }
                return;
        }
    }

    @Override
    public void D1(x xVar) {
        switch (this.f16194a) {
            case 4:
                xVar.a(((li) this.f16195b).getThemedColor(j6.f19881d6));
                xVar.b(SharedConfig.chatBlurEnabled());
                return;
            default:
                xVar.a(((lq0) this.f16195b).getThemedColor(j6.f19881d6));
                xVar.b(SharedConfig.chatBlurEnabled());
                return;
        }
    }

    @Override
    public m9 D2() {
        return null;
    }

    @Override
    public boolean F1() {
        return false;
    }

    @Override
    public long G(long j10, long j11) {
        return 0L;
    }

    @Override
    public long H() {
        long j10 = Long.MAX_VALUE;
        for (n0 n0Var : (n0[]) this.f16195b) {
            long H = n0Var.H();
            if (H != Long.MIN_VALUE) {
                j10 = Math.min(j10, H);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override
    public a0.h H0() {
        switch (this.f16194a) {
            case 21:
                return null;
            default:
                return null;
        }
    }

    @Override
    public l9 J0() {
        n3 n3Var = ((x0) this.f16195b).P;
        if (n3Var == null) {
            return null;
        }
        return n3Var.f46111a.getTextSelectionHelper();
    }

    @Override
    public void J1(ArrayList arrayList) {
        switch (this.f16194a) {
            case 21:
                u0 u0Var = (u0) this.f16195b;
                String str = u0Var.W;
                if (str != null) {
                    u0Var.U(str, u0Var.Z, u0Var.f44899a0, u0Var.Y, u0Var.X);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public long K(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override
    public boolean K1(s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public void L0(CharSequence charSequence) {
        n3 n3Var = ((x0) this.f16195b).P;
        if (n3Var != null) {
            n3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                n3Var.f46111a.s4(charSequence.toString());
            }
        }
    }

    @Override
    public boolean M1() {
        return false;
    }

    @Override
    public long N1(long j10) {
        return 1L;
    }

    @Override
    public k9 O0() {
        return (x0) this.f16195b;
    }

    @Override
    public boolean P(s1 s1Var, TLRPC.TodoItem todoItem, boolean z4) {
        return false;
    }

    @Override
    public void P0(long j10) {
        k5 k5Var = (k5) this.f16195b;
        t6 t6Var = k5Var.d;
        if (t6Var == null) {
            return;
        }
        t6Var.f42435r0 = j10;
        t6Var.f42419j = true;
        k5Var.y(true);
    }

    @Override
    public long P1(long j10, long j11) {
        return 1L;
    }

    @Override
    public boolean Q() {
        return false;
    }

    @Override
    public boolean R(s1 s1Var) {
        return false;
    }

    @Override
    public boolean R0(long j10) {
        return false;
    }

    @Override
    public void R1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        ze.d.s(s1Var.getContext(), str);
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public CharacterStyle S1(s1 s1Var) {
        return null;
    }

    @Override
    public vh.a T0() {
        return ((x0) this.f16195b).f46414a;
    }

    @Override
    public void T1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        da daVar = (da) this.f16195b;
        org.telegram.ui.Cells.g gVar = daVar.v;
        if (daVar.a()) {
            daVar.f20956s = 2;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public void U0(int i10, s1 s1Var) {
        da daVar = (da) this.f16195b;
        org.telegram.ui.Cells.g gVar = daVar.v;
        if (daVar.a()) {
            daVar.f20956s = 2;
            s1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public boolean U1(s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public s4.j V(long j10) {
        return (s4.j) this.f16195b;
    }

    @Override
    public boolean V0(e1 e1Var) {
        return false;
    }

    @Override
    public int W() {
        return 0;
    }

    @Override
    public void W1(float f10) {
        k5 k5Var = (k5) this.f16195b;
        t6 t6Var = k5Var.d;
        if (t6Var == null) {
            return;
        }
        t6Var.f42439t0 = f10;
        t6Var.f42419j = true;
        k5Var.y(true);
    }

    @Override
    public c4.e X(g5.j0 r8, java.io.IOException r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: o2.i.X(g5.j0, java.io.IOException, int):c4.e");
    }

    @Override
    public a0.h X0() {
        switch (this.f16194a) {
            case 21:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void X1(n0 n0Var) {
        r rVar = (r) n0Var;
        t4.l lVar = (t4.l) this.f16195b;
        lVar.D.X1(lVar);
    }

    @Override
    public boolean Y0() {
        x0 x0Var = (x0) this.f16195b;
        n3 n3Var = x0Var.P;
        if (n3Var != null) {
            vh.a aVar = x0Var.f46414a;
            if (n3Var.f46111a.R4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public ug.a Z() {
        return null;
    }

    @Override
    public void Z0(boolean z4) {
        b3 b3Var;
        ph.da daVar = ((s9) ((k5) this.f16195b)).f42378z0;
        h9 h9Var = daVar.f41569s1;
        if (h9Var != null) {
            b3 b3Var2 = null;
            if (!z4 && (h9Var.getSelectedEntity() instanceof b3)) {
                daVar.f41569s1.D0(null, true);
            } else if (z4 && !(daVar.f41569s1.getSelectedEntity() instanceof b3)) {
                w4 w4Var = daVar.f41569s1.O0;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 < w4Var.getChildCount()) {
                        View childAt = w4Var.getChildAt(i11);
                        if (childAt instanceof b3) {
                            b3Var = (b3) childAt;
                            break;
                        }
                        i11++;
                    } else {
                        b3Var = null;
                        break;
                    }
                }
                if (b3Var != null) {
                    h9 h9Var2 = daVar.f41569s1;
                    w4 w4Var2 = h9Var2.O0;
                    while (true) {
                        if (i10 >= w4Var2.getChildCount()) {
                            break;
                        }
                        View childAt2 = w4Var2.getChildAt(i10);
                        if (childAt2 instanceof b3) {
                            b3Var2 = (b3) childAt2;
                            break;
                        }
                        i10++;
                    }
                    h9Var2.D0(b3Var2, true);
                }
            }
        }
    }

    @Override
    public Object a() {
        return this.f16195b;
    }

    @Override
    public boolean a0(s1 s1Var) {
        return false;
    }

    @Override
    public boolean a2(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f16194a) {
            case 22:
                u5.r rVar = new u5.r(2, (TaskCompletionSource) obj2);
                u5.i iVar = (u5.i) ((t) obj).u();
                Parcel M0 = iVar.M0();
                com.google.android.gms.internal.cast.t.d(M0, rVar);
                M0.writeStringArray((String[]) this.f16195b);
                iVar.R0(M0, 7);
                return;
            default:
                o5.l lVar = new o5.l((TaskCompletionSource) obj2);
                w6.i iVar2 = (w6.i) ((w6.c) obj).u();
                Parcel I0 = iVar2.I0();
                int i10 = w6.f.f46550a;
                I0.writeStrongBinder(lVar);
                w6.f.c(I0, (l5.e) this.f16195b);
                iVar2.J0(I0, 1);
                return;
        }
    }

    @Override
    public boolean b() {
        for (n0 n0Var : (n0[]) this.f16195b) {
            if (n0Var.b()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void b0() {
        k5 k5Var = (k5) this.f16195b;
        k5Var.s(null, null, true);
        ph.da daVar = ((s9) k5Var).f42378z0;
        s9 s9Var = daVar.U0;
        if (s9Var != null) {
            s9Var.s(null, null, true);
        }
        h9 h9Var = daVar.f41569s1;
        if (h9Var != null) {
            h9Var.q0();
        }
        t9 t9Var = daVar.Z0;
        if (t9Var != null) {
            t9Var.setHasRoundVideo(false);
        }
        t6 t6Var = daVar.H1;
        if (t6Var != null) {
            File file = t6Var.f42429o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                daVar.H1.f42429o0 = null;
            }
            if (daVar.H1.f42431p0 != null) {
                try {
                    new File(daVar.H1.f42431p0).delete();
                } catch (Exception unused2) {
                }
                daVar.H1.f42431p0 = null;
            }
        }
    }

    @Override
    public void b2(int i10, long j10) {
        ArrayList arrayList;
        k5 k5Var = (k5) this.f16195b;
        t6 t6Var = k5Var.d;
        if (t6Var != null && (arrayList = t6Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((t6) k5Var.d.T.get(i10)).X = j10;
        }
    }

    @Override
    public void c(e1 e1Var) {
        switch (this.f16194a) {
            case 26:
                n3 n3Var = ((x0) this.f16195b).P;
                if (n3Var != null) {
                    s3 s3Var = n3Var.f46111a;
                    s3.L1(s3Var, e1Var);
                    s3Var.f46209e3.d(e1Var, true);
                    return;
                }
                return;
            default:
                z4 z4Var = ((b5) this.f16195b).f45902s;
                if (z4Var != null) {
                    s3 s3Var2 = ((y2) z4Var).f46409a;
                    s3.L1(s3Var2, e1Var);
                    s3Var2.f46209e3.d(e1Var, true);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean c0(s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean c1(s1 s1Var, boolean z4) {
        return false;
    }

    @Override
    public cv0 c2() {
        return null;
    }

    @Override
    public void d(int i10) {
        y yVar = ((k5) this.f16195b).B;
        if (yVar != null) {
            ArrayList arrayList = yVar.h;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                ph.x xVar = (ph.x) obj;
                if (xVar.f42552a == i10) {
                    xVar.f42553b.d(1.0f, true);
                    yVar.invalidate();
                    return;
                }
            }
        }
    }

    @Override
    public boolean e() {
        return ((da) this.f16195b).a();
    }

    @Override
    public void e0(float f10) {
        k5 k5Var = (k5) this.f16195b;
        t6 t6Var = k5Var.d;
        if (t6Var == null) {
            return;
        }
        t6Var.f42437s0 = f10;
        t6Var.f42419j = true;
        k5Var.y(true);
    }

    @Override
    public boolean e2(long j10) {
        return false;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public void f1(int i10, int i11) {
        x0 x0Var = (x0) this.f16195b;
        n3 n3Var = x0Var.P;
        if (n3Var != null) {
            vh.a aVar = x0Var.f46414a;
            d2 d2Var = n3Var.f46111a.G3;
            if (d2Var != null) {
                d2Var.f(i10, i11);
            }
        }
    }

    @Override
    public void f2(s1 s1Var, int i10, float f10, float f11, boolean z4) {
        da daVar = (da) this.f16195b;
        org.telegram.ui.Cells.g gVar = daVar.v;
        if (daVar.a()) {
            daVar.f20956s = 0;
            s1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
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
    public boolean g0() {
        return false;
    }

    @Override
    public void g1(e1 e1Var) {
        vh.a aVar;
        b5 b5Var = (b5) this.f16195b;
        z4 z4Var = b5Var.f45902s;
        if (z4Var != null && (aVar = b5Var.f46414a) != null) {
            s3 s3Var = ((y2) z4Var).f46409a;
            ArrayList arrayList = s3Var.f46217i3;
            long j10 = aVar.f45868t;
            if (j10 != 0) {
                int i10 = -1;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (((vh.a) arrayList.get(i11)).f45859k.contains(Long.valueOf(j10))) {
                        i10 = i11;
                    }
                }
                if (i10 >= 0) {
                    d2 d2Var = s3Var.G3;
                    if (d2Var != null) {
                        d2Var.d();
                    }
                    vh.a aVar2 = new vh.a(new TL_iv.pageBlockParagraph(), 0, 0);
                    ArrayList arrayList2 = aVar.f45859k;
                    ArrayList arrayList3 = aVar2.f45859k;
                    arrayList3.addAll(arrayList2);
                    if (!arrayList3.isEmpty()) {
                        android.support.v4.media.a.u(1, arrayList3);
                    }
                    arrayList.add(i10 + 1, aVar2);
                    s3Var.r4();
                    s3Var.V2.N(false);
                    d2 d2Var2 = s3Var.G3;
                    if (d2Var2 != null) {
                        d2Var2.h();
                    }
                    s3Var.post(new k2(s3Var, aVar2, 26));
                }
            }
        }
    }

    @Override
    public boolean g2(s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override
    public boolean h() {
        return false;
    }

    @Override
    public boolean h0(e1 e1Var) {
        return false;
    }

    @Override
    public boolean h1(int i10, s1 s1Var) {
        if (i10 == ((da) this.f16195b).f20956s) {
            return true;
        }
        return false;
    }

    @Override
    public void h2() {
        x0 x0Var = (x0) this.f16195b;
        n3 n3Var = x0Var.P;
        if (n3Var != null) {
            vh.a aVar = x0Var.f46414a;
            s3.N1(n3Var.f46111a);
        }
    }

    @Override
    public void i1(float f10, int i10) {
        ArrayList arrayList;
        k5 k5Var = (k5) this.f16195b;
        t6 t6Var = k5Var.d;
        if (t6Var != null && (arrayList = t6Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((t6) k5Var.d.T.get(i10)).V = f10;
        }
    }

    @Override
    public void i2(long j10) {
        k5 k5Var = (k5) this.f16195b;
        t6 t6Var = k5Var.d;
        if (t6Var == null) {
            return;
        }
        t6Var.D = j10;
        t6Var.f42419j = true;
        k5Var.w(true);
    }

    @Override
    public boolean ignoreHapticFeedbackSettings(float f10, float f11) {
        return false;
    }

    @Override
    public void j1(float f10) {
        k5 k5Var = (k5) this.f16195b;
        t6 t6Var = k5Var.d;
        if (t6Var == null) {
            return;
        }
        t6Var.F = f10;
        t6Var.f42419j = true;
        k5Var.w(true);
    }

    @Override
    public void k(int i10) {
        switch (this.f16194a) {
            case 21:
                ((u0) this.f16195b).l();
                return;
            default:
                AndroidUtilities.runOnUIThread(new ga(this, 20));
                return;
        }
    }

    @Override
    public int k0(s1 s1Var) {
        return 0;
    }

    @Override
    public void k1(j0 j0Var, long j10, long j11) {
        int size;
        p0 p0Var = (p0) j0Var;
        r4.g gVar = (r4.g) this.f16195b;
        long j12 = p0Var.f6406a;
        Uri uri = p0Var.d.f6458c;
        ?? obj = new Object();
        gVar.f43313n.getClass();
        gVar.f43317r.p(obj, p0Var.f6408c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        s4.c cVar = (s4.c) p0Var.f6409f;
        s4.c cVar2 = gVar.I;
        if (cVar2 == null) {
            size = 0;
        } else {
            size = cVar2.f44060m.size();
        }
        long j13 = cVar.b(0).f44076b;
        int i10 = 0;
        while (i10 < size && gVar.I.b(i10).f44076b < j13) {
            i10++;
        }
        if (cVar.d) {
            if (size - i10 > cVar.f44060m.size()) {
                h5.a.K("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j14 = gVar.O;
                if (j14 != -9223372036854775807L && cVar.h * 1000 <= j14) {
                    h5.a.K("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + gVar.O);
                } else {
                    gVar.N = 0;
                }
            }
            int i11 = gVar.N;
            gVar.N = i11 + 1;
            if (i11 < gVar.f43313n.p(p0Var.f6408c)) {
                gVar.E.postDelayed(gVar.f43321w, Math.min((gVar.N - 1) * 1000, 5000));
                return;
            }
            gVar.D = new IOException();
            return;
        }
        gVar.I = cVar;
        gVar.J = cVar.d & gVar.J;
        gVar.K = j10 - j11;
        gVar.L = j10;
        synchronized (gVar.f43320u) {
            try {
                if (p0Var.f6407b.f6401a == gVar.G) {
                    Uri uri2 = gVar.I.f44058k;
                    if (uri2 == null) {
                        uri2 = p0Var.d.f6458c;
                    }
                    gVar.G = uri2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (size == 0) {
            s4.c cVar3 = gVar.I;
            if (cVar3.d) {
                b6.h hVar = cVar3.f44056i;
                if (hVar != null) {
                    String str = hVar.f1609b;
                    if (!d0.a(str, "urn:mpeg:dash:utc:direct:2014") && !d0.a(str, "urn:mpeg:dash:utc:direct:2012")) {
                        if (!d0.a(str, "urn:mpeg:dash:utc:http-iso:2014") && !d0.a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                            if (!d0.a(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !d0.a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                                if (!d0.a(str, "urn:mpeg:dash:utc:ntp:2014") && !d0.a(str, "urn:mpeg:dash:utc:ntp:2012")) {
                                    h5.a.p("DashMediaSource", "Failed to resolve time offset.", new IOException("Unsupported UTC timing scheme"));
                                    gVar.u(true);
                                    return;
                                }
                                gVar.t();
                                return;
                            }
                            p0 p0Var2 = new p0(gVar.A, Uri.parse(hVar.f1610c), 5, new u(21));
                            gVar.B.f(p0Var2, new r4.d(gVar), 1);
                            gVar.f43317r.u(new o4.j(p0Var2.f6407b), p0Var2.f6408c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                            return;
                        }
                        p0 p0Var3 = new p0(gVar.A, Uri.parse(hVar.f1610c), 5, new Object());
                        gVar.B.f(p0Var3, new r4.d(gVar), 1);
                        gVar.f43317r.u(new o4.j(p0Var3.f6407b), p0Var3.f6408c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                        return;
                    }
                    try {
                        gVar.M = d0.J(hVar.f1610c) - gVar.L;
                        gVar.u(true);
                        return;
                    } catch (r1 e) {
                        h5.a.p("DashMediaSource", "Failed to resolve time offset.", e);
                        gVar.u(true);
                        return;
                    }
                }
                gVar.t();
                return;
            }
            gVar.u(true);
            return;
        }
        gVar.P += i10;
        gVar.u(true);
    }

    @Override
    public void k2(long j10) {
        for (n0 n0Var : (n0[]) this.f16195b) {
            n0Var.k2(j10);
        }
    }

    @Override
    public void l() {
        x0 x0Var = (x0) this.f16195b;
        n3 n3Var = x0Var.P;
        if (n3Var != null) {
            s3.O1(n3Var.f46111a, x0Var.f46414a);
        }
    }

    @Override
    public void l1(Editable editable) {
        ((b5) this.f16195b).h();
    }

    @Override
    public boolean m1(MessageObject messageObject) {
        return org.telegram.ui.b.a(messageObject);
    }

    public q5.o m2() {
        q5.o oVar = (q5.o) this.f16195b;
        if (oVar.f42869a != null) {
            if (!Double.isNaN(oVar.d) && oVar.d < 0.0d) {
                throw new IllegalArgumentException("startTime cannot be negative or NaN.");
            }
            if (!Double.isNaN(oVar.e)) {
                if (!Double.isNaN(oVar.f42872f) && oVar.f42872f >= 0.0d) {
                    return oVar;
                }
                throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
            }
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    @Override
    public boolean n0(long j10) {
        n0[] n0VarArr;
        boolean z4;
        boolean z10;
        boolean z11 = false;
        do {
            long H = H();
            if (H == Long.MIN_VALUE) {
                return z11;
            }
            z4 = false;
            for (n0 n0Var : (n0[]) this.f16195b) {
                long H2 = n0Var.H();
                if (H2 != Long.MIN_VALUE && H2 <= j10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (H2 == H || z10) {
                    z4 |= n0Var.n0(j10);
                }
            }
            z11 |= z4;
        } while (z4);
        return z11;
    }

    @Override
    public void n1(e1 e1Var, int i10, int i11) {
        z4 z4Var;
        l9 textSelectionHelper;
        b5 b5Var = (b5) this.f16195b;
        if (!b5Var.f45903w && i10 != i11 && (z4Var = b5Var.f45902s) != null && (textSelectionHelper = ((y2) z4Var).f46409a.getTextSelectionHelper()) != null) {
            e1Var.post(new p6(this, e1Var, i11, textSelectionHelper, i10, 5));
        }
    }

    public l7.w0 n2(n7.qa r41) {
        throw new UnsupportedOperationException("Method not decompiled: o2.i.n2(n7.qa):l7.w0");
    }

    @Override
    public boolean needCancelTouchBySlopMove() {
        return true;
    }

    @Override
    public boolean needClickAt(View view, float f10, float f11) {
        int dp = AndroidUtilities.dp(9.0f);
        j61 j61Var = (j61) this.f16195b;
        float f12 = -dp;
        j61Var.f25876g.inset(f12, f12);
        boolean contains = j61Var.f25876g.contains(f10, f11);
        float f13 = dp;
        j61Var.f25876g.inset(f13, f13);
        return contains;
    }

    @Override
    public boolean needLongPress(float f10, float f11) {
        return false;
    }

    @Override
    public void o0(boolean z4) {
        k5 k5Var = (k5) this.f16195b;
        if (k5Var.j()) {
            k5Var.B.getClass();
        }
        k5Var.x(-4, z4);
    }

    public pb.d o2(cb.m r24) {
        throw new UnsupportedOperationException("Method not decompiled: o2.i.o2(cb.m):pb.d");
    }

    @Override
    public void onClickAt(View view, float f10, float f11) {
        Runnable runnable = ((j61) this.f16195b).f25878j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void onClickTouchDown(View view, float f10, float f11) {
        ((j61) this.f16195b).h.c(true);
    }

    @Override
    public void onClickTouchUp(View view, float f10, float f11) {
        ((j61) this.f16195b).h.c(false);
    }

    @Override
    public void onComplete(Task task) {
        ld.m mVar = (ld.m) this.f16195b;
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
        mVar.resumeWith(p7.a(exception));
    }

    @Override
    public boolean onLongPressRequestedAt(View view, float f10, float f11) {
        return false;
    }

    @Override
    public void onSuccess(Object obj) {
        int i10;
        int i11;
        com.google.android.gms.internal.cast.d2 d2Var;
        com.google.android.gms.internal.cast.d1 b10;
        r5.a aVar = (r5.a) this.f16195b;
        Bundle bundle = (Bundle) obj;
        if (o0.f3098j) {
            Context context = aVar.f43358a;
            u5.s sVar = aVar.f43361f;
            o0 o0Var = new o0(context, sVar, aVar.f43360c, aVar.f43364j, aVar.f43362g);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE")) {
                i10 = bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0);
            } else if (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            boolean z4 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
            if (i10 == 0) {
                if (z4) {
                    i10 = 0;
                    z4 = true;
                } else {
                    return;
                }
            }
            String packageName = context.getPackageName();
            Locale locale = Locale.ROOT;
            String k10 = w2.k(packageName, ".client_cast_analytics_data");
            if (bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            o0Var.h = i11;
            q.b(context);
            o0Var.f3103g = q.a().c(w2.a.e).a("CAST_SENDER_SDK", new v2.c("proto"), z.f3201a);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                o0Var.e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(k10, 0);
            if (i10 != 0) {
                v e = w.e();
                e.f2868c = new o3.c(sVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"}, 21);
                e.d = new y5.c[]{q5.y.f42911c};
                e.f2867b = false;
                e.f2866a = 8426;
                Task e6 = sVar.e(0, e.e());
                ?? obj2 = new Object();
                obj2.f6981b = o0Var;
                obj2.f6982c = packageName;
                obj2.f6980a = i10;
                obj2.d = sharedPreferences;
                e6.addOnSuccessListener(obj2);
            }
            if (z4) {
                b6.m.h(sharedPreferences);
                u5.b bVar = com.google.android.gms.internal.cast.d2.f3002i;
                synchronized (com.google.android.gms.internal.cast.d2.class) {
                    try {
                        if (com.google.android.gms.internal.cast.d2.f3004k == null) {
                            com.google.android.gms.internal.cast.d2.f3004k = new com.google.android.gms.internal.cast.d2(sharedPreferences, o0Var, packageName);
                        }
                        d2Var = com.google.android.gms.internal.cast.d2.f3004k;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                String str = d2Var.f3007c;
                SharedPreferences sharedPreferences2 = d2Var.f3006b;
                HashSet hashSet = d2Var.f3008f;
                String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = d2Var.f3009g;
                hashSet2.clear();
                d2Var.h = 0L;
                String str2 = com.google.android.gms.internal.cast.d2.f3003j;
                if (str2.equals(string) && str.equals(string2)) {
                    d2Var.h = sharedPreferences2.getLong("feature_usage_last_report_time", 0L);
                    long currentTimeMillis = System.currentTimeMillis();
                    HashSet hashSet3 = new HashSet();
                    for (String str3 : sharedPreferences2.getAll().keySet()) {
                        if (str3.startsWith("feature_usage_timestamp_")) {
                            long j10 = sharedPreferences2.getLong(str3, 0L);
                            if (j10 != 0 && currentTimeMillis - j10 > 1209600000) {
                                hashSet3.add(str3);
                            } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                                com.google.android.gms.internal.cast.d1 b11 = com.google.android.gms.internal.cast.d2.b(str3.substring(41));
                                if (b11 != null) {
                                    hashSet2.add(b11);
                                    hashSet.add(b11);
                                }
                            } else if (str3.startsWith("feature_usage_timestamp_detected_feature_") && (b10 = com.google.android.gms.internal.cast.d2.b(str3.substring(41))) != null) {
                                hashSet.add(b10);
                            }
                        }
                    }
                    d2Var.c(hashSet3);
                    b6.m.h(d2Var.e);
                    b6.m.h(d2Var.d);
                    d2Var.e.post(d2Var.d);
                } else {
                    HashSet hashSet4 = new HashSet();
                    for (String str4 : sharedPreferences2.getAll().keySet()) {
                        if (str4.startsWith("feature_usage_timestamp_")) {
                            hashSet4.add(str4);
                        }
                    }
                    hashSet4.add("feature_usage_last_report_time");
                    d2Var.c(hashSet4);
                    sharedPreferences2.edit().putString("feature_usage_sdk_version", str2).putString("feature_usage_package_name", str).apply();
                }
                com.google.android.gms.internal.cast.d2.a(com.google.android.gms.internal.cast.d1.CAST_CONTEXT);
            }
        }
    }

    @Override
    public boolean p0() {
        return e();
    }

    @Override
    public boolean q1() {
        return true;
    }

    public void q2() {
        r[] rVarArr;
        r[] rVarArr2;
        t4.l lVar = (t4.l) this.f16195b;
        int i10 = lVar.E - 1;
        lVar.E = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (r rVar : lVar.G) {
            rVar.d();
            i11 += rVar.V.f16403a;
        }
        s0[] s0VarArr = new s0[i11];
        int i12 = 0;
        for (r rVar2 : lVar.G) {
            rVar2.d();
            int i13 = rVar2.V.f16403a;
            int i14 = 0;
            while (i14 < i13) {
                rVar2.d();
                s0VarArr[i12] = rVar2.V.a(i14);
                i14++;
                i12++;
            }
        }
        lVar.F = new t0(s0VarArr);
        lVar.D.E1(lVar);
    }

    @Override
    public void r0() {
        ((c0) this.f16195b).d.invalidate();
    }

    @Override
    public boolean r2(s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public void s1() {
        x0 x0Var = (x0) this.f16195b;
        n3 n3Var = x0Var.P;
        if (n3Var != null) {
            vh.a aVar = x0Var.f46414a;
            s3 s3Var = n3Var.f46111a;
            d2 d2Var = s3Var.G3;
            if (d2Var != null) {
                d2Var.g();
            }
            s3Var.f46209e3.onContentChanged();
        }
    }

    @Override
    public boolean t0(u5 u5Var) {
        return false;
    }

    @Override
    public boolean t1(int i10) {
        switch (this.f16194a) {
            case 21:
                return true;
            default:
                return true;
        }
    }

    @Override
    public long u0(long j10, long j11) {
        return 0L;
    }

    @Override
    public Object u2() {
        Constructor constructor = (Constructor) this.f16195b;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e) {
            a8 a8Var = ua.c.f45266a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (InstantiationException e6) {
            throw new RuntimeException("Failed to invoke constructor '" + ua.c.b(constructor) + "' with no args", e6);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException("Failed to invoke constructor '" + ua.c.b(constructor) + "' with no args", e10.getCause());
        }
    }

    @Override
    public void v(float f10) {
        k5 k5Var = (k5) this.f16195b;
        t6 t6Var = k5Var.d;
        if (t6Var == null) {
            return;
        }
        t6Var.f42441u0 = f10;
        t6Var.f42419j = true;
        k5Var.c();
    }

    @Override
    public void v1(float f10) {
        k5 k5Var = (k5) this.f16195b;
        t6 t6Var = k5Var.d;
        if (t6Var == null) {
            return;
        }
        t6Var.E = f10;
        t6Var.f42419j = true;
        k5Var.w(true);
    }

    @Override
    public String w(long j10) {
        return null;
    }

    @Override
    public void w0(float f10, int i10) {
        ArrayList arrayList;
        k5 k5Var = (k5) this.f16195b;
        t6 t6Var = k5Var.d;
        if (t6Var != null && (arrayList = t6Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((t6) k5Var.d.T.get(i10)).P = f10;
        }
    }

    @Override
    public boolean w1(boolean z4) {
        return false;
    }

    public boolean w2(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: o2.i.w2(android.view.MotionEvent):boolean");
    }

    @Override
    public void x(Object obj) {
        Bundle extras;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f16195b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f345b;
        int i10 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).f41015a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.K;
        if (resultReceiver != null) {
            if (intent == null) {
                extras = null;
            } else {
                extras = intent.getExtras();
            }
            resultReceiver.send(i10, extras);
        }
        int i11 = aVar.f344a;
        if (i11 != -1 || i10 != 0) {
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i11 + " and billing's responseCode: " + i10);
        }
        proxyBillingActivityV2.finish();
    }

    @Override
    public void x0(j0 j0Var, long j10, long j11, boolean z4) {
        p0 p0Var = (p0) j0Var;
        r4.g gVar = (r4.g) this.f16195b;
        long j12 = p0Var.f6406a;
        Uri uri = p0Var.d.f6458c;
        ?? obj = new Object();
        gVar.f43313n.getClass();
        gVar.f43317r.m(obj, p0Var.f6408c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public long x1() {
        return 0L;
    }

    @Override
    public long y1() {
        long j10 = Long.MAX_VALUE;
        for (n0 n0Var : (n0[]) this.f16195b) {
            long y12 = n0Var.y1();
            if (y12 != Long.MIN_VALUE) {
                j10 = Math.min(j10, y12);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    public v0.j y2() {
        String string;
        Context context = (Context) this.f16195b;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List<String> m9 = tc.g.m(arrayList);
        if (m9.isEmpty()) {
            return null;
        }
        v0.j jVar = null;
        for (String str : m9) {
            try {
                Object newInstance = Class.forName(str).getConstructor(Context.class).newInstance(context);
                kotlin.jvm.internal.j.c(newInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                v0.j jVar2 = (v0.j) newInstance;
                if (!jVar2.isAvailableOnDevice()) {
                    continue;
                } else if (jVar != null) {
                    Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                    return null;
                } else {
                    jVar = jVar2;
                }
            } catch (Throwable unused) {
            }
        }
        return jVar;
    }

    @Override
    public void z0(float f10) {
        k5 k5Var = (k5) this.f16195b;
        t6 t6Var = k5Var.d;
        if (t6Var == null) {
            return;
        }
        t6Var.P = f10;
        k5Var.c();
    }

    @Override
    public boolean z2(int i10) {
        return false;
    }

    public i(Object obj, int i10) {
        this.f16194a = i10;
        this.f16195b = obj;
    }

    @Override
    public long a(long j10) {
        return 0L;
    }

    public i(MediaInfo mediaInfo) {
        this.f16194a = 12;
        q5.o oVar = new q5.o(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.f16195b = oVar;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public i(JSONObject jSONObject) {
        this.f16194a = 12;
        this.f16195b = new q5.o(jSONObject);
    }

    public i(Context context) {
        this.f16194a = 24;
        kotlin.jvm.internal.j.e(context, "context");
        this.f16195b = context;
    }

    public i(int i10) {
        this.f16194a = i10;
        switch (i10) {
            case 13:
                this.f16195b = new h5.w(10);
                return;
            case 18:
                this.f16195b = new i(20);
                return;
            case 20:
                this.f16195b = new tp0(rb.a.h, 12);
                return;
            default:
                return;
        }
    }

    public i(Context context, n20 n20Var) {
        this.f16194a = 5;
        this.f16195b = new m20(context, n20Var);
    }

    public i(int i10, int i11) {
        this.f16194a = 6;
        this.f16195b = ApplicationLoader.applicationContext.getSharedPreferences(android.support.v4.media.a.k(i10, i11, "pip_layout_", "_"), 0);
    }

    @Override
    public void B2() {
    }

    @Override
    public void E0() {
    }

    @Override
    public void V1() {
    }

    @Override
    public void d2() {
    }

    @Override
    public void j() {
    }

    @Override
    public void o() {
    }

    @Override
    public void p1() {
    }

    @Override
    public void q0() {
    }

    @Override
    public void s() {
    }

    @Override
    public void v2() {
    }

    private final void t2(ArrayList arrayList) {
    }

    @Override
    public void A(s1 s1Var) {
    }

    @Override
    public void D0(s1 s1Var) {
    }

    @Override
    public void F(s1 s1Var) {
    }

    @Override
    public void G1(boolean z4) {
    }

    @Override
    public void H1(s1 s1Var) {
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void I0(s1 s1Var) {
    }

    @Override
    public void K0(s1 s1Var) {
    }

    @Override
    public void L(s1 s1Var) {
    }

    @Override
    public void M0(boolean z4) {
    }

    @Override
    public void N0(s1 s1Var) {
    }

    @Override
    public void O(MessageObject messageObject) {
    }

    @Override
    public void O1(s1 s1Var) {
    }

    @Override
    public void Q0(CharSequence charSequence) {
    }

    @Override
    public void Q1(MessageObject messageObject) {
    }

    @Override
    public void S0(s1 s1Var) {
    }

    @Override
    public void U(s1 s1Var) {
    }

    @Override
    public void d1(s1 s1Var) {
    }

    @Override
    public void e1(s1 s1Var) {
    }

    @Override
    public void f0(int i10) {
    }

    @Override
    public void j2(s1 s1Var) {
    }

    @Override
    public void l0(s1 s1Var) {
    }

    @Override
    public void n(s1 s1Var) {
    }

    @Override
    public void q(s1 s1Var) {
    }

    @Override
    public void s0(String str) {
    }

    @Override
    public void s2(s1 s1Var) {
    }

    @Override
    public void t(s1 s1Var) {
    }

    @Override
    public void u(s1 s1Var) {
    }

    @Override
    public void y(s1 s1Var) {
    }

    @Override
    public void E(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void I1(s1 s1Var, boolean z4) {
    }

    @Override
    public void L1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void M(s1 s1Var, jh.f fVar) {
    }

    @Override
    public void N(int i10, s1 s1Var) {
    }

    @Override
    public void W0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void Y1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void l2(s1 s1Var, long j10) {
    }

    @Override
    public long p(long j10, long j11) {
        return j11;
    }

    @Override
    public void r(int i10, int i11) {
    }

    @Override
    public void r1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void u1(s1 s1Var, TLRPC.Document document) {
    }

    @Override
    public void C2(s1 s1Var, int i10, int i11) {
    }

    @Override
    public void F0(s1 s1Var, TLObject tLObject, boolean z4) {
    }

    @Override
    public void G0(s1 s1Var, float f10, float f11) {
    }

    @Override
    public void b1(s1 s1Var, CharacterStyle characterStyle, boolean z4) {
    }

    @Override
    public void i0(s1 s1Var, float f10, float f11) {
    }

    @Override
    public void onClickTouchMove(View view, float f10, float f11) {
    }

    @Override
    public void onLongPressCancelled(View view, float f10, float f11) {
    }

    @Override
    public void onLongPressFinish(View view, float f10, float f11) {
    }

    @Override
    public void v0(s1 s1Var, float f10, float f11) {
    }

    @Override
    public void z1(s1 s1Var, float f10, float f11) {
    }

    @Override
    public void A0(s1 s1Var, float f10, float f11, boolean z4) {
    }

    @Override
    public void Z1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void m(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void y0(s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void i(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void x2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    @Override
    public void T(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    @Override
    public void onLongPressMove(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
    }
}
