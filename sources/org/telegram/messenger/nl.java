package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLRPC;
public final class nl implements Runnable {
    public final int f25212a;
    public final np f25213b;
    public final a0.h f25214c;

    public nl(np npVar, a0.h hVar, int i7) {
        this.f25212a = i7;
        this.f25213b = npVar;
        this.f25214c = hVar;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        switch (this.f25212a) {
            case 0:
                np npVar = this.f25213b;
                a0.h hVar = this.f25214c;
                at notificationsController = npVar.getNotificationsController();
                notificationsController.getClass();
                if (hVar.m() != 0) {
                    for (int i7 = 0; i7 < hVar.m(); i7++) {
                        ArrayList arrayList = (ArrayList) hVar.n(i7);
                        if (arrayList != null) {
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                gj gjVar = (gj) arrayList.get(i10);
                                if (gjVar != null && (message = gjVar.f23819k) != null) {
                                    TLRPC.MessageAction messageAction = message.action;
                                    if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                                        if (tL_messageActionConferenceCall.active || tL_messageActionConferenceCall.missed) {
                                            VoIPGroupNotification.hide(t0.f26609b, notificationsController.currentAccount, gjVar.e1());
                                        }
                                    }
                                }
                            }
                        }
                    }
                    new ArrayList(0);
                    at.f22558l0.c(new pq(15, notificationsController, hVar));
                }
                h00 h00Var = npVar.f25386r7;
                h00Var.getClass();
                HashSet hashSet = new HashSet();
                for (int i11 = 0; i11 < hVar.m(); i11++) {
                    ArrayList arrayList2 = (ArrayList) hVar.n(i11);
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) h00Var.f24014e.f(h00.p(((gj) arrayList2.get(i12)).e1(), -gj.B0(((gj) arrayList2.get(i12)).f23819k)));
                        if (tL_forumTopic != null) {
                            tL_forumTopic.topMessage = ((gj) arrayList2.get(i12)).f23819k;
                            hashSet.add(Long.valueOf(-gj.B0(((gj) arrayList2.get(i12)).f23819k)));
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    h00Var.y(((Long) it.next()).longValue(), true);
                }
                return;
            case 1:
                g0.h3(new nl(this.f25213b, this.f25214c, 0));
                return;
            default:
                np npVar2 = this.f25213b;
                a0.h hVar2 = this.f25214c;
                for (int i13 = 0; i13 < hVar2.m(); i13++) {
                    npVar2.m5(0, hVar2.j(i13), (ArrayList) hVar2.n(i13));
                }
                npVar2.getNotificationCenter().k(3, new Object[0]);
                return;
        }
    }
}
