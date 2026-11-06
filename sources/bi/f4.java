package bi;

import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xs0;
public final class f4 implements c20 {
    public final int f3862a = 0;
    public final int f3863b;
    public final long f3864c;
    public final Object d;

    public f4(int i7, long j3, TLRPC.Document document) {
        this.f3863b = i7;
        this.f3864c = j3;
        this.d = document;
    }

    @Override
    public final void a(Object obj) {
        Object M0;
        TLRPC.StickerSet stickerSet;
        int i7 = this.f3862a;
        int i10 = this.f3863b;
        long j3 = this.f3864c;
        Object obj2 = this.d;
        switch (i7) {
            case 0:
                TLRPC.Document document = (TLRPC.Document) obj2;
                if (((Boolean) obj).booleanValue()) {
                    ea.y(i10, false).P(j3);
                    org.telegram.messenger.g0.h3(new aa.s((Object) new k4(j3, 0), (Object) document, (Object) org.telegram.messenger.hd.M0(2131750101, null), 13));
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.cc ccVar = (org.telegram.ui.Components.cc) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
                    if (i10 == 1) {
                        M0 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("TopicContainsEmojiPackSingle", null, 2131744023, stickerSet.title));
                    } else if (i10 == 2) {
                        M0 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("StoryContainsEmojiPackSingle", null, 2131744700, stickerSet.title));
                    } else {
                        M0 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("MessageContainsEmojiPackSingle", null, 2131748595, stickerSet.title));
                    }
                } else {
                    M0 = org.telegram.messenger.hd.M0(2131754435, null);
                }
                org.telegram.messenger.g0.i3(new org.telegram.ui.Components.f(3, ccVar, M0), Math.max(1L, 750 - (System.currentTimeMillis() - j3)));
                return;
            default:
                ((xs0) obj2).getStoriesController().b(i10, j3, (ArrayList) obj);
                return;
        }
    }

    public f4(int i7, org.telegram.ui.Components.cc ccVar, long j3) {
        this.f3863b = i7;
        this.d = ccVar;
        this.f3864c = j3;
    }

    public f4(xs0 xs0Var, long j3, int i7) {
        this.d = xs0Var;
        this.f3864c = j3;
        this.f3863b = i7;
    }
}
