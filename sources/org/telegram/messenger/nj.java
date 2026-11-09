package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class nj {
    public final cg.a f24202a;
    public final long f24203b;

    public nj(cg.a aVar, long j3) {
        this.f24202a = aVar;
        this.f24203b = j3;
    }

    public static nj a() {
        return new nj(cg.a.g(0L, cg.b.f6160a), 0L);
    }

    public static nj b(TLRPC.SuggestedPost suggestedPost) {
        if (suggestedPost == null) {
            return a();
        }
        return new nj(cg.a.l(suggestedPost.price), suggestedPost.schedule_date);
    }

    public final TLRPC.SuggestedPost c() {
        TLRPC.SuggestedPost suggestedPost = new TLRPC.SuggestedPost();
        cg.a aVar = this.f24202a;
        if (aVar != null && !aVar.k()) {
            suggestedPost.price = aVar.o();
        }
        long j3 = this.f24203b;
        if (j3 > 0) {
            suggestedPost.schedule_date = (int) j3;
            suggestedPost.flags |= 1;
        }
        return suggestedPost;
    }
}
