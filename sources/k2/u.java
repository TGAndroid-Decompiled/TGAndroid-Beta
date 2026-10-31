package k2;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.widget.FrameLayout;
import bi.d5;
import e9.x1;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import kg.k2;
import m4.j1;
import m4.n1;
import m4.t1;
import mg.i2;
import mg.r1;
import org.telegram.messenger.b8;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.hs;
import org.telegram.messenger.o5;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.wb;
import org.telegram.ui.ll;
import org.telegram.ui.un;
import v7.t6;
public final class u implements Runnable {
    public final int f10771a;
    public final Object f10772b;
    public final Object f10773c;

    public u(int i10, Object obj, Object obj2) {
        this.f10771a = i10;
        this.f10772b = obj;
        this.f10773c = obj2;
    }

    @Override
    public final void run() {
        e eVar;
        int i10;
        Exception runtimeException;
        t1 t1Var;
        TLObject d22;
        TLObject d23;
        int i11 = 0;
        switch (this.f10771a) {
            case 0:
                String str = e2.l0.f6165a;
                j2.g gVar = ((i2.c0) ((w) ((hf.b) this.f10772b).f7658c)).f7821a.f7927s;
                j2.a U = gVar.U();
                gVar.V(U, 1012, new j2.e(U, (String) this.f10773c, 11));
                return;
            case 1:
                String str2 = e2.l0.f6165a;
                n4.q.f(((i2.c0) ((w) ((hf.b) this.f10772b).f7658c)).f7821a.F, (i2.c) this.f10773c);
                return;
            case 2:
                f0.a((f0) this.f10772b, (AudioRouting) this.f10773c);
                return;
            case 3:
                f0 f0Var = (f0) this.f10772b;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.f10773c;
                if (f0Var.d != null && (eVar = ((n0) f0Var.f10648b.f10700a).f10714i) != null && !audioDeviceInfo.equals(eVar.f10641i)) {
                    eVar.f10641i = audioDeviceInfo;
                    Context context = eVar.f10636a;
                    b2.f fVar = eVar.f10642j;
                    List a2 = eVar.a();
                    x1 x1Var = b.e;
                    eVar.b(b.b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), fVar, audioDeviceInfo, a2));
                    return;
                }
                return;
            case 4:
                kg.q0 q0Var = (kg.q0) this.f10772b;
                TLObject tLObject = (TLObject) this.f10773c;
                ArrayList arrayList = q0Var.a2;
                tk0 tk0Var = q0Var.f26666k1;
                if (tLObject != null) {
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_messages_chats) tLObject).chats);
                    q0Var.A2 = false;
                    q0Var.B2.b(q0Var.f11229f2 + 4);
                    int i12 = 0;
                    while (true) {
                        if (i12 < tk0Var.getChildCount()) {
                            if (tk0Var.getChildAt(i12) instanceof kg.p0) {
                                i10 = tk0Var.getChildAt(i12).getTop();
                            } else {
                                i12++;
                            }
                        } else {
                            i10 = 0;
                        }
                    }
                    q0Var.G1();
                    if (q0Var.f11227d2 >= 0 && i10 != 0) {
                        ((s4.a0) tk0Var.getLayoutManager()).h1(q0Var.f11227d2 + 1, i10);
                    }
                }
                int max = Math.max(arrayList.size(), q0Var.E2.f1402b);
                q0Var.f11239p2.i(max, false);
                q0Var.f11239p2.setBagePosition(max / q0Var.E2.f1403c);
                kg.o0 o0Var = q0Var.f11239p2;
                o0Var.H = true;
                o0Var.requestLayout();
                return;
            case 5:
                ((kg.q0) this.f10772b).h1((s80) this.f10773c, true);
                return;
            case 6:
                k2 k2Var = (k2) this.f10772b;
                b8.G(k2Var.f11159s);
                org.telegram.messenger.i0.g3(new u(7, k2Var, b8.I((TLRPC.Document) this.f10773c)));
                return;
            case 7:
                k2 k2Var2 = (k2) this.f10772b;
                k2Var2.e = (File) this.f10773c;
                k2Var2.a();
                return;
            case 8:
                ki.k kVar = (ki.k) this.f10772b;
                Throwable th2 = (Throwable) this.f10773c;
                kVar.getClass();
                if (th2 instanceof Exception) {
                    runtimeException = (Exception) th2;
                } else {
                    runtimeException = new RuntimeException(th2);
                }
                kVar.g(runtimeException);
                return;
            case 9:
                ki.k kVar2 = (ki.k) this.f10772b;
                File file = (File) this.f10773c;
                synchronized (kVar2.f11421m) {
                    while (i11 < kVar2.f11421m.size()) {
                        try {
                            File file2 = (File) kVar2.f11421m.get(i11);
                            if (file != null && file.equals(file2)) {
                                i11++;
                            }
                            if (file2.exists() && !file2.delete()) {
                                kVar2.h.b("temporary file deletion failed: " + file2.getName());
                            }
                            i11++;
                        } finally {
                        }
                    }
                    kVar2.f11421m.clear();
                }
                return;
            case 10:
                ((lg.g) this.f10772b).c((ArrayList) this.f10773c);
                return;
            case 11:
                lg.t tVar = (lg.t) this.f10772b;
                lg.v vVar = (lg.v) this.f10773c;
                tVar.getClass();
                try {
                    EGLDisplay eGLDisplay = tVar.f11972j;
                    if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGLSurface eGLSurface = tVar.f11974l;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, tVar.f11973k);
                        EGLSurface eGLSurface2 = vVar.h;
                        if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                            EGL14.eglDestroySurface(tVar.f11972j, eGLSurface2);
                        }
                        vVar.h = EGL14.EGL_NO_SURFACE;
                        if (tVar.f11970g.length == 0) {
                            tVar.b();
                        }
                    }
                    vVar.f11986b.release();
                    return;
                } finally {
                    vVar.f11986b.release();
                }
            case 12:
                ((li.l) this.f10772b).a0((li.q0) this.f10773c);
                return;
            case 13:
                li.l lVar = (li.l) this.f10772b;
                HandlerThread handlerThread = (HandlerThread) this.f10773c;
                lVar.k();
                li.o oVar = lVar.f12166x;
                if (oVar != null) {
                    long p5 = oVar.p();
                    li.v vVar2 = lVar.f12164w;
                    if (vVar2 != null && p5 != Long.MAX_VALUE) {
                        vVar2.f12278q = Math.max(0L, p5) * 1000;
                        Handler handler = vVar2.f12286u;
                        if (handler != null) {
                            handler.removeCallbacks(vVar2.f12292x0);
                        }
                    }
                }
                lVar.p();
                li.o oVar2 = lVar.f12166x;
                if (oVar2 != null) {
                    oVar2.u();
                    lVar.f12166x = null;
                }
                handlerThread.quitSafely();
                return;
            case 14:
                li.v vVar3 = (li.v) this.f10772b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f10773c;
                vVar3.getClass();
                try {
                    try {
                        vVar3.f();
                        vVar3.f12281r0 = true;
                    } catch (RuntimeException e) {
                        vVar3.f12290w0 = e;
                        vVar3.i();
                    }
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            case 15:
                li.q0 q0Var2 = (li.q0) this.f10773c;
                li.x0 x0Var = (li.x0) ((a4.l) this.f10772b).f279b;
                x0Var.Q++;
                x0Var.f12327y = true;
                x0Var.f12316m.b("camera switch started: target=" + q0Var2);
                d50 d50Var = (d50) x0Var.d.f10700a;
                FrameLayout frameLayout = d50Var.f25335x;
                d50Var.f25329s0++;
                ValueAnimator valueAnimator = d50Var.f25309b0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    d50Var.f25309b0.cancel();
                    d50Var.f25309b0 = null;
                }
                d50Var.f25322n0 = true;
                d50Var.f25323o0 = false;
                d50Var.f25324p0 = false;
                d50Var.f25325q0 = false;
                d50Var.f25327r0 = SystemClock.elapsedRealtime();
                ll llVar = d50Var.D;
                d50Var.y(false);
                Bitmap bitmap = d50Var.f25330t0;
                if (bitmap != null) {
                    llVar.setImageBitmap(bitmap);
                    d50Var.m0 = true;
                    llVar.animate().cancel();
                    llVar.setAlpha(1.0f);
                }
                frameLayout.animate().cancel();
                frameLayout.setRotationY(0.0f);
                frameLayout.setCameraDistance(frameLayout.getMeasuredHeight() * 8.0f);
                int i13 = d50Var.f25329s0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                d50Var.f25309b0 = ofFloat;
                ofFloat.setDuration(580L);
                d50Var.f25309b0.setInterpolator(gr.h);
                d50Var.f25309b0.addUpdateListener(new nh.b(d50Var, i13, 5));
                d50Var.f25309b0.addListener(new d5(d50Var, i13, 9));
                d50Var.f25309b0.start();
                f8.b("RoundVideo camera flip started: facing=" + q0Var2 + ", minimumDurationMs=580");
                d50Var.B();
                x0Var.o();
                return;
            case 16:
                ((m4.f0) this.f10772b).u(null, (n1) this.f10773c);
                return;
            case 17:
                ((m4.f0) this.f10772b).getClass();
                ((Runnable) this.f10773c).run();
                return;
            case 18:
                ((c0.i) this.f10773c).a(Boolean.valueOf(((m4.f0) this.f10772b).o()));
                return;
            case 19:
                j9.w wVar = (j9.w) this.f10772b;
                ResultReceiver resultReceiver = (ResultReceiver) this.f10773c;
                try {
                    t1Var = (t1) wVar.f9770a;
                    t6.l(t1Var, "SessionResult must not be null");
                } catch (InterruptedException e7) {
                    e = e7;
                    e2.a.m("MediaSessionLegacyStub", "Custom command failed", e);
                    t1Var = new t1(-1);
                } catch (CancellationException e10) {
                    e2.a.m("MediaSessionLegacyStub", "Custom command cancelled", e10);
                    t1Var = new t1(1);
                } catch (ExecutionException e11) {
                    e = e11;
                    e2.a.m("MediaSessionLegacyStub", "Custom command failed", e);
                    t1Var = new t1(-1);
                }
                resultReceiver.send(t1Var.f12952a, t1Var.f12953b);
                return;
            case 20:
                xa.n nVar = ((j1) this.f10772b).f12789b;
                m4.w B = nVar.B(((m4.m) this.f10773c).asBinder());
                if (B != null) {
                    nVar.U(B);
                    return;
                }
                return;
            case 21:
                ((j1) this.f10772b).f12789b.u((m4.w) this.f10773c);
                return;
            case 22:
                lf.b bVar = (lf.b) this.f10773c;
                if (((AtomicBoolean) ((com.google.android.gms.internal.cast.o) this.f10772b).e).compareAndSet(false, true)) {
                    bVar.a(true);
                    return;
                }
                return;
            case 23:
                ((r1) this.f10772b).a((ArrayList) this.f10773c);
                return;
            case 24:
                ((mg.o0) this.f10772b).a((TLRPC.TL_error) this.f10773c);
                return;
            case 25:
                q20 q20Var = (q20) this.f10773c;
                HashMap h02 = ((hs) this.f10772b).h0();
                if (!h02.isEmpty()) {
                    org.telegram.messenger.i0.g3(new mg.j0(q20Var, h02, 0));
                    return;
                }
                return;
            case 26:
                ((vg) this.f10772b).a((ArrayList) this.f10773c);
                return;
            case 27:
                wb I = cc.a0((un) this.f10772b).I(2131624223, cd.L0(2131745110, null), org.telegram.messenger.i0.W2(cd.H(',', "StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.f10773c).stars)));
                I.f32135j = 5000;
                I.k(true);
                return;
            case 28:
                zs.f(d20.f15147s0).k(191, ((mg.w0) this.f10772b).T1, Boolean.TRUE, (TL_stories.PrepaidGiveaway) this.f10773c);
                return;
            default:
                i2 i2Var = (i2) this.f10772b;
                TLObject tLObject2 = (TLObject) this.f10773c;
                ArrayList arrayList2 = i2Var.f13139c2;
                arrayList2.clear();
                i2Var.f13152p2 = -1;
                if (tLObject2 instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject2;
                    vp r12 = vp.r1(i2Var.f21583a);
                    r12.V3(tL_contacts_found.users, false);
                    r12.P3(tL_contacts_found.chats, false);
                    HashSet hashSet = new HashSet();
                    ArrayList<TLRPC.Peer> arrayList3 = tL_contacts_found.my_results;
                    int size = arrayList3.size();
                    int i14 = 0;
                    while (i14 < size) {
                        TLRPC.Peer peer = arrayList3.get(i14);
                        i14++;
                        long o10 = o5.o(peer);
                        if (!hashSet.contains(Long.valueOf(o10)) && (d23 = r12.d2(o10)) != null) {
                            arrayList2.add(d23);
                            hashSet.add(Long.valueOf(o10));
                        }
                    }
                    ArrayList<TLRPC.Peer> arrayList4 = tL_contacts_found.results;
                    int size2 = arrayList4.size();
                    while (i11 < size2) {
                        TLRPC.Peer peer2 = arrayList4.get(i11);
                        i11++;
                        long o11 = o5.o(peer2);
                        if (!hashSet.contains(Long.valueOf(o11)) && (d22 = r12.d2(o11)) != null) {
                            arrayList2.add(d22);
                            hashSet.add(Long.valueOf(o11));
                        }
                    }
                }
                i2Var.p1(true, true);
                return;
        }
    }

    public u(m4.f0 f0Var, m4.w wVar, Runnable runnable) {
        this.f10771a = 17;
        this.f10772b = f0Var;
        this.f10773c = runnable;
    }
}
