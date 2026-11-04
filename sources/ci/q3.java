package ci;

import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.lo;
public final class q3 implements u10 {
    public final int f5807a = 0;
    public final int f5808b;
    public final long f5809c;
    public final Object d;

    public q3(int i3, long j10, TLRPC.Document document) {
        this.f5808b = i3;
        this.f5809c = j10;
        this.d = document;
    }

    @Override
    public final void a(Object obj) {
        Object M0;
        TLRPC.StickerSet stickerSet;
        int i3 = this.f5807a;
        int i10 = this.f5808b;
        long j10 = this.f5809c;
        Object obj2 = this.d;
        switch (i3) {
            case 0:
                TLRPC.Document document = (TLRPC.Document) obj2;
                if (((Boolean) obj).booleanValue()) {
                    e9.y(i10, false).P(j10);
                    org.telegram.messenger.g0.h3(new ai.k3(new u3(j10, 0), document, bd.M0(2131750110, null), 16));
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.ac acVar = (org.telegram.ui.Components.ac) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
                    if (i10 == 1) {
                        M0 = org.telegram.messenger.g0.X2(bd.a0("TopicContainsEmojiPackSingle", null, 2131744032, stickerSet.title));
                    } else if (i10 == 2) {
                        M0 = org.telegram.messenger.g0.X2(bd.a0("StoryContainsEmojiPackSingle", null, 2131744709, stickerSet.title));
                    } else {
                        M0 = org.telegram.messenger.g0.X2(bd.a0("MessageContainsEmojiPackSingle", null, 2131748604, stickerSet.title));
                    }
                } else {
                    M0 = bd.M0(2131754435, null);
                }
                org.telegram.messenger.g0.i3(new lo(8, acVar, M0), Math.max(1L, 750 - (System.currentTimeMillis() - j10)));
                return;
            default:
                ((ws0) obj2).getStoriesController().b(i10, j10, (ArrayList) obj);
                return;
        }
    }

    public q3(int i3, org.telegram.ui.Components.ac acVar, long j10) {
        this.f5808b = i3;
        this.d = acVar;
        this.f5809c = j10;
    }

    public q3(ws0 ws0Var, long j10, int i3) {
        this.d = ws0Var;
        this.f5809c = j10;
        this.f5808b = i3;
    }
}
