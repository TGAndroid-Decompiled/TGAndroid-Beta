package gg;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import m.r3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLParseException;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.g3;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.eo;
import org.telegram.ui.ig1;
public final class v1 implements Runnable {
    public final int f9059a;
    public final Object f9060b;

    public v1(i2.b0 b0Var, SurfaceTexture surfaceTexture) {
        this.f9059a = 12;
        this.f9060b = b0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f9059a;
        Object obj = this.f9060b;
        switch (i10) {
            case 0:
                ((u1) obj).run(Boolean.FALSE);
                return;
            case 1:
                NotificationCenter.getInstance(((k2) obj).f8937a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 2:
                ((e2.a0) obj).getClass();
                return;
            case 3:
                g3 g3Var = ((i3) obj).f19293b;
                g3Var.requestFocus();
                AndroidUtilities.showKeyboard(g3Var);
                return;
            case 4:
                AndroidUtilities.showKeyboard(((hi.y) obj).f9967e0.f19293b);
                return;
            case 5:
                ((hi.f0) obj).invalidate();
                return;
            case 6:
                r3 r3Var = (r3) obj;
                r3Var.f13139c = null;
                r3Var.d = null;
                r3Var.e = null;
                r3Var.f13140f = null;
                r3Var.c(null);
                return;
            case 7:
                ((hi.d2) obj).invalidateSelf();
                return;
            case 8:
                ((hi.k2) obj).c();
                return;
            case 9:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) obj;
                ((Context) mVar.f6101b).unregisterReceiver((i2.b) mVar.f6102c);
                return;
            case 10:
                i2.b bVar = (i2.b) obj;
                if (bVar.f10107c.f6100a) {
                    bVar.f10105a.f10108a.y1(3, false);
                    return;
                }
                return;
            case 11:
                i2.e0 e0Var = (i2.e0) obj;
                e2.c cVar = e0Var.E;
                Context context = e0Var.e;
                String str = e2.d0.f7188a;
                Integer valueOf = Integer.valueOf(c2.d.e(context).generateAudioSessionId());
                cVar.f7186f = valueOf;
                e2.b bVar2 = new e2.b(cVar, valueOf, 0);
                e2.z zVar = (e2.z) cVar.f7185c;
                if (zVar.f7243a.getLooper().getThread().isAlive()) {
                    zVar.c(bVar2);
                    return;
                }
                return;
            case 12:
                i2.e0 e0Var2 = ((i2.b0) obj).f10108a;
                e0Var2.t1(null);
                e0Var2.m1(0, 0);
                return;
            case 13:
                try {
                    i2.n0.h((i2.i1) obj);
                    return;
                } catch (i2.n e) {
                    e2.a.f("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    throw new RuntimeException(e);
                }
            case 14:
                j2.e eVar = (j2.e) obj;
                j2.a l4 = eVar.l();
                eVar.q(l4, 1028, new i0.b(l4));
                eVar.f11465f.d();
                return;
            case 15:
                ((jh.b) obj).invalidate();
                return;
            case 16:
                k2.e0 e0Var3 = (k2.e0) obj;
                if (e0Var3.f12110k0 >= 300000) {
                    e0Var3.f12121t.l();
                    e0Var3.f12110k0 = 0L;
                    return;
                }
                return;
            case 17:
                kh.c cVar2 = (kh.c) obj;
                GroupCallMessage groupCallMessage = cVar2.H;
                if (groupCallMessage != null) {
                    cVar2.f12505a.a(groupCallMessage.isSendDelayed(), true);
                    cVar2.f12506b.a(cVar2.H.isSendError(), true);
                    return;
                }
                return;
            case 18:
                ki.d dVar = (ki.d) obj;
                AndroidUtilities.runOnUIThread(new ki.c(dVar.f12533a, dVar.f12534b, 1), 500L);
                return;
            case 19:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, (i6) obj, Boolean.TRUE, null, -1);
                return;
            case 20:
                ig1 ig1Var = (ig1) obj;
                if (ig1Var.getParentLayout() != null) {
                    ig1Var.H = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", ig1Var.f33681a);
                    eo eoVar = new eo(bundle);
                    eoVar.f32376ja = true;
                    ig1Var.presentFragment(eoVar);
                    return;
                }
                return;
            case 21:
                n2.d dVar2 = (n2.d) obj;
                if (!dVar2.f13717c) {
                    n2.g gVar = dVar2.f13716b;
                    if (gVar != null) {
                        gVar.a(dVar2.f13715a);
                    }
                    dVar2.d.f13726x.remove(dVar2);
                    dVar2.f13717c = true;
                    return;
                }
                return;
            case 22:
                ((n2.b) obj).a(null);
                return;
            case 23:
                ((o0.b) obj).A();
                return;
            case 24:
                l2.h hVar = ((og.t0) obj).f14486b.f14512a;
                if (hVar != null) {
                    hVar.n();
                    return;
                }
                return;
            case 25:
                og.v0 v0Var = ((og.t0) obj).f14486b;
                if (v0Var.d == null) {
                    v0Var.L = null;
                    return;
                }
                int currentColor = v0Var.f14515f.getCurrentColor();
                v0Var.l(v0Var.f14513b, false, false);
                a5.a d = v0Var.d(v0Var.f14513b, currentColor, new RectF(v0Var.h));
                v0Var.b();
                og.k1 k1Var = v0Var.d;
                RectF rectF = new RectF();
                v0Var.h = rectF;
                k1Var.a(rectF);
                v0Var.p(v0Var.e(k1Var, currentColor, new RectF(v0Var.h)), false);
                v0Var.p(d, false);
                v0Var.e(k1Var, currentColor, null);
                v0Var.d = null;
                v0Var.J = 0.0f;
                v0Var.L = null;
                return;
            case 26:
                ((og.f1) ((androidx.activity.i) obj).f573b).f14363y.f14388a.a();
                return;
            case 27:
                og.x1 x1Var = ((og.y1) obj).f14570a;
                if (x1Var != null) {
                    x1Var.e();
                    return;
                }
                return;
            case 28:
                oh.c cVar3 = (oh.c) obj;
                oh.b bVar3 = cVar3.f14585c;
                if (bVar3 == oh.b.f14581b) {
                    cVar3.a(oh.b.f14580a, true);
                    return;
                } else if (bVar3 == oh.b.f14582c) {
                    cVar3.a(oh.b.d, true);
                    return;
                } else {
                    return;
                }
            default:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) obj);
                return;
        }
    }

    public v1(i2.n0 n0Var, i2.i1 i1Var) {
        this.f9059a = 13;
        this.f9060b = i1Var;
    }

    public v1(Object obj, int i10) {
        this.f9059a = i10;
        this.f9060b = obj;
    }
}
