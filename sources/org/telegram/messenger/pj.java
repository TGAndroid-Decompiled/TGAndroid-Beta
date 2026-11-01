package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class pj {
    public final sf.a f17608a;
    public final long f17609b;

    public pj(sf.a aVar, long j10) {
        this.f17608a = aVar;
        this.f17609b = j10;
    }

    public static pj a() {
        return new pj(sf.a.g(0L, sf.b.f48267a), 0L);
    }

    public static pj b(TLRPC.SuggestedPost suggestedPost) {
        if (suggestedPost == null) {
            return a();
        }
        return new pj(sf.a.l(suggestedPost.price), suggestedPost.schedule_date);
    }

    public final TLRPC.SuggestedPost c() {
        TLRPC.SuggestedPost suggestedPost = new TLRPC.SuggestedPost();
        sf.a aVar = this.f17608a;
        if (aVar != null && !aVar.k()) {
            suggestedPost.price = aVar.o();
        }
        long j10 = this.f17609b;
        if (j10 > 0) {
            suggestedPost.schedule_date = (int) j10;
            suggestedPost.flags |= 1;
        }
        return suggestedPost;
    }
}
