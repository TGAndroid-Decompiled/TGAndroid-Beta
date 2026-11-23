package a1;

import a3.p;
import a8.b8;
import a8.r7;
import ab.m0;
import ab.o0;
import ai.a3;
import ai.l1;
import android.content.Intent;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import bg.q;
import bi.a1;
import bi.e0;
import bi.e2;
import bi.k1;
import com.google.android.gms.common.api.h;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import db.r;
import db.t;
import db.u;
import di.h6;
import di.pb;
import di.q5;
import di.r0;
import di.s;
import di.y8;
import e2.m1;
import h2.j;
import h9.f0;
import h9.i0;
import h9.t1;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import k2.i;
import org.telegram.messenger.d1;
import org.telegram.messenger.r10;
import org.telegram.messenger.w10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.a5;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.ll0;
import r0.m;
import ri.n;
public final class c implements OnSuccessListener, p, Continuation, OnCompleteListener, l1, a1, q, q1, m, n, j, i, com.google.android.gms.common.api.internal.q, w10, a5, te.b, ll0 {
    public final int f37a;
    public final Object f38b;

    public c(Object obj, int i7) {
        this.f37a = i7;
        this.f38b = obj;
    }

    @Override
    public void H(int i7, float f10, float f11, te.c cVar) {
        View view = ((h6) this.f38b).f8974b;
        if (view instanceof v0) {
            ((v0) view).U();
        } else {
            view.invalidate();
        }
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        r0 r0Var = (r0) this.f38b;
        if (z10) {
            long j3 = i7;
            if (r0Var.D1 != j3) {
                r0Var.D1 = j3;
                r0Var.f9646t1.setText(r0.L0(j3));
            }
            r0Var.K0(true);
        }
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        ((k1) this.f38b).f3775r1.j(l1Var);
        return r0.l1.f56302b;
    }

    @Override
    public void a(Canvas canvas) {
        a3 a3Var = (a3) this.f38b;
        canvas.save();
        canvas.translate(a3Var.f34681a.getX(), a3Var.f34681a.getY());
        a3Var.f34681a.draw(canvas);
        canvas.restore();
    }

    @Override
    public void accept(Object obj, Object obj2) {
        db.p clientImpl = (db.p) obj;
        kotlin.jvm.internal.j.e(clientImpl, "clientImpl");
        u uVar = new u((TaskCompletionSource) obj2);
        com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new h(-1, -1, 0, true), false);
        gVar.f6235c = false;
        r rVar = (r) ((t) clientImpl.n());
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.firebase.pnv.internal.IFpnvService");
        int i7 = db.e.f8279a;
        obtain.writeStrongBinder(uVar);
        obtain.writeInt(1);
        ((db.q) this.f38b).writeToParcel(obtain, 0);
        obtain.writeInt(1);
        gVar.writeToParcel(obtain, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            rVar.f8294a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override
    public void b(k2.j jVar) {
        d4.i iVar = (d4.i) jVar;
        iVar.clear();
        ((d4.j) this.f38b).f7880b.add(iVar);
    }

    @Override
    public void c(long j3, long j10) {
        long[] jArr = (long[]) this.f38b;
        ExecutorService executorService = DictationLid.f43074a;
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
            DictationAsr.p();
        }
    }

    @Override
    public void d(int i7) {
        r10 r10Var = (r10) this.f38b;
        if (i7 == 1) {
            r10Var.a(Boolean.TRUE, null);
        } else if (i7 != 3) {
            r10Var.a(Boolean.FALSE, null);
        }
    }

    @Override
    public int e() {
        e2 e2Var = (e2) this.f38b;
        e2Var.getClass();
        return m6.w0(m6.f29324a7, e2Var.J0);
    }

    @Override
    public t1 f(int i7, m1 m1Var, int[] iArr) {
        a3.n nVar = (a3.n) this.f38b;
        f0 p10 = i0.p();
        for (int i10 = 0; i10 < m1Var.f10556a; i10++) {
            p10.c(new a3.j(i7, m1Var, i10, nVar, iArr[i10]));
        }
        return p10.f();
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f37a) {
            case 13:
                ((e0) this.f38b).run();
                return;
            default:
                ((y10) this.f38b).a(t1Var.h(i7, true, true));
                return;
        }
    }

    @Override
    public void i(long j3) {
        switch (this.f37a) {
            case 12:
                ((bi.f) this.f38b).a(j3, true);
                return;
            default:
                ((q5) this.f38b).h();
                return;
        }
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        switch (this.f37a) {
            case 23:
                s sVar = (s) this.f38b;
                o41 o41Var = (o41) obj;
                View view = (View) obj2;
                Integer num = (Integer) number;
                Float f10 = (Float) serializable;
                Float f11 = (Float) serializable2;
                di.t tVar = sVar.f9719r;
                if (o41Var.H instanceof TL_stars.StarsTransaction) {
                    pb.l1(sVar.getContext(), true, tVar.f9771b, di.t.q0(tVar), (TL_stars.StarsTransaction) o41Var.H, di.t.r0(tVar));
                    return;
                } else if (sVar.h) {
                    sVar.h = false;
                    sVar.a();
                    return;
                } else {
                    return;
                }
            default:
                y8.b((y8) this.f38b, (ArrayList) obj, (Integer) obj2, (Long) number, (ArrayList) serializable, (ArrayList) serializable2);
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
                ((o0) this.f38b).f978b.trySetResult(null);
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
            case 16:
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
                    ((va.c) ((va.d) r7Var.d)).f59384c.c().delete();
                    return r7Var.J();
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
            case 10:
                return (Task) ((aa.n) this.f38b).call();
            default:
                db.n this$0 = (db.n) this.f38b;
                kotlin.jvm.internal.j.e(this$0, "this$0");
                kotlin.jvm.internal.j.e(task, "task");
                d1 d1Var = db.n.f8290b;
                if (task.isSuccessful()) {
                    d1Var.a("Successfully completed the operation", new Object[0]);
                    Task forResult = Tasks.forResult(db.m.f8289b.invoke(task.getResult()));
                    kotlin.jvm.internal.j.d(forResult, "{\n      logger.d(\"Succes…ccess(task.result))\n    }");
                    return forResult;
                }
                Log.e(d1Var.f23471b, d1Var.b("Failed to fetch the Verification Support Info: " + task.getException(), new Object[0]));
                Exception exception2 = task.getException();
                if (exception2 != null && (message = exception2.getMessage()) != null && xd.d.e(message, "test_number_token is invalid")) {
                    d1Var.a("Backend rejected the test number token.", new Object[0]);
                    forException = Tasks.forException(new db.b(55507, "Invalid test number ID(s) - might be empty, expired or duplicated."));
                } else {
                    if (exception2 instanceof com.google.android.gms.common.api.f) {
                        i7 = ((com.google.android.gms.common.api.f) exception2).getStatus().f6226a;
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
            case 17:
                c4.h hVar = (c4.h) this.f38b;
                c4.a aVar = (c4.a) obj;
                c4.g gVar = new c4.g(aVar.f4405b, w7.s.a0(aVar.f4404a, aVar.f4406c));
                hVar.f4415c.add(gVar);
                long j3 = hVar.f4420j;
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
    public void D(float f10, int i7) {
    }
}
