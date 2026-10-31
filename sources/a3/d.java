package a3;

import ag.h2;
import ag.i3;
import ag.j1;
import ag.m2;
import ag.t1;
import ag.v1;
import android.content.Context;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.os.Trace;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.fragment.app.u0;
import bi.o2;
import java.nio.MappedByteBuffer;
import java.util.Iterator;
import java.util.Locale;
import m.p3;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.zs;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Cells.k3;
import org.telegram.ui.Cells.m3;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.p51;
import org.telegram.ui.LaunchActivity;
import v7.r6;
import v7.x7;
import v7.y7;
import w7.m8;
public final class d implements Runnable {
    public final int f75a;
    public final Object f76b;

    public d(androidx.fragment.app.l lVar, u0 u0Var) {
        this.f75a = 15;
        this.f76b = lVar;
    }

    private final void a() {
        androidx.emoji2.text.q qVar = (androidx.emoji2.text.q) this.f76b;
        synchronized (qVar.d) {
            try {
                if (qVar.h == null) {
                    return;
                }
                try {
                    o0.h d = qVar.d();
                    int i10 = d.e;
                    if (i10 == 2) {
                        synchronized (qVar.d) {
                        }
                    }
                    if (i10 == 0) {
                        int i11 = n0.g.f13407a;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        jb.b bVar = qVar.f1407c;
                        Context context = qVar.f1405a;
                        bVar.getClass();
                        o0.h[] hVarArr = {d};
                        x7 x7Var = i0.f.f7771a;
                        m8.a("TypefaceCompat.createFromFontInfo");
                        Typeface b10 = i0.f.f7771a.b(context, hVarArr, 0);
                        Trace.endSection();
                        MappedByteBuffer e = y7.e(qVar.f1405a, d.f13925a);
                        if (e != null && b10 != null) {
                            Trace.beginSection("EmojiCompat.MetadataRepo.create");
                            ji.f fVar = new ji.f(b10, v7.u.a(e));
                            Trace.endSection();
                            Trace.endSection();
                            synchronized (qVar.d) {
                                v7.t tVar = qVar.h;
                                if (tVar != null) {
                                    tVar.b(fVar);
                                }
                            }
                            qVar.b();
                            return;
                        }
                        throw new RuntimeException("Unable to open file.");
                    }
                    throw new RuntimeException("fetchFonts result is not OK. (" + i10 + ")");
                } catch (Throwable th2) {
                    synchronized (qVar.d) {
                        try {
                            v7.t tVar2 = qVar.h;
                            if (tVar2 != null) {
                                tVar2.a(th2);
                            }
                            qVar.b();
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override
    public final void run() {
        int i10;
        String d;
        TelephonyManager telephonyManager;
        switch (this.f75a) {
            case 0:
                ((f) this.f76b).h.X();
                return;
            case 1:
                ((w) this.f76b).f202m--;
                return;
            case 2:
                r0.f72a.postVsyncCallback((e0) this.f76b);
                return;
            case 3:
                ag.f fVar = (ag.f) this.f76b;
                fVar.f504b.f30819f3.O(true);
                fVar.Z(true);
                return;
            case 4:
                org.telegram.messenger.i0.g(((TL_account.TL_businessChatLink) this.f76b).link);
                cc.a0(LaunchActivity.Q()).k(false).j();
                return;
            case 5:
                j1 j1Var = (j1) this.f76b;
                p51 p51Var = j1Var.W1;
                if (p51Var != null) {
                    p51Var.O(true);
                }
                j1Var.d1(true);
                return;
            case 6:
                t1 t1Var = (t1) ((a6.i) this.f76b).f307b;
                t1Var.f729c.f30819f3.O(true);
                t1Var.f0();
                return;
            case 7:
                v1 v1Var = (v1) this.f76b;
                v1Var.f749b.f30819f3.O(true);
                v1Var.Z(true);
                return;
            case 8:
                h2 h2Var = (h2) this.f76b;
                h2Var.f546a.f30819f3.O(true);
                h2Var.c0(true);
                return;
            case 9:
                ((m2) this.f76b).a(Boolean.FALSE);
                return;
            case 10:
                zs.f(((i3) this.f76b).f566a).k(121, new Object[0]);
                return;
            case 11:
                ((androidx.activity.m) this.f76b).invalidateOptionsMenu();
                return;
            case 12:
                androidx.activity.l lVar = (androidx.activity.l) this.f76b;
                Runnable runnable = lVar.f938b;
                if (runnable != null) {
                    runnable.run();
                    lVar.f938b = null;
                    return;
                }
                return;
            case 13:
                androidx.activity.n.a((androidx.activity.n) this.f76b);
                return;
            case 14:
                a();
                return;
            case 15:
                androidx.fragment.app.l this$0 = (androidx.fragment.app.l) this.f76b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(null, "$operation");
                this$0.a(null);
                return;
            case 16:
                Iterator it = ((androidx.fragment.app.j0) this.f76b).f1486n.iterator();
                if (!it.hasNext()) {
                    return;
                }
                throw a1.g.h(it);
            case 17:
                androidx.lifecycle.e0 e0Var = (androidx.lifecycle.e0) this.f76b;
                androidx.lifecycle.v vVar = e0Var.f1620f;
                if (e0Var.f1618b == 0) {
                    e0Var.f1619c = true;
                    vVar.e(androidx.lifecycle.m.ON_PAUSE);
                }
                if (e0Var.f1617a == 0 && e0Var.f1619c) {
                    vVar.e(androidx.lifecycle.m.ON_STOP);
                    e0Var.d = true;
                    return;
                }
                return;
            case 18:
                k3 k3Var = ((m3) this.f76b).d;
                k3Var.requestFocus();
                org.telegram.messenger.i0.J3(k3Var);
                return;
            case 19:
                org.telegram.messenger.i0.J3(((bi.z) this.f76b).W1.d);
                return;
            case 20:
                ((bi.g0) this.f76b).invalidate();
                return;
            case 21:
                p3 p3Var = (p3) this.f76b;
                p3Var.f12520c = null;
                p3Var.d = null;
                p3Var.e = null;
                p3Var.f12521f = null;
                p3Var.e(null);
                return;
            case 22:
                ((bi.h2) this.f76b).invalidateSelf();
                return;
            case 23:
                ((o2) this.f76b).c();
                return;
            case 24:
                ((c1.d) this.f76b).e().g(new w0.h(2, "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                return;
            case 25:
                ac.a aVar = (ac.a) this.f76b;
                ((Context) aVar.f363b).unregisterReceiver((c2.a) aVar.f364c);
                return;
            case 26:
                c2.a aVar2 = (c2.a) this.f76b;
                if (aVar2.f3525c.f362a) {
                    aVar2.f3523a.f7821a.C1(3, false);
                    return;
                }
                return;
            case 27:
                ((ch.b) this.f76b).invalidate();
                return;
            case 28:
                dh.d dVar = (dh.d) this.f76b;
                GroupCallMessage groupCallMessage = dVar.H;
                if (groupCallMessage != null) {
                    dVar.f5935a.a(groupCallMessage.isSendDelayed(), true);
                    dVar.f5936b.a(dVar.H.isSendError(), true);
                    return;
                }
                return;
            default:
                e2.v vVar2 = (e2.v) this.f76b;
                y2.e eVar = (y2.e) vVar2.f6198a.get();
                if (eVar != null) {
                    int b10 = vVar2.f6200c.b();
                    y2.f fVar2 = eVar.f54137a;
                    synchronized (fVar2) {
                        synchronized (fVar2) {
                            int i11 = fVar2.f54154n;
                            if (i11 == 0 || fVar2.e) {
                                if (i11 != b10 || fVar2.f54155o == null) {
                                    fVar2.f54154n = b10;
                                    if (b10 != 1 && b10 != 0 && b10 != 8) {
                                        if (fVar2.f54155o == null) {
                                            Context context = fVar2.f54144a;
                                            String str = e2.l0.f6165a;
                                            if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                                if (!TextUtils.isEmpty(networkCountryIso)) {
                                                    d = r6.d(networkCountryIso);
                                                    fVar2.f54155o = d;
                                                }
                                            }
                                            d = r6.d(Locale.getDefault().getCountry());
                                            fVar2.f54155o = d;
                                        }
                                        fVar2.f54152l = fVar2.b(b10);
                                        fVar2.d.getClass();
                                        long elapsedRealtime = SystemClock.elapsedRealtime();
                                        if (fVar2.f54148g > 0) {
                                            i10 = (int) (elapsedRealtime - fVar2.h);
                                        } else {
                                            i10 = 0;
                                        }
                                        fVar2.d(fVar2.f54149i, i10, fVar2.f54152l);
                                        fVar2.h = elapsedRealtime;
                                        fVar2.f54149i = 0L;
                                        fVar2.f54151k = 0L;
                                        fVar2.f54150j = 0L;
                                        y2.q qVar = fVar2.f54147f;
                                        qVar.f54175a.clear();
                                        qVar.f54177c = -1;
                                        qVar.d = 0;
                                        qVar.e = 0;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
                return;
        }
    }

    public d(Object obj, int i10) {
        this.f75a = i10;
        this.f76b = obj;
    }
}
