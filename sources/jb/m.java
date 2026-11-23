package jb;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import e2.o0;
import h2.k0;
import h2.l0;
import h2.x;
import hi.u0;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import li.c0;
import li.i0;
import m.o3;
import m9.u;
import m9.y;
import n2.s;
import oi.a6;
import oi.f1;
import oi.h3;
import oi.h4;
import oi.q3;
import oi.r3;
import oi.s3;
import oi.t3;
import oi.y3;
import org.telegram.messenger.aw;
import org.telegram.messenger.cj;
import org.telegram.messenger.da;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.p2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.m1;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Cells.u2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.x5;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.zm0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.o6;
import org.telegram.ui.ax;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.fk0;
import org.telegram.ui.fr0;
import org.telegram.ui.gf0;
import org.telegram.ui.h5;
import org.telegram.ui.oj0;
import org.telegram.ui.qw;
import org.telegram.ui.uj0;
import org.telegram.ui.wg0;
import ug.a1;
public final class m implements ib.b, i0, f3.i, r3, zm0, kt, m1, tj0, uj0, ui.a, h2.d {
    public final int f17463a;
    public Object f17464b;
    public Object f17465c;

    public m(int i7, Object obj, Object obj2) {
        this.f17463a = i7;
        this.f17464b = obj;
        this.f17465c = obj2;
    }

    @Override
    public void B(oi.a aVar) {
        oi.p pVar = (oi.p) this.f17465c;
        ti tiVar = pVar.f37135b;
        g2 g2Var = tiVar.f39956a2;
        if (g2Var != null && aVar != null && (aVar.f22001b instanceof TL_iv.pageBlockMap) && g0.J1(g2Var)) {
            ti tiVar2 = new ti(pVar.getContext(), tiVar.f39956a2, false, false, false, null);
            tiVar2.X3 = new qb.a(16);
            tiVar2.K1 = true;
            tiVar2.f40026v3.setVisibility(8);
            tiVar2.f40023u4 = new a3.h(pVar, aVar, tiVar2, 15);
            tiVar2.f1();
            tiVar2.show();
        }
    }

    public void B0(long j3, File file) {
        synchronized (((e0.g) this.f17465c).f10199f) {
            ((HashMap) ((e0.g) this.f17465c).f10200g).put(Long.valueOf(j3), file);
        }
    }

    @Override
    public j9 B2() {
        return null;
    }

    @Override
    public String D(long j3) {
        String trim = ((EditTextBoldCursor) this.f17464b).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (!((oy0) this.f17465c).f38285s && TextUtils.isEmpty(trim)) {
            return null;
        }
        return trim;
    }

    public void D0(Exception exc, boolean z10) {
        int i7;
        this.f17465c = null;
        HashSet hashSet = (HashSet) this.f17464b;
        h9.i0 q10 = h9.i0.q(hashSet);
        hashSet.clear();
        h9.g0 listIterator = q10.listIterator(0);
        while (listIterator.hasNext()) {
            q2.b bVar = (q2.b) listIterator.next();
            bVar.getClass();
            if (z10) {
                i7 = 1;
            } else {
                i7 = 3;
            }
            bVar.l(i7, exc);
        }
    }

    @Override
    public void E() {
        y3 y3Var = ((oi.p) this.f17465c).f22368s;
        if (y3Var != null) {
            int i7 = y3Var.f22614b0;
            if (i7 == 2) {
                i7 = 0;
            }
            y3Var.f22616c0 = i7;
            y3Var.e(false, false);
            y3Var.g(2, true);
        }
    }

    public void E0(o0.f fVar) {
        androidx.biometric.o oVar = (androidx.biometric.o) this.f17465c;
        u0 u0Var = (u0) this.f17464b;
        int i7 = fVar.f21665b;
        if (i7 == 0) {
            oVar.execute(new u(24, u0Var, fVar.f21664a));
        } else {
            oVar.execute(new i6.g(u0Var, i7));
        }
    }

    @Override
    public boolean F0(fj fjVar) {
        return true;
    }

    @Override
    public void G() {
        x xVar = (x) this.f17465c;
        byte[] bArr = l0.f13779b;
        xVar.getClass();
        xVar.L(bArr.length, bArr);
    }

    public void H(int i7, int i10, int i11) {
        aw[] awVarArr = (aw[]) this.f17464b;
        ?? obj = new Object();
        obj.f23086c = null;
        awVarArr[i7] = obj;
        obj.d = i10;
        obj.f23087e = (i10 + i11) - 1;
        if (i11 == 1) {
            long j3 = ((long[]) this.f17465c)[i10];
            obj.f23084a = j3;
            obj.f23085b = j3;
            return;
        }
        int i12 = i7 * 2;
        int i13 = i11 / 2;
        H(i12, i10, i13);
        int i14 = i12 + 1;
        H(i14, i10 + i13, i11 - i13);
        aw awVar = awVarArr[i7];
        aw awVar2 = awVarArr[i12];
        awVar2.getClass();
        aw awVar3 = awVarArr[i14];
        awVar3.getClass();
        awVar.getClass();
        awVar.f23084a = Math.max(awVar2.f23084a, awVar3.f23084a);
        awVarArr[i7].f23085b = Math.min(awVarArr[i12].f23085b, awVarArr[i14].f23085b);
    }

    @Override
    public boolean H1(r1 r1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public y I(o0 o0Var) {
        Uri uri;
        byte[] bArr;
        i61 i61Var = (i61) this.f17465c;
        if (i61Var != null && (((uri = (Uri) i61Var.f35959c) != null && uri.equals(o0Var.f10582n)) || ((bArr = (byte[]) i61Var.f35958b) != null && Arrays.equals(bArr, o0Var.f10579k)))) {
            y yVar = (y) ((i61) this.f17465c).d;
            yVar.getClass();
            return yVar;
        }
        y I = ((h2.d) this.f17464b).I(o0Var);
        if (I == null) {
            return null;
        }
        this.f17465c = new i61(o0Var, I);
        return I;
    }

    @Override
    public boolean J1() {
        return false;
    }

    public void K(aw awVar, int i7) {
        awVar.f23086c = Integer.valueOf(i7);
        int i10 = awVar.d;
        long j3 = i7;
        awVar.f23084a = j3;
        awVar.f23085b = j3;
        ((long[]) this.f17465c)[i10] = j3;
    }

    public void K0(int i7) {
        aw[] awVarArr = (aw[]) this.f17464b;
        aw awVar = awVarArr[i7];
        Integer num = awVar.f23086c;
        if (num != null) {
            int i10 = i7 * 2;
            K(awVarArr[i10], num.intValue());
            K(awVarArr[i10 + 1], awVar.f23086c.intValue());
            awVar.f23086c = null;
        }
    }

    @Override
    public void N() {
        oi.p pVar = (oi.p) this.f17465c;
        if (pVar.getCurrentItemTop() != pVar.J) {
            pVar.f37135b.N1(pVar, 0);
        }
        pVar.f0();
        oi.p.P(pVar);
    }

    public void O0(q2.b bVar) {
        ((HashSet) this.f17464b).add(bVar);
        if (((q2.b) this.f17465c) != null) {
            return;
        }
        this.f17465c = bVar;
        q2.p g10 = bVar.f55840b.g();
        bVar.f55861z = g10;
        android.support.v4.media.session.f fVar = bVar.f55855s;
        String str = l0.f13778a;
        g10.getClass();
        fVar.getClass();
        fVar.obtainMessage(1, new q2.a(x2.u.f60365g.getAndIncrement(), true, SystemClock.elapsedRealtime(), g10)).sendToTarget();
    }

    public long P0(int i7, int i10) {
        long[] jArr = (long[]) this.f17465c;
        if (jArr.length < 30) {
            if (i7 < 0) {
                i7 = 0;
            }
            if (i10 > jArr.length - 1) {
                i10 = jArr.length - 1;
            }
            long j3 = Long.MIN_VALUE;
            while (i7 <= i10) {
                long j10 = jArr[i7];
                if (j10 > j3) {
                    j3 = j10;
                }
                i7++;
            }
            return j3;
        }
        return Q0(1, i7, i10);
    }

    @Override
    public void Q(a6 a6Var, String str) {
        oi.p pVar = (oi.p) this.f17465c;
        if (pVar.f22369w == null) {
            i6 i6Var = (i6) this.f17464b;
            pVar.f22369w = new o3(new ab.g(29, this, i6Var), i6Var);
        }
        pVar.f22369w.g(a6Var, str);
    }

    public long Q0(int i7, int i10, int i11) {
        aw awVar = ((aw[]) this.f17464b)[i7];
        Integer num = awVar.f23086c;
        if (num != null) {
            int i12 = awVar.d;
            int i13 = awVar.f23087e;
            if (i10 >= i12 && i11 <= i13) {
                return num.intValue();
            }
        }
        int i14 = awVar.d;
        int i15 = awVar.f23087e;
        if (i14 >= i10 && i15 <= i11) {
            return awVar.f23084a;
        }
        if ((i10 <= i14 && i11 >= i14) || (i10 >= i14 && i10 <= i15)) {
            K0(i7);
            int i16 = i7 * 2;
            return Math.max(Q0(i16, i10, i11), Q0(i16 + 1, i10, i11));
        }
        return 0L;
    }

    @Override
    public void Q1(r1 r1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        vf.c.t(r1Var.getContext(), str);
    }

    @Override
    public boolean R0(long j3) {
        return ((oy0) this.f17465c).f38286w;
    }

    @Override
    public CharacterStyle R1(r1 r1Var) {
        return null;
    }

    @Override
    public void S(int i7) {
        oi.p pVar = (oi.p) this.f17465c;
        pVar.f37135b.N1(pVar, i7);
        pVar.f0();
        oi.p.P(pVar);
    }

    public void T() {
        this.f17464b = null;
        this.f17465c = null;
    }

    public long T0(int i7, int i10) {
        long[] jArr = (long[]) this.f17465c;
        if (jArr.length < 30) {
            if (i7 < 0) {
                i7 = 0;
            }
            if (i10 > jArr.length - 1) {
                i10 = jArr.length - 1;
            }
            long j3 = Long.MAX_VALUE;
            while (i7 <= i10) {
                long j10 = jArr[i7];
                if (j10 < j3) {
                    j3 = j10;
                }
                i7++;
            }
            return j3;
        }
        return U0(1, i7, i10);
    }

    @Override
    public boolean T1(r1 r1Var, fj fjVar) {
        return false;
    }

    public void U(l2.e eVar) {
        synchronized (eVar) {
        }
        Handler handler = (Handler) this.f17464b;
        if (handler != null) {
            handler.post(new n2.q(this, eVar, 0));
        }
    }

    public long U0(int i7, int i10, int i11) {
        aw awVar = ((aw[]) this.f17464b)[i7];
        Integer num = awVar.f23086c;
        if (num != null) {
            int i12 = awVar.d;
            int i13 = awVar.f23087e;
            if (i10 >= i12 && i11 <= i13) {
                return num.intValue();
            }
        }
        int i14 = awVar.d;
        int i15 = awVar.f23087e;
        if (i14 >= i10 && i15 <= i11) {
            return awVar.f23085b;
        }
        if ((i10 <= i14 && i11 >= i14) || (i10 >= i14 && i10 <= i15)) {
            K0(i7);
            int i16 = i7 * 2;
            return Math.min(U0(i16, i10, i11), U0(i16 + 1, i10, i11));
        }
        return 2147483647L;
    }

    @Override
    public y V(byte[] bArr) {
        byte[] bArr2;
        i61 i61Var = (i61) this.f17465c;
        if (i61Var != null && (bArr2 = (byte[]) i61Var.f35958b) != null && Arrays.equals(bArr2, bArr)) {
            y yVar = (y) ((i61) this.f17465c).d;
            yVar.getClass();
            return yVar;
        }
        y V = ((h2.d) this.f17464b).V(bArr);
        this.f17465c = new i61(bArr, V);
        return V;
    }

    public void V0() {
        m8.a aVar = (m8.a) this.f17464b;
        try {
            v7.f fVar = (v7.f) aVar.f20979a;
            fVar.t1(fVar.p1(), 1);
            ((da) this.f17465c).f23634c.remove(aVar);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public boolean X(r1 r1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    public void X0(int i7) {
        try {
            v7.f fVar = (v7.f) ((m8.a) this.f17464b).f20979a;
            Parcel p12 = fVar.p1();
            p12.writeInt(i7);
            fVar.t1(p12, 11);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public boolean Y() {
        return false;
    }

    public void Y0(int i7) {
        try {
            l8.e eVar = (l8.e) this.f17464b;
            Parcel p12 = eVar.p1();
            p12.writeInt(i7);
            eVar.t1(p12, 16);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public boolean Z(r1 r1Var) {
        return false;
    }

    public void Z0(double d) {
        m8.a aVar = (m8.a) this.f17464b;
        aVar.getClass();
        try {
            v7.f fVar = (v7.f) aVar.f20979a;
            Parcel p12 = fVar.p1();
            p12.writeDouble(d);
            fVar.t1(p12, 5);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public boolean a(float r6) {
        throw new UnsupportedOperationException("Method not decompiled: jb.m.a(float):boolean");
    }

    @Override
    public int a0() {
        return 0;
    }

    @Override
    public boolean a2(r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public void b(f1 f1Var, boolean z10) {
        ((oi.p) this.f17465c).f37135b.i1(f1Var, z10);
    }

    @Override
    public boolean b0() {
        return false;
    }

    public void b1(int i7) {
        try {
            v7.f fVar = (v7.f) ((m8.a) this.f17464b).f20979a;
            Parcel p12 = fVar.p1();
            p12.writeInt(i7);
            fVar.t1(p12, 9);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public void c(q3 q3Var, View view) {
        oi.p pVar = (oi.p) this.f17465c;
        x60 x60Var = new x60(pVar, (i6) this.f17464b, view, false, false, true);
        x60Var.T = true;
        pVar.I = h4.c(x60Var, pVar.f37135b.f39956a2, pVar.getContext(), (i6) this.f17464b, q3Var, true);
    }

    @Override
    public boolean c1(r1 r1Var, boolean z10) {
        return false;
    }

    @Override
    public fr0 c2() {
        return null;
    }

    @Override
    public void close() {
        ((c0) this.f17465c).f19996o1.C(0);
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public int e0() {
        return 0;
    }

    @Override
    public void f(String str, String str2) {
        fk0 fk0Var = ((oj0) this.f17465c).f50706a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            fk0Var.S1(true, str2, (gf0) this.f17464b, this, fk0Var.C1);
        } else {
            fk0Var.R1(true, false);
        }
    }

    @Override
    public void f0() {
        y3 y3Var = ((oi.p) this.f17465c).f22368s;
        if (y3Var != null) {
            int i7 = 0;
            y3Var.e(false, true);
            int i10 = y3Var.f22616c0;
            if (i10 != 2) {
                i7 = i10;
            }
            y3Var.g(i7, true);
        }
    }

    @Override
    public boolean f2(long j3) {
        return ((oy0) this.f17465c).f38285s;
    }

    @Override
    public boolean mo24g(float f10, float f11, int i7, View view) {
        bx bxVar = (bx) this.f17465c;
        if (view instanceof u2) {
            u2 u2Var = (u2) view;
            if (u2Var.f32042o2) {
                bxVar.h5(u2Var.getDialogId(), view);
                return true;
            }
        }
        qw qwVar = bxVar.A0;
        if (qwVar != null && qwVar.getVisibility() == 0 && bxVar.A0.f38306n) {
            return false;
        }
        return bxVar.F4(view, i7, f10, ((ax) this.f17464b).d);
    }

    public byte[] g0(q3.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.f17465c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f17464b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.f55905a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(aVar.f55906b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f55907c);
            dataOutputStream.writeLong(aVar.d);
            dataOutputStream.write(aVar.f55908e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public boolean g1(fj fjVar) {
        return org.telegram.ui.Cells.c0.a(fjVar);
    }

    @Override
    public Object mo23get() {
        return new l((r) ((ib.c) this.f17464b).mo23get(), (r) ((ib.c) this.f17465c).mo23get());
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public void h() {
        Point point = g0.f24226q;
        if (point.x > point.y) {
            ((bx) this.f17465c).finishPreviewFragment();
        }
    }

    @Override
    public jh.a h0() {
        return null;
    }

    @Override
    public boolean i() {
        return true;
    }

    @Override
    public x60 i0(View view) {
        oi.p pVar = (oi.p) this.f17465c;
        x60 x60Var = new x60(pVar, (i6) this.f17464b, view, false, false, true);
        pVar.I = x60Var;
        return x60Var;
    }

    @Override
    public void j(boolean z10, float f10) {
        h5.n1 = f10;
        ((TextView) this.f17464b).setText("Saturation " + (f10 * 5.0f));
        cu0 cu0Var = ((h5) this.f17465c).f48430m1;
        cu0Var.M();
        cu0Var.K();
    }

    @Override
    public boolean j0(r1 r1Var) {
        return false;
    }

    @Override
    public boolean j2(r1 r1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public String k(r1 r1Var) {
        return null;
    }

    @Override
    public boolean k0(r1 r1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public void l(float f10) {
        Point point = g0.f24226q;
        if (point.x > point.y) {
            ((bx) this.f17465c).movePreviewFragment(f10);
        }
    }

    @Override
    public void l0(s3 s3Var, View view) {
        oi.p pVar = (oi.p) this.f17465c;
        x60 x60Var = new x60(pVar, (i6) this.f17464b, view, false, false, true);
        x60Var.T = true;
        g2 g2Var = pVar.f37135b.f39956a2;
        pVar.getContext();
        pVar.I = h4.b(x60Var, g2Var, s3Var, true);
    }

    @Override
    public void n(long j3) {
        ((g2) this.f17464b).presentFragment(bn.ua(j3));
        ((c0) this.f17465c).dismiss();
    }

    @Override
    public boolean n0() {
        return false;
    }

    @Override
    public void o() {
        c0 c0Var = (c0) this.f17465c;
        c0Var.f20004w1.d.f35323g3.O(true);
        c0Var.f20003v1.d.f35323g3.O(true);
    }

    @Override
    public void onContentChanged() {
        oi.p pVar = (oi.p) this.f17465c;
        y3 y3Var = pVar.f22368s;
        if (y3Var != null) {
            y3Var.setSendLoading(pVar.f22367r.p3());
        }
        pVar.a0(true);
        pVar.d0();
        oi.d dVar = pVar.Q;
        g0.r(dVar);
        g0.h3(dVar, 1000L);
    }

    @Override
    public int p0(r1 r1Var) {
        return 0;
    }

    @Override
    public boolean p2(r1 r1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public void r(int i7) {
        oi.p.T((oi.p) this.f17465c, 74, i7);
    }

    @Override
    public boolean r0() {
        return false;
    }

    @Override
    public void s0() {
        oi.p pVar = (oi.p) this.f17465c;
        pVar.c0();
        pVar.d0();
    }

    public String toString() {
        switch (this.f17463a) {
            case 29:
                return "Bounds{lower=" + ((i0.b) this.f17464b) + " upper=" + ((i0.b) this.f17465c) + "}";
            default:
                return super.toString();
        }
    }

    @Override
    public void u() {
        ((i3) this.f17465c).b(((mt) this.f17464b).getText());
    }

    public com.google.android.datatransport.cct.CctBackendFactory u0(java.lang.String r14) {
        throw new UnsupportedOperationException("Method not decompiled: jb.m.u0(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    @Override
    public f3.h v(f3.p pVar, long j3) {
        long position = pVar.getPosition();
        int min = (int) Math.min(20000L, pVar.getLength() - position);
        x xVar = (x) this.f17465c;
        xVar.K(min);
        pVar.b(0, min, xVar.f13828a);
        int i7 = -1;
        int i10 = -1;
        long j10 = -9223372036854775807L;
        while (xVar.a() >= 4) {
            if (k3.a.a(xVar.f13829b, xVar.f13828a) != 442) {
                xVar.O(1);
            } else {
                xVar.O(4);
                long c10 = m4.x.c(xVar);
                if (c10 != -9223372036854775807L) {
                    long b10 = ((k0) this.f17464b).b(c10);
                    if (b10 > j3) {
                        if (j10 == -9223372036854775807L) {
                            return new f3.h(b10, -1, position);
                        }
                        return new f3.h(-9223372036854775807L, 0, position + i10);
                    } else if (b10 + 100000 > j3) {
                        return new f3.h(-9223372036854775807L, 0, position + xVar.f13829b);
                    } else {
                        j10 = b10;
                        i10 = xVar.f13829b;
                    }
                }
                int i11 = xVar.f13830c;
                if (xVar.a() < 10) {
                    xVar.N(i11);
                } else {
                    xVar.O(9);
                    int A = xVar.A() & 7;
                    if (xVar.a() < A) {
                        xVar.N(i11);
                    } else {
                        xVar.O(A);
                        if (xVar.a() < 4) {
                            xVar.N(i11);
                        } else {
                            if (k3.a.a(xVar.f13829b, xVar.f13828a) == 443) {
                                xVar.O(4);
                                int H = xVar.H();
                                if (xVar.a() < H) {
                                    xVar.N(i11);
                                } else {
                                    xVar.O(H);
                                }
                            }
                            while (true) {
                                if (xVar.a() < 4) {
                                    break;
                                }
                                int a10 = k3.a.a(xVar.f13829b, xVar.f13828a);
                                if (a10 == 442 || a10 == 441 || (a10 >>> 8) != 1) {
                                    break;
                                }
                                xVar.O(4);
                                if (xVar.a() < 2) {
                                    xVar.N(i11);
                                    break;
                                }
                                xVar.N(Math.min(xVar.f13830c, xVar.f13829b + xVar.H()));
                            }
                        }
                    }
                }
                i7 = xVar.f13829b;
            }
        }
        if (j10 != -9223372036854775807L) {
            return new f3.h(j10, -2, position + i7);
        }
        return f3.h.d;
    }

    @Override
    public boolean v0(x5 x5Var) {
        return false;
    }

    public wg0 w0(int i7, long j3, boolean z10) {
        if (i7 > 0) {
            i7 = ((SparseIntArray) this.f17465c).get(i7, 0);
        }
        Object obj = null;
        if (i7 == 0) {
            return null;
        }
        long j10 = i7;
        LongSparseArray B0 = ((u0) this.f17464b).B0(j3, 0L);
        if (B0 != null) {
            obj = B0.get(j10);
        }
        wg0 wg0Var = (wg0) obj;
        if (wg0Var == null && z10) {
            wg0 wg0Var2 = new wg0();
            ((u0) this.f17464b).E0(j3, 0L, j10, wg0Var2);
            return wg0Var2;
        }
        return wg0Var;
    }

    @Override
    public boolean x1() {
        return false;
    }

    @Override
    public void y() {
        int i7;
        oi.p pVar = (oi.p) this.f17465c;
        t3 t3Var = pVar.f22367r;
        y3 y3Var = pVar.f22368s;
        if (y3Var != null) {
            h3 h3Var = t3Var.f22507v3;
            if (h3Var != null && h3Var.x() && t3Var.F4()) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            if (y3Var.f22614b0 == 2) {
                y3Var.f22616c0 = i7;
            } else {
                y3Var.g(i7, true);
            }
            if (i7 != 0) {
                pVar.b0();
            }
        }
        pVar.e0();
    }

    public String y0(String str) {
        Resources resources = (Resources) this.f17464b;
        int identifier = resources.getIdentifier(str, "string", (String) this.f17465c);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    @Override
    public boolean y2(int i7) {
        return false;
    }

    @Override
    public void z(float f10, float f11, float f12, float f13, Canvas canvas) {
        Paint paint = (Paint) this.f17464b;
        PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f17465c;
        a1 a1Var = premiumPreviewFragment.f43564n0;
        if (premiumPreviewFragment.f43559i0) {
            paint.setColor(premiumPreviewFragment.getThemedColor(n6.f29394a7));
            canvas.drawRect(f10, f11, f12, f13, paint);
            return;
        }
        a1Var.d(0, (-premiumPreviewFragment.f43554e0.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.f43551c0, 0, premiumPreviewFragment.f43554e0.getMeasuredWidth(), 0.0f, premiumPreviewFragment.f43554e0.getMeasuredHeight());
        canvas.drawRect(f10, f11, f12, f13, a1Var.f58727f);
    }

    public boolean z0() {
        o6 o6Var = (o6) this.f17465c;
        if (o6Var.M0 <= 0.0f && !o6Var.D0()) {
            return false;
        }
        return true;
    }

    @Override
    public boolean z1(r1 r1Var, int i7) {
        return false;
    }

    public m(int i7, boolean z10) {
        this.f17463a = i7;
    }

    public m(Object obj, Object obj2, boolean z10, int i7) {
        this.f17463a = i7;
        this.f17465c = obj;
        this.f17464b = obj2;
    }

    public m(IBinder iBinder) {
        this.f17463a = 5;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f17464b = new Messenger(iBinder);
            this.f17465c = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f17465c = new m6.g(iBinder);
            this.f17464b = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public m(l8.e eVar) {
        this.f17463a = 1;
        new HashMap();
        q6.m.h(eVar);
        this.f17464b = eVar;
    }

    public m(String str, String str2) {
        this.f17463a = 26;
        q6.m.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f17464b = str;
        this.f17465c = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    public m(long[] jArr) {
        this.f17463a = 12;
        this.f17465c = jArr;
        if (jArr.length < 30) {
            return;
        }
        this.f17464b = new aw[(int) (Math.pow(2.0d, Math.floor((Math.log(jArr.length) / Math.log(2.0d)) + 1.0d)) * 2.0d)];
        H(1, 0, jArr.length);
    }

    @Override
    public void H0() {
    }

    @Override
    public void U1() {
    }

    @Override
    public void e() {
    }

    @Override
    public void k1() {
    }

    @Override
    public void p() {
    }

    @Override
    public void u2() {
    }

    @Override
    public void w() {
    }

    @Override
    public void x() {
    }

    @Override
    public void z2() {
    }

    public m(h2.d dVar) {
        this.f17463a = 22;
        this.f17464b = dVar;
    }

    public m(k0 k0Var) {
        this.f17463a = 4;
        this.f17464b = k0Var;
        this.f17465c = new x();
    }

    @Override
    public void A(r1 r1Var) {
    }

    @Override
    public void C(r1 r1Var) {
    }

    @Override
    public void C1(r1 r1Var) {
    }

    @Override
    public void F(r1 r1Var) {
    }

    @Override
    public void G0(r1 r1Var) {
    }

    @Override
    public void J(r1 r1Var) {
    }

    @Override
    public void L0(r1 r1Var) {
    }

    @Override
    public void L1(r1 r1Var) {
    }

    @Override
    public void M(r1 r1Var) {
    }

    @Override
    public void N0(r1 r1Var) {
    }

    @Override
    public void O(cj cjVar) {
    }

    @Override
    public void O1(fj fjVar) {
    }

    @Override
    public void R(r1 r1Var) {
    }

    @Override
    public void S0(r1 r1Var) {
    }

    @Override
    public void W(fj fjVar) {
    }

    @Override
    public void d0(r1 r1Var) {
    }

    @Override
    public void e1(r1 r1Var) {
    }

    @Override
    public void f1(r1 r1Var) {
    }

    @Override
    public void k2(r1 r1Var) {
    }

    @Override
    public void m0(int i7) {
    }

    @Override
    public void q0(r1 r1Var) {
    }

    @Override
    public void q2(r1 r1Var) {
    }

    @Override
    public void s(r1 r1Var) {
    }

    @Override
    public void t(r1 r1Var) {
    }

    @Override
    public void t0(String str) {
    }

    public m(Context context, int i7) {
        this.f17463a = i7;
        switch (i7) {
            case 27:
                q6.m.h(context);
                Resources resources = context.getResources();
                this.f17464b = resources;
                this.f17465c = resources.getResourcePackageName(2131689567);
                return;
            default:
                this.f17465c = null;
                this.f17464b = context;
                return;
        }
    }

    public m(Handler handler, s sVar) {
        this.f17463a = 6;
        if (sVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f17464b = handler;
        this.f17465c = sVar;
    }

    public m(PremiumPreviewFragment premiumPreviewFragment) {
        this.f17463a = 20;
        this.f17465c = premiumPreviewFragment;
        this.f17464b = new Paint();
    }

    @Override
    public void F1(r1 r1Var, boolean z10) {
    }

    @Override
    public void I1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void K1(r1 r1Var, int i7) {
    }

    @Override
    public void L(r1 r1Var, p2 p2Var) {
    }

    @Override
    public void W0(r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void Y1(r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void b2(r1 r1Var, h10 h10Var) {
    }

    @Override
    public void e2(String str, String str2) {
    }

    @Override
    public void l2(r1 r1Var, long j3) {
    }

    @Override
    public void m1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void p1(r1 r1Var, int i7) {
    }

    public m(int i7) {
        this.f17463a = i7;
        switch (i7) {
            case 24:
                this.f17464b = new HashSet();
                return;
            case 25:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f17464b = byteArrayOutputStream;
                this.f17465c = new DataOutputStream(byteArrayOutputStream);
                return;
            default:
                this.f17464b = new u0();
                this.f17465c = new SparseIntArray();
                return;
        }
    }

    @Override
    public void A2(r1 r1Var, int i7, int i10) {
    }

    @Override
    public void B1(r1 r1Var, boolean z10, boolean z11) {
    }

    @Override
    public void I0(r1 r1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void J0(r1 r1Var, float f10, float f11) {
    }

    @Override
    public void M0(r1 r1Var, boolean z10, boolean z11) {
    }

    @Override
    public void P(r1 r1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public void a1(r1 r1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void o0(r1 r1Var, float f10, float f11) {
    }

    @Override
    public void t1(r1 r1Var, float f10, float f11) {
    }

    @Override
    public void x0(r1 r1Var, float f10, float f11) {
    }

    @Override
    public void A0(r1 r1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void C0(r1 r1Var, float f10, float f11, boolean z10) {
    }

    @Override
    public void Z1(r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void q(r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override
    public void g2(r1 r1Var, int i7, float f10, float f11, boolean z10) {
    }

    @Override
    public void m(r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override
    public void w2(r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public void c0(r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    @Override
    public void S1(fj fjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}
