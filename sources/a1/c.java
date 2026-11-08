package a1;

import a3.n;
import a3.p;
import a8.b8;
import a8.r7;
import aa.o;
import ab.m0;
import ab.o0;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import bi.ad;
import bi.dd;
import bi.e1;
import bi.ea;
import bi.m7;
import bi.mc;
import bi.q1;
import bi.u6;
import bi.y;
import bi.z;
import com.google.android.gms.common.api.h;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import db.m;
import db.q;
import db.r;
import db.t;
import db.u;
import di.g1;
import di.g2;
import di.r0;
import di.s0;
import di.u0;
import e2.m1;
import h2.j;
import h9.f0;
import h9.i0;
import h9.t1;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledFuture;
import k2.i;
import org.telegram.messenger.a20;
import org.telegram.messenger.c20;
import org.telegram.messenger.d1;
import org.telegram.messenger.v10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.dj0;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Wallet.u1;
import org.telegram.ui.gl0;
import v4.l0;
public final class c implements OnSuccessListener, p, Continuation, OnCompleteListener, a20, t4, r1, bg.p, te.b, gl0, j, i, com.google.android.gms.common.api.internal.p, dj0, w10, cj0 {
    public final int f37a;
    public final Object f38b;

    public c(Object obj, int i7) {
        this.f37a = i7;
        this.f38b = obj;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        e1 e1Var = (e1) this.f38b;
        if (z9) {
            long j3 = i7;
            if (e1Var.f3749z1 != j3) {
                e1Var.f3749z1 = j3;
                e1Var.f3739p1.setText(e1.K0(j3));
            }
            e1Var.J0(true);
        }
    }

    @Override
    public void Y(int i7, float f10, float f11, te.c cVar) {
        View view = ((m7) this.f38b).f4332b;
        if (view instanceof t0) {
            ((t0) view).T();
        } else {
            view.invalidate();
        }
    }

    @Override
    public void a(k2.j jVar) {
        d4.i iVar = (d4.i) jVar;
        iVar.clear();
        ((d4.j) this.f38b).f8179b.add(iVar);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        db.p clientImpl = (db.p) obj;
        kotlin.jvm.internal.j.e(clientImpl, "clientImpl");
        u uVar = new u((TaskCompletionSource) obj2);
        com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new h(-1, -1, 0, true), false);
        gVar.f6538c = false;
        r rVar = (r) ((t) clientImpl.n());
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.firebase.pnv.internal.IFpnvService");
        int i7 = db.e.f8578a;
        obtain.writeStrongBinder(uVar);
        obtain.writeInt(1);
        ((q) this.f38b).writeToParcel(obtain, 0);
        obtain.writeInt(1);
        gVar.writeToParcel(obtain, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            rVar.f8593a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override
    public void b(int i7) {
        switch (this.f37a) {
            case 16:
                v10 v10Var = (v10) this.f38b;
                if (i7 == 1) {
                    v10Var.a(Boolean.TRUE, null);
                    return;
                } else if (i7 != 3) {
                    v10Var.a(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
            case 17:
                u1 u1Var = (u1) this.f38b;
                if (i7 == 1) {
                    u1Var.a(Boolean.TRUE, null);
                    return;
                } else if (i7 != 3) {
                    u1Var.a(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
            default:
                mc mcVar = (mc) this.f38b;
                if (i7 == 1) {
                    mcVar.a(Boolean.TRUE, null);
                    return;
                } else if (i7 != 3) {
                    mcVar.a(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public boolean c(int r37, final android.view.View r38) {
        throw new UnsupportedOperationException("Method not decompiled: a1.c.c(int, android.view.View):boolean");
    }

    @Override
    public Object d(Number number, Object obj) {
        Long l10 = (Long) number;
        return u0.a((u0) this.f38b, (Long) obj);
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        long j3;
        long j10;
        int i10;
        int i11;
        int i12;
        g2 g2Var = (g2) this.f38b;
        q1 q1Var = g2Var.f9813c;
        ArrayList arrayList = g2Var.f9822r;
        di.t0 t0Var = ((r0) view).f9677f;
        int i13 = g2Var.N;
        int currentTime = ConnectionsManager.getInstance(i13).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i14 = 0;
        int i15 = 0;
        while (true) {
            j3 = 0;
            if (i15 >= t0Var.f9777f.size()) {
                break;
            }
            s0 s0Var = (s0) t0Var.f9777f.get(i15);
            long j11 = s0Var.f9741g;
            if (j11 > 0 && currentTime - s0Var.d <= di.t.b(i13, (int) j11, 0)) {
                hashSet.add(Integer.valueOf(s0Var.f9736a));
            }
            i15++;
        }
        g1 g1Var = g2Var.P;
        if (g1Var != null) {
            j3 = g1Var.j();
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < arrayList.size()) {
            s0 s0Var2 = (s0) arrayList.get(i16);
            if (!s0Var2.f9737b && s0Var2.f9739e && s0Var2.f9741g < j3) {
                j10 = j3;
            } else {
                if (hashSet.contains(Integer.valueOf(s0Var2.f9736a))) {
                    j10 = j3;
                    if (g2Var.f9825x != t0Var.f9774b || (i12 = g2Var.f9826y) == 0 || s0Var2.f9736a < i12) {
                        i10 = s0Var2.f9736a;
                        break;
                    }
                } else {
                    j10 = j3;
                }
                i17++;
            }
            i16++;
            j3 = j10;
        }
        j10 = j3;
        i10 = -1;
        if (i10 < 0) {
            int i18 = 0;
            while (true) {
                if (i14 < arrayList.size()) {
                    s0 s0Var3 = (s0) arrayList.get(i14);
                    if (s0Var3.f9737b || !s0Var3.f9739e || s0Var3.f9741g >= j10) {
                        if (hashSet.contains(Integer.valueOf(s0Var3.f9736a))) {
                            i11 = s0Var3.f9736a;
                            i17 = i18;
                            break;
                        }
                        i18++;
                    }
                    i14++;
                } else {
                    i17 = i18;
                    i11 = -1;
                    break;
                }
            }
        } else {
            i11 = i10;
        }
        if (i11 < 0) {
            return;
        }
        g2Var.f9825x = t0Var.f9774b;
        g2Var.f9826y = i11;
        g2Var.D = true;
        l0 itemAnimator = q1Var.getItemAnimator();
        q1Var.setItemAnimator(null);
        g2Var.d.i1(i17, q1Var.getHeight() / 2, true);
        g2Var.f9816e.g(i17);
        q1Var.setItemAnimator(itemAnimator);
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ((c20) this.f38b).a(u1Var.h(i7, true, true));
    }

    @Override
    public t1 h(int i7, m1 m1Var, int[] iArr) {
        n nVar = (n) this.f38b;
        f0 p10 = i0.p();
        for (int i10 = 0; i10 < m1Var.f10373a; i10++) {
            p10.c(new a3.j(i7, m1Var, i10, nVar, iArr[i10]));
        }
        return p10.f();
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        switch (this.f37a) {
            case 10:
                y yVar = (y) this.f38b;
                x31 x31Var = (x31) obj;
                View view = (View) obj2;
                Integer num = (Integer) number;
                Float f10 = (Float) serializable;
                Float f11 = (Float) serializable2;
                z zVar = yVar.f5061r;
                if (x31Var.G instanceof TL_stars.StarsTransaction) {
                    dd.k1(yVar.getContext(), true, zVar.f5110b, z.p0(zVar), (TL_stars.StarsTransaction) x31Var.G, z.q0(zVar));
                    return;
                } else if (yVar.h) {
                    yVar.h = false;
                    yVar.a();
                    return;
                } else {
                    return;
                }
            case 15:
                ea.b((ea) this.f38b, (ArrayList) obj, (Integer) obj2, (Long) number, (ArrayList) serializable, (ArrayList) serializable2);
                return;
            default:
                ad adVar = (ad) this.f38b;
                x31 x31Var2 = (x31) obj;
                View view2 = (View) obj2;
                Integer num2 = (Integer) number;
                Float f12 = (Float) serializable;
                Float f13 = (Float) serializable2;
                if (x31Var2.G instanceof TL_stars.StarsTransaction) {
                    dd.k1(adVar.getContext(), false, 0L, adVar.f3470c, (TL_stars.StarsTransaction) x31Var2.G, adVar.f3469b);
                    return;
                }
                return;
        }
    }

    @Override
    public void j(long j3) {
        ((u6) this.f38b).h();
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f37a) {
            case 5:
                m0.b((Intent) this.f38b);
                return;
            case 6:
                ((o0) this.f38b).f980b.trySetResult(null);
                return;
            default:
                ((ScheduledFuture) this.f38b).cancel(false);
                return;
        }
    }

    @Override
    public void onSuccess(Object obj) {
        switch (this.f37a) {
            case 0:
                ((f) this.f38b).invoke(obj);
                return;
            case 20:
                ((ae.d) this.f38b).invoke(obj);
                return;
            default:
                ((ae.d) this.f38b).invoke(obj);
                return;
        }
    }

    @Override
    public Object then(Task task) {
        Exception exception;
        int i7;
        Task forException;
        String message;
        switch (this.f37a) {
            case 2:
                ((CountDownLatch) this.f38b).countDown();
                return null;
            case 3:
                r7 r7Var = (r7) this.f38b;
                r7Var.getClass();
                if (!task.isSuccessful() && (exception = task.getException()) != null && !TextUtils.isEmpty(exception.getMessage()) && exception.getMessage().contains("FID_ALREADY_USED:")) {
                    Log.w("FirebaseMessaging", "FID_ALREADY_USED Detected. Retrying with FID cache clearing!");
                    ((va.c) ((va.d) r7Var.d)).f57291c.b().delete();
                    return r7Var.C();
                }
                return task;
            case 4:
                ((b8) this.f38b).getClass();
                Bundle bundle = (Bundle) task.getResult(IOException.class);
                if (bundle != null) {
                    String string = bundle.getString("registration_id");
                    if (string != null || (string = bundle.getString("unregistered")) != null) {
                        return string;
                    }
                    String string2 = bundle.getString("error");
                    if (!"RST".equals(string2)) {
                        if (string2 != null) {
                            throw new IOException(string2);
                        }
                        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                        throw new IOException("SERVICE_NOT_AVAILABLE");
                    }
                    throw new IOException("INSTANCE_ID_RESET");
                }
                throw new IOException("SERVICE_NOT_AVAILABLE");
            case 5:
            case 6:
            case 7:
            default:
                db.n this$0 = (db.n) this.f38b;
                kotlin.jvm.internal.j.e(this$0, "this$0");
                kotlin.jvm.internal.j.e(task, "task");
                d1 d1Var = db.n.f8589b;
                if (task.isSuccessful()) {
                    d1Var.a("Successfully completed the operation", new Object[0]);
                    Task forResult = Tasks.forResult(m.f8588b.invoke(task.getResult()));
                    kotlin.jvm.internal.j.d(forResult, "{\n      logger.d(\"Succes…ccess(task.result))\n    }");
                    return forResult;
                }
                Log.e(d1Var.f21970b, d1Var.b("Failed to fetch the Verification Support Info: " + task.getException(), new Object[0]));
                Exception exception2 = task.getException();
                if (exception2 != null && (message = exception2.getMessage()) != null && xd.d.e(message, "test_number_token is invalid")) {
                    d1Var.a("Backend rejected the test number token.", new Object[0]);
                    forException = Tasks.forException(new db.b(55507, "Invalid test number ID(s) - might be empty, expired or duplicated."));
                } else {
                    if (exception2 instanceof com.google.android.gms.common.api.f) {
                        i7 = ((com.google.android.gms.common.api.f) exception2).getStatus().f6529a;
                    } else {
                        i7 = 55501;
                    }
                    forException = Tasks.forException(new db.b(i7, "Failed to fetch the Verification Support Info"));
                }
                kotlin.jvm.internal.j.d(forException, "{\n      logger.e(\"$onFai…reMessage))\n      }\n    }");
                return forException;
            case 8:
                return (Task) ((o) this.f38b).call();
        }
    }

    @Override
    public void accept(Object obj) {
        switch (this.f37a) {
            case 21:
                c4.h hVar = (c4.h) this.f38b;
                c4.a aVar = (c4.a) obj;
                c4.g gVar = new c4.g(aVar.f5270b, sa.d.w0(aVar.f5269a, aVar.f5271c));
                hVar.f5280c.add(gVar);
                long j3 = hVar.f5285j;
                if (j3 == -9223372036854775807L || aVar.d >= j3) {
                    hVar.g(gVar);
                    return;
                }
                return;
            default:
                ((f0) this.f38b).c((c4.a) obj);
                return;
        }
    }

    @Override
    public void F(float f10, int i7) {
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
