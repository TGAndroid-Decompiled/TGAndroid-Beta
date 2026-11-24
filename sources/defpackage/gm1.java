package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gm1 implements zz8 {
    public final byte a;
    public final mu1 b;
    public final boolean c;
    public final k27 d;

    public gm1(mu1 mu1Var, boolean z, k27 k27Var, byte b) {
        this.a = b;
        this.b = mu1Var;
        this.c = z;
        this.d = k27Var;
    }

    @Override
    public final void l(long j, TLRPC.MessagePeerReaction messagePeerReaction) {
        byte b = this.a;
        k27 k27Var = this.d;
        boolean z = this.c;
        switch (b) {
            case 0:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final mu1 mu1Var = this.b;
                    if (j != mu1Var.getUserConfig().e() && z) {
                        final ArrayList arrayList = new ArrayList(1);
                        arrayList.add(k27Var);
                        TLObject Z1 = mu1Var.getMessagesController().Z1(j);
                        final ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(Z1);
                        final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = na7.g1(mu1Var.e);
                        tL_channels_getParticipant.participant = na7.i1(Z1);
                        mu1Var.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new hc((byte) 0), new i8c() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                switch (r5) {
                                    case 0:
                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                        mu1 mu1Var2 = mu1Var;
                                        TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            mu1Var2.getMessagesController().a4(tL_channels_channelParticipant.users, false);
                                            mu1Var2.getMessagesController().U3(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                        }
                                        int i = mu1Var2.g4;
                                        jc jcVar = new jc((byte) 10);
                                        new sd3(mu1Var2, mu1Var2.e, arrayList, arrayList2, channelParticipantArr2, mu1Var2.d7, (int) mu1Var2.d(), i, true, jcVar).show();
                                        return;
                                    default:
                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) obj;
                                        TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                        mu1 mu1Var3 = mu1Var;
                                        TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                        if (tL_channels_channelParticipant2 != null) {
                                            mu1Var3.getMessagesController().a4(tL_channels_channelParticipant2.users, false);
                                            mu1Var3.getMessagesController().U3(tL_channels_channelParticipant2.chats, false);
                                            channelParticipantArr3[0] = tL_channels_channelParticipant2.participant;
                                        } else {
                                            mu1Var3.getClass();
                                        }
                                        int i2 = mu1Var3.g4;
                                        jc jcVar2 = new jc((byte) 10);
                                        new sd3(mu1Var3, mu1Var3.e, arrayList, arrayList2, channelParticipantArr3, mu1Var3.d7, (int) mu1Var3.d(), i2, true, jcVar2).show();
                                        return;
                                }
                            }
                        });
                        mu1Var.F5(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                final mu1 mu1Var2 = this.b;
                mu1Var2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j != mu1Var2.getUserConfig().e() && z) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(k27Var);
                    TLObject Z12 = mu1Var2.getMessagesController().Z1(j);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(Z12);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = na7.g1(mu1Var2.e);
                    tL_channels_getParticipant2.participant = na7.i1(Z12);
                    mu1Var2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new hc((byte) 0), new i8c() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            switch (r5) {
                                case 0:
                                    TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                    mu1 mu1Var22 = mu1Var2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr22 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        mu1Var22.getMessagesController().a4(tL_channels_channelParticipant.users, false);
                                        mu1Var22.getMessagesController().U3(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr22[0] = tL_channels_channelParticipant.participant;
                                    }
                                    int i = mu1Var22.g4;
                                    jc jcVar = new jc((byte) 10);
                                    new sd3(mu1Var22, mu1Var22.e, arrayList3, arrayList4, channelParticipantArr22, mu1Var22.d7, (int) mu1Var22.d(), i, true, jcVar).show();
                                    return;
                                default:
                                    TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) obj;
                                    TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                    mu1 mu1Var3 = mu1Var2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant2 != null) {
                                        mu1Var3.getMessagesController().a4(tL_channels_channelParticipant2.users, false);
                                        mu1Var3.getMessagesController().U3(tL_channels_channelParticipant2.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant2.participant;
                                    } else {
                                        mu1Var3.getClass();
                                    }
                                    int i2 = mu1Var3.g4;
                                    jc jcVar2 = new jc((byte) 10);
                                    new sd3(mu1Var3, mu1Var3.e, arrayList3, arrayList4, channelParticipantArr3, mu1Var3.d7, (int) mu1Var3.d(), i2, true, jcVar2).show();
                                    return;
                            }
                        }
                    });
                    mu1Var2.F5(true);
                    return;
                }
                return;
        }
    }
}
