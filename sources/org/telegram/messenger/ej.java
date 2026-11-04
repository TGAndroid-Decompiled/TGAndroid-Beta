package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ej {
    public final dg.a f22361a;
    public final long f22362b;

    public ej(dg.a aVar, long j10) {
        this.f22361a = aVar;
        this.f22362b = j10;
    }

    public static ej a() {
        return new ej(dg.a.g(0L, dg.b.f8925a), 0L);
    }

    public static ej b(TLRPC.SuggestedPost suggestedPost) {
        if (suggestedPost == null) {
            return a();
        }
        return new ej(dg.a.l(suggestedPost.price), suggestedPost.schedule_date);
    }

    public final TLRPC.SuggestedPost c() {
        TLRPC.SuggestedPost suggestedPost = new TLRPC.SuggestedPost();
        dg.a aVar = this.f22361a;
        if (aVar != null && !aVar.k()) {
            suggestedPost.price = aVar.o();
        }
        long j10 = this.f22362b;
        if (j10 > 0) {
            suggestedPost.schedule_date = (int) j10;
            suggestedPost.flags |= 1;
        }
        return suggestedPost;
    }
}
