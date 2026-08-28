package a1;

import a5.m;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import bg.h2;
import bg.l1;
import bg.q2;
import bg.x0;
import c2.a1;
import c2.z0;
import ch.j;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.e0;
import com.google.firebase.messaging.t;
import com.google.firebase.messaging.z;
import d3.h;
import e5.s;
import ff.p;
import fh.c0;
import fh.o1;
import fh.p2;
import gh.t0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledFuture;
import n2.l;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.x4;
import org.telegram.ui.LaunchActivity;
import r0.m1;
import r0.o;
import w2.i;
import zf.k;
public final class c implements OnSuccessListener, x9.a, b2, nk0, e3.b, ch.a, Continuation, OnCompleteListener, p, o, BillingController.ProductDetailsResponseListenerLegacy, x4 {
    public final int f34a;
    public final Object f35b;

    public c(a1 a1Var, z0 z0Var) {
        this.f34a = 8;
        this.f35b = a1Var;
    }

    @Override
    public void B(int i9, int i10, boolean z10) {
        t0 t0Var = (t0) this.f35b;
        if (z10) {
            long j10 = i9;
            if (t0Var.E != j10) {
                t0Var.E = j10;
                t0Var.f8900r.setText(t0.o(j10));
            }
            t0Var.n(true);
        }
    }

    @Override
    public m1 L0(View view, m1 m1Var) {
        ((fh.z0) this.f35b).h.i(m1Var);
        return m1.f46928b;
    }

    public void a(Display display) {
        s sVar = (s) this.f35b;
        sVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            sVar.f4930k = refreshRate;
            sVar.f4931l = (refreshRate * 80) / 100;
            return;
        }
        d5.a.K("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        sVar.f4930k = -9223372036854775807L;
        sVar.f4931l = -9223372036854775807L;
    }

    @Override
    public void c(float f10, float f11, int i9, View view) {
        q2.P((q2) this.f35b, view);
    }

    @Override
    public void e(x9.b bVar) {
        b9.b bVar2 = (b9.b) this.f35b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        bVar2.f1660b.set((b9.b) bVar.get());
    }

    @Override
    public void f(c2 c2Var, int i9) {
        switch (this.f34a) {
            case 2:
                ((h2) this.f35b).run();
                return;
            case 3:
                TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults = (TLRPC.TL_payments_giveawayInfoResults) this.f35b;
                o2 R = LaunchActivity.R();
                if (R != null) {
                    l1.S(R, tL_payments_giveawayInfoResults.gift_code_slug, null);
                    return;
                }
                return;
            case 4:
                ((x0) this.f35b).run();
                return;
            case 5:
                ((h2) this.f35b).run();
                return;
            default:
                ((c0) this.f35b).run();
                return;
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void h(long j10) {
        ((fh.e) this.f35b).a(j10, true);
    }

    @Override
    public Object j() {
        SQLiteDatabase a2;
        int i9 = this.f34a;
        Object obj = this.f35b;
        switch (i9) {
            case 9:
                h hVar = (h) ((d3.c) obj);
                hVar.getClass();
                int i10 = z2.a.f50267e;
                t tVar = new t(24, false);
                tVar.f4178c = null;
                tVar.d = new ArrayList();
                tVar.f4179e = null;
                tVar.f4177b = "";
                HashMap hashMap = new HashMap();
                a2 = hVar.a();
                a2.beginTransaction();
                try {
                    z2.a aVar = (z2.a) h.h(a2.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new androidx.car.app.utils.a(hVar, hashMap, tVar, 6));
                    a2.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 10:
                h hVar2 = (h) ((d3.d) obj);
                long d = hVar2.f4302b.d() - hVar2.d.d;
                a2 = hVar2.a();
                a2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(d)};
                    Cursor rawQuery = a2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        int i11 = rawQuery.getInt(0);
                        hVar2.e(i11, z2.c.MESSAGE_TOO_OLD, rawQuery.getString(1));
                    }
                    rawQuery.close();
                    int delete = a2.delete("events", "timestamp_ms < ?", strArr);
                    a2.setTransactionSuccessful();
                    a2.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
            case 11:
                h hVar3 = (h) ((d3.c) ((c3.h) obj).f2306i);
                a2 = hVar3.a();
                a2.beginTransaction();
                try {
                    a2.compileStatement("DELETE FROM log_event_dropped").execute();
                    a2.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + hVar3.f4302b.d()).execute();
                    a2.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                t tVar2 = (t) obj;
                for (i iVar : (Iterable) ((h) ((d3.d) tVar2.f4178c)).c(new a9.b(19))) {
                    ((m) tVar2.d).A(iVar, 1, false);
                }
                return null;
        }
    }

    @Override
    public void l(Canvas canvas, int i9) {
        j jVar = (j) this.f35b;
        jVar.getClass();
        canvas.save();
        RectF rectF = jVar.f2483r;
        canvas.translate(-rectF.left, (-rectF.top) + AndroidUtilities.dp(30.0f));
        jVar.e(canvas, true, i9);
        canvas.restore();
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f34a) {
            case 16:
                com.google.firebase.messaging.c0.b((Intent) this.f35b);
                return;
            case 17:
                ((e0) this.f35b).f4140b.trySetResult(null);
                return;
            default:
                ((ScheduledFuture) this.f35b).cancel(false);
                return;
        }
    }

    @Override
    public void onProductDetailsResponse(n2.g gVar, List list) {
        int i9;
        p2 p2Var = (p2) this.f35b;
        ArrayList arrayList = p2Var.f6688j0;
        Iterator it = list.iterator();
        long j10 = 0;
        while (true) {
            i9 = 0;
            if (!it.hasNext()) {
                break;
            }
            l lVar = (l) it.next();
            int size = arrayList.size();
            while (true) {
                if (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    k kVar = (k) obj;
                    if (kVar.h() != null && kVar.h().equals(lVar.f18335c)) {
                        kVar.h = lVar;
                        if (kVar.f() > j10) {
                            j10 = kVar.f();
                        }
                    }
                }
            }
        }
        int size2 = arrayList.size();
        while (i9 < size2) {
            Object obj2 = arrayList.get(i9);
            i9++;
            ((k) obj2).f50563g = j10;
        }
        AndroidUtilities.runOnUIThread(new o1(p2Var, 0));
    }

    @Override
    public void onSuccess(Object obj) {
        boolean z10;
        switch (this.f34a) {
            case 0:
                ((f) this.f35b).invoke(obj);
                return;
            case 7:
                ((b1.f) this.f35b).invoke(obj);
                return;
            case 14:
                z zVar = (z) obj;
                if (((FirebaseMessaging) this.f35b).f4101e.l() && zVar.h.a() != null) {
                    synchronized (zVar) {
                        z10 = zVar.f4204g;
                    }
                    if (!z10) {
                        zVar.h(0L);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                ((b1.f) this.f35b).invoke(obj);
                return;
            case 20:
                ((e1.b) this.f35b).invoke(obj);
                return;
            default:
                ((e1.b) this.f35b).invoke(obj);
                return;
        }
    }

    @Override
    public Object then(Task task) {
        switch (this.f34a) {
            case 15:
                ((com.google.firebase.messaging.m) this.f35b).getClass();
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
            default:
                ((CountDownLatch) this.f35b).countDown();
                return null;
        }
    }

    public c(Object obj, int i9) {
        this.f34a = i9;
        this.f35b = obj;
    }

    @Override
    public void g0(View view, float f10, float f11) {
    }
}
