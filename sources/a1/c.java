package a1;

import a3.n;
import a3.p;
import a8.b8;
import a8.r7;
import ab.m0;
import ab.o0;
import ai.h1;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import bi.e0;
import bi.f1;
import bi.s2;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import db.r;
import db.t;
import db.u;
import di.e6;
import di.mb;
import di.n5;
import di.s;
import di.s0;
import di.v8;
import e2.m1;
import h2.j;
import h9.f0;
import h9.i0;
import h9.s1;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import k2.i;
import org.telegram.messenger.d1;
import org.telegram.messenger.g0;
import org.telegram.messenger.s10;
import org.telegram.messenger.x10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.Wallet.t1;
import org.telegram.ui.il0;
import r0.k1;
import r0.m;
public final class c implements OnSuccessListener, p, Continuation, OnCompleteListener, h1, bg.p, q1, m, org.telegram.messenger.q1, j, i, q, x10, r4, te.b, il0 {
    public final int f37a;
    public final Object f38b;

    public c(Object obj, int i7) {
        this.f37a = i7;
        this.f38b = obj;
    }

    @Override
    public void G(int i7, float f10, float f11, te.c cVar) {
        View view = ((e6) this.f38b).f8470b;
        if (view instanceof t0) {
            ((t0) view).W();
        } else {
            view.invalidate();
        }
    }

    @Override
    public void L(int i7, int i10, boolean z10) {
        s0 s0Var = (s0) this.f38b;
        if (z10) {
            long j3 = i7;
            if (s0Var.D1 != j3) {
                s0Var.D1 = j3;
                s0Var.f9370t1.setText(s0.K0(j3));
            }
            s0Var.J0(true);
        }
    }

    @Override
    public k1 M0(View view, k1 k1Var) {
        ((f1) this.f38b).f3500r1.j(k1Var);
        return k1.f55681b;
    }

    @Override
    public void a(f5.f fVar, List list) {
        int i7;
        s2 s2Var = (s2) this.f38b;
        ArrayList arrayList = s2Var.f3849i2;
        Iterator it = list.iterator();
        long j3 = 0;
        while (true) {
            i7 = 0;
            if (!it.hasNext()) {
                break;
            }
            f5.m mVar = (f5.m) it.next();
            int size = arrayList.size();
            while (true) {
                if (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ug.j jVar = (ug.j) obj;
                    if (jVar.h() != null && jVar.h().equals(mVar.f10996c)) {
                        jVar.h = mVar;
                        if (jVar.f() > j3) {
                            j3 = jVar.f();
                        }
                    }
                }
            }
        }
        int size2 = arrayList.size();
        while (i7 < size2) {
            Object obj2 = arrayList.get(i7);
            i7++;
            ((ug.j) obj2).f58129g = j3;
        }
        g0.h3(new a3.f(s2Var, 20));
    }

    @Override
    public void accept(Object obj, Object obj2) {
        db.p clientImpl = (db.p) obj;
        kotlin.jvm.internal.j.e(clientImpl, "clientImpl");
        u uVar = new u((TaskCompletionSource) obj2);
        com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new h(-1, -1, 0, true), false);
        gVar.f5920c = false;
        r rVar = (r) ((t) clientImpl.n());
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.firebase.pnv.internal.IFpnvService");
        int i7 = db.e.f7965a;
        obtain.writeStrongBinder(uVar);
        obtain.writeInt(1);
        ((db.q) this.f38b).writeToParcel(obtain, 0);
        obtain.writeInt(1);
        gVar.writeToParcel(obtain, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            rVar.f7980a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override
    public void b(long j3, long j10) {
        long[] jArr = (long[]) this.f38b;
        ExecutorService executorService = DictationLid.f42585a;
        long[] jArr2 = (long[]) DictationAsr.h.get("tinylid.bin");
        if (jArr2 != null) {
            jArr2[0] = j3;
            if (j10 > 0) {
                jArr2[1] = j10;
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - jArr[0] > 100) {
            jArr[0] = elapsedRealtime;
            DictationAsr.o();
        }
    }

    @Override
    public void c(k2.j jVar) {
        d4.i iVar = (d4.i) jVar;
        iVar.clear();
        ((d4.j) this.f38b).f7565b.add(iVar);
    }

    @Override
    public void e(int i7) {
        switch (this.f37a) {
            case 28:
                s10 s10Var = (s10) this.f38b;
                if (i7 == 1) {
                    s10Var.a(Boolean.TRUE, null);
                    return;
                } else if (i7 != 3) {
                    s10Var.a(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
            default:
                t1 t1Var = (t1) this.f38b;
                if (i7 == 1) {
                    t1Var.a(Boolean.TRUE, null);
                    return;
                } else if (i7 != 3) {
                    t1Var.a(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public s1 f(int i7, m1 m1Var, int[] iArr) {
        n nVar = (n) this.f38b;
        f0 p10 = i0.p();
        for (int i10 = 0; i10 < m1Var.f10209a; i10++) {
            p10.c(new a3.j(i7, m1Var, i10, nVar, iArr[i10]));
        }
        return p10.f();
    }

    @Override
    public void g(long j3) {
        switch (this.f37a) {
            case 11:
                ((bi.f) this.f38b).a(j3, true);
                return;
            default:
                ((n5) this.f38b).h();
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f37a) {
            case 12:
                ((e0) this.f38b).run();
                return;
            default:
                ((z10) this.f38b).a(t1Var.h(i7, true, true));
                return;
        }
    }

    @Override
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        switch (this.f37a) {
            case 22:
                s sVar = (s) this.f38b;
                b41 b41Var = (b41) obj;
                View view = (View) obj2;
                Integer num = (Integer) number;
                Float f10 = (Float) serializable;
                Float f11 = (Float) serializable2;
                di.t tVar = sVar.f9363r;
                if (b41Var.G instanceof TL_stars.StarsTransaction) {
                    mb.k1(sVar.getContext(), true, tVar.f9413b, di.t.p0(tVar), (TL_stars.StarsTransaction) b41Var.G, di.t.q0(tVar));
                    return;
                } else if (sVar.h) {
                    sVar.h = false;
                    sVar.a();
                    return;
                } else {
                    return;
                }
            default:
                v8.b((v8) this.f38b, (ArrayList) obj, (Integer) obj2, (Long) number, (ArrayList) serializable, (ArrayList) serializable2);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f37a) {
            case 5:
                m0.b((Intent) this.f38b);
                return;
            case 6:
                ((o0) this.f38b).f979b.trySetResult(null);
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
            case 15:
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
                    ((va.c) ((va.d) r7Var.d)).f58772c.c().delete();
                    return r7Var.F();
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
            case 9:
                return (Task) ((aa.n) this.f38b).call();
            default:
                db.n this$0 = (db.n) this.f38b;
                kotlin.jvm.internal.j.e(this$0, "this$0");
                kotlin.jvm.internal.j.e(task, "task");
                d1 d1Var = db.n.f7976b;
                if (task.isSuccessful()) {
                    d1Var.a("Successfully completed the operation", new Object[0]);
                    Task forResult = Tasks.forResult(db.m.f7975b.invoke(task.getResult()));
                    kotlin.jvm.internal.j.d(forResult, "{\n      logger.d(\"Succes…ccess(task.result))\n    }");
                    return forResult;
                }
                Log.e(d1Var.f23010b, d1Var.b("Failed to fetch the Verification Support Info: " + task.getException(), new Object[0]));
                Exception exception2 = task.getException();
                if (exception2 != null && (message = exception2.getMessage()) != null && xd.d.e(message, "test_number_token is invalid")) {
                    d1Var.a("Backend rejected the test number token.", new Object[0]);
                    forException = Tasks.forException(new db.b(55507, "Invalid test number ID(s) - might be empty, expired or duplicated."));
                } else {
                    if (exception2 instanceof com.google.android.gms.common.api.f) {
                        i7 = ((com.google.android.gms.common.api.f) exception2).getStatus().f5911a;
                    } else {
                        i7 = 55501;
                    }
                    forException = Tasks.forException(new db.b(i7, "Failed to fetch the Verification Support Info"));
                }
                kotlin.jvm.internal.j.d(forException, "{\n      logger.e(\"$onFai…reMessage))\n      }\n    }");
                return forException;
        }
    }

    @Override
    public void accept(Object obj) {
        switch (this.f37a) {
            case 16:
                c4.h hVar = (c4.h) this.f38b;
                c4.a aVar = (c4.a) obj;
                c4.g gVar = new c4.g(aVar.f4092b, w7.s.k0(aVar.f4091a, aVar.f4093c));
                hVar.f4102c.add(gVar);
                long j3 = hVar.f4107j;
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
    public void E(float f10, int i7) {
    }
}
