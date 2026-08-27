package a1;

import a5.n;
import a9.m;
import ag.l0;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import c2.y0;
import c2.z0;
import cg.g1;
import cg.i2;
import cg.t0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.c0;
import com.google.firebase.messaging.e0;
import com.google.firebase.messaging.t;
import com.google.firebase.messaging.z;
import d3.h;
import d5.k;
import dh.j;
import e5.r;
import gf.p;
import gh.a0;
import gh.k2;
import gh.x0;
import h3.h1;
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
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.LaunchActivity;
import r0.m1;
import r0.o;
import w2.i;

public final class c implements OnSuccessListener, e3.b, y9.a, a2, qk0, Continuation, OnCompleteListener, dh.a, p, o, BillingController.ProductDetailsResponseListenerLegacy, k {

    public final int f34a;

    public final Object f35b;

    public c(z0 z0Var, y0 y0Var) {
        this.f34a = 2;
        this.f35b = z0Var;
    }

    @Override
    public m1 I0(View view, m1 m1Var) {
        ((x0) this.f35b).h.i(m1Var);
        return m1.f46618b;
    }

    public void a(Display display) {
        r rVar = (r) this.f35b;
        rVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            rVar.f5287k = refreshRate;
            rVar.f5288l = (refreshRate * 80) / 100;
        } else {
            d5.a.K("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            rVar.f5287k = -9223372036854775807L;
            rVar.f5288l = -9223372036854775807L;
        }
    }

    @Override
    public void b(y9.b bVar) {
        c9.a aVar = (c9.a) this.f35b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        aVar.f2564b.set((c9.a) bVar.get());
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        i2.Q((i2) this.f35b, view);
    }

    @Override
    public void f(b2 b2Var, int i10) {
        switch (this.f34a) {
            case 8:
                ((cg.a2) this.f35b).run();
                break;
            case 9:
                TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults = (TLRPC.TL_payments_giveawayInfoResults) this.f35b;
                n2 n2VarR = LaunchActivity.R();
                if (n2VarR != null) {
                    g1.T(n2VarR, tL_payments_giveawayInfoResults.gift_code_slug, null);
                    break;
                }
                break;
            case 10:
                ((t0) this.f35b).run();
                break;
            case 11:
                ((cg.a2) this.f35b).run();
                break;
            default:
                ((a0) this.f35b).run();
                break;
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(long j10) {
        ((gh.e) this.f35b).a(j10, true);
    }

    @Override
    public Object i() {
        int i10 = this.f34a;
        int i11 = 25;
        boolean z10 = false;
        Object obj = this.f35b;
        switch (i10) {
            case 3:
                h hVar = (h) ((d3.c) obj);
                hVar.getClass();
                int i12 = z2.a.f50167e;
                t tVar = new t(i11, z10);
                tVar.f4620c = null;
                tVar.d = new ArrayList();
                tVar.f4621e = null;
                tVar.f4619b = "";
                HashMap map = new HashMap();
                SQLiteDatabase sQLiteDatabaseA = hVar.a();
                sQLiteDatabaseA.beginTransaction();
                try {
                    z2.a aVar = (z2.a) h.h(sQLiteDatabaseA.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new l0(hVar, map, tVar, 7));
                    sQLiteDatabaseA.setTransactionSuccessful();
                    return aVar;
                } finally {
                    sQLiteDatabaseA.endTransaction();
                }
            case 4:
                h hVar2 = (h) ((d3.d) obj);
                long jE = hVar2.f4744b.E() - hVar2.d.d;
                SQLiteDatabase sQLiteDatabaseA2 = hVar2.a();
                sQLiteDatabaseA2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(jE)};
                    Cursor cursorRawQuery = sQLiteDatabaseA2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            hVar2.e(cursorRawQuery.getInt(0), z2.c.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                        } catch (Throwable th) {
                            cursorRawQuery.close();
                            throw th;
                        }
                    }
                    cursorRawQuery.close();
                    int iDelete = sQLiteDatabaseA2.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseA2.setTransactionSuccessful();
                    sQLiteDatabaseA2.endTransaction();
                    return Integer.valueOf(iDelete);
                } catch (Throwable th2) {
                    sQLiteDatabaseA2.endTransaction();
                    throw th2;
                }
            case 5:
                h hVar3 = (h) ((d3.c) ((c3.g) obj).f2439i);
                SQLiteDatabase sQLiteDatabaseA3 = hVar3.a();
                sQLiteDatabaseA3.beginTransaction();
                try {
                    sQLiteDatabaseA3.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseA3.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + hVar3.f4744b.E()).execute();
                    sQLiteDatabaseA3.setTransactionSuccessful();
                    return null;
                } finally {
                    sQLiteDatabaseA3.endTransaction();
                }
            default:
                t tVar2 = (t) obj;
                Iterator it = ((Iterable) ((h) ((d3.d) tVar2.f4620c)).c(new m(i11))).iterator();
                while (it.hasNext()) {
                    ((n) tVar2.d).y((i) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override
    public void invoke(Object obj) {
        ((h3.a2) obj).onMediaMetadataChanged((h1) this.f35b);
    }

    @Override
    public void l(Canvas canvas, int i10) {
        j jVar = (j) this.f35b;
        jVar.getClass();
        canvas.save();
        RectF rectF = jVar.f5027r;
        canvas.translate(-rectF.left, (-rectF.top) + AndroidUtilities.dp(30.0f));
        jVar.e(canvas, true, i10);
        canvas.restore();
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f34a) {
            case 15:
                c0.b((Intent) this.f35b);
                break;
            case 16:
                ((e0) this.f35b).f4582b.trySetResult(null);
                break;
            default:
                ((ScheduledFuture) this.f35b).cancel(false);
                break;
        }
    }

    @Override
    public void onProductDetailsResponse(n2.g gVar, List list) {
        int i10;
        k2 k2Var = (k2) this.f35b;
        ArrayList arrayList = k2Var.f7390j0;
        Iterator it = list.iterator();
        long jF = 0;
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            l lVar = (l) it.next();
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ag.p pVar = (ag.p) obj;
                if (pVar.h() != null && pVar.h().equals(lVar.f18163c)) {
                    pVar.h = lVar;
                    if (pVar.f() <= jF) {
                        break;
                    }
                    jF = pVar.f();
                    break;
                }
            }
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            ((ag.p) obj2).f590g = jF;
        }
        AndroidUtilities.runOnUIThread(new f2.r(k2Var, 7));
    }

    @Override
    public void onSuccess(Object obj) {
        boolean z10;
        switch (this.f34a) {
            case 0:
                ((f) this.f35b).invoke(obj);
                return;
            case 1:
                ((b1.f) this.f35b).invoke(obj);
                return;
            case 13:
                z zVar = (z) obj;
                if (!((FirebaseMessaging) this.f35b).f4543e.l() || zVar.h.a() == null) {
                    return;
                }
                synchronized (zVar) {
                    z10 = zVar.f4646g;
                }
                if (z10) {
                    return;
                }
                zVar.h(0L);
                return;
            case 18:
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
    public Object then(Task task) throws IOException {
        switch (this.f34a) {
            case 14:
                ((com.google.firebase.messaging.m) this.f35b).getClass();
                Bundle bundle = (Bundle) task.getResult(IOException.class);
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            default:
                ((CountDownLatch) this.f35b).countDown();
                return null;
        }
    }

    public c(Object obj, int i10) {
        this.f34a = i10;
        this.f35b = obj;
    }

    @Override
    public void c0(View view, float f10, float f11) {
    }
}
