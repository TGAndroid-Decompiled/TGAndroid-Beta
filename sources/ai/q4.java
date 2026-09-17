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
public final class q4 implements Runnable {
    public final int f1421a;
    public final Object f1422b;

    public q4(com.google.android.gms.common.api.internal.m1 m1Var, c5.b0 b0Var) {
        this.f1421a = 17;
        this.f1422b = b0Var;
    }

    private final void a() {
        g6.o oVar = (g6.o) this.f1422b;
        synchronized (g6.o.f9454i) {
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
        switch (this.f1421a) {
            case 0:
                f6 f6Var = (f6) this.f1422b;
                if (f6Var.K1 && f6Var.f799b1) {
                    jc jcVar = ((ac) f6Var.Q1).d;
                    jcVar.l1 = false;
                    jcVar.P();
                    return;
                }
                return;
            case 1:
                ((zb) this.f1422b).L0 = false;
                return;
            case 2:
                oa oaVar = (oa) this.f1422b;
                oaVar.f1366b = false;
                oaVar.invalidate();
                return;
            case 3:
                try {
                    androidx.activity.l.n((androidx.activity.l) this.f1422b);
                    return;
                } catch (IllegalStateException e) {
                    if (TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        return;
                    }
                    throw e;
                } catch (NullPointerException e7) {
                    if (!TextUtils.equals(e7.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e7;
                    }
                    return;
                }
            case 4:
                androidx.biometric.e0 e0Var = (androidx.biometric.e0) this.f1422b;
                Context n10 = e0Var.n();
                if (n10 == null) {
                    Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
                    return;
                }
                e0Var.C0.f(1);
                e0Var.C0.e(n10.getString(2131689607));
                return;
            case 5:
                androidx.fragment.app.p pVar = (androidx.fragment.app.p) this.f1422b;
                pVar.f2466n0.onDismiss(pVar.f2474v0);
                return;
            case 6:
                androidx.fragment.app.s sVar = (androidx.fragment.app.s) this.f1422b;
                if (sVar.Y != null) {
                    sVar.j().getClass();
                    return;
                }
                return;
            case 7:
                ((androidx.fragment.app.k0) this.f1422b).A(true);
                return;
            case 8:
                synchronized (((androidx.lifecycle.z) this.f1422b).f2617a) {
                    obj = ((androidx.lifecycle.z) this.f1422b).f2620f;
                    ((androidx.lifecycle.z) this.f1422b).f2620f = androidx.lifecycle.z.f2616k;
                }
                ((androidx.lifecycle.z) this.f1422b).j(obj);
                return;
            case 9:
                androidx.mediarouter.app.u uVar = (androidx.mediarouter.app.u) this.f1422b;
                uVar.i(true);
                uVar.U.requestLayout();
                uVar.U.getViewTreeObserver().addOnGlobalLayoutListener(new androidx.mediarouter.app.j(uVar, 0));
                return;
            case 10:
                androidx.mediarouter.app.u uVar2 = ((androidx.mediarouter.app.s) this.f1422b).f2799b;
                if (uVar2.f2804c0 != null) {
                    uVar2.f2804c0 = null;
                    if (uVar2.f2822s0) {
                        uVar2.q(uVar2.f2823t0);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                c5.y yVar = (c5.y) this.f1422b;
                c5.c cVar = yVar.d;
                cVar.k(0);
                c5.h hVar2 = c5.g0.f3886i;
                cVar.j(24, hVar2);
                yVar.c(hVar2);
                return;
            case 12:
                qg.j jVar = ((ci.qb) this.f1422b).J0;
                if (jVar instanceof qg.x2) {
                    ((qg.x2) jVar).getEditText();
                    return;
                }
                return;
            case 13:
                com.google.android.gms.common.api.internal.g0 g0Var = (com.google.android.gms.common.api.internal.g0) this.f1422b;
                k6.e eVar = g0Var.d;
                Context context = g0Var.f6082c;
                eVar.getClass();
                if (!k6.g.f13514a.getAndSet(true)) {
                    try {
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                        if (notificationManager != null) {
                            notificationManager.cancel(10436);
                            return;
                        }
                        return;
                    } catch (SecurityException e10) {
                        Log.d("GooglePlayServicesUtil", "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications.", e10);
                        return;
                    }
                }
                return;
            case 14:
                ((com.google.android.gms.common.api.internal.p0) this.f1422b).f();
                return;
            case 15:
                com.google.android.gms.common.api.c cVar2 = ((com.google.android.gms.common.api.internal.p0) ((a6.m) this.f1422b).f307b).f6147b;
                cVar2.d(cVar2.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 16:
                ((com.google.android.gms.common.api.internal.d1) this.f1422b).f6074j.b(new k6.a(4));
                return;
            case 17:
                return;
            case 18:
                com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.f1422b;
                xVar.f6197o.lock();
                try {
                    com.google.android.gms.common.api.internal.x.l(xVar);
                    return;
                } finally {
                    xVar.f6197o.unlock();
                }
            case 19:
                ((f6.i) this.f1422b).g(false);
                return;
            case 20:
                a();
                return;
            case 21:
                i.e eVar2 = (i.e) this.f1422b;
                eVar2.a(true);
                eVar2.invalidateSelf();
                return;
            case 22:
                if (((TaskCompletionSource) this.f1422b).trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 23:
                kg.e eVar3 = (kg.e) this.f1422b;
                eVar3.f13614f.animate().setDuration(120L).alpha(0.0f);
                eVar3.h.animate().setListener(null).start();
                if (eVar3.h.getVisibility() != 0) {
                    eVar3.h.setVisibility(0);
                    eVar3.h.setAlpha(0.0f);
                }
                eVar3.h.animate().setDuration(120L).alpha(1.0f).start();
                return;
            case 24:
                m.r1 r1Var = (m.r1) this.f1422b;
                r1Var.f14311w = null;
                r1Var.drawableStateChanged();
                return;
            case 25:
                ActionMenuView actionMenuView = ((Toolbar) this.f1422b).f2025a;
                if (actionMenuView != null && (hVar = actionMenuView.J) != null) {
                    hVar.l();
                    return;
                }
                return;
            case 26:
                Object obj2 = ((a6.i) this.f1422b).f303b;
                return;
            case 27:
                org.telegram.ui.Cells.a0 a0Var = (org.telegram.ui.Cells.a0) this.f1422b;
                if (a0Var.f19789b == null) {
                    a0Var.f19789b = new androidx.emoji2.text.j(a0Var, 3);
                }
                androidx.emoji2.text.j jVar2 = a0Var.f19789b;
                int i10 = a0Var.f19790c + 1;
                a0Var.f19790c = i10;
                jVar2.f2334b = i10;
                a0Var.postDelayed(jVar2, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 28:
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) this.f1422b;
                TextView textView = u5Var.f21440b;
                textView.setTag(null);
                AnimatorSet animatorSet = new AnimatorSet();
                u5Var.d = animatorSet;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(textView, property, 0.0f), ObjectAnimator.ofFloat(u5Var.f21439a, property, 1.0f));
                u5Var.d.setDuration(250L);
                u5Var.d.setInterpolator(new DecelerateInterpolator());
                u5Var.d.addListener(new org.telegram.ui.t4(this, 9));
                u5Var.d.start();
                return;
            default:
                org.telegram.ui.Cells.t6 t6Var = (org.telegram.ui.Cells.t6) this.f1422b;
                t6Var.a();
                RectF rectF = t6Var.f21374f;
                t6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(t6Var.v, 1000L);
                return;
        }
    }

    public q4(Object obj, int i10) {
        this.f1421a = i10;
        this.f1422b = obj;
    }

    public q4(a6.i iVar, int i10) {
        this.f1421a = 26;
        this.f1422b = iVar;
    }
}
