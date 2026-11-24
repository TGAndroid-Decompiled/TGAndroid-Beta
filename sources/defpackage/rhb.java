package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.PowerManager;
import android.os.RemoteException;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class rhb implements mc2, qq7, vcb, g94, h89, hbd, c44, OnCompleteListener, fld, z6d, Continuation {
    public final byte a;
    public Object b;
    public Object c;

    public rhb(byte b) {
        this.a = b;
        switch (b) {
            case 6:
                this.b = DesugarCollections.synchronizedMap(new WeakHashMap());
                this.c = DesugarCollections.synchronizedMap(new WeakHashMap());
                return;
            case 11:
                this.b = new HashMap();
                this.c = new HashMap();
                return;
            default:
                this.b = new yw7();
                this.c = new vwc();
                return;
        }
    }

    private final void e(java.lang.Object r50, java.lang.Object r51) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rhb.e(java.lang.Object, java.lang.Object):void");
    }

    @Override
    public final boolean A0(long j) {
        return ((xhb) this.c).w;
    }

    public final void B(xle xleVar) {
        try {
            nqe t = wqe.t();
            t.c((nne) this.b);
            t.b();
            wqe.p((wqe) t.b, xleVar);
            ((m41) this.c).p((wqe) t.a());
        } catch (Throwable th) {
            yid.i("BillingLogger", "Unable to log.", th);
        }
    }

    public final void C(cse cseVar) {
        try {
            nqe t = wqe.t();
            t.c((nne) this.b);
            t.b();
            wqe.r((wqe) t.b, cseVar);
            ((m41) this.c).p((wqe) t.a());
        } catch (Throwable th) {
            yid.i("BillingLogger", "Unable to log.", th);
        }
    }

    @Override
    public final wzc C0(View view, wzc wzcVar) {
        ggc ggcVar = (ggc) this.c;
        wzc h = kfc.h(view, wzcVar);
        if (h.a.n()) {
            return h;
        }
        Rect rect = (Rect) this.b;
        rect.left = h.b();
        rect.top = h.d();
        rect.right = h.c();
        rect.bottom = h.a();
        int childCount = ggcVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            wzc b = kfc.b(ggcVar.getChildAt(i), h);
            rect.left = Math.min(b.b(), rect.left);
            rect.top = Math.min(b.d(), rect.top);
            rect.right = Math.min(b.c(), rect.right);
            rect.bottom = Math.min(b.a(), rect.bottom);
        }
        return h.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        g0d g0dVar = (g0d) this.c;
        g0dVar.c.a(f);
        g0dVar.d.a(f);
        g0dVar.b.a(f);
        ((Runnable) this.b).run();
    }

    @Override
    public final boolean D1(gn gnVar) {
        return false;
    }

    @Override
    public final boolean E(rc2 rc2Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    public final void I(rse rseVar) {
        if (rseVar == null) {
            return;
        }
        try {
            nqe t = wqe.t();
            t.c((nne) this.b);
            t.b();
            wqe.s((wqe) t.b, rseVar);
            ((m41) this.c).p((wqe) t.a());
        } catch (Throwable th) {
            yid.i("BillingLogger", "Unable to log.", th);
        }
    }

    public final void J(gje gjeVar, nne nneVar) {
        if (gjeVar == null) {
            return;
        }
        try {
            nqe t = wqe.t();
            t.c(nneVar);
            t.b();
            wqe.n((wqe) t.b, gjeVar);
            ((m41) this.c).p((wqe) t.a());
        } catch (Throwable th) {
            yid.i("BillingLogger", "Unable to log.", th);
        }
    }

    @Override
    public final boolean J0(rc2 rc2Var, TLRPC.TodoItem todoItem, boolean z) {
        return false;
    }

    @Override
    public final boolean K() {
        return false;
    }

    public final void L(gke gkeVar, nne nneVar) {
        try {
            nqe t = wqe.t();
            t.c(nneVar);
            t.b();
            wqe.o((wqe) t.b, gkeVar);
            ((m41) this.c).p((wqe) t.a());
        } catch (Throwable th) {
            yid.i("BillingLogger", "Unable to log.", th);
        }
    }

    @Override
    public final pc8 M1() {
        return null;
    }

    @Override
    public final boolean N() {
        return false;
    }

    @Override
    public final int O() {
        return 0;
    }

    @Override
    public final boolean O1(long j) {
        return ((xhb) this.c).s;
    }

    @Override
    public final String P0(rc2 rc2Var) {
        return null;
    }

    @Override
    public final int Q(rc2 rc2Var) {
        return 0;
    }

    @Override
    public final hw1 S() {
        return null;
    }

    @Override
    public final boolean S0(rc2 rc2Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final boolean U1(k47 k47Var) {
        return true;
    }

    @Override
    public final void V(float r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rhb.V(float, int):void");
    }

    @Override
    public final boolean Y1(rc2 rc2Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final boolean Z() {
        return false;
    }

    @Override
    public final boolean Z1(rc2 rc2Var) {
        return false;
    }

    @Override
    public final c44 a(Class cls, cq7 cq7Var) {
        ((HashMap) this.b).put(cls, cq7Var);
        ((HashMap) this.c).remove(cls);
        return this;
    }

    @Override
    public final CharacterStyle a0(rc2 rc2Var) {
        return null;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        boolean z = false;
        switch (this.a) {
            case 8:
                b5d b5dVar = new b5d((ua4) this.b, (TaskCompletionSource) obj2, (byte) 0);
                s4d s4dVar = (s4d) ((p5d) obj).k();
                Parcel c = s4dVar.c();
                g4d.c(c, b5dVar);
                g4d.b(c, (ep) this.c);
                s4dVar.d(c, 1);
                return;
            case 12:
                e(obj, obj2);
                return;
            default:
                bhd bhdVar = (bhd) this.b;
                String str = (String) this.c;
                mjf mjfVar = (mjf) obj;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                if (bhdVar.G == 2) {
                    z = true;
                }
                ite.j("Not connected to device", z);
                z8d z8dVar = (z8d) mjfVar.k();
                Parcel R = z8dVar.R();
                R.writeString(str);
                z8dVar.W(R, 5);
                synchronized (bhdVar.t) {
                    if (bhdVar.q != null) {
                        taskCompletionSource.setException(dod.a(new Status(2001, null, null, null)));
                        return;
                    } else {
                        bhdVar.q = taskCompletionSource;
                        return;
                    }
                }
        }
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final void c0(String str, long j, int i, tad tadVar, long j2, long j3) {
        ((abd) this.c).g = null;
        hbd hbdVar = (hbd) this.b;
        if (hbdVar != null) {
            hbdVar.c0(str, j, i, tadVar, j2, j3);
        }
    }

    @Override
    public final void d(Bitmap bitmap) {
        xab xabVar = (xab) this.b;
        xabVar.c = bitmap;
        e7f e7fVar = (e7f) this.c;
        e7fVar.l = xabVar;
        e7fVar.b();
    }

    @Override
    public final boolean d0() {
        return false;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final lcb g(int i, int i2, byte[] bArr) {
        return hg9.c(this, bArr, i2);
    }

    public final View h(int i, int i2, int i3, int i4) {
        int i5;
        vec vecVar = (vec) this.c;
        wec wecVar = (wec) this.b;
        int E = wecVar.E();
        int N = wecVar.N();
        if (i2 > i) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        View view = null;
        while (i != i2) {
            View Y = wecVar.Y(i);
            int A = wecVar.A(Y);
            int a0 = wecVar.a0(Y);
            vecVar.b = E;
            vecVar.c = N;
            vecVar.d = A;
            vecVar.e = a0;
            if (i3 != 0) {
                vecVar.a = i3;
                if (vecVar.a()) {
                    return Y;
                }
            }
            if (i4 != 0) {
                vecVar.a = i4;
                if (vecVar.a()) {
                    view = Y;
                }
            }
            i += i5;
        }
        return view;
    }

    public final boolean j(View view) {
        vec vecVar = (vec) this.c;
        wec wecVar = (wec) this.b;
        int E = wecVar.E();
        int N = wecVar.N();
        int A = wecVar.A(view);
        int a0 = wecVar.a0(view);
        vecVar.b = E;
        vecVar.c = N;
        vecVar.d = A;
        vecVar.e = a0;
        vecVar.a = 24579;
        return vecVar.a();
    }

    public final synchronized void l(boolean z, boolean z2) {
        boolean z3 = false;
        if (z) {
            if (((PowerManager.WakeLock) this.c) == null) {
                if (((Context) this.b).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                    ncd.f("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                    return;
                }
                PowerManager powerManager = (PowerManager) ((Context) this.b).getSystemService("power");
                if (powerManager == null) {
                    ncd.f("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                    return;
                }
                PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.c = newWakeLock;
                newWakeLock.setReferenceCounted(false);
            }
        }
        PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.c;
        if (wakeLock == null) {
            return;
        }
        if (z && z2) {
            z3 = true;
        }
        if (z3) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    @Override
    public final boolean l0(rc2 rc2Var, boolean z) {
        return false;
    }

    @Override
    public final boolean l1() {
        return false;
    }

    @Override
    public final boolean m1(k47 k47Var) {
        return aq1.a(k47Var);
    }

    @Override
    public final boolean m2(int i) {
        return false;
    }

    public final int n(Context context, zz4 zz4Var) {
        ite.h(context);
        ite.h(zz4Var);
        int i = 0;
        if (!zz4Var.v()) {
            return 0;
        }
        int i2 = zz4Var.i();
        int o = o(i2);
        if (o != -1) {
            return o;
        }
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        synchronized (sparseIntArray) {
            int i3 = 0;
            while (true) {
                if (i3 < sparseIntArray.size()) {
                    int keyAt = sparseIntArray.keyAt(i3);
                    if (keyAt > i2 && sparseIntArray.get(keyAt) == 0) {
                        break;
                    }
                    i3++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i == -1) {
                i = ((e05) this.c).c(context, i2);
            }
            sparseIntArray.put(i2, i);
        }
        return i;
    }

    @Override
    public final boolean n1(rc2 rc2Var, int i) {
        return false;
    }

    @Override
    public final boolean n2(rc2 rc2Var, k47 k47Var) {
        return false;
    }

    public final int o(int i) {
        int i2;
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        synchronized (sparseIntArray) {
            i2 = sparseIntArray.get(i, -1);
        }
        return i2;
    }

    @Override
    public final void onComplete(Task task) {
        boolean z;
        boolean z2;
        le1 le1Var;
        boolean z3;
        String str;
        qed qedVar = (qed) this.b;
        le1 le1Var2 = (le1) this.c;
        gw6 gw6Var = qedVar.b;
        ce6 ce6Var = qed.i;
        if (task.isSuccessful()) {
            Bundle bundle = (Bundle) task.getResult();
            if (bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED")) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (true != z3) {
                str = "not existed";
            } else {
                str = "existed";
            }
            ce6Var.b("The module-to-client output switcher flag %s", str);
            if (z3) {
                z = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                Log.i(ce6Var.a, ce6Var.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z), Boolean.valueOf(le1Var2.y)));
                if (!z && le1Var2.y) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (gw6Var == null && (le1Var = qedVar.c) != null) {
                    boolean z4 = le1Var.w;
                    boolean z5 = le1Var.s;
                    hw6 hw6Var = new hw6();
                    if (Build.VERSION.SDK_INT >= 30) {
                        hw6Var.b = z2;
                        hw6Var.d = z4;
                        hw6Var.c = z5;
                    }
                    gw6.i(new iw6(hw6Var));
                    Log.i(ce6Var.a, ce6Var.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(qedVar.f), Boolean.valueOf(z2), Boolean.valueOf(z4), Boolean.valueOf(z5)));
                    if (z4) {
                        zfd zfdVar = qedVar.e;
                        ite.h(zfdVar);
                        xdd xddVar = new xdd(zfdVar);
                        gw6.b();
                        gw6.c().f = xddVar;
                        k7f.a(m3f.CAST_TRANSFER_TO_LOCAL_ENABLED);
                        return;
                    }
                    return;
                }
            }
        }
        z = true;
        Log.i(ce6Var.a, ce6Var.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z), Boolean.valueOf(le1Var2.y)));
        if (!z) {
        }
        z2 = false;
        if (gw6Var == null) {
        }
    }

    @Override
    public final void p(byte[] r19, int r20, int r21, defpackage.ucb r22, defpackage.fu2 r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rhb.p(byte[], int, int, ucb, fu2):void");
    }

    @Override
    public final boolean p0(rc2 rc2Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final hkb p2() {
        return null;
    }

    @Override
    public final int r() {
        return 1;
    }

    public final void s(Status status, boolean z) {
        HashMap hashMap;
        HashMap hashMap2;
        Map map = (Map) this.b;
        synchronized (map) {
            hashMap = new HashMap(map);
        }
        Map map2 = (Map) this.c;
        synchronized (map2) {
            hashMap2 = new HashMap(map2);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).e(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new ap(status));
            }
        }
    }

    @Override
    public final String t(long j) {
        String trim = ((EditTextBoldCursor) this.b).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (!((xhb) this.c).s && TextUtils.isEmpty(trim)) {
            return null;
        }
        return trim;
    }

    @Override
    public final boolean t0(rc2 rc2Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final Object then(Task task) {
        fo9 fo9Var = (fo9) this.b;
        Bundle bundle = (Bundle) this.c;
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        if (bundle2 != null && bundle2.containsKey("google.messenger")) {
            return fo9Var.d(bundle).onSuccessTask(gp3.d, g8d.a);
        }
        return task;
    }

    @Override
    public final void u0(String str, long j, long j2, long j3) {
        hbd hbdVar = (hbd) this.b;
        if (hbdVar != null) {
            hbdVar.u0(str, j, j2, j3);
        }
    }

    public final void v(gje gjeVar) {
        try {
            J(gjeVar, (nne) this.b);
        } catch (Throwable th) {
            yid.i("BillingLogger", "Unable to log.", th);
        }
    }

    public final void w(gje gjeVar, int i, long j) {
        try {
            cne cneVar = (cne) ((nne) this.b).g();
            cneVar.b();
            nne.p((nne) cneVar.b, i);
            nne nneVar = (nne) cneVar.a();
            this.b = nneVar;
            if (j != 0) {
                cne cneVar2 = (cne) nneVar.g();
                cneVar2.b();
                nne.r((nne) cneVar2.b, j);
                nneVar = (nne) cneVar2.a();
            }
            J(gjeVar, nneVar);
        } catch (Throwable th) {
            yid.i("BillingLogger", "Unable to log.", th);
        }
    }

    public final void x(gje gjeVar, long j, boolean z) {
        try {
            uie uieVar = (uie) gjeVar.g();
            ipe ipeVar = (ipe) gjeVar.o().g();
            ipeVar.b();
            hqe.n((hqe) ipeVar.b, z);
            uieVar.b();
            gje.r((gje) uieVar.b, (hqe) ipeVar.a());
            gje gjeVar2 = (gje) uieVar.a();
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            nne nneVar = (nne) this.b;
            if (i != 0) {
                cne cneVar = (cne) nneVar.g();
                cneVar.b();
                nne.r((nne) cneVar.b, j);
                nneVar = (nne) cneVar.a();
            }
            J(gjeVar2, nneVar);
        } catch (Throwable th) {
            yid.i("BillingLogger", "Unable to log.", th);
        }
    }

    @Override
    public final boolean x0(rc2 rc2Var) {
        return false;
    }

    @Override
    public final void x1(rc2 rc2Var, TLRPC.WebPage webPage, String str, boolean z) {
        l11.u(rc2Var.getContext(), str);
    }

    public final void y(gje gjeVar, int i, long j, boolean z) {
        try {
            cne cneVar = (cne) ((nne) this.b).g();
            cneVar.b();
            nne.p((nne) cneVar.b, i);
            this.b = (nne) cneVar.a();
            uie uieVar = (uie) gjeVar.g();
            ipe ipeVar = (ipe) gjeVar.o().g();
            ipeVar.b();
            hqe.n((hqe) ipeVar.b, z);
            uieVar.b();
            gje.r((gje) uieVar.b, (hqe) ipeVar.a());
            gje gjeVar2 = (gje) uieVar.a();
            int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            nne nneVar = (nne) this.b;
            if (i2 != 0) {
                cne cneVar2 = (cne) nneVar.g();
                cneVar2.b();
                nne.r((nne) cneVar2.b, j);
                nneVar = (nne) cneVar2.a();
            }
            J(gjeVar2, nneVar);
        } catch (Throwable th) {
            yid.i("BillingLogger", "Unable to log.", th);
        }
    }

    @Override
    public final boolean z1() {
        return false;
    }

    @Override
    public final void C1() {
    }

    @Override
    public final void T0() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void g2() {
    }

    @Override
    public final void i() {
    }

    @Override
    public final void o2() {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void reset() {
    }

    @Override
    public final void s0() {
    }

    @Override
    public final void A(rc2 rc2Var) {
    }

    @Override
    public final void F0(rc2 rc2Var) {
    }

    @Override
    public final void G(rc2 rc2Var) {
    }

    @Override
    public final void J1(rc2 rc2Var) {
    }

    @Override
    public final void L1(rc2 rc2Var) {
    }

    @Override
    public final void M0(rc2 rc2Var) {
    }

    @Override
    public final void P(rc2 rc2Var) {
    }

    @Override
    public final void Q0(rc2 rc2Var) {
    }

    @Override
    public final void Q1(rc2 rc2Var) {
    }

    @Override
    public final void R(rc2 rc2Var) {
    }

    @Override
    public final void T(k47 k47Var) {
    }

    @Override
    public final void U0(rc2 rc2Var) {
    }

    @Override
    public final void X0(rc2 rc2Var) {
    }

    @Override
    public final void Y(int i) {
    }

    @Override
    public final void Z0(rc2 rc2Var) {
    }

    @Override
    public final void e0(k47 k47Var) {
    }

    @Override
    public final void h0(String str) {
    }

    @Override
    public final void i2(rc2 rc2Var) {
    }

    @Override
    public final void k(rc2 rc2Var) {
    }

    @Override
    public final void k0(rc2 rc2Var) {
    }

    @Override
    public final void k1(rc2 rc2Var) {
    }

    @Override
    public final void q1(h47 h47Var) {
    }

    @Override
    public final void q2(rc2 rc2Var) {
    }

    @Override
    public final void y1(rc2 rc2Var) {
    }

    @Override
    public final void B1(rc2 rc2Var, ir0 ir0Var) {
    }

    @Override
    public final void D0(rc2 rc2Var, boolean z) {
    }

    @Override
    public final void L0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void N1(String str, String str2) {
    }

    @Override
    public final void P1(rc2 rc2Var, n28 n28Var) {
    }

    @Override
    public final void U(rc2 rc2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void X1(rc2 rc2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void i0(rc2 rc2Var, int i) {
    }

    @Override
    public final void m0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void o1(rc2 rc2Var, boolean z) {
    }

    @Override
    public final void t1(rc2 rc2Var, int i) {
    }

    @Override
    public final void v0(rc2 rc2Var, long j) {
    }

    public rhb(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public rhb(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public rhb(Context context, nne nneVar) {
        this.a = (byte) 15;
        m41 m41Var = new m41((byte) 12);
        try {
            i3c.b(context);
            m41Var.c = i3c.a().c(p61.e).a("PLAY_BILLING_LIBRARY", new d44("proto"), new Object());
        } catch (Throwable unused) {
            m41Var.b = true;
        }
        this.c = m41Var;
        this.b = nneVar;
    }

    @Override
    public final void F(rc2 rc2Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public final void I1(rc2 rc2Var, TLObject tLObject, boolean z) {
    }

    @Override
    public final void M(rc2 rc2Var, CharacterStyle characterStyle, boolean z) {
    }

    @Override
    public final void N0(rc2 rc2Var, float f, float f2) {
    }

    @Override
    public final void d2(rc2 rc2Var, float f, float f2) {
    }

    @Override
    public final void i1(rc2 rc2Var, float f, float f2) {
    }

    @Override
    public final void l2(rc2 rc2Var, boolean z, boolean z2) {
    }

    @Override
    public final void o0(rc2 rc2Var, int i, int i2) {
    }

    @Override
    public final void u(rc2 rc2Var, float f, float f2) {
    }

    @Override
    public final void u1(rc2 rc2Var, boolean z, boolean z2) {
    }

    public rhb(IBinder iBinder) {
        this.a = (byte) 22;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.b = new Messenger(iBinder);
            this.c = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.c = new kpd(iBinder);
            this.b = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public rhb(uqd uqdVar) {
        this.a = (byte) 20;
        this.c = new Object();
        this.b = uqdVar;
        k4f.O3();
    }

    public rhb(e05 e05Var) {
        this.a = (byte) 7;
        this.b = new SparseIntArray();
        ite.h(e05Var);
        this.c = e05Var;
    }

    public rhb(byte b, boolean z) {
        this.a = b;
    }

    public rhb(wec wecVar) {
        this.a = (byte) 1;
        this.b = wecVar;
        ?? obj = new Object();
        obj.a = 0;
        this.c = obj;
    }

    public rhb(Context context, byte b) {
        this.a = b;
        switch (b) {
            case 23:
                this.c = new AtomicLong(-1L);
                this.b = new c05(context, ua4.o, new oib("mlkit:vision"), b05.c);
                return;
            default:
                this.b = context;
                return;
        }
    }

    public rhb(ggc ggcVar) {
        this.a = (byte) 2;
        this.c = ggcVar;
        this.b = new Rect();
    }

    @Override
    public final void W(rc2 rc2Var, TLRPC.User user, float f, float f2) {
    }

    @Override
    public final void m(rc2 rc2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    @Override
    public final void r0(rc2 rc2Var, float f, float f2, boolean z) {
    }

    @Override
    public final void z(rc2 rc2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void H(rc2 rc2Var, int i, float f, float f2, boolean z) {
    }

    @Override
    public final void V0(rc2 rc2Var, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
    }

    @Override
    public final void b1(rc2 rc2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    @Override
    public final void W1(rc2 rc2Var, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
    }

    @Override
    public final void w1(k47 k47Var, String str, String str2, String str3, String str4, int i, int i2) {
    }
}
