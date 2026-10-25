package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public class MessageSuggestionParams {
    public final bg.a amount;
    public final long time;

    private MessageSuggestionParams(bg.a aVar, long j10) {
        this.amount = aVar;
        this.time = j10;
    }

    public static MessageSuggestionParams empty() {
        return new MessageSuggestionParams(bg.a.g(0L, bg.b.f3980a), 0L);
    }

    public static MessageSuggestionParams of(TLRPC.SuggestedPost suggestedPost) {
        if (suggestedPost == null) {
            return empty();
        }
        return new MessageSuggestionParams(bg.a.l(suggestedPost.price), suggestedPost.schedule_date);
    }

    public boolean isEmpty() {
        bg.a aVar = this.amount;
        if ((aVar == null || aVar.k()) && this.time <= 0) {
            return true;
        }
        return false;
    }

    public TLRPC.SuggestedPost toTl() {
        TLRPC.SuggestedPost suggestedPost = new TLRPC.SuggestedPost();
        bg.a aVar = this.amount;
        if (aVar != null && !aVar.k()) {
            suggestedPost.price = this.amount.o();
        }
        long j10 = this.time;
        if (j10 > 0) {
            suggestedPost.schedule_date = (int) j10;
            suggestedPost.flags |= 1;
        }
        return suggestedPost;
    }

    public static MessageSuggestionParams of(TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval) {
        return of(bg.a.l(tL_messageActionSuggestedPostApproval.price), tL_messageActionSuggestedPostApproval.schedule_date);
    }

    public static MessageSuggestionParams of(bg.a aVar, long j10) {
        return new MessageSuggestionParams(aVar, j10);
    }
}
