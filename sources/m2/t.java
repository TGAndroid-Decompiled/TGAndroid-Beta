package m2;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import b8.yd;
import com.google.android.gms.tasks.TaskCompletionSource;
import gi.v5;
import gi.w5;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import mi.b6;
import mi.h1;
import mi.h3;
import mi.i4;
import mi.q3;
import mi.r3;
import mi.s3;
import mi.t3;
import mi.y3;
import org.telegram.messenger.g10;
import org.telegram.messenger.o2;
import org.telegram.messenger.wi;
import org.telegram.messenger.yv;
import org.telegram.messenger.z9;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.om0;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.vs;
import org.telegram.ui.Components.xs;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.hj0;
import org.telegram.ui.j5;
import org.telegram.ui.jw;
import org.telegram.ui.ng0;
import org.telegram.ui.nj0;
import org.telegram.ui.sg0;
import org.telegram.ui.tw;
import org.telegram.ui.uw;
import org.telegram.ui.vq0;
import org.telegram.ui.yj0;
import u4.d1;
import u4.j1;
public final class t implements r3, com.google.android.gms.common.api.internal.p, g2.e, p5.b, om0, vs, l1, ij0, nj0, si.a, qe.d, r2.t, qe.b {
    public final int f19005a;
    public Object f19006b;
    public Object f19007c;

    public t(int i3, Object obj, Object obj2) {
        this.f19005a = i3;
        this.f19007c = obj;
        this.f19006b = obj2;
    }

    public void A(Object obj, String str) {
        int length = str.length();
        String valueOf = String.valueOf(obj);
        ((ArrayList) this.f19006b).add(f1.r(str, "=", valueOf, new StringBuilder(length + 1 + valueOf.length())));
    }

    public void C0(long j10, File file) {
        synchronized (((e0.g) this.f19007c).f9237f) {
            ((HashMap) ((e0.g) this.f19007c).f9238g).put(Long.valueOf(j10), file);
        }
    }

    @Override
    public f60 D1(View view) {
        mi.p pVar = (mi.p) this.f19007c;
        f60 f60Var = new f60(pVar, (e6) this.f19006b, view, false, false, true);
        pVar.I = f60Var;
        return f60Var;
    }

    @Override
    public void E(h1 h1Var, boolean z10) {
        ((mi.p) this.f19007c).f38416b.h1(h1Var, z10);
    }

    @Override
    public void E1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        sf.c.t(q1Var.getContext(), str);
    }

    @Override
    public void F(float r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: m2.t.F(float, int):void");
    }

    public d2.t0 F0(d1 d1Var, int i3) {
        j1 j1Var;
        d2.t0 t0Var;
        a0.f fVar = (a0.f) this.f19006b;
        int d = fVar.d(d1Var);
        if (d >= 0 && (j1Var = (j1) fVar.i(d)) != null) {
            int i10 = j1Var.f55594a;
            if ((i10 & i3) != 0) {
                int i11 = i10 & (~i3);
                j1Var.f55594a = i11;
                if (i3 == 4) {
                    t0Var = j1Var.f55595b;
                } else if (i3 == 8) {
                    t0Var = j1Var.f55596c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i11 & 12) == 0) {
                    fVar.g(d);
                    j1Var.f55594a = 0;
                    j1Var.f55595b = null;
                    j1Var.f55596c = null;
                    j1.d.q(j1Var);
                }
                return t0Var;
            }
        }
        return null;
    }

    @Override
    public CharacterStyle G1(q1 q1Var) {
        return null;
    }

    public void H0(int i3) {
        yv[] yvVarArr = (yv[]) this.f19006b;
        yv yvVar = yvVarArr[i3];
        Integer num = yvVar.f26662c;
        if (num != null) {
            int i10 = i3 * 2;
            g0(yvVarArr[i10], num.intValue());
            g0(yvVarArr[i10 + 1], yvVar.f26662c.intValue());
            yvVar.f26662c = null;
        }
    }

    public long I0(int i3, int i10) {
        long[] jArr = (long[]) this.f19007c;
        if (jArr.length < 30) {
            if (i3 < 0) {
                i3 = 0;
            }
            if (i10 > jArr.length - 1) {
                i10 = jArr.length - 1;
            }
            long j10 = Long.MIN_VALUE;
            while (i3 <= i10) {
                long j11 = jArr[i3];
                if (j11 > j10) {
                    j10 = j11;
                }
                i3++;
            }
            return j10;
        }
        return M0(1, i3, i10);
    }

    @Override
    public boolean I1(q1 q1Var, zi ziVar) {
        return false;
    }

    @Override
    public boolean J0(long j10) {
        return ((dy0) this.f19007c).f33216w;
    }

    @Override
    public l9.y L(d2.q0 q0Var) {
        l9.y L = ((g2.e) this.f19006b).L(q0Var);
        if (L == null) {
            return null;
        }
        return yd.c(L, new l5.b(this, 21));
    }

    public void M(d1 d1Var, d2.t0 t0Var) {
        a0.f fVar = (a0.f) this.f19006b;
        j1 j1Var = (j1) fVar.get(d1Var);
        if (j1Var == null) {
            j1Var = j1.a();
            fVar.put(d1Var, j1Var);
        }
        j1Var.f55596c = t0Var;
        j1Var.f55594a |= 8;
    }

    public long M0(int i3, int i10, int i11) {
        yv yvVar = ((yv[]) this.f19006b)[i3];
        Integer num = yvVar.f26662c;
        if (num != null) {
            int i12 = yvVar.d;
            int i13 = yvVar.f26663e;
            if (i10 >= i12 && i11 <= i13) {
                return num.intValue();
            }
        }
        int i14 = yvVar.d;
        int i15 = yvVar.f26663e;
        if (i14 >= i10 && i15 <= i11) {
            return yvVar.f26660a;
        }
        if ((i10 <= i14 && i11 >= i14) || (i10 >= i14 && i10 <= i15)) {
            H0(i3);
            int i16 = i3 * 2;
            return Math.max(M0(i16, i10, i11), M0(i16 + 1, i10, i11));
        }
        return 0L;
    }

    @Override
    public void O(int i3) {
        mi.p.S((mi.p) this.f19007c, 74, i3);
    }

    public long O0(int i3, int i10) {
        long[] jArr = (long[]) this.f19007c;
        if (jArr.length < 30) {
            if (i3 < 0) {
                i3 = 0;
            }
            if (i10 > jArr.length - 1) {
                i10 = jArr.length - 1;
            }
            long j10 = Long.MAX_VALUE;
            while (i3 <= i10) {
                long j11 = jArr[i3];
                if (j11 < j10) {
                    j10 = j11;
                }
                i3++;
            }
            return j10;
        }
        return T0(1, i3, i10);
    }

    @Override
    public void O1() {
        mi.p pVar = (mi.p) this.f19007c;
        pVar.c0();
        pVar.d0();
    }

    @Override
    public boolean P0(q1 q1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean P1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean Q(q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public void R0() {
        mi.p pVar = (mi.p) this.f19007c;
        if (pVar.getCurrentItemTop() != pVar.J) {
            pVar.f38416b.M1(pVar, 0);
        }
        pVar.f0();
        mi.p.O(pVar);
    }

    @Override
    public a3.s R1() {
        return new ua.b(2, ((r2.t) this.f19006b).R1(), (List) this.f19007c);
    }

    @Override
    public boolean S(q1 q1Var) {
        return false;
    }

    @Override
    public vq0 S1() {
        return null;
    }

    @Override
    public boolean T() {
        return false;
    }

    public long T0(int i3, int i10, int i11) {
        yv yvVar = ((yv[]) this.f19006b)[i3];
        Integer num = yvVar.f26662c;
        if (num != null) {
            int i12 = yvVar.d;
            int i13 = yvVar.f26663e;
            if (i10 >= i12 && i11 <= i13) {
                return num.intValue();
            }
        }
        int i14 = yvVar.d;
        int i15 = yvVar.f26663e;
        if (i14 >= i10 && i15 <= i11) {
            return yvVar.f26661b;
        }
        if ((i10 <= i14 && i11 >= i14) || (i10 >= i14 && i10 <= i15)) {
            H0(i3);
            int i16 = i3 * 2;
            return Math.min(T0(i16, i10, i11), T0(i16 + 1, i10, i11));
        }
        return 2147483647L;
    }

    @Override
    public void T1(q3 q3Var, View view) {
        mi.p pVar = (mi.p) this.f19007c;
        f60 f60Var = new f60(pVar, (e6) this.f19006b, view, false, false, true);
        f60Var.Q = true;
        pVar.I = i4.c(f60Var, pVar.f38416b.X1, pVar.getContext(), (e6) this.f19006b, q3Var, true);
    }

    public void U0() {
        l8.a aVar = (l8.a) this.f19006b;
        try {
            u7.f fVar = (u7.f) aVar.f18096a;
            fVar.T0(fVar.P0(), 1);
            ((z9) this.f19007c).f26756c.remove(aVar);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void V0(d1 d1Var) {
        j1 j1Var = (j1) ((a0.f) this.f19006b).get(d1Var);
        if (j1Var == null) {
            return;
        }
        j1Var.f55594a &= -2;
    }

    @Override
    public boolean V1(long j10) {
        return ((dy0) this.f19007c).f33215s;
    }

    @Override
    public void W(s3 s3Var, View view) {
        mi.p pVar = (mi.p) this.f19007c;
        f60 f60Var = new f60(pVar, (e6) this.f19006b, view, false, false, true);
        f60Var.Q = true;
        d2 d2Var = pVar.f38416b.X1;
        pVar.getContext();
        pVar.I = i4.b(f60Var, d2Var, s3Var, true);
    }

    public void W0(d1 d1Var) {
        a0.f fVar = (a0.f) this.f19006b;
        a0.h hVar = (a0.h) this.f19007c;
        int m10 = hVar.m() - 1;
        while (true) {
            if (m10 < 0) {
                break;
            } else if (d1Var == hVar.n(m10)) {
                Object[] objArr = hVar.f19c;
                Object obj = objArr[m10];
                Object obj2 = a0.i.f20a;
                if (obj != obj2) {
                    objArr[m10] = obj2;
                    hVar.f17a = true;
                }
            } else {
                m10--;
            }
        }
        j1 j1Var = (j1) fVar.get(d1Var);
        if (j1Var != null) {
            fVar.remove(d1Var);
            j1Var.f55594a = 0;
            j1Var.f55595b = null;
            j1Var.f55596c = null;
            j1.d.q(j1Var);
        }
    }

    @Override
    public int X() {
        return 0;
    }

    @Override
    public boolean X0(zi ziVar) {
        return f1.a(ziVar);
    }

    @Override
    public void Y(int i3, float f10, float f11, qe.c cVar) {
        sh.h hVar = (sh.h) this.f19007c;
        hVar.f54731c.a(f10);
        hVar.d.a(f10);
        hVar.f54730b.a(f10);
        ((Runnable) this.f19006b).run();
    }

    @Override
    public void Y0(int i3) {
        mi.p pVar = (mi.p) this.f19007c;
        pVar.f38416b.M1(pVar, i3);
        pVar.f0();
        mi.p.O(pVar);
    }

    @Override
    public boolean Y1(q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public kh.a Z() {
        return null;
    }

    @Override
    public void Z0(b6 b6Var, String str) {
        mi.p pVar = (mi.p) this.f19007c;
        if (pVar.f19795w == null) {
            e6 e6Var = (e6) this.f19006b;
            pVar.f19795w = new fa.f(new ai.n(28, this, e6Var), e6Var);
        }
        pVar.f19795w.k(b6Var, str);
    }

    @Override
    public void a() {
        ((qe.i) this.f19006b).a();
    }

    @Override
    public void a0() {
        int i3;
        mi.p pVar = (mi.p) this.f19007c;
        t3 t3Var = pVar.f19793r;
        y3 y3Var = pVar.f19794s;
        if (y3Var != null) {
            h3 h3Var = t3Var.f19928v3;
            if (h3Var != null && h3Var.x() && t3Var.F4()) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (y3Var.f20056b0 == 2) {
                y3Var.f20058c0 = i3;
            } else {
                y3Var.g(i3, true);
            }
            if (i3 != 0) {
                pVar.b0();
            }
        }
        pVar.e0();
    }

    public void a1(int i3) {
        try {
            u7.f fVar = (u7.f) ((l8.a) this.f19006b).f18096a;
            Parcel P0 = fVar.P0();
            P0.writeInt(i3);
            fVar.T0(P0, 11);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        int i3;
        switch (this.f19005a) {
            case 2:
                n7.d dVar = (n7.d) this.f19006b;
                n7.b bVar = (n7.b) obj;
                d7.b bVar2 = new d7.b(dVar, (TaskCompletionSource) obj2);
                Context context = dVar.f6772a;
                try {
                    i3 = y6.b.a(context).d(0, context.getPackageName()).versionCode;
                } catch (PackageManager.NameNotFoundException unused) {
                    i3 = 0;
                }
                l6.b bVar3 = (l6.b) this.f19007c;
                bVar3.f18056f = i3;
                n7.c cVar = (n7.c) bVar.m();
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true), true);
                gVar.f6590c = false;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
                int i10 = n7.a.f20272a;
                obtain.writeStrongBinder(bVar2);
                obtain.writeInt(1);
                bVar3.writeToParcel(obtain, 0);
                obtain.writeInt(1);
                gVar.writeToParcel(obtain, 0);
                Parcel obtain2 = Parcel.obtain();
                try {
                    cVar.f20273a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                    obtain.recycle();
                    obtain2.recycle();
                }
            default:
                u6.d dVar2 = new u6.d((u6.e) this.f19006b, (TaskCompletionSource) obj2, 1);
                u6.c cVar2 = (u6.c) ((u6.f) obj).m();
                Parcel J0 = cVar2.J0();
                m7.a.c(J0, dVar2);
                m7.a.b(J0, (u6.a) this.f19007c);
                J0.writeStrongBinder(null);
                cVar2.K0(J0, 2);
                return;
        }
    }

    @Override
    public boolean mo20b(float f10, float f11, int i3, View view) {
        uw uwVar = (uw) this.f19007c;
        if (view instanceof t2) {
            t2 t2Var = (t2) view;
            if (t2Var.f30534o2) {
                uwVar.Z4(t2Var.getDialogId(), view);
                return true;
            }
        }
        jw jwVar = uwVar.A0;
        if (jwVar != null && jwVar.getVisibility() == 0 && uwVar.A0.f32459n) {
            return false;
        }
        return uwVar.A4(view, i3, f10, ((tw) this.f19006b).d);
    }

    @Override
    public boolean b0(q1 q1Var) {
        return false;
    }

    @Override
    public void b1(mi.a aVar) {
        mi.p pVar = (mi.p) this.f19007c;
        bi biVar = pVar.f38416b;
        d2 d2Var = biVar.X1;
        if (d2Var != null && aVar != null && (aVar.f19431b instanceof TL_iv.pageBlockMap) && org.telegram.messenger.g0.J1(d2Var)) {
            bi biVar2 = new bi(pVar.getContext(), biVar.X1, false, false, false, null);
            biVar2.U3 = new kb.a(15);
            biVar2.H1 = true;
            biVar2.f32272s3.setVisibility(8);
            biVar2.f32269r4 = new aa.a(pVar, aVar, biVar2, 11);
            biVar2.e1();
            biVar2.show();
        }
    }

    @Override
    public boolean c() {
        return false;
    }

    public void c0(int i3, int i10, int i11) {
        yv[] yvVarArr = (yv[]) this.f19006b;
        ?? obj = new Object();
        obj.f26662c = null;
        yvVarArr[i3] = obj;
        obj.d = i10;
        obj.f26663e = (i10 + i11) - 1;
        if (i11 == 1) {
            long j10 = ((long[]) this.f19007c)[i10];
            obj.f26660a = j10;
            obj.f26661b = j10;
            return;
        }
        int i12 = i3 * 2;
        int i13 = i11 / 2;
        c0(i12, i10, i13);
        int i14 = i12 + 1;
        c0(i14, i10 + i13, i11 - i13);
        yv yvVar = yvVarArr[i3];
        yv yvVar2 = yvVarArr[i12];
        yvVar2.getClass();
        yv yvVar3 = yvVarArr[i14];
        yvVar3.getClass();
        yvVar.getClass();
        yvVar.f26660a = Math.max(yvVar2.f26660a, yvVar3.f26660a);
        yvVarArr[i3].f26661b = Math.min(yvVarArr[i12].f26661b, yvVarArr[i14].f26661b);
    }

    @Override
    public boolean d() {
        return true;
    }

    @Override
    public boolean d0(q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean e(float r6) {
        throw new UnsupportedOperationException("Method not decompiled: m2.t.e(float):boolean");
    }

    public void e1(double d) {
        l8.a aVar = (l8.a) this.f19006b;
        aVar.getClass();
        try {
            u7.f fVar = (u7.f) aVar.f18096a;
            Parcel P0 = fVar.P0();
            P0.writeDouble(d);
            fVar.T0(P0, 5);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public boolean e2(q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public void f(String str, String str2) {
        yj0 yj0Var = ((hj0) this.f19007c).f45928a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            yj0Var.S1(true, str2, (sg0) this.f19006b, this, yj0Var.C1);
        } else {
            yj0Var.R1(true, false);
        }
    }

    @Override
    public boolean f0() {
        return false;
    }

    @Override
    public String g(q1 q1Var) {
        return null;
    }

    public void g0(yv yvVar, int i3) {
        yvVar.f26662c = Integer.valueOf(i3);
        int i10 = yvVar.d;
        long j10 = i3;
        yvVar.f26660a = j10;
        yvVar.f26661b = j10;
        ((long[]) this.f19007c)[i10] = j10;
    }

    public void g1(int i3) {
        try {
            u7.f fVar = (u7.f) ((l8.a) this.f19006b).f18096a;
            Parcel P0 = fVar.P0();
            P0.writeInt(i3);
            fVar.T0(P0, 9);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public Object mo5get() {
        return new o5.d((Context) ((c9.o) this.f19006b).f4279a, (k4.j) ((v5) this.f19007c).mo5get());
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public void h() {
        Point point = org.telegram.messenger.g0.f22608q;
        if (point.x > point.y) {
            ((uw) this.f19007c).finishPreviewFragment();
        }
    }

    public int h1(Context context, com.google.android.gms.common.api.c cVar) {
        p6.m.g(context);
        p6.m.g(cVar);
        int i3 = 0;
        if (!cVar.b()) {
            return 0;
        }
        int d = cVar.d();
        int j12 = j1(d);
        if (j12 != -1) {
            return j12;
        }
        SparseIntArray sparseIntArray = (SparseIntArray) this.f19006b;
        synchronized (sparseIntArray) {
            int i10 = 0;
            while (true) {
                try {
                    if (i10 < sparseIntArray.size()) {
                        int keyAt = sparseIntArray.keyAt(i10);
                        if (keyAt > d && sparseIntArray.get(keyAt) == 0) {
                            break;
                        }
                        i10++;
                    } else {
                        i3 = -1;
                        break;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (i3 == -1) {
                i3 = ((m6.e) this.f19007c).d(context, d);
            }
            sparseIntArray.put(d, i3);
        }
        return i3;
    }

    public void i0(k2.d dVar) {
        synchronized (dVar) {
        }
        Handler handler = (Handler) this.f19006b;
        if (handler != null) {
            handler.post(new q(this, dVar, 0));
        }
    }

    @Override
    public int j0(q1 q1Var) {
        return 0;
    }

    public int j1(int i3) {
        int i10;
        SparseIntArray sparseIntArray = (SparseIntArray) this.f19006b;
        synchronized (sparseIntArray) {
            i10 = sparseIntArray.get(i3, -1);
        }
        return i10;
    }

    @Override
    public a3.s j2(r2.p pVar, r2.m mVar) {
        return new ua.b(2, ((r2.t) this.f19006b).j2(pVar, mVar), (List) this.f19007c);
    }

    @Override
    public void k(boolean z10, float f10) {
        j5.k1 = f10;
        ((TextView) this.f19006b).setText("Saturation " + (f10 * 5.0f));
        qt0 qt0Var = ((j5) this.f19007c).f46497j1;
        qt0Var.M();
        qt0Var.L();
    }

    @Override
    public void l(Canvas canvas, float f10, float f11, float f12, float f13) {
        Paint paint = (Paint) this.f19006b;
        PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f19007c;
        vg.x0 x0Var = premiumPreviewFragment.f41650n0;
        if (premiumPreviewFragment.f41645i0) {
            paint.setColor(premiumPreviewFragment.getThemedColor(k6.f27824a7));
            canvas.drawRect(f10, f11, f12, f13, paint);
            return;
        }
        x0Var.d(0, (-premiumPreviewFragment.f41640e0.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.f41637c0, 0, premiumPreviewFragment.f41640e0.getMeasuredWidth(), 0.0f, premiumPreviewFragment.f41640e0.getMeasuredHeight());
        canvas.drawRect(f10, f11, f12, f13, x0Var.f56911f);
    }

    public ArrayList l0() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        Context context = (Context) this.f19006b;
        Class cls = (Class) ((i9) this.f19007c).f34636b;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, cls), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        for (String str2 : arrayList) {
            arrayList2.add(new t9.c(str2, 0));
        }
        return arrayList2;
    }

    @Override
    public void m() {
        ((org.telegram.ui.Cells.h3) this.f19007c).b(((xs) this.f19006b).getText());
    }

    @Override
    public boolean m0() {
        return false;
    }

    @Override
    public boolean m2(int i3) {
        return false;
    }

    @Override
    public boolean n1() {
        return false;
    }

    @Override
    public boolean o0(p5 p5Var) {
        return false;
    }

    @Override
    public void onContentChanged() {
        mi.p pVar = (mi.p) this.f19007c;
        y3 y3Var = pVar.f19794s;
        if (y3Var != null) {
            y3Var.setSendLoading(pVar.f19793r.p3());
        }
        pVar.a0(true);
        pVar.d0();
        mi.d dVar = pVar.Q;
        org.telegram.messenger.g0.r(dVar);
        org.telegram.messenger.g0.i3(dVar, 1000L);
    }

    @Override
    public boolean p1(q1 q1Var, int i3) {
        return false;
    }

    @Override
    public int q0() {
        return 0;
    }

    @Override
    public org.telegram.ui.Cells.i9 q2() {
        return null;
    }

    @Override
    public void r(float f10) {
        Point point = org.telegram.messenger.g0.f22608q;
        if (point.x > point.y) {
            ((uw) this.f19007c).movePreviewFragment(f10);
        }
    }

    public ng0 r0(int i3, long j10, boolean z10) {
        if (i3 > 0) {
            i3 = ((SparseIntArray) this.f19007c).get(i3, 0);
        }
        Object obj = null;
        if (i3 == 0) {
            return null;
        }
        long j11 = i3;
        LongSparseArray U = ((w5) this.f19006b).U(j10, 0L);
        if (U != null) {
            obj = U.get(j11);
        }
        ng0 ng0Var = (ng0) obj;
        if (ng0Var == null && z10) {
            ng0 ng0Var2 = new ng0();
            ((w5) this.f19006b).Y(j10, 0L, j11, ng0Var2);
            return ng0Var2;
        }
        return ng0Var;
    }

    @Override
    public void s1() {
        ((qe.i) this.f19006b).b((qe.j) this.f19007c);
    }

    @Override
    public boolean t() {
        return false;
    }

    public String toString() {
        switch (this.f19005a) {
            case 20:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f19007c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f19006b;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    sb2.append((String) arrayList.get(i3));
                    if (i3 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override
    public l9.y u(byte[] bArr) {
        return yd.c(((g2.e) this.f19006b).u(bArr), new l5.b(this, 21));
    }

    @Override
    public void u0() {
        y3 y3Var = ((mi.p) this.f19007c).f19794s;
        if (y3Var != null) {
            int i3 = y3Var.f20056b0;
            if (i3 == 2) {
                i3 = 0;
            }
            y3Var.f20058c0 = i3;
            y3Var.e(false, false);
            y3Var.g(2, true);
        }
    }

    public boolean v0() {
        org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.f19007c;
        if (w5Var.J0 <= 0.0f && !w5Var.A0()) {
            return false;
        }
        return true;
    }

    @Override
    public void v1() {
        y3 y3Var = ((mi.p) this.f19007c).f19794s;
        if (y3Var != null) {
            int i3 = 0;
            y3Var.e(false, true);
            int i10 = y3Var.f20058c0;
            if (i10 != 2) {
                i3 = i10;
            }
            y3Var.g(i3, true);
        }
    }

    public boolean w0(p4.t tVar, String str) {
        Context context = (Context) this.f19006b;
        int i3 = tVar.f53185b;
        if (i3 < 0) {
            if (context.getPackageManager().checkPermission(str, tVar.f53184a) == 0) {
                return true;
            }
            return false;
        } else if (context.checkPermission(str, i3, tVar.f53186c) == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean w1(q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public boolean x(float f10) {
        return false;
    }

    @Override
    public boolean x0(zi ziVar) {
        return true;
    }

    @Override
    public boolean y1() {
        return false;
    }

    @Override
    public String z(long j10) {
        String trim = ((EditTextBoldCursor) this.f19006b).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (!((dy0) this.f19007c).f33215s && TextUtils.isEmpty(trim)) {
            return null;
        }
        return trim;
    }

    public t(int i3, boolean z10) {
        this.f19005a = i3;
    }

    public t(Object obj, Object obj2, boolean z10, int i3) {
        this.f19005a = i3;
        this.f19006b = obj;
        this.f19007c = obj2;
    }

    public t(Object obj) {
        this.f19005a = 20;
        this.f19007c = obj;
        this.f19006b = new ArrayList();
    }

    public t(m6.e eVar) {
        this.f19005a = 21;
        this.f19006b = new SparseIntArray();
        p6.m.g(eVar);
        this.f19007c = eVar;
    }

    public t(long[] jArr) {
        this.f19005a = 8;
        this.f19007c = jArr;
        if (jArr.length < 30) {
            return;
        }
        this.f19006b = new yv[(int) (Math.pow(2.0d, Math.floor((Math.log(jArr.length) / Math.log(2.0d)) + 1.0d)) * 2.0d)];
        c0(1, 0, jArr.length);
    }

    public t(byte[] bArr) {
        this.f19005a = 18;
        this.f19006b = bArr;
    }

    public t(Handler handler, u uVar) {
        this.f19005a = 0;
        if (uVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f19006b = handler;
        this.f19007c = uVar;
    }

    public t(PremiumPreviewFragment premiumPreviewFragment) {
        this.f19005a = 16;
        this.f19007c = premiumPreviewFragment;
        this.f19006b = new Paint();
    }

    public t(int i3) {
        this.f19005a = i3;
        switch (i3) {
            case 28:
                this.f19006b = new a0.l(0);
                this.f19007c = new a0.h();
                return;
            default:
                this.f19006b = new w5(23);
                this.f19007c = new SparseIntArray();
                return;
        }
    }

    @Override
    public void D() {
    }

    @Override
    public void G() {
    }

    @Override
    public void K1() {
    }

    @Override
    public void c1() {
    }

    @Override
    public void h2() {
    }

    @Override
    public void j() {
    }

    @Override
    public void o2() {
    }

    @Override
    public void q() {
    }

    @Override
    public void v() {
    }

    @Override
    public void z0() {
    }

    @Override
    public void A1(q1 q1Var) {
    }

    @Override
    public void B(q1 q1Var) {
    }

    @Override
    public void C(q1 q1Var) {
    }

    @Override
    public void C1(zi ziVar) {
    }

    @Override
    public void D0(q1 q1Var) {
    }

    @Override
    public void G0(q1 q1Var) {
    }

    @Override
    public void I(q1 q1Var) {
    }

    @Override
    public void J(wi wiVar) {
    }

    @Override
    public void K0(q1 q1Var) {
    }

    @Override
    public void N(q1 q1Var) {
    }

    @Override
    public void P(zi ziVar) {
    }

    @Override
    public void Q0(q1 q1Var) {
    }

    @Override
    public void S0(q1 q1Var) {
    }

    @Override
    public void V(q1 q1Var) {
    }

    @Override
    public void Z1(q1 q1Var) {
    }

    @Override
    public void e0(int i3) {
    }

    @Override
    public void f2(q1 q1Var) {
    }

    @Override
    public void k0(q1 q1Var) {
    }

    @Override
    public void n0(String str) {
    }

    @Override
    public void o(boolean z10) {
    }

    @Override
    public void p(q1 q1Var) {
    }

    @Override
    public void s(q1 q1Var) {
    }

    @Override
    public void t1(q1 q1Var) {
    }

    @Override
    public void w(q1 q1Var) {
    }

    @Override
    public void y(q1 q1Var) {
    }

    @Override
    public void y0(q1 q1Var) {
    }

    @Override
    public void H(q1 q1Var, o2 o2Var) {
    }

    @Override
    public void L0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void M1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void Q1(q1 q1Var, g10 g10Var) {
    }

    @Override
    public void U1(String str, String str2) {
    }

    @Override
    public void a2(q1 q1Var, long j10) {
    }

    @Override
    public void d1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void f1(q1 q1Var, int i3) {
    }

    @Override
    public void u1(q1 q1Var, boolean z10) {
    }

    @Override
    public void x1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void z1(q1 q1Var, int i3) {
    }

    @Override
    public void A0(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void B0(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void E0(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public void K(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public void N0(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void h0(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void i1(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void p0(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void p2(q1 q1Var, int i3, int i10) {
    }

    @Override
    public void r1(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public void N1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void n(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i3) {
    }

    @Override
    public void s0(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void t0(q1 q1Var, float f10, float f11, boolean z10) {
    }

    @Override
    public void W1(q1 q1Var, int i3, float f10, float f11, boolean z10) {
    }

    @Override
    public void i(q1 q1Var, ArrayList arrayList, int i3, int i10, int i11) {
    }

    @Override
    public void i2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public void U(q1 q1Var, TLRPC.Chat chat, int i3, float f10, float f11, boolean z10) {
    }

    @Override
    public void H1(zi ziVar, String str, String str2, String str3, String str4, int i3, int i10) {
    }
}
