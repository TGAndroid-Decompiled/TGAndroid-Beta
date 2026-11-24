package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
public final class bvb extends c6 {
    public final Context a;
    public final qvb b;

    public bvb(qvb qvbVar, Context context) {
        this.b = qvbVar;
        this.a = context;
    }

    @Override
    public final void b(int i) {
        int i2;
        TLRPC.ChatParticipants chatParticipants;
        pub pubVar;
        int i3;
        boolean z;
        int i4;
        boolean z2;
        nvb nvbVar;
        TLRPC.TL_forumTopic tL_forumTopic;
        qvb qvbVar = this.b;
        pub pubVar2 = qvbVar.s;
        ArrayList arrayList = qvbVar.b;
        HashSet hashSet = qvbVar.b0;
        long j = qvbVar.a;
        if (i == -1) {
            if (hashSet.size() > 0) {
                qvbVar.C0();
                return;
            } else {
                qvbVar.finishFragment();
                return;
            }
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i5 = 0;
        switch (i) {
            case 1:
                pub pubVar3 = qvbVar.getMessagesController().g4;
                pubVar3.getClass();
                TLRPC.TL_channels_toggleViewForumAsMessages tL_channels_toggleViewForumAsMessages = new TLRPC.TL_channels_toggleViewForumAsMessages();
                tL_channels_toggleViewForumAsMessages.channel_id = pubVar3.getMessagesController().f1(j);
                tL_channels_toggleViewForumAsMessages.enabled = true;
                pubVar3.getConnectionsManager().sendRequest(tL_channels_toggleViewForumAsMessages, new wx9(pubVar3, (byte) 14));
                qvbVar.J = true;
                mu1 mu1Var = new mu1(ls6.k(j, "chat_id"));
                mu1Var.Ga = true;
                qvbVar.presentFragment(mu1Var);
                return;
            case 2:
                TLRPC.ChatFull L0 = qvbVar.getMessagesController().L0(j);
                TLRPC.ChatFull chatFull = qvbVar.K;
                if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                    L0.participants = chatParticipants;
                }
                if (L0 != null) {
                    vf6 vf6Var = new vf6();
                    if (L0.participants != null) {
                        while (i5 < L0.participants.participants.size()) {
                            vf6Var.k(null, L0.participants.participants.get(i5).user_id);
                            i5++;
                        }
                    }
                    long j2 = L0.id;
                    i2 = ((d) qvbVar).currentAccount;
                    zub zubVar = new zub(this, this.a, i2, vf6Var, L0.id, qvbVar, j2);
                    zubVar.f2 = new rz1(this, j2, (byte) 12);
                    zubVar.show();
                    return;
                }
                return;
            case 3:
                vtb e0 = vtb.e0(j, 0L);
                qvbVar.presentFragment(e0);
                gl.e3(new qtb(e0, (byte) 1), 200L);
                return;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    qvbVar.D0 = true;
                    qvbVar.O0 = true;
                    pub pubVar4 = qvbVar.s;
                    long j3 = qvbVar.a;
                    int intValue = ((Integer) hashSet.iterator().next()).intValue();
                    if (i == 4) {
                        pubVar = pubVar4;
                        i3 = intValue;
                        z = true;
                    } else {
                        pubVar = pubVar4;
                        i3 = intValue;
                        z = false;
                    }
                    pubVar.t(j3, i3, z, qvbVar);
                }
                qvbVar.C0();
                return;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    qvbVar.getNotificationsController().G(-j, ((Integer) it.next()).intValue(), qvbVar.C0);
                }
                qvbVar.C0();
                return;
            case 7:
                qvbVar.D0(hashSet, new cib(this, (byte) 13));
                return;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                    TLRPC.TL_forumTopic f = pubVar2.f(j, ((Integer) arrayList2.get(i6)).intValue());
                    if (f != null) {
                        qvbVar.getMessagesController().p3(-j, f.id);
                        na7 messagesController = qvbVar.getMessagesController();
                        long j4 = -j;
                        int i7 = f.top_message;
                        TLRPC.Message message = f.topMessage;
                        if (message != null) {
                            i4 = message.date;
                        } else {
                            i4 = 0;
                        }
                        messagesController.k3(j4, i7, 0, i4, false, f.id, 0, true, 0);
                        qvbVar.getMessagesStorage().a2(f.top_message, 0, qvbVar.a, f.id);
                    }
                }
                qvbVar.C0();
                return;
            case 9:
            case 10:
                qvbVar.O0 = true;
                ArrayList arrayList3 = new ArrayList(hashSet);
                for (int i8 = 0; i8 < arrayList3.size(); i8++) {
                    int intValue2 = ((Integer) arrayList3.get(i8)).intValue();
                    if (i == 9) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    pubVar2.z(intValue2, j, z2);
                }
                qvbVar.C0();
                return;
            case 11:
                TLRPC.Chat K0 = qvbVar.getMessagesController().K0(Long.valueOf(j));
                ij.r(qvbVar, false, K0, null, false, true, false, false, new kq8(this, K0, (byte) 28));
                return;
            case 12:
            case 13:
                int i9 = 0;
                while (true) {
                    if (i9 < qvbVar.O.getChildCount()) {
                        View childAt = qvbVar.O.getChildAt(i9);
                        if ((childAt instanceof nvb) && (tL_forumTopic = (nvbVar = (nvb) childAt).O) != null && tL_forumTopic.id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i9++;
                        }
                    } else {
                        nvbVar = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i5 < arrayList.size()) {
                            if (arrayList.get(i5) != null && ((ivb) arrayList.get(i5)).c != null && ((ivb) arrayList.get(i5)).c.id == 1) {
                                tL_forumTopic2 = ((ivb) arrayList.get(i5)).c;
                            } else {
                                i5++;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (qvbVar.y <= 0) {
                        qvbVar.F = true;
                        qvbVar.E = (byte) 2;
                    }
                    qvbVar.getMessagesController().g4.A(1, j, tL_forumTopic2.hidden);
                    if (nvbVar != null) {
                        qvbVar.d1 = nvbVar;
                    }
                    int i10 = ovb.o3;
                    qvbVar.O.B1(!tL_forumTopic2.hidden, nvbVar);
                    qvbVar.Y0(true, true);
                    if (nvbVar != null) {
                        nvbVar.setTopicIcon(nvbVar.d5);
                    }
                }
                qvbVar.C0();
                return;
            case 14:
                if (hc2.N(qvbVar.getMessagesController().K0(Long.valueOf(j)))) {
                    lo0 lo0Var = new lo0(-j);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = qvbVar.Y;
                    lo0Var.U = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        lo0Var.getMessagesController().E0().b(lo0Var.S, lo0Var.U, new co0(lo0Var, (byte) 0));
                    }
                    qvbVar.presentFragment(lo0Var);
                    return;
                }
                qvbVar.getNotificationCenter().k(kk7.o3, Long.valueOf(-j));
                return;
            case 15:
                b89.E0(-j, qvbVar);
                return;
            default:
                return;
        }
    }
}
