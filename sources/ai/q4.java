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
    public final int f1416a;
    public final Object f1417b;

    public q4(com.google.android.gms.common.api.internal.m1 m1Var, c5.b0 b0Var) {
        this.f1416a = 17;
        this.f1417b = b0Var;
    }

    private final void a() {
        g6.o oVar = (g6.o) this.f1417b;
        synchronized (g6.o.f9449i) {
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
        switch (this.f1416a) {
            case 0:
                f6 f6Var = (f6) this.f1417b;
                if (f6Var.K1 && f6Var.f794b1) {
                    jc jcVar = ((ac) f6Var.Q1).d;
                    jcVar.l1 = false;
                    jcVar.P();
                    return;
                }
                return;
            case 1:
                ((zb) this.f1417b).L0 = false;
                return;
            case 2:
                oa oaVar = (oa) this.f1417b;
                oaVar.f1361b = false;
                oaVar.invalidate();
                return;
            case 3:
                try {
                    androidx.activity.l.n((androidx.activity.l) this.f1417b);
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
                androidx.biometric.e0 e0Var = (androidx.biometric.e0) this.f1417b;
                Context n10 = e0Var.n();
                if (n10 == null) {
                    Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
                    return;
                }
                e0Var.C0.f(1);
                e0Var.C0.e(n10.getString(2131689607));
                return;
            case 5:
                androidx.fragment.app.p pVar = (androidx.fragment.app.p) this.f1417b;
                pVar.f2461n0.onDismiss(pVar.f2469v0);
                return;
            case 6:
                androidx.fragment.app.s sVar = (androidx.fragment.app.s) this.f1417b;
                if (sVar.Y != null) {
                    sVar.j().getClass();
                    return;
                }
                return;
            case 7:
                ((androidx.fragment.app.k0) this.f1417b).A(true);
                return;
            case 8:
                synchronized (((androidx.lifecycle.z) this.f1417b).f2612a) {
                    obj = ((androidx.lifecycle.z) this.f1417b).f2615f;
                    ((androidx.lifecycle.z) this.f1417b).f2615f = androidx.lifecycle.z.f2611k;
                }
                ((androidx.lifecycle.z) this.f1417b).j(obj);
                return;
            case 9:
                androidx.mediarouter.app.u uVar = (androidx.mediarouter.app.u) this.f1417b;
                uVar.i(true);
                uVar.U.requestLayout();
                uVar.U.getViewTreeObserver().addOnGlobalLayoutListener(new androidx.mediarouter.app.j(uVar, 0));
                return;
            case 10:
                androidx.mediarouter.app.u uVar2 = ((androidx.mediarouter.app.s) this.f1417b).f2794b;
                if (uVar2.f2799c0 != null) {
                    uVar2.f2799c0 = null;
                    if (uVar2.f2817s0) {
                        uVar2.q(uVar2.f2818t0);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                c5.y yVar = (c5.y) this.f1417b;
                c5.c cVar = yVar.d;
                cVar.k(0);
                c5.h hVar2 = c5.g0.f3881i;
                cVar.j(24, hVar2);
                yVar.c(hVar2);
                return;
            case 12:
                qg.j jVar = ((ci.qb) this.f1417b).J0;
                if (jVar instanceof qg.x2) {
                    ((qg.x2) jVar).getEditText();
                    return;
                }
                return;
            case 13:
                com.google.android.gms.common.api.internal.g0 g0Var = (com.google.android.gms.common.api.internal.g0) this.f1417b;
                k6.e eVar = g0Var.d;
                Context context = g0Var.f6077c;
                eVar.getClass();
                if (!k6.g.f13511a.getAndSet(true)) {
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
                ((com.google.android.gms.common.api.internal.p0) this.f1417b).f();
                return;
            case 15:
                com.google.android.gms.common.api.c cVar2 = ((com.google.android.gms.common.api.internal.p0) ((a6.m) this.f1417b).f305b).f6142b;
                cVar2.d(cVar2.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 16:
                ((com.google.android.gms.common.api.internal.d1) this.f1417b).f6069j.b(new k6.a(4));
                return;
            case 17:
                return;
            case 18:
                com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.f1417b;
                xVar.f6192o.lock();
                try {
                    com.google.android.gms.common.api.internal.x.l(xVar);
                    return;
                } finally {
                    xVar.f6192o.unlock();
                }
            case 19:
                ((f6.i) this.f1417b).g(false);
                return;
            case 20:
                a();
                return;
            case 21:
                i.e eVar2 = (i.e) this.f1417b;
                eVar2.a(true);
                eVar2.invalidateSelf();
                return;
            case 22:
                if (((TaskCompletionSource) this.f1417b).trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 23:
                kg.e eVar3 = (kg.e) this.f1417b;
                eVar3.f13611f.animate().setDuration(120L).alpha(0.0f);
                eVar3.h.animate().setListener(null).start();
                if (eVar3.h.getVisibility() != 0) {
                    eVar3.h.setVisibility(0);
                    eVar3.h.setAlpha(0.0f);
                }
                eVar3.h.animate().setDuration(120L).alpha(1.0f).start();
                return;
            case 24:
                m.r1 r1Var = (m.r1) this.f1417b;
                r1Var.f14300w = null;
                r1Var.drawableStateChanged();
                return;
            case 25:
                ActionMenuView actionMenuView = ((Toolbar) this.f1417b).f2020a;
                if (actionMenuView != null && (hVar = actionMenuView.J) != null) {
                    hVar.l();
                    return;
                }
                return;
            case 26:
                Object obj2 = ((a6.i) this.f1417b).f301b;
                return;
            case 27:
                org.telegram.ui.Cells.a0 a0Var = (org.telegram.ui.Cells.a0) this.f1417b;
                if (a0Var.f19779b == null) {
                    a0Var.f19779b = new androidx.emoji2.text.j(a0Var, 3);
                }
                androidx.emoji2.text.j jVar2 = a0Var.f19779b;
                int i10 = a0Var.f19780c + 1;
                a0Var.f19780c = i10;
                jVar2.f2329b = i10;
                a0Var.postDelayed(jVar2, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 28:
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) this.f1417b;
                TextView textView = u5Var.f21430b;
                textView.setTag(null);
                AnimatorSet animatorSet = new AnimatorSet();
                u5Var.d = animatorSet;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(textView, property, 0.0f), ObjectAnimator.ofFloat(u5Var.f21429a, property, 1.0f));
                u5Var.d.setDuration(250L);
                u5Var.d.setInterpolator(new DecelerateInterpolator());
                u5Var.d.addListener(new org.telegram.ui.t4(this, 9));
                u5Var.d.start();
                return;
            default:
                org.telegram.ui.Cells.t6 t6Var = (org.telegram.ui.Cells.t6) this.f1417b;
                t6Var.a();
                RectF rectF = t6Var.f21364f;
                t6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(t6Var.v, 1000L);
                return;
        }
    }

    public q4(Object obj, int i10) {
        this.f1416a = i10;
        this.f1417b = obj;
    }

    public q4(a6.i iVar, int i10) {
        this.f1416a = 26;
        this.f1417b = iVar;
    }
}
