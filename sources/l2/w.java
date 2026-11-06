package l2;

import a8.ia;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import hi.m2;
import li.f2;
import li.y1;
import org.telegram.messenger.a8;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLParseException;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.f4;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.i4;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.v1;
import org.telegram.ui.ActionBar.v2;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Cells.k3;
public final class w implements Runnable {
    public final int f18067a;
    public final Object f18068b;

    public w(Object obj, int i7) {
        this.f18067a = i7;
        this.f18068b = obj;
    }

    @Override
    public final void run() {
        boolean z9;
        Object obj;
        int L;
        int i7 = this.f18067a;
        Animation animation = null;
        Object obj2 = this.f18068b;
        switch (i7) {
            case 0:
                i0 i0Var = (i0) obj2;
                h2.c cVar = i0Var.C;
                Context context = i0Var.f17855e;
                String str = h2.m0.f14112a;
                int generateAudioSessionId = f2.i.d(context).generateAudioSessionId();
                if (generateAudioSessionId == -1) {
                    generateAudioSessionId = 0;
                }
                cVar.getClass();
                Looper myLooper = Looper.myLooper();
                if (myLooper == ((h2.i0) cVar.f14059c).f14096a.getLooper()) {
                    obj = cVar.f14060e;
                } else {
                    if (myLooper == ((h2.i0) cVar.f14058b).f14096a.getLooper()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    ia.p(z9);
                    obj = cVar.f14061f;
                }
                if (((Integer) obj).intValue() != generateAudioSessionId) {
                    Integer valueOf = Integer.valueOf(generateAudioSessionId);
                    cVar.f14061f = valueOf;
                    h2.b bVar = new h2.b(cVar, valueOf, 0);
                    h2.i0 i0Var2 = (h2.i0) cVar.f14059c;
                    if (i0Var2.f14096a.getLooper().getThread().isAlive()) {
                        i0Var2.d(bVar);
                    }
                    i0Var.t1(1, 10, Integer.valueOf(generateAudioSessionId));
                    i0Var.t1(2, 10, Integer.valueOf(generateAudioSessionId));
                    return;
                }
                return;
            case 1:
                i0 i0Var3 = ((c0) obj2).f17771a;
                i0Var3.x1(null);
                i0Var3.q1(0, 0);
                return;
            case 2:
                try {
                    r0.h((n1) obj2);
                    return;
                } catch (l e10) {
                    h2.a.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
                    throw new RuntimeException(e10);
                }
            case 3:
                i3 i3Var = ((k3) obj2).d;
                i3Var.requestFocus();
                org.telegram.messenger.g0.K3(i3Var);
                return;
            case 4:
                org.telegram.messenger.g0.K3(((li.v) obj2).W1.d);
                return;
            case 5:
                ((li.c0) obj2).invalidate();
                return;
            case 6:
                ga.d dVar = (ga.d) obj2;
                dVar.d = null;
                dVar.f13618e = null;
                dVar.f13619f = null;
                dVar.h = null;
                dVar.j(null);
                return;
            case 7:
                ((y1) obj2).invalidateSelf();
                return;
            case 8:
                ((f2) obj2).c();
                return;
            case 9:
                m2.e eVar = (m2.e) obj2;
                m2.a Q = eVar.Q();
                eVar.V(Q, 1028, new m2.c(Q));
                eVar.f19529f.d();
                return;
            case 10:
                ((mh.b) obj2).invalidate();
                return;
            case 11:
                ((n2.e) obj2).c();
                return;
            case 12:
                h2.r rVar = (h2.r) obj2;
                rVar.getClass();
                if (Thread.currentThread() == rVar.f14139a) {
                    rVar.e(-1, new m2.d(24));
                    return;
                }
                return;
            case 13:
                n2.q0 q0Var = (n2.q0) obj2;
                if (q0Var.f20270a0 >= 300000) {
                    q0Var.f20282n.I();
                    q0Var.f20270a0 = 0L;
                    return;
                }
                return;
            case 14:
                nh.c cVar2 = (nh.c) obj2;
                GroupCallMessage groupCallMessage = cVar2.H;
                if (groupCallMessage != null) {
                    cVar2.f20591a.a(groupCallMessage.isSendDelayed(), true);
                    cVar2.f20592b.a(cVar2.H.isSendError(), true);
                    return;
                }
                return;
            case 15:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) obj2);
                return;
            case 16:
                Drawable drawable = ActionBarLayout.f27224v1;
                org.telegram.messenger.g0.h3((ai.a1) obj2);
                return;
            case 17:
                ((org.telegram.ui.ActionBar.q0) obj2).setSelectedForDelete(false);
                return;
            case 18:
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) obj2;
                w0Var.W = true;
                org.telegram.messenger.g0.l2(new ii.c(w0Var, 13), 8.0f);
                return;
            case 19:
                ((org.telegram.ui.ActionBar.i1) obj2).c();
                return;
            case 20:
                org.telegram.ui.ActionBar.q1 q1Var = (org.telegram.ui.ActionBar.q1) obj2;
                org.telegram.ui.ActionBar.u1 u1Var = q1Var.d;
                int i10 = org.telegram.messenger.g0.f22544q.x;
                u1Var.L = i10;
                int L2 = i10 - org.telegram.messenger.g0.L(56.0f);
                if (org.telegram.messenger.g0.Q1()) {
                    if (org.telegram.messenger.g0.P1()) {
                        L = org.telegram.messenger.g0.L(446.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(496.0f);
                    }
                } else {
                    L = org.telegram.messenger.g0.L(356.0f);
                }
                int min = Math.min(L, L2);
                Rect rect = u1Var.A0;
                int i11 = min + rect.left + rect.right;
                if (u1Var.X0) {
                    ViewGroup.LayoutParams layoutParams = q1Var.getLayoutParams();
                    if (layoutParams != null && layoutParams.width != i11) {
                        layoutParams.width = i11;
                        q1Var.requestLayout();
                        return;
                    }
                    return;
                }
                Window window = u1Var.getWindow();
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
                layoutParams2.copyFrom(window.getAttributes());
                layoutParams2.width = i11;
                try {
                    window.setAttributes(layoutParams2);
                    return;
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    return;
                }
            case 21:
                x1 x1Var = (x1) obj2;
                x1Var.f28737m1.setVisibility(0);
                x1Var.f28738o1.setAlpha(0.0f);
                int i12 = x1Var.f28736k1;
                if (i12 != 0 && i12 != -1) {
                    try {
                        animation = AnimationUtils.loadAnimation(x1Var.getContext(), i12);
                    } catch (Resources.NotFoundException e11) {
                        a8.g(e11, true);
                    }
                }
                if (animation != null) {
                    x1Var.n1.startAnimation(animation);
                } else {
                    x1Var.n1.setAlpha(0.0f);
                    x1Var.n1.animate().setDuration(300L).alpha(1.0f).start();
                }
                x1Var.f28738o1.animate().setDuration(300L).alpha(1.0f).setListener(new v1(x1Var, 0)).start();
                return;
            case 22:
                v2 v2Var = (v2) ((m2) obj2).f14794c;
                DialogInterface.OnDismissListener onDismissListener = v2Var.H0;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(v2Var);
                }
                try {
                    v2Var.K();
                    return;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            case 23:
                try {
                    ((n2) obj2).f28315b.K();
                    return;
                } catch (Exception e13) {
                    a8.g(e13, true);
                    return;
                }
            case 24:
                h3 h3Var = (h3) obj2;
                if (h3Var.mo25d() != null) {
                    h3Var.mo25d().setDrawingFromOverlay(true);
                    return;
                }
                return;
            case 25:
                ((org.telegram.ui.ActionBar.k3) obj2).f();
                return;
            case 26:
                i4 i4Var = (i4) ((androidx.mediarouter.app.f0) obj2).f2722b;
                i4Var.k();
                i4Var.j();
                return;
            case 27:
                i4 i4Var2 = ((f4) obj2).f27468b;
                i4Var2.f27566c.dismiss();
                i4Var2.f27568f.removeAllViews();
                return;
            case 28:
                ((f4) obj2).f27468b.f27566c.dismiss();
                return;
            default:
                i5 i5Var = (i5) obj2;
                if (!i5Var.f27601y && i5Var.M) {
                    i5Var.c();
                    return;
                }
                return;
        }
    }

    public w(c0 c0Var, SurfaceTexture surfaceTexture) {
        this.f18067a = 1;
        this.f18068b = c0Var;
    }

    public w(r0 r0Var, n1 n1Var) {
        this.f18067a = 2;
        this.f18068b = n1Var;
    }
}
