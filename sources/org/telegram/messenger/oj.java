package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class oj {
    public final sf.a f17275a;
    public final long f17276b;

    public oj(sf.a aVar, long j10) {
        this.f17275a = aVar;
        this.f17276b = j10;
    }

    public static oj a() {
        return new oj(sf.a.g(0L, sf.b.f48256a), 0L);
    }

    public static oj b(TLRPC.SuggestedPost suggestedPost) {
        if (suggestedPost == null) {
            return a();
        }
        return new oj(sf.a.l(suggestedPost.price), suggestedPost.schedule_date);
    }

    public final TLRPC.SuggestedPost c() {
        TLRPC.SuggestedPost suggestedPost = new TLRPC.SuggestedPost();
        sf.a aVar = this.f17275a;
        if (aVar != null && !aVar.k()) {
            suggestedPost.price = aVar.o();
        }
        long j10 = this.f17276b;
        if (j10 > 0) {
            suggestedPost.schedule_date = (int) j10;
            suggestedPost.flags |= 1;
        }
        return suggestedPost;
    }
}
