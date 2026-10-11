package ai;

import java.util.Map;
import java.util.function.ToIntFunction;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class h7 implements ToIntFunction {
    public final int f1091a;

    public h7(int i10) {
        this.f1091a = i10;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f1091a) {
            case 0:
                return -((TL_stories.StoryView) obj).date;
            case 1:
                return ((TL_stories.StoryItem) obj).date;
            case 2:
                return -((TL_stories.StoryItem) hg.c.g(1, ((TL_stories.PeerStories) obj).stories)).date;
            case 3:
                return ((Integer) ((Object[]) obj)[1]).intValue();
            case 4:
                return ((String) ((Map.Entry) obj).getKey()).hashCode();
            case 5:
                return ((MessageObject) obj).getId();
            case 6:
                return -((TLRPC.TL_forumTopic) obj).top_message;
            case 7:
                return ((TLRPC.Message) obj).f20089id;
            case 8:
                return ((TLRPC.Message) obj).f20089id;
            case 9:
                return ((org.telegram.ui.Components.h6) obj).d;
            case 10:
                return ((org.telegram.ui.Components.h6) obj).f26981e;
            case 11:
                bd.c cVar = (bd.c) obj;
                return cVar.d - cVar.f3867b;
            case 12:
                TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) obj;
                int i10 = messagePeerReaction.date;
                if (i10 > 0 && messagePeerReaction.reaction == null) {
                    return -i10;
                }
                return Integer.MIN_VALUE;
            case 13:
                TLRPC.MessagePeerReaction messagePeerReaction2 = (TLRPC.MessagePeerReaction) obj;
                int i11 = messagePeerReaction2.date;
                if (i11 > 0 && messagePeerReaction2.reaction == null) {
                    return -i11;
                }
                return Integer.MIN_VALUE;
            case 14:
                return ((yf.d) obj).f52247a;
            case 15:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 16:
                if (((TL_stars.StarGift) obj).birthday) {
                    return -1;
                }
                return 0;
            case 17:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 18:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 19:
                if (((TL_stars.StarGift) obj).birthday) {
                    return -1;
                }
                return 0;
            default:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
        }
    }
}
