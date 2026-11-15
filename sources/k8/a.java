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
import e0.g;
import e2.o0;
import f3.i;
import f3.p;
import h2.d;
import h2.k0;
import h2.l0;
import h2.x;
import h9.i0;
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
import oi.e3;
import oi.e4;
import oi.n3;
import oi.o;
import oi.o3;
import oi.p3;
import oi.q3;
import oi.v3;
import oi.y5;
import org.telegram.messenger.dj;
import org.telegram.messenger.ea;
import org.telegram.messenger.ew;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.messenger.l10;
import org.telegram.messenger.o2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.h3;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Cells.y0;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.dt;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Components.gy0;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.st0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.an;
import org.telegram.ui.dr0;
import org.telegram.ui.ef0;
import org.telegram.ui.ek0;
import org.telegram.ui.h5;
import org.telegram.ui.ld0;
import org.telegram.ui.nj0;
import org.telegram.ui.ow;
import org.telegram.ui.tg0;
import org.telegram.ui.tj0;
import org.telegram.ui.xw;
import org.telegram.ui.yw;
import s2.m;
import s2.t;
import sg.h0;
import ug.z0;
public final class a implements j0, i, o3, pm0, dt, l1, jj0, tj0, ui.a, d, t {
    public final int f17787a;
    public Object f17788b;
    public Object f17789c;

    public a(int i7, Object obj, Object obj2) {
        this.f17787a = i7;
        this.f17789c = obj;
        this.f17788b = obj2;
    }

    @Override
    public void A(oi.a aVar) {
        o oVar = (o) this.f17789c;
        ki kiVar = oVar.f33609b;
        e2 e2Var = kiVar.f36424a2;
        if (e2Var != null && aVar != null && (aVar.f21544b instanceof TL_iv.pageBlockMap) && g0.J1(e2Var)) {
            ki kiVar2 = new ki(oVar.getContext(), kiVar.f36424a2, false, false, false, null);
            kiVar2.X3 = new qb.a(16);
            kiVar2.K1 = true;
            kiVar2.f36494v3.setVisibility(8);
            kiVar2.f36491u4 = new h(oVar, aVar, kiVar2, 15);
            kiVar2.e1();
            kiVar2.show();
        }
    }

    @Override
    public void D() {
        v3 v3Var = ((o) this.f17789c).f21849s;
        if (v3Var != null) {
            int i7 = v3Var.f22060b0;
            if (i7 == 2) {
                i7 = 0;
            }
            v3Var.f22062c0 = i7;
            v3Var.e(false, false);
            v3Var.g(2, true);
        }
    }

    public void D0(l2.d dVar) {
        synchronized (dVar) {
        }
        Handler handler = (Handler) this.f17788b;
        if (handler != null) {
            handler.post(new q(this, dVar, 0));
        }
    }

    @Override
    public void E() {
        ((h3) this.f17789c).b(((ft) this.f17788b).getText());
    }

    public byte[] E0(q3.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.f17789c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f17788b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.f55208a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(aVar.f55209b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f55210c);
            dataOutputStream.writeLong(aVar.d);
            dataOutputStream.write(aVar.f55211e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public void F() {
        o oVar = (o) this.f17789c;
        if (oVar.getCurrentItemTop() != oVar.J) {
            oVar.f33609b.M1(oVar, 0);
        }
        oVar.f0();
        o.P(oVar);
    }

    public com.google.android.datatransport.cct.CctBackendFactory G0(java.lang.String r14) {
        throw new UnsupportedOperationException("Method not decompiled: k8.a.G0(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    @Override
    public boolean H1(q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public void I() {
        d0 d0Var = (d0) this.f17789c;
        d0Var.f19549w1.d.f39892g3.O(true);
        d0Var.f19548v1.d.f39892g3.O(true);
    }

    public tg0 J0(int i7, long j3, boolean z10) {
        if (i7 > 0) {
            i7 = ((SparseIntArray) this.f17789c).get(i7, 0);
        }
        Object obj = null;
        if (i7 == 0) {
            return null;
        }
        long j10 = i7;
        LongSparseArray w10 = ((ia.d) this.f17788b).w(j3, 0L);
        if (w10 != null) {
            obj = w10.get(j10);
        }
        tg0 tg0Var = (tg0) obj;
        if (tg0Var == null && z10) {
            tg0 tg0Var2 = new tg0();
            ((ia.d) this.f17788b).T(j3, 0L, j10, tg0Var2);
            return tg0Var2;
        }
        return tg0Var;
    }

    @Override
    public boolean J1() {
        return false;
    }

    public String K0(String str) {
        Resources resources = (Resources) this.f17788b;
        int identifier = resources.getIdentifier(str, "string", (String) this.f17789c);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    @Override
    public y L(o0 o0Var) {
        Uri uri;
        byte[] bArr;
        ld0 ld0Var = (ld0) this.f17789c;
        if (ld0Var != null && (((uri = (Uri) ld0Var.f48973c) != null && uri.equals(o0Var.f10274n)) || ((bArr = (byte[]) ld0Var.f48972b) != null && Arrays.equals(bArr, o0Var.f10271k)))) {
            y yVar = (y) ((ld0) this.f17789c).d;
            yVar.getClass();
            return yVar;
        }
        y L = ((d) this.f17788b).L(o0Var);
        if (L == null) {
            return null;
        }
        this.f17789c = new ld0(o0Var, L);
        return L;
    }

    @Override
    public boolean L0(long j3) {
        return ((gy0) this.f17789c).f35100w;
    }

    @Override
    public void M(y5 y5Var, String str) {
        o oVar = (o) this.f17789c;
        if (oVar.f21850w == null) {
            e6 e6Var = (e6) this.f17788b;
            oVar.f21850w = new ga.d(new m2.d(1, this, e6Var), e6Var);
        }
        oVar.f21850w.k(y5Var, str);
    }

    public boolean M0() {
        org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) this.f17789c;
        if (y5Var.J0 <= 0.0f && !y5Var.A0()) {
            return false;
        }
        return true;
    }

    @Override
    public void O(int i7) {
        o oVar = (o) this.f17789c;
        oVar.f33609b.M1(oVar, i7);
        oVar.f0();
        o.P(oVar);
    }

    public void P0(long j3, File file) {
        synchronized (((g) this.f17789c).f9891f) {
            ((HashMap) ((g) this.f17789c).f9892g).put(Long.valueOf(j3), file);
        }
    }

    @Override
    public boolean Q(q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    public void Q0(Exception exc, boolean z10) {
        int i7;
        this.f17789c = null;
        HashSet hashSet = (HashSet) this.f17788b;
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
    public void Q1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        vf.c.t(q1Var.getContext(), str);
    }

    @Override
    public boolean R() {
        return false;
    }

    public void R0(f fVar) {
        androidx.biometric.o oVar = (androidx.biometric.o) this.f17789c;
        d6.i iVar = (d6.i) this.f17788b;
        int i7 = fVar.f21208b;
        if (i7 == 0) {
            oVar.execute(new u(24, iVar, fVar.f21207a));
        } else {
            oVar.execute(new j6.o(iVar, i7));
        }
    }

    @Override
    public CharacterStyle R1(q1 q1Var) {
        return null;
    }

    @Override
    public boolean S(q1 q1Var) {
        return false;
    }

    public void S0(int i7) {
        ew[] ewVarArr = (ew[]) this.f17788b;
        ew ewVar = ewVarArr[i7];
        Integer num = ewVar.f23376c;
        if (num != null) {
            int i10 = i7 * 2;
            v0(ewVarArr[i10], num.intValue());
            v0(ewVarArr[i10 + 1], ewVar.f23376c.intValue());
            ewVar.f23376c = null;
        }
    }

    @Override
    public boolean T() {
        return false;
    }

    @Override
    public boolean T1(q1 q1Var, gj gjVar) {
        return false;
    }

    public void U0(q2.b bVar) {
        ((HashSet) this.f17788b).add(bVar);
        if (((q2.b) this.f17789c) != null) {
            return;
        }
        this.f17789c = bVar;
        q2.q n10 = bVar.f55141b.n();
        bVar.f55162z = n10;
        android.support.v4.media.session.f fVar = bVar.f55156s;
        String str = l0.f13471a;
        n10.getClass();
        fVar.getClass();
        fVar.obtainMessage(1, new q2.a(x2.t.f59664g.getAndIncrement(), true, SystemClock.elapsedRealtime(), n10)).sendToTarget();
    }

    @Override
    public boolean V0(q1 q1Var, boolean z10) {
        return false;
    }

    @Override
    public f3.h W(p pVar, long j3) {
        long position = pVar.getPosition();
        int min = (int) Math.min(20000L, pVar.getLength() - position);
        x xVar = (x) this.f17789c;
        xVar.K(min);
        pVar.c(0, min, xVar.f13521a);
        int i7 = -1;
        int i10 = -1;
        long j10 = -9223372036854775807L;
        while (xVar.a() >= 4) {
            if (k3.a.a(xVar.f13522b, xVar.f13521a) != 442) {
                xVar.O(1);
            } else {
                xVar.O(4);
                long c10 = m4.x.c(xVar);
                if (c10 != -9223372036854775807L) {
                    long b10 = ((k0) this.f17788b).b(c10);
                    if (b10 > j3) {
                        if (j10 == -9223372036854775807L) {
                            return new f3.h(b10, -1, position);
                        }
                        return new f3.h(-9223372036854775807L, 0, position + i10);
                    } else if (b10 + 100000 > j3) {
                        return new f3.h(-9223372036854775807L, 0, position + xVar.f13522b);
                    } else {
                        j10 = b10;
                        i10 = xVar.f13522b;
                    }
                }
                int i11 = xVar.f13523c;
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
                            if (k3.a.a(xVar.f13522b, xVar.f13521a) == 443) {
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
                                int a10 = k3.a.a(xVar.f13522b, xVar.f13521a);
                                if (a10 == 442 || a10 == 441 || (a10 >>> 8) != 1) {
                                    break;
                                }
                                xVar.O(4);
                                if (xVar.a() < 2) {
                                    xVar.N(i11);
                                    break;
                                }
                                xVar.N(Math.min(xVar.f13523c, xVar.f13522b + xVar.H()));
                            }
                        }
                    }
                }
                i7 = xVar.f13522b;
            }
        }
        if (j10 != -9223372036854775807L) {
            return new f3.h(j10, -2, position + i7);
        }
        return f3.h.d;
    }

    @Override
    public int X() {
        return 0;
    }

    @Override
    public void Y() {
        v3 v3Var = ((o) this.f17789c).f21849s;
        if (v3Var != null) {
            int i7 = 0;
            v3Var.e(false, true);
            int i10 = v3Var.f22062c0;
            if (i10 != 2) {
                i7 = i10;
            }
            v3Var.g(i7, true);
        }
    }

    public long Y0(int i7, int i10) {
        long[] jArr = (long[]) this.f17789c;
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
        return Z0(1, i7, i10);
    }

    @Override
    public jh.a Z() {
        return null;
    }

    public long Z0(int i7, int i10, int i11) {
        ew ewVar = ((ew[]) this.f17788b)[i7];
        Integer num = ewVar.f23376c;
        if (num != null) {
            int i12 = ewVar.d;
            int i13 = ewVar.f23377e;
            if (i10 >= i12 && i11 <= i13) {
                return num.intValue();
            }
        }
        int i14 = ewVar.d;
        int i15 = ewVar.f23377e;
        if (i14 >= i10 && i15 <= i11) {
            return ewVar.f23374a;
        }
        if ((i10 <= i14 && i11 >= i14) || (i10 >= i14 && i10 <= i15)) {
            S0(i7);
            int i16 = i7 * 2;
            return Math.max(Z0(i16, i10, i11), Z0(i16 + 1, i10, i11));
        }
        return 0L;
    }

    @Override
    public boolean Z1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean a(float r6) {
        throw new UnsupportedOperationException("Method not decompiled: k8.a.a(float):boolean");
    }

    @Override
    public boolean a0(q1 q1Var) {
        return false;
    }

    public long a1(int i7, int i10) {
        long[] jArr = (long[]) this.f17789c;
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
        return b1(1, i7, i10);
    }

    @Override
    public void b(e1 e1Var, boolean z10) {
        ((o) this.f17789c).f33609b.h1(e1Var, z10);
    }

    @Override
    public void b0(float f10, float f11, float f12, float f13, Canvas canvas) {
        Paint paint = (Paint) this.f17788b;
        PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f17789c;
        z0 z0Var = premiumPreviewFragment.f42993n0;
        if (premiumPreviewFragment.f42988i0) {
            paint.setColor(premiumPreviewFragment.getThemedColor(j6.f28792a7));
            canvas.drawRect(f10, f11, f12, f13, paint);
            return;
        }
        z0Var.d(0, (-premiumPreviewFragment.f42983e0.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.f42980c0, 0, premiumPreviewFragment.f42983e0.getMeasuredWidth(), 0.0f, premiumPreviewFragment.f42983e0.getMeasuredHeight());
        canvas.drawRect(f10, f11, f12, f13, z0Var.f58392f);
    }

    public long b1(int i7, int i10, int i11) {
        ew ewVar = ((ew[]) this.f17788b)[i7];
        Integer num = ewVar.f23376c;
        if (num != null) {
            int i12 = ewVar.d;
            int i13 = ewVar.f23377e;
            if (i10 >= i12 && i11 <= i13) {
                return num.intValue();
            }
        }
        int i14 = ewVar.d;
        int i15 = ewVar.f23377e;
        if (i14 >= i10 && i15 <= i11) {
            return ewVar.f23375b;
        }
        if ((i10 <= i14 && i11 >= i14) || (i10 >= i14 && i10 <= i15)) {
            S0(i7);
            int i16 = i7 * 2;
            return Math.min(b1(i16, i10, i11), b1(i16 + 1, i10, i11));
        }
        return 2147483647L;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean c0(q1 q1Var, TLRPC.User user) {
        return false;
    }

    public void c1() {
        m8.a aVar = (m8.a) this.f17788b;
        try {
            v7.f fVar = (v7.f) aVar.f20525a;
            fVar.t1(fVar.p1(), 1);
            ((ea) this.f17789c).f23290c.remove(aVar);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public dr0 c2() {
        return null;
    }

    @Override
    public void close() {
        ((d0) this.f17789c).f19541o1.C(0);
    }

    @Override
    public void d(String str, String str2) {
        ek0 ek0Var = ((nj0) this.f17789c).f49571a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            ek0Var.S1(true, str2, (ef0) this.f17788b, this, ek0Var.C1);
        } else {
            ek0Var.R1(true, false);
        }
    }

    @Override
    public y d0(byte[] bArr) {
        byte[] bArr2;
        ld0 ld0Var = (ld0) this.f17789c;
        if (ld0Var != null && (bArr2 = (byte[]) ld0Var.f48972b) != null && Arrays.equals(bArr2, bArr)) {
            y yVar = (y) ((ld0) this.f17789c).d;
            yVar.getClass();
            return yVar;
        }
        y d02 = ((d) this.f17788b).d0(bArr);
        this.f17789c = new ld0(bArr, d02);
        return d02;
    }

    public void d1(int i7) {
        try {
            v7.f fVar = (v7.f) ((m8.a) this.f17788b).f20525a;
            Parcel p12 = fVar.p1();
            p12.writeInt(i7);
            fVar.t1(p12, 11);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public b3.q e(s2.p pVar, m mVar) {
        return new h0(8, ((t) this.f17788b).e(pVar, mVar), (List) this.f17789c);
    }

    public void e1(int i7) {
        try {
            e eVar = (e) this.f17788b;
            Parcel p12 = eVar.p1();
            p12.writeInt(i7);
            eVar.t1(p12, 16);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public boolean mo0f(float f10, float f11, int i7, View view) {
        yw ywVar = (yw) this.f17789c;
        if (view instanceof t2) {
            t2 t2Var = (t2) view;
            if (t2Var.f31611o2) {
                ywVar.Z4(t2Var.getDialogId(), view);
                return true;
            }
        }
        ow owVar = ywVar.A0;
        if (owVar != null && owVar.getVisibility() == 0 && ywVar.A0.f35785n) {
            return false;
        }
        return ywVar.A4(view, i7, f10, ((xw) this.f17788b).d);
    }

    @Override
    public boolean f0() {
        return false;
    }

    @Override
    public boolean f1(gj gjVar) {
        return y0.a(gjVar);
    }

    @Override
    public boolean f2(long j3) {
        return ((gy0) this.f17789c).f35099s;
    }

    @Override
    public boolean g() {
        return true;
    }

    @Override
    public m60 g0(View view) {
        o oVar = (o) this.f17789c;
        m60 m60Var = new m60(oVar, (e6) this.f17788b, view, false, false, true);
        oVar.I = m60Var;
        return m60Var;
    }

    public void g1(double d) {
        m8.a aVar = (m8.a) this.f17788b;
        aVar.getClass();
        try {
            v7.f fVar = (v7.f) aVar.f20525a;
            Parcel p12 = fVar.p1();
            p12.writeDouble(d);
            fVar.t1(p12, 5);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public String h(q1 q1Var) {
        return null;
    }

    public void h1(int i7) {
        try {
            v7.f fVar = (v7.f) ((m8.a) this.f17788b).f20525a;
            Parcel p12 = fVar.p1();
            p12.writeInt(i7);
            fVar.t1(p12, 9);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public boolean h2(q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public void i() {
        Point point = g0.f23611q;
        if (point.x > point.y) {
            ((yw) this.f17789c).finishPreviewFragment();
        }
    }

    @Override
    public int i0(q1 q1Var) {
        return 0;
    }

    @Override
    public void k0(p3 p3Var, View view) {
        o oVar = (o) this.f17789c;
        m60 m60Var = new m60(oVar, (e6) this.f17788b, view, false, false, true);
        m60Var.Q = true;
        e2 e2Var = oVar.f33609b.f36424a2;
        oVar.getContext();
        oVar.I = e4.b(m60Var, e2Var, p3Var, true);
    }

    @Override
    public void l(boolean z10, float f10) {
        h5.n1 = f10;
        ((TextView) this.f17788b).setText("Saturation " + (f10 * 5.0f));
        st0 st0Var = ((h5) this.f17789c).f47602m1;
        st0Var.M();
        st0Var.K();
    }

    @Override
    public boolean l0() {
        return false;
    }

    @Override
    public void m0() {
        o oVar = (o) this.f17789c;
        oVar.c0();
        oVar.d0();
    }

    @Override
    public void n(n3 n3Var, View view) {
        o oVar = (o) this.f17789c;
        m60 m60Var = new m60(oVar, (e6) this.f17788b, view, false, false, true);
        m60Var.Q = true;
        oVar.I = e4.c(m60Var, oVar.f33609b.f36424a2, oVar.getContext(), (e6) this.f17788b, n3Var, true);
    }

    @Override
    public boolean o0(p5 p5Var) {
        return false;
    }

    @Override
    public void onContentChanged() {
        o oVar = (o) this.f17789c;
        v3 v3Var = oVar.f21849s;
        if (v3Var != null) {
            v3Var.setSendLoading(oVar.f21848r.p3());
        }
        oVar.a0(true);
        oVar.d0();
        oi.d dVar = oVar.Q;
        g0.r(dVar);
        g0.i3(dVar, 1000L);
    }

    @Override
    public int p0() {
        return 0;
    }

    @Override
    public boolean p2(q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public void q(float f10) {
        Point point = g0.f23611q;
        if (point.x > point.y) {
            ((yw) this.f17789c).movePreviewFragment(f10);
        }
    }

    @Override
    public void r0() {
        x xVar = (x) this.f17789c;
        byte[] bArr = l0.f13472b;
        xVar.getClass();
        xVar.L(bArr.length, bArr);
    }

    @Override
    public void s(int i7) {
        o.T((o) this.f17789c, 74, i7);
    }

    @Override
    public b3.q s0() {
        return new h0(8, ((t) this.f17788b).s0(), (List) this.f17789c);
    }

    public void t0(int i7, int i10, int i11) {
        ew[] ewVarArr = (ew[]) this.f17788b;
        ?? obj = new Object();
        obj.f23376c = null;
        ewVarArr[i7] = obj;
        obj.d = i10;
        obj.f23377e = (i10 + i11) - 1;
        if (i11 == 1) {
            long j3 = ((long[]) this.f17789c)[i10];
            obj.f23374a = j3;
            obj.f23375b = j3;
            return;
        }
        int i12 = i7 * 2;
        int i13 = i11 / 2;
        t0(i12, i10, i13);
        int i14 = i12 + 1;
        t0(i14, i10 + i13, i11 - i13);
        ew ewVar = ewVarArr[i7];
        ew ewVar2 = ewVarArr[i12];
        ewVar2.getClass();
        ew ewVar3 = ewVarArr[i14];
        ewVar3.getClass();
        ewVar.getClass();
        ewVar.f23374a = Math.max(ewVar2.f23374a, ewVar3.f23374a);
        ewVarArr[i7].f23375b = Math.min(ewVarArr[i12].f23375b, ewVarArr[i14].f23375b);
    }

    public String toString() {
        switch (this.f17787a) {
            case 28:
                return "Bounds{lower=" + ((i0.c) this.f17788b) + " upper=" + ((i0.c) this.f17789c) + "}";
            default:
                return super.toString();
        }
    }

    @Override
    public void v() {
        int i7;
        o oVar = (o) this.f17789c;
        q3 q3Var = oVar.f21848r;
        v3 v3Var = oVar.f21849s;
        if (v3Var != null) {
            e3 e3Var = q3Var.f21943v3;
            if (e3Var != null && e3Var.x() && q3Var.F4()) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            if (v3Var.f22060b0 == 2) {
                v3Var.f22062c0 = i7;
            } else {
                v3Var.g(i7, true);
            }
            if (i7 != 0) {
                oVar.b0();
            }
        }
        oVar.e0();
    }

    public void v0(ew ewVar, int i7) {
        ewVar.f23376c = Integer.valueOf(i7);
        int i10 = ewVar.d;
        long j3 = i7;
        ewVar.f23374a = j3;
        ewVar.f23375b = j3;
        ((long[]) this.f17789c)[i10] = j3;
    }

    @Override
    public boolean v2(int i7) {
        return false;
    }

    @Override
    public String x(long j3) {
        String trim = ((EditTextBoldCursor) this.f17788b).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (!((gy0) this.f17789c).f35099s && TextUtils.isEmpty(trim)) {
            return null;
        }
        return trim;
    }

    public void x0() {
        this.f17788b = null;
        this.f17789c = null;
    }

    @Override
    public boolean x1() {
        return false;
    }

    @Override
    public void y(long j3) {
        ((e2) this.f17788b).presentFragment(an.ua(j3));
        ((d0) this.f17789c).dismiss();
    }

    @Override
    public boolean y0(gj gjVar) {
        return true;
    }

    @Override
    public boolean z1(q1 q1Var, int i7) {
        return false;
    }

    @Override
    public i9 z2() {
        return null;
    }

    public a(int i7, boolean z10) {
        this.f17787a = i7;
    }

    public a(Object obj, Object obj2, boolean z10, int i7) {
        this.f17787a = i7;
        this.f17788b = obj;
        this.f17789c = obj2;
    }

    public a(IBinder iBinder) {
        this.f17787a = 4;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f17788b = new Messenger(iBinder);
            this.f17789c = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f17789c = new m6.g(iBinder);
            this.f17788b = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public a(e eVar) {
        this.f17787a = 0;
        new HashMap();
        q6.m.g(eVar);
        this.f17788b = eVar;
    }

    public a(String str, String str2) {
        this.f17787a = 25;
        Object[] objArr = {str, 23};
        if (str.length() <= 23) {
            this.f17788b = str;
            this.f17789c = (str2 == null || str2.length() <= 0) ? null : str2;
            return;
        }
        throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
    }

    public a(long[] jArr) {
        this.f17787a = 11;
        this.f17789c = jArr;
        if (jArr.length < 30) {
            return;
        }
        this.f17788b = new ew[(int) (Math.pow(2.0d, Math.floor((Math.log(jArr.length) / Math.log(2.0d)) + 1.0d)) * 2.0d)];
        t0(1, 0, jArr.length);
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
    public void i1() {
    }

    @Override
    public void k() {
    }

    @Override
    public void p() {
    }

    @Override
    public void s2() {
    }

    @Override
    public void t() {
    }

    @Override
    public void x2() {
    }

    public a(d dVar) {
        this.f17787a = 21;
        this.f17788b = dVar;
    }

    public a(k0 k0Var) {
        this.f17787a = 3;
        this.f17788b = k0Var;
        this.f17789c = new x();
    }

    @Override
    public void B(q1 q1Var) {
    }

    @Override
    public void C1(q1 q1Var) {
    }

    @Override
    public void F0(q1 q1Var) {
    }

    @Override
    public void H(q1 q1Var) {
    }

    @Override
    public void I0(q1 q1Var) {
    }

    @Override
    public void J(dj djVar) {
    }

    @Override
    public void L1(q1 q1Var) {
    }

    @Override
    public void N(q1 q1Var) {
    }

    @Override
    public void N0(q1 q1Var) {
    }

    @Override
    public void O1(gj gjVar) {
    }

    @Override
    public void P(gj gjVar) {
    }

    @Override
    public void V(q1 q1Var) {
    }

    @Override
    public void W0(q1 q1Var) {
    }

    @Override
    public void X0(q1 q1Var) {
    }

    @Override
    public void e0(int i7) {
    }

    @Override
    public void j0(q1 q1Var) {
    }

    @Override
    public void j2(q1 q1Var) {
    }

    @Override
    public void n0(String str) {
    }

    @Override
    public void o(q1 q1Var) {
    }

    @Override
    public void q2(q1 q1Var) {
    }

    @Override
    public void r(q1 q1Var) {
    }

    @Override
    public void u(q1 q1Var) {
    }

    @Override
    public void w(q1 q1Var) {
    }

    @Override
    public void z(q1 q1Var) {
    }

    @Override
    public void z0(q1 q1Var) {
    }

    public a(Context context, int i7) {
        this.f17787a = i7;
        switch (i7) {
            case 26:
                q6.m.g(context);
                Resources resources = context.getResources();
                this.f17788b = resources;
                this.f17789c = resources.getResourcePackageName(2131689567);
                return;
            default:
                this.f17789c = null;
                this.f17788b = context;
                return;
        }
    }

    public a(Handler handler, s sVar) {
        this.f17787a = 5;
        if (sVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f17788b = handler;
        this.f17789c = sVar;
    }

    public a(PremiumPreviewFragment premiumPreviewFragment) {
        this.f17787a = 19;
        this.f17789c = premiumPreviewFragment;
        this.f17788b = new Paint();
    }

    @Override
    public void F1(q1 q1Var, boolean z10) {
    }

    @Override
    public void G(q1 q1Var, o2 o2Var) {
    }

    @Override
    public void I1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void K1(q1 q1Var, int i7) {
    }

    @Override
    public void O0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void X1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void a2(q1 q1Var, l10 l10Var) {
    }

    @Override
    public void e2(String str, String str2) {
    }

    @Override
    public void k1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void l2(q1 q1Var, long j3) {
    }

    @Override
    public void p1(q1 q1Var, int i7) {
    }

    public a(int i7) {
        this.f17787a = i7;
        switch (i7) {
            case 23:
                this.f17788b = new HashSet();
                return;
            case 24:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f17788b = byteArrayOutputStream;
                this.f17789c = new DataOutputStream(byteArrayOutputStream);
                return;
            default:
                this.f17788b = new ia.d();
                this.f17789c = new SparseIntArray();
                return;
        }
    }

    @Override
    public void B0(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void B1(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public void C0(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void H0(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public void K(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public void T0(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void h0(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void q0(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void t1(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void y2(q1 q1Var, int i7, int i10) {
    }

    @Override
    public void Y1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void m(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override
    public void u0(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void w0(q1 q1Var, float f10, float f11, boolean z10) {
    }

    @Override
    public void g2(q1 q1Var, int i7, float f10, float f11, boolean z10) {
    }

    @Override
    public void j(q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override
    public void t2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public void U(q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    @Override
    public void S1(gj gjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}
