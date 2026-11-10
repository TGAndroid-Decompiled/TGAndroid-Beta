package m4;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import e2.o0;
import e2.r0;
import h2.k0;
import h2.m0;
import h9.i0;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import m.f3;
import org.telegram.messenger.a8;
import org.telegram.messenger.fa;
import org.telegram.messenger.fj;
import org.telegram.messenger.gf;
import org.telegram.messenger.gw;
import org.telegram.messenger.ij;
import org.telegram.messenger.o10;
import org.telegram.messenger.o2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.h3;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.ej0;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.ws;
import org.telegram.ui.Components.ys;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.z5;
import org.telegram.ui.ek0;
import org.telegram.ui.h5;
import org.telegram.ui.hf0;
import org.telegram.ui.ir0;
import org.telegram.ui.ly0;
import org.telegram.ui.nj0;
import org.telegram.ui.pw;
import org.telegram.ui.tj0;
import org.telegram.ui.wg0;
import org.telegram.ui.yw;
import org.telegram.ui.zw;
import ug.y0;
import v4.d1;
import v4.j1;
public final class d0 implements a0, Continuation, lm0, ws, l1, ej0, tj0, ri.a, h2.d, te.b, ai, com.google.android.gms.common.api.internal.p {
    public Object f19616a;
    public Object f19617b;

    public d0(Object obj) {
        this.f19617b = null;
        this.f19616a = obj;
    }

    @Override
    public m9.y A(o0 o0Var) {
        Uri uri;
        byte[] bArr;
        ly0 ly0Var = (ly0) this.f19617b;
        if (ly0Var != null && (((uri = (Uri) ly0Var.f47747c) != null && uri.equals(o0Var.f10443n)) || ((bArr = (byte[]) ly0Var.f47746b) != null && Arrays.equals(bArr, o0Var.f10440k)))) {
            m9.y yVar = (m9.y) ((ly0) this.f19617b).d;
            yVar.getClass();
            return yVar;
        }
        m9.y A = ((h2.d) this.f19616a).A(o0Var);
        if (A == null) {
            return null;
        }
        this.f19617b = new ly0(o0Var, A);
        return A;
    }

    public byte[] B(q3.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.f19617b;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f19616a;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.f53771a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(aVar.f53772b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f53773c);
            dataOutputStream.writeLong(aVar.d);
            dataOutputStream.write(aVar.f53774e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public void B1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z9) {
        vf.c.t(q1Var.getContext(), str);
    }

    public long C0(int i7, int i10, int i11) {
        gw gwVar = ((gw[]) this.f19616a)[i7];
        Integer num = gwVar.f22755c;
        if (num != null) {
            int i12 = gwVar.d;
            int i13 = gwVar.f22756e;
            if (i10 >= i12 && i11 <= i13) {
                return num.intValue();
            }
        }
        int i14 = gwVar.d;
        int i15 = gwVar.f22756e;
        if (i14 >= i10 && i15 <= i11) {
            return gwVar.f22753a;
        }
        if ((i10 <= i14 && i11 >= i14) || (i10 >= i14 && i10 <= i15)) {
            r0(i7);
            int i16 = i7 * 2;
            return Math.max(C0(i16, i10, i11), C0(i16 + 1, i10, i11));
        }
        return 0L;
    }

    @Override
    public CharacterStyle C1(q1 q1Var) {
        return null;
    }

    public com.google.android.datatransport.cct.CctBackendFactory E(java.lang.String r14) {
        throw new UnsupportedOperationException("Method not decompiled: m4.d0.E(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    @Override
    public boolean E1(q1 q1Var, ij ijVar) {
        return false;
    }

    @Override
    public void F(float r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: m4.d0.F(float, int):void");
    }

    @Override
    public boolean G1() {
        System.currentTimeMillis();
        return true;
    }

    public long H0(int i7, int i10) {
        long[] jArr = (long[]) this.f19617b;
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
        return I0(1, i7, i10);
    }

    public wg0 I(int i7, long j3, boolean z9) {
        if (i7 > 0) {
            i7 = ((SparseIntArray) this.f19617b).get(i7, 0);
        }
        Object obj = null;
        if (i7 == 0) {
            return null;
        }
        long j10 = i7;
        LongSparseArray V = ((g6.d0) this.f19616a).V(j3, 0L);
        if (V != null) {
            obj = V.get(j10);
        }
        wg0 wg0Var = (wg0) obj;
        if (wg0Var == null && z9) {
            wg0 wg0Var2 = new wg0();
            ((g6.d0) this.f19616a).Z(j3, 0L, j10, wg0Var2);
            return wg0Var2;
        }
        return wg0Var;
    }

    public long I0(int i7, int i10, int i11) {
        gw gwVar = ((gw[]) this.f19616a)[i7];
        Integer num = gwVar.f22755c;
        if (num != null) {
            int i12 = gwVar.d;
            int i13 = gwVar.f22756e;
            if (i10 >= i12 && i11 <= i13) {
                return num.intValue();
            }
        }
        int i14 = gwVar.d;
        int i15 = gwVar.f22756e;
        if (i14 >= i10 && i15 <= i11) {
            return gwVar.f22754b;
        }
        if ((i10 <= i14 && i11 >= i14) || (i10 >= i14 && i10 <= i15)) {
            r0(i7);
            int i16 = i7 * 2;
            return Math.min(I0(i16, i10, i11), I0(i16 + 1, i10, i11));
        }
        return 2147483647L;
    }

    @Override
    public boolean J0(long j3) {
        return ((ey0) this.f19617b).f33360w;
    }

    @Override
    public boolean J1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    public String L(String str) {
        Resources resources = (Resources) this.f19616a;
        int identifier = resources.getIdentifier(str, "string", (String) this.f19617b);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public boolean M() {
        z5 z5Var = (z5) this.f19617b;
        if (z5Var.I0 <= 0.0f && !z5Var.A0()) {
            return false;
        }
        return true;
    }

    @Override
    public ir0 N1() {
        return null;
    }

    public void O(long j3, File file) {
        synchronized (((e0.g) this.f19617b).f10060f) {
            ((HashMap) ((e0.g) this.f19617b).f10061g).put(Long.valueOf(j3), file);
        }
    }

    @Override
    public boolean O0(q1 q1Var, boolean z9) {
        return false;
    }

    @Override
    public boolean Q(q1 q1Var, TLRPC.TodoItem todoItem, boolean z9) {
        return false;
    }

    @Override
    public boolean Q1(long j3) {
        return ((ey0) this.f19617b).f33359s;
    }

    @Override
    public boolean R() {
        return false;
    }

    public void R0() {
        m8.a aVar = (m8.a) this.f19616a;
        try {
            v7.f fVar = (v7.f) aVar.f19933a;
            fVar.t1(fVar.p1(), 1);
            ((fa) this.f19617b).f22396c.remove(aVar);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public boolean S(q1 q1Var) {
        return false;
    }

    public void S0(d1 d1Var) {
        j1 j1Var = (j1) ((a0.f) this.f19616a).get(d1Var);
        if (j1Var == null) {
            return;
        }
        j1Var.f57105a &= -2;
    }

    @Override
    public boolean S1(q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public boolean T() {
        return false;
    }

    public void T0(d1 d1Var) {
        a0.f fVar = (a0.f) this.f19616a;
        a0.h hVar = (a0.h) this.f19617b;
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
            j1Var.f57105a = 0;
            j1Var.f57106b = null;
            j1Var.f57107c = null;
            j1.d.v(j1Var);
        }
    }

    public void U0(int i7) {
        try {
            v7.f fVar = (v7.f) ((m8.a) this.f19616a).f19933a;
            Parcel p12 = fVar.p1();
            p12.writeInt(i7);
            fVar.t1(p12, 11);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void V0(double d) {
        m8.a aVar = (m8.a) this.f19616a;
        aVar.getClass();
        try {
            v7.f fVar = (v7.f) aVar.f19933a;
            Parcel p12 = fVar.p1();
            p12.writeDouble(d);
            fVar.t1(p12, 5);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public m9.y W(byte[] bArr) {
        byte[] bArr2;
        ly0 ly0Var = (ly0) this.f19617b;
        if (ly0Var != null && (bArr2 = (byte[]) ly0Var.f47746b) != null && Arrays.equals(bArr2, bArr)) {
            m9.y yVar = (m9.y) ((ly0) this.f19617b).d;
            yVar.getClass();
            return yVar;
        }
        m9.y W = ((h2.d) this.f19616a).W(bArr);
        this.f19617b = new ly0(bArr, W);
        return W;
    }

    @Override
    public boolean W0(ij ijVar) {
        return f1.a(ijVar);
    }

    @Override
    public int X() {
        return 0;
    }

    public void X0(int i7) {
        try {
            v7.f fVar = (v7.f) ((m8.a) this.f19616a).f19933a;
            Parcel p12 = fVar.p1();
            p12.writeInt(i7);
            fVar.t1(p12, 9);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public void Y(int i7, float f10, float f11, te.c cVar) {
        rh.h hVar = (rh.h) this.f19617b;
        hVar.f54559c.a(f10);
        hVar.d.a(f10);
        hVar.f54558b.a(f10);
        ((Runnable) this.f19616a).run();
    }

    @Override
    public jh.a Z() {
        return null;
    }

    @Override
    public void a(String str, String str2) {
        ek0 ek0Var = ((nj0) this.f19617b).f48219a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            ek0Var.S1(true, str2, (hf0) this.f19616a, this, ek0Var.B1);
        } else {
            ek0Var.R1(true, false);
        }
    }

    @Override
    public boolean a0(q1 q1Var) {
        return false;
    }

    @Override
    public void accept(java.lang.Object r51, java.lang.Object r52) {
        throw new UnsupportedOperationException("Method not decompiled: m4.d0.accept(java.lang.Object, java.lang.Object):void");
    }

    @Override
    public boolean b0(q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean b2(q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public void c(h2.x xVar) {
        e0 e0Var = (e0) this.f19617b;
        SparseArray sparseArray = e0Var.h;
        d4.f fVar = (d4.f) this.f19616a;
        if (xVar.A() == 0 && (xVar.A() & 128) != 0) {
            xVar.O(6);
            int a10 = xVar.a() / 4;
            for (int i7 = 0; i7 < a10; i7++) {
                xVar.k(0, 4, (byte[]) fVar.f8167b);
                fVar.J(0);
                int j3 = fVar.j(16);
                fVar.L(3);
                if (j3 == 0) {
                    fVar.L(13);
                } else {
                    int j10 = fVar.j(13);
                    if (sparseArray.get(j10) == null) {
                        sparseArray.put(j10, new b0(new a4.k(e0Var, j10)));
                        e0Var.f19650n++;
                    }
                }
            }
            if (e0Var.f19639a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override
    public void c0(pg pgVar) {
        pgVar.run();
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public void e(Canvas canvas, float f10, float f11, float f12, float f13) {
        Paint paint = (Paint) this.f19616a;
        PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f19617b;
        y0 y0Var = premiumPreviewFragment.m0;
        if (premiumPreviewFragment.f41615h0) {
            paint.setColor(premiumPreviewFragment.getThemedColor(m6.f27834a7));
            canvas.drawRect(f10, f11, f12, f13, paint);
            return;
        }
        y0Var.d(0, (-premiumPreviewFragment.f41609d0.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.f41606b0, 0, premiumPreviewFragment.f41609d0.getMeasuredWidth(), 0.0f, premiumPreviewFragment.f41609d0.getMeasuredHeight());
        canvas.drawRect(f10, f11, f12, f13, y0Var.f56877f);
    }

    @Override
    public boolean e0() {
        return false;
    }

    @Override
    public boolean mo19f(float f10, float f11, int i7, View view) {
        zw zwVar = (zw) this.f19617b;
        if (view instanceof t2) {
            t2 t2Var = (t2) view;
            if (t2Var.f30469n2) {
                zwVar.Z4(t2Var.getDialogId(), view);
                return true;
            }
        }
        pw pwVar = zwVar.f52683z0;
        if (pwVar != null && pwVar.getVisibility() == 0 && zwVar.f52683z0.f33380n) {
            return false;
        }
        return zwVar.A4(view, i7, f10, ((yw) this.f19616a).d);
    }

    @Override
    public boolean f0() {
        return false;
    }

    @Override
    public boolean g() {
        return true;
    }

    @Override
    public boolean g2(int i7) {
        return false;
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public String h(q1 q1Var) {
        return null;
    }

    @Override
    public int h0(q1 q1Var) {
        return 0;
    }

    @Override
    public void i() {
        Point point = org.telegram.messenger.g0.f22567q;
        if (point.x > point.y) {
            ((zw) this.f19617b).finishPreviewFragment();
        }
    }

    public void j0(Exception exc, boolean z9) {
        int i7;
        this.f19617b = null;
        HashSet hashSet = (HashSet) this.f19616a;
        i0 q10 = i0.q(hashSet);
        hashSet.clear();
        h9.g0 listIterator = q10.listIterator(0);
        while (listIterator.hasNext()) {
            q2.b bVar = (q2.b) listIterator.next();
            bVar.getClass();
            if (z9) {
                i7 = 1;
            } else {
                i7 = 3;
            }
            bVar.l(i7, exc);
        }
    }

    @Override
    public boolean k0() {
        return false;
    }

    @Override
    public j9 k2() {
        return null;
    }

    @Override
    public void l(boolean z9, float f10) {
        h5.f46218m1 = f10;
        ((TextView) this.f19616a).setText("Saturation " + (f10 * 5.0f));
        st0 st0Var = ((h5) this.f19617b).l1;
        st0Var.M();
        st0Var.L();
    }

    public void l0(o0.f fVar) {
        androidx.biometric.o oVar = (androidx.biometric.o) this.f19617b;
        gf.g gVar = (gf.g) this.f19616a;
        int i7 = fVar.f20692b;
        if (i7 == 0) {
            oVar.execute(new m9.u(25, gVar, fVar.f20691a));
        } else {
            oVar.execute(new f3(gVar, i7));
        }
    }

    @Override
    public void m() {
        ((h3) this.f19617b).b(((ys) this.f19616a).getText());
    }

    @Override
    public boolean n0(q5 q5Var) {
        return false;
    }

    @Override
    public boolean n1() {
        return false;
    }

    public r0 o0(d1 d1Var, int i7) {
        j1 j1Var;
        r0 r0Var;
        a0.f fVar = (a0.f) this.f19616a;
        int d = fVar.d(d1Var);
        if (d >= 0 && (j1Var = (j1) fVar.i(d)) != null) {
            int i10 = j1Var.f57105a;
            if ((i10 & i7) != 0) {
                int i11 = i10 & (~i7);
                j1Var.f57105a = i11;
                if (i7 == 4) {
                    r0Var = j1Var.f57106b;
                } else if (i7 == 8) {
                    r0Var = j1Var.f57107c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i11 & 12) == 0) {
                    fVar.g(d);
                    j1Var.f57105a = 0;
                    j1Var.f57106b = null;
                    j1Var.f57107c = null;
                    j1.d.v(j1Var);
                }
                return r0Var;
            }
        }
        return null;
    }

    @Override
    public void o1(int i7, boolean z9, boolean z10, int i10, int i11, long j3, boolean z11, boolean z12, long j10) {
        ci ciVar = (ci) this.f19616a;
        try {
            HashMap<Object, Object> selectedPhotos = ciVar.d2.getSelectedPhotos();
            if (!selectedPhotos.isEmpty()) {
                gf gfVar = (gf) selectedPhotos.values().iterator().next();
                String str = gfVar.h;
                if (str == null) {
                    str = gfVar.I;
                }
                tg.g0 g0Var = (tg.g0) this.f19617b;
                g0Var.d0(g0Var.f0(str, true));
                ciVar.dismiss();
            }
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    @Override
    public boolean p1(q1 q1Var, int i7) {
        return false;
    }

    @Override
    public void q(float f10) {
        Point point = org.telegram.messenger.g0.f22567q;
        if (point.x > point.y) {
            ((zw) this.f19617b).movePreviewFragment(f10);
        }
    }

    @Override
    public int q0() {
        return 0;
    }

    public void r0(int i7) {
        gw[] gwVarArr = (gw[]) this.f19616a;
        gw gwVar = gwVarArr[i7];
        Integer num = gwVar.f22755c;
        if (num != null) {
            int i10 = i7 * 2;
            w(gwVarArr[i10], num.intValue());
            w(gwVarArr[i10 + 1], gwVar.f22755c.intValue());
            gwVar.f22755c = null;
        }
    }

    public void s(d1 d1Var, r0 r0Var) {
        a0.f fVar = (a0.f) this.f19616a;
        j1 j1Var = (j1) fVar.get(d1Var);
        if (j1Var == null) {
            j1Var = j1.a();
            fVar.put(d1Var, j1Var);
        }
        j1Var.f57107c = r0Var;
        j1Var.f57105a |= 8;
    }

    public void t(int i7, int i10, int i11) {
        gw[] gwVarArr = (gw[]) this.f19616a;
        ?? obj = new Object();
        obj.f22755c = null;
        gwVarArr[i7] = obj;
        obj.d = i10;
        obj.f22756e = (i10 + i11) - 1;
        if (i11 == 1) {
            long j3 = ((long[]) this.f19617b)[i10];
            obj.f22753a = j3;
            obj.f22754b = j3;
            return;
        }
        int i12 = i7 * 2;
        int i13 = i11 / 2;
        t(i12, i10, i13);
        int i14 = i12 + 1;
        t(i14, i10 + i13, i11 - i13);
        gw gwVar = gwVarArr[i7];
        gw gwVar2 = gwVarArr[i12];
        gwVar2.getClass();
        gw gwVar3 = gwVarArr[i14];
        gwVar3.getClass();
        gwVar.getClass();
        gwVar.f22753a = Math.max(gwVar2.f22753a, gwVar3.f22753a);
        gwVarArr[i7].f22754b = Math.min(gwVarArr[i12].f22754b, gwVarArr[i14].f22754b);
    }

    @Override
    public Object then(Task task) {
        m6.c cVar = (m6.c) this.f19616a;
        Bundle bundle = (Bundle) this.f19617b;
        cVar.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        if (bundle2 != null && bundle2.containsKey("google.messenger")) {
            return cVar.d(bundle).onSuccessTask(m6.d.f19901b, pb.b.f53534b);
        }
        return task;
    }

    @Override
    public boolean u1(q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    public void v0(q2.b bVar) {
        ((HashSet) this.f19616a).add(bVar);
        if (((q2.b) this.f19617b) != null) {
            return;
        }
        this.f19617b = bVar;
        q2.p q10 = bVar.f53706b.q();
        bVar.f53727z = q10;
        android.support.v4.media.session.f fVar = bVar.f53721s;
        String str = m0.f14114a;
        q10.getClass();
        fVar.getClass();
        fVar.obtainMessage(1, new q2.a(x2.t.f58482g.getAndIncrement(), true, SystemClock.elapsedRealtime(), q10)).sendToTarget();
    }

    public void w(gw gwVar, int i7) {
        gwVar.f22755c = Integer.valueOf(i7);
        int i10 = gwVar.d;
        long j3 = i7;
        gwVar.f22753a = j3;
        gwVar.f22754b = j3;
        ((long[]) this.f19617b)[i10] = j3;
    }

    public long w0(int i7, int i10) {
        long[] jArr = (long[]) this.f19617b;
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
        return C0(1, i7, i10);
    }

    @Override
    public boolean w1() {
        return false;
    }

    @Override
    public boolean x0(ij ijVar) {
        return true;
    }

    @Override
    public String y(long j3) {
        String trim = ((EditTextBoldCursor) this.f19616a).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (!((ey0) this.f19617b).f33359s && TextUtils.isEmpty(trim)) {
            return null;
        }
        return trim;
    }

    public d0(Object obj, Object obj2) {
        this.f19616a = obj;
        this.f19617b = obj2;
    }

    public d0(Object obj, Object obj2, boolean z9) {
        this.f19617b = obj;
        this.f19616a = obj2;
    }

    public d0(Object obj, boolean z9) {
        this.f19616a = obj;
    }

    public d0(long[] jArr) {
        this.f19617b = jArr;
        if (jArr.length < 30) {
            return;
        }
        this.f19616a = new gw[(int) (Math.pow(2.0d, Math.floor((Math.log(jArr.length) / Math.log(2.0d)) + 1.0d)) * 2.0d)];
        t(1, 0, jArr.length);
    }

    public d0(int i7) {
        switch (i7) {
            case 19:
                this.f19616a = new HashSet();
                return;
            case 20:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f19616a = byteArrayOutputStream;
                this.f19617b = new DataOutputStream(byteArrayOutputStream);
                return;
            case 29:
                this.f19616a = new a0.l(0);
                this.f19617b = new a0.h();
                return;
            default:
                this.f19616a = new g6.d0(24);
                this.f19617b = new SparseIntArray();
                return;
        }
    }

    @Override
    public void D() {
    }

    @Override
    public void F0() {
    }

    @Override
    public void F1() {
    }

    @Override
    public void Z0() {
    }

    @Override
    public void e2() {
    }

    @Override
    public void i2() {
    }

    @Override
    public void k() {
    }

    @Override
    public void p() {
    }

    @Override
    public void t0() {
    }

    @Override
    public void u() {
    }

    @Override
    public void z0() {
    }

    @Override
    public void A1(ij ijVar) {
    }

    @Override
    public void C(q1 q1Var) {
    }

    @Override
    public void D0(q1 q1Var) {
    }

    @Override
    public void G0(q1 q1Var) {
    }

    @Override
    public void H(q1 q1Var) {
    }

    @Override
    public void J(fj fjVar) {
    }

    @Override
    public void K0(q1 q1Var) {
    }

    @Override
    public void M0(Object obj) {
    }

    @Override
    public void N(q1 q1Var) {
    }

    @Override
    public void P(ij ijVar) {
    }

    @Override
    public void P0(q1 q1Var) {
    }

    @Override
    public void Q0(q1 q1Var) {
    }

    @Override
    public void U1(q1 q1Var) {
    }

    @Override
    public void V(q1 q1Var) {
    }

    @Override
    public void Y0(TLRPC.User user) {
    }

    @Override
    public void c2(q1 q1Var) {
    }

    @Override
    public void d0(int i7) {
    }

    @Override
    public void i0(q1 q1Var) {
    }

    @Override
    public void m0(String str) {
    }

    @Override
    public void o(q1 q1Var) {
    }

    @Override
    public void r(q1 q1Var) {
    }

    @Override
    public void r1(q1 q1Var) {
    }

    @Override
    public void v(q1 q1Var) {
    }

    @Override
    public void x(q1 q1Var) {
    }

    @Override
    public void y0(q1 q1Var) {
    }

    @Override
    public void y1(q1 q1Var) {
    }

    @Override
    public void z(q1 q1Var) {
    }

    @Override
    public void G(q1 q1Var, o2 o2Var) {
    }

    @Override
    public void H1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void K1(q1 q1Var, o10 o10Var) {
    }

    @Override
    public void L0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void P1(String str, String str2) {
    }

    @Override
    public void W1(q1 q1Var, long j3) {
    }

    @Override
    public void b1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void g1(q1 q1Var, int i7) {
    }

    @Override
    public void s1(q1 q1Var, boolean z9) {
    }

    @Override
    public void v1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void x1(q1 q1Var, int i7) {
    }

    @Override
    public void A0(q1 q1Var, TLObject tLObject, boolean z9) {
    }

    @Override
    public void B0(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void E0(q1 q1Var, boolean z9, boolean z10) {
    }

    @Override
    public void K(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public void N0(q1 q1Var, CharacterStyle characterStyle, boolean z9) {
    }

    @Override
    public void b(k0 k0Var, f3.q qVar, g0 g0Var) {
    }

    @Override
    public void g0(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void j1(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void j2(q1 q1Var, int i7, int i10) {
    }

    @Override
    public void p0(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void q1(q1 q1Var, boolean z9, boolean z10) {
    }

    @Override
    public void I1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void n(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override
    public void s0(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void u0(q1 q1Var, float f10, float f11, boolean z9) {
    }

    @Override
    public void R1(q1 q1Var, int i7, float f10, float f11, boolean z9) {
    }

    @Override
    public void f2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
    }

    @Override
    public void j(q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override
    public void U(q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z9) {
    }

    @Override
    public void M1(ArrayList arrayList, CharSequence charSequence, boolean z9, int i7, int i10, long j3, boolean z10, long j10) {
    }

    @Override
    public void D1(ij ijVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}
