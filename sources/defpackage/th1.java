package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class th1 implements RequestDelegate {
    public final byte a;
    public final qac b;

    public th1(qac qacVar, byte b) {
        this.a = b;
        this.b = qacVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.ChannelParticipant channelParticipant;
        byte b = this.a;
        final qac qacVar = this.b;
        switch (b) {
            case 0:
                gm.c3(new uh1(tLObject, qacVar, tL_error));
                return;
            case 1:
                if (tLObject instanceof TLRPC.TL_channels_channelParticipant) {
                    channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                } else {
                    channelParticipant = null;
                }
                qacVar.a(channelParticipant);
                return;
            case 2:
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z;
                        byte b2 = r3;
                        qac qacVar2 = qacVar;
                        TLObject tLObject2 = tLObject;
                        switch (b2) {
                            case 0:
                                if (tLObject2 instanceof TL_account.paidMessagesRevenue) {
                                    qacVar2.a(Long.valueOf(((TL_account.paidMessagesRevenue) tLObject2).stars_amount));
                                    return;
                                } else {
                                    qacVar2.a(0L);
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    z = true;
                                    hs6.d0(z8c.t0).L1(tL_messages_stickerSet, true);
                                    if (!hs6.d0(z8c.t0).D0(tL_messages_stickerSet.set.id, true)) {
                                        hs6.d0(z8c.t0).h2(null, tL_messages_stickerSet, 2, null, false, false);
                                    }
                                } else {
                                    z = false;
                                }
                                qacVar2.a(Boolean.valueOf(z));
                                return;
                        }
                    }
                });
                return;
            default:
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z;
                        byte b2 = r3;
                        qac qacVar2 = qacVar;
                        TLObject tLObject2 = tLObject;
                        switch (b2) {
                            case 0:
                                if (tLObject2 instanceof TL_account.paidMessagesRevenue) {
                                    qacVar2.a(Long.valueOf(((TL_account.paidMessagesRevenue) tLObject2).stars_amount));
                                    return;
                                } else {
                                    qacVar2.a(0L);
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    z = true;
                                    hs6.d0(z8c.t0).L1(tL_messages_stickerSet, true);
                                    if (!hs6.d0(z8c.t0).D0(tL_messages_stickerSet.set.id, true)) {
                                        hs6.d0(z8c.t0).h2(null, tL_messages_stickerSet, 2, null, false, false);
                                    }
                                } else {
                                    z = false;
                                }
                                qacVar2.a(Boolean.valueOf(z));
                                return;
                        }
                    }
                });
                return;
        }
    }
}
