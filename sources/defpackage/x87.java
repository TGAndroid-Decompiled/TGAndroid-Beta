package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.a;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLRPC;
public final class x87 implements Runnable {
    public final byte a;
    public final oc7 b;
    public final vh6 c;

    public x87(oc7 oc7Var, vh6 vh6Var, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.c = vh6Var;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        switch (this.a) {
            case 0:
                oc7 oc7Var = this.b;
                vh6 vh6Var = this.c;
                lo7 notificationsController = oc7Var.getNotificationsController();
                notificationsController.getClass();
                if (vh6Var.m() != 0) {
                    for (int i = 0; i < vh6Var.m(); i++) {
                        ArrayList arrayList = (ArrayList) vh6Var.n(i);
                        if (arrayList != null) {
                            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                k47 k47Var = (k47) arrayList.get(i2);
                                if (k47Var != null && (message = k47Var.k) != null) {
                                    TLRPC.MessageAction messageAction = message.action;
                                    if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                                        if (tL_messageActionConferenceCall.active || tL_messageActionConferenceCall.missed) {
                                            VoIPGroupNotification.hide(a.b, notificationsController.currentAccount, k47Var.e1());
                                        }
                                    }
                                }
                            }
                        }
                    }
                    new ArrayList(0);
                    lo7.l0.c(new bl7(notificationsController, vh6Var, (byte) 10));
                }
                qwb qwbVar = oc7Var.g4;
                qwbVar.getClass();
                HashSet hashSet = new HashSet();
                for (int i3 = 0; i3 < vh6Var.m(); i3++) {
                    ArrayList arrayList2 = (ArrayList) vh6Var.n(i3);
                    for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) qwbVar.e.f(qwb.p(((k47) arrayList2.get(i4)).e1(), -k47.B0(((k47) arrayList2.get(i4)).k)));
                        if (tL_forumTopic != null) {
                            tL_forumTopic.topMessage = ((k47) arrayList2.get(i4)).k;
                            hashSet.add(Long.valueOf(-k47.B0(((k47) arrayList2.get(i4)).k)));
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    qwbVar.y(((Long) it.next()).longValue(), true);
                }
                return;
            case 1:
                gm.c3(new x87(this.b, this.c, (byte) 0));
                return;
            default:
                oc7 oc7Var2 = this.b;
                vh6 vh6Var2 = this.c;
                for (int i5 = 0; i5 < vh6Var2.m(); i5++) {
                    oc7Var2.t5(0, vh6Var2.j(i5), (ArrayList) vh6Var2.n(i5));
                }
                oc7Var2.getNotificationCenter().k(3, new Object[0]);
                return;
        }
    }
}
