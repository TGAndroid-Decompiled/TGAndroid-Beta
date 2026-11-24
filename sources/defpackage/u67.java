package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.a;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLRPC;
public final class u67 implements Runnable {
    public final byte a;
    public final na7 b;
    public final vf6 c;

    public u67(na7 na7Var, vf6 vf6Var, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = vf6Var;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        switch (this.a) {
            case 0:
                na7 na7Var = this.b;
                vf6 vf6Var = this.c;
                im7 notificationsController = na7Var.getNotificationsController();
                notificationsController.getClass();
                if (vf6Var.m() != 0) {
                    for (int i = 0; i < vf6Var.m(); i++) {
                        ArrayList arrayList = (ArrayList) vf6Var.n(i);
                        if (arrayList != null) {
                            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                k27 k27Var = (k27) arrayList.get(i2);
                                if (k27Var != null && (message = k27Var.k) != null) {
                                    TLRPC.MessageAction messageAction = message.action;
                                    if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                                        if (tL_messageActionConferenceCall.active || tL_messageActionConferenceCall.missed) {
                                            VoIPGroupNotification.hide(a.b, notificationsController.currentAccount, k27Var.e1());
                                        }
                                    }
                                }
                            }
                        }
                    }
                    new ArrayList(0);
                    im7.l0.c(new bj7(notificationsController, vf6Var, (byte) 9));
                }
                pub pubVar = na7Var.g4;
                pubVar.getClass();
                HashSet hashSet = new HashSet();
                for (int i3 = 0; i3 < vf6Var.m(); i3++) {
                    ArrayList arrayList2 = (ArrayList) vf6Var.n(i3);
                    for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) pubVar.e.f(pub.p(((k27) arrayList2.get(i4)).e1(), -k27.B0(((k27) arrayList2.get(i4)).k)));
                        if (tL_forumTopic != null) {
                            tL_forumTopic.topMessage = ((k27) arrayList2.get(i4)).k;
                            hashSet.add(Long.valueOf(-k27.B0(((k27) arrayList2.get(i4)).k)));
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    pubVar.y(((Long) it.next()).longValue(), true);
                }
                return;
            case 1:
                gl.c3(new u67(this.b, this.c, (byte) 0));
                return;
            default:
                na7 na7Var2 = this.b;
                vf6 vf6Var2 = this.c;
                for (int i5 = 0; i5 < vf6Var2.m(); i5++) {
                    na7Var2.r5(0, vf6Var2.j(i5), (ArrayList) vf6Var2.n(i5));
                }
                na7Var2.getNotificationCenter().k(3, new Object[0]);
                return;
        }
    }
}
