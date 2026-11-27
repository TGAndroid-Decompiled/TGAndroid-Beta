package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ug1 implements RequestDelegate {
    public final byte a;
    public final pcc b;

    public ug1(pcc pccVar, byte b) {
        this.a = b;
        this.b = pccVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.ChannelParticipant channelParticipant;
        byte b = this.a;
        final pcc pccVar = this.b;
        switch (b) {
            case 0:
                hl.c3(new vg1(tLObject, pccVar, tL_error));
                return;
            case 1:
                if (tLObject instanceof TLRPC.TL_channels_channelParticipant) {
                    channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                } else {
                    channelParticipant = null;
                }
                pccVar.a(channelParticipant);
                return;
            case 2:
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z;
                        byte b2 = r3;
                        pcc pccVar2 = pccVar;
                        TLObject tLObject2 = tLObject;
                        switch (b2) {
                            case 0:
                                if (tLObject2 instanceof TL_account.paidMessagesRevenue) {
                                    pccVar2.a(Long.valueOf(((TL_account.paidMessagesRevenue) tLObject2).stars_amount));
                                    return;
                                } else {
                                    pccVar2.a(0L);
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    z = true;
                                    ls6.d0(yac.t0).L1(tL_messages_stickerSet, true);
                                    if (!ls6.d0(yac.t0).D0(tL_messages_stickerSet.set.id, true)) {
                                        ls6.d0(yac.t0).h2(null, tL_messages_stickerSet, 2, null, false, false);
                                    }
                                } else {
                                    z = false;
                                }
                                pccVar2.a(Boolean.valueOf(z));
                                return;
                        }
                    }
                });
                return;
            default:
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z;
                        byte b2 = r3;
                        pcc pccVar2 = pccVar;
                        TLObject tLObject2 = tLObject;
                        switch (b2) {
                            case 0:
                                if (tLObject2 instanceof TL_account.paidMessagesRevenue) {
                                    pccVar2.a(Long.valueOf(((TL_account.paidMessagesRevenue) tLObject2).stars_amount));
                                    return;
                                } else {
                                    pccVar2.a(0L);
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    z = true;
                                    ls6.d0(yac.t0).L1(tL_messages_stickerSet, true);
                                    if (!ls6.d0(yac.t0).D0(tL_messages_stickerSet.set.id, true)) {
                                        ls6.d0(yac.t0).h2(null, tL_messages_stickerSet, 2, null, false, false);
                                    }
                                } else {
                                    z = false;
                                }
                                pccVar2.a(Boolean.valueOf(z));
                                return;
                        }
                    }
                });
                return;
        }
    }
}
