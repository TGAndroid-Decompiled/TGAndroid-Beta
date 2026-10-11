package ai;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.NotificationManager;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Property;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
public final class r4 implements Runnable {
    public final int f1653a;
    public final Object f1654b;

    public r4(com.google.android.gms.common.api.internal.m1 m1Var, c5.b0 b0Var) {
        this.f1653a = 17;
        this.f1654b = b0Var;
    }

    private final void a() {
        g6.o oVar = (g6.o) this.f1654b;
        synchronized (g6.o.f10348i) {
            try {
                if (!oVar.d()) {
                    return;
                }
                oVar.f(15);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        Object obj;
        i2.f0 f0Var;
        m.h hVar;
        switch (this.f1653a) {
            case 0:
                f6 f6Var = (f6) this.f1654b;
                if (f6Var.K1 && f6Var.f951b1) {
                    kc kcVar = ((bc) f6Var.Q1).d;
                    kcVar.l1 = false;
                    kcVar.P();
                    return;
                }
                return;
            case 1:
                ((ac) this.f1654b).L0 = false;
                return;
            case 2:
                pa paVar = (pa) this.f1654b;
                paVar.f1587b = false;
                paVar.invalidate();
                return;
            case 3:
                try {
                    androidx.activity.l.n((androidx.activity.l) this.f1654b);
                    return;
                } catch (IllegalStateException e7) {
                    if (TextUtils.equals(e7.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        return;
                    }
                    throw e7;
                } catch (NullPointerException e10) {
                    if (!TextUtils.equals(e10.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e10;
                    }
                    return;
                }
            case 4:
                androidx.biometric.e0 e0Var = (androidx.biometric.e0) this.f1654b;
                Context n10 = e0Var.n();
                if (n10 == null) {
                    Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
                    return;
                }
                e0Var.C0.f(1);
                e0Var.C0.e(n10.getString(2131689607));
                return;
            case 5:
                androidx.fragment.app.p pVar = (androidx.fragment.app.p) this.f1654b;
                pVar.f2742n0.onDismiss(pVar.f2750v0);
                return;
            case 6:
                androidx.fragment.app.s sVar = (androidx.fragment.app.s) this.f1654b;
                if (sVar.Y != null) {
                    sVar.j().getClass();
                    return;
                }
                return;
            case 7:
                ((androidx.fragment.app.k0) this.f1654b).A(true);
                return;
            case 8:
                synchronized (((androidx.lifecycle.z) this.f1654b).f2906a) {
                    obj = ((androidx.lifecycle.z) this.f1654b).f2910f;
                    ((androidx.lifecycle.z) this.f1654b).f2910f = androidx.lifecycle.z.f2905k;
                }
                ((androidx.lifecycle.z) this.f1654b).j(obj);
                return;
            case 9:
                androidx.mediarouter.app.u uVar = (androidx.mediarouter.app.u) this.f1654b;
                uVar.i(true);
                uVar.U.requestLayout();
                uVar.U.getViewTreeObserver().addOnGlobalLayoutListener(new androidx.mediarouter.app.j(uVar, 0));
                return;
            case 10:
                androidx.mediarouter.app.u uVar2 = ((androidx.mediarouter.app.s) this.f1654b).f3099b;
                if (uVar2.f3104c0 != null) {
                    uVar2.f3104c0 = null;
                    if (uVar2.f3122s0) {
                        uVar2.q(uVar2.f3123t0);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                c5.y yVar = (c5.y) this.f1654b;
                c5.c cVar = yVar.d;
                cVar.k(0);
                c5.h hVar2 = c5.g0.f4245i;
                cVar.j(24, hVar2);
                yVar.c(hVar2);
                return;
            case 12:
                qg.j jVar = ((ci.nb) this.f1654b).J0;
                if (jVar instanceof qg.v2) {
                    ((qg.v2) jVar).getEditText();
                    return;
                }
                return;
            case 13:
                com.google.android.gms.common.api.internal.g0 g0Var = (com.google.android.gms.common.api.internal.g0) this.f1654b;
                k6.e eVar = g0Var.d;
                Context context = g0Var.f6587c;
                eVar.getClass();
                if (!k6.g.f14708a.getAndSet(true)) {
                    try {
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                        if (notificationManager != null) {
                            notificationManager.cancel(10436);
                            return;
                        }
                        return;
                    } catch (SecurityException e11) {
                        Log.d("GooglePlayServicesUtil", "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications.", e11);
                        return;
                    }
                }
                return;
            case 14:
                ((com.google.android.gms.common.api.internal.p0) this.f1654b).f();
                return;
            case 15:
                com.google.android.gms.common.api.c cVar2 = ((com.google.android.gms.common.api.internal.p0) ((xa.c) this.f1654b).f51194b).f6656b;
                cVar2.e(cVar2.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 16:
                ((com.google.android.gms.common.api.internal.d1) this.f1654b).f6579j.b(new k6.a(4));
                return;
            case 17:
                return;
            case 18:
                com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.f1654b;
                xVar.f6710o.lock();
                try {
                    com.google.android.gms.common.api.internal.x.l(xVar);
                    return;
                } finally {
                    xVar.f6710o.unlock();
                }
            case 19:
                ((f6.i) this.f1654b).g(false);
                return;
            case 20:
                a();
                return;
            case 21:
                i.e eVar2 = (i.e) this.f1654b;
                eVar2.a(true);
                eVar2.invalidateSelf();
                return;
            case 22:
                if (((TaskCompletionSource) this.f1654b).trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 23:
                kg.e eVar3 = (kg.e) this.f1654b;
                eVar3.f14833f.animate().setDuration(120L).alpha(0.0f);
                eVar3.h.animate().setListener(null).start();
                if (eVar3.h.getVisibility() != 0) {
                    eVar3.h.setVisibility(0);
                    eVar3.h.setAlpha(0.0f);
                }
                eVar3.h.animate().setDuration(120L).alpha(1.0f).start();
                return;
            case 24:
                ki.t0 t0Var = (ki.t0) this.f1654b;
                if (t0Var.W == 5 && (f0Var = t0Var.S) != null && t0Var.f15136x) {
                    long J0 = f0Var.J0();
                    long j3 = t0Var.G;
                    if (J0 < j3 || J0 >= t0Var.H) {
                        t0Var.S.W0(5, j3);
                    }
                    t0Var.d.getClass();
                    t0Var.f15122i.postDelayed(this, 33L);
                    return;
                }
                return;
            case 25:
                m.r1 r1Var = (m.r1) this.f1654b;
                r1Var.f15834w = null;
                r1Var.drawableStateChanged();
                return;
            case 26:
                ActionMenuView actionMenuView = ((Toolbar) this.f1654b).f2273a;
                if (actionMenuView != null && (hVar = actionMenuView.J) != null) {
                    hVar.l();
                    return;
                }
                return;
            case 27:
                Object obj2 = ((xa.c) this.f1654b).f51194b;
                return;
            case 28:
                org.telegram.ui.Cells.a0 a0Var = (org.telegram.ui.Cells.a0) this.f1654b;
                if (a0Var.f21768b == null) {
                    a0Var.f21768b = new androidx.emoji2.text.j(a0Var, 3);
                }
                androidx.emoji2.text.j jVar2 = a0Var.f21768b;
                int i10 = a0Var.f21769c + 1;
                a0Var.f21769c = i10;
                jVar2.f2601b = i10;
                a0Var.postDelayed(jVar2, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            default:
                org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) this.f1654b;
                TextView textView = v5Var.f23535b;
                textView.setTag(null);
                AnimatorSet animatorSet = new AnimatorSet();
                v5Var.d = animatorSet;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(textView, property, 0.0f), ObjectAnimator.ofFloat(v5Var.f23534a, property, 1.0f));
                v5Var.d.setDuration(250L);
                v5Var.d.setInterpolator(new DecelerateInterpolator());
                v5Var.d.addListener(new org.telegram.ui.s4(this, 9));
                v5Var.d.start();
                return;
        }
    }

    public r4(Object obj, int i10) {
        this.f1653a = i10;
        this.f1654b = obj;
    }

    public r4(xa.c cVar, int i10) {
        this.f1653a = 27;
        this.f1654b = cVar;
    }
}
