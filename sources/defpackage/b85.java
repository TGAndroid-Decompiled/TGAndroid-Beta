package defpackage;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class b85 implements ee, uv5 {
    public final i85 a;

    public b85(i85 i85Var) {
        this.a = i85Var;
    }

    @Override
    public final void a(TLRPC.InputPeer inputPeer, boolean z, boolean z2, boolean z3) {
        TLObject L0;
        g95 g95Var = this.a.b;
        qd2 qd2Var = g95Var.T2;
        j5 j5Var = g95Var.n1;
        if (qd2Var != null) {
            boolean z4 = inputPeer instanceof TLRPC.TL_inputPeerUser;
            if (z4) {
                L0 = oc7.r1(j5Var.a).W1(Long.valueOf(inputPeer.user_id));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                L0 = oc7.r1(j5Var.a).L0(Long.valueOf(inputPeer.chat_id));
            } else {
                L0 = oc7.r1(j5Var.a).L0(Long.valueOf(inputPeer.channel_id));
            }
            TLObject tLObject = L0;
            if (g95Var.T2.k()) {
                g95Var.c1().k(0L, 37, tLObject, g95Var.S2, null, null);
                if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                    g95Var.u2 = tL_peerChannel;
                    tL_peerChannel.channel_id = inputPeer.channel_id;
                } else if (z4) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    g95Var.u2 = tL_peerUser;
                    tL_peerUser.user_id = inputPeer.user_id;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    g95Var.u2 = tL_peerChat;
                    tL_peerChat.chat_id = inputPeer.chat_id;
                }
                g95Var.R2 = inputPeer;
                TLRPC.ChatFull M0 = oc7.r1(j5Var.a).M0(g95Var.Z0());
                if (M0 != null) {
                    M0.groupcall_default_join_as = g95Var.u2;
                    boolean z5 = M0 instanceof TLRPC.TL_chatFull;
                    int i = M0.flags;
                    if (z5) {
                        M0.flags = i | 32768;
                    } else {
                        M0.flags = i | 67108864;
                    }
                }
                TL_phone.saveDefaultGroupCallJoinAs savedefaultgroupcalljoinas = new TL_phone.saveDefaultGroupCallJoinAs();
                savedefaultgroupcalljoinas.peer = oc7.k1(g95Var.S2);
                savedefaultgroupcalljoinas.join_as = inputPeer;
                ConnectionsManager.getInstance(j5Var.a).sendRequest(savedefaultgroupcalljoinas, new nf2((byte) 0));
                g95Var.E1();
            } else if (VoIPService.getSharedInstance() != null && z) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) g95Var.T2.d.f(k47.B1(g95Var.u2));
                VoIPService.getSharedInstance().setGroupCallPeer(inputPeer);
                g95Var.v2 = tLObject;
            }
        }
    }

    @Override
    public final void r(he heVar, int i) {
        i85 i85Var = this.a;
        g95 g95Var = i85Var.b;
        qd2 qd2Var = g95Var.T2;
        j5 j5Var = g95Var.n1;
        if (qd2Var.k()) {
            int i2 = j5Var.a;
            int i3 = j5Var.a;
            TLRPC.ChatFull M0 = oc7.r1(i2).M0(g95Var.Z0());
            if (M0 != null) {
                M0.flags &= -2097153;
                M0.call = null;
                nm7.f(i3).k(nm7.w2, Long.valueOf(g95Var.Z0()), Long.valueOf(g95Var.T2.b.id), Boolean.FALSE);
            }
            TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
            qd2 qd2Var2 = g95Var.T2;
            discardgroupcall.call = qd2Var2.h(qd2Var2.a);
            ConnectionsManager.getInstance(i3).sendRequest(discardgroupcall, new r15(i85Var, (byte) 2));
        } else if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(1);
        }
        g95Var.dismiss();
        nm7.e().k(nm7.v2, new Object[0]);
    }
}
