package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class lj {
    public final cg.a f25234a;
    public final long f25235b;

    public lj(cg.a aVar, long j3) {
        this.f25234a = aVar;
        this.f25235b = j3;
    }

    public static lj a() {
        return new lj(cg.a.h(0L, cg.b.f5305a), 0L);
    }

    public static lj b(TLRPC.SuggestedPost suggestedPost) {
        if (suggestedPost == null) {
            return a();
        }
        return new lj(cg.a.m(suggestedPost.price), suggestedPost.schedule_date);
    }

    public final TLRPC.SuggestedPost c() {
        TLRPC.SuggestedPost suggestedPost = new TLRPC.SuggestedPost();
        cg.a aVar = this.f25234a;
        if (aVar != null && !aVar.l()) {
            suggestedPost.price = aVar.q();
        }
        long j3 = this.f25235b;
        if (j3 > 0) {
            suggestedPost.schedule_date = (int) j3;
            suggestedPost.flags |= 1;
        }
        return suggestedPost;
    }
}
