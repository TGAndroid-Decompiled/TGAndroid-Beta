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
public final class aec implements no7, uab, x74, f69, f9d, r24, OnCompleteListener, djd, x4d, Continuation {
    public final byte a;
    public Object b;
    public Object c;

    public aec(byte b) {
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
                this.b = new xu7();
                this.c = new uuc();
                return;
        }
    }

    private final void c(java.lang.Object r50, java.lang.Object r51) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aec.c(java.lang.Object, java.lang.Object):void");
    }

    @Override
    public final void D(float r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aec.D(float, int):void");
    }

    @Override
    public final void R(String str, long j, int i, r8d r8dVar, long j2, long j3) {
        ((y8d) this.c).g = null;
        f9d f9dVar = (f9d) this.b;
        if (f9dVar != null) {
            f9dVar.R(str, j, i, r8dVar, j2, j3);
        }
    }

    @Override
    public final vxc W(View view, vxc vxcVar) {
        gec gecVar = (gec) this.c;
        vxc h = jdc.h(view, vxcVar);
        if (h.a.n()) {
            return h;
        }
        Rect rect = (Rect) this.b;
        rect.left = h.b();
        rect.top = h.d();
        rect.right = h.c();
        rect.bottom = h.a();
        int childCount = gecVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            vxc b = jdc.b(gecVar.getChildAt(i), h);
            rect.left = Math.min(b.b(), rect.left);
            rect.top = Math.min(b.d(), rect.top);
            rect.right = Math.min(b.c(), rect.right);
            rect.bottom = Math.min(b.a(), rect.bottom);
        }
        return h.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override
    public final r24 a(Class cls, zn7 zn7Var) {
        ((HashMap) this.b).put(cls, zn7Var);
        ((HashMap) this.c).remove(cls);
        return this;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        boolean z = false;
        switch (this.a) {
            case 6:
                z2d z2dVar = new z2d((u84) this.b, (TaskCompletionSource) obj2, (byte) 0);
                q2d q2dVar = (q2d) ((n3d) obj).k();
                Parcel c = q2dVar.c();
                e2d.c(c, z2dVar);
                e2d.b(c, (eo) this.c);
                q2dVar.d(c, 1);
                return;
            case 10:
                c(obj, obj2);
                return;
            default:
                afd afdVar = (afd) this.b;
                String str = (String) this.c;
                lhf lhfVar = (lhf) obj;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                if (afdVar.G == 2) {
                    z = true;
                }
                fre.j("Not connected to device", z);
                x6d x6dVar = (x6d) lhfVar.k();
                Parcel R = x6dVar.R();
                R.writeString(str);
                x6dVar.W(R, 5);
                synchronized (afdVar.t) {
                    if (afdVar.q != null) {
                        taskCompletionSource.setException(bmd.a(new Status(2001, null, null, null)));
                        return;
                    } else {
                        afdVar.q = taskCompletionSource;
                        return;
                    }
                }
        }
    }

    @Override
    public final void b(Bitmap bitmap) {
        v8b v8bVar = (v8b) this.b;
        v8bVar.c = bitmap;
        c5f c5fVar = (c5f) this.c;
        c5fVar.l = v8bVar;
        c5fVar.b();
    }

    public final synchronized void d(boolean z, boolean z2) {
        boolean z3 = false;
        if (z) {
            if (((PowerManager.WakeLock) this.c) == null) {
                if (((Context) this.b).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                    lad.f("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                    return;
                }
                PowerManager powerManager = (PowerManager) ((Context) this.b).getSystemService("power");
                if (powerManager == null) {
                    lad.f("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
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

    public final int e(Context context, xx4 xx4Var) {
        fre.h(context);
        fre.h(xx4Var);
        int i = 0;
        if (!xx4Var.v()) {
            return 0;
        }
        int i2 = xx4Var.i();
        int g = g(i2);
        if (g != -1) {
            return g;
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
                i = ((dy4) this.c).c(context, i2);
            }
            sparseIntArray.put(i2, i);
        }
        return i;
    }

    @Override
    public final kab f(int i, int i2, byte[] bArr) {
        return de9.c(this, bArr, i2);
    }

    public final int g(int i) {
        int i2;
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        synchronized (sparseIntArray) {
            i2 = sparseIntArray.get(i, -1);
        }
        return i2;
    }

    public final void h(Status status, boolean z) {
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
                ((TaskCompletionSource) entry2.getKey()).trySetException(new zn(status));
            }
        }
    }

    public final void i(fhe fheVar) {
        try {
            s(fheVar, (lle) this.b);
        } catch (Throwable th) {
            xgd.i("BillingLogger", "Unable to log.", th);
        }
    }

    public final void j(fhe fheVar, int i, long j) {
        try {
            ale aleVar = (ale) ((lle) this.b).g();
            aleVar.b();
            lle.p((lle) aleVar.b, i);
            lle lleVar = (lle) aleVar.a();
            this.b = lleVar;
            if (j != 0) {
                ale aleVar2 = (ale) lleVar.g();
                aleVar2.b();
                lle.r((lle) aleVar2.b, j);
                lleVar = (lle) aleVar2.a();
            }
            s(fheVar, lleVar);
        } catch (Throwable th) {
            xgd.i("BillingLogger", "Unable to log.", th);
        }
    }

    @Override
    public final void j0(String str, long j, long j2, long j3) {
        f9d f9dVar = (f9d) this.b;
        if (f9dVar != null) {
            f9dVar.j0(str, j, j2, j3);
        }
    }

    public final void k(fhe fheVar, long j, boolean z) {
        try {
            tge tgeVar = (tge) fheVar.g();
            fne fneVar = (fne) fheVar.o().g();
            fneVar.b();
            eoe.n((eoe) fneVar.b, z);
            tgeVar.b();
            fhe.r((fhe) tgeVar.b, (eoe) fneVar.a());
            fhe fheVar2 = (fhe) tgeVar.a();
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            lle lleVar = (lle) this.b;
            if (i != 0) {
                ale aleVar = (ale) lleVar.g();
                aleVar.b();
                lle.r((lle) aleVar.b, j);
                lleVar = (lle) aleVar.a();
            }
            s(fheVar2, lleVar);
        } catch (Throwable th) {
            xgd.i("BillingLogger", "Unable to log.", th);
        }
    }

    @Override
    public final void l(byte[] r19, int r20, int r21, defpackage.tab r22, defpackage.us2 r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aec.l(byte[], int, int, tab, us2):void");
    }

    public final void m(fhe fheVar, int i, long j, boolean z) {
        try {
            ale aleVar = (ale) ((lle) this.b).g();
            aleVar.b();
            lle.p((lle) aleVar.b, i);
            this.b = (lle) aleVar.a();
            tge tgeVar = (tge) fheVar.g();
            fne fneVar = (fne) fheVar.o().g();
            fneVar.b();
            eoe.n((eoe) fneVar.b, z);
            tgeVar.b();
            fhe.r((fhe) tgeVar.b, (eoe) fneVar.a());
            fhe fheVar2 = (fhe) tgeVar.a();
            int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            lle lleVar = (lle) this.b;
            if (i2 != 0) {
                ale aleVar2 = (ale) lleVar.g();
                aleVar2.b();
                lle.r((lle) aleVar2.b, j);
                lleVar = (lle) aleVar2.a();
            }
            s(fheVar2, lleVar);
        } catch (Throwable th) {
            xgd.i("BillingLogger", "Unable to log.", th);
        }
    }

    public final void n(vje vjeVar) {
        try {
            koe t = toe.t();
            t.c((lle) this.b);
            t.b();
            toe.p((toe) t.b, vjeVar);
            ((e31) this.c).p((toe) t.a());
        } catch (Throwable th) {
            xgd.i("BillingLogger", "Unable to log.", th);
        }
    }

    @Override
    public final int o() {
        return 1;
    }

    @Override
    public final void onComplete(Task task) {
        boolean z;
        boolean z2;
        dd1 dd1Var;
        boolean z3;
        String str;
        ocd ocdVar = (ocd) this.b;
        dd1 dd1Var2 = (dd1) this.c;
        gu6 gu6Var = ocdVar.b;
        dc6 dc6Var = ocd.i;
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
            dc6Var.b("The module-to-client output switcher flag %s", str);
            if (z3) {
                z = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                Log.i(dc6Var.a, dc6Var.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z), Boolean.valueOf(dd1Var2.y)));
                if (!z && dd1Var2.y) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (gu6Var == null && (dd1Var = ocdVar.c) != null) {
                    boolean z4 = dd1Var.w;
                    boolean z5 = dd1Var.s;
                    hu6 hu6Var = new hu6();
                    if (Build.VERSION.SDK_INT >= 30) {
                        hu6Var.b = z2;
                        hu6Var.d = z4;
                        hu6Var.c = z5;
                    }
                    gu6.i(new iu6(hu6Var));
                    Log.i(dc6Var.a, dc6Var.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(ocdVar.f), Boolean.valueOf(z2), Boolean.valueOf(z4), Boolean.valueOf(z5)));
                    if (z4) {
                        ydd yddVar = ocdVar.e;
                        fre.h(yddVar);
                        vbd vbdVar = new vbd(yddVar);
                        gu6.b();
                        gu6.c().f = vbdVar;
                        i5f.a(k1f.CAST_TRANSFER_TO_LOCAL_ENABLED);
                        return;
                    }
                    return;
                }
            }
        }
        z = true;
        Log.i(dc6Var.a, dc6Var.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z), Boolean.valueOf(dd1Var2.y)));
        if (!z) {
        }
        z2 = false;
        if (gu6Var == null) {
        }
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        fyc fycVar = (fyc) this.c;
        fycVar.c.a(f);
        fycVar.d.a(f);
        fycVar.b.a(f);
        ((Runnable) this.b).run();
    }

    public final void q(zpe zpeVar) {
        try {
            koe t = toe.t();
            t.c((lle) this.b);
            t.b();
            toe.r((toe) t.b, zpeVar);
            ((e31) this.c).p((toe) t.a());
        } catch (Throwable th) {
            xgd.i("BillingLogger", "Unable to log.", th);
        }
    }

    public final void r(oqe oqeVar) {
        if (oqeVar == null) {
            return;
        }
        try {
            koe t = toe.t();
            t.c((lle) this.b);
            t.b();
            toe.s((toe) t.b, oqeVar);
            ((e31) this.c).p((toe) t.a());
        } catch (Throwable th) {
            xgd.i("BillingLogger", "Unable to log.", th);
        }
    }

    public final void s(fhe fheVar, lle lleVar) {
        if (fheVar == null) {
            return;
        }
        try {
            koe t = toe.t();
            t.c(lleVar);
            t.b();
            toe.n((toe) t.b, fheVar);
            ((e31) this.c).p((toe) t.a());
        } catch (Throwable th) {
            xgd.i("BillingLogger", "Unable to log.", th);
        }
    }

    public final void t(fie fieVar, lle lleVar) {
        try {
            koe t = toe.t();
            t.c(lleVar);
            t.b();
            toe.o((toe) t.b, fieVar);
            ((e31) this.c).p((toe) t.a());
        } catch (Throwable th) {
            xgd.i("BillingLogger", "Unable to log.", th);
        }
    }

    @Override
    public final Object then(Task task) {
        fm9 fm9Var = (fm9) this.b;
        Bundle bundle = (Bundle) this.c;
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        if (bundle2 != null && bundle2.containsKey("google.messenger")) {
            return fm9Var.d(bundle).onSuccessTask(wn3.d, e6d.a);
        }
        return task;
    }

    @Override
    public final void reset() {
    }

    public aec(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public aec(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public aec(Context context, lle lleVar) {
        this.a = (byte) 13;
        e31 e31Var = new e31((byte) 12);
        try {
            i1c.b(context);
            e31Var.c = i1c.a().c(i51.e).a("PLAY_BILLING_LIBRARY", new s24("proto"), new Object());
        } catch (Throwable unused) {
            e31Var.b = true;
        }
        this.c = e31Var;
        this.b = lleVar;
    }

    public aec(IBinder iBinder) {
        this.a = (byte) 20;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.b = new Messenger(iBinder);
            this.c = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.c = new hnd(iBinder);
            this.b = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public aec(rod rodVar) {
        this.a = (byte) 18;
        this.c = new Object();
        this.b = rodVar;
        i2f.O3();
    }

    public aec(dy4 dy4Var) {
        this.a = (byte) 5;
        this.b = new SparseIntArray();
        fre.h(dy4Var);
        this.c = dy4Var;
    }

    public aec(byte b, boolean z) {
        this.a = b;
    }

    public aec(Context context, byte b) {
        this.a = b;
        switch (b) {
            case 21:
                this.c = new AtomicLong(-1L);
                this.b = new by4(context, u84.o, new ngb("mlkit:vision"), ay4.c);
                return;
            default:
                this.b = context;
                return;
        }
    }

    public aec(gec gecVar) {
        this.a = (byte) 0;
        this.c = gecVar;
        this.b = new Rect();
    }
}
