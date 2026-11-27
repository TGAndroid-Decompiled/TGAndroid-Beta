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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class ue2 implements Runnable {
    public final byte a;
    public final long b;
    public final Object c;
    public final Object d;

    public ue2(Object obj, long j, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
        this.d = obj2;
    }

    private final void a() {
        int i;
        ArrayList arrayList = (ArrayList) this.d;
        zu1 zu1Var = ((ju1) this.c).a;
        i = ((e) zu1Var).currentAccount;
        jj.q0(r7a.B(i).p0(arrayList, this.b, false, false, true, 0, 0, null, -1, 0L, zu1Var.k7(), zu1Var.y5), null, zu1Var);
    }

    private final void b() {
        int i = ChatActivityEnterView.X7;
        ((ky1) this.d).run();
        vye.c(((ChatActivityEnterView) this.c).R, this.b);
    }

    private final void c() {
        n12 n12Var = (n12) this.c;
        Context context = n12Var.getContext();
        xz1 xz1Var = new xz1(n12Var, (byte) 15);
        jj.J(context, this.b, xz1Var, (vnb) this.d);
    }

    private final void d() {
        z52 z52Var;
        b62 b62Var = (b62) this.c;
        z52 z52Var2 = (z52) this.d;
        c62 c62Var = b62Var.Q;
        if (!c62Var.r.J1 && b62Var.E == this.b && (z52Var = b62Var.G) == z52Var2) {
            c62Var.K = z52Var;
            c62Var.N = z52Var.a.a;
            c62Var.L = false;
            b62Var.H = 0.0f;
            b62Var.invalidate();
            ValueAnimator valueAnimator = c62Var.M;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            c62Var.M = ofFloat;
            ofFloat.addUpdateListener(new x52(b62Var, (byte) 1));
            c62Var.M.setDuration(200L);
            c62Var.M.start();
            z52 z52Var3 = c62Var.K;
            RectF e = z52Var3.e(z52Var3.c());
            RectF b = c62Var.K.b();
            c62Var.H = (((c62Var.E - e.left) / e.width()) + 0.5f) / 2.0f;
            c62Var.G = (c62Var.F - e.top) / e.height();
            c62Var.I = b.width();
            c62Var.J = b.height();
            try {
                c62Var.performHapticFeedback(0, 2);
            } catch (Exception unused) {
            }
        }
    }

    private final void e() {
        bg2 bg2Var = (bg2) this.c;
        TLRPC.User user = (TLRPC.User) this.d;
        bg2Var.getMessagesController().d0(bg2Var.N, user);
        bg2Var.z0(this.b);
        if (bg2Var.n != null && user != null && d31.a(bg2Var)) {
            d31.D(bg2Var, user, bg2Var.n.title).j();
        }
    }

    private final void f() {
        boolean z;
        boolean z2;
        boolean z3;
        pg3 pg3Var = (pg3) this.c;
        og3 og3Var = (og3) this.d;
        c6b c6bVar = pg3Var.s;
        ArrayList arrayList = pg3Var.y;
        uj3 uj3Var = pg3Var.f0;
        if (uj3Var != null && uj3Var.getParentActivity() != null) {
            int i = og3Var.b;
            ArrayList arrayList2 = new ArrayList();
            boolean z4 = false;
            int i2 = 0;
            while (true) {
                if (i2 < arrayList.size()) {
                    long j = ((mg3) arrayList.get(i2)).c;
                    if (j != yac.h(pg3Var.f).n && c6bVar.K(j)) {
                        z = false;
                        break;
                    }
                    i2++;
                } else {
                    z = true;
                    break;
                }
            }
            if (og3Var.G && (!z || arrayList.size() == 1)) {
                arrayList2.add(Long.valueOf(og3Var.F));
                z3 = false;
                z2 = true;
            } else if (!og3Var.G && c6bVar.K(og3Var.F)) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    long j2 = ((mg3) arrayList.get(i3)).c;
                    if (!og3Var.G && c6bVar.K(j2)) {
                        arrayList2.add(Long.valueOf(j2));
                    }
                    if (j2 == og3Var.F) {
                        i = arrayList2.size() - 1;
                    }
                }
                z2 = false;
                z3 = true;
            } else {
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    if (c6bVar.J(((mg3) arrayList.get(i4)).c)) {
                        arrayList2.add(Long.valueOf(((mg3) arrayList.get(i4)).c));
                    } else if (i4 <= i) {
                        i--;
                    }
                }
                z2 = false;
                z3 = false;
            }
            lcb orCreateStoryViewer = uj3Var.getOrCreateStoryViewer();
            orCreateStoryViewer.t(new kt(pg3Var, this.b, (byte) 13));
            Context context = pg3Var.getContext();
            l6b a = l6b.a(pg3Var.h);
            a.e = new t41((byte) 4, pg3Var, z2);
            if (pg3Var.b == 1) {
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
        uj3 uj3Var = (uj3) this.c;
        o30 o30Var = (o30) this.d;
        if (uj3Var.H.bot_admin_rights != null) {
            uj3Var.getMessagesController().d5(-this.b, uj3Var.getMessagesController().X1(Long.valueOf(uj3Var.I)), uj3Var.H.bot_admin_rights, null, false, uj3Var, true, true, null, o30Var, new ht2(o30Var, (byte) 24));
            return;
        }
        o30Var.run();
    }

    private final void h() {
        yx4 yx4Var = (yx4) this.c;
        pcc pccVar = (pcc) this.d;
        e S = LaunchActivity.S();
        if (S == null) {
            return;
        }
        yx4Var.dismiss();
        if (pccVar != null) {
            pccVar.a(Boolean.FALSE);
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.b);
        bundle.putBoolean("open_gifts", true);
        S.presentFragment(new ProfileActivity(bundle, null));
    }

    private final void i() {
        j95 j95Var = (j95) this.c;
        TLRPC.Updates updates = (TLRPC.Updates) this.d;
        j95Var.getClass();
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
        vc2 vc2Var = j95Var.T2;
        if (vc2Var != null && i != 0) {
            HashMap hashMap = vc2Var.k;
            Long valueOf = Long.valueOf(this.b);
            ?? obj = new Object();
            obj.a = i;
            obj.b = true;
            obj.c = System.currentTimeMillis();
            hashMap.put(valueOf, obj);
            j95Var.E0(true);
        }
    }

    private final void j() {
        ((iw5) this.c).Hd(this.b, (TLRPC.Chat) this.d);
    }

    private final void k() {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        Long l = (Long) this.d;
        e S = LaunchActivity.S();
        if (S != null) {
            zu1 ha = zu1.ha(l.longValue());
            S.presentFragment(ha);
            TLRPC.Chat M0 = uc7.s1(launchActivity.P).M0(Long.valueOf(-l.longValue()));
            if (M0 != null) {
                hl.d3(new y06(ha, this.b, M0, (byte) 0), 250L);
            }
        }
    }

    private final void l() {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        String str = LaunchActivity.C1;
        hl.c3(new ls5(launchActivity, kf7.a0(launchActivity.P).i0(this.b), (j16) this.d, (byte) 10));
    }

    private final void m() {
        uc6 uc6Var = (uc6) this.c;
        TLObject tLObject = (TLObject) this.d;
        if (uc6Var.F != null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            int i = 0;
            while (i < messages_messages.messages.size()) {
                if (!(messages_messages.messages.get(i).media instanceof TLRPC.TL_messageMediaGeoLive)) {
                    messages_messages.messages.remove(i);
                    i--;
                }
                i++;
            }
            uc6Var.getMessagesStorage().n1(messages_messages.users, messages_messages.chats, true, true);
            uc6Var.getMessagesController().j4(messages_messages.users, false);
            uc6Var.getMessagesController().c4(messages_messages.chats, false);
            zh6 zh6Var = uc6Var.getLocationController().c;
            ArrayList<TLRPC.Message> arrayList = messages_messages.messages;
            long j = this.b;
            zh6Var.k(j, arrayList);
            uc6Var.getNotificationCenter().k(jn7.I4, Long.valueOf(j));
            uc6Var.j0(messages_messages.messages);
            uc6Var.getLocationController().j(uc6Var.m0);
            if (uc6Var.Q0 == null) {
                dc6 dc6Var = new dc6(uc6Var, (byte) 0);
                uc6Var.Q0 = dc6Var;
                hl.d3(dc6Var, 5000L);
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ue2.run():void");
    }

    public ue2(Object obj, Object obj2, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }
}
