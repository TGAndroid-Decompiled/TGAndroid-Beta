package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class km1 implements n39 {
    public final byte a;
    public final zu1 b;
    public final boolean c;
    public final r47 d;

    public km1(zu1 zu1Var, boolean z, r47 r47Var, byte b) {
        this.a = b;
        this.b = zu1Var;
        this.c = z;
        this.d = r47Var;
    }

    @Override
    public final void g(long j, TLRPC.MessagePeerReaction messagePeerReaction) {
        byte b = this.a;
        r47 r47Var = this.d;
        boolean z = this.c;
        switch (b) {
            case 0:
                final zu1 zu1Var = this.b;
                zu1Var.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j != zu1Var.getUserConfig().e() && z) {
                    final ArrayList arrayList = new ArrayList(1);
                    arrayList.add(r47Var);
                    TLObject b2 = zu1Var.getMessagesController().b2(j);
                    final ArrayList arrayList2 = new ArrayList(1);
                    arrayList2.add(b2);
                    final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant.channel = uc7.i1(zu1Var.e);
                    tL_channels_getParticipant.participant = uc7.k1(b2);
                    zu1Var.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new ic((byte) 0), new icc() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            switch (r5) {
                                case 0:
                                    TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                    zu1 zu1Var2 = zu1Var;
                                    TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                    if (tL_channels_channelParticipant != null) {
                                        zu1Var2.getMessagesController().j4(tL_channels_channelParticipant.users, false);
                                        zu1Var2.getMessagesController().c4(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        zu1Var2.getClass();
                                    }
                                    int i = zu1Var2.g4;
                                    kc kcVar = new kc((byte) 10);
                                    new me3(zu1Var2, zu1Var2.e, arrayList, arrayList2, channelParticipantArr2, zu1Var2.d7, (int) zu1Var2.c(), i, true, kcVar).show();
                                    return;
                                default:
                                    TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) obj;
                                    TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                    zu1 zu1Var3 = zu1Var;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                    if (tL_channels_channelParticipant2 != null) {
                                        zu1Var3.getMessagesController().j4(tL_channels_channelParticipant2.users, false);
                                        zu1Var3.getMessagesController().c4(tL_channels_channelParticipant2.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant2.participant;
                                    }
                                    int i2 = zu1Var3.g4;
                                    kc kcVar2 = new kc((byte) 10);
                                    new me3(zu1Var3, zu1Var3.e, arrayList, arrayList2, channelParticipantArr3, zu1Var3.d7, (int) zu1Var3.c(), i2, true, kcVar2).show();
                                    return;
                            }
                        }
                    });
                    zu1Var.M5(true);
                    return;
                }
                return;
            default:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final zu1 zu1Var2 = this.b;
                    if (j != zu1Var2.getUserConfig().e() && z) {
                        final ArrayList arrayList3 = new ArrayList(1);
                        arrayList3.add(r47Var);
                        TLObject b22 = zu1Var2.getMessagesController().b2(j);
                        final ArrayList arrayList4 = new ArrayList(1);
                        arrayList4.add(b22);
                        final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant2.channel = uc7.i1(zu1Var2.e);
                        tL_channels_getParticipant2.participant = uc7.k1(b22);
                        zu1Var2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new ic((byte) 0), new icc() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                switch (r5) {
                                    case 0:
                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                        zu1 zu1Var22 = zu1Var2;
                                        TLRPC.ChannelParticipant[] channelParticipantArr22 = channelParticipantArr2;
                                        if (tL_channels_channelParticipant != null) {
                                            zu1Var22.getMessagesController().j4(tL_channels_channelParticipant.users, false);
                                            zu1Var22.getMessagesController().c4(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr22[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            zu1Var22.getClass();
                                        }
                                        int i = zu1Var22.g4;
                                        kc kcVar = new kc((byte) 10);
                                        new me3(zu1Var22, zu1Var22.e, arrayList3, arrayList4, channelParticipantArr22, zu1Var22.d7, (int) zu1Var22.c(), i, true, kcVar).show();
                                        return;
                                    default:
                                        TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) obj;
                                        TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                                        zu1 zu1Var3 = zu1Var2;
                                        TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                        if (tL_channels_channelParticipant2 != null) {
                                            zu1Var3.getMessagesController().j4(tL_channels_channelParticipant2.users, false);
                                            zu1Var3.getMessagesController().c4(tL_channels_channelParticipant2.chats, false);
                                            channelParticipantArr3[0] = tL_channels_channelParticipant2.participant;
                                        }
                                        int i2 = zu1Var3.g4;
                                        kc kcVar2 = new kc((byte) 10);
                                        new me3(zu1Var3, zu1Var3.e, arrayList3, arrayList4, channelParticipantArr3, zu1Var3.d7, (int) zu1Var3.c(), i2, true, kcVar2).show();
                                        return;
                                }
                            }
                        });
                        zu1Var2.M5(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
