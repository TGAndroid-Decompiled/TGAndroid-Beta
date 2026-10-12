package ai;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.RectF;
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
import org.telegram.messenger.AndroidUtilities;
public final class r4 implements Runnable {
    public final int f1651a;
    public final Object f1652b;

    public r4(com.google.android.gms.common.api.internal.m1 m1Var, c5.b0 b0Var) {
        this.f1651a = 17;
        this.f1652b = b0Var;
    }

    private final void a() {
        g6.o oVar = (g6.o) this.f1652b;
        synchronized (g6.o.f10347i) {
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
        m.h hVar;
        switch (this.f1651a) {
            case 0:
                f6 f6Var = (f6) this.f1652b;
                if (f6Var.K1 && f6Var.f949b1) {
                    kc kcVar = ((bc) f6Var.Q1).d;
                    kcVar.l1 = false;
                    kcVar.P();
                    return;
                }
                return;
            case 1:
                ((ac) this.f1652b).L0 = false;
                return;
            case 2:
                pa paVar = (pa) this.f1652b;
                paVar.f1585b = false;
                paVar.invalidate();
                return;
            case 3:
                try {
                    androidx.activity.l.n((androidx.activity.l) this.f1652b);
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
                androidx.biometric.e0 e0Var = (androidx.biometric.e0) this.f1652b;
                Context n10 = e0Var.n();
                if (n10 == null) {
                    Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
                    return;
                }
                e0Var.C0.f(1);
                e0Var.C0.e(n10.getString(2131689607));
                return;
            case 5:
                androidx.fragment.app.p pVar = (androidx.fragment.app.p) this.f1652b;
                pVar.f2740n0.onDismiss(pVar.f2748v0);
                return;
            case 6:
                androidx.fragment.app.s sVar = (androidx.fragment.app.s) this.f1652b;
                if (sVar.Y != null) {
                    sVar.j().getClass();
                    return;
                }
                return;
            case 7:
                ((androidx.fragment.app.k0) this.f1652b).A(true);
                return;
            case 8:
                synchronized (((androidx.lifecycle.z) this.f1652b).f2904a) {
                    obj = ((androidx.lifecycle.z) this.f1652b).f2908f;
                    ((androidx.lifecycle.z) this.f1652b).f2908f = androidx.lifecycle.z.f2903k;
                }
                ((androidx.lifecycle.z) this.f1652b).j(obj);
                return;
            case 9:
                androidx.mediarouter.app.u uVar = (androidx.mediarouter.app.u) this.f1652b;
                uVar.i(true);
                uVar.U.requestLayout();
                uVar.U.getViewTreeObserver().addOnGlobalLayoutListener(new androidx.mediarouter.app.j(uVar, 0));
                return;
            case 10:
                androidx.mediarouter.app.u uVar2 = ((androidx.mediarouter.app.s) this.f1652b).f3097b;
                if (uVar2.f3102c0 != null) {
                    uVar2.f3102c0 = null;
                    if (uVar2.f3120s0) {
                        uVar2.q(uVar2.f3121t0);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                c5.y yVar = (c5.y) this.f1652b;
                c5.c cVar = yVar.d;
                cVar.k(0);
                c5.h hVar2 = c5.g0.f4244i;
                cVar.j(24, hVar2);
                yVar.c(hVar2);
                return;
            case 12:
                qg.j jVar = ((ci.nb) this.f1652b).J0;
                if (jVar instanceof qg.w2) {
                    ((qg.w2) jVar).getEditText();
                    return;
                }
                return;
            case 13:
                com.google.android.gms.common.api.internal.g0 g0Var = (com.google.android.gms.common.api.internal.g0) this.f1652b;
                k6.e eVar = g0Var.d;
                Context context = g0Var.f6586c;
                eVar.getClass();
                if (!k6.g.f14705a.getAndSet(true)) {
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
                ((com.google.android.gms.common.api.internal.p0) this.f1652b).f();
                return;
            case 15:
                com.google.android.gms.common.api.c cVar2 = ((com.google.android.gms.common.api.internal.p0) ((xa.c) this.f1652b).f51335b).f6655b;
                cVar2.e(cVar2.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 16:
                ((com.google.android.gms.common.api.internal.d1) this.f1652b).f6578j.b(new k6.a(4));
                return;
            case 17:
                return;
            case 18:
                com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.f1652b;
                xVar.f6709o.lock();
                try {
                    com.google.android.gms.common.api.internal.x.l(xVar);
                    return;
                } finally {
                    xVar.f6709o.unlock();
                }
            case 19:
                ((f6.i) this.f1652b).g(false);
                return;
            case 20:
                a();
                return;
            case 21:
                i.e eVar2 = (i.e) this.f1652b;
                eVar2.a(true);
                eVar2.invalidateSelf();
                return;
            case 22:
                if (((TaskCompletionSource) this.f1652b).trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 23:
                kg.e eVar3 = (kg.e) this.f1652b;
                eVar3.f14830f.animate().setDuration(120L).alpha(0.0f);
                eVar3.h.animate().setListener(null).start();
                if (eVar3.h.getVisibility() != 0) {
                    eVar3.h.setVisibility(0);
                    eVar3.h.setAlpha(0.0f);
                }
                eVar3.h.animate().setDuration(120L).alpha(1.0f).start();
                return;
            case 24:
                m.s1 s1Var = (m.s1) this.f1652b;
                s1Var.f15572w = null;
                s1Var.drawableStateChanged();
                return;
            case 25:
                ActionMenuView actionMenuView = ((Toolbar) this.f1652b).f2271a;
                if (actionMenuView != null && (hVar = actionMenuView.J) != null) {
                    hVar.l();
                    return;
                }
                return;
            case 26:
                Object obj2 = ((xa.c) this.f1652b).f51335b;
                return;
            case 27:
                org.telegram.ui.Cells.a0 a0Var = (org.telegram.ui.Cells.a0) this.f1652b;
                if (a0Var.f21542b == null) {
                    a0Var.f21542b = new androidx.emoji2.text.j(a0Var, 3);
                }
                androidx.emoji2.text.j jVar2 = a0Var.f21542b;
                int i10 = a0Var.f21543c + 1;
                a0Var.f21543c = i10;
                jVar2.f2599b = i10;
                a0Var.postDelayed(jVar2, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 28:
                org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) this.f1652b;
                TextView textView = v5Var.f23315b;
                textView.setTag(null);
                AnimatorSet animatorSet = new AnimatorSet();
                v5Var.d = animatorSet;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(textView, property, 0.0f), ObjectAnimator.ofFloat(v5Var.f23314a, property, 1.0f));
                v5Var.d.setDuration(250L);
                v5Var.d.setInterpolator(new DecelerateInterpolator());
                v5Var.d.addListener(new org.telegram.ui.w4(this, 9));
                v5Var.d.start();
                return;
            default:
                org.telegram.ui.Cells.t6 t6Var = (org.telegram.ui.Cells.t6) this.f1652b;
                t6Var.a();
                RectF rectF = t6Var.f22826f;
                t6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(t6Var.v, 1000L);
                return;
        }
    }

    public r4(Object obj, int i10) {
        this.f1651a = i10;
        this.f1652b = obj;
    }

    public r4(xa.c cVar, int i10) {
        this.f1651a = 26;
        this.f1652b = cVar;
    }
}
