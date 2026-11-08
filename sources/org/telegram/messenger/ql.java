package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLRPC;
public final class ql implements Runnable {
    public final int f24713a;
    public final qp f24714b;
    public final a0.h f24715c;

    public ql(qp qpVar, a0.h hVar, int i7) {
        this.f24713a = i7;
        this.f24714b = qpVar;
        this.f24715c = hVar;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        switch (this.f24713a) {
            case 0:
                qp qpVar = this.f24714b;
                a0.h hVar = this.f24715c;
                dt notificationsController = qpVar.getNotificationsController();
                notificationsController.getClass();
                if (hVar.m() != 0) {
                    for (int i7 = 0; i7 < hVar.m(); i7++) {
                        ArrayList arrayList = (ArrayList) hVar.n(i7);
                        if (arrayList != null) {
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                ij ijVar = (ij) arrayList.get(i10);
                                if (ijVar != null && (message = ijVar.f23262k) != null) {
                                    TLRPC.MessageAction messageAction = message.action;
                                    if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                                        if (tL_messageActionConferenceCall.active || tL_messageActionConferenceCall.missed) {
                                            VoIPGroupNotification.hide(t0.f25566b, notificationsController.currentAccount, ijVar.f1());
                                        }
                                    }
                                }
                            }
                        }
                    }
                    new ArrayList(0);
                    dt.f22076k0.c(new zq(14, notificationsController, hVar));
                }
                k00 k00Var = qpVar.f24877q7;
                k00Var.getClass();
                HashSet hashSet = new HashSet();
                for (int i11 = 0; i11 < hVar.m(); i11++) {
                    ArrayList arrayList2 = (ArrayList) hVar.n(i11);
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) k00Var.f23643e.f(k00.p(((ij) arrayList2.get(i12)).f1(), -ij.B0(((ij) arrayList2.get(i12)).f23262k)));
                        if (tL_forumTopic != null) {
                            tL_forumTopic.topMessage = ((ij) arrayList2.get(i12)).f23262k;
                            hashSet.add(Long.valueOf(-ij.B0(((ij) arrayList2.get(i12)).f23262k)));
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    k00Var.y(((Long) it.next()).longValue(), true);
                }
                return;
            case 1:
                g0.h3(new ql(this.f24714b, this.f24715c, 0));
                return;
            default:
                qp qpVar2 = this.f24714b;
                a0.h hVar2 = this.f24715c;
                for (int i13 = 0; i13 < hVar2.m(); i13++) {
                    qpVar2.l5(0, hVar2.j(i13), (ArrayList) hVar2.n(i13));
                }
                qpVar2.getNotificationCenter().k(3, new Object[0]);
                return;
        }
    }
}
