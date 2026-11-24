package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.Objects;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class zka implements Runnable {
    public final byte a;
    public Object b;

    public zka(k4d k4dVar) {
        this.a = (byte) 22;
        Objects.requireNonNull(k4dVar);
        this.b = k4dVar;
    }

    private final void a() {
        wbd wbdVar = (wbd) this.b;
        synchronized (wbd.i) {
            if (!wbdVar.d()) {
                return;
            }
            wbdVar.f(15);
        }
    }

    @Override
    public final void run() {
        b9 b9Var;
        iw7 iw7Var;
        hb8 hb8Var;
        float f;
        long j;
        float f2;
        bpd bpdVar;
        nld nldVar;
        long j2 = 0;
        float f3 = 0.0f;
        s5b s5bVar = null;
        boolean z = true;
        switch (this.a) {
            case 0:
                System.currentTimeMillis();
                throw null;
            case 1:
                dta dtaVar = (dta) this.b;
                try {
                    cta ctaVar = dtaVar.a;
                    if (ctaVar != null) {
                        ctaVar.g();
                        dtaVar.invalidate();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 2:
                ((xza) this.b).b0.animate().alpha(1.0f).setDuration(230L);
                return;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                b0b b0bVar = (b0b) this.b;
                int[][] iArr = b0bVar.f;
                int[][] iArr2 = b0bVar.e;
                long[][] jArr = b0bVar.d;
                long[][] jArr2 = b0bVar.c;
                RandomAccessFile randomAccessFile = b0bVar.r;
                do5 do5Var = b0bVar.s;
                if (Math.abs(currentTimeMillis - b0bVar.b) >= 2000) {
                    b0bVar.b = currentTimeMillis;
                    try {
                        do5Var.b();
                        int i = 0;
                        while (true) {
                            int i2 = 7;
                            if (i < 3) {
                                int i3 = 0;
                                while (i3 < i2) {
                                    int[][] iArr3 = iArr2;
                                    do5Var.write(b0bVar.k(jArr2[i][i3]), 0, 8);
                                    do5Var.write(b0bVar.k(jArr[i][i3]), 0, 8);
                                    do5Var.write(b0bVar.j(iArr3[i][i3]), 0, 4);
                                    do5Var.write(b0bVar.j(iArr[i][i3]), 0, 4);
                                    i3++;
                                    i2 = i2;
                                    iArr2 = iArr3;
                                }
                                do5Var.write(b0bVar.j(b0bVar.n[i]), 0, 4);
                                do5Var.write(b0bVar.k(b0bVar.h[i]), 0, 8);
                                i++;
                                iArr2 = iArr2;
                            } else {
                                int[][] iArr4 = iArr2;
                                for (int i4 = 0; i4 < 3; i4++) {
                                    do5Var.write(b0bVar.k(jArr2[i4][7]), 0, 8);
                                    do5Var.write(b0bVar.k(jArr[i4][7]), 0, 8);
                                    do5Var.write(b0bVar.j(iArr4[i4][7]), 0, 4);
                                    do5Var.write(b0bVar.j(iArr[i4][7]), 0, 4);
                                }
                                randomAccessFile.seek(0L);
                                randomAccessFile.write(do5Var.a, 0, do5Var.b);
                                randomAccessFile.getFD().sync();
                                return;
                            }
                        }
                    } catch (Exception unused) {
                        return;
                    }
                } else {
                    return;
                }
            case 4:
                a1b a1bVar = (a1b) this.b;
                View view = a1bVar.s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        view.setVisibility(0);
                        view.setAlpha(0.0f);
                    }
                    view.animate().setListener(null).cancel();
                    view.animate().alpha(1.0f).setDuration(150L).start();
                    return;
                }
                a1bVar.c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                return;
            case 5:
                ((eab) this.b).M0 = false;
                return;
            case 6:
                d5b d5bVar = (d5b) this.b;
                d5bVar.b = false;
                d5bVar.invalidate();
                return;
            case 7:
                ((ThemeEditorView) this.b).a = false;
                try {
                    cmb.k();
                    cmb.n();
                    cmb.p();
                    cmb.j(false, false);
                    anb.b0(null, true);
                    LaunchActivity launchActivity = LaunchActivity.H1;
                    if (launchActivity != null) {
                        launchActivity.b0();
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
            case 8:
                avb avbVar = (avb) this.b;
                avbVar.G.setVisibility(0);
                avbVar.G.setAlpha(0.0f);
                avbVar.G.animate().alpha(1.0f).start();
                return;
            case 9:
                ActionMenuView actionMenuView = ((Toolbar) this.b).a;
                if (actionMenuView != null && (b9Var = actionMenuView.K) != null) {
                    b9Var.l();
                    return;
                }
                return;
            case 10:
                t9c t9cVar = (t9c) this.b;
                String str = t9cVar.i2;
                if (str != null) {
                    if (t9cVar.q2 >= 0) {
                        ConnectionsManager.getInstance(t9cVar.a).cancelRequest(t9cVar.q2, true);
                        t9cVar.q2 = -1;
                    }
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.q = str;
                    t9cVar.q2 = ConnectionsManager.getInstance(t9cVar.a).sendRequest(tL_contacts_search, new go9(t9cVar, (byte) 22));
                    return;
                }
                return;
            case 11:
                odc odcVar = (odc) this.b;
                if (odcVar.d && (iw7Var = odcVar.f) != null && iw7Var.isAttachedToWindow()) {
                    PhotoViewer photoViewer = odcVar.a.a;
                    ndc ndcVar = photoViewer.G2;
                    if (ndcVar != null) {
                        j2 = ndcVar.S();
                    }
                    v5b v5bVar = odcVar.b;
                    if (v5bVar != null && v5bVar.o && !v5bVar.h && !v5bVar.e(v5b.a(j2))) {
                        v5bVar.f();
                    }
                    if (odcVar.g != null) {
                        int i5 = 0;
                        while (true) {
                            if (i5 < odcVar.g.size()) {
                                s5b s5bVar2 = (s5b) odcVar.g.get(i5);
                                if (j2 >= s5bVar2.a && j2 < s5bVar2.b) {
                                    s5bVar = s5bVar2;
                                } else {
                                    i5++;
                                }
                            }
                        }
                    }
                    z = (s5bVar == null || TextUtils.isEmpty(s5bVar.c)) ? false : false;
                    if (z) {
                        if (s5bVar != odcVar.h || !TextUtils.equals(s5bVar.c, odcVar.f.getText())) {
                            odcVar.h = s5bVar;
                            odcVar.f.setText(s5bVar.c);
                        }
                        odcVar.f.setSpokenWords(s5bVar.d);
                        odcVar.f.A(j2);
                    }
                    if (z != odcVar.i) {
                        odcVar.i = z;
                        odcVar.f.animate().cancel();
                        ViewPropertyAnimator animate = odcVar.f.animate();
                        if (z) {
                            f = 1.0f;
                        } else {
                            f = 0.0f;
                        }
                        ViewPropertyAnimator alpha = animate.alpha(f);
                        if (z) {
                            j = 120;
                        } else {
                            j = 180;
                        }
                        alpha.setDuration(j).start();
                    }
                    float height = (photoViewer.f0.getHeight() - photoViewer.t2.bottom) - gm.L(8.0f);
                    vb8 vb8Var = photoViewer.i3;
                    if (vb8Var != null && vb8Var.getVisibility() == 0) {
                        height = gm.R1(height, Math.min(height, photoViewer.i3.getY()), Utilities.i(photoViewer.i3.getAlpha(), 1.0f, 0.0f));
                    }
                    ta8 ta8Var = photoViewer.U1;
                    if (ta8Var != null && photoViewer.a2 != null && ta8Var.getVisibility() == 0 && (hb8Var = photoViewer.R1) != null && hb8Var.getVisibility() == 0) {
                        height = gm.R1(height, Math.min(height, photoViewer.R1.getTranslationY() + ((photoViewer.U1.getY() + photoViewer.a2.getTop()) - photoViewer.U1.getScrollY())), Utilities.i(photoViewer.U1.getAlpha(), 1.0f, 0.0f));
                    }
                    float L = (height - gm.L(8.0f)) - odcVar.f.getHeight();
                    if (odcVar.f.getTranslationY() != L) {
                        odcVar.f.setTranslationY(L);
                    }
                    odcVar.f.postOnAnimation(this);
                    return;
                }
                return;
            case 12:
                ggc ggcVar = (ggc) this.b;
                ggcVar.setScrollState(0);
                ggcVar.s();
                return;
            case 13:
                vgc vgcVar = (vgc) this.b;
                if (vgcVar.K) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f4 = vgcVar.g0 + (((float) elapsedRealtime) / 200.0f);
                    vgcVar.g0 = f4;
                    vgcVar.setAnimationIdicatorProgress(vgcVar.b0.getInterpolation(f4));
                    float f5 = vgcVar.g0;
                    if (f5 > 1.0f) {
                        vgcVar.g0 = 1.0f;
                        f5 = 1.0f;
                    }
                    if (f5 < 1.0f) {
                        gm.c3(vgcVar.j0);
                        return;
                    }
                    vgcVar.K = false;
                    vgcVar.setEnabled(true);
                    ugc ugcVar = vgcVar.E;
                    if (ugcVar != null) {
                        ugcVar.g(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                zic zicVar = (zic) this.b;
                qa1 qa1Var = zicVar.b;
                if (qa1Var != null) {
                    qa1Var.b();
                }
                long c = ka1.c();
                boolean a = qa1.a(VoIPService.getSharedInstance());
                if (c != zicVar.c || a != zicVar.d) {
                    zicVar.c = c;
                    zicVar.d = a;
                    ad8 ad8Var = zicVar.a;
                    if (ad8Var != null) {
                        ad8Var.d();
                    }
                }
                gm.d3(this, 500L);
                return;
            case 15:
                goc gocVar = (goc) this.b;
                if (gocVar.a != null && gocVar.e != null) {
                    gocVar.b1();
                    if (gocVar.s) {
                        gocVar.a.postOnAnimation(this);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                moc mocVar = (moc) this.b;
                voc vocVar = mocVar.H;
                if (mocVar.b0) {
                    long nanoTime = System.nanoTime();
                    if (vocVar.a) {
                        long j3 = vocVar.j;
                        if (j3 == 0) {
                            vocVar.j = nanoTime;
                        } else {
                            float min = Math.min(0.1f, Math.max(0.0f, ((float) (nanoTime - j3)) * 1.0E-9f));
                            vocVar.j = nanoTime;
                            if (vocVar.i - vocVar.h >= 1000000000) {
                                float exp = 1.0f - ((float) Math.exp((-min) / 1.0f));
                                float f6 = vocVar.d;
                                vocVar.d = td4.A(vocVar.b, f6, exp, f6);
                                float f7 = vocVar.e;
                                vocVar.e = td4.A(vocVar.c, f7, exp, f7);
                            }
                        }
                    }
                    if (vocVar.a) {
                        f2 = Math.max(-15.0f, Math.min(15.0f, vocVar.b - vocVar.d));
                    } else {
                        f2 = 0.0f;
                    }
                    mocVar.L = f2;
                    if (vocVar.a) {
                        f3 = Math.max(-15.0f, Math.min(15.0f, vocVar.c - vocVar.e));
                    }
                    float c2 = moc.c(f3 * 1.5f, -15.0f, 15.0f);
                    float f8 = mocVar.L;
                    float f9 = mocVar.M;
                    float A = td4.A(f8, f9, 1.0f, f9);
                    mocVar.M = A;
                    float f10 = mocVar.N;
                    float A2 = td4.A(c2, f10, 1.0f, f10);
                    mocVar.N = A2;
                    float f11 = mocVar.f0;
                    mocVar.b((A * f11) + mocVar.O + mocVar.e0, (A2 * f11) + mocVar.P);
                    mocVar.postOnAnimation(this);
                    return;
                }
                return;
            case 17:
                uwc uwcVar = (uwc) this.b;
                k47 k47Var = uwcVar.n;
                if (k47Var != null && uwcVar.getParentActivity() != null && uwcVar.s != null) {
                    oc7.r1(uwc.Z(uwcVar)).J4(6, 0, k47.B0(k47Var.k), 0L, null);
                    gm.d3(uwcVar.s, 25000L);
                    return;
                }
                return;
            case 18:
                if (wxc.h.remove(this)) {
                    gm.r(this);
                    ((en1) this.b).run();
                    return;
                }
                return;
            case 19:
                l3d l3dVar = (l3d) this.b;
                e05 e05Var = l3dVar.d;
                Context context = l3dVar.c;
                e05Var.getClass();
                if (!x05.a.getAndSet(true)) {
                    try {
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                        if (notificationManager != null) {
                            notificationManager.cancel(10436);
                            return;
                        }
                        return;
                    } catch (SecurityException e3) {
                        Log.d("GooglePlayServicesUtil", "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications.", e3);
                        return;
                    }
                }
                return;
            case 20:
                ((w3d) this.b).a();
                return;
            case 21:
                zz4 zz4Var = ((w3d) ((x59) this.b).b).b;
                zz4Var.d(zz4Var.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 22:
                ((k4d) this.b).k.b(new ot2(4, null, null));
                return;
            case 23:
                return;
            case 24:
                m5d m5dVar = (m5d) this.b;
                ReentrantLock reentrantLock = m5dVar.o;
                reentrantLock.lock();
                try {
                    m5dVar.j();
                    return;
                } finally {
                    reentrantLock.unlock();
                }
            case 25:
                cmc cmcVar = (cmc) this.b;
                synchronized (cmcVar.a) {
                    if (cmcVar.b()) {
                        Log.e("WakeLock", String.valueOf(cmcVar.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                        cmcVar.d();
                        if (cmcVar.b()) {
                            cmcVar.c = 1;
                            cmcVar.e();
                            return;
                        }
                        return;
                    }
                    return;
                }
            case 26:
                if (((TaskCompletionSource) this.b).trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 27:
                a();
                return;
            case 28:
                wed wedVar = (wed) this.b;
                ui0 ui0Var = wedVar.d;
                ui0Var.k(0);
                fj0 fj0Var = sld.i;
                ui0Var.j(24, fj0Var);
                wedVar.c(fj0Var);
                return;
            default:
                wqd wqdVar = (wqd) this.b;
                if (wqdVar != null && (bpdVar = wqdVar.n) != null) {
                    this.b = null;
                    if (bpdVar.isDone()) {
                        Object obj = wqdVar.a;
                        if (obj == null) {
                            if (bpdVar.isDone()) {
                                if (cmd.h.f(wqdVar, null, wqd.h(bpdVar))) {
                                    wqd.j(wqdVar);
                                    return;
                                }
                                return;
                            }
                            lld lldVar = new lld(wqdVar, bpdVar);
                            if (cmd.h.f(wqdVar, null, lldVar)) {
                                try {
                                    bpdVar.c(lldVar, cnd.a);
                                    return;
                                } catch (Throwable th) {
                                    try {
                                        nldVar = new nld(th);
                                    } catch (Error | Exception unused2) {
                                        nldVar = nld.b;
                                    }
                                    cmd.h.f(wqdVar, lldVar, nldVar);
                                    return;
                                }
                            }
                            obj = wqdVar.a;
                        }
                        if (obj instanceof kld) {
                            bpdVar.cancel(((kld) obj).a);
                            return;
                        }
                        return;
                    }
                    try {
                        ScheduledFuture scheduledFuture = wqdVar.r;
                        wqdVar.r = null;
                        String str2 = "Timed out";
                        if (scheduledFuture != null) {
                            long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                            if (abs > 10) {
                                str2 = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                            }
                        }
                        if (cmd.h.f(wqdVar, null, new nld(new TimeoutException(str2 + ": " + bpdVar.toString())))) {
                            wqd.j(wqdVar);
                        }
                        return;
                    } finally {
                        bpdVar.cancel(true);
                    }
                }
                return;
        }
    }

    public zka(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public zka(h5d h5dVar, de deVar) {
        this.a = (byte) 23;
        this.b = deVar;
    }
}
