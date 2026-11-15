package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class lj {
    public final cg.a f24844a;
    public final long f24845b;

    public lj(cg.a aVar, long j3) {
        this.f24844a = aVar;
        this.f24845b = j3;
    }

    public static lj a() {
        return new lj(cg.a.g(0L, cg.b.f4990a), 0L);
    }

    public static lj b(TLRPC.SuggestedPost suggestedPost) {
        if (suggestedPost == null) {
            return a();
        }
        return new lj(cg.a.l(suggestedPost.price), suggestedPost.schedule_date);
    }

    public final TLRPC.SuggestedPost c() {
        TLRPC.SuggestedPost suggestedPost = new TLRPC.SuggestedPost();
        cg.a aVar = this.f24844a;
        if (aVar != null && !aVar.k()) {
            suggestedPost.price = aVar.o();
        }
        long j3 = this.f24845b;
        if (j3 > 0) {
            suggestedPost.schedule_date = (int) j3;
            suggestedPost.flags |= 1;
        }
        return suggestedPost;
    }
}
