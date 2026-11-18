package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class kj {
    public final cg.a f25040a;
    public final long f25041b;

    public kj(cg.a aVar, long j3) {
        this.f25040a = aVar;
        this.f25041b = j3;
    }

    public static kj a() {
        return new kj(cg.a.h(0L, cg.b.f5273a), 0L);
    }

    public static kj b(TLRPC.SuggestedPost suggestedPost) {
        if (suggestedPost == null) {
            return a();
        }
        return new kj(cg.a.m(suggestedPost.price), suggestedPost.schedule_date);
    }

    public final TLRPC.SuggestedPost c() {
        TLRPC.SuggestedPost suggestedPost = new TLRPC.SuggestedPost();
        cg.a aVar = this.f25040a;
        if (aVar != null && !aVar.l()) {
            suggestedPost.price = aVar.q();
        }
        long j3 = this.f25041b;
        if (j3 > 0) {
            suggestedPost.schedule_date = (int) j3;
            suggestedPost.flags |= 1;
        }
        return suggestedPost;
    }
}
