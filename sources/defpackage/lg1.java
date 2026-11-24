package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class lg1 implements RequestDelegate {
    public final byte a;
    public final p8c b;

    public lg1(p8c p8cVar, byte b) {
        this.a = b;
        this.b = p8cVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.ChannelParticipant channelParticipant;
        byte b = this.a;
        final p8c p8cVar = this.b;
        switch (b) {
            case 0:
                gl.c3(new mg1(tLObject, p8cVar, tL_error));
                return;
            case 1:
                if (tLObject instanceof TLRPC.TL_channels_channelParticipant) {
                    channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                } else {
                    channelParticipant = null;
                }
                p8cVar.a(channelParticipant);
                return;
            case 2:
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z;
                        byte b2 = r3;
                        p8c p8cVar2 = p8cVar;
                        TLObject tLObject2 = tLObject;
                        switch (b2) {
                            case 0:
                                if (tLObject2 instanceof TL_account.paidMessagesRevenue) {
                                    p8cVar2.a(Long.valueOf(((TL_account.paidMessagesRevenue) tLObject2).stars_amount));
                                    return;
                                } else {
                                    p8cVar2.a(0L);
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    z = true;
                                    hq6.d0(y6c.t0).L1(tL_messages_stickerSet, true);
                                    if (!hq6.d0(y6c.t0).D0(tL_messages_stickerSet.set.id, true)) {
                                        hq6.d0(y6c.t0).h2(null, tL_messages_stickerSet, 2, null, false, false);
                                    }
                                } else {
                                    z = false;
                                }
                                p8cVar2.a(Boolean.valueOf(z));
                                return;
                        }
                    }
                });
                return;
            default:
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z;
                        byte b2 = r3;
                        p8c p8cVar2 = p8cVar;
                        TLObject tLObject2 = tLObject;
                        switch (b2) {
                            case 0:
                                if (tLObject2 instanceof TL_account.paidMessagesRevenue) {
                                    p8cVar2.a(Long.valueOf(((TL_account.paidMessagesRevenue) tLObject2).stars_amount));
                                    return;
                                } else {
                                    p8cVar2.a(0L);
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    z = true;
                                    hq6.d0(y6c.t0).L1(tL_messages_stickerSet, true);
                                    if (!hq6.d0(y6c.t0).D0(tL_messages_stickerSet.set.id, true)) {
                                        hq6.d0(y6c.t0).h2(null, tL_messages_stickerSet, 2, null, false, false);
                                    }
                                } else {
                                    z = false;
                                }
                                p8cVar2.a(Boolean.valueOf(z));
                                return;
                        }
                    }
                });
                return;
        }
    }
}
