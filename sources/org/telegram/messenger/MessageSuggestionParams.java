package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public class MessageSuggestionParams {
    public final yf.a amount;
    public final long time;

    private MessageSuggestionParams(yf.a aVar, long j3) {
        this.amount = aVar;
        this.time = j3;
    }

    public static MessageSuggestionParams empty() {
        return new MessageSuggestionParams(yf.a.g(0L, yf.b.f46928a), 0L);
    }

    public static MessageSuggestionParams of(TLRPC.SuggestedPost suggestedPost) {
        if (suggestedPost == null) {
            return empty();
        }
        return new MessageSuggestionParams(yf.a.l(suggestedPost.price), suggestedPost.schedule_date);
    }

    public boolean isEmpty() {
        yf.a aVar = this.amount;
        if ((aVar == null || aVar.k()) && this.time <= 0) {
            return true;
        }
        return false;
    }

    public TLRPC.SuggestedPost toTl() {
        TLRPC.SuggestedPost suggestedPost = new TLRPC.SuggestedPost();
        yf.a aVar = this.amount;
        if (aVar != null && !aVar.k()) {
            suggestedPost.price = this.amount.o();
        }
        long j3 = this.time;
        if (j3 > 0) {
            suggestedPost.schedule_date = (int) j3;
            suggestedPost.flags |= 1;
        }
        return suggestedPost;
    }

    public static MessageSuggestionParams of(TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval) {
        return of(yf.a.l(tL_messageActionSuggestedPostApproval.price), tL_messageActionSuggestedPostApproval.schedule_date);
    }

    public static MessageSuggestionParams of(yf.a aVar, long j3) {
        return new MessageSuggestionParams(aVar, j3);
    }
}
