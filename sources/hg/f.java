package hg;

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
import mh.i5;
import mh.t4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.y4;
public final class f implements org.telegram.ui.ActionBar.c2, jl0, Continuation, ih.a, r8.i, h5.j, v2.e, lf.o, r0.o, BillingController.ProductDetailsResponseListenerLegacy, y4, xd.b {
    public final int f7461a;
    public final Object f7462b;

    public f(Object obj, int i10) {
        this.f7461a = i10;
        this.f7462b = obj;
    }

    @Override
    public void I(int i10, int i11, boolean z4) {
        mh.r0 r0Var = (mh.r0) this.f7462b;
        if (z4) {
            long j10 = i10;
            if (r0Var.F != j10) {
                r0Var.F = j10;
                r0Var.f14660r.setText(mh.r0.o(j10));
            }
            r0Var.n(true);
        }
    }

    @Override
    public void L(int i10, float f10, float f11, xd.c cVar) {
        View view = ((i5) this.f7462b).f14237b;
        if (view instanceof org.telegram.ui.Cells.v0) {
            ((org.telegram.ui.Cells.v0) view).J();
        } else {
            view.invalidate();
        }
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        ((lh.u0) this.f7462b).h.i(m1Var);
        return r0.m1.f46482b;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    public void a(Display display) {
        i5.s sVar = (i5.s) this.f7462b;
        sVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            sVar.f7878k = refreshRate;
            sVar.f7879l = (refreshRate * 80) / 100;
            return;
        }
        h5.a.K("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        sVar.f7878k = -9223372036854775807L;
        sVar.f7879l = -9223372036854775807L;
    }

    @Override
    public Object apply(Object obj) {
        ((o5.i) this.f7462b).getClass();
        String d = la.c0.f12155b.d((la.b0) obj);
        kotlin.jvm.internal.j.d(d, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: ".concat(d));
        byte[] bytes = d.getBytes(jd.a.f9993a);
        kotlin.jvm.internal.j.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        f2.Q((f2) this.f7462b, view);
    }

    @Override
    public void d(long j10) {
        switch (this.f7461a) {
            case 22:
                ((lh.e) this.f7462b).a(j10, true);
                return;
            default:
                ((t4) this.f7462b).h();
                return;
        }
    }

    @Override
    public Object get() {
        switch (this.f7461a) {
            case 6:
                return (j3.j) this.f7462b;
            case 7:
                return (f5.t) this.f7462b;
            case 8:
                return (j3.l) this.f7462b;
            default:
                return Boolean.valueOf(((j3.k0) this.f7462b).L);
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f7461a) {
            case 9:
                ((j3.y1) obj).onMediaMetadataChanged((j3.e1) this.f7462b);
                return;
            case 10:
                ((j3.y1) obj).onAudioAttributesChanged((l3.d) this.f7462b);
                return;
            case 11:
                ((j3.y1) obj).onCues((v4.c) this.f7462b);
                return;
            case 12:
                ((j3.y1) obj).onMediaMetadataChanged(((j3.c0) this.f7462b).f9000a.M);
                return;
            case 13:
                ((j3.y1) obj).onMetadata((e4.c) this.f7462b);
                return;
            case 14:
            default:
                ((k3.b) obj).d((n3.f) this.f7462b);
                return;
            case 15:
                ((k3.b) obj).onSeekStarted((k3.a) this.f7462b);
                return;
            case 16:
                ((k3.b) obj).f((o4.r) this.f7462b);
                return;
            case 17:
                ((k3.b) obj).b((j3.t1) this.f7462b);
                return;
        }
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f7461a) {
            case 0:
                ((s0) this.f7462b).run();
                return;
            case 1:
                ((x1) this.f7462b).run();
                return;
            case 23:
                ((lh.x) this.f7462b).run();
                return;
            default:
                ((Utilities.Callback) this.f7462b).run(d2Var.g(i10, true, true));
                return;
        }
    }

    @Override
    public void onProductDetailsResponse(p2.h hVar, List list) {
        int i10;
        lh.g2 g2Var = (lh.g2) this.f7462b;
        ArrayList arrayList = g2Var.f12771k0;
        Iterator it = list.iterator();
        long j10 = 0;
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            p2.m mVar = (p2.m) it.next();
            int size = arrayList.size();
            while (true) {
                if (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    fg.n nVar = (fg.n) obj;
                    if (nVar.h() != null && nVar.h().equals(mVar.f44192c)) {
                        nVar.h = mVar;
                        if (nVar.f() > j10) {
                            j10 = nVar.f();
                        }
                    }
                }
            }
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            ((fg.n) obj2).f6409g = j10;
        }
        AndroidUtilities.runOnUIThread(new eh.m(g2Var, 27));
    }

    @Override
    public void p(Canvas canvas, int i10) {
        ih.j jVar = (ih.j) this.f7462b;
        jVar.getClass();
        canvas.save();
        RectF rectF = jVar.f8165r;
        canvas.translate(-rectF.left, (-rectF.top) + AndroidUtilities.dp(30.0f));
        jVar.e(canvas, true, i10);
        canvas.restore();
    }

    @Override
    public Object then(Task task) {
        ((CountDownLatch) this.f7462b).countDown();
        return null;
    }

    public f(k3.a aVar, Object obj, int i10) {
        this.f7461a = i10;
        this.f7462b = obj;
    }

    public f(k3.a aVar, o4.j jVar, o4.r rVar, IOException iOException, boolean z4) {
        this.f7461a = 16;
        this.f7462b = rVar;
    }

    @Override
    public void z(float f10, int i10) {
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
