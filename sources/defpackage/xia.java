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
public final class xia implements Runnable {
    public final byte a;
    public Object b;

    public xia(i2d i2dVar) {
        this.a = (byte) 22;
        Objects.requireNonNull(i2dVar);
        this.b = i2dVar;
    }

    private final void a() {
        u9d u9dVar = (u9d) this.b;
        synchronized (u9d.i) {
            if (!u9dVar.d()) {
                return;
            }
            u9dVar.f(15);
        }
    }

    @Override
    public final void run() {
        b9 b9Var;
        hu7 hu7Var;
        g98 g98Var;
        float f;
        long j;
        float f2;
        ymd ymdVar;
        ljd ljdVar;
        long j2 = 0;
        float f3 = 0.0f;
        r3b r3bVar = null;
        boolean z = true;
        switch (this.a) {
            case 0:
                System.currentTimeMillis();
                throw null;
            case 1:
                cra craVar = (cra) this.b;
                try {
                    bra braVar = craVar.a;
                    if (braVar != null) {
                        braVar.g();
                        craVar.invalidate();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 2:
                ((uxa) this.b).b0.animate().alpha(1.0f).setDuration(230L);
                return;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                yxa yxaVar = (yxa) this.b;
                int[][] iArr = yxaVar.f;
                int[][] iArr2 = yxaVar.e;
                long[][] jArr = yxaVar.d;
                long[][] jArr2 = yxaVar.c;
                RandomAccessFile randomAccessFile = yxaVar.r;
                dm5 dm5Var = yxaVar.s;
                if (Math.abs(currentTimeMillis - yxaVar.b) >= 2000) {
                    yxaVar.b = currentTimeMillis;
                    try {
                        dm5Var.b();
                        int i = 0;
                        while (true) {
                            int i2 = 7;
                            if (i < 3) {
                                int i3 = 0;
                                while (i3 < i2) {
                                    int[][] iArr3 = iArr2;
                                    dm5Var.write(yxaVar.k(jArr2[i][i3]), 0, 8);
                                    dm5Var.write(yxaVar.k(jArr[i][i3]), 0, 8);
                                    dm5Var.write(yxaVar.j(iArr3[i][i3]), 0, 4);
                                    dm5Var.write(yxaVar.j(iArr[i][i3]), 0, 4);
                                    i3++;
                                    i2 = i2;
                                    iArr2 = iArr3;
                                }
                                dm5Var.write(yxaVar.j(yxaVar.n[i]), 0, 4);
                                dm5Var.write(yxaVar.k(yxaVar.h[i]), 0, 8);
                                i++;
                                iArr2 = iArr2;
                            } else {
                                int[][] iArr4 = iArr2;
                                for (int i4 = 0; i4 < 3; i4++) {
                                    dm5Var.write(yxaVar.k(jArr2[i4][7]), 0, 8);
                                    dm5Var.write(yxaVar.k(jArr[i4][7]), 0, 8);
                                    dm5Var.write(yxaVar.j(iArr4[i4][7]), 0, 4);
                                    dm5Var.write(yxaVar.j(iArr[i4][7]), 0, 4);
                                }
                                randomAccessFile.seek(0L);
                                randomAccessFile.write(dm5Var.a, 0, dm5Var.b);
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
                zya zyaVar = (zya) this.b;
                View view = zyaVar.s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        view.setVisibility(0);
                        view.setAlpha(0.0f);
                    }
                    view.animate().setListener(null).cancel();
                    view.animate().alpha(1.0f).setDuration(150L).start();
                    return;
                }
                zyaVar.c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                return;
            case 5:
                ((c8b) this.b).M0 = false;
                return;
            case 6:
                c3b c3bVar = (c3b) this.b;
                c3bVar.b = false;
                c3bVar.invalidate();
                return;
            case 7:
                ((ThemeEditorView) this.b).a = false;
                try {
                    bkb.k();
                    bkb.n();
                    bkb.p();
                    bkb.j(false, false);
                    zkb.b0(null, true);
                    LaunchActivity launchActivity = LaunchActivity.H1;
                    if (launchActivity != null) {
                        launchActivity.b0();
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
            case 8:
                zsb zsbVar = (zsb) this.b;
                zsbVar.G.setVisibility(0);
                zsbVar.G.setAlpha(0.0f);
                zsbVar.G.animate().alpha(1.0f).start();
                return;
            case 9:
                ActionMenuView actionMenuView = ((Toolbar) this.b).a;
                if (actionMenuView != null && (b9Var = actionMenuView.K) != null) {
                    b9Var.l();
                    return;
                }
                return;
            case 10:
                s7c s7cVar = (s7c) this.b;
                String str = s7cVar.i2;
                if (str != null) {
                    if (s7cVar.q2 >= 0) {
                        ConnectionsManager.getInstance(s7cVar.a).cancelRequest(s7cVar.q2, true);
                        s7cVar.q2 = -1;
                    }
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.q = str;
                    s7cVar.q2 = ConnectionsManager.getInstance(s7cVar.a).sendRequest(tL_contacts_search, new wx9(s7cVar, (byte) 21));
                    return;
                }
                return;
            case 11:
                mbc mbcVar = (mbc) this.b;
                if (mbcVar.d && (hu7Var = mbcVar.f) != null && hu7Var.isAttachedToWindow()) {
                    PhotoViewer photoViewer = mbcVar.a.a;
                    lbc lbcVar = photoViewer.G2;
                    if (lbcVar != null) {
                        j2 = lbcVar.S();
                    }
                    u3b u3bVar = mbcVar.b;
                    if (u3bVar != null && u3bVar.o && !u3bVar.h && !u3bVar.e(u3b.a(j2))) {
                        u3bVar.f();
                    }
                    if (mbcVar.g != null) {
                        int i5 = 0;
                        while (true) {
                            if (i5 < mbcVar.g.size()) {
                                r3b r3bVar2 = (r3b) mbcVar.g.get(i5);
                                if (j2 >= r3bVar2.a && j2 < r3bVar2.b) {
                                    r3bVar = r3bVar2;
                                } else {
                                    i5++;
                                }
                            }
                        }
                    }
                    z = (r3bVar == null || TextUtils.isEmpty(r3bVar.c)) ? false : false;
                    if (z) {
                        if (r3bVar != mbcVar.h || !TextUtils.equals(r3bVar.c, mbcVar.f.getText())) {
                            mbcVar.h = r3bVar;
                            mbcVar.f.setText(r3bVar.c);
                        }
                        mbcVar.f.setSpokenWords(r3bVar.d);
                        mbcVar.f.A(j2);
                    }
                    if (z != mbcVar.i) {
                        mbcVar.i = z;
                        mbcVar.f.animate().cancel();
                        ViewPropertyAnimator animate = mbcVar.f.animate();
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
                    float height = (photoViewer.f0.getHeight() - photoViewer.t2.bottom) - gl.L(8.0f);
                    u98 u98Var = photoViewer.i3;
                    if (u98Var != null && u98Var.getVisibility() == 0) {
                        height = gl.R1(height, Math.min(height, photoViewer.i3.getY()), Utilities.i(photoViewer.i3.getAlpha(), 1.0f, 0.0f));
                    }
                    r88 r88Var = photoViewer.U1;
                    if (r88Var != null && photoViewer.a2 != null && r88Var.getVisibility() == 0 && (g98Var = photoViewer.R1) != null && g98Var.getVisibility() == 0) {
                        height = gl.R1(height, Math.min(height, photoViewer.R1.getTranslationY() + ((photoViewer.U1.getY() + photoViewer.a2.getTop()) - photoViewer.U1.getScrollY())), Utilities.i(photoViewer.U1.getAlpha(), 1.0f, 0.0f));
                    }
                    float L = (height - gl.L(8.0f)) - mbcVar.f.getHeight();
                    if (mbcVar.f.getTranslationY() != L) {
                        mbcVar.f.setTranslationY(L);
                    }
                    mbcVar.f.postOnAnimation(this);
                    return;
                }
                return;
            case 12:
                gec gecVar = (gec) this.b;
                gecVar.setScrollState(0);
                gecVar.s();
                return;
            case 13:
                vec vecVar = (vec) this.b;
                if (vecVar.K) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f4 = vecVar.g0 + (((float) elapsedRealtime) / 200.0f);
                    vecVar.g0 = f4;
                    vecVar.setAnimationIdicatorProgress(vecVar.b0.getInterpolation(f4));
                    float f5 = vecVar.g0;
                    if (f5 > 1.0f) {
                        vecVar.g0 = 1.0f;
                        f5 = 1.0f;
                    }
                    if (f5 < 1.0f) {
                        gl.d3(vecVar.j0);
                        return;
                    }
                    vecVar.K = false;
                    vecVar.setEnabled(true);
                    uec uecVar = vecVar.E;
                    if (uecVar != null) {
                        uecVar.g(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                ygc ygcVar = (ygc) this.b;
                h91 h91Var = ygcVar.b;
                if (h91Var != null) {
                    h91Var.b();
                }
                long c = b91.c();
                boolean a = h91.a(VoIPService.getSharedInstance());
                if (c != ygcVar.c || a != ygcVar.d) {
                    ygcVar.c = c;
                    ygcVar.d = a;
                    xa8 xa8Var = ygcVar.a;
                    if (xa8Var != null) {
                        xa8Var.c();
                    }
                }
                gl.e3(this, 500L);
                return;
            case 15:
                hmc hmcVar = (hmc) this.b;
                if (hmcVar.a != null && hmcVar.e != null) {
                    hmcVar.a1();
                    if (hmcVar.s) {
                        hmcVar.a.postOnAnimation(this);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                mmc mmcVar = (mmc) this.b;
                vmc vmcVar = mmcVar.H;
                if (mmcVar.b0) {
                    long nanoTime = System.nanoTime();
                    if (vmcVar.a) {
                        long j3 = vmcVar.j;
                        if (j3 == 0) {
                            vmcVar.j = nanoTime;
                        } else {
                            float min = Math.min(0.1f, Math.max(0.0f, ((float) (nanoTime - j3)) * 1.0E-9f));
                            vmcVar.j = nanoTime;
                            if (vmcVar.i - vmcVar.h >= 1000000000) {
                                float exp = 1.0f - ((float) Math.exp((-min) / 1.0f));
                                float f6 = vmcVar.d;
                                vmcVar.d = tb4.A(vmcVar.b, f6, exp, f6);
                                float f7 = vmcVar.e;
                                vmcVar.e = tb4.A(vmcVar.c, f7, exp, f7);
                            }
                        }
                    }
                    if (vmcVar.a) {
                        f2 = Math.max(-15.0f, Math.min(15.0f, vmcVar.b - vmcVar.d));
                    } else {
                        f2 = 0.0f;
                    }
                    mmcVar.L = f2;
                    if (vmcVar.a) {
                        f3 = Math.max(-15.0f, Math.min(15.0f, vmcVar.c - vmcVar.e));
                    }
                    float c2 = mmc.c(f3 * 1.5f, -15.0f, 15.0f);
                    float f8 = mmcVar.L;
                    float f9 = mmcVar.M;
                    float A = tb4.A(f8, f9, 1.0f, f9);
                    mmcVar.M = A;
                    float f10 = mmcVar.N;
                    float A2 = tb4.A(c2, f10, 1.0f, f10);
                    mmcVar.N = A2;
                    float f11 = mmcVar.f0;
                    mmcVar.b((A * f11) + mmcVar.O + mmcVar.e0, (A2 * f11) + mmcVar.P);
                    mmcVar.postOnAnimation(this);
                    return;
                }
                return;
            case 17:
                tuc tucVar = (tuc) this.b;
                k27 k27Var = tucVar.n;
                if (k27Var != null && tucVar.getParentActivity() != null && tucVar.s != null) {
                    na7.q1(tuc.Y(tucVar)).G4(6, 0, k27.B0(k27Var.k), 0L, null);
                    gl.e3(tucVar.s, 25000L);
                    return;
                }
                return;
            case 18:
                if (vvc.h.remove(this)) {
                    gl.r(this);
                    ((my) this.b).run();
                    return;
                }
                return;
            case 19:
                j1d j1dVar = (j1d) this.b;
                dy4 dy4Var = j1dVar.d;
                Context context = j1dVar.c;
                dy4Var.getClass();
                if (!yy4.a.getAndSet(true)) {
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
                ((u1d) this.b).a();
                return;
            case 21:
                xx4 xx4Var = ((u1d) ((u39) this.b).b).b;
                xx4Var.d(xx4Var.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 22:
                ((i2d) this.b).k.b(new ds2(4, null, null));
                return;
            case 23:
                return;
            case 24:
                k3d k3dVar = (k3d) this.b;
                ReentrantLock reentrantLock = k3dVar.o;
                reentrantLock.lock();
                try {
                    k3dVar.j();
                    return;
                } finally {
                    reentrantLock.unlock();
                }
            case 25:
                ckc ckcVar = (ckc) this.b;
                synchronized (ckcVar.a) {
                    if (ckcVar.b()) {
                        Log.e("WakeLock", String.valueOf(ckcVar.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                        ckcVar.d();
                        if (ckcVar.b()) {
                            ckcVar.c = 1;
                            ckcVar.e();
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
                ucd ucdVar = (ucd) this.b;
                uh0 uh0Var = ucdVar.d;
                uh0Var.k(0);
                fi0 fi0Var = qjd.i;
                uh0Var.j(24, fi0Var);
                ucdVar.c(fi0Var);
                return;
            default:
                tod todVar = (tod) this.b;
                if (todVar != null && (ymdVar = todVar.n) != null) {
                    this.b = null;
                    if (ymdVar.isDone()) {
                        Object obj = todVar.a;
                        if (obj == null) {
                            if (ymdVar.isDone()) {
                                if (akd.h.f(todVar, null, tod.h(ymdVar))) {
                                    tod.j(todVar);
                                    return;
                                }
                                return;
                            }
                            jjd jjdVar = new jjd(todVar, ymdVar);
                            if (akd.h.f(todVar, null, jjdVar)) {
                                try {
                                    ymdVar.c(jjdVar, ald.a);
                                    return;
                                } catch (Throwable th) {
                                    try {
                                        ljdVar = new ljd(th);
                                    } catch (Error | Exception unused2) {
                                        ljdVar = ljd.b;
                                    }
                                    akd.h.f(todVar, jjdVar, ljdVar);
                                    return;
                                }
                            }
                            obj = todVar.a;
                        }
                        if (obj instanceof ijd) {
                            ymdVar.cancel(((ijd) obj).a);
                            return;
                        }
                        return;
                    }
                    try {
                        ScheduledFuture scheduledFuture = todVar.r;
                        todVar.r = null;
                        String str2 = "Timed out";
                        if (scheduledFuture != null) {
                            long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                            if (abs > 10) {
                                str2 = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                            }
                        }
                        if (akd.h.f(todVar, null, new ljd(new TimeoutException(str2 + ": " + ymdVar.toString())))) {
                            tod.j(todVar);
                        }
                        return;
                    } finally {
                        ymdVar.cancel(true);
                    }
                }
                return;
        }
    }

    public xia(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public xia(f3d f3dVar, dd ddVar) {
        this.a = (byte) 23;
        this.b = ddVar;
    }
}
