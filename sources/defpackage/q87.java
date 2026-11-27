package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.a;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLRPC;
public final class q87 implements Runnable {
    public final byte a;
    public final uc7 b;
    public final zh6 c;

    public q87(uc7 uc7Var, zh6 zh6Var, byte b) {
        this.a = b;
        this.b = uc7Var;
        this.c = zh6Var;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        switch (this.a) {
            case 0:
                uc7 uc7Var = this.b;
                zh6 zh6Var = this.c;
                ip7 notificationsController = uc7Var.getNotificationsController();
                notificationsController.getClass();
                if (zh6Var.m() != 0) {
                    for (int i = 0; i < zh6Var.m(); i++) {
                        ArrayList arrayList = (ArrayList) zh6Var.n(i);
                        if (arrayList != null) {
                            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                r47 r47Var = (r47) arrayList.get(i2);
                                if (r47Var != null && (message = r47Var.k) != null) {
                                    TLRPC.MessageAction messageAction = message.action;
                                    if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                                        if (tL_messageActionConferenceCall.active || tL_messageActionConferenceCall.missed) {
                                            VoIPGroupNotification.hide(a.b, notificationsController.currentAccount, r47Var.e1());
                                        }
                                    }
                                }
                            }
                        }
                    }
                    new ArrayList(0);
                    ip7.l0.c(new pl7(notificationsController, zh6Var, (byte) 7));
                }
                qyb qybVar = uc7Var.g4;
                qybVar.getClass();
                HashSet hashSet = new HashSet();
                for (int i3 = 0; i3 < zh6Var.m(); i3++) {
                    ArrayList arrayList2 = (ArrayList) zh6Var.n(i3);
                    for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) qybVar.e.f(qyb.p(((r47) arrayList2.get(i4)).e1(), -r47.B0(((r47) arrayList2.get(i4)).k)));
                        if (tL_forumTopic != null) {
                            tL_forumTopic.topMessage = ((r47) arrayList2.get(i4)).k;
                            hashSet.add(Long.valueOf(-r47.B0(((r47) arrayList2.get(i4)).k)));
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    qybVar.y(((Long) it.next()).longValue(), true);
                }
                return;
            case 1:
                hl.c3(new q87(this.b, this.c, (byte) 0));
                return;
            default:
                uc7 uc7Var2 = this.b;
                zh6 zh6Var2 = this.c;
                for (int i5 = 0; i5 < zh6Var2.m(); i5++) {
                    uc7Var2.z5(0, zh6Var2.j(i5), (ArrayList) zh6Var2.n(i5));
                }
                uc7Var2.getNotificationCenter().k(3, new Object[0]);
                return;
        }
    }
}
