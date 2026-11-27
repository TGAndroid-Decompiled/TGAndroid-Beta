package defpackage;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class yl1 implements Predicate {
    public final byte a;
    public final Object b;

    public yl1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Predicate and(Predicate predicate) {
        byte b = this.a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public final Predicate negate() {
        byte b = this.a;
        return Predicate$CC.$default$negate(this);
    }

    public final Predicate or(Predicate predicate) {
        byte b = this.a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        boolean z;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return ((zu1) obj2).o8((TLRPC.MessageEntity) obj);
            case 1:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                TLRPC.Peer peer = ((r47) obj).k.from_id;
                if (inputPeer == null) {
                    if (peer != null) {
                        return false;
                    }
                } else if (peer == null) {
                    return false;
                } else {
                    if ((inputPeer instanceof TLRPC.TL_inputPeerChat) && (peer instanceof TLRPC.TL_peerChat)) {
                        if (inputPeer.chat_id != peer.chat_id) {
                            return false;
                        }
                    } else if ((inputPeer instanceof TLRPC.TL_inputPeerChannel) && (peer instanceof TLRPC.TL_peerChannel)) {
                        if (inputPeer.channel_id != peer.channel_id) {
                            return false;
                        }
                    } else if (!(inputPeer instanceof TLRPC.TL_inputPeerUser) || !(peer instanceof TLRPC.TL_peerUser) || inputPeer.user_id != peer.user_id) {
                        return false;
                    }
                }
                return true;
            case 2:
                TLObject tLObject = (TLObject) obj2;
                r47 r47Var = (r47) obj;
                if (tLObject instanceof TLRPC.User) {
                    if (r47Var.k.from_id.user_id != ((TLRPC.User) tLObject).id) {
                        return false;
                    }
                } else if (!(tLObject instanceof TLRPC.Chat) || r47Var.k.from_id.user_id != ((TLRPC.Chat) tLObject).id) {
                    return false;
                }
                return true;
            default:
                yx4 yx4Var = (yx4) obj2;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    z = yx4Var.V1.disallow_unique_stargifts;
                } else {
                    boolean z2 = starGift.limited;
                    TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = yx4Var.V1;
                    if (z2) {
                        if (disallowedGiftsSettings.disallow_limited_stargifts && (!starGift.can_upgrade || disallowedGiftsSettings.disallow_unique_stargifts)) {
                            return false;
                        }
                        return true;
                    }
                    z = disallowedGiftsSettings.disallow_unlimited_stargifts;
                }
                return !z;
        }
    }
}
