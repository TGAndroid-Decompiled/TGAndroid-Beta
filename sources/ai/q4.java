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
public final class q4 implements Runnable {
    public final int f1542a;
    public final Object f1543b;

    public q4(com.google.android.gms.common.api.internal.m1 m1Var, c5.b0 b0Var) {
        this.f1542a = 17;
        this.f1543b = b0Var;
    }

    private final void a() {
        g6.o oVar = (g6.o) this.f1543b;
        synchronized (g6.o.f10275i) {
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
        switch (this.f1542a) {
            case 0:
                e6 e6Var = (e6) this.f1543b;
                if (e6Var.K1 && e6Var.f840b1) {
                    jc jcVar = ((ac) e6Var.Q1).d;
                    jcVar.l1 = false;
                    jcVar.P();
                    return;
                }
                return;
            case 1:
                ((zb) this.f1543b).L0 = false;
                return;
            case 2:
                oa oaVar = (oa) this.f1543b;
                oaVar.f1476b = false;
                oaVar.invalidate();
                return;
            case 3:
                try {
                    androidx.activity.l.n((androidx.activity.l) this.f1543b);
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
                androidx.biometric.e0 e0Var = (androidx.biometric.e0) this.f1543b;
                Context n10 = e0Var.n();
                if (n10 == null) {
                    Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
                    return;
                }
                e0Var.C0.f(1);
                e0Var.C0.e(n10.getString(2131689607));
                return;
            case 5:
                androidx.fragment.app.p pVar = (androidx.fragment.app.p) this.f1543b;
                pVar.f2663n0.onDismiss(pVar.f2671v0);
                return;
            case 6:
                androidx.fragment.app.s sVar = (androidx.fragment.app.s) this.f1543b;
                if (sVar.Y != null) {
                    sVar.j().getClass();
                    return;
                }
                return;
            case 7:
                ((androidx.fragment.app.k0) this.f1543b).A(true);
                return;
            case 8:
                synchronized (((androidx.lifecycle.z) this.f1543b).f2827a) {
                    obj = ((androidx.lifecycle.z) this.f1543b).f2831f;
                    ((androidx.lifecycle.z) this.f1543b).f2831f = androidx.lifecycle.z.f2826k;
                }
                ((androidx.lifecycle.z) this.f1543b).j(obj);
                return;
            case 9:
                androidx.mediarouter.app.u uVar = (androidx.mediarouter.app.u) this.f1543b;
                uVar.i(true);
                uVar.U.requestLayout();
                uVar.U.getViewTreeObserver().addOnGlobalLayoutListener(new androidx.mediarouter.app.j(uVar, 0));
                return;
            case 10:
                androidx.mediarouter.app.u uVar2 = ((androidx.mediarouter.app.s) this.f1543b).f3020b;
                if (uVar2.f3025c0 != null) {
                    uVar2.f3025c0 = null;
                    if (uVar2.f3043s0) {
                        uVar2.q(uVar2.f3044t0);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                c5.y yVar = (c5.y) this.f1543b;
                c5.c cVar = yVar.d;
                cVar.k(0);
                c5.h hVar2 = c5.g0.f4195i;
                cVar.j(24, hVar2);
                yVar.c(hVar2);
                return;
            case 12:
                qg.j jVar = ((ci.mb) this.f1543b).J0;
                if (jVar instanceof qg.v2) {
                    ((qg.v2) jVar).getEditText();
                    return;
                }
                return;
            case 13:
                com.google.android.gms.common.api.internal.g0 g0Var = (com.google.android.gms.common.api.internal.g0) this.f1543b;
                k6.e eVar = g0Var.d;
                Context context = g0Var.f6535c;
                eVar.getClass();
                if (!k6.g.f14676a.getAndSet(true)) {
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
                ((com.google.android.gms.common.api.internal.p0) this.f1543b).f();
                return;
            case 15:
                com.google.android.gms.common.api.c cVar2 = ((com.google.android.gms.common.api.internal.p0) ((a6.m) this.f1543b).f330b).f6604b;
                cVar2.d(cVar2.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 16:
                ((com.google.android.gms.common.api.internal.d1) this.f1543b).f6527j.b(new k6.a(4));
                return;
            case 17:
                return;
            case 18:
                com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.f1543b;
                xVar.f6658o.lock();
                try {
                    com.google.android.gms.common.api.internal.x.l(xVar);
                    return;
                } finally {
                    xVar.f6658o.unlock();
                }
            case 19:
                ((f6.i) this.f1543b).g(false);
                return;
            case 20:
                a();
                return;
            case 21:
                i.e eVar2 = (i.e) this.f1543b;
                eVar2.a(true);
                eVar2.invalidateSelf();
                return;
            case 22:
                if (((TaskCompletionSource) this.f1543b).trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 23:
                kg.e eVar3 = (kg.e) this.f1543b;
                eVar3.f14786f.animate().setDuration(120L).alpha(0.0f);
                eVar3.h.animate().setListener(null).start();
                if (eVar3.h.getVisibility() != 0) {
                    eVar3.h.setVisibility(0);
                    eVar3.h.setAlpha(0.0f);
                }
                eVar3.h.animate().setDuration(120L).alpha(1.0f).start();
                return;
            case 24:
                ki.s0 s0Var = (ki.s0) this.f1543b;
                if (s0Var.W == 5 && (f0Var = s0Var.S) != null && s0Var.f15063x) {
                    long J0 = f0Var.J0();
                    long j3 = s0Var.G;
                    if (J0 < j3 || J0 >= s0Var.H) {
                        s0Var.S.W0(5, j3);
                    }
                    s0Var.d.getClass();
                    s0Var.f15049i.postDelayed(this, 33L);
                    return;
                }
                return;
            case 25:
                m.r1 r1Var = (m.r1) this.f1543b;
                r1Var.f15871w = null;
                r1Var.drawableStateChanged();
                return;
            case 26:
                ActionMenuView actionMenuView = ((Toolbar) this.f1543b).f2194a;
                if (actionMenuView != null && (hVar = actionMenuView.J) != null) {
                    hVar.l();
                    return;
                }
                return;
            case 27:
                Object obj2 = ((a4.m) this.f1543b).f297b;
                return;
            case 28:
                org.telegram.ui.Cells.a0 a0Var = (org.telegram.ui.Cells.a0) this.f1543b;
                if (a0Var.f21771b == null) {
                    a0Var.f21771b = new androidx.emoji2.text.j(a0Var, 3);
                }
                androidx.emoji2.text.j jVar2 = a0Var.f21771b;
                int i10 = a0Var.f21772c + 1;
                a0Var.f21772c = i10;
                jVar2.f2522b = i10;
                a0Var.postDelayed(jVar2, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            default:
                org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) this.f1543b;
                TextView textView = v5Var.f23554b;
                textView.setTag(null);
                AnimatorSet animatorSet = new AnimatorSet();
                v5Var.d = animatorSet;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(textView, property, 0.0f), ObjectAnimator.ofFloat(v5Var.f23553a, property, 1.0f));
                v5Var.d.setDuration(250L);
                v5Var.d.setInterpolator(new DecelerateInterpolator());
                v5Var.d.addListener(new org.telegram.ui.u4(this, 9));
                v5Var.d.start();
                return;
        }
    }

    public q4(Object obj, int i10) {
        this.f1542a = i10;
        this.f1543b = obj;
    }

    public q4(a4.m mVar, int i10) {
        this.f1542a = 27;
        this.f1543b = mVar;
    }
}
