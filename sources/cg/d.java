package cg;

import java.util.Map;
import java.util.function.ToIntFunction;
import k2.p1;
import org.telegram.messenger.m9;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.v5;
public final class d implements ToIntFunction {
    public final int f4636a;

    public d(int i3) {
        this.f4636a = i3;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f4636a) {
            case 0:
                return ((g) obj).f4652a;
            case 1:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 2:
                if (((TL_stars.StarGift) obj).birthday) {
                    return -1;
                }
                return 0;
            case 3:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 4:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 5:
                if (((TL_stars.StarGift) obj).birthday) {
                    return -1;
                }
                return 0;
            case 6:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 7:
                return -((TL_stories.StoryView) obj).date;
            case 8:
                return ((TL_stories.StoryItem) obj).date;
            case 9:
                return -((TL_stories.StoryItem) p1.h(1, ((TL_stories.PeerStories) obj).stories)).date;
            case 10:
                return ((Integer) ((Object[]) obj)[1]).intValue();
            case 11:
                return ((m9) obj).f24179e.bid_date;
            case 12:
                return Integer.parseInt((String) obj);
            case 13:
                return ((zi) obj).f1();
            case 14:
                return -((TLRPC.TL_forumTopic) obj).top_message;
            case 15:
                return ((TLRPC.Message) obj).f27022id;
            case 16:
                return ((TLRPC.Message) obj).f27022id;
            case 17:
                return ((v5) obj).d;
            case 18:
                return ((v5) obj).f39011e;
            case 19:
                xc.c cVar = (xc.c) obj;
                return cVar.d - cVar.f58609b;
            case 20:
                TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) obj;
                int i3 = messagePeerReaction.date;
                if (i3 > 0 && messagePeerReaction.reaction == null) {
                    return -i3;
                }
                return Integer.MIN_VALUE;
            case 21:
                TLRPC.MessagePeerReaction messagePeerReaction2 = (TLRPC.MessagePeerReaction) obj;
                int i10 = messagePeerReaction2.date;
                if (i10 > 0 && messagePeerReaction2.reaction == null) {
                    return -i10;
                }
                return Integer.MIN_VALUE;
            default:
                return ((String) ((Map.Entry) obj).getKey()).hashCode();
        }
    }
}
