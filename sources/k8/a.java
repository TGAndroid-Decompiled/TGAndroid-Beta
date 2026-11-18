package k8;

import a3.h;
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
import b3.r;
import e0.g;
import e2.o0;
import f3.i;
import h2.d;
import h2.k0;
import h2.l0;
import h2.x;
import h9.i0;
import hi.u5;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import l8.e;
import li.d0;
import li.j0;
import m9.u;
import m9.y;
import n2.q;
import n2.s;
import o0.f;
import oi.e1;
import oi.g3;
import oi.g4;
import oi.o;
import oi.p3;
import oi.q3;
import oi.r3;
import oi.s3;
import oi.x3;
import oi.z5;
import org.telegram.messenger.aw;
import org.telegram.messenger.cj;
import org.telegram.messenger.da;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.i10;
import org.telegram.messenger.p2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.c0;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.m1;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Cells.u2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.ny0;
import org.telegram.ui.Components.rj0;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.x5;
import org.telegram.ui.Components.xm0;
import org.telegram.ui.Components.y60;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.n6;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.cx;
import org.telegram.ui.fr0;
import org.telegram.ui.h5;
import org.telegram.ui.hk0;
import org.telegram.ui.if0;
import org.telegram.ui.nd0;
import org.telegram.ui.qj0;
import org.telegram.ui.rw;
import org.telegram.ui.wj0;
import org.telegram.ui.yg0;
import s2.m;
import s2.p;
import s2.t;
import sg.h0;
import ug.b1;
public final class a implements j0, i, q3, xm0, kt, m1, rj0, wj0, ui.a, d, t {
    public final int f18179a;
    public Object f18180b;
    public Object f18181c;

    public a(int i7, Object obj, Object obj2) {
        this.f18179a = i7;
        this.f18181c = obj;
        this.f18180b = obj2;
    }

    @Override
    public void A(long j3) {
        ((h2) this.f18180b).presentFragment(bn.ua(j3));
        ((d0) this.f18181c).dismiss();
    }

    @Override
    public void D(int i7) {
        o.T((o) this.f18181c, 74, i7);
    }

    public yg0 D0(int i7, long j3, boolean z10) {
        if (i7 > 0) {
            i7 = ((SparseIntArray) this.f18181c).get(i7, 0);
        }
        Object obj = null;
        if (i7 == 0) {
            return null;
        }
        long j10 = i7;
        LongSparseArray p10 = ((u5) this.f18180b).p(j3, 0L);
        if (p10 != null) {
            obj = p10.get(j10);
        }
        yg0 yg0Var = (yg0) obj;
        if (yg0Var == null && z10) {
            yg0 yg0Var2 = new yg0();
            ((u5) this.f18180b).w(j3, 0L, j10, yg0Var2);
            return yg0Var2;
        }
        return yg0Var;
    }

    public String E0(String str) {
        Resources resources = (Resources) this.f18180b;
        int identifier = resources.getIdentifier(str, "string", (String) this.f18181c);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    @Override
    public void F() {
        d0 d0Var = (d0) this.f18181c;
        d0Var.f19910w1.d.f34607g3.O(true);
        d0Var.f19909v1.d.f34607g3.O(true);
    }

    @Override
    public void G() {
        int i7;
        o oVar = (o) this.f18181c;
        s3 s3Var = oVar.f22207r;
        x3 x3Var = oVar.f22208s;
        if (x3Var != null) {
            g3 g3Var = s3Var.f22346v3;
            if (g3Var != null && g3Var.x() && s3Var.F4()) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            if (x3Var.f22458b0 == 2) {
                x3Var.f22460c0 = i7;
            } else {
                x3Var.g(i7, true);
            }
            if (i7 != 0) {
                oVar.b0();
            }
        }
        oVar.e0();
    }

    @Override
    public y60 G0(View view) {
        o oVar = (o) this.f18181c;
        y60 y60Var = new y60(oVar, (i6) this.f18180b, view, false, false, true);
        oVar.I = y60Var;
        return y60Var;
    }

    @Override
    public void H(oi.a aVar) {
        o oVar = (o) this.f18181c;
        si siVar = oVar.f36766b;
        h2 h2Var = siVar.f39659a2;
        if (h2Var != null && aVar != null && (aVar.f21907b instanceof TL_iv.pageBlockMap) && g0.J1(h2Var)) {
            si siVar2 = new si(oVar.getContext(), siVar.f39659a2, false, false, false, null);
            siVar2.X3 = new qb.a(16);
            siVar2.K1 = true;
            siVar2.f39729v3.setVisibility(8);
            siVar2.f39726u4 = new h(oVar, aVar, siVar2, 15);
            siVar2.f1();
            siVar2.show();
        }
    }

    @Override
    public boolean H1(r1 r1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public r J(p pVar, m mVar) {
        return new h0(8, ((t) this.f18180b).J(pVar, mVar), (List) this.f18181c);
    }

    public boolean J0() {
        n6 n6Var = (n6) this.f18181c;
        if (n6Var.M0 <= 0.0f && !n6Var.D0()) {
            return false;
        }
        return true;
    }

    @Override
    public boolean J1() {
        return false;
    }

    public void K0(long j3, File file) {
        synchronized (((g) this.f18181c).f10206f) {
            ((HashMap) ((g) this.f18181c).f10207g).put(Long.valueOf(j3), file);
        }
    }

    @Override
    public boolean L0(long j3) {
        return ((ny0) this.f18181c).f37883w;
    }

    public void M(aw awVar, int i7) {
        awVar.f22975c = Integer.valueOf(i7);
        int i10 = awVar.d;
        long j3 = i7;
        awVar.f22973a = j3;
        awVar.f22974b = j3;
        ((long[]) this.f18181c)[i10] = j3;
    }

    public void M0(Exception exc, boolean z10) {
        int i7;
        this.f18181c = null;
        HashSet hashSet = (HashSet) this.f18180b;
        i0 q10 = i0.q(hashSet);
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
    public y O(o0 o0Var) {
        Uri uri;
        byte[] bArr;
        nd0 nd0Var = (nd0) this.f18181c;
        if (nd0Var != null && (((uri = (Uri) nd0Var.f50149c) != null && uri.equals(o0Var.f10589n)) || ((bArr = (byte[]) nd0Var.f50148b) != null && Arrays.equals(bArr, o0Var.f10586k)))) {
            y yVar = (y) ((nd0) this.f18181c).d;
            yVar.getClass();
            return yVar;
        }
        y O = ((d) this.f18180b).O(o0Var);
        if (O == null) {
            return null;
        }
        this.f18181c = new nd0(o0Var, O);
        return O;
    }

    public void P0(f fVar) {
        androidx.biometric.o oVar = (androidx.biometric.o) this.f18181c;
        u5 u5Var = (u5) this.f18180b;
        int i7 = fVar.f21572b;
        if (i7 == 0) {
            oVar.execute(new u(24, u5Var, fVar.f21571a));
        } else {
            oVar.execute(new j6.o(u5Var, i7));
        }
    }

    @Override
    public void Q() {
        x3 x3Var = ((o) this.f18181c).f22208s;
        if (x3Var != null) {
            int i7 = x3Var.f22458b0;
            if (i7 == 2) {
                i7 = 0;
            }
            x3Var.f22460c0 = i7;
            x3Var.e(false, false);
            x3Var.g(2, true);
        }
    }

    public void Q0(int i7) {
        aw[] awVarArr = (aw[]) this.f18180b;
        aw awVar = awVarArr[i7];
        Integer num = awVar.f22975c;
        if (num != null) {
            int i10 = i7 * 2;
            M(awVarArr[i10], num.intValue());
            M(awVarArr[i10 + 1], awVar.f22975c.intValue());
            awVar.f22975c = null;
        }
    }

    @Override
    public void Q1(r1 r1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        vf.c.t(r1Var.getContext(), str);
    }

    @Override
    public void R0(r3 r3Var, View view) {
        o oVar = (o) this.f18181c;
        y60 y60Var = new y60(oVar, (i6) this.f18180b, view, false, false, true);
        y60Var.T = true;
        h2 h2Var = oVar.f36766b.f39659a2;
        oVar.getContext();
        oVar.I = g4.b(y60Var, h2Var, r3Var, true);
    }

    @Override
    public CharacterStyle R1(r1 r1Var) {
        return null;
    }

    @Override
    public boolean S(r1 r1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    public void S0(q2.b bVar) {
        ((HashSet) this.f18180b).add(bVar);
        if (((q2.b) this.f18181c) != null) {
            return;
        }
        this.f18181c = bVar;
        q2.p n10 = bVar.f55717b.n();
        bVar.f55738z = n10;
        android.support.v4.media.session.f fVar = bVar.f55732s;
        String str = l0.f13783a;
        n10.getClass();
        fVar.getClass();
        fVar.obtainMessage(1, new q2.a(x2.u.f60237g.getAndIncrement(), true, SystemClock.elapsedRealtime(), n10)).sendToTarget();
    }

    @Override
    public boolean T() {
        return false;
    }

    @Override
    public boolean T1(r1 r1Var, fj fjVar) {
        return false;
    }

    @Override
    public boolean U(r1 r1Var) {
        return false;
    }

    public long U0(int i7, int i10) {
        long[] jArr = (long[]) this.f18181c;
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
        return Y0(1, i7, i10);
    }

    @Override
    public void V() {
        o oVar = (o) this.f18181c;
        if (oVar.getCurrentItemTop() != oVar.J) {
            oVar.f36766b.N1(oVar, 0);
        }
        oVar.f0();
        o.P(oVar);
    }

    @Override
    public boolean V0(r1 r1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean W() {
        return false;
    }

    public long Y0(int i7, int i10, int i11) {
        aw awVar = ((aw[]) this.f18180b)[i7];
        Integer num = awVar.f22975c;
        if (num != null) {
            int i12 = awVar.d;
            int i13 = awVar.f22976e;
            if (i10 >= i12 && i11 <= i13) {
                return num.intValue();
            }
        }
        int i14 = awVar.d;
        int i15 = awVar.f22976e;
        if (i14 >= i10 && i15 <= i11) {
            return awVar.f22973a;
        }
        if ((i10 <= i14 && i11 >= i14) || (i10 >= i14 && i10 <= i15)) {
            Q0(i7);
            int i16 = i7 * 2;
            return Math.max(Y0(i16, i10, i11), Y0(i16 + 1, i10, i11));
        }
        return 0L;
    }

    @Override
    public int Z() {
        return 0;
    }

    public long Z0(int i7, int i10) {
        long[] jArr = (long[]) this.f18181c;
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
        return a1(1, i7, i10);
    }

    @Override
    public boolean Z1(r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean a(float r6) {
        throw new UnsupportedOperationException("Method not decompiled: k8.a.a(float):boolean");
    }

    @Override
    public void a0(z5 z5Var, String str) {
        o oVar = (o) this.f18181c;
        if (oVar.f22209w == null) {
            i6 i6Var = (i6) this.f18180b;
            oVar.f22209w = new ga.d(new ab.g(29, this, i6Var), i6Var);
        }
        oVar.f22209w.k(z5Var, str);
    }

    public long a1(int i7, int i10, int i11) {
        aw awVar = ((aw[]) this.f18180b)[i7];
        Integer num = awVar.f22975c;
        if (num != null) {
            int i12 = awVar.d;
            int i13 = awVar.f22976e;
            if (i10 >= i12 && i11 <= i13) {
                return num.intValue();
            }
        }
        int i14 = awVar.d;
        int i15 = awVar.f22976e;
        if (i14 >= i10 && i15 <= i11) {
            return awVar.f22974b;
        }
        if ((i10 <= i14 && i11 >= i14) || (i10 >= i14 && i10 <= i15)) {
            Q0(i7);
            int i16 = i7 * 2;
            return Math.min(a1(i16, i10, i11), a1(i16 + 1, i10, i11));
        }
        return 2147483647L;
    }

    @Override
    public boolean b() {
        return false;
    }

    @Override
    public void b0(int i7) {
        o oVar = (o) this.f18181c;
        oVar.f36766b.N1(oVar, i7);
        oVar.f0();
        o.P(oVar);
    }

    public void b1() {
        m8.a aVar = (m8.a) this.f18180b;
        try {
            v7.f fVar = (v7.f) aVar.f20886a;
            fVar.t1(fVar.p1(), 1);
            ((da) this.f18181c).f23505c.remove(aVar);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public jh.a c0() {
        return null;
    }

    public void c1(int i7) {
        try {
            v7.f fVar = (v7.f) ((m8.a) this.f18180b).f20886a;
            Parcel p12 = fVar.p1();
            p12.writeInt(i7);
            fVar.t1(p12, 11);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public fr0 c2() {
        return null;
    }

    @Override
    public void close() {
        ((d0) this.f18181c).f19902o1.A(0);
    }

    @Override
    public void d(String str, String str2) {
        hk0 hk0Var = ((qj0) this.f18181c).f51237a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            hk0Var.S1(true, str2, (if0) this.f18180b, this, hk0Var.C1);
        } else {
            hk0Var.R1(true, false);
        }
    }

    @Override
    public boolean d0(r1 r1Var) {
        return false;
    }

    public void d1(int i7) {
        try {
            e eVar = (e) this.f18180b;
            Parcel p12 = eVar.p1();
            p12.writeInt(i7);
            eVar.t1(p12, 16);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public f3.h e(f3.p pVar, long j3) {
        long position = pVar.getPosition();
        int min = (int) Math.min(20000L, pVar.getLength() - position);
        x xVar = (x) this.f18181c;
        xVar.K(min);
        pVar.b(0, min, xVar.f13833a);
        int i7 = -1;
        int i10 = -1;
        long j10 = -9223372036854775807L;
        while (xVar.a() >= 4) {
            if (k3.a.a(xVar.f13834b, xVar.f13833a) != 442) {
                xVar.O(1);
            } else {
                xVar.O(4);
                long c10 = m4.x.c(xVar);
                if (c10 != -9223372036854775807L) {
                    long b10 = ((k0) this.f18180b).b(c10);
                    if (b10 > j3) {
                        if (j10 == -9223372036854775807L) {
                            return new f3.h(b10, -1, position);
                        }
                        return new f3.h(-9223372036854775807L, 0, position + i10);
                    } else if (b10 + 100000 > j3) {
                        return new f3.h(-9223372036854775807L, 0, position + xVar.f13834b);
                    } else {
                        j10 = b10;
                        i10 = xVar.f13834b;
                    }
                }
                int i11 = xVar.f13835c;
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
                            if (k3.a.a(xVar.f13834b, xVar.f13833a) == 443) {
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
                                int a10 = k3.a.a(xVar.f13834b, xVar.f13833a);
                                if (a10 == 442 || a10 == 441 || (a10 >>> 8) != 1) {
                                    break;
                                }
                                xVar.O(4);
                                if (xVar.a() < 2) {
                                    xVar.N(i11);
                                    break;
                                }
                                xVar.N(Math.min(xVar.f13835c, xVar.f13834b + xVar.H()));
                            }
                        }
                    }
                }
                i7 = xVar.f13834b;
            }
        }
        if (j10 != -9223372036854775807L) {
            return new f3.h(j10, -2, position + i7);
        }
        return f3.h.d;
    }

    @Override
    public boolean e0(r1 r1Var, TLRPC.User user) {
        return false;
    }

    public void e1(double d) {
        m8.a aVar = (m8.a) this.f18180b;
        aVar.getClass();
        try {
            v7.f fVar = (v7.f) aVar.f20886a;
            Parcel p12 = fVar.p1();
            p12.writeDouble(d);
            fVar.t1(p12, 5);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public boolean mo23f(float f10, float f11, int i7, View view) {
        cx cxVar = (cx) this.f18181c;
        if (view instanceof u2) {
            u2 u2Var = (u2) view;
            if (u2Var.f31961o2) {
                cxVar.h5(u2Var.getDialogId(), view);
                return true;
            }
        }
        rw rwVar = cxVar.A0;
        if (rwVar != null && rwVar.getVisibility() == 0 && cxVar.A0.f38631n) {
            return false;
        }
        return cxVar.F4(view, i7, f10, ((bx) this.f18180b).d);
    }

    @Override
    public r f0() {
        return new h0(8, ((t) this.f18180b).f0(), (List) this.f18181c);
    }

    @Override
    public boolean f1(fj fjVar) {
        return c0.a(fjVar);
    }

    @Override
    public boolean f2(long j3) {
        return ((ny0) this.f18181c).f37882s;
    }

    @Override
    public void g() {
        ((i3) this.f18181c).b(((mt) this.f18180b).getText());
    }

    public void g0() {
        this.f18180b = null;
        this.f18181c = null;
    }

    public void g1(int i7) {
        try {
            v7.f fVar = (v7.f) ((m8.a) this.f18180b).f20886a;
            Parcel p12 = fVar.p1();
            p12.writeInt(i7);
            fVar.t1(p12, 9);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public boolean h() {
        return true;
    }

    @Override
    public boolean h2(r1 r1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public String i(r1 r1Var) {
        return null;
    }

    @Override
    public boolean i0() {
        return false;
    }

    @Override
    public void j() {
        Point point = g0.f24118q;
        if (point.x > point.y) {
            ((cx) this.f18181c).finishPreviewFragment();
        }
    }

    @Override
    public void j1() {
        o oVar = (o) this.f18181c;
        oVar.c0();
        oVar.d0();
    }

    @Override
    public void k(e1 e1Var, boolean z10) {
        ((o) this.f18181c).f36766b.i1(e1Var, z10);
    }

    @Override
    public int k0(r1 r1Var) {
        return 0;
    }

    @Override
    public void m0() {
        x3 x3Var = ((o) this.f18181c).f22208s;
        if (x3Var != null) {
            int i7 = 0;
            x3Var.e(false, true);
            int i10 = x3Var.f22460c0;
            if (i10 != 2) {
                i7 = i10;
            }
            x3Var.g(i7, true);
        }
    }

    @Override
    public void n(boolean z10, float f10) {
        h5.n1 = f10;
        ((TextView) this.f18180b).setText("Saturation " + (f10 * 5.0f));
        au0 au0Var = ((h5) this.f18181c).f48154m1;
        au0Var.M();
        au0Var.K();
    }

    @Override
    public boolean n0() {
        return false;
    }

    @Override
    public void o(float f10, float f11, float f12, float f13, Canvas canvas) {
        Paint paint = (Paint) this.f18180b;
        PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f18181c;
        b1 b1Var = premiumPreviewFragment.f43438n0;
        if (premiumPreviewFragment.f43433i0) {
            paint.setColor(premiumPreviewFragment.getThemedColor(org.telegram.ui.ActionBar.n6.f29337a7));
            canvas.drawRect(f10, f11, f12, f13, paint);
            return;
        }
        b1Var.d(0, (-premiumPreviewFragment.f43428e0.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.f43425c0, 0, premiumPreviewFragment.f43428e0.getMeasuredWidth(), 0.0f, premiumPreviewFragment.f43428e0.getMeasuredHeight());
        canvas.drawRect(f10, f11, f12, f13, b1Var.f58607f);
    }

    @Override
    public void onContentChanged() {
        o oVar = (o) this.f18181c;
        x3 x3Var = oVar.f22208s;
        if (x3Var != null) {
            x3Var.setSendLoading(oVar.f22207r.p3());
        }
        oVar.a0(true);
        oVar.d0();
        oi.d dVar = oVar.Q;
        g0.r(dVar);
        g0.h3(dVar, 1000L);
    }

    @Override
    public boolean p0(x5 x5Var) {
        return false;
    }

    @Override
    public boolean p2(r1 r1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public void r(float f10) {
        Point point = g0.f24118q;
        if (point.x > point.y) {
            ((cx) this.f18181c).movePreviewFragment(f10);
        }
    }

    @Override
    public int r0() {
        return 0;
    }

    public void s0(l2.d dVar) {
        synchronized (dVar) {
        }
        Handler handler = (Handler) this.f18180b;
        if (handler != null) {
            handler.post(new q(this, dVar, 0));
        }
    }

    @Override
    public void t() {
        x xVar = (x) this.f18181c;
        byte[] bArr = l0.f13784b;
        xVar.getClass();
        xVar.L(bArr.length, bArr);
    }

    @Override
    public y t0(byte[] bArr) {
        byte[] bArr2;
        nd0 nd0Var = (nd0) this.f18181c;
        if (nd0Var != null && (bArr2 = (byte[]) nd0Var.f50148b) != null && Arrays.equals(bArr2, bArr)) {
            y yVar = (y) ((nd0) this.f18181c).d;
            yVar.getClass();
            return yVar;
        }
        y t02 = ((d) this.f18180b).t0(bArr);
        this.f18181c = new nd0(bArr, t02);
        return t02;
    }

    public String toString() {
        switch (this.f18179a) {
            case 28:
                return "Bounds{lower=" + ((i0.b) this.f18180b) + " upper=" + ((i0.b) this.f18181c) + "}";
            default:
                return super.toString();
        }
    }

    public void u(int i7, int i10, int i11) {
        aw[] awVarArr = (aw[]) this.f18180b;
        ?? obj = new Object();
        obj.f22975c = null;
        awVarArr[i7] = obj;
        obj.d = i10;
        obj.f22976e = (i10 + i11) - 1;
        if (i11 == 1) {
            long j3 = ((long[]) this.f18181c)[i10];
            obj.f22973a = j3;
            obj.f22974b = j3;
            return;
        }
        int i12 = i7 * 2;
        int i13 = i11 / 2;
        u(i12, i10, i13);
        int i14 = i12 + 1;
        u(i14, i10 + i13, i11 - i13);
        aw awVar = awVarArr[i7];
        aw awVar2 = awVarArr[i12];
        awVar2.getClass();
        aw awVar3 = awVarArr[i14];
        awVar3.getClass();
        awVar.getClass();
        awVar.f22973a = Math.max(awVar2.f22973a, awVar3.f22973a);
        awVarArr[i7].f22974b = Math.min(awVarArr[i12].f22974b, awVarArr[i14].f22974b);
    }

    public byte[] v0(q3.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.f18181c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f18180b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.f55782a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(aVar.f55783b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f55784c);
            dataOutputStream.writeLong(aVar.d);
            dataOutputStream.write(aVar.f55785e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public boolean v2(int i7) {
        return false;
    }

    @Override
    public void x(p3 p3Var, View view) {
        o oVar = (o) this.f18181c;
        y60 y60Var = new y60(oVar, (i6) this.f18180b, view, false, false, true);
        y60Var.T = true;
        oVar.I = g4.c(y60Var, oVar.f36766b.f39659a2, oVar.getContext(), (i6) this.f18180b, p3Var, true);
    }

    public com.google.android.datatransport.cct.CctBackendFactory x0(java.lang.String r14) {
        throw new UnsupportedOperationException("Method not decompiled: k8.a.x0(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    @Override
    public boolean x1() {
        return false;
    }

    @Override
    public boolean y0(fj fjVar) {
        return true;
    }

    @Override
    public String z(long j3) {
        String trim = ((EditTextBoldCursor) this.f18180b).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (!((ny0) this.f18181c).f37882s && TextUtils.isEmpty(trim)) {
            return null;
        }
        return trim;
    }

    @Override
    public boolean z1(r1 r1Var, int i7) {
        return false;
    }

    @Override
    public k9 z2() {
        return null;
    }

    public a(int i7, boolean z10) {
        this.f18179a = i7;
    }

    public a(Object obj, Object obj2, boolean z10, int i7) {
        this.f18179a = i7;
        this.f18180b = obj;
        this.f18181c = obj2;
    }

    public a(IBinder iBinder) {
        this.f18179a = 4;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f18180b = new Messenger(iBinder);
            this.f18181c = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f18181c = new m6.g(iBinder);
            this.f18180b = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public a(e eVar) {
        this.f18179a = 0;
        new HashMap();
        q6.m.h(eVar);
        this.f18180b = eVar;
    }

    public a(String str, String str2) {
        this.f18179a = 25;
        q6.m.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f18180b = str;
        this.f18181c = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    public a(long[] jArr) {
        this.f18179a = 11;
        this.f18181c = jArr;
        if (jArr.length < 30) {
            return;
        }
        this.f18180b = new aw[(int) (Math.pow(2.0d, Math.floor((Math.log(jArr.length) / Math.log(2.0d)) + 1.0d)) * 2.0d)];
        u(1, 0, jArr.length);
    }

    @Override
    public void A0() {
    }

    @Override
    public void C() {
    }

    @Override
    public void U1() {
    }

    @Override
    public void c() {
    }

    @Override
    public void i1() {
    }

    @Override
    public void m() {
    }

    @Override
    public void s2() {
    }

    @Override
    public void v() {
    }

    @Override
    public void x2() {
    }

    public a(d dVar) {
        this.f18179a = 21;
        this.f18180b = dVar;
    }

    public a(k0 k0Var) {
        this.f18179a = 3;
        this.f18180b = k0Var;
        this.f18181c = new x();
    }

    public a(Context context, int i7) {
        this.f18179a = i7;
        switch (i7) {
            case 26:
                q6.m.h(context);
                Resources resources = context.getResources();
                this.f18180b = resources;
                this.f18181c = resources.getResourcePackageName(2131689567);
                return;
            default:
                this.f18181c = null;
                this.f18180b = context;
                return;
        }
    }

    @Override
    public void B(r1 r1Var) {
    }

    @Override
    public void C1(r1 r1Var) {
    }

    @Override
    public void E(r1 r1Var) {
    }

    @Override
    public void F0(r1 r1Var) {
    }

    @Override
    public void I0(r1 r1Var) {
    }

    @Override
    public void K(r1 r1Var) {
    }

    @Override
    public void L(cj cjVar) {
    }

    @Override
    public void L1(r1 r1Var) {
    }

    @Override
    public void N0(r1 r1Var) {
    }

    @Override
    public void O1(fj fjVar) {
    }

    @Override
    public void P(r1 r1Var) {
    }

    @Override
    public void R(fj fjVar) {
    }

    @Override
    public void W0(r1 r1Var) {
    }

    @Override
    public void X0(r1 r1Var) {
    }

    @Override
    public void Y(r1 r1Var) {
    }

    @Override
    public void h0(int i7) {
    }

    @Override
    public void j2(r1 r1Var) {
    }

    @Override
    public void l0(r1 r1Var) {
    }

    @Override
    public void o0(String str) {
    }

    @Override
    public void q(r1 r1Var) {
    }

    @Override
    public void q2(r1 r1Var) {
    }

    @Override
    public void s(r1 r1Var) {
    }

    @Override
    public void w(r1 r1Var) {
    }

    @Override
    public void y(r1 r1Var) {
    }

    @Override
    public void z0(r1 r1Var) {
    }

    public a(Handler handler, s sVar) {
        this.f18179a = 5;
        if (sVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f18180b = handler;
        this.f18181c = sVar;
    }

    public a(PremiumPreviewFragment premiumPreviewFragment) {
        this.f18179a = 19;
        this.f18181c = premiumPreviewFragment;
        this.f18180b = new Paint();
    }

    @Override
    public void F1(r1 r1Var, boolean z10) {
    }

    @Override
    public void I(r1 r1Var, p2 p2Var) {
    }

    @Override
    public void I1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void K1(r1 r1Var, int i7) {
    }

    @Override
    public void O0(r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void X1(r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void a2(r1 r1Var, i10 i10Var) {
    }

    @Override
    public void e2(String str, String str2) {
    }

    @Override
    public void k1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void l2(r1 r1Var, long j3) {
    }

    @Override
    public void p1(r1 r1Var, int i7) {
    }

    public a(int i7) {
        this.f18179a = i7;
        switch (i7) {
            case 23:
                this.f18180b = new HashSet();
                return;
            case 24:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f18180b = byteArrayOutputStream;
                this.f18181c = new DataOutputStream(byteArrayOutputStream);
                return;
            default:
                this.f18180b = new u5();
                this.f18181c = new SparseIntArray();
                return;
        }
    }

    @Override
    public void B0(r1 r1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void B1(r1 r1Var, boolean z10, boolean z11) {
    }

    @Override
    public void C0(r1 r1Var, float f10, float f11) {
    }

    @Override
    public void H0(r1 r1Var, boolean z10, boolean z11) {
    }

    @Override
    public void N(r1 r1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public void T0(r1 r1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void j0(r1 r1Var, float f10, float f11) {
    }

    @Override
    public void q0(r1 r1Var, float f10, float f11) {
    }

    @Override
    public void t1(r1 r1Var, float f10, float f11) {
    }

    @Override
    public void y2(r1 r1Var, int i7, int i10) {
    }

    @Override
    public void Y1(r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void p(r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override
    public void u0(r1 r1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void w0(r1 r1Var, float f10, float f11, boolean z10) {
    }

    @Override
    public void g2(r1 r1Var, int i7, float f10, float f11, boolean z10) {
    }

    @Override
    public void l(r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override
    public void t2(r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public void X(r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    @Override
    public void S1(fj fjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}
