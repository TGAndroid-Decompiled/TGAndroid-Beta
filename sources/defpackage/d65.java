package defpackage;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class d65 implements ed, vt5 {
    public final k65 a;

    public d65(k65 k65Var) {
        this.a = k65Var;
    }

    @Override
    public final void a(TLRPC.InputPeer inputPeer, boolean z, boolean z2, boolean z3) {
        TLObject K0;
        h75 h75Var = this.a.b;
        fc2 fc2Var = h75Var.T2;
        j5 j5Var = h75Var.n1;
        if (fc2Var != null) {
            boolean z4 = inputPeer instanceof TLRPC.TL_inputPeerUser;
            if (z4) {
                K0 = na7.q1(j5Var.a).V1(Long.valueOf(inputPeer.user_id));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                K0 = na7.q1(j5Var.a).K0(Long.valueOf(inputPeer.chat_id));
            } else {
                K0 = na7.q1(j5Var.a).K0(Long.valueOf(inputPeer.channel_id));
            }
            TLObject tLObject = K0;
            if (h75Var.T2.k()) {
                h75Var.c1().k(0L, 37, tLObject, h75Var.S2, null, null);
                if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                    h75Var.u2 = tL_peerChannel;
                    tL_peerChannel.channel_id = inputPeer.channel_id;
                } else if (z4) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    h75Var.u2 = tL_peerUser;
                    tL_peerUser.user_id = inputPeer.user_id;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    h75Var.u2 = tL_peerChat;
                    tL_peerChat.chat_id = inputPeer.chat_id;
                }
                h75Var.R2 = inputPeer;
                TLRPC.ChatFull L0 = na7.q1(j5Var.a).L0(h75Var.Z0());
                if (L0 != null) {
                    L0.groupcall_default_join_as = h75Var.u2;
                    boolean z5 = L0 instanceof TLRPC.TL_chatFull;
                    int i = L0.flags;
                    if (z5) {
                        L0.flags = i | 32768;
                    } else {
                        L0.flags = i | 67108864;
                    }
                }
                TL_phone.saveDefaultGroupCallJoinAs savedefaultgroupcalljoinas = new TL_phone.saveDefaultGroupCallJoinAs();
                savedefaultgroupcalljoinas.peer = na7.j1(h75Var.S2);
                savedefaultgroupcalljoinas.join_as = inputPeer;
                ConnectionsManager.getInstance(j5Var.a).sendRequest(savedefaultgroupcalljoinas, new ce2((byte) 0));
                h75Var.E1();
            } else if (VoIPService.getSharedInstance() != null && z) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) h75Var.T2.d.f(k27.B1(h75Var.u2));
                VoIPService.getSharedInstance().setGroupCallPeer(inputPeer);
                h75Var.v2 = tLObject;
            }
        }
    }

    @Override
    public final void u(hd hdVar, int i) {
        k65 k65Var = this.a;
        h75 h75Var = k65Var.b;
        fc2 fc2Var = h75Var.T2;
        j5 j5Var = h75Var.n1;
        if (fc2Var.k()) {
            int i2 = j5Var.a;
            int i3 = j5Var.a;
            TLRPC.ChatFull L0 = na7.q1(i2).L0(h75Var.Z0());
            if (L0 != null) {
                L0.flags &= -2097153;
                L0.call = null;
                kk7.f(i3).k(kk7.v2, Long.valueOf(h75Var.Z0()), Long.valueOf(h75Var.T2.b.id), Boolean.FALSE);
            }
            TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
            fc2 fc2Var2 = h75Var.T2;
            discardgroupcall.call = fc2Var2.h(fc2Var2.a);
            ConnectionsManager.getInstance(i3).sendRequest(discardgroupcall, new n35(k65Var, (byte) 1));
        } else if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(1);
        }
        h75Var.dismiss();
        kk7.e().k(kk7.u2, new Object[0]);
    }
}
