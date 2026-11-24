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
public final class of2 implements Runnable {
    public final byte a;
    public final long b;
    public final Object c;
    public final Object d;

    public of2(Object obj, long j, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
        this.d = obj2;
    }

    private final void a() {
        int i;
        ArrayList arrayList = (ArrayList) this.d;
        yv1 yv1Var = ((iv1) this.c).a;
        i = ((d) yv1Var).currentAccount;
        ik.q0(a6a.B(i).p0(arrayList, this.b, false, false, true, 0, 0, null, -1, 0L, yv1Var.k7(), yv1Var.y5), null, yv1Var);
    }

    private final void b() {
        int i = ChatActivityEnterView.z7;
        ((hz1) this.d).run();
        ewe.c(((ChatActivityEnterView) this.c).R, this.b);
    }

    private final void c() {
        i22 i22Var = (i22) this.c;
        Context context = i22Var.getContext();
        s02 s02Var = new s02(i22Var, (byte) 16);
        ik.J(context, this.b, s02Var, (ylb) this.d);
    }

    private final void d() {
        u62 u62Var;
        w62 w62Var = (w62) this.c;
        u62 u62Var2 = (u62) this.d;
        x62 x62Var = w62Var.Q;
        if (!x62Var.r.J1 && w62Var.E == this.b && (u62Var = w62Var.G) == u62Var2) {
            x62Var.K = u62Var;
            x62Var.N = u62Var.a.a;
            x62Var.L = false;
            w62Var.H = 0.0f;
            w62Var.invalidate();
            ValueAnimator valueAnimator = x62Var.M;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            x62Var.M = ofFloat;
            ofFloat.addUpdateListener(new s62(w62Var, (byte) 0));
            x62Var.M.setDuration(200L);
            x62Var.M.start();
            u62 u62Var3 = x62Var.K;
            RectF e = u62Var3.e(u62Var3.c());
            RectF b = x62Var.K.b();
            x62Var.H = (((x62Var.E - e.left) / e.width()) + 0.5f) / 2.0f;
            x62Var.G = (x62Var.F - e.top) / e.height();
            x62Var.I = b.width();
            x62Var.J = b.height();
            try {
                x62Var.performHapticFeedback(0, 2);
            } catch (Exception unused) {
            }
        }
    }

    private final void e() {
        wg2 wg2Var = (wg2) this.c;
        TLRPC.User user = (TLRPC.User) this.d;
        wg2Var.getMessagesController().b0(wg2Var.N, user);
        wg2Var.z0(this.b);
        if (wg2Var.n != null && user != null && c41.a(wg2Var)) {
            c41.D(wg2Var, user, wg2Var.n.title).j();
        }
    }

    private final void f() {
        boolean z;
        boolean z2;
        boolean z3;
        ih3 ih3Var = (ih3) this.c;
        hh3 hh3Var = (hh3) this.d;
        h4b h4bVar = ih3Var.s;
        ArrayList arrayList = ih3Var.y;
        nk3 nk3Var = ih3Var.f0;
        if (nk3Var != null && nk3Var.getParentActivity() != null) {
            int i = hh3Var.b;
            ArrayList arrayList2 = new ArrayList();
            boolean z4 = false;
            int i2 = 0;
            while (true) {
                if (i2 < arrayList.size()) {
                    long j = ((fh3) arrayList.get(i2)).c;
                    if (j != z8c.h(ih3Var.f).n && h4bVar.K(j)) {
                        z = false;
                        break;
                    }
                    i2++;
                } else {
                    z = true;
                    break;
                }
            }
            if (hh3Var.G && (!z || arrayList.size() == 1)) {
                arrayList2.add(Long.valueOf(hh3Var.F));
                z3 = false;
                z2 = true;
            } else if (!hh3Var.G && h4bVar.K(hh3Var.F)) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    long j2 = ((fh3) arrayList.get(i3)).c;
                    if (!hh3Var.G && h4bVar.K(j2)) {
                        arrayList2.add(Long.valueOf(j2));
                    }
                    if (j2 == hh3Var.F) {
                        i = arrayList2.size() - 1;
                    }
                }
                z2 = false;
                z3 = true;
            } else {
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    if (h4bVar.J(((fh3) arrayList.get(i4)).c)) {
                        arrayList2.add(Long.valueOf(((fh3) arrayList.get(i4)).c));
                    } else if (i4 <= i) {
                        i--;
                    }
                }
                z2 = false;
                z3 = false;
            }
            oab orCreateStoryViewer = nk3Var.getOrCreateStoryViewer();
            orCreateStoryViewer.u(new fu(ih3Var, this.b, (byte) 13));
            Context context = ih3Var.getContext();
            q4b a = q4b.a(ih3Var.h);
            a.e = new s51((byte) 4, ih3Var, z2);
            if (ih3Var.b == 1) {
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
        nk3 nk3Var = (nk3) this.c;
        n40 n40Var = (n40) this.d;
        if (nk3Var.H.bot_admin_rights != null) {
            nk3Var.getMessagesController().X4(-this.b, nk3Var.getMessagesController().W1(Long.valueOf(nk3Var.I)), nk3Var.H.bot_admin_rights, null, false, nk3Var, true, true, null, n40Var, new wm2(n40Var, (byte) 26));
            return;
        }
        n40Var.run();
    }

    private final void h() {
        ux4 ux4Var = (ux4) this.c;
        qac qacVar = (qac) this.d;
        d S = LaunchActivity.S();
        if (S == null) {
            return;
        }
        ux4Var.dismiss();
        if (qacVar != null) {
            qacVar.a(Boolean.FALSE);
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.b);
        bundle.putBoolean("open_gifts", true);
        S.presentFragment(new ProfileActivity(bundle, null));
    }

    private final void i() {
        g95 g95Var = (g95) this.c;
        TLRPC.Updates updates = (TLRPC.Updates) this.d;
        g95Var.getClass();
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
        qd2 qd2Var = g95Var.T2;
        if (qd2Var != null && i != 0) {
            HashMap hashMap = qd2Var.k;
            Long valueOf = Long.valueOf(this.b);
            ?? obj = new Object();
            obj.a = i;
            obj.b = true;
            obj.c = System.currentTimeMillis();
            hashMap.put(valueOf, obj);
            g95Var.D0(true);
        }
    }

    private final void j() {
        ((dw5) this.c).Hd(this.b, (TLRPC.Chat) this.d);
    }

    private final void k() {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        Long l = (Long) this.d;
        d S = LaunchActivity.S();
        if (S != null) {
            yv1 ga = yv1.ga(l.longValue());
            S.presentFragment(ga);
            TLRPC.Chat L0 = oc7.r1(launchActivity.P).L0(Long.valueOf(-l.longValue()));
            if (L0 != null) {
                gm.d3(new z06(ga, this.b, L0, (byte) 0), 250L);
            }
        }
    }

    private final void l() {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        String str = LaunchActivity.C1;
        gm.c3(new dt5(launchActivity, cf7.Y(launchActivity.P).g0(this.b), (b16) this.d, (byte) 7));
    }

    private final void m() {
        pc6 pc6Var = (pc6) this.c;
        TLObject tLObject = (TLObject) this.d;
        if (pc6Var.F != null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            int i = 0;
            while (i < messages_messages.messages.size()) {
                if (!(messages_messages.messages.get(i).media instanceof TLRPC.TL_messageMediaGeoLive)) {
                    messages_messages.messages.remove(i);
                    i--;
                }
                i++;
            }
            pc6Var.getMessagesStorage().j1(messages_messages.users, messages_messages.chats, true, true);
            pc6Var.getMessagesController().d4(messages_messages.users, false);
            pc6Var.getMessagesController().X3(messages_messages.chats, false);
            vh6 vh6Var = pc6Var.getLocationController().c;
            ArrayList<TLRPC.Message> arrayList = messages_messages.messages;
            long j = this.b;
            vh6Var.k(arrayList, j);
            pc6Var.getNotificationCenter().k(nm7.J4, Long.valueOf(j));
            pc6Var.k0(messages_messages.messages);
            pc6Var.getLocationController().j(pc6Var.m0);
            if (pc6Var.Q0 == null) {
                sb6 sb6Var = new sb6(pc6Var, (byte) 0);
                pc6Var.Q0 = sb6Var;
                gm.d3(sb6Var, 5000L);
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.of2.run():void");
    }

    public of2(Object obj, Object obj2, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }
}
