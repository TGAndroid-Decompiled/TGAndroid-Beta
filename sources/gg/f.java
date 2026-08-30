package gg;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.Log;
import android.view.Display;
import android.view.View;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import lh.i5;
import lh.t4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.y4;
public final class f implements org.telegram.ui.ActionBar.c2, jl0, hh.a, Continuation, r8.i, h5.j, lf.o, r0.o, BillingController.ProductDetailsResponseListenerLegacy, v2.e, y4, xd.b {
    public final int f6617a;
    public final Object f6618b;

    public f(Object obj, int i10) {
        this.f6617a = i10;
        this.f6618b = obj;
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        lh.s0 s0Var = (lh.s0) this.f6618b;
        if (z4) {
            long j10 = i10;
            if (s0Var.F != j10) {
                s0Var.F = j10;
                s0Var.f13053r.setText(lh.s0.o(j10));
            }
            s0Var.n(true);
        }
    }

    @Override
    public void L(int i10, float f10, float f11, xd.c cVar) {
        View view = ((i5) this.f6618b).f12589b;
        if (view instanceof org.telegram.ui.Cells.v0) {
            ((org.telegram.ui.Cells.v0) view).J();
        } else {
            view.invalidate();
        }
    }

    @Override
    public r0.m1 N0(View view, r0.m1 m1Var) {
        ((kh.u0) this.f6618b).h.i(m1Var);
        return r0.m1.f43129b;
    }

    public void a(Display display) {
        i5.s sVar = (i5.s) this.f6618b;
        sVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            sVar.f7323k = refreshRate;
            sVar.f7324l = (refreshRate * 80) / 100;
            return;
        }
        h5.a.K("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        sVar.f7323k = -9223372036854775807L;
        sVar.f7324l = -9223372036854775807L;
    }

    @Override
    public Object apply(Object obj) {
        ((ja.c) this.f6618b).getClass();
        String e = la.c0.f11746b.e((la.b0) obj);
        kotlin.jvm.internal.j.d(e, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: ".concat(e));
        byte[] bytes = e.getBytes(jd.a.f9359a);
        kotlin.jvm.internal.j.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        f2.Q((f2) this.f6618b, view);
    }

    @Override
    public void d(long j10) {
        switch (this.f6617a) {
            case 19:
                ((kh.e) this.f6618b).a(j10, true);
                return;
            default:
                ((t4) this.f6618b).h();
                return;
        }
    }

    @Override
    public boolean e1(View view) {
        return false;
    }

    @Override
    public Object get() {
        switch (this.f6617a) {
            case 6:
                return (j3.j) this.f6618b;
            case 7:
                return (f5.t) this.f6618b;
            case 8:
                return (j3.l) this.f6618b;
            default:
                return Boolean.valueOf(((j3.k0) this.f6618b).L);
        }
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f6617a) {
            case 0:
                ((s0) this.f6618b).run();
                return;
            case 1:
                ((x1) this.f6618b).run();
                return;
            case 20:
                ((kh.x) this.f6618b).run();
                return;
            default:
                ((Utilities.Callback) this.f6618b).run(d2Var.g(i10, true, true));
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f6617a) {
            case 9:
                ((j3.y1) obj).onMediaMetadataChanged((j3.e1) this.f6618b);
                return;
            case 10:
                ((j3.y1) obj).onAudioAttributesChanged((l3.d) this.f6618b);
                return;
            case 11:
                ((j3.y1) obj).onCues((v4.c) this.f6618b);
                return;
            case 12:
                ((j3.y1) obj).onMediaMetadataChanged(((j3.c0) this.f6618b).f8441a.M);
                return;
            case 13:
                ((j3.y1) obj).onMetadata((e4.c) this.f6618b);
                return;
            case 14:
            default:
                ((k3.b) obj).d((n3.f) this.f6618b);
                return;
            case 15:
                ((k3.b) obj).onSeekStarted((k3.a) this.f6618b);
                return;
            case 16:
                ((k3.b) obj).f((o4.r) this.f6618b);
                return;
            case 17:
                ((k3.b) obj).b((j3.t1) this.f6618b);
                return;
        }
    }

    @Override
    public void onProductDetailsResponse(p2.h hVar, List list) {
        int i10;
        kh.h2 h2Var = (kh.h2) this.f6618b;
        ArrayList arrayList = h2Var.f10650k0;
        Iterator it = list.iterator();
        long j10 = 0;
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            p2.n nVar = (p2.n) it.next();
            int size = arrayList.size();
            while (true) {
                if (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    eg.n nVar2 = (eg.n) obj;
                    if (nVar2.h() != null && nVar2.h().equals(nVar.f41009c)) {
                        nVar2.h = nVar;
                        if (nVar2.f() > j10) {
                            j10 = nVar2.f();
                        }
                    }
                }
            }
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            ((eg.n) obj2).f5366g = j10;
        }
        AndroidUtilities.runOnUIThread(new ef.e(h2Var, 24));
    }

    @Override
    public void p(Canvas canvas, int i10) {
        hh.j jVar = (hh.j) this.f6618b;
        jVar.getClass();
        canvas.save();
        RectF rectF = jVar.f7163r;
        canvas.translate(-rectF.left, (-rectF.top) + AndroidUtilities.dp(30.0f));
        jVar.e(canvas, true, i10);
        canvas.restore();
    }

    @Override
    public Object then(Task task) {
        ((CountDownLatch) this.f6618b).countDown();
        return null;
    }

    public f(k3.a aVar, Object obj, int i10) {
        this.f6617a = i10;
        this.f6618b = obj;
    }

    public f(k3.a aVar, o4.j jVar, o4.r rVar, IOException iOException, boolean z4) {
        this.f6617a = 16;
        this.f6618b = rVar;
    }

    @Override
    public void z(float f10, int i10) {
    }

    @Override
    public void o0(View view, float f10, float f11) {
    }
}
