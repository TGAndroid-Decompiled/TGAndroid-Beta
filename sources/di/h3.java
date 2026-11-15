package di;

import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ys0;
import org.telegram.ui.zg;
public final class h3 implements z10 {
    public final int f8664a = 0;
    public final int f8665b;
    public final long f8666c;
    public final Object d;

    public h3(int i7, long j3, TLRPC.Document document) {
        this.f8665b = i7;
        this.f8666c = j3;
        this.d = document;
    }

    @Override
    public final void a(Object obj) {
        Object M0;
        TLRPC.StickerSet stickerSet;
        int i7 = this.f8664a;
        int i10 = this.f8665b;
        long j3 = this.f8666c;
        Object obj2 = this.d;
        switch (i7) {
            case 0:
                TLRPC.Document document = (TLRPC.Document) obj2;
                if (((Boolean) obj).booleanValue()) {
                    v8.y(i10, false).P(j3);
                    org.telegram.messenger.g0.h3(new aa.r((Object) new l3(j3, 0), (Object) document, (Object) hd.M0(2131750102, null), 19));
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.xb xbVar = (org.telegram.ui.Components.xb) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
                    if (i10 == 1) {
                        M0 = org.telegram.messenger.g0.X2(hd.a0("TopicContainsEmojiPackSingle", null, 2131744022, stickerSet.title));
                    } else if (i10 == 2) {
                        M0 = org.telegram.messenger.g0.X2(hd.a0("StoryContainsEmojiPackSingle", null, 2131744699, stickerSet.title));
                    } else {
                        M0 = org.telegram.messenger.g0.X2(hd.a0("MessageContainsEmojiPackSingle", null, 2131748596, stickerSet.title));
                    }
                } else {
                    M0 = hd.M0(2131754435, null);
                }
                org.telegram.messenger.g0.i3(new zg(22, xbVar, M0), Math.max(1L, 750 - (System.currentTimeMillis() - j3)));
                return;
            default:
                ((ys0) obj2).getStoriesController().b(i10, j3, (ArrayList) obj);
                return;
        }
    }

    public h3(int i7, org.telegram.ui.Components.xb xbVar, long j3) {
        this.f8665b = i7;
        this.d = xbVar;
        this.f8666c = j3;
    }

    public h3(ys0 ys0Var, long j3, int i7) {
        this.d = ys0Var;
        this.f8666c = j3;
        this.f8665b = i7;
    }
}
