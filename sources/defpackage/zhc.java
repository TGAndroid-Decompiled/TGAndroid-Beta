package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.PowerManager;
import android.os.RemoteException;
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
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicLong;
public final class zhc implements nr7, reb, s84, s99, ydd, m34, OnCompleteListener, und, q9d, Continuation {
    public final byte a;
    public Object b;
    public Object c;

    public zhc(byte b) {
        this.a = b;
        switch (b) {
            case 4:
                this.b = DesugarCollections.synchronizedMap(new WeakHashMap());
                this.c = DesugarCollections.synchronizedMap(new WeakHashMap());
                return;
            case 9:
                this.b = new HashMap();
                this.c = new HashMap();
                return;
            default:
                this.b = new ey7();
                this.c = new kzc();
                return;
        }
    }

    private final void c(java.lang.Object r50, java.lang.Object r51) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zhc.c(java.lang.Object, java.lang.Object):void");
    }

    @Override
    public final l2d S(View view, l2d l2dVar) {
        fic ficVar = (fic) this.c;
        l2d i = ihc.i(view, l2dVar);
        if (i.a.n()) {
            return i;
        }
        Rect rect = (Rect) this.b;
        rect.left = i.b();
        rect.top = i.d();
        rect.right = i.c();
        rect.bottom = i.a();
        int childCount = ficVar.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            l2d b = ihc.b(ficVar.getChildAt(i2), i);
            rect.left = Math.min(b.b(), rect.left);
            rect.top = Math.min(b.d(), rect.top);
            rect.right = Math.min(b.c(), rect.right);
            rect.bottom = Math.min(b.a(), rect.bottom);
        }
        return i.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override
    public final m34 a(Class cls, zq7 zq7Var) {
        ((HashMap) this.b).put(cls, zq7Var);
        ((HashMap) this.c).remove(cls);
        return this;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        boolean z = false;
        switch (this.a) {
            case 6:
                q7d q7dVar = new q7d((qa4) this.b, (TaskCompletionSource) obj2, (byte) 0);
                h7d h7dVar = (h7d) ((e8d) obj).k();
                Parcel c = h7dVar.c();
                v6d.c(c, q7dVar);
                v6d.b(c, (fo) this.c);
                h7dVar.d(c, 1);
                return;
            case 10:
                c(obj, obj2);
                return;
            default:
                rjd rjdVar = (rjd) this.b;
                String str = (String) this.c;
                bmf bmfVar = (bmf) obj;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                if (rjdVar.G == 2) {
                    z = true;
                }
                xve.j("Not connected to device", z);
                qbd qbdVar = (qbd) bmfVar.k();
                Parcel R = qbdVar.R();
                R.writeString(str);
                qbdVar.W(R, 5);
                synchronized (rjdVar.t) {
                    if (rjdVar.q != null) {
                        taskCompletionSource.setException(sqd.a(new Status(2001, null, null, null)));
                        return;
                    } else {
                        rjdVar.q = taskCompletionSource;
                        return;
                    }
                }
        }
    }

    @Override
    public final void b(Bitmap bitmap) {
        k7b k7bVar = (k7b) this.b;
        k7bVar.c = bitmap;
        t9f t9fVar = (t9f) this.c;
        t9fVar.l = k7bVar;
        t9fVar.b();
    }

    @Override
    public final void b0(String str, long j, int i, kdd kddVar, long j2, long j3) {
        ((rdd) this.c).g = null;
        ydd yddVar = (ydd) this.b;
        if (yddVar != null) {
            yddVar.b0(str, j, i, kddVar, j2, j3);
        }
    }

    public final synchronized void d(boolean z, boolean z2) {
        boolean z3 = false;
        if (z) {
            if (((PowerManager.WakeLock) this.c) == null) {
                if (((Context) this.b).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                    efd.f("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                    return;
                }
                PowerManager powerManager = (PowerManager) ((Context) this.b).getSystemService("power");
                if (powerManager == null) {
                    efd.f("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
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

    public final int e(Context context, d05 d05Var) {
        xve.h(context);
        xve.h(d05Var);
        int i = 0;
        if (!d05Var.v()) {
            return 0;
        }
        int i2 = d05Var.i();
        int f = f(i2);
        if (f != -1) {
            return f;
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
                i = ((j05) this.c).c(context, i2);
            }
            sparseIntArray.put(i2, i);
        }
        return i;
    }

    public final int f(int i) {
        int i2;
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        synchronized (sparseIntArray) {
            i2 = sparseIntArray.get(i, -1);
        }
        return i2;
    }

    public final void g(Status status, boolean z) {
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
                ((TaskCompletionSource) entry2.getKey()).trySetException(new ao(status));
            }
        }
    }

    public final void h(wle wleVar) {
        try {
            q(wleVar, (cqe) this.b);
        } catch (Throwable th) {
            old.i("BillingLogger", "Unable to log.", th);
        }
    }

    public final void i(wle wleVar, int i, long j) {
        try {
            rpe rpeVar = (rpe) ((cqe) this.b).g();
            rpeVar.b();
            cqe.p((cqe) rpeVar.b, i);
            cqe cqeVar = (cqe) rpeVar.a();
            this.b = cqeVar;
            if (j != 0) {
                rpe rpeVar2 = (rpe) cqeVar.g();
                rpeVar2.b();
                cqe.r((cqe) rpeVar2.b, j);
                cqeVar = (cqe) rpeVar2.a();
            }
            q(wleVar, cqeVar);
        } catch (Throwable th) {
            old.i("BillingLogger", "Unable to log.", th);
        }
    }

    @Override
    public final heb j(int i, int i2, byte[] bArr) {
        return uh9.c(this, bArr, i2);
    }

    public final void k(wle wleVar, long j, boolean z) {
        try {
            kle kleVar = (kle) wleVar.g();
            wre wreVar = (wre) wleVar.o().g();
            wreVar.b();
            wse.n((wse) wreVar.b, z);
            kleVar.b();
            wle.r((wle) kleVar.b, (wse) wreVar.a());
            wle wleVar2 = (wle) kleVar.a();
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            cqe cqeVar = (cqe) this.b;
            if (i != 0) {
                rpe rpeVar = (rpe) cqeVar.g();
                rpeVar.b();
                cqe.r((cqe) rpeVar.b, j);
                cqeVar = (cqe) rpeVar.a();
            }
            q(wleVar2, cqeVar);
        } catch (Throwable th) {
            old.i("BillingLogger", "Unable to log.", th);
        }
    }

    @Override
    public final void l(byte[] r19, int r20, int r21, defpackage.qeb r22, defpackage.ot2 r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zhc.l(byte[], int, int, qeb, ot2):void");
    }

    public final void m(wle wleVar, int i, long j, boolean z) {
        try {
            rpe rpeVar = (rpe) ((cqe) this.b).g();
            rpeVar.b();
            cqe.p((cqe) rpeVar.b, i);
            this.b = (cqe) rpeVar.a();
            kle kleVar = (kle) wleVar.g();
            wre wreVar = (wre) wleVar.o().g();
            wreVar.b();
            wse.n((wse) wreVar.b, z);
            kleVar.b();
            wle.r((wle) kleVar.b, (wse) wreVar.a());
            wle wleVar2 = (wle) kleVar.a();
            int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            cqe cqeVar = (cqe) this.b;
            if (i2 != 0) {
                rpe rpeVar2 = (rpe) cqeVar.g();
                rpeVar2.b();
                cqe.r((cqe) rpeVar2.b, j);
                cqeVar = (cqe) rpeVar2.a();
            }
            q(wleVar2, cqeVar);
        } catch (Throwable th) {
            old.i("BillingLogger", "Unable to log.", th);
        }
    }

    public final void n(moe moeVar) {
        try {
            bte t = kte.t();
            t.c((cqe) this.b);
            t.b();
            kte.p((kte) t.b, moeVar);
            ((n31) this.c).p((kte) t.a());
        } catch (Throwable th) {
            old.i("BillingLogger", "Unable to log.", th);
        }
    }

    public final void o(que queVar) {
        try {
            bte t = kte.t();
            t.c((cqe) this.b);
            t.b();
            kte.r((kte) t.b, queVar);
            ((n31) this.c).p((kte) t.a());
        } catch (Throwable th) {
            old.i("BillingLogger", "Unable to log.", th);
        }
    }

    @Override
    public final void onComplete(Task task) {
        boolean z;
        boolean z2;
        ld1 ld1Var;
        boolean z3;
        String str;
        hhd hhdVar = (hhd) this.b;
        ld1 ld1Var2 = (ld1) this.c;
        lw6 lw6Var = hhdVar.b;
        he6 he6Var = hhd.i;
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
            he6Var.b("The module-to-client output switcher flag %s", str);
            if (z3) {
                z = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                Log.i(he6Var.a, he6Var.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z), Boolean.valueOf(ld1Var2.y)));
                if (!z && ld1Var2.y) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (lw6Var == null && (ld1Var = hhdVar.c) != null) {
                    boolean z4 = ld1Var.w;
                    boolean z5 = ld1Var.s;
                    mw6 mw6Var = new mw6();
                    if (Build.VERSION.SDK_INT >= 30) {
                        mw6Var.b = z2;
                        mw6Var.d = z4;
                        mw6Var.c = z5;
                    }
                    lw6.i(new nw6(mw6Var));
                    Log.i(he6Var.a, he6Var.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(hhdVar.f), Boolean.valueOf(z2), Boolean.valueOf(z4), Boolean.valueOf(z5)));
                    if (z4) {
                        pid pidVar = hhdVar.e;
                        xve.h(pidVar);
                        ogd ogdVar = new ogd(pidVar);
                        lw6.b();
                        lw6.c().f = ogdVar;
                        z9f.a(b6f.CAST_TRANSFER_TO_LOCAL_ENABLED);
                        return;
                    }
                    return;
                }
            }
        }
        z = true;
        Log.i(he6Var.a, he6Var.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z), Boolean.valueOf(ld1Var2.y)));
        if (!z) {
        }
        z2 = false;
        if (lw6Var == null) {
        }
    }

    public final void p(fve fveVar) {
        if (fveVar == null) {
            return;
        }
        try {
            bte t = kte.t();
            t.c((cqe) this.b);
            t.b();
            kte.s((kte) t.b, fveVar);
            ((n31) this.c).p((kte) t.a());
        } catch (Throwable th) {
            old.i("BillingLogger", "Unable to log.", th);
        }
    }

    public final void q(wle wleVar, cqe cqeVar) {
        if (wleVar == null) {
            return;
        }
        try {
            bte t = kte.t();
            t.c(cqeVar);
            t.b();
            kte.n((kte) t.b, wleVar);
            ((n31) this.c).p((kte) t.a());
        } catch (Throwable th) {
            old.i("BillingLogger", "Unable to log.", th);
        }
    }

    public final void r(wme wmeVar, cqe cqeVar) {
        try {
            bte t = kte.t();
            t.c(cqeVar);
            t.b();
            kte.o((kte) t.b, wmeVar);
            ((n31) this.c).p((kte) t.a());
        } catch (Throwable th) {
            old.i("BillingLogger", "Unable to log.", th);
        }
    }

    @Override
    public final int s() {
        return 1;
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        v2d v2dVar = (v2d) this.c;
        v2dVar.c.a(f);
        v2dVar.d.a(f);
        v2dVar.b.a(f);
        ((Runnable) this.b).run();
    }

    @Override
    public final void t0(String str, long j, long j2, long j3) {
        ydd yddVar = (ydd) this.b;
        if (yddVar != null) {
            yddVar.t0(str, j, j2, j3);
        }
    }

    @Override
    public final Object then(Task task) {
        up9 up9Var = (up9) this.b;
        Bundle bundle = (Bundle) this.c;
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        if (bundle2 != null && bundle2.containsKey("google.messenger")) {
            return up9Var.d(bundle).onSuccessTask(no3.d, xad.a);
        }
        return task;
    }

    @Override
    public final void v0(float r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zhc.v0(float, int):void");
    }

    @Override
    public final void reset() {
    }

    public zhc(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public zhc(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public zhc(Context context, cqe cqeVar) {
        this.a = (byte) 13;
        n31 n31Var = new n31((byte) 12);
        try {
            h5c.b(context);
            n31Var.c = h5c.a().c(q51.e).a("PLAY_BILLING_LIBRARY", new n34("proto"), new Object());
        } catch (Throwable unused) {
            n31Var.b = true;
        }
        this.c = n31Var;
        this.b = cqeVar;
    }

    public zhc(IBinder iBinder) {
        this.a = (byte) 20;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.b = new Messenger(iBinder);
            this.c = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.c = new yrd(iBinder);
            this.b = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public zhc(htd htdVar) {
        this.a = (byte) 18;
        this.c = new Object();
        this.b = htdVar;
        z6f.O3();
    }

    public zhc(j05 j05Var) {
        this.a = (byte) 5;
        this.b = new SparseIntArray();
        xve.h(j05Var);
        this.c = j05Var;
    }

    public zhc(byte b, boolean z) {
        this.a = b;
    }

    public zhc(Context context, byte b) {
        this.a = b;
        switch (b) {
            case 21:
                this.c = new AtomicLong(-1L);
                this.b = new h05(context, qa4.o, new jkb("mlkit:vision"), g05.c);
                return;
            default:
                this.b = context;
                return;
        }
    }

    public zhc(fic ficVar) {
        this.a = (byte) 0;
        this.c = ficVar;
        this.b = new Rect();
    }
}
