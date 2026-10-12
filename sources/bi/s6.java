package bi;

import java.util.Map;
import java.util.function.ToIntFunction;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class s6 implements ToIntFunction {
    public final int f3634a;

    public s6(int i10) {
        this.f3634a = i10;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f3634a) {
            case 0:
                return -((TL_stories.StoryView) obj).date;
            case 1:
                return ((TL_stories.StoryItem) obj).date;
            case 2:
                return -((TL_stories.StoryItem) i2.d.g(1, ((TL_stories.PeerStories) obj).stories)).date;
            case 3:
                return ((Integer) ((Object[]) obj)[1]).intValue();
            case 4:
                return ((MessageObject) obj).getId();
            case 5:
                return -((TLRPC.TL_forumTopic) obj).top_message;
            case 6:
                return ((TLRPC.Message) obj).f19237id;
            case 7:
                return ((TLRPC.Message) obj).f19237id;
            case 8:
                return ((org.telegram.ui.Components.h6) obj).d;
            case 9:
                return ((org.telegram.ui.Components.h6) obj).e;
            case 10:
                cd.c cVar = (cd.c) obj;
                return cVar.d - cVar.f4731b;
            case 11:
                TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) obj;
                int i10 = messagePeerReaction.date;
                if (i10 > 0 && messagePeerReaction.reaction == null) {
                    return -i10;
                }
                return Integer.MIN_VALUE;
            case 12:
                TLRPC.MessagePeerReaction messagePeerReaction2 = (TLRPC.MessagePeerReaction) obj;
                int i11 = messagePeerReaction2.date;
                if (i11 > 0 && messagePeerReaction2.reaction == null) {
                    return -i11;
                }
                return Integer.MIN_VALUE;
            case 13:
                return ((String) ((Map.Entry) obj).getKey()).hashCode();
            case 14:
                return ((zf.e) obj).f50149a;
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
