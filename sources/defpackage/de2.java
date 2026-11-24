package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class de2 implements Runnable {
    public final byte a;
    public final long b;
    public final Object c;
    public final Object d;

    public de2(Object obj, long j, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
        this.d = obj2;
    }

    private final void a() {
        int i;
        ArrayList arrayList = (ArrayList) this.d;
        mu1 mu1Var = ((wt1) this.c).a;
        i = ((d) mu1Var).currentAccount;
        ij.q0(z3a.B(i).p0(arrayList, this.b, false, false, true, 0, 0, null, -1, 0L, mu1Var.c7(), mu1Var.y5), null, mu1Var);
    }

    private final void b() {
        int i = ChatActivityEnterView.r7;
        ((ux1) this.d).run();
        bue.c(((ChatActivityEnterView) this.c).R, this.b);
    }

    private final void c() {
        x02 x02Var = (x02) this.c;
        Context context = x02Var.getContext();
        fz1 fz1Var = new fz1(x02Var, (byte) 16);
        ij.J(context, this.b, fz1Var, (wjb) this.d);
    }

    private final void d() {
        j52 j52Var;
        l52 l52Var = (l52) this.c;
        j52 j52Var2 = (j52) this.d;
        m52 m52Var = l52Var.Q;
        if (!m52Var.r.J1 && l52Var.E == this.b && (j52Var = l52Var.G) == j52Var2) {
            m52Var.K = j52Var;
            m52Var.N = j52Var.a.a;
            m52Var.L = false;
            l52Var.H = 0.0f;
            l52Var.invalidate();
            ValueAnimator valueAnimator = m52Var.M;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            m52Var.M = ofFloat;
            ofFloat.addUpdateListener(new h52(l52Var, (byte) 0));
            m52Var.M.setDuration(200L);
            m52Var.M.start();
            j52 j52Var3 = m52Var.K;
            RectF e = j52Var3.e(j52Var3.c());
            RectF b = m52Var.K.b();
            m52Var.H = (((m52Var.E - e.left) / e.width()) + 0.5f) / 2.0f;
            m52Var.G = (m52Var.F - e.top) / e.height();
            m52Var.I = b.width();
            m52Var.J = b.height();
            try {
                m52Var.performHapticFeedback(0, 2);
            } catch (Exception unused) {
            }
        }
    }

    private final void e() {
        kf2 kf2Var = (kf2) this.c;
        TLRPC.User user = (TLRPC.User) this.d;
        kf2Var.getMessagesController().b0(kf2Var.N, user);
        kf2Var.y0(this.b);
        if (kf2Var.n != null && user != null && u21.a(kf2Var)) {
            u21.D(kf2Var, user, kf2Var.n.title).j();
        }
    }

    private final void f() {
        boolean z;
        boolean z2;
        boolean z3;
        vf3 vf3Var = (vf3) this.c;
        uf3 uf3Var = (uf3) this.d;
        g2b g2bVar = vf3Var.s;
        ArrayList arrayList = vf3Var.y;
        cj3 cj3Var = vf3Var.f0;
        if (cj3Var != null && cj3Var.getParentActivity() != null) {
            int i = uf3Var.b;
            ArrayList arrayList2 = new ArrayList();
            boolean z4 = false;
            int i2 = 0;
            while (true) {
                if (i2 < arrayList.size()) {
                    long j = ((sf3) arrayList.get(i2)).c;
                    if (j != y6c.h(vf3Var.f).n && g2bVar.K(j)) {
                        z = false;
                        break;
                    }
                    i2++;
                } else {
                    z = true;
                    break;
                }
            }
            if (uf3Var.G && (!z || arrayList.size() == 1)) {
                arrayList2.add(Long.valueOf(uf3Var.F));
                z3 = false;
                z2 = true;
            } else if (!uf3Var.G && g2bVar.K(uf3Var.F)) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    long j2 = ((sf3) arrayList.get(i3)).c;
                    if (!uf3Var.G && g2bVar.K(j2)) {
                        arrayList2.add(Long.valueOf(j2));
                    }
                    if (j2 == uf3Var.F) {
                        i = arrayList2.size() - 1;
                    }
                }
                z2 = false;
                z3 = true;
            } else {
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    if (g2bVar.J(((sf3) arrayList.get(i4)).c)) {
                        arrayList2.add(Long.valueOf(((sf3) arrayList.get(i4)).c));
                    } else if (i4 <= i) {
                        i--;
                    }
                }
                z2 = false;
                z3 = false;
            }
            m8b orCreateStoryViewer = cj3Var.getOrCreateStoryViewer();
            orCreateStoryViewer.s(new et(vf3Var, this.b, (byte) 13));
            Context context = vf3Var.getContext();
            p2b a = p2b.a(vf3Var.h);
            a.e = new l41((byte) 4, vf3Var, z2);
            if (vf3Var.b == 1) {
                z4 = true;
            }
            a.f = z4;
            a.h = z3;
            a.n = z2;
            a.r = true;
            orCreateStoryViewer.K(context, null, arrayList2, i, null, null, a, false);
        }
    }

    private final void g() {
        cj3 cj3Var = (cj3) this.c;
        n30 n30Var = (n30) this.d;
        if (cj3Var.H.bot_admin_rights != null) {
            cj3Var.getMessagesController().V4(-this.b, cj3Var.getMessagesController().V1(Long.valueOf(cj3Var.I)), cj3Var.H.bot_admin_rights, null, false, cj3Var, true, true, null, n30Var, new vu2(n30Var, (byte) 23));
            return;
        }
        n30Var.run();
    }

    private final void h() {
        tv4 tv4Var = (tv4) this.c;
        p8c p8cVar = (p8c) this.d;
        d S = LaunchActivity.S();
        if (S == null) {
            return;
        }
        tv4Var.dismiss();
        if (p8cVar != null) {
            p8cVar.a(Boolean.FALSE);
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.b);
        bundle.putBoolean("open_gifts", true);
        S.presentFragment(new ProfileActivity(bundle, null));
    }

    private final void i() {
        h75 h75Var = (h75) this.c;
        TLRPC.Updates updates = (TLRPC.Updates) this.d;
        h75Var.getClass();
        TLRPC.Update update = updates.update;
        int i = 0;
        if (update instanceof TL_update.TL_updateNewMessage) {
            TLRPC.Message message = ((TL_update.TL_updateNewMessage) update).message;
            if (message != null && (message.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                i = message.id;
            }
        } else if (update instanceof TL_update.TL_updateMessageID) {
            i = ((TL_update.TL_updateMessageID) update).id;
        } else if (updates.updates != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= updates.updates.size()) {
                    break;
                }
                TLRPC.Update update2 = updates.updates.get(i2);
                if (update2 instanceof TL_update.TL_updateNewMessage) {
                    TLRPC.Message message2 = ((TL_update.TL_updateNewMessage) update2).message;
                    if (message2 != null && (message2.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                        i = message2.id;
                        break;
                    }
                    i2++;
                } else if (update2 instanceof TL_update.TL_updateMessageID) {
                    i = ((TL_update.TL_updateMessageID) update2).id;
                    break;
                } else {
                    i2++;
                }
            }
        }
        fc2 fc2Var = h75Var.T2;
        if (fc2Var != null && i != 0) {
            HashMap hashMap = fc2Var.k;
            Long valueOf = Long.valueOf(this.b);
            ?? obj = new Object();
            obj.a = i;
            obj.b = true;
            obj.c = System.currentTimeMillis();
            hashMap.put(valueOf, obj);
            h75Var.D0(true);
        }
    }

    private final void j() {
        ((eu5) this.c).vd(this.b, (TLRPC.Chat) this.d);
    }

    private final void k() {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        Long l = (Long) this.d;
        d S = LaunchActivity.S();
        if (S != null) {
            mu1 W9 = mu1.W9(l.longValue());
            S.presentFragment(W9);
            TLRPC.Chat K0 = na7.q1(launchActivity.P).K0(Long.valueOf(-l.longValue()));
            if (K0 != null) {
                gl.d3(new zy5(W9, this.b, K0, (byte) 0), 250L);
            }
        }
    }

    private final void l() {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        String str = LaunchActivity.C1;
        gl.c3(new sx5(launchActivity, ad7.Y(launchActivity.P).g0(this.b), (bz5) this.d, (byte) 5));
    }

    private final void m() {
        qa6 qa6Var = (qa6) this.c;
        TLObject tLObject = (TLObject) this.d;
        if (qa6Var.F != null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            int i = 0;
            while (i < messages_messages.messages.size()) {
                if (!(messages_messages.messages.get(i).media instanceof TLRPC.TL_messageMediaGeoLive)) {
                    messages_messages.messages.remove(i);
                    i--;
                }
                i++;
            }
            qa6Var.getMessagesStorage().j1(messages_messages.users, messages_messages.chats, true, true);
            qa6Var.getMessagesController().b4(messages_messages.users, false);
            qa6Var.getMessagesController().V3(messages_messages.chats, false);
            vf6 vf6Var = qa6Var.getLocationController().c;
            ArrayList<TLRPC.Message> arrayList = messages_messages.messages;
            long j = this.b;
            vf6Var.k(arrayList, j);
            qa6Var.getNotificationCenter().k(kk7.H4, Long.valueOf(j));
            qa6Var.j0(messages_messages.messages);
            qa6Var.getLocationController().j(qa6Var.m0);
            if (qa6Var.Q0 == null) {
                t96 t96Var = new t96(qa6Var, (byte) 0);
                qa6Var.Q0 = t96Var;
                gl.d3(t96Var, 5000L);
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.de2.run():void");
    }

    public de2(Object obj, Object obj2, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }
}
