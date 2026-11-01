package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLRPC;
public final class hm implements Runnable {
    public final int f16091a;
    public final wp f16092b;
    public final a0.h f16093c;

    public hm(wp wpVar, a0.h hVar, int i10) {
        this.f16091a = i10;
        this.f16092b = wpVar;
        this.f16093c = hVar;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        switch (this.f16091a) {
            case 0:
                wp wpVar = this.f16092b;
                a0.h hVar = this.f16093c;
                pt notificationsController = wpVar.getNotificationsController();
                notificationsController.getClass();
                if (hVar.m() != 0) {
                    for (int i10 = 0; i10 < hVar.m(); i10++) {
                        ArrayList arrayList = (ArrayList) hVar.n(i10);
                        if (arrayList != null) {
                            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                kj kjVar = (kj) arrayList.get(i11);
                                if (kjVar != null && (message = kjVar.f16690k) != null) {
                                    TLRPC.MessageAction messageAction = message.action;
                                    if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                                        if (tL_messageActionConferenceCall.active || tL_messageActionConferenceCall.missed) {
                                            VoIPGroupNotification.hide(w0.f18945b, notificationsController.currentAccount, kjVar.f1());
                                        }
                                    }
                                }
                            }
                        }
                    }
                    new ArrayList(0);
                    pt.f17637k0.c(new ir(12, notificationsController, hVar));
                }
                y00 y00Var = wpVar.f19234r7;
                y00Var.getClass();
                HashSet hashSet = new HashSet();
                for (int i12 = 0; i12 < hVar.m(); i12++) {
                    ArrayList arrayList2 = (ArrayList) hVar.n(i12);
                    for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) y00Var.e.f(y00.p(((kj) arrayList2.get(i13)).f1(), -kj.B0(((kj) arrayList2.get(i13)).f16690k)));
                        if (tL_forumTopic != null) {
                            tL_forumTopic.topMessage = ((kj) arrayList2.get(i13)).f16690k;
                            hashSet.add(Long.valueOf(-kj.B0(((kj) arrayList2.get(i13)).f16690k)));
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    y00Var.y(((Long) it.next()).longValue(), true);
                }
                return;
            case 1:
                i0.g3(new hm(this.f16092b, this.f16093c, 0));
                return;
            default:
                wp wpVar2 = this.f16092b;
                a0.h hVar2 = this.f16093c;
                for (int i14 = 0; i14 < hVar2.m(); i14++) {
                    wpVar2.i5(0, hVar2.j(i14), (ArrayList) hVar2.n(i14));
                }
                wpVar2.getNotificationCenter().k(3, new Object[0]);
                return;
        }
    }
}
