package l2;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import hi.m2;
import java.util.concurrent.CountDownLatch;
import li.f2;
import li.y1;
import org.telegram.messenger.a8;
import org.telegram.messenger.qs;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLParseException;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.f4;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.i4;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.v1;
import org.telegram.ui.ActionBar.v2;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Cells.k3;
public final class a0 implements Runnable {
    public final int f17740a;
    public final Object f17741b;

    public a0(Object obj, int i7) {
        this.f17740a = i7;
        this.f17741b = obj;
    }

    @Override
    public final void run() {
        int L;
        int i7 = this.f17740a;
        Animation animation = null;
        Object obj = this.f17741b;
        switch (i7) {
            case 0:
                i0 i0Var = ((c0) obj).f17772a;
                i0Var.x1(null);
                i0Var.q1(0, 0);
                return;
            case 1:
                try {
                    r0.h((n1) obj);
                    return;
                } catch (l e10) {
                    h2.a.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
                    throw new RuntimeException(e10);
                }
            case 2:
                i3 i3Var = ((k3) obj).d;
                i3Var.requestFocus();
                org.telegram.messenger.g0.K3(i3Var);
                return;
            case 3:
                org.telegram.messenger.g0.K3(((li.v) obj).W1.d);
                return;
            case 4:
                ((li.c0) obj).invalidate();
                return;
            case 5:
                ga.d dVar = (ga.d) obj;
                dVar.d = null;
                dVar.f13618e = null;
                dVar.f13619f = null;
                dVar.h = null;
                dVar.j(null);
                return;
            case 6:
                ((y1) obj).invalidateSelf();
                return;
            case 7:
                ((f2) obj).c();
                return;
            case 8:
                m2.e eVar = (m2.e) obj;
                m2.a Q = eVar.Q();
                eVar.V(Q, 1028, new m2.c(Q));
                eVar.f19532f.d();
                return;
            case 9:
                ((mh.b) obj).invalidate();
                return;
            case 10:
                ((n2.e) obj).c();
                return;
            case 11:
                h2.r rVar = (h2.r) obj;
                rVar.getClass();
                if (Thread.currentThread() == rVar.f14139a) {
                    rVar.e(-1, new m2.d(24));
                    return;
                }
                return;
            case 12:
                n2.q0 q0Var = (n2.q0) obj;
                if (q0Var.f20273a0 >= 300000) {
                    q0Var.f20285n.I();
                    q0Var.f20273a0 = 0L;
                    return;
                }
                return;
            case 13:
                nh.c cVar = (nh.c) obj;
                GroupCallMessage groupCallMessage = cVar.H;
                if (groupCallMessage != null) {
                    cVar.f20594a.a(groupCallMessage.isSendDelayed(), true);
                    cVar.f20595b.a(cVar.H.isSendError(), true);
                    return;
                }
                return;
            case 14:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) obj);
                return;
            case 15:
                Drawable drawable = ActionBarLayout.f27227v1;
                org.telegram.messenger.g0.h3((ai.a1) obj);
                return;
            case 16:
                ((org.telegram.ui.ActionBar.q0) obj).setSelectedForDelete(false);
                return;
            case 17:
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) obj;
                w0Var.W = true;
                org.telegram.messenger.g0.l2(new ii.c(w0Var, 13), 8.0f);
                return;
            case 18:
                ((org.telegram.ui.ActionBar.i1) obj).c();
                return;
            case 19:
                org.telegram.ui.ActionBar.q1 q1Var = (org.telegram.ui.ActionBar.q1) obj;
                org.telegram.ui.ActionBar.u1 u1Var = q1Var.d;
                int i10 = org.telegram.messenger.g0.f22563q.x;
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
            case 20:
                x1 x1Var = (x1) obj;
                x1Var.f28740m1.setVisibility(0);
                x1Var.f28741o1.setAlpha(0.0f);
                int i12 = x1Var.f28739k1;
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
                x1Var.f28741o1.animate().setDuration(300L).alpha(1.0f).setListener(new v1(x1Var, 0)).start();
                return;
            case 21:
                v2 v2Var = (v2) ((m2) obj).f14797c;
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
            case 22:
                try {
                    ((n2) obj).f28316b.K();
                    return;
                } catch (Exception e13) {
                    a8.g(e13, true);
                    return;
                }
            case 23:
                h3 h3Var = (h3) obj;
                if (h3Var.mo25d() != null) {
                    h3Var.mo25d().setDrawingFromOverlay(true);
                    return;
                }
                return;
            case 24:
                ((org.telegram.ui.ActionBar.k3) obj).f();
                return;
            case 25:
                i4 i4Var = (i4) ((androidx.mediarouter.app.f0) obj).f2722b;
                i4Var.k();
                i4Var.j();
                return;
            case 26:
                i4 i4Var2 = ((f4) obj).f27470b;
                i4Var2.f27544c.dismiss();
                i4Var2.f27546f.removeAllViews();
                return;
            case 27:
                ((f4) obj).f27470b.f27544c.dismiss();
                return;
            case 28:
                Drawable drawable2 = (Drawable) obj;
                l6.d = null;
                l6.P();
                if (!l6.f27821b) {
                    l6.j(drawable2);
                    l6.h(drawable2);
                }
                qs.e().k(276, new Object[0]);
                return;
            default:
                ((CountDownLatch) obj).countDown();
                return;
        }
    }

    public a0(c0 c0Var, SurfaceTexture surfaceTexture) {
        this.f17740a = 0;
        this.f17741b = c0Var;
    }

    public a0(r0 r0Var, n1 n1Var) {
        this.f17740a = 1;
        this.f17741b = n1Var;
    }
}
